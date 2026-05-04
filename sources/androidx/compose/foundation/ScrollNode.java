package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import g10.u;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ScrollNode extends Modifier.Node implements LayoutModifierNode, SemanticsModifierNode {
    public static final int $stable = 8;
    private boolean isVertical;
    private boolean reverseScrolling;

    @m80.k
    private ScrollState state;

    public ScrollNode(@m80.k ScrollState scrollState, boolean z11, boolean z12) {
        this.state = scrollState;
        this.reverseScrolling = z11;
        this.isVertical = z12;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(@m80.k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        ScrollAxisRange scrollAxisRange = new ScrollAxisRange(new x00.a<Float>() { // from class: androidx.compose.foundation.ScrollNode$applySemantics$accessibilityScrollState$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Float invoke() {
                return Float.valueOf(ScrollNode.this.getState().getValue());
            }
        }, new x00.a<Float>() { // from class: androidx.compose.foundation.ScrollNode$applySemantics$accessibilityScrollState$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Float invoke() {
                return Float.valueOf(ScrollNode.this.getState().getMaxValue());
            }
        }, this.reverseScrolling);
        if (this.isVertical) {
            SemanticsPropertiesKt.setVerticalScrollAxisRange(semanticsPropertyReceiver, scrollAxisRange);
        } else {
            SemanticsPropertiesKt.setHorizontalScrollAxisRange(semanticsPropertyReceiver, scrollAxisRange);
        }
    }

    public final boolean getReverseScrolling() {
        return this.reverseScrolling;
    }

    @m80.k
    public final ScrollState getState() {
        return this.state;
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        if (!this.isVertical) {
            i11 = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.maxIntrinsicHeight(i11);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        if (this.isVertical) {
            i11 = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.maxIntrinsicWidth(i11);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @m80.k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo61measure3p2s80s(@m80.k MeasureScope measureScope, @m80.k Measurable measurable, long j11) {
        CheckScrollableContainerConstraintsKt.m263checkScrollableContainerConstraintsK40F9xA(j11, this.isVertical ? Orientation.Vertical : Orientation.Horizontal);
        final Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(Constraints.m5058copyZbe2FdA$default(j11, 0, this.isVertical ? Constraints.m5068getMaxWidthimpl(j11) : Integer.MAX_VALUE, 0, this.isVertical ? Integer.MAX_VALUE : Constraints.m5067getMaxHeightimpl(j11), 5, null));
        int B = u.B(mo3857measureBRTryo0.getWidth(), Constraints.m5068getMaxWidthimpl(j11));
        int B2 = u.B(mo3857measureBRTryo0.getHeight(), Constraints.m5067getMaxHeightimpl(j11));
        final int height = mo3857measureBRTryo0.getHeight() - B2;
        int width = mo3857measureBRTryo0.getWidth() - B;
        if (!this.isVertical) {
            height = width;
        }
        this.state.setMaxValue$foundation_release(height);
        this.state.setViewportSize$foundation_release(this.isVertical ? B2 : B);
        return MeasureScope.layout$default(measureScope, B, B2, null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.ScrollNode$measure$1
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
                int value = ScrollNode.this.getState().getValue();
                int i11 = height;
                if (value < 0) {
                    value = 0;
                }
                if (value <= i11) {
                    i11 = value;
                }
                int i12 = ScrollNode.this.getReverseScrolling() ? i11 - height : -i11;
                final int i13 = ScrollNode.this.isVertical() ? 0 : i12;
                final int i14 = ScrollNode.this.isVertical() ? i12 : 0;
                final Placeable placeable = mo3857measureBRTryo0;
                placementScope.withMotionFrameOfReferencePlacement(new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.ScrollNode$measure$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public /* bridge */ /* synthetic */ g2 invoke(Placeable.PlacementScope placementScope2) {
                        invoke2(placementScope2);
                        return g2.f100423a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Placeable.PlacementScope placementScope2) {
                        Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope2, Placeable.this, i13, i14, 0.0f, (l) null, 12, (Object) null);
                    }
                });
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        if (!this.isVertical) {
            i11 = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.minIntrinsicHeight(i11);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        if (this.isVertical) {
            i11 = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.minIntrinsicWidth(i11);
    }

    public final void setReverseScrolling(boolean z11) {
        this.reverseScrolling = z11;
    }

    public final void setState(@m80.k ScrollState scrollState) {
        this.state = scrollState;
    }

    public final void setVertical(boolean z11) {
        this.isVertical = z11;
    }
}
