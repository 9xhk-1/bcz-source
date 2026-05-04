package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAlignmentLine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineOffsetDpElement\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/layout/internal/InlineClassHelperKt\n*L\n1#1,364:1\n102#2:365\n102#2:366\n92#3,5:367\n*S KotlinDebug\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineOffsetDpElement\n*L\n196#1:365\n197#1:366\n195#1:367,5\n*E\n"})
/* loaded from: classes.dex */
final class AlignmentLineOffsetDpElement extends ModifierNodeElement<AlignmentLineOffsetDpNode> {
    private final float after;

    @m80.k
    private final AlignmentLine alignmentLine;
    private final float before;

    @m80.k
    private final l<InspectorInfo, g2> inspectorInfo;

    public /* synthetic */ AlignmentLineOffsetDpElement(AlignmentLine alignmentLine, float f11, float f12, l lVar, v vVar) {
        this(alignmentLine, f11, f12, lVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        AlignmentLineOffsetDpElement alignmentLineOffsetDpElement = obj instanceof AlignmentLineOffsetDpElement ? (AlignmentLineOffsetDpElement) obj : null;
        return alignmentLineOffsetDpElement != null && g0.g(this.alignmentLine, alignmentLineOffsetDpElement.alignmentLine) && Dp.m5120equalsimpl0(this.before, alignmentLineOffsetDpElement.before) && Dp.m5120equalsimpl0(this.after, alignmentLineOffsetDpElement.after);
    }

    /* renamed from: getAfter-D9Ej5fM, reason: not valid java name */
    public final float m585getAfterD9Ej5fM() {
        return this.after;
    }

    @m80.k
    public final AlignmentLine getAlignmentLine() {
        return this.alignmentLine;
    }

    /* renamed from: getBefore-D9Ej5fM, reason: not valid java name */
    public final float m586getBeforeD9Ej5fM() {
        return this.before;
    }

    @m80.k
    public final l<InspectorInfo, g2> getInspectorInfo() {
        return this.inspectorInfo;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((this.alignmentLine.hashCode() * 31) + Dp.m5121hashCodeimpl(this.before)) * 31) + Dp.m5121hashCodeimpl(this.after);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@m80.k InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AlignmentLineOffsetDpElement(AlignmentLine alignmentLine, float f11, float f12, l<? super InspectorInfo, g2> lVar) {
        this.alignmentLine = alignmentLine;
        this.before = f11;
        this.after = f12;
        this.inspectorInfo = lVar;
        boolean z11 = true;
        boolean z12 = f11 >= 0.0f || Float.isNaN(f11);
        if (f12 < 0.0f && !Float.isNaN(f12)) {
            z11 = false;
        }
        if (!z12 || !z11) {
            InlineClassHelperKt.throwIllegalArgumentException("Padding from alignment line must be a non-negative number");
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @m80.k
    public AlignmentLineOffsetDpNode create() {
        return new AlignmentLineOffsetDpNode(this.alignmentLine, this.before, this.after, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@m80.k AlignmentLineOffsetDpNode alignmentLineOffsetDpNode) {
        alignmentLineOffsetDpNode.setAlignmentLine(this.alignmentLine);
        alignmentLineOffsetDpNode.m590setBefore0680j_4(this.before);
        alignmentLineOffsetDpNode.m589setAfter0680j_4(this.after);
    }
}
