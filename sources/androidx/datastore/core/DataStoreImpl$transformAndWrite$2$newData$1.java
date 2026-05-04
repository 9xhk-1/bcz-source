package androidx.datastore.core;

import c40.r0;
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
@d(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1", f = "DataStoreImpl.kt", i = {}, l = {331}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class DataStoreImpl$transformAndWrite$2$newData$1<T> extends SuspendLambda implements p<r0, c<? super T>, Object> {
    final /* synthetic */ Data<T> $curData;
    final /* synthetic */ p<T, c<? super T>, Object> $transform;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DataStoreImpl$transformAndWrite$2$newData$1(p<? super T, ? super c<? super T>, ? extends Object> pVar, Data<T> data, c<? super DataStoreImpl$transformAndWrite$2$newData$1> cVar) {
        super(2, cVar);
        this.$transform = pVar;
        this.$curData = data;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final c<g2> create(@l Object obj, @k c<?> cVar) {
        return new DataStoreImpl$transformAndWrite$2$newData$1(this.$transform, this.$curData, cVar);
    }

    @Override // x00.p
    @l
    public final Object invoke(@k r0 r0Var, @l c<? super T> cVar) {
        return ((DataStoreImpl$transformAndWrite$2$newData$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
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
        p<T, c<? super T>, Object> pVar = this.$transform;
        T value = this.$curData.getValue();
        this.label = 1;
        Object invoke = pVar.invoke(value, this);
        return invoke == l11 ? l11 : invoke;
    }
}
