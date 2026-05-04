package androidx.datastore.core;

import j00.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import l00.d;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", i = {0, 0, 0, 1, 2}, l = {287, 296, 304}, m = "readDataAndUpdateCache", n = {"this", "currentState", "requireLock", "this", "this"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$0"})
/* loaded from: classes2.dex */
public final class DataStoreImpl$readDataAndUpdateCache$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$readDataAndUpdateCache$1(DataStoreImpl<T> dataStoreImpl, c<? super DataStoreImpl$readDataAndUpdateCache$1> cVar) {
        super(cVar);
        this.this$0 = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object readDataAndUpdateCache;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        readDataAndUpdateCache = this.this$0.readDataAndUpdateCache(false, this);
        return readDataAndUpdateCache;
    }
}
