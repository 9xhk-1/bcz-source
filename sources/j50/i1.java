package j50;

import h50.n;
import java.lang.annotation.Annotation;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.f
@kotlin.jvm.internal.u0({"SMAP\nCollectionDescriptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionDescriptors.kt\nkotlinx/serialization/internal/ListLikeDescriptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n1#2:139\n*E\n"})
/* loaded from: classes8.dex */
public abstract class i1 implements h50.f {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final h50.f f63382a;

    /* renamed from: b, reason: collision with root package name */
    public final int f63383b;

    public /* synthetic */ i1(h50.f fVar, kotlin.jvm.internal.v vVar) {
        this(fVar);
    }

    @m80.k
    public final h50.f a() {
        return this.f63382a;
    }

    @Override // h50.f
    public boolean b() {
        return super.b();
    }

    @Override // h50.f
    public int d(@m80.k String name) {
        kotlin.jvm.internal.g0.p(name, "name");
        Integer p12 = u30.e0.p1(name);
        if (p12 != null) {
            return p12.intValue();
        }
        throw new IllegalArgumentException(name + " is not a valid list index");
    }

    @Override // h50.f
    @m80.k
    public h50.f e(int i11) {
        if (i11 >= 0) {
            return this.f63382a;
        }
        throw new IllegalArgumentException(("Illegal index " + i11 + org.junit.jupiter.api.j2.O + k() + " expects only non-negative indices").toString());
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return kotlin.jvm.internal.g0.g(this.f63382a, i1Var.f63382a) && kotlin.jvm.internal.g0.g(k(), i1Var.k());
    }

    @Override // h50.f
    @m80.k
    public List<Annotation> getAnnotations() {
        return super.getAnnotations();
    }

    @Override // h50.f
    @m80.k
    public h50.m getKind() {
        return n.b.f58542a;
    }

    @Override // h50.f
    public int h() {
        return this.f63383b;
    }

    public int hashCode() {
        return (this.f63382a.hashCode() * 31) + k().hashCode();
    }

    @Override // h50.f
    @m80.k
    public String i(int i11) {
        return String.valueOf(i11);
    }

    @Override // h50.f
    public boolean isInline() {
        return super.isInline();
    }

    @Override // h50.f
    @m80.k
    public List<Annotation> j(int i11) {
        if (i11 >= 0) {
            return a00.h0.J();
        }
        throw new IllegalArgumentException(("Illegal index " + i11 + org.junit.jupiter.api.j2.O + k() + " expects only non-negative indices").toString());
    }

    @Override // h50.f
    public boolean l(int i11) {
        if (i11 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i11 + org.junit.jupiter.api.j2.O + k() + " expects only non-negative indices").toString());
    }

    @m80.k
    public String toString() {
        return k() + '(' + this.f63382a + ')';
    }

    public i1(h50.f fVar) {
        this.f63382a = fVar;
        this.f63383b = 1;
    }
}
