package androidx.room;

import c40.r0;
import java.util.concurrent.Callable;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.room.CoroutinesRoom$Companion$execute$2", f = "CoroutinesRoom.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class CoroutinesRoom$Companion$execute$2<R> extends SuspendLambda implements x00.p<r0, j00.c<? super R>, Object> {
    final /* synthetic */ Callable<R> $callable;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$execute$2(Callable<R> callable, j00.c<? super CoroutinesRoom$Companion$execute$2> cVar) {
        super(2, cVar);
        this.$callable = callable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new CoroutinesRoom$Companion$execute$2(this.$callable, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super R> cVar) {
        return ((CoroutinesRoom$Companion$execute$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.e.n(obj);
        return this.$callable.call();
    }
}
