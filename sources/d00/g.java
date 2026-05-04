package d00;

import a00.a0;
import a00.a1;
import a00.b1;
import a00.h0;
import a00.i0;
import a00.k1;
import a00.m0;
import a00.o0;
import a00.q;
import a00.r0;
import g10.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.random.Random;
import m80.k;
import org.junit.jupiter.api.j2;
import w00.j;
import x00.l;
import x00.p;
import yz.c2;
import yz.d2;
import yz.g2;
import yz.h1;
import yz.n;
import yz.o;
import yz.o1;
import yz.p0;
import yz.p1;
import yz.s1;
import yz.t1;
import yz.w0;
import yz.w1;
import yz.x1;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\n_UArrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _UArrays.kt\nkotlin/collections/unsigned/UArraysKt___UArraysKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,11226:1\n3976#1:11276\n3984#1:11277\n3992#1:11278\n4000#1:11279\n3976#1:11280\n3984#1:11281\n3992#1:11282\n4000#1:11283\n3976#1:11284\n3984#1:11285\n3992#1:11286\n4000#1:11287\n3976#1:11344\n3984#1:11345\n3992#1:11346\n4000#1:11347\n3976#1:11348\n3984#1:11349\n3992#1:11350\n4000#1:11351\n3976#1:11352\n3984#1:11353\n3992#1:11354\n4000#1:11355\n3976#1:11356\n3984#1:11357\n3992#1:11358\n4000#1:11359\n3976#1:11360\n3984#1:11361\n3992#1:11362\n4000#1:11363\n3976#1:11364\n3984#1:11365\n3992#1:11366\n4000#1:11367\n3976#1:11368\n3984#1:11369\n3992#1:11370\n4000#1:11371\n3976#1:11372\n3984#1:11373\n3992#1:11374\n4000#1:11375\n3976#1:11376\n3984#1:11377\n3992#1:11378\n4000#1:11379\n3976#1:11380\n3984#1:11381\n3992#1:11382\n4000#1:11383\n3976#1:11384\n3984#1:11385\n3992#1:11386\n4000#1:11387\n3976#1:11388\n3984#1:11389\n3992#1:11390\n4000#1:11391\n3976#1:11392\n3984#1:11393\n3992#1:11394\n4000#1:11395\n3976#1:11396\n3984#1:11397\n3992#1:11398\n4000#1:11399\n3976#1:11400\n3984#1:11401\n3992#1:11402\n4000#1:11403\n3976#1:11404\n3984#1:11405\n3992#1:11406\n4000#1:11407\n3976#1:11408\n3984#1:11409\n3992#1:11410\n4000#1:11411\n3976#1:11412\n3984#1:11413\n3992#1:11414\n4000#1:11415\n3976#1:11416\n3984#1:11417\n3992#1:11418\n4000#1:11419\n3976#1:11420\n3984#1:11421\n3992#1:11422\n4000#1:11423\n3976#1:11424\n3984#1:11425\n3992#1:11426\n4000#1:11427\n3976#1:11428\n3984#1:11429\n3992#1:11430\n4000#1:11431\n3976#1:11432\n3984#1:11433\n3992#1:11434\n4000#1:11435\n3976#1:11436\n3984#1:11437\n3992#1:11438\n4000#1:11439\n3976#1:11440\n3984#1:11441\n3992#1:11442\n4000#1:11443\n3976#1:11444\n3984#1:11445\n3992#1:11446\n4000#1:11447\n3976#1:11448\n3984#1:11449\n3992#1:11450\n4000#1:11451\n3976#1:11452\n3984#1:11453\n3992#1:11454\n4000#1:11455\n3976#1:11456\n3984#1:11457\n3992#1:11458\n4000#1:11459\n3976#1:11460\n3984#1:11461\n3992#1:11462\n4000#1:11463\n3976#1:11464\n3984#1:11465\n3992#1:11466\n4000#1:11467\n3976#1:11468\n3984#1:11469\n3992#1:11470\n4000#1:11471\n3976#1:11472\n3984#1:11473\n3992#1:11474\n4000#1:11475\n3976#1:11476\n3984#1:11477\n3992#1:11478\n4000#1:11479\n3976#1:11480\n3984#1:11481\n3992#1:11482\n4000#1:11483\n3976#1:11484\n3984#1:11485\n3992#1:11486\n4000#1:11487\n3976#1:11488\n3984#1:11489\n3992#1:11490\n4000#1:11491\n3976#1:11492\n3984#1:11493\n3992#1:11494\n4000#1:11495\n1808#2,6:11227\n1820#2,6:11233\n1784#2,6:11239\n1796#2,6:11245\n1916#2,6:11251\n1928#2,6:11257\n1892#2,6:11263\n1904#2,6:11269\n1#3:11275\n382#4,7:11288\n382#4,7:11295\n382#4,7:11302\n382#4,7:11309\n382#4,7:11316\n382#4,7:11323\n382#4,7:11330\n382#4,7:11337\n*S KotlinDebug\n*F\n+ 1 _UArrays.kt\nkotlin/collections/unsigned/UArraysKt___UArraysKt\n*L\n1775#1:11276\n1792#1:11277\n1809#1:11278\n1826#1:11279\n2603#1:11280\n2620#1:11281\n2637#1:11282\n2654#1:11283\n2970#1:11284\n2986#1:11285\n3002#1:11286\n3018#1:11287\n5774#1:11344\n5794#1:11345\n5814#1:11346\n5834#1:11347\n5855#1:11348\n5877#1:11349\n5899#1:11350\n5921#1:11351\n6036#1:11352\n6057#1:11353\n6078#1:11354\n6099#1:11355\n6128#1:11356\n6164#1:11357\n6200#1:11358\n6236#1:11359\n6268#1:11360\n6300#1:11361\n6332#1:11362\n6364#1:11363\n6396#1:11364\n6421#1:11365\n6446#1:11366\n6471#1:11367\n6496#1:11368\n6521#1:11369\n6546#1:11370\n6571#1:11371\n6596#1:11372\n6623#1:11373\n6650#1:11374\n6677#1:11375\n6702#1:11376\n6725#1:11377\n6748#1:11378\n6771#1:11379\n6794#1:11380\n6817#1:11381\n6840#1:11382\n6863#1:11383\n6886#1:11384\n6911#1:11385\n6936#1:11386\n6961#1:11387\n6988#1:11388\n7015#1:11389\n7042#1:11390\n7069#1:11391\n7094#1:11392\n7119#1:11393\n7144#1:11394\n7169#1:11395\n7188#1:11396\n7205#1:11397\n7222#1:11398\n7239#1:11399\n7258#1:11400\n7277#1:11401\n7296#1:11402\n7315#1:11403\n7330#1:11404\n7345#1:11405\n7360#1:11406\n7375#1:11407\n7396#1:11408\n7417#1:11409\n7438#1:11410\n7459#1:11411\n7488#1:11412\n7524#1:11413\n7560#1:11414\n7596#1:11415\n7628#1:11416\n7660#1:11417\n7692#1:11418\n7724#1:11419\n7756#1:11420\n7781#1:11421\n7806#1:11422\n7831#1:11423\n7856#1:11424\n7881#1:11425\n7906#1:11426\n7931#1:11427\n7956#1:11428\n7983#1:11429\n8010#1:11430\n8037#1:11431\n8062#1:11432\n8085#1:11433\n8108#1:11434\n8131#1:11435\n8154#1:11436\n8177#1:11437\n8200#1:11438\n8223#1:11439\n8246#1:11440\n8271#1:11441\n8296#1:11442\n8321#1:11443\n8348#1:11444\n8375#1:11445\n8402#1:11446\n8429#1:11447\n8454#1:11448\n8479#1:11449\n8504#1:11450\n8529#1:11451\n8548#1:11452\n8565#1:11453\n8582#1:11454\n8599#1:11455\n8618#1:11456\n8637#1:11457\n8656#1:11458\n8675#1:11459\n8690#1:11460\n8705#1:11461\n8720#1:11462\n8735#1:11463\n8953#1:11464\n8978#1:11465\n9003#1:11466\n9028#1:11467\n9053#1:11468\n9078#1:11469\n9103#1:11470\n9128#1:11471\n9152#1:11472\n9176#1:11473\n9200#1:11474\n9224#1:11475\n9248#1:11476\n9272#1:11477\n9296#1:11478\n9320#1:11479\n9342#1:11480\n9367#1:11481\n9392#1:11482\n9417#1:11483\n9442#1:11484\n9468#1:11485\n9494#1:11486\n9520#1:11487\n9545#1:11488\n9570#1:11489\n9595#1:11490\n9620#1:11491\n9645#1:11492\n9669#1:11493\n9693#1:11494\n9717#1:11495\n881#1:11227,6\n891#1:11233,6\n901#1:11239,6\n911#1:11245,6\n921#1:11251,6\n931#1:11257,6\n941#1:11263,6\n951#1:11269,6\n4992#1:11288,7\n5012#1:11295,7\n5032#1:11302,7\n5052#1:11309,7\n5073#1:11316,7\n5094#1:11323,7\n5115#1:11330,7\n5136#1:11337,7\n*E\n"})
/* loaded from: classes8.dex */
public class g extends b {
    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final <V, M extends Map<? super w1, ? super V>> M A0(long[] jArr, M destination, l<? super w1, ? extends V> valueSelector) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$associateWithTo$0");
        g0.p(destination, "destination");
        g0.p(valueSelector, "valueSelector");
        int o11 = x1.o(jArr);
        for (int i11 = 0; i11 < o11; i11++) {
            long m11 = x1.m(jArr, i11);
            destination.put(w1.b(m11), valueSelector.invoke(w1.b(m11)));
        }
        return destination;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final long[] A1(long[] jArr, int i11) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$copyOf$0");
        long[] copyOf = Arrays.copyOf(jArr, i11);
        g0.o(copyOf, "copyOf(...)");
        return x1.f(copyOf);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <C extends Collection<? super o1>> C A2(byte[] bArr, C destination, p<? super Integer, ? super o1, Boolean> predicate) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$filterIndexedTo$0");
        g0.p(destination, "destination");
        g0.p(predicate, "predicate");
        int o11 = p1.o(bArr);
        int i11 = 0;
        int i12 = 0;
        while (i11 < o11) {
            byte m11 = p1.m(bArr, i11);
            int i13 = i12 + 1;
            if (predicate.invoke(Integer.valueOf(i12), o1.b(m11)).booleanValue()) {
                destination.add(o1.b(m11));
            }
            i11++;
            i12 = i13;
        }
        return destination;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R, C extends Collection<? super R>> C A3(int[] iArr, C destination, l<? super s1, ? extends Iterable<? extends R>> transform) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$flatMapTo$0");
        g0.p(destination, "destination");
        g0.p(transform, "transform");
        int o11 = t1.o(iArr);
        for (int i11 = 0; i11 < o11; i11++) {
            m0.s0(destination, transform.invoke(s1.b(t1.m(iArr, i11))));
        }
        return destination;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <K> Map<K, List<o1>> A4(byte[] bArr, l<? super o1, ? extends K> keySelector) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$groupBy$0");
        g0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int o11 = p1.o(bArr);
        for (int i11 = 0; i11 < o11; i11++) {
            byte m11 = p1.m(bArr, i11);
            K invoke = keySelector.invoke(o1.b(m11));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(o1.b(m11));
        }
        return linkedHashMap;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R> List<R> A5(long[] jArr, p<? super Integer, ? super w1, ? extends R> transform) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$mapIndexed$0");
        g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(x1.o(jArr));
        int o11 = x1.o(jArr);
        int i11 = 0;
        int i12 = 0;
        while (i11 < o11) {
            arrayList.add(transform.invoke(Integer.valueOf(i12), w1.b(x1.m(jArr, i11))));
            i11++;
            i12++;
        }
        return arrayList;
    }

    @m80.l
    @y0(version = "1.4")
    @kotlin.d
    public static final w1 A6(@k long[] jArr) {
        int compare;
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$maxOrNull$0");
        if (x1.s(jArr)) {
            return null;
        }
        long m11 = x1.m(jArr, 0);
        int Ne = a0.Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                long m12 = x1.m(jArr, i11);
                compare = Long.compare(m11 ^ Long.MIN_VALUE, m12 ^ Long.MIN_VALUE);
                if (compare < 0) {
                    m11 = m12;
                }
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return w1.b(m11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final <R> R A7(short[] sArr, Comparator<? super R> comparator, l<? super c2, ? extends R> selector) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$minOfWithOrNull$0");
        g0.p(comparator, "comparator");
        g0.p(selector, "selector");
        if (d2.s(sArr)) {
            return null;
        }
        Object obj = (R) selector.invoke(c2.b(d2.m(sArr, 0)));
        int Pe = a0.Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                Object obj2 = (R) selector.invoke(c2.b(d2.m(sArr, i11)));
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (R) obj2;
                }
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final short A8(short[] sArr) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$random$0");
        return B8(sArr, Random.Default);
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final List<w1> A9(@k long[] jArr) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$reversed$0");
        if (x1.s(jArr)) {
            return h0.J();
        }
        List<w1> d62 = r0.d6(x1.b(jArr));
        o0.t1(d62);
        return d62;
    }

    @m80.l
    @y0(version = "1.3")
    @kotlin.d
    public static final c2 Aa(@k short[] sArr) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$singleOrNull$0");
        if (d2.o(sArr) == 1) {
            return c2.b(d2.m(sArr, 0));
        }
        return null;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final List<w1> Ab(@k long[] jArr) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$sortedDescending$0");
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        g0.o(copyOf, "copyOf(...)");
        long[] f11 = x1.f(copyOf);
        ab(f11);
        return A9(f11);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final List<s1> Ac(int[] iArr, l<? super s1, Boolean> predicate) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$takeWhile$0");
        g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int o11 = t1.o(iArr);
        for (int i11 = 0; i11 < o11; i11++) {
            int m11 = t1.m(iArr, i11);
            if (!predicate.invoke(s1.b(m11)).booleanValue()) {
                break;
            }
            arrayList.add(s1.b(m11));
        }
        return arrayList;
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final <V, M extends Map<? super c2, ? super V>> M B0(short[] sArr, M destination, l<? super c2, ? extends V> valueSelector) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$associateWithTo$0");
        g0.p(destination, "destination");
        g0.p(valueSelector, "valueSelector");
        int o11 = d2.o(sArr);
        for (int i11 = 0; i11 < o11; i11++) {
            short m11 = d2.m(sArr, i11);
            destination.put(c2.b(m11), valueSelector.invoke(c2.b(m11)));
        }
        return destination;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final short[] B1(short[] sArr) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$copyOf$0");
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        g0.o(copyOf, "copyOf(...)");
        return d2.f(copyOf);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <C extends Collection<? super w1>> C B2(long[] jArr, C destination, p<? super Integer, ? super w1, Boolean> predicate) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$filterIndexedTo$0");
        g0.p(destination, "destination");
        g0.p(predicate, "predicate");
        int o11 = x1.o(jArr);
        int i11 = 0;
        int i12 = 0;
        while (i11 < o11) {
            long m11 = x1.m(jArr, i11);
            int i13 = i12 + 1;
            if (predicate.invoke(Integer.valueOf(i12), w1.b(m11)).booleanValue()) {
                destination.add(w1.b(m11));
            }
            i11++;
            i12 = i13;
        }
        return destination;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R, C extends Collection<? super R>> C B3(byte[] bArr, C destination, l<? super o1, ? extends Iterable<? extends R>> transform) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$flatMapTo$0");
        g0.p(destination, "destination");
        g0.p(transform, "transform");
        int o11 = p1.o(bArr);
        for (int i11 = 0; i11 < o11; i11++) {
            m0.s0(destination, transform.invoke(o1.b(p1.m(bArr, i11))));
        }
        return destination;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <K, V> Map<K, List<V>> B4(int[] iArr, l<? super s1, ? extends K> keySelector, l<? super s1, ? extends V> valueTransform) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$groupBy$0");
        g0.p(keySelector, "keySelector");
        g0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int o11 = t1.o(iArr);
        for (int i11 = 0; i11 < o11; i11++) {
            int m11 = t1.m(iArr, i11);
            K invoke = keySelector.invoke(s1.b(m11));
            List<V> list = linkedHashMap.get(invoke);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(invoke, list);
            }
            list.add(valueTransform.invoke(s1.b(m11)));
        }
        return linkedHashMap;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R> List<R> B5(short[] sArr, p<? super Integer, ? super c2, ? extends R> transform) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$mapIndexed$0");
        g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(d2.o(sArr));
        int o11 = d2.o(sArr);
        int i11 = 0;
        int i12 = 0;
        while (i11 < o11) {
            arrayList.add(transform.invoke(Integer.valueOf(i12), c2.b(d2.m(sArr, i11))));
            i11++;
            i12++;
        }
        return arrayList;
    }

    @m80.l
    @y0(version = "1.4")
    @kotlin.d
    public static final c2 B6(@k short[] sArr) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$maxOrNull$0");
        if (d2.s(sArr)) {
            return null;
        }
        short m11 = d2.m(sArr, 0);
        int Pe = a0.Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                short m12 = d2.m(sArr, i11);
                if (g0.t(m11 & c2.f100412d, 65535 & m12) < 0) {
                    m11 = m12;
                }
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return c2.b(m11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final <R> R B7(int[] iArr, Comparator<? super R> comparator, l<? super s1, ? extends R> selector) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$minOfWithOrNull$0");
        g0.p(comparator, "comparator");
        g0.p(selector, "selector");
        if (t1.s(iArr)) {
            return null;
        }
        Object obj = (R) selector.invoke(s1.b(t1.m(iArr, 0)));
        int Me = a0.Me(iArr);
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                Object obj2 = (R) selector.invoke(s1.b(t1.m(iArr, i11)));
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (R) obj2;
                }
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    @y0(version = "1.3")
    @kotlin.d
    public static final short B8(@k short[] sArr, @k Random random) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$random$0");
        g0.p(random, "random");
        if (d2.s(sArr)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return d2.m(sArr, random.nextInt(d2.o(sArr)));
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final List<c2> B9(@k short[] sArr) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$reversed$0");
        if (d2.s(sArr)) {
            return h0.J();
        }
        List<c2> d62 = r0.d6(d2.b(sArr));
        o0.t1(d62);
        return d62;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final c2 Ba(short[] sArr, l<? super c2, Boolean> predicate) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$singleOrNull$0");
        g0.p(predicate, "predicate");
        int o11 = d2.o(sArr);
        c2 c2Var = null;
        boolean z11 = false;
        for (int i11 = 0; i11 < o11; i11++) {
            short m11 = d2.m(sArr, i11);
            if (predicate.invoke(c2.b(m11)).booleanValue()) {
                if (z11) {
                    return null;
                }
                c2Var = c2.b(m11);
                z11 = true;
            }
        }
        if (z11) {
            return c2Var;
        }
        return null;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final List<c2> Bb(@k short[] sArr) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$sortedDescending$0");
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        g0.o(copyOf, "copyOf(...)");
        short[] f11 = d2.f(copyOf);
        db(f11);
        return B9(f11);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final List<c2> Bc(short[] sArr, l<? super c2, Boolean> predicate) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$takeWhile$0");
        g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int o11 = d2.o(sArr);
        for (int i11 = 0; i11 < o11; i11++) {
            short m11 = d2.m(sArr, i11);
            if (!predicate.invoke(c2.b(m11)).booleanValue()) {
                break;
            }
            arrayList.add(c2.b(m11));
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int C0(int[] iArr) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$component1$0");
        return t1.m(iArr, 0);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final long[] C1(long[] jArr, int i11, int i12) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$copyOfRange$0");
        return x1.f(q.k1(jArr, i11, i12));
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final List<o1> C2(byte[] bArr, l<? super o1, Boolean> predicate) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$filterNot$0");
        g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int o11 = p1.o(bArr);
        for (int i11 = 0; i11 < o11; i11++) {
            byte m11 = p1.m(bArr, i11);
            if (!predicate.invoke(o1.b(m11)).booleanValue()) {
                arrayList.add(o1.b(m11));
            }
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R> R C3(long[] jArr, R r11, p<? super R, ? super w1, ? extends R> operation) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$fold$0");
        g0.p(operation, "operation");
        int o11 = x1.o(jArr);
        for (int i11 = 0; i11 < o11; i11++) {
            r11 = operation.invoke(r11, w1.b(x1.m(jArr, i11)));
        }
        return r11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <K> Map<K, List<w1>> C4(long[] jArr, l<? super w1, ? extends K> keySelector) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$groupBy$0");
        g0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int o11 = x1.o(jArr);
        for (int i11 = 0; i11 < o11; i11++) {
            long m11 = x1.m(jArr, i11);
            K invoke = keySelector.invoke(w1.b(m11));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(w1.b(m11));
        }
        return linkedHashMap;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R, C extends Collection<? super R>> C C5(int[] iArr, C destination, p<? super Integer, ? super s1, ? extends R> transform) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$mapIndexedTo$0");
        g0.p(destination, "destination");
        g0.p(transform, "transform");
        int o11 = t1.o(iArr);
        int i11 = 0;
        int i12 = 0;
        while (i11 < o11) {
            destination.add(transform.invoke(Integer.valueOf(i12), s1.b(t1.m(iArr, i11))));
            i11++;
            i12++;
        }
        return destination;
    }

    @j(name = "maxOrThrow-U")
    @y0(version = "1.7")
    @kotlin.d
    public static final byte C6(@k byte[] bArr) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$max$0");
        if (p1.s(bArr)) {
            throw new NoSuchElementException();
        }
        byte m11 = p1.m(bArr, 0);
        int Ie = a0.Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                byte m12 = p1.m(bArr, i11);
                if (g0.t(m11 & 255, m12 & 255) < 0) {
                    m11 = m12;
                }
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return m11;
    }

    @m80.l
    @y0(version = "1.4")
    @kotlin.d
    public static final s1 C7(@k int[] iArr) {
        int compare;
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$minOrNull$0");
        if (t1.s(iArr)) {
            return null;
        }
        int m11 = t1.m(iArr, 0);
        int Me = a0.Me(iArr);
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                int m12 = t1.m(iArr, i11);
                compare = Integer.compare(m11 ^ Integer.MIN_VALUE, m12 ^ Integer.MIN_VALUE);
                if (compare > 0) {
                    m11 = m12;
                }
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return s1.b(m11);
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final s1 C8(int[] iArr) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$randomOrNull$0");
        return D8(iArr, Random.Default);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int[] C9(int[] iArr) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$reversedArray$0");
        return t1.f(a0.Or(iArr));
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final List<w1> Ca(@k long[] jArr, @k Iterable<Integer> indices) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$slice$0");
        g0.p(indices, "indices");
        int d02 = i0.d0(indices, 10);
        if (d02 == 0) {
            return h0.J();
        }
        ArrayList arrayList = new ArrayList(d02);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(w1.b(x1.m(jArr, it.next().intValue())));
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int Cb(int[] iArr) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$sum$0");
        return s1.i(a0.uw(iArr));
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final byte[] Cc(byte[] bArr) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$toByteArray$0");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        g0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final byte D0(byte[] bArr) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$component1$0");
        return p1.m(bArr, 0);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final byte[] D1(byte[] bArr, int i11, int i12) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$copyOfRange$0");
        return p1.f(q.f1(bArr, i11, i12));
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final List<w1> D2(long[] jArr, l<? super w1, Boolean> predicate) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$filterNot$0");
        g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int o11 = x1.o(jArr);
        for (int i11 = 0; i11 < o11; i11++) {
            long m11 = x1.m(jArr, i11);
            if (!predicate.invoke(w1.b(m11)).booleanValue()) {
                arrayList.add(w1.b(m11));
            }
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R> R D3(byte[] bArr, R r11, p<? super R, ? super o1, ? extends R> operation) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$fold$0");
        g0.p(operation, "operation");
        int o11 = p1.o(bArr);
        for (int i11 = 0; i11 < o11; i11++) {
            r11 = operation.invoke(r11, o1.b(p1.m(bArr, i11)));
        }
        return r11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <K, V> Map<K, List<V>> D4(byte[] bArr, l<? super o1, ? extends K> keySelector, l<? super o1, ? extends V> valueTransform) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$groupBy$0");
        g0.p(keySelector, "keySelector");
        g0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int o11 = p1.o(bArr);
        for (int i11 = 0; i11 < o11; i11++) {
            byte m11 = p1.m(bArr, i11);
            K invoke = keySelector.invoke(o1.b(m11));
            List<V> list = linkedHashMap.get(invoke);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(invoke, list);
            }
            list.add(valueTransform.invoke(o1.b(m11)));
        }
        return linkedHashMap;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R, C extends Collection<? super R>> C D5(short[] sArr, C destination, p<? super Integer, ? super c2, ? extends R> transform) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$mapIndexedTo$0");
        g0.p(destination, "destination");
        g0.p(transform, "transform");
        int o11 = d2.o(sArr);
        int i11 = 0;
        int i12 = 0;
        while (i11 < o11) {
            destination.add(transform.invoke(Integer.valueOf(i12), c2.b(d2.m(sArr, i11))));
            i11++;
            i12++;
        }
        return destination;
    }

    @j(name = "maxOrThrow-U")
    @y0(version = "1.7")
    @kotlin.d
    public static final int D6(@k int[] iArr) {
        int compare;
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$max$0");
        if (t1.s(iArr)) {
            throw new NoSuchElementException();
        }
        int m11 = t1.m(iArr, 0);
        int Me = a0.Me(iArr);
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                int m12 = t1.m(iArr, i11);
                compare = Integer.compare(m11 ^ Integer.MIN_VALUE, m12 ^ Integer.MIN_VALUE);
                if (compare < 0) {
                    m11 = m12;
                }
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return m11;
    }

    @m80.l
    @y0(version = "1.4")
    @kotlin.d
    public static final o1 D7(@k byte[] bArr) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$minOrNull$0");
        if (p1.s(bArr)) {
            return null;
        }
        byte m11 = p1.m(bArr, 0);
        int Ie = a0.Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                byte m12 = p1.m(bArr, i11);
                if (g0.t(m11 & 255, m12 & 255) > 0) {
                    m11 = m12;
                }
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return o1.b(m11);
    }

    @m80.l
    @y0(version = "1.4")
    @kotlin.d
    public static final s1 D8(@k int[] iArr, @k Random random) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$randomOrNull$0");
        g0.p(random, "random");
        if (t1.s(iArr)) {
            return null;
        }
        return s1.b(t1.m(iArr, random.nextInt(t1.o(iArr))));
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final byte[] D9(byte[] bArr) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$reversedArray$0");
        return p1.f(a0.Kr(bArr));
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final List<s1> Da(@k int[] iArr, @k Iterable<Integer> indices) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$slice$0");
        g0.p(indices, "indices");
        int d02 = i0.d0(indices, 10);
        if (d02 == 0) {
            return h0.J();
        }
        ArrayList arrayList = new ArrayList(d02);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(s1.b(t1.m(iArr, it.next().intValue())));
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int Db(byte[] bArr) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$sum$0");
        int i11 = s1.i(0);
        int o11 = p1.o(bArr);
        for (int i12 = 0; i12 < o11; i12++) {
            i11 = s1.i(i11 + s1.i(p1.m(bArr, i12) & 255));
        }
        return i11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int[] Dc(int[] iArr) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$toIntArray$0");
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        g0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final long E0(long[] jArr) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$component1$0");
        return x1.m(jArr, 0);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final short[] E1(short[] sArr, int i11, int i12) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$copyOfRange$0");
        return d2.f(q.m1(sArr, i11, i12));
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final List<s1> E2(int[] iArr, l<? super s1, Boolean> predicate) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$filterNot$0");
        g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int o11 = t1.o(iArr);
        for (int i11 = 0; i11 < o11; i11++) {
            int m11 = t1.m(iArr, i11);
            if (!predicate.invoke(s1.b(m11)).booleanValue()) {
                arrayList.add(s1.b(m11));
            }
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R> R E3(int[] iArr, R r11, p<? super R, ? super s1, ? extends R> operation) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$fold$0");
        g0.p(operation, "operation");
        int o11 = t1.o(iArr);
        for (int i11 = 0; i11 < o11; i11++) {
            r11 = operation.invoke(r11, s1.b(t1.m(iArr, i11)));
        }
        return r11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <K> Map<K, List<s1>> E4(int[] iArr, l<? super s1, ? extends K> keySelector) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$groupBy$0");
        g0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int o11 = t1.o(iArr);
        for (int i11 = 0; i11 < o11; i11++) {
            int m11 = t1.m(iArr, i11);
            K invoke = keySelector.invoke(s1.b(m11));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(s1.b(m11));
        }
        return linkedHashMap;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R, C extends Collection<? super R>> C E5(byte[] bArr, C destination, p<? super Integer, ? super o1, ? extends R> transform) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$mapIndexedTo$0");
        g0.p(destination, "destination");
        g0.p(transform, "transform");
        int o11 = p1.o(bArr);
        int i11 = 0;
        int i12 = 0;
        while (i11 < o11) {
            destination.add(transform.invoke(Integer.valueOf(i12), o1.b(p1.m(bArr, i11))));
            i11++;
            i12++;
        }
        return destination;
    }

    @j(name = "maxOrThrow-U")
    @y0(version = "1.7")
    @kotlin.d
    public static final long E6(@k long[] jArr) {
        int compare;
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$max$0");
        if (x1.s(jArr)) {
            throw new NoSuchElementException();
        }
        long m11 = x1.m(jArr, 0);
        int Ne = a0.Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                long m12 = x1.m(jArr, i11);
                compare = Long.compare(m11 ^ Long.MIN_VALUE, m12 ^ Long.MIN_VALUE);
                if (compare < 0) {
                    m11 = m12;
                }
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return m11;
    }

    @m80.l
    @y0(version = "1.4")
    @kotlin.d
    public static final w1 E7(@k long[] jArr) {
        int compare;
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$minOrNull$0");
        if (x1.s(jArr)) {
            return null;
        }
        long m11 = x1.m(jArr, 0);
        int Ne = a0.Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                long m12 = x1.m(jArr, i11);
                compare = Long.compare(m11 ^ Long.MIN_VALUE, m12 ^ Long.MIN_VALUE);
                if (compare > 0) {
                    m11 = m12;
                }
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return w1.b(m11);
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final o1 E8(byte[] bArr) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$randomOrNull$0");
        return H8(bArr, Random.Default);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final long[] E9(long[] jArr) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$reversedArray$0");
        return x1.f(a0.Pr(jArr));
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final List<c2> Ea(@k short[] sArr, @k Iterable<Integer> indices) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$slice$0");
        g0.p(indices, "indices");
        int d02 = i0.d0(indices, 10);
        if (d02 == 0) {
            return h0.J();
        }
        ArrayList arrayList = new ArrayList(d02);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(c2.b(d2.m(sArr, it.next().intValue())));
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final long Eb(long[] jArr) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$sum$0");
        return w1.i(a0.ww(jArr));
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final long[] Ec(long[] jArr) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$toLongArray$0");
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        g0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final short F0(short[] sArr) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$component1$0");
        return d2.m(sArr, 0);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int[] F1(int[] iArr, int i11, int i12) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$copyOfRange$0");
        return t1.f(q.j1(iArr, i11, i12));
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final List<c2> F2(short[] sArr, l<? super c2, Boolean> predicate) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$filterNot$0");
        g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int o11 = d2.o(sArr);
        for (int i11 = 0; i11 < o11; i11++) {
            short m11 = d2.m(sArr, i11);
            if (!predicate.invoke(c2.b(m11)).booleanValue()) {
                arrayList.add(c2.b(m11));
            }
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R> R F3(short[] sArr, R r11, p<? super R, ? super c2, ? extends R> operation) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$fold$0");
        g0.p(operation, "operation");
        int o11 = d2.o(sArr);
        for (int i11 = 0; i11 < o11; i11++) {
            r11 = operation.invoke(r11, c2.b(d2.m(sArr, i11)));
        }
        return r11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <K> Map<K, List<c2>> F4(short[] sArr, l<? super c2, ? extends K> keySelector) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$groupBy$0");
        g0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int o11 = d2.o(sArr);
        for (int i11 = 0; i11 < o11; i11++) {
            short m11 = d2.m(sArr, i11);
            K invoke = keySelector.invoke(c2.b(m11));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(c2.b(m11));
        }
        return linkedHashMap;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R, C extends Collection<? super R>> C F5(long[] jArr, C destination, p<? super Integer, ? super w1, ? extends R> transform) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$mapIndexedTo$0");
        g0.p(destination, "destination");
        g0.p(transform, "transform");
        int o11 = x1.o(jArr);
        int i11 = 0;
        int i12 = 0;
        while (i11 < o11) {
            destination.add(transform.invoke(Integer.valueOf(i12), w1.b(x1.m(jArr, i11))));
            i11++;
            i12++;
        }
        return destination;
    }

    @j(name = "maxOrThrow-U")
    @y0(version = "1.7")
    @kotlin.d
    public static final short F6(@k short[] sArr) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$max$0");
        if (d2.s(sArr)) {
            throw new NoSuchElementException();
        }
        short m11 = d2.m(sArr, 0);
        int Pe = a0.Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                short m12 = d2.m(sArr, i11);
                if (g0.t(m11 & c2.f100412d, 65535 & m12) < 0) {
                    m11 = m12;
                }
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return m11;
    }

    @m80.l
    @y0(version = "1.4")
    @kotlin.d
    public static final c2 F7(@k short[] sArr) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$minOrNull$0");
        if (d2.s(sArr)) {
            return null;
        }
        short m11 = d2.m(sArr, 0);
        int Pe = a0.Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                short m12 = d2.m(sArr, i11);
                if (g0.t(m11 & c2.f100412d, 65535 & m12) > 0) {
                    m11 = m12;
                }
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return c2.b(m11);
    }

    @m80.l
    @y0(version = "1.4")
    @kotlin.d
    public static final w1 F8(@k long[] jArr, @k Random random) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$randomOrNull$0");
        g0.p(random, "random");
        if (x1.s(jArr)) {
            return null;
        }
        return w1.b(x1.m(jArr, random.nextInt(x1.o(jArr))));
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final short[] F9(short[] sArr) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$reversedArray$0");
        return d2.f(a0.Rr(sArr));
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final List<o1> Fa(@k byte[] bArr, @k Iterable<Integer> indices) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$slice$0");
        g0.p(indices, "indices");
        int d02 = i0.d0(indices, 10);
        if (d02 == 0) {
            return h0.J();
        }
        ArrayList arrayList = new ArrayList(d02);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(o1.b(p1.m(bArr, it.next().intValue())));
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int Fb(short[] sArr) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$sum$0");
        int i11 = s1.i(0);
        int o11 = d2.o(sArr);
        for (int i12 = 0; i12 < o11; i12++) {
            i11 = s1.i(i11 + s1.i(d2.m(sArr, i12) & c2.f100412d));
        }
        return i11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final short[] Fc(short[] sArr) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$toShortArray$0");
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        g0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int G0(int[] iArr) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$component2$0");
        return t1.m(iArr, 1);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int G1(byte[] bArr, l<? super o1, Boolean> predicate) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$count$0");
        g0.p(predicate, "predicate");
        int o11 = p1.o(bArr);
        int i11 = 0;
        for (int i12 = 0; i12 < o11; i12++) {
            if (predicate.invoke(o1.b(p1.m(bArr, i12))).booleanValue()) {
                i11++;
            }
        }
        return i11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <C extends Collection<? super w1>> C G2(long[] jArr, C destination, l<? super w1, Boolean> predicate) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$filterNotTo$0");
        g0.p(destination, "destination");
        g0.p(predicate, "predicate");
        int o11 = x1.o(jArr);
        for (int i11 = 0; i11 < o11; i11++) {
            long m11 = x1.m(jArr, i11);
            if (!predicate.invoke(w1.b(m11)).booleanValue()) {
                destination.add(w1.b(m11));
            }
        }
        return destination;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R> R G3(byte[] bArr, R r11, x00.q<? super Integer, ? super R, ? super o1, ? extends R> operation) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$foldIndexed$0");
        g0.p(operation, "operation");
        int o11 = p1.o(bArr);
        int i11 = 0;
        int i12 = 0;
        while (i11 < o11) {
            r11 = operation.invoke(Integer.valueOf(i12), r11, o1.b(p1.m(bArr, i11)));
            i11++;
            i12++;
        }
        return r11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <K, M extends Map<? super K, List<s1>>> M G4(int[] iArr, M destination, l<? super s1, ? extends K> keySelector) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$groupByTo$0");
        g0.p(destination, "destination");
        g0.p(keySelector, "keySelector");
        int o11 = t1.o(iArr);
        for (int i11 = 0; i11 < o11; i11++) {
            int m11 = t1.m(iArr, i11);
            K invoke = keySelector.invoke(s1.b(m11));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(s1.b(m11));
        }
        return destination;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R, C extends Collection<? super R>> C G5(long[] jArr, C destination, l<? super w1, ? extends R> transform) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$mapTo$0");
        g0.p(destination, "destination");
        g0.p(transform, "transform");
        int o11 = x1.o(jArr);
        for (int i11 = 0; i11 < o11; i11++) {
            destination.add(transform.invoke(w1.b(x1.m(jArr, i11))));
        }
        return destination;
    }

    @m80.l
    @y0(version = "1.4")
    @kotlin.d
    public static final o1 G6(@k byte[] bArr, @k Comparator<? super o1> comparator) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$maxWithOrNull$0");
        g0.p(comparator, "comparator");
        if (p1.s(bArr)) {
            return null;
        }
        byte m11 = p1.m(bArr, 0);
        int Ie = a0.Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                byte m12 = p1.m(bArr, i11);
                if (comparator.compare(o1.b(m11), o1.b(m12)) < 0) {
                    m11 = m12;
                }
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return o1.b(m11);
    }

    @j(name = "minOrThrow-U")
    @y0(version = "1.7")
    @kotlin.d
    public static final byte G7(@k byte[] bArr) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$min$0");
        if (p1.s(bArr)) {
            throw new NoSuchElementException();
        }
        byte m11 = p1.m(bArr, 0);
        int Ie = a0.Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                byte m12 = p1.m(bArr, i11);
                if (g0.t(m11 & 255, m12 & 255) > 0) {
                    m11 = m12;
                }
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return m11;
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final w1 G8(long[] jArr) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$randomOrNull$0");
        return F8(jArr, Random.Default);
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final <R> List<R> G9(long[] jArr, R r11, p<? super R, ? super w1, ? extends R> operation) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$runningFold$0");
        g0.p(operation, "operation");
        if (x1.s(jArr)) {
            return a00.g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(x1.o(jArr) + 1);
        arrayList.add(r11);
        int o11 = x1.o(jArr);
        for (int i11 = 0; i11 < o11; i11++) {
            r11 = operation.invoke(r11, w1.b(x1.m(jArr, i11)));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final List<c2> Ga(@k short[] sArr, @k g10.l indices) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$slice$0");
        g0.p(indices, "indices");
        return indices.isEmpty() ? h0.J() : b.d(d2.f(q.m1(sArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1)));
    }

    @y0(version = "1.3")
    @kotlin.d
    @n(message = "Use sumOf instead.", replaceWith = @w0(expression = "this.sumOf(selector)", imports = {}))
    @o00.f
    @o(warningSince = "1.5")
    public static final int Gb(byte[] bArr, l<? super o1, s1> selector) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$sumBy$0");
        g0.p(selector, "selector");
        int o11 = p1.o(bArr);
        int i11 = 0;
        for (int i12 = 0; i12 < o11; i12++) {
            i11 = s1.i(i11 + selector.invoke(o1.b(p1.m(bArr, i12))).m0());
        }
        return i11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final s1[] Gc(@k int[] iArr) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$toTypedArray$0");
        int o11 = t1.o(iArr);
        s1[] s1VarArr = new s1[o11];
        for (int i11 = 0; i11 < o11; i11++) {
            s1VarArr[i11] = s1.b(t1.m(iArr, i11));
        }
        return s1VarArr;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final byte H0(byte[] bArr) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$component2$0");
        return p1.m(bArr, 1);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int H1(long[] jArr, l<? super w1, Boolean> predicate) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$count$0");
        g0.p(predicate, "predicate");
        int o11 = x1.o(jArr);
        int i11 = 0;
        for (int i12 = 0; i12 < o11; i12++) {
            if (predicate.invoke(w1.b(x1.m(jArr, i12))).booleanValue()) {
                i11++;
            }
        }
        return i11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <C extends Collection<? super c2>> C H2(short[] sArr, C destination, l<? super c2, Boolean> predicate) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$filterNotTo$0");
        g0.p(destination, "destination");
        g0.p(predicate, "predicate");
        int o11 = d2.o(sArr);
        for (int i11 = 0; i11 < o11; i11++) {
            short m11 = d2.m(sArr, i11);
            if (!predicate.invoke(c2.b(m11)).booleanValue()) {
                destination.add(c2.b(m11));
            }
        }
        return destination;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R> R H3(short[] sArr, R r11, x00.q<? super Integer, ? super R, ? super c2, ? extends R> operation) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$foldIndexed$0");
        g0.p(operation, "operation");
        int o11 = d2.o(sArr);
        int i11 = 0;
        int i12 = 0;
        while (i11 < o11) {
            r11 = operation.invoke(Integer.valueOf(i12), r11, c2.b(d2.m(sArr, i11)));
            i11++;
            i12++;
        }
        return r11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <K, M extends Map<? super K, List<o1>>> M H4(byte[] bArr, M destination, l<? super o1, ? extends K> keySelector) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$groupByTo$0");
        g0.p(destination, "destination");
        g0.p(keySelector, "keySelector");
        int o11 = p1.o(bArr);
        for (int i11 = 0; i11 < o11; i11++) {
            byte m11 = p1.m(bArr, i11);
            K invoke = keySelector.invoke(o1.b(m11));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(o1.b(m11));
        }
        return destination;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R, C extends Collection<? super R>> C H5(short[] sArr, C destination, l<? super c2, ? extends R> transform) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$mapTo$0");
        g0.p(destination, "destination");
        g0.p(transform, "transform");
        int o11 = d2.o(sArr);
        for (int i11 = 0; i11 < o11; i11++) {
            destination.add(transform.invoke(c2.b(d2.m(sArr, i11))));
        }
        return destination;
    }

    @m80.l
    @y0(version = "1.4")
    @kotlin.d
    public static final s1 H6(@k int[] iArr, @k Comparator<? super s1> comparator) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$maxWithOrNull$0");
        g0.p(comparator, "comparator");
        if (t1.s(iArr)) {
            return null;
        }
        int m11 = t1.m(iArr, 0);
        int Me = a0.Me(iArr);
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                int m12 = t1.m(iArr, i11);
                if (comparator.compare(s1.b(m11), s1.b(m12)) < 0) {
                    m11 = m12;
                }
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return s1.b(m11);
    }

    @j(name = "minOrThrow-U")
    @y0(version = "1.7")
    @kotlin.d
    public static final int H7(@k int[] iArr) {
        int compare;
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$min$0");
        if (t1.s(iArr)) {
            throw new NoSuchElementException();
        }
        int m11 = t1.m(iArr, 0);
        int Me = a0.Me(iArr);
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                int m12 = t1.m(iArr, i11);
                compare = Integer.compare(m11 ^ Integer.MIN_VALUE, m12 ^ Integer.MIN_VALUE);
                if (compare > 0) {
                    m11 = m12;
                }
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return m11;
    }

    @m80.l
    @y0(version = "1.4")
    @kotlin.d
    public static final o1 H8(@k byte[] bArr, @k Random random) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$randomOrNull$0");
        g0.p(random, "random");
        if (p1.s(bArr)) {
            return null;
        }
        return o1.b(p1.m(bArr, random.nextInt(p1.o(bArr))));
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final <R> List<R> H9(byte[] bArr, R r11, p<? super R, ? super o1, ? extends R> operation) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$runningFold$0");
        g0.p(operation, "operation");
        if (p1.s(bArr)) {
            return a00.g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(p1.o(bArr) + 1);
        arrayList.add(r11);
        int o11 = p1.o(bArr);
        for (int i11 = 0; i11 < o11; i11++) {
            r11 = operation.invoke(r11, o1.b(p1.m(bArr, i11)));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final List<w1> Ha(@k long[] jArr, @k g10.l indices) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$slice$0");
        g0.p(indices, "indices");
        return indices.isEmpty() ? h0.J() : b.c(x1.f(q.k1(jArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1)));
    }

    @y0(version = "1.3")
    @kotlin.d
    @n(message = "Use sumOf instead.", replaceWith = @w0(expression = "this.sumOf(selector)", imports = {}))
    @o00.f
    @o(warningSince = "1.5")
    public static final int Hb(long[] jArr, l<? super w1, s1> selector) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$sumBy$0");
        g0.p(selector, "selector");
        int o11 = x1.o(jArr);
        int i11 = 0;
        for (int i12 = 0; i12 < o11; i12++) {
            i11 = s1.i(i11 + selector.invoke(w1.b(x1.m(jArr, i12))).m0());
        }
        return i11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final o1[] Hc(@k byte[] bArr) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$toTypedArray$0");
        int o11 = p1.o(bArr);
        o1[] o1VarArr = new o1[o11];
        for (int i11 = 0; i11 < o11; i11++) {
            o1VarArr[i11] = o1.b(p1.m(bArr, i11));
        }
        return o1VarArr;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final long I0(long[] jArr) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$component2$0");
        return x1.m(jArr, 1);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int I1(int[] iArr, l<? super s1, Boolean> predicate) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$count$0");
        g0.p(predicate, "predicate");
        int o11 = t1.o(iArr);
        int i11 = 0;
        for (int i12 = 0; i12 < o11; i12++) {
            if (predicate.invoke(s1.b(t1.m(iArr, i12))).booleanValue()) {
                i11++;
            }
        }
        return i11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <C extends Collection<? super s1>> C I2(int[] iArr, C destination, l<? super s1, Boolean> predicate) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$filterNotTo$0");
        g0.p(destination, "destination");
        g0.p(predicate, "predicate");
        int o11 = t1.o(iArr);
        for (int i11 = 0; i11 < o11; i11++) {
            int m11 = t1.m(iArr, i11);
            if (!predicate.invoke(s1.b(m11)).booleanValue()) {
                destination.add(s1.b(m11));
            }
        }
        return destination;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R> R I3(long[] jArr, R r11, x00.q<? super Integer, ? super R, ? super w1, ? extends R> operation) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$foldIndexed$0");
        g0.p(operation, "operation");
        int o11 = x1.o(jArr);
        int i11 = 0;
        int i12 = 0;
        while (i11 < o11) {
            r11 = operation.invoke(Integer.valueOf(i12), r11, w1.b(x1.m(jArr, i11)));
            i11++;
            i12++;
        }
        return r11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <K, V, M extends Map<? super K, List<V>>> M I4(int[] iArr, M destination, l<? super s1, ? extends K> keySelector, l<? super s1, ? extends V> valueTransform) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$groupByTo$0");
        g0.p(destination, "destination");
        g0.p(keySelector, "keySelector");
        g0.p(valueTransform, "valueTransform");
        int o11 = t1.o(iArr);
        for (int i11 = 0; i11 < o11; i11++) {
            int m11 = t1.m(iArr, i11);
            K invoke = keySelector.invoke(s1.b(m11));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(s1.b(m11)));
        }
        return destination;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R, C extends Collection<? super R>> C I5(int[] iArr, C destination, l<? super s1, ? extends R> transform) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$mapTo$0");
        g0.p(destination, "destination");
        g0.p(transform, "transform");
        int o11 = t1.o(iArr);
        for (int i11 = 0; i11 < o11; i11++) {
            destination.add(transform.invoke(s1.b(t1.m(iArr, i11))));
        }
        return destination;
    }

    @m80.l
    @y0(version = "1.4")
    @kotlin.d
    public static final c2 I6(@k short[] sArr, @k Comparator<? super c2> comparator) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$maxWithOrNull$0");
        g0.p(comparator, "comparator");
        if (d2.s(sArr)) {
            return null;
        }
        short m11 = d2.m(sArr, 0);
        int Pe = a0.Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                short m12 = d2.m(sArr, i11);
                if (comparator.compare(c2.b(m11), c2.b(m12)) < 0) {
                    m11 = m12;
                }
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return c2.b(m11);
    }

    @j(name = "minOrThrow-U")
    @y0(version = "1.7")
    @kotlin.d
    public static final long I7(@k long[] jArr) {
        int compare;
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$min$0");
        if (x1.s(jArr)) {
            throw new NoSuchElementException();
        }
        long m11 = x1.m(jArr, 0);
        int Ne = a0.Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                long m12 = x1.m(jArr, i11);
                compare = Long.compare(m11 ^ Long.MIN_VALUE, m12 ^ Long.MIN_VALUE);
                if (compare > 0) {
                    m11 = m12;
                }
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return m11;
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final c2 I8(short[] sArr) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$randomOrNull$0");
        return J8(sArr, Random.Default);
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final <R> List<R> I9(int[] iArr, R r11, p<? super R, ? super s1, ? extends R> operation) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$runningFold$0");
        g0.p(operation, "operation");
        if (t1.s(iArr)) {
            return a00.g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(t1.o(iArr) + 1);
        arrayList.add(r11);
        int o11 = t1.o(iArr);
        for (int i11 = 0; i11 < o11; i11++) {
            r11 = operation.invoke(r11, s1.b(t1.m(iArr, i11)));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final List<o1> Ia(@k byte[] bArr, @k g10.l indices) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$slice$0");
        g0.p(indices, "indices");
        return indices.isEmpty() ? h0.J() : b.b(p1.f(q.f1(bArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1)));
    }

    @y0(version = "1.3")
    @kotlin.d
    @n(message = "Use sumOf instead.", replaceWith = @w0(expression = "this.sumOf(selector)", imports = {}))
    @o00.f
    @o(warningSince = "1.5")
    public static final int Ib(int[] iArr, l<? super s1, s1> selector) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$sumBy$0");
        g0.p(selector, "selector");
        int o11 = t1.o(iArr);
        int i11 = 0;
        for (int i12 = 0; i12 < o11; i12++) {
            i11 = s1.i(i11 + selector.invoke(s1.b(t1.m(iArr, i12))).m0());
        }
        return i11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final w1[] Ic(@k long[] jArr) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$toTypedArray$0");
        int o11 = x1.o(jArr);
        w1[] w1VarArr = new w1[o11];
        for (int i11 = 0; i11 < o11; i11++) {
            w1VarArr[i11] = w1.b(x1.m(jArr, i11));
        }
        return w1VarArr;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final short J0(short[] sArr) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$component2$0");
        return d2.m(sArr, 1);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int J1(short[] sArr, l<? super c2, Boolean> predicate) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$count$0");
        g0.p(predicate, "predicate");
        int o11 = d2.o(sArr);
        int i11 = 0;
        for (int i12 = 0; i12 < o11; i12++) {
            if (predicate.invoke(c2.b(d2.m(sArr, i12))).booleanValue()) {
                i11++;
            }
        }
        return i11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <C extends Collection<? super o1>> C J2(byte[] bArr, C destination, l<? super o1, Boolean> predicate) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$filterNotTo$0");
        g0.p(destination, "destination");
        g0.p(predicate, "predicate");
        int o11 = p1.o(bArr);
        for (int i11 = 0; i11 < o11; i11++) {
            byte m11 = p1.m(bArr, i11);
            if (!predicate.invoke(o1.b(m11)).booleanValue()) {
                destination.add(o1.b(m11));
            }
        }
        return destination;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R> R J3(int[] iArr, R r11, x00.q<? super Integer, ? super R, ? super s1, ? extends R> operation) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$foldIndexed$0");
        g0.p(operation, "operation");
        int o11 = t1.o(iArr);
        int i11 = 0;
        int i12 = 0;
        while (i11 < o11) {
            r11 = operation.invoke(Integer.valueOf(i12), r11, s1.b(t1.m(iArr, i11)));
            i11++;
            i12++;
        }
        return r11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <K, V, M extends Map<? super K, List<V>>> M J4(long[] jArr, M destination, l<? super w1, ? extends K> keySelector, l<? super w1, ? extends V> valueTransform) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$groupByTo$0");
        g0.p(destination, "destination");
        g0.p(keySelector, "keySelector");
        g0.p(valueTransform, "valueTransform");
        int o11 = x1.o(jArr);
        for (int i11 = 0; i11 < o11; i11++) {
            long m11 = x1.m(jArr, i11);
            K invoke = keySelector.invoke(w1.b(m11));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(w1.b(m11)));
        }
        return destination;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R, C extends Collection<? super R>> C J5(byte[] bArr, C destination, l<? super o1, ? extends R> transform) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$mapTo$0");
        g0.p(destination, "destination");
        g0.p(transform, "transform");
        int o11 = p1.o(bArr);
        for (int i11 = 0; i11 < o11; i11++) {
            destination.add(transform.invoke(o1.b(p1.m(bArr, i11))));
        }
        return destination;
    }

    @m80.l
    @y0(version = "1.4")
    @kotlin.d
    public static final w1 J6(@k long[] jArr, @k Comparator<? super w1> comparator) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$maxWithOrNull$0");
        g0.p(comparator, "comparator");
        if (x1.s(jArr)) {
            return null;
        }
        long m11 = x1.m(jArr, 0);
        int Ne = a0.Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                long m12 = x1.m(jArr, i11);
                if (comparator.compare(w1.b(m11), w1.b(m12)) < 0) {
                    m11 = m12;
                }
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return w1.b(m11);
    }

    @j(name = "minOrThrow-U")
    @y0(version = "1.7")
    @kotlin.d
    public static final short J7(@k short[] sArr) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$min$0");
        if (d2.s(sArr)) {
            throw new NoSuchElementException();
        }
        short m11 = d2.m(sArr, 0);
        int Pe = a0.Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                short m12 = d2.m(sArr, i11);
                if (g0.t(m11 & c2.f100412d, 65535 & m12) > 0) {
                    m11 = m12;
                }
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return m11;
    }

    @m80.l
    @y0(version = "1.4")
    @kotlin.d
    public static final c2 J8(@k short[] sArr, @k Random random) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$randomOrNull$0");
        g0.p(random, "random");
        if (d2.s(sArr)) {
            return null;
        }
        return c2.b(d2.m(sArr, random.nextInt(d2.o(sArr))));
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final <R> List<R> J9(short[] sArr, R r11, p<? super R, ? super c2, ? extends R> operation) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$runningFold$0");
        g0.p(operation, "operation");
        if (d2.s(sArr)) {
            return a00.g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(d2.o(sArr) + 1);
        arrayList.add(r11);
        int o11 = d2.o(sArr);
        for (int i11 = 0; i11 < o11; i11++) {
            r11 = operation.invoke(r11, c2.b(d2.m(sArr, i11)));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final List<s1> Ja(@k int[] iArr, @k g10.l indices) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$slice$0");
        g0.p(indices, "indices");
        return indices.isEmpty() ? h0.J() : b.a(t1.f(q.j1(iArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1)));
    }

    @y0(version = "1.3")
    @kotlin.d
    @n(message = "Use sumOf instead.", replaceWith = @w0(expression = "this.sumOf(selector)", imports = {}))
    @o00.f
    @o(warningSince = "1.5")
    public static final int Jb(short[] sArr, l<? super c2, s1> selector) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$sumBy$0");
        g0.p(selector, "selector");
        int o11 = d2.o(sArr);
        int i11 = 0;
        for (int i12 = 0; i12 < o11; i12++) {
            i11 = s1.i(i11 + selector.invoke(c2.b(d2.m(sArr, i12))).m0());
        }
        return i11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final c2[] Jc(@k short[] sArr) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$toTypedArray$0");
        int o11 = d2.o(sArr);
        c2[] c2VarArr = new c2[o11];
        for (int i11 = 0; i11 < o11; i11++) {
            c2VarArr[i11] = c2.b(d2.m(sArr, i11));
        }
        return c2VarArr;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int K0(int[] iArr) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$component3$0");
        return t1.m(iArr, 2);
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final List<o1> K1(@k byte[] bArr, int i11) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$drop$0");
        if (i11 >= 0) {
            return qc(bArr, u.u(p1.o(bArr) - i11, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <C extends Collection<? super w1>> C K2(long[] jArr, C destination, l<? super w1, Boolean> predicate) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$filterTo$0");
        g0.p(destination, "destination");
        g0.p(predicate, "predicate");
        int o11 = x1.o(jArr);
        for (int i11 = 0; i11 < o11; i11++) {
            long m11 = x1.m(jArr, i11);
            if (predicate.invoke(w1.b(m11)).booleanValue()) {
                destination.add(w1.b(m11));
            }
        }
        return destination;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R> R K3(long[] jArr, R r11, p<? super w1, ? super R, ? extends R> operation) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$foldRight$0");
        g0.p(operation, "operation");
        for (int Ne = a0.Ne(jArr); Ne >= 0; Ne--) {
            r11 = operation.invoke(w1.b(x1.m(jArr, Ne)), r11);
        }
        return r11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <K, M extends Map<? super K, List<w1>>> M K4(long[] jArr, M destination, l<? super w1, ? extends K> keySelector) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$groupByTo$0");
        g0.p(destination, "destination");
        g0.p(keySelector, "keySelector");
        int o11 = x1.o(jArr);
        for (int i11 = 0; i11 < o11; i11++) {
            long m11 = x1.m(jArr, i11);
            K invoke = keySelector.invoke(w1.b(m11));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(w1.b(m11));
        }
        return destination;
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final <R extends Comparable<? super R>> o1 K5(byte[] bArr, l<? super o1, ? extends R> selector) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$maxByOrNull$0");
        g0.p(selector, "selector");
        if (p1.s(bArr)) {
            return null;
        }
        byte m11 = p1.m(bArr, 0);
        int Ie = a0.Ie(bArr);
        if (Ie == 0) {
            return o1.b(m11);
        }
        R invoke = selector.invoke(o1.b(m11));
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                byte m12 = p1.m(bArr, i11);
                R invoke2 = selector.invoke(o1.b(m12));
                if (invoke.compareTo(invoke2) < 0) {
                    m11 = m12;
                    invoke = invoke2;
                }
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return o1.b(m11);
    }

    @j(name = "maxWithOrThrow-U")
    @y0(version = "1.7")
    @kotlin.d
    public static final byte K6(@k byte[] bArr, @k Comparator<? super o1> comparator) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$maxWith$0");
        g0.p(comparator, "comparator");
        if (p1.s(bArr)) {
            throw new NoSuchElementException();
        }
        byte m11 = p1.m(bArr, 0);
        int Ie = a0.Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                byte m12 = p1.m(bArr, i11);
                if (comparator.compare(o1.b(m11), o1.b(m12)) < 0) {
                    m11 = m12;
                }
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return m11;
    }

    @m80.l
    @y0(version = "1.4")
    @kotlin.d
    public static final o1 K7(@k byte[] bArr, @k Comparator<? super o1> comparator) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$minWithOrNull$0");
        g0.p(comparator, "comparator");
        if (p1.s(bArr)) {
            return null;
        }
        byte m11 = p1.m(bArr, 0);
        int Ie = a0.Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                byte m12 = p1.m(bArr, i11);
                if (comparator.compare(o1.b(m11), o1.b(m12)) > 0) {
                    m11 = m12;
                }
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return o1.b(m11);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final byte K8(byte[] bArr, p<? super o1, ? super o1, o1> operation) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$reduce$0");
        g0.p(operation, "operation");
        if (p1.s(bArr)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte m11 = p1.m(bArr, 0);
        int Ie = a0.Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                m11 = operation.invoke(o1.b(m11), o1.b(p1.m(bArr, i11))).k0();
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return m11;
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final <R> List<R> K9(byte[] bArr, R r11, x00.q<? super Integer, ? super R, ? super o1, ? extends R> operation) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$runningFoldIndexed$0");
        g0.p(operation, "operation");
        if (p1.s(bArr)) {
            return a00.g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(p1.o(bArr) + 1);
        arrayList.add(r11);
        int o11 = p1.o(bArr);
        for (int i11 = 0; i11 < o11; i11++) {
            r11 = operation.invoke(Integer.valueOf(i11), r11, o1.b(p1.m(bArr, i11)));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final int[] Ka(@k int[] iArr, @k Collection<Integer> indices) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$sliceArray$0");
        g0.p(indices, "indices");
        return t1.f(a0.zu(iArr, indices));
    }

    @y0(version = "1.3")
    @kotlin.d
    @n(message = "Use sumOf instead.", replaceWith = @w0(expression = "this.sumOf(selector)", imports = {}))
    @o00.f
    @o(warningSince = "1.5")
    public static final double Kb(byte[] bArr, l<? super o1, Double> selector) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$sumByDouble$0");
        g0.p(selector, "selector");
        int o11 = p1.o(bArr);
        double d11 = 0.0d;
        for (int i11 = 0; i11 < o11; i11++) {
            d11 += selector.invoke(o1.b(p1.m(bArr, i11))).doubleValue();
        }
        return d11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final byte[] Kc(byte[] bArr) {
        g0.p(bArr, "<this>");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        g0.o(copyOf, "copyOf(...)");
        return p1.f(copyOf);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final byte L0(byte[] bArr) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$component3$0");
        return p1.m(bArr, 2);
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final List<c2> L1(@k short[] sArr, int i11) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$drop$0");
        if (i11 >= 0) {
            return rc(sArr, u.u(d2.o(sArr) - i11, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <C extends Collection<? super c2>> C L2(short[] sArr, C destination, l<? super c2, Boolean> predicate) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$filterTo$0");
        g0.p(destination, "destination");
        g0.p(predicate, "predicate");
        int o11 = d2.o(sArr);
        for (int i11 = 0; i11 < o11; i11++) {
            short m11 = d2.m(sArr, i11);
            if (predicate.invoke(c2.b(m11)).booleanValue()) {
                destination.add(c2.b(m11));
            }
        }
        return destination;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R> R L3(byte[] bArr, R r11, p<? super o1, ? super R, ? extends R> operation) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$foldRight$0");
        g0.p(operation, "operation");
        for (int Ie = a0.Ie(bArr); Ie >= 0; Ie--) {
            r11 = operation.invoke(o1.b(p1.m(bArr, Ie)), r11);
        }
        return r11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <K, M extends Map<? super K, List<c2>>> M L4(short[] sArr, M destination, l<? super c2, ? extends K> keySelector) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$groupByTo$0");
        g0.p(destination, "destination");
        g0.p(keySelector, "keySelector");
        int o11 = d2.o(sArr);
        for (int i11 = 0; i11 < o11; i11++) {
            short m11 = d2.m(sArr, i11);
            K invoke = keySelector.invoke(c2.b(m11));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(c2.b(m11));
        }
        return destination;
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final <R extends Comparable<? super R>> w1 L5(long[] jArr, l<? super w1, ? extends R> selector) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$maxByOrNull$0");
        g0.p(selector, "selector");
        if (x1.s(jArr)) {
            return null;
        }
        long m11 = x1.m(jArr, 0);
        int Ne = a0.Ne(jArr);
        if (Ne == 0) {
            return w1.b(m11);
        }
        R invoke = selector.invoke(w1.b(m11));
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                long m12 = x1.m(jArr, i11);
                R invoke2 = selector.invoke(w1.b(m12));
                if (invoke.compareTo(invoke2) < 0) {
                    m11 = m12;
                    invoke = invoke2;
                }
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return w1.b(m11);
    }

    @j(name = "maxWithOrThrow-U")
    @y0(version = "1.7")
    @kotlin.d
    public static final int L6(@k int[] iArr, @k Comparator<? super s1> comparator) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$maxWith$0");
        g0.p(comparator, "comparator");
        if (t1.s(iArr)) {
            throw new NoSuchElementException();
        }
        int m11 = t1.m(iArr, 0);
        int Me = a0.Me(iArr);
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                int m12 = t1.m(iArr, i11);
                if (comparator.compare(s1.b(m11), s1.b(m12)) < 0) {
                    m11 = m12;
                }
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return m11;
    }

    @m80.l
    @y0(version = "1.4")
    @kotlin.d
    public static final s1 L7(@k int[] iArr, @k Comparator<? super s1> comparator) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$minWithOrNull$0");
        g0.p(comparator, "comparator");
        if (t1.s(iArr)) {
            return null;
        }
        int m11 = t1.m(iArr, 0);
        int Me = a0.Me(iArr);
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                int m12 = t1.m(iArr, i11);
                if (comparator.compare(s1.b(m11), s1.b(m12)) > 0) {
                    m11 = m12;
                }
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return s1.b(m11);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int L8(int[] iArr, p<? super s1, ? super s1, s1> operation) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$reduce$0");
        g0.p(operation, "operation");
        if (t1.s(iArr)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int m11 = t1.m(iArr, 0);
        int Me = a0.Me(iArr);
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                m11 = operation.invoke(s1.b(m11), s1.b(t1.m(iArr, i11))).m0();
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return m11;
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final <R> List<R> L9(short[] sArr, R r11, x00.q<? super Integer, ? super R, ? super c2, ? extends R> operation) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$runningFoldIndexed$0");
        g0.p(operation, "operation");
        if (d2.s(sArr)) {
            return a00.g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(d2.o(sArr) + 1);
        arrayList.add(r11);
        int o11 = d2.o(sArr);
        for (int i11 = 0; i11 < o11; i11++) {
            r11 = operation.invoke(Integer.valueOf(i11), r11, c2.b(d2.m(sArr, i11)));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final short[] La(@k short[] sArr, @k g10.l indices) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$sliceArray$0");
        g0.p(indices, "indices");
        return d2.f(a0.Eu(sArr, indices));
    }

    @y0(version = "1.3")
    @kotlin.d
    @n(message = "Use sumOf instead.", replaceWith = @w0(expression = "this.sumOf(selector)", imports = {}))
    @o00.f
    @o(warningSince = "1.5")
    public static final double Lb(long[] jArr, l<? super w1, Double> selector) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$sumByDouble$0");
        g0.p(selector, "selector");
        int o11 = x1.o(jArr);
        double d11 = 0.0d;
        for (int i11 = 0; i11 < o11; i11++) {
            d11 += selector.invoke(w1.b(x1.m(jArr, i11))).doubleValue();
        }
        return d11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final byte[] Lc(@k o1[] o1VarArr) {
        g0.p(o1VarArr, "<this>");
        int length = o1VarArr.length;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            bArr[i11] = o1VarArr[i11].k0();
        }
        return p1.f(bArr);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final long M0(long[] jArr) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$component3$0");
        return x1.m(jArr, 2);
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final List<s1> M1(@k int[] iArr, int i11) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$drop$0");
        if (i11 >= 0) {
            return sc(iArr, u.u(t1.o(iArr) - i11, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <C extends Collection<? super s1>> C M2(int[] iArr, C destination, l<? super s1, Boolean> predicate) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$filterTo$0");
        g0.p(destination, "destination");
        g0.p(predicate, "predicate");
        int o11 = t1.o(iArr);
        for (int i11 = 0; i11 < o11; i11++) {
            int m11 = t1.m(iArr, i11);
            if (predicate.invoke(s1.b(m11)).booleanValue()) {
                destination.add(s1.b(m11));
            }
        }
        return destination;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R> R M3(int[] iArr, R r11, p<? super s1, ? super R, ? extends R> operation) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$foldRight$0");
        g0.p(operation, "operation");
        for (int Me = a0.Me(iArr); Me >= 0; Me--) {
            r11 = operation.invoke(s1.b(t1.m(iArr, Me)), r11);
        }
        return r11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <K, V, M extends Map<? super K, List<V>>> M M4(short[] sArr, M destination, l<? super c2, ? extends K> keySelector, l<? super c2, ? extends V> valueTransform) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$groupByTo$0");
        g0.p(destination, "destination");
        g0.p(keySelector, "keySelector");
        g0.p(valueTransform, "valueTransform");
        int o11 = d2.o(sArr);
        for (int i11 = 0; i11 < o11; i11++) {
            short m11 = d2.m(sArr, i11);
            K invoke = keySelector.invoke(c2.b(m11));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(c2.b(m11)));
        }
        return destination;
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final <R extends Comparable<? super R>> s1 M5(int[] iArr, l<? super s1, ? extends R> selector) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$maxByOrNull$0");
        g0.p(selector, "selector");
        if (t1.s(iArr)) {
            return null;
        }
        int m11 = t1.m(iArr, 0);
        int Me = a0.Me(iArr);
        if (Me == 0) {
            return s1.b(m11);
        }
        R invoke = selector.invoke(s1.b(m11));
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                int m12 = t1.m(iArr, i11);
                R invoke2 = selector.invoke(s1.b(m12));
                if (invoke.compareTo(invoke2) < 0) {
                    m11 = m12;
                    invoke = invoke2;
                }
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return s1.b(m11);
    }

    @j(name = "maxWithOrThrow-U")
    @y0(version = "1.7")
    @kotlin.d
    public static final long M6(@k long[] jArr, @k Comparator<? super w1> comparator) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$maxWith$0");
        g0.p(comparator, "comparator");
        if (x1.s(jArr)) {
            throw new NoSuchElementException();
        }
        long m11 = x1.m(jArr, 0);
        int Ne = a0.Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                long m12 = x1.m(jArr, i11);
                if (comparator.compare(w1.b(m11), w1.b(m12)) < 0) {
                    m11 = m12;
                }
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return m11;
    }

    @m80.l
    @y0(version = "1.4")
    @kotlin.d
    public static final c2 M7(@k short[] sArr, @k Comparator<? super c2> comparator) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$minWithOrNull$0");
        g0.p(comparator, "comparator");
        if (d2.s(sArr)) {
            return null;
        }
        short m11 = d2.m(sArr, 0);
        int Pe = a0.Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                short m12 = d2.m(sArr, i11);
                if (comparator.compare(c2.b(m11), c2.b(m12)) > 0) {
                    m11 = m12;
                }
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return c2.b(m11);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final long M8(long[] jArr, p<? super w1, ? super w1, w1> operation) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$reduce$0");
        g0.p(operation, "operation");
        if (x1.s(jArr)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long m11 = x1.m(jArr, 0);
        int Ne = a0.Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                m11 = operation.invoke(w1.b(m11), w1.b(x1.m(jArr, i11))).m0();
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return m11;
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final <R> List<R> M9(long[] jArr, R r11, x00.q<? super Integer, ? super R, ? super w1, ? extends R> operation) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$runningFoldIndexed$0");
        g0.p(operation, "operation");
        if (x1.s(jArr)) {
            return a00.g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(x1.o(jArr) + 1);
        arrayList.add(r11);
        int o11 = x1.o(jArr);
        for (int i11 = 0; i11 < o11; i11++) {
            r11 = operation.invoke(Integer.valueOf(i11), r11, w1.b(x1.m(jArr, i11)));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final long[] Ma(@k long[] jArr, @k g10.l indices) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$sliceArray$0");
        g0.p(indices, "indices");
        return x1.f(a0.Au(jArr, indices));
    }

    @y0(version = "1.3")
    @kotlin.d
    @n(message = "Use sumOf instead.", replaceWith = @w0(expression = "this.sumOf(selector)", imports = {}))
    @o00.f
    @o(warningSince = "1.5")
    public static final double Mb(int[] iArr, l<? super s1, Double> selector) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$sumByDouble$0");
        g0.p(selector, "selector");
        int o11 = t1.o(iArr);
        double d11 = 0.0d;
        for (int i11 = 0; i11 < o11; i11++) {
            d11 += selector.invoke(s1.b(t1.m(iArr, i11))).doubleValue();
        }
        return d11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int[] Mc(int[] iArr) {
        g0.p(iArr, "<this>");
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        g0.o(copyOf, "copyOf(...)");
        return t1.f(copyOf);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final short N0(short[] sArr) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$component3$0");
        return d2.m(sArr, 2);
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final List<w1> N1(@k long[] jArr, int i11) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$drop$0");
        if (i11 >= 0) {
            return tc(jArr, u.u(x1.o(jArr) - i11, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <C extends Collection<? super o1>> C N2(byte[] bArr, C destination, l<? super o1, Boolean> predicate) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$filterTo$0");
        g0.p(destination, "destination");
        g0.p(predicate, "predicate");
        int o11 = p1.o(bArr);
        for (int i11 = 0; i11 < o11; i11++) {
            byte m11 = p1.m(bArr, i11);
            if (predicate.invoke(o1.b(m11)).booleanValue()) {
                destination.add(o1.b(m11));
            }
        }
        return destination;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R> R N3(short[] sArr, R r11, p<? super c2, ? super R, ? extends R> operation) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$foldRight$0");
        g0.p(operation, "operation");
        for (int Pe = a0.Pe(sArr); Pe >= 0; Pe--) {
            r11 = operation.invoke(c2.b(d2.m(sArr, Pe)), r11);
        }
        return r11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <K, V, M extends Map<? super K, List<V>>> M N4(byte[] bArr, M destination, l<? super o1, ? extends K> keySelector, l<? super o1, ? extends V> valueTransform) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$groupByTo$0");
        g0.p(destination, "destination");
        g0.p(keySelector, "keySelector");
        g0.p(valueTransform, "valueTransform");
        int o11 = p1.o(bArr);
        for (int i11 = 0; i11 < o11; i11++) {
            byte m11 = p1.m(bArr, i11);
            K invoke = keySelector.invoke(o1.b(m11));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(o1.b(m11)));
        }
        return destination;
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final <R extends Comparable<? super R>> c2 N5(short[] sArr, l<? super c2, ? extends R> selector) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$maxByOrNull$0");
        g0.p(selector, "selector");
        if (d2.s(sArr)) {
            return null;
        }
        short m11 = d2.m(sArr, 0);
        int Pe = a0.Pe(sArr);
        if (Pe == 0) {
            return c2.b(m11);
        }
        R invoke = selector.invoke(c2.b(m11));
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                short m12 = d2.m(sArr, i11);
                R invoke2 = selector.invoke(c2.b(m12));
                if (invoke.compareTo(invoke2) < 0) {
                    m11 = m12;
                    invoke = invoke2;
                }
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return c2.b(m11);
    }

    @j(name = "maxWithOrThrow-U")
    @y0(version = "1.7")
    @kotlin.d
    public static final short N6(@k short[] sArr, @k Comparator<? super c2> comparator) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$maxWith$0");
        g0.p(comparator, "comparator");
        if (d2.s(sArr)) {
            throw new NoSuchElementException();
        }
        short m11 = d2.m(sArr, 0);
        int Pe = a0.Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                short m12 = d2.m(sArr, i11);
                if (comparator.compare(c2.b(m11), c2.b(m12)) < 0) {
                    m11 = m12;
                }
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return m11;
    }

    @m80.l
    @y0(version = "1.4")
    @kotlin.d
    public static final w1 N7(@k long[] jArr, @k Comparator<? super w1> comparator) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$minWithOrNull$0");
        g0.p(comparator, "comparator");
        if (x1.s(jArr)) {
            return null;
        }
        long m11 = x1.m(jArr, 0);
        int Ne = a0.Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                long m12 = x1.m(jArr, i11);
                if (comparator.compare(w1.b(m11), w1.b(m12)) > 0) {
                    m11 = m12;
                }
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return w1.b(m11);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final short N8(short[] sArr, p<? super c2, ? super c2, c2> operation) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$reduce$0");
        g0.p(operation, "operation");
        if (d2.s(sArr)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short m11 = d2.m(sArr, 0);
        int Pe = a0.Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                m11 = operation.invoke(c2.b(m11), c2.b(d2.m(sArr, i11))).k0();
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return m11;
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final <R> List<R> N9(int[] iArr, R r11, x00.q<? super Integer, ? super R, ? super s1, ? extends R> operation) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$runningFoldIndexed$0");
        g0.p(operation, "operation");
        if (t1.s(iArr)) {
            return a00.g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(t1.o(iArr) + 1);
        arrayList.add(r11);
        int o11 = t1.o(iArr);
        for (int i11 = 0; i11 < o11; i11++) {
            r11 = operation.invoke(Integer.valueOf(i11), r11, s1.b(t1.m(iArr, i11)));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final byte[] Na(@k byte[] bArr, @k g10.l indices) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$sliceArray$0");
        g0.p(indices, "indices");
        return p1.f(a0.qu(bArr, indices));
    }

    @y0(version = "1.3")
    @kotlin.d
    @n(message = "Use sumOf instead.", replaceWith = @w0(expression = "this.sumOf(selector)", imports = {}))
    @o00.f
    @o(warningSince = "1.5")
    public static final double Nb(short[] sArr, l<? super c2, Double> selector) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$sumByDouble$0");
        g0.p(selector, "selector");
        int o11 = d2.o(sArr);
        double d11 = 0.0d;
        for (int i11 = 0; i11 < o11; i11++) {
            d11 += selector.invoke(c2.b(d2.m(sArr, i11))).doubleValue();
        }
        return d11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final int[] Nc(@k s1[] s1VarArr) {
        g0.p(s1VarArr, "<this>");
        int length = s1VarArr.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = s1VarArr[i11].m0();
        }
        return t1.f(iArr);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int O0(int[] iArr) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$component4$0");
        return t1.m(iArr, 3);
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final List<o1> O1(@k byte[] bArr, int i11) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$dropLast$0");
        if (i11 >= 0) {
            return mc(bArr, u.u(p1.o(bArr) - i11, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final o1 O2(byte[] bArr, l<? super o1, Boolean> predicate) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$find$0");
        g0.p(predicate, "predicate");
        int o11 = p1.o(bArr);
        for (int i11 = 0; i11 < o11; i11++) {
            byte m11 = p1.m(bArr, i11);
            if (predicate.invoke(o1.b(m11)).booleanValue()) {
                return o1.b(m11);
            }
        }
        return null;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R> R O3(byte[] bArr, R r11, x00.q<? super Integer, ? super o1, ? super R, ? extends R> operation) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$foldRightIndexed$0");
        g0.p(operation, "operation");
        for (int Ie = a0.Ie(bArr); Ie >= 0; Ie--) {
            r11 = operation.invoke(Integer.valueOf(Ie), o1.b(p1.m(bArr, Ie)), r11);
        }
        return r11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int O4(long[] jArr, long j11) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$indexOf$0");
        return a0.ag(jArr, j11);
    }

    @j(name = "maxByOrThrow-U")
    @y0(version = "1.7")
    @kotlin.d
    @o00.f
    public static final <R extends Comparable<? super R>> byte O5(byte[] bArr, l<? super o1, ? extends R> selector) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$maxBy$0");
        g0.p(selector, "selector");
        if (p1.s(bArr)) {
            throw new NoSuchElementException();
        }
        byte m11 = p1.m(bArr, 0);
        int Ie = a0.Ie(bArr);
        if (Ie != 0) {
            R invoke = selector.invoke(o1.b(m11));
            int i11 = 1;
            if (1 <= Ie) {
                while (true) {
                    byte m12 = p1.m(bArr, i11);
                    R invoke2 = selector.invoke(o1.b(m12));
                    if (invoke.compareTo(invoke2) < 0) {
                        m11 = m12;
                        invoke = invoke2;
                    }
                    if (i11 == Ie) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return m11;
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final <R extends Comparable<? super R>> o1 O6(byte[] bArr, l<? super o1, ? extends R> selector) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$minByOrNull$0");
        g0.p(selector, "selector");
        if (p1.s(bArr)) {
            return null;
        }
        byte m11 = p1.m(bArr, 0);
        int Ie = a0.Ie(bArr);
        if (Ie == 0) {
            return o1.b(m11);
        }
        R invoke = selector.invoke(o1.b(m11));
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                byte m12 = p1.m(bArr, i11);
                R invoke2 = selector.invoke(o1.b(m12));
                if (invoke.compareTo(invoke2) > 0) {
                    m11 = m12;
                    invoke = invoke2;
                }
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return o1.b(m11);
    }

    @j(name = "minWithOrThrow-U")
    @y0(version = "1.7")
    @kotlin.d
    public static final byte O7(@k byte[] bArr, @k Comparator<? super o1> comparator) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$minWith$0");
        g0.p(comparator, "comparator");
        if (p1.s(bArr)) {
            throw new NoSuchElementException();
        }
        byte m11 = p1.m(bArr, 0);
        int Ie = a0.Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                byte m12 = p1.m(bArr, i11);
                if (comparator.compare(o1.b(m11), o1.b(m12)) > 0) {
                    m11 = m12;
                }
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return m11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int O8(int[] iArr, x00.q<? super Integer, ? super s1, ? super s1, s1> operation) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$reduceIndexed$0");
        g0.p(operation, "operation");
        if (t1.s(iArr)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int m11 = t1.m(iArr, 0);
        int Me = a0.Me(iArr);
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                m11 = operation.invoke(Integer.valueOf(i11), s1.b(m11), s1.b(t1.m(iArr, i11))).m0();
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return m11;
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final List<o1> O9(byte[] bArr, p<? super o1, ? super o1, o1> operation) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$runningReduce$0");
        g0.p(operation, "operation");
        if (p1.s(bArr)) {
            return h0.J();
        }
        byte m11 = p1.m(bArr, 0);
        ArrayList arrayList = new ArrayList(p1.o(bArr));
        arrayList.add(o1.b(m11));
        int o11 = p1.o(bArr);
        for (int i11 = 1; i11 < o11; i11++) {
            m11 = operation.invoke(o1.b(m11), o1.b(p1.m(bArr, i11))).k0();
            arrayList.add(o1.b(m11));
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final long[] Oa(@k long[] jArr, @k Collection<Integer> indices) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$sliceArray$0");
        g0.p(indices, "indices");
        return x1.f(a0.Bu(jArr, indices));
    }

    @j(name = "sumOfDouble")
    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final double Ob(byte[] bArr, l<? super o1, Double> selector) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$sumOf$0");
        g0.p(selector, "selector");
        int o11 = p1.o(bArr);
        double d11 = 0.0d;
        for (int i11 = 0; i11 < o11; i11++) {
            d11 += selector.invoke(o1.b(p1.m(bArr, i11))).doubleValue();
        }
        return d11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final long[] Oc(long[] jArr) {
        g0.p(jArr, "<this>");
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        g0.o(copyOf, "copyOf(...)");
        return x1.f(copyOf);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final byte P0(byte[] bArr) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$component4$0");
        return p1.m(bArr, 3);
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final List<c2> P1(@k short[] sArr, int i11) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$dropLast$0");
        if (i11 >= 0) {
            return nc(sArr, u.u(d2.o(sArr) - i11, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final w1 P2(long[] jArr, l<? super w1, Boolean> predicate) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$find$0");
        g0.p(predicate, "predicate");
        int o11 = x1.o(jArr);
        for (int i11 = 0; i11 < o11; i11++) {
            long m11 = x1.m(jArr, i11);
            if (predicate.invoke(w1.b(m11)).booleanValue()) {
                return w1.b(m11);
            }
        }
        return null;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R> R P3(short[] sArr, R r11, x00.q<? super Integer, ? super c2, ? super R, ? extends R> operation) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$foldRightIndexed$0");
        g0.p(operation, "operation");
        for (int Pe = a0.Pe(sArr); Pe >= 0; Pe--) {
            r11 = operation.invoke(Integer.valueOf(Pe), c2.b(d2.m(sArr, Pe)), r11);
        }
        return r11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int P4(short[] sArr, short s11) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$indexOf$0");
        return a0.cg(sArr, s11);
    }

    @j(name = "maxByOrThrow-U")
    @y0(version = "1.7")
    @kotlin.d
    @o00.f
    public static final <R extends Comparable<? super R>> int P5(int[] iArr, l<? super s1, ? extends R> selector) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$maxBy$0");
        g0.p(selector, "selector");
        if (t1.s(iArr)) {
            throw new NoSuchElementException();
        }
        int m11 = t1.m(iArr, 0);
        int Me = a0.Me(iArr);
        if (Me != 0) {
            R invoke = selector.invoke(s1.b(m11));
            int i11 = 1;
            if (1 <= Me) {
                while (true) {
                    int m12 = t1.m(iArr, i11);
                    R invoke2 = selector.invoke(s1.b(m12));
                    if (invoke.compareTo(invoke2) < 0) {
                        m11 = m12;
                        invoke = invoke2;
                    }
                    if (i11 == Me) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return m11;
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final <R extends Comparable<? super R>> w1 P6(long[] jArr, l<? super w1, ? extends R> selector) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$minByOrNull$0");
        g0.p(selector, "selector");
        if (x1.s(jArr)) {
            return null;
        }
        long m11 = x1.m(jArr, 0);
        int Ne = a0.Ne(jArr);
        if (Ne == 0) {
            return w1.b(m11);
        }
        R invoke = selector.invoke(w1.b(m11));
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                long m12 = x1.m(jArr, i11);
                R invoke2 = selector.invoke(w1.b(m12));
                if (invoke.compareTo(invoke2) > 0) {
                    m11 = m12;
                    invoke = invoke2;
                }
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return w1.b(m11);
    }

    @j(name = "minWithOrThrow-U")
    @y0(version = "1.7")
    @kotlin.d
    public static final int P7(@k int[] iArr, @k Comparator<? super s1> comparator) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$minWith$0");
        g0.p(comparator, "comparator");
        if (t1.s(iArr)) {
            throw new NoSuchElementException();
        }
        int m11 = t1.m(iArr, 0);
        int Me = a0.Me(iArr);
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                int m12 = t1.m(iArr, i11);
                if (comparator.compare(s1.b(m11), s1.b(m12)) > 0) {
                    m11 = m12;
                }
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return m11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final byte P8(byte[] bArr, x00.q<? super Integer, ? super o1, ? super o1, o1> operation) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$reduceIndexed$0");
        g0.p(operation, "operation");
        if (p1.s(bArr)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte m11 = p1.m(bArr, 0);
        int Ie = a0.Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                m11 = operation.invoke(Integer.valueOf(i11), o1.b(m11), o1.b(p1.m(bArr, i11))).k0();
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return m11;
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final List<s1> P9(int[] iArr, p<? super s1, ? super s1, s1> operation) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$runningReduce$0");
        g0.p(operation, "operation");
        if (t1.s(iArr)) {
            return h0.J();
        }
        int m11 = t1.m(iArr, 0);
        ArrayList arrayList = new ArrayList(t1.o(iArr));
        arrayList.add(s1.b(m11));
        int o11 = t1.o(iArr);
        for (int i11 = 1; i11 < o11; i11++) {
            m11 = operation.invoke(s1.b(m11), s1.b(t1.m(iArr, i11))).m0();
            arrayList.add(s1.b(m11));
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final short[] Pa(@k short[] sArr, @k Collection<Integer> indices) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$sliceArray$0");
        g0.p(indices, "indices");
        return d2.f(a0.Fu(sArr, indices));
    }

    @j(name = "sumOfDouble")
    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final double Pb(int[] iArr, l<? super s1, Double> selector) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$sumOf$0");
        g0.p(selector, "selector");
        int o11 = t1.o(iArr);
        double d11 = 0.0d;
        for (int i11 = 0; i11 < o11; i11++) {
            d11 += selector.invoke(s1.b(t1.m(iArr, i11))).doubleValue();
        }
        return d11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final long[] Pc(@k w1[] w1VarArr) {
        g0.p(w1VarArr, "<this>");
        int length = w1VarArr.length;
        long[] jArr = new long[length];
        for (int i11 = 0; i11 < length; i11++) {
            jArr[i11] = w1VarArr[i11].m0();
        }
        return x1.f(jArr);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final long Q0(long[] jArr) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$component4$0");
        return x1.m(jArr, 3);
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final List<s1> Q1(@k int[] iArr, int i11) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$dropLast$0");
        if (i11 >= 0) {
            return oc(iArr, u.u(t1.o(iArr) - i11, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final s1 Q2(int[] iArr, l<? super s1, Boolean> predicate) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$find$0");
        g0.p(predicate, "predicate");
        int o11 = t1.o(iArr);
        for (int i11 = 0; i11 < o11; i11++) {
            int m11 = t1.m(iArr, i11);
            if (predicate.invoke(s1.b(m11)).booleanValue()) {
                return s1.b(m11);
            }
        }
        return null;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R> R Q3(long[] jArr, R r11, x00.q<? super Integer, ? super w1, ? super R, ? extends R> operation) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$foldRightIndexed$0");
        g0.p(operation, "operation");
        for (int Ne = a0.Ne(jArr); Ne >= 0; Ne--) {
            r11 = operation.invoke(Integer.valueOf(Ne), w1.b(x1.m(jArr, Ne)), r11);
        }
        return r11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int Q4(byte[] bArr, byte b11) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$indexOf$0");
        return a0.Vf(bArr, b11);
    }

    @j(name = "maxByOrThrow-U")
    @y0(version = "1.7")
    @kotlin.d
    @o00.f
    public static final <R extends Comparable<? super R>> long Q5(long[] jArr, l<? super w1, ? extends R> selector) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$maxBy$0");
        g0.p(selector, "selector");
        if (x1.s(jArr)) {
            throw new NoSuchElementException();
        }
        long m11 = x1.m(jArr, 0);
        int Ne = a0.Ne(jArr);
        if (Ne != 0) {
            R invoke = selector.invoke(w1.b(m11));
            int i11 = 1;
            if (1 <= Ne) {
                while (true) {
                    long m12 = x1.m(jArr, i11);
                    R invoke2 = selector.invoke(w1.b(m12));
                    if (invoke.compareTo(invoke2) < 0) {
                        m11 = m12;
                        invoke = invoke2;
                    }
                    if (i11 == Ne) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return m11;
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final <R extends Comparable<? super R>> s1 Q6(int[] iArr, l<? super s1, ? extends R> selector) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$minByOrNull$0");
        g0.p(selector, "selector");
        if (t1.s(iArr)) {
            return null;
        }
        int m11 = t1.m(iArr, 0);
        int Me = a0.Me(iArr);
        if (Me == 0) {
            return s1.b(m11);
        }
        R invoke = selector.invoke(s1.b(m11));
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                int m12 = t1.m(iArr, i11);
                R invoke2 = selector.invoke(s1.b(m12));
                if (invoke.compareTo(invoke2) > 0) {
                    m11 = m12;
                    invoke = invoke2;
                }
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return s1.b(m11);
    }

    @j(name = "minWithOrThrow-U")
    @y0(version = "1.7")
    @kotlin.d
    public static final long Q7(@k long[] jArr, @k Comparator<? super w1> comparator) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$minWith$0");
        g0.p(comparator, "comparator");
        if (x1.s(jArr)) {
            throw new NoSuchElementException();
        }
        long m11 = x1.m(jArr, 0);
        int Ne = a0.Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                long m12 = x1.m(jArr, i11);
                if (comparator.compare(w1.b(m11), w1.b(m12)) > 0) {
                    m11 = m12;
                }
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return m11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final short Q8(short[] sArr, x00.q<? super Integer, ? super c2, ? super c2, c2> operation) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$reduceIndexed$0");
        g0.p(operation, "operation");
        if (d2.s(sArr)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short m11 = d2.m(sArr, 0);
        int Pe = a0.Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                m11 = operation.invoke(Integer.valueOf(i11), c2.b(m11), c2.b(d2.m(sArr, i11))).k0();
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return m11;
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final List<w1> Q9(long[] jArr, p<? super w1, ? super w1, w1> operation) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$runningReduce$0");
        g0.p(operation, "operation");
        if (x1.s(jArr)) {
            return h0.J();
        }
        long m11 = x1.m(jArr, 0);
        ArrayList arrayList = new ArrayList(x1.o(jArr));
        arrayList.add(w1.b(m11));
        int o11 = x1.o(jArr);
        for (int i11 = 1; i11 < o11; i11++) {
            m11 = operation.invoke(w1.b(m11), w1.b(x1.m(jArr, i11))).m0();
            arrayList.add(w1.b(m11));
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final int[] Qa(@k int[] iArr, @k g10.l indices) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$sliceArray$0");
        g0.p(indices, "indices");
        return t1.f(a0.yu(iArr, indices));
    }

    @j(name = "sumOfDouble")
    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final double Qb(long[] jArr, l<? super w1, Double> selector) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$sumOf$0");
        g0.p(selector, "selector");
        int o11 = x1.o(jArr);
        double d11 = 0.0d;
        for (int i11 = 0; i11 < o11; i11++) {
            d11 += selector.invoke(w1.b(x1.m(jArr, i11))).doubleValue();
        }
        return d11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final short[] Qc(@k c2[] c2VarArr) {
        g0.p(c2VarArr, "<this>");
        int length = c2VarArr.length;
        short[] sArr = new short[length];
        for (int i11 = 0; i11 < length; i11++) {
            sArr[i11] = c2VarArr[i11].k0();
        }
        return d2.f(sArr);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final short R0(short[] sArr) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$component4$0");
        return d2.m(sArr, 3);
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final List<w1> R1(@k long[] jArr, int i11) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$dropLast$0");
        if (i11 >= 0) {
            return pc(jArr, u.u(x1.o(jArr) - i11, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final c2 R2(short[] sArr, l<? super c2, Boolean> predicate) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$find$0");
        g0.p(predicate, "predicate");
        int o11 = d2.o(sArr);
        for (int i11 = 0; i11 < o11; i11++) {
            short m11 = d2.m(sArr, i11);
            if (predicate.invoke(c2.b(m11)).booleanValue()) {
                return c2.b(m11);
            }
        }
        return null;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R> R R3(int[] iArr, R r11, x00.q<? super Integer, ? super s1, ? super R, ? extends R> operation) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$foldRightIndexed$0");
        g0.p(operation, "operation");
        for (int Me = a0.Me(iArr); Me >= 0; Me--) {
            r11 = operation.invoke(Integer.valueOf(Me), s1.b(t1.m(iArr, Me)), r11);
        }
        return r11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int R4(int[] iArr, int i11) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$indexOf$0");
        return a0.Zf(iArr, i11);
    }

    @j(name = "maxByOrThrow-U")
    @y0(version = "1.7")
    @kotlin.d
    @o00.f
    public static final <R extends Comparable<? super R>> short R5(short[] sArr, l<? super c2, ? extends R> selector) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$maxBy$0");
        g0.p(selector, "selector");
        if (d2.s(sArr)) {
            throw new NoSuchElementException();
        }
        short m11 = d2.m(sArr, 0);
        int Pe = a0.Pe(sArr);
        if (Pe != 0) {
            R invoke = selector.invoke(c2.b(m11));
            int i11 = 1;
            if (1 <= Pe) {
                while (true) {
                    short m12 = d2.m(sArr, i11);
                    R invoke2 = selector.invoke(c2.b(m12));
                    if (invoke.compareTo(invoke2) < 0) {
                        m11 = m12;
                        invoke = invoke2;
                    }
                    if (i11 == Pe) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return m11;
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final <R extends Comparable<? super R>> c2 R6(short[] sArr, l<? super c2, ? extends R> selector) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$minByOrNull$0");
        g0.p(selector, "selector");
        if (d2.s(sArr)) {
            return null;
        }
        short m11 = d2.m(sArr, 0);
        int Pe = a0.Pe(sArr);
        if (Pe == 0) {
            return c2.b(m11);
        }
        R invoke = selector.invoke(c2.b(m11));
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                short m12 = d2.m(sArr, i11);
                R invoke2 = selector.invoke(c2.b(m12));
                if (invoke.compareTo(invoke2) > 0) {
                    m11 = m12;
                    invoke = invoke2;
                }
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return c2.b(m11);
    }

    @j(name = "minWithOrThrow-U")
    @y0(version = "1.7")
    @kotlin.d
    public static final short R7(@k short[] sArr, @k Comparator<? super c2> comparator) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$minWith$0");
        g0.p(comparator, "comparator");
        if (d2.s(sArr)) {
            throw new NoSuchElementException();
        }
        short m11 = d2.m(sArr, 0);
        int Pe = a0.Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                short m12 = d2.m(sArr, i11);
                if (comparator.compare(c2.b(m11), c2.b(m12)) > 0) {
                    m11 = m12;
                }
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return m11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final long R8(long[] jArr, x00.q<? super Integer, ? super w1, ? super w1, w1> operation) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$reduceIndexed$0");
        g0.p(operation, "operation");
        if (x1.s(jArr)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long m11 = x1.m(jArr, 0);
        int Ne = a0.Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                m11 = operation.invoke(Integer.valueOf(i11), w1.b(m11), w1.b(x1.m(jArr, i11))).m0();
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return m11;
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final List<c2> R9(short[] sArr, p<? super c2, ? super c2, c2> operation) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$runningReduce$0");
        g0.p(operation, "operation");
        if (d2.s(sArr)) {
            return h0.J();
        }
        short m11 = d2.m(sArr, 0);
        ArrayList arrayList = new ArrayList(d2.o(sArr));
        arrayList.add(c2.b(m11));
        int o11 = d2.o(sArr);
        for (int i11 = 1; i11 < o11; i11++) {
            m11 = operation.invoke(c2.b(m11), c2.b(d2.m(sArr, i11))).k0();
            arrayList.add(c2.b(m11));
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final byte[] Ra(@k byte[] bArr, @k Collection<Integer> indices) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$sliceArray$0");
        g0.p(indices, "indices");
        return p1.f(a0.ru(bArr, indices));
    }

    @j(name = "sumOfDouble")
    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final double Rb(short[] sArr, l<? super c2, Double> selector) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$sumOf$0");
        g0.p(selector, "selector");
        int o11 = d2.o(sArr);
        double d11 = 0.0d;
        for (int i11 = 0; i11 < o11; i11++) {
            d11 += selector.invoke(c2.b(d2.m(sArr, i11))).doubleValue();
        }
        return d11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final short[] Rc(short[] sArr) {
        g0.p(sArr, "<this>");
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        g0.o(copyOf, "copyOf(...)");
        return d2.f(copyOf);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int S0(int[] iArr) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$component5$0");
        return t1.m(iArr, 4);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final List<o1> S1(byte[] bArr, l<? super o1, Boolean> predicate) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$dropLastWhile$0");
        g0.p(predicate, "predicate");
        for (int Ie = a0.Ie(bArr); -1 < Ie; Ie--) {
            if (!predicate.invoke(o1.b(p1.m(bArr, Ie))).booleanValue()) {
                return mc(bArr, Ie + 1);
            }
        }
        return h0.J();
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final o1 S2(byte[] bArr, l<? super o1, Boolean> predicate) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$findLast$0");
        g0.p(predicate, "predicate");
        int o11 = p1.o(bArr) - 1;
        if (o11 < 0) {
            return null;
        }
        while (true) {
            int i11 = o11 - 1;
            byte m11 = p1.m(bArr, o11);
            if (predicate.invoke(o1.b(m11)).booleanValue()) {
                return o1.b(m11);
            }
            if (i11 < 0) {
                return null;
            }
            o11 = i11;
        }
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final void S3(byte[] bArr, l<? super o1, g2> action) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$forEach$0");
        g0.p(action, "action");
        int o11 = p1.o(bArr);
        for (int i11 = 0; i11 < o11; i11++) {
            action.invoke(o1.b(p1.m(bArr, i11)));
        }
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int S4(byte[] bArr, l<? super o1, Boolean> predicate) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$indexOfFirst$0");
        g0.p(predicate, "predicate");
        int length = bArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (predicate.invoke(o1.b(o1.i(bArr[i11]))).booleanValue()) {
                return i11;
            }
        }
        return -1;
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final double S5(byte[] bArr, l<? super o1, Double> selector) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$maxOf$0");
        g0.p(selector, "selector");
        if (p1.s(bArr)) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(o1.b(p1.m(bArr, 0))).doubleValue();
        int Ie = a0.Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                doubleValue = Math.max(doubleValue, selector.invoke(o1.b(p1.m(bArr, i11))).doubleValue());
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return doubleValue;
    }

    @j(name = "minByOrThrow-U")
    @y0(version = "1.7")
    @kotlin.d
    @o00.f
    public static final <R extends Comparable<? super R>> byte S6(byte[] bArr, l<? super o1, ? extends R> selector) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$minBy$0");
        g0.p(selector, "selector");
        if (p1.s(bArr)) {
            throw new NoSuchElementException();
        }
        byte m11 = p1.m(bArr, 0);
        int Ie = a0.Ie(bArr);
        if (Ie != 0) {
            R invoke = selector.invoke(o1.b(m11));
            int i11 = 1;
            if (1 <= Ie) {
                while (true) {
                    byte m12 = p1.m(bArr, i11);
                    R invoke2 = selector.invoke(o1.b(m12));
                    if (invoke.compareTo(invoke2) > 0) {
                        m11 = m12;
                        invoke = invoke2;
                    }
                    if (i11 == Ie) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return m11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final boolean S7(int[] iArr) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$none$0");
        return t1.s(iArr);
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final s1 S8(int[] iArr, x00.q<? super Integer, ? super s1, ? super s1, s1> operation) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$reduceIndexedOrNull$0");
        g0.p(operation, "operation");
        if (t1.s(iArr)) {
            return null;
        }
        int m11 = t1.m(iArr, 0);
        int Me = a0.Me(iArr);
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                m11 = operation.invoke(Integer.valueOf(i11), s1.b(m11), s1.b(t1.m(iArr, i11))).m0();
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return s1.b(m11);
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final List<s1> S9(int[] iArr, x00.q<? super Integer, ? super s1, ? super s1, s1> operation) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$runningReduceIndexed$0");
        g0.p(operation, "operation");
        if (t1.s(iArr)) {
            return h0.J();
        }
        int m11 = t1.m(iArr, 0);
        ArrayList arrayList = new ArrayList(t1.o(iArr));
        arrayList.add(s1.b(m11));
        int o11 = t1.o(iArr);
        for (int i11 = 1; i11 < o11; i11++) {
            m11 = operation.invoke(Integer.valueOf(i11), s1.b(m11), s1.b(t1.m(iArr, i11))).m0();
            arrayList.add(s1.b(m11));
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    public static final void Sa(@k int[] iArr) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$sort$0");
        if (t1.o(iArr) > 1) {
            a00.c2.l(iArr, 0, t1.o(iArr));
        }
    }

    @j(name = "sumOfInt")
    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final int Sb(byte[] bArr, l<? super o1, Integer> selector) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$sumOf$0");
        g0.p(selector, "selector");
        int o11 = p1.o(bArr);
        int i11 = 0;
        for (int i12 = 0; i12 < o11; i12++) {
            i11 += selector.invoke(o1.b(p1.m(bArr, i12))).intValue();
        }
        return i11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final Iterable<a1<s1>> Sc(@k final int[] iArr) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$withIndex$0");
        return new b1(new x00.a() { // from class: d00.c
            @Override // x00.a
            public final Object invoke() {
                Iterator Yc;
                Yc = g.Yc(iArr);
                return Yc;
            }
        });
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final byte T0(byte[] bArr) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$component5$0");
        return p1.m(bArr, 4);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final List<w1> T1(long[] jArr, l<? super w1, Boolean> predicate) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$dropLastWhile$0");
        g0.p(predicate, "predicate");
        for (int Ne = a0.Ne(jArr); -1 < Ne; Ne--) {
            if (!predicate.invoke(w1.b(x1.m(jArr, Ne))).booleanValue()) {
                return pc(jArr, Ne + 1);
            }
        }
        return h0.J();
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final w1 T2(long[] jArr, l<? super w1, Boolean> predicate) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$findLast$0");
        g0.p(predicate, "predicate");
        int o11 = x1.o(jArr) - 1;
        if (o11 < 0) {
            return null;
        }
        while (true) {
            int i11 = o11 - 1;
            long m11 = x1.m(jArr, o11);
            if (predicate.invoke(w1.b(m11)).booleanValue()) {
                return w1.b(m11);
            }
            if (i11 < 0) {
                return null;
            }
            o11 = i11;
        }
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final void T3(long[] jArr, l<? super w1, g2> action) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$forEach$0");
        g0.p(action, "action");
        int o11 = x1.o(jArr);
        for (int i11 = 0; i11 < o11; i11++) {
            action.invoke(w1.b(x1.m(jArr, i11)));
        }
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int T4(long[] jArr, l<? super w1, Boolean> predicate) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$indexOfFirst$0");
        g0.p(predicate, "predicate");
        int length = jArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (predicate.invoke(w1.b(w1.i(jArr[i11]))).booleanValue()) {
                return i11;
            }
        }
        return -1;
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final float T5(byte[] bArr, l<? super o1, Float> selector) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$maxOf$0");
        g0.p(selector, "selector");
        if (p1.s(bArr)) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(o1.b(p1.m(bArr, 0))).floatValue();
        int Ie = a0.Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                floatValue = Math.max(floatValue, selector.invoke(o1.b(p1.m(bArr, i11))).floatValue());
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return floatValue;
    }

    @j(name = "minByOrThrow-U")
    @y0(version = "1.7")
    @kotlin.d
    @o00.f
    public static final <R extends Comparable<? super R>> int T6(int[] iArr, l<? super s1, ? extends R> selector) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$minBy$0");
        g0.p(selector, "selector");
        if (t1.s(iArr)) {
            throw new NoSuchElementException();
        }
        int m11 = t1.m(iArr, 0);
        int Me = a0.Me(iArr);
        if (Me != 0) {
            R invoke = selector.invoke(s1.b(m11));
            int i11 = 1;
            if (1 <= Me) {
                while (true) {
                    int m12 = t1.m(iArr, i11);
                    R invoke2 = selector.invoke(s1.b(m12));
                    if (invoke.compareTo(invoke2) > 0) {
                        m11 = m12;
                        invoke = invoke2;
                    }
                    if (i11 == Me) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return m11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final boolean T7(byte[] bArr) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$none$0");
        return p1.s(bArr);
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final o1 T8(byte[] bArr, x00.q<? super Integer, ? super o1, ? super o1, o1> operation) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$reduceIndexedOrNull$0");
        g0.p(operation, "operation");
        if (p1.s(bArr)) {
            return null;
        }
        byte m11 = p1.m(bArr, 0);
        int Ie = a0.Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                m11 = operation.invoke(Integer.valueOf(i11), o1.b(m11), o1.b(p1.m(bArr, i11))).k0();
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return o1.b(m11);
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final List<o1> T9(byte[] bArr, x00.q<? super Integer, ? super o1, ? super o1, o1> operation) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$runningReduceIndexed$0");
        g0.p(operation, "operation");
        if (p1.s(bArr)) {
            return h0.J();
        }
        byte m11 = p1.m(bArr, 0);
        ArrayList arrayList = new ArrayList(p1.o(bArr));
        arrayList.add(o1.b(m11));
        int o11 = p1.o(bArr);
        for (int i11 = 1; i11 < o11; i11++) {
            m11 = operation.invoke(Integer.valueOf(i11), o1.b(m11), o1.b(p1.m(bArr, i11))).k0();
            arrayList.add(o1.b(m11));
        }
        return arrayList;
    }

    @y0(version = "1.4")
    @kotlin.d
    public static final void Ta(@k long[] jArr, int i11, int i12) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$sort$0");
        a00.d.Companion.d(i11, i12, x1.o(jArr));
        if (i11 < i12 - 1) {
            a00.c2.i(jArr, i11, i12);
        }
    }

    @j(name = "sumOfInt")
    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final int Tb(int[] iArr, l<? super s1, Integer> selector) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$sumOf$0");
        g0.p(selector, "selector");
        int o11 = t1.o(iArr);
        int i11 = 0;
        for (int i12 = 0; i12 < o11; i12++) {
            i11 += selector.invoke(s1.b(t1.m(iArr, i12))).intValue();
        }
        return i11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final Iterable<a1<o1>> Tc(@k final byte[] bArr) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$withIndex$0");
        return new b1(new x00.a() { // from class: d00.e
            @Override // x00.a
            public final Object invoke() {
                Iterator Wc;
                Wc = g.Wc(bArr);
                return Wc;
            }
        });
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final long U0(long[] jArr) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$component5$0");
        return x1.m(jArr, 4);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final List<s1> U1(int[] iArr, l<? super s1, Boolean> predicate) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$dropLastWhile$0");
        g0.p(predicate, "predicate");
        for (int Me = a0.Me(iArr); -1 < Me; Me--) {
            if (!predicate.invoke(s1.b(t1.m(iArr, Me))).booleanValue()) {
                return oc(iArr, Me + 1);
            }
        }
        return h0.J();
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final s1 U2(int[] iArr, l<? super s1, Boolean> predicate) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$findLast$0");
        g0.p(predicate, "predicate");
        int o11 = t1.o(iArr) - 1;
        if (o11 < 0) {
            return null;
        }
        while (true) {
            int i11 = o11 - 1;
            int m11 = t1.m(iArr, o11);
            if (predicate.invoke(s1.b(m11)).booleanValue()) {
                return s1.b(m11);
            }
            if (i11 < 0) {
                return null;
            }
            o11 = i11;
        }
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final void U3(int[] iArr, l<? super s1, g2> action) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$forEach$0");
        g0.p(action, "action");
        int o11 = t1.o(iArr);
        for (int i11 = 0; i11 < o11; i11++) {
            action.invoke(s1.b(t1.m(iArr, i11)));
        }
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int U4(int[] iArr, l<? super s1, Boolean> predicate) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$indexOfFirst$0");
        g0.p(predicate, "predicate");
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (predicate.invoke(s1.b(s1.i(iArr[i11]))).booleanValue()) {
                return i11;
            }
        }
        return -1;
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final <R extends Comparable<? super R>> R U5(byte[] bArr, l<? super o1, ? extends R> selector) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$maxOf$0");
        g0.p(selector, "selector");
        if (p1.s(bArr)) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(o1.b(p1.m(bArr, 0)));
        int Ie = a0.Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                R invoke2 = selector.invoke(o1.b(p1.m(bArr, i11)));
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @j(name = "minByOrThrow-U")
    @y0(version = "1.7")
    @kotlin.d
    @o00.f
    public static final <R extends Comparable<? super R>> long U6(long[] jArr, l<? super w1, ? extends R> selector) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$minBy$0");
        g0.p(selector, "selector");
        if (x1.s(jArr)) {
            throw new NoSuchElementException();
        }
        long m11 = x1.m(jArr, 0);
        int Ne = a0.Ne(jArr);
        if (Ne != 0) {
            R invoke = selector.invoke(w1.b(m11));
            int i11 = 1;
            if (1 <= Ne) {
                while (true) {
                    long m12 = x1.m(jArr, i11);
                    R invoke2 = selector.invoke(w1.b(m12));
                    if (invoke.compareTo(invoke2) > 0) {
                        m11 = m12;
                        invoke = invoke2;
                    }
                    if (i11 == Ne) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return m11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final boolean U7(byte[] bArr, l<? super o1, Boolean> predicate) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$none$0");
        g0.p(predicate, "predicate");
        int o11 = p1.o(bArr);
        for (int i11 = 0; i11 < o11; i11++) {
            if (predicate.invoke(o1.b(p1.m(bArr, i11))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final c2 U8(short[] sArr, x00.q<? super Integer, ? super c2, ? super c2, c2> operation) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$reduceIndexedOrNull$0");
        g0.p(operation, "operation");
        if (d2.s(sArr)) {
            return null;
        }
        short m11 = d2.m(sArr, 0);
        int Pe = a0.Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                m11 = operation.invoke(Integer.valueOf(i11), c2.b(m11), c2.b(d2.m(sArr, i11))).k0();
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return c2.b(m11);
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final List<c2> U9(short[] sArr, x00.q<? super Integer, ? super c2, ? super c2, c2> operation) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$runningReduceIndexed$0");
        g0.p(operation, "operation");
        if (d2.s(sArr)) {
            return h0.J();
        }
        short m11 = d2.m(sArr, 0);
        ArrayList arrayList = new ArrayList(d2.o(sArr));
        arrayList.add(c2.b(m11));
        int o11 = d2.o(sArr);
        for (int i11 = 1; i11 < o11; i11++) {
            m11 = operation.invoke(Integer.valueOf(i11), c2.b(m11), c2.b(d2.m(sArr, i11))).k0();
            arrayList.add(c2.b(m11));
        }
        return arrayList;
    }

    public static /* synthetic */ void Ua(long[] jArr, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = x1.o(jArr);
        }
        Ta(jArr, i11, i12);
    }

    @j(name = "sumOfInt")
    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final int Ub(long[] jArr, l<? super w1, Integer> selector) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$sumOf$0");
        g0.p(selector, "selector");
        int o11 = x1.o(jArr);
        int i11 = 0;
        for (int i12 = 0; i12 < o11; i12++) {
            i11 += selector.invoke(w1.b(x1.m(jArr, i12))).intValue();
        }
        return i11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final Iterable<a1<w1>> Uc(@k final long[] jArr) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$withIndex$0");
        return new b1(new x00.a() { // from class: d00.d
            @Override // x00.a
            public final Object invoke() {
                Iterator Xc;
                Xc = g.Xc(jArr);
                return Xc;
            }
        });
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final short V0(short[] sArr) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$component5$0");
        return d2.m(sArr, 4);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final List<c2> V1(short[] sArr, l<? super c2, Boolean> predicate) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$dropLastWhile$0");
        g0.p(predicate, "predicate");
        for (int Pe = a0.Pe(sArr); -1 < Pe; Pe--) {
            if (!predicate.invoke(c2.b(d2.m(sArr, Pe))).booleanValue()) {
                return nc(sArr, Pe + 1);
            }
        }
        return h0.J();
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final c2 V2(short[] sArr, l<? super c2, Boolean> predicate) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$findLast$0");
        g0.p(predicate, "predicate");
        int o11 = d2.o(sArr) - 1;
        if (o11 < 0) {
            return null;
        }
        while (true) {
            int i11 = o11 - 1;
            short m11 = d2.m(sArr, o11);
            if (predicate.invoke(c2.b(m11)).booleanValue()) {
                return c2.b(m11);
            }
            if (i11 < 0) {
                return null;
            }
            o11 = i11;
        }
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final void V3(short[] sArr, l<? super c2, g2> action) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$forEach$0");
        g0.p(action, "action");
        int o11 = d2.o(sArr);
        for (int i11 = 0; i11 < o11; i11++) {
            action.invoke(c2.b(d2.m(sArr, i11)));
        }
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int V4(short[] sArr, l<? super c2, Boolean> predicate) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$indexOfFirst$0");
        g0.p(predicate, "predicate");
        int length = sArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (predicate.invoke(c2.b(c2.i(sArr[i11]))).booleanValue()) {
                return i11;
            }
        }
        return -1;
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final double V5(long[] jArr, l<? super w1, Double> selector) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$maxOf$0");
        g0.p(selector, "selector");
        if (x1.s(jArr)) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(w1.b(x1.m(jArr, 0))).doubleValue();
        int Ne = a0.Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                doubleValue = Math.max(doubleValue, selector.invoke(w1.b(x1.m(jArr, i11))).doubleValue());
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return doubleValue;
    }

    @j(name = "minByOrThrow-U")
    @y0(version = "1.7")
    @kotlin.d
    @o00.f
    public static final <R extends Comparable<? super R>> short V6(short[] sArr, l<? super c2, ? extends R> selector) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$minBy$0");
        g0.p(selector, "selector");
        if (d2.s(sArr)) {
            throw new NoSuchElementException();
        }
        short m11 = d2.m(sArr, 0);
        int Pe = a0.Pe(sArr);
        if (Pe != 0) {
            R invoke = selector.invoke(c2.b(m11));
            int i11 = 1;
            if (1 <= Pe) {
                while (true) {
                    short m12 = d2.m(sArr, i11);
                    R invoke2 = selector.invoke(c2.b(m12));
                    if (invoke.compareTo(invoke2) > 0) {
                        m11 = m12;
                        invoke = invoke2;
                    }
                    if (i11 == Pe) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return m11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final boolean V7(long[] jArr, l<? super w1, Boolean> predicate) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$none$0");
        g0.p(predicate, "predicate");
        int o11 = x1.o(jArr);
        for (int i11 = 0; i11 < o11; i11++) {
            if (predicate.invoke(w1.b(x1.m(jArr, i11))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final w1 V8(long[] jArr, x00.q<? super Integer, ? super w1, ? super w1, w1> operation) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$reduceIndexedOrNull$0");
        g0.p(operation, "operation");
        if (x1.s(jArr)) {
            return null;
        }
        long m11 = x1.m(jArr, 0);
        int Ne = a0.Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                m11 = operation.invoke(Integer.valueOf(i11), w1.b(m11), w1.b(x1.m(jArr, i11))).m0();
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return w1.b(m11);
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final List<w1> V9(long[] jArr, x00.q<? super Integer, ? super w1, ? super w1, w1> operation) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$runningReduceIndexed$0");
        g0.p(operation, "operation");
        if (x1.s(jArr)) {
            return h0.J();
        }
        long m11 = x1.m(jArr, 0);
        ArrayList arrayList = new ArrayList(x1.o(jArr));
        arrayList.add(w1.b(m11));
        int o11 = x1.o(jArr);
        for (int i11 = 1; i11 < o11; i11++) {
            m11 = operation.invoke(Integer.valueOf(i11), w1.b(m11), w1.b(x1.m(jArr, i11))).m0();
            arrayList.add(w1.b(m11));
        }
        return arrayList;
    }

    @y0(version = "1.4")
    @kotlin.d
    public static final void Va(@k byte[] bArr, int i11, int i12) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$sort$0");
        a00.d.Companion.d(i11, i12, p1.o(bArr));
        if (i11 < i12 - 1) {
            a00.c2.j(bArr, i11, i12);
        }
    }

    @j(name = "sumOfInt")
    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final int Vb(short[] sArr, l<? super c2, Integer> selector) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$sumOf$0");
        g0.p(selector, "selector");
        int o11 = d2.o(sArr);
        int i11 = 0;
        for (int i12 = 0; i12 < o11; i12++) {
            i11 += selector.invoke(c2.b(d2.m(sArr, i12))).intValue();
        }
        return i11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final Iterable<a1<c2>> Vc(@k final short[] sArr) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$withIndex$0");
        return new b1(new x00.a() { // from class: d00.f
            @Override // x00.a
            public final Object invoke() {
                Iterator Zc;
                Zc = g.Zc(sArr);
                return Zc;
            }
        });
    }

    @y0(version = "1.4")
    @kotlin.d
    public static boolean W0(@m80.l short[] sArr, @m80.l short[] sArr2) {
        if (sArr == null) {
            sArr = null;
        }
        if (sArr2 == null) {
            sArr2 = null;
        }
        return Arrays.equals(sArr, sArr2);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final List<o1> W1(byte[] bArr, l<? super o1, Boolean> predicate) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$dropWhile$0");
        g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int o11 = p1.o(bArr);
        boolean z11 = false;
        for (int i11 = 0; i11 < o11; i11++) {
            byte m11 = p1.m(bArr, i11);
            if (z11) {
                arrayList.add(o1.b(m11));
            } else if (!predicate.invoke(o1.b(m11)).booleanValue()) {
                arrayList.add(o1.b(m11));
                z11 = true;
            }
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int W2(int[] iArr) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$first$0");
        return s1.i(a0.fc(iArr));
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final void W3(byte[] bArr, p<? super Integer, ? super o1, g2> action) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$forEachIndexed$0");
        g0.p(action, "action");
        int o11 = p1.o(bArr);
        int i11 = 0;
        int i12 = 0;
        while (i11 < o11) {
            action.invoke(Integer.valueOf(i12), o1.b(p1.m(bArr, i11)));
            i11++;
            i12++;
        }
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int W4(byte[] bArr, l<? super o1, Boolean> predicate) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$indexOfLast$0");
        g0.p(predicate, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (predicate.invoke(o1.b(o1.i(bArr[length]))).booleanValue()) {
                    return length;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
        }
        return -1;
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final float W5(long[] jArr, l<? super w1, Float> selector) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$maxOf$0");
        g0.p(selector, "selector");
        if (x1.s(jArr)) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(w1.b(x1.m(jArr, 0))).floatValue();
        int Ne = a0.Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                floatValue = Math.max(floatValue, selector.invoke(w1.b(x1.m(jArr, i11))).floatValue());
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return floatValue;
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final double W6(byte[] bArr, l<? super o1, Double> selector) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$minOf$0");
        g0.p(selector, "selector");
        if (p1.s(bArr)) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(o1.b(p1.m(bArr, 0))).doubleValue();
        int Ie = a0.Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                doubleValue = Math.min(doubleValue, selector.invoke(o1.b(p1.m(bArr, i11))).doubleValue());
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return doubleValue;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final boolean W7(long[] jArr) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$none$0");
        return x1.s(jArr);
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final o1 W8(byte[] bArr, p<? super o1, ? super o1, o1> operation) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$reduceOrNull$0");
        g0.p(operation, "operation");
        if (p1.s(bArr)) {
            return null;
        }
        byte m11 = p1.m(bArr, 0);
        int Ie = a0.Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                m11 = operation.invoke(o1.b(m11), o1.b(p1.m(bArr, i11))).k0();
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return o1.b(m11);
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final <R> List<R> W9(long[] jArr, R r11, p<? super R, ? super w1, ? extends R> operation) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$scan$0");
        g0.p(operation, "operation");
        if (x1.s(jArr)) {
            return a00.g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(x1.o(jArr) + 1);
        arrayList.add(r11);
        int o11 = x1.o(jArr);
        for (int i11 = 0; i11 < o11; i11++) {
            r11 = operation.invoke(r11, w1.b(x1.m(jArr, i11)));
            arrayList.add(r11);
        }
        return arrayList;
    }

    public static /* synthetic */ void Wa(byte[] bArr, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = p1.o(bArr);
        }
        Va(bArr, i11, i12);
    }

    @j(name = "sumOfLong")
    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final long Wb(byte[] bArr, l<? super o1, Long> selector) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$sumOf$0");
        g0.p(selector, "selector");
        int o11 = p1.o(bArr);
        long j11 = 0;
        for (int i11 = 0; i11 < o11; i11++) {
            j11 += selector.invoke(o1.b(p1.m(bArr, i11))).longValue();
        }
        return j11;
    }

    public static final Iterator Wc(byte[] bArr) {
        return p1.t(bArr);
    }

    @y0(version = "1.4")
    @kotlin.d
    public static boolean X0(@m80.l int[] iArr, @m80.l int[] iArr2) {
        if (iArr == null) {
            iArr = null;
        }
        if (iArr2 == null) {
            iArr2 = null;
        }
        return Arrays.equals(iArr, iArr2);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final List<w1> X1(long[] jArr, l<? super w1, Boolean> predicate) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$dropWhile$0");
        g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int o11 = x1.o(jArr);
        boolean z11 = false;
        for (int i11 = 0; i11 < o11; i11++) {
            long m11 = x1.m(jArr, i11);
            if (z11) {
                arrayList.add(w1.b(m11));
            } else if (!predicate.invoke(w1.b(m11)).booleanValue()) {
                arrayList.add(w1.b(m11));
                z11 = true;
            }
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final byte X2(byte[] bArr) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$first$0");
        return o1.i(a0.Xb(bArr));
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final void X3(int[] iArr, p<? super Integer, ? super s1, g2> action) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$forEachIndexed$0");
        g0.p(action, "action");
        int o11 = t1.o(iArr);
        int i11 = 0;
        int i12 = 0;
        while (i11 < o11) {
            action.invoke(Integer.valueOf(i12), s1.b(t1.m(iArr, i11)));
            i11++;
            i12++;
        }
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int X4(long[] jArr, l<? super w1, Boolean> predicate) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$indexOfLast$0");
        g0.p(predicate, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (predicate.invoke(w1.b(w1.i(jArr[length]))).booleanValue()) {
                    return length;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
        }
        return -1;
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final <R extends Comparable<? super R>> R X5(long[] jArr, l<? super w1, ? extends R> selector) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$maxOf$0");
        g0.p(selector, "selector");
        if (x1.s(jArr)) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(w1.b(x1.m(jArr, 0)));
        int Ne = a0.Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                R invoke2 = selector.invoke(w1.b(x1.m(jArr, i11)));
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final float X6(byte[] bArr, l<? super o1, Float> selector) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$minOf$0");
        g0.p(selector, "selector");
        if (p1.s(bArr)) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(o1.b(p1.m(bArr, 0))).floatValue();
        int Ie = a0.Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                floatValue = Math.min(floatValue, selector.invoke(o1.b(p1.m(bArr, i11))).floatValue());
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return floatValue;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final boolean X7(int[] iArr, l<? super s1, Boolean> predicate) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$none$0");
        g0.p(predicate, "predicate");
        int o11 = t1.o(iArr);
        for (int i11 = 0; i11 < o11; i11++) {
            if (predicate.invoke(s1.b(t1.m(iArr, i11))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final s1 X8(int[] iArr, p<? super s1, ? super s1, s1> operation) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$reduceOrNull$0");
        g0.p(operation, "operation");
        if (t1.s(iArr)) {
            return null;
        }
        int m11 = t1.m(iArr, 0);
        int Me = a0.Me(iArr);
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                m11 = operation.invoke(s1.b(m11), s1.b(t1.m(iArr, i11))).m0();
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return s1.b(m11);
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final <R> List<R> X9(byte[] bArr, R r11, p<? super R, ? super o1, ? extends R> operation) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$scan$0");
        g0.p(operation, "operation");
        if (p1.s(bArr)) {
            return a00.g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(p1.o(bArr) + 1);
        arrayList.add(r11);
        int o11 = p1.o(bArr);
        for (int i11 = 0; i11 < o11; i11++) {
            r11 = operation.invoke(r11, o1.b(p1.m(bArr, i11)));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @y0(version = "1.4")
    @kotlin.d
    public static final void Xa(@k short[] sArr, int i11, int i12) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$sort$0");
        a00.d.Companion.d(i11, i12, d2.o(sArr));
        if (i11 < i12 - 1) {
            a00.c2.k(sArr, i11, i12);
        }
    }

    @j(name = "sumOfLong")
    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final long Xb(int[] iArr, l<? super s1, Long> selector) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$sumOf$0");
        g0.p(selector, "selector");
        int o11 = t1.o(iArr);
        long j11 = 0;
        for (int i11 = 0; i11 < o11; i11++) {
            j11 += selector.invoke(s1.b(t1.m(iArr, i11))).longValue();
        }
        return j11;
    }

    public static final Iterator Xc(long[] jArr) {
        return x1.t(jArr);
    }

    @y0(version = "1.4")
    @kotlin.d
    public static boolean Y0(@m80.l byte[] bArr, @m80.l byte[] bArr2) {
        if (bArr == null) {
            bArr = null;
        }
        if (bArr2 == null) {
            bArr2 = null;
        }
        return Arrays.equals(bArr, bArr2);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final List<s1> Y1(int[] iArr, l<? super s1, Boolean> predicate) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$dropWhile$0");
        g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int o11 = t1.o(iArr);
        boolean z11 = false;
        for (int i11 = 0; i11 < o11; i11++) {
            int m11 = t1.m(iArr, i11);
            if (z11) {
                arrayList.add(s1.b(m11));
            } else if (!predicate.invoke(s1.b(m11)).booleanValue()) {
                arrayList.add(s1.b(m11));
                z11 = true;
            }
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final byte Y2(byte[] bArr, l<? super o1, Boolean> predicate) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$first$0");
        g0.p(predicate, "predicate");
        int o11 = p1.o(bArr);
        for (int i11 = 0; i11 < o11; i11++) {
            byte m11 = p1.m(bArr, i11);
            if (predicate.invoke(o1.b(m11)).booleanValue()) {
                return m11;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final void Y3(long[] jArr, p<? super Integer, ? super w1, g2> action) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$forEachIndexed$0");
        g0.p(action, "action");
        int o11 = x1.o(jArr);
        int i11 = 0;
        int i12 = 0;
        while (i11 < o11) {
            action.invoke(Integer.valueOf(i12), w1.b(x1.m(jArr, i11)));
            i11++;
            i12++;
        }
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int Y4(int[] iArr, l<? super s1, Boolean> predicate) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$indexOfLast$0");
        g0.p(predicate, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (predicate.invoke(s1.b(s1.i(iArr[length]))).booleanValue()) {
                    return length;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
        }
        return -1;
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final double Y5(int[] iArr, l<? super s1, Double> selector) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$maxOf$0");
        g0.p(selector, "selector");
        if (t1.s(iArr)) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(s1.b(t1.m(iArr, 0))).doubleValue();
        int Me = a0.Me(iArr);
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                doubleValue = Math.max(doubleValue, selector.invoke(s1.b(t1.m(iArr, i11))).doubleValue());
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return doubleValue;
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final <R extends Comparable<? super R>> R Y6(byte[] bArr, l<? super o1, ? extends R> selector) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$minOf$0");
        g0.p(selector, "selector");
        if (p1.s(bArr)) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(o1.b(p1.m(bArr, 0)));
        int Ie = a0.Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                R invoke2 = selector.invoke(o1.b(p1.m(bArr, i11)));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final boolean Y7(short[] sArr) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$none$0");
        return d2.s(sArr);
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final w1 Y8(long[] jArr, p<? super w1, ? super w1, w1> operation) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$reduceOrNull$0");
        g0.p(operation, "operation");
        if (x1.s(jArr)) {
            return null;
        }
        long m11 = x1.m(jArr, 0);
        int Ne = a0.Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                m11 = operation.invoke(w1.b(m11), w1.b(x1.m(jArr, i11))).m0();
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return w1.b(m11);
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final <R> List<R> Y9(int[] iArr, R r11, p<? super R, ? super s1, ? extends R> operation) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$scan$0");
        g0.p(operation, "operation");
        if (t1.s(iArr)) {
            return a00.g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(t1.o(iArr) + 1);
        arrayList.add(r11);
        int o11 = t1.o(iArr);
        for (int i11 = 0; i11 < o11; i11++) {
            r11 = operation.invoke(r11, s1.b(t1.m(iArr, i11)));
            arrayList.add(r11);
        }
        return arrayList;
    }

    public static /* synthetic */ void Ya(short[] sArr, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = d2.o(sArr);
        }
        Xa(sArr, i11, i12);
    }

    @j(name = "sumOfLong")
    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final long Yb(long[] jArr, l<? super w1, Long> selector) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$sumOf$0");
        g0.p(selector, "selector");
        int o11 = x1.o(jArr);
        long j11 = 0;
        for (int i11 = 0; i11 < o11; i11++) {
            j11 += selector.invoke(w1.b(x1.m(jArr, i11))).longValue();
        }
        return j11;
    }

    public static final Iterator Yc(int[] iArr) {
        return t1.t(iArr);
    }

    @y0(version = "1.4")
    @kotlin.d
    public static boolean Z0(@m80.l long[] jArr, @m80.l long[] jArr2) {
        if (jArr == null) {
            jArr = null;
        }
        if (jArr2 == null) {
            jArr2 = null;
        }
        return Arrays.equals(jArr, jArr2);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final List<c2> Z1(short[] sArr, l<? super c2, Boolean> predicate) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$dropWhile$0");
        g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int o11 = d2.o(sArr);
        boolean z11 = false;
        for (int i11 = 0; i11 < o11; i11++) {
            short m11 = d2.m(sArr, i11);
            if (z11) {
                arrayList.add(c2.b(m11));
            } else if (!predicate.invoke(c2.b(m11)).booleanValue()) {
                arrayList.add(c2.b(m11));
                z11 = true;
            }
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final long Z2(long[] jArr, l<? super w1, Boolean> predicate) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$first$0");
        g0.p(predicate, "predicate");
        int o11 = x1.o(jArr);
        for (int i11 = 0; i11 < o11; i11++) {
            long m11 = x1.m(jArr, i11);
            if (predicate.invoke(w1.b(m11)).booleanValue()) {
                return m11;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final void Z3(short[] sArr, p<? super Integer, ? super c2, g2> action) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$forEachIndexed$0");
        g0.p(action, "action");
        int o11 = d2.o(sArr);
        int i11 = 0;
        int i12 = 0;
        while (i11 < o11) {
            action.invoke(Integer.valueOf(i12), c2.b(d2.m(sArr, i11)));
            i11++;
            i12++;
        }
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int Z4(short[] sArr, l<? super c2, Boolean> predicate) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$indexOfLast$0");
        g0.p(predicate, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (predicate.invoke(c2.b(c2.i(sArr[length]))).booleanValue()) {
                    return length;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
        }
        return -1;
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final float Z5(int[] iArr, l<? super s1, Float> selector) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$maxOf$0");
        g0.p(selector, "selector");
        if (t1.s(iArr)) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(s1.b(t1.m(iArr, 0))).floatValue();
        int Me = a0.Me(iArr);
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                floatValue = Math.max(floatValue, selector.invoke(s1.b(t1.m(iArr, i11))).floatValue());
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return floatValue;
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final double Z6(long[] jArr, l<? super w1, Double> selector) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$minOf$0");
        g0.p(selector, "selector");
        if (x1.s(jArr)) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(w1.b(x1.m(jArr, 0))).doubleValue();
        int Ne = a0.Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                doubleValue = Math.min(doubleValue, selector.invoke(w1.b(x1.m(jArr, i11))).doubleValue());
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return doubleValue;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final boolean Z7(short[] sArr, l<? super c2, Boolean> predicate) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$none$0");
        g0.p(predicate, "predicate");
        int o11 = d2.o(sArr);
        for (int i11 = 0; i11 < o11; i11++) {
            if (predicate.invoke(c2.b(d2.m(sArr, i11))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final c2 Z8(short[] sArr, p<? super c2, ? super c2, c2> operation) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$reduceOrNull$0");
        g0.p(operation, "operation");
        if (d2.s(sArr)) {
            return null;
        }
        short m11 = d2.m(sArr, 0);
        int Pe = a0.Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                m11 = operation.invoke(c2.b(m11), c2.b(d2.m(sArr, i11))).k0();
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return c2.b(m11);
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final <R> List<R> Z9(short[] sArr, R r11, p<? super R, ? super c2, ? extends R> operation) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$scan$0");
        g0.p(operation, "operation");
        if (d2.s(sArr)) {
            return a00.g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(d2.o(sArr) + 1);
        arrayList.add(r11);
        int o11 = d2.o(sArr);
        for (int i11 = 0; i11 < o11; i11++) {
            r11 = operation.invoke(r11, c2.b(d2.m(sArr, i11)));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    public static final void Za(@k byte[] bArr) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$sort$0");
        if (p1.o(bArr) > 1) {
            a00.c2.j(bArr, 0, p1.o(bArr));
        }
    }

    @j(name = "sumOfLong")
    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final long Zb(short[] sArr, l<? super c2, Long> selector) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$sumOf$0");
        g0.p(selector, "selector");
        int o11 = d2.o(sArr);
        long j11 = 0;
        for (int i11 = 0; i11 < o11; i11++) {
            j11 += selector.invoke(c2.b(d2.m(sArr, i11))).longValue();
        }
        return j11;
    }

    public static final Iterator Zc(short[] sArr) {
        return d2.t(sArr);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final boolean a0(byte[] bArr, l<? super o1, Boolean> predicate) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$all$0");
        g0.p(predicate, "predicate");
        int o11 = p1.o(bArr);
        for (int i11 = 0; i11 < o11; i11++) {
            if (!predicate.invoke(o1.b(p1.m(bArr, i11))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @y0(version = "1.4")
    @kotlin.d
    public static final int a1(@m80.l byte[] bArr) {
        if (bArr == null) {
            bArr = null;
        }
        return Arrays.hashCode(bArr);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final short a2(short[] sArr, int i11, l<? super Integer, c2> defaultValue) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$elementAtOrElse$0");
        g0.p(defaultValue, "defaultValue");
        return (i11 < 0 || i11 >= d2.o(sArr)) ? defaultValue.invoke(Integer.valueOf(i11)).k0() : d2.m(sArr, i11);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final long a3(long[] jArr) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$first$0");
        return w1.i(a0.hc(jArr));
    }

    @k
    public static final g10.l a4(@k int[] iArr) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$indices$0");
        return a0.De(iArr);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int a5(int[] iArr) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$last$0");
        return s1.i(a0.Ph(iArr));
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final <R extends Comparable<? super R>> R a6(int[] iArr, l<? super s1, ? extends R> selector) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$maxOf$0");
        g0.p(selector, "selector");
        if (t1.s(iArr)) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(s1.b(t1.m(iArr, 0)));
        int Me = a0.Me(iArr);
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                R invoke2 = selector.invoke(s1.b(t1.m(iArr, i11)));
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final float a7(long[] jArr, l<? super w1, Float> selector) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$minOf$0");
        g0.p(selector, "selector");
        if (x1.s(jArr)) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(w1.b(x1.m(jArr, 0))).floatValue();
        int Ne = a0.Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                floatValue = Math.min(floatValue, selector.invoke(w1.b(x1.m(jArr, i11))).floatValue());
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return floatValue;
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final byte[] a8(byte[] bArr, l<? super o1, g2> action) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$onEach$0");
        g0.p(action, "action");
        int o11 = p1.o(bArr);
        for (int i11 = 0; i11 < o11; i11++) {
            action.invoke(o1.b(p1.m(bArr, i11)));
        }
        return bArr;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final byte a9(byte[] bArr, p<? super o1, ? super o1, o1> operation) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$reduceRight$0");
        g0.p(operation, "operation");
        int Ie = a0.Ie(bArr);
        if (Ie < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte m11 = p1.m(bArr, Ie);
        for (int i11 = Ie - 1; i11 >= 0; i11--) {
            m11 = operation.invoke(o1.b(p1.m(bArr, i11)), o1.b(m11)).k0();
        }
        return m11;
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final <R> List<R> aa(byte[] bArr, R r11, x00.q<? super Integer, ? super R, ? super o1, ? extends R> operation) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$scanIndexed$0");
        g0.p(operation, "operation");
        if (p1.s(bArr)) {
            return a00.g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(p1.o(bArr) + 1);
        arrayList.add(r11);
        int o11 = p1.o(bArr);
        for (int i11 = 0; i11 < o11; i11++) {
            r11 = operation.invoke(Integer.valueOf(i11), r11, o1.b(p1.m(bArr, i11)));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    public static final void ab(@k long[] jArr) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$sort$0");
        if (x1.o(jArr) > 1) {
            a00.c2.i(jArr, 0, x1.o(jArr));
        }
    }

    @j(name = "sumOfUByte")
    @y0(version = "1.5")
    public static final int ac(@k o1[] o1VarArr) {
        g0.p(o1VarArr, "<this>");
        int i11 = 0;
        for (o1 o1Var : o1VarArr) {
            i11 = s1.i(i11 + s1.i(o1Var.k0() & 255));
        }
        return i11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R, V> List<V> ad(int[] iArr, Iterable<? extends R> other, p<? super s1, ? super R, ? extends V> transform) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$zip$0");
        g0.p(other, "other");
        g0.p(transform, "transform");
        int o11 = t1.o(iArr);
        ArrayList arrayList = new ArrayList(Math.min(i0.d0(other, 10), o11));
        int i11 = 0;
        for (R r11 : other) {
            if (i11 >= o11) {
                break;
            }
            arrayList.add(transform.invoke(s1.b(t1.m(iArr, i11)), r11));
            i11++;
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final boolean b0(long[] jArr, l<? super w1, Boolean> predicate) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$all$0");
        g0.p(predicate, "predicate");
        int o11 = x1.o(jArr);
        for (int i11 = 0; i11 < o11; i11++) {
            if (!predicate.invoke(w1.b(x1.m(jArr, i11))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @y0(version = "1.4")
    @kotlin.d
    public static final int b1(@m80.l int[] iArr) {
        if (iArr == null) {
            iArr = null;
        }
        return Arrays.hashCode(iArr);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int b2(int[] iArr, int i11, l<? super Integer, s1> defaultValue) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$elementAtOrElse$0");
        g0.p(defaultValue, "defaultValue");
        return (i11 < 0 || i11 >= t1.o(iArr)) ? defaultValue.invoke(Integer.valueOf(i11)).m0() : t1.m(iArr, i11);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int b3(int[] iArr, l<? super s1, Boolean> predicate) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$first$0");
        g0.p(predicate, "predicate");
        int o11 = t1.o(iArr);
        for (int i11 = 0; i11 < o11; i11++) {
            int m11 = t1.m(iArr, i11);
            if (predicate.invoke(s1.b(m11)).booleanValue()) {
                return m11;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final byte b5(byte[] bArr) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$last$0");
        return o1.i(a0.Hh(bArr));
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final double b6(short[] sArr, l<? super c2, Double> selector) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$maxOf$0");
        g0.p(selector, "selector");
        if (d2.s(sArr)) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(c2.b(d2.m(sArr, 0))).doubleValue();
        int Pe = a0.Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                doubleValue = Math.max(doubleValue, selector.invoke(c2.b(d2.m(sArr, i11))).doubleValue());
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return doubleValue;
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final <R extends Comparable<? super R>> R b7(long[] jArr, l<? super w1, ? extends R> selector) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$minOf$0");
        g0.p(selector, "selector");
        if (x1.s(jArr)) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(w1.b(x1.m(jArr, 0)));
        int Ne = a0.Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                R invoke2 = selector.invoke(w1.b(x1.m(jArr, i11)));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final long[] b8(long[] jArr, l<? super w1, g2> action) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$onEach$0");
        g0.p(action, "action");
        int o11 = x1.o(jArr);
        for (int i11 = 0; i11 < o11; i11++) {
            action.invoke(w1.b(x1.m(jArr, i11)));
        }
        return jArr;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int b9(int[] iArr, p<? super s1, ? super s1, s1> operation) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$reduceRight$0");
        g0.p(operation, "operation");
        int Me = a0.Me(iArr);
        if (Me < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int m11 = t1.m(iArr, Me);
        for (int i11 = Me - 1; i11 >= 0; i11--) {
            m11 = operation.invoke(s1.b(t1.m(iArr, i11)), s1.b(m11)).m0();
        }
        return m11;
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final <R> List<R> ba(short[] sArr, R r11, x00.q<? super Integer, ? super R, ? super c2, ? extends R> operation) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$scanIndexed$0");
        g0.p(operation, "operation");
        if (d2.s(sArr)) {
            return a00.g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(d2.o(sArr) + 1);
        arrayList.add(r11);
        int o11 = d2.o(sArr);
        for (int i11 = 0; i11 < o11; i11++) {
            r11 = operation.invoke(Integer.valueOf(i11), r11, c2.b(d2.m(sArr, i11)));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @y0(version = "1.4")
    @kotlin.d
    public static final void bb(@k int[] iArr, int i11, int i12) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$sort$0");
        a00.d.Companion.d(i11, i12, t1.o(iArr));
        if (i11 < i12 - 1) {
            a00.c2.l(iArr, i11, i12);
        }
    }

    @j(name = "sumOfUInt")
    @y0(version = "1.5")
    @kotlin.d
    @o00.f
    public static final int bc(byte[] bArr, l<? super o1, s1> selector) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$sumOf$0");
        g0.p(selector, "selector");
        int i11 = s1.i(0);
        int o11 = p1.o(bArr);
        for (int i12 = 0; i12 < o11; i12++) {
            i11 = s1.i(i11 + selector.invoke(o1.b(p1.m(bArr, i12))).m0());
        }
        return i11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R, V> List<V> bd(long[] jArr, R[] other, p<? super w1, ? super R, ? extends V> transform) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$zip$0");
        g0.p(other, "other");
        g0.p(transform, "transform");
        int min = Math.min(x1.o(jArr), other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(transform.invoke(w1.b(x1.m(jArr, i11)), other[i11]));
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final boolean c0(int[] iArr, l<? super s1, Boolean> predicate) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$all$0");
        g0.p(predicate, "predicate");
        int o11 = t1.o(iArr);
        for (int i11 = 0; i11 < o11; i11++) {
            if (!predicate.invoke(s1.b(t1.m(iArr, i11))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @y0(version = "1.4")
    @kotlin.d
    public static final int c1(@m80.l short[] sArr) {
        if (sArr == null) {
            sArr = null;
        }
        return Arrays.hashCode(sArr);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final long c2(long[] jArr, int i11, l<? super Integer, w1> defaultValue) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$elementAtOrElse$0");
        g0.p(defaultValue, "defaultValue");
        return (i11 < 0 || i11 >= x1.o(jArr)) ? defaultValue.invoke(Integer.valueOf(i11)).m0() : x1.m(jArr, i11);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final short c3(short[] sArr) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$first$0");
        return c2.i(a0.lc(sArr));
    }

    @k
    public static final g10.l c4(@k byte[] bArr) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$indices$0");
        return a0.ze(bArr);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final byte c5(byte[] bArr, l<? super o1, Boolean> predicate) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$last$0");
        g0.p(predicate, "predicate");
        int o11 = p1.o(bArr) - 1;
        if (o11 >= 0) {
            while (true) {
                int i11 = o11 - 1;
                byte m11 = p1.m(bArr, o11);
                if (!predicate.invoke(o1.b(m11)).booleanValue()) {
                    if (i11 < 0) {
                        break;
                    }
                    o11 = i11;
                } else {
                    return m11;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final float c6(short[] sArr, l<? super c2, Float> selector) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$maxOf$0");
        g0.p(selector, "selector");
        if (d2.s(sArr)) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(c2.b(d2.m(sArr, 0))).floatValue();
        int Pe = a0.Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                floatValue = Math.max(floatValue, selector.invoke(c2.b(d2.m(sArr, i11))).floatValue());
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return floatValue;
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final double c7(int[] iArr, l<? super s1, Double> selector) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$minOf$0");
        g0.p(selector, "selector");
        if (t1.s(iArr)) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(s1.b(t1.m(iArr, 0))).doubleValue();
        int Me = a0.Me(iArr);
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                doubleValue = Math.min(doubleValue, selector.invoke(s1.b(t1.m(iArr, i11))).doubleValue());
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return doubleValue;
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final int[] c8(int[] iArr, l<? super s1, g2> action) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$onEach$0");
        g0.p(action, "action");
        int o11 = t1.o(iArr);
        for (int i11 = 0; i11 < o11; i11++) {
            action.invoke(s1.b(t1.m(iArr, i11)));
        }
        return iArr;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final long c9(long[] jArr, p<? super w1, ? super w1, w1> operation) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$reduceRight$0");
        g0.p(operation, "operation");
        int Ne = a0.Ne(jArr);
        if (Ne < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long m11 = x1.m(jArr, Ne);
        for (int i11 = Ne - 1; i11 >= 0; i11--) {
            m11 = operation.invoke(w1.b(x1.m(jArr, i11)), w1.b(m11)).m0();
        }
        return m11;
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final <R> List<R> ca(long[] jArr, R r11, x00.q<? super Integer, ? super R, ? super w1, ? extends R> operation) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$scanIndexed$0");
        g0.p(operation, "operation");
        if (x1.s(jArr)) {
            return a00.g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(x1.o(jArr) + 1);
        arrayList.add(r11);
        int o11 = x1.o(jArr);
        for (int i11 = 0; i11 < o11; i11++) {
            r11 = operation.invoke(Integer.valueOf(i11), r11, w1.b(x1.m(jArr, i11)));
            arrayList.add(r11);
        }
        return arrayList;
    }

    public static /* synthetic */ void cb(int[] iArr, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = t1.o(iArr);
        }
        bb(iArr, i11, i12);
    }

    @j(name = "sumOfUInt")
    @y0(version = "1.5")
    @kotlin.d
    @o00.f
    public static final int cc(int[] iArr, l<? super s1, s1> selector) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$sumOf$0");
        g0.p(selector, "selector");
        int i11 = s1.i(0);
        int o11 = t1.o(iArr);
        for (int i12 = 0; i12 < o11; i12++) {
            i11 = s1.i(i11 + selector.invoke(s1.b(t1.m(iArr, i12))).m0());
        }
        return i11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final <R> List<Pair<s1, R>> cd(@k int[] iArr, @k R[] other) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$zip$0");
        g0.p(other, "other");
        int min = Math.min(t1.o(iArr), other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            int m11 = t1.m(iArr, i11);
            arrayList.add(h1.a(s1.b(m11), other[i11]));
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final boolean d0(short[] sArr, l<? super c2, Boolean> predicate) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$all$0");
        g0.p(predicate, "predicate");
        int o11 = d2.o(sArr);
        for (int i11 = 0; i11 < o11; i11++) {
            if (!predicate.invoke(c2.b(d2.m(sArr, i11))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @y0(version = "1.4")
    @kotlin.d
    public static final int d1(@m80.l long[] jArr) {
        if (jArr == null) {
            jArr = null;
        }
        return Arrays.hashCode(jArr);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final byte d2(byte[] bArr, int i11, l<? super Integer, o1> defaultValue) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$elementAtOrElse$0");
        g0.p(defaultValue, "defaultValue");
        return (i11 < 0 || i11 >= p1.o(bArr)) ? defaultValue.invoke(Integer.valueOf(i11)).k0() : p1.m(bArr, i11);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final short d3(short[] sArr, l<? super c2, Boolean> predicate) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$first$0");
        g0.p(predicate, "predicate");
        int o11 = d2.o(sArr);
        for (int i11 = 0; i11 < o11; i11++) {
            short m11 = d2.m(sArr, i11);
            if (predicate.invoke(c2.b(m11)).booleanValue()) {
                return m11;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final long d5(long[] jArr, l<? super w1, Boolean> predicate) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$last$0");
        g0.p(predicate, "predicate");
        int o11 = x1.o(jArr) - 1;
        if (o11 >= 0) {
            while (true) {
                int i11 = o11 - 1;
                long m11 = x1.m(jArr, o11);
                if (!predicate.invoke(w1.b(m11)).booleanValue()) {
                    if (i11 < 0) {
                        break;
                    }
                    o11 = i11;
                } else {
                    return m11;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final <R extends Comparable<? super R>> R d6(short[] sArr, l<? super c2, ? extends R> selector) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$maxOf$0");
        g0.p(selector, "selector");
        if (d2.s(sArr)) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(c2.b(d2.m(sArr, 0)));
        int Pe = a0.Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                R invoke2 = selector.invoke(c2.b(d2.m(sArr, i11)));
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final float d7(int[] iArr, l<? super s1, Float> selector) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$minOf$0");
        g0.p(selector, "selector");
        if (t1.s(iArr)) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(s1.b(t1.m(iArr, 0))).floatValue();
        int Me = a0.Me(iArr);
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                floatValue = Math.min(floatValue, selector.invoke(s1.b(t1.m(iArr, i11))).floatValue());
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return floatValue;
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final short[] d8(short[] sArr, l<? super c2, g2> action) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$onEach$0");
        g0.p(action, "action");
        int o11 = d2.o(sArr);
        for (int i11 = 0; i11 < o11; i11++) {
            action.invoke(c2.b(d2.m(sArr, i11)));
        }
        return sArr;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final short d9(short[] sArr, p<? super c2, ? super c2, c2> operation) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$reduceRight$0");
        g0.p(operation, "operation");
        int Pe = a0.Pe(sArr);
        if (Pe < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short m11 = d2.m(sArr, Pe);
        for (int i11 = Pe - 1; i11 >= 0; i11--) {
            m11 = operation.invoke(c2.b(d2.m(sArr, i11)), c2.b(m11)).k0();
        }
        return m11;
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final <R> List<R> da(int[] iArr, R r11, x00.q<? super Integer, ? super R, ? super s1, ? extends R> operation) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$scanIndexed$0");
        g0.p(operation, "operation");
        if (t1.s(iArr)) {
            return a00.g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(t1.o(iArr) + 1);
        arrayList.add(r11);
        int o11 = t1.o(iArr);
        for (int i11 = 0; i11 < o11; i11++) {
            r11 = operation.invoke(Integer.valueOf(i11), r11, s1.b(t1.m(iArr, i11)));
            arrayList.add(r11);
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    public static final void db(@k short[] sArr) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$sort$0");
        if (d2.o(sArr) > 1) {
            a00.c2.k(sArr, 0, d2.o(sArr));
        }
    }

    @j(name = "sumOfUInt")
    @y0(version = "1.5")
    @kotlin.d
    @o00.f
    public static final int dc(long[] jArr, l<? super w1, s1> selector) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$sumOf$0");
        g0.p(selector, "selector");
        int i11 = s1.i(0);
        int o11 = x1.o(jArr);
        for (int i12 = 0; i12 < o11; i12++) {
            i11 = s1.i(i11 + selector.invoke(w1.b(x1.m(jArr, i12))).m0());
        }
        return i11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final <R> List<Pair<w1, R>> dd(@k long[] jArr, @k Iterable<? extends R> other) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$zip$0");
        g0.p(other, "other");
        int o11 = x1.o(jArr);
        ArrayList arrayList = new ArrayList(Math.min(i0.d0(other, 10), o11));
        int i11 = 0;
        for (R r11 : other) {
            if (i11 >= o11) {
                break;
            }
            arrayList.add(h1.a(w1.b(x1.m(jArr, i11)), r11));
            i11++;
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final boolean e0(int[] iArr) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$any$0");
        return a0.u5(iArr);
    }

    @y0(version = "1.4")
    @kotlin.d
    @k
    public static String e1(@m80.l byte[] bArr) {
        String r32;
        return (bArr == null || (r32 = r0.r3(p1.b(bArr), j2.O, "[", "]", 0, null, null, 56, null)) == null) ? "null" : r32;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final o1 e2(byte[] bArr, int i11) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$elementAtOrNull$0");
        return u4(bArr, i11);
    }

    @m80.l
    @y0(version = "1.3")
    @kotlin.d
    public static final s1 e3(@k int[] iArr) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$firstOrNull$0");
        if (t1.s(iArr)) {
            return null;
        }
        return s1.b(t1.m(iArr, 0));
    }

    @k
    public static final g10.l e4(@k long[] jArr) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$indices$0");
        return a0.Ee(jArr);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final long e5(long[] jArr) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$last$0");
        return w1.i(a0.Rh(jArr));
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final <R extends Comparable<? super R>> R e6(byte[] bArr, l<? super o1, ? extends R> selector) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$maxOfOrNull$0");
        g0.p(selector, "selector");
        if (p1.s(bArr)) {
            return null;
        }
        R invoke = selector.invoke(o1.b(p1.m(bArr, 0)));
        int Ie = a0.Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                R invoke2 = selector.invoke(o1.b(p1.m(bArr, i11)));
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final <R extends Comparable<? super R>> R e7(int[] iArr, l<? super s1, ? extends R> selector) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$minOf$0");
        g0.p(selector, "selector");
        if (t1.s(iArr)) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(s1.b(t1.m(iArr, 0)));
        int Me = a0.Me(iArr);
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                R invoke2 = selector.invoke(s1.b(t1.m(iArr, i11)));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final byte[] e8(byte[] bArr, p<? super Integer, ? super o1, g2> action) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$onEachIndexed$0");
        g0.p(action, "action");
        int o11 = p1.o(bArr);
        int i11 = 0;
        int i12 = 0;
        while (i11 < o11) {
            action.invoke(Integer.valueOf(i12), o1.b(p1.m(bArr, i11)));
            i11++;
            i12++;
        }
        return bArr;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int e9(int[] iArr, x00.q<? super Integer, ? super s1, ? super s1, s1> operation) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$reduceRightIndexed$0");
        g0.p(operation, "operation");
        int Me = a0.Me(iArr);
        if (Me < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int m11 = t1.m(iArr, Me);
        for (int i11 = Me - 1; i11 >= 0; i11--) {
            m11 = operation.invoke(Integer.valueOf(i11), s1.b(t1.m(iArr, i11)), s1.b(m11)).m0();
        }
        return m11;
    }

    @y0(version = "1.4")
    @kotlin.d
    public static final void ea(@k int[] iArr) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$shuffle$0");
        fa(iArr, Random.Default);
    }

    @y0(version = "1.3")
    @kotlin.d
    public static final void eb(@k int[] iArr) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$sortDescending$0");
        if (t1.o(iArr) > 1) {
            Sa(iArr);
            a0.rr(iArr);
        }
    }

    @j(name = "sumOfUInt")
    @y0(version = "1.5")
    public static final int ec(@k s1[] s1VarArr) {
        g0.p(s1VarArr, "<this>");
        int i11 = 0;
        for (s1 s1Var : s1VarArr) {
            i11 = s1.i(i11 + s1Var.m0());
        }
        return i11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final <R> List<Pair<s1, R>> ed(@k int[] iArr, @k Iterable<? extends R> other) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$zip$0");
        g0.p(other, "other");
        int o11 = t1.o(iArr);
        ArrayList arrayList = new ArrayList(Math.min(i0.d0(other, 10), o11));
        int i11 = 0;
        for (R r11 : other) {
            if (i11 >= o11) {
                break;
            }
            arrayList.add(h1.a(s1.b(t1.m(iArr, i11)), r11));
            i11++;
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final boolean f0(byte[] bArr) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$any$0");
        return a0.m5(bArr);
    }

    @y0(version = "1.4")
    @kotlin.d
    @k
    public static String f1(@m80.l int[] iArr) {
        String r32;
        return (iArr == null || (r32 = r0.r3(t1.b(iArr), j2.O, "[", "]", 0, null, null, 56, null)) == null) ? "null" : r32;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final c2 f2(short[] sArr, int i11) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$elementAtOrNull$0");
        return v4(sArr, i11);
    }

    @m80.l
    @y0(version = "1.3")
    @kotlin.d
    public static final o1 f3(@k byte[] bArr) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$firstOrNull$0");
        if (p1.s(bArr)) {
            return null;
        }
        return o1.b(p1.m(bArr, 0));
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int f5(int[] iArr, l<? super s1, Boolean> predicate) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$last$0");
        g0.p(predicate, "predicate");
        int o11 = t1.o(iArr) - 1;
        if (o11 >= 0) {
            while (true) {
                int i11 = o11 - 1;
                int m11 = t1.m(iArr, o11);
                if (!predicate.invoke(s1.b(m11)).booleanValue()) {
                    if (i11 < 0) {
                        break;
                    }
                    o11 = i11;
                } else {
                    return m11;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final Double f6(byte[] bArr, l<? super o1, Double> selector) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$maxOfOrNull$0");
        g0.p(selector, "selector");
        if (p1.s(bArr)) {
            return null;
        }
        double doubleValue = selector.invoke(o1.b(p1.m(bArr, 0))).doubleValue();
        int Ie = a0.Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                doubleValue = Math.max(doubleValue, selector.invoke(o1.b(p1.m(bArr, i11))).doubleValue());
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final double f7(short[] sArr, l<? super c2, Double> selector) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$minOf$0");
        g0.p(selector, "selector");
        if (d2.s(sArr)) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(c2.b(d2.m(sArr, 0))).doubleValue();
        int Pe = a0.Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                doubleValue = Math.min(doubleValue, selector.invoke(c2.b(d2.m(sArr, i11))).doubleValue());
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return doubleValue;
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final int[] f8(int[] iArr, p<? super Integer, ? super s1, g2> action) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$onEachIndexed$0");
        g0.p(action, "action");
        int o11 = t1.o(iArr);
        int i11 = 0;
        int i12 = 0;
        while (i11 < o11) {
            action.invoke(Integer.valueOf(i12), s1.b(t1.m(iArr, i11)));
            i11++;
            i12++;
        }
        return iArr;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final byte f9(byte[] bArr, x00.q<? super Integer, ? super o1, ? super o1, o1> operation) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$reduceRightIndexed$0");
        g0.p(operation, "operation");
        int Ie = a0.Ie(bArr);
        if (Ie < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte m11 = p1.m(bArr, Ie);
        for (int i11 = Ie - 1; i11 >= 0; i11--) {
            m11 = operation.invoke(Integer.valueOf(i11), o1.b(p1.m(bArr, i11)), o1.b(m11)).k0();
        }
        return m11;
    }

    @y0(version = "1.4")
    @kotlin.d
    public static final void fa(@k int[] iArr, @k Random random) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$shuffle$0");
        g0.p(random, "random");
        for (int Me = a0.Me(iArr); Me > 0; Me--) {
            int nextInt = random.nextInt(Me + 1);
            int m11 = t1.m(iArr, Me);
            t1.u(iArr, Me, t1.m(iArr, nextInt));
            t1.u(iArr, nextInt, m11);
        }
    }

    @y0(version = "1.4")
    @kotlin.d
    public static final void fb(@k long[] jArr, int i11, int i12) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$sortDescending$0");
        Ta(jArr, i11, i12);
        a0.ur(jArr, i11, i12);
    }

    @j(name = "sumOfUInt")
    @y0(version = "1.5")
    @kotlin.d
    @o00.f
    public static final int fc(short[] sArr, l<? super c2, s1> selector) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$sumOf$0");
        g0.p(selector, "selector");
        int i11 = s1.i(0);
        int o11 = d2.o(sArr);
        for (int i12 = 0; i12 < o11; i12++) {
            i11 = s1.i(i11 + selector.invoke(c2.b(d2.m(sArr, i12))).m0());
        }
        return i11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <V> List<V> fd(byte[] bArr, byte[] bArr2, p<? super o1, ? super o1, ? extends V> transform) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$zip$0");
        g0.p(bArr2, "$v$c$kotlin-UByteArray$-other$0");
        g0.p(transform, "transform");
        int min = Math.min(p1.o(bArr), p1.o(bArr2));
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(transform.invoke(o1.b(p1.m(bArr, i11)), o1.b(p1.m(bArr2, i11))));
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final boolean g0(byte[] bArr, l<? super o1, Boolean> predicate) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$any$0");
        g0.p(predicate, "predicate");
        int o11 = p1.o(bArr);
        for (int i11 = 0; i11 < o11; i11++) {
            if (predicate.invoke(o1.b(p1.m(bArr, i11))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @y0(version = "1.4")
    @kotlin.d
    @k
    public static String g1(@m80.l short[] sArr) {
        String r32;
        return (sArr == null || (r32 = r0.r3(d2.b(sArr), j2.O, "[", "]", 0, null, null, 56, null)) == null) ? "null" : r32;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final s1 g2(int[] iArr, int i11) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$elementAtOrNull$0");
        return w4(iArr, i11);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final o1 g3(byte[] bArr, l<? super o1, Boolean> predicate) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$firstOrNull$0");
        g0.p(predicate, "predicate");
        int o11 = p1.o(bArr);
        for (int i11 = 0; i11 < o11; i11++) {
            byte m11 = p1.m(bArr, i11);
            if (predicate.invoke(o1.b(m11)).booleanValue()) {
                return o1.b(m11);
            }
        }
        return null;
    }

    @k
    public static final g10.l g4(@k short[] sArr) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$indices$0");
        return a0.Ge(sArr);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final short g5(short[] sArr) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$last$0");
        return c2.i(a0.Vh(sArr));
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final Float g6(byte[] bArr, l<? super o1, Float> selector) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$maxOfOrNull$0");
        g0.p(selector, "selector");
        if (p1.s(bArr)) {
            return null;
        }
        float floatValue = selector.invoke(o1.b(p1.m(bArr, 0))).floatValue();
        int Ie = a0.Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                floatValue = Math.max(floatValue, selector.invoke(o1.b(p1.m(bArr, i11))).floatValue());
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final float g7(short[] sArr, l<? super c2, Float> selector) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$minOf$0");
        g0.p(selector, "selector");
        if (d2.s(sArr)) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(c2.b(d2.m(sArr, 0))).floatValue();
        int Pe = a0.Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                floatValue = Math.min(floatValue, selector.invoke(c2.b(d2.m(sArr, i11))).floatValue());
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return floatValue;
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final long[] g8(long[] jArr, p<? super Integer, ? super w1, g2> action) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$onEachIndexed$0");
        g0.p(action, "action");
        int o11 = x1.o(jArr);
        int i11 = 0;
        int i12 = 0;
        while (i11 < o11) {
            action.invoke(Integer.valueOf(i12), w1.b(x1.m(jArr, i11)));
            i11++;
            i12++;
        }
        return jArr;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final short g9(short[] sArr, x00.q<? super Integer, ? super c2, ? super c2, c2> operation) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$reduceRightIndexed$0");
        g0.p(operation, "operation");
        int Pe = a0.Pe(sArr);
        if (Pe < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short m11 = d2.m(sArr, Pe);
        for (int i11 = Pe - 1; i11 >= 0; i11--) {
            m11 = operation.invoke(Integer.valueOf(i11), c2.b(d2.m(sArr, i11)), c2.b(m11)).k0();
        }
        return m11;
    }

    @y0(version = "1.4")
    @kotlin.d
    public static final void ga(@k byte[] bArr) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$shuffle$0");
        ja(bArr, Random.Default);
    }

    @y0(version = "1.4")
    @kotlin.d
    public static final void gb(@k byte[] bArr, int i11, int i12) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$sortDescending$0");
        Va(bArr, i11, i12);
        a0.kr(bArr, i11, i12);
    }

    @j(name = "sumOfULong")
    @y0(version = "1.5")
    @kotlin.d
    @p0
    @o00.f
    public static final long gc(byte[] bArr, l<? super o1, w1> selector) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$sumOf$0");
        g0.p(selector, "selector");
        long i11 = w1.i(0L);
        int o11 = p1.o(bArr);
        for (int i12 = 0; i12 < o11; i12++) {
            i11 = w1.i(i11 + selector.invoke(o1.b(p1.m(bArr, i12))).m0());
        }
        return i11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final <R> List<Pair<c2, R>> gd(@k short[] sArr, @k Iterable<? extends R> other) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$zip$0");
        g0.p(other, "other");
        int o11 = d2.o(sArr);
        ArrayList arrayList = new ArrayList(Math.min(i0.d0(other, 10), o11));
        int i11 = 0;
        for (R r11 : other) {
            if (i11 >= o11) {
                break;
            }
            arrayList.add(h1.a(c2.b(d2.m(sArr, i11)), r11));
            i11++;
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final boolean h0(long[] jArr, l<? super w1, Boolean> predicate) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$any$0");
        g0.p(predicate, "predicate");
        int o11 = x1.o(jArr);
        for (int i11 = 0; i11 < o11; i11++) {
            if (predicate.invoke(w1.b(x1.m(jArr, i11))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @y0(version = "1.4")
    @kotlin.d
    @k
    public static String h1(@m80.l long[] jArr) {
        String r32;
        return (jArr == null || (r32 = r0.r3(x1.b(jArr), j2.O, "[", "]", 0, null, null, 56, null)) == null) ? "null" : r32;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final w1 h2(long[] jArr, int i11) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$elementAtOrNull$0");
        return x4(jArr, i11);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final w1 h3(long[] jArr, l<? super w1, Boolean> predicate) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$firstOrNull$0");
        g0.p(predicate, "predicate");
        int o11 = x1.o(jArr);
        for (int i11 = 0; i11 < o11; i11++) {
            long m11 = x1.m(jArr, i11);
            if (predicate.invoke(w1.b(m11)).booleanValue()) {
                return w1.b(m11);
            }
        }
        return null;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final short h5(short[] sArr, l<? super c2, Boolean> predicate) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$last$0");
        g0.p(predicate, "predicate");
        int o11 = d2.o(sArr) - 1;
        if (o11 >= 0) {
            while (true) {
                int i11 = o11 - 1;
                short m11 = d2.m(sArr, o11);
                if (!predicate.invoke(c2.b(m11)).booleanValue()) {
                    if (i11 < 0) {
                        break;
                    }
                    o11 = i11;
                } else {
                    return m11;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final <R extends Comparable<? super R>> R h6(long[] jArr, l<? super w1, ? extends R> selector) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$maxOfOrNull$0");
        g0.p(selector, "selector");
        if (x1.s(jArr)) {
            return null;
        }
        R invoke = selector.invoke(w1.b(x1.m(jArr, 0)));
        int Ne = a0.Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                R invoke2 = selector.invoke(w1.b(x1.m(jArr, i11)));
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final <R extends Comparable<? super R>> R h7(short[] sArr, l<? super c2, ? extends R> selector) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$minOf$0");
        g0.p(selector, "selector");
        if (d2.s(sArr)) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(c2.b(d2.m(sArr, 0)));
        int Pe = a0.Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                R invoke2 = selector.invoke(c2.b(d2.m(sArr, i11)));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final short[] h8(short[] sArr, p<? super Integer, ? super c2, g2> action) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$onEachIndexed$0");
        g0.p(action, "action");
        int o11 = d2.o(sArr);
        int i11 = 0;
        int i12 = 0;
        while (i11 < o11) {
            action.invoke(Integer.valueOf(i12), c2.b(d2.m(sArr, i11)));
            i11++;
            i12++;
        }
        return sArr;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final long h9(long[] jArr, x00.q<? super Integer, ? super w1, ? super w1, w1> operation) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$reduceRightIndexed$0");
        g0.p(operation, "operation");
        int Ne = a0.Ne(jArr);
        if (Ne < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long m11 = x1.m(jArr, Ne);
        for (int i11 = Ne - 1; i11 >= 0; i11--) {
            m11 = operation.invoke(Integer.valueOf(i11), w1.b(x1.m(jArr, i11)), w1.b(m11)).m0();
        }
        return m11;
    }

    @y0(version = "1.4")
    @kotlin.d
    public static final void ha(@k long[] jArr, @k Random random) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$shuffle$0");
        g0.p(random, "random");
        for (int Ne = a0.Ne(jArr); Ne > 0; Ne--) {
            int nextInt = random.nextInt(Ne + 1);
            long m11 = x1.m(jArr, Ne);
            x1.u(jArr, Ne, x1.m(jArr, nextInt));
            x1.u(jArr, nextInt, m11);
        }
    }

    @y0(version = "1.4")
    @kotlin.d
    public static final void hb(@k short[] sArr, int i11, int i12) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$sortDescending$0");
        Xa(sArr, i11, i12);
        a0.yr(sArr, i11, i12);
    }

    @j(name = "sumOfULong")
    @y0(version = "1.5")
    @kotlin.d
    @p0
    @o00.f
    public static final long hc(int[] iArr, l<? super s1, w1> selector) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$sumOf$0");
        g0.p(selector, "selector");
        long i11 = w1.i(0L);
        int o11 = t1.o(iArr);
        for (int i12 = 0; i12 < o11; i12++) {
            i11 = w1.i(i11 + selector.invoke(s1.b(t1.m(iArr, i12))).m0());
        }
        return i11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final <R> List<Pair<o1, R>> hd(@k byte[] bArr, @k Iterable<? extends R> other) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$zip$0");
        g0.p(other, "other");
        int o11 = p1.o(bArr);
        ArrayList arrayList = new ArrayList(Math.min(i0.d0(other, 10), o11));
        int i11 = 0;
        for (R r11 : other) {
            if (i11 >= o11) {
                break;
            }
            arrayList.add(h1.a(o1.b(p1.m(bArr, i11)), r11));
            i11++;
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final boolean i0(long[] jArr) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$any$0");
        return a0.w5(jArr);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final long[] i1(long[] jArr, long[] jArr2, int i11, int i12, int i13) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$copyInto$0");
        g0.p(jArr2, "$v$c$kotlin-ULongArray$-destination$0");
        q.A0(jArr, jArr2, i11, i12, i13);
        return jArr2;
    }

    @y0(version = "1.3")
    @kotlin.d
    public static final void i2(@k int[] iArr, int i11, int i12, int i13) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$fill$0");
        q.K1(iArr, i11, i12, i13);
    }

    @m80.l
    @y0(version = "1.3")
    @kotlin.d
    public static final w1 i3(@k long[] jArr) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$firstOrNull$0");
        if (x1.s(jArr)) {
            return null;
        }
        return w1.b(x1.m(jArr, 0));
    }

    public static final int i4(@k int[] iArr) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$lastIndex$0");
        return a0.Me(iArr);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int i5(long[] jArr, long j11) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$lastIndexOf$0");
        return a0.ei(jArr, j11);
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final Double i6(long[] jArr, l<? super w1, Double> selector) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$maxOfOrNull$0");
        g0.p(selector, "selector");
        if (x1.s(jArr)) {
            return null;
        }
        double doubleValue = selector.invoke(w1.b(x1.m(jArr, 0))).doubleValue();
        int Ne = a0.Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                doubleValue = Math.max(doubleValue, selector.invoke(w1.b(x1.m(jArr, i11))).doubleValue());
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final <R extends Comparable<? super R>> R i7(byte[] bArr, l<? super o1, ? extends R> selector) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$minOfOrNull$0");
        g0.p(selector, "selector");
        if (p1.s(bArr)) {
            return null;
        }
        R invoke = selector.invoke(o1.b(p1.m(bArr, 0)));
        int Ie = a0.Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                R invoke2 = selector.invoke(o1.b(p1.m(bArr, i11)));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final long[] i8(long[] jArr, long j11) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$plus$0");
        return x1.f(q.t3(jArr, j11));
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final s1 i9(int[] iArr, x00.q<? super Integer, ? super s1, ? super s1, s1> operation) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$reduceRightIndexedOrNull$0");
        g0.p(operation, "operation");
        int Me = a0.Me(iArr);
        if (Me < 0) {
            return null;
        }
        int m11 = t1.m(iArr, Me);
        for (int i11 = Me - 1; i11 >= 0; i11--) {
            m11 = operation.invoke(Integer.valueOf(i11), s1.b(t1.m(iArr, i11)), s1.b(m11)).m0();
        }
        return s1.b(m11);
    }

    @y0(version = "1.4")
    @kotlin.d
    public static final void ia(@k long[] jArr) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$shuffle$0");
        ha(jArr, Random.Default);
    }

    @y0(version = "1.3")
    @kotlin.d
    public static final void ib(@k byte[] bArr) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$sortDescending$0");
        if (p1.o(bArr) > 1) {
            Za(bArr);
            a0.jr(bArr);
        }
    }

    @j(name = "sumOfULong")
    @y0(version = "1.5")
    @kotlin.d
    @p0
    @o00.f
    public static final long ic(long[] jArr, l<? super w1, w1> selector) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$sumOf$0");
        g0.p(selector, "selector");
        long i11 = w1.i(0L);
        int o11 = x1.o(jArr);
        for (int i12 = 0; i12 < o11; i12++) {
            i11 = w1.i(i11 + selector.invoke(w1.b(x1.m(jArr, i12))).m0());
        }
        return i11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <V> List<V> id(int[] iArr, int[] iArr2, p<? super s1, ? super s1, ? extends V> transform) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$zip$0");
        g0.p(iArr2, "$v$c$kotlin-UIntArray$-other$0");
        g0.p(transform, "transform");
        int min = Math.min(t1.o(iArr), t1.o(iArr2));
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(transform.invoke(s1.b(t1.m(iArr, i11)), s1.b(t1.m(iArr2, i11))));
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final boolean j0(int[] iArr, l<? super s1, Boolean> predicate) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$any$0");
        g0.p(predicate, "predicate");
        int o11 = t1.o(iArr);
        for (int i11 = 0; i11 < o11; i11++) {
            if (predicate.invoke(s1.b(t1.m(iArr, i11))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ long[] j1(long[] jArr, long[] jArr2, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = x1.o(jArr);
        }
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$copyInto$0");
        g0.p(jArr2, "$v$c$kotlin-ULongArray$-destination$0");
        q.A0(jArr, jArr2, i11, i12, i13);
        return jArr2;
    }

    public static /* synthetic */ void j2(int[] iArr, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i12 = 0;
        }
        if ((i14 & 4) != 0) {
            i13 = t1.o(iArr);
        }
        i2(iArr, i11, i12, i13);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final s1 j3(int[] iArr, l<? super s1, Boolean> predicate) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$firstOrNull$0");
        g0.p(predicate, "predicate");
        int o11 = t1.o(iArr);
        for (int i11 = 0; i11 < o11; i11++) {
            int m11 = t1.m(iArr, i11);
            if (predicate.invoke(s1.b(m11)).booleanValue()) {
                return s1.b(m11);
            }
        }
        return null;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int j5(short[] sArr, short s11) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$lastIndexOf$0");
        return a0.gi(sArr, s11);
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final Float j6(long[] jArr, l<? super w1, Float> selector) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$maxOfOrNull$0");
        g0.p(selector, "selector");
        if (x1.s(jArr)) {
            return null;
        }
        float floatValue = selector.invoke(w1.b(x1.m(jArr, 0))).floatValue();
        int Ne = a0.Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                floatValue = Math.max(floatValue, selector.invoke(w1.b(x1.m(jArr, i11))).floatValue());
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final Double j7(byte[] bArr, l<? super o1, Double> selector) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$minOfOrNull$0");
        g0.p(selector, "selector");
        if (p1.s(bArr)) {
            return null;
        }
        double doubleValue = selector.invoke(o1.b(p1.m(bArr, 0))).doubleValue();
        int Ie = a0.Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                doubleValue = Math.min(doubleValue, selector.invoke(o1.b(p1.m(bArr, i11))).doubleValue());
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final int[] j8(@k int[] iArr, @k Collection<s1> elements) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$plus$0");
        g0.p(elements, "elements");
        int o11 = t1.o(iArr);
        int[] copyOf = Arrays.copyOf(iArr, t1.o(iArr) + elements.size());
        g0.o(copyOf, "copyOf(...)");
        Iterator<s1> it = elements.iterator();
        while (it.hasNext()) {
            copyOf[o11] = it.next().m0();
            o11++;
        }
        return t1.f(copyOf);
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final o1 j9(byte[] bArr, x00.q<? super Integer, ? super o1, ? super o1, o1> operation) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$reduceRightIndexedOrNull$0");
        g0.p(operation, "operation");
        int Ie = a0.Ie(bArr);
        if (Ie < 0) {
            return null;
        }
        byte m11 = p1.m(bArr, Ie);
        for (int i11 = Ie - 1; i11 >= 0; i11--) {
            m11 = operation.invoke(Integer.valueOf(i11), o1.b(p1.m(bArr, i11)), o1.b(m11)).k0();
        }
        return o1.b(m11);
    }

    @y0(version = "1.4")
    @kotlin.d
    public static final void ja(@k byte[] bArr, @k Random random) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$shuffle$0");
        g0.p(random, "random");
        for (int Ie = a0.Ie(bArr); Ie > 0; Ie--) {
            int nextInt = random.nextInt(Ie + 1);
            byte m11 = p1.m(bArr, Ie);
            p1.u(bArr, Ie, p1.m(bArr, nextInt));
            p1.u(bArr, nextInt, m11);
        }
    }

    @y0(version = "1.3")
    @kotlin.d
    public static final void jb(@k long[] jArr) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$sortDescending$0");
        if (x1.o(jArr) > 1) {
            ab(jArr);
            a0.tr(jArr);
        }
    }

    @j(name = "sumOfULong")
    @y0(version = "1.5")
    public static final long jc(@k w1[] w1VarArr) {
        g0.p(w1VarArr, "<this>");
        long j11 = 0;
        for (w1 w1Var : w1VarArr) {
            j11 = w1.i(j11 + w1Var.m0());
        }
        return j11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R, V> List<V> jd(byte[] bArr, R[] other, p<? super o1, ? super R, ? extends V> transform) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$zip$0");
        g0.p(other, "other");
        g0.p(transform, "transform");
        int min = Math.min(p1.o(bArr), other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(transform.invoke(o1.b(p1.m(bArr, i11)), other[i11]));
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final boolean k0(short[] sArr) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$any$0");
        return a0.A5(sArr);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final short[] k1(short[] sArr, short[] sArr2, int i11, int i12, int i13) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$copyInto$0");
        g0.p(sArr2, "$v$c$kotlin-UShortArray$-destination$0");
        q.C0(sArr, sArr2, i11, i12, i13);
        return sArr2;
    }

    @y0(version = "1.3")
    @kotlin.d
    public static final void k2(@k short[] sArr, short s11, int i11, int i12) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$fill$0");
        q.N1(sArr, s11, i11, i12);
    }

    @m80.l
    @y0(version = "1.3")
    @kotlin.d
    public static final c2 k3(@k short[] sArr) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$firstOrNull$0");
        if (d2.s(sArr)) {
            return null;
        }
        return c2.b(d2.m(sArr, 0));
    }

    public static final int k4(@k byte[] bArr) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$lastIndex$0");
        return a0.Ie(bArr);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int k5(byte[] bArr, byte b11) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$lastIndexOf$0");
        return a0.Zh(bArr, b11);
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final <R extends Comparable<? super R>> R k6(int[] iArr, l<? super s1, ? extends R> selector) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$maxOfOrNull$0");
        g0.p(selector, "selector");
        if (t1.s(iArr)) {
            return null;
        }
        R invoke = selector.invoke(s1.b(t1.m(iArr, 0)));
        int Me = a0.Me(iArr);
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                R invoke2 = selector.invoke(s1.b(t1.m(iArr, i11)));
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final Float k7(byte[] bArr, l<? super o1, Float> selector) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$minOfOrNull$0");
        g0.p(selector, "selector");
        if (p1.s(bArr)) {
            return null;
        }
        float floatValue = selector.invoke(o1.b(p1.m(bArr, 0))).floatValue();
        int Ie = a0.Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                floatValue = Math.min(floatValue, selector.invoke(o1.b(p1.m(bArr, i11))).floatValue());
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final short[] k8(short[] sArr, short s11) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$plus$0");
        return d2.f(q.A3(sArr, s11));
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final c2 k9(short[] sArr, x00.q<? super Integer, ? super c2, ? super c2, c2> operation) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$reduceRightIndexedOrNull$0");
        g0.p(operation, "operation");
        int Pe = a0.Pe(sArr);
        if (Pe < 0) {
            return null;
        }
        short m11 = d2.m(sArr, Pe);
        for (int i11 = Pe - 1; i11 >= 0; i11--) {
            m11 = operation.invoke(Integer.valueOf(i11), c2.b(d2.m(sArr, i11)), c2.b(m11)).k0();
        }
        return c2.b(m11);
    }

    @y0(version = "1.4")
    @kotlin.d
    public static final void ka(@k short[] sArr) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$shuffle$0");
        la(sArr, Random.Default);
    }

    @y0(version = "1.4")
    @kotlin.d
    public static final void kb(@k int[] iArr, int i11, int i12) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$sortDescending$0");
        bb(iArr, i11, i12);
        a0.sr(iArr, i11, i12);
    }

    @j(name = "sumOfULong")
    @y0(version = "1.5")
    @kotlin.d
    @p0
    @o00.f
    public static final long kc(short[] sArr, l<? super c2, w1> selector) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$sumOf$0");
        g0.p(selector, "selector");
        long i11 = w1.i(0L);
        int o11 = d2.o(sArr);
        for (int i12 = 0; i12 < o11; i12++) {
            i11 = w1.i(i11 + selector.invoke(c2.b(d2.m(sArr, i12))).m0());
        }
        return i11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <V> List<V> kd(long[] jArr, long[] jArr2, p<? super w1, ? super w1, ? extends V> transform) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$zip$0");
        g0.p(jArr2, "$v$c$kotlin-ULongArray$-other$0");
        g0.p(transform, "transform");
        int min = Math.min(x1.o(jArr), x1.o(jArr2));
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(transform.invoke(w1.b(x1.m(jArr, i11)), w1.b(x1.m(jArr2, i11))));
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final boolean l0(short[] sArr, l<? super c2, Boolean> predicate) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$any$0");
        g0.p(predicate, "predicate");
        int o11 = d2.o(sArr);
        for (int i11 = 0; i11 < o11; i11++) {
            if (predicate.invoke(c2.b(d2.m(sArr, i11))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ short[] l1(short[] sArr, short[] sArr2, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = d2.o(sArr);
        }
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$copyInto$0");
        g0.p(sArr2, "$v$c$kotlin-UShortArray$-destination$0");
        q.C0(sArr, sArr2, i11, i12, i13);
        return sArr2;
    }

    public static /* synthetic */ void l2(short[] sArr, short s11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = d2.o(sArr);
        }
        k2(sArr, s11, i11, i12);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final c2 l3(short[] sArr, l<? super c2, Boolean> predicate) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$firstOrNull$0");
        g0.p(predicate, "predicate");
        int o11 = d2.o(sArr);
        for (int i11 = 0; i11 < o11; i11++) {
            short m11 = d2.m(sArr, i11);
            if (predicate.invoke(c2.b(m11)).booleanValue()) {
                return c2.b(m11);
            }
        }
        return null;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int l5(int[] iArr, int i11) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$lastIndexOf$0");
        return a0.di(iArr, i11);
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final Double l6(int[] iArr, l<? super s1, Double> selector) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$maxOfOrNull$0");
        g0.p(selector, "selector");
        if (t1.s(iArr)) {
            return null;
        }
        double doubleValue = selector.invoke(s1.b(t1.m(iArr, 0))).doubleValue();
        int Me = a0.Me(iArr);
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                doubleValue = Math.max(doubleValue, selector.invoke(s1.b(t1.m(iArr, i11))).doubleValue());
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final <R extends Comparable<? super R>> R l7(long[] jArr, l<? super w1, ? extends R> selector) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$minOfOrNull$0");
        g0.p(selector, "selector");
        if (x1.s(jArr)) {
            return null;
        }
        R invoke = selector.invoke(w1.b(x1.m(jArr, 0)));
        int Ne = a0.Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                R invoke2 = selector.invoke(w1.b(x1.m(jArr, i11)));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int[] l8(int[] iArr, int[] iArr2) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$plus$0");
        g0.p(iArr2, "$v$c$kotlin-UIntArray$-elements$0");
        return t1.f(q.s3(iArr, iArr2));
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final w1 l9(long[] jArr, x00.q<? super Integer, ? super w1, ? super w1, w1> operation) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$reduceRightIndexedOrNull$0");
        g0.p(operation, "operation");
        int Ne = a0.Ne(jArr);
        if (Ne < 0) {
            return null;
        }
        long m11 = x1.m(jArr, Ne);
        for (int i11 = Ne - 1; i11 >= 0; i11--) {
            m11 = operation.invoke(Integer.valueOf(i11), w1.b(x1.m(jArr, i11)), w1.b(m11)).m0();
        }
        return w1.b(m11);
    }

    @y0(version = "1.4")
    @kotlin.d
    public static final void la(@k short[] sArr, @k Random random) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$shuffle$0");
        g0.p(random, "random");
        for (int Pe = a0.Pe(sArr); Pe > 0; Pe--) {
            int nextInt = random.nextInt(Pe + 1);
            short m11 = d2.m(sArr, Pe);
            d2.u(sArr, Pe, d2.m(sArr, nextInt));
            d2.u(sArr, nextInt, m11);
        }
    }

    @y0(version = "1.3")
    @kotlin.d
    public static final void lb(@k short[] sArr) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$sortDescending$0");
        if (d2.o(sArr) > 1) {
            db(sArr);
            a0.xr(sArr);
        }
    }

    @j(name = "sumOfUShort")
    @y0(version = "1.5")
    public static final int lc(@k c2[] c2VarArr) {
        g0.p(c2VarArr, "<this>");
        int i11 = 0;
        for (c2 c2Var : c2VarArr) {
            i11 = s1.i(i11 + s1.i(c2Var.k0() & c2.f100412d));
        }
        return i11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R, V> List<V> ld(long[] jArr, Iterable<? extends R> other, p<? super w1, ? super R, ? extends V> transform) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$zip$0");
        g0.p(other, "other");
        g0.p(transform, "transform");
        int o11 = x1.o(jArr);
        ArrayList arrayList = new ArrayList(Math.min(i0.d0(other, 10), o11));
        int i11 = 0;
        for (R r11 : other) {
            if (i11 >= o11) {
                break;
            }
            arrayList.add(transform.invoke(w1.b(x1.m(jArr, i11)), r11));
            i11++;
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final byte[] m0(byte[] bArr) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$asByteArray$0");
        return bArr;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final byte[] m1(byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$copyInto$0");
        g0.p(bArr2, "$v$c$kotlin-UByteArray$-destination$0");
        q.v0(bArr, bArr2, i11, i12, i13);
        return bArr2;
    }

    @y0(version = "1.3")
    @kotlin.d
    public static final void m2(@k long[] jArr, long j11, int i11, int i12) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$fill$0");
        q.L1(jArr, j11, i11, i12);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R> List<R> m3(byte[] bArr, l<? super o1, ? extends Iterable<? extends R>> transform) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$flatMap$0");
        g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int o11 = p1.o(bArr);
        for (int i11 = 0; i11 < o11; i11++) {
            m0.s0(arrayList, transform.invoke(o1.b(p1.m(bArr, i11))));
        }
        return arrayList;
    }

    public static final int m4(@k long[] jArr) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$lastIndex$0");
        return a0.Ne(jArr);
    }

    @m80.l
    @y0(version = "1.3")
    @kotlin.d
    public static final s1 m5(@k int[] iArr) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$lastOrNull$0");
        if (t1.s(iArr)) {
            return null;
        }
        return s1.b(t1.m(iArr, t1.o(iArr) - 1));
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final Float m6(int[] iArr, l<? super s1, Float> selector) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$maxOfOrNull$0");
        g0.p(selector, "selector");
        if (t1.s(iArr)) {
            return null;
        }
        float floatValue = selector.invoke(s1.b(t1.m(iArr, 0))).floatValue();
        int Me = a0.Me(iArr);
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                floatValue = Math.max(floatValue, selector.invoke(s1.b(t1.m(iArr, i11))).floatValue());
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final Double m7(long[] jArr, l<? super w1, Double> selector) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$minOfOrNull$0");
        g0.p(selector, "selector");
        if (x1.s(jArr)) {
            return null;
        }
        double doubleValue = selector.invoke(w1.b(x1.m(jArr, 0))).doubleValue();
        int Ne = a0.Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                doubleValue = Math.min(doubleValue, selector.invoke(w1.b(x1.m(jArr, i11))).doubleValue());
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final byte[] m8(byte[] bArr, byte b11) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$plus$0");
        return p1.f(q.e3(bArr, b11));
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final o1 m9(byte[] bArr, p<? super o1, ? super o1, o1> operation) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$reduceRightOrNull$0");
        g0.p(operation, "operation");
        int Ie = a0.Ie(bArr);
        if (Ie < 0) {
            return null;
        }
        byte m11 = p1.m(bArr, Ie);
        for (int i11 = Ie - 1; i11 >= 0; i11--) {
            m11 = operation.invoke(o1.b(p1.m(bArr, i11)), o1.b(m11)).k0();
        }
        return o1.b(m11);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int ma(int[] iArr) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$single$0");
        return s1.i(a0.wt(iArr));
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final List<s1> mb(@k int[] iArr) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$sorted$0");
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        g0.o(copyOf, "copyOf(...)");
        int[] f11 = t1.f(copyOf);
        Sa(f11);
        return b.a(f11);
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final List<o1> mc(@k byte[] bArr, int i11) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$take$0");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
        }
        if (i11 == 0) {
            return h0.J();
        }
        if (i11 >= p1.o(bArr)) {
            return r0.a6(p1.b(bArr));
        }
        if (i11 == 1) {
            return a00.g0.l(o1.b(p1.m(bArr, 0)));
        }
        ArrayList arrayList = new ArrayList(i11);
        int o11 = p1.o(bArr);
        int i12 = 0;
        for (int i13 = 0; i13 < o11; i13++) {
            arrayList.add(o1.b(p1.m(bArr, i13)));
            i12++;
            if (i12 == i11) {
                break;
            }
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R, V> List<V> md(byte[] bArr, Iterable<? extends R> other, p<? super o1, ? super R, ? extends V> transform) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$zip$0");
        g0.p(other, "other");
        g0.p(transform, "transform");
        int o11 = p1.o(bArr);
        ArrayList arrayList = new ArrayList(Math.min(i0.d0(other, 10), o11));
        int i11 = 0;
        for (R r11 : other) {
            if (i11 >= o11) {
                break;
            }
            arrayList.add(transform.invoke(o1.b(p1.m(bArr, i11)), r11));
            i11++;
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int[] n0(int[] iArr) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$asIntArray$0");
        return iArr;
    }

    public static /* synthetic */ byte[] n1(byte[] bArr, byte[] bArr2, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = p1.o(bArr);
        }
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$copyInto$0");
        g0.p(bArr2, "$v$c$kotlin-UByteArray$-destination$0");
        q.v0(bArr, bArr2, i11, i12, i13);
        return bArr2;
    }

    public static /* synthetic */ void n2(long[] jArr, long j11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = x1.o(jArr);
        }
        m2(jArr, j11, i11, i12);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R> List<R> n3(long[] jArr, l<? super w1, ? extends Iterable<? extends R>> transform) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$flatMap$0");
        g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int o11 = x1.o(jArr);
        for (int i11 = 0; i11 < o11; i11++) {
            m0.s0(arrayList, transform.invoke(w1.b(x1.m(jArr, i11))));
        }
        return arrayList;
    }

    @m80.l
    @y0(version = "1.3")
    @kotlin.d
    public static final o1 n5(@k byte[] bArr) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$lastOrNull$0");
        if (p1.s(bArr)) {
            return null;
        }
        return o1.b(p1.m(bArr, p1.o(bArr) - 1));
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final <R extends Comparable<? super R>> R n6(short[] sArr, l<? super c2, ? extends R> selector) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$maxOfOrNull$0");
        g0.p(selector, "selector");
        if (d2.s(sArr)) {
            return null;
        }
        R invoke = selector.invoke(c2.b(d2.m(sArr, 0)));
        int Pe = a0.Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                R invoke2 = selector.invoke(c2.b(d2.m(sArr, i11)));
                if (invoke.compareTo(invoke2) < 0) {
                    invoke = invoke2;
                }
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final Float n7(long[] jArr, l<? super w1, Float> selector) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$minOfOrNull$0");
        g0.p(selector, "selector");
        if (x1.s(jArr)) {
            return null;
        }
        float floatValue = selector.invoke(w1.b(x1.m(jArr, 0))).floatValue();
        int Ne = a0.Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                floatValue = Math.min(floatValue, selector.invoke(w1.b(x1.m(jArr, i11))).floatValue());
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final byte[] n8(byte[] bArr, byte[] bArr2) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$plus$0");
        g0.p(bArr2, "$v$c$kotlin-UByteArray$-elements$0");
        return p1.f(q.g3(bArr, bArr2));
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final s1 n9(int[] iArr, p<? super s1, ? super s1, s1> operation) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$reduceRightOrNull$0");
        g0.p(operation, "operation");
        int Me = a0.Me(iArr);
        if (Me < 0) {
            return null;
        }
        int m11 = t1.m(iArr, Me);
        for (int i11 = Me - 1; i11 >= 0; i11--) {
            m11 = operation.invoke(s1.b(t1.m(iArr, i11)), s1.b(m11)).m0();
        }
        return s1.b(m11);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final byte na(byte[] bArr) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$single$0");
        return o1.i(a0.ot(bArr));
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final List<o1> nb(@k byte[] bArr) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$sorted$0");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        g0.o(copyOf, "copyOf(...)");
        byte[] f11 = p1.f(copyOf);
        Za(f11);
        return b.b(f11);
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final List<c2> nc(@k short[] sArr, int i11) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$take$0");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
        }
        if (i11 == 0) {
            return h0.J();
        }
        if (i11 >= d2.o(sArr)) {
            return r0.a6(d2.b(sArr));
        }
        if (i11 == 1) {
            return a00.g0.l(c2.b(d2.m(sArr, 0)));
        }
        ArrayList arrayList = new ArrayList(i11);
        int o11 = d2.o(sArr);
        int i12 = 0;
        for (int i13 = 0; i13 < o11; i13++) {
            arrayList.add(c2.b(d2.m(sArr, i13)));
            i12++;
            if (i12 == i11) {
                break;
            }
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R, V> List<V> nd(int[] iArr, R[] other, p<? super s1, ? super R, ? extends V> transform) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$zip$0");
        g0.p(other, "other");
        g0.p(transform, "transform");
        int min = Math.min(t1.o(iArr), other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(transform.invoke(s1.b(t1.m(iArr, i11)), other[i11]));
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final long[] o0(long[] jArr) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$asLongArray$0");
        return jArr;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int[] o1(int[] iArr, int[] iArr2, int i11, int i12, int i13) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$copyInto$0");
        g0.p(iArr2, "$v$c$kotlin-UIntArray$-destination$0");
        q.z0(iArr, iArr2, i11, i12, i13);
        return iArr2;
    }

    @y0(version = "1.3")
    @kotlin.d
    public static final void o2(@k byte[] bArr, byte b11, int i11, int i12) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$fill$0");
        q.G1(bArr, b11, i11, i12);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R> List<R> o3(int[] iArr, l<? super s1, ? extends Iterable<? extends R>> transform) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$flatMap$0");
        g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int o11 = t1.o(iArr);
        for (int i11 = 0; i11 < o11; i11++) {
            m0.s0(arrayList, transform.invoke(s1.b(t1.m(iArr, i11))));
        }
        return arrayList;
    }

    public static final int o4(@k short[] sArr) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$lastIndex$0");
        return a0.Pe(sArr);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final o1 o5(byte[] bArr, l<? super o1, Boolean> predicate) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$lastOrNull$0");
        g0.p(predicate, "predicate");
        int o11 = p1.o(bArr) - 1;
        if (o11 < 0) {
            return null;
        }
        while (true) {
            int i11 = o11 - 1;
            byte m11 = p1.m(bArr, o11);
            if (predicate.invoke(o1.b(m11)).booleanValue()) {
                return o1.b(m11);
            }
            if (i11 < 0) {
                return null;
            }
            o11 = i11;
        }
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final Double o6(short[] sArr, l<? super c2, Double> selector) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$maxOfOrNull$0");
        g0.p(selector, "selector");
        if (d2.s(sArr)) {
            return null;
        }
        double doubleValue = selector.invoke(c2.b(d2.m(sArr, 0))).doubleValue();
        int Pe = a0.Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                doubleValue = Math.max(doubleValue, selector.invoke(c2.b(d2.m(sArr, i11))).doubleValue());
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final <R extends Comparable<? super R>> R o7(int[] iArr, l<? super s1, ? extends R> selector) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$minOfOrNull$0");
        g0.p(selector, "selector");
        if (t1.s(iArr)) {
            return null;
        }
        R invoke = selector.invoke(s1.b(t1.m(iArr, 0)));
        int Me = a0.Me(iArr);
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                R invoke2 = selector.invoke(s1.b(t1.m(iArr, i11)));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final long[] o8(@k long[] jArr, @k Collection<w1> elements) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$plus$0");
        g0.p(elements, "elements");
        int o11 = x1.o(jArr);
        long[] copyOf = Arrays.copyOf(jArr, x1.o(jArr) + elements.size());
        g0.o(copyOf, "copyOf(...)");
        Iterator<w1> it = elements.iterator();
        while (it.hasNext()) {
            copyOf[o11] = it.next().m0();
            o11++;
        }
        return x1.f(copyOf);
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final w1 o9(long[] jArr, p<? super w1, ? super w1, w1> operation) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$reduceRightOrNull$0");
        g0.p(operation, "operation");
        int Ne = a0.Ne(jArr);
        if (Ne < 0) {
            return null;
        }
        long m11 = x1.m(jArr, Ne);
        for (int i11 = Ne - 1; i11 >= 0; i11--) {
            m11 = operation.invoke(w1.b(x1.m(jArr, i11)), w1.b(m11)).m0();
        }
        return w1.b(m11);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final byte oa(byte[] bArr, l<? super o1, Boolean> predicate) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$single$0");
        g0.p(predicate, "predicate");
        int o11 = p1.o(bArr);
        o1 o1Var = null;
        boolean z11 = false;
        for (int i11 = 0; i11 < o11; i11++) {
            byte m11 = p1.m(bArr, i11);
            if (predicate.invoke(o1.b(m11)).booleanValue()) {
                if (z11) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                o1Var = o1.b(m11);
                z11 = true;
            }
        }
        if (z11) {
            return o1Var.k0();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final List<w1> ob(@k long[] jArr) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$sorted$0");
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        g0.o(copyOf, "copyOf(...)");
        long[] f11 = x1.f(copyOf);
        ab(f11);
        return b.c(f11);
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final List<s1> oc(@k int[] iArr, int i11) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$take$0");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
        }
        if (i11 == 0) {
            return h0.J();
        }
        if (i11 >= t1.o(iArr)) {
            return r0.a6(t1.b(iArr));
        }
        if (i11 == 1) {
            return a00.g0.l(s1.b(t1.m(iArr, 0)));
        }
        ArrayList arrayList = new ArrayList(i11);
        int o11 = t1.o(iArr);
        int i12 = 0;
        for (int i13 = 0; i13 < o11; i13++) {
            arrayList.add(s1.b(t1.m(iArr, i13)));
            i12++;
            if (i12 == i11) {
                break;
            }
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final List<Pair<s1, s1>> od(@k int[] iArr, @k int[] iArr2) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$zip$0");
        g0.p(iArr2, "$v$c$kotlin-UIntArray$-other$0");
        int min = Math.min(t1.o(iArr), t1.o(iArr2));
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(h1.a(s1.b(t1.m(iArr, i11)), s1.b(t1.m(iArr2, i11))));
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final short[] p0(short[] sArr) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$asShortArray$0");
        return sArr;
    }

    public static /* synthetic */ int[] p1(int[] iArr, int[] iArr2, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = t1.o(iArr);
        }
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$copyInto$0");
        g0.p(iArr2, "$v$c$kotlin-UIntArray$-destination$0");
        q.z0(iArr, iArr2, i11, i12, i13);
        return iArr2;
    }

    public static /* synthetic */ void p2(byte[] bArr, byte b11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = p1.o(bArr);
        }
        o2(bArr, b11, i11, i12);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R> List<R> p3(short[] sArr, l<? super c2, ? extends Iterable<? extends R>> transform) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$flatMap$0");
        g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int o11 = d2.o(sArr);
        for (int i11 = 0; i11 < o11; i11++) {
            m0.s0(arrayList, transform.invoke(c2.b(d2.m(sArr, i11))));
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final w1 p5(long[] jArr, l<? super w1, Boolean> predicate) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$lastOrNull$0");
        g0.p(predicate, "predicate");
        int o11 = x1.o(jArr) - 1;
        if (o11 < 0) {
            return null;
        }
        while (true) {
            int i11 = o11 - 1;
            long m11 = x1.m(jArr, o11);
            if (predicate.invoke(w1.b(m11)).booleanValue()) {
                return w1.b(m11);
            }
            if (i11 < 0) {
                return null;
            }
            o11 = i11;
        }
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final Float p6(short[] sArr, l<? super c2, Float> selector) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$maxOfOrNull$0");
        g0.p(selector, "selector");
        if (d2.s(sArr)) {
            return null;
        }
        float floatValue = selector.invoke(c2.b(d2.m(sArr, 0))).floatValue();
        int Pe = a0.Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                floatValue = Math.max(floatValue, selector.invoke(c2.b(d2.m(sArr, i11))).floatValue());
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final Double p7(int[] iArr, l<? super s1, Double> selector) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$minOfOrNull$0");
        g0.p(selector, "selector");
        if (t1.s(iArr)) {
            return null;
        }
        double doubleValue = selector.invoke(s1.b(t1.m(iArr, 0))).doubleValue();
        int Me = a0.Me(iArr);
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                doubleValue = Math.min(doubleValue, selector.invoke(s1.b(t1.m(iArr, i11))).doubleValue());
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final short[] p8(short[] sArr, short[] sArr2) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$plus$0");
        g0.p(sArr2, "$v$c$kotlin-UShortArray$-elements$0");
        return d2.f(q.B3(sArr, sArr2));
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final c2 p9(short[] sArr, p<? super c2, ? super c2, c2> operation) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$reduceRightOrNull$0");
        g0.p(operation, "operation");
        int Pe = a0.Pe(sArr);
        if (Pe < 0) {
            return null;
        }
        short m11 = d2.m(sArr, Pe);
        for (int i11 = Pe - 1; i11 >= 0; i11--) {
            m11 = operation.invoke(c2.b(d2.m(sArr, i11)), c2.b(m11)).k0();
        }
        return c2.b(m11);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final long pa(long[] jArr, l<? super w1, Boolean> predicate) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$single$0");
        g0.p(predicate, "predicate");
        int o11 = x1.o(jArr);
        w1 w1Var = null;
        boolean z11 = false;
        for (int i11 = 0; i11 < o11; i11++) {
            long m11 = x1.m(jArr, i11);
            if (predicate.invoke(w1.b(m11)).booleanValue()) {
                if (z11) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                w1Var = w1.b(m11);
                z11 = true;
            }
        }
        if (z11) {
            return w1Var.m0();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final List<c2> pb(@k short[] sArr) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$sorted$0");
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        g0.o(copyOf, "copyOf(...)");
        short[] f11 = d2.f(copyOf);
        db(f11);
        return b.d(f11);
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final List<w1> pc(@k long[] jArr, int i11) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$take$0");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
        }
        if (i11 == 0) {
            return h0.J();
        }
        if (i11 >= x1.o(jArr)) {
            return r0.a6(x1.b(jArr));
        }
        if (i11 == 1) {
            return a00.g0.l(w1.b(x1.m(jArr, 0)));
        }
        ArrayList arrayList = new ArrayList(i11);
        int o11 = x1.o(jArr);
        int i12 = 0;
        for (int i13 = 0; i13 < o11; i13++) {
            arrayList.add(w1.b(x1.m(jArr, i13)));
            i12++;
            if (i12 == i11) {
                break;
            }
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R, V> List<V> pd(short[] sArr, R[] other, p<? super c2, ? super R, ? extends V> transform) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$zip$0");
        g0.p(other, "other");
        g0.p(transform, "transform");
        int min = Math.min(d2.o(sArr), other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(transform.invoke(c2.b(d2.m(sArr, i11)), other[i11]));
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final byte[] q0(byte[] bArr) {
        g0.p(bArr, "<this>");
        return p1.f(bArr);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int[] q1(int[] iArr) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$copyOf$0");
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        g0.o(copyOf, "copyOf(...)");
        return t1.f(copyOf);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final List<o1> q2(byte[] bArr, l<? super o1, Boolean> predicate) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$filter$0");
        g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int o11 = p1.o(bArr);
        for (int i11 = 0; i11 < o11; i11++) {
            byte m11 = p1.m(bArr, i11);
            if (predicate.invoke(o1.b(m11)).booleanValue()) {
                arrayList.add(o1.b(m11));
            }
        }
        return arrayList;
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final <R> List<R> q3(byte[] bArr, p<? super Integer, ? super o1, ? extends Iterable<? extends R>> transform) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$flatMapIndexed$0");
        g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int o11 = p1.o(bArr);
        int i11 = 0;
        int i12 = 0;
        while (i11 < o11) {
            m0.s0(arrayList, transform.invoke(Integer.valueOf(i12), o1.b(p1.m(bArr, i11))));
            i11++;
            i12++;
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final short q4(short[] sArr, int i11, l<? super Integer, c2> defaultValue) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$getOrElse$0");
        g0.p(defaultValue, "defaultValue");
        return (i11 < 0 || i11 >= d2.o(sArr)) ? defaultValue.invoke(Integer.valueOf(i11)).k0() : d2.m(sArr, i11);
    }

    @m80.l
    @y0(version = "1.3")
    @kotlin.d
    public static final w1 q5(@k long[] jArr) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$lastOrNull$0");
        if (x1.s(jArr)) {
            return null;
        }
        return w1.b(x1.m(jArr, x1.o(jArr) - 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final <R> R q6(long[] jArr, Comparator<? super R> comparator, l<? super w1, ? extends R> selector) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$maxOfWith$0");
        g0.p(comparator, "comparator");
        g0.p(selector, "selector");
        if (x1.s(jArr)) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(w1.b(x1.m(jArr, 0)));
        int Ne = a0.Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                Object obj2 = (R) selector.invoke(w1.b(x1.m(jArr, i11)));
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (R) obj2;
                }
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final Float q7(int[] iArr, l<? super s1, Float> selector) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$minOfOrNull$0");
        g0.p(selector, "selector");
        if (t1.s(iArr)) {
            return null;
        }
        float floatValue = selector.invoke(s1.b(t1.m(iArr, 0))).floatValue();
        int Me = a0.Me(iArr);
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                floatValue = Math.min(floatValue, selector.invoke(s1.b(t1.m(iArr, i11))).floatValue());
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final short[] q8(@k short[] sArr, @k Collection<c2> elements) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$plus$0");
        g0.p(elements, "elements");
        int o11 = d2.o(sArr);
        short[] copyOf = Arrays.copyOf(sArr, d2.o(sArr) + elements.size());
        g0.o(copyOf, "copyOf(...)");
        Iterator<c2> it = elements.iterator();
        while (it.hasNext()) {
            copyOf[o11] = it.next().k0();
            o11++;
        }
        return d2.f(copyOf);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final void q9(int[] iArr) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$reverse$0");
        a0.rr(iArr);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final long qa(long[] jArr) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$single$0");
        return w1.i(a0.yt(jArr));
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final int[] qb(@k int[] iArr) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$sortedArray$0");
        if (t1.s(iArr)) {
            return iArr;
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        g0.o(copyOf, "copyOf(...)");
        int[] f11 = t1.f(copyOf);
        Sa(f11);
        return f11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final List<o1> qc(@k byte[] bArr, int i11) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$takeLast$0");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
        }
        if (i11 == 0) {
            return h0.J();
        }
        int o11 = p1.o(bArr);
        if (i11 >= o11) {
            return r0.a6(p1.b(bArr));
        }
        if (i11 == 1) {
            return a00.g0.l(o1.b(p1.m(bArr, o11 - 1)));
        }
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = o11 - i11; i12 < o11; i12++) {
            arrayList.add(o1.b(p1.m(bArr, i12)));
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final <R> List<Pair<w1, R>> qd(@k long[] jArr, @k R[] other) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$zip$0");
        g0.p(other, "other");
        int min = Math.min(x1.o(jArr), other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            long m11 = x1.m(jArr, i11);
            arrayList.add(h1.a(w1.b(m11), other[i11]));
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int[] r0(int[] iArr) {
        g0.p(iArr, "<this>");
        return t1.f(iArr);
    }

    @y0(version = "2.2")
    @kotlin.c
    @kotlin.d
    @o00.f
    public static final short[] r1(short[] sArr, int i11, l<? super Integer, c2> init) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$copyOf$0");
        g0.p(init, "init");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Invalid new array size: " + i11 + '.').toString());
        }
        short[] copyOf = Arrays.copyOf(sArr, i11);
        g0.o(copyOf, "copyOf(...)");
        short[] f11 = d2.f(copyOf);
        for (int o11 = d2.o(sArr); o11 < i11; o11++) {
            d2.u(f11, o11, init.invoke(Integer.valueOf(o11)).k0());
        }
        return f11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final List<w1> r2(long[] jArr, l<? super w1, Boolean> predicate) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$filter$0");
        g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int o11 = x1.o(jArr);
        for (int i11 = 0; i11 < o11; i11++) {
            long m11 = x1.m(jArr, i11);
            if (predicate.invoke(w1.b(m11)).booleanValue()) {
                arrayList.add(w1.b(m11));
            }
        }
        return arrayList;
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final <R> List<R> r3(int[] iArr, p<? super Integer, ? super s1, ? extends Iterable<? extends R>> transform) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$flatMapIndexed$0");
        g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int o11 = t1.o(iArr);
        int i11 = 0;
        int i12 = 0;
        while (i11 < o11) {
            m0.s0(arrayList, transform.invoke(Integer.valueOf(i12), s1.b(t1.m(iArr, i11))));
            i11++;
            i12++;
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int r4(int[] iArr, int i11, l<? super Integer, s1> defaultValue) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$getOrElse$0");
        g0.p(defaultValue, "defaultValue");
        return (i11 < 0 || i11 >= t1.o(iArr)) ? defaultValue.invoke(Integer.valueOf(i11)).m0() : t1.m(iArr, i11);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final s1 r5(int[] iArr, l<? super s1, Boolean> predicate) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$lastOrNull$0");
        g0.p(predicate, "predicate");
        int o11 = t1.o(iArr) - 1;
        if (o11 < 0) {
            return null;
        }
        while (true) {
            int i11 = o11 - 1;
            int m11 = t1.m(iArr, o11);
            if (predicate.invoke(s1.b(m11)).booleanValue()) {
                return s1.b(m11);
            }
            if (i11 < 0) {
                return null;
            }
            o11 = i11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final <R> R r6(byte[] bArr, Comparator<? super R> comparator, l<? super o1, ? extends R> selector) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$maxOfWith$0");
        g0.p(comparator, "comparator");
        g0.p(selector, "selector");
        if (p1.s(bArr)) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(o1.b(p1.m(bArr, 0)));
        int Ie = a0.Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                Object obj2 = (R) selector.invoke(o1.b(p1.m(bArr, i11)));
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (R) obj2;
                }
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final <R extends Comparable<? super R>> R r7(short[] sArr, l<? super c2, ? extends R> selector) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$minOfOrNull$0");
        g0.p(selector, "selector");
        if (d2.s(sArr)) {
            return null;
        }
        R invoke = selector.invoke(c2.b(d2.m(sArr, 0)));
        int Pe = a0.Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                R invoke2 = selector.invoke(c2.b(d2.m(sArr, i11)));
                if (invoke.compareTo(invoke2) > 0) {
                    invoke = invoke2;
                }
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return invoke;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int[] r8(int[] iArr, int i11) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$plus$0");
        return t1.f(q.q3(iArr, i11));
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final void r9(long[] jArr, int i11, int i12) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$reverse$0");
        a0.ur(jArr, i11, i12);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int ra(int[] iArr, l<? super s1, Boolean> predicate) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$single$0");
        g0.p(predicate, "predicate");
        int o11 = t1.o(iArr);
        s1 s1Var = null;
        boolean z11 = false;
        for (int i11 = 0; i11 < o11; i11++) {
            int m11 = t1.m(iArr, i11);
            if (predicate.invoke(s1.b(m11)).booleanValue()) {
                if (z11) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                s1Var = s1.b(m11);
                z11 = true;
            }
        }
        if (z11) {
            return s1Var.m0();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final byte[] rb(@k byte[] bArr) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$sortedArray$0");
        if (p1.s(bArr)) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        g0.o(copyOf, "copyOf(...)");
        byte[] f11 = p1.f(copyOf);
        Za(f11);
        return f11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final List<c2> rc(@k short[] sArr, int i11) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$takeLast$0");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
        }
        if (i11 == 0) {
            return h0.J();
        }
        int o11 = d2.o(sArr);
        if (i11 >= o11) {
            return r0.a6(d2.b(sArr));
        }
        if (i11 == 1) {
            return a00.g0.l(c2.b(d2.m(sArr, o11 - 1)));
        }
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = o11 - i11; i12 < o11; i12++) {
            arrayList.add(c2.b(d2.m(sArr, i12)));
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <V> List<V> rd(short[] sArr, short[] sArr2, p<? super c2, ? super c2, ? extends V> transform) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$zip$0");
        g0.p(sArr2, "$v$c$kotlin-UShortArray$-other$0");
        g0.p(transform, "transform");
        int min = Math.min(d2.o(sArr), d2.o(sArr2));
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(transform.invoke(c2.b(d2.m(sArr, i11)), c2.b(d2.m(sArr2, i11))));
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final long[] s0(long[] jArr) {
        g0.p(jArr, "<this>");
        return x1.f(jArr);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final byte[] s1(byte[] bArr) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$copyOf$0");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        g0.o(copyOf, "copyOf(...)");
        return p1.f(copyOf);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final List<s1> s2(int[] iArr, l<? super s1, Boolean> predicate) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$filter$0");
        g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int o11 = t1.o(iArr);
        for (int i11 = 0; i11 < o11; i11++) {
            int m11 = t1.m(iArr, i11);
            if (predicate.invoke(s1.b(m11)).booleanValue()) {
                arrayList.add(s1.b(m11));
            }
        }
        return arrayList;
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final <R> List<R> s3(long[] jArr, p<? super Integer, ? super w1, ? extends Iterable<? extends R>> transform) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$flatMapIndexed$0");
        g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int o11 = x1.o(jArr);
        int i11 = 0;
        int i12 = 0;
        while (i11 < o11) {
            m0.s0(arrayList, transform.invoke(Integer.valueOf(i12), w1.b(x1.m(jArr, i11))));
            i11++;
            i12++;
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final long s4(long[] jArr, int i11, l<? super Integer, w1> defaultValue) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$getOrElse$0");
        g0.p(defaultValue, "defaultValue");
        return (i11 < 0 || i11 >= x1.o(jArr)) ? defaultValue.invoke(Integer.valueOf(i11)).m0() : x1.m(jArr, i11);
    }

    @m80.l
    @y0(version = "1.3")
    @kotlin.d
    public static final c2 s5(@k short[] sArr) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$lastOrNull$0");
        if (d2.s(sArr)) {
            return null;
        }
        return c2.b(d2.m(sArr, d2.o(sArr) - 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final <R> R s6(short[] sArr, Comparator<? super R> comparator, l<? super c2, ? extends R> selector) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$maxOfWith$0");
        g0.p(comparator, "comparator");
        g0.p(selector, "selector");
        if (d2.s(sArr)) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(c2.b(d2.m(sArr, 0)));
        int Pe = a0.Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                Object obj2 = (R) selector.invoke(c2.b(d2.m(sArr, i11)));
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (R) obj2;
                }
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final Double s7(short[] sArr, l<? super c2, Double> selector) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$minOfOrNull$0");
        g0.p(selector, "selector");
        if (d2.s(sArr)) {
            return null;
        }
        double doubleValue = selector.invoke(c2.b(d2.m(sArr, 0))).doubleValue();
        int Pe = a0.Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                doubleValue = Math.min(doubleValue, selector.invoke(c2.b(d2.m(sArr, i11))).doubleValue());
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return Double.valueOf(doubleValue);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final long[] s8(long[] jArr, long[] jArr2) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$plus$0");
        g0.p(jArr2, "$v$c$kotlin-ULongArray$-elements$0");
        return x1.f(q.v3(jArr, jArr2));
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final void s9(byte[] bArr, int i11, int i12) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$reverse$0");
        a0.kr(bArr, i11, i12);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final short sa(short[] sArr) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$single$0");
        return c2.i(a0.Ct(sArr));
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final long[] sb(@k long[] jArr) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$sortedArray$0");
        if (x1.s(jArr)) {
            return jArr;
        }
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        g0.o(copyOf, "copyOf(...)");
        long[] f11 = x1.f(copyOf);
        ab(f11);
        return f11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final List<s1> sc(@k int[] iArr, int i11) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$takeLast$0");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
        }
        if (i11 == 0) {
            return h0.J();
        }
        int o11 = t1.o(iArr);
        if (i11 >= o11) {
            return r0.a6(t1.b(iArr));
        }
        if (i11 == 1) {
            return a00.g0.l(s1.b(t1.m(iArr, o11 - 1)));
        }
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = o11 - i11; i12 < o11; i12++) {
            arrayList.add(s1.b(t1.m(iArr, i12)));
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R, V> List<V> sd(short[] sArr, Iterable<? extends R> other, p<? super c2, ? super R, ? extends V> transform) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$zip$0");
        g0.p(other, "other");
        g0.p(transform, "transform");
        int o11 = d2.o(sArr);
        ArrayList arrayList = new ArrayList(Math.min(i0.d0(other, 10), o11));
        int i11 = 0;
        for (R r11 : other) {
            if (i11 >= o11) {
                break;
            }
            arrayList.add(transform.invoke(c2.b(d2.m(sArr, i11)), r11));
            i11++;
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final short[] t0(short[] sArr) {
        g0.p(sArr, "<this>");
        return d2.f(sArr);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final byte[] t1(byte[] bArr, int i11) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$copyOf$0");
        byte[] copyOf = Arrays.copyOf(bArr, i11);
        g0.o(copyOf, "copyOf(...)");
        return p1.f(copyOf);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final List<c2> t2(short[] sArr, l<? super c2, Boolean> predicate) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$filter$0");
        g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int o11 = d2.o(sArr);
        for (int i11 = 0; i11 < o11; i11++) {
            short m11 = d2.m(sArr, i11);
            if (predicate.invoke(c2.b(m11)).booleanValue()) {
                arrayList.add(c2.b(m11));
            }
        }
        return arrayList;
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final <R> List<R> t3(short[] sArr, p<? super Integer, ? super c2, ? extends Iterable<? extends R>> transform) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$flatMapIndexed$0");
        g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int o11 = d2.o(sArr);
        int i11 = 0;
        int i12 = 0;
        while (i11 < o11) {
            m0.s0(arrayList, transform.invoke(Integer.valueOf(i12), c2.b(d2.m(sArr, i11))));
            i11++;
            i12++;
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final byte t4(byte[] bArr, int i11, l<? super Integer, o1> defaultValue) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$getOrElse$0");
        g0.p(defaultValue, "defaultValue");
        return (i11 < 0 || i11 >= p1.o(bArr)) ? defaultValue.invoke(Integer.valueOf(i11)).k0() : p1.m(bArr, i11);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final c2 t5(short[] sArr, l<? super c2, Boolean> predicate) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$lastOrNull$0");
        g0.p(predicate, "predicate");
        int o11 = d2.o(sArr) - 1;
        if (o11 < 0) {
            return null;
        }
        while (true) {
            int i11 = o11 - 1;
            short m11 = d2.m(sArr, o11);
            if (predicate.invoke(c2.b(m11)).booleanValue()) {
                return c2.b(m11);
            }
            if (i11 < 0) {
                return null;
            }
            o11 = i11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final <R> R t6(int[] iArr, Comparator<? super R> comparator, l<? super s1, ? extends R> selector) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$maxOfWith$0");
        g0.p(comparator, "comparator");
        g0.p(selector, "selector");
        if (t1.s(iArr)) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(s1.b(t1.m(iArr, 0)));
        int Me = a0.Me(iArr);
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                Object obj2 = (R) selector.invoke(s1.b(t1.m(iArr, i11)));
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (R) obj2;
                }
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final Float t7(short[] sArr, l<? super c2, Float> selector) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$minOfOrNull$0");
        g0.p(selector, "selector");
        if (d2.s(sArr)) {
            return null;
        }
        float floatValue = selector.invoke(c2.b(d2.m(sArr, 0))).floatValue();
        int Pe = a0.Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                floatValue = Math.min(floatValue, selector.invoke(c2.b(d2.m(sArr, i11))).floatValue());
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return Float.valueOf(floatValue);
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final byte[] t8(@k byte[] bArr, @k Collection<o1> elements) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$plus$0");
        g0.p(elements, "elements");
        int o11 = p1.o(bArr);
        byte[] copyOf = Arrays.copyOf(bArr, p1.o(bArr) + elements.size());
        g0.o(copyOf, "copyOf(...)");
        Iterator<o1> it = elements.iterator();
        while (it.hasNext()) {
            copyOf[o11] = it.next().k0();
            o11++;
        }
        return p1.f(copyOf);
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final void t9(short[] sArr, int i11, int i12) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$reverse$0");
        a0.yr(sArr, i11, i12);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final short ta(short[] sArr, l<? super c2, Boolean> predicate) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$single$0");
        g0.p(predicate, "predicate");
        int o11 = d2.o(sArr);
        c2 c2Var = null;
        boolean z11 = false;
        for (int i11 = 0; i11 < o11; i11++) {
            short m11 = d2.m(sArr, i11);
            if (predicate.invoke(c2.b(m11)).booleanValue()) {
                if (z11) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                c2Var = c2.b(m11);
                z11 = true;
            }
        }
        if (z11) {
            return c2Var.k0();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final short[] tb(@k short[] sArr) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$sortedArray$0");
        if (d2.s(sArr)) {
            return sArr;
        }
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        g0.o(copyOf, "copyOf(...)");
        short[] f11 = d2.f(copyOf);
        db(f11);
        return f11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final List<w1> tc(@k long[] jArr, int i11) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$takeLast$0");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
        }
        if (i11 == 0) {
            return h0.J();
        }
        int o11 = x1.o(jArr);
        if (i11 >= o11) {
            return r0.a6(x1.b(jArr));
        }
        if (i11 == 1) {
            return a00.g0.l(w1.b(x1.m(jArr, o11 - 1)));
        }
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = o11 - i11; i12 < o11; i12++) {
            arrayList.add(w1.b(x1.m(jArr, i12)));
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final List<Pair<o1, o1>> td(@k byte[] bArr, @k byte[] bArr2) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$zip$0");
        g0.p(bArr2, "$v$c$kotlin-UByteArray$-other$0");
        int min = Math.min(p1.o(bArr), p1.o(bArr2));
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(h1.a(o1.b(p1.m(bArr, i11)), o1.b(p1.m(bArr2, i11))));
        }
        return arrayList;
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final <V> Map<o1, V> u0(byte[] bArr, l<? super o1, ? extends V> valueSelector) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$associateWith$0");
        g0.p(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(u.u(k1.j(p1.o(bArr)), 16));
        int o11 = p1.o(bArr);
        for (int i11 = 0; i11 < o11; i11++) {
            byte m11 = p1.m(bArr, i11);
            linkedHashMap.put(o1.b(m11), valueSelector.invoke(o1.b(m11)));
        }
        return linkedHashMap;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final long[] u1(long[] jArr) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$copyOf$0");
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        g0.o(copyOf, "copyOf(...)");
        return x1.f(copyOf);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final List<o1> u2(byte[] bArr, p<? super Integer, ? super o1, Boolean> predicate) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$filterIndexed$0");
        g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int o11 = p1.o(bArr);
        int i11 = 0;
        int i12 = 0;
        while (i11 < o11) {
            byte m11 = p1.m(bArr, i11);
            int i13 = i12 + 1;
            if (predicate.invoke(Integer.valueOf(i12), o1.b(m11)).booleanValue()) {
                arrayList.add(o1.b(m11));
            }
            i11++;
            i12 = i13;
        }
        return arrayList;
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final <R, C extends Collection<? super R>> C u3(int[] iArr, C destination, p<? super Integer, ? super s1, ? extends Iterable<? extends R>> transform) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$flatMapIndexedTo$0");
        g0.p(destination, "destination");
        g0.p(transform, "transform");
        int o11 = t1.o(iArr);
        int i11 = 0;
        int i12 = 0;
        while (i11 < o11) {
            m0.s0(destination, transform.invoke(Integer.valueOf(i12), s1.b(t1.m(iArr, i11))));
            i11++;
            i12++;
        }
        return destination;
    }

    @m80.l
    @y0(version = "1.3")
    @kotlin.d
    public static final o1 u4(@k byte[] bArr, int i11) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$getOrNull$0");
        if (i11 < 0 || i11 >= p1.o(bArr)) {
            return null;
        }
        return o1.b(p1.m(bArr, i11));
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R> List<R> u5(byte[] bArr, l<? super o1, ? extends R> transform) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$map$0");
        g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(p1.o(bArr));
        int o11 = p1.o(bArr);
        for (int i11 = 0; i11 < o11; i11++) {
            arrayList.add(transform.invoke(o1.b(p1.m(bArr, i11))));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final <R> R u6(long[] jArr, Comparator<? super R> comparator, l<? super w1, ? extends R> selector) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$maxOfWithOrNull$0");
        g0.p(comparator, "comparator");
        g0.p(selector, "selector");
        if (x1.s(jArr)) {
            return null;
        }
        Object obj = (R) selector.invoke(w1.b(x1.m(jArr, 0)));
        int Ne = a0.Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                Object obj2 = (R) selector.invoke(w1.b(x1.m(jArr, i11)));
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (R) obj2;
                }
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final <R> R u7(long[] jArr, Comparator<? super R> comparator, l<? super w1, ? extends R> selector) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$minOfWith$0");
        g0.p(comparator, "comparator");
        g0.p(selector, "selector");
        if (x1.s(jArr)) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(w1.b(x1.m(jArr, 0)));
        int Ne = a0.Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                Object obj2 = (R) selector.invoke(w1.b(x1.m(jArr, i11)));
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (R) obj2;
                }
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int u8(int[] iArr) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$random$0");
        return v8(iArr, Random.Default);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final void u9(byte[] bArr) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$reverse$0");
        a0.jr(bArr);
    }

    @m80.l
    @y0(version = "1.3")
    @kotlin.d
    public static final s1 ua(@k int[] iArr) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$singleOrNull$0");
        if (t1.o(iArr) == 1) {
            return s1.b(t1.m(iArr, 0));
        }
        return null;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final int[] ub(@k int[] iArr) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$sortedArrayDescending$0");
        if (t1.s(iArr)) {
            return iArr;
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        g0.o(copyOf, "copyOf(...)");
        int[] f11 = t1.f(copyOf);
        eb(f11);
        return f11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final List<o1> uc(byte[] bArr, l<? super o1, Boolean> predicate) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$takeLastWhile$0");
        g0.p(predicate, "predicate");
        for (int Ie = a0.Ie(bArr); -1 < Ie; Ie--) {
            if (!predicate.invoke(o1.b(p1.m(bArr, Ie))).booleanValue()) {
                return K1(bArr, Ie + 1);
            }
        }
        return r0.a6(p1.b(bArr));
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final List<Pair<c2, c2>> ud(@k short[] sArr, @k short[] sArr2) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$zip$0");
        g0.p(sArr2, "$v$c$kotlin-UShortArray$-other$0");
        int min = Math.min(d2.o(sArr), d2.o(sArr2));
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(h1.a(c2.b(d2.m(sArr, i11)), c2.b(d2.m(sArr2, i11))));
        }
        return arrayList;
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final <V> Map<w1, V> v0(long[] jArr, l<? super w1, ? extends V> valueSelector) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$associateWith$0");
        g0.p(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(u.u(k1.j(x1.o(jArr)), 16));
        int o11 = x1.o(jArr);
        for (int i11 = 0; i11 < o11; i11++) {
            long m11 = x1.m(jArr, i11);
            linkedHashMap.put(w1.b(m11), valueSelector.invoke(w1.b(m11)));
        }
        return linkedHashMap;
    }

    @y0(version = "2.2")
    @kotlin.c
    @kotlin.d
    @o00.f
    public static final int[] v1(int[] iArr, int i11, l<? super Integer, s1> init) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$copyOf$0");
        g0.p(init, "init");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Invalid new array size: " + i11 + '.').toString());
        }
        int[] copyOf = Arrays.copyOf(iArr, i11);
        g0.o(copyOf, "copyOf(...)");
        int[] f11 = t1.f(copyOf);
        for (int o11 = t1.o(iArr); o11 < i11; o11++) {
            t1.u(f11, o11, init.invoke(Integer.valueOf(o11)).m0());
        }
        return f11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final List<s1> v2(int[] iArr, p<? super Integer, ? super s1, Boolean> predicate) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$filterIndexed$0");
        g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int o11 = t1.o(iArr);
        int i11 = 0;
        int i12 = 0;
        while (i11 < o11) {
            int m11 = t1.m(iArr, i11);
            int i13 = i12 + 1;
            if (predicate.invoke(Integer.valueOf(i12), s1.b(m11)).booleanValue()) {
                arrayList.add(s1.b(m11));
            }
            i11++;
            i12 = i13;
        }
        return arrayList;
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final <R, C extends Collection<? super R>> C v3(short[] sArr, C destination, p<? super Integer, ? super c2, ? extends Iterable<? extends R>> transform) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$flatMapIndexedTo$0");
        g0.p(destination, "destination");
        g0.p(transform, "transform");
        int o11 = d2.o(sArr);
        int i11 = 0;
        int i12 = 0;
        while (i11 < o11) {
            m0.s0(destination, transform.invoke(Integer.valueOf(i12), c2.b(d2.m(sArr, i11))));
            i11++;
            i12++;
        }
        return destination;
    }

    @m80.l
    @y0(version = "1.3")
    @kotlin.d
    public static final c2 v4(@k short[] sArr, int i11) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$getOrNull$0");
        if (i11 < 0 || i11 >= d2.o(sArr)) {
            return null;
        }
        return c2.b(d2.m(sArr, i11));
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R> List<R> v5(long[] jArr, l<? super w1, ? extends R> transform) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$map$0");
        g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(x1.o(jArr));
        int o11 = x1.o(jArr);
        for (int i11 = 0; i11 < o11; i11++) {
            arrayList.add(transform.invoke(w1.b(x1.m(jArr, i11))));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final <R> R v6(byte[] bArr, Comparator<? super R> comparator, l<? super o1, ? extends R> selector) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$maxOfWithOrNull$0");
        g0.p(comparator, "comparator");
        g0.p(selector, "selector");
        if (p1.s(bArr)) {
            return null;
        }
        Object obj = (R) selector.invoke(o1.b(p1.m(bArr, 0)));
        int Ie = a0.Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                Object obj2 = (R) selector.invoke(o1.b(p1.m(bArr, i11)));
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (R) obj2;
                }
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final <R> R v7(byte[] bArr, Comparator<? super R> comparator, l<? super o1, ? extends R> selector) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$minOfWith$0");
        g0.p(comparator, "comparator");
        g0.p(selector, "selector");
        if (p1.s(bArr)) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(o1.b(p1.m(bArr, 0)));
        int Ie = a0.Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                Object obj2 = (R) selector.invoke(o1.b(p1.m(bArr, i11)));
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (R) obj2;
                }
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    @y0(version = "1.3")
    @kotlin.d
    public static final int v8(@k int[] iArr, @k Random random) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$random$0");
        g0.p(random, "random");
        if (t1.s(iArr)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return t1.m(iArr, random.nextInt(t1.o(iArr)));
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final void v9(long[] jArr) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$reverse$0");
        a0.tr(jArr);
    }

    @m80.l
    @y0(version = "1.3")
    @kotlin.d
    public static final o1 va(@k byte[] bArr) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$singleOrNull$0");
        if (p1.o(bArr) == 1) {
            return o1.b(p1.m(bArr, 0));
        }
        return null;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final byte[] vb(@k byte[] bArr) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$sortedArrayDescending$0");
        if (p1.s(bArr)) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        g0.o(copyOf, "copyOf(...)");
        byte[] f11 = p1.f(copyOf);
        ib(f11);
        return f11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final List<w1> vc(long[] jArr, l<? super w1, Boolean> predicate) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$takeLastWhile$0");
        g0.p(predicate, "predicate");
        for (int Ne = a0.Ne(jArr); -1 < Ne; Ne--) {
            if (!predicate.invoke(w1.b(x1.m(jArr, Ne))).booleanValue()) {
                return N1(jArr, Ne + 1);
            }
        }
        return r0.a6(x1.b(jArr));
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final <R> List<Pair<o1, R>> vd(@k byte[] bArr, @k R[] other) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$zip$0");
        g0.p(other, "other");
        int min = Math.min(p1.o(bArr), other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            byte m11 = p1.m(bArr, i11);
            arrayList.add(h1.a(o1.b(m11), other[i11]));
        }
        return arrayList;
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final <V> Map<s1, V> w0(int[] iArr, l<? super s1, ? extends V> valueSelector) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$associateWith$0");
        g0.p(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(u.u(k1.j(t1.o(iArr)), 16));
        int o11 = t1.o(iArr);
        for (int i11 = 0; i11 < o11; i11++) {
            int m11 = t1.m(iArr, i11);
            linkedHashMap.put(s1.b(m11), valueSelector.invoke(s1.b(m11)));
        }
        return linkedHashMap;
    }

    @y0(version = "2.2")
    @kotlin.c
    @kotlin.d
    @o00.f
    public static final long[] w1(long[] jArr, int i11, l<? super Integer, w1> init) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$copyOf$0");
        g0.p(init, "init");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Invalid new array size: " + i11 + '.').toString());
        }
        long[] copyOf = Arrays.copyOf(jArr, i11);
        g0.o(copyOf, "copyOf(...)");
        long[] f11 = x1.f(copyOf);
        for (int o11 = x1.o(jArr); o11 < i11; o11++) {
            x1.u(f11, o11, init.invoke(Integer.valueOf(o11)).m0());
        }
        return f11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final List<w1> w2(long[] jArr, p<? super Integer, ? super w1, Boolean> predicate) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$filterIndexed$0");
        g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int o11 = x1.o(jArr);
        int i11 = 0;
        int i12 = 0;
        while (i11 < o11) {
            long m11 = x1.m(jArr, i11);
            int i13 = i12 + 1;
            if (predicate.invoke(Integer.valueOf(i12), w1.b(m11)).booleanValue()) {
                arrayList.add(w1.b(m11));
            }
            i11++;
            i12 = i13;
        }
        return arrayList;
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final <R, C extends Collection<? super R>> C w3(byte[] bArr, C destination, p<? super Integer, ? super o1, ? extends Iterable<? extends R>> transform) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$flatMapIndexedTo$0");
        g0.p(destination, "destination");
        g0.p(transform, "transform");
        int o11 = p1.o(bArr);
        int i11 = 0;
        int i12 = 0;
        while (i11 < o11) {
            m0.s0(destination, transform.invoke(Integer.valueOf(i12), o1.b(p1.m(bArr, i11))));
            i11++;
            i12++;
        }
        return destination;
    }

    @m80.l
    @y0(version = "1.3")
    @kotlin.d
    public static final s1 w4(@k int[] iArr, int i11) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$getOrNull$0");
        if (i11 < 0 || i11 >= t1.o(iArr)) {
            return null;
        }
        return s1.b(t1.m(iArr, i11));
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R> List<R> w5(int[] iArr, l<? super s1, ? extends R> transform) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$map$0");
        g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(t1.o(iArr));
        int o11 = t1.o(iArr);
        for (int i11 = 0; i11 < o11; i11++) {
            arrayList.add(transform.invoke(s1.b(t1.m(iArr, i11))));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final <R> R w6(short[] sArr, Comparator<? super R> comparator, l<? super c2, ? extends R> selector) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$maxOfWithOrNull$0");
        g0.p(comparator, "comparator");
        g0.p(selector, "selector");
        if (d2.s(sArr)) {
            return null;
        }
        Object obj = (R) selector.invoke(c2.b(d2.m(sArr, 0)));
        int Pe = a0.Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                Object obj2 = (R) selector.invoke(c2.b(d2.m(sArr, i11)));
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (R) obj2;
                }
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final <R> R w7(short[] sArr, Comparator<? super R> comparator, l<? super c2, ? extends R> selector) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$minOfWith$0");
        g0.p(comparator, "comparator");
        g0.p(selector, "selector");
        if (d2.s(sArr)) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(c2.b(d2.m(sArr, 0)));
        int Pe = a0.Pe(sArr);
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                Object obj2 = (R) selector.invoke(c2.b(d2.m(sArr, i11)));
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (R) obj2;
                }
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final byte w8(byte[] bArr) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$random$0");
        return z8(bArr, Random.Default);
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final void w9(int[] iArr, int i11, int i12) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$reverse$0");
        a0.sr(iArr, i11, i12);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final o1 wa(byte[] bArr, l<? super o1, Boolean> predicate) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$singleOrNull$0");
        g0.p(predicate, "predicate");
        int o11 = p1.o(bArr);
        o1 o1Var = null;
        boolean z11 = false;
        for (int i11 = 0; i11 < o11; i11++) {
            byte m11 = p1.m(bArr, i11);
            if (predicate.invoke(o1.b(m11)).booleanValue()) {
                if (z11) {
                    return null;
                }
                o1Var = o1.b(m11);
                z11 = true;
            }
        }
        if (z11) {
            return o1Var;
        }
        return null;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final long[] wb(@k long[] jArr) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$sortedArrayDescending$0");
        if (x1.s(jArr)) {
            return jArr;
        }
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        g0.o(copyOf, "copyOf(...)");
        long[] f11 = x1.f(copyOf);
        jb(f11);
        return f11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final List<s1> wc(int[] iArr, l<? super s1, Boolean> predicate) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$takeLastWhile$0");
        g0.p(predicate, "predicate");
        for (int Me = a0.Me(iArr); -1 < Me; Me--) {
            if (!predicate.invoke(s1.b(t1.m(iArr, Me))).booleanValue()) {
                return M1(iArr, Me + 1);
            }
        }
        return r0.a6(t1.b(iArr));
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final <R> List<Pair<c2, R>> wd(@k short[] sArr, @k R[] other) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$zip$0");
        g0.p(other, "other");
        int min = Math.min(d2.o(sArr), other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            short m11 = d2.m(sArr, i11);
            arrayList.add(h1.a(c2.b(m11), other[i11]));
        }
        return arrayList;
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final <V> Map<c2, V> x0(short[] sArr, l<? super c2, ? extends V> valueSelector) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$associateWith$0");
        g0.p(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(u.u(k1.j(d2.o(sArr)), 16));
        int o11 = d2.o(sArr);
        for (int i11 = 0; i11 < o11; i11++) {
            short m11 = d2.m(sArr, i11);
            linkedHashMap.put(c2.b(m11), valueSelector.invoke(c2.b(m11)));
        }
        return linkedHashMap;
    }

    @y0(version = "2.2")
    @kotlin.c
    @kotlin.d
    @o00.f
    public static final byte[] x1(byte[] bArr, int i11, l<? super Integer, o1> init) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$copyOf$0");
        g0.p(init, "init");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Invalid new array size: " + i11 + '.').toString());
        }
        byte[] copyOf = Arrays.copyOf(bArr, i11);
        g0.o(copyOf, "copyOf(...)");
        byte[] f11 = p1.f(copyOf);
        for (int o11 = p1.o(bArr); o11 < i11; o11++) {
            p1.u(f11, o11, init.invoke(Integer.valueOf(o11)).k0());
        }
        return f11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final List<c2> x2(short[] sArr, p<? super Integer, ? super c2, Boolean> predicate) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$filterIndexed$0");
        g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int o11 = d2.o(sArr);
        int i11 = 0;
        int i12 = 0;
        while (i11 < o11) {
            short m11 = d2.m(sArr, i11);
            int i13 = i12 + 1;
            if (predicate.invoke(Integer.valueOf(i12), c2.b(m11)).booleanValue()) {
                arrayList.add(c2.b(m11));
            }
            i11++;
            i12 = i13;
        }
        return arrayList;
    }

    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final <R, C extends Collection<? super R>> C x3(long[] jArr, C destination, p<? super Integer, ? super w1, ? extends Iterable<? extends R>> transform) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$flatMapIndexedTo$0");
        g0.p(destination, "destination");
        g0.p(transform, "transform");
        int o11 = x1.o(jArr);
        int i11 = 0;
        int i12 = 0;
        while (i11 < o11) {
            m0.s0(destination, transform.invoke(Integer.valueOf(i12), w1.b(x1.m(jArr, i11))));
            i11++;
            i12++;
        }
        return destination;
    }

    @m80.l
    @y0(version = "1.3")
    @kotlin.d
    public static final w1 x4(@k long[] jArr, int i11) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$getOrNull$0");
        if (i11 < 0 || i11 >= x1.o(jArr)) {
            return null;
        }
        return w1.b(x1.m(jArr, i11));
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R> List<R> x5(short[] sArr, l<? super c2, ? extends R> transform) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$map$0");
        g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(d2.o(sArr));
        int o11 = d2.o(sArr);
        for (int i11 = 0; i11 < o11; i11++) {
            arrayList.add(transform.invoke(c2.b(d2.m(sArr, i11))));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final <R> R x6(int[] iArr, Comparator<? super R> comparator, l<? super s1, ? extends R> selector) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$maxOfWithOrNull$0");
        g0.p(comparator, "comparator");
        g0.p(selector, "selector");
        if (t1.s(iArr)) {
            return null;
        }
        Object obj = (R) selector.invoke(s1.b(t1.m(iArr, 0)));
        int Me = a0.Me(iArr);
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                Object obj2 = (R) selector.invoke(s1.b(t1.m(iArr, i11)));
                if (comparator.compare(obj, obj2) < 0) {
                    obj = (R) obj2;
                }
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final <R> R x7(int[] iArr, Comparator<? super R> comparator, l<? super s1, ? extends R> selector) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$minOfWith$0");
        g0.p(comparator, "comparator");
        g0.p(selector, "selector");
        if (t1.s(iArr)) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(s1.b(t1.m(iArr, 0)));
        int Me = a0.Me(iArr);
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                Object obj2 = (R) selector.invoke(s1.b(t1.m(iArr, i11)));
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (R) obj2;
                }
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    @y0(version = "1.3")
    @kotlin.d
    public static final long x8(@k long[] jArr, @k Random random) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$random$0");
        g0.p(random, "random");
        if (x1.s(jArr)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return x1.m(jArr, random.nextInt(x1.o(jArr)));
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final void x9(short[] sArr) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$reverse$0");
        a0.xr(sArr);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final w1 xa(long[] jArr, l<? super w1, Boolean> predicate) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$singleOrNull$0");
        g0.p(predicate, "predicate");
        int o11 = x1.o(jArr);
        w1 w1Var = null;
        boolean z11 = false;
        for (int i11 = 0; i11 < o11; i11++) {
            long m11 = x1.m(jArr, i11);
            if (predicate.invoke(w1.b(m11)).booleanValue()) {
                if (z11) {
                    return null;
                }
                w1Var = w1.b(m11);
                z11 = true;
            }
        }
        if (z11) {
            return w1Var;
        }
        return null;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final short[] xb(@k short[] sArr) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$sortedArrayDescending$0");
        if (d2.s(sArr)) {
            return sArr;
        }
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        g0.o(copyOf, "copyOf(...)");
        short[] f11 = d2.f(copyOf);
        lb(f11);
        return f11;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final List<c2> xc(short[] sArr, l<? super c2, Boolean> predicate) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$takeLastWhile$0");
        g0.p(predicate, "predicate");
        for (int Pe = a0.Pe(sArr); -1 < Pe; Pe--) {
            if (!predicate.invoke(c2.b(d2.m(sArr, Pe))).booleanValue()) {
                return L1(sArr, Pe + 1);
            }
        }
        return r0.a6(d2.b(sArr));
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final List<Pair<w1, w1>> xd(@k long[] jArr, @k long[] jArr2) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$zip$0");
        g0.p(jArr2, "$v$c$kotlin-ULongArray$-other$0");
        int min = Math.min(x1.o(jArr), x1.o(jArr2));
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(h1.a(w1.b(x1.m(jArr, i11)), w1.b(x1.m(jArr2, i11))));
        }
        return arrayList;
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final <V, M extends Map<? super s1, ? super V>> M y0(int[] iArr, M destination, l<? super s1, ? extends V> valueSelector) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$associateWithTo$0");
        g0.p(destination, "destination");
        g0.p(valueSelector, "valueSelector");
        int o11 = t1.o(iArr);
        for (int i11 = 0; i11 < o11; i11++) {
            int m11 = t1.m(iArr, i11);
            destination.put(s1.b(m11), valueSelector.invoke(s1.b(m11)));
        }
        return destination;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final short[] y1(short[] sArr, int i11) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$copyOf$0");
        short[] copyOf = Arrays.copyOf(sArr, i11);
        g0.o(copyOf, "copyOf(...)");
        return d2.f(copyOf);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <C extends Collection<? super s1>> C y2(int[] iArr, C destination, p<? super Integer, ? super s1, Boolean> predicate) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$filterIndexedTo$0");
        g0.p(destination, "destination");
        g0.p(predicate, "predicate");
        int o11 = t1.o(iArr);
        int i11 = 0;
        int i12 = 0;
        while (i11 < o11) {
            int m11 = t1.m(iArr, i11);
            int i13 = i12 + 1;
            if (predicate.invoke(Integer.valueOf(i12), s1.b(m11)).booleanValue()) {
                destination.add(s1.b(m11));
            }
            i11++;
            i12 = i13;
        }
        return destination;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R, C extends Collection<? super R>> C y3(long[] jArr, C destination, l<? super w1, ? extends Iterable<? extends R>> transform) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$flatMapTo$0");
        g0.p(destination, "destination");
        g0.p(transform, "transform");
        int o11 = x1.o(jArr);
        for (int i11 = 0; i11 < o11; i11++) {
            m0.s0(destination, transform.invoke(w1.b(x1.m(jArr, i11))));
        }
        return destination;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <K, V> Map<K, List<V>> y4(long[] jArr, l<? super w1, ? extends K> keySelector, l<? super w1, ? extends V> valueTransform) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$groupBy$0");
        g0.p(keySelector, "keySelector");
        g0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int o11 = x1.o(jArr);
        for (int i11 = 0; i11 < o11; i11++) {
            long m11 = x1.m(jArr, i11);
            K invoke = keySelector.invoke(w1.b(m11));
            List<V> list = linkedHashMap.get(invoke);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(invoke, list);
            }
            list.add(valueTransform.invoke(w1.b(m11)));
        }
        return linkedHashMap;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R> List<R> y5(byte[] bArr, p<? super Integer, ? super o1, ? extends R> transform) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$mapIndexed$0");
        g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(p1.o(bArr));
        int o11 = p1.o(bArr);
        int i11 = 0;
        int i12 = 0;
        while (i11 < o11) {
            arrayList.add(transform.invoke(Integer.valueOf(i12), o1.b(p1.m(bArr, i11))));
            i11++;
            i12++;
        }
        return arrayList;
    }

    @m80.l
    @y0(version = "1.4")
    @kotlin.d
    public static final s1 y6(@k int[] iArr) {
        int compare;
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$maxOrNull$0");
        if (t1.s(iArr)) {
            return null;
        }
        int m11 = t1.m(iArr, 0);
        int Me = a0.Me(iArr);
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                int m12 = t1.m(iArr, i11);
                compare = Integer.compare(m11 ^ Integer.MIN_VALUE, m12 ^ Integer.MIN_VALUE);
                if (compare < 0) {
                    m11 = m12;
                }
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return s1.b(m11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final <R> R y7(long[] jArr, Comparator<? super R> comparator, l<? super w1, ? extends R> selector) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$minOfWithOrNull$0");
        g0.p(comparator, "comparator");
        g0.p(selector, "selector");
        if (x1.s(jArr)) {
            return null;
        }
        Object obj = (R) selector.invoke(w1.b(x1.m(jArr, 0)));
        int Ne = a0.Ne(jArr);
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                Object obj2 = (R) selector.invoke(w1.b(x1.m(jArr, i11)));
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (R) obj2;
                }
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final long y8(long[] jArr) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$random$0");
        return x8(jArr, Random.Default);
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final List<s1> y9(@k int[] iArr) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$reversed$0");
        if (t1.s(iArr)) {
            return h0.J();
        }
        List<s1> d62 = r0.d6(t1.b(iArr));
        o0.t1(d62);
        return d62;
    }

    @m80.l
    @y0(version = "1.3")
    @kotlin.d
    public static final w1 ya(@k long[] jArr) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$singleOrNull$0");
        if (x1.o(jArr) == 1) {
            return w1.b(x1.m(jArr, 0));
        }
        return null;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final List<s1> yb(@k int[] iArr) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$sortedDescending$0");
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        g0.o(copyOf, "copyOf(...)");
        int[] f11 = t1.f(copyOf);
        Sa(f11);
        return y9(f11);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final List<o1> yc(byte[] bArr, l<? super o1, Boolean> predicate) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$takeWhile$0");
        g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int o11 = p1.o(bArr);
        for (int i11 = 0; i11 < o11; i11++) {
            byte m11 = p1.m(bArr, i11);
            if (!predicate.invoke(o1.b(m11)).booleanValue()) {
                break;
            }
            arrayList.add(o1.b(m11));
        }
        return arrayList;
    }

    @y0(version = "1.4")
    @kotlin.d
    @o00.f
    public static final <V, M extends Map<? super o1, ? super V>> M z0(byte[] bArr, M destination, l<? super o1, ? extends V> valueSelector) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$associateWithTo$0");
        g0.p(destination, "destination");
        g0.p(valueSelector, "valueSelector");
        int o11 = p1.o(bArr);
        for (int i11 = 0; i11 < o11; i11++) {
            byte m11 = p1.m(bArr, i11);
            destination.put(o1.b(m11), valueSelector.invoke(o1.b(m11)));
        }
        return destination;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int[] z1(int[] iArr, int i11) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$copyOf$0");
        int[] copyOf = Arrays.copyOf(iArr, i11);
        g0.o(copyOf, "copyOf(...)");
        return t1.f(copyOf);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <C extends Collection<? super c2>> C z2(short[] sArr, C destination, p<? super Integer, ? super c2, Boolean> predicate) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$filterIndexedTo$0");
        g0.p(destination, "destination");
        g0.p(predicate, "predicate");
        int o11 = d2.o(sArr);
        int i11 = 0;
        int i12 = 0;
        while (i11 < o11) {
            short m11 = d2.m(sArr, i11);
            int i13 = i12 + 1;
            if (predicate.invoke(Integer.valueOf(i12), c2.b(m11)).booleanValue()) {
                destination.add(c2.b(m11));
            }
            i11++;
            i12 = i13;
        }
        return destination;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R, C extends Collection<? super R>> C z3(short[] sArr, C destination, l<? super c2, ? extends Iterable<? extends R>> transform) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$flatMapTo$0");
        g0.p(destination, "destination");
        g0.p(transform, "transform");
        int o11 = d2.o(sArr);
        for (int i11 = 0; i11 < o11; i11++) {
            m0.s0(destination, transform.invoke(c2.b(d2.m(sArr, i11))));
        }
        return destination;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <K, V> Map<K, List<V>> z4(short[] sArr, l<? super c2, ? extends K> keySelector, l<? super c2, ? extends V> valueTransform) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$groupBy$0");
        g0.p(keySelector, "keySelector");
        g0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int o11 = d2.o(sArr);
        for (int i11 = 0; i11 < o11; i11++) {
            short m11 = d2.m(sArr, i11);
            K invoke = keySelector.invoke(c2.b(m11));
            List<V> list = linkedHashMap.get(invoke);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(invoke, list);
            }
            list.add(valueTransform.invoke(c2.b(m11)));
        }
        return linkedHashMap;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final <R> List<R> z5(int[] iArr, p<? super Integer, ? super s1, ? extends R> transform) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$mapIndexed$0");
        g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(t1.o(iArr));
        int o11 = t1.o(iArr);
        int i11 = 0;
        int i12 = 0;
        while (i11 < o11) {
            arrayList.add(transform.invoke(Integer.valueOf(i12), s1.b(t1.m(iArr, i11))));
            i11++;
            i12++;
        }
        return arrayList;
    }

    @m80.l
    @y0(version = "1.4")
    @kotlin.d
    public static final o1 z6(@k byte[] bArr) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$maxOrNull$0");
        if (p1.s(bArr)) {
            return null;
        }
        byte m11 = p1.m(bArr, 0);
        int Ie = a0.Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                byte m12 = p1.m(bArr, i11);
                if (g0.t(m11 & 255, m12 & 255) < 0) {
                    m11 = m12;
                }
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return o1.b(m11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final <R> R z7(byte[] bArr, Comparator<? super R> comparator, l<? super o1, ? extends R> selector) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$minOfWithOrNull$0");
        g0.p(comparator, "comparator");
        g0.p(selector, "selector");
        if (p1.s(bArr)) {
            return null;
        }
        Object obj = (R) selector.invoke(o1.b(p1.m(bArr, 0)));
        int Ie = a0.Ie(bArr);
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                Object obj2 = (R) selector.invoke(o1.b(p1.m(bArr, i11)));
                if (comparator.compare(obj, obj2) > 0) {
                    obj = (R) obj2;
                }
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return (R) obj;
    }

    @y0(version = "1.3")
    @kotlin.d
    public static final byte z8(@k byte[] bArr, @k Random random) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$random$0");
        g0.p(random, "random");
        if (p1.s(bArr)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return p1.m(bArr, random.nextInt(p1.o(bArr)));
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final List<o1> z9(@k byte[] bArr) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$reversed$0");
        if (p1.s(bArr)) {
            return h0.J();
        }
        List<o1> d62 = r0.d6(p1.b(bArr));
        o0.t1(d62);
        return d62;
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final s1 za(int[] iArr, l<? super s1, Boolean> predicate) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$singleOrNull$0");
        g0.p(predicate, "predicate");
        int o11 = t1.o(iArr);
        s1 s1Var = null;
        boolean z11 = false;
        for (int i11 = 0; i11 < o11; i11++) {
            int m11 = t1.m(iArr, i11);
            if (predicate.invoke(s1.b(m11)).booleanValue()) {
                if (z11) {
                    return null;
                }
                s1Var = s1.b(m11);
                z11 = true;
            }
        }
        if (z11) {
            return s1Var;
        }
        return null;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final List<o1> zb(@k byte[] bArr) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$sortedDescending$0");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        g0.o(copyOf, "copyOf(...)");
        byte[] f11 = p1.f(copyOf);
        Za(f11);
        return z9(f11);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final List<w1> zc(long[] jArr, l<? super w1, Boolean> predicate) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$takeWhile$0");
        g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int o11 = x1.o(jArr);
        for (int i11 = 0; i11 < o11; i11++) {
            long m11 = x1.m(jArr, i11);
            if (!predicate.invoke(w1.b(m11)).booleanValue()) {
                break;
            }
            arrayList.add(w1.b(m11));
        }
        return arrayList;
    }

    @y0(version = "1.3")
    @kotlin.d
    public static /* synthetic */ void b4(int[] iArr) {
    }

    @y0(version = "1.3")
    @kotlin.d
    public static /* synthetic */ void d4(byte[] bArr) {
    }

    @y0(version = "1.3")
    @kotlin.d
    public static /* synthetic */ void f4(long[] jArr) {
    }

    @y0(version = "1.3")
    @kotlin.d
    public static /* synthetic */ void h4(short[] sArr) {
    }

    @y0(version = "1.3")
    @kotlin.d
    public static /* synthetic */ void j4(int[] iArr) {
    }

    @y0(version = "1.3")
    @kotlin.d
    public static /* synthetic */ void l4(byte[] bArr) {
    }

    @y0(version = "1.3")
    @kotlin.d
    public static /* synthetic */ void n4(long[] jArr) {
    }

    @y0(version = "1.3")
    @kotlin.d
    public static /* synthetic */ void p4(short[] sArr) {
    }
}
