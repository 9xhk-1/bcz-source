package androidx.core.util;

import a00.e1;
import android.util.LongSparseArray;
import java.util.Iterator;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLongSparseArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSparseArray.kt\nandroidx/core/util/LongSparseArrayKt\n*L\n1#1,99:1\n77#1,4:100\n*S KotlinDebug\n*F\n+ 1 LongSparseArray.kt\nandroidx/core/util/LongSparseArrayKt\n*L\n73#1:100,4\n*E\n"})
/* loaded from: classes2.dex */
public final class LongSparseArrayKt {
    public static final <T> boolean contains(@k LongSparseArray<T> longSparseArray, long j11) {
        return longSparseArray.indexOfKey(j11) >= 0;
    }

    public static final <T> boolean containsKey(@k LongSparseArray<T> longSparseArray, long j11) {
        return longSparseArray.indexOfKey(j11) >= 0;
    }

    public static final <T> boolean containsValue(@k LongSparseArray<T> longSparseArray, T t11) {
        return longSparseArray.indexOfValue(t11) >= 0;
    }

    public static final <T> void forEach(@k LongSparseArray<T> longSparseArray, @k p<? super Long, ? super T, g2> pVar) {
        int size = longSparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            pVar.invoke(Long.valueOf(longSparseArray.keyAt(i11)), longSparseArray.valueAt(i11));
        }
    }

    public static final <T> T getOrDefault(@k LongSparseArray<T> longSparseArray, long j11, T t11) {
        T t12 = longSparseArray.get(j11);
        return t12 == null ? t11 : t12;
    }

    public static final <T> T getOrElse(@k LongSparseArray<T> longSparseArray, long j11, @k x00.a<? extends T> aVar) {
        T t11 = longSparseArray.get(j11);
        return t11 == null ? aVar.invoke() : t11;
    }

    public static final <T> int getSize(@k LongSparseArray<T> longSparseArray) {
        return longSparseArray.size();
    }

    public static final <T> boolean isEmpty(@k LongSparseArray<T> longSparseArray) {
        return longSparseArray.size() == 0;
    }

    public static final <T> boolean isNotEmpty(@k LongSparseArray<T> longSparseArray) {
        return longSparseArray.size() != 0;
    }

    @k
    public static final <T> e1 keyIterator(@k final LongSparseArray<T> longSparseArray) {
        return new e1() { // from class: androidx.core.util.LongSparseArrayKt$keyIterator$1
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
    public static final <T> LongSparseArray<T> plus(@k LongSparseArray<T> longSparseArray, @k LongSparseArray<T> longSparseArray2) {
        LongSparseArray<T> longSparseArray3 = new LongSparseArray<>(longSparseArray.size() + longSparseArray2.size());
        putAll(longSparseArray3, longSparseArray);
        putAll(longSparseArray3, longSparseArray2);
        return longSparseArray3;
    }

    public static final <T> void putAll(@k LongSparseArray<T> longSparseArray, @k LongSparseArray<T> longSparseArray2) {
        int size = longSparseArray2.size();
        for (int i11 = 0; i11 < size; i11++) {
            longSparseArray.put(longSparseArray2.keyAt(i11), longSparseArray2.valueAt(i11));
        }
    }

    public static final <T> boolean remove(@k LongSparseArray<T> longSparseArray, long j11, T t11) {
        int indexOfKey = longSparseArray.indexOfKey(j11);
        if (indexOfKey < 0 || !g0.g(t11, longSparseArray.valueAt(indexOfKey))) {
            return false;
        }
        longSparseArray.removeAt(indexOfKey);
        return true;
    }

    public static final <T> void set(@k LongSparseArray<T> longSparseArray, long j11, T t11) {
        longSparseArray.put(j11, t11);
    }

    @k
    public static final <T> Iterator<T> valueIterator(@k LongSparseArray<T> longSparseArray) {
        return new LongSparseArrayKt$valueIterator$1(longSparseArray);
    }
}
