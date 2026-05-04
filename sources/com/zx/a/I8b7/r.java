package com.zx.a.I8b7;

import android.util.Log;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f46671a = true;

    public static void a(String str) {
        if (f46671a) {
            StringBuilder a11 = f3.a("--- ");
            a11.append(str == null ? "null" : str);
            a11.append(" ---");
            Log.d("zx-DebugMode", a11.toString());
        }
        if (str == null) {
            str = "null";
        }
        r2.a(str);
    }

    public static void b(String str) {
        if (f46671a) {
            StringBuilder a11 = f3.a("--- ");
            if (str == null) {
                str = "null";
            }
            a11.append(str);
            a11.append(" ---");
            Log.e("zx-DebugMode", a11.toString());
        }
    }
}
