package l3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f69276a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f69277b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f69278c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f69279d;

    public b(int i11, @m80.k String name, boolean z11, boolean z12) {
        kotlin.jvm.internal.g0.p(name, "name");
        this.f69276a = i11;
        this.f69277b = name;
        this.f69278c = z11;
        this.f69279d = z12;
    }

    public static /* synthetic */ b f(b bVar, int i11, String str, boolean z11, boolean z12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = bVar.f69276a;
        }
        if ((i12 & 2) != 0) {
            str = bVar.f69277b;
        }
        if ((i12 & 4) != 0) {
            z11 = bVar.f69278c;
        }
        if ((i12 & 8) != 0) {
            z12 = bVar.f69279d;
        }
        return bVar.e(i11, str, z11, z12);
    }

    public final int a() {
        return this.f69276a;
    }

    @m80.k
    public final String b() {
        return this.f69277b;
    }

    public final boolean c() {
        return this.f69278c;
    }

    public final boolean d() {
        return this.f69279d;
    }

    @m80.k
    public final b e(int i11, @m80.k String name, boolean z11, boolean z12) {
        kotlin.jvm.internal.g0.p(name, "name");
        return new b(i11, name, z11, z12);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f69276a == bVar.f69276a && kotlin.jvm.internal.g0.g(this.f69277b, bVar.f69277b) && this.f69278c == bVar.f69278c && this.f69279d == bVar.f69279d;
    }

    public final int g() {
        return this.f69276a;
    }

    @m80.k
    public final String h() {
        return this.f69277b;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f69276a) * 31) + this.f69277b.hashCode()) * 31) + Boolean.hashCode(this.f69278c)) * 31) + Boolean.hashCode(this.f69279d);
    }

    public final boolean i() {
        return this.f69278c;
    }

    public final boolean j() {
        return this.f69279d;
    }

    @m80.k
    public String toString() {
        return "BookSaleInfoVo(bookId=" + this.f69276a + ", name=" + this.f69277b + ", isPremium=" + this.f69278c + ", isPurchased=" + this.f69279d + ')';
    }
}
