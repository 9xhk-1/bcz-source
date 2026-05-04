package f6;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import oa0.r;
import z5.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nGetCurStudyIdxUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetCurStudyIdxUC.kt\ncom/baicizhan/app/biz/game/uc/cake/GetCurStudyIdxUC\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n774#2:64\n865#2,2:65\n1208#2,2:67\n1236#2,4:69\n360#2,7:73\n295#2,2:80\n*S KotlinDebug\n*F\n+ 1 GetCurStudyIdxUC.kt\ncom/baicizhan/app/biz/game/uc/cake/GetCurStudyIdxUC\n*L\n34#1:64\n34#1:65,2\n35#1:67,2\n35#1:69,4\n37#1:73,7\n55#1:80,2\n*E\n"})
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l5.c f51061a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g f51062b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.baicizhan.app.biz.game.repo.gameround.e f51063c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.cake.GetCurStudyIdxUC", f = "GetCurStudyIdxUC.kt", i = {0, 0}, l = {55}, m = "idxFromGameRound", n = {"roadMapInfo", "bookId"}, s = {"L$0", "J$0"}, v = 1)
    /* renamed from: f6.a$a, reason: collision with other inner class name */
    public static final class C0608a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f51064a;

        /* renamed from: b, reason: collision with root package name */
        public Object f51065b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f51066c;

        /* renamed from: e, reason: collision with root package name */
        public int f51068e;

        public C0608a(j00.c<? super C0608a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f51066c = obj;
            this.f51068e |= Integer.MIN_VALUE;
            return a.this.b(0L, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.cake.GetCurStudyIdxUC", f = "GetCurStudyIdxUC.kt", i = {0, 0, 1, 1, 1, 2, 2, 2, 2}, l = {24, 29, 34}, m = "invoke", n = {"roadMapInfo", "bookId", "roadMapInfo", "bookId", "idx", "roadMapInfo", "bookId", "idx", "idxFromRound"}, s = {"L$0", "J$0", "L$0", "J$0", "I$0", "L$0", "J$0", "I$0", "I$1"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f51069a;

        /* renamed from: b, reason: collision with root package name */
        public Object f51070b;

        /* renamed from: c, reason: collision with root package name */
        public int f51071c;

        /* renamed from: d, reason: collision with root package name */
        public int f51072d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f51073e;

        /* renamed from: g, reason: collision with root package name */
        public int f51075g;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f51073e = obj;
            this.f51075g |= Integer.MIN_VALUE;
            return a.this.c(0L, null, this);
        }
    }

    public a(@k l5.c cakeStudyRepo, @k g studyRecordRepo, @k com.baicizhan.app.biz.game.repo.gameround.e gameRoundRepo) {
        g0.p(cakeStudyRepo, "cakeStudyRepo");
        g0.p(studyRecordRepo, "studyRecordRepo");
        g0.p(gameRoundRepo, "gameRoundRepo");
        this.f51061a = cakeStudyRepo;
        this.f51062b = studyRecordRepo;
        this.f51063c = gameRoundRepo;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r5, p8.e0 r7, j00.c<? super java.lang.Integer> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof f6.a.C0608a
            if (r0 == 0) goto L13
            r0 = r8
            f6.a$a r0 = (f6.a.C0608a) r0
            int r1 = r0.f51068e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f51068e = r1
            goto L18
        L13:
            f6.a$a r0 = new f6.a$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f51066c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f51068e
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r5 = r0.f51065b
            r7 = r5
            p8.e0 r7 = (p8.e0) r7
            kotlin.e.n(r8)
            goto L48
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            kotlin.e.n(r8)
            com.baicizhan.app.biz.game.repo.gameround.e r8 = r4.f51063c
            r0.f51065b = r7
            r0.f51064a = r5
            r0.f51068e = r3
            java.lang.Object r8 = r8.b(r5, r0)
            if (r8 != r1) goto L48
            return r1
        L48:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r5 = r8.iterator()
        L4e:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L6a
            java.lang.Object r6 = r5.next()
            r8 = r6
            h5.m r8 = (h5.m) r8
            long r0 = r8.z()
            com.baicizhan.app.biz.game.model.RoundType r8 = com.baicizhan.app.biz.game.model.RoundType.LEARNING
            long r2 = r8.getValue()
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 != 0) goto L4e
            goto L6b
        L6a:
            r6 = 0
        L6b:
            h5.m r6 = (h5.m) r6
            if (r6 == 0) goto L8c
            java.util.List r5 = r6.B()
            if (r5 == 0) goto L8c
            java.lang.Object r5 = a00.r0.G2(r5)
            m3.k2 r5 = (m3.k2) r5
            if (r5 == 0) goto L8c
            int r5 = r5.j()
            java.util.List<java.lang.Integer> r6 = r7.f79772a
            java.lang.Integer r5 = l00.a.f(r5)
            int r5 = r6.indexOf(r5)
            goto L8d
        L8c:
            r5 = -1
        L8d:
            java.lang.Integer r5 = l00.a.f(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.a.b(long, p8.e0, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b5, code lost:
    
        if (r9 == r5) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0075, code lost:
    
        if (r3 == r5) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0143 A[LOOP:1: B:27:0x013d->B:29:0x0143, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r20, @m80.k p8.e0 r22, @m80.k j00.c<? super java.lang.Integer> r23) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.a.c(long, p8.e0, j00.c):java.lang.Object");
    }
}
