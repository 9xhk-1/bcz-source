package o6;

import com.baicizhan.app.biz.game.model.RoundCate;
import com.baicizhan.app.biz.game.model.RoundType;
import com.baicizhan.main.activity.ShowOffActivity;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
/* loaded from: classes3.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final g f76050a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final t f76051b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.repo.gameround.e f76052c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final f6.c f76053d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final q f76054e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final p6.h f76055f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.study.StartSelectedUnitGameUC", f = "StartSelectedUnitGameUC.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6}, l = {29, 34, 46, 47, 48, 51, 57}, m = "invoke", n = {"gameRoundType", "roundCate", "todayNum", "unitNo", "gameRoundType", "roundCate", "roundType", "todayNum", "unitNo", "gameRoundType", "roundCate", "roundType", "todayNum", "unitNo", "gameRoundType", "roundCate", "roundType", "todayNum", "unitNo", "bookId", "gameRoundType", "roundCate", "roundType", "todayNum", "unitNo", "bookId", "curUnitNo", "gameRoundType", "roundCate", "roundType", ShowOffActivity.f18169n, "todayNum", "unitNo", "bookId", "curUnitNo", "gameRoundType", "roundCate", "roundType", ShowOffActivity.f18169n, "todayNum", "unitNo", "bookId", "curUnitNo"}, s = {"L$0", "L$1", "J$0", "I$0", "L$0", "L$1", "L$2", "J$0", "I$0", "L$0", "L$1", "L$2", "J$0", "I$0", "L$0", "L$1", "L$2", "J$0", "I$0", "J$1", "L$0", "L$1", "L$2", "J$0", "I$0", "J$1", "I$1", "L$0", "L$1", "L$2", "L$3", "J$0", "I$0", "J$1", "I$1", "L$0", "L$1", "L$2", "L$3", "J$0", "I$0", "J$1", "I$1"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f76056a;

        /* renamed from: b, reason: collision with root package name */
        public long f76057b;

        /* renamed from: c, reason: collision with root package name */
        public Object f76058c;

        /* renamed from: d, reason: collision with root package name */
        public Object f76059d;

        /* renamed from: e, reason: collision with root package name */
        public Object f76060e;

        /* renamed from: f, reason: collision with root package name */
        public Object f76061f;

        /* renamed from: g, reason: collision with root package name */
        public int f76062g;

        /* renamed from: h, reason: collision with root package name */
        public int f76063h;

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f76064i;

        /* renamed from: k, reason: collision with root package name */
        public int f76066k;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f76064i = obj;
            this.f76066k |= Integer.MIN_VALUE;
            return d0.this.a(0L, null, null, 0, this);
        }
    }

    public d0(@m80.k g doStartGameUC, @m80.k t giveUpGameUC, @m80.k com.baicizhan.app.biz.game.repo.gameround.e gameRound, @m80.k f6.c getCurUnitNoUC, @m80.k q getLegalCurrentBookIdUC, @m80.k p6.h determineAiRoundUC) {
        g0.p(doStartGameUC, "doStartGameUC");
        g0.p(giveUpGameUC, "giveUpGameUC");
        g0.p(gameRound, "gameRound");
        g0.p(getCurUnitNoUC, "getCurUnitNoUC");
        g0.p(getLegalCurrentBookIdUC, "getLegalCurrentBookIdUC");
        g0.p(determineAiRoundUC, "determineAiRoundUC");
        this.f76050a = doStartGameUC;
        this.f76051b = giveUpGameUC;
        this.f76052c = gameRound;
        this.f76053d = getCurUnitNoUC;
        this.f76054e = getLegalCurrentBookIdUC;
        this.f76055f = determineAiRoundUC;
    }

    public static /* synthetic */ Object b(d0 d0Var, long j11, RoundType roundType, RoundCate roundCate, int i11, j00.c cVar, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            roundCate = RoundCate.Default;
        }
        return d0Var.a(j11, roundType, roundCate, i11, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0156 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r26, @m80.k com.baicizhan.app.biz.game.model.RoundType r28, @m80.k com.baicizhan.app.biz.game.model.RoundCate r29, int r30, @m80.k j00.c<? super java.lang.Integer> r31) {
        /*
            Method dump skipped, instructions count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.d0.a(long, com.baicizhan.app.biz.game.model.RoundType, com.baicizhan.app.biz.game.model.RoundCate, int, j00.c):java.lang.Object");
    }
}
