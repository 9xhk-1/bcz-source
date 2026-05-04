package com.baicizhan.app.biz.game.uc.monetization;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import kotlin.time.DurationUnit;
import kotlin.time.e;
import oa0.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final a f14900c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final String f14901d = "promotion_popup";

    /* renamed from: e, reason: collision with root package name */
    public static final long f14902e;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final s5.a f14903a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final s3.f f14904b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    static {
        e.a aVar = kotlin.time.e.f67757b;
        f14902e = kotlin.time.f.w(2, DurationUnit.HOURS);
    }

    public c(@m80.k s5.a promotionRepo, @m80.k s3.f oncePerUserFetcher) {
        g0.p(promotionRepo, "promotionRepo");
        g0.p(oncePerUserFetcher, "oncePerUserFetcher");
        this.f14903a = promotionRepo;
        this.f14904b = oncePerUserFetcher;
    }

    public static /* synthetic */ Object b(c cVar, boolean z11, j00.c cVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return cVar.a(z11, cVar2);
    }

    @m80.l
    public final Object a(boolean z11, @m80.k j00.c<? super g2> cVar) {
        Object b11 = this.f14903a.b(cVar);
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : g2.f100423a;
    }
}
