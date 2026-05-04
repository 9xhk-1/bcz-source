package androidx.datastore.core;

import j00.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import l00.d;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.datastore.core.DataStoreImpl$writeData$2", f = "DataStoreImpl.kt", i = {0}, l = {352, 353}, m = "invokeSuspend", n = {"$this$writeScope"}, s = {"L$0"})
/* loaded from: classes2.dex */
public final class DataStoreImpl$writeData$2<T> extends SuspendLambda implements p<WriteScope<T>, c<? super g2>, Object> {
    final /* synthetic */ T $newData;
    final /* synthetic */ Ref.IntRef $newVersion;
    final /* synthetic */ boolean $updateCache;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$writeData$2(Ref.IntRef intRef, DataStoreImpl<T> dataStoreImpl, T t11, boolean z11, c<? super DataStoreImpl$writeData$2> cVar) {
        super(2, cVar);
        this.$newVersion = intRef;
        this.this$0 = dataStoreImpl;
        this.$newData = t11;
        this.$updateCache = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final c<g2> create(@l Object obj, @k c<?> cVar) {
        DataStoreImpl$writeData$2 dataStoreImpl$writeData$2 = new DataStoreImpl$writeData$2(this.$newVersion, this.this$0, this.$newData, this.$updateCache, cVar);
        dataStoreImpl$writeData$2.L$0 = obj;
        return dataStoreImpl$writeData$2;
    }

    @Override // x00.p
    @l
    public final Object invoke(@k WriteScope<T> writeScope, @l c<? super g2> cVar) {
        return ((DataStoreImpl$writeData$2) create(writeScope, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (r3.writeData(r7, r6) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@m80.k java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.e.n(r7)
            goto L5d
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            java.lang.Object r1 = r6.L$1
            kotlin.jvm.internal.Ref$IntRef r1 = (kotlin.jvm.internal.Ref.IntRef) r1
            java.lang.Object r3 = r6.L$0
            androidx.datastore.core.WriteScope r3 = (androidx.datastore.core.WriteScope) r3
            kotlin.e.n(r7)
            goto L45
        L26:
            kotlin.e.n(r7)
            java.lang.Object r7 = r6.L$0
            androidx.datastore.core.WriteScope r7 = (androidx.datastore.core.WriteScope) r7
            kotlin.jvm.internal.Ref$IntRef r1 = r6.$newVersion
            androidx.datastore.core.DataStoreImpl<T> r4 = r6.this$0
            androidx.datastore.core.InterProcessCoordinator r4 = androidx.datastore.core.DataStoreImpl.access$getCoordinator(r4)
            r6.L$0 = r7
            r6.L$1 = r1
            r6.label = r3
            java.lang.Object r3 = r4.incrementAndGetVersion(r6)
            if (r3 != r0) goto L42
            goto L5c
        L42:
            r5 = r3
            r3 = r7
            r7 = r5
        L45:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r1.element = r7
            T r7 = r6.$newData
            r1 = 0
            r6.L$0 = r1
            r6.L$1 = r1
            r6.label = r2
            java.lang.Object r7 = r3.writeData(r7, r6)
            if (r7 != r0) goto L5d
        L5c:
            return r0
        L5d:
            boolean r7 = r6.$updateCache
            if (r7 == 0) goto L7d
            androidx.datastore.core.DataStoreImpl<T> r7 = r6.this$0
            androidx.datastore.core.DataStoreInMemoryCache r7 = androidx.datastore.core.DataStoreImpl.access$getInMemoryCache$p(r7)
            androidx.datastore.core.Data r0 = new androidx.datastore.core.Data
            T r1 = r6.$newData
            if (r1 == 0) goto L72
            int r2 = r1.hashCode()
            goto L73
        L72:
            r2 = 0
        L73:
            kotlin.jvm.internal.Ref$IntRef r3 = r6.$newVersion
            int r3 = r3.element
            r0.<init>(r1, r2, r3)
            r7.tryUpdate(r0)
        L7d:
            yz.g2 r7 = yz.g2.f100423a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$writeData$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
