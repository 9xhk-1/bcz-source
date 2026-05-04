package androidx.compose.ui.text.android.style;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class ShadowSpan extends CharacterStyle {
    public static final int $stable = 0;
    private final int color;
    private final float offsetX;
    private final float offsetY;
    private final float radius;

    public ShadowSpan(int i11, float f11, float f12, float f13) {
        this.color = i11;
        this.offsetX = f11;
        this.offsetY = f12;
        this.radius = f13;
    }

    public final int getColor() {
        return this.color;
    }

    public final float getOffsetX() {
        return this.offsetX;
    }

    public final float getOffsetY() {
        return this.offsetY;
    }

    public final float getRadius() {
        return this.radius;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@k TextPaint textPaint) {
        textPaint.setShadowLayer(this.radius, this.offsetX, this.offsetY, this.color);
    }
}
