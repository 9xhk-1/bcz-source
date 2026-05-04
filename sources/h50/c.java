package h50;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.g0;
import u30.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final f f58506a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final h10.d<?> f58507b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f58508c;

    public c(@m80.k f original, @m80.k h10.d<?> kClass) {
        g0.p(original, "original");
        g0.p(kClass, "kClass");
        this.f58506a = original;
        this.f58507b = kClass;
        this.f58508c = original.k() + u0.f91709e + kClass.C() + u0.f91710f;
    }

    @Override // h50.f
    public boolean b() {
        return this.f58506a.b();
    }

    @Override // h50.f
    public int d(@m80.k String name) {
        g0.p(name, "name");
        return this.f58506a.d(name);
    }

    @Override // h50.f
    @m80.k
    public f e(int i11) {
        return this.f58506a.e(i11);
    }

    public boolean equals(@m80.l Object obj) {
        c cVar = obj instanceof c ? (c) obj : null;
        return cVar != null && g0.g(this.f58506a, cVar.f58506a) && g0.g(cVar.f58507b, this.f58507b);
    }

    @Override // h50.f
    @m80.k
    public List<Annotation> getAnnotations() {
        return this.f58506a.getAnnotations();
    }

    @Override // h50.f
    @m80.k
    public m getKind() {
        return this.f58506a.getKind();
    }

    @Override // h50.f
    public int h() {
        return this.f58506a.h();
    }

    public int hashCode() {
        return (this.f58507b.hashCode() * 31) + k().hashCode();
    }

    @Override // h50.f
    @m80.k
    public String i(int i11) {
        return this.f58506a.i(i11);
    }

    @Override // h50.f
    public boolean isInline() {
        return this.f58506a.isInline();
    }

    @Override // h50.f
    @m80.k
    public List<Annotation> j(int i11) {
        return this.f58506a.j(i11);
    }

    @Override // h50.f
    @m80.k
    public String k() {
        return this.f58508c;
    }

    @Override // h50.f
    public boolean l(int i11) {
        return this.f58506a.l(i11);
    }

    @m80.k
    public String toString() {
        return "ContextDescriptor(kClass: " + this.f58507b + ", original: " + this.f58506a + ')';
    }
}
