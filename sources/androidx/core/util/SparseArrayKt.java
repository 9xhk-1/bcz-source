package androidx.core.util;

import a00.d1;
import android.util.SparseArray;
import java.util.Iterator;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSparseArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArray.kt\nandroidx/core/util/SparseArrayKt\n*L\n1#1,94:1\n76#1,4:95\n*S KotlinDebug\n*F\n+ 1 SparseArray.kt\nandroidx/core/util/SparseArrayKt\n*L\n72#1:95,4\n*E\n"})
/* loaded from: classes2.dex */
public final class SparseArrayKt {
    public static final <T> boolean contains(@k SparseArray<T> sparseArray, int i11) {
        return sparseArray.indexOfKey(i11) >= 0;
    }

    public static final <T> boolean containsKey(@k SparseArray<T> sparseArray, int i11) {
        return sparseArray.indexOfKey(i11) >= 0;
    }

    public static final <T> boolean containsValue(@k SparseArray<T> sparseArray, T t11) {
        return sparseArray.indexOfValue(t11) >= 0;
    }

    public static final <T> void forEach(@k SparseArray<T> sparseArray, @k p<? super Integer, ? super T, g2> pVar) {
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            pVar.invoke(Integer.valueOf(sparseArray.keyAt(i11)), sparseArray.valueAt(i11));
        }
    }

    public static final <T> T getOrDefault(@k SparseArray<T> sparseArray, int i11, T t11) {
        T t12 = sparseArray.get(i11);
        return t12 == null ? t11 : t12;
    }

    public static final <T> T getOrElse(@k SparseArray<T> sparseArray, int i11, @k x00.a<? extends T> aVar) {
        T t11 = sparseArray.get(i11);
        return t11 == null ? aVar.invoke() : t11;
    }

    public static final <T> int getSize(@k SparseArray<T> sparseArray) {
        return sparseArray.size();
    }

    public static final <T> boolean isEmpty(@k SparseArray<T> sparseArray) {
        return sparseArray.size() == 0;
    }

    public static final <T> boolean isNotEmpty(@k SparseArray<T> sparseArray) {
        return sparseArray.size() != 0;
    }

    @k
    public static final <T> d1 keyIterator(@k final SparseArray<T> sparseArray) {
        return new d1() { // from class: androidx.core.util.SparseArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseArray.size();
            }

            @Override // a00.d1
            public int nextInt() {
                SparseArray<T> sparseArray2 = sparseArray;
                int i11 = this.index;
                this.index = i11 + 1;
                return sparseArray2.keyAt(i11);
            }

            public final void setIndex(int i11) {
                this.index = i11;
            }
        };
    }

    @k
    public static final <T> SparseArray<T> plus(@k SparseArray<T> sparseArray, @k SparseArray<T> sparseArray2) {
        SparseArray<T> sparseArray3 = new SparseArray<>(sparseArray.size() + sparseArray2.size());
        putAll(sparseArray3, sparseArray);
        putAll(sparseArray3, sparseArray2);
        return sparseArray3;
    }

    public static final <T> void putAll(@k SparseArray<T> sparseArray, @k SparseArray<T> sparseArray2) {
        int size = sparseArray2.size();
        for (int i11 = 0; i11 < size; i11++) {
            sparseArray.put(sparseArray2.keyAt(i11), sparseArray2.valueAt(i11));
        }
    }

    public static final <T> boolean remove(@k SparseArray<T> sparseArray, int i11, T t11) {
        int indexOfKey = sparseArray.indexOfKey(i11);
        if (indexOfKey < 0 || !g0.g(t11, sparseArray.valueAt(indexOfKey))) {
            return false;
        }
        sparseArray.removeAt(indexOfKey);
        return true;
    }

    public static final <T> void set(@k SparseArray<T> sparseArray, int i11, T t11) {
        sparseArray.put(i11, t11);
    }

    @k
    public static final <T> Iterator<T> valueIterator(@k SparseArray<T> sparseArray) {
        return new SparseArrayKt$valueIterator$1(sparseArray);
    }
}
