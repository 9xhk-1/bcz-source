package androidx.compose.material.ripple;

import android.view.ViewGroup;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import c10.d;
import c40.r0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.g2;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@n(message = "Replaced by the new RippleNode implementation")
@u0({"SMAP\nRipple.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/AndroidRippleIndicationInstance\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,362:1\n85#2:363\n113#2,2:364\n85#2:366\n113#2,2:367\n132#3:369\n256#4:370\n1#5:371\n*S KotlinDebug\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/AndroidRippleIndicationInstance\n*L\n215#1:363\n215#1:364,2\n223#1:366\n223#1:367,2\n244#1:369\n258#1:370\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidRippleIndicationInstance extends RippleIndicationInstance implements RememberObserver, RippleHostKey {
    public static final int $stable = 8;
    private final boolean bounded;

    @k
    private final State<Color> color;

    @k
    private final MutableState invalidateTick$delegate;

    @k
    private final x00.a<g2> onInvalidateRipple;
    private final float radius;

    @k
    private final State<RippleAlpha> rippleAlpha;

    @l
    private RippleContainer rippleContainer;

    @k
    private final MutableState rippleHostView$delegate;
    private int rippleRadius;
    private long rippleSize;

    @k
    private final ViewGroup view;

    public /* synthetic */ AndroidRippleIndicationInstance(boolean z11, float f11, State state, State state2, ViewGroup viewGroup, v vVar) {
        this(z11, f11, state, state2, viewGroup);
    }

    private final void dispose() {
        RippleContainer rippleContainer = this.rippleContainer;
        if (rippleContainer != null) {
            rippleContainer.disposeRippleIfNeeded(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getInvalidateTick() {
        return ((Boolean) this.invalidateTick$delegate.getValue()).booleanValue();
    }

    private final RippleContainer getOrCreateRippleContainer() {
        RippleContainer createAndAttachRippleContainerIfNeeded;
        RippleContainer rippleContainer = this.rippleContainer;
        if (rippleContainer != null) {
            g0.m(rippleContainer);
            return rippleContainer;
        }
        createAndAttachRippleContainerIfNeeded = Ripple_androidKt.createAndAttachRippleContainerIfNeeded(this.view);
        this.rippleContainer = createAndAttachRippleContainerIfNeeded;
        g0.m(createAndAttachRippleContainerIfNeeded);
        return createAndAttachRippleContainerIfNeeded;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final RippleHostView getRippleHostView() {
        return (RippleHostView) this.rippleHostView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setInvalidateTick(boolean z11) {
        this.invalidateTick$delegate.setValue(Boolean.valueOf(z11));
    }

    private final void setRippleHostView(RippleHostView rippleHostView) {
        this.rippleHostView$delegate.setValue(rippleHostView);
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void addRipple(@k PressInteraction.Press press, @k r0 r0Var) {
        RippleHostView rippleHostView = getOrCreateRippleContainer().getRippleHostView(this);
        rippleHostView.m1872addRippleKOepWvA(press, this.bounded, this.rippleSize, this.rippleRadius, this.color.getValue().m2519unboximpl(), this.rippleAlpha.getValue().getPressedAlpha(), this.onInvalidateRipple);
        setRippleHostView(rippleHostView);
    }

    @Override // androidx.compose.foundation.IndicationInstance
    public void drawIndication(@k ContentDrawScope contentDrawScope) {
        this.rippleSize = contentDrawScope.mo3060getSizeNHjbRc();
        this.rippleRadius = Float.isNaN(this.radius) ? d.L0(RippleAnimationKt.m1870getRippleEndRadiuscSwnlzA(contentDrawScope, this.bounded, contentDrawScope.mo3060getSizeNHjbRc())) : contentDrawScope.mo371roundToPx0680j_4(this.radius);
        long m2519unboximpl = this.color.getValue().m2519unboximpl();
        float pressedAlpha = this.rippleAlpha.getValue().getPressedAlpha();
        contentDrawScope.drawContent();
        m1874drawStateLayerH2RKhps(contentDrawScope, this.radius, m2519unboximpl);
        Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
        getInvalidateTick();
        RippleHostView rippleHostView = getRippleHostView();
        if (rippleHostView != null) {
            rippleHostView.m1873setRipplePropertiesbiQXAtU(contentDrawScope.mo3060getSizeNHjbRc(), this.rippleRadius, m2519unboximpl, pressedAlpha);
            rippleHostView.draw(AndroidCanvas_androidKt.getNativeCanvas(canvas));
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        dispose();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        dispose();
    }

    @Override // androidx.compose.material.ripple.RippleHostKey
    public void onResetRippleHostView() {
        setRippleHostView(null);
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void removeRipple(@k PressInteraction.Press press) {
        RippleHostView rippleHostView = getRippleHostView();
        if (rippleHostView != null) {
            rippleHostView.removeRipple();
        }
    }

    private AndroidRippleIndicationInstance(boolean z11, float f11, State<Color> state, State<RippleAlpha> state2, ViewGroup viewGroup) {
        super(z11, state2);
        this.bounded = z11;
        this.radius = f11;
        this.color = state;
        this.rippleAlpha = state2;
        this.view = viewGroup;
        this.rippleHostView$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.invalidateTick$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.rippleSize = Size.Companion.m2346getZeroNHjbRc();
        this.rippleRadius = -1;
        this.onInvalidateRipple = new x00.a<g2>() { // from class: androidx.compose.material.ripple.AndroidRippleIndicationInstance$onInvalidateRipple$1
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
                boolean invalidateTick;
                AndroidRippleIndicationInstance androidRippleIndicationInstance = AndroidRippleIndicationInstance.this;
                invalidateTick = androidRippleIndicationInstance.getInvalidateTick();
                androidRippleIndicationInstance.setInvalidateTick(!invalidateTick);
            }
        };
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }
}
