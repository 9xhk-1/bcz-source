package ku;

import com.baicizhan.client.business.widget.EmailAutoCompleteEditText;
import com.typesafe.config.ConfigException;
import ku.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final ku.c f68601a;

    /* renamed from: b, reason: collision with root package name */
    public final a<k0> f68602b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final z0<? extends d> f68605a;

        /* renamed from: b, reason: collision with root package name */
        public final a<k0> f68606b;

        public b(z0<? extends d> z0Var, a<k0> aVar) {
            this.f68605a = z0Var;
            this.f68606b = aVar;
        }

        public String toString() {
            return "ResultWithPath(result=" + this.f68605a + ", pathFromRoot=" + this.f68606b + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final d f68607a;

        /* renamed from: b, reason: collision with root package name */
        public final a<k0> f68608b;

        public c(d dVar, a<k0> aVar) {
            this.f68607a = dVar;
            this.f68608b = aVar;
        }

        public String toString() {
            return "ValueWithPath(value=" + this.f68607a + ", pathFromRoot=" + this.f68608b + pn.j.f81007d;
        }
    }

    public a1(ku.c cVar, a<k0> aVar) {
        this.f68601a = cVar;
        this.f68602b = aVar;
    }

    public static b a(ku.c cVar, x0 x0Var, s0 s0Var) throws d.c {
        if (p.O()) {
            p.M("*** finding '" + s0Var + "' in " + cVar);
        }
        s0 n11 = x0Var.n();
        z0<? extends d> l11 = x0Var.m(s0Var).l(cVar, new a1(cVar));
        x0 m11 = l11.f68887a.m(n11);
        V v11 = l11.f68888b;
        if (v11 instanceof ku.c) {
            c b11 = b((ku.c) v11, s0Var);
            return new b(z0.c(m11, b11.f68607a), b11.f68608b);
        }
        throw new ConfigException.BugOrBroken("resolved object to non-object " + cVar + " to " + l11);
    }

    public static c b(ku.c cVar, s0 s0Var) {
        try {
            return c(cVar, s0Var, null);
        } catch (ConfigException.NotResolved e11) {
            throw p.v(s0Var, e11);
        }
    }

    public static c c(ku.c cVar, s0 s0Var, a<k0> aVar) {
        String b11 = s0Var.b();
        s0 j11 = s0Var.j();
        if (p.O()) {
            p.M("*** looking up '" + b11 + "' in " + cVar);
        }
        d U0 = cVar.U0(b11);
        a<k0> aVar2 = aVar == null ? new a<>(cVar) : aVar.c(cVar);
        return j11 == null ? new c(U0, aVar2) : U0 instanceof ku.c ? c((ku.c) U0, j11, aVar2) : new c(null, aVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a<k0> f(a<k0> aVar, k0 k0Var, d dVar) {
        k0 a11 = aVar.a();
        if (a11 != k0Var) {
            throw new ConfigException.BugOrBroken("Can only replace() the top node we're resolving; had " + a11 + " on top and tried to replace " + k0Var + " overall list was " + aVar);
        }
        k0 a12 = aVar.e() == null ? null : aVar.e().a();
        if (dVar == 0 || !(dVar instanceof k0)) {
            if (a12 == null) {
                return null;
            }
            return f(aVar.e(), a12, a12.B((d) k0Var, null));
        }
        if (a12 == null) {
            return new a<>((k0) dVar);
        }
        a<k0> f11 = f(aVar.e(), a12, a12.B((d) k0Var, dVar));
        return f11 != null ? f11.c((k0) dVar) : new a<>((k0) dVar);
    }

    public b d(x0 x0Var, a2 a2Var, int i11) throws d.c {
        if (p.O()) {
            p.L(x0Var.b(), "searching for " + a2Var);
        }
        if (p.O()) {
            p.L(x0Var.b(), a2Var + " - looking up relative to file it occurred in");
        }
        b a11 = a(this.f68601a, x0Var, a2Var.c());
        if (a11.f68605a.f68888b == 0) {
            s0 m11 = a2Var.c().m(i11);
            if (i11 > 0) {
                if (p.O()) {
                    p.L(a11.f68605a.f68887a.b(), m11 + " - looking up relative to parent file");
                }
                a11 = a(this.f68601a, a11.f68605a.f68887a, m11);
            }
            z0<? extends d> z0Var = a11.f68605a;
            if (z0Var.f68888b == 0 && z0Var.f68887a.f().e()) {
                if (p.O()) {
                    p.L(a11.f68605a.f68887a.b(), m11 + " - looking up in system environment");
                }
                a11 = a(p.o(), x0Var, m11);
            }
        }
        if (p.O()) {
            p.L(a11.f68605a.f68887a.b(), "resolved to " + a11);
        }
        return a11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a1 e(k0 k0Var) {
        if (k0Var == 0) {
            throw new ConfigException.BugOrBroken("can't push null parent");
        }
        if (p.O()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("pushing parent ");
            sb2.append(k0Var);
            sb2.append(" ==root ");
            sb2.append(k0Var == this.f68601a);
            sb2.append(" onto ");
            sb2.append(this);
            p.M(sb2.toString());
        }
        a<k0> aVar = this.f68602b;
        if (aVar != null) {
            k0 a11 = aVar.a();
            if (p.O() && a11 != null && !a11.C((d) k0Var)) {
                p.M("***** BUG ***** trying to push non-child of " + a11 + ", non-child was " + k0Var);
            }
            return new a1(this.f68601a, this.f68602b.c(k0Var));
        }
        ku.c cVar = this.f68601a;
        if (k0Var == cVar) {
            return new a1(cVar, new a(k0Var));
        }
        if (p.O() && this.f68601a.C((d) k0Var)) {
            p.M("***** BUG ***** tried to push parent " + k0Var + " without having a path to it in " + this);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a1 g(k0 k0Var, k0 k0Var2) {
        if (p.O()) {
            p.M("replaceCurrentParent old " + k0Var + EmailAutoCompleteEditText.f17091d + System.identityHashCode(k0Var) + " replacement " + k0Var2 + EmailAutoCompleteEditText.f17091d + System.identityHashCode(k0Var) + " in " + this);
        }
        if (k0Var == k0Var2) {
            return this;
        }
        a<k0> aVar = this.f68602b;
        if (aVar == null) {
            if (k0Var == this.f68601a) {
                return new a1(j(k0Var2));
            }
            throw new ConfigException.BugOrBroken("attempt to replace root " + this.f68601a + " with " + k0Var2);
        }
        a<k0> f11 = f(aVar, k0Var, (d) k0Var2);
        if (p.O()) {
            p.M("replaced " + k0Var + " with " + k0Var2 + " in " + this);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("path was: ");
            sb2.append(this.f68602b);
            sb2.append(" is now ");
            sb2.append(f11);
            p.M(sb2.toString());
        }
        return f11 != null ? new a1((ku.c) f11.b(), f11) : new a1(w1.u1());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a1 h(d dVar, d dVar2) {
        if (p.O()) {
            p.M("replaceWithinCurrentParent old " + dVar + EmailAutoCompleteEditText.f17091d + System.identityHashCode(dVar) + " replacement " + dVar2 + EmailAutoCompleteEditText.f17091d + System.identityHashCode(dVar) + " in " + this);
        }
        if (dVar == dVar2) {
            return this;
        }
        a<k0> aVar = this.f68602b;
        if (aVar != null) {
            k0 a11 = aVar.a();
            ju.t B = a11.B(dVar, dVar2);
            return g(a11, B instanceof k0 ? (k0) B : null);
        }
        if (dVar == this.f68601a && (dVar2 instanceof k0)) {
            return new a1(j((k0) dVar2));
        }
        throw new ConfigException.BugOrBroken("replace in parent not possible " + dVar + " with " + dVar2 + " in " + this);
    }

    public a1 i() {
        return this.f68602b == null ? this : new a1(this.f68601a);
    }

    public final ku.c j(k0 k0Var) {
        return k0Var instanceof ku.c ? (ku.c) k0Var : w1.u1();
    }

    public String toString() {
        return "ResolveSource(root=" + this.f68601a + ", pathFromRoot=" + this.f68602b + pn.j.f81007d;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f68603a;

        /* renamed from: b, reason: collision with root package name */
        public final a<T> f68604b;

        public a(T t11, a<T> aVar) {
            this.f68603a = t11;
            this.f68604b = aVar;
        }

        public T a() {
            return this.f68603a;
        }

        public T b() {
            a<T> aVar = this;
            while (true) {
                a<T> aVar2 = aVar.f68604b;
                if (aVar2 == null) {
                    return aVar.f68603a;
                }
                aVar = aVar2;
            }
        }

        public a<T> c(T t11) {
            return new a<>(t11, this);
        }

        public a<T> d() {
            if (this.f68604b == null) {
                return this;
            }
            a<T> aVar = new a<>(this.f68603a);
            for (a<T> aVar2 = this.f68604b; aVar2 != null; aVar2 = aVar2.f68604b) {
                aVar = aVar.c(aVar2.f68603a);
            }
            return aVar;
        }

        public a<T> e() {
            return this.f68604b;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("[");
            for (a<T> d11 = d(); d11 != null; d11 = d11.f68604b) {
                stringBuffer.append(d11.f68603a.toString());
                if (d11.f68604b != null) {
                    stringBuffer.append(" <= ");
                }
            }
            stringBuffer.append("]");
            return stringBuffer.toString();
        }

        public a(T t11) {
            this(t11, null);
        }
    }

    public a1(ku.c cVar) {
        this.f68601a = cVar;
        this.f68602b = null;
    }
}
