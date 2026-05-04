package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesModifier\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/layout/internal/InlineClassHelperKt\n*L\n1#1,472:1\n113#2:473\n113#2:474\n113#2:475\n113#2:476\n92#3,5:477\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesModifier\n*L\n451#1:473\n452#1:474\n453#1:475\n454#1:476\n450#1:477,5\n*E\n"})
/* loaded from: classes.dex */
final class PaddingValuesModifier extends Modifier.Node implements LayoutModifierNode {

    @m80.k
    private PaddingValues paddingValues;

    public PaddingValuesModifier(@m80.k PaddingValues paddingValues) {
        this.paddingValues = paddingValues;
    }

    @m80.k
    public final PaddingValues getPaddingValues() {
        return this.paddingValues;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @m80.k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo61measure3p2s80s(@m80.k MeasureScope measureScope, @m80.k Measurable measurable, long j11) {
        float mo676calculateLeftPaddingu2uoSUM = this.paddingValues.mo676calculateLeftPaddingu2uoSUM(measureScope.getLayoutDirection());
        float mo678calculateTopPaddingD9Ej5fM = this.paddingValues.mo678calculateTopPaddingD9Ej5fM();
        float mo677calculateRightPaddingu2uoSUM = this.paddingValues.mo677calculateRightPaddingu2uoSUM(measureScope.getLayoutDirection());
        float mo675calculateBottomPaddingD9Ej5fM = this.paddingValues.mo675calculateBottomPaddingD9Ej5fM();
        float f11 = 0;
        if (!((Dp.m5114compareTo0680j_4(mo675calculateBottomPaddingD9Ej5fM, Dp.m5115constructorimpl(f11)) >= 0) & (Dp.m5114compareTo0680j_4(mo676calculateLeftPaddingu2uoSUM, Dp.m5115constructorimpl(f11)) >= 0) & (Dp.m5114compareTo0680j_4(mo678calculateTopPaddingD9Ej5fM, Dp.m5115constructorimpl(f11)) >= 0) & (Dp.m5114compareTo0680j_4(mo677calculateRightPaddingu2uoSUM, Dp.m5115constructorimpl(f11)) >= 0))) {
            InlineClassHelperKt.throwIllegalArgumentException("Padding must be non-negative");
        }
        final int mo371roundToPx0680j_4 = measureScope.mo371roundToPx0680j_4(mo676calculateLeftPaddingu2uoSUM);
        int mo371roundToPx0680j_42 = measureScope.mo371roundToPx0680j_4(mo677calculateRightPaddingu2uoSUM) + mo371roundToPx0680j_4;
        final int mo371roundToPx0680j_43 = measureScope.mo371roundToPx0680j_4(mo678calculateTopPaddingD9Ej5fM);
        int mo371roundToPx0680j_44 = measureScope.mo371roundToPx0680j_4(mo675calculateBottomPaddingD9Ej5fM) + mo371roundToPx0680j_43;
        final Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(ConstraintsKt.m5087offsetNN6EwU(j11, -mo371roundToPx0680j_42, -mo371roundToPx0680j_44));
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m5085constrainWidthK40F9xA(j11, mo3857measureBRTryo0.getWidth() + mo371roundToPx0680j_42), ConstraintsKt.m5084constrainHeightK40F9xA(j11, mo3857measureBRTryo0.getHeight() + mo371roundToPx0680j_44), null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.layout.PaddingValuesModifier$measure$2
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
                Placeable.PlacementScope.place$default(placementScope, Placeable.this, mo371roundToPx0680j_4, mo371roundToPx0680j_43, 0.0f, 4, null);
            }
        }, 4, null);
    }

    public final void setPaddingValues(@m80.k PaddingValues paddingValues) {
        this.paddingValues = paddingValues;
    }
}
