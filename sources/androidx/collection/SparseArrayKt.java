package androidx.collection;

import a00.d1;
import java.util.Iterator;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.p;
import yz.g2;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class SparseArrayKt {
    public static final <T> boolean contains(@k SparseArrayCompat<T> sparseArrayCompat, int i11) {
        g0.p(sparseArrayCompat, "<this>");
        return sparseArrayCompat.containsKey(i11);
    }

    public static final <T> void forEach(@k SparseArrayCompat<T> sparseArrayCompat, @k p<? super Integer, ? super T, g2> action) {
        g0.p(sparseArrayCompat, "<this>");
        g0.p(action, "action");
        int size = sparseArrayCompat.size();
        for (int i11 = 0; i11 < size; i11++) {
            action.invoke(Integer.valueOf(sparseArrayCompat.keyAt(i11)), sparseArrayCompat.valueAt(i11));
        }
    }

    public static final <T> T getOrDefault(@k SparseArrayCompat<T> sparseArrayCompat, int i11, T t11) {
        g0.p(sparseArrayCompat, "<this>");
        return sparseArrayCompat.get(i11, t11);
    }

    public static final <T> T getOrElse(@k SparseArrayCompat<T> sparseArrayCompat, int i11, @k x00.a<? extends T> defaultValue) {
        g0.p(sparseArrayCompat, "<this>");
        g0.p(defaultValue, "defaultValue");
        T t11 = sparseArrayCompat.get(i11);
        return t11 == null ? defaultValue.invoke() : t11;
    }

    public static final <T> int getSize(@k SparseArrayCompat<T> sparseArrayCompat) {
        g0.p(sparseArrayCompat, "<this>");
        return sparseArrayCompat.size();
    }

    public static final <T> boolean isNotEmpty(@k SparseArrayCompat<T> sparseArrayCompat) {
        g0.p(sparseArrayCompat, "<this>");
        return !sparseArrayCompat.isEmpty();
    }

    @k
    public static final <T> d1 keyIterator(@k final SparseArrayCompat<T> sparseArrayCompat) {
        g0.p(sparseArrayCompat, "<this>");
        return new d1() { // from class: androidx.collection.SparseArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseArrayCompat.size();
            }

            @Override // a00.d1
            public int nextInt() {
                SparseArrayCompat<T> sparseArrayCompat2 = sparseArrayCompat;
                int i11 = this.index;
                this.index = i11 + 1;
                return sparseArrayCompat2.keyAt(i11);
            }

            public final void setIndex(int i11) {
                this.index = i11;
            }
        };
    }

    @k
    public static final <T> SparseArrayCompat<T> plus(@k SparseArrayCompat<T> sparseArrayCompat, @k SparseArrayCompat<T> other) {
        g0.p(sparseArrayCompat, "<this>");
        g0.p(other, "other");
        SparseArrayCompat<T> sparseArrayCompat2 = new SparseArrayCompat<>(sparseArrayCompat.size() + other.size());
        sparseArrayCompat2.putAll(sparseArrayCompat);
        sparseArrayCompat2.putAll(other);
        return sparseArrayCompat2;
    }

    @n(level = DeprecationLevel.HIDDEN, message = "Replaced with member function. Remove extension import!")
    public static final /* synthetic */ boolean remove(SparseArrayCompat sparseArrayCompat, int i11, Object obj) {
        g0.p(sparseArrayCompat, "<this>");
        return sparseArrayCompat.remove(i11, obj);
    }

    public static final <T> void set(@k SparseArrayCompat<T> sparseArrayCompat, int i11, T t11) {
        g0.p(sparseArrayCompat, "<this>");
        sparseArrayCompat.put(i11, t11);
    }

    @k
    public static final <T> Iterator<T> valueIterator(@k SparseArrayCompat<T> sparseArrayCompat) {
        g0.p(sparseArrayCompat, "<this>");
        return new SparseArrayKt$valueIterator$1(sparseArrayCompat);
    }
}
