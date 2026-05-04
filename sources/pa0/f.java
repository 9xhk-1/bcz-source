package pa0;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import m80.k;
import m80.l;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class f {
    @k
    public static final <T extends c> cb0.b c(@k T t11, @l Object obj) {
        g0.p(t11, "<this>");
        return na0.a.i(t11.r(), i(t11), j(t11), obj, null, 8, null);
    }

    @k
    public static final <T extends c> cb0.b d(@k T t11, @k String scopeId, @l Object obj, @l za0.d dVar) {
        g0.p(t11, "<this>");
        g0.p(scopeId, "scopeId");
        return t11.r().e(scopeId, j(t11), obj, dVar);
    }

    public static /* synthetic */ cb0.b e(c cVar, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = null;
        }
        return c(cVar, obj);
    }

    public static /* synthetic */ cb0.b f(c cVar, String str, Object obj, za0.d dVar, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            str = i(cVar);
        }
        if ((i11 & 2) != 0) {
            obj = null;
        }
        if ((i11 & 4) != 0) {
            dVar = null;
        }
        return d(cVar, str, obj, dVar);
    }

    @k
    public static final <T extends c> c0<cb0.b> g(@k final T t11) {
        g0.p(t11, "<this>");
        return e0.c(new x00.a() { // from class: pa0.e
            @Override // x00.a
            public final Object invoke() {
                cb0.b h11;
                h11 = f.h(c.this);
                return h11;
            }
        });
    }

    public static final cb0.b h(c cVar) {
        cb0.b k11 = k(cVar);
        return k11 == null ? e(cVar, null, 1, null) : k11;
    }

    @k
    public static final <T> String i(@k T t11) {
        g0.p(t11, "<this>");
        return fb0.b.a(o0.d(t11.getClass())) + '@' + t11.hashCode();
    }

    @k
    public static final <T> za0.d j(@k T t11) {
        g0.p(t11, "<this>");
        return new za0.d(o0.d(t11.getClass()));
    }

    @l
    public static final <T extends c> cb0.b k(@k T t11) {
        g0.p(t11, "<this>");
        return t11.r().O(i(t11));
    }

    @k
    public static final <T extends c> c0<cb0.b> l(@k final T t11) {
        g0.p(t11, "<this>");
        return e0.c(new x00.a() { // from class: pa0.d
            @Override // x00.a
            public final Object invoke() {
                cb0.b m11;
                m11 = f.m(c.this);
                return m11;
            }
        });
    }

    public static final cb0.b m(c cVar) {
        return e(cVar, null, 1, null);
    }
}
