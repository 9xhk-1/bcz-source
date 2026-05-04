package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.unit.TextUnit;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class Bullet implements AnnotatedString.Annotation {
    public static final int $stable = 8;
    private final float alpha;

    @l
    private final Brush brush;

    @k
    private final DrawStyle drawStyle;
    private final long padding;

    @k
    private final Shape shape;
    private final long size;

    public /* synthetic */ Bullet(Shape shape, long j11, long j12, Brush brush, float f11, DrawStyle drawStyle, v vVar) {
        this(shape, j11, j12, brush, f11, drawStyle);
    }

    /* renamed from: copy-1XB3EBo$default, reason: not valid java name */
    public static /* synthetic */ Bullet m4392copy1XB3EBo$default(Bullet bullet, Shape shape, long j11, long j12, Brush brush, float f11, DrawStyle drawStyle, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            shape = bullet.shape;
        }
        if ((i11 & 2) != 0) {
            j11 = bullet.size;
        }
        if ((i11 & 4) != 0) {
            j12 = bullet.padding;
        }
        if ((i11 & 8) != 0) {
            brush = bullet.brush;
        }
        if ((i11 & 16) != 0) {
            f11 = bullet.alpha;
        }
        if ((i11 & 32) != 0) {
            drawStyle = bullet.drawStyle;
        }
        DrawStyle drawStyle2 = drawStyle;
        Brush brush2 = brush;
        long j13 = j12;
        return bullet.m4393copy1XB3EBo(shape, j11, j13, brush2, f11, drawStyle2);
    }

    @k
    /* renamed from: copy-1XB3EBo, reason: not valid java name */
    public final Bullet m4393copy1XB3EBo(@k Shape shape, long j11, long j12, @l Brush brush, float f11, @k DrawStyle drawStyle) {
        return new Bullet(shape, j11, j12, brush, f11, drawStyle, null);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof Bullet)) {
            Bullet bullet = (Bullet) obj;
            return g0.g(this.shape, bullet.shape) && TextUnit.m5306equalsimpl0(this.size, bullet.size) && TextUnit.m5306equalsimpl0(this.padding, bullet.padding) && g0.g(this.brush, bullet.brush) && this.alpha == bullet.alpha && g0.g(this.drawStyle, bullet.drawStyle);
        }
        return false;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    @l
    public final Brush getBrush() {
        return this.brush;
    }

    @k
    public final DrawStyle getDrawStyle() {
        return this.drawStyle;
    }

    /* renamed from: getPadding-XSAIIZE, reason: not valid java name */
    public final long m4394getPaddingXSAIIZE() {
        return this.padding;
    }

    @k
    public final Shape getShape() {
        return this.shape;
    }

    /* renamed from: getSize-XSAIIZE, reason: not valid java name */
    public final long m4395getSizeXSAIIZE() {
        return this.size;
    }

    public int hashCode() {
        int hashCode = ((((this.shape.hashCode() * 31) + TextUnit.m5310hashCodeimpl(this.size)) * 31) + TextUnit.m5310hashCodeimpl(this.padding)) * 31;
        Brush brush = this.brush;
        return ((((hashCode + (brush != null ? brush.hashCode() : 0)) * 31) + Float.hashCode(this.alpha)) * 31) + this.drawStyle.hashCode();
    }

    @k
    public String toString() {
        return "Bullet(shape=" + this.shape + ", size=" + ((Object) TextUnit.m5316toStringimpl(this.size)) + ", padding=" + ((Object) TextUnit.m5316toStringimpl(this.padding)) + ", brush=" + this.brush + ", alpha=" + this.alpha + ", drawStyle=" + this.drawStyle + ')';
    }

    private Bullet(Shape shape, long j11, long j12, Brush brush, float f11, DrawStyle drawStyle) {
        this.shape = shape;
        this.size = j11;
        this.padding = j12;
        this.brush = brush;
        this.alpha = f11;
        this.drawStyle = drawStyle;
    }
}
