package com.baicizhan.app.biz.game.uc.incentive;

import h5.y0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
@u0({"SMAP\nObserveStreakTasksUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObserveStreakTasksUC.kt\ncom/baicizhan/app/biz/game/uc/incentive/ObserveStreakTasksUC\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n+ 3 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,58:1\n233#2:59\n235#2:61\n105#3:60\n1761#4,3:62\n*S KotlinDebug\n*F\n+ 1 ObserveStreakTasksUC.kt\ncom/baicizhan/app/biz/game/uc/incentive/ObserveStreakTasksUC\n*L\n27#1:59\n27#1:61\n27#1:60\n50#1:62,3\n*E\n"})
/* loaded from: classes3.dex */
public final class ObserveStreakTasksUC {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final b6.a f14473a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final p5.f f14474b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final p5.e f14475c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.incentive.ObserveStreakTasksUC", f = "ObserveStreakTasksUC.kt", i = {}, l = {27}, m = "invoke", n = {}, s = {}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14479a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14480b;

        /* renamed from: c, reason: collision with root package name */
        public int f14481c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f14482d;

        /* renamed from: f, reason: collision with root package name */
        public int f14484f;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14482d = obj;
            this.f14484f |= Integer.MIN_VALUE;
            return ObserveStreakTasksUC.this.f(this);
        }
    }

    public ObserveStreakTasksUC(@m80.k b6.a userGuideRepo, @m80.k p5.f winningRepo, @m80.k p5.e winningMileRepo) {
        g0.p(userGuideRepo, "userGuideRepo");
        g0.p(winningRepo, "winningRepo");
        g0.p(winningMileRepo, "winningMileRepo");
        this.f14473a = userGuideRepo;
        this.f14474b = winningRepo;
        this.f14475c = winningMileRepo;
    }

    public final boolean e() {
        return x6.f.b(w3.g.n()).getHour() >= 18;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(@m80.k j00.c<? super kotlinx.coroutines.flow.i<h5.a1>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.baicizhan.app.biz.game.uc.incentive.ObserveStreakTasksUC.a
            if (r0 == 0) goto L13
            r0 = r6
            com.baicizhan.app.biz.game.uc.incentive.ObserveStreakTasksUC$a r0 = (com.baicizhan.app.biz.game.uc.incentive.ObserveStreakTasksUC.a) r0
            int r1 = r0.f14484f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14484f = r1
            goto L18
        L13:
            com.baicizhan.app.biz.game.uc.incentive.ObserveStreakTasksUC$a r0 = new com.baicizhan.app.biz.game.uc.incentive.ObserveStreakTasksUC$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f14482d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f14484f
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            int r1 = r0.f14481c
            java.lang.Object r2 = r0.f14480b
            kotlinx.coroutines.flow.i[] r2 = (kotlinx.coroutines.flow.i[]) r2
            java.lang.Object r0 = r0.f14479a
            kotlinx.coroutines.flow.i[] r0 = (kotlinx.coroutines.flow.i[]) r0
            kotlin.e.n(r6)
            goto L55
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3b:
            kotlin.e.n(r6)
            r6 = 2
            kotlinx.coroutines.flow.i[] r2 = new kotlinx.coroutines.flow.i[r6]
            b6.a r6 = r5.f14473a
            r0.f14479a = r2
            r0.f14480b = r2
            r4 = 0
            r0.f14481c = r4
            r0.f14484f = r3
            java.lang.Object r6 = r6.g(r0)
            if (r6 != r1) goto L53
            return r1
        L53:
            r0 = r2
            r1 = r4
        L55:
            r2[r1] = r6
            p5.f r6 = r5.f14474b
            kotlinx.coroutines.flow.i r6 = r6.i()
            r0[r3] = r6
            com.baicizhan.app.biz.game.uc.incentive.ObserveStreakTasksUC$invoke$$inlined$combine$1 r6 = new com.baicizhan.app.biz.game.uc.incentive.ObserveStreakTasksUC$invoke$$inlined$combine$1
            r6.<init>()
            kotlinx.coroutines.flow.i r6 = kotlinx.coroutines.flow.k.i0(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.incentive.ObserveStreakTasksUC.f(j00.c):java.lang.Object");
    }

    public final boolean g(int i11) {
        List<y0> b11 = this.f14475c.b();
        if ((b11 instanceof Collection) && b11.isEmpty()) {
            return false;
        }
        Iterator<T> it = b11.iterator();
        while (it.hasNext()) {
            if (((y0) it.next()).n() == i11) {
                return true;
            }
        }
        return false;
    }
}
