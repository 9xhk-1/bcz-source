package x3;

import com.baicizhan.app.biz.synservice.version.IVersionRepo;
import com.microsoft.thrifty.service.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import l7.i0;
import y7.d;
import yz.g2;
import z8.b2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {f0.class})
@u0({"SMAP\nIBookRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IBookRepo.kt\ncom/baicizhan/app/biz/books/BookRepoImpl\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n+ 7 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n6#2:54\n64#3,2:55\n66#3:58\n67#3,2:64\n6#4:57\n124#5,4:59\n142#6:63\n116#7,11:66\n1#8:77\n*S KotlinDebug\n*F\n+ 1 IBookRepo.kt\ncom/baicizhan/app/biz/books/BookRepoImpl\n*L\n25#1:54\n25#1:55,2\n25#1:58\n25#1:64,2\n25#1:57\n25#1:59,4\n25#1:63\n29#1:66,11\n*E\n"})
/* loaded from: classes3.dex */
public final class c implements f0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final z3.c f97151a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final IVersionRepo f97152b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final l7.p f97153c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final n40.a f97154d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.books.BookRepoImpl", f = "IBookRepo.kt", i = {1, 1, 1, 1, 1, 2, 2, 2, 3, 3}, l = {44, 46, 47, 49}, m = "doSyn", n = {"books", "$this$doSyn_u24lambda_u240", "$this$doSyn_u24lambda_u240_u240", "$i$a$-run-BookRepoImpl$doSyn$remoteVersion$1", "$i$a$-runCatching-BookRepoImpl$doSyn$remoteVersion$1$1", "books", "$this$doSyn_u24lambda_u240", "$i$a$-run-BookRepoImpl$doSyn$remoteVersion$1", "books", "remoteVersion"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "I$0", "L$0", "J$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f97155a;

        /* renamed from: b, reason: collision with root package name */
        public Object f97156b;

        /* renamed from: c, reason: collision with root package name */
        public Object f97157c;

        /* renamed from: d, reason: collision with root package name */
        public int f97158d;

        /* renamed from: e, reason: collision with root package name */
        public int f97159e;

        /* renamed from: f, reason: collision with root package name */
        public long f97160f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f97161g;

        /* renamed from: i, reason: collision with root package name */
        public int f97163i;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f97161g = obj;
            this.f97163i |= Integer.MIN_VALUE;
            return c.this.c(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.books.BookRepoImpl", f = "IBookRepo.kt", i = {0, 0, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4}, l = {59, 30, 31, 37, 38}, m = "loadBooks", n = {"$this$withLock_u24default$iv", "$i$f$withLock", "$this$withLock_u24default$iv", "$i$f$withLock", "$i$a$-withLock$default-BookRepoImpl$loadBooks$2", "$this$withLock_u24default$iv", "$i$f$withLock", "$i$a$-withLock$default-BookRepoImpl$loadBooks$2", "localVersion", "$this$withLock_u24default$iv", "it", "$i$f$withLock", "$i$a$-withLock$default-BookRepoImpl$loadBooks$2", "localVersion", "remote", "$i$a$-let-BookRepoImpl$loadBooks$2$2", "$this$withLock_u24default$iv", "$i$f$withLock", "$i$a$-withLock$default-BookRepoImpl$loadBooks$2", "localVersion", "remote"}, s = {"L$0", "I$0", "L$0", "I$0", "I$1", "L$0", "I$0", "I$1", "J$0", "L$0", "L$1", "I$0", "I$1", "J$0", "J$1", "I$2", "L$0", "I$0", "I$1", "J$0", "J$1"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f97164a;

        /* renamed from: b, reason: collision with root package name */
        public Object f97165b;

        /* renamed from: c, reason: collision with root package name */
        public int f97166c;

        /* renamed from: d, reason: collision with root package name */
        public int f97167d;

        /* renamed from: e, reason: collision with root package name */
        public int f97168e;

        /* renamed from: f, reason: collision with root package name */
        public long f97169f;

        /* renamed from: g, reason: collision with root package name */
        public long f97170g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f97171h;

        /* renamed from: j, reason: collision with root package name */
        public int f97173j;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f97171h = obj;
            this.f97173j |= Integer.MIN_VALUE;
            return c.this.a(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    /* renamed from: x3.c$c, reason: collision with other inner class name */
    public static final class C1307c implements x00.l<w7.d<b2>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f97174a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f97175b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f97176c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        /* renamed from: x3.c$c$a */
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f97177a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f97178b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f97179c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f97177a = eVar;
                this.f97178b = cVar;
                this.f97179c = dVar;
            }

            public final void a(d.a randomRetry) {
                kotlin.jvm.internal.g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f97177a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f97177a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f97178b.b(this.f97179c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public C1307c(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f97174a = dVar;
            this.f97175b = eVar;
            this.f97176c = cVar;
        }

        public final void a(w7.d<b2> thriftBuilder) {
            kotlin.jvm.internal.g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f97175b, this.f97176c, this.f97174a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = l7.i0.o().get(this.f97174a);
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

    public c(@m80.k z3.c localBook, @m80.k IVersionRepo iVersionRepo, @m80.k l7.p thriftService) {
        kotlin.jvm.internal.g0.p(localBook, "localBook");
        kotlin.jvm.internal.g0.p(iVersionRepo, "iVersionRepo");
        kotlin.jvm.internal.g0.p(thriftService, "thriftService");
        this.f97151a = localBook;
        this.f97152b = iVersionRepo;
        this.f97153c = thriftService;
        this.f97154d = n40.g.b(false, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x0066: MOVE (r2 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]) (LINE:103), block:B:60:0x0066 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0116 A[Catch: all -> 0x0089, TryCatch #2 {all -> 0x0089, blocks: (B:27:0x0146, B:33:0x0151, B:19:0x00e1, B:23:0x0116, B:12:0x0085, B:13:0x00c0, B:62:0x00ac), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r23v0, types: [x3.c] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object] */
    @Override // x3.f0
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k j00.c<? super z8.h1> r24) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.c.a(j00.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:(1:(1:(3:13|14|15)(2:17|18))(4:19|20|(3:23|14|15)|22))(7:24|25|26|27|28|(3:30|20|(0))|22))(1:34))(1:43)|35|36|37|(4:39|27|28|(0))|22))|45|6|7|(0)(0)|35|36|37|(0)|22|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ac, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ad, code lost:
    
        r6 = r2;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0082, code lost:
    
        if (r0 == r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(j00.c<? super z8.h1> r15) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.c.c(j00.c):java.lang.Object");
    }

    public final b2 d() {
        return (b2) w7.f.b(new C1307c(o0.d(b2.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }
}
