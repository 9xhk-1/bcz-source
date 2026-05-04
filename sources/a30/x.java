package a30;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class x<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f1875a;

    /* renamed from: b, reason: collision with root package name */
    public final T f1876b;

    /* renamed from: c, reason: collision with root package name */
    public final T f1877c;

    /* renamed from: d, reason: collision with root package name */
    public final T f1878d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final String f1879e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final n20.b f1880f;

    public x(T t11, T t12, T t13, T t14, @m80.k String filePath, @m80.k n20.b classId) {
        kotlin.jvm.internal.g0.p(filePath, "filePath");
        kotlin.jvm.internal.g0.p(classId, "classId");
        this.f1875a = t11;
        this.f1876b = t12;
        this.f1877c = t13;
        this.f1878d = t14;
        this.f1879e = filePath;
        this.f1880f = classId;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return kotlin.jvm.internal.g0.g(this.f1875a, xVar.f1875a) && kotlin.jvm.internal.g0.g(this.f1876b, xVar.f1876b) && kotlin.jvm.internal.g0.g(this.f1877c, xVar.f1877c) && kotlin.jvm.internal.g0.g(this.f1878d, xVar.f1878d) && kotlin.jvm.internal.g0.g(this.f1879e, xVar.f1879e) && kotlin.jvm.internal.g0.g(this.f1880f, xVar.f1880f);
    }

    public int hashCode() {
        T t11 = this.f1875a;
        int hashCode = (t11 == null ? 0 : t11.hashCode()) * 31;
        T t12 = this.f1876b;
        int hashCode2 = (hashCode + (t12 == null ? 0 : t12.hashCode())) * 31;
        T t13 = this.f1877c;
        int hashCode3 = (hashCode2 + (t13 == null ? 0 : t13.hashCode())) * 31;
        T t14 = this.f1878d;
        return ((((hashCode3 + (t14 != null ? t14.hashCode() : 0)) * 31) + this.f1879e.hashCode()) * 31) + this.f1880f.hashCode();
    }

    @m80.k
    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f1875a + ", compilerVersion=" + this.f1876b + ", languageVersion=" + this.f1877c + ", expectedVersion=" + this.f1878d + ", filePath=" + this.f1879e + ", classId=" + this.f1880f + ')';
    }
}
