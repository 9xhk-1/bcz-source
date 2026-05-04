package androidx.compose.runtime.collection;

import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ArrayUtils_androidKt {
    @k
    public static final <T> T[] fastCopyInto(@k T[] tArr, @k T[] tArr2, int i11, int i12, int i13) {
        System.arraycopy(tArr, i12, tArr2, i11, i13 - i12);
        return tArr2;
    }
}
