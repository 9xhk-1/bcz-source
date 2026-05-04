package androidx.compose.animation.core;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.animation.core.Animatable$stop$2", f = "Animatable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class Animatable$stop$2 extends SuspendLambda implements l<j00.c<? super g2>, Object> {
    int label;
    final /* synthetic */ Animatable<T, V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Animatable$stop$2(Animatable<T, V> animatable, j00.c<? super Animatable$stop$2> cVar) {
        super(1, cVar);
        this.this$0 = animatable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(j00.c<?> cVar) {
        return new Animatable$stop$2(this.this$0, cVar);
    }

    @Override // x00.l
    public final Object invoke(j00.c<? super g2> cVar) {
        return ((Animatable$stop$2) create(cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.e.n(obj);
        this.this$0.endAnimation();
        return g2.f100423a;
    }
}
