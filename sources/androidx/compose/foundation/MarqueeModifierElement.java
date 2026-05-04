package androidx.compose.foundation;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class MarqueeModifierElement extends ModifierNodeElement<MarqueeModifierNode> {
    private final int animationMode;
    private final int delayMillis;
    private final int initialDelayMillis;
    private final int iterations;

    @m80.k
    private final MarqueeSpacing spacing;
    private final float velocity;

    public /* synthetic */ MarqueeModifierElement(int i11, int i12, int i13, int i14, MarqueeSpacing marqueeSpacing, float f11, v vVar) {
        this(i11, i12, i13, i14, marqueeSpacing, f11);
    }

    private final int component1() {
        return this.iterations;
    }

    /* renamed from: component2-ZbEOnfQ, reason: not valid java name */
    private final int m317component2ZbEOnfQ() {
        return this.animationMode;
    }

    private final int component3() {
        return this.delayMillis;
    }

    private final int component4() {
        return this.initialDelayMillis;
    }

    private final MarqueeSpacing component5() {
        return this.spacing;
    }

    /* renamed from: component6-D9Ej5fM, reason: not valid java name */
    private final float m318component6D9Ej5fM() {
        return this.velocity;
    }

    /* renamed from: copy-lWfNwf4$default, reason: not valid java name */
    public static /* synthetic */ MarqueeModifierElement m319copylWfNwf4$default(MarqueeModifierElement marqueeModifierElement, int i11, int i12, int i13, int i14, MarqueeSpacing marqueeSpacing, float f11, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = marqueeModifierElement.iterations;
        }
        if ((i15 & 2) != 0) {
            i12 = marqueeModifierElement.animationMode;
        }
        if ((i15 & 4) != 0) {
            i13 = marqueeModifierElement.delayMillis;
        }
        if ((i15 & 8) != 0) {
            i14 = marqueeModifierElement.initialDelayMillis;
        }
        if ((i15 & 16) != 0) {
            marqueeSpacing = marqueeModifierElement.spacing;
        }
        if ((i15 & 32) != 0) {
            f11 = marqueeModifierElement.velocity;
        }
        MarqueeSpacing marqueeSpacing2 = marqueeSpacing;
        float f12 = f11;
        return marqueeModifierElement.m320copylWfNwf4(i11, i12, i13, i14, marqueeSpacing2, f12);
    }

    @m80.k
    /* renamed from: copy-lWfNwf4, reason: not valid java name */
    public final MarqueeModifierElement m320copylWfNwf4(int i11, int i12, int i13, int i14, @m80.k MarqueeSpacing marqueeSpacing, float f11) {
        return new MarqueeModifierElement(i11, i12, i13, i14, marqueeSpacing, f11, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarqueeModifierElement)) {
            return false;
        }
        MarqueeModifierElement marqueeModifierElement = (MarqueeModifierElement) obj;
        return this.iterations == marqueeModifierElement.iterations && MarqueeAnimationMode.m310equalsimpl0(this.animationMode, marqueeModifierElement.animationMode) && this.delayMillis == marqueeModifierElement.delayMillis && this.initialDelayMillis == marqueeModifierElement.initialDelayMillis && g0.g(this.spacing, marqueeModifierElement.spacing) && Dp.m5120equalsimpl0(this.velocity, marqueeModifierElement.velocity);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((((((Integer.hashCode(this.iterations) * 31) + MarqueeAnimationMode.m311hashCodeimpl(this.animationMode)) * 31) + Integer.hashCode(this.delayMillis)) * 31) + Integer.hashCode(this.initialDelayMillis)) * 31) + this.spacing.hashCode()) * 31) + Dp.m5121hashCodeimpl(this.velocity);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@m80.k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("basicMarquee");
        inspectorInfo.getProperties().set("iterations", Integer.valueOf(this.iterations));
        inspectorInfo.getProperties().set("animationMode", MarqueeAnimationMode.m307boximpl(this.animationMode));
        inspectorInfo.getProperties().set("delayMillis", Integer.valueOf(this.delayMillis));
        inspectorInfo.getProperties().set("initialDelayMillis", Integer.valueOf(this.initialDelayMillis));
        inspectorInfo.getProperties().set("spacing", this.spacing);
        inspectorInfo.getProperties().set("velocity", Dp.m5113boximpl(this.velocity));
    }

    @m80.k
    public String toString() {
        return "MarqueeModifierElement(iterations=" + this.iterations + ", animationMode=" + ((Object) MarqueeAnimationMode.m312toStringimpl(this.animationMode)) + ", delayMillis=" + this.delayMillis + ", initialDelayMillis=" + this.initialDelayMillis + ", spacing=" + this.spacing + ", velocity=" + ((Object) Dp.m5126toStringimpl(this.velocity)) + ')';
    }

    private MarqueeModifierElement(int i11, int i12, int i13, int i14, MarqueeSpacing marqueeSpacing, float f11) {
        this.iterations = i11;
        this.animationMode = i12;
        this.delayMillis = i13;
        this.initialDelayMillis = i14;
        this.spacing = marqueeSpacing;
        this.velocity = f11;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @m80.k
    public MarqueeModifierNode create() {
        return new MarqueeModifierNode(this.iterations, this.animationMode, this.delayMillis, this.initialDelayMillis, this.spacing, this.velocity, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@m80.k MarqueeModifierNode marqueeModifierNode) {
        marqueeModifierNode.m323updatelWfNwf4(this.iterations, this.animationMode, this.delayMillis, this.initialDelayMillis, this.spacing, this.velocity);
    }
}
