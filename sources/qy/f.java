package qy;

import ix.g1;
import ix.k;
import java.io.File;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.file.Path;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import mx.h0;
import mx.v;
import mx.x;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nApplicationResponseFunctionsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApplicationResponseFunctionsJvm.kt\nio/ktor/server/response/ApplicationResponseFunctionsJvmKt\n+ 2 ApplicationResponseFunctions.kt\nio/ktor/server/response/ApplicationResponseFunctionsKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,116:1\n25#2:117\n26#2:134\n25#2:135\n26#2:152\n25#2:153\n26#2:170\n25#2:171\n26#2:188\n25#2:189\n26#2:206\n25#2:207\n26#2:224\n25#2:225\n26#2:242\n25#2:243\n26#2:260\n58#3,16:118\n58#3,16:136\n58#3,16:154\n58#3,16:172\n58#3,16:190\n58#3,16:208\n58#3,16:226\n58#3,16:244\n*S KotlinDebug\n*F\n+ 1 ApplicationResponseFunctionsJvm.kt\nio/ktor/server/response/ApplicationResponseFunctionsJvmKt\n*L\n26#1:117\n26#1:134\n41#1:135\n41#1:152\n53#1:153\n53#1:170\n65#1:171\n65#1:188\n73#1:189\n73#1:206\n81#1:207\n81#1:224\n97#1:225\n97#1:242\n114#1:243\n114#1:260\n26#1:118,16\n41#1:136,16\n53#1:154,16\n65#1:172,16\n73#1:190,16\n81#1:208,16\n97#1:226,16\n114#1:244,16\n*E\n"})
/* loaded from: classes8.dex */
public final class f {
    @m80.l
    public static final Object e(@m80.k zx.b bVar, @m80.k File file, @m80.k String str, @m80.k x00.l<? super v, g2> lVar, @m80.k j00.c<? super g2> cVar) {
        h10.r rVar = null;
        hy.n c11 = hy.o.c(file, str, null, 4, null);
        lVar.invoke(c11);
        h10.d d11 = o0.d(hy.n.class);
        try {
            rVar = o0.B(hy.n.class);
        } catch (Throwable unused) {
        }
        Object E = bVar.E(c11, new gz.a(d11, rVar), cVar);
        return E == kotlin.coroutines.intrinsics.b.l() ? E : g2.f100423a;
    }

    @m80.l
    public static final Object f(@m80.k zx.b bVar, @m80.k File file, @m80.k x00.l<? super v, g2> lVar, @m80.k j00.c<? super g2> cVar) {
        h10.r rVar = null;
        hy.n nVar = new hy.n(file, null, 2, null);
        lVar.invoke(nVar);
        h10.d d11 = o0.d(hy.n.class);
        try {
            rVar = o0.B(hy.n.class);
        } catch (Throwable unused) {
        }
        Object E = bVar.E(nVar, new gz.a(d11, rVar), cVar);
        return E == kotlin.coroutines.intrinsics.b.l() ? E : g2.f100423a;
    }

    public static /* synthetic */ Object g(zx.b bVar, File file, String str, x00.l lVar, j00.c cVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            lVar = new x00.l() { // from class: qy.e
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 i12;
                    i12 = f.i((v) obj2);
                    return i12;
                }
            };
        }
        return e(bVar, file, str, lVar, cVar);
    }

    public static /* synthetic */ Object h(zx.b bVar, File file, x00.l lVar, j00.c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = new x00.l() { // from class: qy.b
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 j11;
                    j11 = f.j((v) obj2);
                    return j11;
                }
            };
        }
        return f(bVar, file, lVar, cVar);
    }

    public static final g2 i(v vVar) {
        g0.p(vVar, "<this>");
        return g2.f100423a;
    }

    public static final g2 j(v vVar) {
        g0.p(vVar, "<this>");
        return g2.f100423a;
    }

    @m80.l
    public static final Object k(@m80.k zx.b bVar, @m80.l ix.k kVar, @m80.l g1 g1Var, @m80.l Long l11, @m80.k x00.p<? super OutputStream, ? super j00.c<? super g2>, ? extends Object> pVar, @m80.k j00.c<? super g2> cVar) {
        h10.r rVar;
        if (kVar == null) {
            kVar = k.a.f62847a.j();
        }
        x xVar = new x(pVar, kVar, g1Var, l11);
        h10.d d11 = o0.d(x.class);
        try {
            rVar = o0.B(x.class);
        } catch (Throwable unused) {
            rVar = null;
        }
        Object E = bVar.E(xVar, new gz.a(d11, rVar), cVar);
        return E == kotlin.coroutines.intrinsics.b.l() ? E : g2.f100423a;
    }

    @m80.l
    public static final Object l(@m80.k zx.b bVar, @m80.l ix.k kVar, @m80.l g1 g1Var, @m80.k x00.p<? super OutputStream, ? super j00.c<? super g2>, ? extends Object> pVar, @m80.k j00.c<? super g2> cVar) {
        h10.r rVar;
        if (kVar == null) {
            kVar = k.a.f62847a.j();
        }
        x xVar = new x(pVar, kVar, g1Var, null, 8, null);
        h10.d d11 = o0.d(x.class);
        try {
            rVar = o0.B(x.class);
        } catch (Throwable unused) {
            rVar = null;
        }
        Object E = bVar.E(xVar, new gz.a(d11, rVar), cVar);
        return E == kotlin.coroutines.intrinsics.b.l() ? E : g2.f100423a;
    }

    public static /* synthetic */ Object m(zx.b bVar, ix.k kVar, g1 g1Var, Long l11, x00.p pVar, j00.c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            kVar = null;
        }
        if ((i11 & 2) != 0) {
            g1Var = null;
        }
        if ((i11 & 4) != 0) {
            l11 = null;
        }
        return k(bVar, kVar, g1Var, l11, pVar, cVar);
    }

    public static /* synthetic */ Object n(zx.b bVar, ix.k kVar, g1 g1Var, x00.p pVar, j00.c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            kVar = null;
        }
        if ((i11 & 2) != 0) {
            g1Var = null;
        }
        return l(bVar, kVar, g1Var, pVar, cVar);
    }

    @m80.l
    public static final Object o(@m80.k zx.b bVar, @m80.k Path path, @m80.k Path path2, @m80.k x00.l<? super v, g2> lVar, @m80.k j00.c<? super g2> cVar) {
        h10.r rVar = null;
        hy.r f11 = hy.o.f(path, path2, null, 4, null);
        lVar.invoke(f11);
        h10.d d11 = o0.d(hy.r.class);
        try {
            rVar = o0.B(hy.r.class);
        } catch (Throwable unused) {
        }
        Object E = bVar.E(f11, new gz.a(d11, rVar), cVar);
        return E == kotlin.coroutines.intrinsics.b.l() ? E : g2.f100423a;
    }

    @m80.l
    public static final Object p(@m80.k zx.b bVar, @m80.k Path path, @m80.k x00.l<? super v, g2> lVar, @m80.k j00.c<? super g2> cVar) {
        h10.r rVar = null;
        hy.r rVar2 = new hy.r(path, null, 2, null);
        lVar.invoke(rVar2);
        h10.d d11 = o0.d(hy.r.class);
        try {
            rVar = o0.B(hy.r.class);
        } catch (Throwable unused) {
        }
        Object E = bVar.E(rVar2, new gz.a(d11, rVar), cVar);
        return E == kotlin.coroutines.intrinsics.b.l() ? E : g2.f100423a;
    }

    public static /* synthetic */ Object q(zx.b bVar, Path path, Path path2, x00.l lVar, j00.c cVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            lVar = new x00.l() { // from class: qy.c
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 s11;
                    s11 = f.s((v) obj2);
                    return s11;
                }
            };
        }
        return o(bVar, path, path2, lVar, cVar);
    }

    public static /* synthetic */ Object r(zx.b bVar, Path path, x00.l lVar, j00.c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = new x00.l() { // from class: qy.d
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 t11;
                    t11 = f.t((v) obj2);
                    return t11;
                }
            };
        }
        return p(bVar, path, lVar, cVar);
    }

    public static final g2 s(v vVar) {
        g0.p(vVar, "<this>");
        return g2.f100423a;
    }

    public static final g2 t(v vVar) {
        g0.p(vVar, "<this>");
        return g2.f100423a;
    }

    @m80.l
    public static final Object u(@m80.k zx.b bVar, @m80.l ix.k kVar, @m80.l g1 g1Var, @m80.l Long l11, @m80.k x00.p<? super Writer, ? super j00.c<? super g2>, ? extends Object> pVar, @m80.k j00.c<? super g2> cVar) {
        h10.r rVar;
        h0 h0Var = new h0(pVar, i.c(bVar, kVar), g1Var, l11);
        h10.d d11 = o0.d(h0.class);
        try {
            rVar = o0.B(h0.class);
        } catch (Throwable unused) {
            rVar = null;
        }
        Object E = bVar.E(h0Var, new gz.a(d11, rVar), cVar);
        return E == kotlin.coroutines.intrinsics.b.l() ? E : g2.f100423a;
    }

    @m80.l
    public static final Object v(@m80.k zx.b bVar, @m80.l ix.k kVar, @m80.l g1 g1Var, @m80.k x00.p<? super Writer, ? super j00.c<? super g2>, ? extends Object> pVar, @m80.k j00.c<? super g2> cVar) {
        h10.r rVar;
        h0 h0Var = new h0(pVar, i.c(bVar, kVar), g1Var, null, 8, null);
        h10.d d11 = o0.d(h0.class);
        try {
            rVar = o0.B(h0.class);
        } catch (Throwable unused) {
            rVar = null;
        }
        Object E = bVar.E(h0Var, new gz.a(d11, rVar), cVar);
        return E == kotlin.coroutines.intrinsics.b.l() ? E : g2.f100423a;
    }

    public static /* synthetic */ Object w(zx.b bVar, ix.k kVar, g1 g1Var, Long l11, x00.p pVar, j00.c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            kVar = null;
        }
        if ((i11 & 2) != 0) {
            g1Var = null;
        }
        if ((i11 & 4) != 0) {
            l11 = null;
        }
        return u(bVar, kVar, g1Var, l11, pVar, cVar);
    }

    public static /* synthetic */ Object x(zx.b bVar, ix.k kVar, g1 g1Var, x00.p pVar, j00.c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            kVar = null;
        }
        if ((i11 & 2) != 0) {
            g1Var = null;
        }
        return v(bVar, kVar, g1Var, pVar, cVar);
    }
}
