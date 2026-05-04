package androidx.collection;

import a00.q;
import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import l50.b;
import m80.k;
import m80.l;
import org.junit.jupiter.api.j2;
import w00.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSimpleArrayMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleArrayMap.kt\nandroidx/collection/SimpleArrayMap\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,761:1\n299#1,5:762\n299#1,5:767\n59#2,5:772\n59#2,5:777\n59#2,5:782\n59#2,5:788\n1#3:787\n*S KotlinDebug\n*F\n+ 1 SimpleArrayMap.kt\nandroidx/collection/SimpleArrayMap\n*L\n278#1:762,5\n294#1:767,5\n315#1:772,5\n330#1:777,5\n346#1:782,5\n512#1:788,5\n*E\n"})
/* loaded from: classes.dex */
public class SimpleArrayMap<K, V> {

    @k
    private Object[] array;

    @k
    private int[] hashes;
    private int size;

    @w00.k
    public SimpleArrayMap() {
        this(0, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T extends V> T getOrDefaultInternal(Object obj, T t11) {
        int indexOfKey = indexOfKey(obj);
        return indexOfKey >= 0 ? (T) this.array[(indexOfKey << 1) + 1] : t11;
    }

    private final int indexOf(K k11, int i11) {
        int i12 = this.size;
        if (i12 == 0) {
            return -1;
        }
        int binarySearch = ContainerHelpersKt.binarySearch(this.hashes, i12, i11);
        if (binarySearch < 0 || g0.g(k11, this.array[binarySearch << 1])) {
            return binarySearch;
        }
        int i13 = binarySearch + 1;
        while (i13 < i12 && this.hashes[i13] == i11) {
            if (g0.g(k11, this.array[i13 << 1])) {
                return i13;
            }
            i13++;
        }
        for (int i14 = binarySearch - 1; i14 >= 0 && this.hashes[i14] == i11; i14--) {
            if (g0.g(k11, this.array[i14 << 1])) {
                return i14;
            }
        }
        return ~i13;
    }

    private final int indexOfNull() {
        int i11 = this.size;
        if (i11 == 0) {
            return -1;
        }
        int binarySearch = ContainerHelpersKt.binarySearch(this.hashes, i11, 0);
        if (binarySearch < 0 || this.array[binarySearch << 1] == null) {
            return binarySearch;
        }
        int i12 = binarySearch + 1;
        while (i12 < i11 && this.hashes[i12] == 0) {
            if (this.array[i12 << 1] == null) {
                return i12;
            }
            i12++;
        }
        for (int i13 = binarySearch - 1; i13 >= 0 && this.hashes[i13] == 0; i13--) {
            if (this.array[i13 << 1] == null) {
                return i13;
            }
        }
        return ~i12;
    }

    @j(name = "__restricted$indexOfValue")
    public final int __restricted$indexOfValue(V v11) {
        int i11 = this.size * 2;
        Object[] objArr = this.array;
        if (v11 == null) {
            for (int i12 = 1; i12 < i11; i12 += 2) {
                if (objArr[i12] == null) {
                    return i12 >> 1;
                }
            }
            return -1;
        }
        for (int i13 = 1; i13 < i11; i13 += 2) {
            if (g0.g(v11, objArr[i13])) {
                return i13 >> 1;
            }
        }
        return -1;
    }

    public void clear() {
        if (this.size > 0) {
            this.hashes = ContainerHelpersKt.EMPTY_INTS;
            this.array = ContainerHelpersKt.EMPTY_OBJECTS;
            this.size = 0;
        }
        if (this.size > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(K k11) {
        return indexOfKey(k11) >= 0;
    }

    public boolean containsValue(V v11) {
        return __restricted$indexOfValue(v11) >= 0;
    }

    public void ensureCapacity(int i11) {
        int i12 = this.size;
        int[] iArr = this.hashes;
        if (iArr.length < i11) {
            int[] copyOf = Arrays.copyOf(iArr, i11);
            g0.o(copyOf, "copyOf(...)");
            this.hashes = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.array, i11 * 2);
            g0.o(copyOf2, "copyOf(...)");
            this.array = copyOf2;
        }
        if (this.size != i12) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof SimpleArrayMap) {
                if (size() != ((SimpleArrayMap) obj).size()) {
                    return false;
                }
                SimpleArrayMap simpleArrayMap = (SimpleArrayMap) obj;
                int i11 = this.size;
                for (int i12 = 0; i12 < i11; i12++) {
                    K keyAt = keyAt(i12);
                    V valueAt = valueAt(i12);
                    Object obj2 = simpleArrayMap.get(keyAt);
                    if (valueAt == null) {
                        if (obj2 != null || !simpleArrayMap.containsKey(keyAt)) {
                            return false;
                        }
                    } else if (!g0.g(valueAt, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || size() != ((Map) obj).size()) {
                return false;
            }
            int i13 = this.size;
            for (int i14 = 0; i14 < i13; i14++) {
                K keyAt2 = keyAt(i14);
                V valueAt2 = valueAt(i14);
                Object obj3 = ((Map) obj).get(keyAt2);
                if (valueAt2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(keyAt2)) {
                        return false;
                    }
                } else if (!g0.g(valueAt2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    @l
    public V get(K k11) {
        int indexOfKey = indexOfKey(k11);
        if (indexOfKey >= 0) {
            return (V) this.array[(indexOfKey << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V getOrDefault(@l Object obj, V v11) {
        int indexOfKey = indexOfKey(obj);
        return indexOfKey >= 0 ? (V) this.array[(indexOfKey << 1) + 1] : v11;
    }

    public int hashCode() {
        int[] iArr = this.hashes;
        Object[] objArr = this.array;
        int i11 = this.size;
        int i12 = 1;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i11) {
            Object obj = objArr[i12];
            i14 += (obj != null ? obj.hashCode() : 0) ^ iArr[i13];
            i13++;
            i12 += 2;
        }
        return i14;
    }

    public int indexOfKey(K k11) {
        return k11 == null ? indexOfNull() : indexOf(k11, k11.hashCode());
    }

    public boolean isEmpty() {
        return this.size <= 0;
    }

    public K keyAt(int i11) {
        boolean z11 = false;
        if (i11 >= 0 && i11 < this.size) {
            z11 = true;
        }
        if (!z11) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i11);
        }
        return (K) this.array[i11 << 1];
    }

    @l
    public V put(K k11, V v11) {
        int i11 = this.size;
        int hashCode = k11 != null ? k11.hashCode() : 0;
        int indexOf = k11 != null ? indexOf(k11, hashCode) : indexOfNull();
        if (indexOf >= 0) {
            int i12 = (indexOf << 1) + 1;
            Object[] objArr = this.array;
            V v12 = (V) objArr[i12];
            objArr[i12] = v11;
            return v12;
        }
        int i13 = ~indexOf;
        int[] iArr = this.hashes;
        if (i11 >= iArr.length) {
            int i14 = 8;
            if (i11 >= 8) {
                i14 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i14 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i14);
            g0.o(copyOf, "copyOf(...)");
            this.hashes = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.array, i14 << 1);
            g0.o(copyOf2, "copyOf(...)");
            this.array = copyOf2;
            if (i11 != this.size) {
                throw new ConcurrentModificationException();
            }
        }
        if (i13 < i11) {
            int[] iArr2 = this.hashes;
            int i15 = i13 + 1;
            q.z0(iArr2, iArr2, i15, i13, i11);
            Object[] objArr2 = this.array;
            q.B0(objArr2, objArr2, i15 << 1, i13 << 1, this.size << 1);
        }
        int i16 = this.size;
        if (i11 == i16) {
            int[] iArr3 = this.hashes;
            if (i13 < iArr3.length) {
                iArr3[i13] = hashCode;
                Object[] objArr3 = this.array;
                int i17 = i13 << 1;
                objArr3[i17] = k11;
                objArr3[i17 + 1] = v11;
                this.size = i16 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public void putAll(@k SimpleArrayMap<? extends K, ? extends V> map) {
        g0.p(map, "map");
        int i11 = map.size;
        ensureCapacity(this.size + i11);
        if (this.size != 0) {
            for (int i12 = 0; i12 < i11; i12++) {
                put(map.keyAt(i12), map.valueAt(i12));
            }
        } else if (i11 > 0) {
            q.z0(map.hashes, this.hashes, 0, 0, i11);
            q.B0(map.array, this.array, 0, 0, i11 << 1);
            this.size = i11;
        }
    }

    @l
    public V putIfAbsent(K k11, V v11) {
        V v12 = get(k11);
        return v12 == null ? put(k11, v11) : v12;
    }

    @l
    public V remove(K k11) {
        int indexOfKey = indexOfKey(k11);
        if (indexOfKey >= 0) {
            return removeAt(indexOfKey);
        }
        return null;
    }

    public V removeAt(int i11) {
        if (!(i11 >= 0 && i11 < this.size)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i11);
        }
        Object[] objArr = this.array;
        int i12 = i11 << 1;
        V v11 = (V) objArr[i12 + 1];
        int i13 = this.size;
        if (i13 <= 1) {
            clear();
            return v11;
        }
        int i14 = i13 - 1;
        int[] iArr = this.hashes;
        if (iArr.length <= 8 || i13 >= iArr.length / 3) {
            if (i11 < i14) {
                int i15 = i11 + 1;
                q.z0(iArr, iArr, i11, i15, i13);
                Object[] objArr2 = this.array;
                q.B0(objArr2, objArr2, i12, i15 << 1, i13 << 1);
            }
            Object[] objArr3 = this.array;
            int i16 = i14 << 1;
            objArr3[i16] = null;
            objArr3[i16 + 1] = null;
        } else {
            int i17 = i13 > 8 ? i13 + (i13 >> 1) : 8;
            int[] copyOf = Arrays.copyOf(iArr, i17);
            g0.o(copyOf, "copyOf(...)");
            this.hashes = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.array, i17 << 1);
            g0.o(copyOf2, "copyOf(...)");
            this.array = copyOf2;
            if (i13 != this.size) {
                throw new ConcurrentModificationException();
            }
            if (i11 > 0) {
                q.z0(iArr, this.hashes, 0, 0, i11);
                q.B0(objArr, this.array, 0, 0, i12);
            }
            if (i11 < i14) {
                int i18 = i11 + 1;
                q.z0(iArr, this.hashes, i11, i18, i13);
                q.B0(objArr, this.array, i12, i18 << 1, i13 << 1);
            }
        }
        if (i13 != this.size) {
            throw new ConcurrentModificationException();
        }
        this.size = i14;
        return v11;
    }

    @l
    public V replace(K k11, V v11) {
        int indexOfKey = indexOfKey(k11);
        if (indexOfKey >= 0) {
            return setValueAt(indexOfKey, v11);
        }
        return null;
    }

    public V setValueAt(int i11, V v11) {
        boolean z11 = false;
        if (i11 >= 0 && i11 < this.size) {
            z11 = true;
        }
        if (!z11) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i11);
        }
        int i12 = (i11 << 1) + 1;
        Object[] objArr = this.array;
        V v12 = (V) objArr[i12];
        objArr[i12] = v11;
        return v12;
    }

    public int size() {
        return this.size;
    }

    @k
    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.size * 28);
        sb2.append(b.f69927i);
        int i11 = this.size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(j2.O);
            }
            K keyAt = keyAt(i12);
            if (keyAt != sb2) {
                sb2.append(keyAt);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            V valueAt = valueAt(i12);
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

    public V valueAt(int i11) {
        boolean z11 = false;
        if (i11 >= 0 && i11 < this.size) {
            z11 = true;
        }
        if (!z11) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i11);
        }
        return (V) this.array[(i11 << 1) + 1];
    }

    @w00.k
    public SimpleArrayMap(int i11) {
        this.hashes = i11 == 0 ? ContainerHelpersKt.EMPTY_INTS : new int[i11];
        this.array = i11 == 0 ? ContainerHelpersKt.EMPTY_OBJECTS : new Object[i11 << 1];
    }

    public boolean remove(K k11, V v11) {
        int indexOfKey = indexOfKey(k11);
        if (indexOfKey < 0 || !g0.g(v11, valueAt(indexOfKey))) {
            return false;
        }
        removeAt(indexOfKey);
        return true;
    }

    public boolean replace(K k11, V v11, V v12) {
        int indexOfKey = indexOfKey(k11);
        if (indexOfKey < 0 || !g0.g(v11, valueAt(indexOfKey))) {
            return false;
        }
        setValueAt(indexOfKey, v12);
        return true;
    }

    public /* synthetic */ SimpleArrayMap(int i11, int i12, v vVar) {
        this((i12 & 1) != 0 ? 0 : i11);
    }

    public SimpleArrayMap(@l SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        this(0, 1, null);
        if (simpleArrayMap != null) {
            putAll(simpleArrayMap);
        }
    }
}
