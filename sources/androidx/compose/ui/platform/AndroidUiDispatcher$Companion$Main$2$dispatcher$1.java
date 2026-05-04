package androidx.compose.ui.platform;

import android.view.Choreographer;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1", f = "AndroidUiDispatcher.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class AndroidUiDispatcher$Companion$Main$2$dispatcher$1 extends SuspendLambda implements x00.p<c40.r0, j00.c<? super Choreographer>, Object> {
    int label;

    public AndroidUiDispatcher$Companion$Main$2$dispatcher$1(j00.c<? super AndroidUiDispatcher$Companion$Main$2$dispatcher$1> cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new AndroidUiDispatcher$Companion$Main$2$dispatcher$1(cVar);
    }

    @Override // x00.p
    public final Object invoke(c40.r0 r0Var, j00.c<? super Choreographer> cVar) {
        return ((AndroidUiDispatcher$Companion$Main$2$dispatcher$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.e.n(obj);
        return Choreographer.getInstance();
    }
}
