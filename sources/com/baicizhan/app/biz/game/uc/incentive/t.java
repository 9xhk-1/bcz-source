package com.baicizhan.app.biz.game.uc.incentive;

import c40.r0;
import com.baicizhan.client.business.dataset.provider.a;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
@u0({"SMAP\nWinWordsGameUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WinWordsGameUC.kt\ncom/baicizhan/app/biz/game/uc/incentive/WinWordsGameUC\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,48:1\n116#2,11:49\n*S KotlinDebug\n*F\n+ 1 WinWordsGameUC.kt\ncom/baicizhan/app/biz/game/uc/incentive/WinWordsGameUC\n*L\n25#1:49,11\n*E\n"})
/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final p5.f f14645a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final g f14646b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final Set<String> f14647c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final n40.a f14648d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.incentive.WinWordsGameUC", f = "WinWordsGameUC.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {54, 33}, m = "invoke", n = {a.d.C0245a.f16161a, "$this$withLock_u24default$iv", "topicId", ma.b.N, "today", "$i$f$withLock", a.d.C0245a.f16161a, "topicId", ma.b.N, "today", "needWinning"}, s = {"L$0", "L$1", "I$0", "I$1", "J$0", "I$2", "L$0", "I$0", "I$1", "J$0", "Z$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f14649a;

        /* renamed from: b, reason: collision with root package name */
        public int f14650b;

        /* renamed from: c, reason: collision with root package name */
        public int f14651c;

        /* renamed from: d, reason: collision with root package name */
        public long f14652d;

        /* renamed from: e, reason: collision with root package name */
        public Object f14653e;

        /* renamed from: f, reason: collision with root package name */
        public Object f14654f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f14655g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f14656h;

        /* renamed from: j, reason: collision with root package name */
        public int f14658j;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14656h = obj;
            this.f14658j |= Integer.MIN_VALUE;
            return t.this.c(0, 0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.incentive.WinWordsGameUC$invoke$2", f = "WinWordsGameUC.kt", i = {1, 1}, l = {35, 40}, m = "invokeSuspend", n = {"it", "$i$a$-also-WinWordsGameUC$invoke$2$1"}, s = {"Z$0", "I$0"}, v = 1)
    public static final class b extends SuspendLambda implements x00.p<r0, j00.c<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f14659a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f14660b;

        /* renamed from: c, reason: collision with root package name */
        public int f14661c;

        /* renamed from: d, reason: collision with root package name */
        public int f14662d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f14663e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ t f14664f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ long f14665g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z11, t tVar, long j11, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f14663e = z11;
            this.f14664f = tVar;
            this.f14665g = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new b(this.f14663e, this.f14664f, this.f14665g, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super Boolean> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:
        
            if (r8 == r0) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.f14662d
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L23
                if (r1 == r4) goto L1f
                if (r1 != r3) goto L17
                java.lang.Object r0 = r7.f14659a
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                kotlin.e.n(r8)
                return r0
            L17:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1f:
                kotlin.e.n(r8)
                goto L3b
            L23:
                kotlin.e.n(r8)
                boolean r8 = r7.f14663e
                if (r8 == 0) goto L42
                com.baicizhan.app.biz.game.uc.incentive.t r8 = r7.f14664f
                p5.f r8 = com.baicizhan.app.biz.game.uc.incentive.t.b(r8)
                long r5 = r7.f14665g
                r7.f14662d = r4
                java.lang.Object r8 = r8.e(r5, r7)
                if (r8 != r0) goto L3b
                goto L63
            L3b:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                goto L43
            L42:
                r8 = r2
            L43:
                java.lang.Boolean r8 = l00.a.a(r8)
                com.baicizhan.app.biz.game.uc.incentive.t r1 = r7.f14664f
                long r4 = r7.f14665g
                boolean r6 = r8.booleanValue()
                if (r6 == 0) goto L64
                com.baicizhan.app.biz.game.uc.incentive.g r1 = com.baicizhan.app.biz.game.uc.incentive.t.a(r1)
                r7.f14659a = r8
                r7.f14660b = r6
                r7.f14661c = r2
                r7.f14662d = r3
                java.lang.Object r1 = r1.a(r4, r7)
                if (r1 != r0) goto L64
            L63:
                return r0
            L64:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.incentive.t.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public t(@m80.k p5.f winningStreakRepo, @m80.k g completeWinningStreakUC) {
        g0.p(winningStreakRepo, "winningStreakRepo");
        g0.p(completeWinningStreakUC, "completeWinningStreakUC");
        this.f14645a = winningStreakRepo;
        this.f14646b = completeWinningStreakUC;
        this.f14647c = new LinkedHashSet();
        this.f14648d = n40.g.b(false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097 A[Catch: all -> 0x00c4, TRY_LEAVE, TryCatch #0 {all -> 0x00c4, blocks: (B:18:0x008e, B:25:0x0097), top: B:17:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(int r16, int r17, @m80.k j00.c<? super java.lang.Boolean> r18) {
        /*
            Method dump skipped, instructions count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.incentive.t.c(int, int, j00.c):java.lang.Object");
    }
}
