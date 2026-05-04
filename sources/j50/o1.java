package j50;

import h50.n;
import java.lang.annotation.Annotation;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nCollectionDescriptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionDescriptors.kt\nkotlinx/serialization/internal/MapLikeDescriptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n1#2:139\n*E\n"})
/* loaded from: classes8.dex */
public abstract class o1 implements h50.f {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f63438a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final h50.f f63439b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final h50.f f63440c;

    /* renamed from: d, reason: collision with root package name */
    public final int f63441d;

    public /* synthetic */ o1(String str, h50.f fVar, h50.f fVar2, kotlin.jvm.internal.v vVar) {
        this(str, fVar, fVar2);
    }

    @m80.k
    public final h50.f a() {
        return this.f63439b;
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
        throw new IllegalArgumentException(name + " is not a valid map index");
    }

    @Override // h50.f
    @m80.k
    public h50.f e(int i11) {
        if (i11 >= 0) {
            int i12 = i11 % 2;
            if (i12 == 0) {
                return this.f63439b;
            }
            if (i12 == 1) {
                return this.f63440c;
            }
            throw new IllegalStateException("Unreached");
        }
        throw new IllegalArgumentException(("Illegal index " + i11 + org.junit.jupiter.api.j2.O + k() + " expects only non-negative indices").toString());
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return kotlin.jvm.internal.g0.g(k(), o1Var.k()) && kotlin.jvm.internal.g0.g(this.f63439b, o1Var.f63439b) && kotlin.jvm.internal.g0.g(this.f63440c, o1Var.f63440c);
    }

    @Override // h50.f
    @m80.k
    public List<Annotation> getAnnotations() {
        return super.getAnnotations();
    }

    @Override // h50.f
    @m80.k
    public h50.m getKind() {
        return n.c.f58543a;
    }

    @Override // h50.f
    public int h() {
        return this.f63441d;
    }

    public int hashCode() {
        return (((k().hashCode() * 31) + this.f63439b.hashCode()) * 31) + this.f63440c.hashCode();
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
    @m80.k
    public String k() {
        return this.f63438a;
    }

    @Override // h50.f
    public boolean l(int i11) {
        if (i11 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i11 + org.junit.jupiter.api.j2.O + k() + " expects only non-negative indices").toString());
    }

    @m80.k
    public final h50.f m() {
        return this.f63440c;
    }

    @m80.k
    public String toString() {
        return k() + '(' + this.f63439b + org.junit.jupiter.api.j2.O + this.f63440c + ')';
    }

    public o1(String str, h50.f fVar, h50.f fVar2) {
        this.f63438a = str;
        this.f63439b = fVar;
        this.f63440c = fVar2;
        this.f63441d = 2;
    }
}
