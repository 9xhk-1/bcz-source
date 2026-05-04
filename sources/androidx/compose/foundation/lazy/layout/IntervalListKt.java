package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nIntervalList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/IntervalListKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,204:1\n44#2:205\n472#2:206\n472#2:207\n*S KotlinDebug\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/IntervalListKt\n*L\n180#1:205\n185#1:206\n194#1:207\n*E\n"})
/* loaded from: classes.dex */
public final class IntervalListKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> int binarySearch(MutableVector<IntervalList.Interval<T>> mutableVector, int i11) {
        int size = mutableVector.getSize() - 1;
        int i12 = 0;
        while (i12 < size) {
            int i13 = ((size - i12) / 2) + i12;
            int startIndex = mutableVector.content[i13].getStartIndex();
            if (startIndex != i11) {
                if (startIndex < i11) {
                    i12 = i13 + 1;
                    if (i11 < mutableVector.content[i12].getStartIndex()) {
                    }
                } else {
                    size = i13 - 1;
                }
            }
            return i13;
        }
        return i12;
    }
}
