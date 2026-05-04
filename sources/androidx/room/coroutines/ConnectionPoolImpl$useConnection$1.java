package androidx.room.coroutines;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.room.coroutines.ConnectionPoolImpl", f = "ConnectionPoolImpl.kt", i = {2, 2, 2, 2, 2, 2, 2, 3, 3}, l = {114, 118, 541, 147}, m = "useConnection", n = {"this", "block", "pool", c60.c.f8163j, "currentContext", "connection$iv", "isReadOnly", "pool", c60.c.f8163j}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0", "L$0", "L$1"})
/* loaded from: classes3.dex */
public final class ConnectionPoolImpl$useConnection$1<R> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConnectionPoolImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionPoolImpl$useConnection$1(ConnectionPoolImpl connectionPoolImpl, j00.c<? super ConnectionPoolImpl$useConnection$1> cVar) {
        super(cVar);
        this.this$0 = connectionPoolImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.useConnection(false, null, this);
    }
}
