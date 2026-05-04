package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.g0;
import m80.k;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class ListImplementation {
    public static final int $stable = 0;

    @k
    public static final ListImplementation INSTANCE = new ListImplementation();

    private ListImplementation() {
    }

    @o
    public static final void checkElementIndex$runtime_release(int i11, int i12) {
        if (i11 < 0 || i11 >= i12) {
            throw new IndexOutOfBoundsException("index: " + i11 + ", size: " + i12);
        }
    }

    @o
    public static final void checkPositionIndex$runtime_release(int i11, int i12) {
        if (i11 < 0 || i11 > i12) {
            throw new IndexOutOfBoundsException("index: " + i11 + ", size: " + i12);
        }
    }

    @o
    public static final void checkRangeIndexes$runtime_release(int i11, int i12, int i13) {
        if (i11 < 0 || i12 > i13) {
            throw new IndexOutOfBoundsException("fromIndex: " + i11 + ", toIndex: " + i12 + ", size: " + i13);
        }
        if (i11 <= i12) {
            return;
        }
        throw new IllegalArgumentException("fromIndex: " + i11 + " > toIndex: " + i12);
    }

    @o
    public static final boolean orderedEquals$runtime_release(@k Collection<?> collection, @k Collection<?> collection2) {
        if (collection.size() != collection2.size()) {
            return false;
        }
        Iterator<?> it = collection2.iterator();
        Iterator<?> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!g0.g(it2.next(), it.next())) {
                return false;
            }
        }
        return true;
    }

    @o
    public static final int orderedHashCode$runtime_release(@k Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        int i11 = 1;
        while (it.hasNext()) {
            Object next = it.next();
            i11 = (i11 * 31) + (next != null ? next.hashCode() : 0);
        }
        return i11;
    }
}
