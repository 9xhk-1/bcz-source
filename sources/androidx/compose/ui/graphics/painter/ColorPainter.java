package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ColorPainter extends Painter {
    private float alpha;
    private final long color;

    @l
    private ColorFilter colorFilter;
    private final long intrinsicSize;

    public /* synthetic */ ColorPainter(long j11, v vVar) {
        this(j11);
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
        return (obj instanceof ColorPainter) && Color.m2510equalsimpl0(this.color, ((ColorPainter) obj).color);
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m3184getColor0d7_KjU() {
        return this.color;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo3180getIntrinsicSizeNHjbRc() {
        return this.intrinsicSize;
    }

    public int hashCode() {
        return Color.m2516hashCodeimpl(this.color);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(@k DrawScope drawScope) {
        DrawScope.m3054drawRectnJ9OG0$default(drawScope, this.color, 0L, 0L, this.alpha, null, this.colorFilter, 0, 86, null);
    }

    @k
    public String toString() {
        return "ColorPainter(color=" + ((Object) Color.m2517toStringimpl(this.color)) + ')';
    }

    private ColorPainter(long j11) {
        this.color = j11;
        this.alpha = 1.0f;
        this.intrinsicSize = Size.Companion.m2345getUnspecifiedNHjbRc();
    }
}
