package a6;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.x;
import m80.k;
import m80.l;
import n40.g;
import oa0.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {a6.a.class})
@u0({"SMAP\nStudyRoundStatsRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StudyRoundStatsRepo.kt\ncom/baicizhan/app/biz/game/repo/studyround/StudyRoundStatsRepoImpl\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,147:1\n116#2,11:148\n*S KotlinDebug\n*F\n+ 1 StudyRoundStatsRepo.kt\ncom/baicizhan/app/biz/game/repo/studyround/StudyRoundStatsRepoImpl\n*L\n104#1:148,11\n*E\n"})
/* loaded from: classes3.dex */
public final class c implements a6.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.baicizhan.app.preferences.a f1961a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.baicizhan.app.biz.auth.r f1962b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final n40.a f1963c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final x<Boolean> f1964d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.studyround.StudyRoundStatsRepoImpl", f = "StudyRoundStatsRepo.kt", i = {0, 0, 1, 1, 1}, l = {135, 137}, m = "checkAndResetTodayCountIfNeeded", n = {"kv", "currentTime", "kv", "currentTime", "lastUpdateTime"}, s = {"L$0", "J$0", "L$0", "J$0", "J$1"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f1965a;

        /* renamed from: b, reason: collision with root package name */
        public long f1966b;

        /* renamed from: c, reason: collision with root package name */
        public long f1967c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f1968d;

        /* renamed from: f, reason: collision with root package name */
        public int f1970f;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f1968d = obj;
            this.f1970f |= Integer.MIN_VALUE;
            return c.this.h(null, 0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.studyround.StudyRoundStatsRepoImpl", f = "StudyRoundStatsRepo.kt", i = {}, l = {97, 98, 99}, m = "getStudyRoundStats", n = {}, s = {}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f1971a;

        /* renamed from: b, reason: collision with root package name */
        public int f1972b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f1973c;

        /* renamed from: e, reason: collision with root package name */
        public int f1975e;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f1973c = obj;
            this.f1975e |= Integer.MIN_VALUE;
            return c.this.b(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.studyround.StudyRoundStatsRepoImpl", f = "StudyRoundStatsRepo.kt", i = {1, 1}, l = {84, 92}, m = "getTodayRoundCount", n = {"lastUpdateTime", "currentTime"}, s = {"J$0", "J$1"}, v = 1)
    /* renamed from: a6.c$c, reason: collision with other inner class name */
    public static final class C0010c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f1976a;

        /* renamed from: b, reason: collision with root package name */
        public long f1977b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f1978c;

        /* renamed from: e, reason: collision with root package name */
        public int f1980e;

        public C0010c(j00.c<? super C0010c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f1978c = obj;
            this.f1980e |= Integer.MIN_VALUE;
            return c.this.e(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.studyround.StudyRoundStatsRepoImpl", f = "StudyRoundStatsRepo.kt", i = {0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7}, l = {153, 109, 112, 113, 116, 117, 120, 122}, m = "incrementRoundCount", n = {"$this$withLock_u24default$iv", "$i$f$withLock", "$this$withLock_u24default$iv", "kv", "$i$f$withLock", "$i$a$-withLock$default-StudyRoundStatsRepoImpl$incrementRoundCount$2", "currentTime", "$this$withLock_u24default$iv", "kv", "$i$f$withLock", "$i$a$-withLock$default-StudyRoundStatsRepoImpl$incrementRoundCount$2", "currentTime", "$this$withLock_u24default$iv", "kv", "$i$f$withLock", "$i$a$-withLock$default-StudyRoundStatsRepoImpl$incrementRoundCount$2", "currentTime", "totalCount", "$this$withLock_u24default$iv", "kv", "$i$f$withLock", "$i$a$-withLock$default-StudyRoundStatsRepoImpl$incrementRoundCount$2", "currentTime", "totalCount", "$this$withLock_u24default$iv", "kv", "$i$f$withLock", "$i$a$-withLock$default-StudyRoundStatsRepoImpl$incrementRoundCount$2", "currentTime", "totalCount", "todayCount", "$this$withLock_u24default$iv", "kv", "$i$f$withLock", "$i$a$-withLock$default-StudyRoundStatsRepoImpl$incrementRoundCount$2", "currentTime", "totalCount", "todayCount", "$this$withLock_u24default$iv", "kv", "$i$f$withLock", "$i$a$-withLock$default-StudyRoundStatsRepoImpl$incrementRoundCount$2", "currentTime", "totalCount", "todayCount"}, s = {"L$0", "I$0", "L$0", "L$1", "I$0", "I$1", "J$0", "L$0", "L$1", "I$0", "I$1", "J$0", "L$0", "L$1", "I$0", "I$1", "J$0", "I$2", "L$0", "L$1", "I$0", "I$1", "J$0", "I$2", "L$0", "L$1", "I$0", "I$1", "J$0", "I$2", "I$3", "L$0", "L$1", "I$0", "I$1", "J$0", "I$2", "I$3", "L$0", "L$1", "I$0", "I$1", "J$0", "I$2", "I$3"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f1981a;

        /* renamed from: b, reason: collision with root package name */
        public Object f1982b;

        /* renamed from: c, reason: collision with root package name */
        public int f1983c;

        /* renamed from: d, reason: collision with root package name */
        public int f1984d;

        /* renamed from: e, reason: collision with root package name */
        public int f1985e;

        /* renamed from: f, reason: collision with root package name */
        public int f1986f;

        /* renamed from: g, reason: collision with root package name */
        public long f1987g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f1988h;

        /* renamed from: j, reason: collision with root package name */
        public int f1990j;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f1988h = obj;
            this.f1990j |= Integer.MIN_VALUE;
            return c.this.d(this);
        }
    }

    public c(@k com.baicizhan.app.preferences.a factory, @k com.baicizhan.app.biz.auth.r tokenProvider) {
        g0.p(factory, "factory");
        g0.p(tokenProvider, "tokenProvider");
        this.f1961a = factory;
        this.f1962b = tokenProvider;
        this.f1963c = g.b(false, 1, null);
        x<Boolean> a11 = e0.a(1, 0, BufferOverflow.DROP_OLDEST);
        a11.d(Boolean.FALSE);
        this.f1964d = a11;
    }

    @Override // a6.a
    @k
    public i<Boolean> a() {
        return this.f1964d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004e, code lost:
    
        if (r8 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // a6.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(@m80.k j00.c<? super a6.b> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof a6.c.b
            if (r0 == 0) goto L13
            r0 = r8
            a6.c$b r0 = (a6.c.b) r0
            int r1 = r0.f1975e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1975e = r1
            goto L18
        L13:
            a6.c$b r0 = new a6.c$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f1973c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f1975e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L41
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            int r1 = r0.f1972b
            int r0 = r0.f1971a
            kotlin.e.n(r8)
            goto L7b
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3b:
            int r2 = r0.f1971a
            kotlin.e.n(r8)
            goto L65
        L41:
            kotlin.e.n(r8)
            goto L51
        L45:
            kotlin.e.n(r8)
            r0.f1975e = r5
            java.lang.Object r8 = r7.c(r0)
            if (r8 != r1) goto L51
            goto L77
        L51:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r0.f1971a = r8
            r0.f1975e = r4
            java.lang.Object r2 = r7.e(r0)
            if (r2 != r1) goto L62
            goto L77
        L62:
            r6 = r2
            r2 = r8
            r8 = r6
        L65:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r0.f1971a = r2
            r0.f1972b = r8
            r0.f1975e = r3
            java.lang.Object r0 = r7.j(r0)
            if (r0 != r1) goto L78
        L77:
            return r1
        L78:
            r1 = r8
            r8 = r0
            r0 = r2
        L7b:
            java.lang.Number r8 = (java.lang.Number) r8
            long r2 = r8.longValue()
            a6.b r8 = new a6.b
            r8.<init>(r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.c.b(j00.c):java.lang.Object");
    }

    @Override // a6.a
    @l
    public Object c(@k j00.c<? super Integer> cVar) {
        return i().d(a6.d.f1992b, 0, cVar);
    }

    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0061: MOVE (r2 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:98), block:B:73:0x0061 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    @Override // a6.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(@m80.k j00.c<? super yz.g2> r17) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.c.d(j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
    
        if (r9 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // a6.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(@m80.k j00.c<? super java.lang.Integer> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof a6.c.C0010c
            if (r0 == 0) goto L13
            r0 = r9
            a6.c$c r0 = (a6.c.C0010c) r0
            int r1 = r0.f1980e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1980e = r1
            goto L18
        L13:
            a6.c$c r0 = new a6.c$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f1978c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f1980e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r9)
            return r9
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L34:
            kotlin.e.n(r9)
            goto L44
        L38:
            kotlin.e.n(r9)
            r0.f1980e = r4
            java.lang.Object r9 = r8.j(r0)
            if (r9 != r1) goto L44
            goto L6a
        L44:
            java.lang.Number r9 = (java.lang.Number) r9
            long r4 = r9.longValue()
            long r6 = w3.g.l()
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r2 = 0
            if (r9 == 0) goto L58
            java.lang.Integer r9 = l00.a.f(r2)
            return r9
        L58:
            com.baicizhan.app.preferences.g r9 = r8.i()
            r0.f1976a = r4
            r0.f1977b = r6
            r0.f1980e = r3
            java.lang.String r3 = "today_round_count"
            java.lang.Object r9 = r9.d(r3, r2, r0)
            if (r9 != r1) goto L6b
        L6a:
            return r1
        L6b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.c.e(j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0073, code lost:
    
        if (r7.f(a6.d.f1993c, 0, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (r10 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.baicizhan.app.preferences.g r7, long r8, j00.c<? super yz.g2> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof a6.c.a
            if (r0 == 0) goto L13
            r0 = r10
            a6.c$a r0 = (a6.c.a) r0
            int r1 = r0.f1970f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1970f = r1
            goto L18
        L13:
            a6.c$a r0 = new a6.c$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f1968d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f1970f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r7 = r0.f1965a
            com.baicizhan.app.preferences.g r7 = (com.baicizhan.app.preferences.g) r7
            kotlin.e.n(r10)
            goto L76
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            long r8 = r0.f1966b
            java.lang.Object r7 = r0.f1965a
            com.baicizhan.app.preferences.g r7 = (com.baicizhan.app.preferences.g) r7
            kotlin.e.n(r10)
            goto L56
        L42:
            kotlin.e.n(r10)
            r0.f1965a = r7
            r0.f1966b = r8
            r0.f1970f = r4
            java.lang.String r10 = "last_update_time"
            r4 = 0
            java.lang.Object r10 = r7.h(r10, r4, r0)
            if (r10 != r1) goto L56
            goto L75
        L56:
            java.lang.Number r10 = (java.lang.Number) r10
            long r4 = r10.longValue()
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 == 0) goto L79
            java.lang.Object r10 = l00.k.a(r7)
            r0.f1965a = r10
            r0.f1966b = r8
            r0.f1967c = r4
            r0.f1970f = r3
            java.lang.String r8 = "today_round_count"
            r9 = 0
            java.lang.Object r7 = r7.f(r8, r9, r0)
            if (r7 != r1) goto L76
        L75:
            return r1
        L76:
            yz.g2 r7 = yz.g2.f100423a
            return r7
        L79:
            yz.g2 r7 = yz.g2.f100423a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.c.h(com.baicizhan.app.preferences.g, long, j00.c):java.lang.Object");
    }

    public final com.baicizhan.app.preferences.g i() {
        com.baicizhan.app.preferences.a aVar = this.f1961a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("study_round_stats_scope-");
        Long b11 = this.f1962b.b();
        g0.m(b11);
        sb2.append(b11.longValue());
        return aVar.a(sb2.toString());
    }

    public final Object j(j00.c<? super Long> cVar) {
        return i().h("last_update_time", 0L, cVar);
    }
}
