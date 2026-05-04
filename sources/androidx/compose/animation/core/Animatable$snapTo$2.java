package androidx.compose.animation.core;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.animation.core.Animatable$snapTo$2", f = "Animatable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class Animatable$snapTo$2 extends SuspendLambda implements l<j00.c<? super g2>, Object> {
    final /* synthetic */ T $targetValue;
    int label;
    final /* synthetic */ Animatable<T, V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Animatable$snapTo$2(Animatable<T, V> animatable, T t11, j00.c<? super Animatable$snapTo$2> cVar) {
        super(1, cVar);
        this.this$0 = animatable;
        this.$targetValue = t11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(j00.c<?> cVar) {
        return new Animatable$snapTo$2(this.this$0, this.$targetValue, cVar);
    }

    @Override // x00.l
    public final Object invoke(j00.c<? super g2> cVar) {
        return ((Animatable$snapTo$2) create(cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object clampToBounds;
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.e.n(obj);
        this.this$0.endAnimation();
        clampToBounds = this.this$0.clampToBounds(this.$targetValue);
        this.this$0.getInternalState$animation_core_release().setValue$animation_core_release(clampToBounds);
        this.this$0.setTargetValue(clampToBounds);
        return g2.f100423a;
    }
}
