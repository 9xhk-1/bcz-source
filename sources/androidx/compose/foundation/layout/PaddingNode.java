package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingNode\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,472:1\n113#2:473\n113#2:474\n113#2:475\n113#2:476\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingNode\n*L\n386#1:473\n387#1:474\n388#1:475\n389#1:476\n*E\n"})
/* loaded from: classes.dex */
final class PaddingNode extends Modifier.Node implements LayoutModifierNode {
    private float bottom;
    private float end;
    private boolean rtlAware;
    private float start;
    private float top;

    public /* synthetic */ PaddingNode(float f11, float f12, float f13, float f14, boolean z11, v vVar) {
        this(f11, f12, f13, f14, z11);
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m731getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getEnd-D9Ej5fM, reason: not valid java name */
    public final float m732getEndD9Ej5fM() {
        return this.end;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    /* renamed from: getStart-D9Ej5fM, reason: not valid java name */
    public final float m733getStartD9Ej5fM() {
        return this.start;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m734getTopD9Ej5fM() {
        return this.top;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @m80.k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo61measure3p2s80s(@m80.k final MeasureScope measureScope, @m80.k Measurable measurable, long j11) {
        int mo371roundToPx0680j_4 = measureScope.mo371roundToPx0680j_4(this.start) + measureScope.mo371roundToPx0680j_4(this.end);
        int mo371roundToPx0680j_42 = measureScope.mo371roundToPx0680j_4(this.top) + measureScope.mo371roundToPx0680j_4(this.bottom);
        final Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(ConstraintsKt.m5087offsetNN6EwU(j11, -mo371roundToPx0680j_4, -mo371roundToPx0680j_42));
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m5085constrainWidthK40F9xA(j11, mo3857measureBRTryo0.getWidth() + mo371roundToPx0680j_4), ConstraintsKt.m5084constrainHeightK40F9xA(j11, mo3857measureBRTryo0.getHeight() + mo371roundToPx0680j_42), null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.layout.PaddingNode$measure$1
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
                if (PaddingNode.this.getRtlAware()) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, mo3857measureBRTryo0, measureScope.mo371roundToPx0680j_4(PaddingNode.this.m733getStartD9Ej5fM()), measureScope.mo371roundToPx0680j_4(PaddingNode.this.m734getTopD9Ej5fM()), 0.0f, 4, null);
                } else {
                    Placeable.PlacementScope.place$default(placementScope, mo3857measureBRTryo0, measureScope.mo371roundToPx0680j_4(PaddingNode.this.m733getStartD9Ej5fM()), measureScope.mo371roundToPx0680j_4(PaddingNode.this.m734getTopD9Ej5fM()), 0.0f, 4, null);
                }
            }
        }, 4, null);
    }

    /* renamed from: setBottom-0680j_4, reason: not valid java name */
    public final void m735setBottom0680j_4(float f11) {
        this.bottom = f11;
    }

    /* renamed from: setEnd-0680j_4, reason: not valid java name */
    public final void m736setEnd0680j_4(float f11) {
        this.end = f11;
    }

    public final void setRtlAware(boolean z11) {
        this.rtlAware = z11;
    }

    /* renamed from: setStart-0680j_4, reason: not valid java name */
    public final void m737setStart0680j_4(float f11) {
        this.start = f11;
    }

    /* renamed from: setTop-0680j_4, reason: not valid java name */
    public final void m738setTop0680j_4(float f11) {
        this.top = f11;
    }

    private PaddingNode(float f11, float f12, float f13, float f14, boolean z11) {
        this.start = f11;
        this.top = f12;
        this.end = f13;
        this.bottom = f14;
        this.rtlAware = z11;
    }

    public /* synthetic */ PaddingNode(float f11, float f12, float f13, float f14, boolean z11, int i11, v vVar) {
        this((i11 & 1) != 0 ? Dp.m5115constructorimpl(0) : f11, (i11 & 2) != 0 ? Dp.m5115constructorimpl(0) : f12, (i11 & 4) != 0 ? Dp.m5115constructorimpl(0) : f13, (i11 & 8) != 0 ? Dp.m5115constructorimpl(0) : f14, z11, null);
    }
}
