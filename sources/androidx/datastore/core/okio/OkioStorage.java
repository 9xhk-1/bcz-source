package androidx.datastore.core.okio;

import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.Storage;
import androidx.datastore.core.StorageConnection;
import androidx.datastore.core.okio.OkioStorage;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import okio.b;
import okio.f;
import x00.a;
import x00.p;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nOkioStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioStorage\n+ 2 Atomic.jvm.kt\nandroidx/datastore/core/okio/Synchronizer\n*L\n1#1,230:1\n49#2,2:231\n*S KotlinDebug\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioStorage\n*L\n64#1:231,2\n*E\n"})
/* loaded from: classes2.dex */
public final class OkioStorage<T> implements Storage<T> {

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final Set<String> activeFiles = new LinkedHashSet();

    @k
    private static final Synchronizer activeFilesLock = new Synchronizer();

    @k
    private final c0 canonicalPath$delegate;

    @k
    private final p<f, b, InterProcessCoordinator> coordinatorProducer;

    @k
    private final b fileSystem;

    @k
    private final a<f> producePath;

    @k
    private final OkioSerializer<T> serializer;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final Set<String> getActiveFiles$datastore_core_okio() {
            return OkioStorage.activeFiles;
        }

        @k
        public final Synchronizer getActiveFilesLock() {
            return OkioStorage.activeFilesLock;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OkioStorage(@k b fileSystem, @k OkioSerializer<T> serializer, @k p<? super f, ? super b, ? extends InterProcessCoordinator> coordinatorProducer, @k a<f> producePath) {
        g0.p(fileSystem, "fileSystem");
        g0.p(serializer, "serializer");
        g0.p(coordinatorProducer, "coordinatorProducer");
        g0.p(producePath, "producePath");
        this.fileSystem = fileSystem;
        this.serializer = serializer;
        this.coordinatorProducer = coordinatorProducer;
        this.producePath = producePath;
        this.canonicalPath$delegate = e0.c(new a<f>(this) { // from class: androidx.datastore.core.okio.OkioStorage$canonicalPath$2
            final /* synthetic */ OkioStorage<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // x00.a
            @k
            public final f invoke() {
                a aVar;
                a aVar2;
                aVar = ((OkioStorage) this.this$0).producePath;
                f fVar = (f) aVar.invoke();
                boolean isAbsolute = fVar.isAbsolute();
                OkioStorage<T> okioStorage = this.this$0;
                if (isAbsolute) {
                    return fVar.s();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("OkioStorage requires absolute paths, but did not get an absolute path from producePath = ");
                aVar2 = ((OkioStorage) okioStorage).producePath;
                sb2.append(aVar2);
                sb2.append(", instead got ");
                sb2.append(fVar);
                throw new IllegalStateException(sb2.toString().toString());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f getCanonicalPath() {
        return (f) this.canonicalPath$delegate.getValue();
    }

    @Override // androidx.datastore.core.Storage
    @k
    public StorageConnection<T> createConnection() {
        String fVar = getCanonicalPath().toString();
        synchronized (activeFilesLock) {
            Set<String> set = activeFiles;
            if (set.contains(fVar)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + fVar + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            set.add(fVar);
        }
        return new OkioStorageConnection(this.fileSystem, getCanonicalPath(), this.serializer, this.coordinatorProducer.invoke(getCanonicalPath(), this.fileSystem), new a<g2>(this) { // from class: androidx.datastore.core.okio.OkioStorage$createConnection$2
            final /* synthetic */ OkioStorage<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ g2 invoke() {
                invoke2();
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                f canonicalPath;
                OkioStorage.Companion companion = OkioStorage.Companion;
                Synchronizer activeFilesLock2 = companion.getActiveFilesLock();
                OkioStorage<T> okioStorage = this.this$0;
                synchronized (activeFilesLock2) {
                    Set<String> activeFiles$datastore_core_okio = companion.getActiveFiles$datastore_core_okio();
                    canonicalPath = okioStorage.getCanonicalPath();
                    activeFiles$datastore_core_okio.remove(canonicalPath.toString());
                    g2 g2Var = g2.f100423a;
                }
            }
        });
    }

    public /* synthetic */ OkioStorage(b bVar, OkioSerializer okioSerializer, p pVar, a aVar, int i11, v vVar) {
        this(bVar, okioSerializer, (i11 & 4) != 0 ? new p<f, b, InterProcessCoordinator>() { // from class: androidx.datastore.core.okio.OkioStorage.1
            @Override // x00.p
            @k
            public final InterProcessCoordinator invoke(@k f path, @k b bVar2) {
                g0.p(path, "path");
                g0.p(bVar2, "<anonymous parameter 1>");
                return OkioStorageKt.createSingleProcessCoordinator(path);
            }
        } : pVar, aVar);
    }
}
