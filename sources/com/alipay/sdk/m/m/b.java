package com.alipay.sdk.m.m;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.widget.TextView;
import com.alipay.sdk.m.u.c;
import com.alipay.sdk.m.u.i;
import com.alipay.sdk.m.u.n;
import com.google.android.material.timepicker.ChipTextInputComboView;
import java.util.Random;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: d, reason: collision with root package name */
    public static final String f10837d = "virtualImeiAndImsi";

    /* renamed from: e, reason: collision with root package name */
    public static final String f10838e = "virtual_imei";

    /* renamed from: f, reason: collision with root package name */
    public static final String f10839f = "virtual_imsi";

    /* renamed from: g, reason: collision with root package name */
    public static volatile b f10840g;

    /* renamed from: a, reason: collision with root package name */
    public String f10841a;

    /* renamed from: b, reason: collision with root package name */
    public String f10842b = "sdk-and-lite";

    /* renamed from: c, reason: collision with root package name */
    public String f10843c;

    public b() {
        String a11 = com.alipay.sdk.m.j.a.a();
        if (com.alipay.sdk.m.j.a.b()) {
            return;
        }
        this.f10842b += '_' + a11;
    }

    public static synchronized b b() {
        b bVar;
        synchronized (b.class) {
            try {
                if (f10840g == null) {
                    f10840g = new b();
                }
                bVar = f10840g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    public static String c() {
        return Long.toHexString(System.currentTimeMillis()) + (new Random().nextInt(9000) + 1000);
    }

    public static String d() {
        return "-1;-1";
    }

    public static String e() {
        return "1";
    }

    public static String f() {
        Context b11 = com.alipay.sdk.m.s.b.d().b();
        SharedPreferences sharedPreferences = b11.getSharedPreferences(f10837d, 0);
        String string = sharedPreferences.getString(f10838e, null);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String c11 = TextUtils.isEmpty(com.alipay.sdk.m.t.a.a(b11).d()) ? c() : c.b(b11).b();
        sharedPreferences.edit().putString(f10838e, c11).apply();
        return c11;
    }

    public static String g() {
        String c11;
        Context b11 = com.alipay.sdk.m.s.b.d().b();
        SharedPreferences sharedPreferences = b11.getSharedPreferences(f10837d, 0);
        String string = sharedPreferences.getString(f10839f, null);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        if (TextUtils.isEmpty(com.alipay.sdk.m.t.a.a(b11).d())) {
            String c12 = com.alipay.sdk.m.s.b.d().c();
            c11 = (TextUtils.isEmpty(c12) || c12.length() < 18) ? c() : c12.substring(3, 18);
        } else {
            c11 = c.b(b11).c();
        }
        sharedPreferences.edit().putString(f10839f, c11).apply();
        return c11;
    }

    public static String h() {
        return ChipTextInputComboView.b.f32535b;
    }

    public static String i() {
        return "-1";
    }

    public String a() {
        return this.f10843c;
    }

    public static synchronized void a(String str) {
        synchronized (b.class) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            PreferenceManager.getDefaultSharedPreferences(com.alipay.sdk.m.s.b.d().b()).edit().putString(com.alipay.sdk.m.l.b.f10732i, str).apply();
            com.alipay.sdk.m.l.a.f10703f = str;
        }
    }

    public static String b(Context context) {
        if (context == null) {
            return "";
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            String packageName = context.getPackageName();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            sb2.append(j.f81006c);
            sb2.append(packageName);
            sb2.append(i.f11097b);
            sb2.append(packageInfo.versionCode);
            sb2.append(j.f81007d);
            return sb2.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String a(Context context) {
        return Float.toString(new TextView(context).getTextSize());
    }

    public String a(com.alipay.sdk.m.s.a aVar, com.alipay.sdk.m.t.a aVar2, boolean z11) {
        Context b11 = com.alipay.sdk.m.s.b.d().b();
        c b12 = c.b(b11);
        if (TextUtils.isEmpty(this.f10841a)) {
            this.f10841a = "Msp/15.8.15 (" + n.f() + i.f11097b + n.e() + i.f11097b + n.c(b11) + i.f11097b + n.e(b11) + i.f11097b + n.f(b11) + i.f11097b + a(b11);
        }
        String b13 = c.d(b11).b();
        String b14 = n.b(b11);
        String e11 = e();
        String c11 = b12.c();
        String b15 = b12.b();
        String g11 = g();
        String f11 = f();
        if (aVar2 != null) {
            this.f10843c = aVar2.c();
        }
        String replace = Build.MANUFACTURER.replace(i.f11097b, " ");
        String replace2 = Build.MODEL.replace(i.f11097b, " ");
        boolean e12 = com.alipay.sdk.m.s.b.e();
        String d11 = b12.d();
        String i11 = i();
        String h11 = h();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f10841a);
        sb2.append(i.f11097b);
        sb2.append(b13);
        sb2.append(i.f11097b);
        sb2.append(b14);
        sb2.append(i.f11097b);
        sb2.append(e11);
        sb2.append(i.f11097b);
        sb2.append(c11);
        sb2.append(i.f11097b);
        sb2.append(b15);
        sb2.append(i.f11097b);
        sb2.append(this.f10843c);
        sb2.append(i.f11097b);
        sb2.append(replace);
        sb2.append(i.f11097b);
        sb2.append(replace2);
        sb2.append(i.f11097b);
        sb2.append(e12);
        sb2.append(i.f11097b);
        sb2.append(d11);
        sb2.append(i.f11097b);
        sb2.append(d());
        sb2.append(i.f11097b);
        sb2.append(this.f10842b);
        sb2.append(i.f11097b);
        sb2.append(g11);
        sb2.append(i.f11097b);
        sb2.append(f11);
        sb2.append(i.f11097b);
        sb2.append(i11);
        sb2.append(i.f11097b);
        sb2.append(h11);
        if (aVar2 != null) {
            String a11 = com.alipay.sdk.m.w.b.a(aVar, b11, com.alipay.sdk.m.t.a.a(b11).d(), com.alipay.sdk.m.w.b.c(aVar, b11));
            if (!TextUtils.isEmpty(a11)) {
                sb2.append(";;;");
                sb2.append(a11);
            }
        }
        sb2.append(j.f81007d);
        return sb2.toString();
    }
}
