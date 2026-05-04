package androidx.datastore.preferences.core;

import a00.h0;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.FileStorage;
import androidx.datastore.core.Storage;
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
import okio.f;
import r00.o;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class PreferenceDataStoreFactory {

    @k
    public static final PreferenceDataStoreFactory INSTANCE = new PreferenceDataStoreFactory();

    private PreferenceDataStoreFactory() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataStore create$default(PreferenceDataStoreFactory preferenceDataStoreFactory, Storage storage, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, r0 r0Var, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i11 & 4) != 0) {
            list = h0.J();
        }
        if ((i11 & 8) != 0) {
            r0Var = s0.a(Actual_jvmAndroidKt.ioDispatcher().plus(l3.c(null, 1, null)));
        }
        return preferenceDataStoreFactory.create((Storage<Preferences>) storage, (ReplaceFileCorruptionHandler<Preferences>) replaceFileCorruptionHandler, (List<? extends DataMigration<Preferences>>) list, r0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataStore createWithPath$default(PreferenceDataStoreFactory preferenceDataStoreFactory, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, r0 r0Var, a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i11 & 2) != 0) {
            list = h0.J();
        }
        if ((i11 & 4) != 0) {
            r0Var = s0.a(Actual_jvmAndroidKt.ioDispatcher().plus(l3.c(null, 1, null)));
        }
        return preferenceDataStoreFactory.createWithPath(replaceFileCorruptionHandler, list, r0Var, aVar);
    }

    @w00.k
    @k
    public final DataStore<Preferences> create(@k Storage<Preferences> storage) {
        g0.p(storage, "storage");
        return create$default(this, storage, (ReplaceFileCorruptionHandler) null, (List) null, (r0) null, 14, (Object) null);
    }

    @w00.k
    @k
    public final DataStore<Preferences> createWithPath(@l ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, @k List<? extends DataMigration<Preferences>> migrations, @k a<f> produceFile) {
        g0.p(migrations, "migrations");
        g0.p(produceFile, "produceFile");
        return createWithPath$default(this, replaceFileCorruptionHandler, migrations, null, produceFile, 4, null);
    }

    @w00.k
    @k
    public final DataStore<Preferences> create(@k Storage<Preferences> storage, @l ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler) {
        g0.p(storage, "storage");
        return create$default(this, storage, replaceFileCorruptionHandler, (List) null, (r0) null, 12, (Object) null);
    }

    @w00.k
    @k
    public final DataStore<Preferences> createWithPath(@l ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, @k a<f> produceFile) {
        g0.p(produceFile, "produceFile");
        return createWithPath$default(this, replaceFileCorruptionHandler, null, null, produceFile, 6, null);
    }

    @w00.k
    @k
    public final DataStore<Preferences> create(@k Storage<Preferences> storage, @l ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, @k List<? extends DataMigration<Preferences>> migrations) {
        g0.p(storage, "storage");
        g0.p(migrations, "migrations");
        return create$default(this, storage, replaceFileCorruptionHandler, migrations, (r0) null, 8, (Object) null);
    }

    @w00.k
    @k
    public final DataStore<Preferences> createWithPath(@k a<f> produceFile) {
        g0.p(produceFile, "produceFile");
        return createWithPath$default(this, null, null, null, produceFile, 7, null);
    }

    @w00.k
    @k
    public final DataStore<Preferences> create(@l ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, @k List<? extends DataMigration<Preferences>> migrations, @k a<? extends File> produceFile) {
        g0.p(migrations, "migrations");
        g0.p(produceFile, "produceFile");
        return create$default(this, replaceFileCorruptionHandler, migrations, (r0) null, produceFile, 4, (Object) null);
    }

    @w00.k
    @k
    public final DataStore<Preferences> createWithPath(@l ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, @k List<? extends DataMigration<Preferences>> migrations, @k r0 scope, @k final a<f> produceFile) {
        g0.p(migrations, "migrations");
        g0.p(scope, "scope");
        g0.p(produceFile, "produceFile");
        return create(replaceFileCorruptionHandler, migrations, scope, new a<File>() { // from class: androidx.datastore.preferences.core.PreferenceDataStoreFactory$createWithPath$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            @k
            public final File invoke() {
                return produceFile.invoke().toFile();
            }
        });
    }

    @w00.k
    @k
    public final DataStore<Preferences> create(@l ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, @k a<? extends File> produceFile) {
        g0.p(produceFile, "produceFile");
        return create$default(this, replaceFileCorruptionHandler, (List) null, (r0) null, produceFile, 6, (Object) null);
    }

    @w00.k
    @k
    public final DataStore<Preferences> create(@k a<? extends File> produceFile) {
        g0.p(produceFile, "produceFile");
        return create$default(this, (ReplaceFileCorruptionHandler) null, (List) null, (r0) null, produceFile, 7, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataStore create$default(PreferenceDataStoreFactory preferenceDataStoreFactory, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, r0 r0Var, a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i11 & 2) != 0) {
            list = h0.J();
        }
        if ((i11 & 4) != 0) {
            r0Var = s0.a(h1.c().plus(l3.c(null, 1, null)));
        }
        return preferenceDataStoreFactory.create((ReplaceFileCorruptionHandler<Preferences>) replaceFileCorruptionHandler, (List<? extends DataMigration<Preferences>>) list, r0Var, (a<? extends File>) aVar);
    }

    @w00.k
    @k
    public final DataStore<Preferences> create(@l ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, @k List<? extends DataMigration<Preferences>> migrations, @k r0 scope, @k final a<? extends File> produceFile) {
        g0.p(migrations, "migrations");
        g0.p(scope, "scope");
        g0.p(produceFile, "produceFile");
        return new PreferenceDataStore(create(new FileStorage(PreferencesFileSerializer.INSTANCE, null, new a<File>() { // from class: androidx.datastore.preferences.core.PreferenceDataStoreFactory$create$delegate$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            @k
            public final File invoke() {
                File invoke = produceFile.invoke();
                if (g0.g(o.f0(invoke), "preferences_pb")) {
                    File absoluteFile = invoke.getAbsoluteFile();
                    g0.o(absoluteFile, "file.absoluteFile");
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + invoke + " does not match required extension for Preferences file: preferences_pb").toString());
            }
        }, 2, null), replaceFileCorruptionHandler, migrations, scope));
    }

    @w00.k
    @k
    public final DataStore<Preferences> create(@k Storage<Preferences> storage, @l ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, @k List<? extends DataMigration<Preferences>> migrations, @k r0 scope) {
        g0.p(storage, "storage");
        g0.p(migrations, "migrations");
        g0.p(scope, "scope");
        return new PreferenceDataStore(DataStoreFactory.INSTANCE.create(storage, replaceFileCorruptionHandler, migrations, scope));
    }
}
