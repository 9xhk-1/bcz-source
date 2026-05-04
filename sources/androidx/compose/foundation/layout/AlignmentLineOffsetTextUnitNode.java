package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAlignmentLine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineOffsetTextUnitNode\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n1#1,364:1\n247#2:365\n247#2:366\n*S KotlinDebug\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineOffsetTextUnitNode\n*L\n296#1:365\n297#1:366\n*E\n"})
/* loaded from: classes.dex */
final class AlignmentLineOffsetTextUnitNode extends Modifier.Node implements LayoutModifierNode {
    private long after;

    @m80.k
    private AlignmentLine alignmentLine;
    private long before;

    public /* synthetic */ AlignmentLineOffsetTextUnitNode(AlignmentLine alignmentLine, long j11, long j12, v vVar) {
        this(alignmentLine, j11, j12);
    }

    /* renamed from: getAfter-XSAIIZE, reason: not valid java name */
    public final long m593getAfterXSAIIZE() {
        return this.after;
    }

    @m80.k
    public final AlignmentLine getAlignmentLine() {
        return this.alignmentLine;
    }

    /* renamed from: getBefore-XSAIIZE, reason: not valid java name */
    public final long m594getBeforeXSAIIZE() {
        return this.before;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @m80.k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo61measure3p2s80s(@m80.k MeasureScope measureScope, @m80.k Measurable measurable, long j11) {
        MeasureResult m576alignmentLineOffsetMeasuretjqqzMA;
        m576alignmentLineOffsetMeasuretjqqzMA = AlignmentLineKt.m576alignmentLineOffsetMeasuretjqqzMA(measureScope, this.alignmentLine, TextUnit.m5307getRawTypeimpl(this.before) == 0 ? Dp.Companion.m5135getUnspecifiedD9Ej5fM() : measureScope.mo372toDpGaN1DYA(this.before), TextUnit.m5307getRawTypeimpl(this.after) == 0 ? Dp.Companion.m5135getUnspecifiedD9Ej5fM() : measureScope.mo372toDpGaN1DYA(this.after), measurable, j11);
        return m576alignmentLineOffsetMeasuretjqqzMA;
    }

    /* renamed from: setAfter--R2X_6o, reason: not valid java name */
    public final void m595setAfterR2X_6o(long j11) {
        this.after = j11;
    }

    public final void setAlignmentLine(@m80.k AlignmentLine alignmentLine) {
        this.alignmentLine = alignmentLine;
    }

    /* renamed from: setBefore--R2X_6o, reason: not valid java name */
    public final void m596setBeforeR2X_6o(long j11) {
        this.before = j11;
    }

    private AlignmentLineOffsetTextUnitNode(AlignmentLine alignmentLine, long j11, long j12) {
        this.alignmentLine = alignmentLine;
        this.before = j11;
        this.after = j12;
    }
}
