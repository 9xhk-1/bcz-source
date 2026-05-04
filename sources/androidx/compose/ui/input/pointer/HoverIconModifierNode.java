package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DpTouchBoundsExpansion;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.TouchBoundsExpansion;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import java.util.List;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nPointerIcon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerIcon.kt\nandroidx/compose/ui/input/pointer/HoverIconModifierNode\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,422:1\n102#2,2:423\n34#2,6:425\n104#2:431\n1#3:432\n*S KotlinDebug\n*F\n+ 1 PointerIcon.kt\nandroidx/compose/ui/input/pointer/HoverIconModifierNode\n*L\n253#1:423,2\n253#1:425,6\n253#1:431\n*E\n"})
/* loaded from: classes.dex */
public abstract class HoverIconModifierNode extends Modifier.Node implements TraversableNode, PointerInputModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;
    private boolean cursorInBoundsOfNode;

    @l
    private DpTouchBoundsExpansion dpTouchBoundsExpansion;

    @k
    private PointerIcon icon;
    private boolean overrideDescendants;

    public /* synthetic */ HoverIconModifierNode(PointerIcon pointerIcon, boolean z11, DpTouchBoundsExpansion dpTouchBoundsExpansion, int i11, v vVar) {
        this(pointerIcon, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? null : dpTouchBoundsExpansion);
    }

    private final void displayIcon() {
        PointerIcon pointerIcon;
        HoverIconModifierNode findOverridingAncestorNode = findOverridingAncestorNode();
        if (findOverridingAncestorNode == null || (pointerIcon = findOverridingAncestorNode.icon) == null) {
            pointerIcon = this.icon;
        }
        displayIcon(pointerIcon);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon() {
        g2 g2Var;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        TraversableNodeKt.traverseAncestors(this, new x00.l<HoverIconModifierNode, Boolean>() { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode$displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // x00.l
            public final Boolean invoke(HoverIconModifierNode hoverIconModifierNode) {
                boolean z11;
                boolean z12;
                if (objectRef.element == null) {
                    z12 = hoverIconModifierNode.cursorInBoundsOfNode;
                    if (z12) {
                        objectRef.element = hoverIconModifierNode;
                        return Boolean.TRUE;
                    }
                }
                if (objectRef.element != null && hoverIconModifierNode.getOverrideDescendants()) {
                    z11 = hoverIconModifierNode.cursorInBoundsOfNode;
                    if (z11) {
                        objectRef.element = hoverIconModifierNode;
                    }
                }
                return Boolean.TRUE;
            }
        });
        HoverIconModifierNode hoverIconModifierNode = (HoverIconModifierNode) objectRef.element;
        if (hoverIconModifierNode != null) {
            hoverIconModifierNode.displayIcon();
            g2Var = g2.f100423a;
        } else {
            g2Var = null;
        }
        if (g2Var == null) {
            displayIcon(null);
        }
    }

    private final void displayIconFromCurrentNodeOrDescendantsWithCursorInBounds() {
        HoverIconModifierNode hoverIconModifierNode;
        if (this.cursorInBoundsOfNode) {
            if (this.overrideDescendants || (hoverIconModifierNode = findDescendantNodeWithCursorInBounds()) == null) {
                hoverIconModifierNode = this;
            }
            hoverIconModifierNode.displayIcon();
        }
    }

    private final void displayIconIfDescendantsDoNotHavePriority() {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        if (!this.overrideDescendants) {
            TraversableNodeKt.traverseDescendants(this, new x00.l<HoverIconModifierNode, TraversableNode.Companion.TraverseDescendantsAction>() { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode$displayIconIfDescendantsDoNotHavePriority$1
                {
                    super(1);
                }

                @Override // x00.l
                public final TraversableNode.Companion.TraverseDescendantsAction invoke(HoverIconModifierNode hoverIconModifierNode) {
                    boolean z11;
                    z11 = hoverIconModifierNode.cursorInBoundsOfNode;
                    if (!z11) {
                        return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                    }
                    Ref.BooleanRef.this.element = false;
                    return TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal;
                }
            });
        }
        if (booleanRef.element) {
            displayIcon();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final HoverIconModifierNode findDescendantNodeWithCursorInBounds() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        TraversableNodeKt.traverseDescendants(this, new x00.l<HoverIconModifierNode, TraversableNode.Companion.TraverseDescendantsAction>() { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode$findDescendantNodeWithCursorInBounds$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // x00.l
            public final TraversableNode.Companion.TraverseDescendantsAction invoke(HoverIconModifierNode hoverIconModifierNode) {
                boolean z11;
                TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsAction = TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                z11 = hoverIconModifierNode.cursorInBoundsOfNode;
                if (z11) {
                    objectRef.element = hoverIconModifierNode;
                    if (hoverIconModifierNode.getOverrideDescendants()) {
                        return TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
                    }
                }
                return traverseDescendantsAction;
            }
        });
        return (HoverIconModifierNode) objectRef.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final HoverIconModifierNode findOverridingAncestorNode() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        TraversableNodeKt.traverseAncestors(this, new x00.l<HoverIconModifierNode, Boolean>() { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode$findOverridingAncestorNode$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // x00.l
            public final Boolean invoke(HoverIconModifierNode hoverIconModifierNode) {
                boolean z11;
                if (hoverIconModifierNode.getOverrideDescendants()) {
                    z11 = hoverIconModifierNode.cursorInBoundsOfNode;
                    if (z11) {
                        objectRef.element = hoverIconModifierNode;
                    }
                }
                return Boolean.TRUE;
            }
        });
        return (HoverIconModifierNode) objectRef.element;
    }

    private final void onEnter() {
        this.cursorInBoundsOfNode = true;
        displayIconIfDescendantsDoNotHavePriority();
    }

    private final void onExit() {
        if (this.cursorInBoundsOfNode) {
            this.cursorInBoundsOfNode = false;
            if (isAttached()) {
                displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon();
            }
        }
    }

    public abstract void displayIcon(@l PointerIcon pointerIcon);

    @l
    public final DpTouchBoundsExpansion getDpTouchBoundsExpansion() {
        return this.dpTouchBoundsExpansion;
    }

    @k
    public final PointerIcon getIcon() {
        return this.icon;
    }

    public final boolean getOverrideDescendants() {
        return this.overrideDescendants;
    }

    @l
    public final PointerIconService getPointerIconService() {
        return (PointerIconService) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalPointerIconService());
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: getTouchBoundsExpansion-RZrCHBk */
    public long mo1175getTouchBoundsExpansionRZrCHBk() {
        DpTouchBoundsExpansion dpTouchBoundsExpansion = this.dpTouchBoundsExpansion;
        return dpTouchBoundsExpansion != null ? dpTouchBoundsExpansion.m4015roundToTouchBoundsExpansionTW6G1oQ(DelegatableNodeKt.requireDensity(this)) : TouchBoundsExpansion.Companion.m4213getNoneRZrCHBk();
    }

    /* renamed from: isRelevantPointerType-uerMTgs, reason: not valid java name */
    public abstract boolean mo3659isRelevantPointerTypeuerMTgs(int i11);

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        onExit();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        onExit();
        super.onDetach();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo205onPointerEventH0pRuoY(@k PointerEvent pointerEvent, @k PointerEventPass pointerEventPass, long j11) {
        if (pointerEventPass == PointerEventPass.Main) {
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (mo3659isRelevantPointerTypeuerMTgs(changes.get(i11).m3735getTypeT8wyACA())) {
                    int m3674getType7fucELk = pointerEvent.m3674getType7fucELk();
                    PointerEventType.Companion companion = PointerEventType.Companion;
                    if (PointerEventType.m3681equalsimpl0(m3674getType7fucELk, companion.m3685getEnter7fucELk())) {
                        onEnter();
                        return;
                    } else {
                        if (PointerEventType.m3681equalsimpl0(pointerEvent.m3674getType7fucELk(), companion.m3686getExit7fucELk())) {
                            onExit();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public final void setDpTouchBoundsExpansion(@l DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        this.dpTouchBoundsExpansion = dpTouchBoundsExpansion;
    }

    public final void setIcon(@k PointerIcon pointerIcon) {
        if (g0.g(this.icon, pointerIcon)) {
            return;
        }
        this.icon = pointerIcon;
        if (this.cursorInBoundsOfNode) {
            displayIconIfDescendantsDoNotHavePriority();
        }
    }

    public final void setOverrideDescendants(boolean z11) {
        if (this.overrideDescendants != z11) {
            this.overrideDescendants = z11;
            if (z11) {
                if (this.cursorInBoundsOfNode) {
                    displayIcon();
                }
            } else if (this.cursorInBoundsOfNode) {
                displayIconFromCurrentNodeOrDescendantsWithCursorInBounds();
            }
        }
    }

    public HoverIconModifierNode(@k PointerIcon pointerIcon, boolean z11, @l DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        this.dpTouchBoundsExpansion = dpTouchBoundsExpansion;
        this.icon = pointerIcon;
        this.overrideDescendants = z11;
    }
}
