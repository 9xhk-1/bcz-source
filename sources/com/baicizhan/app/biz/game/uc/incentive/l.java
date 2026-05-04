package com.baicizhan.app.biz.game.uc.incentive;

import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final p5.f f14600a;

    public l(@m80.k p5.f winningStreakRepo) {
        g0.p(winningStreakRepo, "winningStreakRepo");
        this.f14600a = winningStreakRepo;
    }

    @m80.l
    public final Object a(@m80.k j00.c<? super g2> cVar) {
        Object f11 = this.f14600a.f(cVar);
        return f11 == kotlin.coroutines.intrinsics.b.l() ? f11 : g2.f100423a;
    }
}
