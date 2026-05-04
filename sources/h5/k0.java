package h5;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f58363a;

    /* renamed from: b, reason: collision with root package name */
    public final int f58364b;

    /* renamed from: c, reason: collision with root package name */
    public final int f58365c;

    public k0(int i11, int i12, int i13) {
        this.f58363a = i11;
        this.f58364b = i12;
        this.f58365c = i13;
    }

    public static /* synthetic */ k0 e(k0 k0Var, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = k0Var.f58363a;
        }
        if ((i14 & 2) != 0) {
            i12 = k0Var.f58364b;
        }
        if ((i14 & 4) != 0) {
            i13 = k0Var.f58365c;
        }
        return k0Var.d(i11, i12, i13);
    }

    public final int a() {
        return this.f58363a;
    }

    public final int b() {
        return this.f58364b;
    }

    public final int c() {
        return this.f58365c;
    }

    @m80.k
    public final k0 d(int i11, int i12, int i13) {
        return new k0(i11, i12, i13);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.f58363a == k0Var.f58363a && this.f58364b == k0Var.f58364b && this.f58365c == k0Var.f58365c;
    }

    public final int f() {
        return this.f58364b;
    }

    public final int g() {
        return this.f58365c;
    }

    public final int h() {
        return this.f58363a;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f58363a) * 31) + Integer.hashCode(this.f58364b)) * 31) + Integer.hashCode(this.f58365c);
    }

    @m80.k
    public String toString() {
        return "SentenceLesson(unitId=" + this.f58363a + ", lessonId=" + this.f58364b + ", lessonType=" + this.f58365c + ')';
    }
}
