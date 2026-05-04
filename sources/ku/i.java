package ku;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigValueType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ku.d;
import ku.j0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class i extends d implements f2, k0 {

    /* renamed from: b, reason: collision with root package name */
    public final List<d> f68732b;

    public i(ju.m mVar, List<d> list) {
        super(mVar);
        this.f68732b = list;
        if (list.size() < 2) {
            throw new ConfigException.BugOrBroken("Created concatenation with less than 2 items: " + this);
        }
        boolean z11 = false;
        for (d dVar : list) {
            if (dVar instanceof i) {
                throw new ConfigException.BugOrBroken("ConfigConcatenation should never be nested: " + this);
            }
            if (dVar instanceof f2) {
                z11 = true;
            }
        }
        if (z11) {
            return;
        }
        throw new ConfigException.BugOrBroken("Created concatenation without an unmergeable in it: " + this);
    }

    public static d U0(List<d> list) {
        List<d> V0 = V0(list);
        if (V0.isEmpty()) {
            return null;
        }
        return V0.size() == 1 ? V0.get(0) : new i(x1.o(V0), V0);
    }

    public static List<d> V0(List<d> list) {
        if (list.size() < 2) {
            return list;
        }
        ArrayList<d> arrayList = new ArrayList(list.size());
        for (d dVar : list) {
            if (dVar instanceof i) {
                arrayList.addAll(((i) dVar).f68732b);
            } else {
                arrayList.add(dVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (d dVar2 : arrayList) {
            if (arrayList2.isEmpty()) {
                arrayList2.add(dVar2);
            } else {
                X0(arrayList2, dVar2);
            }
        }
        return arrayList2;
    }

    public static boolean W0(d dVar) {
        return (dVar instanceof j0) && !((j0) dVar).V0();
    }

    public static void X0(ArrayList<d> arrayList, d dVar) {
        d dVar2 = arrayList.get(arrayList.size() - 1);
        if ((dVar2 instanceof ju.l) && (dVar instanceof v1)) {
            dVar2 = l0.a(dVar2, ConfigValueType.LIST);
        } else if ((dVar2 instanceof v1) && (dVar instanceof ju.l)) {
            dVar = l0.a(dVar, ConfigValueType.LIST);
        }
        boolean z11 = dVar2 instanceof ju.l;
        if (z11 && (dVar instanceof ju.l)) {
            dVar2 = dVar.a(dVar2);
        } else {
            boolean z12 = dVar2 instanceof v1;
            if (z12 && (dVar instanceof v1)) {
                dVar2 = ((v1) dVar2).X0((v1) dVar);
            } else if ((!z12 && !z11) || !W0(dVar)) {
                if ((dVar2 instanceof i) || (dVar instanceof i)) {
                    throw new ConfigException.BugOrBroken("unflattened ConfigConcatenation");
                }
                if ((dVar2 instanceof f2) || (dVar instanceof f2)) {
                    dVar2 = null;
                } else {
                    String Q0 = dVar2.Q0();
                    String Q02 = dVar.Q0();
                    if (Q0 == null || Q02 == null) {
                        throw new ConfigException.WrongType(dVar2.g(), "Cannot concatenate object or list with a non-object-or-list, " + dVar2 + " and " + dVar + " are not compatible");
                    }
                    dVar2 = new j0.a(x1.p(dVar2.g(), dVar.g()), Q0 + Q02);
                }
            }
        }
        if (dVar2 == null) {
            arrayList.add(dVar);
        } else {
            arrayList.remove(arrayList.size() - 1);
            arrayList.add(dVar2);
        }
    }

    @Override // ku.f2
    public Collection<i> A() {
        return Collections.singleton(this);
    }

    @Override // ku.k0
    public boolean C(d dVar) {
        return d.u0(this.f68732b, dVar);
    }

    @Override // ku.d
    public void K0(StringBuilder sb2, int i11, boolean z11, ju.q qVar) {
        Iterator<d> it = this.f68732b.iterator();
        while (it.hasNext()) {
            it.next().K0(sb2, i11, z11, qVar);
        }
    }

    @Override // ku.d
    public b1 N0() {
        return b1.UNRESOLVED;
    }

    @Override // ku.d
    public z0<? extends d> O0(x0 x0Var, a1 a1Var) throws d.c {
        if (p.O()) {
            int b11 = x0Var.b();
            int i11 = b11 + 2;
            p.L(b11 + 1, "concatenation has " + this.f68732b.size() + " pieces:");
            Iterator<d> it = this.f68732b.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                p.L(i11, i12 + ": " + it.next());
                i12++;
            }
        }
        ArrayList arrayList = new ArrayList(this.f68732b.size());
        x0 x0Var2 = x0Var;
        for (d dVar : this.f68732b) {
            s0 n11 = x0Var2.n();
            z0<? extends d> l11 = x0Var2.p().l(dVar, a1Var);
            Object obj = l11.f68888b;
            x0Var2 = l11.f68887a.m(n11);
            if (p.O()) {
                p.L(x0Var.b(), "resolved concat piece to " + obj);
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        List<d> V0 = V0(arrayList);
        if (V0.size() > 1 && x0Var.f().c()) {
            return z0.c(x0Var2, new i(g(), V0));
        }
        if (V0.isEmpty()) {
            return z0.c(x0Var2, null);
        }
        if (V0.size() == 1) {
            return z0.c(x0Var2, V0.get(0));
        }
        throw new ConfigException.BugOrBroken("Bug in the library; resolved list was joined to too many values: " + V0);
    }

    @Override // ku.d
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public i G0(ju.m mVar) {
        return new i(mVar, this.f68732b);
    }

    public final ConfigException.NotResolved Z0() {
        return new ConfigException.NotResolved("need to Config#resolve(), see the API docs for Config#resolve(); substitution not resolved: " + this);
    }

    @Override // ku.d
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public i I0(s0 s0Var) {
        ArrayList arrayList = new ArrayList();
        Iterator<d> it = this.f68732b.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().I0(s0Var));
        }
        return new i(g(), arrayList);
    }

    @Override // ku.k0
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public i B(d dVar, d dVar2) {
        List<d> L0 = d.L0(this.f68732b, dVar, dVar2);
        if (L0 == null) {
            return null;
        }
        return new i(g(), L0);
    }

    @Override // ju.t
    public Object c() {
        throw Z0();
    }

    @Override // ku.d
    public boolean equals(Object obj) {
        return (obj instanceof i) && q0(obj) && this.f68732b.equals(((i) obj).f68732b);
    }

    @Override // ku.d
    public int hashCode() {
        return this.f68732b.hashCode();
    }

    @Override // ku.d
    public boolean q0(Object obj) {
        return obj instanceof i;
    }

    @Override // ju.t
    public ConfigValueType valueType() {
        throw Z0();
    }

    @Override // ku.d
    public boolean w0() {
        return false;
    }
}
