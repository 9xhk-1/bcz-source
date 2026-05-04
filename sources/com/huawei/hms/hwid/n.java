package com.huawei.hms.hwid;

import android.text.TextUtils;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.ResolvableApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.api.hwid.SignOutResult;
import org.json.JSONException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class n extends TaskApiCall<c, Void> {
    public n(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(c cVar, ResponseErrorCode responseErrorCode, String str, fr.l<Void> lVar) {
        if (responseErrorCode == null) {
            as.b("[AccountSDK]AccountSignOutTaskApiCall", "response is null.", true);
            lVar.c(new ApiException(new Status(2003, "response is null.")));
            return;
        }
        a(responseErrorCode, str);
        int errorCode = responseErrorCode.getErrorCode();
        if (errorCode != 0 && CommonCode.Resolution.HAS_RESOLUTION.equals(responseErrorCode.getResolution())) {
            as.b("[AccountSDK]AccountSignOutTaskApiCall", "apk version is low or is not exist.", true);
            Status status = new Status(errorCode, responseErrorCode.getErrorReason());
            ao.a(responseErrorCode, status);
            lVar.c(new ResolvableApiException(status));
            return;
        }
        if (TextUtils.isEmpty(str)) {
            lVar.c(new ApiException(new Status(errorCode, responseErrorCode.getErrorReason())));
            return;
        }
        if ("{}".equals(str)) {
            as.b("[AccountSDK]AccountSignOutTaskApiCall", "SignOut complete, body is null", true);
            lVar.c(new ApiException(new Status(errorCode, responseErrorCode.getErrorReason())));
            return;
        }
        try {
            SignOutResult fromJson = new SignOutResult().fromJson(str);
            if (fromJson.isSuccess()) {
                lVar.d(null);
            } else {
                lVar.c(new ApiException(fromJson.getStatus()));
            }
        } catch (JSONException e11) {
            as.b("[AccountSDK]AccountSignOutTaskApiCall", "JSONException:" + e11.getClass().getSimpleName(), true);
            lVar.c(new ApiException(new Status(errorCode, responseErrorCode.getErrorReason())));
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 1;
    }

    private void a(ResponseErrorCode responseErrorCode, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("headerErrorCode:" + responseErrorCode.getErrorCode());
        as.b("[AccountSDK]AccountSignOutTaskApiCall", sb2.toString(), true);
    }
}
