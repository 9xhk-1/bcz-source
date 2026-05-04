package j50;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class t2 implements h50.f {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f63469a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final h50.e f63470b;

    public t2(@m80.k String serialName, @m80.k h50.e kind) {
        kotlin.jvm.internal.g0.p(serialName, "serialName");
        kotlin.jvm.internal.g0.p(kind, "kind");
        this.f63469a = serialName;
        this.f63470b = kind;
    }

    private final Void a() {
        throw new IllegalStateException("Primitive descriptor " + k() + " does not have elements");
    }

    @Override // h50.f
    public boolean b() {
        return super.b();
    }

    @Override // h50.f
    public int d(@m80.k String name) {
        kotlin.jvm.internal.g0.p(name, "name");
        a();
        throw new KotlinNothingValueException();
    }

    @Override // h50.f
    @m80.k
    public h50.f e(int i11) {
        a();
        throw new KotlinNothingValueException();
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2)) {
            return false;
        }
        t2 t2Var = (t2) obj;
        return kotlin.jvm.internal.g0.g(k(), t2Var.k()) && kotlin.jvm.internal.g0.g(getKind(), t2Var.getKind());
    }

    @Override // h50.f
    @m80.k
    public List<Annotation> getAnnotations() {
        return super.getAnnotations();
    }

    @Override // h50.f
    public int h() {
        return 0;
    }

    public int hashCode() {
        return k().hashCode() + (getKind().hashCode() * 31);
    }

    @Override // h50.f
    @m80.k
    public String i(int i11) {
        a();
        throw new KotlinNothingValueException();
    }

    @Override // h50.f
    public boolean isInline() {
        return super.isInline();
    }

    @Override // h50.f
    @m80.k
    public List<Annotation> j(int i11) {
        a();
        throw new KotlinNothingValueException();
    }

    @Override // h50.f
    @m80.k
    public String k() {
        return this.f63469a;
    }

    @Override // h50.f
    public boolean l(int i11) {
        a();
        throw new KotlinNothingValueException();
    }

    @Override // h50.f
    @m80.k
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public h50.e getKind() {
        return this.f63470b;
    }

    @m80.k
    public String toString() {
        return "PrimitiveDescriptor(" + k() + ')';
    }
}
