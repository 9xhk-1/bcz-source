package w3;

import c4.j;
import c7.i;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import oa0.r;
import w30.b;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {w3.a.class})
@u0({"SMAP\nServerTime.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerTime.kt\ncom/baicizhan/app/biz/base/time/ServerTimeProvider\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,91:1\n41#2,6:92\n48#2:99\n142#3:98\n127#4:100\n*S KotlinDebug\n*F\n+ 1 ServerTime.kt\ncom/baicizhan/app/biz/base/time/ServerTimeProvider\n*L\n29#1:92,6\n29#1:99\n29#1:98\n29#1:100\n*E\n"})
/* loaded from: classes3.dex */
public final class e implements w3.a, j {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final i f94746b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final c0 f94747c;

    /* renamed from: d, reason: collision with root package name */
    public long f94748d;

    /* renamed from: e, reason: collision with root package name */
    public long f94749e;

    /* renamed from: f, reason: collision with root package name */
    public long f94750f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.base.time.ServerTimeProvider", f = "ServerTime.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, l = {52, 53, 54}, m = ma.b.P, n = {"serverTime", "now", "elapse", "serverTime", "now", "elapse", "serverTime", "now", "elapse"}, s = {"J$0", "J$1", "J$2", "J$0", "J$1", "J$2", "J$0", "J$1", "J$2"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f94751a;

        /* renamed from: b, reason: collision with root package name */
        public long f94752b;

        /* renamed from: c, reason: collision with root package name */
        public long f94753c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f94754d;

        /* renamed from: f, reason: collision with root package name */
        public int f94756f;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f94754d = obj;
            this.f94756f |= Integer.MIN_VALUE;
            return e.this.c(0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.base.time.ServerTimeProvider", f = "ServerTime.kt", i = {1, 1, 2, 2, 3, 3, 4, 4}, l = {63, 67, 73, 74, 75}, m = "init", n = {"oldBoot", "newBoot", "oldBoot", "newBoot", "oldBoot", "newBoot", "oldBoot", "newBoot"}, s = {"J$0", "J$1", "J$0", "J$1", "J$0", "J$1", "J$0", "J$1"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f94757a;

        /* renamed from: b, reason: collision with root package name */
        public long f94758b;

        /* renamed from: c, reason: collision with root package name */
        public Object f94759c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f94760d;

        /* renamed from: f, reason: collision with root package name */
        public int f94762f;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f94760d = obj;
            this.f94762f |= Integer.MIN_VALUE;
            return e.this.b(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.base.time.ServerTimeProvider", f = "ServerTime.kt", i = {}, l = {60}, m = "isTrust", n = {}, s = {}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f94763a;

        /* renamed from: c, reason: collision with root package name */
        public int f94765c;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f94763a = obj;
            this.f94765c |= Integer.MIN_VALUE;
            return e.this.a(this);
        }
    }

    public e(@k i clock) {
        g0.p(clock, "clock");
        this.f94746b = clock;
        this.f94747c = e0.c(new x00.a() { // from class: w3.c
            @Override // x00.a
            public final Object invoke() {
                com.baicizhan.app.preferences.g g11;
                g11 = e.g(e.this);
                return g11;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final com.baicizhan.app.preferences.g g(e eVar) {
        return (com.baicizhan.app.preferences.g) (eVar instanceof pa0.c ? ((pa0.c) eVar).getScope() : eVar.r().P().h()).i(o0.d(com.baicizhan.app.preferences.g.class), null, new x00.a() { // from class: w3.d
            @Override // x00.a
            public final Object invoke() {
                ya0.a i11;
                i11 = e.i();
                return i11;
            }
        });
    }

    public static final ya0.a i() {
        return ya0.b.d(w3.b.f94741b);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // w3.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k j00.c<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof w3.e.c
            if (r0 == 0) goto L13
            r0 = r7
            w3.e$c r0 = (w3.e.c) r0
            int r1 = r0.f94765c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f94765c = r1
            goto L18
        L13:
            w3.e$c r0 = new w3.e$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f94763a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f94765c
            r3 = 0
            r5 = 1
            if (r2 == 0) goto L33
            if (r2 != r5) goto L2b
            kotlin.e.n(r7)
            goto L45
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            kotlin.e.n(r7)
            com.baicizhan.app.preferences.g r7 = r6.f()
            r0.f94765c = r5
            java.lang.String r2 = "time_repo_sys_boot_time"
            java.lang.Object r7 = r7.h(r2, r3, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            java.lang.Number r7 = (java.lang.Number) r7
            long r0 = r7.longValue()
            int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r7 == 0) goto L50
            goto L51
        L50:
            r5 = 0
        L51:
            java.lang.Boolean r7 = l00.a.a(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.e.a(j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x007d, code lost:
    
        if (r1 == r3) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // w3.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(@m80.k j00.c<? super yz.g2> r24) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.e.b(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // w3.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(long r19, @m80.k j00.c<? super yz.g2> r21) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.e.c(long, j00.c):java.lang.Object");
    }

    @Override // w3.a
    public long currentTimeMillis() {
        if (this.f94748d != 0) {
            long j11 = this.f94749e;
            if (j11 != 0 && this.f94750f != 0) {
                return j11 + (this.f94746b.a() - this.f94750f);
            }
        }
        return b.C1273b.f94770b.a().toEpochMilliseconds();
    }

    public final com.baicizhan.app.preferences.g f() {
        return (com.baicizhan.app.preferences.g) this.f94747c.getValue();
    }

    @Override // c4.j, pa0.a
    @k
    public /* bridge */ na0.a r() {
        return super.r();
    }
}
