package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class BrushPainter extends Painter {
    private float alpha = 1.0f;

    @k
    private final Brush brush;

    @l
    private ColorFilter colorFilter;

    public BrushPainter(@k Brush brush) {
        this.brush = brush;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyAlpha(float f11) {
        this.alpha = f11;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyColorFilter(@l ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BrushPainter) && g0.g(this.brush, ((BrushPainter) obj).brush);
    }

    @k
    public final Brush getBrush() {
        return this.brush;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo3180getIntrinsicSizeNHjbRc() {
        return this.brush.mo2457getIntrinsicSizeNHjbRc();
    }

    public int hashCode() {
        return this.brush.hashCode();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(@k DrawScope drawScope) {
        DrawScope.m3053drawRectAsUm42w$default(drawScope, this.brush, 0L, 0L, this.alpha, null, this.colorFilter, 0, 86, null);
    }

    @k
    public String toString() {
        return "BrushPainter(brush=" + this.brush + ')';
    }
}
