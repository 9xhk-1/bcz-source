package com.huawei.hms.hwid;

import android.text.TextUtils;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.ResolvableApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.common.CommonNaming;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.api.hwid.RevokeAccessResult;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import org.json.JSONException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class z extends TaskApiCall<u, Void> {
    public z(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(u uVar, ResponseErrorCode responseErrorCode, String str, fr.l<Void> lVar) {
        as.b("HuaweiIdCancelAuthorizationTaskApiCall", "HuaweiIdCancelAuthorizationTaskApiCall doExecute", true);
        x.a();
        if (responseErrorCode == null) {
            as.b("HuaweiIdCancelAuthorizationTaskApiCall", "response is null.", true);
            lVar.c(new ApiException(new Status(2003, "response is null.")));
            return;
        }
        int errorCode = responseErrorCode.getErrorCode();
        if (errorCode != 0 && CommonCode.Resolution.HAS_RESOLUTION.equals(responseErrorCode.getResolution())) {
            as.b("HuaweiIdCancelAuthorizationTaskApiCall", "apk version is low or is not exist.", true);
            Status status = new Status(errorCode, responseErrorCode.getErrorReason());
            ao.a(responseErrorCode, status);
            lVar.c(new ResolvableApiException(status));
            return;
        }
        if (TextUtils.isEmpty(str)) {
            lVar.c(new ApiException(new Status(errorCode, responseErrorCode.getErrorReason())));
        } else {
            if ("{}".equals(str)) {
                as.b("HuaweiIdCancelAuthorizationTaskApiCall", "CancelAuthorization complete, body is null", true);
                lVar.c(new ApiException(new Status(errorCode, responseErrorCode.getErrorReason())));
                return;
            }
            try {
                RevokeAccessResult fromJson = new RevokeAccessResult().fromJson(str);
                if (fromJson.isSuccess()) {
                    lVar.d(null);
                } else {
                    Status status2 = fromJson.getStatus();
                    lVar.c(new ApiException(new Status(status2.getStatusCode(), status2.getStatusMessage())));
                }
            } catch (JSONException e11) {
                as.b("HuaweiIdCancelAuthorizationTaskApiCall", "JSONException:" + e11.getClass().getSimpleName(), true);
                lVar.c(new ApiException(new Status(errorCode, responseErrorCode.getErrorReason())));
            }
        }
        if (uVar != null) {
            HiAnalyticsClient.reportExit(uVar.getContext(), CommonNaming.revokeAccess, getTransactionId(), ar.a(errorCode), errorCode);
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 1;
    }
}
