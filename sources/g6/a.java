package g6;

import com.baicizhan.app.biz.game.uc.abtest.GetABTestUC;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import o6.q;
import oa0.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final m5.c f52942a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final i f52943b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final c6.b f52944c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final s5.b f52945d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final q f52946e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.baicizhan.app.biz.game.repo.gameround.e f52947f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final GetABTestUC f52948g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.combo.AddComboUC", f = "AddComboUC.kt", i = {0, 0, 1, 1, 2, 2, 2, 3, 3, 3, 3, 3, 3}, l = {27, 28, 29, 33}, m = "invoke", n = {"gameId", "count", "gameId", "count", "gameId", "count", "localIncrementCombo", "gameId", "localInfo", "count", "localIncrementCombo", "localCombo", "hasStar"}, s = {"L$0", "I$0", "L$0", "I$0", "L$0", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1", "I$2", "I$3"}, v = 1)
    /* renamed from: g6.a$a, reason: collision with other inner class name */
    public static final class C0627a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f52949a;

        /* renamed from: b, reason: collision with root package name */
        public Object f52950b;

        /* renamed from: c, reason: collision with root package name */
        public Object f52951c;

        /* renamed from: d, reason: collision with root package name */
        public int f52952d;

        /* renamed from: e, reason: collision with root package name */
        public int f52953e;

        /* renamed from: f, reason: collision with root package name */
        public int f52954f;

        /* renamed from: g, reason: collision with root package name */
        public int f52955g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f52956h;

        /* renamed from: j, reason: collision with root package name */
        public int f52958j;

        public C0627a(j00.c<? super C0627a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f52956h = obj;
            this.f52958j |= Integer.MIN_VALUE;
            return a.this.b(null, 0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.combo.AddComboUC", f = "AddComboUC.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4}, l = {39, 42, 45, 46, 49}, m = "isUnlimitedStar", n = {"roundId", "$this$isUnlimitedStar_u24lambda_u240", "$i$a$-runCatching-AddComboUC$isUnlimitedStar$2", "roundId", "$this$isUnlimitedStar_u24lambda_u240", "$i$a$-runCatching-AddComboUC$isUnlimitedStar$2", "roundId", "$this$isUnlimitedStar_u24lambda_u240", "$i$a$-runCatching-AddComboUC$isUnlimitedStar$2", "roundId", "$this$isUnlimitedStar_u24lambda_u240", "$i$a$-runCatching-AddComboUC$isUnlimitedStar$2", "curBookId", "roundId", "$this$isUnlimitedStar_u24lambda_u240", "$i$a$-runCatching-AddComboUC$isUnlimitedStar$2", "curBookId"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "J$0", "L$0", "L$1", "I$0", "J$0"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f52959a;

        /* renamed from: b, reason: collision with root package name */
        public Object f52960b;

        /* renamed from: c, reason: collision with root package name */
        public int f52961c;

        /* renamed from: d, reason: collision with root package name */
        public long f52962d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f52963e;

        /* renamed from: g, reason: collision with root package name */
        public int f52965g;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f52963e = obj;
            this.f52965g |= Integer.MIN_VALUE;
            return a.this.c(null, this);
        }
    }

    public a(@k m5.c comboRepo, @k i syncComboUC, @k c6.b userGameInfo, @k s5.b purchasedBook, @k q getLegalCurrentBookIdUC, @k com.baicizhan.app.biz.game.repo.gameround.e gameRound, @k GetABTestUC getABTestUC) {
        g0.p(comboRepo, "comboRepo");
        g0.p(syncComboUC, "syncComboUC");
        g0.p(userGameInfo, "userGameInfo");
        g0.p(purchasedBook, "purchasedBook");
        g0.p(getLegalCurrentBookIdUC, "getLegalCurrentBookIdUC");
        g0.p(gameRound, "gameRound");
        g0.p(getABTestUC, "getABTestUC");
        this.f52942a = comboRepo;
        this.f52943b = syncComboUC;
        this.f52944c = userGameInfo;
        this.f52945d = purchasedBook;
        this.f52946e = getLegalCurrentBookIdUC;
        this.f52947f = gameRound;
        this.f52948g = getABTestUC;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a0, code lost:
    
        if (r13 != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0079, code lost:
    
        if (r13.e(r0) == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@m80.k java.lang.String r11, int r12, @m80.k j00.c<? super kotlin.Pair<java.lang.Integer, java.lang.Boolean>> r13) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.a.b(java.lang.String, int, j00.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:(1:(1:(1:(7:14|15|16|(1:18)(2:27|(1:32))|19|20|(2:22|23)(1:25))(2:33|34))(4:35|36|37|(4:39|19|20|(0)(0))(1:40)))(5:43|44|45|46|(2:48|42)(3:49|37|(0)(0))))(4:50|51|52|(4:54|19|20|(0)(0))(4:55|(2:57|42)|46|(0)(0))))(3:58|59|60))(3:68|69|(2:71|42)(1:72))|61|(4:63|19|20|(0)(0))(2:64|(2:66|42)(3:67|52|(0)(0)))))|75|6|7|(0)(0)|61|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0126, code lost:
    
        if (r14 == r1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x003f, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x015a, code lost:
    
        r14 = kotlin.Result.Companion;
        r13 = kotlin.Result.m6308constructorimpl(kotlin.e.a(r13));
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010e A[Catch: all -> 0x003f, TryCatch #0 {all -> 0x003f, blocks: (B:15:0x003a, B:16:0x0129, B:19:0x0151, B:27:0x013a, B:29:0x0149, B:36:0x0056, B:37:0x0100, B:40:0x010e, B:44:0x0065, B:46:0x00e6, B:51:0x0075, B:52:0x00cb, B:55:0x00d5, B:59:0x0083, B:61:0x00ac, B:64:0x00b6, B:69:0x008f), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d5 A[Catch: all -> 0x003f, TryCatch #0 {all -> 0x003f, blocks: (B:15:0x003a, B:16:0x0129, B:19:0x0151, B:27:0x013a, B:29:0x0149, B:36:0x0056, B:37:0x0100, B:40:0x010e, B:44:0x0065, B:46:0x00e6, B:51:0x0075, B:52:0x00cb, B:55:0x00d5, B:59:0x0083, B:61:0x00ac, B:64:0x00b6, B:69:0x008f), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b6 A[Catch: all -> 0x003f, TryCatch #0 {all -> 0x003f, blocks: (B:15:0x003a, B:16:0x0129, B:19:0x0151, B:27:0x013a, B:29:0x0149, B:36:0x0056, B:37:0x0100, B:40:0x010e, B:44:0x0065, B:46:0x00e6, B:51:0x0075, B:52:0x00cb, B:55:0x00d5, B:59:0x0083, B:61:0x00ac, B:64:0x00b6, B:69:0x008f), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r13, j00.c<? super java.lang.Boolean> r14) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.a.c(java.lang.String, j00.c):java.lang.Object");
    }
}
