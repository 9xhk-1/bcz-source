package androidx.compose.runtime.collection;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,1110:1\n1083#1,2:1111\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1101#1:1111,2\n*E\n"})
/* loaded from: classes.dex */
public final class MutableVectorKt {
    public static final /* synthetic */ <T> MutableVector<T> MutableVector(int i11) {
        g0.y(0, "T?");
        return new MutableVector<>(new Object[i11], 0);
    }

    public static /* synthetic */ MutableVector MutableVector$default(int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 16;
        }
        g0.y(0, "T?");
        return new MutableVector(new Object[i11], 0);
    }

    public static final void checkIndex(@k List<?> list, int i11) {
        int size = list.size();
        if (i11 < 0 || i11 >= size) {
            throwListIndexOutOfBoundsException(i11, size);
        }
    }

    public static final void checkSubIndex(@k List<?> list, int i11, int i12) {
        if (i11 > i12) {
            throwReversedIndicesException(i11, i12);
        }
        if (i11 < 0) {
            throwNegativeIndexException(i11);
        }
        if (i12 > list.size()) {
            throwOutOfRangeException(i12, list.size());
        }
    }

    public static final /* synthetic */ <T> MutableVector<T> mutableVectorOf(T... tArr) {
        return new MutableVector<>(tArr, tArr.length);
    }

    private static final void throwListIndexOutOfBoundsException(int i11, int i12) {
        throw new IndexOutOfBoundsException("Index " + i11 + " is out of bounds. The list has " + i12 + " elements.");
    }

    private static final void throwNegativeIndexException(int i11) {
        throw new IndexOutOfBoundsException("fromIndex (" + i11 + ") is less than 0.");
    }

    private static final void throwOutOfRangeException(int i11, int i12) {
        throw new IndexOutOfBoundsException("toIndex (" + i11 + ") is more than than the list size (" + i12 + ')');
    }

    private static final void throwReversedIndicesException(int i11, int i12) {
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i11 + ") is greater than toIndex (" + i12 + ").");
    }

    public static final /* synthetic */ <T> MutableVector<T> MutableVector(int i11, l<? super Integer, ? extends T> lVar) {
        g0.y(0, ExifInterface.GPS_DIRECTION_TRUE);
        Object[] objArr = new Object[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = lVar.invoke(Integer.valueOf(i12));
        }
        return new MutableVector<>(objArr, i11);
    }

    public static final /* synthetic */ <T> MutableVector<T> mutableVectorOf() {
        g0.y(0, "T?");
        return new MutableVector<>(new Object[16], 0);
    }
}
