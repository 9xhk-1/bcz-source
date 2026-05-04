package androidx.room.coroutines;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", i = {0, 0, 0}, l = {543}, m = "beginTransaction", n = {"this", "type", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes3.dex */
public final class PooledConnectionImpl$beginTransaction$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PooledConnectionImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PooledConnectionImpl$beginTransaction$1(PooledConnectionImpl pooledConnectionImpl, j00.c<? super PooledConnectionImpl$beginTransaction$1> cVar) {
        super(cVar);
        this.this$0 = pooledConnectionImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object beginTransaction;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        beginTransaction = this.this$0.beginTransaction(null, this);
        return beginTransaction;
    }
}
