package androidx.compose.foundation.lazy.staggeredgrid;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class LazyStaggeredGridCellsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int[] calculateCellsCrossAxisSizeImpl(int i11, int i12, int i13) {
        int i14;
        int i15 = i11 - (i13 * (i12 - 1));
        int i16 = i15 / i12;
        int i17 = i15 % i12;
        int[] iArr = new int[i12];
        int i18 = 0;
        while (i18 < i12) {
            if (i16 < 0) {
                i14 = 0;
            } else {
                i14 = (i18 < i17 ? 1 : 0) + i16;
            }
            iArr[i18] = i14;
            i18++;
        }
        return iArr;
    }
}
