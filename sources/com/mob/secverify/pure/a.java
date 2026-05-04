package com.mob.secverify.pure;

import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.secverify.b.c;
import com.mob.secverify.pure.core.ope.b.c.f;
import com.mob.secverify.pure.core.ope.cm.d.d;
import com.mob.secverify.pure.core.ope.cm.d.e;
import com.mob.secverify.pure.core.ope.cm.d.g;
import com.mob.secverify.pure.core.ope.cm.d.h;
import com.mob.secverify.pure.core.ope.cm.d.i;
import com.mob.secverify.pure.core.ope.cm.d.k;
import com.mob.tools.utils.DeviceHelper;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.UUID;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static DeviceHelper f40738a = DeviceHelper.getInstance(MobSDK.getContext());

    public static String a() {
        return f.b();
    }

    public static String b() {
        return f.a(MobSDK.getContext());
    }

    public static String c() {
        return f40738a.getAppVersionName();
    }

    public static int d() {
        return f40738a.getAppVersion();
    }

    public static String e() {
        return f40738a.getPackageName();
    }

    public static String f() {
        return f40738a.getAppName();
    }

    public static String g() {
        return UUID.randomUUID().toString().substring(0, 16);
    }

    public static String h() {
        e.c();
        return TextUtils.isEmpty(e.c()) ? "" : e.c();
    }

    public static String i() {
        String a11 = e.a();
        return TextUtils.isEmpty(a11) ? "none" : a11;
    }

    public static String j() {
        return String.valueOf(e.q());
    }

    public static String k() {
        try {
            return URLEncoder.encode(e.d(), "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static String l() {
        try {
            return URLEncoder.encode(e.e(), "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static String m() {
        return e.f();
    }

    public static String n() {
        return com.mob.secverify.pure.core.ope.cm.d.f.b();
    }

    public static String o() {
        return com.mob.secverify.pure.core.ope.cm.d.f.e();
    }

    public static String p() {
        return d.a();
    }

    public static String q() {
        return e.h();
    }

    public static String r() {
        return e.j().toLowerCase();
    }

    public static String s() {
        String[] split;
        String b11 = f.b();
        String a11 = k.a();
        return (b11.startsWith("10.") || TextUtils.isEmpty(a11) || !a11.contains(",") || (split = a11.split(",")) == null || split.length <= 0) ? b11 : split[0];
    }

    public static String t() {
        return k.a(true, true);
    }

    public static String u() {
        String a11 = i.a();
        return TextUtils.isEmpty(a11) ? com.mob.secverify.pure.core.ope.cm.d.f.f() : a11;
    }

    public static String a(String str, String str2, String str3) {
        return com.mob.secverify.pure.core.ope.b.c.d.a(str, str2.trim(), str3.trim());
    }

    public static String b(String str) {
        return h.a(str);
    }

    public static String c(String str) {
        return g.a(str);
    }

    public static String a(String str) {
        return f.a(str);
    }

    public static String b(String str, String str2) {
        return com.mob.secverify.pure.core.ope.cm.d.a.a(str, str2);
    }

    public static String a(String str, String str2) {
        try {
            return com.mob.secverify.pure.core.ope.b.c.i.b(str, str2);
        } catch (Throwable th2) {
            c.a().b(th2);
            return null;
        }
    }
}
