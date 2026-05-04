package com.huawei.hms.common;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.hms.adapter.AvailableUtil;
import com.huawei.hms.adapter.BinderAdapter;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.Api.ApiOptions;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.common.internal.BindResolveClients;
import com.huawei.hms.common.internal.ClientSettings;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.RequestHeader;
import com.huawei.hms.common.internal.RequestManager;
import com.huawei.hms.common.internal.ResolveClientBean;
import com.huawei.hms.common.internal.ResponseHeader;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.common.internal.TaskApiCallWrapper;
import com.huawei.hms.common.internal.TransactionIdCreater;
import com.huawei.hms.core.aidl.IAIDLInvoke;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsInnerClient;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSBIInitializer;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.Util;
import fr.k;
import fr.l;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class HuaweiApi<TOption extends Api.ApiOptions> {

    /* renamed from: a, reason: collision with root package name */
    private Context f35489a;

    /* renamed from: b, reason: collision with root package name */
    private TOption f35490b;

    /* renamed from: c, reason: collision with root package name */
    private Context f35491c;

    /* renamed from: d, reason: collision with root package name */
    private AbstractClientBuilder<?, TOption> f35492d;

    /* renamed from: e, reason: collision with root package name */
    private String f35493e;

    /* renamed from: f, reason: collision with root package name */
    private String f35494f;

    /* renamed from: g, reason: collision with root package name */
    private SubAppInfo f35495g;

    /* renamed from: h, reason: collision with root package name */
    private WeakReference<Activity> f35496h;

    /* renamed from: i, reason: collision with root package name */
    private int f35497i;

    /* renamed from: j, reason: collision with root package name */
    private int f35498j = 1;

    /* renamed from: k, reason: collision with root package name */
    private boolean f35499k = false;

    /* renamed from: l, reason: collision with root package name */
    private String f35500l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f35501m;

    /* renamed from: n, reason: collision with root package name */
    private RequestManager f35502n;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RequestHandler<OptionsT extends Api.ApiOptions> implements BaseHmsClient.ConnectionCallbacks, BaseHmsClient.OnConnectionFailedListener {

        /* renamed from: b, reason: collision with root package name */
        private final AnyClient f35507b;

        /* renamed from: d, reason: collision with root package name */
        private final HuaweiApi<OptionsT> f35509d;

        /* renamed from: e, reason: collision with root package name */
        private ResolveClientBean f35510e;
        public final Queue<TaskApiCallbackWrapper> callbackWaitQueue = new LinkedList();

        /* renamed from: a, reason: collision with root package name */
        private final Queue<TaskApiCallbackWrapper> f35506a = new LinkedList();

        /* renamed from: c, reason: collision with root package name */
        private ConnectionResult f35508c = null;

        public RequestHandler(HuaweiApi<OptionsT> huaweiApi) {
            this.f35509d = huaweiApi;
            this.f35507b = huaweiApi.getClient(RequestManager.getHandler().getLooper(), this);
        }

        public AnyClient getClient() {
            return this.f35507b;
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.ConnectionCallbacks
        public void onConnected() {
            HMSLog.i("HuaweiApi", "onConnected");
            BindResolveClients.getInstance().unRegister(this.f35510e);
            this.f35510e = null;
            RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.4
                @Override // java.lang.Runnable
                public void run() {
                    RequestHandler.this.b();
                }
            });
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.OnConnectionFailedListener
        public void onConnectionFailed(final ConnectionResult connectionResult) {
            HMSLog.i("HuaweiApi", "onConnectionFailed");
            BindResolveClients.getInstance().unRegister(this.f35510e);
            this.f35510e = null;
            RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.3
                @Override // java.lang.Runnable
                public void run() {
                    RequestHandler.this.b(connectionResult);
                }
            });
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.ConnectionCallbacks
        public void onConnectionSuspended(int i11) {
            HMSLog.i("HuaweiApi", "onConnectionSuspended");
            BindResolveClients.getInstance().unRegister(this.f35510e);
            this.f35510e = null;
            RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.5
                @Override // java.lang.Runnable
                public void run() {
                    RequestHandler.this.c();
                }
            });
        }

        public void postMessage(final TaskApiCallbackWrapper taskApiCallbackWrapper) {
            RequestManager.addToConnectedReqMap(taskApiCallbackWrapper.a().getTaskApiCall().getTransactionId(), this);
            this.f35506a.add(taskApiCallbackWrapper);
            String uri = taskApiCallbackWrapper.a().getTaskApiCall().getUri();
            String packageName = (((HuaweiApi) this.f35509d).f35491c == null ? this.f35509d.getContext() : ((HuaweiApi) this.f35509d).f35491c).getPackageName();
            if (((HuaweiApi) this.f35509d).f35491c != null) {
                HuaweiApi<OptionsT> huaweiApi = this.f35509d;
                huaweiApi.b(((HuaweiApi) huaweiApi).f35491c);
            }
            final RequestHeader requestHeader = new RequestHeader();
            requestHeader.setSrvName(uri.split("\\.")[0]);
            requestHeader.setApiName(uri);
            requestHeader.setAppID(this.f35509d.getAppID() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.f35509d.getSubAppID());
            requestHeader.setPkgName(packageName);
            requestHeader.setSessionId(this.f35507b.getSessionId());
            TaskApiCall taskApiCall = taskApiCallbackWrapper.a().getTaskApiCall();
            requestHeader.setTransactionId(a(taskApiCall.getTransactionId(), uri));
            requestHeader.setParcelable(taskApiCall.getParcelable());
            requestHeader.setKitSdkVersion(this.f35509d.getKitSdkVersion());
            requestHeader.setApiLevel(Math.max(this.f35509d.getApiLevel(), taskApiCall.getApiLevel()));
            this.f35507b.post(requestHeader, taskApiCall.getRequestJson(), new AnyClient.CallBack() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.2
                @Override // com.huawei.hms.common.internal.AnyClient.CallBack
                public void onCallback(IMessageEntity iMessageEntity, String str) {
                    AnyClient.CallBack b11 = taskApiCallbackWrapper.b();
                    if (b11 != null) {
                        b11.onCallback(iMessageEntity, str);
                    }
                    RequestManager.removeReqByTransId(requestHeader.getTransactionId());
                    RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            RequestHandler.this.f35506a.remove(taskApiCallbackWrapper);
                        }
                    });
                }
            });
        }

        private TaskApiCallbackWrapper b(final TaskApiCallWrapper taskApiCallWrapper) {
            return new TaskApiCallbackWrapper(taskApiCallWrapper, new AnyClient.CallBack() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.1

                /* renamed from: a, reason: collision with root package name */
                private AtomicBoolean f35511a = new AtomicBoolean(true);

                @Override // com.huawei.hms.common.internal.AnyClient.CallBack
                public void onCallback(IMessageEntity iMessageEntity, String str) {
                    if (!(iMessageEntity instanceof ResponseHeader)) {
                        HMSLog.e("HuaweiApi", "header is not instance of ResponseHeader");
                        return;
                    }
                    ResponseHeader responseHeader = (ResponseHeader) iMessageEntity;
                    if (responseHeader.getErrorCode() == 11) {
                        RequestHandler.this.a();
                        HMSLog.i("HuaweiApi", "unbind service");
                    }
                    if (!TextUtils.isEmpty(responseHeader.getResolution())) {
                        HMSLog.e("HuaweiApi", "Response has resolution: " + responseHeader.getResolution());
                    }
                    if (this.f35511a.compareAndSet(true, false)) {
                        HiAnalyticsInnerClient.reportEntryExit(RequestHandler.this.f35509d.getContext(), responseHeader, String.valueOf(RequestHandler.this.f35509d.getKitSdkVersion()));
                    }
                    taskApiCallWrapper.getTaskApiCall().onResponse(RequestHandler.this.f35507b, responseHeader, str, taskApiCallWrapper.getTaskCompletionSource());
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            HMSLog.i("HuaweiApi", "wait queue size = " + this.callbackWaitQueue.size());
            HMSLog.i("HuaweiApi", "run queue size = " + this.f35506a.size());
            Iterator<TaskApiCallbackWrapper> it = this.callbackWaitQueue.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            Iterator<TaskApiCallbackWrapper> it2 = this.f35506a.iterator();
            while (it2.hasNext()) {
                a(it2.next());
            }
            this.callbackWaitQueue.clear();
            this.f35506a.clear();
            this.f35508c = null;
            this.f35507b.disconnect();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(ConnectionResult connectionResult) {
            this.f35508c = connectionResult;
            Iterator<TaskApiCallbackWrapper> it = this.callbackWaitQueue.iterator();
            boolean z11 = true;
            while (it.hasNext()) {
                TaskApiCallWrapper a11 = it.next().a();
                ResponseHeader responseHeader = new ResponseHeader(1, CommonCode.ErrorCode.CLIENT_API_INVALID, "Connection Failed:" + a(connectionResult) + j.f81006c + connectionResult.getErrorCode() + j.f81007d);
                responseHeader.setTransactionId(a11.getTaskApiCall().getTransactionId());
                HiAnalyticsInnerClient.reportEntryExit(this.f35509d.getContext(), responseHeader, String.valueOf(this.f35509d.getKitSdkVersion()));
                if (this.f35508c.getResolution() != null && z11) {
                    responseHeader.setParcelable(this.f35508c.getResolution());
                    if (Util.isAvailableLibExist(this.f35509d.getContext()) && this.f35508c.getErrorCode() == 26) {
                        responseHeader.setResolution(CommonCode.Resolution.HAS_RESOLUTION);
                    }
                    z11 = false;
                }
                int errorCode = this.f35508c.getErrorCode();
                if (errorCode == 30 || errorCode == 31) {
                    responseHeader.setErrorCode(errorCode);
                }
                a11.getTaskApiCall().onResponse(this.f35507b, responseHeader, null, a11.getTaskCompletionSource());
            }
            this.callbackWaitQueue.clear();
            this.f35506a.clear();
            this.f35508c = null;
            this.f35507b.disconnect();
        }

        public void a(TaskApiCallWrapper taskApiCallWrapper) {
            HMSLog.i("HuaweiApi", "sendRequest");
            TaskApiCallbackWrapper b11 = b(taskApiCallWrapper);
            if (HMSPackageManager.getInstance(this.f35509d.getContext()).isUpdateHmsForThirdPartyDevice()) {
                this.f35507b.disconnect();
            }
            int hmsVersionCode = HMSPackageManager.getInstance(((HuaweiApi) this.f35509d).f35489a).getHmsVersionCode();
            if (hmsVersionCode < 40000000 && hmsVersionCode > 0 && this.f35507b.isConnected() && !((HuaweiApi) this.f35509d).f35501m && ((BaseHmsClient) this.f35507b).getAdapter().getServiceAction().equals("com.huawei.hms.core.aidlservice")) {
                int requestHmsVersionCode = this.f35507b.getRequestHmsVersionCode();
                if (requestHmsVersionCode <= taskApiCallWrapper.getTaskApiCall().getMinApkVersion()) {
                    requestHmsVersionCode = taskApiCallWrapper.getTaskApiCall().getMinApkVersion();
                }
                if (requestHmsVersionCode > hmsVersionCode) {
                    this.f35507b.disconnect();
                }
            }
            if (this.f35507b.isConnected()) {
                HMSLog.i("HuaweiApi", "isConnected:true.");
                BinderAdapter adapter = ((BaseHmsClient) this.f35507b).getAdapter();
                adapter.updateDelayTask();
                ((HmsClient) this.f35507b).setService(IAIDLInvoke.Stub.asInterface(adapter.getServiceBinder()));
                postMessage(b11);
                return;
            }
            HMSLog.i("HuaweiApi", "isConnected:false.");
            this.callbackWaitQueue.add(b11);
            ConnectionResult connectionResult = this.f35508c;
            if (connectionResult != null && connectionResult.getErrorCode() != 0) {
                HMSLog.i("HuaweiApi", "onConnectionFailed, ErrorCode:" + this.f35508c.getErrorCode());
                onConnectionFailed(this.f35508c);
                return;
            }
            RequestManager.addRequestToQueue(this);
            Object obj = this.f35507b;
            if (obj instanceof BaseHmsClient) {
                ((BaseHmsClient) obj).setInternalRequest(this);
            }
            a(taskApiCallWrapper.getTaskApiCall().getMinApkVersion(), b11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            this.f35508c = null;
            this.f35506a.clear();
            Iterator<TaskApiCallbackWrapper> it = this.callbackWaitQueue.iterator();
            while (it.hasNext()) {
                postMessage(it.next());
            }
            this.callbackWaitQueue.clear();
        }

        private String a(String str, String str2) {
            return TextUtils.isEmpty(str) ? TransactionIdCreater.getId(this.f35509d.getAppID(), str2) : str;
        }

        public synchronized void a(int i11, TaskApiCallbackWrapper taskApiCallbackWrapper) {
            if (this.f35507b.isConnected()) {
                HMSLog.d("HuaweiApi", "client is connected");
                return;
            }
            if (this.f35507b.isConnecting()) {
                HMSLog.d("HuaweiApi", "client is isConnecting");
                return;
            }
            if (this.f35509d.getActivity() != null) {
                if (this.f35510e == null) {
                    this.f35510e = new ResolveClientBean(this.f35507b, i11);
                }
                if (BindResolveClients.getInstance().isClientRegistered(this.f35510e)) {
                    HMSLog.i("HuaweiApi", "mResolveClientBean has already register, return!");
                    return;
                }
                BindResolveClients.getInstance().register(this.f35510e);
            }
            this.f35507b.connect(i11);
        }

        public void a() {
            this.f35507b.disconnect();
        }

        private void a(TaskApiCallbackWrapper taskApiCallbackWrapper) {
            TaskApiCallWrapper a11 = taskApiCallbackWrapper.a();
            ResponseHeader responseHeader = new ResponseHeader(1, CommonCode.ErrorCode.CLIENT_API_INVALID, "Connection Suspended");
            responseHeader.setTransactionId(a11.getTaskApiCall().getTransactionId());
            a11.getTaskApiCall().onResponse(this.f35507b, responseHeader, null, a11.getTaskCompletionSource());
        }

        private String a(ConnectionResult connectionResult) {
            if (Util.isAvailableLibExist(this.f35509d.getContext())) {
                int errorCode = connectionResult.getErrorCode();
                if (errorCode == -1) {
                    return "get update result, but has other error codes";
                }
                if (errorCode == 3) {
                    return "HuaWei Mobile Service is disabled";
                }
                if (errorCode == 8) {
                    return "internal error";
                }
                if (errorCode == 10) {
                    return "application configuration error, please developer check configuration";
                }
                if (errorCode == 13) {
                    return "update cancelled";
                }
                if (errorCode != 21) {
                    switch (errorCode) {
                        case 25:
                            return "failed to get update result";
                        case 26:
                            return "update failed, because no activity incoming, can't pop update page";
                        case 27:
                            return "there is already an update popup at the front desk, but it hasn't been clicked or it is not effective for a while";
                        default:
                            return "unknown errorReason";
                    }
                }
                return "device is too old to be support";
            }
            int errorCode2 = connectionResult.getErrorCode();
            return errorCode2 != -1 ? errorCode2 != 8 ? errorCode2 != 10 ? "unknown errorReason" : "application configuration error, please developer check configuration" : "internal error" : "get update result, but has other error codes";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TaskApiCallbackWrapper {

        /* renamed from: a, reason: collision with root package name */
        private final TaskApiCallWrapper f35522a;

        /* renamed from: b, reason: collision with root package name */
        private final AnyClient.CallBack f35523b;

        public TaskApiCallbackWrapper(TaskApiCallWrapper taskApiCallWrapper, AnyClient.CallBack callBack) {
            this.f35522a = taskApiCallWrapper;
            this.f35523b = callBack;
        }

        public TaskApiCallWrapper a() {
            return this.f35522a;
        }

        public AnyClient.CallBack b() {
            return this.f35523b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<OptionsT extends Api.ApiOptions> implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final HuaweiApi<OptionsT> f35524a;

        /* renamed from: b, reason: collision with root package name */
        private final TaskApiCallWrapper f35525b;

        public a(HuaweiApi<OptionsT> huaweiApi, TaskApiCallWrapper taskApiCallWrapper) {
            this.f35524a = huaweiApi;
            this.f35525b = taskApiCallWrapper;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0056 A[ADDED_TO_REGION] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void a(com.huawei.hms.common.HuaweiApi.RequestHandler r8, java.lang.Throwable r9) {
            /*
                r7 = this;
                java.lang.String r0 = "HuaweiApi"
                r1 = 0
                com.huawei.hms.common.internal.AnyClient r8 = r8.getClient()     // Catch: java.lang.Throwable -> L36
                com.huawei.hms.common.internal.ResponseHeader r2 = new com.huawei.hms.common.internal.ResponseHeader     // Catch: java.lang.Throwable -> L33
                java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Throwable -> L33
                r3 = 1
                r4 = 907135001(0x3611c819, float:2.1723156E-6)
                r2.<init>(r3, r4, r9)     // Catch: java.lang.Throwable -> L33
                org.json.JSONObject r9 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2f
                r9.<init>()     // Catch: java.lang.Throwable -> L2f
                java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L2f
                com.huawei.hms.common.internal.TaskApiCallWrapper r3 = r7.f35525b     // Catch: java.lang.Throwable -> L2c
                fr.l r3 = r3.getTaskCompletionSource()     // Catch: java.lang.Throwable -> L2c
                com.huawei.hms.common.internal.TaskApiCallWrapper r4 = r7.f35525b     // Catch: java.lang.Throwable -> L2a
                com.huawei.hms.common.internal.TaskApiCall r1 = r4.getTaskApiCall()     // Catch: java.lang.Throwable -> L2a
                goto L54
            L2a:
                r4 = move-exception
                goto L3c
            L2c:
                r4 = move-exception
                r3 = r1
                goto L3c
            L2f:
                r4 = move-exception
                r9 = r1
                r3 = r9
                goto L3c
            L33:
                r9 = move-exception
                r4 = r9
                goto L39
            L36:
                r8 = move-exception
                r4 = r8
                r8 = r1
            L39:
                r9 = r1
                r2 = r9
                r3 = r2
            L3c:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "<notifyCpException> "
                r5.append(r6)
                java.lang.String r4 = r4.getMessage()
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                com.huawei.hms.support.log.HMSLog.e(r0, r4)
            L54:
                if (r8 == 0) goto L62
                if (r2 == 0) goto L62
                if (r9 == 0) goto L62
                if (r3 == 0) goto L62
                if (r1 == 0) goto L62
                r1.onResponse(r8, r2, r9, r3)
                goto L67
            L62:
                java.lang.String r8 = "<notifyCpException> isNotify is false, Can not notify CP."
                com.huawei.hms.support.log.HMSLog.e(r0, r8)
            L67:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.common.HuaweiApi.a.a(com.huawei.hms.common.HuaweiApi$RequestHandler, java.lang.Throwable):void");
        }

        @Override // java.lang.Runnable
        public void run() {
            RequestHandler requestHandler = new RequestHandler(this.f35524a);
            try {
                requestHandler.a(this.f35525b);
            } catch (Throwable th2) {
                HMSLog.e("HuaweiApi", "sendRequest has exception", th2);
                a(requestHandler, th2);
            }
        }
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i11) {
        Checker.checkNonNull(activity, "Null activity is not permitted.");
        this.f35496h = new WeakReference<>(activity);
        a(activity, api, toption, abstractClientBuilder, i11, null);
    }

    @Deprecated
    public k<Boolean> disconnectService() {
        final l lVar = new l();
        RequestManager.getInstance();
        RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.1
            @Override // java.lang.Runnable
            public void run() {
                HuaweiApi.this.a((HuaweiApi<?>) this, (l<Boolean>) lVar);
            }
        });
        return lVar.b();
    }

    public <TResult, TClient extends AnyClient> k<TResult> doWrite(TaskApiCall<TClient, TResult> taskApiCall) {
        this.f35499k = true;
        if (taskApiCall == null) {
            HMSLog.e("HuaweiApi", "in doWrite:taskApiCall is null");
            l lVar = new l();
            lVar.c(new ApiException(Status.FAILURE));
            return lVar.b();
        }
        HiAnalyticsInnerClient.reportEntryClient(this.f35489a, taskApiCall.getUri(), TextUtils.isEmpty(this.f35495g.getSubAppID()) ? this.f35494f : this.f35495g.getSubAppID(), taskApiCall.getTransactionId(), String.valueOf(getKitSdkVersion()));
        if (this.f35502n == null) {
            this.f35502n = RequestManager.getInstance();
        }
        return a(taskApiCall);
    }

    public Activity getActivity() {
        WeakReference<Activity> weakReference = this.f35496h;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int getApiLevel() {
        return this.f35498j;
    }

    public String getAppID() {
        return this.f35494f;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.huawei.hms.common.internal.AnyClient] */
    public AnyClient getClient(Looper looper, RequestHandler requestHandler) {
        return this.f35492d.buildClient(this.f35489a, getClientSetting(), requestHandler, requestHandler);
    }

    public ClientSettings getClientSetting() {
        ClientSettings clientSettings = new ClientSettings(this.f35489a.getPackageName(), this.f35489a.getClass().getName(), getScopes(), this.f35493e, null, this.f35495g);
        if (!this.f35501m) {
            String hMSPackageNameForMultiService = HMSPackageManager.getInstance(this.f35489a).getHMSPackageNameForMultiService();
            if (TextUtils.isEmpty(hMSPackageNameForMultiService)) {
                hMSPackageNameForMultiService = "com.huawei.hwid";
            }
            this.f35500l = hMSPackageNameForMultiService;
            HMSLog.i("HuaweiApi", "No setInnerHms, hms pkg name is " + this.f35500l);
        }
        clientSettings.setInnerHmsPkg(this.f35500l);
        clientSettings.setUseInnerHms(this.f35501m);
        WeakReference<Activity> weakReference = this.f35496h;
        if (weakReference != null) {
            clientSettings.setCpActivity(weakReference.get());
        }
        return clientSettings;
    }

    public Context getContext() {
        return this.f35489a;
    }

    public int getKitSdkVersion() {
        return this.f35497i;
    }

    public TOption getOption() {
        return this.f35490b;
    }

    public List<Scope> getScopes() {
        return Collections.EMPTY_LIST;
    }

    public String getSubAppID() {
        return this.f35495g.getSubAppID();
    }

    public void setApiLevel(int i11) {
        this.f35498j = i11;
    }

    public void setHostContext(Context context) {
        this.f35491c = context;
    }

    public void setInnerHms() {
        this.f35500l = this.f35489a.getPackageName();
        this.f35501m = true;
        HMSLog.i("HuaweiApi", "<setInnerHms> init inner hms pkg info:" + this.f35500l);
    }

    public void setKitSdkVersion(int i11) {
        this.f35497i = i11;
    }

    public void setSubAppId(String str) throws ApiException {
        if (!setSubAppInfo(new SubAppInfo(str))) {
            throw new ApiException(Status.FAILURE);
        }
    }

    @Deprecated
    public boolean setSubAppInfo(SubAppInfo subAppInfo) {
        HMSLog.i("HuaweiApi", "Enter setSubAppInfo");
        SubAppInfo subAppInfo2 = this.f35495g;
        if (subAppInfo2 != null && !TextUtils.isEmpty(subAppInfo2.getSubAppID())) {
            HMSLog.e("HuaweiApi", "subAppInfo is already set");
            return false;
        }
        if (subAppInfo == null) {
            HMSLog.e("HuaweiApi", "subAppInfo is null");
            return false;
        }
        String subAppID = subAppInfo.getSubAppID();
        if (TextUtils.isEmpty(subAppID)) {
            HMSLog.e("HuaweiApi", "subAppId is empty");
            return false;
        }
        if (subAppID.equals(this.f35493e)) {
            HMSLog.e("HuaweiApi", "subAppId is host appid");
            return false;
        }
        if (this.f35499k) {
            HMSLog.e("HuaweiApi", "Client has sent request to Huawei Mobile Services, setting subAppId is not allowed");
            return false;
        }
        this.f35495g = new SubAppInfo(subAppInfo);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context) {
        String appId = Util.getAppId(context);
        this.f35493e = appId;
        this.f35494f = appId;
    }

    private void a(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i11, String str) {
        this.f35489a = context.getApplicationContext();
        this.f35490b = toption;
        this.f35492d = abstractClientBuilder;
        b(context);
        this.f35495g = new SubAppInfo("");
        this.f35497i = i11;
        if (!TextUtils.isEmpty(str)) {
            if (str.equals(this.f35493e)) {
                HMSLog.e("HuaweiApi", "subAppId is host appid");
            } else {
                HMSLog.i("HuaweiApi", "subAppId is " + str);
                this.f35495g = new SubAppInfo(str);
            }
        }
        a(context);
        if (Util.isAvailableLibExist(context)) {
            AvailableUtil.asyncCheckHmsUpdateInfo(context);
        }
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i11, String str) {
        Checker.checkNonNull(activity, "Null activity is not permitted.");
        this.f35496h = new WeakReference<>(activity);
        a(activity, api, toption, abstractClientBuilder, i11, str);
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder) {
        Checker.checkNonNull(activity, "Null activity is not permitted.");
        this.f35496h = new WeakReference<>(activity);
        a(activity, api, toption, abstractClientBuilder, 0, null);
    }

    private void a(Context context) {
        HMSBIInitializer.getInstance(context).initBI();
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i11) {
        Checker.checkNonNull(context, "Null context is not permitted.");
        a(context, api, toption, abstractClientBuilder, i11, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(HuaweiApi<?> huaweiApi, l<Boolean> lVar) {
        HMSLog.i("HuaweiApi", "innerDisconnect.");
        try {
            huaweiApi.getClient(RequestManager.getHandler().getLooper(), null).disconnect();
            lVar.d(Boolean.TRUE);
        } catch (Exception e11) {
            HMSLog.w("HuaweiApi", "disconnect the binder failed for:" + e11.getMessage());
        }
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i11, String str) {
        Checker.checkNonNull(context, "Null context is not permitted.");
        a(context, api, toption, abstractClientBuilder, i11, str);
    }

    private <TResult, TClient extends AnyClient> k<TResult> a(TaskApiCall<TClient, TResult> taskApiCall) {
        l lVar;
        if (taskApiCall.getToken() == null) {
            lVar = new l();
        } else {
            lVar = new l(taskApiCall.getToken());
        }
        RequestManager.getHandler().post(new a(this, new TaskApiCallWrapper(taskApiCall, lVar)));
        return lVar.b();
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder) {
        Checker.checkNonNull(context, "Null context is not permitted.");
        a(context, api, toption, abstractClientBuilder, 0, null);
    }
}
