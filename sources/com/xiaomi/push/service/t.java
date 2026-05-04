package com.xiaomi.push.service;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.xiaomi.push.BuildConfig;
import com.xiaomi.push.service.bg;
import com.xiaomi.push.t;
import java.util.Locale;

/* loaded from: classes8.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public final int f46399a;

    /* renamed from: a, reason: collision with other field name */
    public final String f1035a;

    /* renamed from: b, reason: collision with root package name */
    public final String f46400b;

    /* renamed from: c, reason: collision with root package name */
    public final String f46401c;

    /* renamed from: d, reason: collision with root package name */
    public final String f46402d;

    /* renamed from: e, reason: collision with root package name */
    public final String f46403e;

    /* renamed from: f, reason: collision with root package name */
    public final String f46404f;

    public t(String str, String str2, String str3, String str4, String str5, String str6, int i11) {
        this.f1035a = str;
        this.f46400b = str2;
        this.f46401c = str3;
        this.f46402d = str4;
        this.f46403e = str5;
        this.f46404f = str6;
        this.f46399a = i11;
    }

    private static boolean b(Context context) {
        return context.getPackageName().equals("com.xiaomi.xmsf");
    }

    public bg.b a(XMPushService xMPushService) {
        bg.b bVar = new bg.b(xMPushService);
        a(bVar, xMPushService, xMPushService.m6211b(), "c");
        return bVar;
    }

    public bg.b a(bg.b bVar, Context context, j jVar, String str) {
        bVar.f965a = context.getPackageName();
        bVar.f968b = this.f1035a;
        bVar.f46287h = this.f46401c;
        bVar.f46282c = this.f46400b;
        bVar.f46286g = "5";
        bVar.f46283d = "XMPUSH-PASS";
        bVar.f967a = false;
        t.a aVar = new t.a();
        aVar.a("sdk_ver", 48).a("cpvn", BuildConfig.VERSION_NAME).a("cpvc", Integer.valueOf(BuildConfig.VERSION_CODE)).a("country_code", a.a(context).b()).a(TtmlNode.TAG_REGION, a.a(context).a()).a("miui_vn", com.xiaomi.push.j.c()).a("miui_vc", Integer.valueOf(com.xiaomi.push.j.a(context))).a("xmsf_vc", Integer.valueOf(com.xiaomi.push.g.a(context, "com.xiaomi.xmsf"))).a("android_ver", Integer.valueOf(Build.VERSION.SDK_INT)).a("n_belong_to_app", Boolean.valueOf(ax.m6240a(context))).a("systemui_vc", Integer.valueOf(com.xiaomi.push.g.a(context)));
        String a11 = a(context);
        if (!TextUtils.isEmpty(a11)) {
            aVar.a("latest_country_code", a11);
        }
        String d11 = com.xiaomi.push.j.d();
        if (!TextUtils.isEmpty(d11)) {
            aVar.a("device_ch", d11);
        }
        String e11 = com.xiaomi.push.j.e();
        if (!TextUtils.isEmpty(e11)) {
            aVar.a("device_mfr", e11);
        }
        bVar.f46284e = aVar.toString();
        String str2 = b(context) ? "1000271" : this.f46402d;
        t.a aVar2 = new t.a();
        aVar2.a("appid", str2).a("locale", Locale.getDefault().toString()).a("sync", 1);
        if (m6296a(context)) {
            aVar2.a("ab", str);
        }
        bVar.f46285f = aVar2.toString();
        bVar.f964a = jVar;
        return bVar;
    }

    private static String a(Context context) {
        if (!"com.xiaomi.xmsf".equals(context)) {
            return com.xiaomi.push.j.b();
        }
        if (!TextUtils.isEmpty(null)) {
            return null;
        }
        String m6169a = com.xiaomi.push.j.m6169a("ro.miui.region");
        return TextUtils.isEmpty(m6169a) ? com.xiaomi.push.j.m6169a("ro.product.locale.region") : m6169a;
    }

    public static boolean a() {
        try {
            return com.xiaomi.push.s.a(null, "miui.os.Build").getField("IS_ALPHA_BUILD").getBoolean(null);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m6296a(Context context) {
        return "com.xiaomi.xmsf".equals(context.getPackageName()) && a();
    }
}
