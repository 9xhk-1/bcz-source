package androidx.compose.animation.core;

import kotlin.jvm.internal.Lambda;
import x00.l;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2<R> extends Lambda implements l<Long, R> {
    final /* synthetic */ l<Long, R> $onFrame;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2(l<? super Long, ? extends R> lVar) {
        super(1);
        this.$onFrame = lVar;
    }

    public final R invoke(long j11) {
        return this.$onFrame.invoke(Long.valueOf(j11 / 1000000));
    }

    @Override // x00.l
    public /* bridge */ /* synthetic */ Object invoke(Long l11) {
        return invoke(l11.longValue());
    }
}
