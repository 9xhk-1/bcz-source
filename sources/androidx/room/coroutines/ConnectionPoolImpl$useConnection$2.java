package androidx.room.coroutines;

import androidx.room.Transactor;
import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import x00.p;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.room.coroutines.ConnectionPoolImpl$useConnection$2", f = "ConnectionPoolImpl.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class ConnectionPoolImpl$useConnection$2<R> extends SuspendLambda implements p<r0, j00.c<? super R>, Object> {
    final /* synthetic */ p<Transactor, j00.c<? super R>, Object> $block;
    final /* synthetic */ PooledConnectionImpl $confinedConnection;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConnectionPoolImpl$useConnection$2(p<? super Transactor, ? super j00.c<? super R>, ? extends Object> pVar, PooledConnectionImpl pooledConnectionImpl, j00.c<? super ConnectionPoolImpl$useConnection$2> cVar) {
        super(2, cVar);
        this.$block = pVar;
        this.$confinedConnection = pooledConnectionImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new ConnectionPoolImpl$useConnection$2(this.$block, this.$confinedConnection, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super R> cVar) {
        return ((ConnectionPoolImpl$useConnection$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
            return obj;
        }
        e.n(obj);
        p<Transactor, j00.c<? super R>, Object> pVar = this.$block;
        PooledConnectionImpl pooledConnectionImpl = this.$confinedConnection;
        this.label = 1;
        Object invoke = pVar.invoke(pooledConnectionImpl, this);
        return invoke == l11 ? l11 : invoke;
    }
}
