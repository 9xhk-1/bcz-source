package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class t3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f65621a;

    /* renamed from: b, reason: collision with root package name */
    public final int f65622b;

    /* renamed from: c, reason: collision with root package name */
    public final int f65623c;

    /* renamed from: d, reason: collision with root package name */
    public final int f65624d;

    public t3(int i11, int i12, int i13, int i14) {
        this.f65621a = i11;
        this.f65622b = i12;
        this.f65623c = i13;
        this.f65624d = i14;
    }

    public static /* synthetic */ t3 f(t3 t3Var, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = t3Var.f65621a;
        }
        if ((i15 & 2) != 0) {
            i12 = t3Var.f65622b;
        }
        if ((i15 & 4) != 0) {
            i13 = t3Var.f65623c;
        }
        if ((i15 & 8) != 0) {
            i14 = t3Var.f65624d;
        }
        return t3Var.e(i11, i12, i13, i14);
    }

    public final int a() {
        return this.f65621a;
    }

    public final int b() {
        return this.f65622b;
    }

    public final int c() {
        return this.f65623c;
    }

    public final int d() {
        return this.f65624d;
    }

    @m80.k
    public final t3 e(int i11, int i12, int i13, int i14) {
        return new t3(i11, i12, i13, i14);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3)) {
            return false;
        }
        t3 t3Var = (t3) obj;
        return this.f65621a == t3Var.f65621a && this.f65622b == t3Var.f65622b && this.f65623c == t3Var.f65623c && this.f65624d == t3Var.f65624d;
    }

    public final int g() {
        return this.f65623c;
    }

    public final int h() {
        return this.f65622b;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f65621a) * 31) + Integer.hashCode(this.f65622b)) * 31) + Integer.hashCode(this.f65623c)) * 31) + Integer.hashCode(this.f65624d);
    }

    public final int i() {
        return this.f65624d;
    }

    public final int j() {
        return this.f65621a;
    }

    @m80.k
    public String toString() {
        return "UserDakaDate(year=" + this.f65621a + ", month=" + this.f65622b + ", day=" + this.f65623c + ", timestamp=" + this.f65624d + ')';
    }
}
