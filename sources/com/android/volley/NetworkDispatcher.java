package com.android.volley;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.BlockingQueue;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class NetworkDispatcher extends Thread {
    private final Cache mCache;
    private final ResponseDelivery mDelivery;
    private final Network mNetwork;
    private final BlockingQueue<Request<?>> mQueue;
    private volatile boolean mQuit = false;

    public NetworkDispatcher(BlockingQueue<Request<?>> blockingQueue, Network network, Cache cache, ResponseDelivery responseDelivery) {
        this.mQueue = blockingQueue;
        this.mNetwork = network;
        this.mCache = cache;
        this.mDelivery = responseDelivery;
    }

    @TargetApi(14)
    private void addTrafficStatsTag(Request<?> request) {
        TrafficStats.setThreadStatsTag(request.getTrafficStatsTag());
    }

    private void parseAndDeliverNetworkError(Request<?> request, VolleyError volleyError) {
        this.mDelivery.postError(request, request.parseNetworkError(volleyError));
    }

    private void processRequest() throws InterruptedException {
        processRequest(this.mQueue.take());
    }

    public void quit() {
        this.mQuit = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                processRequest();
            } catch (InterruptedException unused) {
                if (this.mQuit) {
                    Thread.currentThread().interrupt();
                    return;
                }
                VolleyLog.e("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    @VisibleForTesting
    public void processRequest(Request<?> request) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        request.sendEvent(3);
        try {
            try {
                try {
                    request.addMarker("network-queue-take");
                    if (request.isCanceled()) {
                        request.finish("network-discard-cancelled");
                        request.notifyListenerResponseNotUsable();
                        return;
                    }
                    addTrafficStatsTag(request);
                    NetworkResponse performRequest = this.mNetwork.performRequest(request);
                    request.addMarker("network-http-complete");
                    if (performRequest.notModified && request.hasHadResponseDelivered()) {
                        request.finish("not-modified");
                        request.notifyListenerResponseNotUsable();
                        return;
                    }
                    Response<?> parseNetworkResponse = request.parseNetworkResponse(performRequest);
                    request.addMarker("network-parse-complete");
                    if (request.shouldCache() && parseNetworkResponse.cacheEntry != null) {
                        this.mCache.put(request.getCacheKey(), parseNetworkResponse.cacheEntry);
                        request.addMarker("network-cache-written");
                    }
                    request.markDelivered();
                    this.mDelivery.postResponse(request, parseNetworkResponse);
                    request.notifyListenerResponseReceived(parseNetworkResponse);
                } catch (VolleyError e11) {
                    e11.setNetworkTimeMs(SystemClock.elapsedRealtime() - elapsedRealtime);
                    parseAndDeliverNetworkError(request, e11);
                    request.notifyListenerResponseNotUsable();
                }
            } catch (Exception e12) {
                VolleyLog.e(e12, "Unhandled exception %s", e12.toString());
                VolleyError volleyError = new VolleyError(e12);
                volleyError.setNetworkTimeMs(SystemClock.elapsedRealtime() - elapsedRealtime);
                this.mDelivery.postError(request, volleyError);
                request.notifyListenerResponseNotUsable();
            }
        } finally {
            request.sendEvent(4);
        }
    }
}
