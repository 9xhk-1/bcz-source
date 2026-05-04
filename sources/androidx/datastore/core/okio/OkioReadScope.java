package androidx.datastore.core.okio;

import androidx.datastore.core.ReadScope;
import j00.c;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import okio.b;
import okio.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nOkioStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioReadScope\n+ 2 Okio.kt\nokio/Okio__OkioKt\n+ 3 FileSystem.kt\nokio/FileSystem\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,230:1\n66#2:231\n52#2,5:233\n60#2,10:239\n57#2,2:249\n71#2,2:251\n66#2:253\n52#2,5:255\n60#2,10:261\n57#2,2:271\n71#2,2:273\n67#3:232\n68#3:238\n67#3:254\n68#3:260\n1#4:275\n*S KotlinDebug\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioReadScope\n*L\n177#1:231\n177#1:233,5\n177#1:239,10\n177#1:249,2\n177#1:251,2\n187#1:253\n187#1:255,5\n187#1:261,10\n187#1:271,2\n187#1:273,2\n177#1:232\n177#1:238\n187#1:254\n187#1:260\n*E\n"})
/* loaded from: classes2.dex */
public class OkioReadScope<T> implements ReadScope<T> {

    @k
    private final AtomicBoolean closed;

    @k
    private final b fileSystem;

    @k
    private final f path;

    @k
    private final OkioSerializer<T> serializer;

    public OkioReadScope(@k b fileSystem, @k f path, @k OkioSerializer<T> serializer) {
        g0.p(fileSystem, "fileSystem");
        g0.p(path, "path");
        g0.p(serializer, "serializer");
        this.fileSystem = fileSystem;
        this.path = path;
        this.serializer = serializer;
        this.closed = new AtomicBoolean(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0090 A[Catch: FileNotFoundException -> 0x008a, TryCatch #8 {FileNotFoundException -> 0x008a, blocks: (B:40:0x0090, B:42:0x0094, B:55:0x0086, B:52:0x0081), top: B:51:0x0081, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094 A[Catch: FileNotFoundException -> 0x008a, TRY_LEAVE, TryCatch #8 {FileNotFoundException -> 0x008a, blocks: (B:40:0x0090, B:42:0x0094, B:55:0x0086, B:52:0x0081), top: B:51:0x0081, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ <T> java.lang.Object readData$suspendImpl(androidx.datastore.core.okio.OkioReadScope<T> r7, j00.c<? super T> r8) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.okio.OkioReadScope.readData$suspendImpl(androidx.datastore.core.okio.OkioReadScope, j00.c):java.lang.Object");
    }

    public final void checkClose() {
        if (this.closed.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    @Override // androidx.datastore.core.Closeable
    public void close() {
        this.closed.set(true);
    }

    @k
    public final b getFileSystem() {
        return this.fileSystem;
    }

    @k
    public final f getPath() {
        return this.path;
    }

    @k
    public final OkioSerializer<T> getSerializer() {
        return this.serializer;
    }

    @Override // androidx.datastore.core.ReadScope
    @l
    public Object readData(@k c<? super T> cVar) {
        return readData$suspendImpl(this, cVar);
    }
}
