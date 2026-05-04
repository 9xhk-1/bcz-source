package androidx.datastore.core;

import j00.c;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import l00.d;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", i = {0, 0}, l = {44, 46}, m = "invokeSuspend", n = {"migration", "data"}, s = {"L$2", "L$3"})
@u0({"SMAP\nDataMigrationInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataMigrationInitializer.kt\nandroidx/datastore/core/DataMigrationInitializer$Companion$runMigrations$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,72:1\n1789#2,3:73\n*S KotlinDebug\n*F\n+ 1 DataMigrationInitializer.kt\nandroidx/datastore/core/DataMigrationInitializer$Companion$runMigrations$2\n*L\n43#1:73,3\n*E\n"})
/* loaded from: classes2.dex */
public final class DataMigrationInitializer$Companion$runMigrations$2<T> extends SuspendLambda implements p<T, c<? super T>, Object> {
    final /* synthetic */ List<l<c<? super g2>, Object>> $cleanUps;
    final /* synthetic */ List<DataMigration<T>> $migrations;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DataMigrationInitializer$Companion$runMigrations$2(List<? extends DataMigration<T>> list, List<l<c<? super g2>, Object>> list2, c<? super DataMigrationInitializer$Companion$runMigrations$2> cVar) {
        super(2, cVar);
        this.$migrations = list;
        this.$cleanUps = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final c<g2> create(@m80.l Object obj, @k c<?> cVar) {
        DataMigrationInitializer$Companion$runMigrations$2 dataMigrationInitializer$Companion$runMigrations$2 = new DataMigrationInitializer$Companion$runMigrations$2(this.$migrations, this.$cleanUps, cVar);
        dataMigrationInitializer$Companion$runMigrations$2.L$0 = obj;
        return dataMigrationInitializer$Companion$runMigrations$2;
    }

    @m80.l
    public final Object invoke(T t11, @m80.l c<? super T> cVar) {
        return ((DataMigrationInitializer$Companion$runMigrations$2) create(t11, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@m80.k java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r9.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L37
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            java.lang.Object r1 = r9.L$1
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r4 = r9.L$0
            java.util.List r4 = (java.util.List) r4
            kotlin.e.n(r10)
            goto L46
        L1a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L22:
            java.lang.Object r1 = r9.L$3
            java.lang.Object r4 = r9.L$2
            androidx.datastore.core.DataMigration r4 = (androidx.datastore.core.DataMigration) r4
            java.lang.Object r5 = r9.L$1
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r9.L$0
            java.util.List r6 = (java.util.List) r6
            kotlin.e.n(r10)
            r8 = r6
            r6 = r4
            r4 = r8
            goto L68
        L37:
            kotlin.e.n(r10)
            java.lang.Object r10 = r9.L$0
            java.util.List<androidx.datastore.core.DataMigration<T>> r1 = r9.$migrations
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List<x00.l<j00.c<? super yz.g2>, java.lang.Object>> r4 = r9.$cleanUps
            java.util.Iterator r1 = r1.iterator()
        L46:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L8e
            java.lang.Object r5 = r1.next()
            androidx.datastore.core.DataMigration r5 = (androidx.datastore.core.DataMigration) r5
            r9.L$0 = r4
            r9.L$1 = r1
            r9.L$2 = r5
            r9.L$3 = r10
            r9.label = r3
            java.lang.Object r6 = r5.shouldMigrate(r10, r9)
            if (r6 != r0) goto L63
            goto L89
        L63:
            r8 = r1
            r1 = r10
            r10 = r6
            r6 = r5
            r5 = r8
        L68:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L8c
            androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1 r10 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1
            r7 = 0
            r10.<init>(r6, r7)
            r4.add(r10)
            r9.L$0 = r4
            r9.L$1 = r5
            r9.L$2 = r7
            r9.L$3 = r7
            r9.label = r2
            java.lang.Object r10 = r6.migrate(r1, r9)
            if (r10 != r0) goto L8a
        L89:
            return r0
        L8a:
            r1 = r5
            goto L46
        L8c:
            r10 = r1
            goto L8a
        L8e:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x00.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((DataMigrationInitializer$Companion$runMigrations$2<T>) obj, (c<? super DataMigrationInitializer$Companion$runMigrations$2<T>>) obj2);
    }
}
