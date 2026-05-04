package androidx.compose.ui.viewinterop;

import c40.r0;
import j00.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", i = {}, l = {639, 641}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class AndroidViewHolder$onNestedFling$1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ boolean $consumed;
    final /* synthetic */ long $viewVelocity;
    int label;
    final /* synthetic */ AndroidViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$onNestedFling$1(boolean z11, AndroidViewHolder androidViewHolder, long j11, c<? super AndroidViewHolder$onNestedFling$1> cVar) {
        super(2, cVar);
        this.$consumed = z11;
        this.this$0 = androidViewHolder;
        this.$viewVelocity = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new AndroidViewHolder$onNestedFling$1(this.$consumed, this.this$0, this.$viewVelocity, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((AndroidViewHolder$onNestedFling$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (r4.m3606dispatchPostFlingRZ2iAVY(r5, r7, r10) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        if (r1.m3606dispatchPostFlingRZ2iAVY(r2, r4, r10) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r10.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.e.n(r11)
            goto L58
        L12:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1a:
            kotlin.e.n(r11)
            r6 = r10
            goto L58
        L1f:
            kotlin.e.n(r11)
            boolean r11 = r10.$consumed
            if (r11 != 0) goto L3f
            androidx.compose.ui.viewinterop.AndroidViewHolder r11 = r10.this$0
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r4 = androidx.compose.ui.viewinterop.AndroidViewHolder.access$getDispatcher$p(r11)
            androidx.compose.ui.unit.Velocity$Companion r11 = androidx.compose.ui.unit.Velocity.Companion
            long r5 = r11.m5364getZero9UxMQ8M()
            long r7 = r10.$viewVelocity
            r10.label = r3
            r9 = r10
            java.lang.Object r11 = r4.m3606dispatchPostFlingRZ2iAVY(r5, r7, r9)
            r6 = r9
            if (r11 != r0) goto L58
            goto L57
        L3f:
            r6 = r10
            androidx.compose.ui.viewinterop.AndroidViewHolder r11 = r6.this$0
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r1 = androidx.compose.ui.viewinterop.AndroidViewHolder.access$getDispatcher$p(r11)
            r11 = r2
            long r2 = r6.$viewVelocity
            androidx.compose.ui.unit.Velocity$Companion r4 = androidx.compose.ui.unit.Velocity.Companion
            long r4 = r4.m5364getZero9UxMQ8M()
            r6.label = r11
            java.lang.Object r11 = r1.m3606dispatchPostFlingRZ2iAVY(r2, r4, r6)
            if (r11 != r0) goto L58
        L57:
            return r0
        L58:
            yz.g2 r11 = yz.g2.f100423a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
