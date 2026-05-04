package o6;

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
@u0({"SMAP\nGiveUpGameUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiveUpGameUC.kt\ncom/baicizhan/app/biz/game/uc/study/GiveUpGameUC\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,35:1\n6#2:36\n64#3,2:37\n66#3:40\n67#3,2:46\n6#4:39\n124#5,4:41\n142#6:45\n*S KotlinDebug\n*F\n+ 1 GiveUpGameUC.kt\ncom/baicizhan/app/biz/game/uc/study/GiveUpGameUC\n*L\n18#1:36\n18#1:37,2\n18#1:40\n18#1:46,2\n18#1:39\n18#1:41,4\n18#1:45\n*E\n"})
/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final l7.p f76222a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.repo.gameround.e f76223b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final o5.a f76224c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.study.GiveUpGameUC", f = "GiveUpGameUC.kt", i = {0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3}, l = {23, 25, 26, 27}, m = "invoke", n = {"gameId", "gameId", "$this$invoke_u24lambda_u240", "version", "$i$a$-runCatching-GiveUpGameUC$invoke$2", "gameId", "$this$invoke_u24lambda_u240", "gameRound", "version", "$i$a$-runCatching-GiveUpGameUC$invoke$2", "gameId", "$this$invoke_u24lambda_u240", "gameRound", "version", "$i$a$-runCatching-GiveUpGameUC$invoke$2"}, s = {"L$0", "L$0", "L$1", "J$0", "I$0", "L$0", "L$1", "L$2", "J$0", "I$0", "L$0", "L$1", "L$2", "J$0", "I$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f76225a;

        /* renamed from: b, reason: collision with root package name */
        public Object f76226b;

        /* renamed from: c, reason: collision with root package name */
        public Object f76227c;

        /* renamed from: d, reason: collision with root package name */
        public long f76228d;

        /* renamed from: e, reason: collision with root package name */
        public int f76229e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f76230f;

        /* renamed from: h, reason: collision with root package name */
        public int f76232h;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f76230f = obj;
            this.f76232h |= Integer.MIN_VALUE;
            return t.this.b(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class b implements x00.l<w7.d<p8.s>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f76233a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f76234b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f76235c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f76236a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f76237b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f76238c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f76236a = eVar;
                this.f76237b = cVar;
                this.f76238c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f76236a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f76236a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f76237b.b(this.f76238c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public b(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f76233a = dVar;
            this.f76234b = eVar;
            this.f76235c = cVar;
        }

        public final void a(w7.d<p8.s> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f76234b, this.f76235c, this.f76233a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f76233a);
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

    public t(@m80.k l7.p thrift, @m80.k com.baicizhan.app.biz.game.repo.gameround.e gameRoundRepo, @m80.k o5.a versionProvider) {
        g0.p(thrift, "thrift");
        g0.p(gameRoundRepo, "gameRoundRepo");
        g0.p(versionProvider, "versionProvider");
        this.f76222a = thrift;
        this.f76223b = gameRoundRepo;
        this.f76224c = versionProvider;
    }

    public final p8.s a() {
        return (p8.s) w7.f.b(new b(o0.d(p8.s.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(7:(1:(1:(8:13|14|15|16|17|(1:19)|20|21)(2:27|28))(7:29|30|31|32|33|(6:36|16|17|(0)|20|21)|35))(8:44|45|46|47|48|49|(3:51|33|(0))|35)|43|26|17|(0)|20|21)(1:58))(1:64)|59|60|61|(4:63|48|49|(0))|35))|66|6|7|(0)(0)|59|60|61|(0)|35) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0108, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0109, code lost:
    
        r15 = r0;
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x009f, code lost:
    
        if (r15 == r0) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@m80.k java.lang.String r14, @m80.k j00.c<? super yz.g2> r15) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.t.b(java.lang.String, j00.c):java.lang.Object");
    }
}
