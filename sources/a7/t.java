package a7;

import a00.h0;
import a00.i0;
import a00.l0;
import a00.r0;
import com.baicizhan.main.wikiv2.study.model.ExtendedWordInfo;
import com.jiongji.andriod.card.R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k3.b2;
import k3.c2;
import k3.i4;
import k3.j4;
import k3.o1;
import k3.s2;
import k3.t1;
import k3.u1;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import t8.u;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nWikiDataConvert.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WikiDataConvert.kt\ncom/baicizhan/app/biz/lookup/WikiDataConvertKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,338:1\n13805#2,2:339\n1#3:341\n37#4,2:342\n37#4,2:344\n37#4,2:348\n37#4,2:350\n37#4,2:352\n37#4,2:354\n37#4,2:356\n37#4,2:362\n37#4,2:368\n37#4,2:378\n37#4,2:381\n37#4,2:388\n1869#5,2:346\n1878#5,3:358\n1869#5:361\n1870#5:364\n1761#5,3:365\n1869#5,2:370\n1573#5:373\n1604#5,4:374\n1573#5:383\n1604#5,4:384\n216#6:372\n217#6:380\n*S KotlinDebug\n*F\n+ 1 WikiDataConvert.kt\ncom/baicizhan/app/biz/lookup/WikiDataConvertKt\n*L\n42#1:339,2\n60#1:342,2\n80#1:344,2\n121#1:348,2\n184#1:350,2\n188#1:352,2\n193#1:354,2\n206#1:356,2\n258#1:362,2\n271#1:368,2\n314#1:378,2\n320#1:381,2\n300#1:388,2\n104#1:346,2\n224#1:358,3\n242#1:361\n242#1:364\n269#1:365,3\n280#1:370,2\n311#1:373\n311#1:374,4\n295#1:383\n295#1:384,4\n303#1:372\n303#1:380\n*E\n"})
/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final Map<String, String> f2182a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final String f2183b = "other";

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("pl", ExtendedWordInfo.WordDeform.f25861c);
        linkedHashMap.put(com.alipay.sdk.m.k.b.f10659o, ExtendedWordInfo.WordDeform.f25862d);
        linkedHashMap.put("past", ExtendedWordInfo.WordDeform.f25864f);
        linkedHashMap.put("done", ExtendedWordInfo.WordDeform.f25865g);
        linkedHashMap.put("ing", ExtendedWordInfo.WordDeform.f25863e);
        linkedHashMap.put("er", ExtendedWordInfo.WordDeform.f25866h);
        linkedHashMap.put("est", ExtendedWordInfo.WordDeform.f25867i);
        linkedHashMap.put("prep", ExtendedWordInfo.WordDeform.f25872n);
        linkedHashMap.put("adv", ExtendedWordInfo.WordDeform.f25871m);
        linkedHashMap.put("verb", ExtendedWordInfo.WordDeform.f25868j);
        linkedHashMap.put("adj", ExtendedWordInfo.WordDeform.f25870l);
        linkedHashMap.put("noun", ExtendedWordInfo.WordDeform.f25869k);
        linkedHashMap.put("conn", ExtendedWordInfo.WordDeform.f25873o);
        f2182a = linkedHashMap;
    }

    @m80.l
    public static final o1.a d(@m80.l List<t8.n> list) {
        List<t8.n> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new j4(list.get(i11).f90143d, list.get(i11).f90144e));
        }
        return new o1.a((j4[]) arrayList.toArray(new j4[0]));
    }

    @m80.k
    public static final o1.b e(@m80.k t8.p pVar, int i11, boolean z11, @m80.k o7.c cdn) {
        u1 u1Var;
        g0.p(pVar, "<this>");
        g0.p(cdn, "cdn");
        t8.b bVar = pVar.f90162c;
        g0.m(bVar);
        t8.s sVar = bVar.f89987a;
        t8.r rVar = sVar.f90242a;
        int i12 = rVar.f90224a;
        String str = rVar.f90225b;
        String str2 = rVar.f90226c;
        String str3 = rVar.f90228e;
        String a11 = str3 != null ? cdn.a(str3) : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i13 = 0;
        int i14 = 0;
        for (t8.f fVar : sVar.f90243b) {
            t1 t1Var = (t1) linkedHashMap.get(fVar.f90019c);
            if (t1Var != null) {
                t1Var.i(t1Var.g() + (char) 65307 + fVar.f90020d);
            } else {
                if (fVar.f90019c.length() > i13) {
                    i13 = fVar.f90019c.length();
                }
                String str4 = fVar.f90019c;
                i14++;
                linkedHashMap.put(str4, new t1(i14, str4, fVar.f90020d));
            }
        }
        if (linkedHashMap.isEmpty()) {
            u1Var = null;
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(linkedHashMap.values());
            l0.r0(arrayList, new Comparator() { // from class: a7.s
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int f11;
                    f11 = t.f((t1) obj, (t1) obj2);
                    return f11;
                }
            });
            u1Var = new u1((t1[]) arrayList.toArray(new t1[0]), i13);
        }
        String y11 = y(pVar);
        List<String> list = sVar.f90250i;
        return new o1.b(i12, i11, str, str2, a11, u1Var, null, y11, list != null ? b.f2032a.a(r0.d6(list)) : null, z11);
    }

    public static final int f(t1 t1Var, t1 t1Var2) {
        return g0.t(t1Var.f(), t1Var2.f());
    }

    @m80.l
    public static final o1.c g(@m80.k t8.p pVar) {
        t8.s sVar;
        t8.r rVar;
        String str;
        g0.p(pVar, "<this>");
        t8.b bVar = pVar.f90162c;
        if (bVar == null || (sVar = bVar.f89987a) == null || (rVar = sVar.f90242a) == null || (str = rVar.f90231h) == null) {
            return null;
        }
        if (str.length() <= 0) {
            str = null;
        }
        if (str != null) {
            return new o1.c(str);
        }
        return null;
    }

    @m80.l
    public static final o1.d h(@m80.k t8.p pVar, @m80.k o7.c cdn) {
        t8.s sVar;
        List<t8.k> list;
        g0.p(pVar, "<this>");
        g0.p(cdn, "cdn");
        t8.b bVar = pVar.f90162c;
        if (bVar != null && (sVar = bVar.f89987a) != null && (list = sVar.f90245d) != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                t8.b bVar2 = pVar.f90162c;
                g0.m(bVar2);
                List<t8.k> list2 = bVar2.f89987a.f90245d;
                g0.m(list2);
                s2 v11 = v(pVar, list2.get(0), true, cdn);
                if (v11 != null) {
                    return new o1.d(v11);
                }
            }
        }
        return null;
    }

    @m80.l
    public static final o1.e i(@m80.k t8.p pVar, @m80.k HashMap<String, Integer> orderMap, @m80.k o7.c cdn) {
        t8.s sVar;
        List<t8.k> list;
        int i11;
        s2[] s2VarArr;
        t8.p pVar2;
        o7.c cVar;
        String str;
        g0.p(pVar, "<this>");
        g0.p(orderMap, "orderMap");
        g0.p(cdn, "cdn");
        t8.b bVar = pVar.f90162c;
        if (bVar != null && (sVar = bVar.f89987a) != null && !sVar.f90243b.isEmpty() && (list = sVar.f90245d) != null && !list.isEmpty()) {
            t8.b bVar2 = pVar.f90162c;
            g0.m(bVar2);
            List<t8.k> list2 = bVar2.f89987a.f90245d;
            g0.m(list2);
            HashMap hashMap = new HashMap(list2.size());
            t8.b bVar3 = pVar.f90162c;
            g0.m(bVar3);
            List<t8.k> list3 = bVar3.f89987a.f90245d;
            if (list3 != null) {
                int i12 = 0;
                for (Object obj : list3) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        h0.b0();
                    }
                    t8.k kVar = (t8.k) obj;
                    if (i12 != 0 || (str = kVar.f90106g) == null || str.length() == 0) {
                        List list4 = (List) hashMap.get(Long.valueOf(kVar.f90102c));
                        if (list4 == null) {
                            list4 = new ArrayList();
                            hashMap.put(Long.valueOf(kVar.f90102c), list4);
                        }
                        pVar2 = pVar;
                        cVar = cdn;
                        s2 w11 = w(pVar2, kVar, false, cVar, 4, null);
                        if (w11 != null) {
                            list4.add(w11);
                        }
                    } else {
                        pVar2 = pVar;
                        cVar = cdn;
                    }
                    i12 = i13;
                    pVar = pVar2;
                    cdn = cVar;
                }
            }
            t8.p pVar3 = pVar;
            t8.b bVar4 = pVar3.f90162c;
            g0.m(bVar4);
            ArrayList arrayList = new ArrayList(bVar4.f89987a.f90243b.size());
            t8.b bVar5 = pVar3.f90162c;
            g0.m(bVar5);
            Iterator<T> it = bVar5.f89987a.f90243b.iterator();
            while (true) {
                boolean z11 = true;
                if (!it.hasNext()) {
                    break;
                }
                t8.f fVar = (t8.f) it.next();
                String str2 = fVar.f90019c;
                if (str2.length() <= 0) {
                    str2 = null;
                }
                if (str2 == null) {
                    str2 = "other";
                }
                String str3 = str2;
                String str4 = fVar.f90020d;
                double d11 = fVar.f90017a;
                String str5 = fVar.f90019c;
                if (str5.length() <= 0) {
                    str5 = null;
                }
                if (str5 != null) {
                    Integer num = orderMap.get(str5);
                    i11 = num != null ? num.intValue() : 0;
                } else {
                    i11 = Integer.MAX_VALUE;
                }
                int i14 = i11;
                Object obj2 = hashMap.get(Long.valueOf(fVar.f90017a));
                List list5 = (List) obj2;
                if (list5 != null && !list5.isEmpty()) {
                    z11 = false;
                }
                if (z11) {
                    obj2 = null;
                }
                List list6 = (List) obj2;
                if (list6 == null || (s2VarArr = (s2[]) list6.toArray(new s2[0])) == null) {
                    s2VarArr = new s2[0];
                }
                arrayList.add(new b2(str3, str4, d11, i14, s2VarArr));
            }
            final x00.p pVar4 = new x00.p() { // from class: a7.q
                @Override // x00.p
                public final Object invoke(Object obj3, Object obj4) {
                    int j11;
                    j11 = t.j((b2) obj3, (b2) obj4);
                    return Integer.valueOf(j11);
                }
            };
            l0.r0(arrayList, new Comparator() { // from class: a7.r
                @Override // java.util.Comparator
                public final int compare(Object obj3, Object obj4) {
                    int k11;
                    k11 = t.k(x00.p.this, obj3, obj4);
                    return k11;
                }
            });
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList != null) {
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (!(((b2) it2.next()).h().length == 0)) {
                            break;
                        }
                    }
                }
                arrayList = null;
                if (arrayList != null) {
                    return new o1.e((b2[]) arrayList.toArray(new b2[0]));
                }
            }
        }
        return null;
    }

    public static final int j(b2 b2Var, b2 b2Var2) {
        return g0.t(b2Var.k(), b2Var2.k());
    }

    public static final int k(x00.p pVar, Object obj, Object obj2) {
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0100, code lost:
    
        if (r2 == null) goto L49;
     */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final k3.o1.f l(@m80.k t8.p r12) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.t.l(t8.p):k3.o1$f");
    }

    public static final s2[] m(List<s2> list) {
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            List<s2> list2 = list;
            ArrayList arrayList2 = new ArrayList(i0.d0(list2, 10));
            int i11 = 0;
            for (Object obj : list2) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    h0.b0();
                }
                s2 s2Var = (s2) obj;
                s2Var.s(i12);
                arrayList2.add(s2Var);
                i11 = i12;
            }
            arrayList.addAll(arrayList2);
        }
        return (s2[]) arrayList.toArray(new s2[0]);
    }

    @m80.l
    public static final o1.g n(@m80.l List<t8.l> list) {
        List<t8.l> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            t8.l lVar = list.get(i11);
            double d11 = lVar.f90118a;
            int i12 = lVar.f90119b;
            double d12 = lVar.f90120c;
            String str = lVar.f90121d;
            String str2 = lVar.f90122e;
            Integer num = lVar.f90123f;
            arrayList.add(new c2(d11, i12, d12, str, str2, num != null ? num.intValue() : 0));
        }
        return new o1.g((c2[]) arrayList.toArray(new c2[0]));
    }

    @m80.k
    public static final s2 o(@m80.k t8.f fVar, @m80.k String word) {
        g0.p(fVar, "<this>");
        g0.p(word, "word");
        return new s2(fVar.f90018b, word, fVar.f90020d, null, null, null, null, 0, R.styleable.Theme_drawable_walk_sound4, null);
    }

    @m80.l
    public static final o1.h p(@m80.l List<t8.m> list) {
        List<t8.m> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new j4(list.get(i11).f90132a, list.get(i11).f90134c));
        }
        return new o1.h((j4[]) arrayList.toArray(new j4[0]));
    }

    @m80.l
    public static final o1.i q(@m80.l List<t8.n> list) {
        List<t8.n> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new j4(list.get(i11).f90143d, list.get(i11).f90144e));
        }
        return new o1.i((j4[]) arrayList.toArray(new j4[0]));
    }

    @m80.l
    public static final o1.l r(@m80.k t8.p pVar, @m80.k o7.c cdn) {
        String str;
        String str2;
        g0.p(pVar, "<this>");
        g0.p(cdn, "cdn");
        u uVar = pVar.f90163d;
        if (uVar == null || (str = uVar.f90275d) == null || str.length() == 0 || (str2 = uVar.f90276e) == null || str2.length() == 0) {
            return null;
        }
        String str3 = uVar.f90276e;
        g0.m(str3);
        String a11 = cdn.a(str3);
        String str4 = uVar.f90275d;
        g0.m(str4);
        return new o1.l(a11, cdn.a(str4));
    }

    @m80.l
    public static final o1.j s(@m80.k t8.p pVar, @m80.k o7.c cdn) {
        t8.s sVar;
        t8.r rVar;
        String str;
        g0.p(pVar, "<this>");
        g0.p(cdn, "cdn");
        t8.b bVar = pVar.f90162c;
        if (bVar == null || (sVar = bVar.f89987a) == null || (rVar = sVar.f90242a) == null || (str = rVar.f90230g) == null) {
            return null;
        }
        if (str.length() <= 0) {
            str = null;
        }
        if (str != null) {
            return new o1.j(cdn.a(str));
        }
        return null;
    }

    @m80.l
    public static final o1.k t(@m80.k t8.p pVar) {
        t8.s sVar;
        t8.r rVar;
        String str;
        t8.q qVar;
        g0.p(pVar, "<this>");
        t8.b bVar = pVar.f90162c;
        if (bVar == null || (sVar = bVar.f89987a) == null || (rVar = sVar.f90242a) == null || (str = rVar.f90225b) == null || bVar == null || sVar == null || (qVar = sVar.f90249h) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        x(arrayList, qVar.f90171b, z("pl"));
        x(arrayList, qVar.f90173d, z(com.alipay.sdk.m.k.b.f10659o));
        x(arrayList, qVar.f90179j, z("ing"));
        x(arrayList, qVar.f90175f, z("past"));
        x(arrayList, qVar.f90177h, z("done"));
        x(arrayList, qVar.f90181l, z("er"));
        x(arrayList, qVar.f90183n, z("est"));
        x(arrayList, qVar.f90189t, z("verb"));
        x(arrayList, qVar.f90191v, z("noun"));
        x(arrayList, qVar.f90193x, z("adj"));
        x(arrayList, qVar.f90187r, z("adv"));
        x(arrayList, qVar.f90185p, z("prep"));
        x(arrayList, qVar.f90195z, z("conn"));
        return new o1.k(str, (i4[]) arrayList.toArray(new i4[0]));
    }

    @m80.k
    public static final o1[] u(@m80.k t8.p topicRes, int i11, boolean z11, @m80.k o7.c cdn) {
        o1.h p11;
        t8.s sVar;
        List<t8.n> list;
        o1.a d11;
        t8.s sVar2;
        List<t8.n> list2;
        o1.i q11;
        t8.s sVar3;
        List<t8.l> list3;
        o1.g n11;
        t1[] f11;
        g0.p(topicRes, "topicRes");
        g0.p(cdn, "cdn");
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        o1.b e11 = e(topicRes, i11, z11, cdn);
        u1 o11 = e11.o();
        if (o11 != null && (f11 = o11.f()) != null) {
            for (t1 t1Var : f11) {
                hashMap.put(t1Var.h(), Integer.valueOf(t1Var.f()));
            }
        }
        arrayList.add(e11);
        o1.k t11 = t(topicRes);
        if (t11 != null) {
            arrayList.add(t11);
        }
        o1.d h11 = h(topicRes, cdn);
        if (h11 != null) {
            arrayList.add(h11);
        }
        o1.e i12 = i(topicRes, hashMap, cdn);
        if (i12 != null) {
            arrayList.add(i12);
        }
        o1.l r11 = r(topicRes, cdn);
        if (r11 != null) {
            arrayList.add(r11);
        }
        t8.b bVar = topicRes.f90162c;
        if (bVar != null && (sVar3 = bVar.f89987a) != null && (list3 = sVar3.f90246e) != null && (n11 = n(list3)) != null) {
            arrayList.add(n11);
        }
        t8.b bVar2 = topicRes.f90162c;
        if (bVar2 != null && (sVar2 = bVar2.f89987a) != null && (list2 = sVar2.f90248g) != null && (q11 = q(list2)) != null) {
            arrayList.add(q11);
        }
        t8.b bVar3 = topicRes.f90162c;
        if (bVar3 != null && (sVar = bVar3.f89987a) != null && (list = sVar.f90247f) != null && (d11 = d(list)) != null) {
            arrayList.add(d11);
        }
        List<t8.m> list4 = topicRes.f90164e;
        if (list4 != null && (p11 = p(list4)) != null) {
            arrayList.add(p11);
        }
        o1.c g11 = g(topicRes);
        if (g11 != null) {
            arrayList.add(g11);
        }
        o1.f l11 = l(topicRes);
        if (l11 != null) {
            arrayList.add(l11);
        }
        o1.j s11 = s(topicRes, cdn);
        if (s11 != null) {
            arrayList.add(s11);
        }
        return (o1[]) arrayList.toArray(new o1[0]);
    }

    public static final s2 v(t8.p pVar, t8.k kVar, boolean z11, o7.c cVar) {
        t8.s sVar;
        List<t8.k> list;
        String str;
        t8.b bVar = pVar.f90162c;
        if (bVar != null && (sVar = bVar.f89987a) != null && (list = sVar.f90245d) != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null && (str = kVar.f90106g) != null) {
                if (str.length() <= 0) {
                    str = null;
                }
                if (str != null) {
                    String a11 = cVar.a(str);
                    if (z11 && (a11 == null || a11.length() == 0)) {
                        return null;
                    }
                    t8.b bVar2 = pVar.f90162c;
                    g0.m(bVar2);
                    int i11 = bVar2.f89987a.f90242a.f90224a;
                    t8.b bVar3 = pVar.f90162c;
                    g0.m(bVar3);
                    String str2 = bVar3.f89987a.f90242a.f90225b;
                    String str3 = kVar.f90103d;
                    String str4 = kVar.f90104e;
                    String str5 = kVar.f90105f;
                    String str6 = kVar.f90107h;
                    return new s2(i11, str2, str3, str4, str5, str6 != null ? cVar.a(str6) : null, a11, 0, 128, null);
                }
            }
        }
        return null;
    }

    public static /* synthetic */ s2 w(t8.p pVar, t8.k kVar, boolean z11, o7.c cVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return v(pVar, kVar, z11, cVar);
    }

    public static final void x(List<i4> list, String str, String str2) {
        if (str == null || str.length() == 0) {
            return;
        }
        list.add(new i4(str2, str));
    }

    public static final String y(t8.p pVar) {
        String str;
        String str2;
        t8.b bVar = pVar.f90162c;
        if (bVar != null && (str = bVar.f89988b) != null && str.length() != 0 && (str2 = bVar.f89989c) != null && str2.length() != 0) {
            String str3 = bVar.f89989c;
            g0.m(str3);
            String z11 = z(str3);
            if (z11.length() <= 0) {
                z11 = null;
            }
            if (z11 != null) {
                String str4 = bVar.f89988b + " 的" + z11;
                if (str4 != null) {
                    return str4;
                }
            }
            z6.b.f(z6.b.f101032b, n.f2177a, "no type of [" + bVar.f89989c + "] found", null, 4, null);
        }
        return null;
    }

    public static final String z(String str) {
        String str2 = f2182a.get(str);
        if (str2 == null) {
            str2 = "";
        }
        return str2;
    }
}
