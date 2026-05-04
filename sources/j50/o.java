package j50;

import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f63435a;

    static {
        boolean z11;
        try {
            Class.forName("java.lang.ClassValue");
            z11 = true;
        } catch (Throwable unused) {
            z11 = false;
        }
        f63435a = z11;
    }

    @m80.k
    public static final <T> y2<T> a(@m80.k x00.l<? super h10.d<?>, ? extends f50.i<T>> factory) {
        kotlin.jvm.internal.g0.p(factory, "factory");
        return f63435a ? new t(factory) : new z(factory);
    }

    @m80.k
    public static final <T> e2<T> b(@m80.k x00.p<? super h10.d<Object>, ? super List<? extends h10.r>, ? extends f50.i<T>> factory) {
        kotlin.jvm.internal.g0.p(factory, "factory");
        return f63435a ? new u(factory) : new a0(factory);
    }
}
