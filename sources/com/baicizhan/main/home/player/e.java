package com.baicizhan.main.home.player;

import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: i, reason: collision with root package name */
    public static final int f23557i = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f23558a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final r4 f23559b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f23560c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f23561d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final String f23562e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final x00.a<yz.g2> f23563f;

    /* renamed from: g, reason: collision with root package name */
    public final int f23564g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f23565h;

    public e(@m80.k String title, @m80.k r4 behavior, @m80.k String description, @m80.k String descriptionExtra, @m80.k String tip, @m80.k x00.a<yz.g2> onTipRead, @DrawableRes int i11, boolean z11) {
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(behavior, "behavior");
        kotlin.jvm.internal.g0.p(description, "description");
        kotlin.jvm.internal.g0.p(descriptionExtra, "descriptionExtra");
        kotlin.jvm.internal.g0.p(tip, "tip");
        kotlin.jvm.internal.g0.p(onTipRead, "onTipRead");
        this.f23558a = title;
        this.f23559b = behavior;
        this.f23560c = description;
        this.f23561d = descriptionExtra;
        this.f23562e = tip;
        this.f23563f = onTipRead;
        this.f23564g = i11;
        this.f23565h = z11;
    }

    public static final yz.g2 b() {
        return yz.g2.f100423a;
    }

    public static /* synthetic */ e l(e eVar, String str, r4 r4Var, String str2, String str3, String str4, x00.a aVar, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = eVar.f23558a;
        }
        if ((i12 & 2) != 0) {
            r4Var = eVar.f23559b;
        }
        if ((i12 & 4) != 0) {
            str2 = eVar.f23560c;
        }
        if ((i12 & 8) != 0) {
            str3 = eVar.f23561d;
        }
        if ((i12 & 16) != 0) {
            str4 = eVar.f23562e;
        }
        if ((i12 & 32) != 0) {
            aVar = eVar.f23563f;
        }
        if ((i12 & 64) != 0) {
            i11 = eVar.f23564g;
        }
        if ((i12 & 128) != 0) {
            z11 = eVar.f23565h;
        }
        int i13 = i11;
        boolean z12 = z11;
        String str5 = str4;
        x00.a aVar2 = aVar;
        return eVar.k(str, r4Var, str2, str3, str5, aVar2, i13, z12);
    }

    @m80.k
    public final String c() {
        return this.f23558a;
    }

    @m80.k
    public final r4 d() {
        return this.f23559b;
    }

    @m80.k
    public final String e() {
        return this.f23560c;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.g0.g(this.f23558a, eVar.f23558a) && kotlin.jvm.internal.g0.g(this.f23559b, eVar.f23559b) && kotlin.jvm.internal.g0.g(this.f23560c, eVar.f23560c) && kotlin.jvm.internal.g0.g(this.f23561d, eVar.f23561d) && kotlin.jvm.internal.g0.g(this.f23562e, eVar.f23562e) && kotlin.jvm.internal.g0.g(this.f23563f, eVar.f23563f) && this.f23564g == eVar.f23564g && this.f23565h == eVar.f23565h;
    }

    @m80.k
    public final String f() {
        return this.f23561d;
    }

    @m80.k
    public final String g() {
        return this.f23562e;
    }

    @m80.k
    public final x00.a<yz.g2> h() {
        return this.f23563f;
    }

    public int hashCode() {
        return (((((((((((((this.f23558a.hashCode() * 31) + this.f23559b.hashCode()) * 31) + this.f23560c.hashCode()) * 31) + this.f23561d.hashCode()) * 31) + this.f23562e.hashCode()) * 31) + this.f23563f.hashCode()) * 31) + Integer.hashCode(this.f23564g)) * 31) + Boolean.hashCode(this.f23565h);
    }

    public final int i() {
        return this.f23564g;
    }

    public final boolean j() {
        return this.f23565h;
    }

    @m80.k
    public final e k(@m80.k String title, @m80.k r4 behavior, @m80.k String description, @m80.k String descriptionExtra, @m80.k String tip, @m80.k x00.a<yz.g2> onTipRead, @DrawableRes int i11, boolean z11) {
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(behavior, "behavior");
        kotlin.jvm.internal.g0.p(description, "description");
        kotlin.jvm.internal.g0.p(descriptionExtra, "descriptionExtra");
        kotlin.jvm.internal.g0.p(tip, "tip");
        kotlin.jvm.internal.g0.p(onTipRead, "onTipRead");
        return new e(title, behavior, description, descriptionExtra, tip, onTipRead, i11, z11);
    }

    public final boolean m() {
        return this.f23565h;
    }

    @m80.k
    public final r4 n() {
        return this.f23559b;
    }

    @m80.k
    public final String o() {
        return this.f23560c;
    }

    @m80.k
    public final String p() {
        return this.f23561d;
    }

    public final int q() {
        return this.f23564g;
    }

    @m80.k
    public final x00.a<yz.g2> r() {
        return this.f23563f;
    }

    @m80.k
    public final String s() {
        return this.f23562e;
    }

    @m80.k
    public final String t() {
        return this.f23558a;
    }

    @m80.k
    public String toString() {
        return "Behavior(title=" + this.f23558a + ", behavior=" + this.f23559b + ", description=" + this.f23560c + ", descriptionExtra=" + this.f23561d + ", tip=" + this.f23562e + ", onTipRead=" + this.f23563f + ", icon=" + this.f23564g + ", arrowOn=" + this.f23565h + pn.j.f81007d;
    }

    public /* synthetic */ e(String str, r4 r4Var, String str2, String str3, String str4, x00.a aVar, int i11, boolean z11, int i12, kotlin.jvm.internal.v vVar) {
        this(str, r4Var, (i12 & 4) != 0 ? "" : str2, (i12 & 8) != 0 ? "" : str3, (i12 & 16) != 0 ? "" : str4, (i12 & 32) != 0 ? new x00.a() { // from class: com.baicizhan.main.home.player.d
            @Override // x00.a
            public final Object invoke() {
                yz.g2 b11;
                b11 = e.b();
                return b11;
            }
        } : aVar, (i12 & 64) != 0 ? 0 : i11, (i12 & 128) != 0 ? false : z11);
    }
}
