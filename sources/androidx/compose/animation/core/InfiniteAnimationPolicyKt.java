package androidx.compose.animation.core;

import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.ui.platform.InfiniteAnimationPolicy;
import kotlin.jvm.internal.d0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class InfiniteAnimationPolicyKt {
    @l
    public static final <R> Object withInfiniteAnimationFrameMillis(@k x00.l<? super Long, ? extends R> lVar, @k j00.c<? super R> cVar) {
        return withInfiniteAnimationFrameNanos(new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2(lVar), cVar);
    }

    private static final <R> Object withInfiniteAnimationFrameMillis$$forInline(x00.l<? super Long, ? extends R> lVar, j00.c<? super R> cVar) {
        InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2 infiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2 = new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2(lVar);
        d0.e(0);
        Object withInfiniteAnimationFrameNanos = withInfiniteAnimationFrameNanos(infiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2, cVar);
        d0.e(1);
        return withInfiniteAnimationFrameNanos;
    }

    @l
    public static final <R> Object withInfiniteAnimationFrameNanos(@k x00.l<? super Long, ? extends R> lVar, @k j00.c<? super R> cVar) {
        InfiniteAnimationPolicy infiniteAnimationPolicy = (InfiniteAnimationPolicy) cVar.getContext().get(InfiniteAnimationPolicy.Key);
        return infiniteAnimationPolicy == null ? MonotonicFrameClockKt.withFrameNanos(lVar, cVar) : infiniteAnimationPolicy.onInfiniteOperation(new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(lVar, null), cVar);
    }
}
