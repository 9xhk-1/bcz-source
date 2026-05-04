package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.hl;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class ao {

    /* renamed from: a, reason: collision with root package name */
    private static int f46249a = 0;

    /* renamed from: a, reason: collision with other field name */
    private static long f934a = -1;

    /* renamed from: a, reason: collision with other field name */
    private static Boolean f935a;

    private static void a(Context context, String str, String str2, an anVar) {
        if (context == null || anVar == null) {
            return;
        }
        hl hlVar = new hl();
        hlVar.d(str);
        hlVar.c(str2);
        hlVar.g("com.xiaomi.xmsf");
        hlVar.e("com.xiaomi.xmsf");
        HashMap hashMap = new HashMap();
        hashMap.put("chid", String.valueOf(anVar.f46245a));
        hashMap.put("screen_on", String.valueOf(anVar.f931a));
        hashMap.put("wifi", String.valueOf(anVar.f933b));
        hashMap.put("rx_msg", String.valueOf(anVar.f930a));
        hashMap.put("enqueue", String.valueOf(anVar.f932b));
        hashMap.put("num", String.valueOf(anVar.f46246b));
        hashMap.put("run", String.valueOf(anVar.f46247c));
        hashMap.put("send", String.valueOf(anVar.f46248d));
        hlVar.a(hashMap);
        ca.a(context, hlVar);
    }

    private static boolean a() {
        int a11 = com.xiaomi.push.ae.a();
        return a11 >= 8 && a11 <= 24 && ((a11 + (-7)) * 3) - f46249a > 0;
    }

    private static boolean a(Context context) {
        String m6298a = u.m6298a(context);
        return !TextUtils.isEmpty(m6298a) && m6298a.length() >= 3 && com.xiaomi.push.t.a(m6298a.substring(m6298a.length() - 3), 1) < 1;
    }

    public static boolean a(Context context, String str, an anVar) {
        String str2;
        if (context == null || anVar == null) {
            return false;
        }
        if (f935a == null) {
            f935a = Boolean.valueOf(a(context));
        }
        if (!f935a.booleanValue()) {
            return false;
        }
        long b11 = com.xiaomi.push.ae.b();
        if (b11 - f934a >= 1) {
            f46249a = 0;
            f934a = b11;
        }
        if (!a()) {
            return false;
        }
        String str3 = "coord_down";
        if (!str.equals("coord_down")) {
            str3 = "coord_up";
            str2 = str.equals("coord_up") ? "category_coord_up" : "category_coord_down";
            f46249a++;
            return true;
        }
        a(context, str2, str3, anVar);
        f46249a++;
        return true;
    }
}
