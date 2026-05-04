package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class UtilsKt {
    public static final int LOG_MAX_BUFFER_SIZE = 5;
    public static final int MAX_BUFFER_SIZE = 32;
    public static final int MAX_BUFFER_SIZE_MINUS_ONE = 31;
    public static final int MUTABLE_BUFFER_SIZE = 33;

    public static final int indexSegment(int i11, int i12) {
        return (i11 >> i12) & 31;
    }

    @k
    public static final <E> PersistentList<E> persistentVectorOf() {
        return SmallPersistentVector.Companion.getEMPTY();
    }

    @k
    public static final Object[] presizedBufferWith(@l Object obj) {
        Object[] objArr = new Object[32];
        objArr[0] = obj;
        return objArr;
    }

    public static final int rootSize(int i11) {
        return (i11 - 1) & (-32);
    }
}
