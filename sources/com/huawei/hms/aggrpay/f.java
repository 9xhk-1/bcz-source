package com.huawei.hms.aggrpay;

import android.content.Intent;

/* loaded from: classes7.dex */
public class f extends Intent {

    /* renamed from: a, reason: collision with root package name */
    private Intent f35375a;

    public f(Intent intent) {
        this.f35375a = new Intent(intent == null ? new Intent() : intent);
    }

    @Override // android.content.Intent
    public String getStringExtra(String str) {
        try {
            return this.f35375a.getStringExtra(str);
        } catch (Throwable unused) {
            return "";
        }
    }
}
