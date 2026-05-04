package com.getui.gtc.base.http;

import com.getui.gtc.base.http.RealCall;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public final class Dispatcher {
    private ExecutorService executorService;
    private int maxRequests = 64;
    private int maxRequestsPerHost = 5;
    private final Deque<RealCall.AsyncCall> readyAsyncCalls = new ArrayDeque();
    private final Deque<RealCall.AsyncCall> runningAsyncCalls = new ArrayDeque();
    private final Deque<RealCall> runningSyncCalls = new ArrayDeque();

    private void promoteCalls() {
        if (this.runningAsyncCalls.size() < this.maxRequests && !this.readyAsyncCalls.isEmpty()) {
            Iterator<RealCall.AsyncCall> it = this.readyAsyncCalls.iterator();
            while (it.hasNext()) {
                RealCall.AsyncCall next = it.next();
                if (runningCallsForHost(next) < this.maxRequestsPerHost) {
                    it.remove();
                    this.runningAsyncCalls.add(next);
                    executorService().execute(next);
                }
                if (this.runningAsyncCalls.size() >= this.maxRequests) {
                    return;
                }
            }
        }
    }

    private int runningCallsForHost(RealCall.AsyncCall asyncCall) {
        Iterator<RealCall.AsyncCall> it = this.runningAsyncCalls.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (it.next().get().request().url().getHost().equals(asyncCall.get().request().url().getHost())) {
                i11++;
            }
        }
        return i11;
    }

    public final synchronized void cancelAll() {
        try {
            Iterator<RealCall.AsyncCall> it = this.readyAsyncCalls.iterator();
            while (it.hasNext()) {
                it.next().get().cancel();
            }
            Iterator<RealCall.AsyncCall> it2 = this.runningAsyncCalls.iterator();
            while (it2.hasNext()) {
                it2.next().get().cancel();
            }
            Iterator<RealCall> it3 = this.runningSyncCalls.iterator();
            while (it3.hasNext()) {
                it3.next().cancel();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void enqueue(RealCall.AsyncCall asyncCall) {
        if (this.runningAsyncCalls.size() >= this.maxRequests || runningCallsForHost(asyncCall) >= this.maxRequestsPerHost) {
            this.readyAsyncCalls.add(asyncCall);
        } else {
            this.runningAsyncCalls.add(asyncCall);
            executorService().execute(asyncCall);
        }
    }

    public final synchronized void executed(RealCall realCall) {
        this.runningSyncCalls.add(realCall);
    }

    public final synchronized ExecutorService executorService() {
        try {
            if (this.executorService == null) {
                this.executorService = new ThreadPoolExecutor(1, Integer.MAX_VALUE, 1L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: com.getui.gtc.base.http.Dispatcher.1
                    AtomicInteger index = new AtomicInteger(0);

                    @Override // java.util.concurrent.ThreadFactory
                    public Thread newThread(Runnable runnable) {
                        Thread thread = new Thread(runnable);
                        thread.setName("GtHttpClient dispatcher's thread" + this.index.getAndIncrement());
                        return thread;
                    }
                });
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.executorService;
    }

    public final void finished(RealCall.AsyncCall asyncCall) {
        finished(this.runningAsyncCalls, asyncCall, true);
    }

    public final synchronized int getMaxRequests() {
        return this.maxRequests;
    }

    public final synchronized int getMaxRequestsPerHost() {
        return this.maxRequestsPerHost;
    }

    public final synchronized List<Call> queuedCalls() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator<RealCall.AsyncCall> it = this.readyAsyncCalls.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().get());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final synchronized int queuedCallsCount() {
        return this.readyAsyncCalls.size();
    }

    public final synchronized List<Call> runningCalls() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            arrayList.addAll(this.runningSyncCalls);
            Iterator<RealCall.AsyncCall> it = this.runningAsyncCalls.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().get());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final synchronized int runningCallsCount() {
        return this.runningAsyncCalls.size() + this.runningSyncCalls.size();
    }

    public final synchronized void setMaxRequests(int i11) {
        if (i11 <= 0) {
            throw new IllegalArgumentException("max < 1: ".concat(String.valueOf(i11)));
        }
        this.maxRequests = i11;
        promoteCalls();
    }

    public final synchronized void setMaxRequestsPerHost(int i11) {
        if (i11 <= 0) {
            throw new IllegalArgumentException("max < 1: ".concat(String.valueOf(i11)));
        }
        this.maxRequestsPerHost = i11;
        promoteCalls();
    }

    public final void finished(RealCall realCall) {
        finished(this.runningSyncCalls, realCall, false);
    }

    private <T> void finished(Deque<T> deque, T t11, boolean z11) {
        synchronized (this) {
            try {
                if (!deque.remove(t11)) {
                    throw new AssertionError("Call wasn't in-flight!");
                }
                if (z11) {
                    promoteCalls();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
