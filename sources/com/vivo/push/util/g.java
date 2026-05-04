package com.vivo.push.util;

import android.os.Looper;
import android.util.Log;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class g {
    public static void a(String str) {
        if (p.a() && Looper.myLooper() == Looper.getMainLooper()) {
            Log.w(gi.n.f53833a, "Operation: " + str + " in main thread!", new Throwable());
        }
    }
}
