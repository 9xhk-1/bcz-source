package androidx.compose.foundation;

import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.node.PointerInputModifierNode;
import kotlin.jvm.internal.g0;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class HoverableNode extends Modifier.Node implements PointerInputModifierNode {

    @l
    private HoverInteraction.Enter hoverInteraction;

    @m80.k
    private MutableInteractionSource interactionSource;

    public HoverableNode(@m80.k MutableInteractionSource mutableInteractionSource) {
        this.interactionSource = mutableInteractionSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emitEnter(j00.c<? super yz.g2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.HoverableNode$emitEnter$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.HoverableNode$emitEnter$1 r0 = (androidx.compose.foundation.HoverableNode$emitEnter$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.HoverableNode$emitEnter$1 r0 = new androidx.compose.foundation.HoverableNode$emitEnter$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.L$1
            androidx.compose.foundation.interaction.HoverInteraction$Enter r1 = (androidx.compose.foundation.interaction.HoverInteraction.Enter) r1
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.HoverableNode r0 = (androidx.compose.foundation.HoverableNode) r0
            kotlin.e.n(r5)
            goto L56
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L39:
            kotlin.e.n(r5)
            androidx.compose.foundation.interaction.HoverInteraction$Enter r5 = r4.hoverInteraction
            if (r5 != 0) goto L58
            androidx.compose.foundation.interaction.HoverInteraction$Enter r5 = new androidx.compose.foundation.interaction.HoverInteraction$Enter
            r5.<init>()
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r4.interactionSource
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r0 = r2.emit(r5, r0)
            if (r0 != r1) goto L54
            return r1
        L54:
            r0 = r4
            r1 = r5
        L56:
            r0.hoverInteraction = r1
        L58:
            yz.g2 r5 = yz.g2.f100423a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.HoverableNode.emitEnter(j00.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emitExit(j00.c<? super yz.g2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.HoverableNode$emitExit$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.HoverableNode$emitExit$1 r0 = (androidx.compose.foundation.HoverableNode$emitExit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.HoverableNode$emitExit$1 r0 = new androidx.compose.foundation.HoverableNode$emitExit$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.HoverableNode r0 = (androidx.compose.foundation.HoverableNode) r0
            kotlin.e.n(r5)
            goto L4f
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.e.n(r5)
            androidx.compose.foundation.interaction.HoverInteraction$Enter r5 = r4.hoverInteraction
            if (r5 == 0) goto L52
            androidx.compose.foundation.interaction.HoverInteraction$Exit r2 = new androidx.compose.foundation.interaction.HoverInteraction$Exit
            r2.<init>(r5)
            androidx.compose.foundation.interaction.MutableInteractionSource r5 = r4.interactionSource
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.emit(r2, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            r0 = r4
        L4f:
            r5 = 0
            r0.hoverInteraction = r5
        L52:
            yz.g2 r5 = yz.g2.f100423a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.HoverableNode.emitExit(j00.c):java.lang.Object");
    }

    private final void tryEmitExit() {
        HoverInteraction.Enter enter = this.hoverInteraction;
        if (enter != null) {
            this.interactionSource.tryEmit(new HoverInteraction.Exit(enter));
            this.hoverInteraction = null;
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        tryEmitExit();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        tryEmitExit();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo205onPointerEventH0pRuoY(@m80.k PointerEvent pointerEvent, @m80.k PointerEventPass pointerEventPass, long j11) {
        if (pointerEventPass == PointerEventPass.Main) {
            int m3674getType7fucELk = pointerEvent.m3674getType7fucELk();
            PointerEventType.Companion companion = PointerEventType.Companion;
            if (PointerEventType.m3681equalsimpl0(m3674getType7fucELk, companion.m3685getEnter7fucELk())) {
                c40.k.f(getCoroutineScope(), null, null, new HoverableNode$onPointerEvent$1(this, null), 3, null);
            } else if (PointerEventType.m3681equalsimpl0(m3674getType7fucELk, companion.m3686getExit7fucELk())) {
                c40.k.f(getCoroutineScope(), null, null, new HoverableNode$onPointerEvent$2(this, null), 3, null);
            }
        }
    }

    public final void updateInteractionSource(@m80.k MutableInteractionSource mutableInteractionSource) {
        if (g0.g(this.interactionSource, mutableInteractionSource)) {
            return;
        }
        tryEmitExit();
        this.interactionSource = mutableInteractionSource;
    }
}
