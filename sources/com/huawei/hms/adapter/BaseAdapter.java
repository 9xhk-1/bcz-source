package com.huawei.hms.adapter;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.adapter.AvailableAdapter;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.adapter.sysobs.ApkResolutionFailedManager;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.adapter.sysobs.SystemObserver;
import com.huawei.hms.adapter.ui.BaseResolutionAdapter;
import com.huawei.hms.adapter.ui.UpdateAdapter;
import com.huawei.hms.common.internal.RequestHeader;
import com.huawei.hms.common.internal.ResponseHeader;
import com.huawei.hms.common.internal.ResponseWrap;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.hms.support.api.PendingResultImpl;
import com.huawei.hms.support.api.ResolveResult;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtil;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.kpms.KpmsConstant;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.IntentUtil;
import com.huawei.hms.utils.JsonUtil;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.ResolutionFlagUtil;
import com.huawei.hms.utils.Util;
import java.lang.ref.WeakReference;
import java.sql.Timestamp;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import ma.b;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<ApiClient> f35273a;

    /* renamed from: b, reason: collision with root package name */
    private WeakReference<Activity> f35274b;

    /* renamed from: c, reason: collision with root package name */
    private BaseCallBack f35275c;

    /* renamed from: d, reason: collision with root package name */
    private String f35276d;

    /* renamed from: e, reason: collision with root package name */
    private String f35277e;

    /* renamed from: f, reason: collision with root package name */
    private Parcelable f35278f;

    /* renamed from: g, reason: collision with root package name */
    private BaseCallBack f35279g;

    /* renamed from: h, reason: collision with root package name */
    private String f35280h;

    /* renamed from: i, reason: collision with root package name */
    private Context f35281i;

    /* renamed from: j, reason: collision with root package name */
    private RequestHeader f35282j = new RequestHeader();

    /* renamed from: k, reason: collision with root package name */
    private ResponseHeader f35283k = new ResponseHeader();

    /* renamed from: l, reason: collision with root package name */
    private SystemObserver f35284l;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface BaseCallBack {
        void onComplete(String str, String str2, Parcelable parcelable);

        void onError(String str);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class BaseRequestResultCallback implements ResultCallback<ResolveResult<CoreBaseResponse>> {

        /* renamed from: a, reason: collision with root package name */
        private AtomicBoolean f35288a = new AtomicBoolean(true);

        public BaseRequestResultCallback() {
        }

        private void a(String str, BaseCallBack baseCallBack, CoreBaseResponse coreBaseResponse, int i11) {
            if (!"intent".equals(str)) {
                if (!"installHMS".equals(str)) {
                    BaseAdapter.this.a(baseCallBack, coreBaseResponse);
                    return;
                } else {
                    HMSLog.i("BaseAdapter", "has resolutin: installHMS");
                    a(baseCallBack, coreBaseResponse);
                    return;
                }
            }
            Activity c11 = BaseAdapter.this.c();
            HMSLog.i("BaseAdapter", "activity is: " + c11);
            if (c11 == null || c11.isFinishing()) {
                HMSLog.e("BaseAdapter", "activity null");
                BaseAdapter.this.a(baseCallBack, coreBaseResponse);
                return;
            }
            PendingIntent pendingIntent = coreBaseResponse.getPendingIntent();
            if (pendingIntent != null) {
                if (Util.isAvailableLibExist(BaseAdapter.this.f35281i)) {
                    BaseAdapter.this.a(c11, pendingIntent, coreBaseResponse);
                    return;
                } else {
                    baseCallBack.onError(BaseAdapter.this.b(-9));
                    return;
                }
            }
            Intent intent = coreBaseResponse.getIntent();
            if (intent != null) {
                if (Util.isAvailableLibExist(BaseAdapter.this.f35281i)) {
                    BaseAdapter.this.a(c11, intent, coreBaseResponse);
                    return;
                } else {
                    baseCallBack.onError(BaseAdapter.this.b(-9));
                    return;
                }
            }
            if (i11 == 2) {
                BaseAdapter baseAdapter = BaseAdapter.this;
                baseCallBack.onError(baseAdapter.b(baseAdapter.f35283k.getErrorCode()));
            } else {
                HMSLog.e("BaseAdapter", "hasResolution is true but NO_SOLUTION");
                baseCallBack.onError(BaseAdapter.this.b(-4));
            }
        }

        @Override // com.huawei.hms.support.api.client.ResultCallback
        public void onResult(ResolveResult<CoreBaseResponse> resolveResult) {
            HMSLog.i("BaseAdapter", "BaseRequestResultCallback onResult");
            BaseCallBack b11 = BaseAdapter.this.b();
            if (b11 == null) {
                HMSLog.e("BaseAdapter", "onResult baseCallBack null");
                return;
            }
            if (resolveResult == null) {
                HMSLog.e("BaseAdapter", "result null");
                b11.onError(BaseAdapter.this.b(-1));
                return;
            }
            CoreBaseResponse value = resolveResult.getValue();
            if (value == null) {
                HMSLog.e("BaseAdapter", "response null");
                b11.onError(BaseAdapter.this.b(-1));
                return;
            }
            if (TextUtils.isEmpty(value.getJsonHeader())) {
                HMSLog.e("BaseAdapter", "jsonHeader null");
                b11.onError(BaseAdapter.this.b(-1));
                return;
            }
            JsonUtil.jsonToEntity(value.getJsonHeader(), BaseAdapter.this.f35283k);
            if (this.f35288a.compareAndSet(true, false)) {
                BaseAdapter baseAdapter = BaseAdapter.this;
                baseAdapter.a(baseAdapter.f35281i, BaseAdapter.this.f35283k);
            }
            String resolution = BaseAdapter.this.f35283k.getResolution();
            int statusCode = BaseAdapter.this.f35283k.getStatusCode();
            HMSLog.i("BaseAdapter", "api is: " + BaseAdapter.this.f35283k.getApiName() + ", resolution: " + resolution + ", status_code: " + statusCode);
            a(resolution, b11, value, statusCode);
        }

        private void a(final BaseCallBack baseCallBack, CoreBaseResponse coreBaseResponse) {
            if (!BaseAdapter.this.h()) {
                if (Util.isAvailableLibExist(BaseAdapter.this.f35281i)) {
                    Activity c11 = BaseAdapter.this.c();
                    if (c11 != null && !c11.isFinishing()) {
                        HMSLog.i("BaseAdapter", "start handleSolutionForHMS");
                        AvailableAdapter availableAdapter = new AvailableAdapter(ExceptionCode.CRASH_EXCEPTION);
                        availableAdapter.setCalledBySolutionInstallHms(true);
                        availableAdapter.startResolution(c11, new AvailableAdapter.AvailableCallBack() { // from class: com.huawei.hms.adapter.BaseAdapter.BaseRequestResultCallback.1
                            @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
                            public void onComplete(int i11) {
                                HMSLog.i("BaseAdapter", "complete handleSolutionForHMS, result: " + i11);
                                if (i11 == 0) {
                                    BaseAdapter.this.a(baseCallBack);
                                    return;
                                }
                                BaseAdapter baseAdapter = BaseAdapter.this;
                                baseCallBack.onError(baseAdapter.a(i11, baseAdapter.a(i11)).toJson());
                            }
                        });
                        return;
                    }
                    HMSLog.e("BaseAdapter", "activity is null");
                    try {
                        if (BaseAdapter.this.f35281i != null && AvailableUtil.isInstallerLibExist(BaseAdapter.this.f35281i)) {
                            HMSLog.i("BaseAdapter", "pass installHMS intent");
                            Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(BaseAdapter.this.f35281i, UpdateAdapter.class.getName());
                            intentStartBridgeActivity.putExtra(CommonCode.MapKey.UPDATE_VERSION, ExceptionCode.CRASH_EXCEPTION);
                            intentStartBridgeActivity.putExtra("installHMS", "installHMS");
                            coreBaseResponse.setIntent(intentStartBridgeActivity);
                            BaseAdapter.this.a(baseCallBack, coreBaseResponse);
                            return;
                        }
                        HMSLog.i("BaseAdapter", "pass ACTIVITY_NULL error");
                        BaseAdapter baseAdapter = BaseAdapter.this;
                        baseCallBack.onError(baseAdapter.a(-3, baseAdapter.a(-3)).toJson());
                        return;
                    } catch (RuntimeException unused) {
                        HMSLog.e("BaseAdapter", "handleSolutionForHms pass result failed");
                        return;
                    }
                }
                HMSLog.i("BaseAdapter", "handleSolutionForHms: no Available lib exist");
                baseCallBack.onError(BaseAdapter.this.b(-9));
                return;
            }
            HMSLog.i("BaseAdapter", "HMS Core exists, need to refresh bind info");
            BaseAdapter.this.a(baseCallBack);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends PendingResultImpl<ResolveResult<CoreBaseResponse>, CoreBaseResponse> {
        public a(ApiClient apiClient, String str, IMessageEntity iMessageEntity) {
            super(apiClient, str, iMessageEntity);
        }

        @Override // com.huawei.hms.support.api.PendingResultImpl
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ResolveResult<CoreBaseResponse> onComplete(CoreBaseResponse coreBaseResponse) {
            ResolveResult<CoreBaseResponse> resolveResult = new ResolveResult<>(coreBaseResponse);
            resolveResult.setStatus(Status.SUCCESS);
            return resolveResult;
        }
    }

    public BaseAdapter(ApiClient apiClient) {
        this.f35273a = new WeakReference<>(apiClient);
        if (apiClient == null) {
            HMSLog.w("BaseAdapter", "BaseAdapter constructor client is null");
            return;
        }
        this.f35281i = apiClient.getContext().getApplicationContext();
        HMSLog.i("BaseAdapter", "In constructor, WeakReference is " + this.f35273a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        return new PackageManagerHelper(this.f35281i).getPackageStates(HMSPackageManager.getInstance(this.f35281i).getHMSPackageName()) == PackageManagerHelper.PackageStates.ENABLED;
    }

    private void i() {
        if (this.f35276d == null || this.f35279g == null) {
            return;
        }
        this.f35283k = null;
        this.f35283k = new ResponseHeader();
        baseRequest(d(), e(), f(), a());
    }

    private void j() {
        if (this.f35281i == null) {
            HMSLog.e("BaseAdapter", "sendBroadcastAfterResolutionHms, context is null");
            return;
        }
        Intent intent = new Intent("com.huawei.hms.core.action.SESSION_INVALID");
        try {
            intent.setPackage(this.f35281i.getPackageName());
            this.f35281i.sendBroadcast(intent);
        } catch (IllegalArgumentException unused) {
            HMSLog.e("BaseAdapter", "IllegalArgumentException when sendBroadcastAfterResolutionHms intent.setPackage");
        }
    }

    public void baseRequest(String str, String str2, Parcelable parcelable, BaseCallBack baseCallBack) {
        a(str, str2, parcelable, baseCallBack);
        if (this.f35273a == null) {
            HMSLog.e("BaseAdapter", "client is null");
            baseCallBack.onError(b(-2));
            return;
        }
        this.f35275c = baseCallBack;
        JsonUtil.jsonToEntity(str, this.f35282j);
        CoreBaseRequest coreBaseRequest = new CoreBaseRequest();
        coreBaseRequest.setJsonObject(str2);
        coreBaseRequest.setJsonHeader(str);
        coreBaseRequest.setParcelable(parcelable);
        String apiName = this.f35282j.getApiName();
        if (TextUtils.isEmpty(apiName)) {
            HMSLog.e("BaseAdapter", "get uri null");
            baseCallBack.onError(b(-5));
            return;
        }
        String transactionId = this.f35282j.getTransactionId();
        this.f35280h = transactionId;
        if (TextUtils.isEmpty(transactionId)) {
            HMSLog.e("BaseAdapter", "get transactionId null");
            baseCallBack.onError(b(-6));
            return;
        }
        HMSLog.i("BaseAdapter", "in baseRequest + uri is :" + apiName + ", transactionId is : " + this.f35280h);
        a(this.f35281i, this.f35282j);
        a(this.f35273a.get(), apiName, coreBaseRequest).setResultCallback(new BaseRequestResultCallback());
    }

    private String d() {
        return this.f35276d;
    }

    private String e() {
        return this.f35277e;
    }

    private Parcelable f() {
        return this.f35278f;
    }

    private void g() {
        this.f35284l = new SystemObserver() { // from class: com.huawei.hms.adapter.BaseAdapter.2
            @Override // com.huawei.hms.adapter.sysobs.SystemObserver
            public boolean onNoticeResult(int i11) {
                return false;
            }

            @Override // com.huawei.hms.adapter.sysobs.SystemObserver
            public boolean onSolutionResult(Intent intent, String str) {
                if (TextUtils.isEmpty(str)) {
                    HMSLog.e("BaseAdapter", "onSolutionResult but id is null");
                    BaseCallBack b11 = BaseAdapter.this.b();
                    if (b11 == null) {
                        HMSLog.e("BaseAdapter", "onSolutionResult baseCallBack null");
                        return true;
                    }
                    b11.onError(BaseAdapter.this.b(-6));
                    return true;
                }
                if (!str.equals(BaseAdapter.this.f35280h)) {
                    return false;
                }
                HMSLog.i("BaseAdapter", "onSolutionResult + id is :" + str);
                BaseCallBack b12 = BaseAdapter.this.b();
                if (b12 == null) {
                    HMSLog.e("BaseAdapter", "onResult baseCallBack null");
                    return true;
                }
                if (intent == null) {
                    HMSLog.e("BaseAdapter", "onSolutionResult but data is null");
                    String b13 = BaseAdapter.this.b(-7);
                    BaseAdapter baseAdapter = BaseAdapter.this;
                    baseAdapter.a(baseAdapter.f35281i, BaseAdapter.this.f35283k, 0L);
                    b12.onError(b13);
                    return true;
                }
                if (BaseAdapter.this.b(intent, b12) || BaseAdapter.this.a(intent, b12)) {
                    return true;
                }
                HMSLog.e("BaseAdapter", "onComplete for on activity result");
                BaseAdapter.this.c(intent, b12);
                return true;
            }

            @Override // com.huawei.hms.adapter.sysobs.SystemObserver
            public boolean onUpdateResult(int i11) {
                return false;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Activity c() {
        if (this.f35274b == null) {
            HMSLog.i("BaseAdapter", "activityWeakReference is " + this.f35274b);
            return null;
        }
        ApiClient apiClient = this.f35273a.get();
        if (apiClient == null) {
            HMSLog.i("BaseAdapter", "tmpApi is null");
            return null;
        }
        HMSLog.i("BaseAdapter", "activityWeakReference has " + this.f35274b.get());
        return Util.getActiveActivity(this.f35274b.get(), apiClient.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BaseCallBack b() {
        BaseCallBack baseCallBack = this.f35275c;
        if (baseCallBack != null) {
            return baseCallBack;
        }
        HMSLog.e("BaseAdapter", "callback null");
        return null;
    }

    private void b(Context context, RequestHeader requestHeader) {
        Map<String, String> mapFromRequestHeader = HiAnalyticsUtil.getInstance().getMapFromRequestHeader(requestHeader);
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.REQUEST);
        mapFromRequestHeader.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(requestHeader.getKitSdkVersion())));
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Util.getSystemProperties("ro.logsystem.usertype", ""));
        HiAnalyticsUtil.getInstance().onNewEvent(context, HiAnalyticsConstant.HMS_SDK_BASE_START_RESOLUTION, mapFromRequestHeader);
    }

    public BaseAdapter(ApiClient apiClient, Activity activity) {
        this.f35273a = new WeakReference<>(apiClient);
        this.f35274b = new WeakReference<>(activity);
        if (activity == null) {
            HMSLog.w("BaseAdapter", "BaseAdapter constructor activity is null");
            return;
        }
        this.f35281i = activity.getApplicationContext();
        HMSLog.i("BaseAdapter", "In constructor, activityWeakReference is " + this.f35274b + ", activity is " + this.f35274b.get());
    }

    private void c(int i11) {
        this.f35283k.setTransactionId(this.f35282j.getTransactionId());
        this.f35283k.setAppID(this.f35282j.getAppID());
        this.f35283k.setApiName(this.f35282j.getApiName());
        this.f35283k.setSrvName(this.f35282j.getSrvName());
        this.f35283k.setPkgName(this.f35282j.getPkgName());
        this.f35283k.setStatusCode(1);
        this.f35283k.setErrorCode(i11);
        this.f35283k.setErrorReason("Core error");
    }

    private PendingResult<ResolveResult<CoreBaseResponse>> a(ApiClient apiClient, String str, CoreBaseRequest coreBaseRequest) {
        return new a(apiClient, str, coreBaseRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(BaseCallBack baseCallBack) {
        HMSPackageManager.getInstance(this.f35281i).resetMultiServiceState();
        baseCallBack.onError(a(11, a(11)).toJson());
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(int i11) {
        c(i11);
        return this.f35283k.toJson();
    }

    private void b(String str) {
        this.f35277e = str;
    }

    private void b(BaseCallBack baseCallBack) {
        this.f35279g = baseCallBack;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(BaseCallBack baseCallBack, CoreBaseResponse coreBaseResponse) {
        HMSLog.i("BaseAdapter", "baseCallBack.onComplete");
        PendingIntent pendingIntent = coreBaseResponse.getPendingIntent();
        if (pendingIntent != null) {
            baseCallBack.onComplete(coreBaseResponse.getJsonHeader(), coreBaseResponse.getJsonBody(), pendingIntent);
            return;
        }
        Intent modifyIntentBehaviorsSafe = IntentUtil.modifyIntentBehaviorsSafe(coreBaseResponse.getIntent());
        if (modifyIntentBehaviorsSafe != null) {
            baseCallBack.onComplete(coreBaseResponse.getJsonHeader(), coreBaseResponse.getJsonBody(), modifyIntentBehaviorsSafe);
        } else {
            baseCallBack.onComplete(coreBaseResponse.getJsonHeader(), coreBaseResponse.getJsonBody(), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(Intent intent, BaseCallBack baseCallBack) {
        if (!intent.hasExtra(KpmsConstant.KIT_UPDATE_RESULT)) {
            return false;
        }
        int intExtra = intent.getIntExtra(KpmsConstant.KIT_UPDATE_RESULT, 0);
        HMSLog.i("BaseAdapter", "kit_update_result is " + intExtra);
        if (intExtra == 1) {
            HMSLog.e("BaseAdapter", "kit update success,replay request");
            i();
        } else {
            HMSLog.e("BaseAdapter", "kit update failed");
            baseCallBack.onError(a(-10, a(intExtra)).toJson());
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Intent intent, BaseCallBack baseCallBack) {
        long j11;
        String stringExtra = intent.getStringExtra(CommonCode.MapKey.JSON_HEADER);
        String stringExtra2 = intent.getStringExtra(CommonCode.MapKey.JSON_BODY);
        Object infoFromJsonobject = JsonUtil.getInfoFromJsonobject(stringExtra, "status_code");
        Object infoFromJsonobject2 = JsonUtil.getInfoFromJsonobject(stringExtra, b.f72948u);
        if (intent.hasExtra(CommonCode.MapKey.HMS_FOREGROUND_RES_UI)) {
            Object infoFromJsonobject3 = JsonUtil.getInfoFromJsonobject(intent.getStringExtra(CommonCode.MapKey.HMS_FOREGROUND_RES_UI), "uiDuration");
            if (infoFromJsonobject3 instanceof Long) {
                j11 = ((Long) infoFromJsonobject3).longValue();
                if (!(infoFromJsonobject instanceof Integer) && (infoFromJsonobject2 instanceof Integer)) {
                    int intValue = ((Integer) infoFromJsonobject).intValue();
                    b(((Integer) infoFromJsonobject2).intValue());
                    this.f35283k.setStatusCode(intValue);
                    a(this.f35281i, this.f35283k, j11);
                } else {
                    b(-8);
                    a(this.f35281i, this.f35283k, j11);
                }
                baseCallBack.onComplete(stringExtra, stringExtra2, null);
            }
        }
        j11 = 0;
        if (!(infoFromJsonobject instanceof Integer)) {
        }
        b(-8);
        a(this.f35281i, this.f35283k, j11);
        baseCallBack.onComplete(stringExtra, stringExtra2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Activity activity, Parcelable parcelable, CoreBaseResponse coreBaseResponse) {
        HMSLog.i("BaseAdapter", "startResolution");
        RequestHeader requestHeader = this.f35282j;
        if (requestHeader != null) {
            b(this.f35281i, requestHeader);
        }
        if (this.f35284l == null) {
            g();
        }
        SystemManager.getSystemNotifier().registerObserver(this.f35284l);
        if (Build.VERSION.SDK_INT >= 29) {
            a(coreBaseResponse);
        }
        Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(activity, BaseResolutionAdapter.class.getName());
        Bundle bundle = new Bundle();
        bundle.putParcelable(CommonCode.MapKey.HAS_RESOLUTION, parcelable);
        intentStartBridgeActivity.putExtras(bundle);
        intentStartBridgeActivity.putExtra(CommonCode.MapKey.TRANSACTION_ID, this.f35280h);
        long time = new Timestamp(System.currentTimeMillis()).getTime();
        intentStartBridgeActivity.putExtra(CommonCode.MapKey.RESOLUTION_FLAG, time);
        ResolutionFlagUtil.getInstance().saveResolutionFlag(this.f35280h, time);
        activity.startActivity(intentStartBridgeActivity);
    }

    private void a(final CoreBaseResponse coreBaseResponse) {
        HMSLog.i("BaseAdapter", "postResolutionTimeoutHandle");
        ApkResolutionFailedManager.getInstance().postTask(this.f35280h, new Runnable() { // from class: com.huawei.hms.adapter.BaseAdapter.1
            @Override // java.lang.Runnable
            public void run() {
                HMSLog.i("BaseAdapter", "postResolutionTimeoutHandle handle");
                SystemManager.getSystemNotifier().unRegisterObserver(BaseAdapter.this.f35284l);
                ApkResolutionFailedManager.getInstance().removeValueOnly(BaseAdapter.this.f35280h);
                BaseCallBack b11 = BaseAdapter.this.b();
                if (b11 == null) {
                    HMSLog.e("BaseAdapter", "timeoutRunnable callBack is null");
                } else {
                    BaseAdapter.this.a(b11, coreBaseResponse);
                }
            }
        });
    }

    private void a(Context context, RequestHeader requestHeader) {
        Map<String, String> mapFromRequestHeader = HiAnalyticsUtil.getInstance().getMapFromRequestHeader(requestHeader);
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.REQUEST);
        mapFromRequestHeader.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(requestHeader.getKitSdkVersion())));
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Util.getSystemProperties("ro.logsystem.usertype", ""));
        HiAnalyticsUtil.getInstance().onNewEvent(context, HiAnalyticsConstant.HMS_SDK_BASE_CALL_AIDL, mapFromRequestHeader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, ResponseHeader responseHeader) {
        HiAnalyticsUtil.getInstance();
        Map<String, String> mapFromRequestHeader = HiAnalyticsUtil.getMapFromRequestHeader(responseHeader);
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.RESPONSE);
        mapFromRequestHeader.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(this.f35282j.getKitSdkVersion())));
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Util.getSystemProperties("ro.logsystem.usertype", ""));
        HiAnalyticsUtil.getInstance().onNewEvent(context, HiAnalyticsConstant.HMS_SDK_BASE_CALL_AIDL, mapFromRequestHeader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, ResponseHeader responseHeader, long j11) {
        HiAnalyticsUtil.getInstance();
        Map<String, String> mapFromRequestHeader = HiAnalyticsUtil.getMapFromRequestHeader(responseHeader);
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.RESPONSE);
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_WAITTIME, String.valueOf(j11));
        mapFromRequestHeader.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(this.f35282j.getKitSdkVersion())));
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Util.getSystemProperties("ro.logsystem.usertype", ""));
        HiAnalyticsUtil.getInstance().onNewEvent(context, HiAnalyticsConstant.HMS_SDK_BASE_START_RESOLUTION, mapFromRequestHeader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ResponseWrap a(int i11, String str) {
        c(i11);
        ResponseWrap responseWrap = new ResponseWrap(this.f35283k);
        responseWrap.setBody(str);
        return responseWrap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(int i11) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", i11);
        } catch (JSONException e11) {
            HMSLog.e("BaseAdapter", "buildBodyStr failed: " + e11.getMessage());
        }
        return jSONObject.toString();
    }

    private void a(String str) {
        this.f35276d = str;
    }

    private void a(Parcelable parcelable) {
        this.f35278f = parcelable;
    }

    private BaseCallBack a() {
        return this.f35279g;
    }

    private void a(String str, String str2, Parcelable parcelable, BaseCallBack baseCallBack) {
        a(str);
        b(str2);
        a(parcelable);
        b(baseCallBack);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Intent intent, BaseCallBack baseCallBack) {
        if (!intent.hasExtra(CommonCode.MapKey.PRIVACY_STATEMENT_CONFIRM_RESULT)) {
            return false;
        }
        int intExtra = intent.getIntExtra(CommonCode.MapKey.PRIVACY_STATEMENT_CONFIRM_RESULT, 1001);
        if (intExtra == 1001) {
            HMSLog.i("BaseAdapter", "privacy_statement_confirm_result agreed: " + intExtra + ", replay request");
            i();
            return true;
        }
        HMSLog.i("BaseAdapter", "privacy_statement_confirm_result rejected: " + intExtra);
        baseCallBack.onError(a(CommonCode.BusInterceptor.PRIVACY_CNCEL_ERROR_CODE, a(CommonCode.BusInterceptor.PRIVACY_CNCEL_ERROR_CODE)).toJson());
        return true;
    }
}
