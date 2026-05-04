package androidx.datastore.core;

import androidx.datastore.core.Message;
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
@d(c = "androidx.datastore.core.DataStoreImpl$writeActor$3", f = "DataStoreImpl.kt", i = {}, l = {207}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class DataStoreImpl$writeActor$3<T> extends SuspendLambda implements p<Message.Update<T>, c<? super g2>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$writeActor$3(DataStoreImpl<T> dataStoreImpl, c<? super DataStoreImpl$writeActor$3> cVar) {
        super(2, cVar);
        this.this$0 = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final c<g2> create(@l Object obj, @k c<?> cVar) {
        DataStoreImpl$writeActor$3 dataStoreImpl$writeActor$3 = new DataStoreImpl$writeActor$3(this.this$0, cVar);
        dataStoreImpl$writeActor$3.L$0 = obj;
        return dataStoreImpl$writeActor$3;
    }

    @Override // x00.p
    @l
    public final Object invoke(@k Message.Update<T> update, @l c<? super g2> cVar) {
        return ((DataStoreImpl$writeActor$3) create(update, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object handleUpdate;
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            Message.Update update = (Message.Update) this.L$0;
            DataStoreImpl<T> dataStoreImpl = this.this$0;
            this.label = 1;
            handleUpdate = dataStoreImpl.handleUpdate(update, this);
            if (handleUpdate == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
        }
        return g2.f100423a;
    }
}
