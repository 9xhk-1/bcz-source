package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.SpanStyleKt;
import androidx.compose.ui.util.MathHelpersKt;
import m80.k;
import w00.j;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "TextDrawStyleKt")
/* loaded from: classes2.dex */
public final class TextDrawStyleKt {
    @k
    public static final TextForegroundStyle lerp(@k TextForegroundStyle textForegroundStyle, @k TextForegroundStyle textForegroundStyle2, float f11) {
        boolean z11 = textForegroundStyle instanceof BrushStyle;
        return (z11 || (textForegroundStyle2 instanceof BrushStyle)) ? (z11 && (textForegroundStyle2 instanceof BrushStyle)) ? TextForegroundStyle.Companion.from((Brush) SpanStyleKt.lerpDiscrete(((BrushStyle) textForegroundStyle).getBrush(), ((BrushStyle) textForegroundStyle2).getBrush(), f11), MathHelpersKt.lerp(textForegroundStyle.getAlpha(), textForegroundStyle2.getAlpha(), f11)) : (TextForegroundStyle) SpanStyleKt.lerpDiscrete(textForegroundStyle, textForegroundStyle2, f11) : TextForegroundStyle.Companion.m4998from8_81llA(ColorKt.m2560lerpjxsXWHM(textForegroundStyle.mo4863getColor0d7_KjU(), textForegroundStyle2.mo4863getColor0d7_KjU(), f11));
    }

    /* renamed from: modulate-DxMtmZc, reason: not valid java name */
    public static final long m4997modulateDxMtmZc(long j11, float f11) {
        return (Float.isNaN(f11) || f11 >= 1.0f) ? j11 : Color.m2508copywmQWz5c$default(j11, Color.m2511getAlphaimpl(j11) * f11, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float takeOrElse(float f11, a<Float> aVar) {
        return Float.isNaN(f11) ? aVar.invoke().floatValue() : f11;
    }
}
