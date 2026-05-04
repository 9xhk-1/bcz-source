package androidx.datastore.core;

import a00.h0;
import androidx.datastore.core.handlers.NoOpCorruptionHandler;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import c40.h1;
import c40.l3;
import c40.r0;
import c40.s0;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class MultiProcessDataStoreFactory {

    @k
    public static final MultiProcessDataStoreFactory INSTANCE = new MultiProcessDataStoreFactory();

    private MultiProcessDataStoreFactory() {
    }

    public static /* synthetic */ DataStore create$default(MultiProcessDataStoreFactory multiProcessDataStoreFactory, Storage storage, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, r0 r0Var, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i11 & 4) != 0) {
            list = h0.J();
        }
        if ((i11 & 8) != 0) {
            r0Var = s0.a(h1.c().plus(l3.c(null, 1, null)));
        }
        return multiProcessDataStoreFactory.create(storage, replaceFileCorruptionHandler, list, r0Var);
    }

    @w00.k
    @k
    public final <T> DataStore<T> create(@k Serializer<T> serializer, @l ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, @k List<? extends DataMigration<T>> migrations, @k x00.a<? extends File> produceFile) {
        g0.p(serializer, "serializer");
        g0.p(migrations, "migrations");
        g0.p(produceFile, "produceFile");
        return create$default(this, serializer, replaceFileCorruptionHandler, migrations, null, produceFile, 8, null);
    }

    @w00.k
    @k
    public final <T> DataStore<T> create(@k Serializer<T> serializer, @l ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, @k x00.a<? extends File> produceFile) {
        g0.p(serializer, "serializer");
        g0.p(produceFile, "produceFile");
        return create$default(this, serializer, replaceFileCorruptionHandler, null, null, produceFile, 12, null);
    }

    @w00.k
    @k
    public final <T> DataStore<T> create(@k Serializer<T> serializer, @k x00.a<? extends File> produceFile) {
        g0.p(serializer, "serializer");
        g0.p(produceFile, "produceFile");
        return create$default(this, serializer, null, null, null, produceFile, 14, null);
    }

    public static /* synthetic */ DataStore create$default(MultiProcessDataStoreFactory multiProcessDataStoreFactory, Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, r0 r0Var, x00.a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i11 & 4) != 0) {
            list = h0.J();
        }
        if ((i11 & 8) != 0) {
            r0Var = s0.a(h1.c().plus(l3.c(null, 1, null)));
        }
        return multiProcessDataStoreFactory.create(serializer, replaceFileCorruptionHandler, list, r0Var, aVar);
    }

    @w00.k
    @k
    public final <T> DataStore<T> create(@k Storage<T> storage) {
        g0.p(storage, "storage");
        return create$default(this, storage, null, null, null, 14, null);
    }

    @w00.k
    @k
    public final <T> DataStore<T> create(@k Storage<T> storage, @l ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler) {
        g0.p(storage, "storage");
        return create$default(this, storage, replaceFileCorruptionHandler, null, null, 12, null);
    }

    @w00.k
    @k
    public final <T> DataStore<T> create(@k Storage<T> storage, @l ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, @k List<? extends DataMigration<T>> migrations) {
        g0.p(storage, "storage");
        g0.p(migrations, "migrations");
        return create$default(this, storage, replaceFileCorruptionHandler, migrations, null, 8, null);
    }

    @w00.k
    @k
    public final <T> DataStore<T> create(@k Storage<T> storage, @l ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, @k List<? extends DataMigration<T>> migrations, @k r0 scope) {
        g0.p(storage, "storage");
        g0.p(migrations, "migrations");
        g0.p(scope, "scope");
        List l11 = a00.g0.l(DataMigrationInitializer.Companion.getInitializer(migrations));
        if (replaceFileCorruptionHandler == null) {
            replaceFileCorruptionHandler = (ReplaceFileCorruptionHandler<T>) new NoOpCorruptionHandler();
        }
        return new DataStoreImpl(storage, l11, replaceFileCorruptionHandler, scope);
    }

    @w00.k
    @k
    public final <T> DataStore<T> create(@k Serializer<T> serializer, @l ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, @k List<? extends DataMigration<T>> migrations, @k final r0 scope, @k x00.a<? extends File> produceFile) {
        g0.p(serializer, "serializer");
        g0.p(migrations, "migrations");
        g0.p(scope, "scope");
        g0.p(produceFile, "produceFile");
        FileStorage fileStorage = new FileStorage(serializer, new x00.l<File, InterProcessCoordinator>() { // from class: androidx.datastore.core.MultiProcessDataStoreFactory$create$1
            {
                super(1);
            }

            @Override // x00.l
            @k
            public final InterProcessCoordinator invoke(@k File it) {
                g0.p(it, "it");
                return new MultiProcessCoordinator(r0.this.getCoroutineContext(), it);
            }
        }, produceFile);
        List l11 = a00.g0.l(DataMigrationInitializer.Companion.getInitializer(migrations));
        if (replaceFileCorruptionHandler == null) {
            replaceFileCorruptionHandler = (ReplaceFileCorruptionHandler<T>) new NoOpCorruptionHandler();
        }
        return new DataStoreImpl(fileStorage, l11, replaceFileCorruptionHandler, scope);
    }
}
