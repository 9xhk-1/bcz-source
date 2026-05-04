package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f65477a;

    /* renamed from: b, reason: collision with root package name */
    public final int f65478b;

    public o0(long j11, int i11) {
        this.f65477a = j11;
        this.f65478b = i11;
    }

    public static /* synthetic */ o0 d(o0 o0Var, long j11, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = o0Var.f65477a;
        }
        if ((i12 & 2) != 0) {
            i11 = o0Var.f65478b;
        }
        return o0Var.c(j11, i11);
    }

    public final long a() {
        return this.f65477a;
    }

    public final int b() {
        return this.f65478b;
    }

    @m80.k
    public final o0 c(long j11, int i11) {
        return new o0(j11, i11);
    }

    public final long e() {
        return this.f65477a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return this.f65477a == o0Var.f65477a && this.f65478b == o0Var.f65478b;
    }

    public final int f() {
        return this.f65478b;
    }

    public int hashCode() {
        return (Long.hashCode(this.f65477a) * 31) + Integer.hashCode(this.f65478b);
    }

    @m80.k
    public String toString() {
        return "FavoritePlanInfo(bookId=" + this.f65477a + ", planCount=" + this.f65478b + ')';
    }

    public /* synthetic */ o0(long j11, int i11, int i12, kotlin.jvm.internal.v vVar) {
        this(j11, (i12 & 2) != 0 ? 0 : i11);
    }
}
