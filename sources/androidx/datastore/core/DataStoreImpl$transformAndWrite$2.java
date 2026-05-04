package androidx.datastore.core;

import j00.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import l00.d;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2", f = "DataStoreImpl.kt", i = {1, 2}, l = {330, 331, 337}, m = "invokeSuspend", n = {"curData", "newData"}, s = {"L$0", "L$0"})
/* loaded from: classes2.dex */
public final class DataStoreImpl$transformAndWrite$2<T> extends SuspendLambda implements l<c<? super T>, Object> {
    final /* synthetic */ kotlin.coroutines.d $callerContext;
    final /* synthetic */ p<T, c<? super T>, Object> $transform;
    Object L$0;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DataStoreImpl$transformAndWrite$2(DataStoreImpl<T> dataStoreImpl, kotlin.coroutines.d dVar, p<? super T, ? super c<? super T>, ? extends Object> pVar, c<? super DataStoreImpl$transformAndWrite$2> cVar) {
        super(1, cVar);
        this.this$0 = dataStoreImpl;
        this.$callerContext = dVar;
        this.$transform = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final c<g2> create(@k c<?> cVar) {
        return new DataStoreImpl$transformAndWrite$2(this.this$0, this.$callerContext, this.$transform, cVar);
    }

    @Override // x00.l
    @m80.l
    public final Object invoke(@m80.l c<? super T> cVar) {
        return ((DataStoreImpl$transformAndWrite$2) create(cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (r9 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0036, code lost:
    
        if (r9 == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@m80.k java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r8.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2b
            if (r1 == r4) goto L27
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            java.lang.Object r0 = r8.L$0
            kotlin.e.n(r9)
            return r0
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            java.lang.Object r1 = r8.L$0
            androidx.datastore.core.Data r1 = (androidx.datastore.core.Data) r1
            kotlin.e.n(r9)
            goto L51
        L27:
            kotlin.e.n(r9)
            goto L39
        L2b:
            kotlin.e.n(r9)
            androidx.datastore.core.DataStoreImpl<T> r9 = r8.this$0
            r8.label = r4
            java.lang.Object r9 = androidx.datastore.core.DataStoreImpl.access$readDataOrHandleCorruption(r9, r4, r8)
            if (r9 != r0) goto L39
            goto L6a
        L39:
            r1 = r9
            androidx.datastore.core.Data r1 = (androidx.datastore.core.Data) r1
            kotlin.coroutines.d r9 = r8.$callerContext
            androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1 r5 = new androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1
            x00.p<T, j00.c<? super T>, java.lang.Object> r6 = r8.$transform
            r7 = 0
            r5.<init>(r6, r1, r7)
            r8.L$0 = r1
            r8.label = r3
            java.lang.Object r9 = c40.i.h(r9, r5, r8)
            if (r9 != r0) goto L51
            goto L6a
        L51:
            r1.checkHashCode()
            java.lang.Object r1 = r1.getValue()
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r9)
            if (r1 != 0) goto L6b
            androidx.datastore.core.DataStoreImpl<T> r1 = r8.this$0
            r8.L$0 = r9
            r8.label = r2
            java.lang.Object r1 = r1.writeData$datastore_core_release(r9, r4, r8)
            if (r1 != r0) goto L6b
        L6a:
            return r0
        L6b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$transformAndWrite$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
