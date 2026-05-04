package tf;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class j0 {

    /* renamed from: g, reason: collision with root package name */
    public static final int f90539g = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public final String f90540a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final String f90541b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final String f90542c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final String f90543d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final String f90544e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public final String f90545f;

    public j0() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ j0 h(j0 j0Var, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = j0Var.f90540a;
        }
        if ((i11 & 2) != 0) {
            str2 = j0Var.f90541b;
        }
        if ((i11 & 4) != 0) {
            str3 = j0Var.f90542c;
        }
        if ((i11 & 8) != 0) {
            str4 = j0Var.f90543d;
        }
        if ((i11 & 16) != 0) {
            str5 = j0Var.f90544e;
        }
        if ((i11 & 32) != 0) {
            str6 = j0Var.f90545f;
        }
        String str7 = str5;
        String str8 = str6;
        return j0Var.g(str, str2, str3, str4, str7, str8);
    }

    @m80.l
    public final String a() {
        return this.f90540a;
    }

    @m80.l
    public final String b() {
        return this.f90541b;
    }

    @m80.l
    public final String c() {
        return this.f90542c;
    }

    @m80.l
    public final String d() {
        return this.f90543d;
    }

    @m80.l
    public final String e() {
        return this.f90544e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return kotlin.jvm.internal.g0.g(this.f90540a, j0Var.f90540a) && kotlin.jvm.internal.g0.g(this.f90541b, j0Var.f90541b) && kotlin.jvm.internal.g0.g(this.f90542c, j0Var.f90542c) && kotlin.jvm.internal.g0.g(this.f90543d, j0Var.f90543d) && kotlin.jvm.internal.g0.g(this.f90544e, j0Var.f90544e) && kotlin.jvm.internal.g0.g(this.f90545f, j0Var.f90545f);
    }

    @m80.l
    public final String f() {
        return this.f90545f;
    }

    @m80.k
    public final j0 g(@m80.l String str, @m80.l String str2, @m80.l String str3, @m80.l String str4, @m80.l String str5, @m80.l String str6) {
        return new j0(str, str2, str3, str4, str5, str6);
    }

    public int hashCode() {
        String str = this.f90540a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f90541b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f90542c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f90543d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f90544e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f90545f;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @m80.l
    public final String i() {
        return this.f90545f;
    }

    @m80.l
    public final String j() {
        return this.f90541b;
    }

    @m80.l
    public final String k() {
        return this.f90540a;
    }

    @m80.l
    public final String l() {
        return this.f90543d;
    }

    @m80.l
    public final String m() {
        return this.f90544e;
    }

    @m80.l
    public final String n() {
        return this.f90542c;
    }

    @m80.k
    public String toString() {
        return "OneKeyUserInfo(phone=" + this.f90540a + ", operator=" + this.f90541b + ", slogan=" + this.f90542c + ", privacyName=" + this.f90543d + ", privacyUrl=" + this.f90544e + ", failMsg=" + this.f90545f + pn.j.f81007d;
    }

    public j0(@m80.l String str, @m80.l String str2, @m80.l String str3, @m80.l String str4, @m80.l String str5, @m80.l String str6) {
        this.f90540a = str;
        this.f90541b = str2;
        this.f90542c = str3;
        this.f90543d = str4;
        this.f90544e = str5;
        this.f90545f = str6;
    }

    public /* synthetic */ j0(String str, String str2, String str3, String str4, String str5, String str6, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6);
    }
}
