package androidx.room;

import c40.r0;
import java.util.concurrent.Callable;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", f = "CoroutinesRoom.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class CoroutinesRoom$Companion$execute$4$job$1 extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ Callable<R> $callable;
    final /* synthetic */ c40.n<R> $continuation;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CoroutinesRoom$Companion$execute$4$job$1(Callable<R> callable, c40.n<? super R> nVar, j00.c<? super CoroutinesRoom$Companion$execute$4$job$1> cVar) {
        super(2, cVar);
        this.$callable = callable;
        this.$continuation = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new CoroutinesRoom$Companion$execute$4$job$1(this.$callable, this.$continuation, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((CoroutinesRoom$Companion$execute$4$job$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.e.n(obj);
        try {
            Object call = this.$callable.call();
            j00.c cVar = this.$continuation;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(call));
        } catch (Throwable th2) {
            j00.c cVar2 = this.$continuation;
            Result.a aVar2 = Result.Companion;
            cVar2.resumeWith(Result.m6308constructorimpl(kotlin.e.a(th2)));
        }
        return g2.f100423a;
    }
}
