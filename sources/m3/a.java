package m3;

import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public final c f71822a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final b f71823b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final List<String> f71824c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final List<String> f71825d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final List<String> f71826e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public final List<String> f71827f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    public final Integer f71828g;

    public a(@m80.l c cVar, @m80.l b bVar, @m80.l List<String> list, @m80.l List<String> list2, @m80.l List<String> list3, @m80.l List<String> list4, @m80.l Integer num) {
        this.f71822a = cVar;
        this.f71823b = bVar;
        this.f71824c = list;
        this.f71825d = list2;
        this.f71826e = list3;
        this.f71827f = list4;
        this.f71828g = num;
    }

    public static /* synthetic */ a i(a aVar, c cVar, b bVar, List list, List list2, List list3, List list4, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cVar = aVar.f71822a;
        }
        if ((i11 & 2) != 0) {
            bVar = aVar.f71823b;
        }
        if ((i11 & 4) != 0) {
            list = aVar.f71824c;
        }
        if ((i11 & 8) != 0) {
            list2 = aVar.f71825d;
        }
        if ((i11 & 16) != 0) {
            list3 = aVar.f71826e;
        }
        if ((i11 & 32) != 0) {
            list4 = aVar.f71827f;
        }
        if ((i11 & 64) != 0) {
            num = aVar.f71828g;
        }
        List list5 = list4;
        Integer num2 = num;
        List list6 = list3;
        List list7 = list;
        return aVar.h(cVar, bVar, list7, list2, list6, list5, num2);
    }

    @m80.l
    public final c a() {
        return this.f71822a;
    }

    @m80.l
    public final b b() {
        return this.f71823b;
    }

    @m80.l
    public final List<String> c() {
        return this.f71824c;
    }

    @m80.l
    public final List<String> d() {
        return this.f71825d;
    }

    @m80.l
    public final List<String> e() {
        return this.f71826e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.g0.g(this.f71822a, aVar.f71822a) && kotlin.jvm.internal.g0.g(this.f71823b, aVar.f71823b) && kotlin.jvm.internal.g0.g(this.f71824c, aVar.f71824c) && kotlin.jvm.internal.g0.g(this.f71825d, aVar.f71825d) && kotlin.jvm.internal.g0.g(this.f71826e, aVar.f71826e) && kotlin.jvm.internal.g0.g(this.f71827f, aVar.f71827f) && kotlin.jvm.internal.g0.g(this.f71828g, aVar.f71828g);
    }

    @m80.l
    public final List<String> f() {
        return this.f71827f;
    }

    @m80.l
    public final Integer g() {
        return this.f71828g;
    }

    @m80.k
    public final a h(@m80.l c cVar, @m80.l b bVar, @m80.l List<String> list, @m80.l List<String> list2, @m80.l List<String> list3, @m80.l List<String> list4, @m80.l Integer num) {
        return new a(cVar, bVar, list, list2, list3, list4, num);
    }

    public int hashCode() {
        c cVar = this.f71822a;
        int hashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        b bVar = this.f71823b;
        int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        List<String> list = this.f71824c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.f71825d;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.f71826e;
        int hashCode5 = (hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.f71827f;
        int hashCode6 = (hashCode5 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Integer num = this.f71828g;
        return hashCode6 + (num != null ? num.hashCode() : 0);
    }

    @m80.l
    public final List<String> j() {
        return this.f71825d;
    }

    @m80.l
    public final List<String> k() {
        return this.f71824c;
    }

    @m80.l
    public final b l() {
        return this.f71823b;
    }

    @m80.l
    public final List<String> m() {
        return this.f71827f;
    }

    @m80.l
    public final c n() {
        return this.f71822a;
    }

    @m80.l
    public final List<String> o() {
        return this.f71826e;
    }

    @m80.l
    public final Integer p() {
        return this.f71828g;
    }

    @m80.k
    public String toString() {
        return "AdExtraRespVo(launchWechatProgram=" + this.f71822a + ", launchApp=" + this.f71823b + ", impTrackers=" + this.f71824c + ", clickTrackers=" + this.f71825d + ", launchWechatProgramTrackers=" + this.f71826e + ", launchAppTrackers=" + this.f71827f + ", price=" + this.f71828g + ')';
    }
}
