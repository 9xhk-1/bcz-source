package androidx.collection;

import a00.e1;
import a00.q;
import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l50.b;
import m80.k;
import m80.l;
import org.junit.jupiter.api.j2;
import x00.p;
import yz.g2;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLongSparseArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSparseArray.kt\nandroidx/collection/LongSparseArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n*L\n1#1,573:1\n229#1,5:574\n229#1,5:579\n299#1,18:584\n299#1,18:603\n299#1,18:626\n299#1,18:649\n299#1,18:672\n299#1,18:690\n299#1,18:708\n299#1,18:726\n1#2:602\n59#3,5:621\n59#3,5:644\n59#3,5:667\n*S KotlinDebug\n*F\n+ 1 LongSparseArray.kt\nandroidx/collection/LongSparseArrayKt\n*L\n218#1:574,5\n223#1:579,5\n331#1:584,18\n374#1:603,18\n389#1:626,18\n401#1:649,18\n414#1:672,18\n422#1:690,18\n430#1:708,18\n468#1:726,18\n384#1:621,5\n396#1:644,5\n409#1:667,5\n*E\n"})
/* loaded from: classes.dex */
public final class LongSparseArrayKt {

    @k
    private static final Object DELETED = new Object();

    public static final <E> void commonAppend(@k LongSparseArray<E> longSparseArray, long j11, E e11) {
        g0.p(longSparseArray, "<this>");
        int i11 = longSparseArray.size;
        if (i11 != 0 && j11 <= longSparseArray.keys[i11 - 1]) {
            longSparseArray.put(j11, e11);
            return;
        }
        if (longSparseArray.garbage) {
            long[] jArr = longSparseArray.keys;
            if (i11 >= jArr.length) {
                Object[] objArr = longSparseArray.values;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj = objArr[i13];
                    if (obj != DELETED) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr[i12] = obj;
                            objArr[i13] = null;
                        }
                        i12++;
                    }
                }
                longSparseArray.garbage = false;
                longSparseArray.size = i12;
            }
        }
        int i14 = longSparseArray.size;
        if (i14 >= longSparseArray.keys.length) {
            int idealLongArraySize = ContainerHelpersKt.idealLongArraySize(i14 + 1);
            long[] copyOf = Arrays.copyOf(longSparseArray.keys, idealLongArraySize);
            g0.o(copyOf, "copyOf(...)");
            longSparseArray.keys = copyOf;
            Object[] copyOf2 = Arrays.copyOf(longSparseArray.values, idealLongArraySize);
            g0.o(copyOf2, "copyOf(...)");
            longSparseArray.values = copyOf2;
        }
        longSparseArray.keys[i14] = j11;
        longSparseArray.values[i14] = e11;
        longSparseArray.size = i14 + 1;
    }

    public static final <E> void commonClear(@k LongSparseArray<E> longSparseArray) {
        g0.p(longSparseArray, "<this>");
        int i11 = longSparseArray.size;
        Object[] objArr = longSparseArray.values;
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = null;
        }
        longSparseArray.size = 0;
        longSparseArray.garbage = false;
    }

    public static final <E> boolean commonContainsKey(@k LongSparseArray<E> longSparseArray, long j11) {
        g0.p(longSparseArray, "<this>");
        return longSparseArray.indexOfKey(j11) >= 0;
    }

    public static final <E> boolean commonContainsValue(@k LongSparseArray<E> longSparseArray, E e11) {
        g0.p(longSparseArray, "<this>");
        return longSparseArray.indexOfValue(e11) >= 0;
    }

    public static final <E> void commonGc(@k LongSparseArray<E> longSparseArray) {
        g0.p(longSparseArray, "<this>");
        int i11 = longSparseArray.size;
        long[] jArr = longSparseArray.keys;
        Object[] objArr = longSparseArray.values;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            Object obj = objArr[i13];
            if (obj != DELETED) {
                if (i13 != i12) {
                    jArr[i12] = jArr[i13];
                    objArr[i12] = obj;
                    objArr[i13] = null;
                }
                i12++;
            }
        }
        longSparseArray.garbage = false;
        longSparseArray.size = i12;
    }

    @l
    public static final <E> E commonGet(@k LongSparseArray<E> longSparseArray, long j11) {
        g0.p(longSparseArray, "<this>");
        int binarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j11);
        if (binarySearch < 0 || longSparseArray.values[binarySearch] == DELETED) {
            return null;
        }
        return (E) longSparseArray.values[binarySearch];
    }

    @l
    public static final Object commonGetInternal(@k LongSparseArray<?> longSparseArray, long j11, @l Object obj) {
        g0.p(longSparseArray, "<this>");
        int binarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j11);
        return (binarySearch < 0 || longSparseArray.values[binarySearch] == DELETED) ? obj : longSparseArray.values[binarySearch];
    }

    public static final <E> int commonIndexOfKey(@k LongSparseArray<E> longSparseArray, long j11) {
        g0.p(longSparseArray, "<this>");
        if (longSparseArray.garbage) {
            int i11 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != DELETED) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i12;
        }
        return ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j11);
    }

    public static final <E> int commonIndexOfValue(@k LongSparseArray<E> longSparseArray, E e11) {
        g0.p(longSparseArray, "<this>");
        if (longSparseArray.garbage) {
            int i11 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != DELETED) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i12;
        }
        int i14 = longSparseArray.size;
        for (int i15 = 0; i15 < i14; i15++) {
            if (longSparseArray.values[i15] == e11) {
                return i15;
            }
        }
        return -1;
    }

    public static final <E> boolean commonIsEmpty(@k LongSparseArray<E> longSparseArray) {
        g0.p(longSparseArray, "<this>");
        return longSparseArray.size() == 0;
    }

    public static final <E> long commonKeyAt(@k LongSparseArray<E> longSparseArray, int i11) {
        g0.p(longSparseArray, "<this>");
        if (!(i11 >= 0 && i11 < longSparseArray.size)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i11);
        }
        if (longSparseArray.garbage) {
            int i12 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                Object obj = objArr[i14];
                if (obj != DELETED) {
                    if (i14 != i13) {
                        jArr[i13] = jArr[i14];
                        objArr[i13] = obj;
                        objArr[i14] = null;
                    }
                    i13++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i13;
        }
        return longSparseArray.keys[i11];
    }

    public static final <E> void commonPut(@k LongSparseArray<E> longSparseArray, long j11, E e11) {
        g0.p(longSparseArray, "<this>");
        int binarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j11);
        if (binarySearch >= 0) {
            longSparseArray.values[binarySearch] = e11;
            return;
        }
        int i11 = ~binarySearch;
        if (i11 < longSparseArray.size && longSparseArray.values[i11] == DELETED) {
            longSparseArray.keys[i11] = j11;
            longSparseArray.values[i11] = e11;
            return;
        }
        if (longSparseArray.garbage) {
            int i12 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            if (i12 >= jArr.length) {
                Object[] objArr = longSparseArray.values;
                int i13 = 0;
                for (int i14 = 0; i14 < i12; i14++) {
                    Object obj = objArr[i14];
                    if (obj != DELETED) {
                        if (i14 != i13) {
                            jArr[i13] = jArr[i14];
                            objArr[i13] = obj;
                            objArr[i14] = null;
                        }
                        i13++;
                    }
                }
                longSparseArray.garbage = false;
                longSparseArray.size = i13;
                i11 = ~ContainerHelpersKt.binarySearch(longSparseArray.keys, i13, j11);
            }
        }
        int i15 = longSparseArray.size;
        if (i15 >= longSparseArray.keys.length) {
            int idealLongArraySize = ContainerHelpersKt.idealLongArraySize(i15 + 1);
            long[] copyOf = Arrays.copyOf(longSparseArray.keys, idealLongArraySize);
            g0.o(copyOf, "copyOf(...)");
            longSparseArray.keys = copyOf;
            Object[] copyOf2 = Arrays.copyOf(longSparseArray.values, idealLongArraySize);
            g0.o(copyOf2, "copyOf(...)");
            longSparseArray.values = copyOf2;
        }
        int i16 = longSparseArray.size;
        if (i16 - i11 != 0) {
            long[] jArr2 = longSparseArray.keys;
            int i17 = i11 + 1;
            q.A0(jArr2, jArr2, i17, i11, i16);
            Object[] objArr2 = longSparseArray.values;
            q.B0(objArr2, objArr2, i17, i11, longSparseArray.size);
        }
        longSparseArray.keys[i11] = j11;
        longSparseArray.values[i11] = e11;
        longSparseArray.size++;
    }

    public static final <E> void commonPutAll(@k LongSparseArray<E> longSparseArray, @k LongSparseArray<? extends E> other) {
        g0.p(longSparseArray, "<this>");
        g0.p(other, "other");
        int size = other.size();
        for (int i11 = 0; i11 < size; i11++) {
            longSparseArray.put(other.keyAt(i11), other.valueAt(i11));
        }
    }

    @l
    public static final <E> E commonPutIfAbsent(@k LongSparseArray<E> longSparseArray, long j11, E e11) {
        g0.p(longSparseArray, "<this>");
        E e12 = longSparseArray.get(j11);
        if (e12 == null) {
            longSparseArray.put(j11, e11);
        }
        return e12;
    }

    public static final <E> void commonRemove(@k LongSparseArray<E> longSparseArray, long j11) {
        g0.p(longSparseArray, "<this>");
        int binarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j11);
        if (binarySearch < 0 || longSparseArray.values[binarySearch] == DELETED) {
            return;
        }
        longSparseArray.values[binarySearch] = DELETED;
        longSparseArray.garbage = true;
    }

    public static final <E> void commonRemoveAt(@k LongSparseArray<E> longSparseArray, int i11) {
        g0.p(longSparseArray, "<this>");
        if (longSparseArray.values[i11] != DELETED) {
            longSparseArray.values[i11] = DELETED;
            longSparseArray.garbage = true;
        }
    }

    @l
    public static final <E> E commonReplace(@k LongSparseArray<E> longSparseArray, long j11, E e11) {
        g0.p(longSparseArray, "<this>");
        int indexOfKey = longSparseArray.indexOfKey(j11);
        if (indexOfKey < 0) {
            return null;
        }
        Object[] objArr = longSparseArray.values;
        E e12 = (E) objArr[indexOfKey];
        objArr[indexOfKey] = e11;
        return e12;
    }

    public static final <E> void commonSetValueAt(@k LongSparseArray<E> longSparseArray, int i11, E e11) {
        g0.p(longSparseArray, "<this>");
        if (!(i11 >= 0 && i11 < longSparseArray.size)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i11);
        }
        if (longSparseArray.garbage) {
            int i12 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                Object obj = objArr[i14];
                if (obj != DELETED) {
                    if (i14 != i13) {
                        jArr[i13] = jArr[i14];
                        objArr[i13] = obj;
                        objArr[i14] = null;
                    }
                    i13++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i13;
        }
        longSparseArray.values[i11] = e11;
    }

    public static final <E> int commonSize(@k LongSparseArray<E> longSparseArray) {
        g0.p(longSparseArray, "<this>");
        if (longSparseArray.garbage) {
            int i11 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != DELETED) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i12;
        }
        return longSparseArray.size;
    }

    @k
    public static final <E> String commonToString(@k LongSparseArray<E> longSparseArray) {
        g0.p(longSparseArray, "<this>");
        if (longSparseArray.size() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(longSparseArray.size * 28);
        sb2.append(b.f69927i);
        int i11 = longSparseArray.size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(j2.O);
            }
            sb2.append(longSparseArray.keyAt(i12));
            sb2.append('=');
            E valueAt = longSparseArray.valueAt(i12);
            if (valueAt != sb2) {
                sb2.append(valueAt);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append(b.f69928j);
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    public static final <E> E commonValueAt(@k LongSparseArray<E> longSparseArray, int i11) {
        g0.p(longSparseArray, "<this>");
        if (!(i11 >= 0 && i11 < longSparseArray.size)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i11);
        }
        if (longSparseArray.garbage) {
            int i12 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                Object obj = objArr[i14];
                if (obj != DELETED) {
                    if (i14 != i13) {
                        jArr[i13] = jArr[i14];
                        objArr[i13] = obj;
                        objArr[i14] = null;
                    }
                    i13++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i13;
        }
        return (E) longSparseArray.values[i11];
    }

    public static final <T> boolean contains(@k LongSparseArray<T> longSparseArray, long j11) {
        g0.p(longSparseArray, "<this>");
        return longSparseArray.containsKey(j11);
    }

    public static final <T> void forEach(@k LongSparseArray<T> longSparseArray, @k p<? super Long, ? super T, g2> action) {
        g0.p(longSparseArray, "<this>");
        g0.p(action, "action");
        int size = longSparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            action.invoke(Long.valueOf(longSparseArray.keyAt(i11)), longSparseArray.valueAt(i11));
        }
    }

    public static final <T> T getOrDefault(@k LongSparseArray<T> longSparseArray, long j11, T t11) {
        g0.p(longSparseArray, "<this>");
        return longSparseArray.get(j11, t11);
    }

    public static final <T> T getOrElse(@k LongSparseArray<T> longSparseArray, long j11, @k x00.a<? extends T> defaultValue) {
        g0.p(longSparseArray, "<this>");
        g0.p(defaultValue, "defaultValue");
        T t11 = longSparseArray.get(j11);
        return t11 == null ? defaultValue.invoke() : t11;
    }

    public static final <T> int getSize(@k LongSparseArray<T> longSparseArray) {
        g0.p(longSparseArray, "<this>");
        return longSparseArray.size();
    }

    public static final <T> boolean isNotEmpty(@k LongSparseArray<T> longSparseArray) {
        g0.p(longSparseArray, "<this>");
        return !longSparseArray.isEmpty();
    }

    @k
    public static final <T> e1 keyIterator(@k final LongSparseArray<T> longSparseArray) {
        g0.p(longSparseArray, "<this>");
        return new e1() { // from class: androidx.collection.LongSparseArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < longSparseArray.size();
            }

            @Override // a00.e1
            public long nextLong() {
                LongSparseArray<T> longSparseArray2 = longSparseArray;
                int i11 = this.index;
                this.index = i11 + 1;
                return longSparseArray2.keyAt(i11);
            }

            public final void setIndex(int i11) {
                this.index = i11;
            }
        };
    }

    @k
    public static final <T> LongSparseArray<T> plus(@k LongSparseArray<T> longSparseArray, @k LongSparseArray<T> other) {
        g0.p(longSparseArray, "<this>");
        g0.p(other, "other");
        LongSparseArray<T> longSparseArray2 = new LongSparseArray<>(longSparseArray.size() + other.size());
        longSparseArray2.putAll(longSparseArray);
        longSparseArray2.putAll(other);
        return longSparseArray2;
    }

    @n(level = DeprecationLevel.HIDDEN, message = "Replaced with member function. Remove extension import!")
    public static final /* synthetic */ boolean remove(LongSparseArray longSparseArray, long j11, Object obj) {
        g0.p(longSparseArray, "<this>");
        return longSparseArray.remove(j11, obj);
    }

    public static final <T> void set(@k LongSparseArray<T> longSparseArray, long j11, T t11) {
        g0.p(longSparseArray, "<this>");
        longSparseArray.put(j11, t11);
    }

    @k
    public static final <T> Iterator<T> valueIterator(@k LongSparseArray<T> longSparseArray) {
        g0.p(longSparseArray, "<this>");
        return new LongSparseArrayKt$valueIterator$1(longSparseArray);
    }

    public static final <E> E commonGet(@k LongSparseArray<E> longSparseArray, long j11, E e11) {
        g0.p(longSparseArray, "<this>");
        int binarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j11);
        return (binarySearch < 0 || longSparseArray.values[binarySearch] == DELETED) ? e11 : (E) longSparseArray.values[binarySearch];
    }

    public static final <E> boolean commonReplace(@k LongSparseArray<E> longSparseArray, long j11, E e11, E e12) {
        g0.p(longSparseArray, "<this>");
        int indexOfKey = longSparseArray.indexOfKey(j11);
        if (indexOfKey < 0 || !g0.g(longSparseArray.values[indexOfKey], e11)) {
            return false;
        }
        longSparseArray.values[indexOfKey] = e12;
        return true;
    }

    public static final <E> boolean commonRemove(@k LongSparseArray<E> longSparseArray, long j11, E e11) {
        g0.p(longSparseArray, "<this>");
        int indexOfKey = longSparseArray.indexOfKey(j11);
        if (indexOfKey < 0 || !g0.g(e11, longSparseArray.valueAt(indexOfKey))) {
            return false;
        }
        longSparseArray.removeAt(indexOfKey);
        return true;
    }

    public static /* synthetic */ void getSize$annotations(LongSparseArray longSparseArray) {
    }
}
