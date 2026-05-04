package androidx.compose.foundation;

import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class BorderModifierNodeElement extends ModifierNodeElement<BorderModifierNode> {
    public static final int $stable = 0;

    @m80.k
    private final Brush brush;

    @m80.k
    private final Shape shape;
    private final float width;

    public /* synthetic */ BorderModifierNodeElement(float f11, Brush brush, Shape shape, v vVar) {
        this(f11, brush, shape);
    }

    /* renamed from: copy-8Feqmps$default, reason: not valid java name */
    public static /* synthetic */ BorderModifierNodeElement m255copy8Feqmps$default(BorderModifierNodeElement borderModifierNodeElement, float f11, Brush brush, Shape shape, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = borderModifierNodeElement.width;
        }
        if ((i11 & 2) != 0) {
            brush = borderModifierNodeElement.brush;
        }
        if ((i11 & 4) != 0) {
            shape = borderModifierNodeElement.shape;
        }
        return borderModifierNodeElement.m257copy8Feqmps(f11, brush, shape);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public final float m256component1D9Ej5fM() {
        return this.width;
    }

    @m80.k
    public final Brush component2() {
        return this.brush;
    }

    @m80.k
    public final Shape component3() {
        return this.shape;
    }

    @m80.k
    /* renamed from: copy-8Feqmps, reason: not valid java name */
    public final BorderModifierNodeElement m257copy8Feqmps(float f11, @m80.k Brush brush, @m80.k Shape shape) {
        return new BorderModifierNodeElement(f11, brush, shape, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return Dp.m5120equalsimpl0(this.width, borderModifierNodeElement.width) && g0.g(this.brush, borderModifierNodeElement.brush) && g0.g(this.shape, borderModifierNodeElement.shape);
    }

    @m80.k
    public final Brush getBrush() {
        return this.brush;
    }

    @m80.k
    public final Shape getShape() {
        return this.shape;
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m258getWidthD9Ej5fM() {
        return this.width;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((Dp.m5121hashCodeimpl(this.width) * 31) + this.brush.hashCode()) * 31) + this.shape.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@m80.k InspectorInfo inspectorInfo) {
        inspectorInfo.setName(OutlinedTextFieldKt.BorderId);
        inspectorInfo.getProperties().set("width", Dp.m5113boximpl(this.width));
        if (this.brush instanceof SolidColor) {
            inspectorInfo.getProperties().set("color", Color.m2499boximpl(((SolidColor) this.brush).m2844getValue0d7_KjU()));
            inspectorInfo.setValue(Color.m2499boximpl(((SolidColor) this.brush).m2844getValue0d7_KjU()));
        } else {
            inspectorInfo.getProperties().set("brush", this.brush);
        }
        inspectorInfo.getProperties().set("shape", this.shape);
    }

    @m80.k
    public String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) Dp.m5126toStringimpl(this.width)) + ", brush=" + this.brush + ", shape=" + this.shape + ')';
    }

    private BorderModifierNodeElement(float f11, Brush brush, Shape shape) {
        this.width = f11;
        this.brush = brush;
        this.shape = shape;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @m80.k
    public BorderModifierNode create() {
        return new BorderModifierNode(this.width, this.brush, this.shape, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@m80.k BorderModifierNode borderModifierNode) {
        borderModifierNode.m254setWidth0680j_4(this.width);
        borderModifierNode.setBrush(this.brush);
        borderModifierNode.setShape(this.shape);
    }
}
