package e6;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import oa0.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final j5.e f49285a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final z5.g f49286b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.ability.GetAbilityWithHalfDayUC", f = "GetAbilityWithHalfDayUC.kt", i = {0, 0}, l = {25}, m = "getHalfDay", n = {"bookId", "topicId"}, s = {"J$0", "J$1"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f49287a;

        /* renamed from: b, reason: collision with root package name */
        public long f49288b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f49289c;

        /* renamed from: e, reason: collision with root package name */
        public int f49291e;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f49289c = obj;
            this.f49291e |= Integer.MIN_VALUE;
            return d.this.b(0L, 0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.ability.GetAbilityWithHalfDayUC", f = "GetAbilityWithHalfDayUC.kt", i = {0, 0, 1, 1}, l = {18, 20}, m = "invoke", n = {"bookId", "topicId", "bookId", "topicId"}, s = {"J$0", "J$1", "J$0", "J$1"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f49292a;

        /* renamed from: b, reason: collision with root package name */
        public long f49293b;

        /* renamed from: c, reason: collision with root package name */
        public Object f49294c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f49295d;

        /* renamed from: f, reason: collision with root package name */
        public int f49297f;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f49295d = obj;
            this.f49297f |= Integer.MIN_VALUE;
            return d.this.c(0L, 0L, this);
        }
    }

    public d(@m80.k j5.e abilityScoreRepo, @m80.k z5.g studyRecordRepo) {
        g0.p(abilityScoreRepo, "abilityScoreRepo");
        g0.p(studyRecordRepo, "studyRecordRepo");
        this.f49285a = abilityScoreRepo;
        this.f49286b = studyRecordRepo;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r5, long r7, j00.c<? super java.lang.Long> r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof e6.d.a
            if (r0 == 0) goto L13
            r0 = r9
            e6.d$a r0 = (e6.d.a) r0
            int r1 = r0.f49291e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49291e = r1
            goto L18
        L13:
            e6.d$a r0 = new e6.d$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f49289c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f49291e
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r9)
            goto L4b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.e.n(r9)
            z5.g r9 = r4.f49286b
            java.lang.Long r2 = l00.a.g(r7)
            java.util.List r2 = a00.g0.l(r2)
            r0.f49287a = r5
            r0.f49288b = r7
            r0.f49291e = r3
            java.lang.Object r9 = r9.f(r5, r2, r0)
            if (r9 != r1) goto L4b
            return r1
        L4b:
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r5 = a00.r0.L2(r9)
            f4.w2 r5 = (f4.w2) r5
            if (r5 == 0) goto L5a
            long r5 = r5.l()
            goto L5c
        L5a:
            r5 = 1
        L5c:
            java.lang.Long r5 = l00.a.g(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.d.b(long, long, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        if (r13 != r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
    
        if (r13 == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r9, long r11, @m80.k j00.c<? super kotlin.Pair<f4.a, java.lang.Long>> r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof e6.d.b
            if (r0 == 0) goto L14
            r0 = r13
            e6.d$b r0 = (e6.d.b) r0
            int r1 = r0.f49297f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f49297f = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            e6.d$b r0 = new e6.d$b
            r0.<init>(r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.f49295d
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r6.f49297f
            r7 = 2
            r2 = 1
            if (r1 == 0) goto L44
            if (r1 == r2) goto L3a
            if (r1 != r7) goto L32
            java.lang.Object r9 = r6.f49294c
            f4.a r9 = (f4.a) r9
            kotlin.e.n(r13)
            goto L72
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            long r11 = r6.f49293b
            long r9 = r6.f49292a
            kotlin.e.n(r13)
            r2 = r9
            r4 = r11
            goto L58
        L44:
            kotlin.e.n(r13)
            j5.e r1 = r8.f49285a
            r6.f49292a = r9
            r6.f49293b = r11
            r6.f49297f = r2
            r2 = r9
            r4 = r11
            java.lang.Object r13 = r1.f(r2, r4, r6)
            if (r13 != r0) goto L58
            goto L71
        L58:
            f4.a r13 = (f4.a) r13
            if (r13 != 0) goto L61
            f4.a r9 = e6.e.a(r2, r4)
            goto L62
        L61:
            r9 = r13
        L62:
            r6.f49294c = r9
            r6.f49292a = r2
            r6.f49293b = r4
            r6.f49297f = r7
            r1 = r8
            java.lang.Object r13 = r1.b(r2, r4, r6)
            if (r13 != r0) goto L72
        L71:
            return r0
        L72:
            kotlin.Pair r10 = new kotlin.Pair
            r10.<init>(r9, r13)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.d.c(long, long, j00.c):java.lang.Object");
    }
}
