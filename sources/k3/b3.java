package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class b3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f65236a;

    /* renamed from: b, reason: collision with root package name */
    public final int f65237b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final c f65238c;

    public b3(int i11, int i12, @m80.k c action) {
        kotlin.jvm.internal.g0.p(action, "action");
        this.f65236a = i11;
        this.f65237b = i12;
        this.f65238c = action;
    }

    public static /* synthetic */ b3 e(b3 b3Var, int i11, int i12, c cVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = b3Var.f65236a;
        }
        if ((i13 & 2) != 0) {
            i12 = b3Var.f65237b;
        }
        if ((i13 & 4) != 0) {
            cVar = b3Var.f65238c;
        }
        return b3Var.d(i11, i12, cVar);
    }

    public final int a() {
        return this.f65236a;
    }

    public final int b() {
        return this.f65237b;
    }

    @m80.k
    public final c c() {
        return this.f65238c;
    }

    @m80.k
    public final b3 d(int i11, int i12, @m80.k c action) {
        kotlin.jvm.internal.g0.p(action, "action");
        return new b3(i11, i12, action);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3)) {
            return false;
        }
        b3 b3Var = (b3) obj;
        return this.f65236a == b3Var.f65236a && this.f65237b == b3Var.f65237b && kotlin.jvm.internal.g0.g(this.f65238c, b3Var.f65238c);
    }

    @m80.k
    public final c f() {
        return this.f65238c;
    }

    public final int g() {
        return this.f65237b;
    }

    public final int h() {
        return this.f65236a;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f65236a) * 31) + Integer.hashCode(this.f65237b)) * 31) + this.f65238c.hashCode();
    }

    @m80.k
    public String toString() {
        return "StudyModel(numerator=" + this.f65236a + ", denominator=" + this.f65237b + ", action=" + this.f65238c + ')';
    }
}
