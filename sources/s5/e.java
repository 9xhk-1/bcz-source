package s5;

import c4.j;
import com.microsoft.thrifty.service.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import l7.i0;
import l7.p;
import m80.k;
import m80.l;
import n40.g;
import oa0.r;
import ws.i;
import y7.d;
import yz.g2;
import z8.b2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {s5.b.class})
@u0({"SMAP\nPurchasedBookRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PurchasedBookRepo.kt\ncom/baicizhan/app/biz/game/repo/monetization/PurchasedBookRepoImpl\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n+ 7 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,59:1\n6#2:60\n64#3,2:61\n66#3:64\n67#3,2:70\n6#4:63\n124#5,4:65\n142#6:69\n116#7,11:72\n*S KotlinDebug\n*F\n+ 1 PurchasedBookRepo.kt\ncom/baicizhan/app/biz/game/repo/monetization/PurchasedBookRepoImpl\n*L\n29#1:60\n29#1:61,2\n29#1:64\n29#1:70,2\n29#1:63\n29#1:65,4\n29#1:69\n46#1:72,11\n*E\n"})
/* loaded from: classes3.dex */
public final class e implements s5.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final p f87844a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.baicizhan.app.preferences.a f87845b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.baicizhan.app.biz.auth.r f87846c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final k50.a f87847d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final n40.a f87848e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.monetization.PurchasedBookRepoImpl", f = "PurchasedBookRepo.kt", i = {0, 0, 1, 1, 1, 2, 2, 2, 2, 2}, l = {65, 47, 49}, m = "fetch", n = {"$this$withLock_u24default$iv", "$i$f$withLock", "$this$withLock_u24default$iv", "$i$f$withLock", "$i$a$-withLock$default-PurchasedBookRepoImpl$fetch$2", "$this$withLock_u24default$iv", "books", "booksJson", "$i$f$withLock", "$i$a$-withLock$default-PurchasedBookRepoImpl$fetch$2"}, s = {"L$0", "I$0", "L$0", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f87849a;

        /* renamed from: b, reason: collision with root package name */
        public Object f87850b;

        /* renamed from: c, reason: collision with root package name */
        public Object f87851c;

        /* renamed from: d, reason: collision with root package name */
        public int f87852d;

        /* renamed from: e, reason: collision with root package name */
        public int f87853e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f87854f;

        /* renamed from: h, reason: collision with root package name */
        public int f87856h;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f87854f = obj;
            this.f87856h |= Integer.MIN_VALUE;
            return e.this.b(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.monetization.PurchasedBookRepoImpl", f = "PurchasedBookRepo.kt", i = {1, 2}, l = {37, 39, 41}, m = "getPurchaseBookList", n = {"booksJson", "booksJson"}, s = {"L$0", "L$0"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f87857a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f87858b;

        /* renamed from: d, reason: collision with root package name */
        public int f87860d;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f87858b = obj;
            this.f87860d |= Integer.MIN_VALUE;
            return e.this.a(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class c implements x00.l<w7.d<b2>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f87861a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f87862b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f87863c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f87864a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f87865b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f87866c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f87864a = eVar;
                this.f87865b = cVar;
                this.f87866c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f87864a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f87864a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f87865b.b(this.f87866c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public c(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f87861a = dVar;
            this.f87862b = eVar;
            this.f87863c = cVar;
        }

        public final void a(w7.d<b2> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f87862b, this.f87863c, this.f87861a));
            x00.p<i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f87861a);
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

    public e(@k p thrift, @k com.baicizhan.app.preferences.a factory, @k com.baicizhan.app.biz.auth.r tokenProvider, @k k50.a json) {
        g0.p(thrift, "thrift");
        g0.p(factory, "factory");
        g0.p(tokenProvider, "tokenProvider");
        g0.p(json, "json");
        this.f87844a = thrift;
        this.f87845b = factory;
        this.f87846c = tokenProvider;
        this.f87847d = json;
        this.f87848e = g.b(false, 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0083, code lost:
    
        if (r9 == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0085, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        if (b(r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
    
        if (r9 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // s5.b
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k j00.c<? super java.util.List<java.lang.Integer>> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof s5.e.b
            if (r0 == 0) goto L13
            r0 = r9
            s5.e$b r0 = (s5.e.b) r0
            int r1 = r0.f87860d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f87860d = r1
            goto L18
        L13:
            s5.e$b r0 = new s5.e$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f87858b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f87860d
            java.lang.String r3 = "PurchasedBook"
            r4 = 3
            r5 = 2
            r6 = 1
            java.lang.String r7 = ""
            if (r2 == 0) goto L4b
            if (r2 == r6) goto L47
            if (r2 == r5) goto L3f
            if (r2 != r4) goto L37
            java.lang.Object r0 = r0.f87857a
            java.lang.String r0 = (java.lang.String) r0
            kotlin.e.n(r9)
            goto L86
        L37:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3f:
            java.lang.Object r2 = r0.f87857a
            java.lang.String r2 = (java.lang.String) r2
            kotlin.e.n(r9)
            goto L73
        L47:
            kotlin.e.n(r9)
            goto L5b
        L4b:
            kotlin.e.n(r9)
            com.baicizhan.app.preferences.g r9 = r8.c()
            r0.f87860d = r6
            java.lang.Object r9 = r9.j(r3, r7, r0)
            if (r9 != r1) goto L5b
            goto L85
        L5b:
            r2 = r9
            java.lang.String r2 = (java.lang.String) r2
            boolean r9 = kotlin.jvm.internal.g0.g(r2, r7)
            if (r9 == 0) goto L73
            java.lang.Object r9 = l00.k.a(r2)
            r0.f87857a = r9
            r0.f87860d = r5
            java.lang.Object r9 = r8.b(r0)
            if (r9 != r1) goto L73
            goto L85
        L73:
            com.baicizhan.app.preferences.g r9 = r8.c()
            java.lang.Object r2 = l00.k.a(r2)
            r0.f87857a = r2
            r0.f87860d = r4
            java.lang.Object r9 = r9.j(r3, r7, r0)
            if (r9 != r1) goto L86
        L85:
            return r1
        L86:
            java.lang.String r9 = (java.lang.String) r9
            k50.a r0 = r8.f87847d
            kotlin.jvm.internal.e0 r1 = kotlin.jvm.internal.e0.f66981a
            f50.i r1 = g50.a.C(r1)
            f50.i r1 = g50.a.i(r1)
            f50.e r1 = (f50.e) r1
            java.lang.Object r9 = r0.c(r1, r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.e.a(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // s5.b
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(@m80.k j00.c<? super yz.g2> r12) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.e.b(j00.c):java.lang.Object");
    }

    public final com.baicizhan.app.preferences.g c() {
        com.baicizhan.app.preferences.a aVar = this.f87845b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("PurchasedBookRepoScope-");
        Long b11 = this.f87846c.b();
        g0.m(b11);
        sb2.append(b11.longValue());
        return aVar.a(sb2.toString());
    }

    public final b2 d() {
        return (b2) w7.f.b(new c(o0.d(b2.class), new l7.e(null, null, 3, null), (l7.c) j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    @Override // s5.b
    @l
    public Object v(@k j00.c<? super g2> cVar) {
        Object k11 = c().k(f.f87868b, "", cVar);
        return k11 == kotlin.coroutines.intrinsics.b.l() ? k11 : g2.f100423a;
    }
}
