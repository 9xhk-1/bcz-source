package ku;

import com.typesafe.config.ConfigException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ku.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class k extends c implements f2, w0 {

    /* renamed from: c, reason: collision with root package name */
    public final List<d> f68737c;

    public k(ju.m mVar, List<d> list) {
        super(mVar);
        this.f68737c = list;
        if (list.isEmpty()) {
            throw new ConfigException.BugOrBroken("creating empty delayed merge object");
        }
        if (!(list.get(0) instanceof c)) {
            throw new ConfigException.BugOrBroken("created a delayed merge object not guaranteed to be an object");
        }
        for (d dVar : list) {
            if ((dVar instanceof j) || (dVar instanceof k)) {
                throw new ConfigException.BugOrBroken("placed nested DelayedMerge in a ConfigDelayedMergeObject, should have consolidated stack");
            }
        }
    }

    public static ConfigException y1() {
        return new ConfigException.NotResolved("need to Config#resolve() before using this object, see the API docs for Config#resolve()");
    }

    @Override // ku.f2
    public Collection<d> A() {
        return this.f68737c;
    }

    @Override // ku.c
    /* renamed from: A1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public k R0(ju.k kVar) {
        return (k) super.R0(kVar);
    }

    @Override // ku.k0
    public d B(d dVar, d dVar2) {
        List<d> L0 = d.L0(this.f68737c, dVar, dVar2);
        if (L0 == null) {
            return null;
        }
        return new k(g(), L0);
    }

    @Override // ku.c
    /* renamed from: B1, reason: merged with bridge method [inline-methods] */
    public k m0(String str) {
        throw y1();
    }

    @Override // ku.k0
    public boolean C(d dVar) {
        return d.u0(this.f68737c, dVar);
    }

    @Override // ku.c
    /* renamed from: C1, reason: merged with bridge method [inline-methods] */
    public k f(String str, ju.t tVar) {
        throw y1();
    }

    @Override // ku.c
    /* renamed from: D1, reason: merged with bridge method [inline-methods] */
    public k r1(s0 s0Var, ju.t tVar) {
        throw y1();
    }

    @Override // ku.c
    /* renamed from: E1, reason: merged with bridge method [inline-methods] */
    public k o0(String str) {
        throw y1();
    }

    @Override // ku.d
    public void J0(StringBuilder sb2, int i11, boolean z11, String str, ju.q qVar) {
        j.Z0(this.f68737c, sb2, i11, z11, str, qVar);
    }

    @Override // ku.c, ku.d
    public void K0(StringBuilder sb2, int i11, boolean z11, ju.q qVar) {
        J0(sb2, i11, z11, null, qVar);
    }

    @Override // ku.d
    public b1 N0() {
        return b1.UNRESOLVED;
    }

    @Override // ku.c, ku.d
    public z0<? extends c> O0(x0 x0Var, a1 a1Var) throws d.c {
        return j.a1(this, this.f68737c, x0Var, a1Var).a();
    }

    @Override // ku.c
    public d U0(String str) {
        for (d dVar : this.f68737c) {
            if (!(dVar instanceof c)) {
                if (!(dVar instanceof f2)) {
                    if (dVar.N0() != b1.UNRESOLVED) {
                        if (dVar.w0()) {
                            return null;
                        }
                        throw new ConfigException.BugOrBroken("resolved non-object should ignore fallbacks");
                    }
                    if (dVar instanceof ju.h) {
                        return null;
                    }
                    throw new ConfigException.BugOrBroken("Expecting a list here, not " + dVar);
                }
                throw new ConfigException.NotResolved("Key '" + str + "' is not available at '" + g().description() + "' because value at '" + dVar.g().description() + "' has not been resolved and may turn out to contain or hide '" + str + "'. Be sure to Config#resolve() before using a config object.");
            }
            d U0 = ((c) dVar).U0(str);
            if (U0 != null) {
                if (U0.w0()) {
                    return U0;
                }
            } else if (dVar instanceof f2) {
                throw new ConfigException.BugOrBroken("should not be reached: unmergeable object returned null value");
            }
        }
        throw new ConfigException.BugOrBroken("Delayed merge stack does not contain any unmergeable values");
    }

    @Override // ku.c, ju.l, java.util.Map
    /* renamed from: W0 */
    public d get(Object obj) {
        throw y1();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        throw y1();
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        throw y1();
    }

    @Override // ku.w0
    public d d(x0 x0Var, int i11) {
        return j.U0(x0Var, this.f68737c, i11);
    }

    @Override // java.util.Map
    public Set<Map.Entry<String, ju.t>> entrySet() {
        throw y1();
    }

    @Override // ku.d
    public boolean equals(Object obj) {
        List<d> list;
        List<d> list2;
        return (obj instanceof k) && q0(obj) && ((list = this.f68737c) == (list2 = ((k) obj).f68737c) || list.equals(list2));
    }

    @Override // ku.d
    public int hashCode() {
        return this.f68737c.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        throw y1();
    }

    @Override // java.util.Map
    public Set<String> keySet() {
        throw y1();
    }

    @Override // ku.c
    public c n1(s0 s0Var) {
        throw y1();
    }

    @Override // ku.c
    public c o1(s0 s0Var) {
        throw y1();
    }

    @Override // ku.d
    public boolean q0(Object obj) {
        return obj instanceof k;
    }

    @Override // java.util.Map
    public int size() {
        throw y1();
    }

    @Override // ku.c
    public c t1(s0 s0Var) {
        throw y1();
    }

    @Override // ku.d
    /* renamed from: u1, reason: merged with bridge method [inline-methods] */
    public final k A0(d dVar) {
        M0();
        return (k) z0(this.f68737c, dVar);
    }

    @Override // ku.c
    /* renamed from: v1, reason: merged with bridge method [inline-methods] */
    public final k C0(c cVar) {
        return A0(cVar);
    }

    @Override // java.util.Map
    public Collection<ju.t> values() {
        throw y1();
    }

    @Override // ku.d
    public boolean w0() {
        return j.b1(this.f68737c);
    }

    @Override // ku.d
    /* renamed from: w1, reason: merged with bridge method [inline-methods] */
    public final k F0(f2 f2Var) {
        M0();
        return (k) D0(this.f68737c, f2Var);
    }

    @Override // ku.c
    /* renamed from: x1, reason: merged with bridge method [inline-methods] */
    public k b1(b1 b1Var, ju.m mVar) {
        if (b1Var == N0()) {
            return new k(mVar, this.f68737c);
        }
        throw new ConfigException.BugOrBroken("attempt to create resolved ConfigDelayedMergeObject");
    }

    @Override // ku.c
    /* renamed from: z1, reason: merged with bridge method [inline-methods] */
    public k I0(s0 s0Var) {
        ArrayList arrayList = new ArrayList();
        Iterator<d> it = this.f68737c.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().I0(s0Var));
        }
        return new k(g(), arrayList);
    }

    @Override // ju.t
    public Map<String, Object> c() {
        throw y1();
    }
}
