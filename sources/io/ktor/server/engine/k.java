package io.ktor.server.engine;

import io.ktor.server.engine.a;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class k implements io.ktor.server.engine.a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final zx.f f61392a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final hx.c f61393b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final s1 f61394c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final c40.x<List<o1>> f61395d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends a.C0709a {
    }

    public k(@m80.k final zx.f environment, @m80.k hx.c monitor, boolean z11, @m80.k final s1 pipeline) {
        kotlin.jvm.internal.g0.p(environment, "environment");
        kotlin.jvm.internal.g0.p(monitor, "monitor");
        kotlin.jvm.internal.g0.p(pipeline, "pipeline");
        this.f61392a = environment;
        this.f61393b = monitor;
        this.f61394c = pipeline;
        this.f61395d = c40.z.c(null, 1, null);
        final k2 k2Var = new k2();
        BaseApplicationResponse.f61233g.b(pipeline.b0());
        monitor.c(zx.c0.b(), new x00.l() { // from class: io.ktor.server.engine.i
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 n11;
                n11 = k.n(k2.this, pipeline, (zx.a) obj);
                return n11;
            }
        });
        monitor.c(zx.c0.a(), new x00.l() { // from class: io.ktor.server.engine.j
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 o11;
                o11 = k.o(k2.this, environment, (zx.a) obj);
                return o11;
            }
        });
    }

    public static final yz.g2 n(k2 k2Var, s1 s1Var, zx.a it) {
        kotlin.jvm.internal.g0.p(it, "it");
        if (!k2Var.b()) {
            k2Var.d(io.ktor.util.date.a.d());
        }
        it.g0().H(s1Var.Z());
        it.j0().H(s1Var.b0());
        b0.b(it.g0());
        b0.c(it.j0());
        l.d(it);
        l.e(it);
        return yz.g2.f100423a;
    }

    public static final yz.g2 o(k2 k2Var, zx.f fVar, zx.a it) {
        kotlin.jvm.internal.g0.p(it, "it");
        double d11 = (io.ktor.util.date.a.d() - k2Var.a()) / 1000.0d;
        if (k2Var.b()) {
            fVar.c().info("Application started in " + d11 + " seconds.");
            k2Var.c(false);
        } else {
            fVar.c().info("Application auto-reloaded in " + d11 + " seconds.");
        }
        return yz.g2.f100423a;
    }

    public static /* synthetic */ Object t(k kVar, j00.c<? super List<? extends o1>> cVar) {
        return kVar.f61395d.i(cVar);
    }

    @Override // io.ktor.server.engine.a
    @m80.k
    public final zx.f a() {
        return this.f61392a;
    }

    @Override // io.ktor.server.engine.a
    @m80.l
    public Object e(boolean z11, @m80.k j00.c<? super io.ktor.server.engine.a> cVar) {
        return a.b.b(this, z11, cVar);
    }

    @Override // io.ktor.server.engine.a
    @m80.l
    public Object h(long j11, long j12, @m80.k j00.c<? super yz.g2> cVar) {
        return a.b.e(this, j11, j12, cVar);
    }

    @Override // io.ktor.server.engine.a
    @m80.l
    public Object i(@m80.k j00.c<? super List<? extends o1>> cVar) {
        return t(this, cVar);
    }

    @m80.k
    public final hx.c p() {
        return this.f61393b;
    }

    @m80.k
    public final s1 r() {
        return this.f61394c;
    }

    @m80.k
    public final c40.x<List<o1>> s() {
        return this.f61395d;
    }

    public /* synthetic */ k(zx.f fVar, hx.c cVar, boolean z11, s1 s1Var, int i11, kotlin.jvm.internal.v vVar) {
        this(fVar, cVar, z11, (i11 & 8) != 0 ? DefaultEnginePipelineKt.c(fVar.getConfig(), z11) : s1Var);
    }
}
