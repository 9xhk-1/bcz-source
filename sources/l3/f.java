package l3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f69316a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f69317b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f69318c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f69319d;

    public f(int i11, @m80.k String ipCn, @m80.k String ipEn, @m80.k String ipTag) {
        kotlin.jvm.internal.g0.p(ipCn, "ipCn");
        kotlin.jvm.internal.g0.p(ipEn, "ipEn");
        kotlin.jvm.internal.g0.p(ipTag, "ipTag");
        this.f69316a = i11;
        this.f69317b = ipCn;
        this.f69318c = ipEn;
        this.f69319d = ipTag;
    }

    public static /* synthetic */ f f(f fVar, int i11, String str, String str2, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = fVar.f69316a;
        }
        if ((i12 & 2) != 0) {
            str = fVar.f69317b;
        }
        if ((i12 & 4) != 0) {
            str2 = fVar.f69318c;
        }
        if ((i12 & 8) != 0) {
            str3 = fVar.f69319d;
        }
        return fVar.e(i11, str, str2, str3);
    }

    public final int a() {
        return this.f69316a;
    }

    @m80.k
    public final String b() {
        return this.f69317b;
    }

    @m80.k
    public final String c() {
        return this.f69318c;
    }

    @m80.k
    public final String d() {
        return this.f69319d;
    }

    @m80.k
    public final f e(int i11, @m80.k String ipCn, @m80.k String ipEn, @m80.k String ipTag) {
        kotlin.jvm.internal.g0.p(ipCn, "ipCn");
        kotlin.jvm.internal.g0.p(ipEn, "ipEn");
        kotlin.jvm.internal.g0.p(ipTag, "ipTag");
        return new f(i11, ipCn, ipEn, ipTag);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f69316a == fVar.f69316a && kotlin.jvm.internal.g0.g(this.f69317b, fVar.f69317b) && kotlin.jvm.internal.g0.g(this.f69318c, fVar.f69318c) && kotlin.jvm.internal.g0.g(this.f69319d, fVar.f69319d);
    }

    @m80.k
    public final String g() {
        return this.f69317b;
    }

    @m80.k
    public final String h() {
        return this.f69318c;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f69316a) * 31) + this.f69317b.hashCode()) * 31) + this.f69318c.hashCode()) * 31) + this.f69319d.hashCode();
    }

    @m80.k
    public final String i() {
        return this.f69319d;
    }

    public final int j() {
        return this.f69316a;
    }

    @m80.k
    public String toString() {
        return "BuddyBasic(ipType=" + this.f69316a + ", ipCn=" + this.f69317b + ", ipEn=" + this.f69318c + ", ipTag=" + this.f69319d + ')';
    }
}
