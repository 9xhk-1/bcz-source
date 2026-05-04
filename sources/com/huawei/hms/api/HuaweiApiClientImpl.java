package com.huawei.hms.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiClient;
import com.huawei.hms.common.api.ConnectionPostProcessor;
import com.huawei.hms.common.internal.AutoLifecycleFragment;
import com.huawei.hms.core.aidl.CodecLookup;
import com.huawei.hms.core.aidl.DataBuffer;
import com.huawei.hms.core.aidl.IAIDLCallback;
import com.huawei.hms.core.aidl.IAIDLInvoke;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.MessageCodec;
import com.huawei.hms.core.aidl.RequestHeader;
import com.huawei.hms.core.aidl.ResponseHeader;
import com.huawei.hms.support.api.PendingResultImpl;
import com.huawei.hms.support.api.ResolveResult;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.BundleResult;
import com.huawei.hms.support.api.client.InnerApiClient;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.core.ConnectService;
import com.huawei.hms.support.api.entity.auth.PermissionInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.api.entity.core.CheckConnectInfo;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.api.entity.core.ConnectInfo;
import com.huawei.hms.support.api.entity.core.ConnectResp;
import com.huawei.hms.support.api.entity.core.DisconnectInfo;
import com.huawei.hms.support.api.entity.core.DisconnectResp;
import com.huawei.hms.support.api.entity.core.JosGetNoticeResp;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.manager.CheckUpdateLegacy;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.UIUtil;
import com.huawei.hms.utils.Util;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes7.dex */
public class HuaweiApiClientImpl extends HuaweiApiClient implements InnerApiClient, ServiceConnection {
    private static final Object A = new Object();
    private static final Object B = new Object();
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final int SIGN_IN_MODE_OPTIONAL = 2;
    public static final int SIGN_IN_MODE_REQUIRED = 1;

    /* renamed from: b, reason: collision with root package name */
    private final Context f35404b;

    /* renamed from: c, reason: collision with root package name */
    private final String f35405c;

    /* renamed from: d, reason: collision with root package name */
    private String f35406d;

    /* renamed from: e, reason: collision with root package name */
    private String f35407e;

    /* renamed from: f, reason: collision with root package name */
    private volatile IAIDLInvoke f35408f;

    /* renamed from: g, reason: collision with root package name */
    private String f35409g;

    /* renamed from: h, reason: collision with root package name */
    private WeakReference<Activity> f35410h;

    /* renamed from: i, reason: collision with root package name */
    private WeakReference<Activity> f35411i;

    /* renamed from: l, reason: collision with root package name */
    private List<Scope> f35414l;

    /* renamed from: m, reason: collision with root package name */
    private List<PermissionInfo> f35415m;

    /* renamed from: n, reason: collision with root package name */
    private Map<Api<?>, Api.ApiOptions> f35416n;

    /* renamed from: o, reason: collision with root package name */
    private SubAppInfo f35417o;

    /* renamed from: s, reason: collision with root package name */
    private final ReentrantLock f35421s;

    /* renamed from: t, reason: collision with root package name */
    private final Condition f35422t;

    /* renamed from: u, reason: collision with root package name */
    private ConnectionResult f35423u;

    /* renamed from: v, reason: collision with root package name */
    private HuaweiApiClient.ConnectionCallbacks f35424v;

    /* renamed from: w, reason: collision with root package name */
    private HuaweiApiClient.OnConnectionFailedListener f35425w;

    /* renamed from: x, reason: collision with root package name */
    private Handler f35426x;

    /* renamed from: y, reason: collision with root package name */
    private Handler f35427y;

    /* renamed from: z, reason: collision with root package name */
    private CheckUpdatelistener f35428z;

    /* renamed from: a, reason: collision with root package name */
    private int f35403a = -1;

    /* renamed from: j, reason: collision with root package name */
    private boolean f35412j = false;

    /* renamed from: k, reason: collision with root package name */
    private AtomicInteger f35413k = new AtomicInteger(1);

    /* renamed from: p, reason: collision with root package name */
    private long f35418p = 0;

    /* renamed from: q, reason: collision with root package name */
    private int f35419q = 0;

    /* renamed from: r, reason: collision with root package name */
    private final Object f35420r = new Object();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message == null || message.what != 2) {
                return false;
            }
            HMSLog.e("HuaweiApiClientImpl", "In connect, bind core service time out");
            if (HuaweiApiClientImpl.this.f35413k.get() == 5) {
                HuaweiApiClientImpl.this.c(1);
                HuaweiApiClientImpl.this.b();
            }
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Handler.Callback {
        public b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message == null || message.what != 3) {
                return false;
            }
            HMSLog.e("HuaweiApiClientImpl", "In connect, process time out");
            if (HuaweiApiClientImpl.this.f35413k.get() == 2) {
                HuaweiApiClientImpl.this.c(1);
                HuaweiApiClientImpl.this.b();
            }
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends IAIDLCallback.Stub {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ResultCallback f35431a;

        public c(ResultCallback resultCallback) {
            this.f35431a = resultCallback;
        }

        @Override // com.huawei.hms.core.aidl.IAIDLCallback
        public void call(DataBuffer dataBuffer) {
            if (dataBuffer == null) {
                HMSLog.i("HuaweiApiClientImpl", "Exit asyncRequest onResult -1");
                this.f35431a.onResult(new BundleResult(-1, null));
                return;
            }
            MessageCodec find = CodecLookup.find(dataBuffer.getProtocol());
            ResponseHeader responseHeader = new ResponseHeader();
            find.decode(dataBuffer.header, responseHeader);
            BundleResult bundleResult = new BundleResult(responseHeader.getStatusCode(), dataBuffer.getBody());
            HMSLog.i("HuaweiApiClientImpl", "Exit asyncRequest onResult");
            this.f35431a.onResult(bundleResult);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d extends PendingResultImpl<Status, IMessageEntity> {
        public d(ApiClient apiClient, String str, IMessageEntity iMessageEntity) {
            super(apiClient, str, iMessageEntity);
        }

        @Override // com.huawei.hms.support.api.PendingResultImpl
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Status onComplete(IMessageEntity iMessageEntity) {
            return new Status(0);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements ResultCallback<ResolveResult<ConnectResp>> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ResolveResult f35434a;

            public a(ResolveResult resolveResult) {
                this.f35434a = resolveResult;
            }

            @Override // java.lang.Runnable
            public void run() {
                HuaweiApiClientImpl.this.a((ResolveResult<ConnectResp>) this.f35434a);
            }
        }

        private e() {
        }

        @Override // com.huawei.hms.support.api.client.ResultCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(ResolveResult<ConnectResp> resolveResult) {
            new Handler(Looper.getMainLooper()).post(new a(resolveResult));
        }

        public /* synthetic */ e(HuaweiApiClientImpl huaweiApiClientImpl, a aVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f implements ResultCallback<ResolveResult<DisconnectResp>> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ResolveResult f35437a;

            public a(ResolveResult resolveResult) {
                this.f35437a = resolveResult;
            }

            @Override // java.lang.Runnable
            public void run() {
                HuaweiApiClientImpl.this.b((ResolveResult<DisconnectResp>) this.f35437a);
            }
        }

        private f() {
        }

        @Override // com.huawei.hms.support.api.client.ResultCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(ResolveResult<DisconnectResp> resolveResult) {
            new Handler(Looper.getMainLooper()).post(new a(resolveResult));
        }

        public /* synthetic */ f(HuaweiApiClientImpl huaweiApiClientImpl, a aVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g implements ResultCallback<ResolveResult<JosGetNoticeResp>> {
        private g() {
        }

        @Override // com.huawei.hms.support.api.client.ResultCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(ResolveResult<JosGetNoticeResp> resolveResult) {
            JosGetNoticeResp value;
            Intent noticeIntent;
            if (resolveResult == null || !resolveResult.getStatus().isSuccess() || (noticeIntent = (value = resolveResult.getValue()).getNoticeIntent()) == null || value.getStatusCode() != 0) {
                return;
            }
            HMSLog.i("HuaweiApiClientImpl", "get notice has intent.");
            Activity validActivity = Util.getValidActivity((Activity) HuaweiApiClientImpl.this.f35410h.get(), HuaweiApiClientImpl.this.getTopActivity());
            if (validActivity == null) {
                HMSLog.e("HuaweiApiClientImpl", "showNotice no valid activity!");
            } else {
                HuaweiApiClientImpl.this.f35412j = true;
                validActivity.startActivity(noticeIntent);
            }
        }

        public /* synthetic */ g(HuaweiApiClientImpl huaweiApiClientImpl, a aVar) {
            this();
        }
    }

    public HuaweiApiClientImpl(Context context) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f35421s = reentrantLock;
        this.f35422t = reentrantLock.newCondition();
        this.f35426x = null;
        this.f35427y = null;
        this.f35428z = null;
        this.f35404b = context;
        String appId = Util.getAppId(context);
        this.f35405c = appId;
        this.f35406d = appId;
        this.f35407e = Util.getCpId(context);
    }

    private DisconnectInfo d() {
        ArrayList arrayList = new ArrayList();
        Map<Api<?>, Api.ApiOptions> map = this.f35416n;
        if (map != null) {
            Iterator<Api<?>> it = map.keySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getApiName());
            }
        }
        return new DisconnectInfo(this.f35414l, arrayList);
    }

    private int e() {
        int hmsVersion = Util.getHmsVersion(this.f35404b);
        if (hmsVersion != 0 && hmsVersion >= 20503000) {
            return hmsVersion;
        }
        int f11 = f();
        if (g()) {
            if (f11 < 20503000) {
                return 20503000;
            }
        } else if (f11 < 20600000) {
            return 20600000;
        }
        return f11;
    }

    private int f() {
        Integer num;
        int intValue;
        Map<Api<?>, Api.ApiOptions> apiMap = getApiMap();
        int i11 = 0;
        if (apiMap == null) {
            return 0;
        }
        Iterator<Api<?>> it = apiMap.keySet().iterator();
        while (it.hasNext()) {
            String apiName = it.next().getApiName();
            if (!TextUtils.isEmpty(apiName) && (num = HuaweiApiAvailability.getApiMap().get(apiName)) != null && (intValue = num.intValue()) > i11) {
                i11 = intValue;
            }
        }
        return i11;
    }

    private boolean g() {
        Map<Api<?>, Api.ApiOptions> map = this.f35416n;
        if (map == null) {
            return false;
        }
        Iterator<Api<?>> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (HuaweiApiAvailability.HMS_API_NAME_GAME.equals(it.next().getApiName())) {
                return true;
            }
        }
        return false;
    }

    private void h() {
        Handler handler = this.f35426x;
        if (handler != null) {
            handler.removeMessages(2);
        } else {
            this.f35426x = new Handler(Looper.getMainLooper(), new a());
        }
        this.f35426x.sendEmptyMessageDelayed(2, 5000L);
    }

    private void i() {
        synchronized (B) {
            try {
                Handler handler = this.f35427y;
                if (handler != null) {
                    handler.removeMessages(3);
                } else {
                    this.f35427y = new Handler(Looper.getMainLooper(), new b());
                }
                HMSLog.d("HuaweiApiClientImpl", "sendEmptyMessageDelayed for onConnectionResult 3 seconds. the result is : " + this.f35427y.sendEmptyMessageDelayed(3, 3000L));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void j() {
        HMSLog.i("HuaweiApiClientImpl", "Enter sendConnectApiServceRequest.");
        ConnectService.connect(this, c()).setResultCallback(new e(this, null));
    }

    private void k() {
        ConnectService.disconnect(this, d()).setResultCallback(new f(this, null));
    }

    private void l() {
        HMSLog.i("HuaweiApiClientImpl", "Enter sendForceConnectApiServceRequest.");
        ConnectService.forceConnect(this, c()).setResultCallback(new e(this, null));
    }

    private void m() {
        if (this.f35412j) {
            HMSLog.i("HuaweiApiClientImpl", "Connect notice has been shown.");
        } else if (HuaweiApiAvailability.getInstance().isHuaweiMobileNoticeAvailable(this.f35404b) == 0) {
            ConnectService.getNotice(this, 0, "6.12.0.300").setResultCallback(new g(this, null));
        }
    }

    private void n() {
        Util.unBindServiceCatchException(this.f35404b, this);
        this.f35408f = null;
    }

    public int asyncRequest(Bundle bundle, String str, int i11, ResultCallback<BundleResult> resultCallback) {
        HMSLog.i("HuaweiApiClientImpl", "Enter asyncRequest.");
        if (resultCallback == null || str == null || bundle == null) {
            HMSLog.e("HuaweiApiClientImpl", "arguments is invalid.");
            return CommonCode.ErrorCode.ARGUMENTS_INVALID;
        }
        if (!innerIsConnected()) {
            HMSLog.e("HuaweiApiClientImpl", "client is unConnect.");
            return CommonCode.ErrorCode.CLIENT_API_INVALID;
        }
        DataBuffer dataBuffer = new DataBuffer(str, i11);
        MessageCodec find = CodecLookup.find(dataBuffer.getProtocol());
        dataBuffer.addBody(bundle);
        RequestHeader requestHeader = new RequestHeader(getAppID(), getPackageName(), 61200300, getSessionId());
        requestHeader.setApiNameList(getApiNameList());
        dataBuffer.header = find.encode(requestHeader, new Bundle());
        try {
            getService().asyncCall(dataBuffer, new c(resultCallback));
            return 0;
        } catch (RemoteException e11) {
            HMSLog.e("HuaweiApiClientImpl", "remote exception:" + e11.getMessage());
            return CommonCode.ErrorCode.INTERNAL_ERROR;
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void checkUpdate(Activity activity, CheckUpdatelistener checkUpdatelistener) {
        if (checkUpdatelistener == null) {
            HMSLog.e("HuaweiApiClientImpl", "listener is null!");
            return;
        }
        if (activity == null || activity.isFinishing()) {
            HMSLog.e("HuaweiApiClientImpl", "checkUpdate, activity is illegal: " + activity);
            checkUpdatelistener.onResult(-1);
            return;
        }
        this.f35428z = checkUpdatelistener;
        try {
            CheckUpdateLegacy.class.getMethod("initCheckUpdateCallBack", Object.class, Activity.class).invoke(CheckUpdateLegacy.class.getDeclaredConstructor(null).newInstance(null), this, activity);
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | InvocationTargetException e11) {
            HMSLog.e("HuaweiApiClientImpl", "invoke CheckUpdateLegacy.initCheckUpdateCallBack fail. " + e11.getMessage());
            checkUpdatelistener.onResult(-1);
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void connect(Activity activity) {
        HMSLog.i("HuaweiApiClientImpl", "====== HMSSDK version: 61200300 ======");
        int i11 = this.f35413k.get();
        HMSLog.i("HuaweiApiClientImpl", "Enter connect, Connection Status: " + i11);
        if (i11 == 3 || i11 == 5 || i11 == 2 || i11 == 4) {
            return;
        }
        if (activity != null) {
            this.f35410h = new WeakReference<>(activity);
            this.f35411i = new WeakReference<>(activity);
        }
        this.f35406d = TextUtils.isEmpty(this.f35405c) ? Util.getAppId(this.f35404b) : this.f35405c;
        int e11 = e();
        HMSLog.i("HuaweiApiClientImpl", "connect minVersion:" + e11);
        HuaweiApiAvailability.setServicesVersionCode(e11);
        int isHuaweiMobileServicesAvailable = HuaweiMobileServicesUtil.isHuaweiMobileServicesAvailable(this.f35404b, e11);
        HMSLog.i("HuaweiApiClientImpl", "In connect, isHuaweiMobileServicesAvailable result: " + isHuaweiMobileServicesAvailable);
        this.f35419q = HMSPackageManager.getInstance(this.f35404b).getHmsMultiServiceVersion();
        if (isHuaweiMobileServicesAvailable != 0) {
            if (this.f35425w != null) {
                b(isHuaweiMobileServicesAvailable);
                return;
            }
            return;
        }
        c(5);
        if (this.f35408f == null) {
            a();
            return;
        }
        c(2);
        j();
        i();
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void connectForeground() {
        HMSLog.i("HuaweiApiClientImpl", "====== HMSSDK version: 61200300 ======");
        int i11 = this.f35413k.get();
        HMSLog.i("HuaweiApiClientImpl", "Enter forceConnect, Connection Status: " + i11);
        if (i11 == 3 || i11 == 5 || i11 == 2 || i11 == 4) {
            return;
        }
        this.f35406d = TextUtils.isEmpty(this.f35405c) ? Util.getAppId(this.f35404b) : this.f35405c;
        l();
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void disableLifeCycleManagement(Activity activity) {
        if (this.f35403a < 0) {
            throw new IllegalStateException("disableLifeCycleManagement failed");
        }
        AutoLifecycleFragment.getInstance(activity).stopAutoManage(this.f35403a);
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public PendingResult<Status> discardAndReconnect() {
        return new d(this, null, null);
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void disconnect() {
        int i11 = this.f35413k.get();
        HMSLog.i("HuaweiApiClientImpl", "Enter disconnect, Connection Status: " + i11);
        if (i11 == 2) {
            c(4);
            return;
        }
        if (i11 == 3) {
            c(4);
            k();
        } else {
            if (i11 != 5) {
                return;
            }
            a(2);
            c(4);
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public Map<Api<?>, Api.ApiOptions> getApiMap() {
        return this.f35416n;
    }

    @Override // com.huawei.hms.support.api.client.AidlApiClient
    public List<String> getApiNameList() {
        ArrayList arrayList = new ArrayList();
        Map<Api<?>, Api.ApiOptions> map = this.f35416n;
        if (map != null) {
            Iterator<Api<?>> it = map.keySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getApiName());
            }
        }
        return arrayList;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getAppID() {
        return this.f35406d;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public ConnectionResult getConnectionResult(Api<?> api) {
        if (isConnected()) {
            this.f35423u = null;
            return new ConnectionResult(0, (PendingIntent) null);
        }
        ConnectionResult connectionResult = this.f35423u;
        return connectionResult != null ? connectionResult : new ConnectionResult(13, (PendingIntent) null);
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public Context getContext() {
        return this.f35404b;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getCpID() {
        return this.f35407e;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getPackageName() {
        return this.f35404b.getPackageName();
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public List<PermissionInfo> getPermissionInfos() {
        return this.f35415m;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public List<Scope> getScopes() {
        return this.f35414l;
    }

    @Override // com.huawei.hms.support.api.client.AidlApiClient
    public IAIDLInvoke getService() {
        return this.f35408f;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getSessionId() {
        return this.f35409g;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public final SubAppInfo getSubAppInfo() {
        return this.f35417o;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public Activity getTopActivity() {
        WeakReference<Activity> weakReference = this.f35411i;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getTransportName() {
        return IPCTransport.class.getName();
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean hasConnectedApi(Api<?> api) {
        return isConnected();
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean hasConnectionFailureListener(HuaweiApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Checker.checkNonNull(onConnectionFailedListener, "onConnectionFailedListener should not be null");
        synchronized (this.f35420r) {
            try {
                return this.f35425w == onConnectionFailedListener;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean hasConnectionSuccessListener(HuaweiApiClient.ConnectionCallbacks connectionCallbacks) {
        Checker.checkNonNull(connectionCallbacks, "connectionCallbacksListener should not be null");
        synchronized (this.f35420r) {
            try {
                return this.f35424v == connectionCallbacks;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public ConnectionResult holdUpConnect() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("blockingConnect must not be called on the UI thread");
        }
        this.f35421s.lock();
        try {
            connect((Activity) null);
            while (isConnecting()) {
                this.f35422t.await();
            }
            if (isConnected()) {
                this.f35423u = null;
                return new ConnectionResult(0, (PendingIntent) null);
            }
            ConnectionResult connectionResult = this.f35423u;
            return connectionResult != null ? connectionResult : new ConnectionResult(13, (PendingIntent) null);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return new ConnectionResult(15, (PendingIntent) null);
        } finally {
            this.f35421s.unlock();
        }
    }

    @Override // com.huawei.hms.support.api.client.InnerApiClient
    public boolean innerIsConnected() {
        return this.f35413k.get() == 3 || this.f35413k.get() == 4;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient, com.huawei.hms.support.api.client.ApiClient
    public boolean isConnected() {
        if (this.f35419q == 0) {
            this.f35419q = HMSPackageManager.getInstance(this.f35404b).getHmsMultiServiceVersion();
        }
        if (this.f35419q >= 20504000) {
            return innerIsConnected();
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f35418p;
        if (currentTimeMillis > 0 && currentTimeMillis < 300000) {
            return innerIsConnected();
        }
        if (!innerIsConnected()) {
            return false;
        }
        Status status = ConnectService.checkconnect(this, new CheckConnectInfo()).awaitOnAnyThread(2000L, TimeUnit.MILLISECONDS).getStatus();
        if (status.isSuccess()) {
            this.f35418p = System.currentTimeMillis();
            return true;
        }
        int statusCode = status.getStatusCode();
        HMSLog.i("HuaweiApiClientImpl", "isConnected is false, statuscode:" + statusCode);
        if (statusCode == 907135004) {
            return false;
        }
        n();
        c(1);
        this.f35418p = System.currentTimeMillis();
        return false;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean isConnecting() {
        int i11 = this.f35413k.get();
        return i11 == 2 || i11 == 5;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void onPause(Activity activity) {
        HMSLog.i("HuaweiApiClientImpl", "onPause");
    }

    public void onResult(int i11) {
        this.f35428z.onResult(i11);
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void onResume(Activity activity) {
        if (activity != null) {
            HMSLog.i("HuaweiApiClientImpl", "onResume");
            this.f35411i = new WeakReference<>(activity);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HMSLog.i("HuaweiApiClientImpl", "HuaweiApiClientImpl Enter onServiceConnected.");
        a(2);
        this.f35408f = IAIDLInvoke.Stub.asInterface(iBinder);
        if (this.f35408f != null) {
            if (this.f35413k.get() == 5) {
                c(2);
                j();
                i();
                return;
            } else {
                if (this.f35413k.get() != 3) {
                    n();
                    return;
                }
                return;
            }
        }
        HMSLog.e("HuaweiApiClientImpl", "In onServiceConnected, mCoreService must not be null.");
        n();
        c(1);
        if (this.f35425w != null) {
            WeakReference<Activity> weakReference = this.f35410h;
            ConnectionResult connectionResult = new ConnectionResult(10, (weakReference == null || weakReference.get() == null) ? null : HuaweiApiAvailability.getInstance().getResolveErrorPendingIntent(this.f35410h.get(), 10));
            this.f35425w.onConnectionFailed(connectionResult);
            this.f35423u = connectionResult;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        HMSLog.i("HuaweiApiClientImpl", "Enter onServiceDisconnected.");
        this.f35408f = null;
        c(1);
        HuaweiApiClient.ConnectionCallbacks connectionCallbacks = this.f35424v;
        if (connectionCallbacks != null) {
            connectionCallbacks.onConnectionSuspended(1);
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void reconnect() {
        disconnect();
        connect((Activity) null);
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void removeConnectionFailureListener(HuaweiApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Checker.checkNonNull(onConnectionFailedListener, "onConnectionFailedListener should not be null");
        synchronized (this.f35420r) {
            try {
                if (this.f35425w != onConnectionFailedListener) {
                    HMSLog.w("HuaweiApiClientImpl", "unregisterConnectionFailedListener: this onConnectionFailedListener has not been registered");
                } else {
                    this.f35425w = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void removeConnectionSuccessListener(HuaweiApiClient.ConnectionCallbacks connectionCallbacks) {
        Checker.checkNonNull(connectionCallbacks, "connectionCallbacksListener should not be null");
        synchronized (this.f35420r) {
            try {
                if (this.f35424v != connectionCallbacks) {
                    HMSLog.w("HuaweiApiClientImpl", "unregisterConnectionCallback: this connectionCallbacksListener has not been registered");
                } else {
                    this.f35424v = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void resetListener() {
        this.f35428z = null;
    }

    public void setApiMap(Map<Api<?>, Api.ApiOptions> map) {
        this.f35416n = map;
    }

    public void setAutoLifecycleClientId(int i11) {
        this.f35403a = i11;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void setConnectionCallbacks(HuaweiApiClient.ConnectionCallbacks connectionCallbacks) {
        this.f35424v = connectionCallbacks;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void setConnectionFailedListener(HuaweiApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f35425w = onConnectionFailedListener;
    }

    public void setHasShowNotice(boolean z11) {
        this.f35412j = z11;
    }

    public void setPermissionInfos(List<PermissionInfo> list) {
        this.f35415m = list;
    }

    public void setScopes(List<Scope> list) {
        this.f35414l = list;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean setSubAppInfo(SubAppInfo subAppInfo) {
        HMSLog.i("HuaweiApiClientImpl", "Enter setSubAppInfo");
        if (subAppInfo == null) {
            HMSLog.e("HuaweiApiClientImpl", "subAppInfo is null");
            return false;
        }
        String subAppID = subAppInfo.getSubAppID();
        if (TextUtils.isEmpty(subAppID)) {
            HMSLog.e("HuaweiApiClientImpl", "subAppId is empty");
            return false;
        }
        if (subAppID.equals(TextUtils.isEmpty(this.f35405c) ? Util.getAppId(this.f35404b) : this.f35405c)) {
            HMSLog.e("HuaweiApiClientImpl", "subAppId is host appid");
            return false;
        }
        this.f35417o = new SubAppInfo(subAppInfo);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i11) {
        this.f35413k.set(i11);
        if (i11 == 1 || i11 == 3 || i11 == 2) {
            this.f35421s.lock();
            try {
                this.f35422t.signalAll();
            } finally {
                this.f35421s.unlock();
            }
        }
    }

    private void b(int i11) {
        PendingIntent pendingIntent;
        WeakReference<Activity> weakReference = this.f35410h;
        if (weakReference == null || weakReference.get() == null) {
            pendingIntent = null;
        } else {
            pendingIntent = HuaweiApiAvailability.getInstance().getResolveErrorPendingIntent(this.f35410h.get(), i11);
            HMSLog.i("HuaweiApiClientImpl", "connect 2.0 fail: " + i11);
        }
        ConnectionResult connectionResult = new ConnectionResult(i11, pendingIntent);
        this.f35425w.onConnectionFailed(connectionResult);
        this.f35423u = connectionResult;
    }

    private void a() {
        Intent intent = new Intent(HMSPackageManager.getInstance(this.f35404b).getServiceAction());
        HMSPackageManager.getInstance(this.f35404b).refreshForMultiService();
        try {
            String hMSPackageNameForMultiService = HMSPackageManager.getInstance(this.f35404b).getHMSPackageNameForMultiService();
            if (TextUtils.isEmpty(hMSPackageNameForMultiService)) {
                HMSLog.e("HuaweiApiClientImpl", "servicePackageName is empty, Service is invalid, bind core service fail.");
                c(1);
                b();
                return;
            }
            intent.setPackage(hMSPackageNameForMultiService);
            synchronized (A) {
                try {
                    if (this.f35404b.bindService(intent, this, 1)) {
                        h();
                        return;
                    }
                    c(1);
                    HMSLog.e("HuaweiApiClientImpl", "In connect, bind core service fail");
                    b();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (IllegalArgumentException unused) {
            HMSLog.e("HuaweiApiClientImpl", "IllegalArgumentException when bindCoreService intent.setPackage");
            c(1);
            HMSLog.e("HuaweiApiClientImpl", "In connect, bind core service fail");
            b();
        }
    }

    private ConnectInfo c() {
        String packageSignature = new PackageManagerHelper(this.f35404b).getPackageSignature(this.f35404b.getPackageName());
        if (packageSignature == null) {
            packageSignature = "";
        }
        SubAppInfo subAppInfo = this.f35417o;
        return new ConnectInfo(getApiNameList(), this.f35414l, packageSignature, subAppInfo == null ? null : subAppInfo.getSubAppID());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        n();
        if (this.f35425w != null) {
            int i11 = UIUtil.isBackground(this.f35404b) ? 7 : 6;
            WeakReference<Activity> weakReference = this.f35410h;
            ConnectionResult connectionResult = new ConnectionResult(i11, (weakReference == null || weakReference.get() == null) ? null : HuaweiApiAvailability.getInstance().getResolveErrorPendingIntent(this.f35410h.get(), i11));
            this.f35425w.onConnectionFailed(connectionResult);
            this.f35423u = connectionResult;
        }
    }

    private void c(ResolveResult<ConnectResp> resolveResult) {
        if (resolveResult.getValue() != null) {
            ProtocolNegotiate.getInstance().negotiate(resolveResult.getValue().protocolVersion);
        }
        c(3);
        this.f35423u = null;
        HuaweiApiClient.ConnectionCallbacks connectionCallbacks = this.f35424v;
        if (connectionCallbacks != null) {
            connectionCallbacks.onConnected();
        }
        if (this.f35410h != null) {
            m();
        }
        for (Map.Entry<Api<?>, Api.ApiOptions> entry : getApiMap().entrySet()) {
            if (entry.getKey().getmConnetctPostList() != null && !entry.getKey().getmConnetctPostList().isEmpty()) {
                HMSLog.i("HuaweiApiClientImpl", "Enter onConnectionResult, get the ConnetctPostList ");
                for (ConnectionPostProcessor connectionPostProcessor : entry.getKey().getmConnetctPostList()) {
                    HMSLog.i("HuaweiApiClientImpl", "Enter onConnectionResult, processor.run");
                    connectionPostProcessor.run(this, this.f35410h);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(ResolveResult<DisconnectResp> resolveResult) {
        HMSLog.i("HuaweiApiClientImpl", "Enter onDisconnectionResult, disconnect from server result: " + resolveResult.getStatus().getStatusCode());
        n();
        c(1);
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public ConnectionResult holdUpConnect(long j11, TimeUnit timeUnit) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.f35421s.lock();
            try {
                connect((Activity) null);
                long nanos = timeUnit.toNanos(j11);
                while (isConnecting()) {
                    if (nanos <= 0) {
                        disconnect();
                        return new ConnectionResult(14, (PendingIntent) null);
                    }
                    nanos = this.f35422t.awaitNanos(nanos);
                }
                if (isConnected()) {
                    this.f35423u = null;
                    return new ConnectionResult(0, (PendingIntent) null);
                }
                ConnectionResult connectionResult = this.f35423u;
                return connectionResult != null ? connectionResult : new ConnectionResult(13, (PendingIntent) null);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, (PendingIntent) null);
            } finally {
                this.f35421s.unlock();
            }
        }
        throw new IllegalStateException("blockingConnect must not be called on the UI thread");
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void connect(int i11) {
        connect((Activity) null);
    }

    private void a(int i11) {
        if (i11 == 2) {
            synchronized (A) {
                try {
                    Handler handler = this.f35426x;
                    if (handler != null) {
                        handler.removeMessages(i11);
                        this.f35426x = null;
                    }
                } finally {
                }
            }
        }
        if (i11 == 3) {
            synchronized (B) {
                try {
                    Handler handler2 = this.f35427y;
                    if (handler2 != null) {
                        handler2.removeMessages(i11);
                        this.f35427y = null;
                    }
                } finally {
                }
            }
        }
        synchronized (A) {
            try {
                Handler handler3 = this.f35426x;
                if (handler3 != null) {
                    handler3.removeMessages(2);
                    this.f35426x = null;
                }
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ResolveResult<ConnectResp> resolveResult) {
        HMSLog.i("HuaweiApiClientImpl", "Enter onConnectionResult");
        if (this.f35408f != null && this.f35413k.get() == 2) {
            a(3);
            ConnectResp value = resolveResult.getValue();
            if (value != null) {
                this.f35409g = value.sessionId;
            }
            SubAppInfo subAppInfo = this.f35417o;
            PendingIntent pendingIntent = null;
            String subAppID = subAppInfo == null ? null : subAppInfo.getSubAppID();
            if (!TextUtils.isEmpty(subAppID)) {
                this.f35406d = subAppID;
            }
            int statusCode = resolveResult.getStatus().getStatusCode();
            HMSLog.i("HuaweiApiClientImpl", "Enter onConnectionResult, connect to server result: " + statusCode);
            if (Status.SUCCESS.equals(resolveResult.getStatus())) {
                c(resolveResult);
                return;
            }
            if (resolveResult.getStatus() != null && resolveResult.getStatus().getStatusCode() == 1001) {
                n();
                c(1);
                HuaweiApiClient.ConnectionCallbacks connectionCallbacks = this.f35424v;
                if (connectionCallbacks != null) {
                    connectionCallbacks.onConnectionSuspended(3);
                    return;
                }
                return;
            }
            n();
            c(1);
            if (this.f35425w != null) {
                WeakReference<Activity> weakReference = this.f35410h;
                if (weakReference != null && weakReference.get() != null) {
                    pendingIntent = HuaweiApiAvailability.getInstance().getResolveErrorPendingIntent(this.f35410h.get(), statusCode);
                }
                ConnectionResult connectionResult = new ConnectionResult(statusCode, pendingIntent);
                this.f35425w.onConnectionFailed(connectionResult);
                this.f35423u = connectionResult;
                return;
            }
            return;
        }
        HMSLog.e("HuaweiApiClientImpl", "Invalid onConnectionResult");
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void print(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
