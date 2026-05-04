package io.ktor.server.testing;

import androidx.core.app.NotificationCompat;
import c40.l2;
import c40.n2;
import com.jiongji.andriod.card.R;
import io.ktor.server.engine.k;
import io.ktor.server.engine.o1;
import io.ktor.server.engine.r1;
import io.ktor.server.engine.s1;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nTestApplicationEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestApplicationEngine.kt\nio/ktor/server/testing/TestApplicationEngine\n+ 2 ApplicationCallPipeline.kt\nio/ktor/server/application/ApplicationCallPipelineKt\n+ 3 ApplicationResponseFunctions.kt\nio/ktor/server/response/ApplicationResponseFunctionsKt\n+ 4 Type.kt\nio/ktor/util/reflect/TypeKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,220:1\n79#2:221\n79#2:222\n25#3:223\n26#3:240\n58#4,16:224\n1#5:241\n*S KotlinDebug\n*F\n+ 1 TestApplicationEngine.kt\nio/ktor/server/testing/TestApplicationEngine\n*L\n109#1:221\n122#1:222\n122#1:223\n122#1:240\n122#1:224,16\n*E\n"})
/* loaded from: classes8.dex */
public final class TestApplicationEngine extends io.ktor.server.engine.k implements c40.r0 {

    @m80.k
    private volatile /* synthetic */ Object _callInterceptor;

    @m80.k
    private volatile /* synthetic */ Object _client;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final x00.a<zx.a> f61782e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final b f61783f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final c40.a0 f61784g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    public c40.a0 f61785h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f61786i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final ow.a f61787j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public x00.p<? super u0, ? super x00.l<? super u0, g2>, g2> f61788k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public x00.l<? super f0, g2> f61789l;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.testing.TestApplicationEngine$2", f = "TestApplicationEngine.kt", i = {0}, l = {R.styleable.Theme_drawable_sound, 103}, m = "invokeSuspend", n = {"<this>"}, s = {"L$0"})
    @kotlin.jvm.internal.u0({"SMAP\nTestApplicationEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestApplicationEngine.kt\nio/ktor/server/testing/TestApplicationEngine$2\n+ 2 ApplicationCallPipeline.kt\nio/ktor/server/application/ApplicationCallPipelineKt\n+ 3 Pipeline.kt\nio/ktor/util/pipeline/PipelineKt\n*L\n1#1,220:1\n79#2:221\n487#3,4:222\n*S KotlinDebug\n*F\n+ 1 TestApplicationEngine.kt\nio/ktor/server/testing/TestApplicationEngine$2\n*L\n101#1:221\n101#1:222,4\n*E\n"})
    /* renamed from: io.ktor.server.testing.TestApplicationEngine$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements x00.q<io.ktor.util.pipeline.d<g2, zx.k0>, g2, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f61790a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f61791b;

        public AnonymousClass2(j00.c<? super AnonymousClass2> cVar) {
            super(3, cVar);
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.util.pipeline.d<g2, zx.k0> dVar, g2 g2Var, j00.c<? super g2> cVar) {
            AnonymousClass2 anonymousClass2 = TestApplicationEngine.this.new AnonymousClass2(cVar);
            anonymousClass2.f61791b = dVar;
            return anonymousClass2.invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
        
            if (cz.a.b(r6, r7) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
        
            if (r4.T(r1, r8, r7) != r0) goto L21;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [io.ktor.util.pipeline.d] */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v8 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.f61790a
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L25
                if (r1 == r4) goto L1b
                if (r1 != r3) goto L13
                kotlin.e.n(r8)
                goto L5a
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                java.lang.Object r1 = r7.f61791b
                io.ktor.util.pipeline.d r1 = (io.ktor.util.pipeline.d) r1
                kotlin.e.n(r8)     // Catch: java.lang.Throwable -> L23
                goto L5a
            L23:
                r8 = move-exception
                goto L4d
            L25:
                kotlin.e.n(r8)
                java.lang.Object r8 = r7.f61791b
                r1 = r8
                io.ktor.util.pipeline.d r1 = (io.ktor.util.pipeline.d) r1
                java.lang.Object r8 = r1.d()     // Catch: java.lang.Throwable -> L23
                zx.k0 r8 = (zx.k0) r8     // Catch: java.lang.Throwable -> L23
                zx.a r8 = r8.w0()     // Catch: java.lang.Throwable -> L23
                java.lang.Object r5 = r1.d()     // Catch: java.lang.Throwable -> L23
                zx.k0 r5 = (zx.k0) r5     // Catch: java.lang.Throwable -> L23
                io.ktor.server.testing.TestApplicationEngine$2$invokeSuspend$$inlined$execute$1 r6 = new io.ktor.server.testing.TestApplicationEngine$2$invokeSuspend$$inlined$execute$1     // Catch: java.lang.Throwable -> L23
                r6.<init>(r8, r5, r2)     // Catch: java.lang.Throwable -> L23
                r7.f61791b = r1     // Catch: java.lang.Throwable -> L23
                r7.f61790a = r4     // Catch: java.lang.Throwable -> L23
                java.lang.Object r8 = cz.a.b(r6, r7)     // Catch: java.lang.Throwable -> L23
                if (r8 != r0) goto L5a
                goto L59
            L4d:
                io.ktor.server.testing.TestApplicationEngine r4 = io.ktor.server.testing.TestApplicationEngine.this
                r7.f61791b = r2
                r7.f61790a = r3
                java.lang.Object r8 = io.ktor.server.testing.TestApplicationEngine.B(r4, r1, r8, r7)
                if (r8 != r0) goto L5a
            L59:
                return r0
            L5a:
                yz.g2 r8 = yz.g2.f100423a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.testing.TestApplicationEngine.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.testing.TestApplicationEngine$1", f = "TestApplicationEngine.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements x00.q<io.ktor.util.pipeline.d<g2, zx.k0>, g2, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f61793a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f61794b;

        public a(j00.c<? super a> cVar) {
            super(3, cVar);
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.util.pipeline.d<g2, zx.k0> dVar, g2 g2Var, j00.c<? super g2> cVar) {
            a aVar = TestApplicationEngine.this.new a(cVar);
            aVar.f61794b = dVar;
            return aVar.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f61793a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                io.ktor.util.pipeline.d<g2, zx.k0> dVar = (io.ktor.util.pipeline.d) this.f61794b;
                x00.q<io.ktor.util.pipeline.d<g2, zx.k0>, g2, j00.c<? super g2>, Object> K = TestApplicationEngine.this.K();
                g2 g2Var = g2.f100423a;
                this.f61793a = 1;
                if (K.invoke(dVar, g2Var, this) == l11) {
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

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends k.a {

        /* renamed from: h, reason: collision with root package name */
        @m80.k
        public kotlin.coroutines.d f61796h = sy.a.a(c40.h1.f7863a);

        public b() {
            k(0L);
            k(0L);
        }

        @m80.k
        public final kotlin.coroutines.d o() {
            return this.f61796h;
        }

        public final void p(@m80.k kotlin.coroutines.d dVar) {
            kotlin.jvm.internal.g0.p(dVar, "<set-?>");
            this.f61796h = dVar;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.testing.TestApplicationEngine", f = "TestApplicationEngine.kt", i = {0, 0, 0}, l = {186}, m = "handleRequest$ktor_server_test_host", n = {"this", NotificationCompat.CATEGORY_CALL, c90.k.f8409a}, s = {"L$0", "L$1", "L$2"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f61797a;

        /* renamed from: b, reason: collision with root package name */
        public Object f61798b;

        /* renamed from: c, reason: collision with root package name */
        public Object f61799c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f61800d;

        /* renamed from: f, reason: collision with root package name */
        public int f61802f;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f61800d = obj;
            this.f61802f |= Integer.MIN_VALUE;
            return TestApplicationEngine.this.Q(false, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.testing.TestApplicationEngine", f = "TestApplicationEngine.kt", i = {0, 0, 0}, l = {109, 114}, m = "handleTestFailure", n = {"this", "$this$handleTestFailure", "cause"}, s = {"L$0", "L$1", "L$2"})
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f61803a;

        /* renamed from: b, reason: collision with root package name */
        public Object f61804b;

        /* renamed from: c, reason: collision with root package name */
        public Object f61805c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f61806d;

        /* renamed from: f, reason: collision with root package name */
        public int f61808f;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f61806d = obj;
            this.f61808f |= Integer.MIN_VALUE;
            return TestApplicationEngine.this.T(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e implements o1 {

        /* renamed from: a, reason: collision with root package name */
        public final io.ktor.server.engine.z f61809a = io.ktor.server.engine.z.f61475b.a();

        /* renamed from: b, reason: collision with root package name */
        public final String f61810b = "localhost";

        /* renamed from: c, reason: collision with root package name */
        public final int f61811c = 80;

        @Override // io.ktor.server.engine.o1
        public int a() {
            return this.f61811c;
        }

        @Override // io.ktor.server.engine.o1
        public String b() {
            return this.f61810b;
        }

        @Override // io.ktor.server.engine.o1
        public io.ktor.server.engine.z getType() {
            return this.f61809a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f implements o1 {

        /* renamed from: a, reason: collision with root package name */
        public final io.ktor.server.engine.z f61812a = io.ktor.server.engine.z.f61475b.b();

        /* renamed from: b, reason: collision with root package name */
        public final String f61813b = "localhost";

        /* renamed from: c, reason: collision with root package name */
        public final int f61814c = 443;

        @Override // io.ktor.server.engine.o1
        public int a() {
            return this.f61814c;
        }

        @Override // io.ktor.server.engine.o1
        public String b() {
            return this.f61813b;
        }

        @Override // io.ktor.server.engine.o1
        public io.ktor.server.engine.z getType() {
            return this.f61812a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.testing.TestApplicationEngine$start$2", f = "TestApplicationEngine.kt", i = {}, l = {153}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f61815a;

        /* renamed from: b, reason: collision with root package name */
        public int f61816b;

        public g(j00.c<? super g> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return TestApplicationEngine.this.new g(cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
            return ((g) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            c40.x xVar;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f61816b;
            if (i11 == 0) {
                kotlin.e.n(obj);
                c40.x s11 = TestApplicationEngine.this.s();
                TestApplicationEngine testApplicationEngine = TestApplicationEngine.this;
                this.f61815a = s11;
                this.f61816b = 1;
                Object i12 = testApplicationEngine.i(this);
                if (i12 == l11) {
                    return l11;
                }
                xVar = s11;
                obj = i12;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                xVar = (c40.x) this.f61815a;
                kotlin.e.n(obj);
            }
            xVar.c0(obj);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.testing.TestApplicationEngine", f = "TestApplicationEngine.kt", i = {}, l = {R.styleable.Theme_drawable_sound}, m = "tryRespondError", n = {}, s = {})
    public static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f61818a;

        /* renamed from: c, reason: collision with root package name */
        public int f61820c;

        public h(j00.c<? super h> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f61818a = obj;
            this.f61820c |= Integer.MIN_VALUE;
            return TestApplicationEngine.this.b0(null, null, this);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ TestApplicationEngine(zx.f r2, hx.c r3, boolean r4, x00.a r5, io.ktor.server.testing.TestApplicationEngine.b r6, int r7, kotlin.jvm.internal.v r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            r0 = 1
            if (r8 == 0) goto La
            r2 = 0
            zx.f r2 = io.ktor.server.testing.g1.i(r2, r0, r2)
        La:
            r7 = r7 & 4
            r8 = r6
            if (r7 == 0) goto L15
            r6 = r0
            r4 = r2
            r7 = r5
            r5 = r3
            r3 = r1
            goto L1a
        L15:
            r6 = r4
            r7 = r5
            r5 = r3
            r3 = r1
            r4 = r2
        L1a:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.testing.TestApplicationEngine.<init>(zx.f, hx.c, boolean, x00.a, io.ktor.server.testing.TestApplicationEngine$b, int, kotlin.jvm.internal.v):void");
    }

    public static /* synthetic */ f0 F(TestApplicationEngine testApplicationEngine, boolean z11, boolean z12, kotlin.coroutines.d dVar, x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        if ((i11 & 4) != 0) {
            dVar = sy.a.a(c40.h1.f7863a);
        }
        return testApplicationEngine.D(z11, z12, dVar, lVar);
    }

    public static final g2 H(String str, TestApplicationEngine testApplicationEngine, x00.l lVar, u0 createCall) {
        kotlin.jvm.internal.g0.p(createCall, "$this$createCall");
        createCall.M(str);
        ix.y0 y0Var = ix.y0.f63006a;
        createCall.v(y0Var.v(), "Upgrade");
        createCall.v(y0Var.K0(), "websocket");
        createCall.v(y0Var.x0(), xy.f.g(jz.s.m("test", null, 1, null)));
        testApplicationEngine.f61788k.invoke(createCall, lVar);
        return g2.f100423a;
    }

    public static final g2 J(TestApplicationEngine testApplicationEngine, ry.i create) {
        kotlin.jvm.internal.g0.p(create, "$this$create");
        create.k(testApplicationEngine);
        return g2.f100423a;
    }

    public static /* synthetic */ Object R(TestApplicationEngine testApplicationEngine, boolean z11, rw.d1 d1Var, x00.l lVar, j00.c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            d1Var = null;
        }
        return testApplicationEngine.Q(z11, d1Var, lVar, cVar);
    }

    public static final g2 S(TestApplicationEngine testApplicationEngine, x00.l lVar, u0 createCall) {
        kotlin.jvm.internal.g0.p(createCall, "$this$createCall");
        testApplicationEngine.f61788k.invoke(createCall, lVar);
        return g2.f100423a;
    }

    public static final g2 V(u0 u0Var, x00.l it) {
        kotlin.jvm.internal.g0.p(u0Var, "<this>");
        kotlin.jvm.internal.g0.p(it, "it");
        it.invoke(u0Var);
        return g2.f100423a;
    }

    public static final g2 W(f0 f0Var) {
        kotlin.jvm.internal.g0.p(f0Var, "<this>");
        return g2.f100423a;
    }

    public final f0 D(boolean z11, boolean z12, kotlin.coroutines.d dVar, x00.l<? super u0, g2> lVar) {
        f0 f0Var = new f0(this.f61782e.invoke(), z11, z12, dVar);
        lVar.invoke(f0Var.a());
        return f0Var;
    }

    @m80.k
    public final f0 G(@m80.k final String uri, @m80.k final x00.l<? super u0, g2> setup) {
        kotlin.jvm.internal.g0.p(uri, "uri");
        kotlin.jvm.internal.g0.p(setup, "setup");
        return F(this, false, false, null, new x00.l() { // from class: io.ktor.server.testing.k0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 H;
                H = TestApplicationEngine.H(uri, this, setup, (u0) obj);
                return H;
            }
        }, 5, null);
    }

    @m80.k
    public final x00.q<io.ktor.util.pipeline.d<g2, zx.k0>, g2, j00.c<? super g2>, Object> K() {
        Object obj = this._callInterceptor;
        kotlin.jvm.internal.g0.m(obj);
        return (x00.q) obj;
    }

    @m80.k
    public final lw.c M() {
        Object obj = this._client;
        kotlin.jvm.internal.g0.m(obj);
        return (lw.c) obj;
    }

    @m80.k
    public final b N() {
        return this.f61783f;
    }

    @m80.k
    public final ow.a O() {
        return this.f61787j;
    }

    @m80.k
    public final x00.l<f0, g2> P() {
        return this.f61789l;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q(boolean r7, @m80.l rw.d1 r8, @m80.k final x00.l<? super io.ktor.server.testing.u0, yz.g2> r9, @m80.k j00.c<? super io.ktor.server.testing.f0> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof io.ktor.server.testing.TestApplicationEngine.c
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.server.testing.TestApplicationEngine$c r0 = (io.ktor.server.testing.TestApplicationEngine.c) r0
            int r1 = r0.f61802f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f61802f = r1
            goto L18
        L13:
            io.ktor.server.testing.TestApplicationEngine$c r0 = new io.ktor.server.testing.TestApplicationEngine$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f61800d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f61802f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 != r4) goto L36
            java.lang.Object r7 = r0.f61799c
            kotlin.coroutines.d r7 = (kotlin.coroutines.d) r7
            java.lang.Object r8 = r0.f61798b
            io.ktor.server.testing.f0 r8 = (io.ktor.server.testing.f0) r8
            java.lang.Object r9 = r0.f61797a
            io.ktor.server.testing.TestApplicationEngine r9 = (io.ktor.server.testing.TestApplicationEngine) r9
            kotlin.e.n(r10)
            goto L96
        L36:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3e:
            kotlin.e.n(r10)
            c40.a0 r10 = r6.f61784g
            c40.a0 r10 = c40.n2.a(r10)
            c40.h1 r2 = c40.h1.f7863a
            c40.m0 r2 = sy.a.a(r2)
            kotlin.coroutines.d r2 = r2.plus(r10)
            io.ktor.server.testing.g0 r5 = new io.ktor.server.testing.g0
            r5.<init>()
            io.ktor.server.testing.f0 r7 = r6.D(r4, r7, r2, r5)
            if (r8 == 0) goto L67
            xy.b r9 = r7.getAttributes()
            xy.a r2 = io.ktor.server.testing.o0.b()
            r9.e(r2, r8)
        L67:
            c40.a0 r8 = c40.l3.a(r10)
            c40.q0 r9 = new c40.q0
            java.lang.String r10 = "request"
            r9.<init>(r10)
            kotlin.coroutines.d r8 = r8.plus(r9)
            kotlin.coroutines.d r9 = r6.getCoroutineContext()
            kotlin.coroutines.d r9 = r9.plus(r8)
            io.ktor.server.testing.TestApplicationEngine$handleRequest$2 r10 = new io.ktor.server.testing.TestApplicationEngine$handleRequest$2
            r10.<init>(r6, r7, r3)
            r0.f61797a = r6
            r0.f61798b = r7
            r0.f61799c = r8
            r0.f61802f = r4
            java.lang.Object r9 = c40.i.h(r9, r10, r0)
            if (r9 != r1) goto L92
            return r1
        L92:
            r9 = r8
            r8 = r7
            r7 = r9
            r9 = r6
        L96:
            c40.n2.j(r7, r3, r4, r3)
            x00.l<? super io.ktor.server.testing.f0, yz.g2> r7 = r9.f61789l
            r7.invoke(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.testing.TestApplicationEngine.Q(boolean, rw.d1, x00.l, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        if (r2.b0(r7, r9, r0) != r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T(io.ktor.util.pipeline.d<yz.g2, zx.k0> r7, java.lang.Throwable r8, j00.c<? super yz.g2> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof io.ktor.server.testing.TestApplicationEngine.d
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.server.testing.TestApplicationEngine$d r0 = (io.ktor.server.testing.TestApplicationEngine.d) r0
            int r1 = r0.f61808f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f61808f = r1
            goto L18
        L13:
            io.ktor.server.testing.TestApplicationEngine$d r0 = new io.ktor.server.testing.TestApplicationEngine$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f61806d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f61808f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r9)
            goto L98
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r7 = r0.f61805c
            r8 = r7
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            java.lang.Object r7 = r0.f61804b
            io.ktor.util.pipeline.d r7 = (io.ktor.util.pipeline.d) r7
            java.lang.Object r2 = r0.f61803a
            io.ktor.server.testing.TestApplicationEngine r2 = (io.ktor.server.testing.TestApplicationEngine) r2
            kotlin.e.n(r9)
            goto L5e
        L45:
            kotlin.e.n(r9)
            java.lang.Object r9 = r7.d()
            zx.k0 r9 = (zx.k0) r9
            r0.f61803a = r6
            r0.f61804b = r7
            r0.f61805c = r8
            r0.f61808f = r4
            java.lang.Object r9 = io.ktor.server.engine.DefaultEnginePipelineKt.f(r9, r8, r0)
            if (r9 != r1) goto L5d
            goto L97
        L5d:
            r2 = r6
        L5e:
            zx.f r9 = r2.a()
            ey.a r9 = r9.getConfig()
            java.lang.String r5 = "ktor.test.throwOnException"
            ey.c r9 = r9.d(r5)
            if (r9 == 0) goto L78
            java.lang.String r9 = r9.getString()
            if (r9 == 0) goto L78
            boolean r4 = java.lang.Boolean.parseBoolean(r9)
        L78:
            ix.g1 r9 = io.ktor.server.engine.DefaultEnginePipelineKt.d(r8)
            if (r9 != 0) goto L88
            if (r4 != 0) goto L87
            ix.g1$a r8 = ix.g1.f62797c
            ix.g1 r9 = r8.p()
            goto L88
        L87:
            throw r8
        L88:
            r8 = 0
            r0.f61803a = r8
            r0.f61804b = r8
            r0.f61805c = r8
            r0.f61808f = r3
            java.lang.Object r7 = r2.b0(r7, r9, r0)
            if (r7 != r1) goto L98
        L97:
            return r1
        L98:
            yz.g2 r7 = yz.g2.f100423a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.testing.TestApplicationEngine.T(io.ktor.util.pipeline.d, java.lang.Throwable, j00.c):java.lang.Object");
    }

    public final void Y(@m80.k x00.q<? super io.ktor.util.pipeline.d<g2, zx.k0>, ? super g2, ? super j00.c<? super g2>, ? extends Object> value) {
        kotlin.jvm.internal.g0.p(value, "value");
        this._callInterceptor = value;
    }

    public final void Z(@m80.k x00.l<? super f0, g2> lVar) {
        kotlin.jvm.internal.g0.p(lVar, "<set-?>");
        this.f61789l = lVar;
    }

    @Override // io.ktor.server.engine.a
    @m80.k
    public io.ktor.server.engine.a b(boolean z11) {
        if (!this.f61784g.isActive()) {
            throw new IllegalStateException("Test engine is already completed");
        }
        this.f61785h = r1.b(this, this.f61782e.invoke(), this.f61783f.e(), this.f61783f.f());
        c40.k.f(this, null, CoroutineStart.UNDISPATCHED, new g(null), 1, null);
        return this;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(6:18|19|20|21|22|(1:24))|11|12|13))|28|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b0(io.ktor.util.pipeline.d<yz.g2, zx.k0> r6, ix.g1 r7, j00.c<? super yz.g2> r8) {
        /*
            r5 = this;
            java.lang.Class<ix.g1> r0 = ix.g1.class
            boolean r1 = r8 instanceof io.ktor.server.testing.TestApplicationEngine.h
            if (r1 == 0) goto L15
            r1 = r8
            io.ktor.server.testing.TestApplicationEngine$h r1 = (io.ktor.server.testing.TestApplicationEngine.h) r1
            int r2 = r1.f61820c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f61820c = r2
            goto L1a
        L15:
            io.ktor.server.testing.TestApplicationEngine$h r1 = new io.ktor.server.testing.TestApplicationEngine$h
            r1.<init>(r8)
        L1a:
            java.lang.Object r8 = r1.f61818a
            java.lang.Object r2 = kotlin.coroutines.intrinsics.b.l()
            int r3 = r1.f61820c
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 != r4) goto L2b
            kotlin.e.n(r8)     // Catch: io.ktor.server.engine.BaseApplicationResponse.ResponseAlreadySentException -> L54
            goto L54
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.e.n(r8)
            java.lang.Object r6 = r6.d()     // Catch: io.ktor.server.engine.BaseApplicationResponse.ResponseAlreadySentException -> L54
            zx.k0 r6 = (zx.k0) r6     // Catch: io.ktor.server.engine.BaseApplicationResponse.ResponseAlreadySentException -> L54
            h10.d r8 = kotlin.jvm.internal.o0.d(r0)     // Catch: io.ktor.server.engine.BaseApplicationResponse.ResponseAlreadySentException -> L54
            h10.r r0 = kotlin.jvm.internal.o0.B(r0)     // Catch: java.lang.Throwable -> L45
            goto L46
        L45:
            r0 = 0
        L46:
            gz.a r3 = new gz.a     // Catch: io.ktor.server.engine.BaseApplicationResponse.ResponseAlreadySentException -> L54
            r3.<init>(r8, r0)     // Catch: io.ktor.server.engine.BaseApplicationResponse.ResponseAlreadySentException -> L54
            r1.f61820c = r4     // Catch: io.ktor.server.engine.BaseApplicationResponse.ResponseAlreadySentException -> L54
            java.lang.Object r6 = r6.E(r7, r3, r1)     // Catch: io.ktor.server.engine.BaseApplicationResponse.ResponseAlreadySentException -> L54
            if (r6 != r2) goto L54
            return r2
        L54:
            yz.g2 r6 = yz.g2.f100423a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.testing.TestApplicationEngine.b0(io.ktor.util.pipeline.d, ix.g1, j00.c):java.lang.Object");
    }

    @Override // io.ktor.server.engine.a
    public void d(long j11, long j12) {
        try {
            c40.a0 a0Var = this.f61785h;
            if (a0Var != null) {
                a0Var.complete();
            }
            M().close();
            this.f61787j.close();
            p().b(zx.c0.c(), a());
            l2.a.b(this.f61784g, null, 1, null);
        } catch (Throwable th2) {
            l2.a.b(this.f61784g, null, 1, null);
            throw th2;
        }
    }

    @Override // c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f61786i;
    }

    @Override // io.ktor.server.engine.k, io.ktor.server.engine.a
    @m80.l
    public Object i(@m80.k j00.c<? super List<? extends o1>> cVar) {
        return !this.f61783f.c().isEmpty() ? this.f61783f.c() : a00.h0.Q(new e(), new f());
    }

    @m80.k
    public final zx.a w0() {
        return this.f61782e.invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TestApplicationEngine(@m80.k zx.f environment, @m80.k hx.c monitor, boolean z11, @m80.k x00.a<zx.a> applicationProvider, @m80.k b configuration) {
        super(environment, monitor, z11, new s1(z11));
        kotlin.jvm.internal.g0.p(environment, "environment");
        kotlin.jvm.internal.g0.p(monitor, "monitor");
        kotlin.jvm.internal.g0.p(applicationProvider, "applicationProvider");
        kotlin.jvm.internal.g0.p(configuration, "configuration");
        this.f61782e = applicationProvider;
        this.f61783f = configuration;
        c40.a0 a11 = n2.a((l2) applicationProvider.invoke().o0().get(l2.f7886e0));
        this.f61784g = a11;
        this.f61786i = applicationProvider.invoke().o0().plus(a11).plus(configuration.o());
        this._callInterceptor = null;
        ow.a a12 = ry.l.f86946k.a(new x00.l() { // from class: io.ktor.server.testing.h0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 J;
                J = TestApplicationEngine.J(TestApplicationEngine.this, (ry.i) obj);
                return J;
            }
        });
        this.f61787j = a12;
        this._client = null;
        this.f61788k = new x00.p() { // from class: io.ktor.server.testing.i0
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                g2 V;
                V = TestApplicationEngine.V((u0) obj, (x00.l) obj2);
                return V;
            }
        };
        this.f61789l = new x00.l() { // from class: io.ktor.server.testing.j0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 W;
                W = TestApplicationEngine.W((f0) obj);
                return W;
            }
        };
        r().C(s1.f61434j.b(), new a(null));
        this._client = new lw.c(a12, null, 2, 0 == true ? 1 : 0);
        this._callInterceptor = new AnonymousClass2(null);
    }
}
