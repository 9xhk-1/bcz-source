package org.conscrypt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
final class ArrayUtils {
    private ArrayUtils() {
    }

    public static void checkOffsetAndCount(int i11, int i12, int i13) {
        if ((i12 | i13) < 0 || i12 > i11 || i11 - i12 < i13) {
            throw new ArrayIndexOutOfBoundsException("length=" + i11 + "; regionStart=" + i12 + "; regionLength=" + i13);
        }
    }
}
