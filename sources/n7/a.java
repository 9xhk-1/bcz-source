package n7;

import c4.j;
import com.microsoft.thrifty.service.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.o0;
import kotlinx.coroutines.flow.y;
import l7.i0;
import l7.p;
import m80.k;
import m80.l;
import oa0.r;
import y7.d;
import yz.g2;
import z8.b2;
import z8.c1;
import z8.t1;
import z8.w1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {n7.e.class})
@u0({"SMAP\nIBaseInfoRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IBaseInfoRepo.kt\ncom/baicizhan/app/biz/userbasicinfo/BaseInfoImpl\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 4 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 5 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 6 Koin.kt\norg/koin/core/Koin\n+ 7 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,132:1\n116#2,11:133\n116#2,11:144\n116#2,11:155\n116#2,11:166\n116#2,11:177\n116#2,11:188\n116#2,10:199\n116#2,11:209\n6#3:220\n6#3:232\n64#4,2:221\n66#4:224\n67#4,2:230\n64#4,2:233\n66#4:236\n67#4,2:242\n6#5:223\n6#5:235\n124#6,4:225\n124#6,4:237\n142#7:229\n142#7:241\n*S KotlinDebug\n*F\n+ 1 IBaseInfoRepo.kt\ncom/baicizhan/app/biz/userbasicinfo/BaseInfoImpl\n*L\n65#1:133,11\n69#1:144,11\n76#1:155,11\n79#1:166,11\n86#1:177,11\n91#1:188,11\n96#1:199,10\n101#1:209,11\n106#1:220\n115#1:232\n106#1:221,2\n106#1:224\n106#1:230,2\n115#1:233,2\n115#1:236\n115#1:242,2\n106#1:223\n115#1:235\n106#1:225,4\n115#1:237,4\n106#1:229\n115#1:241\n*E\n"})
/* loaded from: classes3.dex */
public final class a implements n7.e, j {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p f74540b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final n40.a f74541c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public n40.a f74542d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final y<w1> f74543e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final y<c1> f74544f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final y<t1> f74545g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbasicinfo.BaseInfoImpl", f = "IBaseInfoRepo.kt", i = {0, 0, 1, 1, 1}, l = {138, 87}, m = "getBaseInfo", n = {"$this$withLock_u24default$iv", "$i$f$withLock", "$this$withLock_u24default$iv", "$i$f$withLock", "$i$a$-withLock$default-BaseInfoImpl$getBaseInfo$2"}, s = {"L$0", "I$0", "L$0", "I$0", "I$1"}, v = 1)
    /* renamed from: n7.a$a, reason: collision with other inner class name */
    public static final class C0900a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f74546a;

        /* renamed from: b, reason: collision with root package name */
        public int f74547b;

        /* renamed from: c, reason: collision with root package name */
        public int f74548c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f74549d;

        /* renamed from: f, reason: collision with root package name */
        public int f74551f;

        public C0900a(j00.c<? super C0900a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f74549d = obj;
            this.f74551f |= Integer.MIN_VALUE;
            return a.this.p1(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbasicinfo.BaseInfoImpl", f = "IBaseInfoRepo.kt", i = {0, 0, 1, 1, 1}, l = {138, 102}, m = "getLearnInfo", n = {"$this$withLock_u24default$iv", "$i$f$withLock", "$this$withLock_u24default$iv", "$i$f$withLock", "$i$a$-withLock$default-BaseInfoImpl$getLearnInfo$2"}, s = {"L$0", "I$0", "L$0", "I$0", "I$1"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f74552a;

        /* renamed from: b, reason: collision with root package name */
        public int f74553b;

        /* renamed from: c, reason: collision with root package name */
        public int f74554c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f74555d;

        /* renamed from: f, reason: collision with root package name */
        public int f74557f;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f74555d = obj;
            this.f74557f |= Integer.MIN_VALUE;
            return a.this.B0(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbasicinfo.BaseInfoImpl", f = "IBaseInfoRepo.kt", i = {0, 0, 1, 1, 2, 2, 2}, l = {138, 149, 97}, m = "getLimitInfo", n = {"$this$withLock_u24default$iv", "$i$f$withLock", "$this$withLock_u24default$iv", "$i$f$withLock", "$this$withLock_u24default$iv", "$i$f$withLock", "$i$a$-withLock$default-BaseInfoImpl$getLimitInfo$4"}, s = {"L$0", "I$0", "L$0", "I$0", "L$0", "I$0", "I$1"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f74558a;

        /* renamed from: b, reason: collision with root package name */
        public int f74559b;

        /* renamed from: c, reason: collision with root package name */
        public int f74560c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f74561d;

        /* renamed from: f, reason: collision with root package name */
        public int f74563f;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f74561d = obj;
            this.f74563f |= Integer.MIN_VALUE;
            return a.this.J(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbasicinfo.BaseInfoImpl", f = "IBaseInfoRepo.kt", i = {0, 0, 1, 1}, l = {138, 149}, m = "invalid", n = {"$this$withLock_u24default$iv", "$i$f$withLock", "$this$withLock_u24default$iv", "$i$f$withLock"}, s = {"L$0", "I$0", "L$0", "I$0"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f74564a;

        /* renamed from: b, reason: collision with root package name */
        public int f74565b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f74566c;

        /* renamed from: e, reason: collision with root package name */
        public int f74568e;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f74566c = obj;
            this.f74568e |= Integer.MIN_VALUE;
            return a.this.v(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class e implements x00.l<w7.d<b2>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f74569a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f74570b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f74571c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        /* renamed from: n7.a$e$a, reason: collision with other inner class name */
        public static final class C0901a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f74572a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f74573b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f74574c;

            public C0901a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f74572a = eVar;
                this.f74573b = cVar;
                this.f74574c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f74572a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f74572a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f74573b.b(this.f74574c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public e(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f74569a = dVar;
            this.f74570b = eVar;
            this.f74571c = cVar;
        }

        public final void a(w7.d<b2> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new C0901a(this.f74570b, this.f74571c, this.f74569a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f74569a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<b2> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbasicinfo.BaseInfoImpl", f = "IBaseInfoRepo.kt", i = {1, 1, 2, 2, 3, 3}, l = {106, 108, 109, 110}, m = "loadBasicInfo", n = {"it", "$i$a$-also-BaseInfoImpl$loadBasicInfo$2", "it", "$i$a$-also-BaseInfoImpl$loadBasicInfo$2", "it", "$i$a$-also-BaseInfoImpl$loadBasicInfo$2"}, s = {"L$1", "I$0", "L$1", "I$0", "L$1", "I$0"}, v = 1)
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f74575a;

        /* renamed from: b, reason: collision with root package name */
        public Object f74576b;

        /* renamed from: c, reason: collision with root package name */
        public int f74577c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f74578d;

        /* renamed from: f, reason: collision with root package name */
        public int f74580f;

        public f(j00.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f74578d = obj;
            this.f74580f |= Integer.MIN_VALUE;
            return a.this.c(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class g implements x00.l<w7.d<b2>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f74581a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f74582b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f74583c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        /* renamed from: n7.a$g$a, reason: collision with other inner class name */
        public static final class C0902a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f74584a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f74585b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f74586c;

            public C0902a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f74584a = eVar;
                this.f74585b = cVar;
                this.f74586c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f74584a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f74584a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f74585b.b(this.f74586c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public g(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f74581a = dVar;
            this.f74582b = eVar;
            this.f74583c = cVar;
        }

        public final void a(w7.d<b2> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new C0902a(this.f74582b, this.f74583c, this.f74581a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f74581a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<b2> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbasicinfo.BaseInfoImpl", f = "IBaseInfoRepo.kt", i = {}, l = {115}, m = "loadLimitInfo", n = {}, s = {}, v = 1)
    public static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f74587a;

        /* renamed from: c, reason: collision with root package name */
        public int f74589c;

        public h(j00.c<? super h> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f74587a = obj;
            this.f74589c |= Integer.MIN_VALUE;
            return a.this.d(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbasicinfo.BaseInfoImpl", f = "IBaseInfoRepo.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3}, l = {138, 66, 149, 70}, m = "sync", n = {"$this$withLock_u24default$iv", "limitOnly", "$i$f$withLock", "$this$withLock_u24default$iv", "limitOnly", "$i$f$withLock", "$i$a$-withLock$default-BaseInfoImpl$sync$2", "$this$withLock_u24default$iv", "limitOnly", "$i$f$withLock", "$this$withLock_u24default$iv", "limitOnly", "$i$f$withLock", "$i$a$-withLock$default-BaseInfoImpl$sync$3"}, s = {"L$0", "Z$0", "I$0", "L$0", "Z$0", "I$0", "I$1", "L$0", "Z$0", "I$0", "L$0", "Z$0", "I$0", "I$1"}, v = 1)
    public static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public boolean f74590a;

        /* renamed from: b, reason: collision with root package name */
        public Object f74591b;

        /* renamed from: c, reason: collision with root package name */
        public int f74592c;

        /* renamed from: d, reason: collision with root package name */
        public int f74593d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f74594e;

        /* renamed from: g, reason: collision with root package name */
        public int f74596g;

        public i(j00.c<? super i> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f74594e = obj;
            this.f74596g |= Integer.MIN_VALUE;
            return a.this.u2(false, this);
        }
    }

    public a(@k p thriftService) {
        g0.p(thriftService, "thriftService");
        this.f74540b = thriftService;
        this.f74541c = n40.g.b(false, 1, null);
        this.f74542d = n40.g.b(false, 1, null);
        this.f74543e = o0.a(null);
        this.f74544f = o0.a(null);
        this.f74545g = o0.a(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0066 A[Catch: all -> 0x007e, TRY_LEAVE, TryCatch #1 {all -> 0x007e, blocks: (B:26:0x005a, B:28:0x0066), top: B:25:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // n7.e
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object B0(@m80.k j00.c<? super z8.t1> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof n7.a.b
            if (r0 == 0) goto L13
            r0 = r9
            n7.a$b r0 = (n7.a.b) r0
            int r1 = r0.f74557f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f74557f = r1
            goto L18
        L13:
            n7.a$b r0 = new n7.a$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f74555d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f74557f
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r0 = r0.f74552a
            n40.a r0 = (n40.a) r0
            kotlin.e.n(r9)     // Catch: java.lang.Throwable -> L32
            goto L78
        L32:
            r9 = move-exception
            goto L87
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3c:
            int r2 = r0.f74553b
            java.lang.Object r5 = r0.f74552a
            n40.a r5 = (n40.a) r5
            kotlin.e.n(r9)
            r9 = r5
            goto L5a
        L47:
            kotlin.e.n(r9)
            n40.a r9 = r8.f74541c
            r0.f74552a = r9
            r0.f74553b = r3
            r0.f74557f = r5
            java.lang.Object r2 = r9.lock(r6, r0)
            if (r2 != r1) goto L59
            goto L74
        L59:
            r2 = r3
        L5a:
            kotlinx.coroutines.flow.m0 r5 = r8.I0()     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Throwable -> L7e
            z8.t1 r5 = (z8.t1) r5     // Catch: java.lang.Throwable -> L7e
            if (r5 != 0) goto L83
            r0.f74552a = r9     // Catch: java.lang.Throwable -> L7e
            r0.f74553b = r2     // Catch: java.lang.Throwable -> L7e
            r0.f74554c = r3     // Catch: java.lang.Throwable -> L7e
            r0.f74557f = r4     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r0 = r8.c(r0)     // Catch: java.lang.Throwable -> L7e
            if (r0 != r1) goto L75
        L74:
            return r1
        L75:
            r7 = r0
            r0 = r9
            r9 = r7
        L78:
            z8.b1 r9 = (z8.b1) r9     // Catch: java.lang.Throwable -> L32
            z8.t1 r5 = r9.f101192c     // Catch: java.lang.Throwable -> L32
            r9 = r0
            goto L83
        L7e:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
            goto L87
        L83:
            r9.unlock(r6)
            return r5
        L87:
            r0.unlock(r6)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.a.B0(j00.c):java.lang.Object");
    }

    @Override // n7.e
    @k
    public m0<w1> E() {
        return this.f74543e;
    }

    @Override // n7.e
    @k
    public m0<t1> I0() {
        return this.f74545g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0063, code lost:
    
        if (r2.lock(null, r0) == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e A[Catch: all -> 0x00a5, TRY_LEAVE, TryCatch #1 {all -> 0x00a5, blocks: (B:27:0x0084, B:29:0x008e), top: B:26:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // n7.e
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object J(@m80.k j00.c<? super z8.w1> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof n7.a.c
            if (r0 == 0) goto L13
            r0 = r10
            n7.a$c r0 = (n7.a.c) r0
            int r1 = r0.f74563f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f74563f = r1
            goto L18
        L13:
            n7.a$c r0 = new n7.a$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f74561d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f74563f
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            r7 = 0
            if (r2 == 0) goto L54
            if (r2 == r5) goto L4c
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r0 = r0.f74558a
            n40.a r0 = (n40.a) r0
            kotlin.e.n(r10)     // Catch: java.lang.Throwable -> L36
            goto La0
        L36:
            r10 = move-exception
            goto Lae
        L39:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L41:
            int r2 = r0.f74559b
            java.lang.Object r4 = r0.f74558a
            n40.a r4 = (n40.a) r4
            kotlin.e.n(r10)
            r10 = r4
            goto L84
        L4c:
            java.lang.Object r2 = r0.f74558a
            n40.a r2 = (n40.a) r2
            kotlin.e.n(r10)
            goto L66
        L54:
            kotlin.e.n(r10)
            n40.a r2 = r9.f74541c
            r0.f74558a = r2
            r0.f74559b = r6
            r0.f74563f = r5
            java.lang.Object r10 = r2.lock(r7, r0)
            if (r10 != r1) goto L66
            goto L9c
        L66:
            kotlinx.coroutines.flow.y<z8.w1> r10 = r9.f74543e     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r10 = r10.getValue()     // Catch: java.lang.Throwable -> Lb2
            z8.w1 r10 = (z8.w1) r10     // Catch: java.lang.Throwable -> Lb2
            r2.unlock(r7)
            if (r10 == 0) goto L74
            return r10
        L74:
            n40.a r10 = r9.f74542d
            r0.f74558a = r10
            r0.f74559b = r6
            r0.f74563f = r4
            java.lang.Object r2 = r10.lock(r7, r0)
            if (r2 != r1) goto L83
            goto L9c
        L83:
            r2 = r6
        L84:
            kotlinx.coroutines.flow.y<z8.w1> r4 = r9.f74543e     // Catch: java.lang.Throwable -> La5
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> La5
            z8.w1 r4 = (z8.w1) r4     // Catch: java.lang.Throwable -> La5
            if (r4 != 0) goto Laa
            r0.f74558a = r10     // Catch: java.lang.Throwable -> La5
            r0.f74559b = r2     // Catch: java.lang.Throwable -> La5
            r0.f74560c = r6     // Catch: java.lang.Throwable -> La5
            r0.f74563f = r3     // Catch: java.lang.Throwable -> La5
            java.lang.Object r0 = r9.d(r0)     // Catch: java.lang.Throwable -> La5
            if (r0 != r1) goto L9d
        L9c:
            return r1
        L9d:
            r8 = r0
            r0 = r10
            r10 = r8
        La0:
            r4 = r10
            z8.w1 r4 = (z8.w1) r4     // Catch: java.lang.Throwable -> L36
            r10 = r0
            goto Laa
        La5:
            r0 = move-exception
            r8 = r0
            r0 = r10
            r10 = r8
            goto Lae
        Laa:
            r10.unlock(r7)
            return r4
        Lae:
            r0.unlock(r7)
            throw r10
        Lb2:
            r10 = move-exception
            r2.unlock(r7)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.a.J(j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c4, code lost:
    
        if (r10.emit(r7, r0) != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
    
        if (r10 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(j00.c<? super z8.b1> r10) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.a.c(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(j00.c<? super z8.w1> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof n7.a.h
            if (r0 == 0) goto L13
            r0 = r7
            n7.a$h r0 = (n7.a.h) r0
            int r1 = r0.f74589c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f74589c = r1
            goto L18
        L13:
            n7.a$h r0 = new n7.a$h
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f74587a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f74589c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r7)
            goto L6f
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            kotlin.e.n(r7)
            l7.e r7 = new l7.e
            r2 = 3
            r4 = 0
            r7.<init>(r4, r4, r2, r4)
            c4.j$a r2 = c4.j.f7801a
            na0.a r2 = r2.a()
            ab0.e r2 = r2.P()
            cb0.b r2 = r2.h()
            java.lang.Class<l7.c> r5 = l7.c.class
            h10.d r5 = kotlin.jvm.internal.o0.d(r5)
            java.lang.Object r2 = r2.i(r5, r4, r4)
            l7.c r2 = (l7.c) r2
            java.lang.Class<z8.b2> r4 = z8.b2.class
            h10.d r4 = kotlin.jvm.internal.o0.d(r4)
            n7.a$g r5 = new n7.a$g
            r5.<init>(r4, r7, r2)
            java.lang.Object r7 = w7.f.b(r5)
            z8.b2 r7 = (z8.b2) r7
            r0.f74589c = r3
            java.lang.Object r7 = r7.l6(r0)
            if (r7 != r1) goto L6f
            return r1
        L6f:
            r0 = r7
            z8.w1 r0 = (z8.w1) r0
            kotlinx.coroutines.flow.y<z8.w1> r1 = r6.f74543e
            r1.d(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.a.d(j00.c):java.lang.Object");
    }

    @Override // n7.e
    @k
    public m0<c1> h() {
        return this.f74544f;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0066 A[Catch: all -> 0x007e, TRY_LEAVE, TryCatch #1 {all -> 0x007e, blocks: (B:26:0x005a, B:28:0x0066), top: B:25:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // n7.e
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p1(@m80.k j00.c<? super z8.c1> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof n7.a.C0900a
            if (r0 == 0) goto L13
            r0 = r9
            n7.a$a r0 = (n7.a.C0900a) r0
            int r1 = r0.f74551f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f74551f = r1
            goto L18
        L13:
            n7.a$a r0 = new n7.a$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f74549d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f74551f
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r0 = r0.f74546a
            n40.a r0 = (n40.a) r0
            kotlin.e.n(r9)     // Catch: java.lang.Throwable -> L32
            goto L78
        L32:
            r9 = move-exception
            goto L87
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3c:
            int r2 = r0.f74547b
            java.lang.Object r5 = r0.f74546a
            n40.a r5 = (n40.a) r5
            kotlin.e.n(r9)
            r9 = r5
            goto L5a
        L47:
            kotlin.e.n(r9)
            n40.a r9 = r8.f74541c
            r0.f74546a = r9
            r0.f74547b = r3
            r0.f74551f = r5
            java.lang.Object r2 = r9.lock(r6, r0)
            if (r2 != r1) goto L59
            goto L74
        L59:
            r2 = r3
        L5a:
            kotlinx.coroutines.flow.m0 r5 = r8.h()     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Throwable -> L7e
            z8.c1 r5 = (z8.c1) r5     // Catch: java.lang.Throwable -> L7e
            if (r5 != 0) goto L83
            r0.f74546a = r9     // Catch: java.lang.Throwable -> L7e
            r0.f74547b = r2     // Catch: java.lang.Throwable -> L7e
            r0.f74548c = r3     // Catch: java.lang.Throwable -> L7e
            r0.f74551f = r4     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r0 = r8.c(r0)     // Catch: java.lang.Throwable -> L7e
            if (r0 != r1) goto L75
        L74:
            return r1
        L75:
            r7 = r0
            r0 = r9
            r9 = r7
        L78:
            z8.b1 r9 = (z8.b1) r9     // Catch: java.lang.Throwable -> L32
            z8.c1 r5 = r9.f101190a     // Catch: java.lang.Throwable -> L32
            r9 = r0
            goto L83
        L7e:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
            goto L87
        L83:
            r9.unlock(r6)
            return r5
        L87:
            r0.unlock(r6)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.a.p1(j00.c):java.lang.Object");
    }

    @Override // c4.j, pa0.a
    @k
    public /* bridge */ na0.a r() {
        return super.r();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    @Override // n7.e
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object u2(boolean r19, @m80.k j00.c<? super yz.g2> r20) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.a.u2(boolean, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0051, code lost:
    
        if (r2.lock(null, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // n7.e
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object v(@m80.k j00.c<? super yz.g2> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof n7.a.d
            if (r0 == 0) goto L13
            r0 = r8
            n7.a$d r0 = (n7.a.d) r0
            int r1 = r0.f74568e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f74568e = r1
            goto L18
        L13:
            n7.a$d r0 = new n7.a$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f74566c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f74568e
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r0 = r0.f74564a
            n40.a r0 = (n40.a) r0
            kotlin.e.n(r8)
            goto L6c
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3a:
            java.lang.Object r2 = r0.f74564a
            n40.a r2 = (n40.a) r2
            kotlin.e.n(r8)
            goto L54
        L42:
            kotlin.e.n(r8)
            n40.a r2 = r7.f74542d
            r0.f74564a = r2
            r0.f74565b = r3
            r0.f74568e = r5
            java.lang.Object r8 = r2.lock(r6, r0)
            if (r8 != r1) goto L54
            goto L6a
        L54:
            kotlinx.coroutines.flow.y<z8.w1> r8 = r7.f74543e     // Catch: java.lang.Throwable -> L86
            r8.d(r6)     // Catch: java.lang.Throwable -> L86
            r2.unlock(r6)
            n40.a r8 = r7.f74541c
            r0.f74564a = r8
            r0.f74565b = r3
            r0.f74568e = r4
            java.lang.Object r0 = r8.lock(r6, r0)
            if (r0 != r1) goto L6b
        L6a:
            return r1
        L6b:
            r0 = r8
        L6c:
            kotlinx.coroutines.flow.y<z8.t1> r8 = r7.f74545g     // Catch: java.lang.Throwable -> L81
            r8.d(r6)     // Catch: java.lang.Throwable -> L81
            kotlinx.coroutines.flow.y<z8.c1> r8 = r7.f74544f     // Catch: java.lang.Throwable -> L81
            r8.d(r6)     // Catch: java.lang.Throwable -> L81
            kotlinx.coroutines.flow.y<z8.w1> r8 = r7.f74543e     // Catch: java.lang.Throwable -> L81
            r8.d(r6)     // Catch: java.lang.Throwable -> L81
            r0.unlock(r6)
            yz.g2 r8 = yz.g2.f100423a
            return r8
        L81:
            r8 = move-exception
            r0.unlock(r6)
            throw r8
        L86:
            r8 = move-exception
            r2.unlock(r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.a.v(j00.c):java.lang.Object");
    }
}
