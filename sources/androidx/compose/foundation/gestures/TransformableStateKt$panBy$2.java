package androidx.compose.foundation.gestures;

import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.TransformableStateKt$panBy$2", f = "TransformableState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class TransformableStateKt$panBy$2 extends SuspendLambda implements p<TransformScope, c<? super g2>, Object> {
    final /* synthetic */ long $offset;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$panBy$2(long j11, c<? super TransformableStateKt$panBy$2> cVar) {
        super(2, cVar);
        this.$offset = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        TransformableStateKt$panBy$2 transformableStateKt$panBy$2 = new TransformableStateKt$panBy$2(this.$offset, cVar);
        transformableStateKt$panBy$2.L$0 = obj;
        return transformableStateKt$panBy$2;
    }

    @Override // x00.p
    public final Object invoke(TransformScope transformScope, c<? super g2> cVar) {
        return ((TransformableStateKt$panBy$2) create(transformScope, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.n(obj);
        ((TransformScope) this.L$0).mo413transformByd4ec7I(1.0f, this.$offset, 0.0f);
        return g2.f100423a;
    }
}
