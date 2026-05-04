package j50;

import java.lang.annotation.Annotation;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c1 implements h10.r {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final h10.r f63340a;

    public c1(@m80.k h10.r origin) {
        kotlin.jvm.internal.g0.p(origin, "origin");
        this.f63340a = origin;
    }

    @Override // h10.r
    public boolean e() {
        return this.f63340a.e();
    }

    public boolean equals(@m80.l Object obj) {
        if (obj == null) {
            return false;
        }
        h10.r rVar = this.f63340a;
        c1 c1Var = obj instanceof c1 ? (c1) obj : null;
        if (!kotlin.jvm.internal.g0.g(rVar, c1Var != null ? c1Var.f63340a : null)) {
            return false;
        }
        h10.g m11 = m();
        if (m11 instanceof h10.d) {
            h10.r rVar2 = obj instanceof h10.r ? (h10.r) obj : null;
            h10.g m12 = rVar2 != null ? rVar2.m() : null;
            if (m12 != null && (m12 instanceof h10.d)) {
                return kotlin.jvm.internal.g0.g(w00.b.d((h10.d) m11), w00.b.d((h10.d) m12));
            }
        }
        return false;
    }

    @Override // h10.b
    @m80.k
    public List<Annotation> getAnnotations() {
        return this.f63340a.getAnnotations();
    }

    @Override // h10.r
    @m80.k
    public List<h10.t> getArguments() {
        return this.f63340a.getArguments();
    }

    public int hashCode() {
        return this.f63340a.hashCode();
    }

    @Override // h10.r
    @m80.l
    public h10.g m() {
        return this.f63340a.m();
    }

    @m80.k
    public String toString() {
        return "KTypeWrapper: " + this.f63340a;
    }
}
