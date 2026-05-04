package p5;

import com.baicizhan.app.biz.game.model.RankType;
import com.baicizhan.client.business.dataset.provider.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e0;
import kotlinx.coroutines.flow.x;
import z8.t;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {p5.c.class})
/* loaded from: classes3.dex */
public final class k implements p5.c {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.preferences.a f78980a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.auth.r f78981b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final x<Boolean> f78982c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78983a;

        static {
            int[] iArr = new int[RankType.values().length];
            try {
                iArr[RankType.Up.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RankType.Down.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RankType.Hint.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f78983a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.incentive.RankRepoImpl", f = "RankRepo.kt", i = {}, l = {89}, m = "getLocalRankInfo", n = {}, s = {}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f78984a;

        /* renamed from: c, reason: collision with root package name */
        public int f78986c;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f78984a = obj;
            this.f78986c |= Integer.MIN_VALUE;
            return k.this.i(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.incentive.RankRepoImpl", f = "RankRepo.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2}, l = {60, 61, 62}, m = "setRankReadTime", n = {"rankType", "$this$setRankReadTime_u24lambda_u240", "$this$setRankReadTime_u24lambda_u240_u240", a.d.C0245a.f16161a, "timeValue", "$i$a$-runCatching-RankRepoImpl$setRankReadTime$2", "$i$a$-apply-RankRepoImpl$setRankReadTime$2$1", "rankType", "$this$setRankReadTime_u24lambda_u240", "$this$setRankReadTime_u24lambda_u240_u240", a.d.C0245a.f16161a, "timeValue", "$i$a$-runCatching-RankRepoImpl$setRankReadTime$2", "$i$a$-apply-RankRepoImpl$setRankReadTime$2$1", "old", "rankType", "$this$setRankReadTime_u24lambda_u240", "$this$setRankReadTime_u24lambda_u240_u240", a.d.C0245a.f16161a, "timeValue", "$i$a$-runCatching-RankRepoImpl$setRankReadTime$2", "$i$a$-apply-RankRepoImpl$setRankReadTime$2$1", "old"}, s = {"L$0", "L$1", "L$3", "L$4", "J$0", "I$0", "I$1", "L$0", "L$1", "L$3", "L$4", "J$0", "I$0", "I$1", "J$1", "L$0", "L$1", "L$3", "L$4", "J$0", "I$0", "I$1", "J$1"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f78987a;

        /* renamed from: b, reason: collision with root package name */
        public Object f78988b;

        /* renamed from: c, reason: collision with root package name */
        public Object f78989c;

        /* renamed from: d, reason: collision with root package name */
        public Object f78990d;

        /* renamed from: e, reason: collision with root package name */
        public Object f78991e;

        /* renamed from: f, reason: collision with root package name */
        public long f78992f;

        /* renamed from: g, reason: collision with root package name */
        public long f78993g;

        /* renamed from: h, reason: collision with root package name */
        public int f78994h;

        /* renamed from: i, reason: collision with root package name */
        public int f78995i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f78996j;

        /* renamed from: l, reason: collision with root package name */
        public int f78998l;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f78996j = obj;
            this.f78998l |= Integer.MIN_VALUE;
            return k.this.c(null, 0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.incentive.RankRepoImpl", f = "RankRepo.kt", i = {0, 1}, l = {73, 74}, m = "updateExperienceRankInfo", n = {"rankInfo", "rankInfo"}, s = {"L$0", "L$0"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f78999a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f79000b;

        /* renamed from: d, reason: collision with root package name */
        public int f79002d;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f79000b = obj;
            this.f79002d |= Integer.MIN_VALUE;
            return k.this.e(null, this);
        }
    }

    public k(@m80.k com.baicizhan.app.preferences.a factory, @m80.k com.baicizhan.app.biz.auth.r tokenProvider) {
        g0.p(factory, "factory");
        g0.p(tokenProvider, "tokenProvider");
        this.f78980a = factory;
        this.f78981b = tokenProvider;
        x<Boolean> a11 = e0.a(1, 0, BufferOverflow.DROP_OLDEST);
        a11.d(Boolean.TRUE);
        this.f78982c = a11;
    }

    @Override // p5.c
    @m80.k
    public kotlinx.coroutines.flow.i<Boolean> a() {
        return this.f78982c;
    }

    @Override // p5.c
    @m80.l
    public Object b(@m80.k j00.c<? super t> cVar) {
        return i(cVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:(1:(5:12|13|14|15|16)(2:19|20))(9:21|22|23|24|25|(1:27)(1:32)|28|(4:31|14|15|16)|30))(3:33|34|35))(3:40|41|(2:43|30)(1:44))|36|(2:38|30)(7:39|24|25|(0)(0)|28|(0)|30)))|47|6|7|(0)(0)|36|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0049, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x014e, code lost:
    
        r2 = kotlin.Result.Companion;
        kotlin.Result.m6308constructorimpl(kotlin.e.a(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    @Override // p5.c
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(@m80.k com.baicizhan.app.biz.game.model.RankType r19, long r20, @m80.k j00.c<? super yz.g2> r22) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.k.c(com.baicizhan.app.biz.game.model.RankType, long, j00.c):java.lang.Object");
    }

    @Override // p5.c
    @m80.l
    public Object d(@m80.k RankType rankType, @m80.k j00.c<? super Long> cVar) {
        return g().h(h(rankType), 0L, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
    
        if (r8.emit(r2, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r8.e(p5.l.f79004b, r2, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // p5.c
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(@m80.k z8.t r7, @m80.k j00.c<? super yz.g2> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p5.k.d
            if (r0 == 0) goto L13
            r0 = r8
            p5.k$d r0 = (p5.k.d) r0
            int r1 = r0.f79002d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79002d = r1
            goto L18
        L13:
            p5.k$d r0 = new p5.k$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f79000b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f79002d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r7 = r0.f78999a
            z8.t r7 = (z8.t) r7
            kotlin.e.n(r8)
            goto L73
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            java.lang.Object r7 = r0.f78999a
            z8.t r7 = (z8.t) r7
            kotlin.e.n(r8)
            goto L5e
        L40:
            kotlin.e.n(r8)
            com.baicizhan.app.preferences.g r8 = r6.g()
            ts.a<z8.t, z8.t$a> r2 = z8.t.f102028h
            byte[] r2 = l7.d.a(r7, r2)
            java.lang.Object r5 = l00.k.a(r7)
            r0.f78999a = r5
            r0.f79002d = r4
            java.lang.String r5 = "key_rank_info"
            java.lang.Object r8 = r8.e(r5, r2, r0)
            if (r8 != r1) goto L5e
            goto L72
        L5e:
            kotlinx.coroutines.flow.x<java.lang.Boolean> r8 = r6.f78982c
            java.lang.Boolean r2 = l00.a.a(r4)
            java.lang.Object r7 = l00.k.a(r7)
            r0.f78999a = r7
            r0.f79002d = r3
            java.lang.Object r7 = r8.emit(r2, r0)
            if (r7 != r1) goto L73
        L72:
            return r1
        L73:
            yz.g2 r7 = yz.g2.f100423a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.k.e(z8.t, j00.c):java.lang.Object");
    }

    public final com.baicizhan.app.preferences.g g() {
        com.baicizhan.app.preferences.a aVar = this.f78980a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("incentive_scope-");
        Long b11 = this.f78981b.b();
        g0.m(b11);
        sb2.append(b11.longValue());
        return aVar.a(sb2.toString());
    }

    public final String h(RankType rankType) {
        int i11 = a.f78983a[rankType.ordinal()];
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? l.f79005c : l.f79008f : l.f79007e : l.f79006d;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(j00.c<? super z8.t> r20) {
        /*
            r19 = this;
            r0 = r20
            boolean r1 = r0 instanceof p5.k.b
            if (r1 == 0) goto L17
            r1 = r0
            p5.k$b r1 = (p5.k.b) r1
            int r2 = r1.f78986c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f78986c = r2
            r2 = r19
            goto L1e
        L17:
            p5.k$b r1 = new p5.k$b
            r2 = r19
            r1.<init>(r0)
        L1e:
            java.lang.Object r0 = r1.f78984a
            java.lang.Object r3 = kotlin.coroutines.intrinsics.b.l()
            int r4 = r1.f78986c
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L38
            if (r4 != r6) goto L30
            kotlin.e.n(r0)
            goto L4a
        L30:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L38:
            kotlin.e.n(r0)
            com.baicizhan.app.preferences.g r0 = r2.g()
            r1.f78986c = r6
            java.lang.String r4 = "key_rank_info"
            java.lang.Object r0 = r0.c(r4, r5, r1)
            if (r0 != r3) goto L4a
            return r3
        L4a:
            byte[] r0 = (byte[]) r0
            if (r0 == 0) goto L57
            ts.a<z8.t, z8.t$a> r1 = z8.t.f102028h
            java.lang.Object r0 = l7.d.c(r0, r1)
            r5 = r0
            z8.t r5 = (z8.t) r5
        L57:
            if (r5 != 0) goto L74
            z6.b r6 = z6.b.f101032b
            r10 = 4
            r11 = 0
            java.lang.String r7 = "IRankRepo"
            java.lang.String r8 = "getLocalRankInfo: rankInfo is null, returning default value"
            r9 = 0
            z6.b.f(r6, r7, r8, r9, r10, r11)
            z8.t r12 = new z8.t
            r17 = 0
            r18 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r12.<init>(r13, r14, r15, r16, r17, r18)
            return r12
        L74:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.k.i(j00.c):java.lang.Object");
    }
}
