package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.Transition;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class EnterExitTransitionElement extends ModifierNodeElement<EnterExitTransitionModifierNode> {

    @k
    private EnterTransition enter;

    @k
    private ExitTransition exit;

    @k
    private GraphicsLayerBlockForEnterExit graphicsLayerBlock;

    @k
    private x00.a<Boolean> isEnabled;

    @l
    private Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> offsetAnimation;

    @l
    private Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;

    @l
    private Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> slideAnimation;

    @k
    private final Transition<EnterExitState> transition;

    public EnterExitTransitionElement(@k Transition<EnterExitState> transition, @l Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation, @l Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation2, @l Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation3, @k EnterTransition enterTransition, @k ExitTransition exitTransition, @k x00.a<Boolean> aVar, @k GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit) {
        this.transition = transition;
        this.sizeAnimation = deferredAnimation;
        this.offsetAnimation = deferredAnimation2;
        this.slideAnimation = deferredAnimation3;
        this.enter = enterTransition;
        this.exit = exitTransition;
        this.isEnabled = aVar;
        this.graphicsLayerBlock = graphicsLayerBlockForEnterExit;
    }

    public static /* synthetic */ EnterExitTransitionElement copy$default(EnterExitTransitionElement enterExitTransitionElement, Transition transition, Transition.DeferredAnimation deferredAnimation, Transition.DeferredAnimation deferredAnimation2, Transition.DeferredAnimation deferredAnimation3, EnterTransition enterTransition, ExitTransition exitTransition, x00.a aVar, GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            transition = enterExitTransitionElement.transition;
        }
        if ((i11 & 2) != 0) {
            deferredAnimation = enterExitTransitionElement.sizeAnimation;
        }
        if ((i11 & 4) != 0) {
            deferredAnimation2 = enterExitTransitionElement.offsetAnimation;
        }
        if ((i11 & 8) != 0) {
            deferredAnimation3 = enterExitTransitionElement.slideAnimation;
        }
        if ((i11 & 16) != 0) {
            enterTransition = enterExitTransitionElement.enter;
        }
        if ((i11 & 32) != 0) {
            exitTransition = enterExitTransitionElement.exit;
        }
        if ((i11 & 64) != 0) {
            aVar = enterExitTransitionElement.isEnabled;
        }
        if ((i11 & 128) != 0) {
            graphicsLayerBlockForEnterExit = enterExitTransitionElement.graphicsLayerBlock;
        }
        x00.a aVar2 = aVar;
        GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit2 = graphicsLayerBlockForEnterExit;
        EnterTransition enterTransition2 = enterTransition;
        ExitTransition exitTransition2 = exitTransition;
        return enterExitTransitionElement.copy(transition, deferredAnimation, deferredAnimation2, deferredAnimation3, enterTransition2, exitTransition2, aVar2, graphicsLayerBlockForEnterExit2);
    }

    @k
    public final Transition<EnterExitState> component1() {
        return this.transition;
    }

    @l
    public final Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> component2() {
        return this.sizeAnimation;
    }

    @l
    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> component3() {
        return this.offsetAnimation;
    }

    @l
    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> component4() {
        return this.slideAnimation;
    }

    @k
    public final EnterTransition component5() {
        return this.enter;
    }

    @k
    public final ExitTransition component6() {
        return this.exit;
    }

    @k
    public final x00.a<Boolean> component7() {
        return this.isEnabled;
    }

    @k
    public final GraphicsLayerBlockForEnterExit component8() {
        return this.graphicsLayerBlock;
    }

    @k
    public final EnterExitTransitionElement copy(@k Transition<EnterExitState> transition, @l Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation, @l Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation2, @l Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation3, @k EnterTransition enterTransition, @k ExitTransition exitTransition, @k x00.a<Boolean> aVar, @k GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit) {
        return new EnterExitTransitionElement(transition, deferredAnimation, deferredAnimation2, deferredAnimation3, enterTransition, exitTransition, aVar, graphicsLayerBlockForEnterExit);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return g0.g(this.transition, enterExitTransitionElement.transition) && g0.g(this.sizeAnimation, enterExitTransitionElement.sizeAnimation) && g0.g(this.offsetAnimation, enterExitTransitionElement.offsetAnimation) && g0.g(this.slideAnimation, enterExitTransitionElement.slideAnimation) && g0.g(this.enter, enterExitTransitionElement.enter) && g0.g(this.exit, enterExitTransitionElement.exit) && g0.g(this.isEnabled, enterExitTransitionElement.isEnabled) && g0.g(this.graphicsLayerBlock, enterExitTransitionElement.graphicsLayerBlock);
    }

    @k
    public final EnterTransition getEnter() {
        return this.enter;
    }

    @k
    public final ExitTransition getExit() {
        return this.exit;
    }

    @k
    public final GraphicsLayerBlockForEnterExit getGraphicsLayerBlock() {
        return this.graphicsLayerBlock;
    }

    @l
    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> getOffsetAnimation() {
        return this.offsetAnimation;
    }

    @l
    public final Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> getSizeAnimation() {
        return this.sizeAnimation;
    }

    @l
    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> getSlideAnimation() {
        return this.slideAnimation;
    }

    @k
    public final Transition<EnterExitState> getTransition() {
        return this.transition;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = this.transition.hashCode() * 31;
        Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation = this.sizeAnimation;
        int hashCode2 = (hashCode + (deferredAnimation == null ? 0 : deferredAnimation.hashCode())) * 31;
        Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation2 = this.offsetAnimation;
        int hashCode3 = (hashCode2 + (deferredAnimation2 == null ? 0 : deferredAnimation2.hashCode())) * 31;
        Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation3 = this.slideAnimation;
        return ((((((((hashCode3 + (deferredAnimation3 != null ? deferredAnimation3.hashCode() : 0)) * 31) + this.enter.hashCode()) * 31) + this.exit.hashCode()) * 31) + this.isEnabled.hashCode()) * 31) + this.graphicsLayerBlock.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("enterExitTransition");
        inspectorInfo.getProperties().set("transition", this.transition);
        inspectorInfo.getProperties().set("sizeAnimation", this.sizeAnimation);
        inspectorInfo.getProperties().set("offsetAnimation", this.offsetAnimation);
        inspectorInfo.getProperties().set("slideAnimation", this.slideAnimation);
        inspectorInfo.getProperties().set("enter", this.enter);
        inspectorInfo.getProperties().set("exit", this.exit);
        inspectorInfo.getProperties().set("graphicsLayerBlock", this.graphicsLayerBlock);
    }

    @k
    public final x00.a<Boolean> isEnabled() {
        return this.isEnabled;
    }

    public final void setEnabled(@k x00.a<Boolean> aVar) {
        this.isEnabled = aVar;
    }

    public final void setEnter(@k EnterTransition enterTransition) {
        this.enter = enterTransition;
    }

    public final void setExit(@k ExitTransition exitTransition) {
        this.exit = exitTransition;
    }

    public final void setGraphicsLayerBlock(@k GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit) {
        this.graphicsLayerBlock = graphicsLayerBlockForEnterExit;
    }

    public final void setOffsetAnimation(@l Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation) {
        this.offsetAnimation = deferredAnimation;
    }

    public final void setSizeAnimation(@l Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation) {
        this.sizeAnimation = deferredAnimation;
    }

    public final void setSlideAnimation(@l Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation) {
        this.slideAnimation = deferredAnimation;
    }

    @k
    public String toString() {
        return "EnterExitTransitionElement(transition=" + this.transition + ", sizeAnimation=" + this.sizeAnimation + ", offsetAnimation=" + this.offsetAnimation + ", slideAnimation=" + this.slideAnimation + ", enter=" + this.enter + ", exit=" + this.exit + ", isEnabled=" + this.isEnabled + ", graphicsLayerBlock=" + this.graphicsLayerBlock + ')';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public EnterExitTransitionModifierNode create() {
        return new EnterExitTransitionModifierNode(this.transition, this.sizeAnimation, this.offsetAnimation, this.slideAnimation, this.enter, this.exit, this.isEnabled, this.graphicsLayerBlock);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k EnterExitTransitionModifierNode enterExitTransitionModifierNode) {
        enterExitTransitionModifierNode.setTransition(this.transition);
        enterExitTransitionModifierNode.setSizeAnimation(this.sizeAnimation);
        enterExitTransitionModifierNode.setOffsetAnimation(this.offsetAnimation);
        enterExitTransitionModifierNode.setSlideAnimation(this.slideAnimation);
        enterExitTransitionModifierNode.setEnter(this.enter);
        enterExitTransitionModifierNode.setExit(this.exit);
        enterExitTransitionModifierNode.setEnabled(this.isEnabled);
        enterExitTransitionModifierNode.setGraphicsLayerBlock(this.graphicsLayerBlock);
    }
}
