package io.ktor.server.routing;

import com.bumptech.glide.load.engine.GlideException;
import io.ktor.server.routing.r1;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nRoutingResolveTrace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoutingResolveTrace.kt\nio/ktor/server/routing/RoutingResolveTrace\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,151:1\n1#2:152\n*E\n"})
/* loaded from: classes8.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final zx.k0 f61744a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<String> f61745b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final z1<v1> f61746c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public v1 f61747d;

    /* renamed from: e, reason: collision with root package name */
    public r1 f61748e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final List<List<r1.b>> f61749f;

    public u1(@m80.k zx.k0 call, @m80.k List<String> segments) {
        kotlin.jvm.internal.g0.p(call, "call");
        kotlin.jvm.internal.g0.p(segments, "segments");
        this.f61744a = call;
        this.f61745b = segments;
        this.f61746c = new z1<>();
        this.f61749f = new ArrayList();
    }

    public static final CharSequence f(List path) {
        kotlin.jvm.internal.g0.p(path, "path");
        return a00.r0.r3(path, " -> ", GlideException.a.f28776d, null, 0, null, new x00.l() { // from class: io.ktor.server.routing.s1
            @Override // x00.l
            public final Object invoke(Object obj) {
                CharSequence g11;
                g11 = u1.g((r1.b) obj);
                return g11;
            }
        }, 28, null);
    }

    public static final CharSequence g(r1.b it) {
        kotlin.jvm.internal.g0.p(it, "it");
        StringBuilder sb2 = new StringBuilder();
        sb2.append('\"');
        sb2.append(it.b().q0());
        sb2.append('\"');
        return sb2.toString();
    }

    public final void c(@m80.k List<r1.b> trait) {
        kotlin.jvm.internal.g0.p(trait, "trait");
        int size = trait.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(trait.get(i11));
        }
        this.f61749f.add(arrayList);
    }

    public final void d(@m80.k d1 route, int i11) {
        kotlin.jvm.internal.g0.p(route, "route");
        this.f61746c.d(new v1(route, i11, null, 4, null));
    }

    @m80.k
    public final String e() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(toString());
        kotlin.jvm.internal.g0.o(sb2, "append(...)");
        sb2.append('\n');
        kotlin.jvm.internal.g0.o(sb2, "append(...)");
        v1 v1Var = this.f61747d;
        if (v1Var != null) {
            v1Var.b(sb2, 0);
        }
        if (this.f61748e != null) {
            sb2.append("Matched routes:");
            kotlin.jvm.internal.g0.o(sb2, "append(...)");
            sb2.append('\n');
            kotlin.jvm.internal.g0.o(sb2, "append(...)");
            if (this.f61749f.isEmpty()) {
                sb2.append("  No results");
                kotlin.jvm.internal.g0.o(sb2, "append(...)");
                sb2.append('\n');
                kotlin.jvm.internal.g0.o(sb2, "append(...)");
            } else {
                sb2.append(a00.r0.r3(this.f61749f, "\n", null, null, 0, null, new x00.l() { // from class: io.ktor.server.routing.t1
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        CharSequence f11;
                        f11 = u1.f((List) obj);
                        return f11;
                    }
                }, 30, null));
                kotlin.jvm.internal.g0.o(sb2, "append(...)");
                sb2.append('\n');
                kotlin.jvm.internal.g0.o(sb2, "append(...)");
            }
            sb2.append("Routing resolve result:");
            kotlin.jvm.internal.g0.o(sb2, "append(...)");
            sb2.append('\n');
            kotlin.jvm.internal.g0.o(sb2, "append(...)");
            StringBuilder sb3 = new StringBuilder();
            sb3.append(GlideException.a.f28776d);
            r1 r1Var = this.f61748e;
            if (r1Var == null) {
                kotlin.jvm.internal.g0.S("finalResult");
                r1Var = null;
            }
            sb3.append(r1Var);
            sb2.append(sb3.toString());
        }
        String sb4 = sb2.toString();
        kotlin.jvm.internal.g0.o(sb4, "toString(...)");
        return sb4;
    }

    public final void h(@m80.k d1 route, int i11, @m80.k r1 result) {
        kotlin.jvm.internal.g0.p(route, "route");
        kotlin.jvm.internal.g0.p(result, "result");
        v1 c11 = this.f61746c.c();
        if (!kotlin.jvm.internal.g0.g(c11.d(), route)) {
            throw new IllegalArgumentException("end should be called for the same route as begin");
        }
        if (c11.e() != i11) {
            throw new IllegalArgumentException("end should be called for the same segmentIndex as begin");
        }
        c11.f(result);
        k(c11);
    }

    @m80.k
    public final zx.k0 i() {
        return this.f61744a;
    }

    @m80.k
    public final List<String> j() {
        return this.f61745b;
    }

    public final void k(v1 v1Var) {
        if (this.f61746c.a()) {
            this.f61747d = v1Var;
        } else {
            this.f61746c.b().a(v1Var);
        }
    }

    public final void l(@m80.k r1 result) {
        kotlin.jvm.internal.g0.p(result, "result");
        this.f61748e = result;
    }

    public final void m(@m80.k d1 route, int i11, @m80.k r1 result) {
        kotlin.jvm.internal.g0.p(route, "route");
        kotlin.jvm.internal.g0.p(result, "result");
        k(new v1(route, i11, result));
    }

    @m80.k
    public String toString() {
        return "Trace for " + this.f61745b;
    }
}
