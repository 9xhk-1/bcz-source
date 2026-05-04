package io.ktor.server.engine;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final yz.c0 f61425a = yz.e0.c(new x00.a() { // from class: io.ktor.server.engine.q
        @Override // x00.a
        public final Object invoke() {
            Method c11;
            c11 = r.c();
            return c11;
        }
    });

    public static final Method b() {
        return (Method) f61425a.getValue();
    }

    public static final Method c() {
        try {
            return Class.forName("io.ktor.utils.io.jvm.javaio.PollersKt").getMethod("isParkingAllowed", null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final boolean d() {
        boolean z11;
        Method b11 = b();
        if (b11 == null) {
            return false;
        }
        try {
            z11 = kotlin.jvm.internal.g0.g(b11.invoke(null, null), Boolean.TRUE);
        } catch (Throwable unused) {
            z11 = false;
        }
        return z11;
    }
}
