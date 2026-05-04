package androidx.collection;

import a00.q;
import androidx.collection.internal.ContainerHelpersKt;
import java.util.Arrays;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import l50.b;
import m80.l;
import org.junit.jupiter.api.j2;
import w00.g;
import w00.j;
import w00.k;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSparseArrayCompat.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArrayCompat.jvm.kt\nandroidx/collection/SparseArrayCompat\n+ 2 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n+ 3 CollectionPlatformUtils.jvm.kt\nandroidx/collection/CollectionPlatformUtils\n*L\n1#1,263:1\n250#2,9:264\n263#2,5:273\n271#2,5:278\n279#2,7:283\n294#2,9:290\n327#2,30:299\n360#2,2:329\n327#2,37:331\n367#2,3:368\n327#2,30:371\n371#2:401\n376#2,4:402\n383#2:406\n387#2,4:407\n395#2,5:411\n401#2:417\n406#2,5:418\n414#2,4:423\n422#2,9:427\n435#2:436\n440#2:437\n422#2,9:438\n445#2,8:447\n456#2,17:455\n476#2,21:472\n24#3:416\n*S KotlinDebug\n*F\n+ 1 SparseArrayCompat.jvm.kt\nandroidx/collection/SparseArrayCompat\n*L\n123#1:264,9\n126#1:273,5\n135#1:278,5\n144#1:283,7\n155#1:290,9\n161#1:299,30\n168#1:329,2\n168#1:331,37\n179#1:368,3\n179#1:371,30\n179#1:401\n182#1:402,4\n198#1:406\n204#1:407,4\n210#1:411,5\n210#1:417\n216#1:418,5\n226#1:423,4\n238#1:427,9\n241#1:436\n244#1:437\n244#1:438,9\n247#1:447,8\n253#1:455,17\n261#1:472,21\n210#1:416\n*E\n"})
/* loaded from: classes.dex */
public class SparseArrayCompat<E> implements Cloneable {

    @g
    public /* synthetic */ boolean garbage;

    @g
    public /* synthetic */ int[] keys;

    @g
    public /* synthetic */ int size;

    @g
    public /* synthetic */ Object[] values;

    @k
    public SparseArrayCompat() {
        this(0, 1, null);
    }

    public void append(int i11, E e11) {
        int i12 = this.size;
        if (i12 != 0 && i11 <= this.keys[i12 - 1]) {
            put(i11, e11);
            return;
        }
        if (this.garbage && i12 >= this.keys.length) {
            SparseArrayCompatKt.gc(this);
        }
        int i13 = this.size;
        if (i13 >= this.keys.length) {
            int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i13 + 1);
            int[] copyOf = Arrays.copyOf(this.keys, idealIntArraySize);
            g0.o(copyOf, "copyOf(...)");
            this.keys = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.values, idealIntArraySize);
            g0.o(copyOf2, "copyOf(...)");
            this.values = copyOf2;
        }
        this.keys[i13] = i11;
        this.values[i13] = e11;
        this.size = i13 + 1;
    }

    public void clear() {
        int i11 = this.size;
        Object[] objArr = this.values;
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = null;
        }
        this.size = 0;
        this.garbage = false;
    }

    public boolean containsKey(int i11) {
        return indexOfKey(i11) >= 0;
    }

    public boolean containsValue(E e11) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        int i11 = this.size;
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                i12 = -1;
                break;
            }
            if (this.values[i12] == e11) {
                break;
            }
            i12++;
        }
        return i12 >= 0;
    }

    @n(message = "Alias for remove(int).", replaceWith = @w0(expression = "remove(key)", imports = {}))
    public void delete(int i11) {
        remove(i11);
    }

    @l
    public E get(int i11) {
        return (E) SparseArrayCompatKt.commonGet(this, i11);
    }

    @j(name = "getIsEmpty")
    public final boolean getIsEmpty() {
        return isEmpty();
    }

    public int indexOfKey(int i11) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        return ContainerHelpersKt.binarySearch(this.keys, this.size, i11);
    }

    public int indexOfValue(E e11) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        int i11 = this.size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.values[i12] == e11) {
                return i12;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int keyAt(int i11) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        return this.keys[i11];
    }

    public void put(int i11, E e11) {
        int binarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, i11);
        if (binarySearch >= 0) {
            this.values[binarySearch] = e11;
            return;
        }
        int i12 = ~binarySearch;
        if (i12 < this.size && this.values[i12] == SparseArrayCompatKt.DELETED) {
            this.keys[i12] = i11;
            this.values[i12] = e11;
            return;
        }
        if (this.garbage && this.size >= this.keys.length) {
            SparseArrayCompatKt.gc(this);
            i12 = ~ContainerHelpersKt.binarySearch(this.keys, this.size, i11);
        }
        int i13 = this.size;
        if (i13 >= this.keys.length) {
            int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i13 + 1);
            int[] copyOf = Arrays.copyOf(this.keys, idealIntArraySize);
            g0.o(copyOf, "copyOf(...)");
            this.keys = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.values, idealIntArraySize);
            g0.o(copyOf2, "copyOf(...)");
            this.values = copyOf2;
        }
        int i14 = this.size;
        if (i14 - i12 != 0) {
            int[] iArr = this.keys;
            int i15 = i12 + 1;
            q.z0(iArr, iArr, i15, i12, i14);
            Object[] objArr = this.values;
            q.B0(objArr, objArr, i15, i12, this.size);
        }
        this.keys[i12] = i11;
        this.values[i12] = e11;
        this.size++;
    }

    public void putAll(@m80.k SparseArrayCompat<? extends E> other) {
        g0.p(other, "other");
        int size = other.size();
        for (int i11 = 0; i11 < size; i11++) {
            int keyAt = other.keyAt(i11);
            E valueAt = other.valueAt(i11);
            int binarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, keyAt);
            if (binarySearch >= 0) {
                this.values[binarySearch] = valueAt;
            } else {
                int i12 = ~binarySearch;
                if (i12 >= this.size || this.values[i12] != SparseArrayCompatKt.DELETED) {
                    if (this.garbage && this.size >= this.keys.length) {
                        SparseArrayCompatKt.gc(this);
                        i12 = ~ContainerHelpersKt.binarySearch(this.keys, this.size, keyAt);
                    }
                    int i13 = this.size;
                    if (i13 >= this.keys.length) {
                        int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i13 + 1);
                        int[] copyOf = Arrays.copyOf(this.keys, idealIntArraySize);
                        g0.o(copyOf, "copyOf(...)");
                        this.keys = copyOf;
                        Object[] copyOf2 = Arrays.copyOf(this.values, idealIntArraySize);
                        g0.o(copyOf2, "copyOf(...)");
                        this.values = copyOf2;
                    }
                    int i14 = this.size;
                    if (i14 - i12 != 0) {
                        int[] iArr = this.keys;
                        int i15 = i12 + 1;
                        q.z0(iArr, iArr, i15, i12, i14);
                        Object[] objArr = this.values;
                        q.B0(objArr, objArr, i15, i12, this.size);
                    }
                    this.keys[i12] = keyAt;
                    this.values[i12] = valueAt;
                    this.size++;
                } else {
                    this.keys[i12] = keyAt;
                    this.values[i12] = valueAt;
                }
            }
        }
    }

    @l
    public E putIfAbsent(int i11, E e11) {
        E e12 = (E) SparseArrayCompatKt.commonGet(this, i11);
        if (e12 == null) {
            int binarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, i11);
            if (binarySearch >= 0) {
                this.values[binarySearch] = e11;
                return e12;
            }
            int i12 = ~binarySearch;
            if (i12 < this.size && this.values[i12] == SparseArrayCompatKt.DELETED) {
                this.keys[i12] = i11;
                this.values[i12] = e11;
                return e12;
            }
            if (this.garbage && this.size >= this.keys.length) {
                SparseArrayCompatKt.gc(this);
                i12 = ~ContainerHelpersKt.binarySearch(this.keys, this.size, i11);
            }
            int i13 = this.size;
            if (i13 >= this.keys.length) {
                int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i13 + 1);
                int[] copyOf = Arrays.copyOf(this.keys, idealIntArraySize);
                g0.o(copyOf, "copyOf(...)");
                this.keys = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.values, idealIntArraySize);
                g0.o(copyOf2, "copyOf(...)");
                this.values = copyOf2;
            }
            int i14 = this.size;
            if (i14 - i12 != 0) {
                int[] iArr = this.keys;
                int i15 = i12 + 1;
                q.z0(iArr, iArr, i15, i12, i14);
                Object[] objArr = this.values;
                q.B0(objArr, objArr, i15, i12, this.size);
            }
            this.keys[i12] = i11;
            this.values[i12] = e11;
            this.size++;
        }
        return e12;
    }

    public void remove(int i11) {
        SparseArrayCompatKt.commonRemove(this, i11);
    }

    public void removeAt(int i11) {
        if (this.values[i11] != SparseArrayCompatKt.DELETED) {
            this.values[i11] = SparseArrayCompatKt.DELETED;
            this.garbage = true;
        }
    }

    public void removeAtRange(int i11, int i12) {
        int min = Math.min(i12, i11 + i12);
        while (i11 < min) {
            removeAt(i11);
            i11++;
        }
    }

    @l
    public E replace(int i11, E e11) {
        int indexOfKey = indexOfKey(i11);
        if (indexOfKey < 0) {
            return null;
        }
        Object[] objArr = this.values;
        E e12 = (E) objArr[indexOfKey];
        objArr[indexOfKey] = e11;
        return e12;
    }

    public void setValueAt(int i11, E e11) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        this.values[i11] = e11;
    }

    public int size() {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        return this.size;
    }

    @m80.k
    public String toString() {
        if (size() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.size * 28);
        sb2.append(b.f69927i);
        int i11 = this.size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(j2.O);
            }
            sb2.append(keyAt(i12));
            sb2.append('=');
            E valueAt = valueAt(i12);
            if (valueAt != this) {
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

    public E valueAt(int i11) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        Object[] objArr = this.values;
        if (i11 < objArr.length) {
            return (E) objArr[i11];
        }
        CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
        throw new ArrayIndexOutOfBoundsException();
    }

    @k
    public SparseArrayCompat(int i11) {
        if (i11 == 0) {
            this.keys = ContainerHelpersKt.EMPTY_INTS;
            this.values = ContainerHelpersKt.EMPTY_OBJECTS;
        } else {
            int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i11);
            this.keys = new int[idealIntArraySize];
            this.values = new Object[idealIntArraySize];
        }
    }

    @m80.k
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public SparseArrayCompat<E> m27clone() {
        Object clone = super.clone();
        g0.n(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        SparseArrayCompat<E> sparseArrayCompat = (SparseArrayCompat) clone;
        sparseArrayCompat.keys = (int[]) this.keys.clone();
        sparseArrayCompat.values = (Object[]) this.values.clone();
        return sparseArrayCompat;
    }

    public E get(int i11, E e11) {
        return (E) SparseArrayCompatKt.commonGet(this, i11, e11);
    }

    public boolean remove(int i11, @l Object obj) {
        int indexOfKey = indexOfKey(i11);
        if (indexOfKey < 0 || !g0.g(obj, valueAt(indexOfKey))) {
            return false;
        }
        removeAt(indexOfKey);
        return true;
    }

    public boolean replace(int i11, E e11, E e12) {
        int indexOfKey = indexOfKey(i11);
        if (indexOfKey < 0 || !g0.g(this.values[indexOfKey], e11)) {
            return false;
        }
        this.values[indexOfKey] = e12;
        return true;
    }

    public /* synthetic */ SparseArrayCompat(int i11, int i12, v vVar) {
        this((i12 & 1) != 0 ? 10 : i11);
    }
}
