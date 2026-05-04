package l3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f69326a;

    /* renamed from: b, reason: collision with root package name */
    public final int f69327b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f69328c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f69329d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final String f69330e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final String f69331f;

    public h(int i11, int i12, @m80.k String giftCn, @m80.k String giftPic, @m80.k String giftCnPic, @m80.k String giftEnPic) {
        kotlin.jvm.internal.g0.p(giftCn, "giftCn");
        kotlin.jvm.internal.g0.p(giftPic, "giftPic");
        kotlin.jvm.internal.g0.p(giftCnPic, "giftCnPic");
        kotlin.jvm.internal.g0.p(giftEnPic, "giftEnPic");
        this.f69326a = i11;
        this.f69327b = i12;
        this.f69328c = giftCn;
        this.f69329d = giftPic;
        this.f69330e = giftCnPic;
        this.f69331f = giftEnPic;
    }

    public static /* synthetic */ h h(h hVar, int i11, int i12, String str, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = hVar.f69326a;
        }
        if ((i13 & 2) != 0) {
            i12 = hVar.f69327b;
        }
        if ((i13 & 4) != 0) {
            str = hVar.f69328c;
        }
        if ((i13 & 8) != 0) {
            str2 = hVar.f69329d;
        }
        if ((i13 & 16) != 0) {
            str3 = hVar.f69330e;
        }
        if ((i13 & 32) != 0) {
            str4 = hVar.f69331f;
        }
        String str5 = str3;
        String str6 = str4;
        return hVar.g(i11, i12, str, str2, str5, str6);
    }

    public final int a() {
        return this.f69326a;
    }

    public final int b() {
        return this.f69327b;
    }

    @m80.k
    public final String c() {
        return this.f69328c;
    }

    @m80.k
    public final String d() {
        return this.f69329d;
    }

    @m80.k
    public final String e() {
        return this.f69330e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f69326a == hVar.f69326a && this.f69327b == hVar.f69327b && kotlin.jvm.internal.g0.g(this.f69328c, hVar.f69328c) && kotlin.jvm.internal.g0.g(this.f69329d, hVar.f69329d) && kotlin.jvm.internal.g0.g(this.f69330e, hVar.f69330e) && kotlin.jvm.internal.g0.g(this.f69331f, hVar.f69331f);
    }

    @m80.k
    public final String f() {
        return this.f69331f;
    }

    @m80.k
    public final h g(int i11, int i12, @m80.k String giftCn, @m80.k String giftPic, @m80.k String giftCnPic, @m80.k String giftEnPic) {
        kotlin.jvm.internal.g0.p(giftCn, "giftCn");
        kotlin.jvm.internal.g0.p(giftPic, "giftPic");
        kotlin.jvm.internal.g0.p(giftCnPic, "giftCnPic");
        kotlin.jvm.internal.g0.p(giftEnPic, "giftEnPic");
        return new h(i11, i12, giftCn, giftPic, giftCnPic, giftEnPic);
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f69326a) * 31) + Integer.hashCode(this.f69327b)) * 31) + this.f69328c.hashCode()) * 31) + this.f69329d.hashCode()) * 31) + this.f69330e.hashCode()) * 31) + this.f69331f.hashCode();
    }

    @m80.k
    public final String i() {
        return this.f69328c;
    }

    @m80.k
    public final String j() {
        return this.f69330e;
    }

    @m80.k
    public final String k() {
        return this.f69331f;
    }

    public final int l() {
        return this.f69326a;
    }

    @m80.k
    public final String m() {
        return this.f69329d;
    }

    public final int n() {
        return this.f69327b;
    }

    @m80.k
    public String toString() {
        return "BuddyGiftData(giftId=" + this.f69326a + ", giftType=" + this.f69327b + ", giftCn=" + this.f69328c + ", giftPic=" + this.f69329d + ", giftCnPic=" + this.f69330e + ", giftEnPic=" + this.f69331f + ')';
    }
}
