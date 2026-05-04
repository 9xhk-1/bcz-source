package androidx.collection;

import a00.q;
import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Arrays;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import l50.b;
import m80.l;
import org.junit.jupiter.api.j2;
import w00.g;
import w00.k;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLongSparseArray.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSparseArray.jvm.kt\nandroidx/collection/LongSparseArray\n+ 2 LongSparseArray.kt\nandroidx/collection/LongSparseArrayKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n*L\n1#1,243:1\n218#2:244\n229#2,5:245\n223#2,11:250\n239#2,8:261\n239#2,8:269\n250#2,9:277\n263#2,5:286\n271#2,7:291\n286#2,9:298\n320#2,12:307\n299#2,18:319\n334#2,21:337\n358#2,2:358\n360#2:361\n364#2,5:362\n373#2,2:367\n299#2,18:369\n376#2:387\n380#2:388\n384#2:389\n385#2:393\n388#2,2:395\n299#2,18:397\n391#2:415\n396#2:416\n397#2:420\n400#2,2:422\n299#2,18:424\n404#2:442\n409#2:443\n410#2:447\n413#2,2:449\n299#2,18:451\n416#2,2:469\n421#2,2:471\n299#2,18:473\n424#2:491\n429#2,2:492\n299#2,18:494\n432#2,6:512\n442#2:518\n447#2:519\n452#2,8:520\n463#2,6:528\n299#2,18:534\n470#2,10:552\n483#2,21:562\n1#3:360\n59#4,3:390\n63#4:394\n59#4,3:417\n63#4:421\n59#4,3:444\n63#4:448\n*S KotlinDebug\n*F\n+ 1 LongSparseArray.jvm.kt\nandroidx/collection/LongSparseArray\n*L\n92#1:244\n92#1:245,5\n99#1:250,11\n103#1:261,8\n106#1:269,8\n115#1:277,9\n118#1:286,5\n127#1:291,7\n138#1:298,9\n144#1:307,12\n144#1:319,18\n144#1:337,21\n150#1:358,2\n150#1:361\n161#1:362,5\n164#1:367,2\n164#1:369,18\n164#1:387\n171#1:388\n183#1:389\n183#1:393\n183#1:395,2\n183#1:397,18\n183#1:415\n195#1:416\n195#1:420\n195#1:422,2\n195#1:424,18\n195#1:442\n203#1:443\n203#1:447\n203#1:449,2\n203#1:451,18\n203#1:469,2\n209#1:471,2\n209#1:473,18\n209#1:491\n218#1:492,2\n218#1:494,18\n218#1:512,6\n221#1:518\n224#1:519\n227#1:520,8\n233#1:528,6\n233#1:534,18\n233#1:552,10\n241#1:562,21\n150#1:360\n183#1:390,3\n183#1:394\n195#1:417,3\n195#1:421\n203#1:444,3\n203#1:448\n*E\n"})
/* loaded from: classes.dex */
public class LongSparseArray<E> implements Cloneable {

    @g
    public /* synthetic */ boolean garbage;

    @g
    public /* synthetic */ long[] keys;

    @g
    public /* synthetic */ int size;

    @g
    public /* synthetic */ Object[] values;

    @k
    public LongSparseArray() {
        this(0, 1, null);
    }

    public void append(long j11, E e11) {
        int i11 = this.size;
        if (i11 != 0 && j11 <= this.keys[i11 - 1]) {
            put(j11, e11);
            return;
        }
        if (this.garbage) {
            long[] jArr = this.keys;
            if (i11 >= jArr.length) {
                Object[] objArr = this.values;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj = objArr[i13];
                    if (obj != LongSparseArrayKt.DELETED) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr[i12] = obj;
                            objArr[i13] = null;
                        }
                        i12++;
                    }
                }
                this.garbage = false;
                this.size = i12;
            }
        }
        int i14 = this.size;
        if (i14 >= this.keys.length) {
            int idealLongArraySize = ContainerHelpersKt.idealLongArraySize(i14 + 1);
            long[] copyOf = Arrays.copyOf(this.keys, idealLongArraySize);
            g0.o(copyOf, "copyOf(...)");
            this.keys = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.values, idealLongArraySize);
            g0.o(copyOf2, "copyOf(...)");
            this.values = copyOf2;
        }
        this.keys[i14] = j11;
        this.values[i14] = e11;
        this.size = i14 + 1;
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

    public boolean containsKey(long j11) {
        return indexOfKey(j11) >= 0;
    }

    public boolean containsValue(E e11) {
        return indexOfValue(e11) >= 0;
    }

    @n(message = "Alias for `remove(key)`.", replaceWith = @w0(expression = "remove(key)", imports = {}))
    public void delete(long j11) {
        int binarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, j11);
        if (binarySearch < 0 || this.values[binarySearch] == LongSparseArrayKt.DELETED) {
            return;
        }
        this.values[binarySearch] = LongSparseArrayKt.DELETED;
        this.garbage = true;
    }

    @l
    public E get(long j11) {
        int binarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, j11);
        if (binarySearch < 0 || this.values[binarySearch] == LongSparseArrayKt.DELETED) {
            return null;
        }
        return (E) this.values[binarySearch];
    }

    public int indexOfKey(long j11) {
        if (this.garbage) {
            int i11 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != LongSparseArrayKt.DELETED) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.garbage = false;
            this.size = i12;
        }
        return ContainerHelpersKt.binarySearch(this.keys, this.size, j11);
    }

    public int indexOfValue(E e11) {
        if (this.garbage) {
            int i11 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != LongSparseArrayKt.DELETED) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.garbage = false;
            this.size = i12;
        }
        int i14 = this.size;
        for (int i15 = 0; i15 < i14; i15++) {
            if (this.values[i15] == e11) {
                return i15;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public long keyAt(int i11) {
        if (!(i11 >= 0 && i11 < this.size)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i11);
        }
        if (this.garbage) {
            int i12 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                Object obj = objArr[i14];
                if (obj != LongSparseArrayKt.DELETED) {
                    if (i14 != i13) {
                        jArr[i13] = jArr[i14];
                        objArr[i13] = obj;
                        objArr[i14] = null;
                    }
                    i13++;
                }
            }
            this.garbage = false;
            this.size = i13;
        }
        return this.keys[i11];
    }

    public void put(long j11, E e11) {
        int binarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, j11);
        if (binarySearch >= 0) {
            this.values[binarySearch] = e11;
            return;
        }
        int i11 = ~binarySearch;
        if (i11 < this.size && this.values[i11] == LongSparseArrayKt.DELETED) {
            this.keys[i11] = j11;
            this.values[i11] = e11;
            return;
        }
        if (this.garbage) {
            int i12 = this.size;
            long[] jArr = this.keys;
            if (i12 >= jArr.length) {
                Object[] objArr = this.values;
                int i13 = 0;
                for (int i14 = 0; i14 < i12; i14++) {
                    Object obj = objArr[i14];
                    if (obj != LongSparseArrayKt.DELETED) {
                        if (i14 != i13) {
                            jArr[i13] = jArr[i14];
                            objArr[i13] = obj;
                            objArr[i14] = null;
                        }
                        i13++;
                    }
                }
                this.garbage = false;
                this.size = i13;
                i11 = ~ContainerHelpersKt.binarySearch(this.keys, i13, j11);
            }
        }
        int i15 = this.size;
        if (i15 >= this.keys.length) {
            int idealLongArraySize = ContainerHelpersKt.idealLongArraySize(i15 + 1);
            long[] copyOf = Arrays.copyOf(this.keys, idealLongArraySize);
            g0.o(copyOf, "copyOf(...)");
            this.keys = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.values, idealLongArraySize);
            g0.o(copyOf2, "copyOf(...)");
            this.values = copyOf2;
        }
        int i16 = this.size;
        if (i16 - i11 != 0) {
            long[] jArr2 = this.keys;
            int i17 = i11 + 1;
            q.A0(jArr2, jArr2, i17, i11, i16);
            Object[] objArr2 = this.values;
            q.B0(objArr2, objArr2, i17, i11, this.size);
        }
        this.keys[i11] = j11;
        this.values[i11] = e11;
        this.size++;
    }

    public void putAll(@m80.k LongSparseArray<? extends E> other) {
        g0.p(other, "other");
        int size = other.size();
        for (int i11 = 0; i11 < size; i11++) {
            put(other.keyAt(i11), other.valueAt(i11));
        }
    }

    @l
    public E putIfAbsent(long j11, E e11) {
        E e12 = get(j11);
        if (e12 == null) {
            put(j11, e11);
        }
        return e12;
    }

    public void remove(long j11) {
        int binarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, j11);
        if (binarySearch < 0 || this.values[binarySearch] == LongSparseArrayKt.DELETED) {
            return;
        }
        this.values[binarySearch] = LongSparseArrayKt.DELETED;
        this.garbage = true;
    }

    public void removeAt(int i11) {
        if (this.values[i11] != LongSparseArrayKt.DELETED) {
            this.values[i11] = LongSparseArrayKt.DELETED;
            this.garbage = true;
        }
    }

    @l
    public E replace(long j11, E e11) {
        int indexOfKey = indexOfKey(j11);
        if (indexOfKey < 0) {
            return null;
        }
        Object[] objArr = this.values;
        E e12 = (E) objArr[indexOfKey];
        objArr[indexOfKey] = e11;
        return e12;
    }

    public void setValueAt(int i11, E e11) {
        if (!(i11 >= 0 && i11 < this.size)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i11);
        }
        if (this.garbage) {
            int i12 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                Object obj = objArr[i14];
                if (obj != LongSparseArrayKt.DELETED) {
                    if (i14 != i13) {
                        jArr[i13] = jArr[i14];
                        objArr[i13] = obj;
                        objArr[i14] = null;
                    }
                    i13++;
                }
            }
            this.garbage = false;
            this.size = i13;
        }
        this.values[i11] = e11;
    }

    public int size() {
        if (this.garbage) {
            int i11 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != LongSparseArrayKt.DELETED) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.garbage = false;
            this.size = i12;
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

    public E valueAt(int i11) {
        if (!(i11 >= 0 && i11 < this.size)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i11);
        }
        if (this.garbage) {
            int i12 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                Object obj = objArr[i14];
                if (obj != LongSparseArrayKt.DELETED) {
                    if (i14 != i13) {
                        jArr[i13] = jArr[i14];
                        objArr[i13] = obj;
                        objArr[i14] = null;
                    }
                    i13++;
                }
            }
            this.garbage = false;
            this.size = i13;
        }
        return (E) this.values[i11];
    }

    @k
    public LongSparseArray(int i11) {
        if (i11 == 0) {
            this.keys = ContainerHelpersKt.EMPTY_LONGS;
            this.values = ContainerHelpersKt.EMPTY_OBJECTS;
        } else {
            int idealLongArraySize = ContainerHelpersKt.idealLongArraySize(i11);
            this.keys = new long[idealLongArraySize];
            this.values = new Object[idealLongArraySize];
        }
    }

    @m80.k
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public LongSparseArray<E> m26clone() {
        Object clone = super.clone();
        g0.n(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        LongSparseArray<E> longSparseArray = (LongSparseArray) clone;
        longSparseArray.keys = (long[]) this.keys.clone();
        longSparseArray.values = (Object[]) this.values.clone();
        return longSparseArray;
    }

    public E get(long j11, E e11) {
        int binarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, j11);
        return (binarySearch < 0 || this.values[binarySearch] == LongSparseArrayKt.DELETED) ? e11 : (E) this.values[binarySearch];
    }

    public boolean replace(long j11, E e11, E e12) {
        int indexOfKey = indexOfKey(j11);
        if (indexOfKey < 0 || !g0.g(this.values[indexOfKey], e11)) {
            return false;
        }
        this.values[indexOfKey] = e12;
        return true;
    }

    public boolean remove(long j11, E e11) {
        int indexOfKey = indexOfKey(j11);
        if (indexOfKey < 0 || !g0.g(e11, valueAt(indexOfKey))) {
            return false;
        }
        removeAt(indexOfKey);
        return true;
    }

    public /* synthetic */ LongSparseArray(int i11, int i12, v vVar) {
        this((i12 & 1) != 0 ? 10 : i11);
    }
}
