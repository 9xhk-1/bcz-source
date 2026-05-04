package androidx.compose.ui.viewinterop;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusEnterExitScope;
import androidx.compose.ui.focus.FocusInteropUtils_androidKt;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFocusGroupNode.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusGroupNode.android.kt\nandroidx/compose/ui/viewinterop/FocusGroupPropertiesNode\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 8 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 10 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,275:1\n119#2:276\n240#3:277\n202#3,8:278\n210#3,6:291\n437#3,6:297\n447#3,2:304\n449#3,8:309\n457#3,9:320\n466#3,8:332\n217#3,3:340\n56#4,5:286\n246#5:303\n240#6,3:306\n243#6,3:329\n1101#7:317\n1083#7,2:318\n48#8,8:343\n56#8,4:354\n1#9:351\n641#10,2:352\n*S KotlinDebug\n*F\n+ 1 FocusGroupNode.android.kt\nandroidx/compose/ui/viewinterop/FocusGroupPropertiesNode\n*L\n142#1:276\n142#1:277\n142#1:278,8\n142#1:291,6\n142#1:297,6\n142#1:304,2\n142#1:309,8\n142#1:320,9\n142#1:332,8\n142#1:340,3\n142#1:286,5\n142#1:303\n142#1:306,3\n142#1:329,3\n142#1:317\n142#1:318,2\n173#1:343,8\n173#1:354,4\n173#1:351\n173#1:352,2\n*E\n"})
/* loaded from: classes2.dex */
final class FocusGroupPropertiesNode extends Modifier.Node implements FocusPropertiesModifierNode, ViewTreeObserver.OnGlobalFocusChangeListener {

    @l
    private ViewTreeObserver attachedViewTreeObserver;

    @l
    private View focusedChild;

    @k
    private final x00.l<FocusEnterExitScope, g2> onEnter = new x00.l<FocusEnterExitScope, g2>() { // from class: androidx.compose.ui.viewinterop.FocusGroupPropertiesNode$onEnter$1
        {
            super(1);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(FocusEnterExitScope focusEnterExitScope) {
            invoke2(focusEnterExitScope);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(FocusEnterExitScope focusEnterExitScope) {
            View embeddedView;
            Rect currentlyFocusedRect;
            embeddedView = FocusGroupNode_androidKt.getEmbeddedView(FocusGroupPropertiesNode.this);
            if (embeddedView.isFocused() || embeddedView.hasFocus()) {
                return;
            }
            FocusOwner focusOwner = DelegatableNodeKt.requireOwner(FocusGroupPropertiesNode.this).getFocusOwner();
            View requireView = DelegatableNode_androidKt.requireView(FocusGroupPropertiesNode.this);
            Integer m2164toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m2164toAndroidFocusDirection3ESFkO8(focusEnterExitScope.mo2148getRequestedFocusDirectiondhqQ8s());
            currentlyFocusedRect = FocusGroupNode_androidKt.getCurrentlyFocusedRect(focusOwner, requireView, embeddedView);
            if (FocusInteropUtils_androidKt.requestInteropFocus(embeddedView, m2164toAndroidFocusDirection3ESFkO8, currentlyFocusedRect)) {
                return;
            }
            focusEnterExitScope.cancelFocusChange();
        }
    };

    @k
    private final x00.l<FocusEnterExitScope, g2> onExit = new x00.l<FocusEnterExitScope, g2>() { // from class: androidx.compose.ui.viewinterop.FocusGroupPropertiesNode$onExit$1
        {
            super(1);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(FocusEnterExitScope focusEnterExitScope) {
            invoke2(focusEnterExitScope);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(FocusEnterExitScope focusEnterExitScope) {
            View embeddedView;
            Rect currentlyFocusedRect;
            View findNextFocusFromRect;
            boolean containsDescendant;
            embeddedView = FocusGroupNode_androidKt.getEmbeddedView(FocusGroupPropertiesNode.this);
            if (ComposeUiFlags.isViewFocusFixEnabled) {
                if (embeddedView.hasFocus() || embeddedView.isFocused()) {
                    embeddedView.clearFocus();
                    return;
                }
                return;
            }
            if (embeddedView.hasFocus()) {
                FocusOwner focusOwner = DelegatableNodeKt.requireOwner(FocusGroupPropertiesNode.this).getFocusOwner();
                View requireView = DelegatableNode_androidKt.requireView(FocusGroupPropertiesNode.this);
                if (!(embeddedView instanceof ViewGroup)) {
                    if (!requireView.requestFocus()) {
                        throw new IllegalStateException("host view did not take focus");
                    }
                    return;
                }
                currentlyFocusedRect = FocusGroupNode_androidKt.getCurrentlyFocusedRect(focusOwner, requireView, embeddedView);
                Integer m2164toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m2164toAndroidFocusDirection3ESFkO8(focusEnterExitScope.mo2148getRequestedFocusDirectiondhqQ8s());
                int intValue = m2164toAndroidFocusDirection3ESFkO8 != null ? m2164toAndroidFocusDirection3ESFkO8.intValue() : 130;
                FocusFinder focusFinder = FocusFinder.getInstance();
                FocusGroupPropertiesNode focusGroupPropertiesNode = FocusGroupPropertiesNode.this;
                if (focusGroupPropertiesNode.getFocusedChild() != null) {
                    g0.n(requireView, "null cannot be cast to non-null type android.view.ViewGroup");
                    findNextFocusFromRect = focusFinder.findNextFocus((ViewGroup) requireView, focusGroupPropertiesNode.getFocusedChild(), intValue);
                } else {
                    g0.n(requireView, "null cannot be cast to non-null type android.view.ViewGroup");
                    findNextFocusFromRect = focusFinder.findNextFocusFromRect((ViewGroup) requireView, currentlyFocusedRect, intValue);
                }
                if (findNextFocusFromRect != null) {
                    containsDescendant = FocusGroupNode_androidKt.containsDescendant(embeddedView, findNextFocusFromRect);
                    if (containsDescendant) {
                        findNextFocusFromRect.requestFocus(intValue, currentlyFocusedRect);
                        focusEnterExitScope.cancelFocusChange();
                        return;
                    }
                }
                if (!requireView.requestFocus()) {
                    throw new IllegalStateException("host view did not take focus");
                }
            }
        }
    };

    private final FocusTargetNode getFocusTargetOfEmbeddedViewWrapper() {
        int m4118constructorimpl = NodeKind.m4118constructorimpl(1024);
        if (!getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = getNode();
        if ((node.getAggregateChildKindSet$ui_release() & m4118constructorimpl) != 0) {
            boolean z11 = false;
            for (Modifier.Node child$ui_release = node.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                if ((child$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                    Modifier.Node node2 = child$ui_release;
                    MutableVector mutableVector = null;
                    while (node2 != null) {
                        if (node2 instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) node2;
                            if (z11) {
                                return focusTargetNode;
                            }
                            z11 = true;
                        } else if ((node2.getKindSet$ui_release() & m4118constructorimpl) != 0 && (node2 instanceof DelegatingNode)) {
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
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(@k FocusProperties focusProperties) {
        focusProperties.setCanFocus(false);
        focusProperties.setOnEnter(this.onEnter);
        focusProperties.setOnExit(this.onExit);
    }

    @l
    public final ViewTreeObserver getAttachedViewTreeObserver() {
        return this.attachedViewTreeObserver;
    }

    @l
    public final View getFocusedChild() {
        return this.focusedChild;
    }

    @k
    public final x00.l<FocusEnterExitScope, g2> getOnEnter() {
        return this.onEnter;
    }

    @k
    public final x00.l<FocusEnterExitScope, g2> getOnExit() {
        return this.onExit;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        ViewTreeObserver viewTreeObserver = DelegatableNode_androidKt.requireView(this).getViewTreeObserver();
        this.attachedViewTreeObserver = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        ViewTreeObserver viewTreeObserver = this.attachedViewTreeObserver;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.attachedViewTreeObserver = null;
        DelegatableNode_androidKt.requireView(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.focusedChild = null;
        super.onDetach();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007f  */
    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGlobalFocusChanged(@m80.l android.view.View r7, @m80.l android.view.View r8) {
        /*
            r6 = this;
            androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(r6)
            androidx.compose.ui.node.Owner r0 = r0.getOwner$ui_release()
            if (r0 != 0) goto Lc
            goto L9b
        Lc:
            android.view.View r0 = androidx.compose.ui.viewinterop.FocusGroupNode_androidKt.access$getEmbeddedView(r6)
            androidx.compose.ui.node.Owner r1 = androidx.compose.ui.node.DelegatableNodeKt.requireOwner(r6)
            androidx.compose.ui.focus.FocusOwner r1 = r1.getFocusOwner()
            androidx.compose.ui.node.Owner r2 = androidx.compose.ui.node.DelegatableNodeKt.requireOwner(r6)
            r3 = 1
            r4 = 0
            if (r7 == 0) goto L2e
            boolean r5 = kotlin.jvm.internal.g0.g(r7, r2)
            if (r5 != 0) goto L2e
            boolean r7 = androidx.compose.ui.viewinterop.FocusGroupNode_androidKt.access$containsDescendant(r0, r7)
            if (r7 == 0) goto L2e
            r7 = r3
            goto L2f
        L2e:
            r7 = r4
        L2f:
            if (r8 == 0) goto L3f
            boolean r2 = kotlin.jvm.internal.g0.g(r8, r2)
            if (r2 != 0) goto L3f
            boolean r0 = androidx.compose.ui.viewinterop.FocusGroupNode_androidKt.access$containsDescendant(r0, r8)
            if (r0 == 0) goto L3f
            r0 = r3
            goto L40
        L3f:
            r0 = r4
        L40:
            if (r7 == 0) goto L47
            if (r0 == 0) goto L47
            r6.focusedChild = r8
            return
        L47:
            if (r0 == 0) goto L7f
            r6.focusedChild = r8
            androidx.compose.ui.focus.FocusTargetNode r7 = r6.getFocusTargetOfEmbeddedViewWrapper()
            androidx.compose.ui.focus.FocusStateImpl r8 = r7.getFocusState()
            boolean r8 = r8.getHasFocus()
            if (r8 != 0) goto L9b
            boolean r8 = androidx.compose.ui.ComposeUiFlags.isTrackFocusEnabled
            if (r8 == 0) goto L61
            androidx.compose.ui.focus.FocusTransactionsKt.performRequestFocus(r7)
            return
        L61:
            androidx.compose.ui.focus.FocusTransactionManager r8 = r1.getFocusTransactionManager()
            boolean r0 = r8.getOngoingTransaction()     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L71
            androidx.compose.ui.focus.FocusTransactionManager.access$cancelTransaction(r8)     // Catch: java.lang.Throwable -> L6f
            goto L71
        L6f:
            r7 = move-exception
            goto L7b
        L71:
            androidx.compose.ui.focus.FocusTransactionManager.access$beginTransaction(r8)     // Catch: java.lang.Throwable -> L6f
            androidx.compose.ui.focus.FocusTransactionsKt.performRequestFocus(r7)     // Catch: java.lang.Throwable -> L6f
            androidx.compose.ui.focus.FocusTransactionManager.access$commitTransaction(r8)
            return
        L7b:
            androidx.compose.ui.focus.FocusTransactionManager.access$commitTransaction(r8)
            throw r7
        L7f:
            r8 = 0
            if (r7 == 0) goto L9c
            r6.focusedChild = r8
            androidx.compose.ui.focus.FocusTargetNode r7 = r6.getFocusTargetOfEmbeddedViewWrapper()
            androidx.compose.ui.focus.FocusStateImpl r7 = r7.getFocusState()
            boolean r7 = r7.isFocused()
            if (r7 == 0) goto L9b
            androidx.compose.ui.focus.FocusDirection$Companion r7 = androidx.compose.ui.focus.FocusDirection.Companion
            int r7 = r7.m2158getExitdhqQ8s()
            r1.mo2167clearFocusI7lrPNg(r4, r3, r4, r7)
        L9b:
            return
        L9c:
            r6.focusedChild = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.FocusGroupPropertiesNode.onGlobalFocusChanged(android.view.View, android.view.View):void");
    }

    public final void setAttachedViewTreeObserver(@l ViewTreeObserver viewTreeObserver) {
        this.attachedViewTreeObserver = viewTreeObserver;
    }

    public final void setFocusedChild(@l View view) {
        this.focusedChild = view;
    }
}
