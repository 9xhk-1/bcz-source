package androidx.datastore.core;

import c40.r0;
import j00.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import l00.d;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.datastore.core.DataStoreImpl$readState$2", f = "DataStoreImpl.kt", i = {}, l = {218, 226}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class DataStoreImpl$readState$2<T> extends SuspendLambda implements p<r0, c<? super State<T>>, Object> {
    final /* synthetic */ boolean $requireLock;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$readState$2(DataStoreImpl<T> dataStoreImpl, boolean z11, c<? super DataStoreImpl$readState$2> cVar) {
        super(2, cVar);
        this.this$0 = dataStoreImpl;
        this.$requireLock = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final c<g2> create(@l Object obj, @k c<?> cVar) {
        return new DataStoreImpl$readState$2(this.this$0, this.$requireLock, cVar);
    }

    @Override // x00.p
    @l
    public final Object invoke(@k r0 r0Var, @l c<? super State<T>> cVar) {
        return ((DataStoreImpl$readState$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if (r5 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        if (r5 == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@m80.k java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.e.n(r5)
            goto L54
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1a:
            kotlin.e.n(r5)     // Catch: java.lang.Throwable -> L1e
            goto L47
        L1e:
            r5 = move-exception
            goto L57
        L20:
            kotlin.e.n(r5)
            androidx.datastore.core.DataStoreImpl<T> r5 = r4.this$0
            androidx.datastore.core.DataStoreInMemoryCache r5 = androidx.datastore.core.DataStoreImpl.access$getInMemoryCache$p(r5)
            androidx.datastore.core.State r5 = r5.getCurrentState()
            boolean r5 = r5 instanceof androidx.datastore.core.Final
            if (r5 == 0) goto L3c
            androidx.datastore.core.DataStoreImpl<T> r5 = r4.this$0
            androidx.datastore.core.DataStoreInMemoryCache r5 = androidx.datastore.core.DataStoreImpl.access$getInMemoryCache$p(r5)
            androidx.datastore.core.State r5 = r5.getCurrentState()
            return r5
        L3c:
            androidx.datastore.core.DataStoreImpl<T> r5 = r4.this$0     // Catch: java.lang.Throwable -> L1e
            r4.label = r3     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r5 = androidx.datastore.core.DataStoreImpl.access$readAndInitOrPropagateAndThrowFailure(r5, r4)     // Catch: java.lang.Throwable -> L1e
            if (r5 != r0) goto L47
            goto L53
        L47:
            androidx.datastore.core.DataStoreImpl<T> r5 = r4.this$0
            boolean r1 = r4.$requireLock
            r4.label = r2
            java.lang.Object r5 = androidx.datastore.core.DataStoreImpl.access$readDataAndUpdateCache(r5, r1, r4)
            if (r5 != r0) goto L54
        L53:
            return r0
        L54:
            androidx.datastore.core.State r5 = (androidx.datastore.core.State) r5
            return r5
        L57:
            androidx.datastore.core.ReadException r0 = new androidx.datastore.core.ReadException
            r1 = -1
            r0.<init>(r5, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$readState$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
