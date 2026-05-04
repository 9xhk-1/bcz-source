package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f65470a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f65471b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f65472c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f65473d;

    /* renamed from: e, reason: collision with root package name */
    public final int f65474e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f65475f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final r f65476g;

    public o(int i11, @m80.k String bookName, @m80.k String bookImg, @m80.k String desc, int i12, boolean z11, @m80.k r bookType) {
        kotlin.jvm.internal.g0.p(bookName, "bookName");
        kotlin.jvm.internal.g0.p(bookImg, "bookImg");
        kotlin.jvm.internal.g0.p(desc, "desc");
        kotlin.jvm.internal.g0.p(bookType, "bookType");
        this.f65470a = i11;
        this.f65471b = bookName;
        this.f65472c = bookImg;
        this.f65473d = desc;
        this.f65474e = i12;
        this.f65475f = z11;
        this.f65476g = bookType;
    }

    public static /* synthetic */ o i(o oVar, int i11, String str, String str2, String str3, int i12, boolean z11, r rVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = oVar.f65470a;
        }
        if ((i13 & 2) != 0) {
            str = oVar.f65471b;
        }
        if ((i13 & 4) != 0) {
            str2 = oVar.f65472c;
        }
        if ((i13 & 8) != 0) {
            str3 = oVar.f65473d;
        }
        if ((i13 & 16) != 0) {
            i12 = oVar.f65474e;
        }
        if ((i13 & 32) != 0) {
            z11 = oVar.f65475f;
        }
        if ((i13 & 64) != 0) {
            rVar = oVar.f65476g;
        }
        boolean z12 = z11;
        r rVar2 = rVar;
        int i14 = i12;
        String str4 = str2;
        return oVar.h(i11, str, str4, str3, i14, z12, rVar2);
    }

    public final int a() {
        return this.f65470a;
    }

    @m80.k
    public final String b() {
        return this.f65471b;
    }

    @m80.k
    public final String c() {
        return this.f65472c;
    }

    @m80.k
    public final String d() {
        return this.f65473d;
    }

    public final int e() {
        return this.f65474e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f65470a == oVar.f65470a && kotlin.jvm.internal.g0.g(this.f65471b, oVar.f65471b) && kotlin.jvm.internal.g0.g(this.f65472c, oVar.f65472c) && kotlin.jvm.internal.g0.g(this.f65473d, oVar.f65473d) && this.f65474e == oVar.f65474e && this.f65475f == oVar.f65475f && kotlin.jvm.internal.g0.g(this.f65476g, oVar.f65476g);
    }

    public final boolean f() {
        return this.f65475f;
    }

    @m80.k
    public final r g() {
        return this.f65476g;
    }

    @m80.k
    public final o h(int i11, @m80.k String bookName, @m80.k String bookImg, @m80.k String desc, int i12, boolean z11, @m80.k r bookType) {
        kotlin.jvm.internal.g0.p(bookName, "bookName");
        kotlin.jvm.internal.g0.p(bookImg, "bookImg");
        kotlin.jvm.internal.g0.p(desc, "desc");
        kotlin.jvm.internal.g0.p(bookType, "bookType");
        return new o(i11, bookName, bookImg, desc, i12, z11, bookType);
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.f65470a) * 31) + this.f65471b.hashCode()) * 31) + this.f65472c.hashCode()) * 31) + this.f65473d.hashCode()) * 31) + Integer.hashCode(this.f65474e)) * 31) + Boolean.hashCode(this.f65475f)) * 31) + this.f65476g.hashCode();
    }

    public final int j() {
        return this.f65470a;
    }

    @m80.k
    public final String k() {
        return this.f65472c;
    }

    @m80.k
    public final String l() {
        return this.f65471b;
    }

    @m80.k
    public final r m() {
        return this.f65476g;
    }

    @m80.k
    public final String n() {
        return this.f65473d;
    }

    public final boolean o() {
        return this.f65475f;
    }

    public final int p() {
        return this.f65474e;
    }

    @m80.k
    public String toString() {
        return "BookModel(bookId=" + this.f65470a + ", bookName=" + this.f65471b + ", bookImg=" + this.f65472c + ", desc=" + this.f65473d + ", wordCount=" + this.f65474e + ", hasAdd=" + this.f65475f + ", bookType=" + this.f65476g + ')';
    }
}
