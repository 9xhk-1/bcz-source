package com.mob.commons.b;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class d {
    public static synchronized HashMap<String, Object> a(Context context) {
        synchronized (d.class) {
            try {
                HashMap<String, Object> hashMap = new HashMap<>();
                b a11 = b.a(context);
                HashMap<String, Object> a12 = a11.a();
                boolean z11 = a12 != null && a12.size() > 0;
                if (z11) {
                    HashMap hashMap2 = new HashMap();
                    if (a12.containsKey(com.mob.commons.n.a("004<cb1gVcd2g"))) {
                        a12.put(com.mob.commons.n.a("005;cecb?g0cdTg"), a12.remove(com.mob.commons.n.a("004=cb>gCcdYg")));
                    }
                    if (a12.containsKey(com.mob.commons.n.a("009UefcbBdd8dbcg<chg"))) {
                        a12.put(com.mob.commons.n.a("011,cd3g%dgcbLddTdbcgUchg"), a12.remove(com.mob.commons.n.a("0090efcbBddFdbcg6chg")));
                    }
                    hashMap2.putAll(a12);
                    hashMap.put(com.mob.commons.n.a("009Degcd'gVeffececf,bh"), hashMap2);
                }
                String c11 = c(context);
                boolean z12 = z11;
                String e11 = e(context);
                String g11 = g(context);
                String f11 = f(context);
                if (!z12 && TextUtils.isEmpty(c11) && TextUtils.isEmpty(f11)) {
                    return null;
                }
                boolean b11 = b(context);
                hashMap.put(com.mob.commons.n.a("004UcececdHg"), e11);
                hashMap.put(com.mob.commons.n.a("004 dbcecdPg"), c11);
                hashMap.put(com.mob.commons.n.a("004iAcecd[g"), g11);
                hashMap.put(com.mob.commons.n.a("005LcecbRg6cd^g"), f11);
                hashMap.put(com.mob.commons.n.a("011*cd]g4dgcb.ddBdbcg.chg"), Boolean.valueOf(b11));
                a11.a(c11, e11, g11, f11, b11);
                return hashMap;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean b(Context context) {
        return e.b(context);
    }

    public static String c(Context context) {
        return e.c(context);
    }

    public static String d(Context context) {
        return e.d(context);
    }

    public static String e(Context context) {
        return e.e(context);
    }

    public static String f(Context context) {
        return e.f(context);
    }

    public static String g(Context context) {
        return e.g(context);
    }
}
