package com.huawei.hms.common.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.core.aidl.IAIDLInvoke;
import com.huawei.hms.support.log.HMSLog;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class RequestManager implements Handler.Callback {
    public static final int NOTIFY_CONNECT_FAILED = 10012;
    public static final int NOTIFY_CONNECT_SUCCESS = 10011;
    public static final int NOTIFY_CONNECT_SUSPENDED = 10013;

    /* renamed from: b, reason: collision with root package name */
    private static volatile RequestManager f35577b;

    /* renamed from: c, reason: collision with root package name */
    private static Handler f35578c;

    /* renamed from: a, reason: collision with root package name */
    private static final Object f35576a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static Queue<HuaweiApi.RequestHandler> f35579d = new ConcurrentLinkedQueue();

    /* renamed from: e, reason: collision with root package name */
    private static Map<String, HuaweiApi.RequestHandler> f35580e = new LinkedHashMap();

    private RequestManager(Looper looper) {
        f35578c = new Handler(looper, this);
    }

    public static void addRequestToQueue(HuaweiApi.RequestHandler requestHandler) {
        f35579d.add(requestHandler);
    }

    public static void addToConnectedReqMap(final String str, final HuaweiApi.RequestHandler requestHandler) {
        if (f35578c == null) {
            return;
        }
        HMSLog.i("RequestManager", "addToConnectedReqMap");
        f35578c.post(new Runnable() { // from class: com.huawei.hms.common.internal.RequestManager.1
            @Override // java.lang.Runnable
            public void run() {
                RequestManager.f35580e.put(str, requestHandler);
            }
        });
    }

    private void b() {
        while (!f35579d.isEmpty()) {
            HuaweiApi.RequestHandler poll = f35579d.poll();
            if (poll != null) {
                Object client = poll.getClient();
                if (client instanceof BaseHmsClient) {
                    BaseHmsClient baseHmsClient = (BaseHmsClient) client;
                    baseHmsClient.setService(IAIDLInvoke.Stub.asInterface(baseHmsClient.getAdapter().getServiceBinder()));
                    poll.onConnected();
                }
            }
        }
    }

    private void c() {
        HMSLog.i("RequestManager", "NOTIFY_CONNECT_SUSPENDED.");
        while (!f35579d.isEmpty()) {
            f35579d.poll().onConnectionSuspended(1);
        }
        d();
    }

    private void d() {
        HMSLog.i("RequestManager", "notifyRunningRequestConnectSuspend, connectedReqMap.size(): " + f35580e.size());
        Iterator<Map.Entry<String, HuaweiApi.RequestHandler>> it = f35580e.entrySet().iterator();
        while (it.hasNext()) {
            try {
                it.next().getValue().onConnectionSuspended(1);
            } catch (RuntimeException e11) {
                HMSLog.e("RequestManager", "NOTIFY_CONNECT_SUSPENDED Exception: " + e11.getMessage());
            }
            it.remove();
        }
    }

    public static Handler getHandler() {
        return f35578c;
    }

    public static RequestManager getInstance() {
        synchronized (f35576a) {
            try {
                if (f35577b == null) {
                    HandlerThread handlerThread = new HandlerThread("RequestManager");
                    handlerThread.start();
                    f35577b = new RequestManager(handlerThread.getLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f35577b;
    }

    public static void removeReqByTransId(final String str) {
        if (f35578c == null) {
            return;
        }
        HMSLog.i("RequestManager", "removeReqByTransId");
        f35578c.post(new Runnable() { // from class: com.huawei.hms.common.internal.RequestManager.2
            @Override // java.lang.Runnable
            public void run() {
                RequestManager.f35580e.remove(str);
            }
        });
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message == null) {
            return false;
        }
        HMSLog.i("RequestManager", "RequestManager handleMessage.");
        switch (message.what) {
            case 10011:
                b();
                break;
            case 10012:
                a(message);
                break;
            case 10013:
                c();
                break;
            default:
                HMSLog.i("RequestManager", "handleMessage unknown msg:" + message.what);
                break;
        }
        return false;
    }

    private void a(Message message) {
        HMSLog.i("RequestManager", "NOTIFY_CONNECT_FAILED.");
        try {
            BaseHmsClient.ConnectionResultWrapper connectionResultWrapper = (BaseHmsClient.ConnectionResultWrapper) message.obj;
            HuaweiApi.RequestHandler request = connectionResultWrapper.getRequest();
            f35579d.remove(request);
            request.onConnectionFailed(connectionResultWrapper.getConnectionResult());
        } catch (RuntimeException e11) {
            HMSLog.e("RequestManager", "<handleConnectFailed> handle Failed" + e11.getMessage());
        }
    }
}
