package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusRequesterModifierNode;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.u0;
import l00.d;
import m80.k;
import x00.a;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public class StylusHandwritingNode extends DelegatingNode implements PointerInputModifierNode, FocusEventModifierNode, FocusRequesterModifierNode {
    public static final int $stable = 8;
    private boolean focused;

    @k
    private a<g2> onHandwritingSlopExceeded;

    @k
    private final SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @d(c = "androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1", f = "StylusHandwriting.kt", i = {0, 1, 1, 1, 2, 2}, l = {105, 133, 171}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "firstDown", "pass", "$this$awaitEachGesture", "firstDown"}, s = {"L$0", "L$0", "L$1", "L$2", "L$0", "L$1"})
        @u0({"SMAP\nStylusHandwriting.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StylusHandwriting.kt\nandroidx/compose/foundation/text/handwriting/StylusHandwritingNode$suspendingPointerInputModifierNode$1$1\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,215:1\n65#2:216\n65#2:219\n69#2:224\n69#2:227\n60#3:217\n60#3:220\n85#3:223\n70#3:225\n70#3:228\n90#3:231\n22#4:218\n22#4:221\n22#4:226\n22#4:229\n54#5:222\n59#5:230\n117#6,2:232\n34#6,6:234\n119#6:240\n117#6,2:241\n34#6,6:243\n119#6:249\n*S KotlinDebug\n*F\n+ 1 StylusHandwriting.kt\nandroidx/compose/foundation/text/handwriting/StylusHandwritingNode$suspendingPointerInputModifierNode$1$1\n*L\n114#1:216\n115#1:219\n116#1:224\n117#1:227\n114#1:217\n115#1:220\n115#1:223\n116#1:225\n117#1:228\n117#1:231\n114#1:218\n115#1:221\n116#1:226\n117#1:229\n115#1:222\n117#1:230\n136#1:232,2\n136#1:234,6\n136#1:240\n173#1:241,2\n173#1:243,6\n173#1:249\n*E\n"})
        /* renamed from: androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, c<? super g2>, Object> {
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            int label;
            final /* synthetic */ StylusHandwritingNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(StylusHandwritingNode stylusHandwritingNode, c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.this$0 = stylusHandwritingNode;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final c<g2> create(Object obj, c<?> cVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, cVar);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // x00.p
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, c<? super g2> cVar) {
                return ((AnonymousClass1) create(awaitPointerEventScope, cVar)).invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:23:0x01a6, code lost:
            
                if (r5 != r1) goto L75;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x01a8, code lost:
            
                return r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:60:0x00f4, code lost:
            
                if (r9 != r1) goto L42;
             */
            /* JADX WARN: Code restructure failed: missing block: B:92:0x0059, code lost:
            
                if (r8 == r1) goto L74;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x01a6 -> B:7:0x01a9). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00f4 -> B:29:0x00f8). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r18) {
                /*
                    Method dump skipped, instructions count: 495
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(PointerInputScope pointerInputScope, c<? super g2> cVar) {
            Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new AnonymousClass1(StylusHandwritingNode.this, null), cVar);
            return awaitEachGesture == b.l() ? awaitEachGesture : g2.f100423a;
        }
    }));

    public StylusHandwritingNode(@k a<g2> aVar) {
        this.onHandwritingSlopExceeded = aVar;
    }

    @k
    public final a<g2> getOnHandwritingSlopExceeded() {
        return this.onHandwritingSlopExceeded;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: getTouchBoundsExpansion-RZrCHBk */
    public long mo1175getTouchBoundsExpansionRZrCHBk() {
        return StylusHandwritingKt.getHandwritingBoundsExpansion().m4015roundToTouchBoundsExpansionTW6G1oQ(DelegatableNodeKt.requireDensity(this));
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.suspendingPointerInputModifierNode.onCancelPointerInput();
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(@k FocusState focusState) {
        this.focused = focusState.isFocused();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo205onPointerEventH0pRuoY(@k PointerEvent pointerEvent, @k PointerEventPass pointerEventPass, long j11) {
        this.suspendingPointerInputModifierNode.mo205onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j11);
    }

    public final void resetPointerInputHandler() {
        this.suspendingPointerInputModifierNode.resetPointerInputHandler();
    }

    public final void setOnHandwritingSlopExceeded(@k a<g2> aVar) {
        this.onHandwritingSlopExceeded = aVar;
    }
}
