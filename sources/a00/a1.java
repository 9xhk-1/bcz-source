package a00;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a1<T> {

    /* renamed from: a, reason: collision with root package name */
    public final int f1080a;

    /* renamed from: b, reason: collision with root package name */
    public final T f1081b;

    public a1(int i11, T t11) {
        this.f1080a = i11;
        this.f1081b = t11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a1 d(a1 a1Var, int i11, Object obj, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            i11 = a1Var.f1080a;
        }
        if ((i12 & 2) != 0) {
            obj = a1Var.f1081b;
        }
        return a1Var.c(i11, obj);
    }

    public final int a() {
        return this.f1080a;
    }

    public final T b() {
        return this.f1081b;
    }

    @m80.k
    public final a1<T> c(int i11, T t11) {
        return new a1<>(i11, t11);
    }

    public final int e() {
        return this.f1080a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return this.f1080a == a1Var.f1080a && kotlin.jvm.internal.g0.g(this.f1081b, a1Var.f1081b);
    }

    public final T f() {
        return this.f1081b;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f1080a) * 31;
        T t11 = this.f1081b;
        return hashCode + (t11 == null ? 0 : t11.hashCode());
    }

    @m80.k
    public String toString() {
        return "IndexedValue(index=" + this.f1080a + ", value=" + this.f1081b + ')';
    }
}
