package com.baicizhan.app.biz.game.uc.incentive;

import com.baicizhan.app.biz.game.uc.abtest.GetABTestUC;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
@u0({"SMAP\nCheckLavaPopupUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckLavaPopupUC.kt\ncom/baicizhan/app/biz/game/uc/incentive/CheckLavaPopupUC\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,51:1\n1#2:52\n1788#3,4:53\n*S KotlinDebug\n*F\n+ 1 CheckLavaPopupUC.kt\ncom/baicizhan/app/biz/game/uc/incentive/CheckLavaPopupUC\n*L\n48#1:53,4\n*E\n"})
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final p5.a f14490a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final b6.a f14491b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final o6.q f14492c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.repo.book.b f14493d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final z5.g f14494e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final GetABTestUC f14495f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.incentive.CheckLavaPopupUC", f = "CheckLavaPopupUC.kt", i = {1, 1, 2, 2, 3, 3}, l = {31, 32, 35, 37}, m = "invoke", n = {"it", "$i$a$-let-CheckLavaPopupUC$invoke$3", "it", "$i$a$-takeIf-CheckLavaPopupUC$invoke$4", "it", "$i$a$-takeIf-CheckLavaPopupUC$invoke$5"}, s = {"Z$0", "I$0", "L$1", "I$0", "L$1", "I$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public boolean f14496a;

        /* renamed from: b, reason: collision with root package name */
        public int f14497b;

        /* renamed from: c, reason: collision with root package name */
        public Object f14498c;

        /* renamed from: d, reason: collision with root package name */
        public Object f14499d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f14500e;

        /* renamed from: g, reason: collision with root package name */
        public int f14502g;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14500e = obj;
            this.f14502g |= Integer.MIN_VALUE;
            return b.this.a(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.incentive.CheckLavaPopupUC", f = "CheckLavaPopupUC.kt", i = {1, 2, 2, 3, 3, 3}, l = {42, 46, 47, 48}, m = "newUserCondition", n = {vb.a.f93813p, vb.a.f93813p, "curBookId", vb.a.f93813p, "curBookId", "count"}, s = {"Z$0", "Z$0", "J$0", "Z$0", "J$0", "I$0"}, v = 1)
    /* renamed from: com.baicizhan.app.biz.game.uc.incentive.b$b, reason: collision with other inner class name */
    public static final class C0209b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public boolean f14503a;

        /* renamed from: b, reason: collision with root package name */
        public long f14504b;

        /* renamed from: c, reason: collision with root package name */
        public int f14505c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f14506d;

        /* renamed from: f, reason: collision with root package name */
        public int f14508f;

        public C0209b(j00.c<? super C0209b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14506d = obj;
            this.f14508f |= Integer.MIN_VALUE;
            return b.this.b(this);
        }
    }

    public b(@m80.k p5.a lavaRepo, @m80.k b6.a userGuide, @m80.k o6.q getLegalCurrentBookIdUC, @m80.k com.baicizhan.app.biz.game.repo.book.b gameBookScheduleRepo, @m80.k z5.g studyRecordRepo, @m80.k GetABTestUC getABTestUC) {
        g0.p(lavaRepo, "lavaRepo");
        g0.p(userGuide, "userGuide");
        g0.p(getLegalCurrentBookIdUC, "getLegalCurrentBookIdUC");
        g0.p(gameBookScheduleRepo, "gameBookScheduleRepo");
        g0.p(studyRecordRepo, "studyRecordRepo");
        g0.p(getABTestUC, "getABTestUC");
        this.f14490a = lavaRepo;
        this.f14491b = userGuide;
        this.f14492c = getLegalCurrentBookIdUC;
        this.f14493d = gameBookScheduleRepo;
        this.f14494e = studyRecordRepo;
        this.f14495f = getABTestUC;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bc, code lost:
    
        if (((java.lang.Boolean) r12).booleanValue() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b3, code lost:
    
        if (r12 == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0087, code lost:
    
        if (r12 == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0064, code lost:
    
        if (r12 == r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@m80.k j00.c<? super com.baicizhan.online.playground_api.LavaquestGameInfo> r12) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.incentive.b.a(j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x005c, code lost:
    
        if (r11 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@m80.k j00.c<? super java.lang.Boolean> r11) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.incentive.b.b(j00.c):java.lang.Object");
    }
}
