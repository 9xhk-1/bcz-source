package l3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f69289a;

    /* renamed from: b, reason: collision with root package name */
    public final int f69290b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f69291c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f69292d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final String f69293e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final String f69294f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    public final String f69295g;

    public d(int i11, int i12, @m80.k String actionName, @m80.k String actionUpgradeText, @m80.k String actionIcon, @m80.k String actionDesc, @m80.l String str) {
        kotlin.jvm.internal.g0.p(actionName, "actionName");
        kotlin.jvm.internal.g0.p(actionUpgradeText, "actionUpgradeText");
        kotlin.jvm.internal.g0.p(actionIcon, "actionIcon");
        kotlin.jvm.internal.g0.p(actionDesc, "actionDesc");
        this.f69289a = i11;
        this.f69290b = i12;
        this.f69291c = actionName;
        this.f69292d = actionUpgradeText;
        this.f69293e = actionIcon;
        this.f69294f = actionDesc;
        this.f69295g = str;
    }

    public static /* synthetic */ d i(d dVar, int i11, int i12, String str, String str2, String str3, String str4, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = dVar.f69289a;
        }
        if ((i13 & 2) != 0) {
            i12 = dVar.f69290b;
        }
        if ((i13 & 4) != 0) {
            str = dVar.f69291c;
        }
        if ((i13 & 8) != 0) {
            str2 = dVar.f69292d;
        }
        if ((i13 & 16) != 0) {
            str3 = dVar.f69293e;
        }
        if ((i13 & 32) != 0) {
            str4 = dVar.f69294f;
        }
        if ((i13 & 64) != 0) {
            str5 = dVar.f69295g;
        }
        String str6 = str4;
        String str7 = str5;
        String str8 = str3;
        String str9 = str;
        return dVar.h(i11, i12, str9, str2, str8, str6, str7);
    }

    public final int a() {
        return this.f69289a;
    }

    public final int b() {
        return this.f69290b;
    }

    @m80.k
    public final String c() {
        return this.f69291c;
    }

    @m80.k
    public final String d() {
        return this.f69292d;
    }

    @m80.k
    public final String e() {
        return this.f69293e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f69289a == dVar.f69289a && this.f69290b == dVar.f69290b && kotlin.jvm.internal.g0.g(this.f69291c, dVar.f69291c) && kotlin.jvm.internal.g0.g(this.f69292d, dVar.f69292d) && kotlin.jvm.internal.g0.g(this.f69293e, dVar.f69293e) && kotlin.jvm.internal.g0.g(this.f69294f, dVar.f69294f) && kotlin.jvm.internal.g0.g(this.f69295g, dVar.f69295g);
    }

    @m80.k
    public final String f() {
        return this.f69294f;
    }

    @m80.l
    public final String g() {
        return this.f69295g;
    }

    @m80.k
    public final d h(int i11, int i12, @m80.k String actionName, @m80.k String actionUpgradeText, @m80.k String actionIcon, @m80.k String actionDesc, @m80.l String str) {
        kotlin.jvm.internal.g0.p(actionName, "actionName");
        kotlin.jvm.internal.g0.p(actionUpgradeText, "actionUpgradeText");
        kotlin.jvm.internal.g0.p(actionIcon, "actionIcon");
        kotlin.jvm.internal.g0.p(actionDesc, "actionDesc");
        return new d(i11, i12, actionName, actionUpgradeText, actionIcon, actionDesc, str);
    }

    public int hashCode() {
        int hashCode = ((((((((((Integer.hashCode(this.f69289a) * 31) + Integer.hashCode(this.f69290b)) * 31) + this.f69291c.hashCode()) * 31) + this.f69292d.hashCode()) * 31) + this.f69293e.hashCode()) * 31) + this.f69294f.hashCode()) * 31;
        String str = this.f69295g;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @m80.k
    public final String j() {
        return this.f69294f;
    }

    @m80.k
    public final String k() {
        return this.f69293e;
    }

    public final int l() {
        return this.f69289a;
    }

    @m80.k
    public final String m() {
        return this.f69291c;
    }

    public final int n() {
        return this.f69290b;
    }

    @m80.k
    public final String o() {
        return this.f69292d;
    }

    @m80.l
    public final String p() {
        return this.f69295g;
    }

    @m80.k
    public String toString() {
        return "BuddyActionData(actionId=" + this.f69289a + ", actionType=" + this.f69290b + ", actionName=" + this.f69291c + ", actionUpgradeText=" + this.f69292d + ", actionIcon=" + this.f69293e + ", actionDesc=" + this.f69294f + ", soundEffect=" + this.f69295g + ')';
    }
}
