package yw;

import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import x00.p;
import x00.q;
import yw.a;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final sw.b<h> f100352a = sw.i.b("ResponseObserver", a.f100353a, new x00.l() { // from class: yw.j
        @Override // x00.l
        public final Object invoke(Object obj) {
            g2 d11;
            d11 = l.d((sw.d) obj);
            return d11;
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a extends FunctionReferenceImpl implements x00.a<h> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f100353a = new a();

        public a() {
            super(0, h.class, "<init>", "<init>()V", 0);
        }

        @Override // x00.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h invoke() {
            return new h();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1", f = "ResponseObserver.kt", i = {0, 0, 0}, l = {63, 72}, m = "invokeSuspend", n = {"$this$on", "newResponse", "sideResponse"}, s = {"L$0", "L$1", "L$2"})
    public static final class b extends SuspendLambda implements q<a.C1372a, ex.c, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f100354a;

        /* renamed from: b, reason: collision with root package name */
        public Object f100355b;

        /* renamed from: c, reason: collision with root package name */
        public int f100356c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f100357d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f100358e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ x00.l<mw.a, Boolean> f100359f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ sw.d<h> f100360g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ p<ex.c, j00.c<? super g2>, Object> f100361h;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1$1", f = "ResponseObserver.kt", i = {0}, l = {64, 68}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
        @u0({"SMAP\nResponseObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponseObserver.kt\nio/ktor/client/plugins/observer/ResponseObserverKt$ResponseObserver$2$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1#2:101\n*E\n"})
        public static final class a extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f100362a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f100363b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ex.c f100364c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ p<ex.c, j00.c<? super g2>, Object> f100365d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(ex.c cVar, p<? super ex.c, ? super j00.c<? super g2>, ? extends Object> pVar, j00.c<? super a> cVar2) {
                super(2, cVar2);
                this.f100364c = cVar;
                this.f100365d = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                a aVar = new a(this.f100364c, this.f100365d, cVar);
                aVar.f100363b = obj;
                return aVar;
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
            
                if (r10 == r1) goto L28;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                    int r0 = r9.f100362a
                    r2 = 2
                    r3 = 1
                    if (r0 == 0) goto L28
                    if (r0 == r3) goto L1d
                    if (r0 != r2) goto L15
                    kotlin.e.n(r10)     // Catch: java.lang.Throwable -> L12
                    goto L6e
                L12:
                    r0 = move-exception
                    r10 = r0
                    goto L7c
                L15:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L1d:
                    java.lang.Object r0 = r9.f100363b
                    c40.r0 r0 = (c40.r0) r0
                    kotlin.e.n(r10)     // Catch: java.lang.Throwable -> L25
                    goto L40
                L25:
                    r0 = move-exception
                    r10 = r0
                    goto L46
                L28:
                    kotlin.e.n(r10)
                    java.lang.Object r10 = r9.f100363b
                    c40.r0 r10 = (c40.r0) r10
                    x00.p<ex.c, j00.c<? super yz.g2>, java.lang.Object> r0 = r9.f100365d
                    ex.c r4 = r9.f100364c
                    kotlin.Result$a r5 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L25
                    r9.f100363b = r10     // Catch: java.lang.Throwable -> L25
                    r9.f100362a = r3     // Catch: java.lang.Throwable -> L25
                    java.lang.Object r10 = r0.invoke(r4, r9)     // Catch: java.lang.Throwable -> L25
                    if (r10 != r1) goto L40
                    goto L6d
                L40:
                    yz.g2 r10 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L25
                    kotlin.Result.m6308constructorimpl(r10)     // Catch: java.lang.Throwable -> L25
                    goto L4f
                L46:
                    kotlin.Result$a r0 = kotlin.Result.Companion
                    java.lang.Object r10 = kotlin.e.a(r10)
                    kotlin.Result.m6308constructorimpl(r10)
                L4f:
                    ex.c r10 = r9.f100364c
                    io.ktor.utils.io.g r3 = r10.b()
                    boolean r10 = r3.f()
                    if (r10 != 0) goto L85
                    kotlin.Result$a r10 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L12
                    r10 = 0
                    r9.f100363b = r10     // Catch: java.lang.Throwable -> L12
                    r9.f100362a = r2     // Catch: java.lang.Throwable -> L12
                    r4 = 0
                    r7 = 1
                    r8 = 0
                    r6 = r9
                    java.lang.Object r10 = io.ktor.utils.io.j.j(r3, r4, r6, r7, r8)     // Catch: java.lang.Throwable -> L12
                    if (r10 != r1) goto L6e
                L6d:
                    return r1
                L6e:
                    java.lang.Number r10 = (java.lang.Number) r10     // Catch: java.lang.Throwable -> L12
                    long r0 = r10.longValue()     // Catch: java.lang.Throwable -> L12
                    java.lang.Long r10 = l00.a.g(r0)     // Catch: java.lang.Throwable -> L12
                    kotlin.Result.m6308constructorimpl(r10)     // Catch: java.lang.Throwable -> L12
                    goto L85
                L7c:
                    kotlin.Result$a r0 = kotlin.Result.Companion
                    java.lang.Object r10 = kotlin.e.a(r10)
                    kotlin.Result.m6308constructorimpl(r10)
                L85:
                    yz.g2 r10 = yz.g2.f100423a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: yw.l.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(x00.l<? super mw.a, Boolean> lVar, sw.d<h> dVar, p<? super ex.c, ? super j00.c<? super g2>, ? extends Object> pVar, j00.c<? super b> cVar) {
            super(3, cVar);
            this.f100359f = lVar;
            this.f100360g = dVar;
            this.f100361h = pVar;
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a.C1372a c1372a, ex.c cVar, j00.c<? super g2> cVar2) {
            b bVar = new b(this.f100359f, this.f100360g, this.f100361h, cVar2);
            bVar.f100357d = c1372a;
            bVar.f100358e = cVar;
            return bVar.invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x00be, code lost:
        
            if (r10.a(r9, r12) == r0) goto L23;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v14, types: [c40.r0] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r12.f100356c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L34
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                kotlin.e.n(r13)
                goto Lc1
            L13:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1b:
                java.lang.Object r1 = r12.f100355b
                c40.r0 r1 = (c40.r0) r1
                java.lang.Object r3 = r12.f100354a
                ex.c r3 = (ex.c) r3
                java.lang.Object r4 = r12.f100358e
                ex.c r4 = (ex.c) r4
                java.lang.Object r5 = r12.f100357d
                yw.a$a r5 = (yw.a.C1372a) r5
                kotlin.e.n(r13)
                r9 = r3
                r3 = r1
                r1 = r9
                r9 = r4
            L32:
                r10 = r5
                goto L9f
            L34:
                kotlin.e.n(r13)
                java.lang.Object r13 = r12.f100357d
                r5 = r13
                yw.a$a r5 = (yw.a.C1372a) r5
                java.lang.Object r13 = r12.f100358e
                ex.c r13 = (ex.c) r13
                x00.l<mw.a, java.lang.Boolean> r1 = r12.f100359f
                if (r1 == 0) goto L57
                mw.a r4 = r13.c()
                java.lang.Object r1 = r1.invoke(r4)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 != 0) goto L57
                yz.g2 r13 = yz.g2.f100423a
                return r13
            L57:
                io.ktor.utils.io.g r1 = r13.b()
                kotlin.Pair r1 = xy.l.e(r1, r13)
                java.lang.Object r4 = r1.component1()
                io.ktor.utils.io.g r4 = (io.ktor.utils.io.g) r4
                java.lang.Object r1 = r1.component2()
                io.ktor.utils.io.g r1 = (io.ktor.utils.io.g) r1
                mw.a r6 = r13.c()
                mw.a r1 = yw.d.b(r6, r1)
                ex.c r1 = r1.i()
                mw.a r13 = r13.c()
                mw.a r13 = yw.d.b(r13, r4)
                ex.c r13 = r13.i()
                sw.d<yw.h> r4 = r12.f100360g
                lw.c r4 = r4.b()
                r12.f100357d = r5
                r12.f100358e = r1
                r12.f100354a = r13
                r12.f100355b = r4
                r12.f100356c = r3
                java.lang.Object r3 = yw.i.a(r12)
                if (r3 != r0) goto L9a
                goto Lc0
            L9a:
                r9 = r1
                r1 = r13
                r13 = r3
                r3 = r4
                goto L32
            L9f:
                r4 = r13
                kotlin.coroutines.d r4 = (kotlin.coroutines.d) r4
                yw.l$b$a r6 = new yw.l$b$a
                x00.p<ex.c, j00.c<? super yz.g2>, java.lang.Object> r13 = r12.f100361h
                r11 = 0
                r6.<init>(r1, r13, r11)
                r7 = 2
                r8 = 0
                r5 = 0
                c40.i.e(r3, r4, r5, r6, r7, r8)
                r12.f100357d = r11
                r12.f100358e = r11
                r12.f100354a = r11
                r12.f100355b = r11
                r12.f100356c = r2
                java.lang.Object r13 = r10.a(r9, r12)
                if (r13 != r0) goto Lc1
            Lc0:
                return r0
            Lc1:
                yz.g2 r13 = yz.g2.f100423a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: yw.l.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void c(@m80.k lw.j<?> jVar, @m80.k final p<? super ex.c, ? super j00.c<? super g2>, ? extends Object> block) {
        g0.p(jVar, "<this>");
        g0.p(block, "block");
        jVar.s(f100352a, new x00.l() { // from class: yw.k
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 e11;
                e11 = l.e(p.this, (h) obj);
                return e11;
            }
        });
    }

    public static final g2 d(sw.d createClientPlugin) {
        g0.p(createClientPlugin, "$this$createClientPlugin");
        p<ex.c, j00.c<? super g2>, Object> c11 = ((h) createClientPlugin.f()).c();
        createClientPlugin.g(yw.a.f100334a, new b(((h) createClientPlugin.f()).b(), createClientPlugin, c11, null));
        return g2.f100423a;
    }

    public static final g2 e(p pVar, h install) {
        g0.p(install, "$this$install");
        install.f(pVar);
        return g2.f100423a;
    }

    @m80.k
    public static final sw.b<h> f() {
        return f100352a;
    }

    public static /* synthetic */ void g() {
    }
}
