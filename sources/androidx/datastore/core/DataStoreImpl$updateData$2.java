package androidx.datastore.core;

import androidx.datastore.core.Message;
import c40.r0;
import c40.x;
import c40.z;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.datastore.core.DataStoreImpl$updateData$2", f = "DataStoreImpl.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class DataStoreImpl$updateData$2<T> extends SuspendLambda implements p<r0, c<? super T>, Object> {
    final /* synthetic */ p<T, c<? super T>, Object> $transform;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DataStoreImpl$updateData$2(DataStoreImpl<T> dataStoreImpl, p<? super T, ? super c<? super T>, ? extends Object> pVar, c<? super DataStoreImpl$updateData$2> cVar) {
        super(2, cVar);
        this.this$0 = dataStoreImpl;
        this.$transform = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final c<g2> create(@l Object obj, @k c<?> cVar) {
        DataStoreImpl$updateData$2 dataStoreImpl$updateData$2 = new DataStoreImpl$updateData$2(this.this$0, this.$transform, cVar);
        dataStoreImpl$updateData$2.L$0 = obj;
        return dataStoreImpl$updateData$2;
    }

    @Override // x00.p
    @l
    public final Object invoke(@k r0 r0Var, @l c<? super T> cVar) {
        return ((DataStoreImpl$updateData$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        SimpleActor simpleActor;
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
            return obj;
        }
        e.n(obj);
        r0 r0Var = (r0) this.L$0;
        x c11 = z.c(null, 1, null);
        Message.Update update = new Message.Update(this.$transform, c11, ((DataStoreImpl) this.this$0).inMemoryCache.getCurrentState(), r0Var.getCoroutineContext());
        simpleActor = ((DataStoreImpl) this.this$0).writeActor;
        simpleActor.offer(update);
        this.label = 1;
        Object i12 = c11.i(this);
        return i12 == l11 ? l11 : i12;
    }
}
