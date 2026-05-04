package androidx.compose.material.ripple;

import androidx.compose.foundation.IndicationInstance;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import c40.r0;
import kotlin.jvm.internal.u0;
import m80.k;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@n(message = "Replaced by the new RippleNode implementation")
@u0({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/RippleIndicationInstance\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,530:1\n132#2:531\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/RippleIndicationInstance\n*L\n294#1:531\n*E\n"})
/* loaded from: classes.dex */
public abstract class RippleIndicationInstance implements IndicationInstance {
    public static final int $stable = 8;
    private final boolean bounded;

    @k
    private final StateLayer stateLayer;

    public RippleIndicationInstance(boolean z11, @k final State<RippleAlpha> state) {
        this.bounded = z11;
        this.stateLayer = new StateLayer(z11, new x00.a<RippleAlpha>() { // from class: androidx.compose.material.ripple.RippleIndicationInstance$stateLayer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final RippleAlpha invoke() {
                return state.getValue();
            }
        });
    }

    public abstract void addRipple(@k PressInteraction.Press press, @k r0 r0Var);

    /* renamed from: drawStateLayer-H2RKhps, reason: not valid java name */
    public final void m1874drawStateLayerH2RKhps(@k DrawScope drawScope, float f11, long j11) {
        this.stateLayer.m1882drawStateLayermxwnekA(drawScope, Float.isNaN(f11) ? RippleAnimationKt.m1870getRippleEndRadiuscSwnlzA(drawScope, this.bounded, drawScope.mo3060getSizeNHjbRc()) : drawScope.mo377toPx0680j_4(f11), j11);
    }

    public abstract void removeRipple(@k PressInteraction.Press press);

    public final void updateStateLayer$material_ripple(@k Interaction interaction, @k r0 r0Var) {
        this.stateLayer.handleInteraction$material_ripple(interaction, r0Var);
    }
}
