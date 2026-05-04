package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class PainterElement extends ModifierNodeElement<PainterNode> {

    @k
    private final Alignment alignment;
    private final float alpha;

    @l
    private final ColorFilter colorFilter;

    @k
    private final ContentScale contentScale;

    @k
    private final Painter painter;
    private final boolean sizeToIntrinsics;

    public PainterElement(@k Painter painter, boolean z11, @k Alignment alignment, @k ContentScale contentScale, float f11, @l ColorFilter colorFilter) {
        this.painter = painter;
        this.sizeToIntrinsics = z11;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f11;
        this.colorFilter = colorFilter;
    }

    public static /* synthetic */ PainterElement copy$default(PainterElement painterElement, Painter painter, boolean z11, Alignment alignment, ContentScale contentScale, float f11, ColorFilter colorFilter, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            painter = painterElement.painter;
        }
        if ((i11 & 2) != 0) {
            z11 = painterElement.sizeToIntrinsics;
        }
        if ((i11 & 4) != 0) {
            alignment = painterElement.alignment;
        }
        if ((i11 & 8) != 0) {
            contentScale = painterElement.contentScale;
        }
        if ((i11 & 16) != 0) {
            f11 = painterElement.alpha;
        }
        if ((i11 & 32) != 0) {
            colorFilter = painterElement.colorFilter;
        }
        float f12 = f11;
        ColorFilter colorFilter2 = colorFilter;
        return painterElement.copy(painter, z11, alignment, contentScale, f12, colorFilter2);
    }

    @k
    public final Painter component1() {
        return this.painter;
    }

    public final boolean component2() {
        return this.sizeToIntrinsics;
    }

    @k
    public final Alignment component3() {
        return this.alignment;
    }

    @k
    public final ContentScale component4() {
        return this.contentScale;
    }

    public final float component5() {
        return this.alpha;
    }

    @l
    public final ColorFilter component6() {
        return this.colorFilter;
    }

    @k
    public final PainterElement copy(@k Painter painter, boolean z11, @k Alignment alignment, @k ContentScale contentScale, float f11, @l ColorFilter colorFilter) {
        return new PainterElement(painter, z11, alignment, contentScale, f11, colorFilter);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return g0.g(this.painter, painterElement.painter) && this.sizeToIntrinsics == painterElement.sizeToIntrinsics && g0.g(this.alignment, painterElement.alignment) && g0.g(this.contentScale, painterElement.contentScale) && Float.compare(this.alpha, painterElement.alpha) == 0 && g0.g(this.colorFilter, painterElement.colorFilter);
    }

    @k
    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    @l
    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    @k
    public final ContentScale getContentScale() {
        return this.contentScale;
    }

    @k
    public final Painter getPainter() {
        return this.painter;
    }

    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = ((((((((this.painter.hashCode() * 31) + Boolean.hashCode(this.sizeToIntrinsics)) * 31) + this.alignment.hashCode()) * 31) + this.contentScale.hashCode()) * 31) + Float.hashCode(this.alpha)) * 31;
        ColorFilter colorFilter = this.colorFilter;
        return hashCode + (colorFilter == null ? 0 : colorFilter.hashCode());
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("paint");
        inspectorInfo.getProperties().set("painter", this.painter);
        inspectorInfo.getProperties().set("sizeToIntrinsics", Boolean.valueOf(this.sizeToIntrinsics));
        inspectorInfo.getProperties().set("alignment", this.alignment);
        inspectorInfo.getProperties().set("contentScale", this.contentScale);
        inspectorInfo.getProperties().set("alpha", Float.valueOf(this.alpha));
        inspectorInfo.getProperties().set("colorFilter", this.colorFilter);
    }

    @k
    public String toString() {
        return "PainterElement(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", contentScale=" + this.contentScale + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public PainterNode create() {
        return new PainterNode(this.painter, this.sizeToIntrinsics, this.alignment, this.contentScale, this.alpha, this.colorFilter);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k PainterNode painterNode) {
        boolean sizeToIntrinsics = painterNode.getSizeToIntrinsics();
        boolean z11 = this.sizeToIntrinsics;
        boolean z12 = sizeToIntrinsics != z11 || (z11 && !Size.m2333equalsimpl0(painterNode.getPainter().mo3180getIntrinsicSizeNHjbRc(), this.painter.mo3180getIntrinsicSizeNHjbRc()));
        painterNode.setPainter(this.painter);
        painterNode.setSizeToIntrinsics(this.sizeToIntrinsics);
        painterNode.setAlignment(this.alignment);
        painterNode.setContentScale(this.contentScale);
        painterNode.setAlpha(this.alpha);
        painterNode.setColorFilter(this.colorFilter);
        if (z12) {
            LayoutModifierNodeKt.invalidateMeasurement(painterNode);
        }
        DrawModifierNodeKt.invalidateDraw(painterNode);
    }
}
