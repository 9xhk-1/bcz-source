package androidx.compose.ui;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.ObserverNodeOwnerScope;
import c40.l2;
import c40.n2;
import c40.r0;
import c40.s0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
public interface Modifier {

    @k
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Deprecated
        @k
        public static Modifier then(@k Modifier modifier, @k Modifier modifier2) {
            return Modifier.super.then(modifier2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Element extends Modifier {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class DefaultImpls {
            @Deprecated
            public static boolean all(@k Element element, @k l<? super Element, Boolean> lVar) {
                return Element.super.all(lVar);
            }

            @Deprecated
            public static boolean any(@k Element element, @k l<? super Element, Boolean> lVar) {
                return Element.super.any(lVar);
            }

            @Deprecated
            public static <R> R foldIn(@k Element element, R r11, @k p<? super R, ? super Element, ? extends R> pVar) {
                return (R) Element.super.foldIn(r11, pVar);
            }

            @Deprecated
            public static <R> R foldOut(@k Element element, R r11, @k p<? super Element, ? super R, ? extends R> pVar) {
                return (R) Element.super.foldOut(r11, pVar);
            }

            @Deprecated
            @k
            public static Modifier then(@k Element element, @k Modifier modifier) {
                return Element.super.then(modifier);
            }
        }

        @Override // androidx.compose.ui.Modifier
        default boolean all(@k l<? super Element, Boolean> lVar) {
            return lVar.invoke(this).booleanValue();
        }

        @Override // androidx.compose.ui.Modifier
        default boolean any(@k l<? super Element, Boolean> lVar) {
            return lVar.invoke(this).booleanValue();
        }

        @Override // androidx.compose.ui.Modifier
        default <R> R foldIn(R r11, @k p<? super R, ? super Element, ? extends R> pVar) {
            return pVar.invoke(r11, this);
        }

        @Override // androidx.compose.ui.Modifier
        default <R> R foldOut(R r11, @k p<? super Element, ? super R, ? extends R> pVar) {
            return pVar.invoke(this, r11);
        }
    }

    boolean all(@k l<? super Element, Boolean> lVar);

    boolean any(@k l<? super Element, Boolean> lVar);

    <R> R foldIn(R r11, @k p<? super R, ? super Element, ? extends R> pVar);

    <R> R foldOut(R r11, @k p<? super Element, ? super R, ? extends R> pVar);

    @k
    default Modifier then(@k Modifier modifier) {
        return modifier == Companion ? this : new CombinedModifier(this, modifier);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    @u0({"SMAP\nModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,415:1\n1#2:416\n56#3,5:417\n56#3,5:422\n56#3,5:427\n56#3,5:432\n56#3,5:437\n56#3,5:442\n56#3,5:447\n56#3,5:452\n56#3,5:457\n56#3,5:462\n56#3,5:467\n*S KotlinDebug\n*F\n+ 1 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n249#1:417,5\n250#1:422,5\n258#1:427,5\n261#1:432,5\n270#1:437,5\n271#1:442,5\n274#1:447,5\n284#1:452,5\n285#1:457,5\n288#1:462,5\n300#1:467,5\n*E\n"})
    public static abstract class Node implements DelegatableNode {
        public static final int $stable = 8;

        @m80.l
        private Node child;

        @m80.l
        private NodeCoordinator coordinator;

        @m80.l
        private x00.a<g2> detachedListener;
        private boolean insertedNodeAwaitingAttachForInvalidation;
        private boolean isAttached;
        private int kindSet;
        private boolean onAttachRunExpected;
        private boolean onDetachRunExpected;

        @m80.l
        private ObserverNodeOwnerScope ownerScope;

        @m80.l
        private Node parent;

        @m80.l
        private r0 scope;
        private boolean updatedNodeAwaitingAttachForInvalidation;

        @k
        private Node node = this;
        private int aggregateChildKindSet = -1;

        public final int getAggregateChildKindSet$ui_release() {
            return this.aggregateChildKindSet;
        }

        @m80.l
        public final Node getChild$ui_release() {
            return this.child;
        }

        @m80.l
        public final NodeCoordinator getCoordinator$ui_release() {
            return this.coordinator;
        }

        @k
        public final r0 getCoroutineScope() {
            r0 r0Var = this.scope;
            if (r0Var != null) {
                return r0Var;
            }
            r0 a11 = s0.a(DelegatableNodeKt.requireOwner(this).getCoroutineContext().plus(n2.a((l2) DelegatableNodeKt.requireOwner(this).getCoroutineContext().get(l2.f7886e0))));
            this.scope = a11;
            return a11;
        }

        @m80.l
        public final x00.a<g2> getDetachedListener$ui_release() {
            return this.detachedListener;
        }

        public final boolean getInsertedNodeAwaitingAttachForInvalidation$ui_release() {
            return this.insertedNodeAwaitingAttachForInvalidation;
        }

        public final int getKindSet$ui_release() {
            return this.kindSet;
        }

        @Override // androidx.compose.ui.node.DelegatableNode
        @k
        public final Node getNode() {
            return this.node;
        }

        @m80.l
        public final ObserverNodeOwnerScope getOwnerScope$ui_release() {
            return this.ownerScope;
        }

        @m80.l
        public final Node getParent$ui_release() {
            return this.parent;
        }

        public boolean getShouldAutoInvalidate() {
            return true;
        }

        public final boolean getUpdatedNodeAwaitingAttachForInvalidation$ui_release() {
            return this.updatedNodeAwaitingAttachForInvalidation;
        }

        public final boolean isAttached() {
            return this.isAttached;
        }

        /* renamed from: isKind-H91voCI$ui_release, reason: not valid java name */
        public final boolean m2086isKindH91voCI$ui_release(int i11) {
            return (i11 & getKindSet$ui_release()) != 0;
        }

        public void markAsAttached$ui_release() {
            if (this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("node attached multiple times");
            }
            if (!(this.coordinator != null)) {
                InlineClassHelperKt.throwIllegalStateException("attach invoked on a node without a coordinator");
            }
            this.isAttached = true;
            this.onAttachRunExpected = true;
        }

        public void markAsDetached$ui_release() {
            if (!this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("Cannot detach a node that is not attached");
            }
            if (this.onAttachRunExpected) {
                InlineClassHelperKt.throwIllegalStateException("Must run runAttachLifecycle() before markAsDetached()");
            }
            if (this.onDetachRunExpected) {
                InlineClassHelperKt.throwIllegalStateException("Must run runDetachLifecycle() before markAsDetached()");
            }
            this.isAttached = false;
            r0 r0Var = this.scope;
            if (r0Var != null) {
                s0.d(r0Var, new ModifierNodeDetachedCancellationException());
                this.scope = null;
            }
        }

        public void reset$ui_release() {
            if (!this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("reset() called on an unattached node");
            }
            onReset();
        }

        public void runAttachLifecycle$ui_release() {
            if (!this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("Must run markAsAttached() prior to runAttachLifecycle");
            }
            if (!this.onAttachRunExpected) {
                InlineClassHelperKt.throwIllegalStateException("Must run runAttachLifecycle() only once after markAsAttached()");
            }
            this.onAttachRunExpected = false;
            onAttach();
            this.onDetachRunExpected = true;
        }

        public void runDetachLifecycle$ui_release() {
            if (!this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("node detached multiple times");
            }
            if (!(this.coordinator != null)) {
                InlineClassHelperKt.throwIllegalStateException("detach invoked on a node without a coordinator");
            }
            if (!this.onDetachRunExpected) {
                InlineClassHelperKt.throwIllegalStateException("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            }
            this.onDetachRunExpected = false;
            x00.a<g2> aVar = this.detachedListener;
            if (aVar != null) {
                aVar.invoke();
            }
            onDetach();
        }

        public final void setAggregateChildKindSet$ui_release(int i11) {
            this.aggregateChildKindSet = i11;
        }

        public void setAsDelegateTo$ui_release(@k Node node) {
            this.node = node;
        }

        public final void setChild$ui_release(@m80.l Node node) {
            this.child = node;
        }

        public final void setDetachedListener$ui_release(@m80.l x00.a<g2> aVar) {
            this.detachedListener = aVar;
        }

        public final void setInsertedNodeAwaitingAttachForInvalidation$ui_release(boolean z11) {
            this.insertedNodeAwaitingAttachForInvalidation = z11;
        }

        public final void setKindSet$ui_release(int i11) {
            this.kindSet = i11;
        }

        public final void setOwnerScope$ui_release(@m80.l ObserverNodeOwnerScope observerNodeOwnerScope) {
            this.ownerScope = observerNodeOwnerScope;
        }

        public final void setParent$ui_release(@m80.l Node node) {
            this.parent = node;
        }

        public final void setUpdatedNodeAwaitingAttachForInvalidation$ui_release(boolean z11) {
            this.updatedNodeAwaitingAttachForInvalidation = z11;
        }

        public final void sideEffect(@k x00.a<g2> aVar) {
            DelegatableNodeKt.requireOwner(this).registerOnEndApplyChangesListener(aVar);
        }

        public void updateCoordinator$ui_release(@m80.l NodeCoordinator nodeCoordinator) {
            this.coordinator = nodeCoordinator;
        }

        public static /* synthetic */ void getNode$annotations() {
        }

        public static /* synthetic */ void getShouldAutoInvalidate$annotations() {
        }

        public void onAttach() {
        }

        public void onDetach() {
        }

        public void onReset() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion implements Modifier {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Override // androidx.compose.ui.Modifier
        public boolean all(@k l<? super Element, Boolean> lVar) {
            return true;
        }

        @Override // androidx.compose.ui.Modifier
        public boolean any(@k l<? super Element, Boolean> lVar) {
            return false;
        }

        @k
        public String toString() {
            return "Modifier";
        }

        @Override // androidx.compose.ui.Modifier
        @k
        public Modifier then(@k Modifier modifier) {
            return modifier;
        }

        @Override // androidx.compose.ui.Modifier
        public <R> R foldIn(R r11, @k p<? super R, ? super Element, ? extends R> pVar) {
            return r11;
        }

        @Override // androidx.compose.ui.Modifier
        public <R> R foldOut(R r11, @k p<? super Element, ? super R, ? extends R> pVar) {
            return r11;
        }
    }
}
