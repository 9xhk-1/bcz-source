package androidx.datastore.core;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import n40.g;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFileStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileStorage.kt\nandroidx/datastore/core/FileStorageConnection\n+ 2 Closeable.kt\nandroidx/datastore/core/CloseableKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,208:1\n38#2,23:209\n38#2,23:240\n120#3,8:232\n129#3:263\n1#4:264\n*S KotlinDebug\n*F\n+ 1 FileStorage.kt\nandroidx/datastore/core/FileStorageConnection\n*L\n100#1:209,23\n117#1:240,23\n114#1:232,8\n114#1:263\n*E\n"})
/* loaded from: classes2.dex */
public final class FileStorageConnection<T> implements StorageConnection<T> {

    @k
    private final java.util.concurrent.atomic.AtomicBoolean closed;

    @k
    private final InterProcessCoordinator coordinator;

    @k
    private final File file;

    @k
    private final x00.a<g2> onClose;

    @k
    private final Serializer<T> serializer;

    @k
    private final n40.a transactionMutex;

    public FileStorageConnection(@k File file, @k Serializer<T> serializer, @k InterProcessCoordinator coordinator, @k x00.a<g2> onClose) {
        g0.p(file, "file");
        g0.p(serializer, "serializer");
        g0.p(coordinator, "coordinator");
        g0.p(onClose, "onClose");
        this.file = file;
        this.serializer = serializer;
        this.coordinator = coordinator;
        this.onClose = onClose;
        this.closed = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.transactionMutex = g.b(false, 1, null);
    }

    private final void checkNotClosed() {
        if (this.closed.get()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }

    private final void createParentDirectories(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            throw new IOException("Unable to create parent directories of " + file);
        }
    }

    @Override // androidx.datastore.core.Closeable
    public void close() {
        this.closed.set(true);
        this.onClose.invoke();
    }

    @Override // androidx.datastore.core.StorageConnection
    @k
    public InterProcessCoordinator getCoordinator() {
        return this.coordinator;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(6:34|35|36|38|39|(1:41)(1:42))|13|14|15|(2:(1:18)|19)(1:21)))|7|(0)(0)|13|14|15|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b A[Catch: all -> 0x007c, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x007c, blocks: (B:21:0x007b, B:28:0x008c, B:31:0x0089, B:27:0x0084), top: B:7:0x0022, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.datastore.core.FileStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.FileStorageConnection$readScope$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.datastore.core.FileStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r8v15, types: [boolean] */
    @Override // androidx.datastore.core.StorageConnection
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <R> java.lang.Object readScope(@m80.k x00.q<? super androidx.datastore.core.ReadScope<T>, ? super java.lang.Boolean, ? super j00.c<? super R>, ? extends java.lang.Object> r8, @m80.k j00.c<? super R> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.datastore.core.FileStorageConnection$readScope$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.datastore.core.FileStorageConnection$readScope$1 r0 = (androidx.datastore.core.FileStorageConnection$readScope$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.FileStorageConnection$readScope$1 r0 = new androidx.datastore.core.FileStorageConnection$readScope$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            boolean r8 = r0.Z$0
            java.lang.Object r1 = r0.L$1
            androidx.datastore.core.Closeable r1 = (androidx.datastore.core.Closeable) r1
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.FileStorageConnection r0 = (androidx.datastore.core.FileStorageConnection) r0
            kotlin.e.n(r9)     // Catch: java.lang.Throwable -> L34
            goto L6b
        L34:
            r9 = move-exception
            goto L84
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            kotlin.e.n(r9)
            r7.checkNotClosed()
            n40.a r9 = r7.transactionMutex
            boolean r9 = n40.a.C0899a.c(r9, r4, r3, r4)
            androidx.datastore.core.FileReadScope r2 = new androidx.datastore.core.FileReadScope     // Catch: java.lang.Throwable -> L8d
            java.io.File r5 = r7.file     // Catch: java.lang.Throwable -> L8d
            androidx.datastore.core.Serializer<T> r6 = r7.serializer     // Catch: java.lang.Throwable -> L8d
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L8d
            java.lang.Boolean r5 = l00.a.a(r9)     // Catch: java.lang.Throwable -> L7e
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L7e
            r0.L$1 = r2     // Catch: java.lang.Throwable -> L7e
            r0.Z$0 = r9     // Catch: java.lang.Throwable -> L7e
            r0.label = r3     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r8 = r8.invoke(r2, r5, r0)     // Catch: java.lang.Throwable -> L7e
            if (r8 != r1) goto L66
            return r1
        L66:
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r7
            r1 = r2
        L6b:
            r1.close()     // Catch: java.lang.Throwable -> L70
            r1 = r4
            goto L71
        L70:
            r1 = move-exception
        L71:
            if (r1 != 0) goto L7b
            if (r8 == 0) goto L7a
            n40.a r8 = r0.transactionMutex
            n40.a.C0899a.d(r8, r4, r3, r4)
        L7a:
            return r9
        L7b:
            throw r1     // Catch: java.lang.Throwable -> L7c
        L7c:
            r9 = move-exception
            goto L92
        L7e:
            r8 = move-exception
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r7
            r1 = r2
        L84:
            r1.close()     // Catch: java.lang.Throwable -> L88
            goto L8c
        L88:
            r1 = move-exception
            yz.r.a(r9, r1)     // Catch: java.lang.Throwable -> L7c
        L8c:
            throw r9     // Catch: java.lang.Throwable -> L7c
        L8d:
            r8 = move-exception
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r7
        L92:
            if (r8 == 0) goto L99
            n40.a r8 = r0.transactionMutex
            n40.a.C0899a.d(r8, r4, r3, r4)
        L99:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.FileStorageConnection.readScope(x00.q, j00.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bb A[Catch: all -> 0x00f0, IOException -> 0x00f2, TRY_ENTER, TryCatch #1 {all -> 0x00f0, blocks: (B:19:0x00bb, B:21:0x00c1, B:24:0x00ca, B:25:0x00ef, B:27:0x00f5, B:30:0x00fb, B:57:0x010a, B:59:0x0110, B:60:0x0113, B:37:0x0108, B:40:0x0105, B:44:0x007a, B:46:0x0096), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fb A[Catch: all -> 0x00f0, IOException -> 0x00f2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00f0, blocks: (B:19:0x00bb, B:21:0x00c1, B:24:0x00ca, B:25:0x00ef, B:27:0x00f5, B:30:0x00fb, B:57:0x010a, B:59:0x0110, B:60:0x0113, B:37:0x0108, B:40:0x0105, B:44:0x007a, B:46:0x0096), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, n40.a] */
    @Override // androidx.datastore.core.StorageConnection
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object writeScope(@m80.k x00.p<? super androidx.datastore.core.WriteScope<T>, ? super j00.c<? super yz.g2>, ? extends java.lang.Object> r10, @m80.k j00.c<? super yz.g2> r11) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.FileStorageConnection.writeScope(x00.p, j00.c):java.lang.Object");
    }
}
