package si;

import a00.r0;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import l3.a3;
import l3.i0;
import l3.j2;
import l3.k2;
import l3.y2;
import m80.k;
import si.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nWikiSceneDataConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WikiSceneDataConverter.kt\ncom/baicizhan/main/wikiv2/lookup/wikiv2/data/WikiSceneDataConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,200:1\n1563#2:201\n1634#2,3:202\n1563#2:205\n1634#2,3:206\n1869#2,2:209\n1869#2,2:211\n1869#2:213\n1869#2,2:214\n1870#2:216\n1563#2:217\n1634#2,3:218\n1869#2:221\n1869#2:222\n1870#2:224\n1870#2:225\n1#3:223\n*S KotlinDebug\n*F\n+ 1 WikiSceneDataConverter.kt\ncom/baicizhan/main/wikiv2/lookup/wikiv2/data/WikiSceneDataConverter\n*L\n17#1:201\n17#1:202,3\n43#1:205\n43#1:206,3\n68#1:209,2\n110#1:211,2\n125#1:213\n126#1:214,2\n125#1:216\n147#1:217\n147#1:218,3\n179#1:221\n180#1:222\n180#1:224\n179#1:225\n*E\n"})
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f88704a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final int f88705b = 0;

    public final List<String> a(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            switch (((Number) it.next()).intValue()) {
                case 1:
                    arrayList.add("中考");
                    break;
                case 2:
                    arrayList.add("高考");
                    break;
                case 3:
                    arrayList.add("CET4");
                    break;
                case 4:
                    arrayList.add("CET6");
                    break;
                case 5:
                    arrayList.add("考研");
                    break;
                case 6:
                    arrayList.add("IELTS");
                    break;
                case 7:
                    arrayList.add("TOEFL");
                    break;
                case 8:
                    arrayList.add("SAT");
                    break;
                case 9:
                    arrayList.add("GMAT");
                    break;
                case 10:
                    arrayList.add("GRE");
                    break;
            }
        }
        return arrayList;
    }

    public final c.a b(List<Integer> list) {
        String str;
        if (list.isEmpty()) {
            return null;
        }
        switch (((Number) r0.G2(list)).intValue()) {
            case 1:
                str = "中考";
                break;
            case 2:
                str = "高考";
                break;
            case 3:
                str = "CET4";
                break;
            case 4:
                str = "CET6";
                break;
            case 5:
                str = "考研";
                break;
            case 6:
                str = "IELTS";
                break;
            case 7:
                str = "TOEFL";
                break;
            case 8:
                str = "SAT";
                break;
            case 9:
                str = "GMAT";
                break;
            case 10:
                str = "GRE";
                break;
            default:
                return null;
        }
        return new c.a(5, str, 0);
    }

    @k
    public final c c(@k i0 topicResourceModel) {
        g0.p(topicResourceModel, "topicResourceModel");
        i0.c0 C0 = topicResourceModel.G().C0();
        List<i0.n> g02 = topicResourceModel.G().g0();
        ArrayList arrayList = new ArrayList(a00.i0.d0(g02, 10));
        for (i0.n nVar : g02) {
            arrayList.add(new c.b(nVar.F(), nVar.B()));
        }
        c.a g11 = g(topicResourceModel.G().g0());
        return new c(C0.r(), C0.t(), C0.l(), C0.j(), C0.p(), C0.n(), arrayList, f(topicResourceModel.G().g0()), g11);
    }

    @k
    public final c d(@k y2 wordPackModel) {
        g0.p(wordPackModel, "wordPackModel");
        k2 q02 = wordPackModel.q0();
        List<j2> Y = wordPackModel.Y();
        ArrayList arrayList = new ArrayList(a00.i0.d0(Y, 10));
        for (j2 j2Var : Y) {
            arrayList.add(new c.b(j2Var.q(), j2Var.m()));
        }
        c.a b11 = b(wordPackModel.W());
        return new c(q02.r(), q02.t(), q02.l(), q02.j(), q02.p(), q02.n(), arrayList, a(wordPackModel.W()), b11);
    }

    @k
    public final y2 e(@k i0 topicResourceModel) {
        g0.p(topicResourceModel, "topicResourceModel");
        i0.u G = topicResourceModel.G();
        G.C0();
        k2 k2Var = new k2(G.C0().r(), G.C0().t(), G.C0().l(), G.C0().j(), G.C0().p(), G.C0().n(), 0);
        List<i0.n> g02 = G.g0();
        ArrayList arrayList = new ArrayList(a00.i0.d0(g02, 10));
        for (i0.n nVar : g02) {
            arrayList.add(new j2(nVar.z(), nVar.F(), nVar.B(), nVar.D(), nVar.H()));
        }
        return new y2(k2Var, arrayList, G.m0(), G.u0(), G.i0(), G.y0(), G.c0(), G.w0(), G.o0(), G.s0(), G.Y(), G.e0(), h(G.g0()), (a3) null, (List) null, 16384, (v) null);
    }

    public final List<String> f(List<i0.n> list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Iterator<T> it2 = ((i0.n) it.next()).v().iterator();
            while (it2.hasNext()) {
                linkedHashSet.add(((i0.i) it2.next()).f());
            }
        }
        return r0.a6(linkedHashSet);
    }

    public final c.a g(List<i0.n> list) {
        for (i0.n nVar : list) {
            if (!nVar.v().isEmpty()) {
                i0.i iVar = (i0.i) r0.G2(nVar.v());
                return new c.a(iVar.j(), iVar.f(), iVar.h());
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final List<Integer> h(List<i0.n> list) {
        Integer num;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Iterator<T> it2 = ((i0.n) it.next()).v().iterator();
            while (it2.hasNext()) {
                String f11 = ((i0.i) it2.next()).f();
                switch (f11.hashCode()) {
                    case 70842:
                        if (f11.equals("GRE")) {
                            num = 10;
                            break;
                        }
                        num = null;
                        break;
                    case 81862:
                        if (f11.equals("SAT")) {
                            num = 8;
                            break;
                        }
                        num = null;
                        break;
                    case 653174:
                        if (f11.equals("中考")) {
                            num = 1;
                            break;
                        }
                        num = null;
                        break;
                    case 1046641:
                        if (f11.equals("考研")) {
                            num = 5;
                            break;
                        }
                        num = null;
                        break;
                    case 1261611:
                        if (f11.equals("高考")) {
                            num = 2;
                            break;
                        }
                        num = null;
                        break;
                    case 2064962:
                        if (f11.equals("CET4")) {
                            num = 3;
                            break;
                        }
                        num = null;
                        break;
                    case 2064964:
                        if (f11.equals("CET6")) {
                            num = 4;
                            break;
                        }
                        num = null;
                        break;
                    case 2191257:
                        if (f11.equals("GMAT")) {
                            num = 9;
                            break;
                        }
                        num = null;
                        break;
                    case 69548335:
                        if (f11.equals("IELTS")) {
                            num = 6;
                            break;
                        }
                        num = null;
                        break;
                    case 79997808:
                        if (f11.equals("TOEFL")) {
                            num = 7;
                            break;
                        }
                        num = null;
                        break;
                    default:
                        num = null;
                        break;
                }
                if (num != null) {
                    linkedHashSet.add(Integer.valueOf(num.intValue()));
                }
            }
        }
        return r0.a6(linkedHashSet);
    }
}
