package o6;

import com.baicizhan.app.biz.game.model.RoundType;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import p6.i0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final p6.z f76067a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final p6.c0 f76068b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final i0 f76069c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.repo.book.b f76070d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f76071a;

        static {
            int[] iArr = new int[RoundType.values().length];
            try {
                iArr[RoundType.LEARNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RoundType.AI_LEADS_U.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RoundType.REVIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RoundType.AI_LEADS_U_R.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RoundType.SPELLING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f76071a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.study.DoSelectWordsUC", f = "DoSelectWordsUC.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3}, l = {24, 30, 34, 38}, m = "invoke", n = {"roundType", "roundCate", "bookId", "today", "unitNo", "roundType", "roundCate", "bookInfo", "bookId", "today", "unitNo", "roundCount", "roundType", "roundCate", "bookInfo", "bookId", "today", "unitNo", "roundCount", "roundType", "roundCate", "bookInfo", "bookId", "today", "unitNo", "roundCount"}, s = {"L$0", "L$1", "J$0", "J$1", "I$0", "L$0", "L$1", "L$2", "J$0", "J$1", "I$0", "I$1", "L$0", "L$1", "L$2", "J$0", "J$1", "I$0", "I$1", "L$0", "L$1", "L$2", "J$0", "J$1", "I$0", "I$1"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f76072a;

        /* renamed from: b, reason: collision with root package name */
        public long f76073b;

        /* renamed from: c, reason: collision with root package name */
        public Object f76074c;

        /* renamed from: d, reason: collision with root package name */
        public Object f76075d;

        /* renamed from: e, reason: collision with root package name */
        public Object f76076e;

        /* renamed from: f, reason: collision with root package name */
        public int f76077f;

        /* renamed from: g, reason: collision with root package name */
        public int f76078g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f76079h;

        /* renamed from: j, reason: collision with root package name */
        public int f76081j;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f76079h = obj;
            this.f76081j |= Integer.MIN_VALUE;
            return e.this.a(0L, 0L, null, null, 0, this);
        }
    }

    public e(@m80.k p6.z selectNewLearningWordsUC, @m80.k p6.c0 selectReviewWordsUC, @m80.k i0 selectSpellWordsUC, @m80.k com.baicizhan.app.biz.game.repo.book.b gameBookRepo) {
        g0.p(selectNewLearningWordsUC, "selectNewLearningWordsUC");
        g0.p(selectReviewWordsUC, "selectReviewWordsUC");
        g0.p(selectSpellWordsUC, "selectSpellWordsUC");
        g0.p(gameBookRepo, "gameBookRepo");
        this.f76067a = selectNewLearningWordsUC;
        this.f76068b = selectReviewWordsUC;
        this.f76069c = selectSpellWordsUC;
        this.f76070d = gameBookRepo;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r25, long r27, @m80.k com.baicizhan.app.biz.game.model.RoundType r29, @m80.k com.baicizhan.app.biz.game.model.RoundCate r30, int r31, @m80.k j00.c<? super java.util.List<m3.k2>> r32) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.e.a(long, long, com.baicizhan.app.biz.game.model.RoundType, com.baicizhan.app.biz.game.model.RoundCate, int, j00.c):java.lang.Object");
    }
}
