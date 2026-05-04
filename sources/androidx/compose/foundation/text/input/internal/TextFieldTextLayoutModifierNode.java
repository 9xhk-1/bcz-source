package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import java.util.LinkedHashMap;
import java.util.Map;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nTextFieldTextLayoutModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldTextLayoutModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldTextLayoutModifierNode\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,183:1\n54#2:184\n54#2:186\n59#2:188\n59#2:190\n54#2:195\n59#2:197\n85#3:185\n85#3:187\n90#3:189\n90#3:191\n85#3:196\n90#3:198\n113#4:192\n26#5:193\n26#5:194\n*S KotlinDebug\n*F\n+ 1 TextFieldTextLayoutModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldTextLayoutModifierNode\n*L\n151#1:184\n152#1:186\n153#1:188\n154#1:190\n175#1:195\n176#1:197\n151#1:185\n152#1:187\n153#1:189\n154#1:191\n175#1:196\n176#1:198\n166#1:192\n170#1:193\n171#1:194\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldTextLayoutModifierNode extends Modifier.Node implements LayoutModifierNode, GlobalPositionAwareModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;

    @m80.l
    private Map<AlignmentLine, Integer> baselineCache;
    private boolean singleLine;

    @m80.k
    private TextLayoutState textLayoutState;

    public TextFieldTextLayoutModifierNode(@m80.k TextLayoutState textLayoutState, @m80.k TransformedTextFieldState transformedTextFieldState, @m80.k TextStyle textStyle, boolean z11, @m80.l x00.p<? super Density, ? super x00.a<TextLayoutResult>, g2> pVar, @m80.k KeyboardOptions keyboardOptions) {
        this.textLayoutState = textLayoutState;
        this.singleLine = z11;
        textLayoutState.setOnTextLayout(pVar);
        TextLayoutState textLayoutState2 = this.textLayoutState;
        boolean z12 = this.singleLine;
        textLayoutState2.updateNonMeasureInputs(transformedTextFieldState, textStyle, z12, !z12, keyboardOptions);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @m80.k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo61measure3p2s80s(@m80.k MeasureScope measureScope, @m80.k Measurable measurable, long j11) {
        TextLayoutResult m1302layoutWithNewMeasureInputshBUhpc = this.textLayoutState.m1302layoutWithNewMeasureInputshBUhpc(measureScope, measureScope.getLayoutDirection(), (FontFamily.Resolver) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalFontFamilyResolver()), j11);
        final Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(Constraints.Companion.m5077fitPrioritizingWidthZbe2FdA((int) (m1302layoutWithNewMeasureInputshBUhpc.m4530getSizeYbymL2g() >> 32), (int) (m1302layoutWithNewMeasureInputshBUhpc.m4530getSizeYbymL2g() >> 32), (int) (m1302layoutWithNewMeasureInputshBUhpc.m4530getSizeYbymL2g() & 4294967295L), (int) (m1302layoutWithNewMeasureInputshBUhpc.m4530getSizeYbymL2g() & 4294967295L)));
        this.textLayoutState.m1303setMinHeightForSingleLineField0680j_4(this.singleLine ? measureScope.mo374toDpu2uoSUM(TextDelegateKt.ceilToIntPx(m1302layoutWithNewMeasureInputshBUhpc.getLineBottom(0))) : Dp.m5115constructorimpl(0));
        Map<AlignmentLine, Integer> map = this.baselineCache;
        if (map == null) {
            map = new LinkedHashMap<>(2);
        }
        map.put(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(Math.round(m1302layoutWithNewMeasureInputshBUhpc.getFirstBaseline())));
        map.put(AlignmentLineKt.getLastBaseline(), Integer.valueOf(Math.round(m1302layoutWithNewMeasureInputshBUhpc.getLastBaseline())));
        this.baselineCache = map;
        int m4530getSizeYbymL2g = (int) (m1302layoutWithNewMeasureInputshBUhpc.m4530getSizeYbymL2g() >> 32);
        int m4530getSizeYbymL2g2 = (int) (m1302layoutWithNewMeasureInputshBUhpc.m4530getSizeYbymL2g() & 4294967295L);
        Map<AlignmentLine, Integer> map2 = this.baselineCache;
        kotlin.jvm.internal.g0.m(map2);
        return measureScope.layout(m4530getSizeYbymL2g, m4530getSizeYbymL2g2, map2, new x00.l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldTextLayoutModifierNode$measure$1
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
                Placeable.PlacementScope.place$default(placementScope, Placeable.this, 0, 0, 0.0f, 4, null);
            }
        });
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(@m80.k LayoutCoordinates layoutCoordinates) {
        this.textLayoutState.setTextLayoutNodeCoordinates(layoutCoordinates);
    }

    public final void updateNode(@m80.k TextLayoutState textLayoutState, @m80.k TransformedTextFieldState transformedTextFieldState, @m80.k TextStyle textStyle, boolean z11, @m80.l x00.p<? super Density, ? super x00.a<TextLayoutResult>, g2> pVar, @m80.k KeyboardOptions keyboardOptions) {
        this.textLayoutState = textLayoutState;
        textLayoutState.setOnTextLayout(pVar);
        this.singleLine = z11;
        this.textLayoutState.updateNonMeasureInputs(transformedTextFieldState, textStyle, z11, !z11, keyboardOptions);
    }

    private static /* synthetic */ void getBaselineCache$annotations() {
    }
}
