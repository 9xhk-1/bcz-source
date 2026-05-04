package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.v;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class OffsetNode extends Modifier.Node implements LayoutModifierNode {
    private boolean rtlAware;
    private final boolean shouldAutoInvalidate;

    /* renamed from: x, reason: collision with root package name */
    private float f4101x;

    /* renamed from: y, reason: collision with root package name */
    private float f4102y;

    public /* synthetic */ OffsetNode(float f11, float f12, boolean z11, v vVar) {
        this(f11, f12, z11);
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    /* renamed from: getX-D9Ej5fM, reason: not valid java name */
    public final float m687getXD9Ej5fM() {
        return this.f4101x;
    }

    /* renamed from: getY-D9Ej5fM, reason: not valid java name */
    public final float m688getYD9Ej5fM() {
        return this.f4102y;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @m80.k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo61measure3p2s80s(@m80.k final MeasureScope measureScope, @m80.k Measurable measurable, long j11) {
        final Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(j11);
        return MeasureScope.layout$default(measureScope, mo3857measureBRTryo0.getWidth(), mo3857measureBRTryo0.getHeight(), null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.layout.OffsetNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                if (OffsetNode.this.getRtlAware()) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, mo3857measureBRTryo0, measureScope.mo371roundToPx0680j_4(OffsetNode.this.m687getXD9Ej5fM()), measureScope.mo371roundToPx0680j_4(OffsetNode.this.m688getYD9Ej5fM()), 0.0f, 4, null);
                } else {
                    Placeable.PlacementScope.place$default(placementScope, mo3857measureBRTryo0, measureScope.mo371roundToPx0680j_4(OffsetNode.this.m687getXD9Ej5fM()), measureScope.mo371roundToPx0680j_4(OffsetNode.this.m688getYD9Ej5fM()), 0.0f, 4, null);
                }
            }
        }, 4, null);
    }

    public final void setRtlAware(boolean z11) {
        this.rtlAware = z11;
    }

    /* renamed from: setX-0680j_4, reason: not valid java name */
    public final void m689setX0680j_4(float f11) {
        this.f4101x = f11;
    }

    /* renamed from: setY-0680j_4, reason: not valid java name */
    public final void m690setY0680j_4(float f11) {
        this.f4102y = f11;
    }

    /* renamed from: update-Md-fbLM, reason: not valid java name */
    public final void m691updateMdfbLM(float f11, float f12, boolean z11) {
        if (!Dp.m5120equalsimpl0(this.f4101x, f11) || !Dp.m5120equalsimpl0(this.f4102y, f12) || this.rtlAware != z11) {
            LayoutModifierNodeKt.invalidatePlacement(this);
        }
        this.f4101x = f11;
        this.f4102y = f12;
        this.rtlAware = z11;
    }

    private OffsetNode(float f11, float f12, boolean z11) {
        this.f4101x = f11;
        this.f4102y = f12;
        this.rtlAware = z11;
    }
}
