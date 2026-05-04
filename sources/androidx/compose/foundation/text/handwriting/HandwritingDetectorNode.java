package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager;
import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager_androidKt;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import kotlin.LazyThreadSafetyMode;
import m80.k;
import x00.a;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class HandwritingDetectorNode extends DelegatingNode implements PointerInputModifierNode {

    @k
    private a<g2> callback;

    @k
    private final c0 composeImm$delegate = e0.b(LazyThreadSafetyMode.NONE, new a<ComposeInputMethodManager>() { // from class: androidx.compose.foundation.text.handwriting.HandwritingDetectorNode$composeImm$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final ComposeInputMethodManager invoke() {
            return ComposeInputMethodManager_androidKt.ComposeInputMethodManager(DelegatableNode_androidKt.requireView(HandwritingDetectorNode.this));
        }
    });

    @k
    private final StylusHandwritingNode pointerInputNode = (StylusHandwritingNode) delegate(new StylusHandwritingNode(new a<g2>() { // from class: androidx.compose.foundation.text.handwriting.HandwritingDetectorNode$pointerInputNode$1
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
            ComposeInputMethodManager composeImm;
            HandwritingDetectorNode.this.getCallback().invoke();
            composeImm = HandwritingDetectorNode.this.getComposeImm();
            composeImm.prepareStylusHandwritingDelegation();
        }
    }));

    public HandwritingDetectorNode(@k a<g2> aVar) {
        this.callback = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ComposeInputMethodManager getComposeImm() {
        return (ComposeInputMethodManager) this.composeImm$delegate.getValue();
    }

    @k
    public final a<g2> getCallback() {
        return this.callback;
    }

    @k
    public final StylusHandwritingNode getPointerInputNode() {
        return this.pointerInputNode;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: getTouchBoundsExpansion-RZrCHBk, reason: not valid java name */
    public long mo1175getTouchBoundsExpansionRZrCHBk() {
        return this.pointerInputNode.mo1175getTouchBoundsExpansionRZrCHBk();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.pointerInputNode.onCancelPointerInput();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo205onPointerEventH0pRuoY(@k PointerEvent pointerEvent, @k PointerEventPass pointerEventPass, long j11) {
        this.pointerInputNode.mo205onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j11);
    }

    public final void setCallback(@k a<g2> aVar) {
        this.callback = aVar;
    }
}
