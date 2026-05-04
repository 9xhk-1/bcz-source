package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.v;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class OffsetElement extends ModifierNodeElement<OffsetNode> {

    @m80.k
    private final l<InspectorInfo, g2> inspectorInfo;
    private final boolean rtlAware;

    /* renamed from: x, reason: collision with root package name */
    private final float f4099x;

    /* renamed from: y, reason: collision with root package name */
    private final float f4100y;

    public /* synthetic */ OffsetElement(float f11, float f12, boolean z11, l lVar, v vVar) {
        this(f11, f12, z11, lVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetElement offsetElement = obj instanceof OffsetElement ? (OffsetElement) obj : null;
        return offsetElement != null && Dp.m5120equalsimpl0(this.f4099x, offsetElement.f4099x) && Dp.m5120equalsimpl0(this.f4100y, offsetElement.f4100y) && this.rtlAware == offsetElement.rtlAware;
    }

    @m80.k
    public final l<InspectorInfo, g2> getInspectorInfo() {
        return this.inspectorInfo;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    /* renamed from: getX-D9Ej5fM, reason: not valid java name */
    public final float m681getXD9Ej5fM() {
        return this.f4099x;
    }

    /* renamed from: getY-D9Ej5fM, reason: not valid java name */
    public final float m682getYD9Ej5fM() {
        return this.f4100y;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((Dp.m5121hashCodeimpl(this.f4099x) * 31) + Dp.m5121hashCodeimpl(this.f4100y)) * 31) + Boolean.hashCode(this.rtlAware);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@m80.k InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    @m80.k
    public String toString() {
        return "OffsetModifierElement(x=" + ((Object) Dp.m5126toStringimpl(this.f4099x)) + ", y=" + ((Object) Dp.m5126toStringimpl(this.f4100y)) + ", rtlAware=" + this.rtlAware + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    private OffsetElement(float f11, float f12, boolean z11, l<? super InspectorInfo, g2> lVar) {
        this.f4099x = f11;
        this.f4100y = f12;
        this.rtlAware = z11;
        this.inspectorInfo = lVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @m80.k
    public OffsetNode create() {
        return new OffsetNode(this.f4099x, this.f4100y, this.rtlAware, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@m80.k OffsetNode offsetNode) {
        offsetNode.m691updateMdfbLM(this.f4099x, this.f4100y, this.rtlAware);
    }
}
