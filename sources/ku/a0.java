package ku;

import com.bumptech.glide.load.engine.GlideException;
import com.typesafe.config.ConfigSyntax;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class a0 extends w {
    public a0(Collection<a> collection) {
        super(collection);
    }

    public a0 f(b0 b0Var, b bVar, ConfigSyntax configSyntax) {
        s0 e11 = b0Var.e();
        ArrayList arrayList = new ArrayList(this.f68855a);
        ArrayList arrayList2 = new ArrayList(i());
        b d11 = (!(bVar instanceof w) || arrayList2.isEmpty()) ? bVar : ((w) bVar).d((a) arrayList2.get(arrayList2.size() - 1));
        boolean z11 = false;
        boolean z12 = (arrayList2.size() > 0 && (arrayList2.get(0) instanceof e0) && e2.l(((e0) arrayList2.get(0)).c())) ? false : true;
        if (e11.e() > 1) {
            for (int size = this.f68855a.size() - 1; size >= 0; size--) {
                if (this.f68855a.get(size) instanceof y) {
                    y yVar = (y) this.f68855a.get(size);
                    s0 e12 = yVar.d().e();
                    if (e11.l(e12) && (yVar.g() instanceof a0)) {
                        arrayList.set(size, yVar.e(((a0) yVar.g()).f(b0Var.d(e12.e()), bVar, configSyntax)));
                        return new a0(arrayList);
                    }
                }
            }
        }
        if (!this.f68855a.isEmpty() && (this.f68855a.get(0) instanceof e0) && ((e0) this.f68855a.get(0)).c() == e2.f68706f) {
            z11 = true;
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(arrayList2);
        arrayList3.add(b0Var.c());
        arrayList3.add(new e0(e2.v(null, " ")));
        arrayList3.add(new e0(e2.f68705e));
        arrayList3.add(new e0(e2.v(null, " ")));
        if (e11.e() == 1) {
            arrayList3.add(d11);
        } else {
            ArrayList arrayList4 = new ArrayList();
            arrayList4.add(new e0(e2.f68706f));
            if (arrayList2.isEmpty()) {
                arrayList4.add(new e0(e2.x(null)));
            }
            arrayList4.addAll(arrayList2);
            arrayList4.add(new e0(e2.f68707g));
            arrayList3.add(new a0(arrayList4).f(b0Var.d(1), d11, configSyntax));
        }
        if (configSyntax == ConfigSyntax.JSON || z11 || z12) {
            int size2 = arrayList.size() - 1;
            while (true) {
                if (size2 < 0) {
                    break;
                }
                if ((configSyntax == ConfigSyntax.JSON || z12) && (arrayList.get(size2) instanceof y)) {
                    int i11 = size2 + 1;
                    if (i11 >= arrayList.size() || !(arrayList.get(i11) instanceof e0) || ((e0) arrayList.get(i11)).c() != e2.f68703c) {
                        arrayList.add(i11, new e0(e2.f68703c));
                    }
                } else {
                    if (z11 && (arrayList.get(size2) instanceof e0) && ((e0) arrayList.get(size2)).f68700a == e2.f68707g) {
                        int i12 = size2 - 1;
                        a aVar = (a) arrayList.get(i12);
                        boolean z13 = aVar instanceof e0;
                        if (z13 && e2.l(((e0) aVar).c())) {
                            arrayList.add(i12, new y(arrayList3));
                        } else if (z13 && e2.k(((e0) aVar).c())) {
                            int i13 = size2 - 2;
                            a aVar2 = (a) arrayList.get(i13);
                            if (z12) {
                                arrayList.add(i12, new y(arrayList3));
                            } else if ((aVar2 instanceof e0) && e2.l(((e0) aVar2).c())) {
                                arrayList.add(i13, new y(arrayList3));
                                size2 -= 2;
                            } else {
                                arrayList.add(size2, new y(arrayList3));
                            }
                        } else {
                            arrayList.add(size2, new y(arrayList3));
                        }
                        size2--;
                    }
                    size2--;
                }
            }
        }
        if (!z11) {
            if (!arrayList.isEmpty() && (arrayList.get(arrayList.size() - 1) instanceof e0) && e2.l(((e0) arrayList.get(arrayList.size() - 1)).c())) {
                arrayList.add(arrayList.size() - 1, new y(arrayList3));
            } else {
                arrayList.add(new y(arrayList3));
            }
        }
        return new a0(arrayList);
    }

    public a0 g(s0 s0Var, b bVar, ConfigSyntax configSyntax) {
        ArrayList arrayList = new ArrayList(this.f68855a);
        boolean z11 = false;
        b bVar2 = bVar;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) instanceof e0) {
                b2 c11 = ((e0) arrayList.get(size)).c();
                if (configSyntax == ConfigSyntax.JSON && !z11 && c11 == e2.f68703c) {
                    arrayList.remove(size);
                }
            } else if (arrayList.get(size) instanceof y) {
                y yVar = (y) arrayList.get(size);
                s0 e11 = yVar.d().e();
                if ((bVar2 == null && e11.equals(s0Var)) || (e11.l(s0Var) && !e11.equals(s0Var))) {
                    arrayList.remove(size);
                    while (size < arrayList.size() && (arrayList.get(size) instanceof e0)) {
                        b2 c12 = ((e0) arrayList.get(size)).c();
                        if (e2.k(c12) || c12 == e2.f68703c) {
                            arrayList.remove(size);
                        }
                    }
                } else if (e11.equals(s0Var)) {
                    int i11 = size - 1;
                    a aVar = i11 > 0 ? (a) arrayList.get(i11) : null;
                    arrayList.set(size, yVar.e(((bVar instanceof w) && (aVar instanceof e0) && e2.k(((e0) aVar).c())) ? ((w) bVar).d(aVar) : bVar));
                    z11 = true;
                    bVar2 = null;
                } else {
                    if (s0Var.l(e11) && (yVar.g() instanceof a0)) {
                        arrayList.set(size, yVar.e(((a0) yVar.g()).g(s0Var.m(e11.e()), bVar2, configSyntax)));
                        if (bVar2 != null && !yVar.equals(this.f68855a.get(size))) {
                            bVar2 = null;
                        }
                    }
                    z11 = true;
                }
            }
        }
        return new a0(arrayList);
    }

    public boolean h(s0 s0Var) {
        Iterator<a> it = this.f68855a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next instanceof y) {
                y yVar = (y) next;
                s0 e11 = yVar.d().e();
                if (e11.equals(s0Var) || e11.l(s0Var) || (s0Var.l(e11) && (yVar.g() instanceof a0) && ((a0) yVar.g()).h(s0Var.m(e11.e())))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Collection<a> i() {
        String str;
        int i11;
        ArrayList arrayList = new ArrayList();
        if (!this.f68855a.isEmpty()) {
            boolean z11 = false;
            for (int i12 = 0; i12 < this.f68855a.size(); i12++) {
                if (z11) {
                    if ((this.f68855a.get(i12) instanceof e0) && e2.k(((e0) this.f68855a.get(i12)).c()) && (i11 = i12 + 1) < this.f68855a.size() && ((this.f68855a.get(i11) instanceof y) || (this.f68855a.get(i11) instanceof z))) {
                        arrayList.add(this.f68855a.get(i12));
                        return arrayList;
                    }
                } else if ((this.f68855a.get(i12) instanceof e0) && e2.l(((e0) this.f68855a.get(i12)).c())) {
                    arrayList.add(new e0(e2.x(null)));
                    z11 = true;
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.add(new e0(e2.v(null, " ")));
                return arrayList;
            }
            ArrayList<a> arrayList2 = this.f68855a;
            a aVar = arrayList2.get(arrayList2.size() - 1);
            if ((aVar instanceof e0) && ((e0) aVar).c() == e2.f68707g) {
                a aVar2 = this.f68855a.get(r1.size() - 2);
                if (aVar2 instanceof e0) {
                    e0 e0Var = (e0) aVar2;
                    if (e2.k(e0Var.c())) {
                        str = e0Var.c().e();
                        arrayList.add(new e0(e2.v(null, str + GlideException.a.f28776d)));
                    }
                }
                str = "";
                arrayList.add(new e0(e2.v(null, str + GlideException.a.f28776d)));
            }
        }
        return arrayList;
    }

    @Override // ku.w
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public a0 e(Collection<a> collection) {
        return new a0(collection);
    }

    public a0 k(String str, ConfigSyntax configSyntax) {
        return g(u0.i(str, configSyntax).e(), null, configSyntax);
    }

    public a0 l(String str, b bVar) {
        return m(str, bVar, ConfigSyntax.CONF);
    }

    public a0 m(String str, b bVar, ConfigSyntax configSyntax) {
        return n(u0.i(str, configSyntax), bVar, configSyntax);
    }

    public final a0 n(b0 b0Var, b bVar, ConfigSyntax configSyntax) {
        a0 g11 = g(b0Var.e(), bVar, configSyntax);
        return !g11.h(b0Var.e()) ? g11.f(b0Var, bVar, configSyntax) : g11;
    }
}
