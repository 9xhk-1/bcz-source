package o6;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final p6.q f76204a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final z5.g f76205b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.repo.roadmap.a f76206c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.repo.book.b f76207d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.repo.gameround.e f76208e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final o5.a f76209f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.study.GetStudySummaryUC", f = "GetStudySummaryUC.kt", i = {0, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5}, l = {26, 27, 28, 29, 30, 31}, m = "invoke", n = {"bookId", "bookId", "studyRecord", "bookId", "studyRecord", "roadMap", "bookId", "studyRecord", "roadMap", "gameBook", "bookId", "studyRecord", "roadMap", "gameBook", "gameRound", "bookId"}, s = {"J$0", "J$0", "L$0", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "L$3", "J$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f76210a;

        /* renamed from: b, reason: collision with root package name */
        public Object f76211b;

        /* renamed from: c, reason: collision with root package name */
        public Object f76212c;

        /* renamed from: d, reason: collision with root package name */
        public Object f76213d;

        /* renamed from: e, reason: collision with root package name */
        public Object f76214e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f76215f;

        /* renamed from: h, reason: collision with root package name */
        public int f76217h;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f76215f = obj;
            this.f76217h |= Integer.MIN_VALUE;
            return r.this.a(0L, this);
        }
    }

    public r(@m80.k p6.q processStudySummary, @m80.k z5.g studyRecordRepo, @m80.k com.baicizhan.app.biz.game.repo.roadmap.a roadMapRepo, @m80.k com.baicizhan.app.biz.game.repo.book.b gameScheduleRepo, @m80.k com.baicizhan.app.biz.game.repo.gameround.e gameRoundRepo, @m80.k o5.a versionProvider) {
        g0.p(processStudySummary, "processStudySummary");
        g0.p(studyRecordRepo, "studyRecordRepo");
        g0.p(roadMapRepo, "roadMapRepo");
        g0.p(gameScheduleRepo, "gameScheduleRepo");
        g0.p(gameRoundRepo, "gameRoundRepo");
        g0.p(versionProvider, "versionProvider");
        this.f76204a = processStudySummary;
        this.f76205b = studyRecordRepo;
        this.f76206c = roadMapRepo;
        this.f76207d = gameScheduleRepo;
        this.f76208e = gameRoundRepo;
        this.f76209f = versionProvider;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00dc, code lost:
    
        if (r10 != r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ad, code lost:
    
        if (r10 == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009a, code lost:
    
        if (r10 == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008b, code lost:
    
        if (o6.s.b(r10, r8, r6) == r0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r8, @m80.k j00.c<? super h5.p0> r10) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.r.a(long, j00.c):java.lang.Object");
    }
}
