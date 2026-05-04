package x3;

import com.microsoft.thrifty.service.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import l7.i0;
import y7.d;
import yz.g2;
import z8.b2;
import z8.n0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {g0.class})
@u0({"SMAP\nIScheduleRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IScheduleRepo.kt\ncom/baicizhan/app/biz/books/ScheduleRepoImpl\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n+ 7 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,108:1\n6#2:109\n64#3,2:110\n66#3:113\n67#3,2:119\n6#4:112\n124#5,4:114\n142#6:118\n116#7,11:121\n*S KotlinDebug\n*F\n+ 1 IScheduleRepo.kt\ncom/baicizhan/app/biz/books/ScheduleRepoImpl\n*L\n37#1:109\n37#1:110,2\n37#1:113\n37#1:119,2\n37#1:112\n37#1:114,4\n37#1:118\n41#1:121,11\n*E\n"})
/* loaded from: classes3.dex */
public final class j0 implements g0, com.baicizhan.app.biz.auth.p, com.baicizhan.app.biz.auth.j {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final l7.p f97188b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public List<x3.b> f97189c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final n40.a f97190d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.books.ScheduleRepoImpl", f = "IScheduleRepo.kt", i = {0, 0, 0}, l = {63}, m = "changeSchedule", n = {"bookId", "count", "reviewPlanCount"}, s = {"I$0", "I$1", "I$2"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f97191a;

        /* renamed from: b, reason: collision with root package name */
        public int f97192b;

        /* renamed from: c, reason: collision with root package name */
        public int f97193c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f97194d;

        /* renamed from: f, reason: collision with root package name */
        public int f97196f;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f97194d = obj;
            this.f97196f |= Integer.MIN_VALUE;
            return j0.this.d(0, 0, 0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.books.ScheduleRepoImpl", f = "IScheduleRepo.kt", i = {0}, l = {73}, m = "deleteSchedule", n = {"bookId"}, s = {"I$0"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f97197a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f97198b;

        /* renamed from: d, reason: collision with root package name */
        public int f97200d;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f97198b = obj;
            this.f97200d |= Integer.MIN_VALUE;
            return j0.this.b(0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.books.ScheduleRepoImpl", f = "IScheduleRepo.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {114, 44}, m = "loadSchedule", n = {"$this$withLock_u24default$iv", f80.f.f51304e, "$i$f$withLock", "$this$withLock_u24default$iv", f80.f.f51304e, "$i$f$withLock", "$i$a$-withLock$default-ScheduleRepoImpl$loadSchedule$2"}, s = {"L$0", "Z$0", "I$0", "L$0", "Z$0", "I$0", "I$1"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public boolean f97201a;

        /* renamed from: b, reason: collision with root package name */
        public Object f97202b;

        /* renamed from: c, reason: collision with root package name */
        public int f97203c;

        /* renamed from: d, reason: collision with root package name */
        public int f97204d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f97205e;

        /* renamed from: g, reason: collision with root package name */
        public int f97207g;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f97205e = obj;
            this.f97207g |= Integer.MIN_VALUE;
            return j0.this.a(false, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.books.ScheduleRepoImpl", f = "IScheduleRepo.kt", i = {0}, l = {80}, m = "resetSchedule", n = {"bookId"}, s = {"I$0"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f97208a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f97209b;

        /* renamed from: d, reason: collision with root package name */
        public int f97211d;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f97209b = obj;
            this.f97211d |= Integer.MIN_VALUE;
            return j0.this.n(0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class e implements x00.l<w7.d<b2>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f97212a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f97213b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f97214c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f97215a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f97216b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f97217c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f97215a = eVar;
                this.f97216b = cVar;
                this.f97217c = dVar;
            }

            public final void a(d.a randomRetry) {
                kotlin.jvm.internal.g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f97215a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f97215a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f97216b.b(this.f97217c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public e(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f97212a = dVar;
            this.f97213b = eVar;
            this.f97214c = cVar;
        }

        public final void a(w7.d<b2> thriftBuilder) {
            kotlin.jvm.internal.g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f97213b, this.f97214c, this.f97212a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = l7.i0.o().get(this.f97212a);
            kotlin.jvm.internal.g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<b2> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    public j0(@m80.k l7.p thriftService, @m80.k com.baicizhan.app.biz.auth.n logoutHub, @m80.k com.baicizhan.app.biz.auth.k devicesChangeHub) {
        kotlin.jvm.internal.g0.p(thriftService, "thriftService");
        kotlin.jvm.internal.g0.p(logoutHub, "logoutHub");
        kotlin.jvm.internal.g0.p(devicesChangeHub, "devicesChangeHub");
        this.f97188b = thriftService;
        logoutHub.b(this);
        devicesChangeHub.a(this);
        this.f97189c = new ArrayList();
        this.f97190d = n40.g.b(false, 1, null);
    }

    public static final boolean g(int i11, x3.b it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return it.h() == i11;
    }

    private final b2 h() {
        return (b2) w7.f.b(new e(o0.d(b2.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    public static final x3.b i(n0 it) {
        kotlin.jvm.internal.g0.p(it, "it");
        int i11 = it.f101791a;
        Integer num = it.f101795e;
        kotlin.jvm.internal.g0.m(num);
        int intValue = num.intValue();
        Integer num2 = it.f101794d;
        kotlin.jvm.internal.g0.m(num2);
        int intValue2 = num2.intValue();
        int i12 = it.f101792b;
        Integer num3 = it.f101796f;
        return new x3.b(i11, intValue, intValue2, i12, num3 != null ? num3.intValue() : 0);
    }

    @Override // com.baicizhan.app.biz.auth.p
    @m80.l
    public Object A2(@m80.k j00.c<? super g2> cVar) {
        z6.b.j(z6.b.f101032b, o.f97378a, "onLogout clean ", null, 4, null);
        this.f97189c.clear();
        return g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // x3.g0
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(boolean r9, @m80.k j00.c<? super java.util.List<x3.b>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof x3.j0.c
            if (r0 == 0) goto L13
            r0 = r10
            x3.j0$c r0 = (x3.j0.c) r0
            int r1 = r0.f97207g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f97207g = r1
            goto L18
        L13:
            x3.j0$c r0 = new x3.j0$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f97205e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f97207g
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4d
            if (r2 == r5) goto L3d
            if (r2 != r4) goto L35
            java.lang.Object r9 = r0.f97202b
            n40.a r9 = (n40.a) r9
            kotlin.e.n(r10)     // Catch: java.lang.Throwable -> L32
            goto L8e
        L32:
            r10 = move-exception
            goto Lbb
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            int r9 = r0.f97203c
            boolean r2 = r0.f97201a
            java.lang.Object r5 = r0.f97202b
            n40.a r5 = (n40.a) r5
            kotlin.e.n(r10)
            r10 = r2
            r2 = r9
            r9 = r10
            r10 = r5
            goto L62
        L4d:
            kotlin.e.n(r10)
            n40.a r10 = r8.f97190d
            r0.f97202b = r10
            r0.f97201a = r9
            r0.f97203c = r3
            r0.f97207g = r5
            java.lang.Object r2 = r10.lock(r6, r0)
            if (r2 != r1) goto L61
            goto L8a
        L61:
            r2 = r3
        L62:
            java.util.List<x3.b> r5 = r8.f97189c     // Catch: java.lang.Throwable -> Lb7
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Throwable -> Lb7
            if (r5 != 0) goto L6f
            if (r9 == 0) goto L6d
            goto L6f
        L6d:
            r9 = r10
            goto Laf
        L6f:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb7
            r5.<init>()     // Catch: java.lang.Throwable -> Lb7
            r8.f97189c = r5     // Catch: java.lang.Throwable -> Lb7
            z8.b2 r5 = r8.h()     // Catch: java.lang.Throwable -> Lb7
            r0.f97202b = r10     // Catch: java.lang.Throwable -> Lb7
            r0.f97201a = r9     // Catch: java.lang.Throwable -> Lb7
            r0.f97203c = r2     // Catch: java.lang.Throwable -> Lb7
            r0.f97204d = r3     // Catch: java.lang.Throwable -> Lb7
            r0.f97207g = r4     // Catch: java.lang.Throwable -> Lb7
            java.lang.Object r9 = r5.E1(r0)     // Catch: java.lang.Throwable -> Lb7
            if (r9 != r1) goto L8b
        L8a:
            return r1
        L8b:
            r7 = r10
            r10 = r9
            r9 = r7
        L8e:
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Throwable -> L32
            java.lang.Iterable r10 = (java.lang.Iterable) r10     // Catch: java.lang.Throwable -> L32
            q30.m r10 = a00.r0.E1(r10)     // Catch: java.lang.Throwable -> L32
            x3.i0 r0 = new x3.i0     // Catch: java.lang.Throwable -> L32
            r0.<init>()     // Catch: java.lang.Throwable -> L32
            q30.m r10 = q30.k0.N1(r10, r0)     // Catch: java.lang.Throwable -> L32
            java.util.List r10 = q30.k0.I3(r10)     // Catch: java.lang.Throwable -> L32
            java.util.List<x3.b> r0 = r8.f97189c     // Catch: java.lang.Throwable -> L32
            r0.clear()     // Catch: java.lang.Throwable -> L32
            java.util.List<x3.b> r0 = r8.f97189c     // Catch: java.lang.Throwable -> L32
            java.util.Collection r10 = (java.util.Collection) r10     // Catch: java.lang.Throwable -> L32
            r0.addAll(r10)     // Catch: java.lang.Throwable -> L32
        Laf:
            yz.g2 r10 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L32
            r9.unlock(r6)
            java.util.List<x3.b> r9 = r8.f97189c
            return r9
        Lb7:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        Lbb:
            r9.unlock(r6)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.j0.a(boolean, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // x3.g0
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(final int r5, @m80.k j00.c<? super yz.g2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof x3.j0.b
            if (r0 == 0) goto L13
            r0 = r6
            x3.j0$b r0 = (x3.j0.b) r0
            int r1 = r0.f97200d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f97200d = r1
            goto L18
        L13:
            x3.j0$b r0 = new x3.j0$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f97198b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f97200d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            int r5 = r0.f97197a
            kotlin.e.n(r6)
            goto L45
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.e.n(r6)
            z8.b2 r6 = r4.h()
            r0.f97197a = r5
            r0.f97200d = r3
            java.lang.Object r6 = r6.P1(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.util.List<x3.b> r6 = r4.f97189c
            x3.h0 r0 = new x3.h0
            r0.<init>()
            a00.m0.N0(r6, r0)
            yz.g2 r5 = yz.g2.f100423a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.j0.b(int, j00.c):java.lang.Object");
    }

    @Override // com.baicizhan.app.biz.auth.j
    @m80.l
    public Object c(@m80.k j00.c<? super g2> cVar) {
        z6.b.j(z6.b.f101032b, o.f97378a, "deviceChange  clean", null, 4, null);
        this.f97189c.clear();
        return g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // x3.g0
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(int r13, int r14, int r15, @m80.k j00.c<? super java.lang.Integer> r16) {
        /*
            r12 = this;
            r0 = r16
            boolean r1 = r0 instanceof x3.j0.a
            if (r1 == 0) goto L16
            r1 = r0
            x3.j0$a r1 = (x3.j0.a) r1
            int r2 = r1.f97196f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f97196f = r2
        L14:
            r8 = r1
            goto L1c
        L16:
            x3.j0$a r1 = new x3.j0$a
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r8.f97194d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r8.f97196f
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            int r13 = r8.f97193c
            int r14 = r8.f97192b
            int r1 = r8.f97191a
            kotlin.e.n(r0)
            r4 = r13
            r3 = r1
        L34:
            r5 = r14
            goto L5c
        L36:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3e:
            kotlin.e.n(r0)
            z8.b2 r2 = r12.h()
            r8.f97191a = r13
            r8.f97192b = r14
            r8.f97193c = r15
            r8.f97196f = r3
            r6 = -1
            r7 = 0
            r3 = r13
            r4 = r14
            r5 = r15
            java.lang.Object r0 = r2.Z(r3, r4, r5, r6, r7, r8)
            if (r0 != r1) goto L59
            return r1
        L59:
            r3 = r13
            r4 = r15
            goto L34
        L5c:
            z8.a2 r0 = (z8.a2) r0
            java.lang.Integer r13 = r0.f101145j
            r14 = 0
            if (r13 == 0) goto L68
            int r13 = r13.intValue()
            goto L69
        L68:
            r13 = r14
        L69:
            java.util.List<x3.b> r0 = r12.f97189c
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L71:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L85
            java.lang.Object r1 = r0.next()
            r2 = r1
            x3.b r2 = (x3.b) r2
            int r2 = r2.h()
            if (r2 != r3) goto L71
            goto L86
        L85:
            r1 = 0
        L86:
            x3.b r1 = (x3.b) r1
            if (r1 != 0) goto L92
            x3.b r2 = new x3.b
            r6 = 0
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            r1 = r2
        L92:
            java.util.List<x3.b> r0 = r12.f97189c
            r0.remove(r1)
            java.util.List<x3.b> r0 = r12.f97189c
            r10 = 25
            r11 = 0
            r7 = r5
            r5 = 0
            r8 = 0
            r9 = 0
            r6 = r4
            r4 = r1
            x3.b r1 = x3.b.g(r4, r5, r6, r7, r8, r9, r10, r11)
            r0.add(r14, r1)
            java.lang.Integer r13 = l00.a.f(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.j0.d(int, int, int, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // x3.g0
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(int r10, @m80.k j00.c<? super yz.g2> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof x3.j0.d
            if (r0 == 0) goto L13
            r0 = r11
            x3.j0$d r0 = (x3.j0.d) r0
            int r1 = r0.f97211d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f97211d = r1
            goto L18
        L13:
            x3.j0$d r0 = new x3.j0$d
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f97209b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f97211d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            int r10 = r0.f97208a
            kotlin.e.n(r11)
            goto L45
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            kotlin.e.n(r11)
            z8.b2 r11 = r9.h()
            r0.f97208a = r10
            r0.f97211d = r3
            java.lang.Object r11 = r11.F5(r10, r0)
            if (r11 != r1) goto L45
            return r1
        L45:
            java.util.List<x3.b> r11 = r9.f97189c
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
        L4d:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L61
            java.lang.Object r0 = r11.next()
            r1 = r0
            x3.b r1 = (x3.b) r1
            int r1 = r1.h()
            if (r1 != r10) goto L4d
            goto L62
        L61:
            r0 = 0
        L62:
            r1 = r0
            x3.b r1 = (x3.b) r1
            if (r1 == 0) goto L7e
            java.util.List<x3.b> r10 = r9.f97189c
            r10.remove(r1)
            java.util.List<x3.b> r10 = r9.f97189c
            r7 = 23
            r8 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            x3.b r11 = x3.b.g(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r10.add(r0, r11)
        L7e:
            yz.g2 r10 = yz.g2.f100423a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.j0.n(int, j00.c):java.lang.Object");
    }
}
