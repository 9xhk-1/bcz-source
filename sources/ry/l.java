package ry;

import c40.a0;
import c40.l2;
import c40.n0;
import c40.n2;
import c40.r0;
import io.ktor.client.call.UnsupportedContentTypeException;
import io.ktor.server.testing.TestApplicationEngine;
import io.ktor.server.testing.f0;
import io.ktor.server.testing.i1;
import io.ktor.server.testing.w0;
import io.ktor.utils.io.m0;
import io.ktor.utils.io.q;
import io.ktor.utils.io.x;
import io.ktor.utils.io.y;
import ix.e1;
import ix.g1;
import ix.h2;
import ix.q0;
import ix.t2;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import mx.v;
import ow.u;
import rw.d1;
import ry.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTestHttpClientEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestHttpClientEngine.kt\nio/ktor/server/testing/client/TestHttpClientEngine\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Headers.kt\nio/ktor/http/Headers$Companion\n*L\n1#1,154:1\n46#2,4:155\n1#3:159\n23#4:160\n23#4:161\n*S KotlinDebug\n*F\n+ 1 TestHttpClientEngine.kt\nio/ktor/server/testing/client/TestHttpClientEngine\n*L\n40#1:155,4\n61#1:160\n107#1:161\n*E\n"})
/* loaded from: classes8.dex */
public final class l extends ow.e {

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public static final a f86946k = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final i f86947e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final TestApplicationEngine f86948f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final o f86949g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final Set<ow.h<?>> f86950h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final a0 f86951i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f86952j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ow.l<i> {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @Override // ow.l
        @m80.k
        public ow.a a(@m80.k x00.l<? super i, g2> block) {
            g0.p(block, "block");
            i iVar = new i();
            block.invoke(iVar);
            return new l(iVar);
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.testing.client.TestHttpClientEngine", f = "TestHttpClientEngine.kt", i = {0, 0, 1, 1, 2, 3, 3, 3}, l = {44, 48, 51, 56}, m = "execute", n = {"this", "data", "this", "data", "data", "this", "data", "callContext"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$0", "L$1", "L$2"})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f86953a;

        /* renamed from: b, reason: collision with root package name */
        public Object f86954b;

        /* renamed from: c, reason: collision with root package name */
        public Object f86955c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f86956d;

        /* renamed from: f, reason: collision with root package name */
        public int f86958f;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f86956d = obj;
            this.f86958f |= Integer.MIN_VALUE;
            return l.this.B0(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.testing.client.TestHttpClientEngine", f = "TestHttpClientEngine.kt", i = {}, l = {110}, m = "httpResponseData", n = {}, s = {})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f86959a;

        /* renamed from: b, reason: collision with root package name */
        public Object f86960b;

        /* renamed from: c, reason: collision with root package name */
        public Object f86961c;

        /* renamed from: d, reason: collision with root package name */
        public Object f86962d;

        /* renamed from: e, reason: collision with root package name */
        public Object f86963e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f86964f;

        /* renamed from: h, reason: collision with root package name */
        public int f86966h;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f86964f = obj;
            this.f86966h |= Integer.MIN_VALUE;
            return l.this.o0(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.testing.client.TestHttpClientEngine$toByteReadChannel$1", f = "TestHttpClientEngine.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<m0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f86967a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f86968b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d1 f86969c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ mx.v f86970d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.server.testing.client.TestHttpClientEngine$toByteReadChannel$1$job$1", f = "TestHttpClientEngine.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f86971a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ mx.v f86972b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ x f86973c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(mx.v vVar, x xVar, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f86972b = vVar;
                this.f86973c = xVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new a(this.f86972b, this.f86973c, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f86971a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    v.f fVar = (v.f) this.f86972b;
                    x xVar = this.f86973c;
                    this.f86971a = 1;
                    if (fVar.m(xVar, this) == l11) {
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
        public e(d1 d1Var, mx.v vVar, j00.c<? super e> cVar) {
            super(2, cVar);
            this.f86969c = d1Var;
            this.f86970d = vVar;
        }

        public static final long k(x xVar) {
            return xVar.e();
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            e eVar = new e(this.f86969c, this.f86970d, cVar);
            eVar.f86968b = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            l2 f11;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f86967a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            m0 m0Var = (m0) this.f86968b;
            final x a11 = y.a(m0Var.a());
            f11 = c40.k.f(m0Var, null, null, new a(this.f86970d, a11, null), 3, null);
            i1.b(m0Var, this.f86969c, f11, new x00.a() { // from class: ry.m
                @Override // x00.a
                public final Object invoke() {
                    long k11;
                    k11 = l.e.k(x.this);
                    return Long.valueOf(k11);
                }
            });
            return g2.f100423a;
        }

        @Override // x00.p
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public final Object invoke(m0 m0Var, j00.c<? super g2> cVar) {
            return ((e) create(m0Var, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@m80.k i config) {
        super("ktor-test");
        g0.p(config, "config");
        this.f86947e = config;
        TestApplicationEngine j11 = getConfig().j();
        this.f86948f = j11;
        o oVar = new o(this, j11);
        this.f86949g = oVar;
        this.f86950h = oVar.c();
        a0 a11 = n2.a((l2) j11.getCoroutineContext().get(l2.f7886e0));
        this.f86951i = a11;
        this.f86952j = a11.plus(E8()).plus(new d(n0.f7891d0));
    }

    public static final g2 c0(io.ktor.server.testing.u0 u0Var, String name, String value) {
        g0.p(name, "name");
        g0.p(value, "value");
        u0Var.v(name, value);
        return g2.f100423a;
    }

    public static /* synthetic */ Object y0(l lVar, e1 e1Var, t2 t2Var, q0 q0Var, mx.v vVar, h2 h2Var, d1 d1Var, j00.c cVar, int i11, Object obj) {
        if ((i11 & 32) != 0) {
            d1Var = null;
        }
        return lVar.v0(e1Var, t2Var, q0Var, vVar, h2Var, d1Var, cVar);
    }

    public static final g2 z0(t2 t2Var, e1 e1Var, l lVar, q0 q0Var, mx.v vVar, h2 h2Var, d1 d1Var, io.ktor.server.testing.u0 handleRequest) {
        g0.p(handleRequest, "$this$handleRequest");
        handleRequest.M(ix.l2.l(t2Var));
        handleRequest.J(Integer.valueOf(t2Var.z()));
        handleRequest.H(e1Var);
        lVar.Z(handleRequest, q0Var, vVar);
        handleRequest.K(h2Var.l());
        if (!(vVar instanceof v.c)) {
            handleRequest.G(lVar.D0(vVar, d1Var));
        }
        return g2.f100423a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(6:(2:3|(11:5|6|7|8|(1:(1:(1:(1:(17:14|15|16|17|18|(1:20)|21|(2:45|46)|23|24|(1:26)|33|34|(3:36|37|(3:39|40|41))(1:44)|42|40|41)(2:50|51))(4:52|53|54|55))(6:56|57|58|(3:60|61|62)|54|55))(1:66))(3:78|(1:80)|62)|67|68|69|(2:71|(5:73|58|(0)|54|55))(3:74|75|(15:77|17|18|(0)|21|(0)|23|24|(0)|33|34|(0)(0)|42|40|41))|61|62))|68|69|(0)(0)|61|62)|82|6|7|8|(0)(0)|67|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0045, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0159 A[Catch: all -> 0x014f, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x014f, blocks: (B:46:0x0137, B:26:0x0159), top: B:45:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0171 A[Catch: all -> 0x017f, TRY_LEAVE, TryCatch #3 {all -> 0x017f, blocks: (B:18:0x011a, B:24:0x0153, B:34:0x015c, B:36:0x0171), top: B:17:0x011a }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0137 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0093 A[Catch: all -> 0x00db, TRY_LEAVE, TryCatch #1 {all -> 0x00db, blocks: (B:69:0x008d, B:71:0x0093, B:75:0x00e3), top: B:68:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0077  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    @Override // ow.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object B0(@m80.k cx.z r14, @m80.k j00.c<? super cx.f0> r15) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ry.l.B0(cx.z, j00.c):java.lang.Object");
    }

    public final g1 C0(w0 w0Var) {
        g1 l11 = w0Var.l();
        return l11 == null ? g1.f62797c.z() : l11;
    }

    public final io.ktor.utils.io.g D0(mx.v vVar, d1 d1Var) {
        if (vVar instanceof v.c) {
            return io.ktor.utils.io.g.f62105a.a();
        }
        if (vVar instanceof v.a) {
            return io.ktor.utils.io.c.e(((v.a) vVar).m(), 0, 0, 6, null);
        }
        if (vVar instanceof v.e) {
            return ((v.e) vVar).m();
        }
        if (vVar instanceof v.f) {
            return q.E(this, getCoroutineContext(), false, new e(d1Var, vVar, null), 2, null).b();
        }
        if (vVar instanceof v.b) {
            return D0(((v.b) vVar).n(), d1Var);
        }
        if (vVar instanceof v.d) {
            throw new UnsupportedContentTypeException(vVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ow.e, ow.a
    @m80.k
    public Set<ow.h<?>> D2() {
        return this.f86950h;
    }

    public final void Z(@m80.k final io.ktor.server.testing.u0 u0Var, @m80.k q0 headers, @m80.k mx.v content) {
        g0.p(u0Var, "<this>");
        g0.p(headers, "headers");
        g0.p(content, "content");
        u.h(headers, content, new p() { // from class: ry.j
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                g2 c02;
                c02 = l.c0(io.ktor.server.testing.u0.this, (String) obj, (String) obj2);
                return c02;
            }
        });
    }

    @Override // ow.e, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f86951i.complete();
    }

    @Override // ow.e, c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f86952j;
    }

    @Override // ow.a
    @m80.k
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public i getConfig() {
        return this.f86947e;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o0(io.ktor.server.testing.w0 r13, java.lang.Object r14, j00.c<? super cx.f0> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof ry.l.c
            if (r0 == 0) goto L13
            r0 = r15
            ry.l$c r0 = (ry.l.c) r0
            int r1 = r0.f86966h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f86966h = r1
            goto L18
        L13:
            ry.l$c r0 = new ry.l$c
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f86964f
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f86966h
            r3 = 1
            if (r2 == 0) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r14 = r0.f86963e
            java.lang.Object r13 = r0.f86962d
            ix.f1 r13 = (ix.f1) r13
            java.lang.Object r1 = r0.f86961c
            ix.q0 r1 = (ix.q0) r1
            java.lang.Object r2 = r0.f86960b
            bz.b r2 = (bz.b) r2
            java.lang.Object r0 = r0.f86959a
            ix.g1 r0 = (ix.g1) r0
            kotlin.e.n(r15)
            r9 = r13
            r6 = r0
            r8 = r1
            r7 = r2
        L3e:
            r10 = r14
            goto L9e
        L40:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L48:
            kotlin.e.n(r15)
            ix.g1 r15 = r12.C0(r13)
            r2 = 0
            bz.b r4 = io.ktor.util.date.a.c(r2, r3, r2)
            qy.q r13 = r13.a()
            ix.q0 r13 = r13.a()
            boolean r5 = r13.isEmpty()
            if (r5 != 0) goto L63
            goto L64
        L63:
            r13 = r2
        L64:
            if (r13 != 0) goto L7f
            ix.q0$a r13 = ix.q0.f62976a
            ix.r0 r13 = new ix.r0
            r5 = 0
            r13.<init>(r5, r3, r2)
            ix.y0 r2 = ix.y0.f63006a
            java.lang.String r2 = r2.z()
            java.lang.String r5 = "0"
            r13.k(r2, r5)
            yz.g2 r2 = yz.g2.f100423a
            ix.q0 r13 = r13.build()
        L7f:
            ix.f1$a r2 = ix.f1.f62772d
            ix.f1 r2 = r2.c()
            r0.f86959a = r15
            r0.f86960b = r4
            r0.f86961c = r13
            r0.f86962d = r2
            r0.f86963e = r14
            r0.f86966h = r3
            java.lang.Object r0 = ow.u.e(r0)
            if (r0 != r1) goto L98
            return r1
        L98:
            r8 = r13
            r6 = r15
            r15 = r0
            r9 = r2
            r7 = r4
            goto L3e
        L9e:
            r11 = r15
            kotlin.coroutines.d r11 = (kotlin.coroutines.d) r11
            cx.f0 r5 = new cx.f0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ry.l.o0(io.ktor.server.testing.w0, java.lang.Object, j00.c):java.lang.Object");
    }

    public final Object v0(final e1 e1Var, final t2 t2Var, final q0 q0Var, final mx.v vVar, final h2 h2Var, final d1 d1Var, j00.c<? super f0> cVar) {
        return TestApplicationEngine.R(this.f86948f, false, d1Var, new x00.l() { // from class: ry.k
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 z02;
                z02 = l.z0(t2.this, e1Var, this, q0Var, vVar, h2Var, d1Var, (io.ktor.server.testing.u0) obj);
                return z02;
            }
        }, cVar, 1, null);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 TestHttpClientEngine.kt\nio/ktor/server/testing/client/TestHttpClientEngine\n*L\n1#1,48:1\n40#2:49\n*E\n"})
    public static final class d extends kotlin.coroutines.a implements n0 {
        public d(n0.b bVar) {
            super(bVar);
        }

        @Override // c40.n0
        public void handleException(kotlin.coroutines.d dVar, Throwable th2) {
        }
    }
}
