package androidx.datastore.core;

import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import m80.k;
import x00.l;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3", f = "DataStoreImpl.kt", i = {}, l = {416}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class DataStoreImpl$doWithWriteFileLock$3<R> extends SuspendLambda implements l<c<? super R>, Object> {
    final /* synthetic */ l<c<? super R>, Object> $block;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DataStoreImpl$doWithWriteFileLock$3(l<? super c<? super R>, ? extends Object> lVar, c<? super DataStoreImpl$doWithWriteFileLock$3> cVar) {
        super(1, cVar);
        this.$block = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final c<g2> create(@k c<?> cVar) {
        return new DataStoreImpl$doWithWriteFileLock$3(this.$block, cVar);
    }

    @Override // x00.l
    @m80.l
    public final Object invoke(@m80.l c<? super R> cVar) {
        return ((DataStoreImpl$doWithWriteFileLock$3) create(cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @m80.l
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
        l<c<? super R>, Object> lVar = this.$block;
        this.label = 1;
        Object invoke = lVar.invoke(this);
        return invoke == l11 ? l11 : invoke;
    }
}
