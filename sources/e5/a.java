package e5;

import a00.h0;
import a00.i0;
import h8.d;
import h8.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m3.a2;
import m3.b2;
import m3.f1;
import m3.g2;
import m3.j2;
import m3.m0;
import m3.o;
import m3.p;
import m3.q;
import m3.q0;
import m3.x0;
import m80.k;
import m80.l;
import p8.c0;
import t8.w;
import t8.x;
import u8.b;
import u8.c;
import u8.e;
import u8.f;
import u8.g;
import u8.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nConvertExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConvertExtensions.kt\ncom/baicizhan/app/biz/game/impl/unity/vo/ConvertExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,214:1\n1563#2:215\n1634#2,3:216\n1563#2:219\n1634#2,3:220\n1563#2:223\n1634#2,3:224\n1563#2:227\n1634#2,3:228\n1563#2:232\n1634#2,3:233\n1#3:231\n*S KotlinDebug\n*F\n+ 1 ConvertExtensions.kt\ncom/baicizhan/app/biz/game/impl/unity/vo/ConvertExtensionsKt\n*L\n155#1:215\n155#1:216,3\n167#1:219\n167#1:220,3\n174#1:223\n174#1:224,3\n175#1:227\n175#1:228,3\n202#1:232\n202#1:233,3\n*E\n"})
/* loaded from: classes3.dex */
public final class a {
    @k
    public static final f1 a(@l d dVar, @k List<Integer> supportIpAvatarTypes) {
        List J;
        g0.p(supportIpAvatarTypes, "supportIpAvatarTypes");
        if (dVar != null) {
            f1 f1Var = null;
            if (!dVar.f58874d) {
                dVar = null;
            }
            if (dVar != null) {
                h8.l lVar = dVar.f58871a;
                if (lVar != null) {
                    if (!supportIpAvatarTypes.contains(Integer.valueOf(lVar.f58975a))) {
                        lVar = null;
                    }
                    if (lVar != null) {
                        List<i> list = dVar.f58875e;
                        if (list != null) {
                            List<i> list2 = list;
                            J = new ArrayList(i0.d0(list2, 10));
                            Iterator<T> it = list2.iterator();
                            while (it.hasNext()) {
                                J.add(Integer.valueOf(((i) it.next()).f58945a));
                            }
                        } else {
                            J = h0.J();
                        }
                        f1Var = new f1(lVar.f58975a, J);
                    }
                }
                if (f1Var != null) {
                    return f1Var;
                }
            }
        }
        return new f1(0, h0.J());
    }

    @k
    public static final m0 b(@k c0 c0Var) {
        g0.p(c0Var, "<this>");
        return new m0(c0Var.f79712a, c0Var.f79713b);
    }

    @k
    public static final b c(@k o oVar) {
        g0.p(oVar, "<this>");
        return new b(oVar.e(), oVar.g());
    }

    @k
    public static final c d(@k p pVar) {
        g0.p(pVar, "<this>");
        int f11 = pVar.f();
        int j11 = pVar.j();
        q h11 = pVar.h();
        return new c(f11, j11, h11 != null ? e(h11) : null);
    }

    @k
    public static final u8.d e(@k q qVar) {
        g0.p(qVar, "<this>");
        return new u8.d(qVar.h(), qVar.j(), qVar.f());
    }

    @k
    public static final e f(@k m3.g0 g0Var) {
        g0.p(g0Var, "<this>");
        int h11 = g0Var.h();
        long j11 = g0Var.j();
        m3.h0 f11 = g0Var.f();
        return new e(h11, j11, f11 != null ? g(f11) : null);
    }

    @k
    public static final f g(@k m3.h0 h0Var) {
        g0.p(h0Var, "<this>");
        int j11 = h0Var.j();
        int n11 = h0Var.n();
        int l11 = h0Var.l();
        q h11 = h0Var.h();
        return new f(j11, n11, l11, h11 != null ? e(h11) : null, h0Var.p());
    }

    @k
    public static final g h(@k q0 q0Var) {
        g0.p(q0Var, "<this>");
        return new g(q0Var.d());
    }

    @k
    public static final j i(@k b2 b2Var) {
        g0.p(b2Var, "<this>");
        return new j(b2Var.m(), b2Var.o(), b2Var.q(), b2Var.k(), b2Var.w(), b2Var.u(), b2Var.y(), b2Var.s());
    }

    @k
    public static final u8.l j(@k a2 a2Var) {
        g0.p(a2Var, "<this>");
        m3.h0 m11 = a2Var.m();
        ArrayList arrayList = null;
        f g11 = m11 != null ? g(m11) : null;
        p y11 = a2Var.y();
        c d11 = y11 != null ? d(y11) : null;
        o w11 = a2Var.w();
        b c11 = w11 != null ? c(w11) : null;
        q0 q11 = a2Var.q();
        g h11 = q11 != null ? h(q11) : null;
        p u11 = a2Var.u();
        c d12 = u11 != null ? d(u11) : null;
        o s11 = a2Var.s();
        b c12 = s11 != null ? c(s11) : null;
        List<m3.h0> o11 = a2Var.o();
        if (o11 != null) {
            List<m3.h0> list = o11;
            arrayList = new ArrayList(i0.d0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(g((m3.h0) it.next()));
            }
        }
        return new u8.l(g11, d11, c11, h11, d12, c12, arrayList);
    }

    @k
    public static final o k(@k b bVar) {
        g0.p(bVar, "<this>");
        return new o(bVar.f91894a, bVar.f91895b);
    }

    @k
    public static final p l(@k c cVar) {
        g0.p(cVar, "<this>");
        int i11 = cVar.f91900a;
        int i12 = cVar.f91901b;
        u8.d dVar = cVar.f91902c;
        return new p(i11, i12, dVar != null ? m(dVar) : null);
    }

    @k
    public static final q m(@k u8.d dVar) {
        g0.p(dVar, "<this>");
        return new q(dVar.f91908a, dVar.f91909b, dVar.f91910c);
    }

    @k
    public static final m3.g0 n(@k e eVar) {
        g0.p(eVar, "<this>");
        int i11 = eVar.f91916a;
        long j11 = eVar.f91917b;
        f fVar = eVar.f91918c;
        return new m3.g0(i11, j11, fVar != null ? o(fVar) : null);
    }

    @k
    public static final m3.h0 o(@k f fVar) {
        g0.p(fVar, "<this>");
        int i11 = fVar.f91924a;
        int i12 = fVar.f91925b;
        int i13 = fVar.f91926c;
        u8.d dVar = fVar.f91927d;
        q m11 = dVar != null ? m(dVar) : null;
        String str = fVar.f91928e;
        if (str == null) {
            str = "";
        }
        return new m3.h0(i11, i12, i13, m11, str);
    }

    @k
    public static final q0 p(@k g gVar) {
        g0.p(gVar, "<this>");
        return new q0(gVar.f91936a);
    }

    @k
    public static final x0 q(@k t8.i iVar) {
        g0.p(iVar, "<this>");
        return new x0(iVar.f90080a, iVar.f90081b, iVar.f90082c, iVar.f90083d);
    }

    @k
    public static final a2 r(@k u8.l lVar) {
        List J;
        g0.p(lVar, "<this>");
        f fVar = lVar.f91976a;
        m3.h0 o11 = fVar != null ? o(fVar) : null;
        c cVar = lVar.f91977b;
        p l11 = cVar != null ? l(cVar) : null;
        b bVar = lVar.f91978c;
        o k11 = bVar != null ? k(bVar) : null;
        g gVar = lVar.f91979d;
        q0 p11 = gVar != null ? p(gVar) : null;
        c cVar2 = lVar.f91980e;
        p l12 = cVar2 != null ? l(cVar2) : null;
        b bVar2 = lVar.f91981f;
        o k12 = bVar2 != null ? k(bVar2) : null;
        List<f> list = lVar.f91982g;
        if (list != null) {
            List<f> list2 = list;
            J = new ArrayList(i0.d0(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                J.add(o((f) it.next()));
            }
        } else {
            J = h0.J();
        }
        return new a2(o11, l11, k11, p11, l12, k12, J);
    }

    @k
    public static final b2 s(@k j jVar) {
        g0.p(jVar, "<this>");
        return new b2(jVar.f91950a, jVar.f91951b, jVar.f91952c, jVar.f91953d, jVar.f91954e, jVar.f91955f, jVar.f91956g, jVar.f91957h);
    }

    @k
    public static final g2 t(@k w wVar) {
        g0.p(wVar, "<this>");
        int i11 = wVar.f90310a;
        String str = wVar.f90311b;
        if (str == null) {
            str = "";
        }
        return new g2(i11, str);
    }

    @k
    public static final j2 u(@k x xVar) {
        g0.p(xVar, "<this>");
        List<t8.i> list = xVar.f90316a;
        ArrayList arrayList = new ArrayList(i0.d0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(q((t8.i) it.next()));
        }
        List<w> list2 = xVar.f90317b;
        ArrayList arrayList2 = new ArrayList(i0.d0(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(t((w) it2.next()));
        }
        return new j2(arrayList, arrayList2);
    }
}
