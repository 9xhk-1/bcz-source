package androidx.room.coroutines;

import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.Ref;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.room.coroutines.ConnectionPoolImpl$acquireWithTimeout$2", f = "ConnectionPoolImpl.kt", i = {}, l = {171}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class ConnectionPoolImpl$acquireWithTimeout$2 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ Ref.ObjectRef<ConnectionWithLock> $connection;
    final /* synthetic */ Pool $this_acquireWithTimeout;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionPoolImpl$acquireWithTimeout$2(Ref.ObjectRef<ConnectionWithLock> objectRef, Pool pool, j00.c<? super ConnectionPoolImpl$acquireWithTimeout$2> cVar) {
        super(2, cVar);
        this.$connection = objectRef;
        this.$this_acquireWithTimeout = pool;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new ConnectionPoolImpl$acquireWithTimeout$2(this.$connection, this.$this_acquireWithTimeout, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((ConnectionPoolImpl$acquireWithTimeout$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef<ConnectionWithLock> objectRef;
        T t11;
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            Ref.ObjectRef<ConnectionWithLock> objectRef2 = this.$connection;
            Pool pool = this.$this_acquireWithTimeout;
            this.L$0 = objectRef2;
            this.label = 1;
            Object acquire = pool.acquire(this);
            if (acquire == l11) {
                return l11;
            }
            objectRef = objectRef2;
            t11 = acquire;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) this.L$0;
            e.n(obj);
            t11 = obj;
        }
        objectRef.element = t11;
        return g2.f100423a;
    }
}
