package androidx.compose.material.ripple;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c10.d;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nRipple.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/AndroidRippleNode\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,362:1\n256#2:363\n1#3:364\n*S KotlinDebug\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/AndroidRippleNode\n*L\n120#1:363\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidRippleNode extends RippleNode implements RippleHostKey {
    public static final int $stable = 8;

    @l
    private RippleContainer rippleContainer;

    @l
    private RippleHostView rippleHostView;

    public /* synthetic */ AndroidRippleNode(InteractionSource interactionSource, boolean z11, float f11, ColorProducer colorProducer, x00.a aVar, v vVar) {
        this(interactionSource, z11, f11, colorProducer, aVar);
    }

    private final RippleContainer getOrCreateRippleContainer() {
        ViewGroup findNearestViewGroup;
        RippleContainer createAndAttachRippleContainerIfNeeded;
        RippleContainer rippleContainer = this.rippleContainer;
        if (rippleContainer != null) {
            g0.m(rippleContainer);
            return rippleContainer;
        }
        findNearestViewGroup = Ripple_androidKt.findNearestViewGroup((View) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, AndroidCompositionLocals_androidKt.getLocalView()));
        createAndAttachRippleContainerIfNeeded = Ripple_androidKt.createAndAttachRippleContainerIfNeeded(findNearestViewGroup);
        this.rippleContainer = createAndAttachRippleContainerIfNeeded;
        g0.m(createAndAttachRippleContainerIfNeeded);
        return createAndAttachRippleContainerIfNeeded;
    }

    private final void setRippleHostView(RippleHostView rippleHostView) {
        this.rippleHostView = rippleHostView;
        DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override // androidx.compose.material.ripple.RippleNode
    /* renamed from: addRipple-12SF9DM, reason: not valid java name */
    public void mo1865addRipple12SF9DM(@k PressInteraction.Press press, long j11, float f11) {
        RippleHostView rippleHostView = getOrCreateRippleContainer().getRippleHostView(this);
        rippleHostView.m1872addRippleKOepWvA(press, getBounded(), j11, d.L0(f11), m1877getRippleColor0d7_KjU(), getRippleAlpha().invoke().getPressedAlpha(), new x00.a<g2>() { // from class: androidx.compose.material.ripple.AndroidRippleNode$addRipple$1$1$1
            {
                super(0);
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ g2 invoke() {
                invoke2();
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                DrawModifierNodeKt.invalidateDraw(AndroidRippleNode.this);
            }
        });
        setRippleHostView(rippleHostView);
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public void drawRipples(@k DrawScope drawScope) {
        Canvas canvas = drawScope.getDrawContext().getCanvas();
        RippleHostView rippleHostView = this.rippleHostView;
        if (rippleHostView != null) {
            rippleHostView.m1873setRipplePropertiesbiQXAtU(m1878getRippleSizeNHjbRc(), d.L0(getTargetRadius()), m1877getRippleColor0d7_KjU(), getRippleAlpha().invoke().getPressedAlpha());
            rippleHostView.draw(AndroidCanvas_androidKt.getNativeCanvas(canvas));
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        RippleContainer rippleContainer = this.rippleContainer;
        if (rippleContainer != null) {
            rippleContainer.disposeRippleIfNeeded(this);
        }
    }

    @Override // androidx.compose.material.ripple.RippleHostKey
    public void onResetRippleHostView() {
        setRippleHostView(null);
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public void removeRipple(@k PressInteraction.Press press) {
        RippleHostView rippleHostView = this.rippleHostView;
        if (rippleHostView != null) {
            rippleHostView.removeRipple();
        }
    }

    private AndroidRippleNode(InteractionSource interactionSource, boolean z11, float f11, ColorProducer colorProducer, x00.a<RippleAlpha> aVar) {
        super(interactionSource, z11, f11, colorProducer, aVar, null);
    }
}
