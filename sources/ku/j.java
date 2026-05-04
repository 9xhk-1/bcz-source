package ku;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigValueType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ku.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class j extends d implements f2, w0 {

    /* renamed from: b, reason: collision with root package name */
    public final List<d> f68735b;

    public j(ju.m mVar, List<d> list) {
        super(mVar);
        this.f68735b = list;
        if (list.isEmpty()) {
            throw new ConfigException.BugOrBroken("creating empty delayed merge value");
        }
        for (d dVar : list) {
            if ((dVar instanceof j) || (dVar instanceof k)) {
                throw new ConfigException.BugOrBroken("placed nested DelayedMerge in a ConfigDelayedMerge, should have consolidated stack");
            }
        }
    }

    public static d U0(x0 x0Var, List<d> list, int i11) {
        List<d> subList = list.subList(i11, list.size());
        d dVar = null;
        if (subList.isEmpty()) {
            if (p.O()) {
                p.L(x0Var.b(), "Nothing else in the merge stack, replacing with null");
            }
            return null;
        }
        for (d dVar2 : subList) {
            if (dVar != null) {
                dVar2 = dVar.a(dVar2);
            }
            dVar = dVar2;
        }
        return dVar;
    }

    public static void Z0(List<d> list, StringBuilder sb2, int i11, boolean z11, String str, ju.q qVar) {
        boolean c11 = qVar.c();
        if (c11) {
            sb2.append("# unresolved merge of " + list.size() + " values follows (\n");
            if (str == null) {
                d.y0(sb2, i11, qVar);
                sb2.append("# this unresolved merge will not be parseable because it's at the root of the object\n");
                d.y0(sb2, i11, qVar);
                sb2.append("# the HOCON format has no way to list multiple root objects in a single file\n");
            }
        }
        ArrayList<d> arrayList = new ArrayList();
        arrayList.addAll(list);
        Collections.reverse(arrayList);
        int i12 = 0;
        for (d dVar : arrayList) {
            if (c11) {
                d.y0(sb2, i11, qVar);
                if (str != null) {
                    sb2.append("#     unmerged value " + i12 + " for key " + q.i(str) + " from ");
                } else {
                    sb2.append("#     unmerged value " + i12 + " from ");
                }
                i12++;
                sb2.append(dVar.g().description());
                sb2.append("\n");
                for (String str2 : dVar.g().b()) {
                    d.y0(sb2, i11, qVar);
                    sb2.append("# ");
                    sb2.append(str2);
                    sb2.append("\n");
                }
            }
            d.y0(sb2, i11, qVar);
            if (str != null) {
                sb2.append(q.i(str));
                if (qVar.d()) {
                    sb2.append(" : ");
                } else {
                    sb2.append(":");
                }
            }
            dVar.K0(sb2, i11, z11, qVar);
            sb2.append(",");
            if (qVar.d()) {
                sb2.append('\n');
            }
        }
        sb2.setLength(sb2.length() - 1);
        if (qVar.d()) {
            sb2.setLength(sb2.length() - 1);
            sb2.append("\n");
        }
        if (c11) {
            d.y0(sb2, i11, qVar);
            sb2.append("# ) end of unresolved merge\n");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static z0<? extends d> a1(w0 w0Var, List<d> list, x0 x0Var, a1 a1Var) throws d.c {
        a1 e11;
        if (p.O()) {
            p.L(x0Var.b(), "delayed merge stack has " + list.size() + " items:");
            int i11 = 0;
            for (d dVar : list) {
                p.L(x0Var.b() + 1, i11 + ": " + dVar);
                i11++;
            }
        }
        d dVar2 = null;
        x0 x0Var2 = x0Var;
        int i12 = 0;
        for (d dVar3 : list) {
            if (dVar3 instanceof w0) {
                throw new ConfigException.BugOrBroken("A delayed merge should not contain another one: " + w0Var);
            }
            if (dVar3 instanceof f2) {
                d d11 = w0Var.d(x0Var, i12 + 1);
                if (p.O()) {
                    p.L(x0Var2.b(), "remainder portion: " + d11);
                }
                if (p.O()) {
                    p.L(x0Var2.b(), "building sourceForEnd");
                }
                a1 h11 = a1Var.h((d) w0Var, d11);
                if (p.O()) {
                    p.L(x0Var2.b(), "  sourceForEnd before reset parents but after replace: " + h11);
                }
                e11 = h11.i();
            } else {
                if (p.O()) {
                    p.L(x0Var2.b(), "will resolve end against the original source with parent pushed");
                }
                e11 = a1Var.e(w0Var);
            }
            if (p.O()) {
                p.L(x0Var2.b(), "sourceForEnd      =" + e11);
            }
            if (p.O()) {
                int b11 = x0Var2.b();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Resolving highest-priority item in delayed merge ");
                sb2.append(dVar3);
                sb2.append(" against ");
                sb2.append(e11);
                sb2.append(" endWasRemoved=");
                sb2.append(a1Var != e11);
                p.L(b11, sb2.toString());
            }
            z0<? extends d> l11 = x0Var2.l(dVar3, e11);
            ju.k kVar = l11.f68888b;
            x0Var2 = l11.f68887a;
            if (kVar != null) {
                if (dVar2 == null) {
                    dVar2 = kVar;
                } else {
                    if (p.O()) {
                        p.L(x0Var2.b() + 1, "merging " + dVar2 + " with fallback " + kVar);
                    }
                    dVar2 = dVar2.a(kVar);
                }
            }
            i12++;
            if (p.O()) {
                p.L(x0Var2.b(), "stack merged, yielding: " + dVar2);
            }
        }
        return z0.c(x0Var2, dVar2);
    }

    public static boolean b1(List<d> list) {
        return list.get(list.size() - 1).w0();
    }

    @Override // ku.f2
    public Collection<d> A() {
        return this.f68735b;
    }

    @Override // ku.k0
    public d B(d dVar, d dVar2) {
        List<d> L0 = d.L0(this.f68735b, dVar, dVar2);
        if (L0 == null) {
            return null;
        }
        return new j(g(), L0);
    }

    @Override // ku.k0
    public boolean C(d dVar) {
        return d.u0(this.f68735b, dVar);
    }

    @Override // ku.d
    public d G0(ju.m mVar) {
        return new j(mVar, this.f68735b);
    }

    @Override // ku.d
    public void J0(StringBuilder sb2, int i11, boolean z11, String str, ju.q qVar) {
        Z0(this.f68735b, sb2, i11, z11, str, qVar);
    }

    @Override // ku.d
    public void K0(StringBuilder sb2, int i11, boolean z11, ju.q qVar) {
        J0(sb2, i11, z11, null, qVar);
    }

    @Override // ku.d
    public b1 N0() {
        return b1.UNRESOLVED;
    }

    @Override // ku.d
    public z0<? extends d> O0(x0 x0Var, a1 a1Var) throws d.c {
        return a1(this, this.f68735b, x0Var, a1Var);
    }

    @Override // ku.d
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public j A0(d dVar) {
        return (j) z0(this.f68735b, dVar);
    }

    @Override // ku.d
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public final j C0(c cVar) {
        return (j) B0(this.f68735b, cVar);
    }

    @Override // ku.d
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public final j F0(f2 f2Var) {
        return (j) D0(this.f68735b, f2Var);
    }

    @Override // ku.d
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public j I0(s0 s0Var) {
        ArrayList arrayList = new ArrayList();
        Iterator<d> it = this.f68735b.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().I0(s0Var));
        }
        return new j(g(), arrayList);
    }

    @Override // ju.t
    public Object c() {
        throw new ConfigException.NotResolved("called unwrapped() on value with unresolved substitutions, need to Config#resolve() first, see API docs");
    }

    @Override // ku.w0
    public d d(x0 x0Var, int i11) {
        return U0(x0Var, this.f68735b, i11);
    }

    @Override // ku.d
    public boolean equals(Object obj) {
        List<d> list;
        List<d> list2;
        return (obj instanceof j) && q0(obj) && ((list = this.f68735b) == (list2 = ((j) obj).f68735b) || list.equals(list2));
    }

    @Override // ku.d
    public int hashCode() {
        return this.f68735b.hashCode();
    }

    @Override // ku.d
    public boolean q0(Object obj) {
        return obj instanceof j;
    }

    @Override // ju.t
    public ConfigValueType valueType() {
        throw new ConfigException.NotResolved("called valueType() on value with unresolved substitutions, need to Config#resolve() first, see API docs");
    }

    @Override // ku.d
    public boolean w0() {
        return b1(this.f68735b);
    }
}
