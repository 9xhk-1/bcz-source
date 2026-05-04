package o6;

import com.baicizhan.app.biz.game.model.RoundCate;
import com.baicizhan.app.biz.game.model.RoundType;
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
@u0({"SMAP\nDoStartGameUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoStartGameUC.kt\ncom/baicizhan/app/biz/game/uc/study/DoStartGameUC\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,151:1\n6#2:152\n64#3,2:153\n66#3:156\n67#3,2:162\n6#4:155\n124#5,4:157\n142#6:161\n1563#7:164\n1634#7,3:165\n*S KotlinDebug\n*F\n+ 1 DoStartGameUC.kt\ncom/baicizhan/app/biz/game/uc/study/DoStartGameUC\n*L\n44#1:152\n44#1:153,2\n44#1:156\n44#1:162,2\n44#1:155\n44#1:157,4\n44#1:161\n141#1:164\n141#1:165,3\n*E\n"})
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.repo.gameround.e f76097a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final e f76098b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final l7.p f76099c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final o5.a f76100d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final c6.b f76101e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final q6.a f76102f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final s5.b f76103g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.monetization.o f76104h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final h6.a f76105i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final j6.a f76106j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.study.DoStartGameUC", f = "DoStartGameUC.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9}, l = {54, 57, 62, 65, 70, 75, 76, 96, 99, 101}, m = "invoke", n = {"roundType", "roundCate", "todayNum", "unitNo", "roundType", "roundCate", "todayNum", "unitNo", "bookId", "roundType", "roundCate", "todayNum", "unitNo", "bookId", "roundType", "roundCate", "todayNum", "unitNo", "bookId", "hasPurchased", "roundType", "roundCate", "$this$invoke_u24lambda_u241", "todayNum", "unitNo", "bookId", "hasPurchased", "$i$a$-runCatching-DoStartGameUC$invoke$roundRsp$1", "roundType", "roundCate", "it", "todayNum", "unitNo", "bookId", "hasPurchased", "$i$a$-recoverCatching-DoStartGameUC$invoke$roundRsp$2", "roundType", "roundCate", "it", "todayNum", "unitNo", "bookId", "hasPurchased", "$i$a$-recoverCatching-DoStartGameUC$invoke$roundRsp$2", "roundType", "roundCate", "roundRsp", "todayNum", "unitNo", "bookId", "hasPurchased", "roundType", "roundCate", "roundRsp", "todayNum", "unitNo", "bookId", "hasPurchased", "roundType", "roundCate", "roundRsp", "todayNum", "unitNo", "bookId", "hasPurchased"}, s = {"L$0", "L$1", "J$0", "I$0", "L$0", "L$1", "J$0", "I$0", "J$1", "L$0", "L$1", "J$0", "I$0", "J$1", "L$0", "L$1", "J$0", "I$0", "J$1", "Z$0", "L$0", "L$1", "L$2", "J$0", "I$0", "J$1", "Z$0", "I$1", "L$0", "L$1", "L$2", "J$0", "I$0", "J$1", "Z$0", "I$1", "L$0", "L$1", "L$2", "J$0", "I$0", "J$1", "Z$0", "I$1", "L$0", "L$1", "L$2", "J$0", "I$0", "J$1", "Z$0", "L$0", "L$1", "L$2", "J$0", "I$0", "J$1", "Z$0", "L$0", "L$1", "L$2", "J$0", "I$0", "J$1", "Z$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f76107a;

        /* renamed from: b, reason: collision with root package name */
        public long f76108b;

        /* renamed from: c, reason: collision with root package name */
        public Object f76109c;

        /* renamed from: d, reason: collision with root package name */
        public Object f76110d;

        /* renamed from: e, reason: collision with root package name */
        public Object f76111e;

        /* renamed from: f, reason: collision with root package name */
        public int f76112f;

        /* renamed from: g, reason: collision with root package name */
        public int f76113g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f76114h;

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f76115i;

        /* renamed from: k, reason: collision with root package name */
        public int f76117k;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f76115i = obj;
            this.f76117k |= Integer.MIN_VALUE;
            return g.this.c(0L, null, null, 0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class b implements x00.l<w7.d<p8.s>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f76118a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f76119b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f76120c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f76121a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f76122b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f76123c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f76121a = eVar;
                this.f76122b = cVar;
                this.f76123c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f76121a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f76121a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f76122b.b(this.f76123c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public b(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f76118a = dVar;
            this.f76119b = eVar;
            this.f76120c = cVar;
        }

        public final void a(w7.d<p8.s> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f76119b, this.f76120c, this.f76118a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f76118a);
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

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.study.DoStartGameUC", f = "DoStartGameUC.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {117, 135, 145}, m = "startGameRemote", n = {"roundType", "roundCate", "todayNum", "bookId", "hasPurchased", "unitNo", "roundType", "roundCate", xd.a.f98002r, "todayNum", "bookId", "hasPurchased", "unitNo", "realToday", "roundCateInt", "roundType", "roundCate", xd.a.f98002r, "roundReq", "todayNum", "bookId", "hasPurchased", "unitNo", "realToday", "roundCateInt"}, s = {"L$0", "L$1", "J$0", "J$1", "Z$0", "I$0", "L$0", "L$1", "L$2", "J$0", "J$1", "Z$0", "I$0", "J$2", "I$1", "L$0", "L$1", "L$2", "L$3", "J$0", "J$1", "Z$0", "I$0", "J$2", "I$1"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f76124a;

        /* renamed from: b, reason: collision with root package name */
        public Object f76125b;

        /* renamed from: c, reason: collision with root package name */
        public Object f76126c;

        /* renamed from: d, reason: collision with root package name */
        public Object f76127d;

        /* renamed from: e, reason: collision with root package name */
        public long f76128e;

        /* renamed from: f, reason: collision with root package name */
        public long f76129f;

        /* renamed from: g, reason: collision with root package name */
        public long f76130g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f76131h;

        /* renamed from: i, reason: collision with root package name */
        public int f76132i;

        /* renamed from: j, reason: collision with root package name */
        public int f76133j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f76134k;

        /* renamed from: m, reason: collision with root package name */
        public int f76136m;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f76134k = obj;
            this.f76136m |= Integer.MIN_VALUE;
            return g.this.e(null, 0L, 0L, null, false, 0, this);
        }
    }

    public g(@m80.k com.baicizhan.app.biz.game.repo.gameround.e gameRoundRepo, @m80.k e doSelectWordsUC, @m80.k l7.p thrift, @m80.k o5.a versionProvider, @m80.k c6.b userGameInfoRepo, @m80.k q6.a refreshStudyDataUC, @m80.k s5.b purchasedBookRepo, @m80.k com.baicizhan.app.biz.game.uc.monetization.o trackPromotionPopupTriggerUC, @m80.k h6.a addGameRoundUC, @m80.k j6.a checkPremiumModeUC) {
        g0.p(gameRoundRepo, "gameRoundRepo");
        g0.p(doSelectWordsUC, "doSelectWordsUC");
        g0.p(thrift, "thrift");
        g0.p(versionProvider, "versionProvider");
        g0.p(userGameInfoRepo, "userGameInfoRepo");
        g0.p(refreshStudyDataUC, "refreshStudyDataUC");
        g0.p(purchasedBookRepo, "purchasedBookRepo");
        g0.p(trackPromotionPopupTriggerUC, "trackPromotionPopupTriggerUC");
        g0.p(addGameRoundUC, "addGameRoundUC");
        g0.p(checkPremiumModeUC, "checkPremiumModeUC");
        this.f76097a = gameRoundRepo;
        this.f76098b = doSelectWordsUC;
        this.f76099c = thrift;
        this.f76100d = versionProvider;
        this.f76101e = userGameInfoRepo;
        this.f76102f = refreshStudyDataUC;
        this.f76103g = purchasedBookRepo;
        this.f76104h = trackPromotionPopupTriggerUC;
        this.f76105i = addGameRoundUC;
        this.f76106j = checkPremiumModeUC;
    }

    public static /* synthetic */ Object d(g gVar, long j11, RoundType roundType, RoundCate roundCate, int i11, j00.c cVar, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            roundCate = RoundCate.Default;
        }
        return gVar.c(j11, roundType, roundCate, i11, cVar);
    }

    public final p8.s b() {
        return (p8.s) w7.f.b(new b(o0.d(p8.s.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(5:5|6|7|8|9))|118|6|7|8|9|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01a2, code lost:
    
        if (r6 == r12) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x00b0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x00b1, code lost:
    
        r10 = r24;
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x04f6, code lost:
    
        if (r1.a(r6) != r12) goto L114;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0317 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0118  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r2v0, types: [long] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v48 */
    /* JADX WARN: Type inference failed for: r9v49 */
    /* JADX WARN: Type inference failed for: r9v55 */
    /* JADX WARN: Type inference failed for: r9v56 */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r25, @m80.k com.baicizhan.app.biz.game.model.RoundType r27, @m80.k com.baicizhan.app.biz.game.model.RoundCate r28, int r29, @m80.k j00.c<? super java.lang.Integer> r30) {
        /*
            Method dump skipped, instructions count: 1352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.g.c(long, com.baicizhan.app.biz.game.model.RoundType, com.baicizhan.app.biz.game.model.RoundCate, int, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0263, code lost:
    
        if (r1 != r10) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0205 A[LOOP:0: B:20:0x01ff->B:22:0x0205, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.baicizhan.app.biz.game.model.RoundType r26, long r27, long r29, com.baicizhan.app.biz.game.model.RoundCate r31, boolean r32, int r33, j00.c<? super p8.j0> r34) {
        /*
            Method dump skipped, instructions count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.g.e(com.baicizhan.app.biz.game.model.RoundType, long, long, com.baicizhan.app.biz.game.model.RoundCate, boolean, int, j00.c):java.lang.Object");
    }
}
