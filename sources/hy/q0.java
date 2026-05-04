package hy;

import java.io.File;
import java.net.URL;
import java.util.Iterator;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nSinglePageApplication.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SinglePageApplication.kt\nio/ktor/server/http/content/SinglePageApplicationKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,133:1\n1863#2,2:134\n1863#2,2:136\n*S KotlinDebug\n*F\n+ 1 SinglePageApplication.kt\nio/ktor/server/http/content/SinglePageApplicationKt\n*L\n36#1:134,2\n45#1:136,2\n*E\n"})
/* loaded from: classes8.dex */
public final class q0 {
    public static final void f(@m80.k k0 k0Var, @m80.k String filesPath) {
        kotlin.jvm.internal.g0.p(k0Var, "<this>");
        kotlin.jvm.internal.g0.p(filesPath, "filesPath");
        k0Var.h(filesPath);
    }

    public static final void g(@m80.k k0 k0Var, @m80.k String filesPath) {
        kotlin.jvm.internal.g0.p(k0Var, "<this>");
        kotlin.jvm.internal.g0.p(filesPath, "filesPath");
        k0Var.h(filesPath);
    }

    public static final void h(@m80.k k0 k0Var, @m80.k String filesPath) {
        kotlin.jvm.internal.g0.p(k0Var, "<this>");
        kotlin.jvm.internal.g0.p(filesPath, "filesPath");
        k0Var.h(filesPath);
    }

    public static final void i(@m80.k k0 k0Var, @m80.k x00.l<? super String, Boolean> block) {
        kotlin.jvm.internal.g0.p(k0Var, "<this>");
        kotlin.jvm.internal.g0.p(block, "block");
        k0Var.d().add(block);
    }

    public static final void j(@m80.k k0 k0Var, @m80.k String filesPath) {
        kotlin.jvm.internal.g0.p(k0Var, "<this>");
        kotlin.jvm.internal.g0.p(filesPath, "filesPath");
        k0Var.h(filesPath);
    }

    public static final void k(@m80.k io.ktor.server.routing.g0 g0Var, @m80.k x00.l<? super k0, g2> configBuilder) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(configBuilder, "configBuilder");
        final k0 k0Var = new k0(null, null, null, false, null, 31, null);
        configBuilder.invoke(k0Var);
        if (k0Var.e()) {
            i1.f0(g0Var, k0Var.a(), k0Var.c(), k0Var.b(), new x00.l() { // from class: hy.l0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 n11;
                    n11 = q0.n(k0.this, (x0) obj);
                    return n11;
                }
            });
        } else {
            i1.c0(g0Var, k0Var.a(), new File(k0Var.c()), k0Var.b(), new x00.l() { // from class: hy.m0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 p11;
                    p11 = q0.p(k0.this, (x0) obj);
                    return p11;
                }
            });
        }
    }

    public static /* synthetic */ void l(io.ktor.server.routing.g0 g0Var, x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = new x00.l() { // from class: hy.p0
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 m11;
                    m11 = q0.m((k0) obj2);
                    return m11;
                }
            };
        }
        k(g0Var, lVar);
    }

    public static final g2 m(k0 k0Var) {
        kotlin.jvm.internal.g0.p(k0Var, "<this>");
        return g2.f100423a;
    }

    public static final g2 n(k0 k0Var, x0 staticResources) {
        kotlin.jvm.internal.g0.p(staticResources, "$this$staticResources");
        staticResources.j(k0Var.b());
        Iterator<T> it = k0Var.d().iterator();
        while (it.hasNext()) {
            final x00.l lVar = (x00.l) it.next();
            staticResources.m(new x00.l() { // from class: hy.o0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    boolean o11;
                    o11 = q0.o(x00.l.this, (URL) obj);
                    return Boolean.valueOf(o11);
                }
            });
        }
        return g2.f100423a;
    }

    public static final boolean o(x00.l lVar, URL url) {
        kotlin.jvm.internal.g0.p(url, "url");
        String path = url.getPath();
        kotlin.jvm.internal.g0.o(path, "getPath(...)");
        return ((Boolean) lVar.invoke(path)).booleanValue();
    }

    public static final g2 p(k0 k0Var, x0 staticFiles) {
        kotlin.jvm.internal.g0.p(staticFiles, "$this$staticFiles");
        staticFiles.j(k0Var.b());
        Iterator<T> it = k0Var.d().iterator();
        while (it.hasNext()) {
            final x00.l lVar = (x00.l) it.next();
            staticFiles.m(new x00.l() { // from class: hy.n0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    boolean q11;
                    q11 = q0.q(x00.l.this, (File) obj);
                    return Boolean.valueOf(q11);
                }
            });
        }
        return g2.f100423a;
    }

    public static final boolean q(x00.l lVar, File url) {
        kotlin.jvm.internal.g0.p(url, "url");
        String path = url.getPath();
        kotlin.jvm.internal.g0.o(path, "getPath(...)");
        return ((Boolean) lVar.invoke(path)).booleanValue();
    }

    public static final void r(@m80.k k0 k0Var, @m80.k String filesPath) {
        kotlin.jvm.internal.g0.p(k0Var, "<this>");
        kotlin.jvm.internal.g0.p(filesPath, "filesPath");
        k0Var.h(filesPath);
    }
}
