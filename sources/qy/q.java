package qy;

import a00.w1;
import io.ktor.http.UnsafeHeaderException;
import ix.q0;
import ix.r0;
import ix.y0;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nResponseHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponseHeaders.kt\nio/ktor/server/response/ResponseHeaders\n+ 2 Headers.kt\nio/ktor/http/Headers$Companion\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,84:1\n23#2:85\n1863#3,2:86\n*S KotlinDebug\n*F\n+ 1 ResponseHeaders.kt\nio/ktor/server/response/ResponseHeaders\n*L\n38#1:85\n39#1:86,2\n*E\n"})
/* loaded from: classes8.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Set<String> f82756a = w1.k();

    public static /* synthetic */ void c(q qVar, String str, String str2, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: append");
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        qVar.b(str, str2, z11);
    }

    @m80.k
    public final q0 a() {
        q0.a aVar = q0.f62976a;
        r0 r0Var = new r0(0, 1, null);
        for (String str : a00.r0.f6(g())) {
            r0Var.f(str, h(str));
        }
        return r0Var.build();
    }

    public final void b(@m80.k String name, @m80.k String value, boolean z11) {
        g0.p(name, "name");
        g0.p(value, "value");
        if (i().contains(name)) {
            return;
        }
        if (z11 && y0.f63006a.Z0(name)) {
            throw new UnsafeHeaderException(name);
        }
        y0 y0Var = y0.f63006a;
        y0Var.a(name);
        y0Var.b(value);
        e(name, value);
    }

    public final boolean d(@m80.k String name) {
        g0.p(name, "name");
        return f(name) != null;
    }

    public abstract void e(@m80.k String str, @m80.k String str2);

    @m80.l
    public String f(@m80.k String name) {
        g0.p(name, "name");
        return (String) a00.r0.L2(h(name));
    }

    @m80.k
    public abstract List<String> g();

    @m80.k
    public abstract List<String> h(@m80.k String str);

    @m80.k
    public Set<String> i() {
        return this.f82756a;
    }

    @m80.k
    public final List<String> j(@m80.k String name) {
        g0.p(name, "name");
        return h(name);
    }
}
