package com.baicizhan.app.biz.game.uc.abtest;

import com.baicizhan.app.biz.game.repo.experiment.b;
import j00.c;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import oa0.r;
import t3.t;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final C0206a f14409c = new C0206a(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final String f14410d = "CheckFetchABTestUC";

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final String f14411e = "ab_test_last_fetch_date";

    /* renamed from: a, reason: collision with root package name */
    @k
    public final b f14412a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final t f14413b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.app.biz.game.uc.abtest.a$a, reason: collision with other inner class name */
    public static final class C0206a {
        public /* synthetic */ C0206a(v vVar) {
            this();
        }

        public C0206a() {
        }
    }

    public a(@k b experimentRepo) {
        g0.p(experimentRepo, "experimentRepo");
        this.f14412a = experimentRepo;
        this.f14413b = new t(f14411e);
    }

    @l
    public final Object a(@k c<? super g2> cVar) {
        Object b11 = this.f14412a.b(cVar);
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : g2.f100423a;
    }
}
