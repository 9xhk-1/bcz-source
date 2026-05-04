package androidx.compose.ui.focus;

import android.os.Trace;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.DeprecationLevel;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.a;
import x00.p;
import yz.g2;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nFocusTargetNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTargetNode.kt\nandroidx/compose/ui/focus/FocusTargetNode\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 10 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n+ 11 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,433:1\n232#1,19:613\n232#1,19:632\n119#2:434\n123#2:536\n119#2:537\n127#2:658\n119#2:659\n127#2:735\n119#2:736\n119#2:827\n119#2:897\n247#3,5:435\n90#3:440\n91#3,8:446\n437#3,6:454\n447#3,2:461\n449#3,8:466\n457#3,9:477\n466#3,8:489\n100#3,7:497\n258#3,2:538\n90#3:540\n91#3,8:546\n260#3:554\n261#3,2:556\n437#3,12:558\n449#3,8:573\n457#3,9:584\n466#3,8:596\n264#3:604\n100#3,7:605\n265#3:612\n258#3,2:660\n90#3:662\n91#3,8:668\n260#3:676\n261#3,2:678\n437#3,12:680\n449#3,8:695\n457#3,9:706\n466#3,8:718\n264#3:726\n100#3,7:727\n265#3:734\n258#3,2:737\n90#3:739\n91#3,8:745\n260#3:753\n261#3,2:755\n437#3,12:757\n449#3,8:772\n457#3,9:783\n466#3,8:795\n264#3:803\n100#3,7:804\n265#3:811\n247#3,5:828\n90#3:833\n91#3,8:839\n437#3,6:847\n447#3,2:854\n449#3,8:859\n457#3,9:870\n466#3,8:882\n100#3,7:890\n298#3,6:898\n179#3:904\n180#3:910\n181#3,3:914\n184#3,6:918\n304#3:924\n437#3,6:925\n447#3,2:932\n449#3,17:937\n466#3,8:957\n305#3:965\n190#3,8:966\n306#3:974\n56#4,5:441\n56#4,5:541\n76#4,7:651\n56#4,5:663\n56#4,5:740\n56#4,5:834\n56#4,5:905\n246#5:460\n246#5:555\n246#5:677\n246#5:754\n246#5:853\n246#5:931\n240#6,3:463\n243#6,3:486\n240#6,3:570\n243#6,3:593\n240#6,3:692\n243#6,3:715\n240#6,3:769\n243#6,3:792\n240#6,3:856\n243#6,3:879\n240#6,3:934\n243#6,3:954\n1101#7:474\n1083#7,2:475\n1101#7:581\n1083#7,2:582\n1101#7:703\n1083#7,2:704\n1101#7:780\n1083#7,2:781\n1101#7:867\n1083#7,2:868\n1101#7:911\n1083#7,2:912\n1#8:504\n1#8:514\n1#8:529\n1#8:820\n26#9,5:505\n52#10,4:510\n56#10,4:517\n48#10,8:521\n56#10,4:532\n48#10,8:812\n56#10,4:823\n641#11,2:515\n641#11,2:530\n641#11,2:821\n519#11:917\n*S KotlinDebug\n*F\n+ 1 FocusTargetNode.kt\nandroidx/compose/ui/focus/FocusTargetNode\n*L\n269#1:613,19\n293#1:632,19\n79#1:434\n221#1:536\n221#1:537\n341#1:658\n341#1:659\n352#1:735\n352#1:736\n382#1:827\n396#1:897\n79#1:435,5\n79#1:440\n79#1:446,8\n79#1:454,6\n79#1:461,2\n79#1:466,8\n79#1:477,9\n79#1:489,8\n79#1:497,7\n221#1:538,2\n221#1:540\n221#1:546,8\n221#1:554\n221#1:556,2\n221#1:558,12\n221#1:573,8\n221#1:584,9\n221#1:596,8\n221#1:604\n221#1:605,7\n221#1:612\n341#1:660,2\n341#1:662\n341#1:668,8\n341#1:676\n341#1:678,2\n341#1:680,12\n341#1:695,8\n341#1:706,9\n341#1:718,8\n341#1:726\n341#1:727,7\n341#1:734\n352#1:737,2\n352#1:739\n352#1:745,8\n352#1:753\n352#1:755,2\n352#1:757,12\n352#1:772,8\n352#1:783,9\n352#1:795,8\n352#1:803\n352#1:804,7\n352#1:811\n382#1:828,5\n382#1:833\n382#1:839,8\n382#1:847,6\n382#1:854,2\n382#1:859,8\n382#1:870,9\n382#1:882,8\n382#1:890,7\n396#1:898,6\n396#1:904\n396#1:910\n396#1:914,3\n396#1:918,6\n396#1:924\n396#1:925,6\n396#1:932,2\n396#1:937,17\n396#1:957,8\n396#1:965\n396#1:966,8\n396#1:974\n79#1:441,5\n221#1:541,5\n303#1:651,7\n341#1:663,5\n352#1:740,5\n382#1:834,5\n396#1:905,5\n79#1:460\n221#1:555\n341#1:677\n352#1:754\n382#1:853\n396#1:931\n79#1:463,3\n79#1:486,3\n221#1:570,3\n221#1:593,3\n341#1:692,3\n341#1:715,3\n352#1:769,3\n352#1:792,3\n382#1:856,3\n382#1:879,3\n396#1:934,3\n396#1:954,3\n79#1:474\n79#1:475,2\n221#1:581\n221#1:582,2\n341#1:703\n341#1:704,2\n352#1:780\n352#1:781,2\n382#1:867\n382#1:868,2\n396#1:911\n396#1:912,2\n117#1:514\n205#1:529\n412#1:820\n107#1:505,5\n117#1:510,4\n117#1:517,4\n205#1:521,8\n205#1:532,4\n412#1:812,8\n412#1:823,4\n117#1:515,2\n205#1:530,2\n412#1:821,2\n396#1:917\n*E\n"})
/* loaded from: classes.dex */
public final class FocusTargetNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, FocusTargetModifierNode, ObserverModifierNode, ModifierLocalModifierNode {
    public static final int $stable = 8;

    @l
    private FocusStateImpl committedFocusState;
    private int focusability;
    private boolean isProcessingCustomEnter;
    private boolean isProcessingCustomExit;

    @l
    private final x00.l<FocusTargetNode, g2> onDispatchEventsCompleted;

    @l
    private final p<FocusState, FocusState, g2> onFocusChange;
    private int previouslyFocusedChildHash;
    private final boolean shouldAutoInvalidate;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class FocusTargetElement extends ModifierNodeElement<FocusTargetNode> {
        public static final int $stable = 0;

        @k
        public static final FocusTargetElement INSTANCE = new FocusTargetElement();

        private FocusTargetElement() {
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public boolean equals(@l Object obj) {
            return obj == this;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public int hashCode() {
            return 1739042953;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void inspectableProperties(@k InspectorInfo inspectorInfo) {
            inspectorInfo.setName("focusTarget");
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void update(@k FocusTargetNode focusTargetNode) {
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        @k
        public FocusTargetNode create() {
            return new FocusTargetNode(0, null, null, 7, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[CustomDestinationResult.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomDestinationResult.Redirected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomDestinationResult.Cancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[FocusStateImpl.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public /* synthetic */ FocusTargetNode(int i11, p pVar, x00.l lVar, v vVar) {
        this(i11, pVar, lVar);
    }

    /* renamed from: fetchCustomEnterOrExit-ULY8qGw, reason: not valid java name */
    private final void m2187fetchCustomEnterOrExitULY8qGw(int i11, x00.l<? super FocusRequester, g2> lVar, p<? super FocusProperties, ? super FocusEnterExitScope, g2> pVar) {
        FocusProperties fetchFocusProperties$ui_release = fetchFocusProperties$ui_release();
        CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(i11, null);
        FocusTransactionManager focusTransactionManager = FocusTargetNodeKt.getFocusTransactionManager(this);
        int generation = focusTransactionManager != null ? focusTransactionManager.getGeneration() : 0;
        FocusOwner focusOwner = DelegatableNodeKt.requireOwner(this).getFocusOwner();
        FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
        pVar.invoke(fetchFocusProperties$ui_release, cancelIndicatingFocusBoundaryScope);
        int generation2 = focusTransactionManager != null ? focusTransactionManager.getGeneration() : 0;
        FocusTargetNode activeFocusTargetNode2 = focusOwner.getActiveFocusTargetNode();
        if (cancelIndicatingFocusBoundaryScope.isCanceled()) {
            lVar.invoke(FocusRequester.Companion.getCancel());
        } else {
            if (generation == generation2 && (!ComposeUiFlags.isTrackFocusEnabled || activeFocusTargetNode == activeFocusTargetNode2 || activeFocusTargetNode2 == null)) {
                return;
            }
            lVar.invoke(FocusRequester.Companion.getRedirect$ui_release());
        }
    }

    private static final boolean initializeFocusState$hasActiveChild(FocusTargetNode focusTargetNode) {
        int m4118constructorimpl = NodeKind.m4118constructorimpl(1024);
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = focusTargetNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, focusTargetNode.getNode(), false);
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet$ui_release() & m4118constructorimpl) != 0) {
                for (Modifier.Node node2 = node; node2 != null; node2 = node2.getChild$ui_release()) {
                    if ((node2.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                        Modifier.Node node3 = node2;
                        MutableVector mutableVector2 = null;
                        while (node3 != null) {
                            if (node3 instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) node3;
                                if (focusTargetNode2.isInitialized$ui_release()) {
                                    int i11 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode2.getFocusState().ordinal()];
                                    if (i11 == 1 || i11 == 2 || i11 == 3) {
                                        return true;
                                    }
                                    if (i11 != 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                }
                            } else if ((node3.getKindSet$ui_release() & m4118constructorimpl) != 0 && (node3 instanceof DelegatingNode)) {
                                int i12 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) node3).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            node3 = delegate$ui_release;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node3 != null) {
                                                mutableVector2.add(node3);
                                                node3 = null;
                                            }
                                            mutableVector2.add(delegate$ui_release);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            node3 = DelegatableNodeKt.pop(mutableVector2);
                        }
                    }
                }
            }
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node, false);
        }
        return false;
    }

    private static final boolean initializeFocusState$isInActiveSubTree(FocusTargetNode focusTargetNode) {
        NodeChain nodes$ui_release;
        int m4118constructorimpl = NodeKind.m4118constructorimpl(1024);
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui_release = focusTargetNode.getNode().getParent$ui_release();
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4118constructorimpl) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                        Modifier.Node node = parent$ui_release;
                        MutableVector mutableVector = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) node;
                                if (focusTargetNode2.isInitialized$ui_release()) {
                                    int i11 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode2.getFocusState().ordinal()];
                                    if (i11 != 1 && i11 != 2) {
                                        if (i11 == 3) {
                                            return true;
                                        }
                                        if (i11 != 4) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                    return false;
                                }
                            } else if ((node.getKindSet$ui_release() & m4118constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                int i12 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            node = delegate$ui_release;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                mutableVector.add(node);
                                                node = null;
                                            }
                                            mutableVector.add(delegate$ui_release);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            node = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            parent$ui_release = (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
        return false;
    }

    public static /* synthetic */ void initializeFocusState$ui_release$default(FocusTargetNode focusTargetNode, FocusStateImpl focusStateImpl, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            focusStateImpl = null;
        }
        focusTargetNode.initializeFocusState$ui_release(focusStateImpl);
    }

    public final void commitFocusState$ui_release() {
        FocusStateImpl uncommittedFocusState = FocusTargetNodeKt.requireTransactionManager(this).getUncommittedFocusState(this);
        if (uncommittedFocusState != null) {
            this.committedFocusState = uncommittedFocusState;
        } else {
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("committing a node that was not updated in the current transaction");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [androidx.compose.ui.Modifier$Node] */
    public final void dispatchFocusCallbacks$ui_release() {
        NodeChain nodes$ui_release;
        p<FocusState, FocusState, g2> pVar;
        FocusStateImpl focusStateImpl = this.committedFocusState;
        if (focusStateImpl == null) {
            focusStateImpl = FocusStateImpl.Inactive;
        }
        FocusStateImpl focusState = getFocusState();
        if (focusStateImpl != focusState && (pVar = this.onFocusChange) != null) {
            pVar.invoke(focusStateImpl, focusState);
        }
        int m4118constructorimpl = NodeKind.m4118constructorimpl(4096);
        int m4118constructorimpl2 = NodeKind.m4118constructorimpl(1024);
        Modifier.Node node = getNode();
        int i11 = m4118constructorimpl | m4118constructorimpl2;
        if (!getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node2 = getNode();
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(this);
        loop0: while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i11) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet$ui_release() & i11) != 0) {
                        if (node2 != node && (node2.getKindSet$ui_release() & m4118constructorimpl2) != 0) {
                            break loop0;
                        }
                        if ((node2.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                            DelegatingNode delegatingNode = node2;
                            MutableVector mutableVector = null;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof FocusEventModifierNode) {
                                    FocusEventModifierNode focusEventModifierNode = (FocusEventModifierNode) delegatingNode;
                                    focusEventModifierNode.onFocusEvent(FocusEventModifierNodeKt.getFocusState(focusEventModifierNode));
                                } else if ((delegatingNode.getKindSet$ui_release() & m4118constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                    int i12 = 0;
                                    delegatingNode = delegatingNode;
                                    while (delegate$ui_release != null) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                delegatingNode = delegate$ui_release;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (delegatingNode != 0) {
                                                    mutableVector.add(delegatingNode);
                                                    delegatingNode = 0;
                                                }
                                                mutableVector.add(delegate$ui_release);
                                            }
                                        }
                                        delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                        delegatingNode = delegatingNode;
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                delegatingNode = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                    }
                    node2 = node2.getParent$ui_release();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            node2 = (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
        x00.l<FocusTargetNode, g2> lVar = this.onDispatchEventsCompleted;
        if (lVar != null) {
            lVar.invoke(this);
        }
    }

    /* renamed from: fetchCustomEnter-aToIllA$ui_release, reason: not valid java name */
    public final void m2188fetchCustomEnteraToIllA$ui_release(int i11, @k x00.l<? super FocusRequester, g2> lVar) {
        if (this.isProcessingCustomEnter) {
            return;
        }
        this.isProcessingCustomEnter = true;
        try {
            FocusProperties fetchFocusProperties$ui_release = fetchFocusProperties$ui_release();
            CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(i11, null);
            FocusTransactionManager focusTransactionManager = FocusTargetNodeKt.getFocusTransactionManager(this);
            int generation = focusTransactionManager != null ? focusTransactionManager.getGeneration() : 0;
            FocusOwner focusOwner = DelegatableNodeKt.requireOwner(this).getFocusOwner();
            FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
            fetchFocusProperties$ui_release.getOnEnter().invoke(cancelIndicatingFocusBoundaryScope);
            int generation2 = focusTransactionManager != null ? focusTransactionManager.getGeneration() : 0;
            FocusTargetNode activeFocusTargetNode2 = focusOwner.getActiveFocusTargetNode();
            if (cancelIndicatingFocusBoundaryScope.isCanceled()) {
                lVar.invoke(FocusRequester.Companion.getCancel());
            } else if (generation != generation2 || (ComposeUiFlags.isTrackFocusEnabled && activeFocusTargetNode != activeFocusTargetNode2 && activeFocusTargetNode2 != null)) {
                lVar.invoke(FocusRequester.Companion.getRedirect$ui_release());
            }
            d0.d(1);
            this.isProcessingCustomEnter = false;
            d0.c(1);
        } catch (Throwable th2) {
            d0.d(1);
            this.isProcessingCustomEnter = false;
            d0.c(1);
            throw th2;
        }
    }

    /* renamed from: fetchCustomExit-aToIllA$ui_release, reason: not valid java name */
    public final void m2189fetchCustomExitaToIllA$ui_release(int i11, @k x00.l<? super FocusRequester, g2> lVar) {
        if (this.isProcessingCustomExit) {
            return;
        }
        this.isProcessingCustomExit = true;
        try {
            FocusProperties fetchFocusProperties$ui_release = fetchFocusProperties$ui_release();
            CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(i11, null);
            FocusTransactionManager focusTransactionManager = FocusTargetNodeKt.getFocusTransactionManager(this);
            int generation = focusTransactionManager != null ? focusTransactionManager.getGeneration() : 0;
            FocusOwner focusOwner = DelegatableNodeKt.requireOwner(this).getFocusOwner();
            FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
            fetchFocusProperties$ui_release.getOnExit().invoke(cancelIndicatingFocusBoundaryScope);
            int generation2 = focusTransactionManager != null ? focusTransactionManager.getGeneration() : 0;
            FocusTargetNode activeFocusTargetNode2 = focusOwner.getActiveFocusTargetNode();
            if (cancelIndicatingFocusBoundaryScope.isCanceled()) {
                lVar.invoke(FocusRequester.Companion.getCancel());
            } else if (generation != generation2 || (ComposeUiFlags.isTrackFocusEnabled && activeFocusTargetNode != activeFocusTargetNode2 && activeFocusTargetNode2 != null)) {
                lVar.invoke(FocusRequester.Companion.getRedirect$ui_release());
            }
            d0.d(1);
            this.isProcessingCustomExit = false;
            d0.c(1);
        } catch (Throwable th2) {
            d0.d(1);
            this.isProcessingCustomExit = false;
            d0.c(1);
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [androidx.compose.ui.Modifier$Node] */
    @k
    public final FocusProperties fetchFocusProperties$ui_release() {
        NodeChain nodes$ui_release;
        FocusPropertiesImpl focusPropertiesImpl = new FocusPropertiesImpl();
        focusPropertiesImpl.setCanFocus(Focusability.m2197canFocusimpl$ui_release(mo2182getFocusabilityLCbbffg(), this));
        int m4118constructorimpl = NodeKind.m4118constructorimpl(2048);
        int m4118constructorimpl2 = NodeKind.m4118constructorimpl(1024);
        Modifier.Node node = getNode();
        int i11 = m4118constructorimpl | m4118constructorimpl2;
        if (!getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node2 = getNode();
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(this);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i11) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet$ui_release() & i11) != 0) {
                        if (node2 != node && (node2.getKindSet$ui_release() & m4118constructorimpl2) != 0) {
                            return focusPropertiesImpl;
                        }
                        if ((node2.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                            DelegatingNode delegatingNode = node2;
                            MutableVector mutableVector = null;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof FocusPropertiesModifierNode) {
                                    ((FocusPropertiesModifierNode) delegatingNode).applyFocusProperties(focusPropertiesImpl);
                                } else if ((delegatingNode.getKindSet$ui_release() & m4118constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                    int i12 = 0;
                                    delegatingNode = delegatingNode;
                                    while (delegate$ui_release != null) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                delegatingNode = delegate$ui_release;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (delegatingNode != 0) {
                                                    mutableVector.add(delegatingNode);
                                                    delegatingNode = 0;
                                                }
                                                mutableVector.add(delegate$ui_release);
                                            }
                                        }
                                        delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                        delegatingNode = delegatingNode;
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                delegatingNode = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                    }
                    node2 = node2.getParent$ui_release();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            node2 = (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
        return focusPropertiesImpl;
    }

    @l
    public final BeyondBoundsLayout getBeyondBoundsLayoutParent() {
        return (BeyondBoundsLayout) getCurrent(androidx.compose.ui.layout.BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout());
    }

    @Override // androidx.compose.ui.focus.FocusTargetModifierNode
    /* renamed from: getFocusability-LCbbffg */
    public int mo2182getFocusabilityLCbbffg() {
        return this.focusability;
    }

    public final int getPreviouslyFocusedChildHash() {
        return this.previouslyFocusedChildHash;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    public final void initializeFocusState$ui_release(@l FocusStateImpl focusStateImpl) {
        if (isInitialized$ui_release()) {
            throw new IllegalStateException("Re-initializing focus target node.");
        }
        if (ComposeUiFlags.isTrackFocusEnabled) {
            return;
        }
        FocusTransactionManager requireTransactionManager = FocusTargetNodeKt.requireTransactionManager(this);
        try {
            if (requireTransactionManager.getOngoingTransaction()) {
                requireTransactionManager.cancelTransaction();
            }
            requireTransactionManager.beginTransaction();
            if (focusStateImpl == null) {
                focusStateImpl = (initializeFocusState$isInActiveSubTree(this) && initializeFocusState$hasActiveChild(this)) ? FocusStateImpl.ActiveParent : FocusStateImpl.Inactive;
            }
            setFocusState(focusStateImpl);
            g2 g2Var = g2.f100423a;
            requireTransactionManager.commitTransaction();
        } catch (Throwable th2) {
            requireTransactionManager.commitTransaction();
            throw th2;
        }
    }

    public final void invalidateFocus$ui_release() {
        FocusProperties focusProperties = null;
        if (!isInitialized$ui_release()) {
            initializeFocusState$ui_release$default(this, null, 1, null);
        }
        int i11 = WhenMappings.$EnumSwitchMapping$1[getFocusState().ordinal()];
        if (i11 == 1 || i11 == 2) {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ObserverModifierNodeKt.observeReads(this, new a<g2>() { // from class: androidx.compose.ui.focus.FocusTargetNode$invalidateFocus$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // x00.a
                public /* bridge */ /* synthetic */ g2 invoke() {
                    invoke2();
                    return g2.f100423a;
                }

                /* JADX WARN: Type inference failed for: r1v1, types: [T, androidx.compose.ui.focus.FocusProperties] */
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    objectRef.element = this.fetchFocusProperties$ui_release();
                }
            });
            T t11 = objectRef.element;
            if (t11 == 0) {
                g0.S("focusProperties");
            } else {
                focusProperties = (FocusProperties) t11;
            }
            if (focusProperties.getCanFocus()) {
                return;
            }
            DelegatableNodeKt.requireOwner(this).getFocusOwner().clearFocus(true);
        }
    }

    public final boolean isInitialized$ui_release() {
        return ComposeUiFlags.isTrackFocusEnabled || this.committedFocusState != null;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            return;
        }
        FocusTargetNodeKt.invalidateFocusTarget(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        int i11 = WhenMappings.$EnumSwitchMapping$1[getFocusState().ordinal()];
        if (i11 == 1 || i11 == 2) {
            FocusOwner focusOwner = DelegatableNodeKt.requireOwner(this).getFocusOwner();
            focusOwner.mo2167clearFocusI7lrPNg(true, true, false, FocusDirection.Companion.m2158getExitdhqQ8s());
            if (ComposeUiFlags.isTrackFocusEnabled) {
                focusOwner.scheduleInvalidationForOwner();
            } else {
                FocusTargetNodeKt.invalidateFocusTarget(this);
            }
        } else if (i11 == 3 && !ComposeUiFlags.isTrackFocusEnabled) {
            FocusTransactionManager requireTransactionManager = FocusTargetNodeKt.requireTransactionManager(this);
            try {
                if (requireTransactionManager.getOngoingTransaction()) {
                    requireTransactionManager.cancelTransaction();
                }
                requireTransactionManager.beginTransaction();
                setFocusState(FocusStateImpl.Inactive);
                g2 g2Var = g2.f100423a;
                requireTransactionManager.commitTransaction();
            } catch (Throwable th2) {
                requireTransactionManager.commitTransaction();
                throw th2;
            }
        }
        this.committedFocusState = null;
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            invalidateFocus$ui_release();
            return;
        }
        FocusStateImpl focusState = getFocusState();
        invalidateFocus$ui_release();
        if (focusState != getFocusState()) {
            dispatchFocusCallbacks$ui_release();
        }
    }

    @Override // androidx.compose.ui.focus.FocusTargetModifierNode
    @n(level = DeprecationLevel.HIDDEN, message = "Use the version accepting FocusDirection", replaceWith = @w0(expression = "this.requestFocus()", imports = {}))
    public /* synthetic */ boolean requestFocus() {
        return mo2183requestFocus3ESFkO8(FocusDirection.Companion.m2157getEnterdhqQ8s());
    }

    @Override // androidx.compose.ui.focus.FocusTargetModifierNode
    /* renamed from: requestFocus-3ESFkO8 */
    public boolean mo2183requestFocus3ESFkO8(int i11) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean z11 = false;
            if (!fetchFocusProperties$ui_release().getCanFocus()) {
                Trace.endSection();
                return false;
            }
            if (ComposeUiFlags.isTrackFocusEnabled) {
                int i12 = WhenMappings.$EnumSwitchMapping$0[FocusTransactionsKt.m2193performCustomRequestFocusMxy_nc0(this, i11).ordinal()];
                if (i12 == 1) {
                    z11 = FocusTransactionsKt.performRequestFocus(this);
                } else if (i12 == 2) {
                    z11 = true;
                } else if (i12 != 3 && i12 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                FocusTransactionManager requireTransactionManager = FocusTargetNodeKt.requireTransactionManager(this);
                a<g2> aVar = new a<g2>() { // from class: androidx.compose.ui.focus.FocusTargetNode$requestFocus$1$1
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
                        if (FocusTargetNode.this.getNode().isAttached()) {
                            FocusTargetNode.this.dispatchFocusCallbacks$ui_release();
                        }
                    }
                };
                try {
                    if (requireTransactionManager.getOngoingTransaction()) {
                        requireTransactionManager.cancelTransaction();
                    }
                    requireTransactionManager.beginTransaction();
                    requireTransactionManager.cancellationListener.add(aVar);
                    int i13 = WhenMappings.$EnumSwitchMapping$0[FocusTransactionsKt.m2193performCustomRequestFocusMxy_nc0(this, i11).ordinal()];
                    if (i13 == 1) {
                        z11 = FocusTransactionsKt.performRequestFocus(this);
                    } else if (i13 == 2) {
                        z11 = true;
                    } else if (i13 != 3 && i13 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                } finally {
                    requireTransactionManager.commitTransaction();
                }
            }
            return z11;
        } finally {
            Trace.endSection();
        }
    }

    public void setFocusState(@k FocusStateImpl focusStateImpl) {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            return;
        }
        FocusTargetNodeKt.requireTransactionManager(this).setUncommittedFocusState(this, focusStateImpl);
    }

    @Override // androidx.compose.ui.focus.FocusTargetModifierNode
    /* renamed from: setFocusability-josRg5g */
    public void mo2184setFocusabilityjosRg5g(int i11) {
        if (Focusability.m2200equalsimpl0(this.focusability, i11)) {
            return;
        }
        this.focusability = i11;
        if (!ComposeUiFlags.isTrackFocusEnabled) {
            if (isAttached() && isInitialized$ui_release()) {
                onObservedReadsChanged();
                return;
            }
            return;
        }
        if (isAttached() && this == DelegatableNodeKt.requireOwner(this).getFocusOwner().getActiveFocusTargetNode() && !Focusability.m2197canFocusimpl$ui_release(this.focusability, this)) {
            FocusTransactionsKt.clearFocus(this, true, true);
        }
    }

    public final void setPreviouslyFocusedChildHash(int i11) {
        this.previouslyFocusedChildHash = i11;
    }

    public /* synthetic */ FocusTargetNode(int i11, p pVar, x00.l lVar, int i12, v vVar) {
        this((i12 & 1) != 0 ? Focusability.Companion.m2204getAlwaysLCbbffg() : i11, (i12 & 2) != 0 ? null : pVar, (i12 & 4) != 0 ? null : lVar, null);
    }

    @Override // androidx.compose.ui.focus.FocusTargetModifierNode
    @k
    public FocusStateImpl getFocusState() {
        FocusStateImpl uncommittedFocusState;
        FocusOwner focusOwner;
        FocusTargetNode activeFocusTargetNode;
        NodeChain nodes$ui_release;
        if (!ComposeUiFlags.isTrackFocusEnabled) {
            FocusTransactionManager focusTransactionManager = FocusTargetNodeKt.getFocusTransactionManager(this);
            if (focusTransactionManager != null && (uncommittedFocusState = focusTransactionManager.getUncommittedFocusState(this)) != null) {
                return uncommittedFocusState;
            }
            FocusStateImpl focusStateImpl = this.committedFocusState;
            return focusStateImpl == null ? FocusStateImpl.Inactive : focusStateImpl;
        }
        if (isAttached() && (activeFocusTargetNode = (focusOwner = DelegatableNodeKt.requireOwner(this).getFocusOwner()).getActiveFocusTargetNode()) != null) {
            if (this == activeFocusTargetNode) {
                return focusOwner.isFocusCaptured() ? FocusStateImpl.Captured : FocusStateImpl.Active;
            }
            if (activeFocusTargetNode.isAttached()) {
                int m4118constructorimpl = NodeKind.m4118constructorimpl(1024);
                if (!activeFocusTargetNode.getNode().isAttached()) {
                    InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
                }
                Modifier.Node parent$ui_release = activeFocusTargetNode.getNode().getParent$ui_release();
                LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(activeFocusTargetNode);
                while (requireLayoutNode != null) {
                    if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4118constructorimpl) != 0) {
                        while (parent$ui_release != null) {
                            if ((parent$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                                Modifier.Node node = parent$ui_release;
                                MutableVector mutableVector = null;
                                while (node != null) {
                                    if (node instanceof FocusTargetNode) {
                                        if (this == ((FocusTargetNode) node)) {
                                            return FocusStateImpl.ActiveParent;
                                        }
                                    } else if ((node.getKindSet$ui_release() & m4118constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                        int i11 = 0;
                                        for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                            if ((delegate$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                                                i11++;
                                                if (i11 == 1) {
                                                    node = delegate$ui_release;
                                                } else {
                                                    if (mutableVector == null) {
                                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (node != null) {
                                                        mutableVector.add(node);
                                                        node = null;
                                                    }
                                                    mutableVector.add(delegate$ui_release);
                                                }
                                            }
                                        }
                                        if (i11 == 1) {
                                        }
                                    }
                                    node = DelegatableNodeKt.pop(mutableVector);
                                }
                            }
                            parent$ui_release = parent$ui_release.getParent$ui_release();
                        }
                    }
                    requireLayoutNode = requireLayoutNode.getParent$ui_release();
                    parent$ui_release = (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
                }
            }
            return FocusStateImpl.Inactive;
        }
        return FocusStateImpl.Inactive;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private FocusTargetNode(int i11, p<? super FocusState, ? super FocusState, g2> pVar, x00.l<? super FocusTargetNode, g2> lVar) {
        this.onFocusChange = pVar;
        this.onDispatchEventsCompleted = lVar;
        this.focusability = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [androidx.compose.ui.Modifier$Node] */
    public final void dispatchFocusCallbacks$ui_release(@k FocusState focusState, @k FocusState focusState2) {
        NodeChain nodes$ui_release;
        p<FocusState, FocusState, g2> pVar;
        FocusOwner focusOwner = DelegatableNodeKt.requireOwner(this).getFocusOwner();
        FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
        if (!g0.g(focusState, focusState2) && (pVar = this.onFocusChange) != null) {
            pVar.invoke(focusState, focusState2);
        }
        int m4118constructorimpl = NodeKind.m4118constructorimpl(4096);
        int m4118constructorimpl2 = NodeKind.m4118constructorimpl(1024);
        Modifier.Node node = getNode();
        int i11 = m4118constructorimpl | m4118constructorimpl2;
        if (!getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node2 = getNode();
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(this);
        loop0: while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i11) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet$ui_release() & i11) != 0) {
                        if (node2 != node && (node2.getKindSet$ui_release() & m4118constructorimpl2) != 0) {
                            break loop0;
                        }
                        if ((node2.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                            DelegatingNode delegatingNode = node2;
                            MutableVector mutableVector = null;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof FocusEventModifierNode) {
                                    FocusEventModifierNode focusEventModifierNode = (FocusEventModifierNode) delegatingNode;
                                    if (activeFocusTargetNode == focusOwner.getActiveFocusTargetNode()) {
                                        focusEventModifierNode.onFocusEvent(focusState2);
                                    }
                                } else if ((delegatingNode.getKindSet$ui_release() & m4118constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                    int i12 = 0;
                                    delegatingNode = delegatingNode;
                                    while (delegate$ui_release != null) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                delegatingNode = delegate$ui_release;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (delegatingNode != 0) {
                                                    mutableVector.add(delegatingNode);
                                                    delegatingNode = 0;
                                                }
                                                mutableVector.add(delegate$ui_release);
                                            }
                                        }
                                        delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                        delegatingNode = delegatingNode;
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                delegatingNode = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                    }
                    node2 = node2.getParent$ui_release();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            node2 = (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
        x00.l<FocusTargetNode, g2> lVar = this.onDispatchEventsCompleted;
        if (lVar != null) {
            lVar.invoke(this);
        }
    }
}
