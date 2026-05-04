package kx;

import ix.e1;
import ix.f1;
import java.util.Iterator;
import java.util.Locale;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import u30.k0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nHttpBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpBody.kt\nio/ktor/http/cio/HttpBodyKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,177:1\n1863#2,2:178\n*S KotlinDebug\n*F\n+ 1 HttpBody.kt\nio/ktor/http/cio/HttpBodyKt\n*L\n158#1:178,2\n*E\n"})
/* loaded from: classes8.dex */
public final class n {
    public static final boolean a(@m80.k e1 method, long j11, @m80.l CharSequence charSequence, @m80.l m mVar, @m80.l CharSequence charSequence2) {
        g0.p(method, "method");
        if (charSequence != null) {
            e(charSequence);
            return true;
        }
        if (j11 != -1) {
            return j11 > 0;
        }
        e1.a aVar = e1.f62753b;
        return (g0.g(method, aVar.c()) || g0.g(method, aVar.d()) || g0.g(method, aVar.e()) || mVar == null || !mVar.h()) ? false : true;
    }

    public static final boolean b(@m80.k b0 request) {
        g0.p(request, "request");
        e1 c11 = request.c();
        CharSequence g11 = request.a().g("Content-Length");
        return a(c11, g11 != null ? lx.i.n(g11) : -1L, request.a().g("Transfer-Encoding"), m.f69023e.f(request.a().g("Connection")), request.a().g("Content-Type"));
    }

    public static final boolean c(@m80.k e1 method, @m80.l CharSequence charSequence, @m80.l m mVar) {
        g0.p(method, "method");
        return g0.g(method, e1.f62753b.c()) && charSequence != null && mVar != null && mVar.k();
    }

    public static final boolean d(@m80.k b0 request) {
        g0.p(request, "request");
        return c(request.c(), request.a().g("Upgrade"), m.f69023e.f(request.a().g("Connection")));
    }

    public static final boolean e(CharSequence charSequence) {
        if (lx.i.f(charSequence, 0, 0, c80.f.f8329r, 3, null)) {
            return true;
        }
        boolean z11 = false;
        if (lx.i.f(charSequence, 0, 0, "identity", 3, null)) {
            return false;
        }
        Iterator it = k0.o5(charSequence, new String[]{","}, false, 0, 6, null).iterator();
        while (it.hasNext()) {
            String lowerCase = k0.b6((String) it.next()).toString().toLowerCase(Locale.ROOT);
            g0.o(lowerCase, "toLowerCase(...)");
            if (g0.g(lowerCase, c80.f.f8329r)) {
                if (z11) {
                    throw new IllegalArgumentException("Double-chunked TE is not supported: " + ((Object) charSequence));
                }
                z11 = true;
            } else if (!g0.g(lowerCase, "identity")) {
                throw new IllegalArgumentException("Unsupported transfer encoding " + lowerCase);
            }
        }
        return z11;
    }

    @m80.l
    @yz.n(level = DeprecationLevel.ERROR, message = "Please use method with version parameter")
    public static final Object f(long j11, @m80.l CharSequence charSequence, @m80.l m mVar, @m80.k io.ktor.utils.io.g gVar, @m80.k io.ktor.utils.io.m mVar2, @m80.k j00.c<? super g2> cVar) {
        Object g11 = g(null, j11, charSequence, mVar, gVar, mVar2, cVar);
        return g11 == kotlin.coroutines.intrinsics.b.l() ? g11 : g2.f100423a;
    }

    @m80.l
    public static final Object g(@m80.l f1 f1Var, long j11, @m80.l CharSequence charSequence, @m80.l m mVar, @m80.k io.ktor.utils.io.g gVar, @m80.k io.ktor.utils.io.m mVar2, @m80.k j00.c<? super g2> cVar) {
        if (charSequence != null && e(charSequence)) {
            Object d11 = h.d(gVar, mVar2, cVar);
            return d11 == kotlin.coroutines.intrinsics.b.l() ? d11 : g2.f100423a;
        }
        if (j11 != -1) {
            Object g11 = io.ktor.utils.io.j.g(gVar, mVar2, j11, cVar);
            return g11 == kotlin.coroutines.intrinsics.b.l() ? g11 : g2.f100423a;
        }
        if ((mVar == null || !mVar.h()) && !(mVar == null && g0.g(f1Var, f1.f62772d.b()))) {
            io.ktor.utils.io.q.e(mVar2, new IllegalStateException("Failed to parse request body: request body length should be specified,\nchunked transfer encoding should be used or\nkeep-alive should be disabled (connection: close)"));
            return g2.f100423a;
        }
        Object g12 = io.ktor.utils.io.j.g(gVar, mVar2, Long.MAX_VALUE, cVar);
        return g12 == kotlin.coroutines.intrinsics.b.l() ? g12 : g2.f100423a;
    }

    @m80.l
    public static final Object h(@m80.k s sVar, @m80.k io.ktor.utils.io.g gVar, @m80.k io.ktor.utils.io.m mVar, @m80.k j00.c<? super g2> cVar) {
        CharSequence g11 = sVar.g("Content-Length");
        Object g12 = g(null, g11 != null ? lx.i.n(g11) : -1L, sVar.g("Transfer-Encoding"), m.f69023e.f(sVar.g("Connection")), gVar, mVar, cVar);
        return g12 == kotlin.coroutines.intrinsics.b.l() ? g12 : g2.f100423a;
    }
}
