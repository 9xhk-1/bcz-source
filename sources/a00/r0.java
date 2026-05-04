package a00;

import a00.a0;
import e00.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Pair;
import kotlin.random.Random;
import org.junit.jupiter.api.j2;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\n_Collections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,3794:1\n295#1,2:3795\n528#1,7:3797\n543#1,6:3804\n865#1,2:3811\n796#1:3813\n1878#1,2:3814\n797#1,2:3816\n1880#1:3818\n799#1:3819\n1878#1,3:3820\n817#1,2:3823\n855#1,2:3825\n1267#1,4:3831\n1236#1,4:3835\n1252#1,4:3839\n1299#1,4:3843\n1460#1,5:3847\n1475#1,5:3852\n1516#1,3:3857\n1519#1,3:3867\n1534#1,3:3870\n1537#1,3:3880\n1634#1,3:3897\n1604#1,4:3900\n1593#1:3904\n1878#1,2:3905\n1880#1:3908\n1594#1:3909\n1878#1,3:3910\n1625#1:3913\n1869#1:3914\n1870#1:3916\n1626#1:3917\n1869#1,2:3918\n1878#1,3:3920\n2967#1,3:3923\n2970#1,6:3927\n2992#1,3:3933\n2995#1,7:3937\n865#1,2:3944\n827#1:3946\n855#1,2:3947\n827#1:3949\n855#1,2:3950\n827#1:3952\n855#1,2:3953\n3516#1,8:3959\n3544#1,7:3967\n3575#1,10:3974\n1#2:3810\n1#2:3907\n1#2:3915\n1#2:3926\n1#2:3936\n37#3,2:3827\n37#3,2:3829\n382#4,7:3860\n382#4,7:3873\n382#4,7:3883\n382#4,7:3890\n32#5,2:3955\n32#5,2:3957\n*S KotlinDebug\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n174#1:3795,2\n184#1:3797,7\n194#1:3804,6\n774#1:3811,2\n785#1:3813\n785#1:3814,2\n785#1:3816,2\n785#1:3818\n785#1:3819\n796#1:3820,3\n808#1:3823,2\n827#1:3825,2\n1194#1:3831,4\n1209#1:3835,4\n1223#1:3839,4\n1286#1:3843,4\n1374#1:3847,5\n1387#1:3852,5\n1491#1:3857,3\n1491#1:3867,3\n1504#1:3870,3\n1504#1:3880,3\n1563#1:3897,3\n1573#1:3900,4\n1583#1:3904\n1583#1:3905,2\n1583#1:3908\n1583#1:3909\n1593#1:3910,3\n1617#1:3913\n1617#1:3914\n1617#1:3916\n1617#1:3917\n1625#1:3918,2\n2767#1:3920,3\n3067#1:3923,3\n3067#1:3927,6\n3084#1:3933,3\n3084#1:3937,7\n3254#1:3944,2\n3262#1:3946\n3262#1:3947,2\n3272#1:3949\n3272#1:3950,2\n3282#1:3952\n3282#1:3953,2\n3505#1:3959,8\n3533#1:3967,7\n3562#1:3974,10\n1583#1:3907\n1617#1:3915\n3067#1:3926\n3084#1:3936\n1042#1:3827,2\n1089#1:3829,2\n1491#1:3860,7\n1504#1:3873,7\n1518#1:3883,7\n1536#1:3890,7\n3450#1:3955,2\n3492#1:3957,2\n*E\n"})
/* loaded from: classes8.dex */
public class r0 extends o0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,731:1\n3635#2:732\n*E\n"})
    public static final class a<T> implements q30.m<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterable f1134a;

        public a(Iterable iterable) {
            this.f1134a = iterable;
        }

        @Override // q30.m
        public Iterator<T> iterator() {
            return this.f1134a.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, K] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\n_Collections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt$groupingBy$1\n*L\n1#1,3794:1\n*E\n"})
    public static final class b<K, T> implements w0<T, K> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterable<T> f1135a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.l<T, K> f1136b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Iterable<? extends T> iterable, x00.l<? super T, ? extends K> lVar) {
            this.f1135a = iterable;
            this.f1136b = lVar;
        }

        @Override // a00.w0
        public K a(T t11) {
            return this.f1136b.invoke(t11);
        }

        @Override // a00.w0
        public Iterator<T> b() {
            return this.f1135a.iterator();
        }
    }

    public static <T> boolean A1(@m80.k Iterable<? extends T> iterable, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (!predicate.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @m80.k
    public static final <T, C extends Collection<? super T>> C A2(@m80.k Iterable<? extends T> iterable, @m80.k C destination, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (T t11 : iterable) {
            if (predicate.invoke(t11).booleanValue()) {
                destination.add(t11);
            }
        }
        return destination;
    }

    @m80.l
    public static <T> T A3(@m80.k List<? extends T> list) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static final <T> boolean A4(@m80.k Iterable<? extends T> iterable, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @m80.k
    public static final <T> Set<T> A5(@m80.k Iterable<? extends T> iterable, @m80.k Iterable<? extends T> other) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        Set<T> e62 = e6(iterable);
        m0.J0(e62, other);
        return e62;
    }

    public static final <T> boolean B1(@m80.k Iterable<? extends T> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        return iterable instanceof Collection ? !((Collection) iterable).isEmpty() : iterable.iterator().hasNext();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @o00.f
    public static final <T> T B2(Iterable<? extends T> iterable, x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (T t11 : iterable) {
            if (predicate.invoke(t11).booleanValue()) {
                return t11;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    @m80.l
    public static final <T> T B3(@m80.k List<? extends T> list, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T previous = listIterator.previous();
            if (predicate.invoke(previous).booleanValue()) {
                return previous;
            }
        }
        return null;
    }

    @yz.y0(version = "1.1")
    @m80.k
    public static final <T, C extends Iterable<? extends T>> C B4(@m80.k C c11, @m80.k x00.l<? super T, g2> action) {
        kotlin.jvm.internal.g0.p(c11, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        Iterator<T> it = c11.iterator();
        while (it.hasNext()) {
            action.invoke(it.next());
        }
        return c11;
    }

    @yz.n(message = "Use sumOf instead.", replaceWith = @yz.w0(expression = "this.sumOf(selector)", imports = {}))
    @yz.o(warningSince = "1.5")
    public static final <T> int B5(@m80.k Iterable<? extends T> iterable, @m80.k x00.l<? super T, Integer> selector) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 += selector.invoke(it.next()).intValue();
        }
        return i11;
    }

    public static final <T> boolean C1(@m80.k Iterable<? extends T> iterable, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @o00.f
    public static final <T> T C2(Iterable<? extends T> iterable, x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        T t11 = null;
        for (T t12 : iterable) {
            if (predicate.invoke(t12).booleanValue()) {
                t11 = t12;
            }
        }
        return t11;
    }

    @m80.k
    public static <T, R> List<R> C3(@m80.k Iterable<? extends T> iterable, @m80.k x00.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(i0.d0(iterable, 10));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(transform.invoke(it.next()));
        }
        return arrayList;
    }

    @yz.y0(version = "1.4")
    @m80.k
    public static final <T, C extends Iterable<? extends T>> C C4(@m80.k C c11, @m80.k x00.p<? super Integer, ? super T, g2> action) {
        kotlin.jvm.internal.g0.p(c11, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        int i11 = 0;
        for (T t11 : c11) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                h0.b0();
            }
            action.invoke(Integer.valueOf(i11), t11);
            i11 = i12;
        }
        return c11;
    }

    @yz.n(message = "Use sumOf instead.", replaceWith = @yz.w0(expression = "this.sumOf(selector)", imports = {}))
    @yz.o(warningSince = "1.5")
    public static final <T> double C5(@m80.k Iterable<? extends T> iterable, @m80.k x00.l<? super T, Double> selector) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        double d11 = 0.0d;
        while (it.hasNext()) {
            d11 += selector.invoke(it.next()).doubleValue();
        }
        return d11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o00.f
    public static final <T> Iterable<T> D1(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        return iterable;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    @o00.f
    public static final <T> T D2(List<? extends T> list, x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T previous = listIterator.previous();
            if (predicate.invoke(previous).booleanValue()) {
                return previous;
            }
        }
        return null;
    }

    @m80.k
    public static final <T, R> List<R> D3(@m80.k Iterable<? extends T> iterable, @m80.k x00.p<? super Integer, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(i0.d0(iterable, 10));
        int i11 = 0;
        for (T t11 : iterable) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                h0.b0();
            }
            arrayList.add(transform.invoke(Integer.valueOf(i11), t11));
            i11 = i12;
        }
        return arrayList;
    }

    @m80.k
    public static final <T> Pair<List<T>, List<T>> D4(@m80.k Iterable<? extends T> iterable, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t11 : iterable) {
            if (predicate.invoke(t11).booleanValue()) {
                arrayList.add(t11);
            } else {
                arrayList2.add(t11);
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @w00.j(name = "sumOfByte")
    public static final int D5(@m80.k Iterable<Byte> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        Iterator<Byte> it = iterable.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 += it.next().byteValue();
        }
        return i11;
    }

    @m80.k
    public static <T> q30.m<T> E1(@m80.k Iterable<? extends T> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        return new a(iterable);
    }

    public static <T> T E2(@m80.k Iterable<? extends T> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) G2((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    @m80.k
    public static final <T, R> List<R> E3(@m80.k Iterable<? extends T> iterable, @m80.k x00.p<? super Integer, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (T t11 : iterable) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                h0.b0();
            }
            R invoke = transform.invoke(Integer.valueOf(i11), t11);
            if (invoke != null) {
                arrayList.add(invoke);
            }
            i11 = i12;
        }
        return arrayList;
    }

    @m80.k
    public static <T> List<T> E4(@m80.k Iterable<? extends T> iterable, @m80.k Iterable<? extends T> elements) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        if (iterable instanceof Collection) {
            return I4((Collection) iterable, elements);
        }
        ArrayList arrayList = new ArrayList();
        m0.s0(arrayList, iterable);
        m0.s0(arrayList, elements);
        return arrayList;
    }

    @w00.j(name = "sumOfDouble")
    public static final double E5(@m80.k Iterable<Double> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        double d11 = 0.0d;
        while (it.hasNext()) {
            d11 += it.next().doubleValue();
        }
        return d11;
    }

    @m80.k
    public static final <T, K, V> Map<K, V> F1(@m80.k Iterable<? extends T> iterable, @m80.k x00.l<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(i0.d0(iterable, 10)), 16));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(it.next());
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    public static final <T> T F2(@m80.k Iterable<? extends T> iterable, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (T t11 : iterable) {
            if (predicate.invoke(t11).booleanValue()) {
                return t11;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @m80.k
    public static final <T, R, C extends Collection<? super R>> C F3(@m80.k Iterable<? extends T> iterable, @m80.k C destination, @m80.k x00.p<? super Integer, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int i11 = 0;
        for (T t11 : iterable) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                h0.b0();
            }
            R invoke = transform.invoke(Integer.valueOf(i11), t11);
            if (invoke != null) {
                destination.add(invoke);
            }
            i11 = i12;
        }
        return destination;
    }

    @m80.k
    public static <T> List<T> F4(@m80.k Iterable<? extends T> iterable, T t11) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            return J4((Collection) iterable, t11);
        }
        ArrayList arrayList = new ArrayList();
        m0.s0(arrayList, iterable);
        arrayList.add(t11);
        return arrayList;
    }

    @w00.j(name = "sumOfDouble")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final <T> double F5(Iterable<? extends T> iterable, x00.l<? super T, Double> selector) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        double d11 = 0.0d;
        while (it.hasNext()) {
            d11 += selector.invoke(it.next()).doubleValue();
        }
        return d11;
    }

    @m80.k
    public static final <T, K> Map<K, T> G1(@m80.k Iterable<? extends T> iterable, @m80.k x00.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(i0.d0(iterable, 10)), 16));
        for (T t11 : iterable) {
            linkedHashMap.put(keySelector.invoke(t11), t11);
        }
        return linkedHashMap;
    }

    public static <T> T G2(@m80.k List<? extends T> list) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    @m80.k
    public static final <T, R, C extends Collection<? super R>> C G3(@m80.k Iterable<? extends T> iterable, @m80.k C destination, @m80.k x00.p<? super Integer, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int i11 = 0;
        for (T t11 : iterable) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                h0.b0();
            }
            destination.add(transform.invoke(Integer.valueOf(i11), t11));
            i11 = i12;
        }
        return destination;
    }

    @m80.k
    public static final <T> List<T> G4(@m80.k Iterable<? extends T> iterable, @m80.k q30.m<? extends T> elements) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        ArrayList arrayList = new ArrayList();
        m0.s0(arrayList, iterable);
        m0.t0(arrayList, elements);
        return arrayList;
    }

    @w00.j(name = "sumOfFloat")
    public static final float G5(@m80.k Iterable<Float> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        float f11 = 0.0f;
        while (it.hasNext()) {
            f11 += it.next().floatValue();
        }
        return f11;
    }

    @m80.k
    public static final <T, K, V> Map<K, V> H1(@m80.k Iterable<? extends T> iterable, @m80.k x00.l<? super T, ? extends K> keySelector, @m80.k x00.l<? super T, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(i0.d0(iterable, 10)), 16));
        for (T t11 : iterable) {
            linkedHashMap.put(keySelector.invoke(t11), valueTransform.invoke(t11));
        }
        return linkedHashMap;
    }

    @yz.y0(version = "1.5")
    @o00.f
    public static final <T, R> R H2(Iterable<? extends T> iterable, x00.l<? super T, ? extends R> transform) {
        R r11;
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                r11 = null;
                break;
            }
            r11 = transform.invoke(it.next());
            if (r11 != null) {
                break;
            }
        }
        if (r11 != null) {
            return r11;
        }
        throw new NoSuchElementException("No element of the collection was transformed to a non-null value.");
    }

    @m80.k
    public static final <T, R> List<R> H3(@m80.k Iterable<? extends T> iterable, @m80.k x00.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            R invoke = transform.invoke(it.next());
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    @m80.k
    public static final <T> List<T> H4(@m80.k Iterable<? extends T> iterable, @m80.k T[] elements) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        if (iterable instanceof Collection) {
            return L4((Collection) iterable, elements);
        }
        ArrayList arrayList = new ArrayList();
        m0.s0(arrayList, iterable);
        m0.u0(arrayList, elements);
        return arrayList;
    }

    @w00.j(name = "sumOfInt")
    public static int H5(@m80.k Iterable<Integer> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        Iterator<Integer> it = iterable.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 += it.next().intValue();
        }
        return i11;
    }

    @m80.k
    public static final <T, K, M extends Map<? super K, ? super T>> M I1(@m80.k Iterable<? extends T> iterable, @m80.k M destination, @m80.k x00.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        for (T t11 : iterable) {
            destination.put(keySelector.invoke(t11), t11);
        }
        return destination;
    }

    @yz.y0(version = "1.5")
    @o00.f
    public static final <T, R> R I2(Iterable<? extends T> iterable, x00.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            R invoke = transform.invoke(it.next());
            if (invoke != null) {
                return invoke;
            }
        }
        return null;
    }

    @m80.k
    public static final <T, R, C extends Collection<? super R>> C I3(@m80.k Iterable<? extends T> iterable, @m80.k C destination, @m80.k x00.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            R invoke = transform.invoke(it.next());
            if (invoke != null) {
                destination.add(invoke);
            }
        }
        return destination;
    }

    @m80.k
    public static <T> List<T> I4(@m80.k Collection<? extends T> collection, @m80.k Iterable<? extends T> elements) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            m0.s0(arrayList, elements);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    @w00.j(name = "sumOfInt")
    @yz.y0(version = "1.4")
    @o00.f
    public static final <T> int I5(Iterable<? extends T> iterable, x00.l<? super T, Integer> selector) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 += selector.invoke(it.next()).intValue();
        }
        return i11;
    }

    @m80.k
    public static final <T, K, V, M extends Map<? super K, ? super V>> M J1(@m80.k Iterable<? extends T> iterable, @m80.k M destination, @m80.k x00.l<? super T, ? extends K> keySelector, @m80.k x00.l<? super T, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        for (T t11 : iterable) {
            destination.put(keySelector.invoke(t11), valueTransform.invoke(t11));
        }
        return destination;
    }

    @m80.l
    public static <T> T J2(@m80.k Iterable<? extends T> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    @m80.k
    public static final <T, R, C extends Collection<? super R>> C J3(@m80.k Iterable<? extends T> iterable, @m80.k C destination, @m80.k x00.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(transform.invoke(it.next()));
        }
        return destination;
    }

    @m80.k
    public static <T> List<T> J4(@m80.k Collection<? extends T> collection, T t11) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t11);
        return arrayList;
    }

    @w00.j(name = "sumOfLong")
    public static final long J5(@m80.k Iterable<Long> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        Iterator<Long> it = iterable.iterator();
        long j11 = 0;
        while (it.hasNext()) {
            j11 += it.next().longValue();
        }
        return j11;
    }

    @m80.k
    public static final <T, K, V, M extends Map<? super K, ? super V>> M K1(@m80.k Iterable<? extends T> iterable, @m80.k M destination, @m80.k x00.l<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(it.next());
            destination.put(invoke.getFirst(), invoke.getSecond());
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @m80.l
    public static final <T> T K2(@m80.k Iterable<? extends T> iterable, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (T t11 : iterable) {
            if (predicate.invoke(t11).booleanValue()) {
                return t11;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @m80.l
    @yz.y0(version = "1.4")
    public static final <T, R extends Comparable<? super R>> T K3(@m80.k Iterable<? extends T> iterable, @m80.k x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R invoke = selector.invoke(next);
        do {
            T next2 = it.next();
            R invoke2 = selector.invoke(next2);
            next = next;
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    @m80.k
    public static final <T> List<T> K4(@m80.k Collection<? extends T> collection, @m80.k q30.m<? extends T> elements) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + 10);
        arrayList.addAll(collection);
        m0.t0(arrayList, elements);
        return arrayList;
    }

    @w00.j(name = "sumOfLong")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final <T> long K5(Iterable<? extends T> iterable, x00.l<? super T, Long> selector) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        long j11 = 0;
        while (it.hasNext()) {
            j11 += selector.invoke(it.next()).longValue();
        }
        return j11;
    }

    @yz.y0(version = "1.3")
    @m80.k
    public static final <K, V> Map<K, V> L1(@m80.k Iterable<? extends K> iterable, @m80.k x00.l<? super K, ? extends V> valueSelector) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(i0.d0(iterable, 10)), 16));
        for (K k11 : iterable) {
            linkedHashMap.put(k11, valueSelector.invoke(k11));
        }
        return linkedHashMap;
    }

    @m80.l
    public static <T> T L2(@m80.k List<? extends T> list) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @w00.j(name = "maxByOrThrow")
    @yz.y0(version = "1.7")
    public static final <T, R extends Comparable<? super R>> T L3(@m80.k Iterable<? extends T> iterable, @m80.k x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R invoke = selector.invoke(next);
        do {
            T next2 = it.next();
            R invoke2 = selector.invoke(next2);
            next = next;
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    @m80.k
    public static <T> List<T> L4(@m80.k Collection<? extends T> collection, @m80.k T[] elements) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + elements.length);
        arrayList.addAll(collection);
        m0.u0(arrayList, elements);
        return arrayList;
    }

    @w00.j(name = "sumOfShort")
    public static final int L5(@m80.k Iterable<Short> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        Iterator<Short> it = iterable.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 += it.next().shortValue();
        }
        return i11;
    }

    @yz.y0(version = "1.3")
    @m80.k
    public static final <K, V, M extends Map<? super K, ? super V>> M M1(@m80.k Iterable<? extends K> iterable, @m80.k M destination, @m80.k x00.l<? super K, ? extends V> valueSelector) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(valueSelector, "valueSelector");
        for (K k11 : iterable) {
            destination.put(k11, valueSelector.invoke(k11));
        }
        return destination;
    }

    @m80.k
    public static final <T, R> List<R> M2(@m80.k Iterable<? extends T> iterable, @m80.k x00.l<? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            m0.s0(arrayList, transform.invoke(it.next()));
        }
        return arrayList;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T> double M3(Iterable<? extends T> iterable, x00.l<? super T, Double> selector) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.invoke(it.next()).doubleValue());
        }
        return doubleValue;
    }

    @o00.f
    public static final <T> List<T> M4(Iterable<? extends T> iterable, T t11) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        return F4(iterable, t11);
    }

    @w00.j(name = "sumOfUInt")
    @yz.y0(version = "1.5")
    @o00.f
    public static final <T> int M5(Iterable<? extends T> iterable, x00.l<? super T, yz.s1> selector) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        int i11 = yz.s1.i(0);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            i11 = yz.s1.i(i11 + selector.invoke(it.next()).m0());
        }
        return i11;
    }

    @w00.j(name = "averageOfByte")
    public static final double N1(@m80.k Iterable<Byte> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        Iterator<Byte> it = iterable.iterator();
        double d11 = 0.0d;
        int i11 = 0;
        while (it.hasNext()) {
            d11 += it.next().byteValue();
            i11++;
            if (i11 < 0) {
                h0.a0();
            }
        }
        if (i11 == 0) {
            return Double.NaN;
        }
        return d11 / i11;
    }

    @w00.j(name = "flatMapIndexedIterable")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final <T, R> List<R> N2(Iterable<? extends T> iterable, x00.p<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (T t11 : iterable) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                h0.b0();
            }
            m0.s0(arrayList, transform.invoke(Integer.valueOf(i11), t11));
            i11 = i12;
        }
        return arrayList;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T> float N3(Iterable<? extends T> iterable, x00.l<? super T, Float> selector) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.invoke(it.next()).floatValue());
        }
        return floatValue;
    }

    @o00.f
    public static final <T> List<T> N4(Collection<? extends T> collection, T t11) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        return J4(collection, t11);
    }

    @w00.j(name = "sumOfULong")
    @yz.y0(version = "1.5")
    @yz.p0
    @o00.f
    public static final <T> long N5(Iterable<? extends T> iterable, x00.l<? super T, yz.w1> selector) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        long i11 = yz.w1.i(0L);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            i11 = yz.w1.i(i11 + selector.invoke(it.next()).m0());
        }
        return i11;
    }

    @w00.j(name = "averageOfDouble")
    public static final double O1(@m80.k Iterable<Double> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        double d11 = 0.0d;
        int i11 = 0;
        while (it.hasNext()) {
            d11 += it.next().doubleValue();
            i11++;
            if (i11 < 0) {
                h0.a0();
            }
        }
        if (i11 == 0) {
            return Double.NaN;
        }
        return d11 / i11;
    }

    @w00.j(name = "flatMapIndexedIterableTo")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final <T, R, C extends Collection<? super R>> C O2(Iterable<? extends T> iterable, C destination, x00.p<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int i11 = 0;
        for (T t11 : iterable) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                h0.b0();
            }
            m0.s0(destination, transform.invoke(Integer.valueOf(i11), t11));
            i11 = i12;
        }
        return destination;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T, R extends Comparable<? super R>> R O3(Iterable<? extends T> iterable, x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R invoke2 = selector.invoke(it.next());
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @yz.y0(version = "1.3")
    @o00.f
    public static final <T> T O4(Collection<? extends T> collection) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        return (T) P4(collection, Random.Default);
    }

    @m80.k
    public static <T> List<T> O5(@m80.k Iterable<? extends T> iterable, int i11) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
        }
        if (i11 == 0) {
            return h0.J();
        }
        if (iterable instanceof Collection) {
            if (i11 >= ((Collection) iterable).size()) {
                return a6(iterable);
            }
            if (i11 == 1) {
                return g0.l(E2(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i11);
        Iterator<? extends T> it = iterable.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i12++;
            if (i12 == i11) {
                break;
            }
        }
        return h0.V(arrayList);
    }

    @w00.j(name = "averageOfFloat")
    public static final double P1(@m80.k Iterable<Float> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        double d11 = 0.0d;
        int i11 = 0;
        while (it.hasNext()) {
            d11 += it.next().floatValue();
            i11++;
            if (i11 < 0) {
                h0.a0();
            }
        }
        if (i11 == 0) {
            return Double.NaN;
        }
        return d11 / i11;
    }

    @w00.j(name = "flatMapIndexedSequence")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final <T, R> List<R> P2(Iterable<? extends T> iterable, x00.p<? super Integer, ? super T, ? extends q30.m<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (T t11 : iterable) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                h0.b0();
            }
            m0.t0(arrayList, transform.invoke(Integer.valueOf(i11), t11));
            i11 = i12;
        }
        return arrayList;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T, R extends Comparable<? super R>> R P3(Iterable<? extends T> iterable, x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R invoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R invoke2 = selector.invoke(it.next());
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @yz.y0(version = "1.3")
    public static <T> T P4(@m80.k Collection<? extends T> collection, @m80.k Random random) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        kotlin.jvm.internal.g0.p(random, "random");
        if (collection.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return (T) k2(collection, random.nextInt(collection.size()));
    }

    @m80.k
    public static <T> List<T> P5(@m80.k List<? extends T> list, int i11) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
        }
        if (i11 == 0) {
            return h0.J();
        }
        int size = list.size();
        if (i11 >= size) {
            return a6(list);
        }
        if (i11 == 1) {
            return g0.l(u3(list));
        }
        ArrayList arrayList = new ArrayList(i11);
        if (list instanceof RandomAccess) {
            for (int i12 = size - i11; i12 < size; i12++) {
                arrayList.add(list.get(i12));
            }
        } else {
            ListIterator<? extends T> listIterator = list.listIterator(size - i11);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    @w00.j(name = "averageOfInt")
    public static final double Q1(@m80.k Iterable<Integer> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        Iterator<Integer> it = iterable.iterator();
        double d11 = 0.0d;
        int i11 = 0;
        while (it.hasNext()) {
            d11 += it.next().intValue();
            i11++;
            if (i11 < 0) {
                h0.a0();
            }
        }
        if (i11 == 0) {
            return Double.NaN;
        }
        return d11 / i11;
    }

    @w00.j(name = "flatMapIndexedSequenceTo")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final <T, R, C extends Collection<? super R>> C Q2(Iterable<? extends T> iterable, C destination, x00.p<? super Integer, ? super T, ? extends q30.m<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int i11 = 0;
        for (T t11 : iterable) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                h0.b0();
            }
            m0.t0(destination, transform.invoke(Integer.valueOf(i11), t11));
            i11 = i12;
        }
        return destination;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T> Double Q3(Iterable<? extends T> iterable, x00.l<? super T, Double> selector) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = selector.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.invoke(it.next()).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @yz.y0(version = "1.4")
    @o00.f
    public static final <T> T Q4(Collection<? extends T> collection) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        return (T) R4(collection, Random.Default);
    }

    @m80.k
    public static final <T> List<T> Q5(@m80.k List<? extends T> list, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        if (list.isEmpty()) {
            return h0.J();
        }
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (!predicate.invoke(listIterator.previous()).booleanValue()) {
                listIterator.next();
                int size = list.size() - listIterator.nextIndex();
                if (size == 0) {
                    return h0.J();
                }
                ArrayList arrayList = new ArrayList(size);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
                return arrayList;
            }
        }
        return a6(list);
    }

    @w00.j(name = "averageOfLong")
    public static final double R1(@m80.k Iterable<Long> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        Iterator<Long> it = iterable.iterator();
        double d11 = 0.0d;
        int i11 = 0;
        while (it.hasNext()) {
            d11 += it.next().longValue();
            i11++;
            if (i11 < 0) {
                h0.a0();
            }
        }
        if (i11 == 0) {
            return Double.NaN;
        }
        return d11 / i11;
    }

    @w00.j(name = "flatMapSequence")
    @yz.y0(version = "1.4")
    @m80.k
    @yz.p0
    public static final <T, R> List<R> R2(@m80.k Iterable<? extends T> iterable, @m80.k x00.l<? super T, ? extends q30.m<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            m0.t0(arrayList, transform.invoke(it.next()));
        }
        return arrayList;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T> Float R3(Iterable<? extends T> iterable, x00.l<? super T, Float> selector) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = selector.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.invoke(it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final <T> T R4(@m80.k Collection<? extends T> collection, @m80.k Random random) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        kotlin.jvm.internal.g0.p(random, "random");
        if (collection.isEmpty()) {
            return null;
        }
        return (T) k2(collection, random.nextInt(collection.size()));
    }

    @m80.k
    public static final <T> List<T> R5(@m80.k Iterable<? extends T> iterable, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t11 : iterable) {
            if (!predicate.invoke(t11).booleanValue()) {
                break;
            }
            arrayList.add(t11);
        }
        return arrayList;
    }

    @w00.j(name = "averageOfShort")
    public static final double S1(@m80.k Iterable<Short> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        Iterator<Short> it = iterable.iterator();
        double d11 = 0.0d;
        int i11 = 0;
        while (it.hasNext()) {
            d11 += it.next().shortValue();
            i11++;
            if (i11 < 0) {
                h0.a0();
            }
        }
        if (i11 == 0) {
            return Double.NaN;
        }
        return d11 / i11;
    }

    @w00.j(name = "flatMapSequenceTo")
    @yz.y0(version = "1.4")
    @m80.k
    @yz.p0
    public static final <T, R, C extends Collection<? super R>> C S2(@m80.k Iterable<? extends T> iterable, @m80.k C destination, @m80.k x00.l<? super T, ? extends q30.m<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            m0.t0(destination, transform.invoke(it.next()));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T, R> R S3(Iterable<? extends T> iterable, Comparator<? super R> comparator, x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke((T) it.next());
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke((T) it.next());
            if (comparator.compare(obj, obj2) < 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    public static final <S, T extends S> S S4(@m80.k Iterable<? extends T> iterable, @m80.k x00.p<? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        S next = it.next();
        while (it.hasNext()) {
            next = operation.invoke(next, it.next());
        }
        return next;
    }

    @m80.k
    public static boolean[] S5(@m80.k Collection<Boolean> collection) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator<Boolean> it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            zArr[i11] = it.next().booleanValue();
            i11++;
        }
        return zArr;
    }

    @yz.y0(version = "1.2")
    @m80.k
    public static final <T> List<List<T>> T1(@m80.k Iterable<? extends T> iterable, int i11) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        return i6(iterable, i11, i11, true);
    }

    @m80.k
    public static final <T, R, C extends Collection<? super R>> C T2(@m80.k Iterable<? extends T> iterable, @m80.k C destination, @m80.k x00.l<? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            m0.s0(destination, transform.invoke(it.next()));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T, R> R T3(Iterable<? extends T> iterable, Comparator<? super R> comparator, x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (R) selector.invoke((T) it.next());
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke((T) it.next());
            if (comparator.compare(obj, obj2) < 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    public static final <S, T extends S> S T4(@m80.k Iterable<? extends T> iterable, @m80.k x00.q<? super Integer, ? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        S next = it.next();
        int i11 = 1;
        while (it.hasNext()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                h0.b0();
            }
            next = operation.invoke(Integer.valueOf(i11), next, it.next());
            i11 = i12;
        }
        return next;
    }

    @m80.k
    public static byte[] T5(@m80.k Collection<Byte> collection) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        Iterator<Byte> it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            bArr[i11] = it.next().byteValue();
            i11++;
        }
        return bArr;
    }

    @yz.y0(version = "1.2")
    @m80.k
    public static final <T, R> List<R> U1(@m80.k Iterable<? extends T> iterable, int i11, @m80.k x00.l<? super List<? extends T>, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        return j6(iterable, i11, i11, true, transform);
    }

    public static final <T, R> R U2(@m80.k Iterable<? extends T> iterable, R r11, @m80.k x00.p<? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r11 = operation.invoke(r11, it.next());
        }
        return r11;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static <T extends Comparable<? super T>> T U3(@m80.k Iterable<? extends T> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final <S, T extends S> S U4(@m80.k Iterable<? extends T> iterable, @m80.k x00.q<? super Integer, ? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        S next = it.next();
        int i11 = 1;
        while (it.hasNext()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                h0.b0();
            }
            next = operation.invoke(Integer.valueOf(i11), next, it.next());
            i11 = i12;
        }
        return next;
    }

    @m80.k
    public static final char[] U5(@m80.k Collection<Character> collection) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        char[] cArr = new char[collection.size()];
        Iterator<Character> it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            cArr[i11] = it.next().charValue();
            i11++;
        }
        return cArr;
    }

    @o00.f
    public static final <T> T V1(List<? extends T> list) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        return list.get(0);
    }

    public static final <T, R> R V2(@m80.k Iterable<? extends T> iterable, R r11, @m80.k x00.q<? super Integer, ? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int i11 = 0;
        for (T t11 : iterable) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                h0.b0();
            }
            r11 = operation.invoke(Integer.valueOf(i11), r11, t11);
            i11 = i12;
        }
        return r11;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Double V3(@m80.k Iterable<Double> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, it.next().doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final <S, T extends S> S V4(@m80.k Iterable<? extends T> iterable, @m80.k x00.p<? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        S next = it.next();
        while (it.hasNext()) {
            next = operation.invoke(next, it.next());
        }
        return next;
    }

    @m80.k
    public static final <T, C extends Collection<? super T>> C V5(@m80.k Iterable<? extends T> iterable, @m80.k C destination) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    @o00.f
    public static final <T> T W1(List<? extends T> list) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        return list.get(1);
    }

    public static final <T, R> R W2(@m80.k List<? extends T> list, R r11, @m80.k x00.p<? super T, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                r11 = operation.invoke(listIterator.previous(), r11);
            }
        }
        return r11;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static Float W3(@m80.k Iterable<Float> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = it.next().floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, it.next().floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static final <S, T extends S> S W4(@m80.k List<? extends T> list, @m80.k x00.p<? super T, ? super S, ? extends S> operation) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            throw new UnsupportedOperationException("Empty list can't be reduced.");
        }
        S previous = listIterator.previous();
        while (listIterator.hasPrevious()) {
            previous = operation.invoke(listIterator.previous(), previous);
        }
        return previous;
    }

    @m80.k
    public static double[] W5(@m80.k Collection<Double> collection) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        double[] dArr = new double[collection.size()];
        Iterator<Double> it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            dArr[i11] = it.next().doubleValue();
            i11++;
        }
        return dArr;
    }

    @o00.f
    public static final <T> T X1(List<? extends T> list) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        return list.get(2);
    }

    public static final <T, R> R X2(@m80.k List<? extends T> list, R r11, @m80.k x00.q<? super Integer, ? super T, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                r11 = operation.invoke(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), r11);
            }
        }
        return r11;
    }

    @w00.j(name = "maxOrThrow")
    @yz.y0(version = "1.7")
    public static final double X3(@m80.k Iterable<Double> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double doubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, it.next().doubleValue());
        }
        return doubleValue;
    }

    public static final <S, T extends S> S X4(@m80.k List<? extends T> list, @m80.k x00.q<? super Integer, ? super T, ? super S, ? extends S> operation) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            throw new UnsupportedOperationException("Empty list can't be reduced.");
        }
        S previous = listIterator.previous();
        while (listIterator.hasPrevious()) {
            previous = operation.invoke(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), previous);
        }
        return previous;
    }

    @m80.k
    public static float[] X5(@m80.k Collection<Float> collection) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator<Float> it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            fArr[i11] = it.next().floatValue();
            i11++;
        }
        return fArr;
    }

    @o00.f
    public static final <T> T Y1(List<? extends T> list) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        return list.get(3);
    }

    @o00.e
    public static final <T> void Y2(@m80.k Iterable<? extends T> iterable, @m80.k x00.l<? super T, g2> action) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            action.invoke(it.next());
        }
    }

    @w00.j(name = "maxOrThrow")
    @yz.y0(version = "1.7")
    public static final float Y3(@m80.k Iterable<Float> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float floatValue = it.next().floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, it.next().floatValue());
        }
        return floatValue;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final <S, T extends S> S Y4(@m80.k List<? extends T> list, @m80.k x00.q<? super Integer, ? super T, ? super S, ? extends S> operation) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            return null;
        }
        S previous = listIterator.previous();
        while (listIterator.hasPrevious()) {
            previous = operation.invoke(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), previous);
        }
        return previous;
    }

    @m80.k
    public static <T> HashSet<T> Y5(@m80.k Iterable<? extends T> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        return (HashSet) V5(iterable, new HashSet(k1.j(i0.d0(iterable, 12))));
    }

    @o00.f
    public static final <T> T Z1(List<? extends T> list) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        return list.get(4);
    }

    public static final <T> void Z2(@m80.k Iterable<? extends T> iterable, @m80.k x00.p<? super Integer, ? super T, g2> action) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        int i11 = 0;
        for (T t11 : iterable) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                h0.b0();
            }
            action.invoke(Integer.valueOf(i11), t11);
            i11 = i12;
        }
    }

    @w00.j(name = "maxOrThrow")
    @yz.y0(version = "1.7")
    @m80.k
    public static final <T extends Comparable<? super T>> T Z3(@m80.k Iterable<? extends T> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final <S, T extends S> S Z4(@m80.k List<? extends T> list, @m80.k x00.p<? super T, ? super S, ? extends S> operation) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            return null;
        }
        S previous = listIterator.previous();
        while (listIterator.hasPrevious()) {
            previous = operation.invoke(listIterator.previous(), previous);
        }
        return previous;
    }

    @m80.k
    public static int[] Z5(@m80.k Collection<Integer> collection) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            iArr[i11] = it.next().intValue();
            i11++;
        }
        return iArr;
    }

    public static <T> boolean a2(@m80.k Iterable<? extends T> iterable, T t11) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(t11) : h3(iterable, t11) >= 0;
    }

    @o00.f
    public static final <T> T a3(List<? extends T> list, int i11, x00.l<? super Integer, ? extends T> defaultValue) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        kotlin.jvm.internal.g0.p(defaultValue, "defaultValue");
        return (i11 < 0 || i11 >= list.size()) ? defaultValue.invoke(Integer.valueOf(i11)) : list.get(i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.l
    @yz.y0(version = "1.4")
    public static final <T> T a4(@m80.k Iterable<? extends T> iterable, @m80.k Comparator<? super T> comparator) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (T) it.next();
        while (it.hasNext()) {
            Object obj2 = (T) it.next();
            if (comparator.compare(obj, obj2) < 0) {
                obj = (T) obj2;
            }
        }
        return (T) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public static final <T> Iterable<T> a5(@m80.k Iterable<? extends T> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new IllegalArgumentException("null element found in " + iterable + '.');
            }
        }
        return iterable;
    }

    @m80.k
    public static <T> List<T> a6(@m80.k Iterable<? extends T> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return h0.V(c6(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return h0.J();
        }
        if (size != 1) {
            return d6(collection);
        }
        return g0.l(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static final <T> int b2(@m80.k Iterable<? extends T> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator<? extends T> it = iterable.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            it.next();
            i11++;
            if (i11 < 0) {
                h0.a0();
            }
        }
        return i11;
    }

    @m80.l
    public static <T> T b3(@m80.k List<? extends T> list, int i11) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        if (i11 < 0 || i11 >= list.size()) {
            return null;
        }
        return list.get(i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @w00.j(name = "maxWithOrThrow")
    @yz.y0(version = "1.7")
    public static final <T> T b4(@m80.k Iterable<? extends T> iterable, @m80.k Comparator<? super T> comparator) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = (T) it.next();
        while (it.hasNext()) {
            Object obj2 = (T) it.next();
            if (comparator.compare(obj, obj2) < 0) {
                obj = (T) obj2;
            }
        }
        return (T) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public static final <T> List<T> b5(@m80.k List<? extends T> list) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new IllegalArgumentException("null element found in " + list + '.');
            }
        }
        return list;
    }

    @m80.k
    public static long[] b6(@m80.k Collection<Long> collection) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator<Long> it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            jArr[i11] = it.next().longValue();
            i11++;
        }
        return jArr;
    }

    public static final <T> int c2(@m80.k Iterable<? extends T> iterable, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int i11 = 0;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return 0;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue() && (i11 = i11 + 1) < 0) {
                h0.a0();
            }
        }
        return i11;
    }

    @m80.k
    public static final <T, K> Map<K, List<T>> c3(@m80.k Iterable<? extends T> iterable, @m80.k x00.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t11 : iterable) {
            K invoke = keySelector.invoke(t11);
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(t11);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @m80.l
    @yz.y0(version = "1.4")
    public static final <T, R extends Comparable<? super R>> T c4(@m80.k Iterable<? extends T> iterable, @m80.k x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R invoke = selector.invoke(next);
        do {
            T next2 = it.next();
            R invoke2 = selector.invoke(next2);
            next = next;
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    @m80.k
    public static <T> List<T> c5(@m80.k Iterable<? extends T> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return a6(iterable);
        }
        List<T> c62 = c6(iterable);
        o0.t1(c62);
        return c62;
    }

    @m80.k
    public static final <T> List<T> c6(@m80.k Iterable<? extends T> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        return iterable instanceof Collection ? d6((Collection) iterable) : (List) V5(iterable, new ArrayList());
    }

    @o00.f
    public static final <T> int d2(Collection<? extends T> collection) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        return collection.size();
    }

    @m80.k
    public static final <T, K, V> Map<K, List<V>> d3(@m80.k Iterable<? extends T> iterable, @m80.k x00.l<? super T, ? extends K> keySelector, @m80.k x00.l<? super T, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t11 : iterable) {
            K invoke = keySelector.invoke(t11);
            List<V> list = linkedHashMap.get(invoke);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(invoke, list);
            }
            list.add(valueTransform.invoke(t11));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @w00.j(name = "minByOrThrow")
    @yz.y0(version = "1.7")
    public static final <T, R extends Comparable<? super R>> T d4(@m80.k Iterable<? extends T> iterable, @m80.k x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R invoke = selector.invoke(next);
        do {
            T next2 = it.next();
            R invoke2 = selector.invoke(next2);
            next = next;
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    @yz.y0(version = "1.4")
    @m80.k
    public static final <T, R> List<R> d5(@m80.k Iterable<? extends T> iterable, R r11, @m80.k x00.p<? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int d02 = i0.d0(iterable, 9);
        if (d02 == 0) {
            return g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(d02 + 1);
        arrayList.add(r11);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r11 = operation.invoke(r11, it.next());
            arrayList.add(r11);
        }
        return arrayList;
    }

    @m80.k
    public static <T> List<T> d6(@m80.k Collection<? extends T> collection) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        return new ArrayList(collection);
    }

    @m80.k
    public static <T> List<T> e2(@m80.k Iterable<? extends T> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        return a6(e6(iterable));
    }

    @m80.k
    public static final <T, K, M extends Map<? super K, List<T>>> M e3(@m80.k Iterable<? extends T> iterable, @m80.k M destination, @m80.k x00.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        for (T t11 : iterable) {
            K invoke = keySelector.invoke(t11);
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(t11);
        }
        return destination;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T> double e4(Iterable<? extends T> iterable, x00.l<? super T, Double> selector) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.invoke(it.next()).doubleValue());
        }
        return doubleValue;
    }

    @yz.y0(version = "1.4")
    @m80.k
    public static final <T, R> List<R> e5(@m80.k Iterable<? extends T> iterable, R r11, @m80.k x00.q<? super Integer, ? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int d02 = i0.d0(iterable, 9);
        if (d02 == 0) {
            return g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(d02 + 1);
        arrayList.add(r11);
        Iterator<? extends T> it = iterable.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            r11 = operation.invoke(Integer.valueOf(i11), r11, it.next());
            arrayList.add(r11);
            i11++;
        }
        return arrayList;
    }

    @m80.k
    public static <T> Set<T> e6(@m80.k Iterable<? extends T> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) V5(iterable, new LinkedHashSet());
    }

    @m80.k
    public static final <T, K> List<T> f2(@m80.k Iterable<? extends T> iterable, @m80.k x00.l<? super T, ? extends K> selector) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (T t11 : iterable) {
            if (hashSet.add(selector.invoke(t11))) {
                arrayList.add(t11);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public static final <T, K, V, M extends Map<? super K, List<V>>> M f3(@m80.k Iterable<? extends T> iterable, @m80.k M destination, @m80.k x00.l<? super T, ? extends K> keySelector, @m80.k x00.l<? super T, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        for (T t11 : iterable) {
            K invoke = keySelector.invoke(t11);
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(t11));
        }
        return destination;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T> float f4(Iterable<? extends T> iterable, x00.l<? super T, Float> selector) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.invoke(it.next()).floatValue());
        }
        return floatValue;
    }

    @yz.y0(version = "1.4")
    @m80.k
    public static final <S, T extends S> List<S> f5(@m80.k Iterable<? extends T> iterable, @m80.k x00.p<? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return h0.J();
        }
        S next = it.next();
        ArrayList arrayList = new ArrayList(i0.d0(iterable, 10));
        arrayList.add(next);
        while (it.hasNext()) {
            next = operation.invoke(next, it.next());
            arrayList.add(next);
        }
        return arrayList;
    }

    @m80.k
    public static <T> Set<T> f6(@m80.k Iterable<? extends T> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return w1.r((Set) V5(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return w1.k();
        }
        if (size != 1) {
            return (Set) V5(iterable, new LinkedHashSet(k1.j(collection.size())));
        }
        return v1.f(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    @m80.k
    public static <T> List<T> g2(@m80.k Iterable<? extends T> iterable, int i11) {
        ArrayList arrayList;
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
        }
        if (i11 == 0) {
            return a6(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i11;
            if (size <= 0) {
                return h0.J();
            }
            if (size == 1) {
                return g0.l(s3(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i11 < size2) {
                        arrayList.add(list.get(i11));
                        i11++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i11);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i12 = 0;
        for (T t11 : iterable) {
            if (i12 >= i11) {
                arrayList.add(t11);
            } else {
                i12++;
            }
        }
        return h0.V(arrayList);
    }

    @yz.y0(version = "1.1")
    @m80.k
    public static final <T, K> w0<T, K> g3(@m80.k Iterable<? extends T> iterable, @m80.k x00.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        return new b(iterable, keySelector);
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T, R extends Comparable<? super R>> R g4(Iterable<? extends T> iterable, x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R invoke2 = selector.invoke(it.next());
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @yz.y0(version = "1.4")
    @m80.k
    public static final <S, T extends S> List<S> g5(@m80.k Iterable<? extends T> iterable, @m80.k x00.q<? super Integer, ? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return h0.J();
        }
        S next = it.next();
        ArrayList arrayList = new ArrayList(i0.d0(iterable, 10));
        arrayList.add(next);
        int i11 = 1;
        while (it.hasNext()) {
            next = operation.invoke(Integer.valueOf(i11), next, it.next());
            arrayList.add(next);
            i11++;
        }
        return arrayList;
    }

    @m80.k
    public static final short[] g6(@m80.k Collection<Short> collection) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        short[] sArr = new short[collection.size()];
        Iterator<Short> it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            sArr[i11] = it.next().shortValue();
            i11++;
        }
        return sArr;
    }

    @m80.k
    public static <T> List<T> h2(@m80.k List<? extends T> list, int i11) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        if (i11 >= 0) {
            return O5(list, g10.u.u(list.size() - i11, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
    }

    public static <T> int h3(@m80.k Iterable<? extends T> iterable, T t11) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t11);
        }
        int i11 = 0;
        for (T t12 : iterable) {
            if (i11 < 0) {
                h0.b0();
            }
            if (kotlin.jvm.internal.g0.g(t11, t12)) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T, R extends Comparable<? super R>> R h4(Iterable<? extends T> iterable, x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R invoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R invoke2 = selector.invoke(it.next());
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @yz.y0(version = "1.4")
    @m80.k
    public static final <T, R> List<R> h5(@m80.k Iterable<? extends T> iterable, R r11, @m80.k x00.p<? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int d02 = i0.d0(iterable, 9);
        if (d02 == 0) {
            return g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(d02 + 1);
        arrayList.add(r11);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r11 = operation.invoke(r11, it.next());
            arrayList.add(r11);
        }
        return arrayList;
    }

    @m80.k
    public static <T> Set<T> h6(@m80.k Iterable<? extends T> iterable, @m80.k Iterable<? extends T> other) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        Set<T> e62 = e6(iterable);
        m0.s0(e62, other);
        return e62;
    }

    @m80.k
    public static final <T> List<T> i2(@m80.k List<? extends T> list, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                if (!predicate.invoke(listIterator.previous()).booleanValue()) {
                    return O5(list, listIterator.nextIndex() + 1);
                }
            }
        }
        return h0.J();
    }

    public static <T> int i3(@m80.k List<? extends T> list, T t11) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        return list.indexOf(t11);
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T> Double i4(Iterable<? extends T> iterable, x00.l<? super T, Double> selector) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = selector.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.invoke(it.next()).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @yz.y0(version = "1.4")
    @m80.k
    public static final <T, R> List<R> i5(@m80.k Iterable<? extends T> iterable, R r11, @m80.k x00.q<? super Integer, ? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int d02 = i0.d0(iterable, 9);
        if (d02 == 0) {
            return g0.l(r11);
        }
        ArrayList arrayList = new ArrayList(d02 + 1);
        arrayList.add(r11);
        Iterator<? extends T> it = iterable.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            r11 = operation.invoke(Integer.valueOf(i11), r11, it.next());
            arrayList.add(r11);
            i11++;
        }
        return arrayList;
    }

    @yz.y0(version = "1.2")
    @m80.k
    public static <T> List<List<T>> i6(@m80.k Iterable<? extends T> iterable, int i11, int i12, boolean z11) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        z1.a(i11, i12);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator b11 = z1.b(iterable.iterator(), i11, i12, z11, false);
            while (b11.hasNext()) {
                arrayList.add((List) b11.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i12) + (size % i12 == 0 ? 0 : 1));
        int i13 = 0;
        while (i13 >= 0 && i13 < size) {
            int B = g10.u.B(i11, size - i13);
            if (B < i11 && !z11) {
                return arrayList2;
            }
            ArrayList arrayList3 = new ArrayList(B);
            for (int i14 = 0; i14 < B; i14++) {
                arrayList3.add(list.get(i14 + i13));
            }
            arrayList2.add(arrayList3);
            i13 += i12;
        }
        return arrayList2;
    }

    @m80.k
    public static final <T> List<T> j2(@m80.k Iterable<? extends T> iterable, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        for (T t11 : iterable) {
            if (z11) {
                arrayList.add(t11);
            } else if (!predicate.invoke(t11).booleanValue()) {
                arrayList.add(t11);
                z11 = true;
            }
        }
        return arrayList;
    }

    public static final <T> int j3(@m80.k Iterable<? extends T> iterable, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int i11 = 0;
        for (T t11 : iterable) {
            if (i11 < 0) {
                h0.b0();
            }
            if (predicate.invoke(t11).booleanValue()) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T> Float j4(Iterable<? extends T> iterable, x00.l<? super T, Float> selector) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = selector.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.invoke(it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @yz.y0(version = "1.3")
    public static final <T> void j5(@m80.k List<T> list, @m80.k Random random) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        kotlin.jvm.internal.g0.p(random, "random");
        for (int L = h0.L(list); L > 0; L--) {
            int nextInt = random.nextInt(L + 1);
            list.set(nextInt, list.set(L, list.get(nextInt)));
        }
    }

    @yz.y0(version = "1.2")
    @m80.k
    public static final <T, R> List<R> j6(@m80.k Iterable<? extends T> iterable, int i11, int i12, boolean z11, @m80.k x00.l<? super List<? extends T>, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        z1.a(i11, i12);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator b11 = z1.b(iterable.iterator(), i11, i12, z11, true);
            while (b11.hasNext()) {
                arrayList.add(transform.invoke((List) b11.next()));
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        int i13 = 0;
        ArrayList arrayList2 = new ArrayList((size / i12) + (size % i12 == 0 ? 0 : 1));
        o1 o1Var = new o1(list);
        while (i13 >= 0 && i13 < size) {
            int B = g10.u.B(i11, size - i13);
            if (!z11 && B < i11) {
                return arrayList2;
            }
            o1Var.d(i13, B + i13);
            arrayList2.add(transform.invoke(o1Var));
            i13 += i12;
        }
        return arrayList2;
    }

    public static <T> T k2(@m80.k Iterable<? extends T> iterable, final int i11) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        return iterable instanceof List ? (T) ((List) iterable).get(i11) : (T) n2(iterable, i11, new x00.l() { // from class: a00.q0
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object m22;
                m22 = r0.m2(i11, ((Integer) obj).intValue());
                return m22;
            }
        });
    }

    public static final <T> int k3(@m80.k List<? extends T> list, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        Iterator<? extends T> it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue()) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T, R> R k4(Iterable<? extends T> iterable, Comparator<? super R> comparator, x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke((T) it.next());
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke((T) it.next());
            if (comparator.compare(obj, obj2) > 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    public static <T> T k5(@m80.k Iterable<? extends T> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) m5((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static /* synthetic */ List k6(Iterable iterable, int i11, int i12, boolean z11, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 1;
        }
        if ((i13 & 4) != 0) {
            z11 = false;
        }
        return i6(iterable, i11, i12, z11);
    }

    @o00.f
    public static final <T> T l2(List<? extends T> list, int i11) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        return list.get(i11);
    }

    public static final <T> int l3(@m80.k Iterable<? extends T> iterable, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int i11 = -1;
        int i12 = 0;
        for (T t11 : iterable) {
            if (i12 < 0) {
                h0.b0();
            }
            if (predicate.invoke(t11).booleanValue()) {
                i11 = i12;
            }
            i12++;
        }
        return i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T, R> R l4(Iterable<? extends T> iterable, Comparator<? super R> comparator, x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (R) selector.invoke((T) it.next());
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke((T) it.next());
            if (comparator.compare(obj, obj2) > 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    public static final <T> T l5(@m80.k Iterable<? extends T> iterable, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        T t11 = null;
        boolean z11 = false;
        for (T t12 : iterable) {
            if (predicate.invoke(t12).booleanValue()) {
                if (z11) {
                    throw new IllegalArgumentException("Collection contains more than one matching element.");
                }
                z11 = true;
                t11 = t12;
            }
        }
        if (z11) {
            return t11;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static /* synthetic */ List l6(Iterable iterable, int i11, int i12, boolean z11, x00.l lVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 1;
        }
        if ((i13 & 4) != 0) {
            z11 = false;
        }
        return j6(iterable, i11, i12, z11, lVar);
    }

    public static final Object m2(int i11, int i12) {
        throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + i11 + '.');
    }

    public static final <T> int m3(@m80.k List<? extends T> list, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (predicate.invoke(listIterator.previous()).booleanValue()) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static <T extends Comparable<? super T>> T m4(@m80.k Iterable<? extends T> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static <T> T m5(@m80.k List<? extends T> list) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    @m80.k
    public static <T> Iterable<a1<T>> m6(@m80.k final Iterable<? extends T> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        return new b1(new x00.a() { // from class: a00.p0
            @Override // x00.a
            public final Object invoke() {
                Iterator n62;
                n62 = r0.n6(iterable);
                return n62;
            }
        });
    }

    public static final <T> T n2(@m80.k Iterable<? extends T> iterable, int i11, @m80.k x00.l<? super Integer, ? extends T> defaultValue) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(defaultValue, "defaultValue");
        if (iterable instanceof List) {
            List list = (List) iterable;
            return (i11 < 0 || i11 >= list.size()) ? defaultValue.invoke(Integer.valueOf(i11)) : (T) list.get(i11);
        }
        if (i11 < 0) {
            return defaultValue.invoke(Integer.valueOf(i11));
        }
        int i12 = 0;
        for (T t11 : iterable) {
            int i13 = i12 + 1;
            if (i11 == i12) {
                return t11;
            }
            i12 = i13;
        }
        return defaultValue.invoke(Integer.valueOf(i11));
    }

    @m80.k
    public static <T> Set<T> n3(@m80.k Iterable<? extends T> iterable, @m80.k Iterable<? extends T> other) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        Set<T> e62 = e6(iterable);
        m0.T0(e62, other);
        return e62;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static final Double n4(@m80.k Iterable<Double> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, it.next().doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @m80.l
    public static <T> T n5(@m80.k Iterable<? extends T> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return (T) list.get(0);
            }
            return null;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static final Iterator n6(Iterable iterable) {
        return iterable.iterator();
    }

    @o00.f
    public static final <T> T o2(List<? extends T> list, int i11, x00.l<? super Integer, ? extends T> defaultValue) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        kotlin.jvm.internal.g0.p(defaultValue, "defaultValue");
        return (i11 < 0 || i11 >= list.size()) ? defaultValue.invoke(Integer.valueOf(i11)) : list.get(i11);
    }

    @m80.k
    public static final <T, A extends Appendable> A o3(@m80.k Iterable<? extends T> iterable, @m80.k A buffer, @m80.k CharSequence separator, @m80.k CharSequence prefix, @m80.k CharSequence postfix, int i11, @m80.k CharSequence truncated, @m80.l x00.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(buffer, "buffer");
        kotlin.jvm.internal.g0.p(separator, "separator");
        kotlin.jvm.internal.g0.p(prefix, "prefix");
        kotlin.jvm.internal.g0.p(postfix, "postfix");
        kotlin.jvm.internal.g0.p(truncated, "truncated");
        buffer.append(prefix);
        int i12 = 0;
        for (T t11 : iterable) {
            i12++;
            if (i12 > 1) {
                buffer.append(separator);
            }
            if (i11 >= 0 && i12 > i11) {
                break;
            }
            u30.u.b(buffer, t11, lVar);
        }
        if (i11 >= 0 && i12 > i11) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static Float o4(@m80.k Iterable<Float> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = it.next().floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, it.next().floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    @m80.l
    public static final <T> T o5(@m80.k Iterable<? extends T> iterable, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        boolean z11 = false;
        T t11 = null;
        for (T t12 : iterable) {
            if (predicate.invoke(t12).booleanValue()) {
                if (z11) {
                    return null;
                }
                z11 = true;
                t11 = t12;
            }
        }
        if (z11) {
            return t11;
        }
        return null;
    }

    @m80.k
    public static <T, R> List<Pair<T, R>> o6(@m80.k Iterable<? extends T> iterable, @m80.k Iterable<? extends R> other) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(i0.d0(iterable, 10), i0.d0(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(yz.h1.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    @m80.l
    public static <T> T p2(@m80.k Iterable<? extends T> iterable, int i11) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) b3((List) iterable, i11);
        }
        if (i11 < 0) {
            return null;
        }
        int i12 = 0;
        for (T t11 : iterable) {
            int i13 = i12 + 1;
            if (i11 == i12) {
                return t11;
            }
            i12 = i13;
        }
        return null;
    }

    public static /* synthetic */ Appendable p3(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, x00.l lVar, int i12, Object obj) {
        return o3(iterable, appendable, (i12 & 2) != 0 ? j2.O : charSequence, (i12 & 4) != 0 ? "" : charSequence2, (i12 & 8) == 0 ? charSequence3 : "", (i12 & 16) != 0 ? -1 : i11, (i12 & 32) != 0 ? "..." : charSequence4, (i12 & 64) != 0 ? null : lVar);
    }

    @w00.j(name = "minOrThrow")
    @yz.y0(version = "1.7")
    public static final double p4(@m80.k Iterable<Double> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double doubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, it.next().doubleValue());
        }
        return doubleValue;
    }

    @m80.l
    public static <T> T p5(@m80.k List<? extends T> list) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    @m80.k
    public static final <T, R, V> List<V> p6(@m80.k Iterable<? extends T> iterable, @m80.k Iterable<? extends R> other, @m80.k x00.p<? super T, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        kotlin.jvm.internal.g0.p(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(i0.d0(iterable, 10), i0.d0(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(transform.invoke(it.next(), it2.next()));
        }
        return arrayList;
    }

    @o00.f
    public static final <T> T q2(List<? extends T> list, int i11) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        return (T) b3(list, i11);
    }

    @m80.k
    public static final <T> String q3(@m80.k Iterable<? extends T> iterable, @m80.k CharSequence separator, @m80.k CharSequence prefix, @m80.k CharSequence postfix, int i11, @m80.k CharSequence truncated, @m80.l x00.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(separator, "separator");
        kotlin.jvm.internal.g0.p(prefix, "prefix");
        kotlin.jvm.internal.g0.p(postfix, "postfix");
        kotlin.jvm.internal.g0.p(truncated, "truncated");
        return ((StringBuilder) o3(iterable, new StringBuilder(), separator, prefix, postfix, i11, truncated, lVar)).toString();
    }

    @w00.j(name = "minOrThrow")
    @yz.y0(version = "1.7")
    public static final float q4(@m80.k Iterable<Float> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float floatValue = it.next().floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, it.next().floatValue());
        }
        return floatValue;
    }

    @m80.k
    public static <T> List<T> q5(@m80.k List<? extends T> list, @m80.k g10.l indices) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        kotlin.jvm.internal.g0.p(indices, "indices");
        return indices.isEmpty() ? h0.J() : a6(list.subList(indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    @m80.k
    public static final <T, R> List<Pair<T, R>> q6(@m80.k Iterable<? extends T> iterable, @m80.k R[] other) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        int length = other.length;
        ArrayList arrayList = new ArrayList(Math.min(i0.d0(iterable, 10), length));
        int i11 = 0;
        for (T t11 : iterable) {
            if (i11 >= length) {
                break;
            }
            arrayList.add(yz.h1.a(t11, other[i11]));
            i11++;
        }
        return arrayList;
    }

    @m80.k
    public static <T> List<T> r2(@m80.k Iterable<? extends T> iterable, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t11 : iterable) {
            if (predicate.invoke(t11).booleanValue()) {
                arrayList.add(t11);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ String r3(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, x00.l lVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            charSequence = j2.O;
        }
        if ((i12 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i12 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i12 & 8) != 0) {
            i11 = -1;
        }
        if ((i12 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i12 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        x00.l lVar2 = lVar;
        return q3(iterable, charSequence, charSequence2, charSequence3, i11, charSequence5, lVar2);
    }

    @w00.j(name = "minOrThrow")
    @yz.y0(version = "1.7")
    @m80.k
    public static final <T extends Comparable<? super T>> T r4(@m80.k Iterable<? extends T> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    @m80.k
    public static final <T> List<T> r5(@m80.k List<? extends T> list, @m80.k Iterable<Integer> indices) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        kotlin.jvm.internal.g0.p(indices, "indices");
        int d02 = i0.d0(indices, 10);
        if (d02 == 0) {
            return h0.J();
        }
        ArrayList arrayList = new ArrayList(d02);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(list.get(it.next().intValue()));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public static final <T, R, V> List<V> r6(@m80.k Iterable<? extends T> iterable, @m80.k R[] other, @m80.k x00.p<? super T, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int length = other.length;
        ArrayList arrayList = new ArrayList(Math.min(i0.d0(iterable, 10), length));
        int i11 = 0;
        for (T t11 : iterable) {
            if (i11 >= length) {
                break;
            }
            arrayList.add(transform.invoke(t11, other[i11]));
            i11++;
        }
        return arrayList;
    }

    @m80.k
    public static final <T> List<T> s2(@m80.k Iterable<? extends T> iterable, @m80.k x00.p<? super Integer, ? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (T t11 : iterable) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                h0.b0();
            }
            if (predicate.invoke(Integer.valueOf(i11), t11).booleanValue()) {
                arrayList.add(t11);
            }
            i11 = i12;
        }
        return arrayList;
    }

    public static <T> T s3(@m80.k Iterable<? extends T> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) u3((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.l
    @yz.y0(version = "1.4")
    public static final <T> T s4(@m80.k Iterable<? extends T> iterable, @m80.k Comparator<? super T> comparator) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (T) it.next();
        while (it.hasNext()) {
            Object obj2 = (T) it.next();
            if (comparator.compare(obj, obj2) > 0) {
                obj = (T) obj2;
            }
        }
        return (T) obj;
    }

    public static final <T, R extends Comparable<? super R>> void s5(@m80.k List<T> list, @m80.k x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (list.size() > 1) {
            l0.r0(list, new g.a(selector));
        }
    }

    @yz.y0(version = "1.2")
    @m80.k
    public static final <T> List<Pair<T, T>> s6(@m80.k Iterable<? extends T> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return h0.J();
        }
        ArrayList arrayList = new ArrayList();
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            arrayList.add(yz.h1.a(next, next2));
            next = next2;
        }
        return arrayList;
    }

    @m80.k
    public static final <T, C extends Collection<? super T>> C t2(@m80.k Iterable<? extends T> iterable, @m80.k C destination, @m80.k x00.p<? super Integer, ? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int i11 = 0;
        for (T t11 : iterable) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                h0.b0();
            }
            if (predicate.invoke(Integer.valueOf(i11), t11).booleanValue()) {
                destination.add(t11);
            }
            i11 = i12;
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    public static final <T> T t3(@m80.k Iterable<? extends T> iterable, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        T t11 = null;
        boolean z11 = false;
        for (T t12 : iterable) {
            if (predicate.invoke(t12).booleanValue()) {
                z11 = true;
                t11 = t12;
            }
        }
        if (z11) {
            return t11;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @w00.j(name = "minWithOrThrow")
    @yz.y0(version = "1.7")
    public static final <T> T t4(@m80.k Iterable<? extends T> iterable, @m80.k Comparator<? super T> comparator) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = (T) it.next();
        while (it.hasNext()) {
            Object obj2 = (T) it.next();
            if (comparator.compare(obj, obj2) > 0) {
                obj = (T) obj2;
            }
        }
        return (T) obj;
    }

    public static final <T, R extends Comparable<? super R>> void t5(@m80.k List<T> list, @m80.k x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        if (list.size() > 1) {
            l0.r0(list, new g.c(selector));
        }
    }

    @yz.y0(version = "1.2")
    @m80.k
    public static final <T, R> List<R> t6(@m80.k Iterable<? extends T> iterable, @m80.k x00.p<? super T, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return h0.J();
        }
        ArrayList arrayList = new ArrayList();
        a0.e next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            arrayList.add(transform.invoke(next, next2));
            next = next2;
        }
        return arrayList;
    }

    public static final /* synthetic */ <R> List<R> u2(Iterable<?> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            kotlin.jvm.internal.g0.y(3, "R");
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static <T> T u3(@m80.k List<? extends T> list) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(h0.L(list));
    }

    @m80.k
    public static final <T> List<T> u4(@m80.k Iterable<? extends T> iterable, @m80.k Iterable<? extends T> elements) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        Collection v02 = m0.v0(elements);
        if (v02.isEmpty()) {
            return a6(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t11 : iterable) {
            if (!v02.contains(t11)) {
                arrayList.add(t11);
            }
        }
        return arrayList;
    }

    public static final <T extends Comparable<? super T>> void u5(@m80.k List<T> list) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        l0.r0(list, e00.g.x());
    }

    public static final /* synthetic */ <R, C extends Collection<? super R>> C v2(Iterable<?> iterable, C destination) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        for (Object obj : iterable) {
            kotlin.jvm.internal.g0.y(3, "R");
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    public static final <T> T v3(@m80.k List<? extends T> list, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T previous = listIterator.previous();
            if (predicate.invoke(previous).booleanValue()) {
                return previous;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    @m80.k
    public static <T> List<T> v4(@m80.k Iterable<? extends T> iterable, T t11) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        ArrayList arrayList = new ArrayList(i0.d0(iterable, 10));
        boolean z11 = false;
        for (T t12 : iterable) {
            boolean z12 = true;
            if (!z11 && kotlin.jvm.internal.g0.g(t12, t11)) {
                z11 = true;
                z12 = false;
            }
            if (z12) {
                arrayList.add(t12);
            }
        }
        return arrayList;
    }

    @m80.k
    public static <T extends Comparable<? super T>> List<T> v5(@m80.k Iterable<? extends T> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List<T> c62 = c6(iterable);
            l0.o0(c62);
            return c62;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return a6(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        q.U3((Comparable[]) array);
        return q.t(array);
    }

    @m80.k
    public static final <T> List<T> w2(@m80.k Iterable<? extends T> iterable, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t11 : iterable) {
            if (!predicate.invoke(t11).booleanValue()) {
                arrayList.add(t11);
            }
        }
        return arrayList;
    }

    public static final <T> int w3(@m80.k Iterable<? extends T> iterable, T t11) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).lastIndexOf(t11);
        }
        int i11 = -1;
        int i12 = 0;
        for (T t12 : iterable) {
            if (i12 < 0) {
                h0.b0();
            }
            if (kotlin.jvm.internal.g0.g(t11, t12)) {
                i11 = i12;
            }
            i12++;
        }
        return i11;
    }

    @m80.k
    public static final <T> List<T> w4(@m80.k Iterable<? extends T> iterable, @m80.k q30.m<? extends T> elements) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        List I3 = q30.k0.I3(elements);
        if (I3.isEmpty()) {
            return a6(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t11 : iterable) {
            if (!I3.contains(t11)) {
                arrayList.add(t11);
            }
        }
        return arrayList;
    }

    @m80.k
    public static final <T, R extends Comparable<? super R>> List<T> w5(@m80.k Iterable<? extends T> iterable, @m80.k x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        return z5(iterable, new g.a(selector));
    }

    @m80.k
    public static <T> List<T> x2(@m80.k Iterable<? extends T> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        return (List) y2(iterable, new ArrayList());
    }

    public static final <T> int x3(@m80.k List<? extends T> list, T t11) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        return list.lastIndexOf(t11);
    }

    @m80.k
    public static final <T> List<T> x4(@m80.k Iterable<? extends T> iterable, @m80.k T[] elements) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        if (elements.length == 0) {
            return a6(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t11 : iterable) {
            if (!a0.B8(elements, t11)) {
                arrayList.add(t11);
            }
        }
        return arrayList;
    }

    @m80.k
    public static final <T, R extends Comparable<? super R>> List<T> x5(@m80.k Iterable<? extends T> iterable, @m80.k x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        return z5(iterable, new g.c(selector));
    }

    @m80.k
    public static final <C extends Collection<? super T>, T> C y2(@m80.k Iterable<? extends T> iterable, @m80.k C destination) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        for (T t11 : iterable) {
            if (t11 != null) {
                destination.add(t11);
            }
        }
        return destination;
    }

    @m80.l
    public static <T> T y3(@m80.k Iterable<? extends T> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(list.size() - 1);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    @o00.f
    public static final <T> List<T> y4(Iterable<? extends T> iterable, T t11) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        return v4(iterable, t11);
    }

    @m80.k
    public static final <T extends Comparable<? super T>> List<T> y5(@m80.k Iterable<? extends T> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        return z5(iterable, e00.g.x());
    }

    @m80.k
    public static final <T, C extends Collection<? super T>> C z2(@m80.k Iterable<? extends T> iterable, @m80.k C destination, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (T t11 : iterable) {
            if (!predicate.invoke(t11).booleanValue()) {
                destination.add(t11);
            }
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @m80.l
    public static final <T> T z3(@m80.k Iterable<? extends T> iterable, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        T t11 = null;
        for (T t12 : iterable) {
            if (predicate.invoke(t12).booleanValue()) {
                t11 = t12;
            }
        }
        return t11;
    }

    public static final <T> boolean z4(@m80.k Iterable<? extends T> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).isEmpty() : !iterable.iterator().hasNext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public static <T> List<T> z5(@m80.k Iterable<? extends T> iterable, @m80.k Comparator<? super T> comparator) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List<T> c62 = c6(iterable);
            l0.r0(c62, comparator);
            return c62;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return a6(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        q.h4(array, comparator);
        return q.t(array);
    }
}
