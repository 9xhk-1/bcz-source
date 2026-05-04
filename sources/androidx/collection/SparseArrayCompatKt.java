package androidx.collection;

import a00.q;
import androidx.collection.internal.ContainerHelpersKt;
import java.util.Arrays;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l50.b;
import m80.k;
import m80.l;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSparseArrayCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n+ 2 CollectionPlatformUtils.jvm.kt\nandroidx/collection/CollectionPlatformUtils\n*L\n1#1,498:1\n217#1,6:499\n217#1,6:505\n327#1,30:511\n327#1,30:541\n422#1,9:572\n24#2:571\n*S KotlinDebug\n*F\n+ 1 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n*L\n229#1:499,6\n235#1:505,6\n361#1:511,30\n369#1:541,30\n440#1:572,9\n399#1:571\n*E\n"})
/* loaded from: classes.dex */
public final class SparseArrayCompatKt {

    @k
    private static final Object DELETED = new Object();

    public static final <E> void commonAppend(@k SparseArrayCompat<E> sparseArrayCompat, int i11, E e11) {
        g0.p(sparseArrayCompat, "<this>");
        int i12 = sparseArrayCompat.size;
        if (i12 != 0 && i11 <= sparseArrayCompat.keys[i12 - 1]) {
            sparseArrayCompat.put(i11, e11);
            return;
        }
        if (sparseArrayCompat.garbage && i12 >= sparseArrayCompat.keys.length) {
            gc(sparseArrayCompat);
        }
        int i13 = sparseArrayCompat.size;
        if (i13 >= sparseArrayCompat.keys.length) {
            int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i13 + 1);
            int[] copyOf = Arrays.copyOf(sparseArrayCompat.keys, idealIntArraySize);
            g0.o(copyOf, "copyOf(...)");
            sparseArrayCompat.keys = copyOf;
            Object[] copyOf2 = Arrays.copyOf(sparseArrayCompat.values, idealIntArraySize);
            g0.o(copyOf2, "copyOf(...)");
            sparseArrayCompat.values = copyOf2;
        }
        sparseArrayCompat.keys[i13] = i11;
        sparseArrayCompat.values[i13] = e11;
        sparseArrayCompat.size = i13 + 1;
    }

    public static final <E> void commonClear(@k SparseArrayCompat<E> sparseArrayCompat) {
        g0.p(sparseArrayCompat, "<this>");
        int i11 = sparseArrayCompat.size;
        Object[] objArr = sparseArrayCompat.values;
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = null;
        }
        sparseArrayCompat.size = 0;
        sparseArrayCompat.garbage = false;
    }

    public static final <E> boolean commonContainsKey(@k SparseArrayCompat<E> sparseArrayCompat, int i11) {
        g0.p(sparseArrayCompat, "<this>");
        return sparseArrayCompat.indexOfKey(i11) >= 0;
    }

    public static final <E> boolean commonContainsValue(@k SparseArrayCompat<E> sparseArrayCompat, E e11) {
        g0.p(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        int i11 = sparseArrayCompat.size;
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                i12 = -1;
                break;
            }
            if (sparseArrayCompat.values[i12] == e11) {
                break;
            }
            i12++;
        }
        return i12 >= 0;
    }

    @l
    public static final <E> E commonGet(@k SparseArrayCompat<E> sparseArrayCompat, int i11) {
        E e11;
        g0.p(sparseArrayCompat, "<this>");
        int binarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i11);
        if (binarySearch < 0 || (e11 = (E) sparseArrayCompat.values[binarySearch]) == DELETED) {
            return null;
        }
        return e11;
    }

    public static final <E> int commonIndexOfKey(@k SparseArrayCompat<E> sparseArrayCompat, int i11) {
        g0.p(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        return ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i11);
    }

    public static final <E> int commonIndexOfValue(@k SparseArrayCompat<E> sparseArrayCompat, E e11) {
        g0.p(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        int i11 = sparseArrayCompat.size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (sparseArrayCompat.values[i12] == e11) {
                return i12;
            }
        }
        return -1;
    }

    public static final <E> boolean commonIsEmpty(@k SparseArrayCompat<E> sparseArrayCompat) {
        g0.p(sparseArrayCompat, "<this>");
        return sparseArrayCompat.size() == 0;
    }

    public static final <E> int commonKeyAt(@k SparseArrayCompat<E> sparseArrayCompat, int i11) {
        g0.p(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        return sparseArrayCompat.keys[i11];
    }

    public static final <E> void commonPut(@k SparseArrayCompat<E> sparseArrayCompat, int i11, E e11) {
        g0.p(sparseArrayCompat, "<this>");
        int binarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i11);
        if (binarySearch >= 0) {
            sparseArrayCompat.values[binarySearch] = e11;
            return;
        }
        int i12 = ~binarySearch;
        if (i12 < sparseArrayCompat.size && sparseArrayCompat.values[i12] == DELETED) {
            sparseArrayCompat.keys[i12] = i11;
            sparseArrayCompat.values[i12] = e11;
            return;
        }
        if (sparseArrayCompat.garbage && sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
            gc(sparseArrayCompat);
            i12 = ~ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i11);
        }
        int i13 = sparseArrayCompat.size;
        if (i13 >= sparseArrayCompat.keys.length) {
            int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i13 + 1);
            int[] copyOf = Arrays.copyOf(sparseArrayCompat.keys, idealIntArraySize);
            g0.o(copyOf, "copyOf(...)");
            sparseArrayCompat.keys = copyOf;
            Object[] copyOf2 = Arrays.copyOf(sparseArrayCompat.values, idealIntArraySize);
            g0.o(copyOf2, "copyOf(...)");
            sparseArrayCompat.values = copyOf2;
        }
        int i14 = sparseArrayCompat.size;
        if (i14 - i12 != 0) {
            int[] iArr = sparseArrayCompat.keys;
            int i15 = i12 + 1;
            q.z0(iArr, iArr, i15, i12, i14);
            Object[] objArr = sparseArrayCompat.values;
            q.B0(objArr, objArr, i15, i12, sparseArrayCompat.size);
        }
        sparseArrayCompat.keys[i12] = i11;
        sparseArrayCompat.values[i12] = e11;
        sparseArrayCompat.size++;
    }

    public static final <E> void commonPutAll(@k SparseArrayCompat<E> sparseArrayCompat, @k SparseArrayCompat<? extends E> other) {
        g0.p(sparseArrayCompat, "<this>");
        g0.p(other, "other");
        int size = other.size();
        for (int i11 = 0; i11 < size; i11++) {
            int keyAt = other.keyAt(i11);
            E valueAt = other.valueAt(i11);
            int binarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, keyAt);
            if (binarySearch >= 0) {
                sparseArrayCompat.values[binarySearch] = valueAt;
            } else {
                int i12 = ~binarySearch;
                if (i12 >= sparseArrayCompat.size || sparseArrayCompat.values[i12] != DELETED) {
                    if (sparseArrayCompat.garbage && sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
                        gc(sparseArrayCompat);
                        i12 = ~ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, keyAt);
                    }
                    int i13 = sparseArrayCompat.size;
                    if (i13 >= sparseArrayCompat.keys.length) {
                        int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i13 + 1);
                        int[] copyOf = Arrays.copyOf(sparseArrayCompat.keys, idealIntArraySize);
                        g0.o(copyOf, "copyOf(...)");
                        sparseArrayCompat.keys = copyOf;
                        Object[] copyOf2 = Arrays.copyOf(sparseArrayCompat.values, idealIntArraySize);
                        g0.o(copyOf2, "copyOf(...)");
                        sparseArrayCompat.values = copyOf2;
                    }
                    int i14 = sparseArrayCompat.size;
                    if (i14 - i12 != 0) {
                        int[] iArr = sparseArrayCompat.keys;
                        int i15 = i12 + 1;
                        q.z0(iArr, iArr, i15, i12, i14);
                        Object[] objArr = sparseArrayCompat.values;
                        q.B0(objArr, objArr, i15, i12, sparseArrayCompat.size);
                    }
                    sparseArrayCompat.keys[i12] = keyAt;
                    sparseArrayCompat.values[i12] = valueAt;
                    sparseArrayCompat.size++;
                } else {
                    sparseArrayCompat.keys[i12] = keyAt;
                    sparseArrayCompat.values[i12] = valueAt;
                }
            }
        }
    }

    @l
    public static final <E> E commonPutIfAbsent(@k SparseArrayCompat<E> sparseArrayCompat, int i11, E e11) {
        g0.p(sparseArrayCompat, "<this>");
        E e12 = (E) commonGet(sparseArrayCompat, i11);
        if (e12 == null) {
            int binarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i11);
            if (binarySearch >= 0) {
                sparseArrayCompat.values[binarySearch] = e11;
                return e12;
            }
            int i12 = ~binarySearch;
            if (i12 < sparseArrayCompat.size && sparseArrayCompat.values[i12] == DELETED) {
                sparseArrayCompat.keys[i12] = i11;
                sparseArrayCompat.values[i12] = e11;
                return e12;
            }
            if (sparseArrayCompat.garbage && sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
                gc(sparseArrayCompat);
                i12 = ~ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i11);
            }
            int i13 = sparseArrayCompat.size;
            if (i13 >= sparseArrayCompat.keys.length) {
                int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i13 + 1);
                int[] copyOf = Arrays.copyOf(sparseArrayCompat.keys, idealIntArraySize);
                g0.o(copyOf, "copyOf(...)");
                sparseArrayCompat.keys = copyOf;
                Object[] copyOf2 = Arrays.copyOf(sparseArrayCompat.values, idealIntArraySize);
                g0.o(copyOf2, "copyOf(...)");
                sparseArrayCompat.values = copyOf2;
            }
            int i14 = sparseArrayCompat.size;
            if (i14 - i12 != 0) {
                int[] iArr = sparseArrayCompat.keys;
                int i15 = i12 + 1;
                q.z0(iArr, iArr, i15, i12, i14);
                Object[] objArr = sparseArrayCompat.values;
                q.B0(objArr, objArr, i15, i12, sparseArrayCompat.size);
            }
            sparseArrayCompat.keys[i12] = i11;
            sparseArrayCompat.values[i12] = e11;
            sparseArrayCompat.size++;
        }
        return e12;
    }

    public static final <E> void commonRemove(@k SparseArrayCompat<E> sparseArrayCompat, int i11) {
        g0.p(sparseArrayCompat, "<this>");
        int binarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i11);
        if (binarySearch >= 0) {
            Object[] objArr = sparseArrayCompat.values;
            Object obj = objArr[binarySearch];
            Object obj2 = DELETED;
            if (obj != obj2) {
                objArr[binarySearch] = obj2;
                sparseArrayCompat.garbage = true;
            }
        }
    }

    public static final <E> void commonRemoveAt(@k SparseArrayCompat<E> sparseArrayCompat, int i11) {
        g0.p(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.values[i11] != DELETED) {
            sparseArrayCompat.values[i11] = DELETED;
            sparseArrayCompat.garbage = true;
        }
    }

    public static final <E> void commonRemoveAtRange(@k SparseArrayCompat<E> sparseArrayCompat, int i11, int i12) {
        g0.p(sparseArrayCompat, "<this>");
        int min = Math.min(i12, i11 + i12);
        while (i11 < min) {
            sparseArrayCompat.removeAt(i11);
            i11++;
        }
    }

    @l
    public static final <E> E commonReplace(@k SparseArrayCompat<E> sparseArrayCompat, int i11, E e11) {
        g0.p(sparseArrayCompat, "<this>");
        int indexOfKey = sparseArrayCompat.indexOfKey(i11);
        if (indexOfKey < 0) {
            return null;
        }
        Object[] objArr = sparseArrayCompat.values;
        E e12 = (E) objArr[indexOfKey];
        objArr[indexOfKey] = e11;
        return e12;
    }

    public static final <E> void commonSetValueAt(@k SparseArrayCompat<E> sparseArrayCompat, int i11, E e11) {
        g0.p(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        sparseArrayCompat.values[i11] = e11;
    }

    public static final <E> int commonSize(@k SparseArrayCompat<E> sparseArrayCompat) {
        g0.p(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        return sparseArrayCompat.size;
    }

    @k
    public static final <E> String commonToString(@k SparseArrayCompat<E> sparseArrayCompat) {
        g0.p(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.size() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(sparseArrayCompat.size * 28);
        sb2.append(b.f69927i);
        int i11 = sparseArrayCompat.size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(j2.O);
            }
            sb2.append(sparseArrayCompat.keyAt(i12));
            sb2.append('=');
            E valueAt = sparseArrayCompat.valueAt(i12);
            if (valueAt != sparseArrayCompat) {
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

    public static final <E> E commonValueAt(@k SparseArrayCompat<E> sparseArrayCompat, int i11) {
        g0.p(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        Object[] objArr = sparseArrayCompat.values;
        if (i11 < objArr.length) {
            return (E) objArr[i11];
        }
        CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
        throw new ArrayIndexOutOfBoundsException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> void gc(SparseArrayCompat<E> sparseArrayCompat) {
        int i11 = sparseArrayCompat.size;
        int[] iArr = sparseArrayCompat.keys;
        Object[] objArr = sparseArrayCompat.values;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            Object obj = objArr[i13];
            if (obj != DELETED) {
                if (i13 != i12) {
                    iArr[i12] = iArr[i13];
                    objArr[i12] = obj;
                    objArr[i13] = null;
                }
                i12++;
            }
        }
        sparseArrayCompat.garbage = false;
        sparseArrayCompat.size = i12;
    }

    private static final <E, T extends E> T internalGet(SparseArrayCompat<E> sparseArrayCompat, int i11, T t11) {
        T t12;
        int binarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i11);
        return (binarySearch < 0 || (t12 = (T) sparseArrayCompat.values[binarySearch]) == DELETED) ? t11 : t12;
    }

    public static final <E> E commonGet(@k SparseArrayCompat<E> sparseArrayCompat, int i11, E e11) {
        E e12;
        g0.p(sparseArrayCompat, "<this>");
        int binarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i11);
        return (binarySearch < 0 || (e12 = (E) sparseArrayCompat.values[binarySearch]) == DELETED) ? e11 : e12;
    }

    public static final <E> boolean commonReplace(@k SparseArrayCompat<E> sparseArrayCompat, int i11, E e11, E e12) {
        g0.p(sparseArrayCompat, "<this>");
        int indexOfKey = sparseArrayCompat.indexOfKey(i11);
        if (indexOfKey < 0 || !g0.g(sparseArrayCompat.values[indexOfKey], e11)) {
            return false;
        }
        sparseArrayCompat.values[indexOfKey] = e12;
        return true;
    }

    public static final <E> boolean commonRemove(@k SparseArrayCompat<E> sparseArrayCompat, int i11, @l Object obj) {
        g0.p(sparseArrayCompat, "<this>");
        int indexOfKey = sparseArrayCompat.indexOfKey(i11);
        if (indexOfKey < 0 || !g0.g(obj, sparseArrayCompat.valueAt(indexOfKey))) {
            return false;
        }
        sparseArrayCompat.removeAt(indexOfKey);
        return true;
    }
}
