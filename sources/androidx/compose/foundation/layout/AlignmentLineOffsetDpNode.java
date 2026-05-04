package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.LayoutModifierNode;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class AlignmentLineOffsetDpNode extends Modifier.Node implements LayoutModifierNode {
    private float after;

    @m80.k
    private AlignmentLine alignmentLine;
    private float before;

    public /* synthetic */ AlignmentLineOffsetDpNode(AlignmentLine alignmentLine, float f11, float f12, v vVar) {
        this(alignmentLine, f11, f12);
    }

    /* renamed from: getAfter-D9Ej5fM, reason: not valid java name */
    public final float m587getAfterD9Ej5fM() {
        return this.after;
    }

    @m80.k
    public final AlignmentLine getAlignmentLine() {
        return this.alignmentLine;
    }

    /* renamed from: getBefore-D9Ej5fM, reason: not valid java name */
    public final float m588getBeforeD9Ej5fM() {
        return this.before;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @m80.k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo61measure3p2s80s(@m80.k MeasureScope measureScope, @m80.k Measurable measurable, long j11) {
        MeasureResult m576alignmentLineOffsetMeasuretjqqzMA;
        m576alignmentLineOffsetMeasuretjqqzMA = AlignmentLineKt.m576alignmentLineOffsetMeasuretjqqzMA(measureScope, this.alignmentLine, this.before, this.after, measurable, j11);
        return m576alignmentLineOffsetMeasuretjqqzMA;
    }

    /* renamed from: setAfter-0680j_4, reason: not valid java name */
    public final void m589setAfter0680j_4(float f11) {
        this.after = f11;
    }

    public final void setAlignmentLine(@m80.k AlignmentLine alignmentLine) {
        this.alignmentLine = alignmentLine;
    }

    /* renamed from: setBefore-0680j_4, reason: not valid java name */
    public final void m590setBefore0680j_4(float f11) {
        this.before = f11;
    }

    private AlignmentLineOffsetDpNode(AlignmentLine alignmentLine, float f11, float f12) {
        this.alignmentLine = alignmentLine;
        this.before = f11;
        this.after = f12;
    }
}
