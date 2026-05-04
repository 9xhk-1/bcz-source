package androidx.datastore.core;

import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.u0;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDataStoreImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl$InitDataStore$doRun$initData$1$api$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,538:1\n120#2,10:539\n*S KotlinDebug\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl$InitDataStore$doRun$initData$1$api$1\n*L\n441#1:539,10\n*E\n"})
/* loaded from: classes2.dex */
public final class DataStoreImpl$InitDataStore$doRun$initData$1$api$1<T> implements InitializerApi<T> {
    final /* synthetic */ Ref.ObjectRef<T> $currentData;
    final /* synthetic */ Ref.BooleanRef $initializationComplete;
    final /* synthetic */ n40.a $updateLock;
    final /* synthetic */ DataStoreImpl<T> this$0;

    public DataStoreImpl$InitDataStore$doRun$initData$1$api$1(n40.a aVar, Ref.BooleanRef booleanRef, Ref.ObjectRef<T> objectRef, DataStoreImpl<T> dataStoreImpl) {
        this.$updateLock = aVar;
        this.$initializationComplete = booleanRef;
        this.$currentData = objectRef;
        this.this$0 = dataStoreImpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ba A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:27:0x0052, B:28:0x00b2, B:30:0x00ba), top: B:26:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009a A[Catch: all -> 0x00d8, TRY_LEAVE, TryCatch #1 {all -> 0x00d8, blocks: (B:40:0x0096, B:42:0x009a, B:45:0x00db, B:46:0x00e2), top: B:39:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00db A[Catch: all -> 0x00d8, TRY_ENTER, TryCatch #1 {all -> 0x00d8, blocks: (B:40:0x0096, B:42:0x009a, B:45:0x00db, B:46:0x00e2), top: B:39:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // androidx.datastore.core.InitializerApi
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object updateData(@m80.k x00.p<? super T, ? super j00.c<? super T>, ? extends java.lang.Object> r10, @m80.k j00.c<? super T> r11) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1.updateData(x00.p, j00.c):java.lang.Object");
    }
}
