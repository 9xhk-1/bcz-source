package androidx.compose.ui.text.platform.style;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidPathEffect_androidKt;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class DrawStyleSpan extends CharacterStyle implements UpdateAppearance {
    public static final int $stable = 8;

    @k
    private final DrawStyle drawStyle;

    public DrawStyleSpan(@k DrawStyle drawStyle) {
        this.drawStyle = drawStyle;
    }

    @k
    public final DrawStyle getDrawStyle() {
        return this.drawStyle;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@l TextPaint textPaint) {
        if (textPaint != null) {
            DrawStyle drawStyle = this.drawStyle;
            if (g0.g(drawStyle, Fill.INSTANCE)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (drawStyle instanceof Stroke) {
                textPaint.setStyle(Paint.Style.STROKE);
                textPaint.setStrokeWidth(((Stroke) this.drawStyle).getWidth());
                textPaint.setStrokeMiter(((Stroke) this.drawStyle).getMiter());
                textPaint.setStrokeJoin(DrawStyleSpan_androidKt.m4846toAndroidJoinWw9F2mQ(((Stroke) this.drawStyle).m3130getJoinLxFBmk8()));
                textPaint.setStrokeCap(DrawStyleSpan_androidKt.m4845toAndroidCapBeK7IIE(((Stroke) this.drawStyle).m3129getCapKaPHkGw()));
                PathEffect pathEffect = ((Stroke) this.drawStyle).getPathEffect();
                textPaint.setPathEffect(pathEffect != null ? AndroidPathEffect_androidKt.asAndroidPathEffect(pathEffect) : null);
            }
        }
    }
}
