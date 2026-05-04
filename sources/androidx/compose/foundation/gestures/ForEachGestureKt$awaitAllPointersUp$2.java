package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2", f = "ForEachGesture.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class ForEachGestureKt$awaitAllPointersUp$2 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, c<? super g2>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    public ForEachGestureKt$awaitAllPointersUp$2(c<? super ForEachGestureKt$awaitAllPointersUp$2> cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        ForEachGestureKt$awaitAllPointersUp$2 forEachGestureKt$awaitAllPointersUp$2 = new ForEachGestureKt$awaitAllPointersUp$2(cVar);
        forEachGestureKt$awaitAllPointersUp$2.L$0 = obj;
        return forEachGestureKt$awaitAllPointersUp$2;
    }

    @Override // x00.p
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, c<? super g2> cVar) {
        return ((ForEachGestureKt$awaitAllPointersUp$2) create(awaitPointerEventScope, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            this.label = 1;
            if (ForEachGestureKt.awaitAllPointersUp$default(awaitPointerEventScope, null, this, 1, null) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
        }
        return g2.f100423a;
    }
}
