package androidx.compose.ui.platform;

import androidx.compose.runtime.MonotonicFrameClockKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class InfiniteAnimationPolicyKt {
    @m80.l
    public static final <R> Object withInfiniteAnimationFrameNanos(@m80.k x00.l<? super Long, ? extends R> lVar, @m80.k j00.c<? super R> cVar) {
        InfiniteAnimationPolicy infiniteAnimationPolicy = (InfiniteAnimationPolicy) cVar.getContext().get(InfiniteAnimationPolicy.Key);
        return infiniteAnimationPolicy == null ? MonotonicFrameClockKt.withFrameNanos(lVar, cVar) : infiniteAnimationPolicy.onInfiniteOperation(new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(lVar, null), cVar);
    }
}
