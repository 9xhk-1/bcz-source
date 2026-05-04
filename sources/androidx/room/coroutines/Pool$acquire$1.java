package androidx.room.coroutines;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.room.coroutines.Pool", f = "ConnectionPoolImpl.kt", i = {0}, l = {212}, m = "acquire", n = {"this"}, s = {"L$0"})
/* loaded from: classes3.dex */
public final class Pool$acquire$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Pool this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pool$acquire$1(Pool pool, j00.c<? super Pool$acquire$1> cVar) {
        super(cVar);
        this.this$0 = pool;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.acquire(this);
    }
}
