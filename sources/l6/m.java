package l6;

import a00.g0;
import a00.h0;
import a00.r0;
import com.baicizhan.app.biz.game.model.StudyMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.u0;
import l3.i0;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
@u0({"SMAP\nExtractResourceUrlUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExtractResourceUrlUC.kt\ncom/baicizhan/app/biz/game/uc/resource/ExtractResourceUrlUC\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,409:1\n2756#2:410\n1563#2:412\n1634#2,3:413\n1563#2:416\n1634#2,3:417\n1563#2:421\n1634#2,3:422\n774#2:425\n865#2,2:426\n295#2,2:428\n1#3:411\n1#3:420\n*S KotlinDebug\n*F\n+ 1 ExtractResourceUrlUC.kt\ncom/baicizhan/app/biz/game/uc/resource/ExtractResourceUrlUC\n*L\n19#1:410\n37#1:412\n37#1:413,3\n38#1:416\n38#1:417,3\n53#1:421\n53#1:422,3\n69#1:425\n69#1:426,2\n89#1:428,2\n19#1:411\n*E\n"})
/* loaded from: classes3.dex */
public final class m {
    public final List<String> a(i0 i0Var) {
        Object obj;
        Object obj2;
        Object obj3;
        i0.b W = i0Var.G().W();
        if (W == null) {
            return h0.J();
        }
        Iterator<T> it = i0Var.A().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((i0.p) obj2).w() == StudyMode.AiLeadU.getValue()) {
                break;
            }
        }
        i0.p pVar = (i0.p) obj2;
        if (pVar == null) {
            return h0.J();
        }
        Long l11 = (Long) r0.L2(pVar.s());
        Long l12 = (Long) r0.L2(pVar.q());
        List j11 = g0.j();
        j11.add(W.C());
        if (l11 != null) {
            long longValue = l11.longValue();
            Iterator<T> it2 = W.G().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it2.next();
                if (((i0.j) obj3).r() == longValue) {
                    break;
                }
            }
            i0.j jVar = (i0.j) obj3;
            if (jVar != null) {
                j11.add(jVar.l());
                j11.add(jVar.t());
            }
        }
        i0.l lVar = (i0.l) r0.L2(W.I());
        if (lVar != null) {
            j11.add(lVar.i());
        }
        i0.l lVar2 = (i0.l) r0.L2(W.Q());
        if (lVar2 != null) {
            j11.add(lVar2.i());
        }
        i0.j jVar2 = (i0.j) r0.L2(W.E());
        if (jVar2 != null) {
            j11.add(jVar2.l());
        }
        if (l12 != null) {
            long longValue2 = l12.longValue();
            Iterator<T> it3 = W.O().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next = it3.next();
                if (((i0.c) next).y() == longValue2) {
                    obj = next;
                    break;
                }
            }
            i0.c cVar = (i0.c) obj;
            if (cVar != null) {
                j11.add(cVar.u());
                j11.add(cVar.E());
            }
        }
        i0.l lVar3 = (i0.l) r0.L2(W.K());
        if (lVar3 != null) {
            j11.add(lVar3.i());
        }
        i0.j jVar3 = (i0.j) r0.L2(W.M());
        if (jVar3 != null) {
            j11.add(jVar3.l());
        }
        return g0.b(j11);
    }

    @m80.k
    public final List<String> b(int i11, @m80.k i0 model) {
        List<i0.w> b11;
        i0.d w11;
        List<String> I;
        kotlin.jvm.internal.g0.p(model, "model");
        List j11 = g0.j();
        j11.add(model.G().C0().n());
        j11.add(model.G().C0().p());
        b11 = n.b(model, i11);
        for (i0.w wVar : b11) {
            j11.add(wVar.T());
            j11.add(wVar.z());
            j11.add(wVar.B());
            if (i11 == StudyMode.Deep.getValue()) {
                j11.add(wVar.L());
                j11.add(wVar.J());
            }
            if (i11 == StudyMode.Context.getValue()) {
                j11.add(wVar.H());
                j11.add(wVar.F());
            }
        }
        if (i11 == StudyMode.Picture.getValue()) {
            List<i0.t> k02 = model.G().k0();
            ArrayList arrayList = new ArrayList(a00.i0.d0(k02, 10));
            Iterator<T> it = k02.iterator();
            while (it.hasNext()) {
                arrayList.add(((i0.t) it.next()).g());
            }
            j11.addAll(arrayList);
            List<i0.y> o02 = model.G().o0();
            ArrayList arrayList2 = new ArrayList(a00.i0.d0(o02, 10));
            Iterator<T> it2 = o02.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((i0.y) it2.next()).q());
            }
            j11.addAll(arrayList2);
        }
        if (h0.Q(Integer.valueOf(StudyMode.Cake.getValue()), Integer.valueOf(StudyMode.CakeJapanese.getValue()), Integer.valueOf(StudyMode.CakeKorean.getValue())).contains(Integer.valueOf(i11)) && (w11 = model.w()) != null) {
            List<String> B = w11.B();
            if (B.isEmpty()) {
                B = null;
            }
            if (B != null) {
                j11.addAll(B);
            }
            String x11 = w11.x();
            if (k0.O3(x11)) {
                x11 = null;
            }
            if (x11 != null) {
                j11.add(x11);
            }
            List<i0.o> H = w11.H();
            if (H.isEmpty()) {
                H = null;
            }
            if (H != null) {
                List<i0.o> list = H;
                ArrayList arrayList3 = new ArrayList(a00.i0.d0(list, 10));
                Iterator<T> it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((i0.o) it3.next()).e());
                }
                j11.addAll(arrayList3);
            }
            List<String> z11 = w11.z();
            if (z11.isEmpty()) {
                z11 = null;
            }
            if (z11 != null) {
                j11.addAll(z11);
            }
            i0.q J = w11.J();
            if (J != null && (I = J.I()) != null) {
                if (I.isEmpty()) {
                    I = null;
                }
                if (I != null) {
                    j11.addAll(I);
                }
            }
            String N = w11.N();
            if (k0.O3(N)) {
                N = null;
            }
            if (N != null) {
                j11.add(N);
            }
            String F = w11.F();
            if (k0.O3(F)) {
                F = null;
            }
            if (F != null) {
                j11.add(F);
            }
        }
        if (i11 == StudyMode.AiLeadU.getValue()) {
            j11.addAll(a(model));
        }
        List b12 = g0.b(j11);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : b12) {
            String str = (String) obj;
            if (str.length() > 0 && !k0.O3(str) && !k0.n3(str, "?", false, 2, null)) {
                arrayList4.add(obj);
            }
        }
        return arrayList4;
    }
}
