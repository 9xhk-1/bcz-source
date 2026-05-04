package com.huawei.hms.hwid;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.autofill.HintConstants;
import com.huawei.hms.api.Api;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.api.entity.common.CommonNaming;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class aj extends HuaweiApi<Api.ApiOptions.NoOptions> {
    public aj(Activity activity, Api<Api.ApiOptions.NoOptions> api, Api.ApiOptions.NoOptions noOptions, AbstractClientBuilder abstractClientBuilder) {
        super(activity, api, noOptions, abstractClientBuilder);
    }

    private af b() {
        return new af(getContext().getPackageName());
    }

    public fr.k<Void> a() {
        String a11 = b().a();
        if (!TextUtils.isEmpty(a11)) {
            return doWrite(new ak(CommonNaming.startSmsRetriever, a11, HiAnalyticsClient.reportEntry(getContext(), CommonNaming.startSmsRetriever, 60900100)));
        }
        fr.l lVar = new fr.l();
        lVar.c(new ApiException(new Status(2020, CommonConstant.RETCODE.SMS_PARAM_ERROR)));
        return lVar.b();
    }

    @Override // com.huawei.hms.common.HuaweiApi
    public int getApiLevel() {
        return 1;
    }

    public aj(Context context, Api<Api.ApiOptions.NoOptions> api, Api.ApiOptions.NoOptions noOptions, AbstractClientBuilder abstractClientBuilder) {
        super(context, api, noOptions, abstractClientBuilder);
    }

    public fr.k<Void> a(String str) {
        as.b("ReadSmsService", "startConsent enter", true);
        if (str != null && str.length() > 120) {
            fr.l lVar = new fr.l();
            lVar.c(new ApiException(new Status(2020, CommonConstant.RETCODE.SMS_PARAM_ERROR)));
            return lVar.b();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CommonConstant.ReqAccessTokenParam.PACKAGE_NAME, getContext().getPackageName());
            jSONObject.put(HintConstants.AUTOFILL_HINT_PHONE_NUMBER, str);
        } catch (JSONException unused) {
            as.d("ReadSmsService", "toJson failed", true);
        }
        if (TextUtils.isEmpty(jSONObject.toString())) {
            fr.l lVar2 = new fr.l();
            lVar2.c(new ApiException(new Status(2020, CommonConstant.RETCODE.SMS_PARAM_ERROR)));
            return lVar2.b();
        }
        return doWrite(new al(CommonNaming.startConsent, jSONObject.toString(), HiAnalyticsClient.reportEntry(getContext(), CommonNaming.startConsent, 60900100)));
    }
}
