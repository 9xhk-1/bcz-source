package com.huawei.hms.hwid;

import android.text.TextUtils;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class aa extends TaskApiCall<u, Void> {
    public aa(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(u uVar, ResponseErrorCode responseErrorCode, String str, fr.l<Void> lVar) {
        if (responseErrorCode == null) {
            as.b("[HUAWEIIDSDK]HuaweiIdDeleteAuthInfoTaskApiCall", "response is null.", true);
            lVar.c(new ApiException(new Status(2003, "response is null.")));
            return;
        }
        a(responseErrorCode, str);
        if (TextUtils.isEmpty(str)) {
            lVar.c(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
        } else if (responseErrorCode.getErrorCode() == 0) {
            lVar.d(null);
        } else {
            lVar.c(new ApiException(new Status(responseErrorCode.getErrorCode())));
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 1;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        return 40000300;
    }

    private void a(ResponseErrorCode responseErrorCode, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("headerErrorCode:" + responseErrorCode.getErrorCode());
        as.b("[HUAWEIIDSDK]HuaweiIdDeleteAuthInfoTaskApiCall", sb2.toString(), true);
    }
}
