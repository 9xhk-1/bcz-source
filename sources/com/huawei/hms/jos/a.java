package com.huawei.hms.jos;

import android.app.Activity;
import android.content.Context;
import com.huawei.hms.jos.AppParams;
import com.huawei.hms.jos.InitTaskApiCall;
import com.huawei.hms.jos.apps.AppsBaseClientImpl;
import com.huawei.hms.jos.util.Utils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.account.request.AccountAuthParams;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.huawei.hms.utils.Util;
import fr.k;
import fr.l;
import fr.n;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
final class a extends AppsBaseClientImpl implements JosAppsClient {

    /* renamed from: e, reason: collision with root package name */
    private Context f36062e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.huawei.hms.jos.a$a, reason: collision with other inner class name */
    public class CallableC0446a implements Callable<String> {
        public CallableC0446a() {
        }

        @Override // java.util.concurrent.Callable
        public String call() {
            return Util.getAppId(a.this.f36062e);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements InitTaskApiCall.InitCallback {
        private b() {
        }

        @Override // com.huawei.hms.jos.InitTaskApiCall.InitCallback
        public void callback() {
            if (a.this.isInit()) {
                return;
            }
            a.this.setInit();
            if (a.this.a()) {
                a.this.b();
            }
        }

        public /* synthetic */ b(a aVar, CallableC0446a callableC0446a) {
            this();
        }
    }

    public a(Activity activity) {
        super(activity);
        this.f36062e = activity.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        int packageVersionCode = Utils.getPackageVersionCode(Utils.getHMSPackageName(this.f36062e));
        if (packageVersionCode >= 30000000) {
            return true;
        }
        HMSLog.w("JosAppsClientImpl", "hmsApkVersion is " + packageVersionCode + " call init failed");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        HMSLog.i("JosAppsClientImpl", "request Jos Notice.");
        String reportEntry = HiAnalyticsClient.reportEntry(getContext(), "core.getNoticeIntent", Utils.getSDKVersionCode(getContext()));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("noticeType", 0);
            jSONObject.put("hmsSdkVersionName", "6.7.0.300");
            jSONObject.put("cpId", Util.getCpId(this.f36062e));
            doWrite(new NoticeTaskApiCall("core.getNoticeIntent", jSONObject.toString(), reportEntry));
        } catch (JSONException unused) {
            HMSLog.w("JosAppsClientImpl", "build Notice request meet JSONException.");
        }
    }

    @Override // com.huawei.hms.jos.JosAppsClient
    public k<String> getAppId() {
        return n.f(new CallableC0446a());
    }

    @Override // com.huawei.hms.jos.JosAppsClient
    public k<Void> init(AppParams appParams) {
        if (appParams != null) {
            AccountAuthParams accountAuthParams = AccountAuthParams.DEFAULT_AUTH_REQUEST_PARAM_GAME;
            if (accountAuthParams.equals(appParams.getAuthScope()) || AccountAuthParams.DEFAULT_AUTH_REQUEST_PARAM.equals(appParams.getAuthScope())) {
                String reportEntry = HiAnalyticsClient.reportEntry(getContext(), JosApiConstants.INIT_API, Utils.getSDKVersionCode(getContext()));
                boolean isIntegratedGameAnalyticsSDK = Utils.isIntegratedGameAnalyticsSDK(this.f36062e);
                HMSLog.d("JosAppsClientImpl", "isIntegratedGameAnalyticsSDK : " + isIntegratedGameAnalyticsSDK);
                JSONObject attachBaseRequest = attachBaseRequest(new JSONObject());
                try {
                    attachBaseRequest.put("appType", !accountAuthParams.equals(appParams.getAuthScope()) ? 1 : 0);
                    attachBaseRequest.put(RemoteMessageConst.Notification.CHANNEL_ID, appParams.getChannelId());
                    attachBaseRequest.put("showLoginLoading", appParams.getShowLoginLoading());
                    attachBaseRequest.put("withGameAnalytics", isIntegratedGameAnalyticsSDK ? 1 : 0);
                    AppParams.CallerInfo callerInfo = appParams.getCallerInfo();
                    if (callerInfo != null) {
                        attachBaseRequest.put("callerInfo", new JSONObject().put("thirdId", callerInfo.getThirdId()).put("gepInfo", callerInfo.getGepInfo()));
                    }
                    ResourceLoaderUtil.setmContext(getContext());
                    AntiAddictionCallbackInstance.getInstance().setAntiAddictionCallback(appParams.getAntiAddictionCallback());
                    return doWrite(new InitTaskApiCall(JosApiConstants.INIT_API, attachBaseRequest.toString(), reportEntry, new b(this, null), isIntegratedGameAnalyticsSDK));
                } catch (JSONException unused) {
                    HMSLog.w("JosAppsClientImpl", "build request meet JSONException.");
                    return new l().b();
                }
            }
        }
        HMSLog.e("JosAppsClientImpl", "gameParams is illegal");
        l lVar = new l();
        lVar.c(getParamsInvalidException());
        return lVar.b();
    }
}
