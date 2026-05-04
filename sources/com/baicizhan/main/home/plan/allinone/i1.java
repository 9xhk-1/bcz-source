package com.baicizhan.main.home.plan.allinone;

import androidx.compose.runtime.internal.StabilityInferred;
import javax.inject.Inject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class i1 implements g1 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f22205b = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final yz.c0 f22206a = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.home.plan.allinone.h1
        @Override // x00.a
        public final Object invoke() {
            nc.a e11;
            e11 = i1.e();
            return e11;
        }
    });

    @Inject
    public i1() {
    }

    public static final nc.a e() {
        return nc.b.c("REVIEW_SHOW_SCOPE");
    }

    @Override // com.baicizhan.main.home.plan.allinone.g1
    @m80.l
    public Object a(@m80.k String str, int i11, @m80.k j00.c<? super Boolean> cVar) {
        String b11;
        nc.a d11 = d();
        b11 = k1.b(str, i11);
        return l00.a.a(d11.getBoolean(b11, false));
    }

    @Override // com.baicizhan.main.home.plan.allinone.g1
    @m80.l
    public Object b(@m80.k String str, int i11, @m80.k j00.c<? super yz.g2> cVar) {
        String b11;
        nc.a d11 = d();
        b11 = k1.b(str, i11);
        d11.j(b11, true);
        return yz.g2.f100423a;
    }

    public final nc.a d() {
        return (nc.a) this.f22206a.getValue();
    }
}
