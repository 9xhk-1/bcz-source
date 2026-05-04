package androidx.compose.ui.text.style;

import androidx.compose.ui.util.MathHelpersKt;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class TextGeometricTransformKt {
    @k
    public static final TextGeometricTransform lerp(@k TextGeometricTransform textGeometricTransform, @k TextGeometricTransform textGeometricTransform2, float f11) {
        return new TextGeometricTransform(MathHelpersKt.lerp(textGeometricTransform.getScaleX(), textGeometricTransform2.getScaleX(), f11), MathHelpersKt.lerp(textGeometricTransform.getSkewX(), textGeometricTransform2.getSkewX(), f11));
    }
}
