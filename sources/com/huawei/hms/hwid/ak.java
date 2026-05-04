package com.huawei.hms.hwid;

import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ak extends TaskApiCall<ai, Void> {
    public ak(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(ai aiVar, ResponseErrorCode responseErrorCode, String str, fr.l<Void> lVar) {
        ag b11 = ag.b(str);
        Integer a11 = b11.a();
        String b12 = b11.b();
        if (a11 == null) {
            a11 = Integer.valueOf(responseErrorCode.getErrorCode());
            b12 = responseErrorCode.getErrorReason();
        }
        if (a(responseErrorCode, b11.a())) {
            lVar.d(null);
        } else {
            lVar.c(new ApiException(new Status(a11.intValue(), b12)));
        }
        if (aiVar != null) {
            HiAnalyticsClient.reportExit(aiVar.getContext(), getUri(), getTransactionId(), ar.a(a11.intValue()), a11.intValue());
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 1;
    }

    private boolean a(ResponseErrorCode responseErrorCode, Integer num) {
        return num == null ? responseErrorCode.getStatusCode() == 0 : num.intValue() == 0;
    }
}
