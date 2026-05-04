package androidx.compose.ui.graphics;

import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(26)
/* loaded from: classes.dex */
final class ColorMatrixFilterHelper {

    @m80.k
    public static final ColorMatrixFilterHelper INSTANCE = new ColorMatrixFilterHelper();

    private ColorMatrixFilterHelper() {
    }

    @m80.k
    /* renamed from: getColorMatrix-8unuwjk, reason: not valid java name */
    public final float[] m2588getColorMatrix8unuwjk(@m80.k android.graphics.ColorMatrixColorFilter colorMatrixColorFilter) {
        android.graphics.ColorMatrix colorMatrix = new android.graphics.ColorMatrix();
        colorMatrixColorFilter.getColorMatrix(colorMatrix);
        return ColorMatrix.m2565constructorimpl(colorMatrix.getArray());
    }
}
