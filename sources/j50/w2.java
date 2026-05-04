package j50;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class w2 implements h50.f, n {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final h50.f f63499a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f63500b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final Set<String> f63501c;

    public w2(@m80.k h50.f original) {
        kotlin.jvm.internal.g0.p(original, "original");
        this.f63499a = original;
        this.f63500b = original.k() + s60.d.f88057a;
        this.f63501c = g2.a(original);
    }

    @Override // j50.n
    @m80.k
    public Set<String> a() {
        return this.f63501c;
    }

    @Override // h50.f
    public boolean b() {
        return true;
    }

    @Override // h50.f
    public int d(@m80.k String name) {
        kotlin.jvm.internal.g0.p(name, "name");
        return this.f63499a.d(name);
    }

    @Override // h50.f
    @m80.k
    public h50.f e(int i11) {
        return this.f63499a.e(i11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w2) && kotlin.jvm.internal.g0.g(this.f63499a, ((w2) obj).f63499a);
    }

    @Override // h50.f
    @m80.k
    public List<Annotation> getAnnotations() {
        return this.f63499a.getAnnotations();
    }

    @Override // h50.f
    @m80.k
    public h50.m getKind() {
        return this.f63499a.getKind();
    }

    @Override // h50.f
    public int h() {
        return this.f63499a.h();
    }

    public int hashCode() {
        return this.f63499a.hashCode() * 31;
    }

    @Override // h50.f
    @m80.k
    public String i(int i11) {
        return this.f63499a.i(i11);
    }

    @Override // h50.f
    public boolean isInline() {
        return this.f63499a.isInline();
    }

    @Override // h50.f
    @m80.k
    public List<Annotation> j(int i11) {
        return this.f63499a.j(i11);
    }

    @Override // h50.f
    @m80.k
    public String k() {
        return this.f63500b;
    }

    @Override // h50.f
    public boolean l(int i11) {
        return this.f63499a.l(i11);
    }

    @m80.k
    public final h50.f m() {
        return this.f63499a;
    }

    @m80.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f63499a);
        sb2.append(s60.d.f88057a);
        return sb2.toString();
    }
}
