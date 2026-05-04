package l3;

import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public final g f69334a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final k f69335b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final Boolean f69336c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f69337d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final List<l> f69338e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public final List<d> f69339f;

    public i(@m80.l g gVar, @m80.l k kVar, @m80.l Boolean bool, boolean z11, @m80.l List<l> list, @m80.l List<d> list2) {
        this.f69334a = gVar;
        this.f69335b = kVar;
        this.f69336c = bool;
        this.f69337d = z11;
        this.f69338e = list;
        this.f69339f = list2;
    }

    public static /* synthetic */ i h(i iVar, g gVar, k kVar, Boolean bool, boolean z11, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            gVar = iVar.f69334a;
        }
        if ((i11 & 2) != 0) {
            kVar = iVar.f69335b;
        }
        if ((i11 & 4) != 0) {
            bool = iVar.f69336c;
        }
        if ((i11 & 8) != 0) {
            z11 = iVar.f69337d;
        }
        if ((i11 & 16) != 0) {
            list = iVar.f69338e;
        }
        if ((i11 & 32) != 0) {
            list2 = iVar.f69339f;
        }
        List list3 = list;
        List list4 = list2;
        return iVar.g(gVar, kVar, bool, z11, list3, list4);
    }

    @m80.l
    public final g a() {
        return this.f69334a;
    }

    @m80.l
    public final k b() {
        return this.f69335b;
    }

    @m80.l
    public final Boolean c() {
        return this.f69336c;
    }

    public final boolean d() {
        return this.f69337d;
    }

    @m80.l
    public final List<l> e() {
        return this.f69338e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.g0.g(this.f69334a, iVar.f69334a) && kotlin.jvm.internal.g0.g(this.f69335b, iVar.f69335b) && kotlin.jvm.internal.g0.g(this.f69336c, iVar.f69336c) && this.f69337d == iVar.f69337d && kotlin.jvm.internal.g0.g(this.f69338e, iVar.f69338e) && kotlin.jvm.internal.g0.g(this.f69339f, iVar.f69339f);
    }

    @m80.l
    public final List<d> f() {
        return this.f69339f;
    }

    @m80.k
    public final i g(@m80.l g gVar, @m80.l k kVar, @m80.l Boolean bool, boolean z11, @m80.l List<l> list, @m80.l List<d> list2) {
        return new i(gVar, kVar, bool, z11, list, list2);
    }

    public int hashCode() {
        g gVar = this.f69334a;
        int hashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
        k kVar = this.f69335b;
        int hashCode2 = (hashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        Boolean bool = this.f69336c;
        int hashCode3 = (((hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31) + Boolean.hashCode(this.f69337d)) * 31;
        List<l> list = this.f69338e;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<d> list2 = this.f69339f;
        return hashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    @m80.l
    public final g i() {
        return this.f69334a;
    }

    public final boolean j() {
        return this.f69337d;
    }

    @m80.l
    public final k k() {
        return this.f69335b;
    }

    @m80.l
    public final Boolean l() {
        return this.f69336c;
    }

    @m80.l
    public final List<d> m() {
        return this.f69339f;
    }

    @m80.l
    public final List<l> n() {
        return this.f69338e;
    }

    @m80.k
    public String toString() {
        return "BuddyHomePageData(curIpInfo=" + this.f69334a + ", ipRecordInfo=" + this.f69335b + ", travelIsMax=" + this.f69336c + ", ipHas=" + this.f69337d + ", unlockSkillList=" + this.f69338e + ", unlockActionList=" + this.f69339f + ')';
    }
}
