package androidx.compose.foundation;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes.dex */
public final class BorderStroke {
    public static final int $stable = 0;

    @m80.k
    private final Brush brush;
    private final float width;

    public /* synthetic */ BorderStroke(float f11, Brush brush, v vVar) {
        this(f11, brush);
    }

    /* renamed from: copy-D5KLDUw$default, reason: not valid java name */
    public static /* synthetic */ BorderStroke m259copyD5KLDUw$default(BorderStroke borderStroke, float f11, Brush brush, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = borderStroke.width;
        }
        if ((i11 & 2) != 0) {
            brush = borderStroke.brush;
        }
        return borderStroke.m260copyD5KLDUw(f11, brush);
    }

    @m80.k
    /* renamed from: copy-D5KLDUw, reason: not valid java name */
    public final BorderStroke m260copyD5KLDUw(float f11, @m80.k Brush brush) {
        return new BorderStroke(f11, brush, null);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderStroke)) {
            return false;
        }
        BorderStroke borderStroke = (BorderStroke) obj;
        return Dp.m5120equalsimpl0(this.width, borderStroke.width) && g0.g(this.brush, borderStroke.brush);
    }

    @m80.k
    public final Brush getBrush() {
        return this.brush;
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m261getWidthD9Ej5fM() {
        return this.width;
    }

    public int hashCode() {
        return (Dp.m5121hashCodeimpl(this.width) * 31) + this.brush.hashCode();
    }

    @m80.k
    public String toString() {
        return "BorderStroke(width=" + ((Object) Dp.m5126toStringimpl(this.width)) + ", brush=" + this.brush + ')';
    }

    private BorderStroke(float f11, Brush brush) {
        this.width = f11;
        this.brush = brush;
    }
}
