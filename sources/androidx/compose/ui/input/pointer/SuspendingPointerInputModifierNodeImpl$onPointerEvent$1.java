package androidx.compose.ui.input.pointer;

import androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection;
import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$onPointerEvent$1", f = "SuspendingPointerInputFilter.kt", i = {}, l = {717, AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD}, m = "invokeSuspend", n = {}, s = {})
@u0({"SMAP\nSuspendingPointerInputFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl$onPointerEvent$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,918:1\n1#2:919\n*E\n"})
/* loaded from: classes.dex */
public final class SuspendingPointerInputModifierNodeImpl$onPointerEvent$1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    int label;
    final /* synthetic */ SuspendingPointerInputModifierNodeImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl, j00.c<? super SuspendingPointerInputModifierNodeImpl$onPointerEvent$1> cVar) {
        super(2, cVar);
        this.this$0 = suspendingPointerInputModifierNodeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(this.this$0, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((SuspendingPointerInputModifierNodeImpl$onPointerEvent$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (r5.invoke(r1, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if (r5.invoke(r1, r4) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L17:
            kotlin.e.n(r5)
            goto L4b
        L1b:
            kotlin.e.n(r5)
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl r5 = r4.this$0
            x00.p r5 = androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.access$get_deprecatedPointerInputHandler$p(r5)
            if (r5 == 0) goto L3a
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl r5 = r4.this$0
            x00.p r5 = androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.access$get_deprecatedPointerInputHandler$p(r5)
            kotlin.jvm.internal.g0.m(r5)
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl r1 = r4.this$0
            r4.label = r3
            java.lang.Object r5 = r5.invoke(r1, r4)
            if (r5 != r0) goto L4b
            goto L4a
        L3a:
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl r5 = r4.this$0
            androidx.compose.ui.input.pointer.PointerInputEventHandler r5 = r5.getPointerInputEventHandler()
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl r1 = r4.this$0
            r4.label = r2
            java.lang.Object r5 = r5.invoke(r1, r4)
            if (r5 != r0) goto L4b
        L4a:
            return r0
        L4b:
            yz.g2 r5 = yz.g2.f100423a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$onPointerEvent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
