package androidx.datastore.core;

import c40.r0;
import j00.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import l00.d;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.datastore.core.DataStoreImpl$incrementCollector$2$1", f = "DataStoreImpl.kt", i = {}, l = {134, 135}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class DataStoreImpl$incrementCollector$2$1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$incrementCollector$2$1(DataStoreImpl<T> dataStoreImpl, c<? super DataStoreImpl$incrementCollector$2$1> cVar) {
        super(2, cVar);
        this.this$0 = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final c<g2> create(@l Object obj, @k c<?> cVar) {
        return new DataStoreImpl$incrementCollector$2$1(this.this$0, cVar);
    }

    @Override // x00.p
    @l
    public final Object invoke(@k r0 r0Var, @l c<? super g2> cVar) {
        return ((DataStoreImpl$incrementCollector$2$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r5.collect(r1, r4) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r5.awaitComplete(r4) == r0) goto L15;
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
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.e.n(r5)
            goto L4e
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1a:
            kotlin.e.n(r5)
            goto L30
        L1e:
            kotlin.e.n(r5)
            androidx.datastore.core.DataStoreImpl<T> r5 = r4.this$0
            androidx.datastore.core.DataStoreImpl$InitDataStore r5 = androidx.datastore.core.DataStoreImpl.access$getReadAndInit$p(r5)
            r4.label = r3
            java.lang.Object r5 = r5.awaitComplete(r4)
            if (r5 != r0) goto L30
            goto L4d
        L30:
            androidx.datastore.core.DataStoreImpl<T> r5 = r4.this$0
            androidx.datastore.core.InterProcessCoordinator r5 = androidx.datastore.core.DataStoreImpl.access$getCoordinator(r5)
            kotlinx.coroutines.flow.i r5 = r5.getUpdateNotifications()
            kotlinx.coroutines.flow.i r5 = kotlinx.coroutines.flow.k.Y(r5)
            androidx.datastore.core.DataStoreImpl$incrementCollector$2$1$1 r1 = new androidx.datastore.core.DataStoreImpl$incrementCollector$2$1$1
            androidx.datastore.core.DataStoreImpl<T> r3 = r4.this$0
            r1.<init>()
            r4.label = r2
            java.lang.Object r5 = r5.collect(r1, r4)
            if (r5 != r0) goto L4e
        L4d:
            return r0
        L4e:
            yz.g2 r5 = yz.g2.f100423a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$incrementCollector$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
