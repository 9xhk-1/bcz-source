package com.baicizhan.main.home.experiment;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@yz.n(message = "Former experimental version")
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: f, reason: collision with root package name */
    public static final int f21085f = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f21086a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final u3 f21087b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f21088c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f21089d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final x00.a<yz.g2> f21090e;

    public b(@m80.k String title, @m80.k u3 behavior, @m80.k String description, @m80.k String tip, @m80.k x00.a<yz.g2> onTipRead) {
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(behavior, "behavior");
        kotlin.jvm.internal.g0.p(description, "description");
        kotlin.jvm.internal.g0.p(tip, "tip");
        kotlin.jvm.internal.g0.p(onTipRead, "onTipRead");
        this.f21086a = title;
        this.f21087b = behavior;
        this.f21088c = description;
        this.f21089d = tip;
        this.f21090e = onTipRead;
    }

    public static final yz.g2 b() {
        return yz.g2.f100423a;
    }

    public static /* synthetic */ b i(b bVar, String str, u3 u3Var, String str2, String str3, x00.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bVar.f21086a;
        }
        if ((i11 & 2) != 0) {
            u3Var = bVar.f21087b;
        }
        if ((i11 & 4) != 0) {
            str2 = bVar.f21088c;
        }
        if ((i11 & 8) != 0) {
            str3 = bVar.f21089d;
        }
        if ((i11 & 16) != 0) {
            aVar = bVar.f21090e;
        }
        x00.a aVar2 = aVar;
        String str4 = str2;
        return bVar.h(str, u3Var, str4, str3, aVar2);
    }

    @m80.k
    public final String c() {
        return this.f21086a;
    }

    @m80.k
    public final u3 d() {
        return this.f21087b;
    }

    @m80.k
    public final String e() {
        return this.f21088c;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.g0.g(this.f21086a, bVar.f21086a) && kotlin.jvm.internal.g0.g(this.f21087b, bVar.f21087b) && kotlin.jvm.internal.g0.g(this.f21088c, bVar.f21088c) && kotlin.jvm.internal.g0.g(this.f21089d, bVar.f21089d) && kotlin.jvm.internal.g0.g(this.f21090e, bVar.f21090e);
    }

    @m80.k
    public final String f() {
        return this.f21089d;
    }

    @m80.k
    public final x00.a<yz.g2> g() {
        return this.f21090e;
    }

    @m80.k
    public final b h(@m80.k String title, @m80.k u3 behavior, @m80.k String description, @m80.k String tip, @m80.k x00.a<yz.g2> onTipRead) {
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(behavior, "behavior");
        kotlin.jvm.internal.g0.p(description, "description");
        kotlin.jvm.internal.g0.p(tip, "tip");
        kotlin.jvm.internal.g0.p(onTipRead, "onTipRead");
        return new b(title, behavior, description, tip, onTipRead);
    }

    public int hashCode() {
        return (((((((this.f21086a.hashCode() * 31) + this.f21087b.hashCode()) * 31) + this.f21088c.hashCode()) * 31) + this.f21089d.hashCode()) * 31) + this.f21090e.hashCode();
    }

    @m80.k
    public final u3 j() {
        return this.f21087b;
    }

    @m80.k
    public final String k() {
        return this.f21088c;
    }

    @m80.k
    public final x00.a<yz.g2> l() {
        return this.f21090e;
    }

    @m80.k
    public final String m() {
        return this.f21089d;
    }

    @m80.k
    public final String n() {
        return this.f21086a;
    }

    @m80.k
    public String toString() {
        return "Behavior(title=" + this.f21086a + ", behavior=" + this.f21087b + ", description=" + this.f21088c + ", tip=" + this.f21089d + ", onTipRead=" + this.f21090e + pn.j.f81007d;
    }

    public /* synthetic */ b(String str, u3 u3Var, String str2, String str3, x00.a aVar, int i11, kotlin.jvm.internal.v vVar) {
        this(str, u3Var, (i11 & 4) != 0 ? "" : str2, (i11 & 8) != 0 ? "" : str3, (i11 & 16) != 0 ? new x00.a() { // from class: com.baicizhan.main.home.experiment.a
            @Override // x00.a
            public final Object invoke() {
                yz.g2 b11;
                b11 = b.b();
                return b11;
            }
        } : aVar);
    }
}
