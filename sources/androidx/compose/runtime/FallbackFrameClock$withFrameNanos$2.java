package androidx.compose.runtime;

import c40.a1;
import c40.r0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.l;
import x00.p;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.runtime.FallbackFrameClock$withFrameNanos$2", f = "MonotonicFrameClock.android.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class FallbackFrameClock$withFrameNanos$2<R> extends SuspendLambda implements p<r0, c<? super R>, Object> {
    final /* synthetic */ l<Long, R> $onFrame;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FallbackFrameClock$withFrameNanos$2(l<? super Long, ? extends R> lVar, c<? super FallbackFrameClock$withFrameNanos$2> cVar) {
        super(2, cVar);
        this.$onFrame = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new FallbackFrameClock$withFrameNanos$2(this.$onFrame, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super R> cVar) {
        return ((FallbackFrameClock$withFrameNanos$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            this.label = 1;
            if (a1.b(16L, this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
        }
        return this.$onFrame.invoke(l00.a.g(System.nanoTime()));
    }
}
