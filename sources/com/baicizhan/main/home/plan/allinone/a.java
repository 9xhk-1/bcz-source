package com.baicizhan.main.home.plan.allinone;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final int f22084d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f22085a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f22086b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final String f22087c;

    public a(int i11, @m80.k String url, @m80.l String str) {
        kotlin.jvm.internal.g0.p(url, "url");
        this.f22085a = i11;
        this.f22086b = url;
        this.f22087c = str;
    }

    public static /* synthetic */ a e(a aVar, int i11, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = aVar.f22085a;
        }
        if ((i12 & 2) != 0) {
            str = aVar.f22086b;
        }
        if ((i12 & 4) != 0) {
            str2 = aVar.f22087c;
        }
        return aVar.d(i11, str, str2);
    }

    public final int a() {
        return this.f22085a;
    }

    @m80.k
    public final String b() {
        return this.f22086b;
    }

    @m80.l
    public final String c() {
        return this.f22087c;
    }

    @m80.k
    public final a d(int i11, @m80.k String url, @m80.l String str) {
        kotlin.jvm.internal.g0.p(url, "url");
        return new a(i11, url, str);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f22085a == aVar.f22085a && kotlin.jvm.internal.g0.g(this.f22086b, aVar.f22086b) && kotlin.jvm.internal.g0.g(this.f22087c, aVar.f22087c);
    }

    @m80.l
    public final String f() {
        return this.f22087c;
    }

    @m80.k
    public final String g() {
        return this.f22086b;
    }

    public final boolean h() {
        return this.f22085a == 3;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f22085a) * 31) + this.f22086b.hashCode()) * 31;
        String str = this.f22087c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean i() {
        return this.f22085a == 1;
    }

    public final boolean j() {
        return this.f22085a == 2;
    }

    @m80.k
    public String toString() {
        return "Action(action=" + this.f22085a + ", url=" + this.f22086b + ", text=" + this.f22087c + pn.j.f81007d;
    }
}
