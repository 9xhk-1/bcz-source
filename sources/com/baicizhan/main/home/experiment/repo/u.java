package com.baicizhan.main.home.experiment.repo;

import androidx.compose.runtime.internal.StabilityInferred;
import c40.r0;
import c40.s0;
import javax.inject.Inject;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class u {

    /* renamed from: c, reason: collision with root package name */
    public static final int f21588c = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final s f21589a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.client.business.managers.winningstreak.a f21590b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.experiment.repo.NormalRefreshUC$invoke$2", f = "NormalRefreshUC.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f21591a;

        public a(j00.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new a(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f21591a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return g2.f100423a;
        }
    }

    @Inject
    public u(@m80.k s iGameHomeRepo, @m80.k com.baicizhan.client.business.managers.winningstreak.a win) {
        g0.p(iGameHomeRepo, "iGameHomeRepo");
        g0.p(win, "win");
        this.f21589a = iGameHomeRepo;
        this.f21590b = win;
    }

    @m80.l
    public final Object a(@m80.k j00.c<? super g2> cVar) {
        Object g11 = s0.g(new a(null), cVar);
        return g11 == kotlin.coroutines.intrinsics.b.l() ? g11 : g2.f100423a;
    }
}
