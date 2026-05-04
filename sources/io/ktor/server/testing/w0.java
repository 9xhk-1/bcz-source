package io.ktor.server.testing;

import c40.l2;
import c40.p2;
import io.ktor.server.engine.BaseApplicationResponse;
import io.ktor.server.testing.w0;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nTestApplicationResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestApplicationResponse.kt\nio/ktor/server/testing/TestApplicationResponse\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ApplicationReceiveFunctions.kt\nio/ktor/server/request/ApplicationReceiveFunctionsKt\n+ 4 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,133:1\n1#2:134\n159#3:135\n72#3:136\n73#3:153\n58#4,16:137\n*S KotlinDebug\n*F\n+ 1 TestApplicationResponse.kt\nio/ktor/server/testing/TestApplicationResponse\n*L\n120#1:135\n120#1:136\n120#1:153\n120#1:137,16\n*E\n"})
/* loaded from: classes8.dex */
public final class w0 extends BaseApplicationResponse implements c40.r0 {

    @m80.k
    private volatile /* synthetic */ Object _byteContent;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f0 f61946i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f61947j;

    /* renamed from: k, reason: collision with root package name */
    @m80.l
    public io.ktor.utils.io.g f61948k;

    /* renamed from: l, reason: collision with root package name */
    @m80.l
    public l2 f61949l;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public final c40.a0 f61950m;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public final qy.q f61951n;

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public final c40.a0 f61952o;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.testing.TestApplicationResponse$byteContent$1", f = "TestApplicationResponse.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super byte[]>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f61953a;

        public a(j00.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return w0.this.new a(cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super byte[]> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f61953a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            io.ktor.utils.io.g gVar = w0.this.f61948k;
            kotlin.jvm.internal.g0.m(gVar);
            this.f61953a = 1;
            Object Y = io.ktor.utils.io.j.Y(gVar, this);
            return Y == l11 ? l11 : Y;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends qy.q {

        /* renamed from: b, reason: collision with root package name */
        public final ix.r0 f61955b = new ix.r0(0, 1, null);

        @Override // qy.q
        public void e(String name, String value) {
            kotlin.jvm.internal.g0.p(name, "name");
            kotlin.jvm.internal.g0.p(value, "value");
            this.f61955b.k(name, value);
        }

        @Override // qy.q
        public List<String> g() {
            return a00.r0.a6(this.f61955b.names());
        }

        @Override // qy.q
        public List<String> h(String name) {
            kotlin.jvm.internal.g0.p(name, "name");
            List<String> a11 = this.f61955b.a(name);
            return a11 == null ? a00.h0.J() : a11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.testing.TestApplicationResponse$launchResponseJob$1", f = "TestApplicationResponse.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f61956a;

        /* renamed from: b, reason: collision with root package name */
        public int f61957b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.g f61959d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(io.ktor.utils.io.g gVar, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f61959d = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return w0.this.new c(this.f61959d, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            w0 w0Var;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f61957b;
            if (i11 == 0) {
                kotlin.e.n(obj);
                w0 w0Var2 = w0.this;
                io.ktor.utils.io.g gVar = this.f61959d;
                this.f61956a = w0Var2;
                this.f61957b = 1;
                Object Y = io.ktor.utils.io.j.Y(gVar, this);
                if (Y == l11) {
                    return l11;
                }
                w0Var = w0Var2;
                obj = Y;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                w0Var = (w0) this.f61956a;
                kotlin.e.n(obj);
            }
            w0Var.Y((byte[]) obj);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.testing.TestApplicationResponse", f = "TestApplicationResponse.kt", i = {0}, l = {102}, m = "respondOutgoingContent", n = {"this"}, s = {"L$0"})
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f61960a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f61961b;

        /* renamed from: d, reason: collision with root package name */
        public int f61963d;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f61961b = obj;
            this.f61963d |= Integer.MIN_VALUE;
            return w0.this.B(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.testing.TestApplicationResponse", f = "TestApplicationResponse.kt", i = {0, 1, 2}, l = {135, 121, 119}, m = "respondUpgrade", n = {"this", "this", "this"}, s = {"L$0", "L$0", "L$0"})
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f61964a;

        /* renamed from: b, reason: collision with root package name */
        public Object f61965b;

        /* renamed from: c, reason: collision with root package name */
        public Object f61966c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f61967d;

        /* renamed from: f, reason: collision with root package name */
        public int f61969f;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f61967d = obj;
            this.f61969f |= Integer.MIN_VALUE;
            return w0.this.D(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.testing.TestApplicationResponse$responseChannel$job$1", f = "TestApplicationResponse.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements x00.p<io.ktor.utils.io.j0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f61970a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f61971b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.b f61973d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.server.testing.TestApplicationResponse$responseChannel$job$1$readJob$1", f = "TestApplicationResponse.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f61974a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ io.ktor.utils.io.v f61975b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ io.ktor.utils.io.b f61976c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(io.ktor.utils.io.v vVar, io.ktor.utils.io.b bVar, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f61975b = vVar;
                this.f61976c = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new a(this.f61975b, this.f61976c, cVar);
            }

            @Override // x00.p
            public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
                return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f61974a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    io.ktor.utils.io.v vVar = this.f61975b;
                    io.ktor.utils.io.b bVar = this.f61976c;
                    this.f61974a = 1;
                    if (io.ktor.utils.io.j.f(vVar, bVar, this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                return g2.f100423a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(io.ktor.utils.io.b bVar, j00.c<? super f> cVar) {
            super(2, cVar);
            this.f61973d = bVar;
        }

        public static final long k(io.ktor.utils.io.v vVar) {
            return vVar.i();
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            f fVar = w0.this.new f(this.f61973d, cVar);
            fVar.f61971b = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            l2 f11;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f61970a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            io.ktor.utils.io.j0 j0Var = (io.ktor.utils.io.j0) this.f61971b;
            final io.ktor.utils.io.v a11 = io.ktor.utils.io.w.a(j0Var.a());
            f11 = c40.k.f(j0Var, null, null, new a(a11, this.f61973d, null), 3, null);
            i1.b(j0Var, w0.this.T(), f11, new x00.a() { // from class: io.ktor.server.testing.x0
                @Override // x00.a
                public final Object invoke() {
                    long k11;
                    k11 = w0.f.k(io.ktor.utils.io.v.this);
                    return Long.valueOf(k11);
                }
            });
            return g2.f100423a;
        }

        @Override // x00.p
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.utils.io.j0 j0Var, j00.c<? super g2> cVar) {
            return ((f) create(j0Var, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    public /* synthetic */ w0(f0 f0Var, boolean z11, int i11, kotlin.jvm.internal.v vVar) {
        this(f0Var, (i11 & 2) != 0 ? false : z11);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // io.ktor.server.engine.BaseApplicationResponse
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object B(@m80.k mx.v r5, @m80.k j00.c<? super yz.g2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.server.testing.w0.d
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.server.testing.w0$d r0 = (io.ktor.server.testing.w0.d) r0
            int r1 = r0.f61963d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f61963d = r1
            goto L18
        L13:
            io.ktor.server.testing.w0$d r0 = new io.ktor.server.testing.w0$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f61961b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f61963d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f61960a
            io.ktor.server.testing.w0 r5 = (io.ktor.server.testing.w0) r5
            kotlin.e.n(r6)
            goto L44
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.e.n(r6)
            r0.f61960a = r4
            r0.f61963d = r3
            java.lang.Object r5 = super.B(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            r5 = r4
        L44:
            c40.a0 r5 = r5.f61950m
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "No response channel assigned"
            r6.<init>(r0)
            r5.r(r6)
            yz.g2 r5 = yz.g2.f100423a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.testing.w0.B(mx.v, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    @Override // io.ktor.server.engine.BaseApplicationResponse
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object D(@m80.k mx.v.d r12, @m80.k j00.c<? super yz.g2> r13) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.testing.w0.D(mx.v$d, j00.c):java.lang.Object");
    }

    @Override // io.ktor.server.engine.BaseApplicationResponse
    @m80.l
    public Object H(@m80.k j00.c<? super io.ktor.utils.io.m> cVar) {
        io.ktor.utils.io.b bVar = new io.ktor.utils.io.b(true);
        if (this.f61947j) {
            W(bVar);
        }
        c40.r0 S = S();
        kotlin.coroutines.d dVar = this.f61949l;
        if (dVar == null) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        io.ktor.utils.io.i0 S2 = io.ktor.utils.io.j.S(S, dVar, false, new f(bVar, null), 2, null);
        if (this.f61949l == null) {
            this.f61949l = S2.a();
        }
        this.f61948k = bVar;
        this.f61950m.complete();
        return S2.b();
    }

    @Override // io.ktor.server.engine.BaseApplicationResponse
    public void J(@m80.k ix.g1 statusCode) {
        kotlin.jvm.internal.g0.p(statusCode, "statusCode");
    }

    @m80.l
    public final Object O(@m80.k j00.c<? super g2> cVar) {
        l2 l2Var = this.f61949l;
        if (l2Var == null) {
            return g2.f100423a;
        }
        Object K0 = l2Var.K0(cVar);
        return K0 == kotlin.coroutines.intrinsics.b.l() ? K0 : g2.f100423a;
    }

    @m80.l
    public final io.ktor.utils.io.g P() {
        byte[] Q = Q();
        if (Q != null) {
            return io.ktor.utils.io.c.e(Q, 0, 0, 6, null);
        }
        return null;
    }

    @m80.l
    public final byte[] Q() {
        if (this._byteContent != null) {
            return (byte[]) this._byteContent;
        }
        if (this.f61948k == null) {
            return null;
        }
        return (byte[]) sy.a.b(new a(null));
    }

    @m80.k
    public final c40.a0 R() {
        return this.f61950m;
    }

    public final rw.d1 T() {
        return (rw.d1) c().getAttributes().a(o0.b());
    }

    @m80.k
    public final c40.a0 V() {
        return this.f61952o;
    }

    public final void W(io.ktor.utils.io.g gVar) {
        c40.x0 b11;
        b11 = c40.k.b(this, c40.h1.a(), null, new c(gVar, null), 2, null);
        this.f61949l = b11;
    }

    public final void Y(byte[] bArr) {
        this._byteContent = bArr;
    }

    @m80.l
    public final io.ktor.utils.io.g Z() {
        return this.f61948k;
    }

    @Override // qy.a
    @m80.k
    public qy.q a() {
        return this.f61951n;
    }

    @Override // c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f61946i.getCoroutineContext();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(@m80.k f0 call, boolean z11) {
        super(call);
        c40.a0 c11;
        c40.a0 c12;
        kotlin.jvm.internal.g0.p(call, "call");
        this.f61946i = call;
        this.f61947j = z11;
        this._byteContent = null;
        c11 = p2.c(null, 1, null);
        this.f61950m = c11;
        this.f61951n = new b();
        c12 = p2.c(null, 1, null);
        this.f61952o = c12;
    }

    private final c40.r0 S() {
        return this;
    }
}
