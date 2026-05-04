package l3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f69301a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f69302b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f69303c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f69304d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final String f69305e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final String f69306f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final String f69307g;

    public e(int i11, @m80.k String areaCn, @m80.k String areaEn, @m80.k String areaUpgradeText, @m80.k String areaIcon, @m80.k String areaDesc, @m80.k String areaBgPic) {
        kotlin.jvm.internal.g0.p(areaCn, "areaCn");
        kotlin.jvm.internal.g0.p(areaEn, "areaEn");
        kotlin.jvm.internal.g0.p(areaUpgradeText, "areaUpgradeText");
        kotlin.jvm.internal.g0.p(areaIcon, "areaIcon");
        kotlin.jvm.internal.g0.p(areaDesc, "areaDesc");
        kotlin.jvm.internal.g0.p(areaBgPic, "areaBgPic");
        this.f69301a = i11;
        this.f69302b = areaCn;
        this.f69303c = areaEn;
        this.f69304d = areaUpgradeText;
        this.f69305e = areaIcon;
        this.f69306f = areaDesc;
        this.f69307g = areaBgPic;
    }

    public static /* synthetic */ e i(e eVar, int i11, String str, String str2, String str3, String str4, String str5, String str6, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = eVar.f69301a;
        }
        if ((i12 & 2) != 0) {
            str = eVar.f69302b;
        }
        if ((i12 & 4) != 0) {
            str2 = eVar.f69303c;
        }
        if ((i12 & 8) != 0) {
            str3 = eVar.f69304d;
        }
        if ((i12 & 16) != 0) {
            str4 = eVar.f69305e;
        }
        if ((i12 & 32) != 0) {
            str5 = eVar.f69306f;
        }
        if ((i12 & 64) != 0) {
            str6 = eVar.f69307g;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        String str10 = str2;
        return eVar.h(i11, str, str10, str3, str9, str7, str8);
    }

    public final int a() {
        return this.f69301a;
    }

    @m80.k
    public final String b() {
        return this.f69302b;
    }

    @m80.k
    public final String c() {
        return this.f69303c;
    }

    @m80.k
    public final String d() {
        return this.f69304d;
    }

    @m80.k
    public final String e() {
        return this.f69305e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f69301a == eVar.f69301a && kotlin.jvm.internal.g0.g(this.f69302b, eVar.f69302b) && kotlin.jvm.internal.g0.g(this.f69303c, eVar.f69303c) && kotlin.jvm.internal.g0.g(this.f69304d, eVar.f69304d) && kotlin.jvm.internal.g0.g(this.f69305e, eVar.f69305e) && kotlin.jvm.internal.g0.g(this.f69306f, eVar.f69306f) && kotlin.jvm.internal.g0.g(this.f69307g, eVar.f69307g);
    }

    @m80.k
    public final String f() {
        return this.f69306f;
    }

    @m80.k
    public final String g() {
        return this.f69307g;
    }

    @m80.k
    public final e h(int i11, @m80.k String areaCn, @m80.k String areaEn, @m80.k String areaUpgradeText, @m80.k String areaIcon, @m80.k String areaDesc, @m80.k String areaBgPic) {
        kotlin.jvm.internal.g0.p(areaCn, "areaCn");
        kotlin.jvm.internal.g0.p(areaEn, "areaEn");
        kotlin.jvm.internal.g0.p(areaUpgradeText, "areaUpgradeText");
        kotlin.jvm.internal.g0.p(areaIcon, "areaIcon");
        kotlin.jvm.internal.g0.p(areaDesc, "areaDesc");
        kotlin.jvm.internal.g0.p(areaBgPic, "areaBgPic");
        return new e(i11, areaCn, areaEn, areaUpgradeText, areaIcon, areaDesc, areaBgPic);
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.f69301a) * 31) + this.f69302b.hashCode()) * 31) + this.f69303c.hashCode()) * 31) + this.f69304d.hashCode()) * 31) + this.f69305e.hashCode()) * 31) + this.f69306f.hashCode()) * 31) + this.f69307g.hashCode();
    }

    @m80.k
    public final String j() {
        return this.f69307g;
    }

    @m80.k
    public final String k() {
        return this.f69302b;
    }

    @m80.k
    public final String l() {
        return this.f69306f;
    }

    @m80.k
    public final String m() {
        return this.f69303c;
    }

    @m80.k
    public final String n() {
        return this.f69305e;
    }

    public final int o() {
        return this.f69301a;
    }

    @m80.k
    public final String p() {
        return this.f69304d;
    }

    @m80.k
    public String toString() {
        return "BuddyAreaData(areaId=" + this.f69301a + ", areaCn=" + this.f69302b + ", areaEn=" + this.f69303c + ", areaUpgradeText=" + this.f69304d + ", areaIcon=" + this.f69305e + ", areaDesc=" + this.f69306f + ", areaBgPic=" + this.f69307g + ')';
    }
}
