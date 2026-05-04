package com.baicizhan.app.biz.game.uc.incentive;

import com.baicizhan.app.biz.base.BizInternalException;
import h5.a0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import z8.u;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
@u0({"SMAP\nCheckRankPopupDataUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckRankPopupDataUC.kt\ncom/baicizhan/app/biz/game/uc/incentive/CheckRankPopupDataUC\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,186:1\n1#2:187\n1761#3,3:188\n360#3,7:191\n*S KotlinDebug\n*F\n+ 1 CheckRankPopupDataUC.kt\ncom/baicizhan/app/biz/game/uc/incentive/CheckRankPopupDataUC\n*L\n175#1:188,3\n181#1:191,7\n*E\n"})
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final a f14520c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final String f14521d = "CheckRankPopupDataUC";

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final r6.p f14522a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final p5.b f14523b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.incentive.CheckRankPopupDataUC", f = "CheckRankPopupDataUC.kt", i = {}, l = {84}, m = "hasShownToday", n = {}, s = {}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f14524a;

        /* renamed from: c, reason: collision with root package name */
        public int f14526c;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14524a = obj;
            this.f14526c |= Integer.MIN_VALUE;
            return e.this.g(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.incentive.CheckRankPopupDataUC", f = "CheckRankPopupDataUC.kt", i = {2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5}, l = {29, 35, 46, 53, 54, 60}, m = "invoke", n = {"rankInfo", "currentScore", "rankInfo", "currentScore", "previousScore", "rankInfo", "previousRankList", "currentScore", "previousScore", "rankInfo", "previousRankList", "currentRankList", "currentScore", "previousScore"}, s = {"L$0", "J$0", "L$0", "J$0", "J$1", "L$0", "L$1", "J$0", "J$1", "L$0", "L$1", "L$2", "J$0", "J$1"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14527a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14528b;

        /* renamed from: c, reason: collision with root package name */
        public Object f14529c;

        /* renamed from: d, reason: collision with root package name */
        public long f14530d;

        /* renamed from: e, reason: collision with root package name */
        public long f14531e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f14532f;

        /* renamed from: h, reason: collision with root package name */
        public int f14534h;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14532f = obj;
            this.f14534h |= Integer.MIN_VALUE;
            return e.this.h(this);
        }
    }

    public e(@m80.k r6.p fetchRankInfoUC, @m80.k p5.b rankPopupRepo) {
        g0.p(fetchRankInfoUC, "fetchRankInfoUC");
        g0.p(rankPopupRepo, "rankPopupRepo");
        this.f14522a = fetchRankInfoUC;
        this.f14523b = rankPopupRepo;
    }

    public final boolean b(z8.s sVar) {
        List<u> list = sVar.f101993a;
        if (list != null) {
            List<u> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    if (((u) it.next()).f102076d) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final a0 c(long j11, z8.s sVar, z8.s sVar2, long j12) {
        Integer d11;
        List<u> list = sVar2.f101993a;
        if (list == null) {
            throw new BizInternalException("Current rank list users is null", null, 0, 6, null);
        }
        int size = list.size();
        Integer d12 = d(sVar2);
        int i11 = -1;
        int intValue = (d12 != null ? d12.intValue() : -1) + 1;
        if (sVar != null && (d11 = d(sVar)) != null) {
            i11 = d11.intValue();
        }
        return new a0(i(intValue, size), i(i11 + 1, size), j11, j12, sVar2);
    }

    public final Integer d(z8.s sVar) {
        List<u> list = sVar.f101993a;
        if (list != null) {
            Iterator<u> it = list.iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                }
                if (it.next().f102076d) {
                    break;
                }
                i11++;
            }
            Integer valueOf = Integer.valueOf(i11);
            if (valueOf.intValue() >= 0) {
                return valueOf;
            }
        }
        return null;
    }

    public final boolean e(z8.s sVar, z8.s sVar2) {
        if (sVar == null) {
            throw new IllegalArgumentException("Previous rank list should not be null here");
        }
        Integer d11 = d(sVar);
        Integer d12 = d(sVar2);
        if (d12 != null) {
            return d11 == null || d11.intValue() != d12.intValue();
        }
        throw new BizInternalException("Current user not found in rank list", null, 0, 6, null);
    }

    public final boolean f(long j11, long j12) {
        return j11 != j12;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(j00.c<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.baicizhan.app.biz.game.uc.incentive.e.b
            if (r0 == 0) goto L13
            r0 = r7
            com.baicizhan.app.biz.game.uc.incentive.e$b r0 = (com.baicizhan.app.biz.game.uc.incentive.e.b) r0
            int r1 = r0.f14526c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14526c = r1
            goto L18
        L13:
            com.baicizhan.app.biz.game.uc.incentive.e$b r0 = new com.baicizhan.app.biz.game.uc.incentive.e$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f14524a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f14526c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r7)
            goto L3f
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            kotlin.e.n(r7)
            p5.b r7 = r6.f14523b
            r0.f14526c = r3
            java.lang.Object r7 = r7.c(r0)
            if (r7 != r1) goto L3f
            return r1
        L3f:
            java.lang.Number r7 = (java.lang.Number) r7
            long r0 = r7.longValue()
            long r4 = w3.g.l()
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 != 0) goto L4e
            goto L4f
        L4e:
            r3 = 0
        L4f:
            java.lang.Boolean r7 = l00.a.a(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.incentive.e.g(j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x015b, code lost:
    
        if (r11.d(r1, r8, r2) == r3) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0131, code lost:
    
        if (r1 != r3) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d0, code lost:
    
        if (r1 == r3) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x009e, code lost:
    
        if (r1 == r3) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x007c, code lost:
    
        if (r1 == r3) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(@m80.k j00.c<? super h5.a0> r19) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.incentive.e.h(j00.c):java.lang.Object");
    }

    public final int i(int i11, int i12) {
        return g10.u.I(i11, 1, i12);
    }

    public final boolean j(long j11, z8.s sVar, z8.s sVar2) {
        if (sVar == null) {
            z6.b.d(z6.b.f101032b, f14521d, "No previous rank list, initializing data", null, 4, null);
            return true;
        }
        if (j11 == -1) {
            z6.b.d(z6.b.f101032b, f14521d, "No previous score, initializing data", null, 4, null);
            return true;
        }
        if (!b(sVar)) {
            z6.b.d(z6.b.f101032b, f14521d, "User not found in previous rank list", null, 4, null);
            return true;
        }
        if (g0.g(sVar.f101995c, sVar2.f101995c)) {
            return false;
        }
        z6.b.j(z6.b.f101032b, f14521d, "Rank ID changed: " + sVar.f101995c + " -> " + sVar2.f101995c, null, 4, null);
        return true;
    }
}
