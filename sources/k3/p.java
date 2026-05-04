package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final o f65515a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f65516b;

    /* renamed from: c, reason: collision with root package name */
    public final int f65517c;

    /* renamed from: d, reason: collision with root package name */
    public final int f65518d;

    /* renamed from: e, reason: collision with root package name */
    public final int f65519e;

    /* renamed from: f, reason: collision with root package name */
    public final int f65520f;

    public p(@m80.k o bookModel, boolean z11, int i11, int i12, int i13, int i14) {
        kotlin.jvm.internal.g0.p(bookModel, "bookModel");
        this.f65515a = bookModel;
        this.f65516b = z11;
        this.f65517c = i11;
        this.f65518d = i12;
        this.f65519e = i13;
        this.f65520f = i14;
    }

    public static /* synthetic */ p h(p pVar, o oVar, boolean z11, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            oVar = pVar.f65515a;
        }
        if ((i15 & 2) != 0) {
            z11 = pVar.f65516b;
        }
        if ((i15 & 4) != 0) {
            i11 = pVar.f65517c;
        }
        if ((i15 & 8) != 0) {
            i12 = pVar.f65518d;
        }
        if ((i15 & 16) != 0) {
            i13 = pVar.f65519e;
        }
        if ((i15 & 32) != 0) {
            i14 = pVar.f65520f;
        }
        int i16 = i13;
        int i17 = i14;
        return pVar.g(oVar, z11, i11, i12, i16, i17);
    }

    @m80.k
    public final o a() {
        return this.f65515a;
    }

    public final boolean b() {
        return this.f65516b;
    }

    public final int c() {
        return this.f65517c;
    }

    public final int d() {
        return this.f65518d;
    }

    public final int e() {
        return this.f65519e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.g0.g(this.f65515a, pVar.f65515a) && this.f65516b == pVar.f65516b && this.f65517c == pVar.f65517c && this.f65518d == pVar.f65518d && this.f65519e == pVar.f65519e && this.f65520f == pVar.f65520f;
    }

    public final int f() {
        return this.f65520f;
    }

    @m80.k
    public final p g(@m80.k o bookModel, boolean z11, int i11, int i12, int i13, int i14) {
        kotlin.jvm.internal.g0.p(bookModel, "bookModel");
        return new p(bookModel, z11, i11, i12, i13, i14);
    }

    public int hashCode() {
        return (((((((((this.f65515a.hashCode() * 31) + Boolean.hashCode(this.f65516b)) * 31) + Integer.hashCode(this.f65517c)) * 31) + Integer.hashCode(this.f65518d)) * 31) + Integer.hashCode(this.f65519e)) * 31) + Integer.hashCode(this.f65520f);
    }

    @m80.k
    public final o i() {
        return this.f65515a;
    }

    public final int j() {
        return this.f65520f;
    }

    public final int k() {
        return this.f65518d;
    }

    public final int l() {
        return this.f65519e;
    }

    public final int m() {
        return this.f65517c;
    }

    public final boolean n() {
        return this.f65516b;
    }

    @m80.k
    public String toString() {
        return "BookSchedule(bookModel=" + this.f65515a + ", isCurrent=" + this.f65516b + ", reviewCount=" + this.f65517c + ", learnCount=" + this.f65518d + ", masteredCount=" + this.f65519e + ", finishCount=" + this.f65520f + ')';
    }
}
