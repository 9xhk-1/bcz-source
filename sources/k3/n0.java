package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f65457a;

    /* renamed from: b, reason: collision with root package name */
    public final int f65458b;

    public n0(int i11, int i12) {
        this.f65457a = i11;
        this.f65458b = i12;
    }

    public static /* synthetic */ n0 d(n0 n0Var, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = n0Var.f65457a;
        }
        if ((i13 & 2) != 0) {
            i12 = n0Var.f65458b;
        }
        return n0Var.c(i11, i12);
    }

    public final int a() {
        return this.f65457a;
    }

    public final int b() {
        return this.f65458b;
    }

    @m80.k
    public final n0 c(int i11, int i12) {
        return new n0(i11, i12);
    }

    public final int e() {
        return this.f65458b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.f65457a == n0Var.f65457a && this.f65458b == n0Var.f65458b;
    }

    public final int f() {
        return this.f65457a;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f65457a) * 31) + Integer.hashCode(this.f65458b);
    }

    @m80.k
    public String toString() {
        return "ExportWordModel(topicId=" + this.f65457a + ", bookId=" + this.f65458b + ')';
    }
}
