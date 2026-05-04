package androidx.collection;

import a00.q;
import a00.r0;
import androidx.collection.internal.ContainerHelpersKt;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.g0;
import l50.b;
import m80.k;
import m80.l;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ArraySetKt {
    public static final int ARRAY_SET_BASE_SIZE = 4;

    public static final <E> void addAllInternal(@k ArraySet<E> arraySet, @k ArraySet<? extends E> array) {
        g0.p(arraySet, "<this>");
        g0.p(array, "array");
        int i11 = array.get_size$collection();
        arraySet.ensureCapacity(arraySet.get_size$collection() + i11);
        if (arraySet.get_size$collection() != 0) {
            for (int i12 = 0; i12 < i11; i12++) {
                arraySet.add(array.valueAt(i12));
            }
            return;
        }
        if (i11 > 0) {
            q.I0(array.getHashes$collection(), arraySet.getHashes$collection(), 0, 0, i11, 6, null);
            q.K0(array.getArray$collection(), arraySet.getArray$collection(), 0, 0, i11, 6, null);
            if (arraySet.get_size$collection() != 0) {
                throw new ConcurrentModificationException();
            }
            arraySet.set_size$collection(i11);
        }
    }

    public static final <E> boolean addInternal(@k ArraySet<E> arraySet, E e11) {
        int i11;
        int indexOf;
        g0.p(arraySet, "<this>");
        int i12 = arraySet.get_size$collection();
        if (e11 == null) {
            indexOf = indexOfNull(arraySet);
            i11 = 0;
        } else {
            int hashCode = e11.hashCode();
            i11 = hashCode;
            indexOf = indexOf(arraySet, e11, hashCode);
        }
        if (indexOf >= 0) {
            return false;
        }
        int i13 = ~indexOf;
        if (i12 >= arraySet.getHashes$collection().length) {
            int i14 = 8;
            if (i12 >= 8) {
                i14 = (i12 >> 1) + i12;
            } else if (i12 < 4) {
                i14 = 4;
            }
            int[] hashes$collection = arraySet.getHashes$collection();
            Object[] array$collection = arraySet.getArray$collection();
            allocArrays(arraySet, i14);
            if (i12 != arraySet.get_size$collection()) {
                throw new ConcurrentModificationException();
            }
            if (!(arraySet.getHashes$collection().length == 0)) {
                q.I0(hashes$collection, arraySet.getHashes$collection(), 0, 0, hashes$collection.length, 6, null);
                q.K0(array$collection, arraySet.getArray$collection(), 0, 0, array$collection.length, 6, null);
            }
        }
        if (i13 < i12) {
            int i15 = i13 + 1;
            q.z0(arraySet.getHashes$collection(), arraySet.getHashes$collection(), i15, i13, i12);
            q.B0(arraySet.getArray$collection(), arraySet.getArray$collection(), i15, i13, i12);
        }
        if (i12 != arraySet.get_size$collection() || i13 >= arraySet.getHashes$collection().length) {
            throw new ConcurrentModificationException();
        }
        arraySet.getHashes$collection()[i13] = i11;
        arraySet.getArray$collection()[i13] = e11;
        arraySet.set_size$collection(arraySet.get_size$collection() + 1);
        return true;
    }

    public static final <E> void allocArrays(@k ArraySet<E> arraySet, int i11) {
        g0.p(arraySet, "<this>");
        arraySet.setHashes$collection(new int[i11]);
        arraySet.setArray$collection(new Object[i11]);
    }

    @k
    public static final <T> ArraySet<T> arraySetOf() {
        return new ArraySet<>(0, 1, null);
    }

    public static final <E> int binarySearchInternal(@k ArraySet<E> arraySet, int i11) {
        g0.p(arraySet, "<this>");
        try {
            return ContainerHelpersKt.binarySearch(arraySet.getHashes$collection(), arraySet.get_size$collection(), i11);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> void clearInternal(@k ArraySet<E> arraySet) {
        g0.p(arraySet, "<this>");
        if (arraySet.get_size$collection() != 0) {
            arraySet.setHashes$collection(ContainerHelpersKt.EMPTY_INTS);
            arraySet.setArray$collection(ContainerHelpersKt.EMPTY_OBJECTS);
            arraySet.set_size$collection(0);
        }
        if (arraySet.get_size$collection() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> boolean containsAllInternal(@k ArraySet<E> arraySet, @k Collection<? extends E> elements) {
        g0.p(arraySet, "<this>");
        g0.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            if (!arraySet.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static final <E> boolean containsInternal(@k ArraySet<E> arraySet, E e11) {
        g0.p(arraySet, "<this>");
        return arraySet.indexOf(e11) >= 0;
    }

    public static final <E> void ensureCapacityInternal(@k ArraySet<E> arraySet, int i11) {
        g0.p(arraySet, "<this>");
        int i12 = arraySet.get_size$collection();
        if (arraySet.getHashes$collection().length < i11) {
            int[] hashes$collection = arraySet.getHashes$collection();
            Object[] array$collection = arraySet.getArray$collection();
            allocArrays(arraySet, i11);
            if (arraySet.get_size$collection() > 0) {
                q.I0(hashes$collection, arraySet.getHashes$collection(), 0, 0, arraySet.get_size$collection(), 6, null);
                q.K0(array$collection, arraySet.getArray$collection(), 0, 0, arraySet.get_size$collection(), 6, null);
            }
        }
        if (arraySet.get_size$collection() != i12) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> boolean equalsInternal(@k ArraySet<E> arraySet, @l Object obj) {
        g0.p(arraySet, "<this>");
        if (arraySet == obj) {
            return true;
        }
        if (!(obj instanceof Set) || arraySet.size() != ((Set) obj).size()) {
            return false;
        }
        try {
            int i11 = arraySet.get_size$collection();
            for (int i12 = 0; i12 < i11; i12++) {
                if (!((Set) obj).contains(arraySet.valueAt(i12))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static final <E> int hashCodeInternal(@k ArraySet<E> arraySet) {
        g0.p(arraySet, "<this>");
        int[] hashes$collection = arraySet.getHashes$collection();
        int i11 = arraySet.get_size$collection();
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 += hashes$collection[i13];
        }
        return i12;
    }

    public static final <E> int indexOf(@k ArraySet<E> arraySet, @l Object obj, int i11) {
        g0.p(arraySet, "<this>");
        int i12 = arraySet.get_size$collection();
        if (i12 == 0) {
            return -1;
        }
        int binarySearchInternal = binarySearchInternal(arraySet, i11);
        if (binarySearchInternal < 0 || g0.g(obj, arraySet.getArray$collection()[binarySearchInternal])) {
            return binarySearchInternal;
        }
        int i13 = binarySearchInternal + 1;
        while (i13 < i12 && arraySet.getHashes$collection()[i13] == i11) {
            if (g0.g(obj, arraySet.getArray$collection()[i13])) {
                return i13;
            }
            i13++;
        }
        for (int i14 = binarySearchInternal - 1; i14 >= 0 && arraySet.getHashes$collection()[i14] == i11; i14--) {
            if (g0.g(obj, arraySet.getArray$collection()[i14])) {
                return i14;
            }
        }
        return ~i13;
    }

    public static final <E> int indexOfInternal(@k ArraySet<E> arraySet, @l Object obj) {
        g0.p(arraySet, "<this>");
        return obj == null ? indexOfNull(arraySet) : indexOf(arraySet, obj, obj.hashCode());
    }

    public static final <E> int indexOfNull(@k ArraySet<E> arraySet) {
        g0.p(arraySet, "<this>");
        return indexOf(arraySet, null, 0);
    }

    public static final <E> boolean isEmptyInternal(@k ArraySet<E> arraySet) {
        g0.p(arraySet, "<this>");
        return arraySet.get_size$collection() <= 0;
    }

    public static final <E> boolean removeAllInternal(@k ArraySet<E> arraySet, @k ArraySet<? extends E> array) {
        g0.p(arraySet, "<this>");
        g0.p(array, "array");
        int i11 = array.get_size$collection();
        int i12 = arraySet.get_size$collection();
        for (int i13 = 0; i13 < i11; i13++) {
            arraySet.remove(array.valueAt(i13));
        }
        return i12 != arraySet.get_size$collection();
    }

    public static final <E> E removeAtInternal(@k ArraySet<E> arraySet, int i11) {
        int i12;
        Object[] objArr;
        g0.p(arraySet, "<this>");
        int i13 = arraySet.get_size$collection();
        E e11 = (E) arraySet.getArray$collection()[i11];
        if (i13 <= 1) {
            arraySet.clear();
            return e11;
        }
        int i14 = i13 - 1;
        if (arraySet.getHashes$collection().length <= 8 || arraySet.get_size$collection() >= arraySet.getHashes$collection().length / 3) {
            if (i11 < i14) {
                int i15 = i11 + 1;
                q.z0(arraySet.getHashes$collection(), arraySet.getHashes$collection(), i11, i15, i13);
                q.B0(arraySet.getArray$collection(), arraySet.getArray$collection(), i11, i15, i13);
            }
            arraySet.getArray$collection()[i14] = null;
        } else {
            int i16 = arraySet.get_size$collection() > 8 ? arraySet.get_size$collection() + (arraySet.get_size$collection() >> 1) : 8;
            int[] hashes$collection = arraySet.getHashes$collection();
            Object[] array$collection = arraySet.getArray$collection();
            allocArrays(arraySet, i16);
            if (i11 > 0) {
                q.I0(hashes$collection, arraySet.getHashes$collection(), 0, 0, i11, 6, null);
                objArr = array$collection;
                q.K0(objArr, arraySet.getArray$collection(), 0, 0, i11, 6, null);
                i12 = i11;
            } else {
                i12 = i11;
                objArr = array$collection;
            }
            if (i12 < i14) {
                int i17 = i12 + 1;
                q.z0(hashes$collection, arraySet.getHashes$collection(), i12, i17, i13);
                q.B0(objArr, arraySet.getArray$collection(), i12, i17, i13);
            }
        }
        if (i13 != arraySet.get_size$collection()) {
            throw new ConcurrentModificationException();
        }
        arraySet.set_size$collection(i14);
        return e11;
    }

    public static final <E> boolean removeInternal(@k ArraySet<E> arraySet, E e11) {
        g0.p(arraySet, "<this>");
        int indexOf = arraySet.indexOf(e11);
        if (indexOf < 0) {
            return false;
        }
        arraySet.removeAt(indexOf);
        return true;
    }

    public static final <E> boolean retainAllInternal(@k ArraySet<E> arraySet, @k Collection<? extends E> elements) {
        g0.p(arraySet, "<this>");
        g0.p(elements, "elements");
        boolean z11 = false;
        for (int i11 = arraySet.get_size$collection() - 1; -1 < i11; i11--) {
            if (!r0.a2(elements, arraySet.getArray$collection()[i11])) {
                arraySet.removeAt(i11);
                z11 = true;
            }
        }
        return z11;
    }

    @k
    public static final <E> String toStringInternal(@k ArraySet<E> arraySet) {
        g0.p(arraySet, "<this>");
        if (arraySet.isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(arraySet.get_size$collection() * 14);
        sb2.append(b.f69927i);
        int i11 = arraySet.get_size$collection();
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(j2.O);
            }
            E valueAt = arraySet.valueAt(i12);
            if (valueAt != arraySet) {
                sb2.append(valueAt);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append(b.f69928j);
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    public static final <E> E valueAtInternal(@k ArraySet<E> arraySet, int i11) {
        g0.p(arraySet, "<this>");
        return (E) arraySet.getArray$collection()[i11];
    }

    @k
    public static final <T> ArraySet<T> arraySetOf(@k T... values) {
        g0.p(values, "values");
        ArraySet<T> arraySet = new ArraySet<>(values.length);
        for (T t11 : values) {
            arraySet.add(t11);
        }
        return arraySet;
    }

    public static final <E> boolean removeAllInternal(@k ArraySet<E> arraySet, @k Collection<? extends E> elements) {
        g0.p(arraySet, "<this>");
        g0.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= arraySet.remove(it.next());
        }
        return z11;
    }

    public static final <E> boolean addAllInternal(@k ArraySet<E> arraySet, @k Collection<? extends E> elements) {
        g0.p(arraySet, "<this>");
        g0.p(elements, "elements");
        arraySet.ensureCapacity(arraySet.get_size$collection() + elements.size());
        Iterator<? extends E> it = elements.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= arraySet.add(it.next());
        }
        return z11;
    }
}
