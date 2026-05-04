package ku;

import com.baicizhan.client.business.widget.EmailAutoCompleteEditText;
import com.typesafe.config.ConfigException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import ku.d;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final y0 f68866a;

    /* renamed from: b, reason: collision with root package name */
    public final com.typesafe.config.b f68867b;

    /* renamed from: c, reason: collision with root package name */
    public final s0 f68868c;

    /* renamed from: d, reason: collision with root package name */
    public final List<d> f68869d;

    /* renamed from: e, reason: collision with root package name */
    public final Set<d> f68870e;

    public x0(y0 y0Var, com.typesafe.config.b bVar, s0 s0Var, List<d> list, Set<d> set) {
        this.f68866a = y0Var;
        this.f68867b = bVar;
        this.f68868c = s0Var;
        this.f68869d = list;
        this.f68870e = set;
    }

    public static Set<d> e() {
        return Collections.newSetFromMap(new IdentityHashMap());
    }

    public static d k(d dVar, c cVar, com.typesafe.config.b bVar) {
        try {
            return new x0(bVar, null).l(dVar, new a1(cVar)).f68888b;
        } catch (d.c e11) {
            throw new ConfigException.BugOrBroken("NotPossibleToResolve was thrown from an outermost resolve", e11);
        }
    }

    public x0 a(d dVar) {
        if (p.O()) {
            p.L(b(), "++ Cycle marker " + dVar + EmailAutoCompleteEditText.f17091d + System.identityHashCode(dVar));
        }
        if (this.f68870e.contains(dVar)) {
            throw new ConfigException.BugOrBroken("Added cycle marker twice " + dVar);
        }
        Set<d> e11 = e();
        e11.addAll(this.f68870e);
        e11.add(dVar);
        return new x0(this.f68866a, this.f68867b, this.f68868c, this.f68869d, e11);
    }

    public int b() {
        if (this.f68869d.size() <= 30) {
            return this.f68869d.size();
        }
        throw new ConfigException.BugOrBroken("resolve getting too deep");
    }

    public boolean c() {
        return this.f68868c != null;
    }

    public final x0 d(o0 o0Var, d dVar) {
        return new x0(this.f68866a.b(o0Var, dVar), this.f68867b, this.f68868c, this.f68869d, this.f68870e);
    }

    public com.typesafe.config.b f() {
        return this.f68867b;
    }

    public x0 g() {
        ArrayList arrayList = new ArrayList(this.f68869d);
        d dVar = (d) arrayList.remove(this.f68869d.size() - 1);
        if (p.O()) {
            p.L(b() - 1, "popped trace " + dVar);
        }
        return new x0(this.f68866a, this.f68867b, this.f68868c, arrayList, this.f68870e);
    }

    public final x0 h(d dVar) {
        if (p.O()) {
            p.L(b(), "pushing trace " + dVar);
        }
        ArrayList arrayList = new ArrayList(this.f68869d);
        arrayList.add(dVar);
        return new x0(this.f68866a, this.f68867b, this.f68868c, arrayList, this.f68870e);
    }

    public final z0<? extends d> i(d dVar, a1 a1Var) throws d.c {
        x0 d11;
        o0 o0Var = null;
        o0 o0Var2 = new o0(dVar, null);
        d a11 = this.f68866a.a(o0Var2);
        if (a11 == null && c()) {
            o0Var = new o0(dVar, n());
            a11 = this.f68866a.a(o0Var);
        }
        if (a11 != null) {
            if (p.O()) {
                p.L(b(), "using cached resolution " + a11 + " for " + dVar + " restrictToChild " + n());
            }
            return z0.c(this, a11);
        }
        if (p.O()) {
            p.L(b(), "not found in cache, resolving " + dVar + EmailAutoCompleteEditText.f17091d + System.identityHashCode(dVar));
        }
        if (this.f68870e.contains(dVar)) {
            if (p.O()) {
                p.L(b(), "Cycle detected, can't resolve; " + dVar + EmailAutoCompleteEditText.f17091d + System.identityHashCode(dVar));
            }
            throw new d.c(this);
        }
        z0<? extends d> O0 = dVar.O0(this, a1Var);
        d dVar2 = O0.f68888b;
        if (p.O()) {
            p.L(b(), "resolved to " + dVar2 + EmailAutoCompleteEditText.f17091d + System.identityHashCode(dVar2) + " from " + dVar + EmailAutoCompleteEditText.f17091d + System.identityHashCode(dVar2));
        }
        x0 x0Var = O0.f68887a;
        if (dVar2 == null || dVar2.N0() == b1.RESOLVED) {
            if (p.O()) {
                p.L(b(), "caching " + o0Var2 + " result " + dVar2);
            }
            d11 = x0Var.d(o0Var2, dVar2);
        } else if (c()) {
            if (o0Var == null) {
                throw new ConfigException.BugOrBroken("restrictedKey should not be null here");
            }
            if (p.O()) {
                p.L(b(), "caching " + o0Var + " result " + dVar2);
            }
            d11 = x0Var.d(o0Var, dVar2);
        } else {
            if (!f().c()) {
                throw new ConfigException.BugOrBroken("resolveSubstitutions() did not give us a resolved object");
            }
            if (p.O()) {
                p.L(b(), "caching " + o0Var2 + " result " + dVar2);
            }
            d11 = x0Var.d(o0Var2, dVar2);
        }
        return z0.c(d11, dVar2);
    }

    public x0 j(d dVar) {
        if (p.O()) {
            p.L(b(), "-- Cycle marker " + dVar + EmailAutoCompleteEditText.f17091d + System.identityHashCode(dVar));
        }
        Set<d> e11 = e();
        e11.addAll(this.f68870e);
        e11.remove(dVar);
        return new x0(this.f68866a, this.f68867b, this.f68868c, this.f68869d, e11);
    }

    public z0<? extends d> l(d dVar, a1 a1Var) throws d.c {
        if (p.O()) {
            p.L(b(), "resolving " + dVar + " restrictToChild=" + this.f68868c + " in " + a1Var);
        }
        return h(dVar).i(dVar, a1Var).d();
    }

    public x0 m(s0 s0Var) {
        return s0Var == this.f68868c ? this : new x0(this.f68866a, this.f68867b, s0Var, this.f68869d, this.f68870e);
    }

    public s0 n() {
        return this.f68868c;
    }

    public String o() {
        StringBuilder sb2 = new StringBuilder();
        for (d dVar : this.f68869d) {
            if (dVar instanceof i0) {
                sb2.append(((i0) dVar).U0().toString());
                sb2.append(j2.O);
            }
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 2);
        }
        return sb2.toString();
    }

    public x0 p() {
        return m(null);
    }

    public x0(com.typesafe.config.b bVar, s0 s0Var) {
        this(new y0(), bVar, s0Var, new ArrayList(), e());
        if (p.O()) {
            p.L(b(), "ResolveContext restrict to child " + s0Var);
        }
    }
}
