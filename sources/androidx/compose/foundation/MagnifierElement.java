package androidx.compose.foundation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import ix.g;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class MagnifierElement extends ModifierNodeElement<MagnifierNode> {
    public static final int $stable = 0;
    private final boolean clippingEnabled;
    private final float cornerRadius;
    private final float elevation;

    @l
    private final x00.l<Density, Offset> magnifierCenter;

    @l
    private final x00.l<DpSize, g2> onSizeChanged;

    @m80.k
    private final PlatformMagnifierFactory platformMagnifierFactory;
    private final long size;

    @m80.k
    private final x00.l<Density, Offset> sourceCenter;
    private final boolean useTextDefault;
    private final float zoom;

    public /* synthetic */ MagnifierElement(x00.l lVar, x00.l lVar2, x00.l lVar3, float f11, boolean z11, long j11, float f12, float f13, boolean z12, PlatformMagnifierFactory platformMagnifierFactory, v vVar) {
        this(lVar, lVar2, lVar3, f11, z11, j11, f12, f13, z12, platformMagnifierFactory);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagnifierElement)) {
            return false;
        }
        MagnifierElement magnifierElement = (MagnifierElement) obj;
        return this.sourceCenter == magnifierElement.sourceCenter && this.magnifierCenter == magnifierElement.magnifierCenter && this.zoom == magnifierElement.zoom && this.useTextDefault == magnifierElement.useTextDefault && DpSize.m5210equalsimpl0(this.size, magnifierElement.size) && Dp.m5120equalsimpl0(this.cornerRadius, magnifierElement.cornerRadius) && Dp.m5120equalsimpl0(this.elevation, magnifierElement.elevation) && this.clippingEnabled == magnifierElement.clippingEnabled && this.onSizeChanged == magnifierElement.onSizeChanged && g0.g(this.platformMagnifierFactory, magnifierElement.platformMagnifierFactory);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = this.sourceCenter.hashCode() * 31;
        x00.l<Density, Offset> lVar = this.magnifierCenter;
        int hashCode2 = (((((((((((((hashCode + (lVar != null ? lVar.hashCode() : 0)) * 31) + Float.hashCode(this.zoom)) * 31) + Boolean.hashCode(this.useTextDefault)) * 31) + DpSize.m5215hashCodeimpl(this.size)) * 31) + Dp.m5121hashCodeimpl(this.cornerRadius)) * 31) + Dp.m5121hashCodeimpl(this.elevation)) * 31) + Boolean.hashCode(this.clippingEnabled)) * 31;
        x00.l<DpSize, g2> lVar2 = this.onSizeChanged;
        return ((hashCode2 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31) + this.platformMagnifierFactory.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@m80.k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("magnifier");
        inspectorInfo.getProperties().set("sourceCenter", this.sourceCenter);
        inspectorInfo.getProperties().set("magnifierCenter", this.magnifierCenter);
        inspectorInfo.getProperties().set("zoom", Float.valueOf(this.zoom));
        inspectorInfo.getProperties().set(g.b.f62794h, DpSize.m5201boximpl(this.size));
        inspectorInfo.getProperties().set("cornerRadius", Dp.m5113boximpl(this.cornerRadius));
        inspectorInfo.getProperties().set("elevation", Dp.m5113boximpl(this.elevation));
        inspectorInfo.getProperties().set("clippingEnabled", Boolean.valueOf(this.clippingEnabled));
    }

    public /* synthetic */ MagnifierElement(x00.l lVar, x00.l lVar2, x00.l lVar3, float f11, boolean z11, long j11, float f12, float f13, boolean z12, PlatformMagnifierFactory platformMagnifierFactory, int i11, v vVar) {
        this(lVar, (i11 & 2) != 0 ? null : lVar2, (i11 & 4) != 0 ? null : lVar3, (i11 & 8) != 0 ? Float.NaN : f11, (i11 & 16) != 0 ? false : z11, (i11 & 32) != 0 ? DpSize.Companion.m5222getUnspecifiedMYxV2XQ() : j11, (i11 & 64) != 0 ? Dp.Companion.m5135getUnspecifiedD9Ej5fM() : f12, (i11 & 128) != 0 ? Dp.Companion.m5135getUnspecifiedD9Ej5fM() : f13, (i11 & 256) != 0 ? true : z12, platformMagnifierFactory, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @m80.k
    public MagnifierNode create() {
        return new MagnifierNode(this.sourceCenter, this.magnifierCenter, this.onSizeChanged, this.zoom, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, this.platformMagnifierFactory, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@m80.k MagnifierNode magnifierNode) {
        magnifierNode.m300update5F03MCQ(this.sourceCenter, this.magnifierCenter, this.zoom, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, this.onSizeChanged, this.platformMagnifierFactory);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private MagnifierElement(x00.l<? super Density, Offset> lVar, x00.l<? super Density, Offset> lVar2, x00.l<? super DpSize, g2> lVar3, float f11, boolean z11, long j11, float f12, float f13, boolean z12, PlatformMagnifierFactory platformMagnifierFactory) {
        this.sourceCenter = lVar;
        this.magnifierCenter = lVar2;
        this.onSizeChanged = lVar3;
        this.zoom = f11;
        this.useTextDefault = z11;
        this.size = j11;
        this.cornerRadius = f12;
        this.elevation = f13;
        this.clippingEnabled = z12;
        this.platformMagnifierFactory = platformMagnifierFactory;
    }
}
