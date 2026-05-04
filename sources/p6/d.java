package p6;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
@u0({"SMAP\nCalculateCurrentBookLearningProgressUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalculateCurrentBookLearningProgressUC.kt\ncom/baicizhan/app/biz/game/uc/study/algorithm/CalculateCurrentBookLearningProgressUC\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,41:1\n1788#2,4:42\n*S KotlinDebug\n*F\n+ 1 CalculateCurrentBookLearningProgressUC.kt\ncom/baicizhan/app/biz/game/uc/study/algorithm/CalculateCurrentBookLearningProgressUC\n*L\n28#1:42,4\n*E\n"})
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final o6.q f79176a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.repo.book.b f79177b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final z5.g f79178c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.repo.roadmap.a f79179d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.study.algorithm.CalculateCurrentBookLearningProgressUC", f = "CalculateCurrentBookLearningProgressUC.kt", i = {1, 2, 2, 3, 3, 3}, l = {24, 25, 26, 27}, m = "invoke", n = {"bookId", "records", "bookId", "records", "roadMap", "bookId"}, s = {"J$0", "L$0", "J$0", "L$0", "L$1", "J$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f79180a;

        /* renamed from: b, reason: collision with root package name */
        public Object f79181b;

        /* renamed from: c, reason: collision with root package name */
        public Object f79182c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f79183d;

        /* renamed from: f, reason: collision with root package name */
        public int f79185f;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f79183d = obj;
            this.f79185f |= Integer.MIN_VALUE;
            return d.this.a(this);
        }
    }

    public d(@m80.k o6.q getLegalCurrentBookIdUC, @m80.k com.baicizhan.app.biz.game.repo.book.b bookRepo, @m80.k z5.g studyRecordRepo, @m80.k com.baicizhan.app.biz.game.repo.roadmap.a roadMapRepo) {
        kotlin.jvm.internal.g0.p(getLegalCurrentBookIdUC, "getLegalCurrentBookIdUC");
        kotlin.jvm.internal.g0.p(bookRepo, "bookRepo");
        kotlin.jvm.internal.g0.p(studyRecordRepo, "studyRecordRepo");
        kotlin.jvm.internal.g0.p(roadMapRepo, "roadMapRepo");
        this.f79176a = getLegalCurrentBookIdUC;
        this.f79177b = bookRepo;
        this.f79178c = studyRecordRepo;
        this.f79179d = roadMapRepo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0064, code lost:
    
        if (r14 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@m80.k j00.c<? super kotlin.Triple<java.lang.String, java.lang.Integer, java.lang.Integer>> r14) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.d.a(j00.c):java.lang.Object");
    }
}
