package p6;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
@u0({"SMAP\nGetStudyProgressUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetStudyProgressUC.kt\ncom/baicizhan/app/biz/game/uc/study/algorithm/GetStudyProgressUC\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1788#2,4:99\n1788#2,4:103\n1788#2,4:107\n1788#2,4:111\n1#3:115\n*S KotlinDebug\n*F\n+ 1 GetStudyProgressUC.kt\ncom/baicizhan/app/biz/game/uc/study/algorithm/GetStudyProgressUC\n*L\n40#1:99,4\n43#1:103,4\n48#1:107,4\n52#1:111,4\n*E\n"})
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final z5.g f79239a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.schedule.d f79240b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final h f79241c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.repo.book.b f79242d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final j f79243e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.study.algorithm.GetStudyProgressUC", f = "GetStudyProgressUC.kt", i = {0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5}, l = {38, 48, 51, 54, 57, 76}, m = "invoke", n = {"bookId", "studyRecord", "bookId", "today", "spellCount", "spellTotal", "studyRecord", "bookId", "today", "spellCount", "spellTotal", "todayReviewCount", "studyRecord", "progress", "bookId", "today", "spellCount", "spellTotal", "todayReviewCount", "remainReviewCount", "studyRecord", "progress", "bookId", "today", "spellCount", "spellTotal", "todayReviewCount", "remainReviewCount", "todayReviewTarget", "studyRecord", "progress", "$this$invoke_u24lambda_u244", "bookId", "today", "spellCount", "spellTotal", "todayReviewCount", "remainReviewCount", "todayReviewTarget", "reviewTotal", "aiReviewTotalCount", "$i$a$-runCatching-GetStudyProgressUC$invoke$2"}, s = {"J$0", "L$0", "J$0", "J$1", "I$0", "I$1", "L$0", "J$0", "J$1", "I$0", "I$1", "I$2", "L$0", "L$1", "J$0", "J$1", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "J$0", "J$1", "I$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2", "J$0", "J$1", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5", "I$6", "I$10"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f79244a;

        /* renamed from: b, reason: collision with root package name */
        public long f79245b;

        /* renamed from: c, reason: collision with root package name */
        public Object f79246c;

        /* renamed from: d, reason: collision with root package name */
        public Object f79247d;

        /* renamed from: e, reason: collision with root package name */
        public Object f79248e;

        /* renamed from: f, reason: collision with root package name */
        public int f79249f;

        /* renamed from: g, reason: collision with root package name */
        public int f79250g;

        /* renamed from: h, reason: collision with root package name */
        public int f79251h;

        /* renamed from: i, reason: collision with root package name */
        public int f79252i;

        /* renamed from: j, reason: collision with root package name */
        public int f79253j;

        /* renamed from: k, reason: collision with root package name */
        public int f79254k;

        /* renamed from: l, reason: collision with root package name */
        public int f79255l;

        /* renamed from: m, reason: collision with root package name */
        public int f79256m;

        /* renamed from: n, reason: collision with root package name */
        public int f79257n;

        /* renamed from: o, reason: collision with root package name */
        public int f79258o;

        /* renamed from: p, reason: collision with root package name */
        public int f79259p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f79260q;

        /* renamed from: s, reason: collision with root package name */
        public int f79262s;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f79260q = obj;
            this.f79262s |= Integer.MIN_VALUE;
            return k.this.b(0L, this);
        }
    }

    public k(@m80.k z5.g recordRepo, @m80.k com.baicizhan.app.biz.game.uc.schedule.d getAdjustedDailyProgressUC, @m80.k h determineAiRoundUC, @m80.k com.baicizhan.app.biz.game.repo.book.b bookScheduleRepo, @m80.k j getDailyReviewCountUC) {
        kotlin.jvm.internal.g0.p(recordRepo, "recordRepo");
        kotlin.jvm.internal.g0.p(getAdjustedDailyProgressUC, "getAdjustedDailyProgressUC");
        kotlin.jvm.internal.g0.p(determineAiRoundUC, "determineAiRoundUC");
        kotlin.jvm.internal.g0.p(bookScheduleRepo, "bookScheduleRepo");
        kotlin.jvm.internal.g0.p(getDailyReviewCountUC, "getDailyReviewCountUC");
        this.f79239a = recordRepo;
        this.f79240b = getAdjustedDailyProgressUC;
        this.f79241c = determineAiRoundUC;
        this.f79242d = bookScheduleRepo;
        this.f79243e = getDailyReviewCountUC;
    }

    public final int a(h5.c cVar, int i11, int i12) {
        if (cVar.g() == cVar.f() && i11 == i12) {
            return 2;
        }
        return (cVar.g() < cVar.f() || i11 <= i12) ? 0 : 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x00d5, code lost:
    
        if (r0 == r5) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r26, @m80.k j00.c<? super h5.n0> r28) {
        /*
            Method dump skipped, instructions count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.k.b(long, j00.c):java.lang.Object");
    }
}
