package androidx.room.coroutines;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", i = {0, 0, 0}, l = {543}, m = "endTransaction", n = {"this", "$this$withLock_u24default$iv", "success"}, s = {"L$0", "L$1", "Z$0"})
/* loaded from: classes3.dex */
public final class PooledConnectionImpl$endTransaction$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PooledConnectionImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PooledConnectionImpl$endTransaction$1(PooledConnectionImpl pooledConnectionImpl, j00.c<? super PooledConnectionImpl$endTransaction$1> cVar) {
        super(cVar);
        this.this$0 = pooledConnectionImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object endTransaction;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        endTransaction = this.this$0.endTransaction(false, this);
        return endTransaction;
    }
}
