package androidx.datastore.core;

import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class DataMigrationInitializer$Companion$runMigrations$2$1$1 extends SuspendLambda implements l<c<? super g2>, Object> {
    final /* synthetic */ DataMigration<T> $migration;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataMigrationInitializer$Companion$runMigrations$2$1$1(DataMigration<T> dataMigration, c<? super DataMigrationInitializer$Companion$runMigrations$2$1$1> cVar) {
        super(1, cVar);
        this.$migration = dataMigration;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final c<g2> create(@k c<?> cVar) {
        return new DataMigrationInitializer$Companion$runMigrations$2$1$1(this.$migration, cVar);
    }

    @Override // x00.l
    @m80.l
    public final Object invoke(@m80.l c<? super g2> cVar) {
        return ((DataMigrationInitializer$Companion$runMigrations$2$1$1) create(cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @m80.l
    public final Object invokeSuspend(@k Object obj) {
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            DataMigration<T> dataMigration = this.$migration;
            this.label = 1;
            if (dataMigration.cleanUp(this) == l11) {
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
