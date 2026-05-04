package com.meizu.cloud.pushsdk.c.g;

/* loaded from: classes7.dex */
final class k {

    /* renamed from: a, reason: collision with root package name */
    private static j f39668a;

    /* renamed from: b, reason: collision with root package name */
    private static long f39669b;

    private k() {
    }

    public static j a() {
        synchronized (k.class) {
            try {
                j jVar = f39668a;
                if (jVar == null) {
                    return new j();
                }
                f39668a = jVar.f39666f;
                jVar.f39666f = null;
                f39669b -= 2048;
                return jVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void a(j jVar) {
        if (jVar.f39666f != null || jVar.f39667g != null) {
            throw new IllegalArgumentException();
        }
        if (jVar.f39664d) {
            return;
        }
        synchronized (k.class) {
            try {
                long j11 = f39669b;
                if (j11 + 2048 <= 65536) {
                    f39669b = j11 + 2048;
                    jVar.f39666f = f39668a;
                    jVar.f39663c = 0;
                    jVar.f39662b = 0;
                    f39668a = jVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
