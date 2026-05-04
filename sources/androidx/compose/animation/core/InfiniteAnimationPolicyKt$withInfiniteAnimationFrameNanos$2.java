package androidx.compose.animation.core;

import androidx.compose.runtime.MonotonicFrameClockKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import x00.l;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", f = "InfiniteAnimationPolicy.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2<R> extends SuspendLambda implements l<j00.c<? super R>, Object> {
    final /* synthetic */ l<Long, R> $onFrame;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(l<? super Long, ? extends R> lVar, j00.c<? super InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2> cVar) {
        super(1, cVar);
        this.$onFrame = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(j00.c<?> cVar) {
        return new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(this.$onFrame, cVar);
    }

    @Override // x00.l
    public final Object invoke(j00.c<? super R> cVar) {
        return ((InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2) create(cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return obj;
        }
        kotlin.e.n(obj);
        l<Long, R> lVar = this.$onFrame;
        this.label = 1;
        Object withFrameNanos = MonotonicFrameClockKt.withFrameNanos(lVar, this);
        return withFrameNanos == l11 ? l11 : withFrameNanos;
    }
}
