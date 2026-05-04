package l3;

import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f69544a;

    /* renamed from: b, reason: collision with root package name */
    public final int f69545b;

    /* renamed from: c, reason: collision with root package name */
    public final int f69546c;

    /* renamed from: d, reason: collision with root package name */
    public final int f69547d;

    /* renamed from: e, reason: collision with root package name */
    public final int f69548e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public final List<l> f69549f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    public final List<e> f69550g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    public final List<d> f69551h;

    public j(int i11, int i12, int i13, int i14, int i15, @m80.l List<l> list, @m80.l List<e> list2, @m80.l List<d> list3) {
        this.f69544a = i11;
        this.f69545b = i12;
        this.f69546c = i13;
        this.f69547d = i14;
        this.f69548e = i15;
        this.f69549f = list;
        this.f69550g = list2;
        this.f69551h = list3;
    }

    public static /* synthetic */ j j(j jVar, int i11, int i12, int i13, int i14, int i15, List list, List list2, List list3, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i11 = jVar.f69544a;
        }
        if ((i16 & 2) != 0) {
            i12 = jVar.f69545b;
        }
        if ((i16 & 4) != 0) {
            i13 = jVar.f69546c;
        }
        if ((i16 & 8) != 0) {
            i14 = jVar.f69547d;
        }
        if ((i16 & 16) != 0) {
            i15 = jVar.f69548e;
        }
        if ((i16 & 32) != 0) {
            list = jVar.f69549f;
        }
        if ((i16 & 64) != 0) {
            list2 = jVar.f69550g;
        }
        if ((i16 & 128) != 0) {
            list3 = jVar.f69551h;
        }
        List list4 = list2;
        List list5 = list3;
        int i17 = i15;
        List list6 = list;
        return jVar.i(i11, i12, i13, i14, i17, list6, list4, list5);
    }

    public final int a() {
        return this.f69544a;
    }

    public final int b() {
        return this.f69545b;
    }

    public final int c() {
        return this.f69546c;
    }

    public final int d() {
        return this.f69547d;
    }

    public final int e() {
        return this.f69548e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f69544a == jVar.f69544a && this.f69545b == jVar.f69545b && this.f69546c == jVar.f69546c && this.f69547d == jVar.f69547d && this.f69548e == jVar.f69548e && kotlin.jvm.internal.g0.g(this.f69549f, jVar.f69549f) && kotlin.jvm.internal.g0.g(this.f69550g, jVar.f69550g) && kotlin.jvm.internal.g0.g(this.f69551h, jVar.f69551h);
    }

    @m80.l
    public final List<l> f() {
        return this.f69549f;
    }

    @m80.l
    public final List<e> g() {
        return this.f69550g;
    }

    @m80.l
    public final List<d> h() {
        return this.f69551h;
    }

    public int hashCode() {
        int hashCode = ((((((((Integer.hashCode(this.f69544a) * 31) + Integer.hashCode(this.f69545b)) * 31) + Integer.hashCode(this.f69546c)) * 31) + Integer.hashCode(this.f69547d)) * 31) + Integer.hashCode(this.f69548e)) * 31;
        List<l> list = this.f69549f;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<e> list2 = this.f69550g;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<d> list3 = this.f69551h;
        return hashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    @m80.k
    public final j i(int i11, int i12, int i13, int i14, int i15, @m80.l List<l> list, @m80.l List<e> list2, @m80.l List<d> list3) {
        return new j(i11, i12, i13, i14, i15, list, list2, list3);
    }

    public final int k() {
        return this.f69544a;
    }

    public final int l() {
        return this.f69546c;
    }

    public final int m() {
        return this.f69548e;
    }

    public final int n() {
        return this.f69547d;
    }

    public final int o() {
        return this.f69545b;
    }

    @m80.l
    public final List<d> p() {
        return this.f69551h;
    }

    @m80.l
    public final List<e> q() {
        return this.f69550g;
    }

    @m80.l
    public final List<l> r() {
        return this.f69549f;
    }

    @m80.k
    public String toString() {
        return "BuddyLevelData(level=" + this.f69544a + ", levelUpExp=" + this.f69545b + ", levelCookieCost=" + this.f69546c + ", levelTravelTime=" + this.f69547d + ", levelGiftProb=" + this.f69548e + ", unlockSkillList=" + this.f69549f + ", unlockAreaList=" + this.f69550g + ", unlockActionList=" + this.f69551h + ')';
    }
}
