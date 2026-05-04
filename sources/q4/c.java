package q4;

import a00.l1;
import io.ktor.server.testing.TestApplication;
import io.ktor.server.testing.e0;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBczServer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BczServer.kt\ncom/baicizhan/app/biz/game/impl/h5enhance/server/BczServer\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 builders.kt\nio/ktor/client/request/BuildersKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,148:1\n116#2,11:149\n116#2,11:174\n50#3:160\n34#3:161\n51#3,2:162\n53#3:166\n19#3:167\n216#4,2:164\n1193#5,2:168\n1267#5,4:170\n*S KotlinDebug\n*F\n+ 1 BczServer.kt\ncom/baicizhan/app/biz/game/impl/h5enhance/server/BczServer\n*L\n30#1:149,11\n84#1:174,11\n59#1:160\n59#1:161\n59#1:162,2\n59#1:166\n59#1:167\n63#1:164,2\n72#1:168,2\n72#1:170,4\n*E\n"})
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l<zx.a, g2> f81669a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public TestApplication f81670b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final n40.a f81671c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f81672d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.h5enhance.server.BczServer", f = "BczServer.kt", i = {0, 0}, l = {154}, m = "ensureStarted", n = {"$this$withLock_u24default$iv", "$i$f$withLock"}, s = {"L$0", "I$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f81673a;

        /* renamed from: b, reason: collision with root package name */
        public int f81674b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f81675c;

        /* renamed from: e, reason: collision with root package name */
        public int f81677e;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@k Object obj) {
            this.f81675c = obj;
            this.f81677e |= Integer.MIN_VALUE;
            return c.this.d(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.h5enhance.server.BczServer", f = "BczServer.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {53, 156, 75}, m = "handleRequest", n = {"method", "url", "headers", "method", "url", "headers", "normalizedUrl", "client", "$this$request$iv", "urlString$iv", "$this$request$iv$iv", "$this$request$iv$iv$iv", "builder$iv$iv$iv", "$i$f$request", "$i$f$request", "$i$f$request", "method", "url", "headers", "normalizedUrl", "client", "response"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f81678a;

        /* renamed from: b, reason: collision with root package name */
        public Object f81679b;

        /* renamed from: c, reason: collision with root package name */
        public Object f81680c;

        /* renamed from: d, reason: collision with root package name */
        public Object f81681d;

        /* renamed from: e, reason: collision with root package name */
        public Object f81682e;

        /* renamed from: f, reason: collision with root package name */
        public Object f81683f;

        /* renamed from: g, reason: collision with root package name */
        public Object f81684g;

        /* renamed from: h, reason: collision with root package name */
        public Object f81685h;

        /* renamed from: i, reason: collision with root package name */
        public Object f81686i;

        /* renamed from: j, reason: collision with root package name */
        public Object f81687j;

        /* renamed from: k, reason: collision with root package name */
        public int f81688k;

        /* renamed from: l, reason: collision with root package name */
        public int f81689l;

        /* renamed from: m, reason: collision with root package name */
        public int f81690m;

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f81691n;

        /* renamed from: p, reason: collision with root package name */
        public int f81693p;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@k Object obj) {
            this.f81691n = obj;
            this.f81693p |= Integer.MIN_VALUE;
            return c.this.g(null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.h5enhance.server.BczServer", f = "BczServer.kt", i = {0, 0}, l = {154}, m = "stop", n = {"$this$withLock_u24default$iv", "$i$f$withLock"}, s = {"L$0", "I$0"}, v = 1)
    /* renamed from: q4.c$c, reason: collision with other inner class name */
    public static final class C1002c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f81694a;

        /* renamed from: b, reason: collision with root package name */
        public int f81695b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f81696c;

        /* renamed from: e, reason: collision with root package name */
        public int f81698e;

        public C1002c(j00.c<? super C1002c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@k Object obj) {
            this.f81696c = obj;
            this.f81698e |= Integer.MIN_VALUE;
            return c.this.j(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k l<? super zx.a, g2> moduleConfig) {
        g0.p(moduleConfig, "moduleConfig");
        this.f81669a = moduleConfig;
        this.f81671c = n40.g.b(false, 1, null);
    }

    public static final g2 e(final c cVar, e0 TestApplication) {
        g0.p(TestApplication, "$this$TestApplication");
        TestApplication.q(new l() { // from class: q4.b
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 f11;
                f11 = c.f(c.this, (zx.a) obj);
                return f11;
            }
        });
        return g2.f100423a;
    }

    public static final g2 f(c cVar, zx.a application) {
        g0.p(application, "$this$application");
        cVar.f81669a.invoke(application);
        return g2.f100423a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object h(c cVar, String str, String str2, Map map, j00.c cVar2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            map = l1.z();
        }
        return cVar.g(str, str2, map, cVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e A[Catch: all -> 0x005c, TryCatch #0 {all -> 0x005c, blocks: (B:11:0x004a, B:13:0x004e, B:14:0x005e), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(j00.c<? super yz.g2> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof q4.c.a
            if (r0 == 0) goto L13
            r0 = r6
            q4.c$a r0 = (q4.c.a) r0
            int r1 = r0.f81677e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f81677e = r1
            goto L18
        L13:
            q4.c$a r0 = new q4.c$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f81675c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f81677e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r0.f81673a
            n40.a r0 = (n40.a) r0
            kotlin.e.n(r6)
            goto L4a
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            kotlin.e.n(r6)
            n40.a r6 = r5.f81671c
            r0.f81673a = r6
            r2 = 0
            r0.f81674b = r2
            r0.f81677e = r3
            java.lang.Object r0 = r6.lock(r4, r0)
            if (r0 != r1) goto L49
            return r1
        L49:
            r0 = r6
        L4a:
            boolean r6 = r5.f81672d     // Catch: java.lang.Throwable -> L5c
            if (r6 != 0) goto L5e
            q4.a r6 = new q4.a     // Catch: java.lang.Throwable -> L5c
            r6.<init>()     // Catch: java.lang.Throwable -> L5c
            io.ktor.server.testing.TestApplication r6 = io.ktor.server.testing.q0.b(r6)     // Catch: java.lang.Throwable -> L5c
            r5.f81670b = r6     // Catch: java.lang.Throwable -> L5c
            r5.f81672d = r3     // Catch: java.lang.Throwable -> L5c
            goto L5e
        L5c:
            r6 = move-exception
            goto L64
        L5e:
            yz.g2 r6 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L5c
            r0.unlock(r4)
            return r6
        L64:
            r0.unlock(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.c.d(j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b8, code lost:
    
        if (d(r2) == r3) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0199 A[LOOP:0: B:19:0x0193->B:21:0x0199, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r17v0, types: [q4.c] */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.util.Map] */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(@m80.k java.lang.String r18, @m80.k java.lang.String r19, @m80.k java.util.Map<java.lang.String, java.lang.String> r20, @m80.k j00.c<? super q4.i> r21) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.c.g(java.lang.String, java.lang.String, java.util.Map, j00.c):java.lang.Object");
    }

    public final boolean i() {
        return this.f81672d && this.f81670b != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:11:0x004a, B:13:0x004e, B:14:0x0054), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(@m80.k j00.c<? super yz.g2> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof q4.c.C1002c
            if (r0 == 0) goto L13
            r0 = r7
            q4.c$c r0 = (q4.c.C1002c) r0
            int r1 = r0.f81698e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f81698e = r1
            goto L18
        L13:
            q4.c$c r0 = new q4.c$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f81696c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f81698e
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r0.f81694a
            n40.a r0 = (n40.a) r0
            kotlin.e.n(r7)
            goto L4a
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            kotlin.e.n(r7)
            n40.a r7 = r6.f81671c
            r0.f81694a = r7
            r0.f81695b = r3
            r0.f81698e = r4
            java.lang.Object r0 = r7.lock(r5, r0)
            if (r0 != r1) goto L49
            return r1
        L49:
            r0 = r7
        L4a:
            io.ktor.server.testing.TestApplication r7 = r6.f81670b     // Catch: java.lang.Throwable -> L52
            if (r7 == 0) goto L54
            r7.m()     // Catch: java.lang.Throwable -> L52
            goto L54
        L52:
            r7 = move-exception
            goto L5e
        L54:
            r6.f81670b = r5     // Catch: java.lang.Throwable -> L52
            r6.f81672d = r3     // Catch: java.lang.Throwable -> L52
            yz.g2 r7 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L52
            r0.unlock(r5)
            return r7
        L5e:
            r0.unlock(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.c.j(j00.c):java.lang.Object");
    }
}
