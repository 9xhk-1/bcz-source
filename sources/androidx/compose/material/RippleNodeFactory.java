package androidx.compose.material;

import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
final class RippleNodeFactory implements IndicationNodeFactory {
    private final boolean bounded;
    private final long color;

    @l
    private final ColorProducer colorProducer;
    private final float radius;

    public /* synthetic */ RippleNodeFactory(boolean z11, float f11, long j11, v vVar) {
        this(z11, f11, j11);
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    @k
    public DelegatableNode create(@k InteractionSource interactionSource) {
        ColorProducer colorProducer = this.colorProducer;
        if (colorProducer == null) {
            colorProducer = new ColorProducer() { // from class: androidx.compose.material.RippleNodeFactory$create$colorProducer$1
                @Override // androidx.compose.ui.graphics.ColorProducer
                /* renamed from: invoke-0d7_KjU */
                public final long mo1642invoke0d7_KjU() {
                    long j11;
                    j11 = RippleNodeFactory.this.color;
                    return j11;
                }
            };
        }
        return new DelegatingThemeAwareRippleNode(interactionSource, this.bounded, this.radius, colorProducer, null);
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RippleNodeFactory)) {
            return false;
        }
        RippleNodeFactory rippleNodeFactory = (RippleNodeFactory) obj;
        if (this.bounded == rippleNodeFactory.bounded && Dp.m5120equalsimpl0(this.radius, rippleNodeFactory.radius) && g0.g(this.colorProducer, rippleNodeFactory.colorProducer)) {
            return Color.m2510equalsimpl0(this.color, rippleNodeFactory.color);
        }
        return false;
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public int hashCode() {
        int hashCode = ((Boolean.hashCode(this.bounded) * 31) + Dp.m5121hashCodeimpl(this.radius)) * 31;
        ColorProducer colorProducer = this.colorProducer;
        return ((hashCode + (colorProducer != null ? colorProducer.hashCode() : 0)) * 31) + Color.m2516hashCodeimpl(this.color);
    }

    public /* synthetic */ RippleNodeFactory(boolean z11, float f11, ColorProducer colorProducer, v vVar) {
        this(z11, f11, colorProducer);
    }

    private RippleNodeFactory(boolean z11, float f11, ColorProducer colorProducer, long j11) {
        this.bounded = z11;
        this.radius = f11;
        this.colorProducer = colorProducer;
        this.color = j11;
    }

    private RippleNodeFactory(boolean z11, float f11, ColorProducer colorProducer) {
        this(z11, f11, colorProducer, Color.Companion.m2545getUnspecified0d7_KjU());
    }

    private RippleNodeFactory(boolean z11, float f11, long j11) {
        this(z11, f11, (ColorProducer) null, j11);
    }
}
