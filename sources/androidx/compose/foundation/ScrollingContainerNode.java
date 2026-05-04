package androidx.compose.foundation;

import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableNode;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nScrollingContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollingContainer.kt\nandroidx/compose/foundation/ScrollingContainerNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,338:1\n1#2:339\n*E\n"})
/* loaded from: classes.dex */
final class ScrollingContainerNode extends DelegatingNode implements CompositionLocalConsumerModifierNode, ObserverModifierNode {

    @l
    private BringIntoViewSpec bringIntoViewSpec;
    private boolean enabled;

    @l
    private FlingBehavior flingBehavior;

    @l
    private MutableInteractionSource interactionSource;

    @l
    private OverscrollFactory localOverscrollFactory;

    @l
    private OverscrollEffect localOverscrollFactoryCreatedOverscrollEffect;

    @m80.k
    private Orientation orientation;

    @l
    private DelegatableNode overscrollNode;
    private boolean reverseScrolling;

    @l
    private ScrollableNode scrollableNode;
    private final boolean shouldAutoInvalidate;
    private boolean shouldReverseDirection;

    @m80.k
    private ScrollableState state;
    private boolean useLocalOverscrollFactory;

    @l
    private OverscrollEffect userProvidedOverscrollEffect;

    public ScrollingContainerNode(@m80.k ScrollableState scrollableState, @m80.k Orientation orientation, boolean z11, boolean z12, @l FlingBehavior flingBehavior, @l MutableInteractionSource mutableInteractionSource, @l BringIntoViewSpec bringIntoViewSpec, boolean z13, @l OverscrollEffect overscrollEffect) {
        this.state = scrollableState;
        this.orientation = orientation;
        this.enabled = z11;
        this.reverseScrolling = z12;
        this.flingBehavior = flingBehavior;
        this.interactionSource = mutableInteractionSource;
        this.bringIntoViewSpec = bringIntoViewSpec;
        this.useLocalOverscrollFactory = z13;
        this.userProvidedOverscrollEffect = overscrollEffect;
    }

    private final void attachOverscrollNodeIfNeeded() {
        DelegatableNode delegatableNode = this.overscrollNode;
        if (delegatableNode != null) {
            if (delegatableNode == null || delegatableNode.getNode().isAttached()) {
                return;
            }
            delegate(delegatableNode);
            return;
        }
        if (this.useLocalOverscrollFactory) {
            ObserverModifierNodeKt.observeReads(this, new x00.a<g2>() { // from class: androidx.compose.foundation.ScrollingContainerNode$attachOverscrollNodeIfNeeded$1
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
                    OverscrollFactory overscrollFactory;
                    ScrollingContainerNode scrollingContainerNode = ScrollingContainerNode.this;
                    scrollingContainerNode.localOverscrollFactory = (OverscrollFactory) CompositionLocalConsumerModifierNodeKt.currentValueOf(scrollingContainerNode, OverscrollKt.getLocalOverscrollFactory());
                    ScrollingContainerNode scrollingContainerNode2 = ScrollingContainerNode.this;
                    overscrollFactory = scrollingContainerNode2.localOverscrollFactory;
                    scrollingContainerNode2.localOverscrollFactoryCreatedOverscrollEffect = overscrollFactory != null ? overscrollFactory.createOverscrollEffect() : null;
                }
            });
        }
        OverscrollEffect overscrollEffect = getOverscrollEffect();
        if (overscrollEffect != null) {
            DelegatableNode node = overscrollEffect.getNode();
            if (node.getNode().isAttached()) {
                return;
            }
            this.overscrollNode = delegate(node);
        }
    }

    @l
    public final OverscrollEffect getOverscrollEffect() {
        return this.useLocalOverscrollFactory ? this.localOverscrollFactoryCreatedOverscrollEffect : this.userProvidedOverscrollEffect;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        this.shouldReverseDirection = shouldReverseDirection();
        attachOverscrollNodeIfNeeded();
        if (this.scrollableNode == null) {
            this.scrollableNode = (ScrollableNode) delegate(new ScrollableNode(this.state, getOverscrollEffect(), this.flingBehavior, this.orientation, this.enabled, this.shouldReverseDirection, this.interactionSource, this.bringIntoViewSpec));
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        DelegatableNode delegatableNode = this.overscrollNode;
        if (delegatableNode != null) {
            undelegate(delegatableNode);
        }
    }

    @Override // androidx.compose.ui.node.DelegatableNode
    public void onLayoutDirectionChange() {
        boolean shouldReverseDirection = shouldReverseDirection();
        if (this.shouldReverseDirection != shouldReverseDirection) {
            this.shouldReverseDirection = shouldReverseDirection;
            update(this.state, this.orientation, this.useLocalOverscrollFactory, getOverscrollEffect(), this.enabled, this.reverseScrolling, this.flingBehavior, this.interactionSource, this.bringIntoViewSpec);
        }
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        OverscrollFactory overscrollFactory = (OverscrollFactory) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, OverscrollKt.getLocalOverscrollFactory());
        if (g0.g(overscrollFactory, this.localOverscrollFactory)) {
            return;
        }
        this.localOverscrollFactory = overscrollFactory;
        this.localOverscrollFactoryCreatedOverscrollEffect = null;
        DelegatableNode delegatableNode = this.overscrollNode;
        if (delegatableNode != null) {
            undelegate(delegatableNode);
        }
        this.overscrollNode = null;
        attachOverscrollNodeIfNeeded();
        ScrollableNode scrollableNode = this.scrollableNode;
        if (scrollableNode != null) {
            scrollableNode.update(this.state, this.orientation, getOverscrollEffect(), this.enabled, this.shouldReverseDirection, this.flingBehavior, this.interactionSource, this.bringIntoViewSpec);
        }
    }

    public final boolean shouldReverseDirection() {
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        if (isAttached()) {
            layoutDirection = DelegatableNodeKt.requireLayoutDirection(this);
        }
        return ScrollableDefaults.INSTANCE.reverseDirection(layoutDirection, this.orientation, this.reverseScrolling);
    }

    public final void update(@m80.k ScrollableState scrollableState, @m80.k Orientation orientation, boolean z11, @l OverscrollEffect overscrollEffect, boolean z12, boolean z13, @l FlingBehavior flingBehavior, @l MutableInteractionSource mutableInteractionSource, @l BringIntoViewSpec bringIntoViewSpec) {
        boolean z14;
        this.state = scrollableState;
        this.orientation = orientation;
        boolean z15 = true;
        if (this.useLocalOverscrollFactory != z11) {
            this.useLocalOverscrollFactory = z11;
            z14 = true;
        } else {
            z14 = false;
        }
        if (g0.g(this.userProvidedOverscrollEffect, overscrollEffect)) {
            z15 = false;
        } else {
            this.userProvidedOverscrollEffect = overscrollEffect;
        }
        if (z14 || (z15 && !z11)) {
            DelegatableNode delegatableNode = this.overscrollNode;
            if (delegatableNode != null) {
                undelegate(delegatableNode);
            }
            this.overscrollNode = null;
            attachOverscrollNodeIfNeeded();
        }
        this.enabled = z12;
        this.reverseScrolling = z13;
        this.flingBehavior = flingBehavior;
        this.interactionSource = mutableInteractionSource;
        this.bringIntoViewSpec = bringIntoViewSpec;
        this.shouldReverseDirection = shouldReverseDirection();
        ScrollableNode scrollableNode = this.scrollableNode;
        if (scrollableNode != null) {
            scrollableNode.update(scrollableState, orientation, getOverscrollEffect(), z12, this.shouldReverseDirection, flingBehavior, mutableInteractionSource, bringIntoViewSpec);
        }
    }
}
