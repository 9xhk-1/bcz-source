package com.alipay.sdk.m.c;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.material.internal.l;
import com.igexin.assist.util.AssistUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f10484a = "ro.build.version.emui";

    /* renamed from: b, reason: collision with root package name */
    public static final String f10485b = "hw_sc.build.platform.version";

    public static com.alipay.sdk.m.b.b a(Context context) {
        String str = Build.BRAND;
        com.alipay.sdk.m.d.a.b("Device", "Brand", str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equalsIgnoreCase("huawei") || str.equalsIgnoreCase(AssistUtils.BRAND_HON) || str.equalsIgnoreCase("华为")) {
            return new b();
        }
        if (str.equalsIgnoreCase("xiaomi") || str.equalsIgnoreCase("redmi") || str.equalsIgnoreCase("meitu") || str.equalsIgnoreCase("小米") || str.equalsIgnoreCase("blackshark")) {
            return new i();
        }
        if (str.equalsIgnoreCase("vivo")) {
            return new h();
        }
        if (str.equalsIgnoreCase("oppo") || str.equalsIgnoreCase("oneplus") || str.equalsIgnoreCase("realme")) {
            return new f();
        }
        if (str.equalsIgnoreCase("lenovo") || str.equalsIgnoreCase("zuk")) {
            return new c();
        }
        if (str.equalsIgnoreCase("nubia")) {
            return new e();
        }
        if (str.equalsIgnoreCase(l.f31607b)) {
            return new g();
        }
        if (a()) {
            return new b();
        }
        if (str.equalsIgnoreCase("meizu") || str.equalsIgnoreCase("mblu")) {
            return new d();
        }
        return null;
    }

    public static boolean a() {
        return (TextUtils.isEmpty(a(f10484a)) && TextUtils.isEmpty(a(f10485b))) ? false : true;
    }

    public static String a(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getDeclaredMethod(ct.d.f46852f, String.class).invoke(null, str);
        } catch (Throwable unused) {
            return "";
        }
    }
}
