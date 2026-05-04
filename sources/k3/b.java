package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f65223a;

    /* renamed from: b, reason: collision with root package name */
    public final int f65224b;

    public b(int i11, int i12) {
        this.f65223a = i11;
        this.f65224b = i12;
    }

    public static /* synthetic */ b d(b bVar, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = bVar.f65223a;
        }
        if ((i13 & 2) != 0) {
            i12 = bVar.f65224b;
        }
        return bVar.c(i11, i12);
    }

    public final int a() {
        return this.f65223a;
    }

    public final int b() {
        return this.f65224b;
    }

    @m80.k
    public final b c(int i11, int i12) {
        return new b(i11, i12);
    }

    public final int e() {
        return this.f65223a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f65223a == bVar.f65223a && this.f65224b == bVar.f65224b;
    }

    public final int f() {
        return this.f65224b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f65223a) * 31) + Integer.hashCode(this.f65224b);
    }

    @m80.k
    public String toString() {
        return "Achievement(days=" + this.f65223a + ", words=" + this.f65224b + ')';
    }
}
