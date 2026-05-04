package com.baicizhan.app.biz.game.uc.schedule;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.l;
import o6.q;
import oa0.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nGetCurrentScheduleUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetCurrentScheduleUC.kt\ncom/baicizhan/app/biz/game/uc/schedule/GetCurrentScheduleUC\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,66:1\n1208#2,2:67\n1236#2,4:69\n1788#2,4:73\n*S KotlinDebug\n*F\n+ 1 GetCurrentScheduleUC.kt\ncom/baicizhan/app/biz/game/uc/schedule/GetCurrentScheduleUC\n*L\n35#1:67,2\n35#1:69,4\n43#1:73,4\n*E\n"})
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.repo.book.b f15075a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.repo.roadmap.a f15076b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final q f15077c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final z5.g f15078d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final p6.e f15079e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final d f15080f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.schedule.GetCurrentScheduleUC", f = "GetCurrentScheduleUC.kt", i = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4}, l = {25, 26, 27, 28, 29}, m = "invoke", n = {"bookId", "model", "bookId", "model", "progress", "bookId", "model", "progress", "studyRecords", "bookId"}, s = {"J$0", "L$0", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "L$2", "J$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f15081a;

        /* renamed from: b, reason: collision with root package name */
        public Object f15082b;

        /* renamed from: c, reason: collision with root package name */
        public Object f15083c;

        /* renamed from: d, reason: collision with root package name */
        public Object f15084d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f15085e;

        /* renamed from: g, reason: collision with root package name */
        public int f15087g;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f15085e = obj;
            this.f15087g |= Integer.MIN_VALUE;
            return g.this.b(this);
        }
    }

    public g(@m80.k com.baicizhan.app.biz.game.repo.book.b gameScheduleRepo, @m80.k com.baicizhan.app.biz.game.repo.roadmap.a roadMapRepo, @m80.k q getLegalCurrentBookIdUC, @m80.k z5.g studyRecordRepo, @m80.k p6.e calculateDaysLeftToFinishLearningUC, @m80.k d getAdjustedDailyProgressUC) {
        g0.p(gameScheduleRepo, "gameScheduleRepo");
        g0.p(roadMapRepo, "roadMapRepo");
        g0.p(getLegalCurrentBookIdUC, "getLegalCurrentBookIdUC");
        g0.p(studyRecordRepo, "studyRecordRepo");
        g0.p(calculateDaysLeftToFinishLearningUC, "calculateDaysLeftToFinishLearningUC");
        g0.p(getAdjustedDailyProgressUC, "getAdjustedDailyProgressUC");
        this.f15075a = gameScheduleRepo;
        this.f15076b = roadMapRepo;
        this.f15077c = getLegalCurrentBookIdUC;
        this.f15078d = studyRecordRepo;
        this.f15079e = calculateDaysLeftToFinishLearningUC;
        this.f15080f = getAdjustedDailyProgressUC;
    }

    public final int a(int i11, boolean z11) {
        return (int) (((i11 * (z11 ? 25.0d : 3.2d)) + 59) / 60);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0094, code lost:
    
        if (r1 != r3) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0081, code lost:
    
        if (r1 == r3) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x010e A[LOOP:0: B:15:0x0108->B:17:0x010e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@m80.k j00.c<? super k3.q0> r27) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.schedule.g.b(j00.c):java.lang.Object");
    }
}
