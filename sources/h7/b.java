package h7;

import com.baicizhan.app.biz.base.cache.CacheStrategy;
import com.microsoft.thrifty.service.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import l7.i0;
import l7.p;
import oa0.r;
import t3.a0;
import t3.e;
import t3.n;
import t3.z;
import y7.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {e.class})
@u0({"SMAP\nIBookAdRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IBookAdRepo.kt\ncom/baicizhan/app/biz/study4ini/BookAdRepoImpl\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,40:1\n6#2:41\n64#3,2:42\n66#3:45\n67#3,2:51\n6#4:44\n124#5,4:46\n142#6:50\n1#7:53\n*S KotlinDebug\n*F\n+ 1 IBookAdRepo.kt\ncom/baicizhan/app/biz/study4ini/BookAdRepoImpl\n*L\n23#1:41\n23#1:42,2\n23#1:45\n23#1:51,2\n23#1:44\n23#1:46,4\n23#1:50\n*E\n"})
/* loaded from: classes3.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final p f58574a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final t3.g<g8.l> f58575b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.study4ini.BookAdRepoImpl$cache$1$1", f = "IBookAdRepo.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements x00.l<j00.c<? super g8.l>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f58576a;

        public a(j00.c<? super a> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return b.this.new a(cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super g8.l> cVar) {
            return ((a) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f58576a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            g8.c e11 = b.this.e();
            this.f58576a = 1;
            Object f02 = e11.f0(this);
            return f02 == l11 ? l11 : f02;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.study4ini.BookAdRepoImpl", f = "IBookAdRepo.kt", i = {0, 0}, l = {34}, m = "queryBookAd", n = {"bookId", "$i$a$-runCatching-BookAdRepoImpl$queryBookAd$2"}, s = {"I$0", "I$1"}, v = 1)
    /* renamed from: h7.b$b, reason: collision with other inner class name */
    public static final class C0662b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f58578a;

        /* renamed from: b, reason: collision with root package name */
        public int f58579b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f58580c;

        /* renamed from: e, reason: collision with root package name */
        public int f58582e;

        public C0662b(j00.c<? super C0662b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f58580c = obj;
            this.f58582e |= Integer.MIN_VALUE;
            return b.this.a(0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class c implements x00.l<w7.d<g8.c>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f58583a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f58584b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f58585c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f58586a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f58587b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f58588c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f58586a = eVar;
                this.f58587b = cVar;
                this.f58588c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f58586a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f58586a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f58587b.b(this.f58588c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public c(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f58583a = dVar;
            this.f58584b = eVar;
            this.f58585c = cVar;
        }

        public final void a(w7.d<g8.c> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f58584b, this.f58585c, this.f58583a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f58583a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<g8.c> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    public b(@m80.k p thriftService) {
        g0.p(thriftService, "thriftService");
        this.f58574a = thriftService;
        this.f58575b = a0.a(new x00.l() { // from class: h7.a
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 d11;
                d11 = b.d(b.this, (t3.b) obj);
                return d11;
            }
        });
    }

    public static final g2 d(b bVar, t3.b cache) {
        g0.p(cache, "$this$cache");
        cache.f(f.f58606a);
        cache.g(CacheStrategy.CACHE_FIRST);
        cache.i(n.c.f89276a);
        cache.h(new e.a(new z.b(g8.l.f53316d), false, 2, null));
        cache.j(bVar.new a(null));
        return g2.f100423a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:30|31))(3:32|33|(1:35))|12|(2:13|(2:15|(2:17|18)(1:27))(2:28|29))|19|20|(1:25)(2:22|23)))|38|6|7|(0)(0)|12|(3:13|(0)(0)|27)|19|20|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x002c, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
    
        r7 = kotlin.Result.Companion;
        r6 = kotlin.Result.m6308constructorimpl(kotlin.e.a(r6));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:11:0x0028, B:12:0x004b, B:13:0x0055, B:15:0x005b, B:19:0x0068, B:33:0x0039), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // h7.e
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(int r6, @m80.k j00.c<? super g8.k> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof h7.b.C0662b
            if (r0 == 0) goto L13
            r0 = r7
            h7.b$b r0 = (h7.b.C0662b) r0
            int r1 = r0.f58582e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58582e = r1
            goto L18
        L13:
            h7.b$b r0 = new h7.b$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f58580c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f58582e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            int r6 = r0.f58578a
            kotlin.e.n(r7)     // Catch: java.lang.Throwable -> L2c
            goto L4b
        L2c:
            r6 = move-exception
            goto L6f
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.e.n(r7)
            kotlin.Result$a r7 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L2c
            t3.g<g8.l> r7 = r5.f58575b     // Catch: java.lang.Throwable -> L2c
            r0.f58578a = r6     // Catch: java.lang.Throwable -> L2c
            r2 = 0
            r0.f58579b = r2     // Catch: java.lang.Throwable -> L2c
            r0.f58582e = r4     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r7 = r7.b(r0)     // Catch: java.lang.Throwable -> L2c
            if (r7 != r1) goto L4b
            return r1
        L4b:
            g8.l r7 = (g8.l) r7     // Catch: java.lang.Throwable -> L2c
            java.util.List<g8.k> r7 = r7.f53317a     // Catch: java.lang.Throwable -> L2c
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch: java.lang.Throwable -> L2c
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L2c
        L55:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L67
            java.lang.Object r0 = r7.next()     // Catch: java.lang.Throwable -> L2c
            r1 = r0
            g8.k r1 = (g8.k) r1     // Catch: java.lang.Throwable -> L2c
            int r1 = r1.f53303a     // Catch: java.lang.Throwable -> L2c
            if (r1 != r6) goto L55
            goto L68
        L67:
            r0 = r3
        L68:
            g8.k r0 = (g8.k) r0     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r6 = kotlin.Result.m6308constructorimpl(r0)     // Catch: java.lang.Throwable -> L2c
            goto L79
        L6f:
            kotlin.Result$a r7 = kotlin.Result.Companion
            java.lang.Object r6 = kotlin.e.a(r6)
            java.lang.Object r6 = kotlin.Result.m6308constructorimpl(r6)
        L79:
            boolean r7 = kotlin.Result.m6314isFailureimpl(r6)
            if (r7 == 0) goto L80
            goto L81
        L80:
            r3 = r6
        L81:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.b.a(int, j00.c):java.lang.Object");
    }

    public final g8.c e() {
        return (g8.c) w7.f.b(new c(o0.d(g8.c.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }
}
