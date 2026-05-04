package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nTextFieldCoreModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldCoreModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldCoreModifierKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,623:1\n640#2:624\n113#3:625\n*S KotlinDebug\n*F\n+ 1 TextFieldCoreModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldCoreModifierKt\n*L\n580#1:624\n576#1:625\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldCoreModifierKt {
    private static final float DefaultCursorThickness = Dp.m5115constructorimpl(2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect getCursorRectInScroller(Density density, Rect rect, boolean z11, int i11) {
        return Rect.copy$default(rect, z11 ? i11 - rect.getRight() : rect.getLeft(), 0.0f, (z11 ? i11 - rect.getRight() : rect.getLeft()) + density.mo371roundToPx0680j_4(DefaultCursorThickness), 0.0f, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSpecified(Brush brush) {
        return ((brush instanceof SolidColor) && ((SolidColor) brush).m2844getValue0d7_KjU() == 16) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float roundToNext(float f11) {
        if (Float.isNaN(f11) || Float.isInfinite(f11)) {
            return f11;
        }
        return (float) (f11 > 0.0f ? Math.ceil(f11) : Math.floor(f11));
    }
}
