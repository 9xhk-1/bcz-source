package r6;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.microsoft.thrifty.service.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import l7.i0;
import y7.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
@u0({"SMAP\nFetchGameHomeUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FetchGameHomeUC.kt\ncom/baicizhan/app/biz/game/uc/sync/atomic/FetchGameHomeUC\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,41:1\n6#2:42\n64#3,2:43\n66#3:46\n67#3,2:52\n6#4:45\n124#5,4:47\n142#6:51\n*S KotlinDebug\n*F\n+ 1 FetchGameHomeUC.kt\ncom/baicizhan/app/biz/game/uc/sync/atomic/FetchGameHomeUC\n*L\n21#1:42\n21#1:43,2\n21#1:46\n21#1:52,2\n21#1:45\n21#1:47,4\n21#1:51\n*E\n"})
/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final l7.p f83183a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final c6.b f83184b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.repo.book.b f83185c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final o5.a f83186d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final h6.b f83187e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.sync.atomic.FetchGameHomeUC", f = "FetchGameHomeUC.kt", i = {0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4}, l = {30, 32, 33, 34, 35}, m = "invoke", n = {"bookId", HiAnalyticsConstant.Direction.RESPONSE, "bookId", "responseBookId", HiAnalyticsConstant.Direction.RESPONSE, "bookId", "responseBookId", HiAnalyticsConstant.Direction.RESPONSE, "bookId", "responseBookId", HiAnalyticsConstant.Direction.RESPONSE, "bookId", "responseBookId"}, s = {"I$0", "L$0", "I$0", "J$0", "L$0", "I$0", "J$0", "L$0", "I$0", "J$0", "L$0", "I$0", "J$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f83188a;

        /* renamed from: b, reason: collision with root package name */
        public Object f83189b;

        /* renamed from: c, reason: collision with root package name */
        public long f83190c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f83191d;

        /* renamed from: f, reason: collision with root package name */
        public int f83193f;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f83191d = obj;
            this.f83193f |= Integer.MIN_VALUE;
            return n.this.b(0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class b implements x00.l<w7.d<p8.s>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f83194a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f83195b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f83196c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f83197a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f83198b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f83199c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f83197a = eVar;
                this.f83198b = cVar;
                this.f83199c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f83197a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f83197a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f83198b.b(this.f83199c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public b(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f83194a = dVar;
            this.f83195b = eVar;
            this.f83196c = cVar;
        }

        public final void a(w7.d<p8.s> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f83195b, this.f83196c, this.f83194a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f83194a);
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

    public n(@m80.k l7.p thrift, @m80.k c6.b userGameRepo, @m80.k com.baicizhan.app.biz.game.repo.book.b scheduleRepo, @m80.k o5.a versionProvider, @m80.k h6.b updateGameRoundUC) {
        g0.p(thrift, "thrift");
        g0.p(userGameRepo, "userGameRepo");
        g0.p(scheduleRepo, "scheduleRepo");
        g0.p(versionProvider, "versionProvider");
        g0.p(updateGameRoundUC, "updateGameRoundUC");
        this.f83183a = thrift;
        this.f83184b = userGameRepo;
        this.f83185c = scheduleRepo;
        this.f83186d = versionProvider;
        this.f83187e = updateGameRoundUC;
    }

    public static /* synthetic */ Object c(n nVar, int i11, j00.c cVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        return nVar.b(i11, cVar);
    }

    public final p8.s a() {
        return (p8.s) w7.f.b(new b(o0.d(p8.s.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a6, code lost:
    
        if (r2 == r3) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r18, @m80.k j00.c<? super yz.g2> r19) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.n.b(int, j00.c):java.lang.Object");
    }
}
