package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import c40.r0;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@n(message = "Replaced by the new RippleNode implementation")
@u0({"SMAP\nCommonRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonRipple.kt\nandroidx/compose/material/ripple/CommonRippleIndicationInstance\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,173:1\n132#2:174\n215#3,2:175\n215#3,2:177\n*S KotlinDebug\n*F\n+ 1 CommonRipple.kt\nandroidx/compose/material/ripple/CommonRippleIndicationInstance\n*L\n121#1:174\n134#1:175,2\n153#1:177,2\n*E\n"})
/* loaded from: classes.dex */
final class CommonRippleIndicationInstance extends RippleIndicationInstance implements RememberObserver {
    private final boolean bounded;

    @k
    private final State<Color> color;
    private final float radius;

    @k
    private final State<RippleAlpha> rippleAlpha;

    @k
    private final SnapshotStateMap<PressInteraction.Press, RippleAnimation> ripples;
    private float targetRadius;

    public /* synthetic */ CommonRippleIndicationInstance(boolean z11, float f11, State state, State state2, v vVar) {
        this(z11, f11, state, state2);
    }

    /* renamed from: drawRipples-4WTKRHQ, reason: not valid java name */
    private final void m1867drawRipples4WTKRHQ(DrawScope drawScope, long j11) {
        long j12;
        Iterator<Map.Entry<PressInteraction.Press, RippleAnimation>> it = this.ripples.entrySet().iterator();
        while (it.hasNext()) {
            RippleAnimation value = it.next().getValue();
            float pressedAlpha = this.rippleAlpha.getValue().getPressedAlpha();
            if (pressedAlpha == 0.0f) {
                j12 = j11;
            } else {
                j12 = j11;
                value.m1869draw4WTKRHQ(drawScope, Color.m2508copywmQWz5c$default(j12, pressedAlpha, 0.0f, 0.0f, 0.0f, 14, null));
            }
            j11 = j12;
        }
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void addRipple(@k PressInteraction.Press press, @k r0 r0Var) {
        Iterator<Map.Entry<PressInteraction.Press, RippleAnimation>> it = this.ripples.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().finish();
        }
        RippleAnimation rippleAnimation = new RippleAnimation(this.bounded ? Offset.m2257boximpl(press.m548getPressPositionF1C5BW0()) : null, this.targetRadius, this.bounded, null);
        this.ripples.put(press, rippleAnimation);
        c40.k.f(r0Var, null, null, new CommonRippleIndicationInstance$addRipple$2(rippleAnimation, this, press, null), 3, null);
    }

    @Override // androidx.compose.foundation.IndicationInstance
    public void drawIndication(@k ContentDrawScope contentDrawScope) {
        this.targetRadius = Float.isNaN(this.radius) ? RippleAnimationKt.m1870getRippleEndRadiuscSwnlzA(contentDrawScope, this.bounded, contentDrawScope.mo3060getSizeNHjbRc()) : contentDrawScope.mo377toPx0680j_4(this.radius);
        long m2519unboximpl = this.color.getValue().m2519unboximpl();
        contentDrawScope.drawContent();
        m1874drawStateLayerH2RKhps(contentDrawScope, this.radius, m2519unboximpl);
        m1867drawRipples4WTKRHQ(contentDrawScope, m2519unboximpl);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        this.ripples.clear();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        this.ripples.clear();
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void removeRipple(@k PressInteraction.Press press) {
        RippleAnimation rippleAnimation = this.ripples.get(press);
        if (rippleAnimation != null) {
            rippleAnimation.finish();
        }
    }

    private CommonRippleIndicationInstance(boolean z11, float f11, State<Color> state, State<RippleAlpha> state2) {
        super(z11, state2);
        this.bounded = z11;
        this.radius = f11;
        this.color = state;
        this.rippleAlpha = state2;
        this.ripples = SnapshotStateKt.mutableStateMapOf();
        this.targetRadius = Float.NaN;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }
}
