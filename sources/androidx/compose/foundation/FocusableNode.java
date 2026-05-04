package androidx.compose.foundation;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.focus.FocusTargetModifierNode;
import androidx.compose.ui.focus.FocusTargetModifierNodeKt;
import androidx.compose.ui.focus.Focusability;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.layout.PinnableContainerKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import c40.l2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class FocusableNode extends DelegatingNode implements SemanticsModifierNode, GlobalPositionAwareModifierNode, CompositionLocalConsumerModifierNode, ObserverModifierNode, TraversableNode {

    @m80.k
    private final FocusTargetModifierNode focusTargetNode;

    @l
    private FocusInteraction.Focus focusedInteraction;

    @l
    private LayoutCoordinates globalLayoutCoordinates;

    @l
    private MutableInteractionSource interactionSource;

    @l
    private final x00.l<Boolean, g2> onFocusChange;

    @l
    private PinnableContainer.PinnedHandle pinnedHandle;

    @l
    private x00.a<Boolean> requestFocus;
    private final boolean shouldAutoInvalidate;

    @m80.k
    private static final TraverseKey TraverseKey = new TraverseKey(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class TraverseKey {
        public /* synthetic */ TraverseKey(v vVar) {
            this();
        }

        private TraverseKey() {
        }
    }

    public /* synthetic */ FocusableNode(MutableInteractionSource mutableInteractionSource, int i11, x00.l lVar, v vVar) {
        this(mutableInteractionSource, i11, lVar);
    }

    private final void disposeInteractionSource() {
        FocusInteraction.Focus focus;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null && (focus = this.focusedInteraction) != null) {
            mutableInteractionSource.tryEmit(new FocusInteraction.Unfocus(focus));
        }
        this.focusedInteraction = null;
    }

    private final void emitInteraction(boolean z11) {
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null) {
            if (!z11) {
                FocusInteraction.Focus focus = this.focusedInteraction;
                if (focus != null) {
                    emitWithFallback(mutableInteractionSource, new FocusInteraction.Unfocus(focus));
                    this.focusedInteraction = null;
                    return;
                }
                return;
            }
            FocusInteraction.Focus focus2 = this.focusedInteraction;
            if (focus2 != null) {
                emitWithFallback(mutableInteractionSource, new FocusInteraction.Unfocus(focus2));
                this.focusedInteraction = null;
            }
            FocusInteraction.Focus focus3 = new FocusInteraction.Focus();
            emitWithFallback(mutableInteractionSource, focus3);
            this.focusedInteraction = focus3;
        }
    }

    private final void emitWithFallback(final MutableInteractionSource mutableInteractionSource, final Interaction interaction) {
        if (!isAttached()) {
            mutableInteractionSource.tryEmit(interaction);
        } else {
            l2 l2Var = (l2) getCoroutineScope().getCoroutineContext().get(l2.f7886e0);
            c40.k.f(getCoroutineScope(), null, null, new FocusableNode$emitWithFallback$1(mutableInteractionSource, interaction, l2Var != null ? l2Var.z0(new x00.l<Throwable, g2>() { // from class: androidx.compose.foundation.FocusableNode$emitWithFallback$handler$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Throwable th2) {
                    invoke2(th2);
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th2) {
                    MutableInteractionSource.this.tryEmit(interaction);
                }
            }) : null, null), 3, null);
        }
    }

    private final FocusedBoundsObserverNode getFocusedBoundsObserver() {
        if (isAttached()) {
            TraversableNode findNearestAncestor = TraversableNodeKt.findNearestAncestor(this, FocusedBoundsObserverNode.TraverseKey);
            if (findNearestAncestor instanceof FocusedBoundsObserverNode) {
                return (FocusedBoundsObserverNode) findNearestAncestor;
            }
        }
        return null;
    }

    private final void notifyObserverWhenAttached() {
        FocusedBoundsObserverNode focusedBoundsObserver;
        LayoutCoordinates layoutCoordinates = this.globalLayoutCoordinates;
        if (layoutCoordinates != null) {
            g0.m(layoutCoordinates);
            if (!layoutCoordinates.isAttached() || (focusedBoundsObserver = getFocusedBoundsObserver()) == null) {
                return;
            }
            focusedBoundsObserver.onFocusBoundsChanged(this.globalLayoutCoordinates);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFocusStateChange(FocusState focusState, FocusState focusState2) {
        boolean isFocused;
        if (isAttached() && (isFocused = focusState2.isFocused()) != focusState.isFocused()) {
            x00.l<Boolean, g2> lVar = this.onFocusChange;
            if (lVar != null) {
                lVar.invoke(Boolean.valueOf(isFocused));
            }
            if (isFocused) {
                c40.k.f(getCoroutineScope(), null, null, new FocusableNode$onFocusStateChange$1(this, null), 3, null);
                PinnableContainer retrievePinnableContainer = retrievePinnableContainer();
                this.pinnedHandle = retrievePinnableContainer != null ? retrievePinnableContainer.pin() : null;
                notifyObserverWhenAttached();
            } else {
                PinnableContainer.PinnedHandle pinnedHandle = this.pinnedHandle;
                if (pinnedHandle != null) {
                    pinnedHandle.release();
                }
                this.pinnedHandle = null;
                FocusedBoundsObserverNode focusedBoundsObserver = getFocusedBoundsObserver();
                if (focusedBoundsObserver != null) {
                    focusedBoundsObserver.onFocusBoundsChanged(null);
                }
            }
            SemanticsModifierNodeKt.invalidateSemantics(this);
            emitInteraction(isFocused);
        }
    }

    private final PinnableContainer retrievePinnableContainer() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ObserverModifierNodeKt.observeReads(this, new x00.a<g2>() { // from class: androidx.compose.foundation.FocusableNode$retrievePinnableContainer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ g2 invoke() {
                invoke2();
                return g2.f100423a;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                objectRef.element = CompositionLocalConsumerModifierNodeKt.currentValueOf(this, PinnableContainerKt.getLocalPinnableContainer());
            }
        });
        return (PinnableContainer) objectRef.element;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(@m80.k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setFocused(semanticsPropertyReceiver, this.focusTargetNode.getFocusState().isFocused());
        if (this.requestFocus == null) {
            this.requestFocus = new x00.a<Boolean>() { // from class: androidx.compose.foundation.FocusableNode$applySemantics$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final Boolean invoke() {
                    FocusTargetModifierNode focusTargetModifierNode;
                    focusTargetModifierNode = FocusableNode.this.focusTargetNode;
                    return Boolean.valueOf(FocusTargetModifierNode.m2181requestFocus3ESFkO8$default(focusTargetModifierNode, 0, 1, null));
                }
            };
        }
        SemanticsPropertiesKt.requestFocus$default(semanticsPropertyReceiver, null, this.requestFocus, 1, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    @m80.k
    public Object getTraverseKey() {
        return TraverseKey;
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(@m80.k LayoutCoordinates layoutCoordinates) {
        this.globalLayoutCoordinates = layoutCoordinates;
        if (this.focusTargetNode.getFocusState().isFocused()) {
            if (layoutCoordinates.isAttached()) {
                notifyObserverWhenAttached();
                return;
            }
            FocusedBoundsObserverNode focusedBoundsObserver = getFocusedBoundsObserver();
            if (focusedBoundsObserver != null) {
                focusedBoundsObserver.onFocusBoundsChanged(null);
            }
        }
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        PinnableContainer retrievePinnableContainer = retrievePinnableContainer();
        if (this.focusTargetNode.getFocusState().isFocused()) {
            PinnableContainer.PinnedHandle pinnedHandle = this.pinnedHandle;
            if (pinnedHandle != null) {
                pinnedHandle.release();
            }
            this.pinnedHandle = retrievePinnableContainer != null ? retrievePinnableContainer.pin() : null;
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        PinnableContainer.PinnedHandle pinnedHandle = this.pinnedHandle;
        if (pinnedHandle != null) {
            pinnedHandle.release();
        }
        this.pinnedHandle = null;
    }

    public final void update(@l MutableInteractionSource mutableInteractionSource) {
        if (g0.g(this.interactionSource, mutableInteractionSource)) {
            return;
        }
        disposeInteractionSource();
        this.interactionSource = mutableInteractionSource;
    }

    public /* synthetic */ FocusableNode(MutableInteractionSource mutableInteractionSource, int i11, x00.l lVar, int i12, v vVar) {
        this(mutableInteractionSource, (i12 & 2) != 0 ? Focusability.Companion.m2204getAlwaysLCbbffg() : i11, (i12 & 4) != 0 ? null : lVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private FocusableNode(MutableInteractionSource mutableInteractionSource, int i11, x00.l<? super Boolean, g2> lVar) {
        this.interactionSource = mutableInteractionSource;
        this.onFocusChange = lVar;
        this.focusTargetNode = (FocusTargetModifierNode) delegate(FocusTargetModifierNodeKt.m2185FocusTargetModifierNodePYyLHbc(i11, new FocusableNode$focusTargetNode$1(this)));
    }
}
