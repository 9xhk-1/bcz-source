package r6;

import c40.r0;
import com.microsoft.thrifty.service.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import l7.i0;
import p8.o0;
import y7.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
@u0({"SMAP\nFetchSentenceHomeUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FetchSentenceHomeUC.kt\ncom/baicizhan/app/biz/game/uc/sync/atomic/FetchSentenceHomeUC\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,37:1\n6#2:38\n64#3,2:39\n66#3:42\n67#3,2:48\n6#4:41\n124#5,4:43\n142#6:47\n*S KotlinDebug\n*F\n+ 1 FetchSentenceHomeUC.kt\ncom/baicizhan/app/biz/game/uc/sync/atomic/FetchSentenceHomeUC\n*L\n23#1:38\n23#1:39,2\n23#1:42\n23#1:48,2\n23#1:41\n23#1:43,4\n23#1:47\n*E\n"})
/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final l7.p f83217a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x5.b f83218b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final x5.g f83219c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final c6.b f83220d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.sync.atomic.FetchSentenceHomeUC", f = "FetchSentenceHomeUC.kt", i = {0, 1, 1}, l = {27, 28}, m = "invoke", n = {"skuId", "sentenceInfo", "skuId"}, s = {"I$0", "L$0", "I$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f83221a;

        /* renamed from: b, reason: collision with root package name */
        public Object f83222b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f83223c;

        /* renamed from: e, reason: collision with root package name */
        public int f83225e;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f83223c = obj;
            this.f83225e |= Integer.MIN_VALUE;
            return r.this.e(0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.sync.atomic.FetchSentenceHomeUC$invoke$2", f = "FetchSentenceHomeUC.kt", i = {}, l = {29, 30, 31}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f83226a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o0 f83228c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f83229d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o0 o0Var, int i11, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f83228c = o0Var;
            this.f83229d = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return r.this.new b(this.f83228c, this.f83229d, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
        
            if (r6.e(r1, r3, r5) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
        
            if (r6.i(r1, r4, r5) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
        
            if (r6.c(r1, r5) == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r5.f83226a
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L25
                if (r1 == r4) goto L21
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                kotlin.e.n(r6)
                goto L63
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1d:
                kotlin.e.n(r6)
                goto L4e
            L21:
                kotlin.e.n(r6)
                goto L39
            L25:
                kotlin.e.n(r6)
                r6.r r6 = r6.r.this
                x5.b r6 = r6.r.a(r6)
                p8.o0 r1 = r5.f83228c
                r5.f83226a = r4
                java.lang.Object r6 = r6.c(r1, r5)
                if (r6 != r0) goto L39
                goto L62
            L39:
                r6.r r6 = r6.r.this
                c6.b r6 = r6.r.c(r6)
                com.baicizhan.app.biz.game.repo.userresource.LanguageType r1 = com.baicizhan.app.biz.game.repo.userresource.LanguageType.Jp
                p8.o0 r4 = r5.f83228c
                p8.i1 r4 = r4.f80031d
                r5.f83226a = r3
                java.lang.Object r6 = r6.i(r1, r4, r5)
                if (r6 != r0) goto L4e
                goto L62
            L4e:
                r6.r r6 = r6.r.this
                x5.g r6 = r6.r.b(r6)
                int r1 = r5.f83229d
                p8.o0 r3 = r5.f83228c
                java.lang.String r3 = r3.f80030c
                r5.f83226a = r2
                java.lang.Object r6 = r6.e(r1, r3, r5)
                if (r6 != r0) goto L63
            L62:
                return r0
            L63:
                yz.g2 r6 = yz.g2.f100423a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: r6.r.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class c implements x00.l<w7.d<p8.s>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f83230a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f83231b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f83232c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f83233a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f83234b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f83235c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f83233a = eVar;
                this.f83234b = cVar;
                this.f83235c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f83233a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f83233a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f83234b.b(this.f83235c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public c(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f83230a = dVar;
            this.f83231b = eVar;
            this.f83232c = cVar;
        }

        public final void a(w7.d<p8.s> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f83231b, this.f83232c, this.f83230a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f83230a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<p8.s> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    public r(@m80.k l7.p thrift, @m80.k x5.b sentenceGameRepo, @m80.k x5.g sentenceRoadMapRepo, @m80.k c6.b userGameRepo) {
        g0.p(thrift, "thrift");
        g0.p(sentenceGameRepo, "sentenceGameRepo");
        g0.p(sentenceRoadMapRepo, "sentenceRoadMapRepo");
        g0.p(userGameRepo, "userGameRepo");
        this.f83217a = thrift;
        this.f83218b = sentenceGameRepo;
        this.f83219c = sentenceRoadMapRepo;
        this.f83220d = userGameRepo;
    }

    public final p8.s d() {
        return (p8.s) w7.f.b(new c(kotlin.jvm.internal.o0.d(p8.s.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(kotlin.jvm.internal.o0.d(l7.c.class), null, null)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
    
        if (c40.i.h(r2, r4, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (r13 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(int r12, @m80.k j00.c<? super yz.g2> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof r6.r.a
            if (r0 == 0) goto L13
            r0 = r13
            r6.r$a r0 = (r6.r.a) r0
            int r1 = r0.f83225e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f83225e = r1
            goto L18
        L13:
            r6.r$a r0 = new r6.r$a
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f83223c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f83225e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r12 = r0.f83222b
            p8.o0 r12 = (p8.o0) r12
            kotlin.e.n(r13)
            goto L77
        L30:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L38:
            int r12 = r0.f83221a
            kotlin.e.n(r13)
            goto L5c
        L3e:
            kotlin.e.n(r13)
            z6.b r5 = z6.b.f101032b
            r9 = 4
            r10 = 0
            java.lang.String r6 = "FetchSentenceHomeUC"
            java.lang.String r7 = "start fetching game home data"
            r8 = 0
            z6.b.j(r5, r6, r7, r8, r9, r10)
            p8.s r13 = r11.d()
            r0.f83221a = r12
            r0.f83225e = r4
            java.lang.Object r13 = r13.l2(r12, r0)
            if (r13 != r1) goto L5c
            goto L76
        L5c:
            p8.o0 r13 = (p8.o0) r13
            c40.x2 r2 = c40.x2.f8011a
            r6.r$b r4 = new r6.r$b
            r5 = 0
            r4.<init>(r13, r12, r5)
            java.lang.Object r13 = l00.k.a(r13)
            r0.f83222b = r13
            r0.f83221a = r12
            r0.f83225e = r3
            java.lang.Object r12 = c40.i.h(r2, r4, r0)
            if (r12 != r1) goto L77
        L76:
            return r1
        L77:
            z6.b r2 = z6.b.f101032b
            r6 = 4
            r7 = 0
            java.lang.String r3 = "FetchSentenceHomeUC"
            java.lang.String r4 = "fetch success"
            r5 = 0
            z6.b.j(r2, r3, r4, r5, r6, r7)
            yz.g2 r12 = yz.g2.f100423a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.r.e(int, j00.c):java.lang.Object");
    }
}
