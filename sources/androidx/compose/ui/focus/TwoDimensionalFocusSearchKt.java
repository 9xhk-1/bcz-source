package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTwoDimensionalFocusSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TwoDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/TwoDimensionalFocusSearchKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 8 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 9 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 10 Rect.kt\nandroidx/compose/ui/geometry/Rect\n+ 11 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,438:1\n1083#2,2:439\n1083#2,2:445\n1101#2:460\n1083#2,2:461\n1101#2:538\n1083#2,2:539\n340#3:441\n516#3:442\n472#3:443\n519#3:466\n44#3:468\n519#3:524\n519#3:544\n44#3:546\n423#3,9:606\n1#4:444\n119#5:447\n119#5:525\n283#6,5:448\n148#6:453\n149#6:459\n150#6,3:463\n153#6:467\n154#6,9:469\n437#6,6:478\n447#6,2:485\n449#6,17:490\n466#6,8:510\n163#6,6:518\n283#6,5:526\n148#6:531\n149#6:537\n150#6,3:541\n153#6:545\n154#6,9:547\n437#6,6:556\n447#6,2:563\n449#6,17:568\n466#6,8:588\n163#6,6:596\n56#7,5:454\n56#7,5:532\n246#8:484\n246#8:562\n240#9,3:487\n243#9,3:507\n240#9,3:565\n243#9,3:585\n56#10:602\n56#10:603\n61#10:604\n61#10:605\n61#10:616\n56#10:617\n69#11:615\n69#11:618\n69#11:619\n*S KotlinDebug\n*F\n+ 1 TwoDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/TwoDimensionalFocusSearchKt\n*L\n127#1:439,2\n200#1:445,2\n201#1:460\n201#1:461,2\n230#1:538\n230#1:539,2\n132#1:441\n132#1:442\n132#1:443\n201#1:466\n201#1:468\n207#1:524\n230#1:544\n230#1:546\n262#1:606,9\n201#1:447\n230#1:525\n201#1:448,5\n201#1:453\n201#1:459\n201#1:463,3\n201#1:467\n201#1:469,9\n201#1:478,6\n201#1:485,2\n201#1:490,17\n201#1:510,8\n201#1:518,6\n230#1:526,5\n230#1:531\n230#1:537\n230#1:541,3\n230#1:545\n230#1:547,9\n230#1:556,6\n230#1:563,2\n230#1:568,17\n230#1:588,8\n230#1:596,6\n201#1:454,5\n230#1:532,5\n201#1:484\n230#1:562\n201#1:487,3\n201#1:507,3\n230#1:565,3\n230#1:585,3\n254#1:602\n255#1:603\n256#1:604\n257#1:605\n321#1:616\n324#1:617\n312#1:615\n391#1:618\n406#1:619\n*E\n"})
/* loaded from: classes.dex */
public final class TwoDimensionalFocusSearchKt {

    @k
    private static final String InvalidFocusDirection = "This function should only be used for 2-D focus search";

    @k
    private static final String NoActiveChild = "ActiveParent must have a focusedChild";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final FocusTargetNode activeNode(FocusTargetNode focusTargetNode) {
        if (focusTargetNode.getFocusState() != FocusStateImpl.ActiveParent) {
            throw new IllegalStateException("Searching for active node in inactive hierarchy");
        }
        FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(focusTargetNode);
        if (findActiveFocusNode != null) {
            return findActiveFocusNode;
        }
        throw new IllegalStateException(NoActiveChild);
    }

    /* renamed from: beamBeats-I7lrPNg, reason: not valid java name */
    private static final boolean m2212beamBeatsI7lrPNg(Rect rect, Rect rect2, Rect rect3, int i11) {
        if (beamBeats_I7lrPNg$inSourceBeam(rect3, i11, rect) || !beamBeats_I7lrPNg$inSourceBeam(rect2, i11, rect)) {
            return false;
        }
        if (!beamBeats_I7lrPNg$isInDirectionOfSearch(rect3, i11, rect)) {
            return true;
        }
        FocusDirection.Companion companion = FocusDirection.Companion;
        return FocusDirection.m2152equalsimpl0(i11, companion.m2159getLeftdhqQ8s()) || FocusDirection.m2152equalsimpl0(i11, companion.m2162getRightdhqQ8s()) || beamBeats_I7lrPNg$majorAxisDistance$6(rect2, i11, rect) < beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(rect3, i11, rect);
    }

    private static final boolean beamBeats_I7lrPNg$inSourceBeam(Rect rect, int i11, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m2152equalsimpl0(i11, companion.m2159getLeftdhqQ8s()) ? true : FocusDirection.m2152equalsimpl0(i11, companion.m2162getRightdhqQ8s())) {
            return rect.getBottom() > rect2.getTop() && rect.getTop() < rect2.getBottom();
        }
        if (FocusDirection.m2152equalsimpl0(i11, companion.m2163getUpdhqQ8s()) ? true : FocusDirection.m2152equalsimpl0(i11, companion.m2156getDowndhqQ8s())) {
            return rect.getRight() > rect2.getLeft() && rect.getLeft() < rect2.getRight();
        }
        throw new IllegalStateException(InvalidFocusDirection);
    }

    private static final boolean beamBeats_I7lrPNg$isInDirectionOfSearch(Rect rect, int i11, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m2152equalsimpl0(i11, companion.m2159getLeftdhqQ8s())) {
            return rect2.getLeft() >= rect.getRight();
        }
        if (FocusDirection.m2152equalsimpl0(i11, companion.m2162getRightdhqQ8s())) {
            return rect2.getRight() <= rect.getLeft();
        }
        if (FocusDirection.m2152equalsimpl0(i11, companion.m2163getUpdhqQ8s())) {
            return rect2.getTop() >= rect.getBottom();
        }
        if (FocusDirection.m2152equalsimpl0(i11, companion.m2156getDowndhqQ8s())) {
            return rect2.getBottom() <= rect.getTop();
        }
        throw new IllegalStateException(InvalidFocusDirection);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0057 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final float beamBeats_I7lrPNg$majorAxisDistance$6(androidx.compose.ui.geometry.Rect r2, int r3, androidx.compose.ui.geometry.Rect r4) {
        /*
            androidx.compose.ui.focus.FocusDirection$Companion r0 = androidx.compose.ui.focus.FocusDirection.Companion
            int r1 = r0.m2159getLeftdhqQ8s()
            boolean r1 = androidx.compose.ui.focus.FocusDirection.m2152equalsimpl0(r3, r1)
            if (r1 == 0) goto L16
            float r3 = r4.getLeft()
            float r2 = r2.getRight()
        L14:
            float r3 = r3 - r2
            goto L51
        L16:
            int r1 = r0.m2162getRightdhqQ8s()
            boolean r1 = androidx.compose.ui.focus.FocusDirection.m2152equalsimpl0(r3, r1)
            if (r1 == 0) goto L2b
            float r2 = r2.getLeft()
            float r3 = r4.getRight()
        L28:
            float r3 = r2 - r3
            goto L51
        L2b:
            int r1 = r0.m2163getUpdhqQ8s()
            boolean r1 = androidx.compose.ui.focus.FocusDirection.m2152equalsimpl0(r3, r1)
            if (r1 == 0) goto L3e
            float r3 = r4.getTop()
            float r2 = r2.getBottom()
            goto L14
        L3e:
            int r0 = r0.m2156getDowndhqQ8s()
            boolean r3 = androidx.compose.ui.focus.FocusDirection.m2152equalsimpl0(r3, r0)
            if (r3 == 0) goto L58
            float r2 = r2.getTop()
            float r3 = r4.getBottom()
            goto L28
        L51:
            r2 = 0
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 >= 0) goto L57
            return r2
        L57:
            return r3
        L58:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "This function should only be used for 2-D focus search"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt.beamBeats_I7lrPNg$majorAxisDistance$6(androidx.compose.ui.geometry.Rect, int, androidx.compose.ui.geometry.Rect):float");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0058 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final float beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(androidx.compose.ui.geometry.Rect r2, int r3, androidx.compose.ui.geometry.Rect r4) {
        /*
            androidx.compose.ui.focus.FocusDirection$Companion r0 = androidx.compose.ui.focus.FocusDirection.Companion
            int r1 = r0.m2159getLeftdhqQ8s()
            boolean r1 = androidx.compose.ui.focus.FocusDirection.m2152equalsimpl0(r3, r1)
            if (r1 == 0) goto L16
            float r3 = r4.getLeft()
            float r2 = r2.getLeft()
        L14:
            float r3 = r3 - r2
            goto L51
        L16:
            int r1 = r0.m2162getRightdhqQ8s()
            boolean r1 = androidx.compose.ui.focus.FocusDirection.m2152equalsimpl0(r3, r1)
            if (r1 == 0) goto L2b
            float r2 = r2.getRight()
            float r3 = r4.getRight()
        L28:
            float r3 = r2 - r3
            goto L51
        L2b:
            int r1 = r0.m2163getUpdhqQ8s()
            boolean r1 = androidx.compose.ui.focus.FocusDirection.m2152equalsimpl0(r3, r1)
            if (r1 == 0) goto L3e
            float r3 = r4.getTop()
            float r2 = r2.getTop()
            goto L14
        L3e:
            int r0 = r0.m2156getDowndhqQ8s()
            boolean r3 = androidx.compose.ui.focus.FocusDirection.m2152equalsimpl0(r3, r0)
            if (r3 == 0) goto L59
            float r2 = r2.getBottom()
            float r3 = r4.getBottom()
            goto L28
        L51:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 >= 0) goto L58
            return r2
        L58:
            return r3
        L59:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "This function should only be used for 2-D focus search"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt.beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(androidx.compose.ui.geometry.Rect, int, androidx.compose.ui.geometry.Rect):float");
    }

    private static final Rect bottomRight(Rect rect) {
        return new Rect(rect.getRight(), rect.getBottom(), rect.getRight(), rect.getBottom());
    }

    private static final void collectAccessibleChildren(DelegatableNode delegatableNode, MutableVector<FocusTargetNode> mutableVector) {
        int m4118constructorimpl = NodeKind.m4118constructorimpl(1024);
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, delegatableNode.getNode(), false);
        } else {
            mutableVector2.add(child$ui_release);
        }
        while (mutableVector2.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((node.getAggregateChildKindSet$ui_release() & m4118constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node, false);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    }
                    if ((node.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                        MutableVector mutableVector3 = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode = (FocusTargetNode) node;
                                if (focusTargetNode.isAttached() && !DelegatableNodeKt.requireLayoutNode(focusTargetNode).isDeactivated()) {
                                    if (focusTargetNode.fetchFocusProperties$ui_release().getCanFocus()) {
                                        mutableVector.add(focusTargetNode);
                                    } else {
                                        collectAccessibleChildren(focusTargetNode, mutableVector);
                                    }
                                }
                            } else if ((node.getKindSet$ui_release() & m4118constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                int i11 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            node = delegate$ui_release;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                mutableVector3.add(node);
                                                node = null;
                                            }
                                            mutableVector3.add(delegate$ui_release);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            node = DelegatableNodeKt.pop(mutableVector3);
                        }
                    } else {
                        node = node.getChild$ui_release();
                    }
                }
            }
        }
    }

    /* renamed from: findBestCandidate-4WY_MpI, reason: not valid java name */
    private static final FocusTargetNode m2213findBestCandidate4WY_MpI(MutableVector<FocusTargetNode> mutableVector, Rect rect, int i11) {
        Rect translate;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m2152equalsimpl0(i11, companion.m2159getLeftdhqQ8s())) {
            translate = rect.translate((rect.getRight() - rect.getLeft()) + 1, 0.0f);
        } else if (FocusDirection.m2152equalsimpl0(i11, companion.m2162getRightdhqQ8s())) {
            translate = rect.translate(-((rect.getRight() - rect.getLeft()) + 1), 0.0f);
        } else if (FocusDirection.m2152equalsimpl0(i11, companion.m2163getUpdhqQ8s())) {
            translate = rect.translate(0.0f, (rect.getBottom() - rect.getTop()) + 1);
        } else {
            if (!FocusDirection.m2152equalsimpl0(i11, companion.m2156getDowndhqQ8s())) {
                throw new IllegalStateException(InvalidFocusDirection);
            }
            translate = rect.translate(0.0f, -((rect.getBottom() - rect.getTop()) + 1));
        }
        FocusTargetNode[] focusTargetNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        FocusTargetNode focusTargetNode = null;
        for (int i12 = 0; i12 < size; i12++) {
            FocusTargetNode focusTargetNode2 = focusTargetNodeArr[i12];
            if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2)) {
                Rect focusRect = FocusTraversalKt.focusRect(focusTargetNode2);
                if (m2216isBetterCandidateI7lrPNg(focusRect, translate, rect, i11)) {
                    focusTargetNode = focusTargetNode2;
                    translate = focusRect;
                }
            }
        }
        return focusTargetNode;
    }

    /* renamed from: findChildCorrespondingToFocusEnter--OM-vw8, reason: not valid java name */
    public static final boolean m2214findChildCorrespondingToFocusEnterOMvw8(@k FocusTargetNode focusTargetNode, int i11, @k l<? super FocusTargetNode, Boolean> lVar) {
        Rect bottomRight;
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        collectAccessibleChildren(focusTargetNode, mutableVector);
        if (mutableVector.getSize() <= 1) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) (mutableVector.getSize() == 0 ? null : mutableVector.content[0]);
            if (focusTargetNode2 != null) {
                return lVar.invoke(focusTargetNode2).booleanValue();
            }
            return false;
        }
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m2152equalsimpl0(i11, companion.m2157getEnterdhqQ8s())) {
            i11 = companion.m2162getRightdhqQ8s();
        }
        if (FocusDirection.m2152equalsimpl0(i11, companion.m2162getRightdhqQ8s()) ? true : FocusDirection.m2152equalsimpl0(i11, companion.m2156getDowndhqQ8s())) {
            bottomRight = topLeft(FocusTraversalKt.focusRect(focusTargetNode));
        } else {
            if (!(FocusDirection.m2152equalsimpl0(i11, companion.m2159getLeftdhqQ8s()) ? true : FocusDirection.m2152equalsimpl0(i11, companion.m2163getUpdhqQ8s()))) {
                throw new IllegalStateException(InvalidFocusDirection);
            }
            bottomRight = bottomRight(FocusTraversalKt.focusRect(focusTargetNode));
        }
        FocusTargetNode m2213findBestCandidate4WY_MpI = m2213findBestCandidate4WY_MpI(mutableVector, bottomRight, i11);
        if (m2213findBestCandidate4WY_MpI != null) {
            return lVar.invoke(m2213findBestCandidate4WY_MpI).booleanValue();
        }
        return false;
    }

    /* renamed from: generateAndSearchChildren-4C6V_qg, reason: not valid java name */
    private static final boolean m2215generateAndSearchChildren4C6V_qg(final FocusTargetNode focusTargetNode, final Rect rect, final int i11, final l<? super FocusTargetNode, Boolean> lVar) {
        if (m2217searchChildren4C6V_qg(focusTargetNode, rect, i11, lVar)) {
            return true;
        }
        final FocusTransactionManager requireTransactionManager = FocusTargetNodeKt.requireTransactionManager(focusTargetNode);
        final int generation = requireTransactionManager.getGeneration();
        final FocusTargetNode activeFocusTargetNode = DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().getActiveFocusTargetNode();
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.m2147searchBeyondBoundsOMvw8(focusTargetNode, i11, new l<BeyondBoundsLayout.BeyondBoundsScope, Boolean>() { // from class: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // x00.l
            public final Boolean invoke(BeyondBoundsLayout.BeyondBoundsScope beyondBoundsScope) {
                boolean m2217searchChildren4C6V_qg;
                if (generation != requireTransactionManager.getGeneration() || (ComposeUiFlags.isTrackFocusEnabled && activeFocusTargetNode != DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().getActiveFocusTargetNode())) {
                    return Boolean.TRUE;
                }
                m2217searchChildren4C6V_qg = TwoDimensionalFocusSearchKt.m2217searchChildren4C6V_qg(focusTargetNode, rect, i11, lVar);
                Boolean valueOf = Boolean.valueOf(m2217searchChildren4C6V_qg);
                if (m2217searchChildren4C6V_qg || !beyondBoundsScope.getHasMoreContent()) {
                    return valueOf;
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: isBetterCandidate-I7lrPNg, reason: not valid java name */
    public static final boolean m2216isBetterCandidateI7lrPNg(@k Rect rect, @k Rect rect2, @k Rect rect3, int i11) {
        if (!isBetterCandidate_I7lrPNg$isCandidate(rect, i11, rect3)) {
            return false;
        }
        if (isBetterCandidate_I7lrPNg$isCandidate(rect2, i11, rect3) && !m2212beamBeatsI7lrPNg(rect3, rect, rect2, i11)) {
            return !m2212beamBeatsI7lrPNg(rect3, rect2, rect, i11) && isBetterCandidate_I7lrPNg$weightedDistance(i11, rect3, rect) < isBetterCandidate_I7lrPNg$weightedDistance(i11, rect3, rect2);
        }
        return true;
    }

    private static final boolean isBetterCandidate_I7lrPNg$isCandidate(Rect rect, int i11, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m2152equalsimpl0(i11, companion.m2159getLeftdhqQ8s())) {
            return (rect2.getRight() > rect.getRight() || rect2.getLeft() >= rect.getRight()) && rect2.getLeft() > rect.getLeft();
        }
        if (FocusDirection.m2152equalsimpl0(i11, companion.m2162getRightdhqQ8s())) {
            return (rect2.getLeft() < rect.getLeft() || rect2.getRight() <= rect.getLeft()) && rect2.getRight() < rect.getRight();
        }
        if (FocusDirection.m2152equalsimpl0(i11, companion.m2163getUpdhqQ8s())) {
            return (rect2.getBottom() > rect.getBottom() || rect2.getTop() >= rect.getBottom()) && rect2.getTop() > rect.getTop();
        }
        if (FocusDirection.m2152equalsimpl0(i11, companion.m2156getDowndhqQ8s())) {
            return (rect2.getTop() < rect.getTop() || rect2.getBottom() <= rect.getTop()) && rect2.getBottom() < rect.getBottom();
        }
        throw new IllegalStateException(InvalidFocusDirection);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0057 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final float isBetterCandidate_I7lrPNg$majorAxisDistance(androidx.compose.ui.geometry.Rect r2, int r3, androidx.compose.ui.geometry.Rect r4) {
        /*
            androidx.compose.ui.focus.FocusDirection$Companion r0 = androidx.compose.ui.focus.FocusDirection.Companion
            int r1 = r0.m2159getLeftdhqQ8s()
            boolean r1 = androidx.compose.ui.focus.FocusDirection.m2152equalsimpl0(r3, r1)
            if (r1 == 0) goto L16
            float r3 = r4.getLeft()
            float r2 = r2.getRight()
        L14:
            float r3 = r3 - r2
            goto L51
        L16:
            int r1 = r0.m2162getRightdhqQ8s()
            boolean r1 = androidx.compose.ui.focus.FocusDirection.m2152equalsimpl0(r3, r1)
            if (r1 == 0) goto L2b
            float r2 = r2.getLeft()
            float r3 = r4.getRight()
        L28:
            float r3 = r2 - r3
            goto L51
        L2b:
            int r1 = r0.m2163getUpdhqQ8s()
            boolean r1 = androidx.compose.ui.focus.FocusDirection.m2152equalsimpl0(r3, r1)
            if (r1 == 0) goto L3e
            float r3 = r4.getTop()
            float r2 = r2.getBottom()
            goto L14
        L3e:
            int r0 = r0.m2156getDowndhqQ8s()
            boolean r3 = androidx.compose.ui.focus.FocusDirection.m2152equalsimpl0(r3, r0)
            if (r3 == 0) goto L58
            float r2 = r2.getTop()
            float r3 = r4.getBottom()
            goto L28
        L51:
            r2 = 0
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 >= 0) goto L57
            return r2
        L57:
            return r3
        L58:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "This function should only be used for 2-D focus search"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt.isBetterCandidate_I7lrPNg$majorAxisDistance(androidx.compose.ui.geometry.Rect, int, androidx.compose.ui.geometry.Rect):float");
    }

    private static final float isBetterCandidate_I7lrPNg$minorAxisDistance(Rect rect, int i11, Rect rect2) {
        float f11;
        float f12;
        float left;
        float right;
        float left2;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m2152equalsimpl0(i11, companion.m2159getLeftdhqQ8s()) ? true : FocusDirection.m2152equalsimpl0(i11, companion.m2162getRightdhqQ8s())) {
            float top = rect2.getTop();
            float bottom = rect2.getBottom() - rect2.getTop();
            f11 = 2;
            f12 = top + (bottom / f11);
            left = rect.getTop();
            right = rect.getBottom();
            left2 = rect.getTop();
        } else {
            if (!(FocusDirection.m2152equalsimpl0(i11, companion.m2163getUpdhqQ8s()) ? true : FocusDirection.m2152equalsimpl0(i11, companion.m2156getDowndhqQ8s()))) {
                throw new IllegalStateException(InvalidFocusDirection);
            }
            float left3 = rect2.getLeft();
            float right2 = rect2.getRight() - rect2.getLeft();
            f11 = 2;
            f12 = left3 + (right2 / f11);
            left = rect.getLeft();
            right = rect.getRight();
            left2 = rect.getLeft();
        }
        return f12 - (left + ((right - left2) / f11));
    }

    private static final long isBetterCandidate_I7lrPNg$weightedDistance(int i11, Rect rect, Rect rect2) {
        long isBetterCandidate_I7lrPNg$majorAxisDistance = (long) isBetterCandidate_I7lrPNg$majorAxisDistance(rect2, i11, rect);
        long isBetterCandidate_I7lrPNg$minorAxisDistance = (long) isBetterCandidate_I7lrPNg$minorAxisDistance(rect2, i11, rect);
        return (13 * isBetterCandidate_I7lrPNg$majorAxisDistance * isBetterCandidate_I7lrPNg$majorAxisDistance) + (isBetterCandidate_I7lrPNg$minorAxisDistance * isBetterCandidate_I7lrPNg$minorAxisDistance);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: searchChildren-4C6V_qg, reason: not valid java name */
    public static final boolean m2217searchChildren4C6V_qg(FocusTargetNode focusTargetNode, Rect rect, int i11, l<? super FocusTargetNode, Boolean> lVar) {
        FocusTargetNode m2213findBestCandidate4WY_MpI;
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        int m4118constructorimpl = NodeKind.m4118constructorimpl(1024);
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = focusTargetNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusTargetNode.getNode(), false);
        } else {
            mutableVector2.add(child$ui_release);
        }
        while (mutableVector2.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((node.getAggregateChildKindSet$ui_release() & m4118constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node, false);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    }
                    if ((node.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                        MutableVector mutableVector3 = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) node;
                                if (focusTargetNode2.isAttached()) {
                                    mutableVector.add(focusTargetNode2);
                                }
                            } else if ((node.getKindSet$ui_release() & m4118constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                int i12 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            node = delegate$ui_release;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                mutableVector3.add(node);
                                                node = null;
                                            }
                                            mutableVector3.add(delegate$ui_release);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            node = DelegatableNodeKt.pop(mutableVector3);
                        }
                    } else {
                        node = node.getChild$ui_release();
                    }
                }
            }
        }
        while (mutableVector.getSize() != 0 && (m2213findBestCandidate4WY_MpI = m2213findBestCandidate4WY_MpI(mutableVector, rect, i11)) != null) {
            if (m2213findBestCandidate4WY_MpI.fetchFocusProperties$ui_release().getCanFocus()) {
                return lVar.invoke(m2213findBestCandidate4WY_MpI).booleanValue();
            }
            if (m2215generateAndSearchChildren4C6V_qg(m2213findBestCandidate4WY_MpI, rect, i11, lVar)) {
                return true;
            }
            mutableVector.remove(m2213findBestCandidate4WY_MpI);
        }
        return false;
    }

    private static final Rect topLeft(Rect rect) {
        return new Rect(rect.getLeft(), rect.getTop(), rect.getLeft(), rect.getTop());
    }

    @m80.l
    /* renamed from: twoDimensionalFocusSearch-sMXa3k8, reason: not valid java name */
    public static final Boolean m2218twoDimensionalFocusSearchsMXa3k8(@k FocusTargetNode focusTargetNode, int i11, @m80.l Rect rect, @k l<? super FocusTargetNode, Boolean> lVar) {
        FocusStateImpl focusState = focusTargetNode.getFocusState();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i12 = iArr[focusState.ordinal()];
        if (i12 != 1) {
            if (i12 == 2 || i12 == 3) {
                return Boolean.valueOf(m2214findChildCorrespondingToFocusEnterOMvw8(focusTargetNode, i11, lVar));
            }
            if (i12 == 4) {
                return focusTargetNode.fetchFocusProperties$ui_release().getCanFocus() ? lVar.invoke(focusTargetNode) : rect == null ? Boolean.valueOf(m2214findChildCorrespondingToFocusEnterOMvw8(focusTargetNode, i11, lVar)) : Boolean.valueOf(m2217searchChildren4C6V_qg(focusTargetNode, rect, i11, lVar));
            }
            throw new NoWhenBranchMatchedException();
        }
        FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
        if (activeChild == null) {
            throw new IllegalStateException(NoActiveChild);
        }
        int i13 = iArr[activeChild.getFocusState().ordinal()];
        if (i13 == 1) {
            Boolean m2218twoDimensionalFocusSearchsMXa3k8 = m2218twoDimensionalFocusSearchsMXa3k8(activeChild, i11, rect, lVar);
            if (!g0.g(m2218twoDimensionalFocusSearchsMXa3k8, Boolean.FALSE)) {
                return m2218twoDimensionalFocusSearchsMXa3k8;
            }
            if (rect == null) {
                rect = FocusTraversalKt.focusRect(activeNode(activeChild));
            }
            return Boolean.valueOf(m2215generateAndSearchChildren4C6V_qg(focusTargetNode, rect, i11, lVar));
        }
        if (i13 == 2 || i13 == 3) {
            if (rect == null) {
                rect = FocusTraversalKt.focusRect(activeChild);
            }
            return Boolean.valueOf(m2215generateAndSearchChildren4C6V_qg(focusTargetNode, rect, i11, lVar));
        }
        if (i13 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException(NoActiveChild);
    }
}
