package androidx.compose.ui.draw;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.BlockGraphicsLayerModifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import x00.l;
import y1.b;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class ShadowGraphicsLayerElement extends ModifierNodeElement<BlockGraphicsLayerModifier> {
    public static final int $stable = 0;
    private final long ambientColor;
    private final boolean clip;
    private final float elevation;

    @k
    private final Shape shape;
    private final long spotColor;

    public /* synthetic */ ShadowGraphicsLayerElement(float f11, Shape shape, boolean z11, long j11, long j12, v vVar) {
        this(f11, shape, z11, j11, j12);
    }

    /* renamed from: copy-gNMxBKI$default, reason: not valid java name */
    public static /* synthetic */ ShadowGraphicsLayerElement m2135copygNMxBKI$default(ShadowGraphicsLayerElement shadowGraphicsLayerElement, float f11, Shape shape, boolean z11, long j11, long j12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = shadowGraphicsLayerElement.elevation;
        }
        if ((i11 & 2) != 0) {
            shape = shadowGraphicsLayerElement.shape;
        }
        if ((i11 & 4) != 0) {
            z11 = shadowGraphicsLayerElement.clip;
        }
        if ((i11 & 8) != 0) {
            j11 = shadowGraphicsLayerElement.ambientColor;
        }
        if ((i11 & 16) != 0) {
            j12 = shadowGraphicsLayerElement.spotColor;
        }
        long j13 = j12;
        boolean z12 = z11;
        return shadowGraphicsLayerElement.m2139copygNMxBKI(f11, shape, z12, j11, j13);
    }

    private final l<GraphicsLayerScope, g2> createBlock() {
        return new l<GraphicsLayerScope, g2>() { // from class: androidx.compose.ui.draw.ShadowGraphicsLayerElement$createBlock$1
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(GraphicsLayerScope graphicsLayerScope) {
                invoke2(graphicsLayerScope);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                graphicsLayerScope.setShadowElevation(graphicsLayerScope.mo377toPx0680j_4(ShadowGraphicsLayerElement.this.m2141getElevationD9Ej5fM()));
                graphicsLayerScope.setShape(ShadowGraphicsLayerElement.this.getShape());
                graphicsLayerScope.setClip(ShadowGraphicsLayerElement.this.getClip());
                graphicsLayerScope.mo2698setAmbientShadowColor8_81llA(ShadowGraphicsLayerElement.this.m2140getAmbientColor0d7_KjU());
                graphicsLayerScope.mo2700setSpotShadowColor8_81llA(ShadowGraphicsLayerElement.this.m2142getSpotColor0d7_KjU());
            }
        };
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public final float m2136component1D9Ej5fM() {
        return this.elevation;
    }

    @k
    public final Shape component2() {
        return this.shape;
    }

    public final boolean component3() {
        return this.clip;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name */
    public final long m2137component40d7_KjU() {
        return this.ambientColor;
    }

    /* renamed from: component5-0d7_KjU, reason: not valid java name */
    public final long m2138component50d7_KjU() {
        return this.spotColor;
    }

    @k
    /* renamed from: copy-gNMxBKI, reason: not valid java name */
    public final ShadowGraphicsLayerElement m2139copygNMxBKI(float f11, @k Shape shape, boolean z11, long j11, long j12) {
        return new ShadowGraphicsLayerElement(f11, shape, z11, j11, j12, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        return Dp.m5120equalsimpl0(this.elevation, shadowGraphicsLayerElement.elevation) && g0.g(this.shape, shadowGraphicsLayerElement.shape) && this.clip == shadowGraphicsLayerElement.clip && Color.m2510equalsimpl0(this.ambientColor, shadowGraphicsLayerElement.ambientColor) && Color.m2510equalsimpl0(this.spotColor, shadowGraphicsLayerElement.spotColor);
    }

    /* renamed from: getAmbientColor-0d7_KjU, reason: not valid java name */
    public final long m2140getAmbientColor0d7_KjU() {
        return this.ambientColor;
    }

    public final boolean getClip() {
        return this.clip;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m2141getElevationD9Ej5fM() {
        return this.elevation;
    }

    @k
    public final Shape getShape() {
        return this.shape;
    }

    /* renamed from: getSpotColor-0d7_KjU, reason: not valid java name */
    public final long m2142getSpotColor0d7_KjU() {
        return this.spotColor;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((((Dp.m5121hashCodeimpl(this.elevation) * 31) + this.shape.hashCode()) * 31) + Boolean.hashCode(this.clip)) * 31) + Color.m2516hashCodeimpl(this.ambientColor)) * 31) + Color.m2516hashCodeimpl(this.spotColor);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("shadow");
        inspectorInfo.getProperties().set("elevation", Dp.m5113boximpl(this.elevation));
        inspectorInfo.getProperties().set("shape", this.shape);
        inspectorInfo.getProperties().set("clip", Boolean.valueOf(this.clip));
        inspectorInfo.getProperties().set(b.f98950j, Color.m2499boximpl(this.ambientColor));
        inspectorInfo.getProperties().set("spotColor", Color.m2499boximpl(this.spotColor));
    }

    @k
    public String toString() {
        return "ShadowGraphicsLayerElement(elevation=" + ((Object) Dp.m5126toStringimpl(this.elevation)) + ", shape=" + this.shape + ", clip=" + this.clip + ", ambientColor=" + ((Object) Color.m2517toStringimpl(this.ambientColor)) + ", spotColor=" + ((Object) Color.m2517toStringimpl(this.spotColor)) + ')';
    }

    private ShadowGraphicsLayerElement(float f11, Shape shape, boolean z11, long j11, long j12) {
        this.elevation = f11;
        this.shape = shape;
        this.clip = z11;
        this.ambientColor = j11;
        this.spotColor = j12;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public BlockGraphicsLayerModifier create() {
        return new BlockGraphicsLayerModifier(createBlock());
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k BlockGraphicsLayerModifier blockGraphicsLayerModifier) {
        blockGraphicsLayerModifier.setLayerBlock(createBlock());
        blockGraphicsLayerModifier.invalidateLayerBlock();
    }
}
