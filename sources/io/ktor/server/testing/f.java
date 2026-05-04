package io.ktor.server.testing;

import kotlin.jvm.internal.PropertyReference0Impl;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@io.ktor.utils.io.c0
/* loaded from: classes8.dex */
public final class f extends e0 implements g {

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final yz.c0 f61874k = yz.e0.c(new x00.a() { // from class: io.ktor.server.testing.a
        @Override // x00.a
        public final Object invoke() {
            lw.c f02;
            f02 = f.f0(f.this);
            return f02;
        }
    });

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final yz.c0 f61875l = yz.e0.c(new x00.a() { // from class: io.ktor.server.testing.b
        @Override // x00.a
        public final Object invoke() {
            TestApplication e02;
            e02 = f.e0(f.this);
            return e02;
        }
    });

    public static final TestApplication e0(f fVar) {
        return new TestApplication(fVar);
    }

    public static final lw.c f0(f fVar) {
        return fVar.a(new x00.l() { // from class: io.ktor.server.testing.e
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 g02;
                g02 = f.g0((lw.j) obj);
                return g02;
            }
        });
    }

    public static final g2 g0(lw.j createClient) {
        kotlin.jvm.internal.g0.p(createClient, "$this$createClient");
        return g2.f100423a;
    }

    public static final g2 h0(x00.l lVar, final f fVar, lw.j HttpClient) {
        kotlin.jvm.internal.g0.p(HttpClient, "$this$HttpClient");
        HttpClient.h(new x00.l() { // from class: io.ktor.server.testing.c
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 i02;
                i02 = f.i0(f.this, (ry.f) obj);
                return i02;
            }
        });
        lVar.invoke(HttpClient);
        return g2.f100423a;
    }

    public static final g2 i0(f fVar, ry.f engine) {
        kotlin.jvm.internal.g0.p(engine, "$this$engine");
        engine.l(fVar.J());
        engine.m(new PropertyReference0Impl(fVar) { // from class: io.ktor.server.testing.f.a
            @Override // kotlin.jvm.internal.PropertyReference0Impl, h10.o
            public Object get() {
                return ((f) this.receiver).j0();
            }
        });
        return g2.f100423a;
    }

    @Override // io.ktor.server.testing.g
    @io.ktor.utils.io.c0
    @m80.k
    public lw.c a(@m80.k final x00.l<? super lw.j<? extends ow.j>, g2> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        return lw.p.d(ry.e.f86914m, new x00.l() { // from class: io.ktor.server.testing.d
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 h02;
                h02 = f.h0(x00.l.this, this, (lw.j) obj);
                return h02;
            }
        });
    }

    @Override // io.ktor.server.testing.g
    @m80.k
    public lw.c b() {
        return (lw.c) this.f61874k.getValue();
    }

    @m80.k
    public final TestApplication j0() {
        return (TestApplication) this.f61875l.getValue();
    }

    @m80.l
    public final Object k0(@m80.k j00.c<? super g2> cVar) {
        Object l11 = j0().l(cVar);
        return l11 == kotlin.coroutines.intrinsics.b.l() ? l11 : g2.f100423a;
    }
}
