package com.huawei.hms.aggrpay;

import android.os.Bundle;
import android.os.Parcelable;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f35373a = "e";

    /* renamed from: b, reason: collision with root package name */
    private Bundle f35374b;

    public e(Bundle bundle) {
        this.f35374b = bundle == null ? new Bundle() : bundle;
    }

    public <T extends Parcelable> T a(String str) {
        try {
            return (T) this.f35374b.getParcelable(str);
        } catch (Throwable th2) {
            HMSLog.e(f35373a, "getParcelable exception: " + th2.getMessage());
            return null;
        }
    }

    public String b(String str) {
        try {
            return this.f35374b.getString(str);
        } catch (Throwable th2) {
            HMSLog.e(f35373a, "getString exception: " + th2.getMessage());
            return "";
        }
    }
}
