package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.a;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFocusTransactions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTransactions.kt\nandroidx/compose/ui/focus/FocusTransactionsKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 6 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 7 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 9 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n+ 10 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 11 FocusTargetNode.kt\nandroidx/compose/ui/focus/FocusTargetNode\n*L\n1#1,459:1\n1101#2:460\n1083#2,2:461\n1101#2:503\n1083#2,2:504\n1101#2:533\n1083#2,2:534\n1101#2:576\n1083#2,2:577\n1101#2:666\n1083#2,2:667\n1101#2:769\n1083#2,2:770\n1101#2:843\n1083#2,2:844\n1101#2:916\n1083#2,2:917\n119#3:463\n119#3:536\n119#3:624\n119#3:727\n119#3:801\n119#3:874\n247#4,5:464\n90#4:469\n91#4,8:475\n437#4,6:483\n447#4,2:490\n449#4,8:495\n457#4,9:506\n466#4,8:518\n100#4,7:526\n247#4,5:537\n90#4:542\n91#4,8:548\n437#4,6:556\n447#4,2:563\n449#4,8:568\n457#4,9:579\n466#4,8:591\n100#4,7:599\n277#4:625\n247#4,5:626\n90#4:631\n91#4,8:637\n437#4,5:645\n278#4:650\n442#4:651\n447#4,2:653\n449#4,8:658\n457#4,9:669\n466#4,8:681\n100#4,7:689\n280#4:696\n277#4:728\n247#4,5:729\n90#4:734\n91#4,8:740\n437#4,5:748\n278#4:753\n442#4:754\n447#4,2:756\n449#4,8:761\n457#4,9:772\n466#4,8:784\n100#4,7:792\n280#4:799\n277#4:802\n247#4,5:803\n90#4:808\n91#4,8:814\n437#4,5:822\n278#4:827\n442#4:828\n447#4,2:830\n449#4,8:835\n457#4,9:846\n466#4,8:858\n100#4,7:866\n280#4:873\n277#4:875\n247#4,5:876\n90#4:881\n91#4,8:887\n437#4,5:895\n278#4:900\n442#4:901\n447#4,2:903\n449#4,8:908\n457#4,9:919\n466#4,8:931\n100#4,7:939\n280#4:946\n56#5,5:470\n56#5,5:543\n56#5,5:632\n56#5,5:735\n56#5,5:809\n56#5,5:882\n246#6:489\n246#6:562\n246#6:652\n246#6:755\n246#6:829\n246#6:902\n240#7,3:492\n243#7,3:515\n240#7,3:565\n243#7,3:588\n240#7,3:655\n243#7,3:678\n240#7,3:758\n243#7,3:781\n240#7,3:832\n243#7,3:855\n240#7,3:905\n243#7,3:928\n447#8,9:606\n447#8,9:615\n641#8,2:706\n641#8,2:721\n48#9,8:697\n56#9,4:708\n48#9,8:712\n56#9,4:723\n1#10:705\n1#10:720\n1#10:800\n266#11,4:947\n232#11,11:951\n271#11:962\n244#11,7:963\n272#11,3:970\n290#11,4:973\n232#11,11:977\n295#11:988\n244#11,7:989\n296#11,3:996\n*S KotlinDebug\n*F\n+ 1 FocusTransactions.kt\nandroidx/compose/ui/focus/FocusTransactionsKt\n*L\n74#1:460\n74#1:461,2\n75#1:503\n75#1:504,2\n82#1:533\n82#1:534,2\n83#1:576\n83#1:577,2\n155#1:666\n155#1:667,2\n346#1:769\n346#1:770,2\n362#1:843\n362#1:844,2\n415#1:916\n415#1:917,2\n75#1:463\n83#1:536\n155#1:624\n346#1:727\n362#1:801\n415#1:874\n75#1:464,5\n75#1:469\n75#1:475,8\n75#1:483,6\n75#1:490,2\n75#1:495,8\n75#1:506,9\n75#1:518,8\n75#1:526,7\n83#1:537,5\n83#1:542\n83#1:548,8\n83#1:556,6\n83#1:563,2\n83#1:568,8\n83#1:579,9\n83#1:591,8\n83#1:599,7\n155#1:625\n155#1:626,5\n155#1:631\n155#1:637,8\n155#1:645,5\n155#1:650\n155#1:651\n155#1:653,2\n155#1:658,8\n155#1:669,9\n155#1:681,8\n155#1:689,7\n155#1:696\n346#1:728\n346#1:729,5\n346#1:734\n346#1:740,8\n346#1:748,5\n346#1:753\n346#1:754\n346#1:756,2\n346#1:761,8\n346#1:772,9\n346#1:784,8\n346#1:792,7\n346#1:799\n362#1:802\n362#1:803,5\n362#1:808\n362#1:814,8\n362#1:822,5\n362#1:827\n362#1:828\n362#1:830,2\n362#1:835,8\n362#1:846,9\n362#1:858,8\n362#1:866,7\n362#1:873\n415#1:875\n415#1:876,5\n415#1:881\n415#1:887,8\n415#1:895,5\n415#1:900\n415#1:901\n415#1:903,2\n415#1:908,8\n415#1:919,9\n415#1:931,8\n415#1:939,7\n415#1:946\n75#1:470,5\n83#1:543,5\n155#1:632,5\n346#1:735,5\n362#1:809,5\n415#1:882,5\n75#1:489\n83#1:562\n155#1:652\n346#1:755\n362#1:829\n415#1:902\n75#1:492,3\n75#1:515,3\n83#1:565,3\n83#1:588,3\n155#1:655,3\n155#1:678,3\n346#1:758,3\n346#1:781,3\n362#1:832,3\n362#1:855,3\n415#1:905,3\n415#1:928,3\n101#1:606,9\n112#1:615,9\n200#1:706,2\n234#1:721,2\n200#1:697,8\n200#1:708,4\n234#1:712,8\n234#1:723,4\n200#1:705\n234#1:720\n443#1:947,4\n443#1:951,11\n443#1:962\n443#1:963,7\n443#1:970,3\n453#1:973,4\n453#1:977,11\n453#1:988\n453#1:989,7\n453#1:996,3\n*E\n"})
/* loaded from: classes.dex */
public final class FocusTransactionsKt {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean captureFocus(@k FocusTargetNode focusTargetNode) {
        boolean z11 = false;
        if (ComposeUiFlags.isTrackFocusEnabled) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
            if (i11 == 1) {
                DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().setFocusCaptured(true);
                focusTargetNode.dispatchFocusCallbacks$ui_release(FocusStateImpl.Active, FocusStateImpl.Captured);
                return true;
            }
            if (i11 == 2) {
                return true;
            }
            if (i11 == 3 || i11 == 4) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }
        FocusTransactionManager requireTransactionManager = FocusTargetNodeKt.requireTransactionManager(focusTargetNode);
        try {
            if (requireTransactionManager.getOngoingTransaction()) {
                requireTransactionManager.cancelTransaction();
            }
            requireTransactionManager.beginTransaction();
            int i12 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
            if (i12 == 1) {
                focusTargetNode.setFocusState(FocusStateImpl.Captured);
                focusTargetNode.dispatchFocusCallbacks$ui_release();
            } else if (i12 != 2) {
                if (i12 != 3 && i12 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return z11;
            }
            z11 = true;
            return z11;
        } finally {
            requireTransactionManager.commitTransaction();
        }
    }

    private static final boolean clearChildFocus(FocusTargetNode focusTargetNode, boolean z11, boolean z12) {
        FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
        if (activeChild != null) {
            return clearFocus(activeChild, z11, z12);
        }
        return true;
    }

    public static /* synthetic */ boolean clearChildFocus$default(FocusTargetNode focusTargetNode, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        return clearChildFocus(focusTargetNode, z11, z12);
    }

    public static final boolean clearFocus(@k FocusTargetNode focusTargetNode, boolean z11, boolean z12) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i11 == 1) {
            if (ComposeUiFlags.isTrackFocusEnabled) {
                DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().setActiveFocusTargetNode(null);
                if (z12) {
                    focusTargetNode.dispatchFocusCallbacks$ui_release(FocusStateImpl.Active, FocusStateImpl.Inactive);
                }
            } else {
                focusTargetNode.setFocusState(FocusStateImpl.Inactive);
                if (z12) {
                    focusTargetNode.dispatchFocusCallbacks$ui_release();
                }
            }
            return true;
        }
        if (i11 == 2) {
            if (z11) {
                if (ComposeUiFlags.isTrackFocusEnabled) {
                    DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().setActiveFocusTargetNode(null);
                    if (z12) {
                        focusTargetNode.dispatchFocusCallbacks$ui_release(FocusStateImpl.Captured, FocusStateImpl.Inactive);
                        return z11;
                    }
                } else {
                    focusTargetNode.setFocusState(FocusStateImpl.Inactive);
                    if (z12) {
                        focusTargetNode.dispatchFocusCallbacks$ui_release();
                    }
                }
            }
            return z11;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!clearChildFocus(focusTargetNode, z11, z12)) {
            return false;
        }
        if (!ComposeUiFlags.isTrackFocusEnabled) {
            focusTargetNode.setFocusState(FocusStateImpl.Inactive);
            if (z12) {
                focusTargetNode.dispatchFocusCallbacks$ui_release();
            }
        } else if (z12) {
            focusTargetNode.dispatchFocusCallbacks$ui_release(FocusStateImpl.ActiveParent, FocusStateImpl.Inactive);
        }
        return true;
    }

    public static /* synthetic */ boolean clearFocus$default(FocusTargetNode focusTargetNode, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return clearFocus(focusTargetNode, z11, z12);
    }

    public static final boolean freeFocus(@k FocusTargetNode focusTargetNode) {
        boolean z11 = false;
        if (ComposeUiFlags.isTrackFocusEnabled) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3 || i11 == 4) {
                        return false;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().setFocusCaptured(false);
                focusTargetNode.dispatchFocusCallbacks$ui_release(FocusStateImpl.Captured, FocusStateImpl.Active);
            }
            return true;
        }
        FocusTransactionManager requireTransactionManager = FocusTargetNodeKt.requireTransactionManager(focusTargetNode);
        try {
            if (requireTransactionManager.getOngoingTransaction()) {
                requireTransactionManager.cancelTransaction();
            }
            requireTransactionManager.beginTransaction();
            int i12 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3 && i12 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return z11;
                }
                focusTargetNode.setFocusState(FocusStateImpl.Active);
                focusTargetNode.dispatchFocusCallbacks$ui_release();
            }
            z11 = true;
            return z11;
        } finally {
            requireTransactionManager.commitTransaction();
        }
    }

    private static final boolean grantFocus(final FocusTargetNode focusTargetNode) {
        ObserverModifierNodeKt.observeReads(focusTargetNode, new a<g2>() { // from class: androidx.compose.ui.focus.FocusTransactionsKt$grantFocus$1
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
                FocusTargetNode.this.fetchFocusProperties$ui_release();
            }
        });
        int i11 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i11 != 3 && i11 != 4) {
            return true;
        }
        if (ComposeUiFlags.isTrackFocusEnabled) {
            DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().setActiveFocusTargetNode(focusTargetNode);
            return true;
        }
        focusTargetNode.setFocusState(FocusStateImpl.Active);
        return true;
    }

    @k
    /* renamed from: performCustomClearFocus-Mxy_nc0, reason: not valid java name */
    public static final CustomDestinationResult m2190performCustomClearFocusMxy_nc0(@k FocusTargetNode focusTargetNode, int i11) {
        int i12 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i12 != 1) {
            if (i12 == 2) {
                return CustomDestinationResult.Cancelled;
            }
            if (i12 == 3) {
                CustomDestinationResult m2190performCustomClearFocusMxy_nc0 = m2190performCustomClearFocusMxy_nc0(requireActiveChild(focusTargetNode), i11);
                if (m2190performCustomClearFocusMxy_nc0 == CustomDestinationResult.None) {
                    m2190performCustomClearFocusMxy_nc0 = null;
                }
                return m2190performCustomClearFocusMxy_nc0 == null ? m2192performCustomExitMxy_nc0(focusTargetNode, i11) : m2190performCustomClearFocusMxy_nc0;
            }
            if (i12 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return CustomDestinationResult.None;
    }

    /* renamed from: performCustomEnter-Mxy_nc0, reason: not valid java name */
    private static final CustomDestinationResult m2191performCustomEnterMxy_nc0(FocusTargetNode focusTargetNode, int i11) {
        if (!focusTargetNode.isProcessingCustomEnter) {
            focusTargetNode.isProcessingCustomEnter = true;
            try {
                FocusProperties fetchFocusProperties$ui_release = focusTargetNode.fetchFocusProperties$ui_release();
                CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(i11, null);
                FocusTransactionManager focusTransactionManager = FocusTargetNodeKt.getFocusTransactionManager(focusTargetNode);
                int generation = focusTransactionManager != null ? focusTransactionManager.getGeneration() : 0;
                FocusOwner focusOwner = DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner();
                FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
                fetchFocusProperties$ui_release.getOnEnter().invoke(cancelIndicatingFocusBoundaryScope);
                int generation2 = focusTransactionManager != null ? focusTransactionManager.getGeneration() : 0;
                FocusTargetNode activeFocusTargetNode2 = focusOwner.getActiveFocusTargetNode();
                if (cancelIndicatingFocusBoundaryScope.isCanceled()) {
                    FocusRequester.Companion companion = FocusRequester.Companion;
                    FocusRequester cancel = companion.getCancel();
                    if (cancel == companion.getCancel()) {
                        CustomDestinationResult customDestinationResult = CustomDestinationResult.Cancelled;
                        focusTargetNode.isProcessingCustomEnter = false;
                        return customDestinationResult;
                    }
                    if (cancel == companion.getRedirect$ui_release()) {
                        CustomDestinationResult customDestinationResult2 = CustomDestinationResult.Redirected;
                        focusTargetNode.isProcessingCustomEnter = false;
                        return customDestinationResult2;
                    }
                    CustomDestinationResult customDestinationResult3 = FocusRequester.m2179requestFocus3ESFkO8$default(cancel, 0, 1, null) ? CustomDestinationResult.Redirected : CustomDestinationResult.RedirectCancelled;
                    focusTargetNode.isProcessingCustomEnter = false;
                    return customDestinationResult3;
                }
                if (generation != generation2 || (ComposeUiFlags.isTrackFocusEnabled && activeFocusTargetNode != activeFocusTargetNode2 && activeFocusTargetNode2 != null)) {
                    FocusRequester.Companion companion2 = FocusRequester.Companion;
                    FocusRequester redirect$ui_release = companion2.getRedirect$ui_release();
                    if (redirect$ui_release == companion2.getCancel()) {
                        CustomDestinationResult customDestinationResult4 = CustomDestinationResult.Cancelled;
                        focusTargetNode.isProcessingCustomEnter = false;
                        return customDestinationResult4;
                    }
                    if (redirect$ui_release == companion2.getRedirect$ui_release()) {
                        CustomDestinationResult customDestinationResult5 = CustomDestinationResult.Redirected;
                        focusTargetNode.isProcessingCustomEnter = false;
                        return customDestinationResult5;
                    }
                    CustomDestinationResult customDestinationResult6 = FocusRequester.m2179requestFocus3ESFkO8$default(redirect$ui_release, 0, 1, null) ? CustomDestinationResult.Redirected : CustomDestinationResult.RedirectCancelled;
                    focusTargetNode.isProcessingCustomEnter = false;
                    return customDestinationResult6;
                }
                focusTargetNode.isProcessingCustomEnter = false;
            } catch (Throwable th2) {
                focusTargetNode.isProcessingCustomEnter = false;
                throw th2;
            }
        }
        return CustomDestinationResult.None;
    }

    /* renamed from: performCustomExit-Mxy_nc0, reason: not valid java name */
    private static final CustomDestinationResult m2192performCustomExitMxy_nc0(FocusTargetNode focusTargetNode, int i11) {
        if (!focusTargetNode.isProcessingCustomExit) {
            focusTargetNode.isProcessingCustomExit = true;
            try {
                FocusProperties fetchFocusProperties$ui_release = focusTargetNode.fetchFocusProperties$ui_release();
                CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(i11, null);
                FocusTransactionManager focusTransactionManager = FocusTargetNodeKt.getFocusTransactionManager(focusTargetNode);
                int generation = focusTransactionManager != null ? focusTransactionManager.getGeneration() : 0;
                FocusOwner focusOwner = DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner();
                FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
                fetchFocusProperties$ui_release.getOnExit().invoke(cancelIndicatingFocusBoundaryScope);
                int generation2 = focusTransactionManager != null ? focusTransactionManager.getGeneration() : 0;
                FocusTargetNode activeFocusTargetNode2 = focusOwner.getActiveFocusTargetNode();
                if (cancelIndicatingFocusBoundaryScope.isCanceled()) {
                    FocusRequester.Companion companion = FocusRequester.Companion;
                    FocusRequester cancel = companion.getCancel();
                    if (cancel == companion.getCancel()) {
                        CustomDestinationResult customDestinationResult = CustomDestinationResult.Cancelled;
                        focusTargetNode.isProcessingCustomExit = false;
                        return customDestinationResult;
                    }
                    if (cancel == companion.getRedirect$ui_release()) {
                        CustomDestinationResult customDestinationResult2 = CustomDestinationResult.Redirected;
                        focusTargetNode.isProcessingCustomExit = false;
                        return customDestinationResult2;
                    }
                    CustomDestinationResult customDestinationResult3 = FocusRequester.m2179requestFocus3ESFkO8$default(cancel, 0, 1, null) ? CustomDestinationResult.Redirected : CustomDestinationResult.RedirectCancelled;
                    focusTargetNode.isProcessingCustomExit = false;
                    return customDestinationResult3;
                }
                if (generation != generation2 || (ComposeUiFlags.isTrackFocusEnabled && activeFocusTargetNode != activeFocusTargetNode2 && activeFocusTargetNode2 != null)) {
                    FocusRequester.Companion companion2 = FocusRequester.Companion;
                    FocusRequester redirect$ui_release = companion2.getRedirect$ui_release();
                    if (redirect$ui_release == companion2.getCancel()) {
                        CustomDestinationResult customDestinationResult4 = CustomDestinationResult.Cancelled;
                        focusTargetNode.isProcessingCustomExit = false;
                        return customDestinationResult4;
                    }
                    if (redirect$ui_release == companion2.getRedirect$ui_release()) {
                        CustomDestinationResult customDestinationResult5 = CustomDestinationResult.Redirected;
                        focusTargetNode.isProcessingCustomExit = false;
                        return customDestinationResult5;
                    }
                    CustomDestinationResult customDestinationResult6 = FocusRequester.m2179requestFocus3ESFkO8$default(redirect$ui_release, 0, 1, null) ? CustomDestinationResult.Redirected : CustomDestinationResult.RedirectCancelled;
                    focusTargetNode.isProcessingCustomExit = false;
                    return customDestinationResult6;
                }
                focusTargetNode.isProcessingCustomExit = false;
            } catch (Throwable th2) {
                focusTargetNode.isProcessingCustomExit = false;
                throw th2;
            }
        }
        return CustomDestinationResult.None;
    }

    @k
    /* renamed from: performCustomRequestFocus-Mxy_nc0, reason: not valid java name */
    public static final CustomDestinationResult m2193performCustomRequestFocusMxy_nc0(@k FocusTargetNode focusTargetNode, int i11) {
        Modifier.Node node;
        NodeChain nodes$ui_release;
        int i12 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i12 == 1 || i12 == 2) {
            return CustomDestinationResult.None;
        }
        if (i12 == 3) {
            return m2190performCustomClearFocusMxy_nc0(requireActiveChild(focusTargetNode), i11);
        }
        if (i12 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        int m4118constructorimpl = NodeKind.m4118constructorimpl(1024);
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui_release = focusTargetNode.getNode().getParent$ui_release();
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
        loop0: while (true) {
            if (requireLayoutNode == null) {
                node = null;
                break;
            }
            if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4118constructorimpl) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                        node = parent$ui_release;
                        MutableVector mutableVector = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((node.getKindSet$ui_release() & m4118constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                int i13 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                                        i13++;
                                        if (i13 == 1) {
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
                                if (i13 == 1) {
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
        FocusTargetNode focusTargetNode2 = (FocusTargetNode) node;
        if (focusTargetNode2 == null) {
            return CustomDestinationResult.None;
        }
        int i14 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode2.getFocusState().ordinal()];
        if (i14 == 1) {
            return m2191performCustomEnterMxy_nc0(focusTargetNode2, i11);
        }
        if (i14 == 2) {
            return CustomDestinationResult.Cancelled;
        }
        if (i14 == 3) {
            return m2193performCustomRequestFocusMxy_nc0(focusTargetNode2, i11);
        }
        if (i14 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        CustomDestinationResult m2193performCustomRequestFocusMxy_nc0 = m2193performCustomRequestFocusMxy_nc0(focusTargetNode2, i11);
        CustomDestinationResult customDestinationResult = m2193performCustomRequestFocusMxy_nc0 != CustomDestinationResult.None ? m2193performCustomRequestFocusMxy_nc0 : null;
        return customDestinationResult == null ? m2191performCustomEnterMxy_nc0(focusTargetNode2, i11) : customDestinationResult;
    }

    public static final boolean performRequestFocus(@k FocusTargetNode focusTargetNode) {
        return ComposeUiFlags.isTrackFocusEnabled ? performRequestFocusOptimized(focusTargetNode) : performRequestFocusLegacy(focusTargetNode);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00dd, code lost:
    
        if (grantFocus(r11) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00f2, code lost:
    
        if (grantFocus(r11) != false) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final boolean performRequestFocusLegacy(androidx.compose.ui.focus.FocusTargetNode r11) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTransactionsKt.performRequestFocusLegacy(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }

    private static final boolean performRequestFocusOptimized(FocusTargetNode focusTargetNode) {
        MutableVector mutableVector;
        int i11;
        NodeChain nodes$ui_release;
        NodeChain nodes$ui_release2;
        FocusOwner focusOwner = DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner();
        FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
        FocusStateImpl focusState = focusTargetNode.getFocusState();
        int i12 = 1;
        if (activeFocusTargetNode == focusTargetNode) {
            focusTargetNode.dispatchFocusCallbacks$ui_release(focusState, focusState);
            return true;
        }
        int i13 = 0;
        if (activeFocusTargetNode == null && !requestFocusForOwner(focusTargetNode)) {
            return false;
        }
        int i14 = 1024;
        int i15 = 16;
        if (activeFocusTargetNode != null) {
            mutableVector = new MutableVector(new FocusTargetNode[16], 0);
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
                            MutableVector mutableVector2 = null;
                            while (node != null) {
                                int i16 = i14;
                                if (node instanceof FocusTargetNode) {
                                    mutableVector.add((FocusTargetNode) node);
                                } else if ((node.getKindSet$ui_release() & m4118constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release();
                                    int i17 = 0;
                                    while (delegate$ui_release != null) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                                            i17++;
                                            if (i17 == i12) {
                                                node = delegate$ui_release;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (node != null) {
                                                    mutableVector2.add(node);
                                                    node = null;
                                                }
                                                mutableVector2.add(delegate$ui_release);
                                            }
                                        }
                                        delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                        i12 = 1;
                                    }
                                    if (i17 == i12) {
                                        i14 = i16;
                                    }
                                }
                                node = DelegatableNodeKt.pop(mutableVector2);
                                i14 = i16;
                                i12 = 1;
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                        i14 = i14;
                        i12 = 1;
                    }
                }
                int i18 = i14;
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                parent$ui_release = (requireLayoutNode == null || (nodes$ui_release2 = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release2.getTail$ui_release();
                i14 = i18;
                i12 = 1;
            }
        } else {
            mutableVector = null;
        }
        int i19 = i14;
        MutableVector mutableVector3 = new MutableVector(new FocusTargetNode[16], 0);
        int m4118constructorimpl2 = NodeKind.m4118constructorimpl(i19);
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui_release2 = focusTargetNode.getNode().getParent$ui_release();
        LayoutNode requireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
        int i21 = 1;
        while (requireLayoutNode2 != null) {
            if ((requireLayoutNode2.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4118constructorimpl2) != 0) {
                while (parent$ui_release2 != null) {
                    if ((parent$ui_release2.getKindSet$ui_release() & m4118constructorimpl2) != 0) {
                        Modifier.Node node2 = parent$ui_release2;
                        MutableVector mutableVector4 = null;
                        while (node2 != null) {
                            if (node2 instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) node2;
                                Boolean valueOf = mutableVector != null ? Boolean.valueOf(mutableVector.remove(focusTargetNode2)) : null;
                                if (valueOf == null || !valueOf.booleanValue()) {
                                    mutableVector3.add(focusTargetNode2);
                                }
                                if (focusTargetNode2 == activeFocusTargetNode) {
                                    i21 = i13;
                                }
                            } else if ((node2.getKindSet$ui_release() & m4118constructorimpl2) != 0 && (node2 instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui_release2 = ((DelegatingNode) node2).getDelegate$ui_release();
                                int i22 = i13;
                                while (delegate$ui_release2 != null) {
                                    if ((delegate$ui_release2.getKindSet$ui_release() & m4118constructorimpl2) != 0) {
                                        i22++;
                                        if (i22 == 1) {
                                            node2 = delegate$ui_release2;
                                        } else {
                                            if (mutableVector4 == null) {
                                                mutableVector4 = new MutableVector(new Modifier.Node[i15], 0);
                                            }
                                            if (node2 != null) {
                                                mutableVector4.add(node2);
                                                node2 = null;
                                            }
                                            mutableVector4.add(delegate$ui_release2);
                                        }
                                    }
                                    delegate$ui_release2 = delegate$ui_release2.getChild$ui_release();
                                    i15 = 16;
                                }
                                if (i22 == 1) {
                                    i13 = 0;
                                    i15 = 16;
                                }
                            }
                            node2 = DelegatableNodeKt.pop(mutableVector4);
                            i13 = 0;
                            i15 = 16;
                        }
                    }
                    parent$ui_release2 = parent$ui_release2.getParent$ui_release();
                    i13 = 0;
                    i15 = 16;
                }
            }
            requireLayoutNode2 = requireLayoutNode2.getParent$ui_release();
            parent$ui_release2 = (requireLayoutNode2 == null || (nodes$ui_release = requireLayoutNode2.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
            i13 = 0;
            i15 = 16;
        }
        if (i21 == 0 || activeFocusTargetNode == null) {
            i11 = 1;
        } else {
            i11 = 1;
            if (!clearFocus$default(activeFocusTargetNode, false, true, 1, null)) {
                return false;
            }
        }
        grantFocus(focusTargetNode);
        if (mutableVector != null) {
            int size = mutableVector.getSize() - i11;
            Object[] objArr = mutableVector.content;
            if (size < objArr.length) {
                while (size >= 0) {
                    FocusTargetNode focusTargetNode3 = (FocusTargetNode) objArr[size];
                    if (focusOwner.getActiveFocusTargetNode() != focusTargetNode) {
                        return false;
                    }
                    focusTargetNode3.dispatchFocusCallbacks$ui_release(FocusStateImpl.ActiveParent, FocusStateImpl.Inactive);
                    size--;
                }
            }
        }
        int size2 = mutableVector3.getSize() - 1;
        Object[] objArr2 = mutableVector3.content;
        if (size2 < objArr2.length) {
            while (size2 >= 0) {
                FocusTargetNode focusTargetNode4 = (FocusTargetNode) objArr2[size2];
                if (focusOwner.getActiveFocusTargetNode() != focusTargetNode) {
                    return false;
                }
                focusTargetNode4.dispatchFocusCallbacks$ui_release(focusTargetNode4 == activeFocusTargetNode ? FocusStateImpl.Active : FocusStateImpl.Inactive, FocusStateImpl.ActiveParent);
                size2--;
            }
        }
        if (focusOwner.getActiveFocusTargetNode() != focusTargetNode) {
            return false;
        }
        focusTargetNode.dispatchFocusCallbacks$ui_release(focusState, FocusStateImpl.Active);
        if (focusOwner.getActiveFocusTargetNode() != focusTargetNode) {
            return false;
        }
        if (!ComposeUiFlags.isViewFocusFixEnabled || DelegatableNodeKt.requireLayoutNode(focusTargetNode).getInteropView() != null) {
            return true;
        }
        DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().mo2171requestFocusForOwner7o62pno(FocusDirection.m2149boximpl(FocusDirection.Companion.m2160getNextdhqQ8s()), null);
        return true;
    }

    private static final boolean requestFocusForChild(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        Modifier.Node node;
        Modifier.Node node2;
        NodeChain nodes$ui_release;
        NodeChain nodes$ui_release2;
        int m4118constructorimpl = NodeKind.m4118constructorimpl(1024);
        if (!focusTargetNode2.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui_release = focusTargetNode2.getNode().getParent$ui_release();
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode2);
        loop0: while (true) {
            node = null;
            if (requireLayoutNode == null) {
                node2 = null;
                break;
            }
            if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4118constructorimpl) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                        node2 = parent$ui_release;
                        MutableVector mutableVector = null;
                        while (node2 != null) {
                            if (node2 instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((node2.getKindSet$ui_release() & m4118constructorimpl) != 0 && (node2 instanceof DelegatingNode)) {
                                int i11 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) node2).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            node2 = delegate$ui_release;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node2 != null) {
                                                mutableVector.add(node2);
                                                node2 = null;
                                            }
                                            mutableVector.add(delegate$ui_release);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            node2 = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            parent$ui_release = (requireLayoutNode == null || (nodes$ui_release2 = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release2.getTail$ui_release();
        }
        if (!g0.g(node2, focusTargetNode)) {
            throw new IllegalStateException("Non child node cannot request focus.");
        }
        int i12 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i12 == 1) {
            boolean grantFocus = grantFocus(focusTargetNode2);
            if (grantFocus) {
                focusTargetNode.setFocusState(FocusStateImpl.ActiveParent);
            }
            return grantFocus;
        }
        if (i12 != 2) {
            if (i12 != 3) {
                if (i12 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                int m4118constructorimpl2 = NodeKind.m4118constructorimpl(1024);
                if (!focusTargetNode.getNode().isAttached()) {
                    InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
                }
                Modifier.Node parent$ui_release2 = focusTargetNode.getNode().getParent$ui_release();
                LayoutNode requireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
                loop4: while (true) {
                    if (requireLayoutNode2 == null) {
                        break;
                    }
                    if ((requireLayoutNode2.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4118constructorimpl2) != 0) {
                        while (parent$ui_release2 != null) {
                            if ((parent$ui_release2.getKindSet$ui_release() & m4118constructorimpl2) != 0) {
                                Modifier.Node node3 = parent$ui_release2;
                                MutableVector mutableVector2 = null;
                                while (node3 != null) {
                                    if (node3 instanceof FocusTargetNode) {
                                        node = node3;
                                        break loop4;
                                    }
                                    if ((node3.getKindSet$ui_release() & m4118constructorimpl2) != 0 && (node3 instanceof DelegatingNode)) {
                                        int i13 = 0;
                                        for (Modifier.Node delegate$ui_release2 = ((DelegatingNode) node3).getDelegate$ui_release(); delegate$ui_release2 != null; delegate$ui_release2 = delegate$ui_release2.getChild$ui_release()) {
                                            if ((delegate$ui_release2.getKindSet$ui_release() & m4118constructorimpl2) != 0) {
                                                i13++;
                                                if (i13 == 1) {
                                                    node3 = delegate$ui_release2;
                                                } else {
                                                    if (mutableVector2 == null) {
                                                        mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (node3 != null) {
                                                        mutableVector2.add(node3);
                                                        node3 = null;
                                                    }
                                                    mutableVector2.add(delegate$ui_release2);
                                                }
                                            }
                                        }
                                        if (i13 == 1) {
                                        }
                                    }
                                    node3 = DelegatableNodeKt.pop(mutableVector2);
                                }
                            }
                            parent$ui_release2 = parent$ui_release2.getParent$ui_release();
                        }
                    }
                    requireLayoutNode2 = requireLayoutNode2.getParent$ui_release();
                    parent$ui_release2 = (requireLayoutNode2 == null || (nodes$ui_release = requireLayoutNode2.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
                }
                FocusTargetNode focusTargetNode3 = (FocusTargetNode) node;
                if (focusTargetNode3 == null && requestFocusForOwner(focusTargetNode)) {
                    boolean grantFocus2 = grantFocus(focusTargetNode2);
                    if (grantFocus2) {
                        focusTargetNode.setFocusState(FocusStateImpl.ActiveParent);
                    }
                    return grantFocus2;
                }
                if (focusTargetNode3 == null || !requestFocusForChild(focusTargetNode3, focusTargetNode)) {
                    return false;
                }
                boolean requestFocusForChild = requestFocusForChild(focusTargetNode, focusTargetNode2);
                if (focusTargetNode.getFocusState() != FocusStateImpl.ActiveParent) {
                    throw new IllegalStateException("Deactivated node is focused");
                }
                if (requestFocusForChild) {
                    focusTargetNode3.dispatchFocusCallbacks$ui_release();
                }
                return requestFocusForChild;
            }
            requireActiveChild(focusTargetNode);
            if (clearChildFocus$default(focusTargetNode, false, false, 3, null) && grantFocus(focusTargetNode2)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean requestFocusForOwner(FocusTargetNode focusTargetNode) {
        return DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().mo2171requestFocusForOwner7o62pno(null, null);
    }

    private static final FocusTargetNode requireActiveChild(FocusTargetNode focusTargetNode) {
        FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
        if (activeChild != null) {
            return activeChild;
        }
        throw new IllegalArgumentException("ActiveParent with no focused child");
    }
}
