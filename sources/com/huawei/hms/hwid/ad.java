package com.huawei.hms.hwid;

import android.text.TextUtils;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.common.CommonNaming;
import com.huawei.hms.support.api.hwid.SignOutResult;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import org.json.JSONException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ad extends TaskApiCall<u, Void> {
    public ad(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(u uVar, ResponseErrorCode responseErrorCode, String str, fr.l<Void> lVar) {
        if (responseErrorCode == null) {
            as.b("[HUAWEIIDSDK]HuaweiIdSignOutTaskApiCall", "response is null.", true);
            lVar.c(new ApiException(new Status(2003, "response is null.")));
            return;
        }
        a(responseErrorCode, str);
        int errorCode = responseErrorCode.getErrorCode();
        if (TextUtils.isEmpty(str)) {
            lVar.c(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
        } else {
            try {
                SignOutResult fromJson = new SignOutResult().fromJson(str);
                errorCode = fromJson.getStatus().getStatusCode();
                if (fromJson.isSuccess()) {
                    lVar.d(null);
                } else {
                    lVar.c(new ApiException(fromJson.getStatus()));
                }
            } catch (JSONException unused) {
                lVar.c(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
            }
        }
        if (uVar != null) {
            HiAnalyticsClient.reportExit(uVar.getContext(), CommonNaming.signout, getTransactionId(), ar.a(errorCode), errorCode);
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 1;
    }

    private void a(ResponseErrorCode responseErrorCode, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("headerErrorCode:" + responseErrorCode.getErrorCode());
        as.b("[HUAWEIIDSDK]HuaweiIdSignOutTaskApiCall", sb2.toString(), true);
    }
}
