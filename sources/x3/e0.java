package x3;

import a00.r0;
import com.baicizhan.app.api.service.BizException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k3.e3;
import k3.i3;
import k3.q0;
import kotlin.jvm.internal.u0;
import q30.k0;
import z8.d1;
import z8.f1;
import z8.f2;
import z8.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDataConvert.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataConvert.kt\ncom/baicizhan/app/biz/books/DataConvertKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,193:1\n1#2:194\n37#3,2:195\n37#3,2:197\n37#3,2:202\n37#3,2:204\n37#3,2:206\n37#3,2:208\n37#3,2:210\n1803#4,3:199\n*S KotlinDebug\n*F\n+ 1 DataConvert.kt\ncom/baicizhan/app/biz/books/DataConvertKt\n*L\n67#1:195,2\n110#1:197,2\n65#1:202,2\n62#1:204,2\n106#1:206,2\n104#1:208,2\n101#1:210,2\n132#1:199,3\n*E\n"})
/* loaded from: classes3.dex */
public final class e0 {
    public static final boolean A(d1 d1Var) {
        return d1Var != null;
    }

    public static final k3.o B(d1 d1Var) {
        kotlin.jvm.internal.g0.m(d1Var);
        return p(d1Var, false);
    }

    public static final int C(b it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return it.h();
    }

    public static final i3 D(final h1 h1Var, final Set set, z8.a top) {
        kotlin.jvm.internal.g0.p(top, "top");
        String str = top.f101113d;
        if (str == null) {
            str = "";
        }
        return new i3(str, (k3.z[]) k0.I3(k0.N1(k0.N1(r0.E1(top.f101111b), new x00.l() { // from class: x3.y
            @Override // x00.l
            public final Object invoke(Object obj) {
                f1 E;
                E = e0.E(h1.this, (String) obj);
                return E;
            }
        }), new x00.l() { // from class: x3.z
            @Override // x00.l
            public final Object invoke(Object obj) {
                k3.z F;
                F = e0.F(h1.this, set, (f1) obj);
                return F;
            }
        })).toArray(new k3.z[0]));
    }

    public static final f1 E(h1 h1Var, String cid) {
        Object obj;
        kotlin.jvm.internal.g0.p(cid, "cid");
        Iterator<T> it = h1Var.f101578b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.g0.g(((f1) obj).f101518d, cid)) {
                break;
            }
        }
        return (f1) obj;
    }

    public static final k3.z F(final h1 h1Var, final Set set, f1 f1Var) {
        String str;
        String str2;
        String str3 = "";
        if (f1Var == null || (str = f1Var.f101515a) == null) {
            str = "";
        }
        if (f1Var != null && (str2 = f1Var.f101517c) != null) {
            str3 = str2;
        }
        kotlin.jvm.internal.g0.m(f1Var);
        return new k3.z(str, str3, (e3[]) k0.I3(k0.N1(r0.E1(f1Var.f101516b), new x00.l() { // from class: x3.a0
            @Override // x00.l
            public final Object invoke(Object obj) {
                e3 G;
                G = e0.G(h1.this, set, (f2) obj);
                return G;
            }
        })).toArray(new e3[0]));
    }

    public static final e3 G(final h1 h1Var, final Set set, f2 sub) {
        kotlin.jvm.internal.g0.p(sub, "sub");
        String str = sub.f101525a;
        if (str == null) {
            str = "";
        }
        return new e3(str, (k3.o[]) k0.I3(k0.N1(k0.P0(k0.N1(r0.E1(sub.f101526b), new x00.l() { // from class: x3.s
            @Override // x00.l
            public final Object invoke(Object obj) {
                d1 H;
                H = e0.H(h1.this, ((Integer) obj).intValue());
                return H;
            }
        }), new x00.l() { // from class: x3.t
            @Override // x00.l
            public final Object invoke(Object obj) {
                boolean I;
                I = e0.I((d1) obj);
                return Boolean.valueOf(I);
            }
        }), new x00.l() { // from class: x3.u
            @Override // x00.l
            public final Object invoke(Object obj) {
                k3.o J;
                J = e0.J(set, (d1) obj);
                return J;
            }
        })).toArray(new k3.o[0]));
    }

    public static final d1 H(h1 h1Var, int i11) {
        Object obj;
        Iterator<T> it = h1Var.f101577a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((d1) obj).f101429a == i11) {
                break;
            }
        }
        return (d1) obj;
    }

    public static final boolean I(d1 d1Var) {
        return d1Var != null;
    }

    public static final k3.o J(Set set, d1 d1Var) {
        kotlin.jvm.internal.g0.m(d1Var);
        return p(d1Var, set.contains(Integer.valueOf(d1Var.f101429a)));
    }

    @m80.k
    public static final k3.o p(@m80.k d1 d1Var, boolean z11) {
        kotlin.jvm.internal.g0.p(d1Var, "<this>");
        int i11 = d1Var.f101429a;
        String str = d1Var.f101430b;
        String str2 = d1Var.f101435g;
        if (str2 == null) {
            str2 = o.f97379b;
        }
        String str3 = str2;
        String str4 = d1Var.f101436h;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = str4;
        int i12 = d1Var.f101431c;
        Integer num = d1Var.f101434f;
        return new k3.o(i11, str, str3, str5, i12, z11, new k3.r(num != null ? num.intValue() : 0));
    }

    @m80.k
    public static final List<k3.p> q(@m80.k List<b> list, @m80.k h1 books, @m80.k final com.baicizhan.app.biz.leaning.c currentSchedule) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        kotlin.jvm.internal.g0.p(books, "books");
        kotlin.jvm.internal.g0.p(currentSchedule, "currentSchedule");
        List<d1> list2 = books.f101577a;
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (d1 d1Var : list2) {
            linkedHashMap.put(Integer.valueOf(d1Var.f101429a), d1Var);
        }
        return k0.I3(k0.X0(k0.N1(r0.E1(list), new x00.l() { // from class: x3.v
            @Override // x00.l
            public final Object invoke(Object obj) {
                k3.p s11;
                s11 = e0.s(linkedHashMap, currentSchedule, (b) obj);
                return s11;
            }
        })));
    }

    @m80.k
    public static final k3.p r(@m80.k com.baicizhan.app.biz.leaning.c cVar) {
        kotlin.jvm.internal.g0.p(cVar, "<this>");
        int m11 = cVar.m();
        k3.r rVar = new k3.r(cVar.p());
        return new k3.p(new k3.o(m11, cVar.o(), cVar.n(), cVar.q(), cVar.v(), true, rVar), true, cVar.u(), cVar.s(), cVar.t(), cVar.r());
    }

    public static final k3.p s(Map map, com.baicizhan.app.biz.leaning.c cVar, b selectBookPlanInfo) {
        kotlin.jvm.internal.g0.p(selectBookPlanInfo, "selectBookPlanInfo");
        d1 d1Var = (d1) map.get(Integer.valueOf(selectBookPlanInfo.h()));
        if (d1Var == null) {
            z6.b.f(z6.b.f101032b, o.f97378a, "BOOK NOT FOUND IN ALL BOOKS !!!!! " + selectBookPlanInfo.h(), null, 4, null);
        }
        if (d1Var == null) {
            return null;
        }
        boolean z11 = d1Var.f101429a == cVar.m();
        return new k3.p(p(d1Var, true), z11, selectBookPlanInfo.l(), selectBookPlanInfo.j(), selectBookPlanInfo.k(), Math.min(z11 ? cVar.r() : selectBookPlanInfo.i(), d1Var.f101431c));
    }

    @m80.k
    public static final com.baicizhan.app.biz.leaning.c t(@m80.k q0 q0Var) {
        kotlin.jvm.internal.g0.p(q0Var, "<this>");
        int m11 = q0Var.m();
        String n11 = q0Var.n();
        String o11 = q0Var.o();
        int v11 = q0Var.v();
        int t11 = q0Var.t();
        return new com.baicizhan.app.biz.leaning.c(m11, o11, n11, "", v11, 0, q0Var.r() * q0Var.q(), q0Var.r() * q0Var.q(), q0Var.s(), t11);
    }

    @m80.k
    public static final i3 u(@m80.k final h1 h1Var, int i11) {
        Object obj;
        kotlin.jvm.internal.g0.p(h1Var, "<this>");
        List<z8.a> list = h1Var.f101579c;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((z8.a) obj).f101110a == i11) {
                    break;
                }
            }
            z8.a aVar = (z8.a) obj;
            if (aVar != null) {
                z6.b.j(z6.b.f101032b, o.f97378a, "roleId: " + i11 + " + " + aVar.f101113d, null, 4, null);
                String str = aVar.f101113d;
                if (str == null) {
                    str = "";
                }
                return new i3(str, (k3.z[]) k0.I3(k0.N1(k0.N1(r0.E1(aVar.f101111b), new x00.l() { // from class: x3.b0
                    @Override // x00.l
                    public final Object invoke(Object obj2) {
                        f1 w11;
                        w11 = e0.w(h1.this, (String) obj2);
                        return w11;
                    }
                }), new x00.l() { // from class: x3.c0
                    @Override // x00.l
                    public final Object invoke(Object obj2) {
                        k3.z x11;
                        x11 = e0.x(h1.this, (f1) obj2);
                        return x11;
                    }
                })).toArray(new k3.z[0]));
            }
        }
        throw new BizException("grade not found", null, 0, 6, null);
    }

    @m80.k
    public static final i3[] v(@m80.k final h1 h1Var, @m80.k List<b> selected) {
        kotlin.jvm.internal.g0.p(h1Var, "<this>");
        kotlin.jvm.internal.g0.p(selected, "selected");
        final Set L3 = k0.L3(k0.N1(r0.E1(selected), new x00.l() { // from class: x3.w
            @Override // x00.l
            public final Object invoke(Object obj) {
                int C;
                C = e0.C((b) obj);
                return Integer.valueOf(C);
            }
        }));
        z6.b.j(z6.b.f101032b, o.f97378a, "selectedSet: " + L3, null, 4, null);
        List<z8.a> list = h1Var.f101580d;
        kotlin.jvm.internal.g0.m(list);
        return (i3[]) k0.I3(k0.N1(r0.E1(list), new x00.l() { // from class: x3.x
            @Override // x00.l
            public final Object invoke(Object obj) {
                i3 D;
                D = e0.D(h1.this, L3, (z8.a) obj);
                return D;
            }
        })).toArray(new i3[0]);
    }

    public static final f1 w(h1 h1Var, String cid) {
        Object obj;
        kotlin.jvm.internal.g0.p(cid, "cid");
        Iterator<T> it = h1Var.f101578b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.g0.g(((f1) obj).f101518d, cid)) {
                break;
            }
        }
        return (f1) obj;
    }

    public static final k3.z x(final h1 h1Var, f1 f1Var) {
        String str;
        String str2;
        String str3 = "";
        if (f1Var == null || (str = f1Var.f101515a) == null) {
            str = "";
        }
        if (f1Var != null && (str2 = f1Var.f101517c) != null) {
            str3 = str2;
        }
        kotlin.jvm.internal.g0.m(f1Var);
        return new k3.z(str, str3, (e3[]) k0.I3(k0.N1(r0.E1(f1Var.f101516b), new x00.l() { // from class: x3.p
            @Override // x00.l
            public final Object invoke(Object obj) {
                e3 y11;
                y11 = e0.y(h1.this, (f2) obj);
                return y11;
            }
        })).toArray(new e3[0]));
    }

    public static final e3 y(final h1 h1Var, f2 sub) {
        kotlin.jvm.internal.g0.p(sub, "sub");
        String str = sub.f101525a;
        if (str == null) {
            str = "";
        }
        return new e3(str, (k3.o[]) k0.I3(k0.N1(k0.P0(k0.N1(r0.E1(sub.f101526b), new x00.l() { // from class: x3.d0
            @Override // x00.l
            public final Object invoke(Object obj) {
                d1 z11;
                z11 = e0.z(h1.this, ((Integer) obj).intValue());
                return z11;
            }
        }), new x00.l() { // from class: x3.q
            @Override // x00.l
            public final Object invoke(Object obj) {
                boolean A;
                A = e0.A((d1) obj);
                return Boolean.valueOf(A);
            }
        }), new x00.l() { // from class: x3.r
            @Override // x00.l
            public final Object invoke(Object obj) {
                k3.o B;
                B = e0.B((d1) obj);
                return B;
            }
        })).toArray(new k3.o[0]));
    }

    public static final d1 z(h1 h1Var, int i11) {
        Object obj;
        Iterator<T> it = h1Var.f101577a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((d1) obj).f101429a == i11) {
                break;
            }
        }
        d1 d1Var = (d1) obj;
        if (d1Var == null) {
            z6.b.f(z6.b.f101032b, o.f97378a, "book not found: " + i11, null, 4, null);
        }
        return d1Var;
    }
}
