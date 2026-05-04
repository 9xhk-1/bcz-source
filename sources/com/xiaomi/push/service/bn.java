package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;

/* loaded from: classes8.dex */
public class bn {

    /* renamed from: a, reason: collision with root package name */
    private static bn f46327a;

    /* renamed from: a, reason: collision with other field name */
    private int f975a = 0;

    /* renamed from: a, reason: collision with other field name */
    private Context f976a;

    private bn(Context context) {
        this.f976a = context.getApplicationContext();
    }

    @SuppressLint({"NewApi"})
    public int a() {
        int i11 = this.f975a;
        if (i11 != 0) {
            return i11;
        }
        try {
            this.f975a = Settings.Global.getInt(this.f976a.getContentResolver(), "device_provisioned", 0);
        } catch (Exception unused) {
        }
        return this.f975a;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a, reason: collision with other method in class */
    public Uri m6261a() {
        return Settings.Global.getUriFor("device_provisioned");
    }

    public static bn a(Context context) {
        if (f46327a == null) {
            f46327a = new bn(context);
        }
        return f46327a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6262a() {
        String str = com.xiaomi.push.ab.f124a;
        return str.contains("xmsf") || str.contains("xiaomi") || str.contains("miui");
    }
}
