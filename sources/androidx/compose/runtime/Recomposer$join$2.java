package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class Recomposer$join$2 extends SuspendLambda implements p<Recomposer.State, c<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public Recomposer$join$2(c<? super Recomposer$join$2> cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        Recomposer$join$2 recomposer$join$2 = new Recomposer$join$2(cVar);
        recomposer$join$2.L$0 = obj;
        return recomposer$join$2;
    }

    @Override // x00.p
    public final Object invoke(Recomposer.State state, c<? super Boolean> cVar) {
        return ((Recomposer$join$2) create(state, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.n(obj);
        return l00.a.a(((Recomposer.State) this.L$0) == Recomposer.State.ShutDown);
    }
}
