package androidx.compose.runtime;

import android.view.Choreographer;
import c40.r0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.runtime.DefaultChoreographerFrameClock$choreographer$1", f = "MonotonicFrameClock.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class DefaultChoreographerFrameClock$choreographer$1 extends SuspendLambda implements p<r0, c<? super Choreographer>, Object> {
    int label;

    public DefaultChoreographerFrameClock$choreographer$1(c<? super DefaultChoreographerFrameClock$choreographer$1> cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new DefaultChoreographerFrameClock$choreographer$1(cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super Choreographer> cVar) {
        return ((DefaultChoreographerFrameClock$choreographer$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.n(obj);
        return Choreographer.getInstance();
    }
}
