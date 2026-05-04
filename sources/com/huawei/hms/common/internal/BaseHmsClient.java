package com.huawei.hms.common.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.huawei.hms.adapter.AvailableAdapter;
import com.huawei.hms.adapter.BinderAdapter;
import com.huawei.hms.adapter.InnerBinderAdapter;
import com.huawei.hms.adapter.OuterBinderAdapter;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.api.FailedBinderCallBack;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.api.IPCTransport;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.core.aidl.IAIDLInvoke;
import com.huawei.hms.support.api.client.AidlApiClient;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.Util;
import java.sql.Timestamp;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class BaseHmsClient implements AidlApiClient {
    protected static final int TIMEOUT_DISCONNECTED = 6;

    /* renamed from: i, reason: collision with root package name */
    private static final Object f35536i = new Object();

    /* renamed from: j, reason: collision with root package name */
    private static final AtomicInteger f35537j = new AtomicInteger(1);

    /* renamed from: k, reason: collision with root package name */
    private static final AtomicInteger f35538k = new AtomicInteger(1);

    /* renamed from: l, reason: collision with root package name */
    private static BinderAdapter f35539l;

    /* renamed from: m, reason: collision with root package name */
    private static BinderAdapter f35540m;

    /* renamed from: a, reason: collision with root package name */
    private final Context f35541a;

    /* renamed from: b, reason: collision with root package name */
    private String f35542b;

    /* renamed from: c, reason: collision with root package name */
    private final ClientSettings f35543c;

    /* renamed from: d, reason: collision with root package name */
    private volatile IAIDLInvoke f35544d;

    /* renamed from: e, reason: collision with root package name */
    private final ConnectionCallbacks f35545e;

    /* renamed from: f, reason: collision with root package name */
    private final OnConnectionFailedListener f35546f;

    /* renamed from: g, reason: collision with root package name */
    private Handler f35547g = null;

    /* renamed from: h, reason: collision with root package name */
    private HuaweiApi.RequestHandler f35548h;
    protected String sessionId;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface ConnectionCallbacks {
        public static final int CAUSE_API_CLIENT_EXPIRED = 3;
        public static final int CAUSE_NETWORK_LOST = 2;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

        void onConnected();

        void onConnectionSuspended(int i11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ConnectionResultWrapper {

        /* renamed from: a, reason: collision with root package name */
        private HuaweiApi.RequestHandler f35553a;

        /* renamed from: b, reason: collision with root package name */
        private ConnectionResult f35554b;

        public ConnectionResultWrapper(HuaweiApi.RequestHandler requestHandler, ConnectionResult connectionResult) {
            this.f35553a = requestHandler;
            this.f35554b = connectionResult;
        }

        public ConnectionResult getConnectionResult() {
            return this.f35554b;
        }

        public HuaweiApi.RequestHandler getRequest() {
            return this.f35553a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface OnConnectionFailedListener {
        void onConnectionFailed(ConnectionResult connectionResult);
    }

    public BaseHmsClient(Context context, ClientSettings clientSettings, OnConnectionFailedListener onConnectionFailedListener, ConnectionCallbacks connectionCallbacks) {
        this.f35541a = context;
        this.f35543c = clientSettings;
        if (clientSettings != null) {
            this.f35542b = clientSettings.getAppID();
        }
        this.f35546f = onConnectionFailedListener;
        this.f35545e = connectionCallbacks;
    }

    private BinderAdapter.BinderCallBack d() {
        return new BinderAdapter.BinderCallBack() { // from class: com.huawei.hms.common.internal.BaseHmsClient.1
            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onBinderFailed(int i11) {
                onBinderFailed(i11, null);
            }

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onNullBinding(ComponentName componentName) {
                BaseHmsClient.this.b(1);
                BaseHmsClient.this.a(10);
            }

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                HMSLog.i("BaseHmsClient", "Enter onServiceConnected.");
                BaseHmsClient.this.connectedInternal(iBinder);
            }

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onServiceDisconnected(ComponentName componentName) {
                HMSLog.i("BaseHmsClient", "Enter onServiceDisconnected.");
                BaseHmsClient.this.b(1);
                RequestManager.getHandler().sendEmptyMessage(10013);
                if (BaseHmsClient.this.f35545e == null || (BaseHmsClient.this.f35545e instanceof HuaweiApi.RequestHandler)) {
                    return;
                }
                BaseHmsClient.this.f35545e.onConnectionSuspended(1);
            }

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onTimedDisconnected() {
                BaseHmsClient.this.b(6);
                if (BaseHmsClient.this.f35545e == null || (BaseHmsClient.this.f35545e instanceof HuaweiApi.RequestHandler)) {
                    return;
                }
                BaseHmsClient.this.f35545e.onConnectionSuspended(1);
            }

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onBinderFailed(int i11, Intent intent) {
                if (intent == null) {
                    HMSLog.i("BaseHmsClient", "onBinderFailed: intent is null!");
                    BaseHmsClient.this.a(new ConnectionResult(10, (PendingIntent) null));
                    BaseHmsClient.this.f35544d = null;
                    return;
                }
                Activity activeActivity = Util.getActiveActivity(BaseHmsClient.this.getClientSettings().getCpActivity(), BaseHmsClient.this.getContext());
                if (activeActivity == null) {
                    HMSLog.i("BaseHmsClient", "onBinderFailed: return pendingIntent to kit and cp");
                    BaseHmsClient.this.a(new ConnectionResult(10, PendingIntent.getActivity(BaseHmsClient.this.f35541a, 11, intent, 67108864)));
                    BaseHmsClient.this.f35544d = null;
                    return;
                }
                HMSLog.i("BaseHmsClient", "onBinderFailed: SDK try to resolve and reConnect!");
                long time = new Timestamp(System.currentTimeMillis()).getTime();
                FailedBinderCallBack.getInstance().setCallBack(Long.valueOf(time), new FailedBinderCallBack.BinderCallBack() { // from class: com.huawei.hms.common.internal.BaseHmsClient.1.1
                    @Override // com.huawei.hms.api.FailedBinderCallBack.BinderCallBack
                    public void binderCallBack(int i12) {
                        if (i12 != 0) {
                            BaseHmsClient.this.a(new ConnectionResult(10, (PendingIntent) null));
                            BaseHmsClient.this.f35544d = null;
                        }
                    }
                });
                intent.putExtra(FailedBinderCallBack.CALLER_ID, time);
                activeActivity.startActivity(intent);
            }
        };
    }

    private void e() {
        HMSLog.w("BaseHmsClient", "Failed to get service as interface, trying to unbind.");
        if (this.f35543c.isUseInnerHms()) {
            BinderAdapter binderAdapter = f35540m;
            if (binderAdapter == null) {
                HMSLog.w("BaseHmsClient", "mInnerBinderAdapter is null.");
                return;
            }
            binderAdapter.unBind();
        } else {
            BinderAdapter binderAdapter2 = f35539l;
            if (binderAdapter2 == null) {
                HMSLog.w("BaseHmsClient", "mOuterBinderAdapter is null.");
                return;
            }
            binderAdapter2.unBind();
        }
        b(1);
        a(10);
    }

    private void f() {
        if (this.f35543c.isUseInnerHms()) {
            BinderAdapter binderAdapter = f35540m;
            if (binderAdapter != null) {
                binderAdapter.unBind();
                return;
            }
            return;
        }
        BinderAdapter binderAdapter2 = f35539l;
        if (binderAdapter2 != null) {
            binderAdapter2.unBind();
        }
    }

    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(int i11) {
        a(i11, false);
    }

    public void connectedInternal(IBinder iBinder) {
        this.f35544d = IAIDLInvoke.Stub.asInterface(iBinder);
        if (this.f35544d != null) {
            onConnecting();
        } else {
            HMSLog.e("BaseHmsClient", "mService is null, try to unBind.");
            e();
        }
    }

    public final void connectionConnected() {
        b(3);
        RequestManager.getHandler().sendEmptyMessage(10011);
        ConnectionCallbacks connectionCallbacks = this.f35545e;
        if (connectionCallbacks == null || (connectionCallbacks instanceof HuaweiApi.RequestHandler)) {
            return;
        }
        connectionCallbacks.onConnected();
    }

    public void disconnect() {
        int i11 = (this.f35543c.isUseInnerHms() ? f35538k : f35537j).get();
        HMSLog.i("BaseHmsClient", "Enter disconnect, Connection Status: " + i11);
        if (i11 == 3) {
            f();
            b(1);
        } else {
            if (i11 != 5) {
                return;
            }
            b();
            b(1);
        }
    }

    public BinderAdapter getAdapter() {
        HMSLog.i("BaseHmsClient", "getAdapter:isInner:" + this.f35543c.isUseInnerHms() + ", mInnerBinderAdapter:" + f35540m + ", mOuterBinderAdapter:" + f35539l);
        return this.f35543c.isUseInnerHms() ? f35540m : f35539l;
    }

    @Override // com.huawei.hms.support.api.client.AidlApiClient
    public List<String> getApiNameList() {
        return this.f35543c.getApiName();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getAppID() {
        return this.f35542b;
    }

    public ClientSettings getClientSettings() {
        return this.f35543c;
    }

    public int getConnectionStatus() {
        return (this.f35543c.isUseInnerHms() ? f35538k : f35537j).get();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public Context getContext() {
        return this.f35541a;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getCpID() {
        return this.f35543c.getCpID();
    }

    @Deprecated
    public int getMinApkVersion() {
        return 30000000;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getPackageName() {
        return this.f35543c.getClientPackageName();
    }

    public int getRequestHmsVersionCode() {
        return getMinApkVersion();
    }

    @Override // com.huawei.hms.support.api.client.AidlApiClient
    public IAIDLInvoke getService() {
        return this.f35544d;
    }

    public String getServiceAction() {
        HMSPackageManager hMSPackageManager = HMSPackageManager.getInstance(this.f35541a);
        return this.f35543c.isUseInnerHms() ? hMSPackageManager.getInnerServiceAction() : hMSPackageManager.getServiceAction();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getSessionId() {
        return this.sessionId;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public SubAppInfo getSubAppInfo() {
        return this.f35543c.getSubAppID();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getTransportName() {
        return IPCTransport.class.getName();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public boolean isConnected() {
        return this.f35543c.isUseInnerHms() ? f35538k.get() == 3 : f35537j.get() == 3;
    }

    public boolean isConnecting() {
        return (this.f35543c.isUseInnerHms() ? f35538k : f35537j).get() == 5;
    }

    public void onConnecting() {
        connectionConnected();
    }

    public final void setInternalRequest(HuaweiApi.RequestHandler requestHandler) {
        this.f35548h = requestHandler;
    }

    public void setService(IAIDLInvoke iAIDLInvoke) {
        this.f35544d = iAIDLInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c() {
        return HMSPackageManager.getInstance(this.f35541a).getHMSPackageStatesForMultiService() == PackageManagerHelper.PackageStates.ENABLED;
    }

    public void b(int i11) {
        if (this.f35543c.isUseInnerHms()) {
            f35538k.set(i11);
        } else {
            f35537j.set(i11);
        }
    }

    public void connect(int i11, boolean z11) {
        a(i11, z11);
    }

    private void b() {
        synchronized (f35536i) {
            try {
                Handler handler = this.f35547g;
                if (handler != null) {
                    handler.removeMessages(2);
                    this.f35547g = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a() {
        String innerHmsPkg = this.f35543c.getInnerHmsPkg();
        String serviceAction = getServiceAction();
        HMSLog.i("BaseHmsClient", "enter bindCoreService, packageName is " + innerHmsPkg + ", serviceAction is " + serviceAction);
        a(innerHmsPkg, serviceAction);
    }

    private void a(String str, String str2) {
        if (this.f35543c.isUseInnerHms()) {
            f35540m = InnerBinderAdapter.getInstance(this.f35541a, str2, str);
            if (isConnected()) {
                HMSLog.i("BaseHmsClient", "The binder is already connected.");
                getAdapter().updateDelayTask();
                connectedInternal(getAdapter().getServiceBinder());
                return;
            } else {
                b(5);
                f35540m.binder(d());
                return;
            }
        }
        f35539l = OuterBinderAdapter.getInstance(this.f35541a, str2, str);
        if (isConnected()) {
            HMSLog.i("BaseHmsClient", "The binder is already connected.");
            getAdapter().updateDelayTask();
            connectedInternal(getAdapter().getServiceBinder());
        } else {
            b(5);
            f35539l.binder(d());
        }
    }

    private void b(AvailableAdapter availableAdapter, int i11) {
        HMSLog.i("BaseHmsClient", "enter HmsCore resolution");
        if (!getClientSettings().isHasActivity()) {
            a(new ConnectionResult(26, HuaweiApiAvailability.getInstance().getErrPendingIntent(this.f35541a, i11, 0)));
            return;
        }
        Activity activeActivity = Util.getActiveActivity(getClientSettings().getCpActivity(), getContext());
        if (activeActivity != null) {
            availableAdapter.startResolution(activeActivity, new AvailableAdapter.AvailableCallBack() { // from class: com.huawei.hms.common.internal.BaseHmsClient.3
                @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
                public void onComplete(int i12) {
                    if (i12 == 0 && BaseHmsClient.this.c()) {
                        BaseHmsClient.this.a();
                    } else {
                        BaseHmsClient.this.a(i12);
                    }
                }
            });
        } else {
            a(26);
        }
    }

    private void a(int i11, boolean z11) {
        HMSLog.i("BaseHmsClient", "====== HMSSDK version: 61200300 ======");
        int i12 = (this.f35543c.isUseInnerHms() ? f35538k : f35537j).get();
        HMSLog.i("BaseHmsClient", "Enter connect, Connection Status: " + i12);
        if (z11 || !(i12 == 3 || i12 == 5)) {
            if (getMinApkVersion() > i11) {
                i11 = getMinApkVersion();
            }
            HMSLog.i("BaseHmsClient", "connect minVersion:" + i11 + " packageName:" + this.f35543c.getInnerHmsPkg());
            if (this.f35541a.getPackageName().equals(this.f35543c.getInnerHmsPkg())) {
                HMSLog.i("BaseHmsClient", "service packageName is same, bind core service return");
                a();
                return;
            }
            if (Util.isAvailableLibExist(this.f35541a)) {
                AvailableAdapter availableAdapter = new AvailableAdapter(i11);
                int isHuaweiMobileServicesAvailable = availableAdapter.isHuaweiMobileServicesAvailable(this.f35541a);
                HMSLog.i("BaseHmsClient", "check available result: " + isHuaweiMobileServicesAvailable);
                if (isHuaweiMobileServicesAvailable == 0) {
                    a();
                    return;
                }
                if (availableAdapter.isUserResolvableError(isHuaweiMobileServicesAvailable)) {
                    HMSLog.i("BaseHmsClient", "bindCoreService3.0 fail, start resolution now.");
                    b(availableAdapter, isHuaweiMobileServicesAvailable);
                    return;
                } else {
                    if (availableAdapter.isUserNoticeError(isHuaweiMobileServicesAvailable)) {
                        HMSLog.i("BaseHmsClient", "bindCoreService3.0 fail, start notice now.");
                        a(availableAdapter, isHuaweiMobileServicesAvailable);
                        return;
                    }
                    HMSLog.i("BaseHmsClient", "bindCoreService3.0 fail: " + isHuaweiMobileServicesAvailable + " is not resolvable.");
                    a(isHuaweiMobileServicesAvailable);
                    return;
                }
            }
            int isHuaweiMobileServicesAvailable2 = HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(this.f35541a, i11);
            HMSLog.i("BaseHmsClient", "HuaweiApiAvailability check available result: " + isHuaweiMobileServicesAvailable2);
            if (isHuaweiMobileServicesAvailable2 == 0) {
                a();
            } else {
                a(isHuaweiMobileServicesAvailable2);
            }
        }
    }

    private void a(AvailableAdapter availableAdapter, int i11) {
        HMSLog.i("BaseHmsClient", "enter notice");
        if (!getClientSettings().isHasActivity()) {
            if (i11 == 29) {
                i11 = 9;
            }
            a(new ConnectionResult(26, HuaweiApiAvailability.getInstance().getErrPendingIntent(this.f35541a, i11, 0)));
        } else {
            Activity activeActivity = Util.getActiveActivity(getClientSettings().getCpActivity(), getContext());
            if (activeActivity != null) {
                availableAdapter.startNotice(activeActivity, new AvailableAdapter.AvailableCallBack() { // from class: com.huawei.hms.common.internal.BaseHmsClient.2
                    @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
                    public void onComplete(int i12) {
                        BaseHmsClient.this.a(i12);
                    }
                });
            } else {
                a(26);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i11) {
        HMSLog.i("BaseHmsClient", "notifyFailed result: " + i11);
        Message message = new Message();
        message.what = 10012;
        message.obj = new ConnectionResultWrapper(this.f35548h, new ConnectionResult(i11));
        RequestManager.getHandler().sendMessage(message);
        OnConnectionFailedListener onConnectionFailedListener = this.f35546f;
        if (onConnectionFailedListener == null || (onConnectionFailedListener instanceof HuaweiApi.RequestHandler)) {
            return;
        }
        onConnectionFailedListener.onConnectionFailed(new ConnectionResult(i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ConnectionResult connectionResult) {
        HMSLog.i("BaseHmsClient", "notifyFailed result: " + connectionResult.getErrorCode());
        Message message = new Message();
        message.what = 10012;
        HuaweiApi.RequestHandler requestHandler = this.f35548h;
        this.f35548h = null;
        message.obj = new ConnectionResultWrapper(requestHandler, connectionResult);
        RequestManager.getHandler().sendMessage(message);
        OnConnectionFailedListener onConnectionFailedListener = this.f35546f;
        if (onConnectionFailedListener == null || (onConnectionFailedListener instanceof HuaweiApi.RequestHandler)) {
            return;
        }
        onConnectionFailedListener.onConnectionFailed(connectionResult);
    }
}
