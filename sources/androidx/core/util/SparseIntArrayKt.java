package androidx.core.util;

import a00.d1;
import android.util.SparseIntArray;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSparseIntArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseIntArray.kt\nandroidx/core/util/SparseIntArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n75#1,4:95\n1#2:94\n*S KotlinDebug\n*F\n+ 1 SparseIntArray.kt\nandroidx/core/util/SparseIntArrayKt\n*L\n71#1:95,4\n*E\n"})
/* loaded from: classes2.dex */
public final class SparseIntArrayKt {
    public static final boolean contains(@k SparseIntArray sparseIntArray, int i11) {
        return sparseIntArray.indexOfKey(i11) >= 0;
    }

    public static final boolean containsKey(@k SparseIntArray sparseIntArray, int i11) {
        return sparseIntArray.indexOfKey(i11) >= 0;
    }

    public static final boolean containsValue(@k SparseIntArray sparseIntArray, int i11) {
        return sparseIntArray.indexOfValue(i11) >= 0;
    }

    public static final void forEach(@k SparseIntArray sparseIntArray, @k p<? super Integer, ? super Integer, g2> pVar) {
        int size = sparseIntArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            pVar.invoke(Integer.valueOf(sparseIntArray.keyAt(i11)), Integer.valueOf(sparseIntArray.valueAt(i11)));
        }
    }

    public static final int getOrDefault(@k SparseIntArray sparseIntArray, int i11, int i12) {
        return sparseIntArray.get(i11, i12);
    }

    public static final int getOrElse(@k SparseIntArray sparseIntArray, int i11, @k x00.a<Integer> aVar) {
        int indexOfKey = sparseIntArray.indexOfKey(i11);
        return indexOfKey >= 0 ? sparseIntArray.valueAt(indexOfKey) : aVar.invoke().intValue();
    }

    public static final int getSize(@k SparseIntArray sparseIntArray) {
        return sparseIntArray.size();
    }

    public static final boolean isEmpty(@k SparseIntArray sparseIntArray) {
        return sparseIntArray.size() == 0;
    }

    public static final boolean isNotEmpty(@k SparseIntArray sparseIntArray) {
        return sparseIntArray.size() != 0;
    }

    @k
    public static final d1 keyIterator(@k final SparseIntArray sparseIntArray) {
        return new d1() { // from class: androidx.core.util.SparseIntArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseIntArray.size();
            }

            @Override // a00.d1
            public int nextInt() {
                SparseIntArray sparseIntArray2 = sparseIntArray;
                int i11 = this.index;
                this.index = i11 + 1;
                return sparseIntArray2.keyAt(i11);
            }

            public final void setIndex(int i11) {
                this.index = i11;
            }
        };
    }

    @k
    public static final SparseIntArray plus(@k SparseIntArray sparseIntArray, @k SparseIntArray sparseIntArray2) {
        SparseIntArray sparseIntArray3 = new SparseIntArray(sparseIntArray.size() + sparseIntArray2.size());
        putAll(sparseIntArray3, sparseIntArray);
        putAll(sparseIntArray3, sparseIntArray2);
        return sparseIntArray3;
    }

    public static final void putAll(@k SparseIntArray sparseIntArray, @k SparseIntArray sparseIntArray2) {
        int size = sparseIntArray2.size();
        for (int i11 = 0; i11 < size; i11++) {
            sparseIntArray.put(sparseIntArray2.keyAt(i11), sparseIntArray2.valueAt(i11));
        }
    }

    public static final boolean remove(@k SparseIntArray sparseIntArray, int i11, int i12) {
        int indexOfKey = sparseIntArray.indexOfKey(i11);
        if (indexOfKey < 0 || i12 != sparseIntArray.valueAt(indexOfKey)) {
            return false;
        }
        sparseIntArray.removeAt(indexOfKey);
        return true;
    }

    public static final void set(@k SparseIntArray sparseIntArray, int i11, int i12) {
        sparseIntArray.put(i11, i12);
    }

    @k
    public static final d1 valueIterator(@k final SparseIntArray sparseIntArray) {
        return new d1() { // from class: androidx.core.util.SparseIntArrayKt$valueIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseIntArray.size();
            }

            @Override // a00.d1
            public int nextInt() {
                SparseIntArray sparseIntArray2 = sparseIntArray;
                int i11 = this.index;
                this.index = i11 + 1;
                return sparseIntArray2.valueAt(i11);
            }

            public final void setIndex(int i11) {
                this.index = i11;
            }
        };
    }
}
