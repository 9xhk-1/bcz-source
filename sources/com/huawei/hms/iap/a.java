package com.huawei.hms.iap;

import android.app.PendingIntent;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.huawei.hms.common.ResolvableApiException;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.support.log.HMSLog;
import org.junit.jupiter.api.j2;

/* loaded from: classes7.dex */
public abstract class a<U extends HmsClient, V> extends TaskApiCall<U, V> {
    public a(String str, String str2, String str3) {
        this(str, str2, null, str3);
    }

    private int b() {
        if (d()) {
            return 10;
        }
        return super.getApiLevel();
    }

    private int c() {
        if (d()) {
            return 60900000;
        }
        return super.getMinApkVersion();
    }

    private boolean d() {
        return com.huawei.hms.iap.util.b.b(getRequestJson(), "isConsignment");
    }

    public int a() {
        return 0;
    }

    public abstract void a(@NonNull fr.l<V> lVar, @NonNull ResponseErrorCode responseErrorCode, String str);

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        return Math.max(c(), a());
    }

    public a(String str, String str2, String str3, String str4) {
        super(str, com.huawei.hms.iap.util.b.a(str2, str3), str4);
        setApiLevel(b());
    }

    public Status a(@NonNull ResponseErrorCode responseErrorCode) {
        String str = "call " + getUri() + j2.O;
        if (responseErrorCode.getParcelable() instanceof Intent) {
            HMSLog.i("BaseIapServiceTaskApiCall", str + "getStatus, getParcelable is instanceof Intent");
            return new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason(), (Intent) responseErrorCode.getParcelable());
        }
        if (!(responseErrorCode.getParcelable() instanceof PendingIntent)) {
            HMSLog.i("BaseIapServiceTaskApiCall", str + "getStatus, no parcelable");
            return new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason());
        }
        HMSLog.i("BaseIapServiceTaskApiCall", str + "getStatus, getParcelable is instanceof PendingIntent");
        return new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason(), (PendingIntent) responseErrorCode.getParcelable());
    }

    public void a(int i11) {
        setApiLevel(Math.max(i11, getApiLevel()));
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(U u11, ResponseErrorCode responseErrorCode, String str, fr.l<V> lVar) {
        if (responseErrorCode == null) {
            HMSLog.e("BaseIapServiceTaskApiCall", "header is null");
            lVar.c(new IapApiException(new Status(1)));
            return;
        }
        HiAnalyticsClient.reportExit(u11.getContext(), getUri(), getTransactionId(), responseErrorCode.getStatusCode(), responseErrorCode.getErrorCode(), 61300300);
        if (lVar == null) {
            HMSLog.e("BaseIapServiceTaskApiCall", "taskCompletionSource is null");
        } else if (responseErrorCode.getErrorCode() == 0) {
            a(lVar, responseErrorCode, str);
        } else {
            a(lVar, responseErrorCode);
        }
    }

    public void a(@NonNull fr.l lVar, @NonNull ResponseErrorCode responseErrorCode) {
        HMSLog.e("BaseIapServiceTaskApiCall", ("call " + getUri() + j2.O) + "dealException, returnCode: " + responseErrorCode.getErrorCode());
        lVar.c((responseErrorCode.getErrorCode() == 1212 || responseErrorCode.getErrorCode() == 907135003) ? new ResolvableApiException(responseErrorCode) : new IapApiException(a(responseErrorCode)));
    }
}
