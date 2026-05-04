package com.alipay.sdk.m.b;

import android.content.Context;
import android.os.Looper;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static b f10482a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f10483b = false;

    public static synchronized String a(Context context) {
        synchronized (c.class) {
            if (context == null) {
                throw new RuntimeException("Context is null");
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new IllegalStateException("Cannot be called from the main thread");
            }
            b(context);
            b bVar = f10482a;
            if (bVar != null) {
                try {
                    return bVar.a(context);
                } catch (Exception unused) {
                }
            }
            return null;
        }
    }

    public static void b(Context context) {
        if (f10482a != null || f10483b) {
            return;
        }
        synchronized (c.class) {
            try {
                if (f10482a == null && !f10483b) {
                    f10482a = com.alipay.sdk.m.c.a.a(context);
                    f10483b = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
