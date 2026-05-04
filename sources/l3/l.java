package l3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f69570a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f69571b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f69572c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f69573d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final String f69574e;

    public l(int i11, @m80.k String skillName, @m80.k String skillUpgradeText, @m80.k String skillIcon, @m80.k String skillDesc) {
        kotlin.jvm.internal.g0.p(skillName, "skillName");
        kotlin.jvm.internal.g0.p(skillUpgradeText, "skillUpgradeText");
        kotlin.jvm.internal.g0.p(skillIcon, "skillIcon");
        kotlin.jvm.internal.g0.p(skillDesc, "skillDesc");
        this.f69570a = i11;
        this.f69571b = skillName;
        this.f69572c = skillUpgradeText;
        this.f69573d = skillIcon;
        this.f69574e = skillDesc;
    }

    public static /* synthetic */ l g(l lVar, int i11, String str, String str2, String str3, String str4, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = lVar.f69570a;
        }
        if ((i12 & 2) != 0) {
            str = lVar.f69571b;
        }
        if ((i12 & 4) != 0) {
            str2 = lVar.f69572c;
        }
        if ((i12 & 8) != 0) {
            str3 = lVar.f69573d;
        }
        if ((i12 & 16) != 0) {
            str4 = lVar.f69574e;
        }
        String str5 = str4;
        String str6 = str2;
        return lVar.f(i11, str, str6, str3, str5);
    }

    public final int a() {
        return this.f69570a;
    }

    @m80.k
    public final String b() {
        return this.f69571b;
    }

    @m80.k
    public final String c() {
        return this.f69572c;
    }

    @m80.k
    public final String d() {
        return this.f69573d;
    }

    @m80.k
    public final String e() {
        return this.f69574e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f69570a == lVar.f69570a && kotlin.jvm.internal.g0.g(this.f69571b, lVar.f69571b) && kotlin.jvm.internal.g0.g(this.f69572c, lVar.f69572c) && kotlin.jvm.internal.g0.g(this.f69573d, lVar.f69573d) && kotlin.jvm.internal.g0.g(this.f69574e, lVar.f69574e);
    }

    @m80.k
    public final l f(int i11, @m80.k String skillName, @m80.k String skillUpgradeText, @m80.k String skillIcon, @m80.k String skillDesc) {
        kotlin.jvm.internal.g0.p(skillName, "skillName");
        kotlin.jvm.internal.g0.p(skillUpgradeText, "skillUpgradeText");
        kotlin.jvm.internal.g0.p(skillIcon, "skillIcon");
        kotlin.jvm.internal.g0.p(skillDesc, "skillDesc");
        return new l(i11, skillName, skillUpgradeText, skillIcon, skillDesc);
    }

    @m80.k
    public final String h() {
        return this.f69574e;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f69570a) * 31) + this.f69571b.hashCode()) * 31) + this.f69572c.hashCode()) * 31) + this.f69573d.hashCode()) * 31) + this.f69574e.hashCode();
    }

    @m80.k
    public final String i() {
        return this.f69573d;
    }

    public final int j() {
        return this.f69570a;
    }

    @m80.k
    public final String k() {
        return this.f69571b;
    }

    @m80.k
    public final String l() {
        return this.f69572c;
    }

    @m80.k
    public String toString() {
        return "BuddySkillData(skillId=" + this.f69570a + ", skillName=" + this.f69571b + ", skillUpgradeText=" + this.f69572c + ", skillIcon=" + this.f69573d + ", skillDesc=" + this.f69574e + ')';
    }
}
