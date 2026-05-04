package androidx.compose.material.ripple;

import androidx.collection.MutableObjectList;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import c40.r0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/RippleNode\n+ 2 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ObjectList.kt\nandroidx/collection/ObjectList\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,530:1\n1516#2:531\n132#3:532\n287#4,6:533\n1#5:539\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/RippleNode\n*L\n338#1:531\n346#1:532\n358#1:533,6\n*E\n"})
/* loaded from: classes.dex */
public abstract class RippleNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, DrawModifierNode, LayoutAwareModifierNode {
    public static final int $stable = 8;
    private final boolean bounded;

    @k
    private final ColorProducer color;
    private boolean hasValidSize;

    @k
    private final InteractionSource interactionSource;

    @k
    private final MutableObjectList<PressInteraction> pendingInteractions;
    private final float radius;

    @k
    private final x00.a<RippleAlpha> rippleAlpha;
    private long rippleSize;
    private final boolean shouldAutoInvalidate;

    @l
    private StateLayer stateLayer;
    private float targetRadius;

    public /* synthetic */ RippleNode(InteractionSource interactionSource, boolean z11, float f11, ColorProducer colorProducer, x00.a aVar, v vVar) {
        this(interactionSource, z11, f11, colorProducer, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePressInteraction(PressInteraction pressInteraction) {
        if (pressInteraction instanceof PressInteraction.Press) {
            mo1865addRipple12SF9DM((PressInteraction.Press) pressInteraction, this.rippleSize, this.targetRadius);
        } else if (pressInteraction instanceof PressInteraction.Release) {
            removeRipple(((PressInteraction.Release) pressInteraction).getPress());
        } else if (pressInteraction instanceof PressInteraction.Cancel) {
            removeRipple(((PressInteraction.Cancel) pressInteraction).getPress());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateStateLayer(Interaction interaction, r0 r0Var) {
        StateLayer stateLayer = this.stateLayer;
        if (stateLayer == null) {
            stateLayer = new StateLayer(this.bounded, this.rippleAlpha);
            DrawModifierNodeKt.invalidateDraw(this);
            this.stateLayer = stateLayer;
        }
        stateLayer.handleInteraction$material_ripple(interaction, r0Var);
    }

    /* renamed from: addRipple-12SF9DM */
    public abstract void mo1865addRipple12SF9DM(@k PressInteraction.Press press, long j11, float f11);

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(@k ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        StateLayer stateLayer = this.stateLayer;
        if (stateLayer != null) {
            stateLayer.m1882drawStateLayermxwnekA(contentDrawScope, this.targetRadius, m1877getRippleColor0d7_KjU());
        }
        drawRipples(contentDrawScope);
    }

    public abstract void drawRipples(@k DrawScope drawScope);

    public final boolean getBounded() {
        return this.bounded;
    }

    @k
    public final x00.a<RippleAlpha> getRippleAlpha() {
        return this.rippleAlpha;
    }

    /* renamed from: getRippleColor-0d7_KjU, reason: not valid java name */
    public final long m1877getRippleColor0d7_KjU() {
        return this.color.mo1642invoke0d7_KjU();
    }

    /* renamed from: getRippleSize-NH-jbRc, reason: not valid java name */
    public final long m1878getRippleSizeNHjbRc() {
        return this.rippleSize;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    public final float getTargetRadius() {
        return this.targetRadius;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        c40.k.f(getCoroutineScope(), null, null, new RippleNode$onAttach$1(this, null), 3, null);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo365onRemeasuredozmzZPI(long j11) {
        this.hasValidSize = true;
        Density requireDensity = DelegatableNodeKt.requireDensity(this);
        this.rippleSize = IntSizeKt.m5298toSizeozmzZPI(j11);
        this.targetRadius = Float.isNaN(this.radius) ? RippleAnimationKt.m1870getRippleEndRadiuscSwnlzA(requireDensity, this.bounded, this.rippleSize) : requireDensity.mo377toPx0680j_4(this.radius);
        MutableObjectList<PressInteraction> mutableObjectList = this.pendingInteractions;
        Object[] objArr = mutableObjectList.content;
        int i11 = mutableObjectList._size;
        for (int i12 = 0; i12 < i11; i12++) {
            handlePressInteraction((PressInteraction) objArr[i12]);
        }
        this.pendingInteractions.clear();
    }

    public abstract void removeRipple(@k PressInteraction.Press press);

    public final void setTargetRadius(float f11) {
        this.targetRadius = f11;
    }

    private RippleNode(InteractionSource interactionSource, boolean z11, float f11, ColorProducer colorProducer, x00.a<RippleAlpha> aVar) {
        this.interactionSource = interactionSource;
        this.bounded = z11;
        this.radius = f11;
        this.color = colorProducer;
        this.rippleAlpha = aVar;
        this.rippleSize = Size.Companion.m2346getZeroNHjbRc();
        this.pendingInteractions = new MutableObjectList<>(0, 1, null);
    }
}
