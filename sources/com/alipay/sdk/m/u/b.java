package com.alipay.sdk.m.u;

import android.os.SystemClock;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final long f11048a = 3000;

    /* renamed from: b, reason: collision with root package name */
    public static long f11049b = -1;

    public static synchronized boolean a() {
        synchronized (b.class) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - f11049b < 3000) {
                return true;
            }
            f11049b = elapsedRealtime;
            return false;
        }
    }
}
