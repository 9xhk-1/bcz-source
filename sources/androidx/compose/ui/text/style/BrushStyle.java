package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ShaderBrush;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class BrushStyle implements TextForegroundStyle {
    private final float alpha;

    @k
    private final ShaderBrush value;

    public BrushStyle(@k ShaderBrush shaderBrush, float f11) {
        this.value = shaderBrush;
        this.alpha = f11;
    }

    public static /* synthetic */ BrushStyle copy$default(BrushStyle brushStyle, ShaderBrush shaderBrush, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            shaderBrush = brushStyle.value;
        }
        if ((i11 & 2) != 0) {
            f11 = brushStyle.alpha;
        }
        return brushStyle.copy(shaderBrush, f11);
    }

    @k
    public final ShaderBrush component1() {
        return this.value;
    }

    public final float component2() {
        return this.alpha;
    }

    @k
    public final BrushStyle copy(@k ShaderBrush shaderBrush, float f11) {
        return new BrushStyle(shaderBrush, f11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrushStyle)) {
            return false;
        }
        BrushStyle brushStyle = (BrushStyle) obj;
        return g0.g(this.value, brushStyle.value) && Float.compare(this.alpha, brushStyle.alpha) == 0;
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    @k
    public Brush getBrush() {
        return this.value;
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public long mo4863getColor0d7_KjU() {
        return Color.Companion.m2545getUnspecified0d7_KjU();
    }

    @k
    public final ShaderBrush getValue() {
        return this.value;
    }

    public int hashCode() {
        return (this.value.hashCode() * 31) + Float.hashCode(this.alpha);
    }

    @k
    public String toString() {
        return "BrushStyle(value=" + this.value + ", alpha=" + this.alpha + ')';
    }
}
