package com.mob.secverify.e;

import android.os.Build;
import com.mob.MobSDK;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class f {
    public static void a() {
        if (h.c(MobSDK.getContext()) && h.a(MobSDK.getContext()) && Build.BRAND.equalsIgnoreCase(h.a("4F50706F")) && Build.VERSION.SDK_INT <= 28 && com.mob.secverify.pure.b.c.a().e() == 0 && !g.e()) {
            try {
                com.mob.secverify.pure.b.b.a(MobSDK.getContext().getApplicationContext());
            } catch (Exception e11) {
                com.mob.secverify.b.c.a().b(e11);
            }
        }
    }
}
