package androidx.activity.compose;

import c40.r0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$2$1", f = "PredictiveBackHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class PredictiveBackHandlerKt$PredictiveBackHandler$2$1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ PredictiveBackHandlerCallback $backCallBack;
    final /* synthetic */ boolean $enabled;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PredictiveBackHandlerKt$PredictiveBackHandler$2$1(PredictiveBackHandlerCallback predictiveBackHandlerCallback, boolean z11, c<? super PredictiveBackHandlerKt$PredictiveBackHandler$2$1> cVar) {
        super(2, cVar);
        this.$backCallBack = predictiveBackHandlerCallback;
        this.$enabled = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new PredictiveBackHandlerKt$PredictiveBackHandler$2$1(this.$backCallBack, this.$enabled, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((PredictiveBackHandlerKt$PredictiveBackHandler$2$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.n(obj);
        this.$backCallBack.setIsEnabled(this.$enabled);
        return g2.f100423a;
    }
}
