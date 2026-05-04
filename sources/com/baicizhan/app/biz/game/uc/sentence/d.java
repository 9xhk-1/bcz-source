package com.baicizhan.app.biz.game.uc.sentence;

import a00.h0;
import a00.k1;
import a00.l1;
import a00.r0;
import g10.u;
import h5.l0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import oa0.r;
import p8.n0;
import p8.o0;
import p8.q0;
import p8.s0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nExtractUnitInfoUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExtractUnitInfoUC.kt\ncom/baicizhan/app/biz/game/uc/sentence/ExtractUnitInfoUC\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,209:1\n1491#2:210\n1516#2,3:211\n1519#2,3:221\n1252#2,2:226\n1056#2:228\n1255#2:229\n774#2:230\n865#2,2:231\n1491#2:233\n1516#2,3:234\n1519#2,3:244\n1252#2,2:249\n1056#2:251\n1255#2:252\n774#2:253\n865#2,2:254\n360#2,7:256\n360#2,7:263\n1491#2:270\n1516#2,3:271\n1519#2,3:281\n1252#2,2:286\n1056#2:288\n1255#2:289\n774#2:290\n865#2,2:291\n295#2:293\n1761#2,3:294\n296#2:297\n1491#2:298\n1516#2,3:299\n1519#2,3:309\n1252#2,2:314\n1056#2:316\n1255#2:317\n774#2:319\n865#2,2:320\n360#2,7:322\n774#2:329\n865#2,2:330\n1056#2:332\n774#2:333\n865#2,2:334\n1056#2:336\n774#2:337\n865#2:338\n1761#2,3:339\n866#2:342\n360#2,7:343\n1761#2,3:350\n1563#2:353\n1634#2,3:354\n360#2,7:357\n1869#2,2:364\n382#3,7:214\n463#3:224\n413#3:225\n382#3,7:237\n463#3:247\n413#3:248\n382#3,7:274\n463#3:284\n413#3:285\n382#3,7:302\n463#3:312\n413#3:313\n1#4:318\n*S KotlinDebug\n*F\n+ 1 ExtractUnitInfoUC.kt\ncom/baicizhan/app/biz/game/uc/sentence/ExtractUnitInfoUC\n*L\n35#1:210\n35#1:211,3\n35#1:221,3\n36#1:226,2\n36#1:228\n36#1:229\n38#1:230\n38#1:231,2\n48#1:233\n48#1:234,3\n48#1:244,3\n49#1:249,2\n49#1:251\n49#1:252\n51#1:253\n51#1:254,2\n57#1:256,7\n58#1:263,7\n75#1:270\n75#1:271,3\n75#1:281,3\n76#1:286,2\n76#1:288\n76#1:289\n78#1:290\n78#1:291,2\n96#1:293\n98#1:294,3\n96#1:297\n123#1:298\n123#1:299,3\n123#1:309,3\n124#1:314,2\n124#1:316\n124#1:317\n167#1:319\n167#1:320,2\n172#1:322,7\n173#1:329\n173#1:330,2\n173#1:332\n176#1:333\n176#1:334,2\n176#1:336\n178#1:337\n178#1:338\n178#1:339,3\n178#1:342\n180#1:343,7\n183#1:350,3\n190#1:353\n190#1:354,3\n198#1:357,7\n140#1:364,2\n35#1:214,7\n36#1:224\n36#1:225\n48#1:237,7\n49#1:247\n49#1:248\n75#1:274,7\n76#1:284\n76#1:285\n123#1:302,7\n124#1:312\n124#1:313\n*E\n"})
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final x5.b f15221a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x5.c f15222b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final List<n0> f15223a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final Map<Integer, Integer> f15224b;

        public a(@m80.k List<n0> leaves, @m80.k Map<Integer, Integer> leafToRootMap) {
            g0.p(leaves, "leaves");
            g0.p(leafToRootMap, "leafToRootMap");
            this.f15223a = leaves;
            this.f15224b = leafToRootMap;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a d(a aVar, List list, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = aVar.f15223a;
            }
            if ((i11 & 2) != 0) {
                map = aVar.f15224b;
            }
            return aVar.c(list, map);
        }

        @m80.k
        public final List<n0> a() {
            return this.f15223a;
        }

        @m80.k
        public final Map<Integer, Integer> b() {
            return this.f15224b;
        }

        @m80.k
        public final a c(@m80.k List<n0> leaves, @m80.k Map<Integer, Integer> leafToRootMap) {
            g0.p(leaves, "leaves");
            g0.p(leafToRootMap, "leafToRootMap");
            return new a(leaves, leafToRootMap);
        }

        @m80.k
        public final Map<Integer, Integer> e() {
            return this.f15224b;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return g0.g(this.f15223a, aVar.f15223a) && g0.g(this.f15224b, aVar.f15224b);
        }

        @m80.k
        public final List<n0> f() {
            return this.f15223a;
        }

        public int hashCode() {
            return (this.f15223a.hashCode() * 31) + this.f15224b.hashCode();
        }

        @m80.k
        public String toString() {
            return "LeafChaptersResult(leaves=" + this.f15223a + ", leafToRootMap=" + this.f15224b + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.sentence.ExtractUnitInfoUC", f = "ExtractUnitInfoUC.kt", i = {0, 0, 1, 1, 1}, l = {45, 46}, m = "checkUnit", n = {"skuId", "targetId", "sentenceInfo", "skuId", "targetId"}, s = {"I$0", "I$1", "L$0", "I$0", "I$1"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f15225a;

        /* renamed from: b, reason: collision with root package name */
        public int f15226b;

        /* renamed from: c, reason: collision with root package name */
        public Object f15227c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f15228d;

        /* renamed from: f, reason: collision with root package name */
        public int f15230f;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f15228d = obj;
            this.f15230f |= Integer.MIN_VALUE;
            return d.this.a(0, 0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ExtractUnitInfoUC.kt\ncom/baicizhan/app/biz/game/uc/sentence/ExtractUnitInfoUC\n*L\n1#1,328:1\n49#2:329\n*E\n"})
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return e00.g.l(Integer.valueOf(((q0) t11).f80078e), Integer.valueOf(((q0) t12).f80078e));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ExtractUnitInfoUC.kt\ncom/baicizhan/app/biz/game/uc/sentence/ExtractUnitInfoUC\n*L\n1#1,328:1\n176#2:329\n*E\n"})
    /* renamed from: com.baicizhan.app.biz.game.uc.sentence.d$d, reason: collision with other inner class name */
    public static final class C0224d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return e00.g.l(Integer.valueOf(((q0) t11).f80078e), Integer.valueOf(((q0) t12).f80078e));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ExtractUnitInfoUC.kt\ncom/baicizhan/app/biz/game/uc/sentence/ExtractUnitInfoUC\n*L\n1#1,328:1\n173#2:329\n*E\n"})
    public static final class e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return e00.g.l(Integer.valueOf(((q0) t11).f80078e), Integer.valueOf(((q0) t12).f80078e));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ExtractUnitInfoUC.kt\ncom/baicizhan/app/biz/game/uc/sentence/ExtractUnitInfoUC\n*L\n1#1,328:1\n76#2:329\n*E\n"})
    public static final class f<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return e00.g.l(Integer.valueOf(((q0) t11).f80078e), Integer.valueOf(((q0) t12).f80078e));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ExtractUnitInfoUC.kt\ncom/baicizhan/app/biz/game/uc/sentence/ExtractUnitInfoUC\n*L\n1#1,328:1\n124#2:329\n*E\n"})
    public static final class g<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return e00.g.l(Integer.valueOf(((n0) t11).f80013d), Integer.valueOf(((n0) t12).f80013d));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.sentence.ExtractUnitInfoUC", f = "ExtractUnitInfoUC.kt", i = {0, 1, 1, 2, 2, 2}, l = {64, 65, 66}, m = "getUnitInProgressing", n = {"skuId", "sentenceInfo", "skuId", "sentenceInfo", "roadMap", "skuId"}, s = {"I$0", "L$0", "I$0", "L$0", "L$1", "I$0"}, v = 1)
    public static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f15231a;

        /* renamed from: b, reason: collision with root package name */
        public Object f15232b;

        /* renamed from: c, reason: collision with root package name */
        public Object f15233c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f15234d;

        /* renamed from: f, reason: collision with root package name */
        public int f15236f;

        public h(j00.c<? super h> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f15234d = obj;
            this.f15236f |= Integer.MIN_VALUE;
            return d.this.h(0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ExtractUnitInfoUC.kt\ncom/baicizhan/app/biz/game/uc/sentence/ExtractUnitInfoUC\n*L\n1#1,328:1\n36#2:329\n*E\n"})
    public static final class i<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return e00.g.l(Integer.valueOf(((q0) t11).f80078e), Integer.valueOf(((q0) t12).f80078e));
        }
    }

    public d(@m80.k x5.b sentenceRepo, @m80.k x5.c sentenceMapRepo) {
        g0.p(sentenceRepo, "sentenceRepo");
        g0.p(sentenceMapRepo, "sentenceMapRepo");
        this.f15221a = sentenceRepo;
        this.f15222b = sentenceMapRepo;
    }

    public static final void g(Map<Integer, ? extends List<n0>> map, List<n0> list, List<n0> list2, Map<Integer, Integer> map2, int i11, int i12) {
        Object obj;
        List<n0> list3 = map.get(Integer.valueOf(i11));
        if (list3 == null) {
            list3 = h0.J();
        }
        if (!list3.isEmpty()) {
            for (n0 n0Var : list3) {
                g(map, list, list2, map2, n0Var.f80010a, i11 == -1 ? n0Var.f80010a : i12);
            }
            return;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((n0) obj).f80010a == i11) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        n0 n0Var2 = (n0) obj;
        if (n0Var2 != null) {
            list2.add(n0Var2);
            map2.put(Integer.valueOf(n0Var2.f80010a), Integer.valueOf(i12));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0060, code lost:
    
        if (r2 == r4) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ce A[LOOP:1: B:22:0x00c8->B:24:0x00ce, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r19, int r20, @m80.k j00.c<? super java.lang.Boolean> r21) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.sentence.d.a(int, int, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cb, code lost:
    
        if (r8 != null) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final h5.l0 b(int r20, p8.s0 r21, p8.o0 r22, java.util.List<p8.n0> r23, java.util.Map<java.lang.Integer, java.lang.Integer> r24) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.sentence.d.b(int, p8.s0, p8.o0, java.util.List, java.util.Map):h5.l0");
    }

    @m80.l
    public final Object c(@m80.k s0 s0Var, @m80.k o0 o0Var, @m80.k j00.c<? super l0> cVar) {
        List<q0> list = s0Var.f80114c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Integer f11 = l00.a.f(((q0) obj).f80076c);
            Object obj2 = linkedHashMap.get(f11);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(f11, obj2);
            }
            ((List) obj2).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(k1.j(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), r0.z5((List) entry.getValue(), new f()));
        }
        a f12 = f(s0Var.f80113b);
        List<n0> f13 = f12.f();
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : f13) {
            if (linkedHashMap2.containsKey(l00.a.f(((n0) obj3).f80010a))) {
                arrayList.add(obj3);
            }
        }
        l0 b11 = b(e(o0Var, linkedHashMap2, arrayList), s0Var, o0Var, arrayList, f12.e());
        z6.b.j(z6.b.f101032b, com.baicizhan.app.biz.game.uc.sentence.e.f15237a, "extractUnitInProgressing: unitId=" + b11, null, 4, null);
        return b11;
    }

    public final List<q0> d(List<q0> list, List<Integer> list2) {
        if (list2 != null) {
            if (list2.isEmpty()) {
                list2 = null;
            }
            if (list2 != null) {
                Iterator<q0> it = list.iterator();
                int i11 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i11 = -1;
                        break;
                    }
                    if (list2.contains(Integer.valueOf(it.next().f80074a))) {
                        break;
                    }
                    i11++;
                }
                List<q0> subList = i11 >= 0 ? list.subList(0, i11) : list;
                if (subList != null) {
                    return subList;
                }
            }
        }
        return list;
    }

    public final int e(o0 o0Var, Map<Integer, ? extends List<q0>> map, List<n0> list) {
        Object obj;
        List<Integer> list2 = o0Var.f80032e;
        if (list2 == null) {
            list2 = h0.J();
        }
        List<Integer> list3 = o0Var.f80033f;
        if (list3 == null) {
            list3 = h0.J();
        }
        Iterator<T> it = list.iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            n0 n0Var = (n0) obj;
            z6.b.d(z6.b.f101032b, com.baicizhan.app.biz.game.uc.sentence.e.f15237a, "unit lesson " + map.get(Integer.valueOf(n0Var.f80010a)), null, 4, null);
            List<q0> list4 = map.get(Integer.valueOf(n0Var.f80010a));
            g0.m(list4);
            List<q0> list5 = list4;
            if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                for (q0 q0Var : list5) {
                    if (!list2.contains(Integer.valueOf(q0Var.f80074a)) || list3.contains(Integer.valueOf(q0Var.f80074a))) {
                        break loop0;
                    }
                }
            }
        }
        n0 n0Var2 = (n0) obj;
        if (n0Var2 == null) {
            n0Var2 = (n0) r0.u3(list);
        }
        int indexOf = list.indexOf(n0Var2);
        List<q0> list6 = map.get(Integer.valueOf(n0Var2.f80010a));
        if (list6 == null) {
            list6 = h0.J();
        }
        if (list6.isEmpty() || list3.contains(Integer.valueOf(((q0) r0.G2(list6)).f80074a))) {
            indexOf--;
        }
        return list.get(u.u(indexOf, 0)).f80010a;
    }

    public final a f(List<n0> list) {
        if (list.isEmpty()) {
            return new a(h0.J(), l1.z());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Integer valueOf = Integer.valueOf(((n0) obj).f80012c);
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(valueOf, obj2);
            }
            ((List) obj2).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(k1.j(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), r0.z5((List) entry.getValue(), new g()));
        }
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        g(linkedHashMap2, list, arrayList, linkedHashMap3, -1, -1);
        return new a(arrayList, linkedHashMap3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        if (r8 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r8 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(int r7, @m80.k j00.c<? super h5.l0> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.baicizhan.app.biz.game.uc.sentence.d.h
            if (r0 == 0) goto L13
            r0 = r8
            com.baicizhan.app.biz.game.uc.sentence.d$h r0 = (com.baicizhan.app.biz.game.uc.sentence.d.h) r0
            int r1 = r0.f15236f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15236f = r1
            goto L18
        L13:
            com.baicizhan.app.biz.game.uc.sentence.d$h r0 = new com.baicizhan.app.biz.game.uc.sentence.d$h
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f15234d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f15236f
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4f
            if (r2 == r5) goto L49
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r7 = r0.f15233c
            p8.s0 r7 = (p8.s0) r7
            java.lang.Object r7 = r0.f15232b
            p8.o0 r7 = (p8.o0) r7
            kotlin.e.n(r8)
            return r8
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            int r7 = r0.f15231a
            java.lang.Object r2 = r0.f15232b
            p8.o0 r2 = (p8.o0) r2
            kotlin.e.n(r8)
            goto L71
        L49:
            int r7 = r0.f15231a
            kotlin.e.n(r8)
            goto L5f
        L4f:
            kotlin.e.n(r8)
            x5.b r8 = r6.f15221a
            r0.f15231a = r7
            r0.f15236f = r5
            java.lang.Object r8 = r8.a(r7, r0)
            if (r8 != r1) goto L5f
            goto L89
        L5f:
            r2 = r8
            p8.o0 r2 = (p8.o0) r2
            x5.c r8 = r6.f15222b
            r0.f15232b = r2
            r0.f15231a = r7
            r0.f15236f = r4
            java.lang.Object r8 = r8.b(r7, r0)
            if (r8 != r1) goto L71
            goto L89
        L71:
            p8.s0 r8 = (p8.s0) r8
            java.lang.Object r4 = l00.k.a(r2)
            r0.f15232b = r4
            java.lang.Object r4 = l00.k.a(r8)
            r0.f15233c = r4
            r0.f15231a = r7
            r0.f15236f = r3
            java.lang.Object r7 = r6.c(r8, r2, r0)
            if (r7 != r1) goto L8a
        L89:
            return r1
        L8a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.sentence.d.h(int, j00.c):java.lang.Object");
    }

    @m80.k
    public final l0 i(int i11, @m80.k s0 sku, @m80.k o0 sentenceCurrentInfo) {
        g0.p(sku, "sku");
        g0.p(sentenceCurrentInfo, "sentenceCurrentInfo");
        List<q0> list = sku.f80114c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Integer valueOf = Integer.valueOf(((q0) obj).f80076c);
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(valueOf, obj2);
            }
            ((List) obj2).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(k1.j(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), r0.z5((List) entry.getValue(), new i()));
        }
        a f11 = f(sku.f80113b);
        List<n0> f12 = f11.f();
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : f12) {
            if (linkedHashMap2.containsKey(Integer.valueOf(((n0) obj3).f80010a))) {
                arrayList.add(obj3);
            }
        }
        l0 b11 = b(i11, sku, sentenceCurrentInfo, arrayList, f11.e());
        z6.b.j(z6.b.f101032b, com.baicizhan.app.biz.game.uc.sentence.e.f15237a, "Extracting unit by Id unitId=" + i11 + " unit = " + b11, null, 4, null);
        return b11;
    }
}
