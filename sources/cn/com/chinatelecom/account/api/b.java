package cn.com.chinatelecom.account.api;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static int f8850a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static int f8851b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static int f8852c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static int f8853d = 3;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f8854e = false;

    public static String a(Context context, String str) {
        return Helper.gscret(context, str);
    }

    public static String b() {
        return a.f8832a;
    }

    public static String c() {
        return a.f8833b;
    }

    public static String a(String str) {
        return Helper.sgwret(str);
    }

    public static void a() {
        ClientUtils.setSdkType(1);
    }

    public static boolean a(Context context) {
        String b11 = cn.com.chinatelecom.account.api.d.a.b(context);
        return !TextUtils.isEmpty(b11) && b11.equals("1");
    }
}
