package com.baicizhan.main.home.experiment;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@yz.n(message = "Former experimental version")
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: f, reason: collision with root package name */
    public static final int f21107f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f21109a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f21110b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f21111c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21112d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final a f21106e = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final c f21108g = new c(0, "", "", 0);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final c a() {
            return c.f21108g;
        }

        public a() {
        }
    }

    public c(int i11, @m80.k String name, @m80.k String cover, int i12) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(cover, "cover");
        this.f21109a = i11;
        this.f21110b = name;
        this.f21111c = cover;
        this.f21112d = i12;
    }

    public static /* synthetic */ c g(c cVar, int i11, String str, String str2, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = cVar.f21109a;
        }
        if ((i13 & 2) != 0) {
            str = cVar.f21110b;
        }
        if ((i13 & 4) != 0) {
            str2 = cVar.f21111c;
        }
        if ((i13 & 8) != 0) {
            i12 = cVar.f21112d;
        }
        return cVar.f(i11, str, str2, i12);
    }

    public final int b() {
        return this.f21109a;
    }

    @m80.k
    public final String c() {
        return this.f21110b;
    }

    @m80.k
    public final String d() {
        return this.f21111c;
    }

    public final int e() {
        return this.f21112d;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f21109a == cVar.f21109a && kotlin.jvm.internal.g0.g(this.f21110b, cVar.f21110b) && kotlin.jvm.internal.g0.g(this.f21111c, cVar.f21111c) && this.f21112d == cVar.f21112d;
    }

    @m80.k
    public final c f(int i11, @m80.k String name, @m80.k String cover, int i12) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(cover, "cover");
        return new c(i11, name, cover, i12);
    }

    @m80.k
    public final String h() {
        return this.f21111c;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f21109a) * 31) + this.f21110b.hashCode()) * 31) + this.f21111c.hashCode()) * 31) + Integer.hashCode(this.f21112d);
    }

    public final int i() {
        return this.f21109a;
    }

    @m80.k
    public final String j() {
        return this.f21110b;
    }

    public final int k() {
        return this.f21112d;
    }

    @m80.k
    public String toString() {
        return "BookInfo(id=" + this.f21109a + ", name=" + this.f21110b + ", cover=" + this.f21111c + ", wordsCount=" + this.f21112d + pn.j.f81007d;
    }
}
