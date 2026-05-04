package com.vivo.push.util;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class s {
    public static int a(com.vivo.push.b.c cVar) {
        w b11 = w.b();
        int b12 = cVar.b();
        long currentTimeMillis = System.currentTimeMillis();
        int a11 = b11.a("com.vivo.push_preferences.operate." + b12 + "OPERATE_COUNT");
        long b13 = currentTimeMillis - b11.b("com.vivo.push_preferences.operate." + b12 + "START_TIME", 0L);
        if (b13 <= 86400000 && b13 >= 0) {
            if (a11 >= cVar.f()) {
                return 1001;
            }
            b11.a("com.vivo.push_preferences.operate." + b12 + "OPERATE_COUNT", a11 + 1);
            return 0;
        }
        b11.a("com.vivo.push_preferences.operate." + b12 + "START_TIME", System.currentTimeMillis());
        b11.a("com.vivo.push_preferences.operate." + b12 + "OPERATE_COUNT", 1);
        return 0;
    }
}
