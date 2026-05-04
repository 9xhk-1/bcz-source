package e6;

import com.baicizhan.app.biz.game.uc.ability.WordListQuestionType;
import f4.w2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import oa0.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final z5.g f49410a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final j5.e f49411b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final e6.d f49412c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f49413a;

        static {
            int[] iArr = new int[WordListQuestionType.values().length];
            try {
                iArr[WordListQuestionType.LISTEN_FAST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WordListQuestionType.BRUSH_FAST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WordListQuestionType.ENGLISH_TO_MEANING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f49413a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.ability.UpdateStudyResultInWordListUC", f = "UpdateStudyResultInWordListUC.kt", i = {0}, l = {163}, m = "getStudyRecordOrNull", n = {"result"}, s = {"L$0"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f49414a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f49415b;

        /* renamed from: d, reason: collision with root package name */
        public int f49417d;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f49415b = obj;
            this.f49417d |= Integer.MIN_VALUE;
            return j.this.f(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.ability.UpdateStudyResultInWordListUC", f = "UpdateStudyResultInWordListUC.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {99, 131}, m = "updateAbilityScore", n = {"result", "point", "bookId", "topicId", "now", "result", "point", "ability", "updatedAbility", "gameRoundId", "bookId", "topicId", "now", "halfDay"}, s = {"L$0", "L$1", "J$0", "J$1", "J$2", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "J$1", "J$2", "J$3"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f49418a;

        /* renamed from: b, reason: collision with root package name */
        public Object f49419b;

        /* renamed from: c, reason: collision with root package name */
        public Object f49420c;

        /* renamed from: d, reason: collision with root package name */
        public Object f49421d;

        /* renamed from: e, reason: collision with root package name */
        public Object f49422e;

        /* renamed from: f, reason: collision with root package name */
        public long f49423f;

        /* renamed from: g, reason: collision with root package name */
        public long f49424g;

        /* renamed from: h, reason: collision with root package name */
        public long f49425h;

        /* renamed from: i, reason: collision with root package name */
        public long f49426i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f49427j;

        /* renamed from: l, reason: collision with root package name */
        public int f49429l;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f49427j = obj;
            this.f49429l |= Integer.MIN_VALUE;
            return j.this.i(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.ability.UpdateStudyResultInWordListUC", f = "UpdateStudyResultInWordListUC.kt", i = {0, 1, 1, 1, 1, 1, 1}, l = {145, 159}, m = "updateHalfTime", n = {"result", "result", "record", "updatedRecord", "today", "day", "newHalfTime"}, s = {"L$0", "L$0", "L$1", "L$2", "J$0", "J$1", "J$2"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f49430a;

        /* renamed from: b, reason: collision with root package name */
        public Object f49431b;

        /* renamed from: c, reason: collision with root package name */
        public Object f49432c;

        /* renamed from: d, reason: collision with root package name */
        public long f49433d;

        /* renamed from: e, reason: collision with root package name */
        public long f49434e;

        /* renamed from: f, reason: collision with root package name */
        public long f49435f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f49436g;

        /* renamed from: i, reason: collision with root package name */
        public int f49438i;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f49436g = obj;
            this.f49438i |= Integer.MIN_VALUE;
            return j.this.j(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.ability.UpdateStudyResultInWordListUC", f = "UpdateStudyResultInWordListUC.kt", i = {0, 1}, l = {59, 62}, m = "updateWordToMean", n = {"result", "result"}, s = {"L$0", "L$0"}, v = 1)
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f49439a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f49440b;

        /* renamed from: d, reason: collision with root package name */
        public int f49442d;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f49440b = obj;
            this.f49442d |= Integer.MIN_VALUE;
            return j.this.k(null, this);
        }
    }

    public j(@m80.k z5.g studyRecordRepo, @m80.k j5.e abilityScoreRepo, @m80.k e6.d getAbilityWithHalfDay) {
        g0.p(studyRecordRepo, "studyRecordRepo");
        g0.p(abilityScoreRepo, "abilityScoreRepo");
        g0.p(getAbilityWithHalfDay, "getAbilityWithHalfDay");
        this.f49410a = studyRecordRepo;
        this.f49411b = abilityScoreRepo;
        this.f49412c = getAbilityWithHalfDay;
    }

    public final long d(w2 w2Var, long j11) {
        return Math.abs(w3.g.i(w3.g.h(w2Var.o(), -w2Var.l()), j11));
    }

    public final long e(long j11, long j12, boolean z11) {
        return Math.max(z11 ? e6.a.w(j11, j12) : e6.a.v(j11, j12), 1L);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(e6.l r9, j00.c<? super f4.w2> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof e6.j.b
            if (r0 == 0) goto L13
            r0 = r10
            e6.j$b r0 = (e6.j.b) r0
            int r1 = r0.f49417d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49417d = r1
            goto L18
        L13:
            e6.j$b r0 = new e6.j$b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f49415b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f49417d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r9 = r0.f49414a
            e6.l r9 = (e6.l) r9
            kotlin.e.n(r10)
            goto L5b
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            kotlin.e.n(r10)
            z5.g r10 = r8.f49410a
            int r2 = r9.j()
            long r4 = (long) r2
            int r2 = r9.o()
            long r6 = (long) r2
            java.lang.Long r2 = l00.a.g(r6)
            java.util.List r2 = a00.g0.l(r2)
            java.lang.Object r9 = l00.k.a(r9)
            r0.f49414a = r9
            r0.f49417d = r3
            java.lang.Object r10 = r10.f(r4, r2, r0)
            if (r10 != r1) goto L5b
            return r1
        L5b:
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r9 = a00.r0.L2(r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.j.f(e6.l, j00.c):java.lang.Object");
    }

    public final boolean g(w2 w2Var, long j11) {
        return w2Var.l() > 0 && w3.g.h(w2Var.o(), -w2Var.l()) == j11;
    }

    public final boolean h(w2 w2Var, long j11) {
        return (z5.i.e(w2Var) || z5.i.f(w2Var) || z5.i.r(w2Var) || g(w2Var, j11)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0239, code lost:
    
        if (r14.c(r11, r1, r8) != r2) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(e6.l r69, j00.c<? super yz.g2> r70) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.j.i(e6.l, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e3, code lost:
    
        if (r13.d(r14, r8, r6) == r7) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e5, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0068, code lost:
    
        if (r2 == r7) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(e6.l r32, j00.c<? super yz.g2> r33) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.j.j(e6.l, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        if (i(r6, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (j(r6, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(@m80.k e6.l r6, @m80.k j00.c<? super yz.g2> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof e6.j.e
            if (r0 == 0) goto L13
            r0 = r7
            e6.j$e r0 = (e6.j.e) r0
            int r1 = r0.f49442d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49442d = r1
            goto L18
        L13:
            e6.j$e r0 = new e6.j$e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f49440b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f49442d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f49439a
            e6.l r6 = (e6.l) r6
            kotlin.e.n(r7)
            goto L5d
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.lang.Object r6 = r0.f49439a
            e6.l r6 = (e6.l) r6
            kotlin.e.n(r7)
            goto L4e
        L40:
            kotlin.e.n(r7)
            r0.f49439a = r6
            r0.f49442d = r4
            java.lang.Object r7 = r5.j(r6, r0)
            if (r7 != r1) goto L4e
            goto L5c
        L4e:
            java.lang.Object r7 = l00.k.a(r6)
            r0.f49439a = r7
            r0.f49442d = r3
            java.lang.Object r6 = r5.i(r6, r0)
            if (r6 != r1) goto L5d
        L5c:
            return r1
        L5d:
            yz.g2 r6 = yz.g2.f100423a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.j.k(e6.l, j00.c):java.lang.Object");
    }
}
