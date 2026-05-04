package oy;

import g10.o;
import io.ktor.http.RangeUnits;
import ix.g1;
import ix.k;
import ix.q0;
import ix.r0;
import ix.y0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import mx.v;
import oy.i;
import u30.f0;
import x00.p;
import xy.c2;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class i extends v.e {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final v.e f78527b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nPartialOutgoingContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartialOutgoingContent.kt\nio/ktor/server/plugins/partialcontent/PartialOutgoingContent$Bypass\n+ 2 Headers.kt\nio/ktor/http/Headers$Companion\n*L\n1#1,106:1\n23#2:107\n*S KotlinDebug\n*F\n+ 1 PartialOutgoingContent.kt\nio/ktor/server/plugins/partialcontent/PartialOutgoingContent$Bypass\n*L\n29#1:107\n*E\n"})
    public static final class a extends i {

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final c0 f78528c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k final v.e original) {
            super(original, null);
            g0.p(original, "original");
            this.f78528c = e0.b(LazyThreadSafetyMode.NONE, new x00.a() { // from class: oy.h
                @Override // x00.a
                public final Object invoke() {
                    q0 s11;
                    s11 = i.a.s(v.e.this, this);
                    return s11;
                }
            });
        }

        public static final q0 s(v.e eVar, a aVar) {
            q0.a aVar2 = q0.f62976a;
            r0 r0Var = new r0(0, 1, null);
            r0Var.j(eVar.d());
            aVar.o(r0Var);
            return r0Var.build();
        }

        @Override // mx.v
        @m80.l
        public Long a() {
            return p().a();
        }

        @Override // mx.v
        @m80.k
        public q0 d() {
            return (q0) this.f78528c.getValue();
        }

        @Override // mx.v.e
        @m80.k
        public io.ktor.utils.io.g m() {
            return p().m();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nPartialOutgoingContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartialOutgoingContent.kt\nio/ktor/server/plugins/partialcontent/PartialOutgoingContent$Multiple\n+ 2 Headers.kt\nio/ktor/http/Headers$Companion\n*L\n1#1,106:1\n23#2:107\n*S KotlinDebug\n*F\n+ 1 PartialOutgoingContent.kt\nio/ktor/server/plugins/partialcontent/PartialOutgoingContent$Multiple\n*L\n91#1:107\n*E\n"})
    public static final class b extends i implements c40.r0 {

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final kotlin.coroutines.d f78529c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f78530d;

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final List<o> f78531e;

        /* renamed from: f, reason: collision with root package name */
        public final long f78532f;

        /* renamed from: g, reason: collision with root package name */
        @m80.k
        public final String f78533g;

        /* renamed from: h, reason: collision with root package name */
        public final long f78534h;

        /* renamed from: i, reason: collision with root package name */
        @m80.k
        public final c0 f78535i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k kotlin.coroutines.d coroutineContext, boolean z11, @m80.k final v.e original, @m80.k List<o> ranges, long j11, @m80.k String boundary) {
            super(original, null);
            g0.p(coroutineContext, "coroutineContext");
            g0.p(original, "original");
            g0.p(ranges, "ranges");
            g0.p(boundary, "boundary");
            this.f78529c = coroutineContext;
            this.f78530d = z11;
            this.f78531e = ranges;
            this.f78532f = j11;
            this.f78533g = boundary;
            this.f78534h = oy.c.d(ranges, Long.valueOf(j11), boundary, String.valueOf(original.b()));
            this.f78535i = e0.b(LazyThreadSafetyMode.NONE, new x00.a() { // from class: oy.l
                @Override // x00.a
                public final Object invoke() {
                    q0 z12;
                    z12 = i.b.z(v.e.this, this);
                    return z12;
                }
            });
        }

        public static final boolean A(String name, String str) {
            g0.p(name, "name");
            g0.p(str, "<unused var>");
            y0 y0Var = y0.f63006a;
            return (f0.c2(name, y0Var.C(), true) || f0.c2(name, y0Var.z(), true)) ? false : true;
        }

        public static final io.ktor.utils.io.g B(b bVar, o range) {
            g0.p(range, "range");
            return bVar.p().n(range);
        }

        public static final q0 z(v.e eVar, b bVar) {
            q0.a aVar = q0.f62976a;
            r0 r0Var = new r0(0, 1, null);
            c2.g(r0Var, eVar.d(), false, new p() { // from class: oy.k
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    boolean A;
                    A = i.b.A((String) obj, (String) obj2);
                    return Boolean.valueOf(A);
                }
            }, 2, null);
            bVar.o(r0Var);
            return r0Var.build();
        }

        @Override // mx.v
        @m80.k
        public Long a() {
            return Long.valueOf(this.f78534h);
        }

        @Override // oy.i, mx.v
        @m80.k
        public ix.k b() {
            return k.g.f62893a.c().j("boundary", this.f78533g);
        }

        @Override // mx.v
        @m80.k
        public q0 d() {
            return (q0) this.f78535i.getValue();
        }

        @Override // c40.r0
        @m80.k
        public kotlin.coroutines.d getCoroutineContext() {
            return this.f78529c;
        }

        @Override // oy.i, mx.v
        @m80.l
        public g1 h() {
            return this.f78530d ? g1.f62797c.D() : p().h();
        }

        @Override // mx.v.e
        @m80.k
        public io.ktor.utils.io.g m() {
            return oy.c.f(this, new x00.l() { // from class: oy.j
                @Override // x00.l
                public final Object invoke(Object obj) {
                    io.ktor.utils.io.g B;
                    B = i.b.B(i.b.this, (o) obj);
                    return B;
                }
            }, this.f78531e, Long.valueOf(this.f78532f), this.f78533g, String.valueOf(p().b()));
        }

        @m80.k
        public final String u() {
            return this.f78533g;
        }

        public final boolean v() {
            return this.f78530d;
        }

        public final long x() {
            return this.f78532f;
        }

        @m80.k
        public final List<o> y() {
            return this.f78531e;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nPartialOutgoingContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartialOutgoingContent.kt\nio/ktor/server/plugins/partialcontent/PartialOutgoingContent$Single\n+ 2 Headers.kt\nio/ktor/http/Headers$Companion\n*L\n1#1,106:1\n23#2:107\n*S KotlinDebug\n*F\n+ 1 PartialOutgoingContent.kt\nio/ktor/server/plugins/partialcontent/PartialOutgoingContent$Single\n*L\n50#1:107\n*E\n"})
    public static final class c extends i {

        /* renamed from: c, reason: collision with root package name */
        public final boolean f78536c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final o f78537d;

        /* renamed from: e, reason: collision with root package name */
        public final long f78538e;

        /* renamed from: f, reason: collision with root package name */
        @m80.k
        public final c0 f78539f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z11, @m80.k final v.e original, @m80.k o range, long j11) {
            super(original, null);
            g0.p(original, "original");
            g0.p(range, "range");
            this.f78536c = z11;
            this.f78537d = range;
            this.f78538e = j11;
            this.f78539f = e0.b(LazyThreadSafetyMode.NONE, new x00.a() { // from class: oy.n
                @Override // x00.a
                public final Object invoke() {
                    q0 x11;
                    x11 = i.c.x(v.e.this, this);
                    return x11;
                }
            });
        }

        public static final q0 x(v.e eVar, c cVar) {
            q0.a aVar = q0.f62976a;
            r0 r0Var = new r0(0, 1, null);
            c2.g(r0Var, eVar.d(), false, new p() { // from class: oy.m
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    boolean y11;
                    y11 = i.c.y((String) obj, (String) obj2);
                    return Boolean.valueOf(y11);
                }
            }, 2, null);
            cVar.o(r0Var);
            qy.l.f(r0Var, cVar.f78537d, Long.valueOf(cVar.f78538e), null, 4, null);
            return r0Var.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean y(String name, String str) {
            g0.p(name, "name");
            g0.p(str, "<unused var>");
            return !f0.c2(name, y0.f63006a.z(), true);
        }

        @Override // mx.v
        @m80.k
        public Long a() {
            return Long.valueOf((this.f78537d.f() - this.f78537d.d()) + 1);
        }

        @Override // mx.v
        @m80.k
        public q0 d() {
            return (q0) this.f78539f.getValue();
        }

        @Override // oy.i, mx.v
        @m80.l
        public g1 h() {
            return this.f78536c ? g1.f62797c.D() : p().h();
        }

        @Override // mx.v.e
        @m80.k
        public io.ktor.utils.io.g m() {
            return p().n(this.f78537d);
        }

        public final long t() {
            return this.f78538e;
        }

        public final boolean u() {
            return this.f78536c;
        }

        @m80.k
        public final o v() {
            return this.f78537d;
        }
    }

    public /* synthetic */ i(v.e eVar, kotlin.jvm.internal.v vVar) {
        this(eVar);
    }

    @Override // mx.v
    @m80.l
    public ix.k b() {
        return this.f78527b.b();
    }

    @Override // mx.v
    @m80.l
    public <T> T e(@m80.k xy.a<T> key) {
        g0.p(key, "key");
        return (T) this.f78527b.e(key);
    }

    @Override // mx.v
    @m80.l
    public g1 h() {
        return this.f78527b.h();
    }

    @Override // mx.v
    public <T> void i(@m80.k xy.a<T> key, @m80.l T t11) {
        g0.p(key, "key");
        this.f78527b.i(key, t11);
    }

    public final void o(@m80.k r0 r0Var) {
        g0.p(r0Var, "<this>");
        y0 y0Var = y0.f63006a;
        String h11 = y0Var.h();
        RangeUnits rangeUnits = RangeUnits.Bytes;
        if (r0Var.c(h11, rangeUnits.getUnitToken())) {
            return;
        }
        r0Var.k(y0Var.h(), rangeUnits.getUnitToken());
    }

    @m80.k
    public final v.e p() {
        return this.f78527b;
    }

    public i(v.e eVar) {
        this.f78527b = eVar;
    }
}
