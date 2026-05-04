package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.foundation.MagnifierNode;
import androidx.compose.foundation.Magnifier_androidKt;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.selection.SelectionMagnifierKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import c40.l2;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nAndroidTextFieldMagnifier.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidTextFieldMagnifier.android.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldMagnifierNodeImpl28\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,215:1\n85#2:216\n113#2,2:217\n1#3:219\n*S KotlinDebug\n*F\n+ 1 AndroidTextFieldMagnifier.android.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldMagnifierNodeImpl28\n*L\n52#1:216\n52#1:217,2\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldMagnifierNodeImpl28 extends TextFieldMagnifierNode implements CompositionLocalConsumerModifierNode {
    public static final int $stable = 0;

    @k
    private final Animatable<Offset, AnimationVector2D> animatable;

    @l
    private l2 animationJob;

    @k
    private TextFieldSelectionState textFieldSelectionState;

    @k
    private TransformedTextFieldState textFieldState;

    @k
    private TextLayoutState textLayoutState;
    private boolean visible;

    @k
    private final MutableState magnifierSize$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m5278boximpl(IntSize.Companion.m5291getZeroYbymL2g()), null, 2, null);

    @k
    private final MagnifierNode magnifierNode = (MagnifierNode) delegate(new MagnifierNode(new x00.l<Density, Offset>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$magnifierNode$1
        {
            super(1);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ Offset invoke(Density density) {
            return Offset.m2257boximpl(m1347invoketuRUvjQ(density));
        }

        /* renamed from: invoke-tuRUvjQ, reason: not valid java name */
        public final long m1347invoketuRUvjQ(Density density) {
            Animatable animatable;
            animatable = TextFieldMagnifierNodeImpl28.this.animatable;
            return ((Offset) animatable.getValue()).m2278unboximpl();
        }
    }, null, new x00.l<DpSize, g2>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$magnifierNode$2
        {
            super(1);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(DpSize dpSize) {
            m1348invokeEaSLcWc(dpSize.m5221unboximpl());
            return g2.f100423a;
        }

        /* renamed from: invoke-EaSLcWc, reason: not valid java name */
        public final void m1348invokeEaSLcWc(long j11) {
            TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28 = TextFieldMagnifierNodeImpl28.this;
            textFieldMagnifierNodeImpl28.m1346setMagnifierSizeozmzZPI(IntSize.m5281constructorimpl((r1.mo371roundToPx0680j_4(DpSize.m5211getHeightD9Ej5fM(j11)) & 4294967295L) | (((Density) CompositionLocalConsumerModifierNodeKt.currentValueOf(textFieldMagnifierNodeImpl28, CompositionLocalsKt.getLocalDensity())).mo371roundToPx0680j_4(DpSize.m5213getWidthD9Ej5fM(j11)) << 32)));
        }
    }, 0.0f, true, 0, 0.0f, 0.0f, false, null, 1002, null));

    public TextFieldMagnifierNodeImpl28(@k TransformedTextFieldState transformedTextFieldState, @k TextFieldSelectionState textFieldSelectionState, @k TextLayoutState textLayoutState, boolean z11) {
        this.textFieldState = transformedTextFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.textLayoutState = textLayoutState;
        this.visible = z11;
        this.animatable = new Animatable<>(Offset.m2257boximpl(TextFieldMagnifierKt.m1342calculateSelectionMagnifierCenterAndroidhUlJWOE(this.textFieldState, this.textFieldSelectionState, this.textLayoutState, m1345getMagnifierSizeYbymL2g())), SelectionMagnifierKt.getUnspecifiedSafeOffsetVectorConverter(), Offset.m2257boximpl(SelectionMagnifierKt.getOffsetDisplacementThreshold()), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getMagnifierSize-YbymL2g, reason: not valid java name */
    public final long m1345getMagnifierSizeYbymL2g() {
        return ((IntSize) this.magnifierSize$delegate.getValue()).m5290unboximpl();
    }

    private final void restartAnimationJob() {
        l2 f11;
        l2 l2Var = this.animationJob;
        if (l2Var != null) {
            l2.a.b(l2Var, null, 1, null);
        }
        this.animationJob = null;
        if (Magnifier_androidKt.isPlatformMagnifierSupported$default(0, 1, null)) {
            f11 = c40.k.f(getCoroutineScope(), null, null, new TextFieldMagnifierNodeImpl28$restartAnimationJob$1(this, null), 3, null);
            this.animationJob = f11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setMagnifierSize-ozmzZPI, reason: not valid java name */
    public final void m1346setMagnifierSizeozmzZPI(long j11) {
        this.magnifierSize$delegate.setValue(IntSize.m5278boximpl(j11));
    }

    @Override // androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode, androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.magnifierNode.applySemantics(semanticsPropertyReceiver);
    }

    @Override // androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode, androidx.compose.ui.node.DrawModifierNode
    public void draw(@k ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        this.magnifierNode.draw(contentDrawScope);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        restartAnimationJob();
    }

    @Override // androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode, androidx.compose.ui.layout.OnGloballyPositionedModifier
    public void onGloballyPositioned(@k LayoutCoordinates layoutCoordinates) {
        this.magnifierNode.onGloballyPositioned(layoutCoordinates);
    }

    @Override // androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode
    public void update(@k TransformedTextFieldState transformedTextFieldState, @k TextFieldSelectionState textFieldSelectionState, @k TextLayoutState textLayoutState, boolean z11) {
        TransformedTextFieldState transformedTextFieldState2 = this.textFieldState;
        TextFieldSelectionState textFieldSelectionState2 = this.textFieldSelectionState;
        TextLayoutState textLayoutState2 = this.textLayoutState;
        boolean z12 = this.visible;
        this.textFieldState = transformedTextFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.textLayoutState = textLayoutState;
        this.visible = z11;
        if (g0.g(transformedTextFieldState, transformedTextFieldState2) && g0.g(textFieldSelectionState, textFieldSelectionState2) && g0.g(textLayoutState, textLayoutState2) && z11 == z12) {
            return;
        }
        restartAnimationJob();
    }
}
