package p10;

import e30.u1;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a implements c1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final c1 f78549a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final h f78550b;

    /* renamed from: c, reason: collision with root package name */
    public final int f78551c;

    public a(@m80.k c1 originalDescriptor, @m80.k h declarationDescriptor, int i11) {
        kotlin.jvm.internal.g0.p(originalDescriptor, "originalDescriptor");
        kotlin.jvm.internal.g0.p(declarationDescriptor, "declarationDescriptor");
        this.f78549a = originalDescriptor;
        this.f78550b = declarationDescriptor;
        this.f78551c = i11;
    }

    @Override // p10.c1
    public boolean G() {
        return true;
    }

    @Override // p10.i, p10.h
    @m80.k
    public h b() {
        return this.f78550b;
    }

    @Override // p10.c1
    @m80.k
    public d30.n e0() {
        d30.n e02 = this.f78549a.e0();
        kotlin.jvm.internal.g0.o(e02, "getStorageManager(...)");
        return e02;
    }

    @Override // q10.a
    @m80.k
    public q10.g getAnnotations() {
        return this.f78549a.getAnnotations();
    }

    @Override // p10.c1
    public int getIndex() {
        return this.f78551c + this.f78549a.getIndex();
    }

    @Override // p10.c0
    @m80.k
    public n20.f getName() {
        n20.f name = this.f78549a.getName();
        kotlin.jvm.internal.g0.o(name, "getName(...)");
        return name;
    }

    @Override // p10.k
    @m80.k
    public x0 getSource() {
        x0 source = this.f78549a.getSource();
        kotlin.jvm.internal.g0.o(source, "getSource(...)");
        return source;
    }

    @Override // p10.c1
    @m80.k
    public List<e30.r0> getUpperBounds() {
        List<e30.r0> upperBounds = this.f78549a.getUpperBounds();
        kotlin.jvm.internal.g0.o(upperBounds, "getUpperBounds(...)");
        return upperBounds;
    }

    @Override // p10.c1
    public boolean h() {
        return this.f78549a.h();
    }

    @Override // p10.c1
    @m80.k
    public Variance j() {
        Variance j11 = this.f78549a.j();
        kotlin.jvm.internal.g0.o(j11, "getVariance(...)");
        return j11;
    }

    @Override // p10.c1, p10.d
    @m80.k
    public u1 o() {
        u1 o11 = this.f78549a.o();
        kotlin.jvm.internal.g0.o(o11, "getTypeConstructor(...)");
        return o11;
    }

    @Override // p10.d
    @m80.k
    public e30.c1 s() {
        e30.c1 s11 = this.f78549a.s();
        kotlin.jvm.internal.g0.o(s11, "getDefaultType(...)");
        return s11;
    }

    @m80.k
    public String toString() {
        return this.f78549a + "[inner-copy]";
    }

    @Override // p10.h
    public <R, D> R y(j<R, D> jVar, D d11) {
        return (R) this.f78549a.y(jVar, d11);
    }

    @Override // p10.h
    @m80.k
    public c1 a() {
        c1 a11 = this.f78549a.a();
        kotlin.jvm.internal.g0.o(a11, "getOriginal(...)");
        return a11;
    }
}
