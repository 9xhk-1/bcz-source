package com.huawei.hms.apptouch;

import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import fr.l;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class e extends TaskApiCall<b, AppInfo> {
    public e(String str, String str2) {
        super(str, str2);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(b bVar, ResponseErrorCode responseErrorCode, String str, l<AppInfo> lVar) {
        if (responseErrorCode.getErrorCode() != 0) {
            HMSLog.e("AppTouchTaskApiCall", "Apptouch get the errorcode is " + responseErrorCode.getErrorCode());
            lVar.c(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
            return;
        }
        AppInfo appInfo = new AppInfo();
        try {
            JSONObject jSONObject = new JSONObject(str);
            appInfo.setBusiness(JsonUtil.getStringValue(jSONObject, "business"));
            appInfo.setAppTouchPackageName(JsonUtil.getStringValue(jSONObject, "appTouchPackageName"));
            appInfo.setAppId(JsonUtil.getStringValue(jSONObject, "appId"));
            appInfo.setAppPackageName(JsonUtil.getStringValue(jSONObject, "appPackageName"));
            appInfo.setCarrierId(JsonUtil.getStringValue(jSONObject, CommonConstant.KEY_CARRIER_ID));
            appInfo.setHomeCountry(JsonUtil.getStringValue(jSONObject, "homeCountry"));
        } catch (JSONException unused) {
            HMSLog.e("AppTouchTaskApiCall", "fromJson failed");
        }
        lVar.d(appInfo);
    }
}
