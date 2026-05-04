package androidx.datastore.core;

import androidx.annotation.GuardedBy;
import androidx.datastore.core.FileStorage;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class FileStorage<T> implements Storage<T> {

    @k
    public static final Companion Companion = new Companion(null);

    @GuardedBy("activeFilesLock")
    @k
    private static final Set<String> activeFiles = new LinkedHashSet();

    @k
    private static final Object activeFilesLock = new Object();

    @k
    private final l<File, InterProcessCoordinator> coordinatorProducer;

    @k
    private final x00.a<File> produceFile;

    @k
    private final Serializer<T> serializer;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final Set<String> getActiveFiles$datastore_core_release() {
            return FileStorage.activeFiles;
        }

        @k
        public final Object getActiveFilesLock$datastore_core_release() {
            return FileStorage.activeFilesLock;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FileStorage(@k Serializer<T> serializer, @k l<? super File, ? extends InterProcessCoordinator> coordinatorProducer, @k x00.a<? extends File> produceFile) {
        g0.p(serializer, "serializer");
        g0.p(coordinatorProducer, "coordinatorProducer");
        g0.p(produceFile, "produceFile");
        this.serializer = serializer;
        this.coordinatorProducer = coordinatorProducer;
        this.produceFile = produceFile;
    }

    @Override // androidx.datastore.core.Storage
    @k
    public StorageConnection<T> createConnection() {
        final File file = this.produceFile.invoke().getCanonicalFile();
        synchronized (activeFilesLock) {
            String path = file.getAbsolutePath();
            Set<String> set = activeFiles;
            if (set.contains(path)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            g0.o(path, "path");
            set.add(path);
        }
        g0.o(file, "file");
        return new FileStorageConnection(file, this.serializer, this.coordinatorProducer.invoke(file), new x00.a<g2>() { // from class: androidx.datastore.core.FileStorage$createConnection$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ g2 invoke() {
                invoke2();
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                FileStorage.Companion companion = FileStorage.Companion;
                Object activeFilesLock$datastore_core_release = companion.getActiveFilesLock$datastore_core_release();
                File file2 = file;
                synchronized (activeFilesLock$datastore_core_release) {
                    companion.getActiveFiles$datastore_core_release().remove(file2.getAbsolutePath());
                    g2 g2Var = g2.f100423a;
                }
            }
        });
    }

    public /* synthetic */ FileStorage(Serializer serializer, l lVar, x00.a aVar, int i11, v vVar) {
        this(serializer, (i11 & 2) != 0 ? new l<File, InterProcessCoordinator>() { // from class: androidx.datastore.core.FileStorage.1
            @Override // x00.l
            @k
            public final InterProcessCoordinator invoke(@k File it) {
                g0.p(it, "it");
                return InterProcessCoordinator_jvmKt.createSingleProcessCoordinator(it);
            }
        } : lVar, aVar);
    }
}
