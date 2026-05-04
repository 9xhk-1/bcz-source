package com.huawei.updatesdk.a.b.b;

import android.content.Intent;
import android.os.Bundle;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private Intent f36843a;

    private b(Intent intent) {
        this.f36843a = intent;
    }

    public int a(String str, int i11) {
        if (d()) {
            try {
                return this.f36843a.getIntExtra(str, i11);
            } catch (Throwable unused) {
                com.huawei.updatesdk.a.a.a.a("SecureIntent", "getIntExtra exception!");
            }
        }
        return i11;
    }

    public long b(String str, int i11) {
        if (d()) {
            try {
                return this.f36843a.getLongExtra(str, i11);
            } catch (Throwable unused) {
                com.huawei.updatesdk.a.a.a.a("SecureIntent", "getIntExtra exception!");
            }
        }
        return i11;
    }

    public Intent c() {
        return this.f36843a;
    }

    public boolean d() {
        return this.f36843a != null;
    }

    public static b a(Intent intent) {
        return new b(intent);
    }

    public Bundle b() {
        if (d()) {
            return this.f36843a.getExtras();
        }
        return null;
    }

    public String a() {
        String action;
        return (!d() || (action = this.f36843a.getAction()) == null) ? "" : action;
    }

    public String a(String str) {
        if (!d()) {
            return "";
        }
        try {
            return this.f36843a.getStringExtra(str);
        } catch (Throwable unused) {
            com.huawei.updatesdk.a.a.a.a("SecureIntent", "getStringExtra exception!");
            return "";
        }
    }

    public boolean a(String str, boolean z11) {
        if (d()) {
            try {
                return this.f36843a.getBooleanExtra(str, z11);
            } catch (Throwable unused) {
                com.huawei.updatesdk.a.a.a.a("SecureIntent", "getBooleanExtra exception!");
            }
        }
        return z11;
    }
}
