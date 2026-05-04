package com.huawei.hms.apptouch;

import com.huawei.hms.apptouch.AppInfoSetResponse;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import fr.l;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class d extends TaskApiCall<b, AppInfoSetResponse> {
    public d(String str, String str2) {
        super(str, str2);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(b bVar, ResponseErrorCode responseErrorCode, String str, l<AppInfoSetResponse> lVar) {
        if (responseErrorCode.getErrorCode() != 0) {
            lVar.c(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
            return;
        }
        AppInfoSetResponse appInfoSetResponse = new AppInfoSetResponse();
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i11);
                JSONObject jSONObject2 = new JSONObject(jSONObject.getString("appInfo"));
                AppInfo appInfo = new AppInfo();
                AppInfoSetResponse.AppInfoResult appInfoResult = new AppInfoSetResponse.AppInfoResult();
                appInfo.setBusiness(JsonUtil.getStringValue(jSONObject2, "business"));
                appInfo.setAppTouchPackageName(JsonUtil.getStringValue(jSONObject2, "appTouchPackageName"));
                appInfo.setAppId(JsonUtil.getStringValue(jSONObject2, "appId"));
                appInfo.setAppPackageName(JsonUtil.getStringValue(jSONObject2, "appPackageName"));
                appInfo.setCarrierId(JsonUtil.getStringValue(jSONObject2, CommonConstant.KEY_CARRIER_ID));
                appInfo.setHomeCountry(JsonUtil.getStringValue(jSONObject2, "homeCountry"));
                appInfoResult.setAppInfo(appInfo);
                appInfoResult.setErrorCode(JsonUtil.getIntValue(jSONObject, "errorCode"));
                appInfoResult.setErrorMessage(JsonUtil.getStringValue(jSONObject, "errorMessage"));
                arrayList.add(appInfoResult);
            }
        } catch (JSONException unused) {
            HMSLog.e("AppTouchTaskApiCall", "fromJson failed");
        }
        appInfoSetResponse.setErrorAppInfos(arrayList);
        lVar.d(appInfoSetResponse);
    }
}
