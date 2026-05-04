package androidx.datastore.core;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import l00.d;
import m80.k;
import s3.c;
import x00.l;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1", f = "DataStoreImpl.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, l = {437, 458, 546, 468}, m = "invokeSuspend", n = {"updateLock", "initializationComplete", "currentData", "updateLock", "initializationComplete", "currentData", c.f87469a, "initializationComplete", "currentData", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
@u0({"SMAP\nDataStoreImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl$InitDataStore$doRun$initData$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,538:1\n1855#2,2:539\n120#3,10:541\n*S KotlinDebug\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl$InitDataStore$doRun$initData$1\n*L\n458#1:539,2\n461#1:541,10\n*E\n"})
/* loaded from: classes2.dex */
public final class DataStoreImpl$InitDataStore$doRun$initData$1<T> extends SuspendLambda implements l<j00.c<? super Data<T>>, Object> {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;
    final /* synthetic */ DataStoreImpl<T>.InitDataStore this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$InitDataStore$doRun$initData$1(DataStoreImpl<T> dataStoreImpl, DataStoreImpl<T>.InitDataStore initDataStore, j00.c<? super DataStoreImpl$InitDataStore$doRun$initData$1> cVar) {
        super(1, cVar);
        this.this$0 = dataStoreImpl;
        this.this$1 = initDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final j00.c<g2> create(@k j00.c<?> cVar) {
        return new DataStoreImpl$InitDataStore$doRun$initData$1(this.this$0, this.this$1, cVar);
    }

    @Override // x00.l
    @m80.l
    public final Object invoke(@m80.l j00.c<? super Data<T>> cVar) {
        return ((DataStoreImpl$InitDataStore$doRun$initData$1) create(cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@m80.k java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
