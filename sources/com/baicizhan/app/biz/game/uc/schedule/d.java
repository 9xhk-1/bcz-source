package com.baicizhan.app.biz.game.uc.schedule;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.l;
import oa0.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nGetAdjustedDailyProgressUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetAdjustedDailyProgressUC.kt\ncom/baicizhan/app/biz/game/uc/schedule/GetAdjustedDailyProgressUC\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,101:1\n1788#2,4:102\n*S KotlinDebug\n*F\n+ 1 GetAdjustedDailyProgressUC.kt\ncom/baicizhan/app/biz/game/uc/schedule/GetAdjustedDailyProgressUC\n*L\n31#1:102,4\n*E\n"})
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.repo.book.b f15054a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final z5.g f15055b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.repo.roadmap.a f15056c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.schedule.GetAdjustedDailyProgressUC", f = "GetAdjustedDailyProgressUC.kt", i = {0, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3}, l = {28, 29, 31, 34}, m = "invoke", n = {"bookId", "bookId", "currentProgress", "originalTarget", "bookInfo", "bookId", "currentProgress", "originalTarget", "bookInfo", "bookId", "currentProgress", "originalTarget", "learnCount"}, s = {"J$0", "J$0", "I$0", "I$1", "L$0", "J$0", "I$0", "I$1", "L$0", "J$0", "I$0", "I$1", "I$2"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f15057a;

        /* renamed from: b, reason: collision with root package name */
        public int f15058b;

        /* renamed from: c, reason: collision with root package name */
        public int f15059c;

        /* renamed from: d, reason: collision with root package name */
        public int f15060d;

        /* renamed from: e, reason: collision with root package name */
        public Object f15061e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f15062f;

        /* renamed from: h, reason: collision with root package name */
        public int f15064h;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f15062f = obj;
            this.f15064h |= Integer.MIN_VALUE;
            return d.this.a(0L, this);
        }
    }

    public d(@m80.k com.baicizhan.app.biz.game.repo.book.b gameBookRepo, @m80.k z5.g studyRecordRepo, @m80.k com.baicizhan.app.biz.game.repo.roadmap.a roadMapRepo) {
        g0.p(gameBookRepo, "gameBookRepo");
        g0.p(studyRecordRepo, "studyRecordRepo");
        g0.p(roadMapRepo, "roadMapRepo");
        this.f15054a = gameBookRepo;
        this.f15055b = studyRecordRepo;
        this.f15056c = roadMapRepo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0074, code lost:
    
        if (r14 == r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r12, @m80.k j00.c<? super h5.c> r14) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.schedule.d.a(long, j00.c):java.lang.Object");
    }
}
