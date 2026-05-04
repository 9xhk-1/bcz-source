package ij;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: h, reason: collision with root package name */
    public static final int f60605h = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f60606a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f60607b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f60608c;

    /* renamed from: d, reason: collision with root package name */
    public final int f60609d;

    /* renamed from: e, reason: collision with root package name */
    public final int f60610e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final String f60611f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final String f60612g;

    public a(@m80.k String title, @m80.k String icon, @m80.k String count, int i11, int i12, @m80.k String jumpUrl, @m80.k String copperDesc) {
        g0.p(title, "title");
        g0.p(icon, "icon");
        g0.p(count, "count");
        g0.p(jumpUrl, "jumpUrl");
        g0.p(copperDesc, "copperDesc");
        this.f60606a = title;
        this.f60607b = icon;
        this.f60608c = count;
        this.f60609d = i11;
        this.f60610e = i12;
        this.f60611f = jumpUrl;
        this.f60612g = copperDesc;
    }

    public static /* synthetic */ a i(a aVar, String str, String str2, String str3, int i11, int i12, String str4, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = aVar.f60606a;
        }
        if ((i13 & 2) != 0) {
            str2 = aVar.f60607b;
        }
        if ((i13 & 4) != 0) {
            str3 = aVar.f60608c;
        }
        if ((i13 & 8) != 0) {
            i11 = aVar.f60609d;
        }
        if ((i13 & 16) != 0) {
            i12 = aVar.f60610e;
        }
        if ((i13 & 32) != 0) {
            str4 = aVar.f60611f;
        }
        if ((i13 & 64) != 0) {
            str5 = aVar.f60612g;
        }
        String str6 = str4;
        String str7 = str5;
        int i14 = i12;
        String str8 = str3;
        return aVar.h(str, str2, str8, i11, i14, str6, str7);
    }

    @m80.k
    public final String a() {
        return this.f60606a;
    }

    @m80.k
    public final String b() {
        return this.f60607b;
    }

    @m80.k
    public final String c() {
        return this.f60608c;
    }

    public final int d() {
        return this.f60609d;
    }

    public final int e() {
        return this.f60610e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return g0.g(this.f60606a, aVar.f60606a) && g0.g(this.f60607b, aVar.f60607b) && g0.g(this.f60608c, aVar.f60608c) && this.f60609d == aVar.f60609d && this.f60610e == aVar.f60610e && g0.g(this.f60611f, aVar.f60611f) && g0.g(this.f60612g, aVar.f60612g);
    }

    @m80.k
    public final String f() {
        return this.f60611f;
    }

    @m80.k
    public final String g() {
        return this.f60612g;
    }

    @m80.k
    public final a h(@m80.k String title, @m80.k String icon, @m80.k String count, int i11, int i12, @m80.k String jumpUrl, @m80.k String copperDesc) {
        g0.p(title, "title");
        g0.p(icon, "icon");
        g0.p(count, "count");
        g0.p(jumpUrl, "jumpUrl");
        g0.p(copperDesc, "copperDesc");
        return new a(title, icon, count, i11, i12, jumpUrl, copperDesc);
    }

    public int hashCode() {
        return (((((((((((this.f60606a.hashCode() * 31) + this.f60607b.hashCode()) * 31) + this.f60608c.hashCode()) * 31) + Integer.hashCode(this.f60609d)) * 31) + Integer.hashCode(this.f60610e)) * 31) + this.f60611f.hashCode()) * 31) + this.f60612g.hashCode();
    }

    public final int j() {
        return this.f60609d;
    }

    @m80.k
    public final String k() {
        return this.f60612g;
    }

    public final int l() {
        return this.f60610e;
    }

    @m80.k
    public final String m() {
        return this.f60608c;
    }

    @m80.k
    public final String n() {
        return this.f60607b;
    }

    @m80.k
    public final String o() {
        return this.f60611f;
    }

    @m80.k
    public final String p() {
        return this.f60606a;
    }

    @m80.k
    public String toString() {
        return "CopperExchangeDisplayInfo(title=" + this.f60606a + ", icon=" + this.f60607b + ", count=" + this.f60608c + ", copperCost=" + this.f60609d + ", copperHold=" + this.f60610e + ", jumpUrl=" + this.f60611f + ", copperDesc=" + this.f60612g + pn.j.f81007d;
    }
}
