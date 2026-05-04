package h50;

import j50.n2;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class o implements f {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f58545a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final f f58546b;

    public o(@m80.k String serialName, @m80.k f original) {
        g0.p(serialName, "serialName");
        g0.p(original, "original");
        this.f58545a = serialName;
        this.f58546b = original;
    }

    @Override // h50.f
    public boolean b() {
        return this.f58546b.b();
    }

    @Override // h50.f
    public int d(@m80.k String name) {
        g0.p(name, "name");
        return this.f58546b.d(name);
    }

    @Override // h50.f
    @m80.k
    public f e(int i11) {
        return this.f58546b.e(i11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return g0.g(k(), oVar.k()) && g0.g(this.f58546b, oVar.f58546b);
    }

    @Override // h50.f
    @m80.k
    public List<Annotation> getAnnotations() {
        return this.f58546b.getAnnotations();
    }

    @Override // h50.f
    @m80.k
    public m getKind() {
        return this.f58546b.getKind();
    }

    @Override // h50.f
    public int h() {
        return this.f58546b.h();
    }

    public int hashCode() {
        return (k().hashCode() * 31) + this.f58546b.hashCode();
    }

    @Override // h50.f
    @m80.k
    public String i(int i11) {
        return this.f58546b.i(i11);
    }

    @Override // h50.f
    public boolean isInline() {
        return this.f58546b.isInline();
    }

    @Override // h50.f
    @m80.k
    public List<Annotation> j(int i11) {
        return this.f58546b.j(i11);
    }

    @Override // h50.f
    @m80.k
    public String k() {
        return this.f58545a;
    }

    @Override // h50.f
    public boolean l(int i11) {
        return this.f58546b.l(i11);
    }

    @m80.k
    public String toString() {
        return n2.d(this);
    }
}
