package com.baicizhan.platform.base.widget;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes6.dex */
public final class u4 {

    /* renamed from: e, reason: collision with root package name */
    public static final int f28541e = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f28542a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f28543b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final x00.l<MutableState<Integer>, Boolean> f28544c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final x00.a<yz.g2> f28545d;

    /* JADX WARN: Multi-variable type inference failed */
    public u4(@m80.k String name, boolean z11, @m80.l x00.l<? super MutableState<Integer>, Boolean> lVar, @m80.k x00.a<yz.g2> onClick) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(onClick, "onClick");
        this.f28542a = name;
        this.f28543b = z11;
        this.f28544c = lVar;
        this.f28545d = onClick;
    }

    public static final yz.g2 b() {
        return yz.g2.f100423a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ u4 h(u4 u4Var, String str, boolean z11, x00.l lVar, x00.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = u4Var.f28542a;
        }
        if ((i11 & 2) != 0) {
            z11 = u4Var.f28543b;
        }
        if ((i11 & 4) != 0) {
            lVar = u4Var.f28544c;
        }
        if ((i11 & 8) != 0) {
            aVar = u4Var.f28545d;
        }
        return u4Var.g(str, z11, lVar, aVar);
    }

    @m80.k
    public final String c() {
        return this.f28542a;
    }

    public final boolean d() {
        return this.f28543b;
    }

    @m80.l
    public final x00.l<MutableState<Integer>, Boolean> e() {
        return this.f28544c;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4)) {
            return false;
        }
        u4 u4Var = (u4) obj;
        return kotlin.jvm.internal.g0.g(this.f28542a, u4Var.f28542a) && this.f28543b == u4Var.f28543b && kotlin.jvm.internal.g0.g(this.f28544c, u4Var.f28544c) && kotlin.jvm.internal.g0.g(this.f28545d, u4Var.f28545d);
    }

    @m80.k
    public final x00.a<yz.g2> f() {
        return this.f28545d;
    }

    @m80.k
    public final u4 g(@m80.k String name, boolean z11, @m80.l x00.l<? super MutableState<Integer>, Boolean> lVar, @m80.k x00.a<yz.g2> onClick) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(onClick, "onClick");
        return new u4(name, z11, lVar, onClick);
    }

    public int hashCode() {
        int hashCode = ((this.f28542a.hashCode() * 31) + Boolean.hashCode(this.f28543b)) * 31;
        x00.l<MutableState<Integer>, Boolean> lVar = this.f28544c;
        return ((hashCode + (lVar == null ? 0 : lVar.hashCode())) * 31) + this.f28545d.hashCode();
    }

    @m80.k
    public final String i() {
        return this.f28542a;
    }

    @m80.k
    public final x00.a<yz.g2> j() {
        return this.f28545d;
    }

    @m80.l
    public final x00.l<MutableState<Integer>, Boolean> k() {
        return this.f28544c;
    }

    public final boolean l() {
        return this.f28543b;
    }

    public final void m(boolean z11) {
        this.f28543b = z11;
    }

    @m80.k
    public String toString() {
        return "Switcher(name=" + this.f28542a + ", selected=" + this.f28543b + ", onSelect=" + this.f28544c + ", onClick=" + this.f28545d + pn.j.f81007d;
    }

    public /* synthetic */ u4(String str, boolean z11, x00.l lVar, x00.a aVar, int i11, kotlin.jvm.internal.v vVar) {
        this(str, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? null : lVar, (i11 & 8) != 0 ? new x00.a() { // from class: com.baicizhan.platform.base.widget.t4
            @Override // x00.a
            public final Object invoke() {
                yz.g2 b11;
                b11 = u4.b();
                return b11;
            }
        } : aVar);
    }
}
