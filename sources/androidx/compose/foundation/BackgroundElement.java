package androidx.compose.foundation;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class BackgroundElement extends ModifierNodeElement<BackgroundNode> {
    private final float alpha;

    @l
    private final Brush brush;
    private final long color;

    @m80.k
    private final x00.l<InspectorInfo, g2> inspectorInfo;

    @m80.k
    private final Shape shape;

    public /* synthetic */ BackgroundElement(long j11, Brush brush, float f11, Shape shape, x00.l lVar, v vVar) {
        this(j11, brush, f11, shape, lVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && Color.m2510equalsimpl0(this.color, backgroundElement.color) && g0.g(this.brush, backgroundElement.brush) && this.alpha == backgroundElement.alpha && g0.g(this.shape, backgroundElement.shape);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int m2516hashCodeimpl = Color.m2516hashCodeimpl(this.color) * 31;
        Brush brush = this.brush;
        return ((((m2516hashCodeimpl + (brush != null ? brush.hashCode() : 0)) * 31) + Float.hashCode(this.alpha)) * 31) + this.shape.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@m80.k InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    public /* synthetic */ BackgroundElement(long j11, Brush brush, float f11, Shape shape, x00.l lVar, int i11, v vVar) {
        this((i11 & 1) != 0 ? Color.Companion.m2545getUnspecified0d7_KjU() : j11, (i11 & 2) != 0 ? null : brush, f11, shape, lVar, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @m80.k
    public BackgroundNode create() {
        return new BackgroundNode(this.color, this.brush, this.alpha, this.shape, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@m80.k BackgroundNode backgroundNode) {
        backgroundNode.m237setColor8_81llA(this.color);
        backgroundNode.setBrush(this.brush);
        backgroundNode.setAlpha(this.alpha);
        backgroundNode.setShape(this.shape);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private BackgroundElement(long j11, Brush brush, float f11, Shape shape, x00.l<? super InspectorInfo, g2> lVar) {
        this.color = j11;
        this.brush = brush;
        this.alpha = f11;
        this.shape = shape;
        this.inspectorInfo = lVar;
    }
}
