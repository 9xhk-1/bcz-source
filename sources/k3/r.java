package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f65566a;

    public r(int i11) {
        this.f65566a = i11;
    }

    public static /* synthetic */ r c(r rVar, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = rVar.f65566a;
        }
        return rVar.b(i11);
    }

    public final int a() {
        return this.f65566a;
    }

    @m80.k
    public final r b(int i11) {
        return new r(i11);
    }

    public final boolean d() {
        return (this.f65566a & 1) == 1;
    }

    public final boolean e() {
        return (this.f65566a & 2) == 2;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && this.f65566a == ((r) obj).f65566a;
    }

    public final boolean f() {
        return (this.f65566a & 4) == 4;
    }

    public int hashCode() {
        return Integer.hashCode(this.f65566a);
    }

    @m80.k
    public String toString() {
        return "BookType(bookFlag=" + this.f65566a + ')';
    }
}
