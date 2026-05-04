package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingElement\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/layout/internal/InlineClassHelperKt\n*L\n1#1,472:1\n102#2:473\n102#2:474\n102#2:475\n102#2:476\n113#2:482\n113#2:483\n113#2:484\n113#2:485\n92#3,5:477\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingElement\n*L\n341#1:473\n342#1:474\n343#1:475\n344#1:476\n331#1:482\n332#1:483\n333#1:484\n334#1:485\n340#1:477,5\n*E\n"})
/* loaded from: classes.dex */
final class PaddingElement extends ModifierNodeElement<PaddingNode> {
    private float bottom;
    private float end;

    @m80.k
    private final l<InspectorInfo, g2> inspectorInfo;
    private boolean rtlAware;
    private float start;
    private float top;

    public /* synthetic */ PaddingElement(float f11, float f12, float f13, float f14, boolean z11, l lVar, v vVar) {
        this(f11, f12, f13, f14, z11, lVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m80.l Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && Dp.m5120equalsimpl0(this.start, paddingElement.start) && Dp.m5120equalsimpl0(this.top, paddingElement.top) && Dp.m5120equalsimpl0(this.end, paddingElement.end) && Dp.m5120equalsimpl0(this.bottom, paddingElement.bottom) && this.rtlAware == paddingElement.rtlAware;
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m711getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getEnd-D9Ej5fM, reason: not valid java name */
    public final float m712getEndD9Ej5fM() {
        return this.end;
    }

    @m80.k
    public final l<InspectorInfo, g2> getInspectorInfo() {
        return this.inspectorInfo;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    /* renamed from: getStart-D9Ej5fM, reason: not valid java name */
    public final float m713getStartD9Ej5fM() {
        return this.start;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m714getTopD9Ej5fM() {
        return this.top;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((((Dp.m5121hashCodeimpl(this.start) * 31) + Dp.m5121hashCodeimpl(this.top)) * 31) + Dp.m5121hashCodeimpl(this.end)) * 31) + Dp.m5121hashCodeimpl(this.bottom)) * 31) + Boolean.hashCode(this.rtlAware);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@m80.k InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    /* renamed from: setBottom-0680j_4, reason: not valid java name */
    public final void m715setBottom0680j_4(float f11) {
        this.bottom = f11;
    }

    /* renamed from: setEnd-0680j_4, reason: not valid java name */
    public final void m716setEnd0680j_4(float f11) {
        this.end = f11;
    }

    public final void setRtlAware(boolean z11) {
        this.rtlAware = z11;
    }

    /* renamed from: setStart-0680j_4, reason: not valid java name */
    public final void m717setStart0680j_4(float f11) {
        this.start = f11;
    }

    /* renamed from: setTop-0680j_4, reason: not valid java name */
    public final void m718setTop0680j_4(float f11) {
        this.top = f11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private PaddingElement(float f11, float f12, float f13, float f14, boolean z11, l<? super InspectorInfo, g2> lVar) {
        this.start = f11;
        this.top = f12;
        this.end = f13;
        this.bottom = f14;
        this.rtlAware = z11;
        this.inspectorInfo = lVar;
        boolean z12 = true;
        boolean z13 = f11 >= 0.0f || Float.isNaN(f11);
        float f15 = this.top;
        boolean z14 = z13 & (f15 >= 0.0f || Float.isNaN(f15));
        float f16 = this.end;
        boolean z15 = z14 & (f16 >= 0.0f || Float.isNaN(f16));
        float f17 = this.bottom;
        if (f17 < 0.0f && !Float.isNaN(f17)) {
            z12 = false;
        }
        if (!z15 || !z12) {
            InlineClassHelperKt.throwIllegalArgumentException("Padding must be non-negative");
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @m80.k
    public PaddingNode create() {
        return new PaddingNode(this.start, this.top, this.end, this.bottom, this.rtlAware, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@m80.k PaddingNode paddingNode) {
        paddingNode.m737setStart0680j_4(this.start);
        paddingNode.m738setTop0680j_4(this.top);
        paddingNode.m736setEnd0680j_4(this.end);
        paddingNode.m735setBottom0680j_4(this.bottom);
        paddingNode.setRtlAware(this.rtlAware);
    }

    public /* synthetic */ PaddingElement(float f11, float f12, float f13, float f14, boolean z11, l lVar, int i11, v vVar) {
        this((i11 & 1) != 0 ? Dp.m5115constructorimpl(0) : f11, (i11 & 2) != 0 ? Dp.m5115constructorimpl(0) : f12, (i11 & 4) != 0 ? Dp.m5115constructorimpl(0) : f13, (i11 & 8) != 0 ? Dp.m5115constructorimpl(0) : f14, z11, lVar, null);
    }
}
