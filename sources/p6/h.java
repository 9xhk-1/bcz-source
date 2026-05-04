package p6;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
@u0({"SMAP\nDetermineAiRoundUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DetermineAiRoundUC.kt\ncom/baicizhan/app/biz/game/uc/study/algorithm/DetermineAiRoundUC\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n1788#2,4:83\n1788#2,4:87\n1788#2,4:91\n295#2,2:95\n*S KotlinDebug\n*F\n+ 1 DetermineAiRoundUC.kt\ncom/baicizhan/app/biz/game/uc/study/algorithm/DetermineAiRoundUC\n*L\n46#1:83,4\n47#1:87,4\n49#1:91,4\n75#1:95,2\n*E\n"})
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final o6.q f79191a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.repo.gameround.e f79192b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final z5.g f79193c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.repo.roadmap.a f79194d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.repo.book.b f79195e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.schedule.d f79196f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final j f79197g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.study.algorithm.DetermineAiRoundUC", f = "DetermineAiRoundUC.kt", i = {0, 0, 0, 0, 0, 0}, l = {76}, m = "getUnFinishGame", n = {"$this$firstOrNull$iv", "element$iv", "it", "bookId", "$i$f$firstOrNull", "$i$a$-firstOrNull-DetermineAiRoundUC$getUnFinishGame$2"}, s = {"L$0", "L$2", "L$3", "J$0", "I$0", "I$1"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f79198a;

        /* renamed from: b, reason: collision with root package name */
        public Object f79199b;

        /* renamed from: c, reason: collision with root package name */
        public Object f79200c;

        /* renamed from: d, reason: collision with root package name */
        public Object f79201d;

        /* renamed from: e, reason: collision with root package name */
        public Object f79202e;

        /* renamed from: f, reason: collision with root package name */
        public int f79203f;

        /* renamed from: g, reason: collision with root package name */
        public int f79204g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f79205h;

        /* renamed from: j, reason: collision with root package name */
        public int f79207j;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f79205h = obj;
            this.f79207j |= Integer.MIN_VALUE;
            return h.this.b(0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.study.algorithm.DetermineAiRoundUC", f = "DetermineAiRoundUC.kt", i = {1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6}, l = {35, 36, 42, 43, 44, 45, 53}, m = "invoke", n = {"bookId", "unFinishRound", "bookId", "today", "unFinishRound", "studyRecord", "bookId", "today", "unFinishRound", "studyRecord", "roadMap", "bookId", "today", "unFinishRound", "studyRecord", "roadMap", "bookInfo", "bookId", "today", "unFinishRound", "studyRecord", "roadMap", "bookInfo", "progress", "bookId", "today", "hasWordsToNewLearning", "hasWordsToReview", "reviewProgress"}, s = {"J$0", "L$0", "J$0", "J$1", "L$0", "L$1", "J$0", "J$1", "L$0", "L$1", "L$2", "J$0", "J$1", "L$0", "L$1", "L$2", "L$3", "J$0", "J$1", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "J$1", "I$0", "I$1", "I$2"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f79208a;

        /* renamed from: b, reason: collision with root package name */
        public long f79209b;

        /* renamed from: c, reason: collision with root package name */
        public Object f79210c;

        /* renamed from: d, reason: collision with root package name */
        public Object f79211d;

        /* renamed from: e, reason: collision with root package name */
        public Object f79212e;

        /* renamed from: f, reason: collision with root package name */
        public Object f79213f;

        /* renamed from: g, reason: collision with root package name */
        public Object f79214g;

        /* renamed from: h, reason: collision with root package name */
        public int f79215h;

        /* renamed from: i, reason: collision with root package name */
        public int f79216i;

        /* renamed from: j, reason: collision with root package name */
        public int f79217j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f79218k;

        /* renamed from: m, reason: collision with root package name */
        public int f79220m;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f79218k = obj;
            this.f79220m |= Integer.MIN_VALUE;
            return h.this.c(this);
        }
    }

    public h(@m80.k o6.q getLegalCurrentBookIdUC, @m80.k com.baicizhan.app.biz.game.repo.gameround.e gameRoundRepo, @m80.k z5.g studyRecordRepo, @m80.k com.baicizhan.app.biz.game.repo.roadmap.a roadMapRepo, @m80.k com.baicizhan.app.biz.game.repo.book.b gameBookScheduleRepo, @m80.k com.baicizhan.app.biz.game.uc.schedule.d getAdjustedDailyProgressUC, @m80.k j getDailyReviewCountUC) {
        kotlin.jvm.internal.g0.p(getLegalCurrentBookIdUC, "getLegalCurrentBookIdUC");
        kotlin.jvm.internal.g0.p(gameRoundRepo, "gameRoundRepo");
        kotlin.jvm.internal.g0.p(studyRecordRepo, "studyRecordRepo");
        kotlin.jvm.internal.g0.p(roadMapRepo, "roadMapRepo");
        kotlin.jvm.internal.g0.p(gameBookScheduleRepo, "gameBookScheduleRepo");
        kotlin.jvm.internal.g0.p(getAdjustedDailyProgressUC, "getAdjustedDailyProgressUC");
        kotlin.jvm.internal.g0.p(getDailyReviewCountUC, "getDailyReviewCountUC");
        this.f79191a = getLegalCurrentBookIdUC;
        this.f79192b = gameRoundRepo;
        this.f79193c = studyRecordRepo;
        this.f79194d = roadMapRepo;
        this.f79195e = gameBookScheduleRepo;
        this.f79196f = getAdjustedDailyProgressUC;
        this.f79197g = getDailyReviewCountUC;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0094 -> B:10:0x0098). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r17, j00.c<? super com.baicizhan.app.biz.game.model.RoundType> r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r19
            boolean r2 = r1 instanceof p6.h.a
            if (r2 == 0) goto L17
            r2 = r1
            p6.h$a r2 = (p6.h.a) r2
            int r3 = r2.f79207j
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f79207j = r3
            goto L1c
        L17:
            p6.h$a r2 = new p6.h$a
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f79205h
            java.lang.Object r3 = kotlin.coroutines.intrinsics.b.l()
            int r4 = r2.f79207j
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L4b
            if (r4 != r6) goto L43
            int r4 = r2.f79203f
            long r7 = r2.f79198a
            java.lang.Object r9 = r2.f79202e
            com.baicizhan.app.biz.game.model.RoundType r9 = (com.baicizhan.app.biz.game.model.RoundType) r9
            java.lang.Object r9 = r2.f79201d
            java.lang.Object r10 = r2.f79200c
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r11 = r2.f79199b
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            kotlin.e.n(r1)
            r14 = r4
            r4 = r2
            r2 = r14
            goto L98
        L43:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L4b:
            kotlin.e.n(r1)
            com.baicizhan.app.biz.game.model.RoundType r1 = com.baicizhan.app.biz.game.model.RoundType.AI_LEADS_U
            com.baicizhan.app.biz.game.model.RoundType r4 = com.baicizhan.app.biz.game.model.RoundType.AI_LEADS_U_R
            com.baicizhan.app.biz.game.model.RoundType[] r1 = new com.baicizhan.app.biz.game.model.RoundType[]{r1, r4}
            java.util.List r1 = a00.h0.Q(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r4 = r1.iterator()
            r11 = r1
            r10 = r4
            r7 = r5
            r4 = r2
            r1 = r17
        L66:
            boolean r8 = r10.hasNext()
            if (r8 == 0) goto L9f
            java.lang.Object r9 = r10.next()
            r8 = r9
            com.baicizhan.app.biz.game.model.RoundType r8 = (com.baicizhan.app.biz.game.model.RoundType) r8
            com.baicizhan.app.biz.game.repo.gameround.e r12 = r0.f79192b
            java.lang.Object r13 = l00.k.a(r11)
            r4.f79199b = r13
            r4.f79200c = r10
            r4.f79201d = r9
            java.lang.Object r13 = l00.k.a(r8)
            r4.f79202e = r13
            r4.f79198a = r1
            r4.f79203f = r7
            r4.f79204g = r5
            r4.f79207j = r6
            java.lang.Object r8 = r12.h(r1, r8, r4)
            if (r8 != r3) goto L94
            return r3
        L94:
            r14 = r1
            r2 = r7
            r1 = r8
            r7 = r14
        L98:
            if (r1 == 0) goto L9b
            return r9
        L9b:
            r14 = r7
            r7 = r2
            r1 = r14
            goto L66
        L9f:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.h.b(long, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x012d, code lost:
    
        if (r1 != r3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x00c7, code lost:
    
        if (r1 == r3) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x00b4, code lost:
    
        if (r1 == r3) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d8  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@m80.k j00.c<? super com.baicizhan.app.biz.game.model.RoundType> r23) {
        /*
            Method dump skipped, instructions count: 782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.h.c(j00.c):java.lang.Object");
    }
}
