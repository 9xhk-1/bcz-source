package androidx.core.util;

import a00.d1;
import a00.e1;
import android.util.SparseLongArray;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSparseLongArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseLongArray.kt\nandroidx/core/util/SparseLongArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n75#1,4:95\n1#2:94\n*S KotlinDebug\n*F\n+ 1 SparseLongArray.kt\nandroidx/core/util/SparseLongArrayKt\n*L\n71#1:95,4\n*E\n"})
/* loaded from: classes2.dex */
public final class SparseLongArrayKt {
    public static final boolean contains(@k SparseLongArray sparseLongArray, int i11) {
        return sparseLongArray.indexOfKey(i11) >= 0;
    }

    public static final boolean containsKey(@k SparseLongArray sparseLongArray, int i11) {
        return sparseLongArray.indexOfKey(i11) >= 0;
    }

    public static final boolean containsValue(@k SparseLongArray sparseLongArray, long j11) {
        return sparseLongArray.indexOfValue(j11) >= 0;
    }

    public static final void forEach(@k SparseLongArray sparseLongArray, @k p<? super Integer, ? super Long, g2> pVar) {
        int size = sparseLongArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            pVar.invoke(Integer.valueOf(sparseLongArray.keyAt(i11)), Long.valueOf(sparseLongArray.valueAt(i11)));
        }
    }

    public static final long getOrDefault(@k SparseLongArray sparseLongArray, int i11, long j11) {
        return sparseLongArray.get(i11, j11);
    }

    public static final long getOrElse(@k SparseLongArray sparseLongArray, int i11, @k x00.a<Long> aVar) {
        int indexOfKey = sparseLongArray.indexOfKey(i11);
        return indexOfKey >= 0 ? sparseLongArray.valueAt(indexOfKey) : aVar.invoke().longValue();
    }

    public static final int getSize(@k SparseLongArray sparseLongArray) {
        return sparseLongArray.size();
    }

    public static final boolean isEmpty(@k SparseLongArray sparseLongArray) {
        return sparseLongArray.size() == 0;
    }

    public static final boolean isNotEmpty(@k SparseLongArray sparseLongArray) {
        return sparseLongArray.size() != 0;
    }

    @k
    public static final d1 keyIterator(@k final SparseLongArray sparseLongArray) {
        return new d1() { // from class: androidx.core.util.SparseLongArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseLongArray.size();
            }

            @Override // a00.d1
            public int nextInt() {
                SparseLongArray sparseLongArray2 = sparseLongArray;
                int i11 = this.index;
                this.index = i11 + 1;
                return sparseLongArray2.keyAt(i11);
            }

            public final void setIndex(int i11) {
                this.index = i11;
            }
        };
    }

    @k
    public static final SparseLongArray plus(@k SparseLongArray sparseLongArray, @k SparseLongArray sparseLongArray2) {
        SparseLongArray sparseLongArray3 = new SparseLongArray(sparseLongArray.size() + sparseLongArray2.size());
        putAll(sparseLongArray3, sparseLongArray);
        putAll(sparseLongArray3, sparseLongArray2);
        return sparseLongArray3;
    }

    public static final void putAll(@k SparseLongArray sparseLongArray, @k SparseLongArray sparseLongArray2) {
        int size = sparseLongArray2.size();
        for (int i11 = 0; i11 < size; i11++) {
            sparseLongArray.put(sparseLongArray2.keyAt(i11), sparseLongArray2.valueAt(i11));
        }
    }

    public static final boolean remove(@k SparseLongArray sparseLongArray, int i11, long j11) {
        int indexOfKey = sparseLongArray.indexOfKey(i11);
        if (indexOfKey < 0 || j11 != sparseLongArray.valueAt(indexOfKey)) {
            return false;
        }
        sparseLongArray.removeAt(indexOfKey);
        return true;
    }

    public static final void set(@k SparseLongArray sparseLongArray, int i11, long j11) {
        sparseLongArray.put(i11, j11);
    }

    @k
    public static final e1 valueIterator(@k final SparseLongArray sparseLongArray) {
        return new e1() { // from class: androidx.core.util.SparseLongArrayKt$valueIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseLongArray.size();
            }

            @Override // a00.e1
            public long nextLong() {
                SparseLongArray sparseLongArray2 = sparseLongArray;
                int i11 = this.index;
                this.index = i11 + 1;
                return sparseLongArray2.valueAt(i11);
            }

            public final void setIndex(int i11) {
                this.index = i11;
            }
        };
    }
}
