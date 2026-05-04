package com.baicizhan.main.home.player;

import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class q1 {

    /* renamed from: h, reason: collision with root package name */
    public static final int f23900h = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f23901a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23902b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f23903c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final wg.w<String> f23904d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final Object f23905e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f23906f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final x00.a<yz.g2> f23907g;

    public q1(@m80.k String title, @DrawableRes int i11, @m80.k String label, @m80.l wg.w<String> wVar, @m80.l Object obj, boolean z11, @m80.k x00.a<yz.g2> onClick) {
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(label, "label");
        kotlin.jvm.internal.g0.p(onClick, "onClick");
        this.f23901a = title;
        this.f23902b = i11;
        this.f23903c = label;
        this.f23904d = wVar;
        this.f23905e = obj;
        this.f23906f = z11;
        this.f23907g = onClick;
    }

    public static final yz.g2 b() {
        return yz.g2.f100423a;
    }

    public static /* synthetic */ q1 k(q1 q1Var, String str, int i11, String str2, wg.w wVar, Object obj, boolean z11, x00.a aVar, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            str = q1Var.f23901a;
        }
        if ((i12 & 2) != 0) {
            i11 = q1Var.f23902b;
        }
        if ((i12 & 4) != 0) {
            str2 = q1Var.f23903c;
        }
        if ((i12 & 8) != 0) {
            wVar = q1Var.f23904d;
        }
        if ((i12 & 16) != 0) {
            obj = q1Var.f23905e;
        }
        if ((i12 & 32) != 0) {
            z11 = q1Var.f23906f;
        }
        if ((i12 & 64) != 0) {
            aVar = q1Var.f23907g;
        }
        boolean z12 = z11;
        x00.a aVar2 = aVar;
        Object obj3 = obj;
        String str3 = str2;
        return q1Var.j(str, i11, str3, wVar, obj3, z12, aVar2);
    }

    @m80.k
    public final String c() {
        return this.f23901a;
    }

    public final int d() {
        return this.f23902b;
    }

    @m80.k
    public final String e() {
        return this.f23903c;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return kotlin.jvm.internal.g0.g(this.f23901a, q1Var.f23901a) && this.f23902b == q1Var.f23902b && kotlin.jvm.internal.g0.g(this.f23903c, q1Var.f23903c) && kotlin.jvm.internal.g0.g(this.f23904d, q1Var.f23904d) && kotlin.jvm.internal.g0.g(this.f23905e, q1Var.f23905e) && this.f23906f == q1Var.f23906f && kotlin.jvm.internal.g0.g(this.f23907g, q1Var.f23907g);
    }

    @m80.l
    public final wg.w<String> f() {
        return this.f23904d;
    }

    @m80.l
    public final Object g() {
        return this.f23905e;
    }

    public final boolean h() {
        return this.f23906f;
    }

    public int hashCode() {
        int hashCode = ((((this.f23901a.hashCode() * 31) + Integer.hashCode(this.f23902b)) * 31) + this.f23903c.hashCode()) * 31;
        wg.w<String> wVar = this.f23904d;
        int hashCode2 = (hashCode + (wVar == null ? 0 : wVar.hashCode())) * 31;
        Object obj = this.f23905e;
        return ((((hashCode2 + (obj != null ? obj.hashCode() : 0)) * 31) + Boolean.hashCode(this.f23906f)) * 31) + this.f23907g.hashCode();
    }

    @m80.k
    public final x00.a<yz.g2> i() {
        return this.f23907g;
    }

    @m80.k
    public final q1 j(@m80.k String title, @DrawableRes int i11, @m80.k String label, @m80.l wg.w<String> wVar, @m80.l Object obj, boolean z11, @m80.k x00.a<yz.g2> onClick) {
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(label, "label");
        kotlin.jvm.internal.g0.p(onClick, "onClick");
        return new q1(title, i11, label, wVar, obj, z11, onClick);
    }

    public final boolean l() {
        return this.f23906f;
    }

    public final int m() {
        return this.f23902b;
    }

    @m80.k
    public final String n() {
        return this.f23903c;
    }

    @m80.k
    public final x00.a<yz.g2> o() {
        return this.f23907g;
    }

    @m80.l
    public final wg.w<String> p() {
        return this.f23904d;
    }

    @m80.l
    public final Object q() {
        return this.f23905e;
    }

    @m80.k
    public final String r() {
        return this.f23901a;
    }

    @m80.k
    public String toString() {
        return "DynamicItem(title=" + this.f23901a + ", image=" + this.f23902b + ", label=" + this.f23903c + ", slot=" + this.f23904d + ", status=" + this.f23905e + ", highlighted=" + this.f23906f + ", onClick=" + this.f23907g + pn.j.f81007d;
    }

    public /* synthetic */ q1(String str, int i11, String str2, wg.w wVar, Object obj, boolean z11, x00.a aVar, int i12, kotlin.jvm.internal.v vVar) {
        this(str, i11, (i12 & 4) != 0 ? "" : str2, (i12 & 8) != 0 ? null : wVar, (i12 & 16) != 0 ? null : obj, (i12 & 32) != 0 ? false : z11, (i12 & 64) != 0 ? new x00.a() { // from class: com.baicizhan.main.home.player.p1
            @Override // x00.a
            public final Object invoke() {
                yz.g2 b11;
                b11 = q1.b();
                return b11;
            }
        } : aVar);
    }
}
