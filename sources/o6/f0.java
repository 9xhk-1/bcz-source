package o6;

import com.baicizhan.app.biz.game.model.RoundCate;
import com.baicizhan.app.biz.game.model.RoundType;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
/* loaded from: classes3.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final g f76084a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final f6.c f76085b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final q f76086c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final p6.h f76087d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.study.StartSequentialGameUC", f = "StartSequentialGameUC.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4}, l = {24, 29, 36, 37, 38}, m = "invoke", n = {"gameRoundType", "roundCate", "todayNum", "gameRoundType", "roundCate", "roundType", "todayNum", "gameRoundType", "roundCate", "roundType", "todayNum", "gameRoundType", "roundCate", "roundType", "todayNum", "bookId", "gameRoundType", "roundCate", "roundType", "todayNum", "bookId", "curUnitNo"}, s = {"L$0", "L$1", "J$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "J$0", "J$1", "L$0", "L$1", "L$2", "J$0", "J$1", "I$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f76088a;

        /* renamed from: b, reason: collision with root package name */
        public long f76089b;

        /* renamed from: c, reason: collision with root package name */
        public Object f76090c;

        /* renamed from: d, reason: collision with root package name */
        public Object f76091d;

        /* renamed from: e, reason: collision with root package name */
        public Object f76092e;

        /* renamed from: f, reason: collision with root package name */
        public int f76093f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f76094g;

        /* renamed from: i, reason: collision with root package name */
        public int f76096i;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f76094g = obj;
            this.f76096i |= Integer.MIN_VALUE;
            return f0.this.a(0L, null, null, this);
        }
    }

    public f0(@m80.k g doStartGameUC, @m80.k f6.c getCurUnitNoUC, @m80.k q getLegalCurrentBookIdUC, @m80.k p6.h determineAiRoundUC) {
        g0.p(doStartGameUC, "doStartGameUC");
        g0.p(getCurUnitNoUC, "getCurUnitNoUC");
        g0.p(getLegalCurrentBookIdUC, "getLegalCurrentBookIdUC");
        g0.p(determineAiRoundUC, "determineAiRoundUC");
        this.f76084a = doStartGameUC;
        this.f76085b = getCurUnitNoUC;
        this.f76086c = getLegalCurrentBookIdUC;
        this.f76087d = determineAiRoundUC;
    }

    public static /* synthetic */ Object b(f0 f0Var, long j11, RoundType roundType, RoundCate roundCate, j00.c cVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            roundCate = RoundCate.Default;
        }
        return f0Var.a(j11, roundType, roundCate, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a5, code lost:
    
        if (r14 == r0) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0141 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r10, @m80.k com.baicizhan.app.biz.game.model.RoundType r12, @m80.k com.baicizhan.app.biz.game.model.RoundCate r13, @m80.k j00.c<? super java.lang.Integer> r14) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.f0.a(long, com.baicizhan.app.biz.game.model.RoundType, com.baicizhan.app.biz.game.model.RoundCate, j00.c):java.lang.Object");
    }
}
