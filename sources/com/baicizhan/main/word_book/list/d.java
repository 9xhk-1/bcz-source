package com.baicizhan.main.word_book.list;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: i, reason: collision with root package name */
    public static final int f27044i = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f27045a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f27046b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27047c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f27048d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f27049e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final x00.a<yz.g2> f27050f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final x00.a<yz.g2> f27051g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final x00.a<yz.g2> f27052h;

    public d(@m80.k String name, @m80.k String cover, int i11, boolean z11, boolean z12, @m80.k x00.a<yz.g2> onClick, @m80.k x00.a<yz.g2> onRemoveClick, @m80.k x00.a<yz.g2> onConfigPlan) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(cover, "cover");
        kotlin.jvm.internal.g0.p(onClick, "onClick");
        kotlin.jvm.internal.g0.p(onRemoveClick, "onRemoveClick");
        kotlin.jvm.internal.g0.p(onConfigPlan, "onConfigPlan");
        this.f27045a = name;
        this.f27046b = cover;
        this.f27047c = i11;
        this.f27048d = z11;
        this.f27049e = z12;
        this.f27050f = onClick;
        this.f27051g = onRemoveClick;
        this.f27052h = onConfigPlan;
    }

    public static final yz.g2 d() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 e() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 f() {
        return yz.g2.f100423a;
    }

    public static /* synthetic */ d p(d dVar, String str, String str2, int i11, boolean z11, boolean z12, x00.a aVar, x00.a aVar2, x00.a aVar3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = dVar.f27045a;
        }
        if ((i12 & 2) != 0) {
            str2 = dVar.f27046b;
        }
        if ((i12 & 4) != 0) {
            i11 = dVar.f27047c;
        }
        if ((i12 & 8) != 0) {
            z11 = dVar.f27048d;
        }
        if ((i12 & 16) != 0) {
            z12 = dVar.f27049e;
        }
        if ((i12 & 32) != 0) {
            aVar = dVar.f27050f;
        }
        if ((i12 & 64) != 0) {
            aVar2 = dVar.f27051g;
        }
        if ((i12 & 128) != 0) {
            aVar3 = dVar.f27052h;
        }
        x00.a aVar4 = aVar2;
        x00.a aVar5 = aVar3;
        boolean z13 = z12;
        x00.a aVar6 = aVar;
        return dVar.o(str, str2, i11, z11, z13, aVar6, aVar4, aVar5);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.g0.g(this.f27045a, dVar.f27045a) && kotlin.jvm.internal.g0.g(this.f27046b, dVar.f27046b) && this.f27047c == dVar.f27047c && this.f27048d == dVar.f27048d && this.f27049e == dVar.f27049e && kotlin.jvm.internal.g0.g(this.f27050f, dVar.f27050f) && kotlin.jvm.internal.g0.g(this.f27051g, dVar.f27051g) && kotlin.jvm.internal.g0.g(this.f27052h, dVar.f27052h);
    }

    @m80.k
    public final String g() {
        return this.f27045a;
    }

    @m80.k
    public final String h() {
        return this.f27046b;
    }

    public int hashCode() {
        return (((((((((((((this.f27045a.hashCode() * 31) + this.f27046b.hashCode()) * 31) + Integer.hashCode(this.f27047c)) * 31) + Boolean.hashCode(this.f27048d)) * 31) + Boolean.hashCode(this.f27049e)) * 31) + this.f27050f.hashCode()) * 31) + this.f27051g.hashCode()) * 31) + this.f27052h.hashCode();
    }

    public final int i() {
        return this.f27047c;
    }

    public final boolean j() {
        return this.f27048d;
    }

    public final boolean k() {
        return this.f27049e;
    }

    @m80.k
    public final x00.a<yz.g2> l() {
        return this.f27050f;
    }

    @m80.k
    public final x00.a<yz.g2> m() {
        return this.f27051g;
    }

    @m80.k
    public final x00.a<yz.g2> n() {
        return this.f27052h;
    }

    @m80.k
    public final d o(@m80.k String name, @m80.k String cover, int i11, boolean z11, boolean z12, @m80.k x00.a<yz.g2> onClick, @m80.k x00.a<yz.g2> onRemoveClick, @m80.k x00.a<yz.g2> onConfigPlan) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(cover, "cover");
        kotlin.jvm.internal.g0.p(onClick, "onClick");
        kotlin.jvm.internal.g0.p(onRemoveClick, "onRemoveClick");
        kotlin.jvm.internal.g0.p(onConfigPlan, "onConfigPlan");
        return new d(name, cover, i11, z11, z12, onClick, onRemoveClick, onConfigPlan);
    }

    @m80.k
    public final String q() {
        return this.f27046b;
    }

    public final boolean r() {
        return this.f27049e;
    }

    @m80.k
    public final String s() {
        return this.f27045a;
    }

    @m80.k
    public final x00.a<yz.g2> t() {
        return this.f27050f;
    }

    @m80.k
    public String toString() {
        return "BookItemInfo(name=" + this.f27045a + ", cover=" + this.f27046b + ", wordCounts=" + this.f27047c + ", removable=" + this.f27048d + ", currentPlan=" + this.f27049e + ", onClick=" + this.f27050f + ", onRemoveClick=" + this.f27051g + ", onConfigPlan=" + this.f27052h + pn.j.f81007d;
    }

    @m80.k
    public final x00.a<yz.g2> u() {
        return this.f27052h;
    }

    @m80.k
    public final x00.a<yz.g2> v() {
        return this.f27051g;
    }

    public final boolean w() {
        return this.f27048d;
    }

    public final int x() {
        return this.f27047c;
    }

    public /* synthetic */ d(String str, String str2, int i11, boolean z11, boolean z12, x00.a aVar, x00.a aVar2, x00.a aVar3, int i12, kotlin.jvm.internal.v vVar) {
        this(str, str2, i11, (i12 & 8) != 0 ? true : z11, (i12 & 16) != 0 ? false : z12, (i12 & 32) != 0 ? new x00.a() { // from class: com.baicizhan.main.word_book.list.a
            @Override // x00.a
            public final Object invoke() {
                yz.g2 d11;
                d11 = d.d();
                return d11;
            }
        } : aVar, (i12 & 64) != 0 ? new x00.a() { // from class: com.baicizhan.main.word_book.list.b
            @Override // x00.a
            public final Object invoke() {
                yz.g2 e11;
                e11 = d.e();
                return e11;
            }
        } : aVar2, (i12 & 128) != 0 ? new x00.a() { // from class: com.baicizhan.main.word_book.list.c
            @Override // x00.a
            public final Object invoke() {
                yz.g2 f11;
                f11 = d.f();
                return f11;
            }
        } : aVar3);
    }
}
