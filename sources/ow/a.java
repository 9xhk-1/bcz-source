package ow;

import a00.w1;
import c40.l2;
import c40.m0;
import c40.r0;
import cx.f0;
import cx.y;
import cx.z;
import io.ktor.client.engine.ClientEngineClosedException;
import io.ktor.utils.io.b0;
import java.io.Closeable;
import java.util.Set;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface a extends r0, Closeable {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nHttpClientEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpClientEngine.kt\nio/ktor/client/engine/HttpClientEngine$DefaultImpls\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n1#2:164\n*E\n"})
    /* renamed from: ow.a$a, reason: collision with other inner class name */
    public static final class C0962a {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.client.engine.HttpClientEngine$DefaultImpls", f = "HttpClientEngine.kt", i = {0, 0}, l = {91, 100}, m = "executeWithinCallContext", n = {"$this", "requestData"}, s = {"L$0", "L$1"})
        /* renamed from: ow.a$a$a, reason: collision with other inner class name */
        public static final class C0963a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            public Object f78427a;

            /* renamed from: b, reason: collision with root package name */
            public Object f78428b;

            /* renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f78429c;

            /* renamed from: d, reason: collision with root package name */
            public int f78430d;

            public C0963a(j00.c<? super C0963a> cVar) {
                super(cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @m80.l
            public final Object invokeSuspend(@m80.k Object obj) {
                this.f78429c = obj;
                this.f78430d |= Integer.MIN_VALUE;
                return C0962a.e(null, null, this);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$2", f = "HttpClientEngine.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: ow.a$a$b */
        public static final class b extends SuspendLambda implements x00.p<r0, j00.c<? super f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f78431a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f78432b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ z f78433c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(a aVar, z zVar, j00.c<? super b> cVar) {
                super(2, cVar);
                this.f78432b = aVar;
                this.f78433c = zVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new b(this.f78432b, this.f78433c, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super f0> cVar) {
                return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f78431a;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                    return obj;
                }
                kotlin.e.n(obj);
                if (C0962a.f(this.f78432b)) {
                    throw new ClientEngineClosedException(null, 1, null);
                }
                a aVar = this.f78432b;
                z zVar = this.f78433c;
                this.f78431a = 1;
                Object B0 = aVar.B0(zVar, this);
                return B0 == l11 ? l11 : B0;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.client.engine.HttpClientEngine$install$1", f = "HttpClientEngine.kt", i = {0, 0}, l = {70, 82}, m = "invokeSuspend", n = {"$this$intercept", "requestData"}, s = {"L$0", "L$1"})
        @u0({"SMAP\nHttpClientEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpClientEngine.kt\nio/ktor/client/engine/HttpClientEngine$install$1\n+ 2 RequestBody.kt\nio/ktor/client/request/RequestBodyKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,163:1\n16#2,4:164\n21#2,10:184\n58#3,16:168\n*S KotlinDebug\n*F\n+ 1 HttpClientEngine.kt\nio/ktor/client/engine/HttpClientEngine$install$1\n*L\n58#1:164,4\n58#1:184,10\n58#1:168,16\n*E\n"})
        /* renamed from: ow.a$a$c */
        public static final class c extends SuspendLambda implements x00.q<io.ktor.util.pipeline.d<Object, y>, Object, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f78434a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f78435b;

            /* renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f78436c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ lw.c f78437d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ a f78438e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(lw.c cVar, a aVar, j00.c<? super c> cVar2) {
                super(3, cVar2);
                this.f78437d = cVar;
                this.f78438e = aVar;
            }

            public static final g2 j(lw.c cVar, ex.c cVar2, Throwable th2) {
                if (th2 != null) {
                    cVar.Z().b(fx.e.c(), cVar2);
                }
                return g2.f100423a;
            }

            @Override // x00.q
            public final Object invoke(io.ktor.util.pipeline.d<Object, y> dVar, Object obj, j00.c<? super g2> cVar) {
                c cVar2 = new c(this.f78437d, this.f78438e, cVar);
                cVar2.f78435b = dVar;
                cVar2.f78436c = obj;
                return cVar2.invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x00ee, code lost:
            
                if (r3.i(r5, r9) == r0) goto L31;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r9.f78434a
                    r2 = 2
                    r3 = 1
                    r4 = 0
                    if (r1 == 0) goto L29
                    if (r1 == r3) goto L1c
                    if (r1 != r2) goto L14
                    kotlin.e.n(r10)
                    goto Lf1
                L14:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L1c:
                    java.lang.Object r1 = r9.f78436c
                    cx.z r1 = (cx.z) r1
                    java.lang.Object r3 = r9.f78435b
                    io.ktor.util.pipeline.d r3 = (io.ktor.util.pipeline.d) r3
                    kotlin.e.n(r10)
                    goto Lb8
                L29:
                    kotlin.e.n(r10)
                    java.lang.Object r10 = r9.f78435b
                    io.ktor.util.pipeline.d r10 = (io.ktor.util.pipeline.d) r10
                    java.lang.Object r1 = r9.f78436c
                    cx.y r5 = new cx.y
                    r5.<init>()
                    java.lang.Object r6 = r10.d()
                    cx.y r6 = (cx.y) r6
                    r5.s(r6)
                    java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
                    if (r1 != 0) goto L5c
                    mx.u r1 = mx.u.f73831a
                    r5.l(r1)
                    h10.d r1 = kotlin.jvm.internal.o0.d(r6)
                    h10.r r6 = kotlin.jvm.internal.o0.B(r6)     // Catch: java.lang.Throwable -> L52
                    goto L53
                L52:
                    r6 = r4
                L53:
                    gz.a r7 = new gz.a
                    r7.<init>(r1, r6)
                    r5.m(r7)
                    goto L7c
                L5c:
                    boolean r7 = r1 instanceof mx.v
                    if (r7 == 0) goto L67
                    r5.l(r1)
                    r5.m(r4)
                    goto L7c
                L67:
                    r5.l(r1)
                    h10.d r1 = kotlin.jvm.internal.o0.d(r6)
                    h10.r r6 = kotlin.jvm.internal.o0.B(r6)     // Catch: java.lang.Throwable -> L73
                    goto L74
                L73:
                    r6 = r4
                L74:
                    gz.a r7 = new gz.a
                    r7.<init>(r1, r6)
                    r5.m(r7)
                L7c:
                    lw.c r1 = r9.f78437d
                    hx.c r1 = r1.Z()
                    hx.a r6 = fx.e.b()
                    r1.b(r6, r5)
                    cx.z r1 = r5.c()
                    lw.c r5 = r9.f78437d
                    xy.b r6 = r1.a()
                    xy.a r7 = ow.n.e()
                    lw.j r5 = r5.H()
                    r6.e(r7, r5)
                    ow.n.a(r1)
                    ow.a r5 = r9.f78438e
                    ow.a.C0962a.a(r5, r1)
                    ow.a r5 = r9.f78438e
                    r9.f78435b = r10
                    r9.f78436c = r1
                    r9.f78434a = r3
                    java.lang.Object r3 = ow.a.C0962a.b(r5, r1, r9)
                    if (r3 != r0) goto Lb5
                    goto Lf0
                Lb5:
                    r8 = r3
                    r3 = r10
                    r10 = r8
                Lb8:
                    cx.f0 r10 = (cx.f0) r10
                    mw.a r5 = new mw.a
                    lw.c r6 = r9.f78437d
                    r5.<init>(r6, r1, r10)
                    ex.c r10 = r5.i()
                    lw.c r1 = r9.f78437d
                    hx.c r1 = r1.Z()
                    hx.a r6 = fx.e.e()
                    r1.b(r6, r10)
                    kotlin.coroutines.d r1 = r10.getCoroutineContext()
                    c40.l2 r1 = c40.n2.A(r1)
                    lw.c r6 = r9.f78437d
                    ow.b r7 = new ow.b
                    r7.<init>()
                    r1.z0(r7)
                    r9.f78435b = r4
                    r9.f78436c = r4
                    r9.f78434a = r2
                    java.lang.Object r10 = r3.i(r5, r9)
                    if (r10 != r0) goto Lf1
                Lf0:
                    return r0
                Lf1:
                    yz.g2 r10 = yz.g2.f100423a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: ow.a.C0962a.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public static void d(a aVar, z zVar) {
            for (h<?> hVar : zVar.g()) {
                if (!aVar.D2().contains(hVar)) {
                    throw new IllegalArgumentException(("Engine doesn't support " + hVar).toString());
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
        
            if (r12 == r1) goto L23;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x007a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x007b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.Object e(ow.a r10, cx.z r11, j00.c<? super cx.f0> r12) {
            /*
                boolean r0 = r12 instanceof ow.a.C0962a.C0963a
                if (r0 == 0) goto L13
                r0 = r12
                ow.a$a$a r0 = (ow.a.C0962a.C0963a) r0
                int r1 = r0.f78430d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f78430d = r1
                goto L18
            L13:
                ow.a$a$a r0 = new ow.a$a$a
                r0.<init>(r12)
            L18:
                java.lang.Object r12 = r0.f78429c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f78430d
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L42
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.e.n(r12)
                return r12
            L2c:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L34:
                java.lang.Object r10 = r0.f78428b
                r11 = r10
                cx.z r11 = (cx.z) r11
                java.lang.Object r10 = r0.f78427a
                ow.a r10 = (ow.a) r10
                kotlin.e.n(r12)
            L40:
                r4 = r10
                goto L56
            L42:
                kotlin.e.n(r12)
                c40.l2 r12 = r11.d()
                r0.f78427a = r10
                r0.f78428b = r11
                r0.f78430d = r4
                java.lang.Object r12 = ow.n.c(r10, r12, r0)
                if (r12 != r1) goto L40
                goto L7a
            L56:
                kotlin.coroutines.d r12 = (kotlin.coroutines.d) r12
                ow.o r10 = new ow.o
                r10.<init>(r12)
                kotlin.coroutines.d r5 = r12.plus(r10)
                ow.a$a$b r7 = new ow.a$a$b
                r10 = 0
                r7.<init>(r4, r11, r10)
                r8 = 2
                r9 = 0
                r6 = 0
                c40.x0 r11 = c40.i.b(r4, r5, r6, r7, r8, r9)
                r0.f78427a = r10
                r0.f78428b = r10
                r0.f78430d = r3
                java.lang.Object r10 = r11.i(r0)
                if (r10 != r1) goto L7b
            L7a:
                return r1
            L7b:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: ow.a.C0962a.e(ow.a, cx.z, j00.c):java.lang.Object");
        }

        public static boolean f(a aVar) {
            return !(((l2) aVar.getCoroutineContext().get(l2.f7886e0)) != null ? r1.isActive() : false);
        }

        @m80.k
        public static Set<h<?>> g(@m80.k a aVar) {
            return w1.k();
        }

        @b0
        public static void h(@m80.k a aVar, @m80.k lw.c client) {
            g0.p(client, "client");
            client.v0().C(cx.g0.f46880h.b(), new c(client, aVar, null));
        }
    }

    @m80.l
    @b0
    Object B0(@m80.k z zVar, @m80.k j00.c<? super f0> cVar);

    @m80.k
    Set<h<?>> D2();

    @m80.k
    m0 E8();

    @m80.k
    j getConfig();

    @b0
    void z5(@m80.k lw.c cVar);
}
