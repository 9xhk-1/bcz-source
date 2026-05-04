package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Range;
import androidx.annotation.RequiresApi;
import g10.g;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes2.dex */
public final class RangeKt {
    @RequiresApi(21)
    @k
    public static final <T extends Comparable<? super T>> Range<T> and(@k Range<T> range, @k Range<T> range2) {
        return range.intersect(range2);
    }

    @RequiresApi(21)
    @k
    public static final <T extends Comparable<? super T>> Range<T> plus(@k Range<T> range, @k T t11) {
        return range.extend((Range<T>) t11);
    }

    @RequiresApi(21)
    @k
    public static final <T extends Comparable<? super T>> Range<T> rangeTo(@k T t11, @k T t12) {
        return new Range<>(t11, t12);
    }

    @RequiresApi(21)
    @k
    public static final <T extends Comparable<? super T>> g10.g<T> toClosedRange(@k final Range<T> range) {
        return (g10.g<T>) new g10.g<T>() { // from class: androidx.core.util.RangeKt$toClosedRange$1
            /* JADX WARN: Incorrect types in method signature: (TT;)Z */
            @Override // g10.g
            public boolean contains(@k Comparable comparable) {
                return g.a.a(this, comparable);
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // g10.g
            public Comparable getEndInclusive() {
                return range.getUpper();
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // g10.g
            public Comparable getStart() {
                return range.getLower();
            }

            @Override // g10.g
            public boolean isEmpty() {
                return g.a.b(this);
            }
        };
    }

    @RequiresApi(21)
    @k
    public static final <T extends Comparable<? super T>> Range<T> toRange(@k g10.g<T> gVar) {
        return new Range<>(gVar.getStart(), gVar.getEndInclusive());
    }

    @RequiresApi(21)
    @k
    public static final <T extends Comparable<? super T>> Range<T> plus(@k Range<T> range, @k Range<T> range2) {
        return range.extend(range2);
    }
}
