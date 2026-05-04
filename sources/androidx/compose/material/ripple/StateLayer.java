package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import c40.r0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/StateLayer\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,530:1\n225#2,8:531\n272#2,14:539\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/StateLayer\n*L\n497#1:531,8\n497#1:539,14\n*E\n"})
/* loaded from: classes.dex */
final class StateLayer {
    private final boolean bounded;

    @l
    private Interaction currentInteraction;

    @k
    private final x00.a<RippleAlpha> rippleAlpha;

    @k
    private final Animatable<Float, AnimationVector1D> animatedAlpha = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);

    @k
    private final List<Interaction> interactions = new ArrayList();

    public StateLayer(boolean z11, @k x00.a<RippleAlpha> aVar) {
        this.bounded = z11;
        this.rippleAlpha = aVar;
    }

    /* renamed from: drawStateLayer-mxwnekA, reason: not valid java name */
    public final void m1882drawStateLayermxwnekA(@k DrawScope drawScope, float f11, long j11) {
        long j12;
        float floatValue = this.animatedAlpha.getValue().floatValue();
        if (floatValue <= 0.0f) {
            return;
        }
        long m2508copywmQWz5c$default = Color.m2508copywmQWz5c$default(j11, floatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (!this.bounded) {
            DrawScope.m3041drawCircleVaOC9Bg$default(drawScope, m2508copywmQWz5c$default, f11, 0L, 0.0f, null, null, 0, 124, null);
            return;
        }
        float m2337getWidthimpl = Size.m2337getWidthimpl(drawScope.mo3060getSizeNHjbRc());
        float m2334getHeightimpl = Size.m2334getHeightimpl(drawScope.mo3060getSizeNHjbRc());
        int m2498getIntersectrtfAjoo = ClipOp.Companion.m2498getIntersectrtfAjoo();
        DrawContext drawContext = drawScope.getDrawContext();
        long mo2981getSizeNHjbRc = drawContext.mo2981getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo2984clipRectN_I0leg(0.0f, 0.0f, m2337getWidthimpl, m2334getHeightimpl, m2498getIntersectrtfAjoo);
            j12 = mo2981getSizeNHjbRc;
            try {
                DrawScope.m3041drawCircleVaOC9Bg$default(drawScope, m2508copywmQWz5c$default, f11, 0L, 0.0f, null, null, 0, 124, null);
                drawContext.getCanvas().restore();
                drawContext.mo2982setSizeuvyYCjk(j12);
            } catch (Throwable th2) {
                th = th2;
                drawContext.getCanvas().restore();
                drawContext.mo2982setSizeuvyYCjk(j12);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            j12 = mo2981getSizeNHjbRc;
        }
    }

    public final void handleInteraction$material_ripple(@k Interaction interaction, @k r0 r0Var) {
        AnimationSpec outgoingStateLayerAnimationSpecFor;
        AnimationSpec incomingStateLayerAnimationSpecFor;
        boolean z11 = interaction instanceof HoverInteraction.Enter;
        if (z11) {
            this.interactions.add(interaction);
        } else if (interaction instanceof HoverInteraction.Exit) {
            this.interactions.remove(((HoverInteraction.Exit) interaction).getEnter());
        } else if (interaction instanceof FocusInteraction.Focus) {
            this.interactions.add(interaction);
        } else if (interaction instanceof FocusInteraction.Unfocus) {
            this.interactions.remove(((FocusInteraction.Unfocus) interaction).getFocus());
        } else if (interaction instanceof DragInteraction.Start) {
            this.interactions.add(interaction);
        } else if (interaction instanceof DragInteraction.Stop) {
            this.interactions.remove(((DragInteraction.Stop) interaction).getStart());
        } else if (!(interaction instanceof DragInteraction.Cancel)) {
            return;
        } else {
            this.interactions.remove(((DragInteraction.Cancel) interaction).getStart());
        }
        Interaction interaction2 = (Interaction) a00.r0.A3(this.interactions);
        if (g0.g(this.currentInteraction, interaction2)) {
            return;
        }
        if (interaction2 != null) {
            RippleAlpha invoke = this.rippleAlpha.invoke();
            float hoveredAlpha = z11 ? invoke.getHoveredAlpha() : interaction instanceof FocusInteraction.Focus ? invoke.getFocusedAlpha() : interaction instanceof DragInteraction.Start ? invoke.getDraggedAlpha() : 0.0f;
            incomingStateLayerAnimationSpecFor = RippleKt.incomingStateLayerAnimationSpecFor(interaction2);
            c40.k.f(r0Var, null, null, new StateLayer$handleInteraction$1(this, hoveredAlpha, incomingStateLayerAnimationSpecFor, null), 3, null);
        } else {
            outgoingStateLayerAnimationSpecFor = RippleKt.outgoingStateLayerAnimationSpecFor(this.currentInteraction);
            c40.k.f(r0Var, null, null, new StateLayer$handleInteraction$2(this, outgoingStateLayerAnimationSpecFor, null), 3, null);
        }
        this.currentInteraction = interaction2;
    }
}
