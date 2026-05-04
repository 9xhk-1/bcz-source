package th;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: g, reason: collision with root package name */
    public static final int f90569g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f90570a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f90571b;

    /* renamed from: c, reason: collision with root package name */
    public final int f90572c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final String f90573d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final String f90574e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public final String f90575f;

    public a(int i11, @m80.k String showName, int i12, @m80.l String str, @m80.l String str2, @m80.l String str3) {
        g0.p(showName, "showName");
        this.f90570a = i11;
        this.f90571b = showName;
        this.f90572c = i12;
        this.f90573d = str;
        this.f90574e = str2;
        this.f90575f = str3;
    }

    public static /* synthetic */ a h(a aVar, int i11, String str, int i12, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = aVar.f90570a;
        }
        if ((i13 & 2) != 0) {
            str = aVar.f90571b;
        }
        if ((i13 & 4) != 0) {
            i12 = aVar.f90572c;
        }
        if ((i13 & 8) != 0) {
            str2 = aVar.f90573d;
        }
        if ((i13 & 16) != 0) {
            str3 = aVar.f90574e;
        }
        if ((i13 & 32) != 0) {
            str4 = aVar.f90575f;
        }
        String str5 = str3;
        String str6 = str4;
        return aVar.g(i11, str, i12, str2, str5, str6);
    }

    public final int a() {
        return this.f90570a;
    }

    @m80.k
    public final String b() {
        return this.f90571b;
    }

    public final int c() {
        return this.f90572c;
    }

    @m80.l
    public final String d() {
        return this.f90573d;
    }

    @m80.l
    public final String e() {
        return this.f90574e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f90570a == aVar.f90570a && g0.g(this.f90571b, aVar.f90571b) && this.f90572c == aVar.f90572c && g0.g(this.f90573d, aVar.f90573d) && g0.g(this.f90574e, aVar.f90574e) && g0.g(this.f90575f, aVar.f90575f);
    }

    @m80.l
    public final String f() {
        return this.f90575f;
    }

    @m80.k
    public final a g(int i11, @m80.k String showName, int i12, @m80.l String str, @m80.l String str2, @m80.l String str3) {
        g0.p(showName, "showName");
        return new a(i11, showName, i12, str, str2, str3);
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.f90570a) * 31) + this.f90571b.hashCode()) * 31) + Integer.hashCode(this.f90572c)) * 31;
        String str = this.f90573d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f90574e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f90575f;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @m80.l
    public final String i() {
        return this.f90575f;
    }

    public final int j() {
        return this.f90570a;
    }

    public final int k() {
        return this.f90572c;
    }

    @m80.l
    public final String l() {
        return this.f90573d;
    }

    @m80.k
    public final String m() {
        return this.f90571b;
    }

    @m80.l
    public final String n() {
        return this.f90574e;
    }

    @m80.k
    public String toString() {
        return "BookAdKt(bookId=" + this.f90570a + ", showName=" + this.f90571b + ", jumpType=" + this.f90572c + ", localLink=" + this.f90573d + ", taobaoLink=" + this.f90574e + ", aId=" + this.f90575f + pn.j.f81007d;
    }
}
