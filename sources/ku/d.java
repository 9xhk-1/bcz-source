package ku;

import com.huawei.hms.framework.common.ContainerUtils;
import com.typesafe.config.ConfigException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class d implements ju.t, p0 {

    /* renamed from: a, reason: collision with root package name */
    public final x1 f68674a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        d a(String str, d dVar) throws Exception;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public abstract class b implements a {
        public b() {
        }

        @Override // ku.d.a
        public final d a(String str, d dVar) throws Exception {
            try {
                return b(str, dVar);
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception e12) {
                throw new ConfigException.BugOrBroken("Unexpected exception", e12);
            }
        }

        public abstract d b(String str, d dVar);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c extends Exception {
        private static final long serialVersionUID = 1;

        /* renamed from: a, reason: collision with root package name */
        public final String f68676a;

        public c(x0 x0Var) {
            super("was not possible to resolve");
            this.f68676a = x0Var.o();
        }

        public String a() {
            return this.f68676a;
        }
    }

    public d(ju.m mVar) {
        this.f68674a = (x1) mVar;
    }

    public static List<d> L0(List<d> list, d dVar, d dVar2) {
        int i11 = 0;
        while (i11 < list.size() && list.get(i11) != dVar) {
            i11++;
        }
        if (i11 == list.size()) {
            throw new ConfigException.BugOrBroken("tried to replace " + dVar + " which is not in " + list);
        }
        ArrayList arrayList = new ArrayList(list);
        if (dVar2 != null) {
            arrayList.set(i11, dVar2);
        } else {
            arrayList.remove(i11);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public static boolean u0(List<d> list, d dVar) {
        Iterator<d> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == dVar) {
                return true;
            }
        }
        for (ju.t tVar : list) {
            if ((tVar instanceof k0) && ((k0) tVar).C(dVar)) {
                return true;
            }
        }
        return false;
    }

    public static void y0(StringBuilder sb2, int i11, ju.q qVar) {
        if (qVar.d()) {
            while (i11 > 0) {
                sb2.append("    ");
                i11--;
            }
        }
    }

    public d A0(d dVar) {
        M0();
        return z0(Collections.singletonList(this), dVar);
    }

    public final d B0(Collection<d> collection, ku.c cVar) {
        M0();
        if (this instanceof ku.c) {
            throw new ConfigException.BugOrBroken("Objects must reimplement mergedWithObject");
        }
        return z0(collection, cVar);
    }

    public d C0(ku.c cVar) {
        M0();
        return B0(Collections.singletonList(this), cVar);
    }

    public final d D0(Collection<d> collection, f2 f2Var) {
        M0();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(collection);
        arrayList.addAll(f2Var.A());
        return r0(ku.c.X0(arrayList), arrayList);
    }

    public d F0(f2 f2Var) {
        M0();
        return D0(Collections.singletonList(this), f2Var);
    }

    public abstract d G0(ju.m mVar);

    @Override // ju.t
    /* renamed from: H0, reason: merged with bridge method [inline-methods] */
    public x1 g() {
        return this.f68674a;
    }

    public void J0(StringBuilder sb2, int i11, boolean z11, String str, ju.q qVar) {
        if (str != null) {
            sb2.append(qVar.e() ? q.i(str) : q.j(str));
            if (qVar.e()) {
                if (qVar.d()) {
                    sb2.append(" : ");
                } else {
                    sb2.append(":");
                }
            } else if (!(this instanceof ju.l)) {
                sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
            } else if (qVar.d()) {
                sb2.append(' ');
            }
        }
        K0(sb2, i11, z11, qVar);
    }

    public void K0(StringBuilder sb2, int i11, boolean z11, ju.q qVar) {
        if (v0(qVar)) {
            sb2.append("<env variable>");
        } else {
            sb2.append(c().toString());
        }
    }

    public final void M0() {
        if (w0()) {
            throw new ConfigException.BugOrBroken("method should not have been called with ignoresFallbacks=true " + getClass().getSimpleName());
        }
    }

    public b1 N0() {
        return b1.RESOLVED;
    }

    public z0<? extends d> O0(x0 x0Var, a1 a1Var) throws c {
        return z0.c(x0Var, this);
    }

    public String Q0() {
        return null;
    }

    @Override // ju.t, ju.k
    /* renamed from: R0 */
    public d a(ju.k kVar) {
        if (w0()) {
            return this;
        }
        ju.t Q = ((p0) kVar).Q();
        return Q instanceof f2 ? F0((f2) Q) : Q instanceof ku.c ? C0((ku.c) Q) : A0((d) Q);
    }

    public d S0() {
        if (w0()) {
            return this;
        }
        throw new ConfigException.BugOrBroken("value class doesn't implement forced fallback-ignoring " + this);
    }

    @Override // ju.t
    /* renamed from: T0 */
    public d e(ju.m mVar) {
        return this.f68674a == mVar ? this : G0(mVar);
    }

    @Override // ju.t
    public final String b() {
        return e0(ju.q.b());
    }

    @Override // ju.t
    public final String e0(ju.q qVar) {
        StringBuilder sb2 = new StringBuilder();
        J0(sb2, 0, true, null, qVar);
        return sb2.toString();
    }

    public boolean equals(Object obj) {
        if ((obj instanceof ju.t) && q0(obj)) {
            ju.t tVar = (ju.t) obj;
            if (valueType() == tVar.valueType() && q.b(c(), tVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Object c11 = c();
        if (c11 == null) {
            return 0;
        }
        return c11.hashCode();
    }

    public void j0(StringBuilder sb2) {
        sb2.append("\"<env variable>\"");
    }

    @Override // ju.t
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public t1 k(String str) {
        return l0(x1.w("atKey(" + str + pn.j.f81007d), str);
    }

    public t1 l0(ju.m mVar, String str) {
        return new w1(mVar, Collections.singletonMap(str, this)).f0();
    }

    @Override // ju.t
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public t1 j(String str) {
        return p0(x1.w("atPath(" + str + pn.j.f81007d), s0.g(str));
    }

    public t1 p0(ju.m mVar, s0 s0Var) {
        t1 l02 = l0(mVar, s0Var.d());
        for (s0 h11 = s0Var.h(); h11 != null; h11 = h11.h()) {
            l02 = l02.l0(mVar, h11.d());
        }
        return l02;
    }

    public boolean q0(Object obj) {
        return obj instanceof ju.t;
    }

    public d r0(ju.m mVar, List<d> list) {
        return new j(mVar, list);
    }

    public final d t0(Collection<d> collection, d dVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(collection);
        arrayList.add(dVar);
        return r0(ku.c.X0(arrayList), arrayList);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        J0(sb2, 0, true, null, ju.q.a());
        return getClass().getSimpleName() + pn.j.f81006c + sb2.toString() + pn.j.f81007d;
    }

    public boolean v0(ju.q qVar) {
        return !qVar.g() && this.f68674a.y() == q0.ENV_VARIABLE;
    }

    public boolean w0() {
        return N0() == b1.RESOLVED;
    }

    public final d z0(Collection<d> collection, d dVar) {
        M0();
        return N0() == b1.RESOLVED ? S0() : t0(collection, dVar);
    }

    @Override // ku.p0
    /* renamed from: P0 */
    public d Q() {
        return this;
    }

    public d I0(s0 s0Var) {
        return this;
    }
}
