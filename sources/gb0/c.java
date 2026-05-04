package gb0;

import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import w00.o;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final c f53566a = new c();

    @w00.k
    @o
    public static final <T> T c(@k Class<?> clazz) {
        g0.p(clazz, "clazz");
        return (T) f(clazz, null, null, 6, null);
    }

    @w00.k
    @o
    public static final <T> T d(@k Class<?> clazz, @l za0.a aVar) {
        g0.p(clazz, "clazz");
        return (T) f(clazz, aVar, null, 4, null);
    }

    @w00.k
    @o
    public static final <T> T e(@k Class<?> clazz, @l za0.a aVar, @l x00.a<? extends ya0.a> aVar2) {
        g0.p(clazz, "clazz");
        return (T) g().n(w00.b.i(clazz), aVar, aVar2);
    }

    public static /* synthetic */ Object f(Class cls, za0.a aVar, x00.a aVar2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            aVar = null;
        }
        if ((i11 & 4) != 0) {
            aVar2 = null;
        }
        return e(cls, aVar, aVar2);
    }

    @o
    @k
    public static final na0.a g() {
        return jb0.c.f64013a.a().get();
    }

    @l
    @w00.k
    @o
    public static final <T> T h(@k Class<?> clazz) {
        g0.p(clazz, "clazz");
        return (T) k(clazz, null, null, 6, null);
    }

    @l
    @w00.k
    @o
    public static final <T> T i(@k Class<?> clazz, @l za0.a aVar) {
        g0.p(clazz, "clazz");
        return (T) k(clazz, aVar, null, 4, null);
    }

    @l
    @w00.k
    @o
    public static final <T> T j(@k Class<?> clazz, @l za0.a aVar, @l x00.a<? extends ya0.a> aVar2) {
        g0.p(clazz, "clazz");
        return (T) g().D(w00.b.i(clazz), aVar, aVar2);
    }

    public static /* synthetic */ Object k(Class cls, za0.a aVar, x00.a aVar2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            aVar = null;
        }
        if ((i11 & 4) != 0) {
            aVar2 = null;
        }
        return j(cls, aVar, aVar2);
    }

    @w00.k
    @o
    @k
    public static final <T> c0<T> l(@k Class<?> clazz) {
        g0.p(clazz, "clazz");
        return o(clazz, null, null, 6, null);
    }

    @w00.k
    @o
    @k
    public static final <T> c0<T> m(@k Class<?> clazz, @l za0.a aVar) {
        g0.p(clazz, "clazz");
        return o(clazz, aVar, null, 4, null);
    }

    @w00.k
    @o
    @k
    public static final <T> c0<T> n(@k final Class<?> clazz, @l final za0.a aVar, @l final x00.a<? extends ya0.a> aVar2) {
        g0.p(clazz, "clazz");
        return e0.b(LazyThreadSafetyMode.SYNCHRONIZED, new x00.a() { // from class: gb0.b
            @Override // x00.a
            public final Object invoke() {
                Object p11;
                p11 = c.p(clazz, aVar, aVar2);
                return p11;
            }
        });
    }

    public static /* synthetic */ c0 o(Class cls, za0.a aVar, x00.a aVar2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            aVar = null;
        }
        if ((i11 & 4) != 0) {
            aVar2 = null;
        }
        return n(cls, aVar, aVar2);
    }

    public static final Object p(Class cls, za0.a aVar, x00.a aVar2) {
        return e(cls, aVar, aVar2);
    }

    @w00.k
    @o
    @k
    public static final <T> c0<T> q(@k Class<?> clazz) {
        g0.p(clazz, "clazz");
        return t(clazz, null, null, 6, null);
    }

    @w00.k
    @o
    @k
    public static final <T> c0<T> r(@k Class<?> clazz, @l za0.a aVar) {
        g0.p(clazz, "clazz");
        return t(clazz, aVar, null, 4, null);
    }

    @w00.k
    @o
    @k
    public static final <T> c0<T> s(@k final Class<?> clazz, @l final za0.a aVar, @l final x00.a<? extends ya0.a> aVar2) {
        g0.p(clazz, "clazz");
        return e0.c(new x00.a() { // from class: gb0.a
            @Override // x00.a
            public final Object invoke() {
                Object u11;
                u11 = c.u(clazz, aVar, aVar2);
                return u11;
            }
        });
    }

    public static /* synthetic */ c0 t(Class cls, za0.a aVar, x00.a aVar2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            aVar = null;
        }
        if ((i11 & 4) != 0) {
            aVar2 = null;
        }
        return s(cls, aVar, aVar2);
    }

    public static final Object u(Class cls, za0.a aVar, x00.a aVar2) {
        return j(cls, aVar, aVar2);
    }
}
