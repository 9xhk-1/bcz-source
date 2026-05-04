package ku;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigValueType;
import java.util.Collection;
import java.util.Collections;
import ku.a1;
import ku.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class i0 extends d implements f2 {

    /* renamed from: b, reason: collision with root package name */
    public final a2 f68733b;

    /* renamed from: c, reason: collision with root package name */
    public final int f68734c;

    public i0(ju.m mVar, a2 a2Var) {
        this(mVar, a2Var, 0);
    }

    private ConfigException.NotResolved W0() {
        return new ConfigException.NotResolved("need to Config#resolve(), see the API docs for Config#resolve(); substitution not resolved: " + this);
    }

    @Override // ku.f2
    public Collection<i0> A() {
        return Collections.singleton(this);
    }

    @Override // ku.d
    public void K0(StringBuilder sb2, int i11, boolean z11, ju.q qVar) {
        sb2.append(this.f68733b.toString());
    }

    @Override // ku.d
    public b1 N0() {
        return b1.UNRESOLVED;
    }

    @Override // ku.d
    public z0<? extends d> O0(x0 x0Var, a1 a1Var) {
        d dVar;
        x0 a11 = x0Var.a(this);
        try {
            a1.b d11 = a1Var.d(a11, this.f68733b, this.f68734c);
            z0<? extends d> z0Var = d11.f68605a;
            a11 = z0Var.f68887a;
            if (z0Var.f68888b != 0) {
                if (p.O()) {
                    p.L(a11.b(), "recursively resolving " + d11 + " which was the resolution of " + this.f68733b + " against " + a1Var);
                }
                a1 a1Var2 = new a1((c) d11.f68606b.b(), d11.f68606b);
                if (p.O()) {
                    p.L(a11.b(), "will recursively resolve against " + a1Var2);
                }
                z0<? extends d> l11 = a11.l(d11.f68605a.f68888b, a1Var2);
                dVar = l11.f68888b;
                a11 = l11.f68887a;
            } else {
                dVar = (V) x0Var.f().d().a(this.f68733b.c().k());
            }
        } catch (d.c e11) {
            if (p.O()) {
                p.L(a11.b(), "not possible to resolve " + this.f68733b + ", cycle involved: " + e11.a());
            }
            if (!this.f68733b.b()) {
                throw new ConfigException.UnresolvedSubstitution(g(), this.f68733b + " was part of a cycle of substitutions involving " + e11.a(), e11);
            }
            dVar = null;
        }
        if (dVar != null || this.f68733b.b()) {
            return z0.c(a11.j(this), dVar);
        }
        if (a11.f().c()) {
            return z0.c(a11.j(this), this);
        }
        throw new ConfigException.UnresolvedSubstitution(g(), this.f68733b.toString());
    }

    public a2 U0() {
        return this.f68733b;
    }

    @Override // ku.d
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public i0 G0(ju.m mVar) {
        return new i0(mVar, this.f68733b, this.f68734c);
    }

    @Override // ku.d
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public i0 I0(s0 s0Var) {
        a2 a2Var = this.f68733b;
        return new i0(g(), a2Var.a(a2Var.c().i(s0Var)), this.f68734c + s0Var.e());
    }

    @Override // ju.t
    public Object c() {
        throw W0();
    }

    @Override // ku.d
    public boolean equals(Object obj) {
        return (obj instanceof i0) && q0(obj) && this.f68733b.equals(((i0) obj).f68733b);
    }

    @Override // ku.d
    public int hashCode() {
        return this.f68733b.hashCode();
    }

    @Override // ku.d
    public boolean q0(Object obj) {
        return obj instanceof i0;
    }

    @Override // ju.t
    public ConfigValueType valueType() {
        throw W0();
    }

    @Override // ku.d
    public boolean w0() {
        return false;
    }

    public i0(ju.m mVar, a2 a2Var, int i11) {
        super(mVar);
        this.f68733b = a2Var;
        this.f68734c = i11;
    }
}
