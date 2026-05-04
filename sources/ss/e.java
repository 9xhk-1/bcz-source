package ss;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class e<A, B> {

    /* renamed from: a, reason: collision with root package name */
    public final A f88930a;

    /* renamed from: b, reason: collision with root package name */
    public final B f88931b;

    public e(A a11, B b11) {
        this.f88930a = a11;
        this.f88931b = b11;
    }

    public static <A, B> e<A, B> c(A a11, B b11) {
        return new e<>(a11, b11);
    }

    public A a() {
        return this.f88930a;
    }

    public B b() {
        return this.f88931b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        A a11 = this.f88930a;
        if (a11 == null) {
            if (eVar.f88930a != null) {
                return false;
            }
        } else if (!a11.equals(eVar.f88930a)) {
            return false;
        }
        B b11 = this.f88931b;
        if (b11 == null) {
            if (eVar.f88931b != null) {
                return false;
            }
        } else if (!b11.equals(eVar.f88931b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        A a11 = this.f88930a;
        int hashCode = ((a11 == null ? 0 : a11.hashCode()) + 31) * 31;
        B b11 = this.f88931b;
        return hashCode + (b11 != null ? b11.hashCode() : 0);
    }
}
