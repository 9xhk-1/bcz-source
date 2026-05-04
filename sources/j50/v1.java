package j50;

import h50.n;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class v1 implements h50.f {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final v1 f63482a = new v1();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final h50.m f63483b = n.d.f58544a;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final String f63484c = "kotlin.Nothing";

    public final Void a() {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
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
        return this == obj;
    }

    @Override // h50.f
    @m80.k
    public List<Annotation> getAnnotations() {
        return super.getAnnotations();
    }

    @Override // h50.f
    @m80.k
    public h50.m getKind() {
        return f63483b;
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
        return f63484c;
    }

    @Override // h50.f
    public boolean l(int i11) {
        a();
        throw new KotlinNothingValueException();
    }

    @m80.k
    public String toString() {
        return "NothingSerialDescriptor";
    }
}
