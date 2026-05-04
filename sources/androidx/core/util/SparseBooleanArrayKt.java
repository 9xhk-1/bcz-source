package androidx.core.util;

import a00.c0;
import a00.d1;
import android.util.SparseBooleanArray;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSparseBooleanArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseBooleanArray.kt\nandroidx/core/util/SparseBooleanArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n77#1,4:97\n1#2:96\n*S KotlinDebug\n*F\n+ 1 SparseBooleanArray.kt\nandroidx/core/util/SparseBooleanArrayKt\n*L\n73#1:97,4\n*E\n"})
/* loaded from: classes2.dex */
public final class SparseBooleanArrayKt {
    public static final boolean contains(@k SparseBooleanArray sparseBooleanArray, int i11) {
        return sparseBooleanArray.indexOfKey(i11) >= 0;
    }

    public static final boolean containsKey(@k SparseBooleanArray sparseBooleanArray, int i11) {
        return sparseBooleanArray.indexOfKey(i11) >= 0;
    }

    public static final boolean containsValue(@k SparseBooleanArray sparseBooleanArray, boolean z11) {
        return sparseBooleanArray.indexOfValue(z11) >= 0;
    }

    public static final void forEach(@k SparseBooleanArray sparseBooleanArray, @k p<? super Integer, ? super Boolean, g2> pVar) {
        int size = sparseBooleanArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            pVar.invoke(Integer.valueOf(sparseBooleanArray.keyAt(i11)), Boolean.valueOf(sparseBooleanArray.valueAt(i11)));
        }
    }

    public static final boolean getOrDefault(@k SparseBooleanArray sparseBooleanArray, int i11, boolean z11) {
        return sparseBooleanArray.get(i11, z11);
    }

    public static final boolean getOrElse(@k SparseBooleanArray sparseBooleanArray, int i11, @k x00.a<Boolean> aVar) {
        int indexOfKey = sparseBooleanArray.indexOfKey(i11);
        return indexOfKey >= 0 ? sparseBooleanArray.valueAt(indexOfKey) : aVar.invoke().booleanValue();
    }

    public static final int getSize(@k SparseBooleanArray sparseBooleanArray) {
        return sparseBooleanArray.size();
    }

    public static final boolean isEmpty(@k SparseBooleanArray sparseBooleanArray) {
        return sparseBooleanArray.size() == 0;
    }

    public static final boolean isNotEmpty(@k SparseBooleanArray sparseBooleanArray) {
        return sparseBooleanArray.size() != 0;
    }

    @k
    public static final d1 keyIterator(@k final SparseBooleanArray sparseBooleanArray) {
        return new d1() { // from class: androidx.core.util.SparseBooleanArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseBooleanArray.size();
            }

            @Override // a00.d1
            public int nextInt() {
                SparseBooleanArray sparseBooleanArray2 = sparseBooleanArray;
                int i11 = this.index;
                this.index = i11 + 1;
                return sparseBooleanArray2.keyAt(i11);
            }

            public final void setIndex(int i11) {
                this.index = i11;
            }
        };
    }

    @k
    public static final SparseBooleanArray plus(@k SparseBooleanArray sparseBooleanArray, @k SparseBooleanArray sparseBooleanArray2) {
        SparseBooleanArray sparseBooleanArray3 = new SparseBooleanArray(sparseBooleanArray.size() + sparseBooleanArray2.size());
        putAll(sparseBooleanArray3, sparseBooleanArray);
        putAll(sparseBooleanArray3, sparseBooleanArray2);
        return sparseBooleanArray3;
    }

    public static final void putAll(@k SparseBooleanArray sparseBooleanArray, @k SparseBooleanArray sparseBooleanArray2) {
        int size = sparseBooleanArray2.size();
        for (int i11 = 0; i11 < size; i11++) {
            sparseBooleanArray.put(sparseBooleanArray2.keyAt(i11), sparseBooleanArray2.valueAt(i11));
        }
    }

    public static final boolean remove(@k SparseBooleanArray sparseBooleanArray, int i11, boolean z11) {
        int indexOfKey = sparseBooleanArray.indexOfKey(i11);
        if (indexOfKey < 0 || z11 != sparseBooleanArray.valueAt(indexOfKey)) {
            return false;
        }
        sparseBooleanArray.delete(i11);
        return true;
    }

    public static final void set(@k SparseBooleanArray sparseBooleanArray, int i11, boolean z11) {
        sparseBooleanArray.put(i11, z11);
    }

    @k
    public static final c0 valueIterator(@k final SparseBooleanArray sparseBooleanArray) {
        return new c0() { // from class: androidx.core.util.SparseBooleanArrayKt$valueIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseBooleanArray.size();
            }

            @Override // a00.c0
            public boolean nextBoolean() {
                SparseBooleanArray sparseBooleanArray2 = sparseBooleanArray;
                int i11 = this.index;
                this.index = i11 + 1;
                return sparseBooleanArray2.valueAt(i11);
            }

            public final void setIndex(int i11) {
                this.index = i11;
            }
        };
    }
}
