package androidx.datastore.core.okio;

import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.StorageConnection;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import n40.g;
import okio.b;
import okio.f;
import x00.a;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nOkioStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioStorageConnection\n+ 2 Closeable.kt\nandroidx/datastore/core/CloseableKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,230:1\n38#2,23:231\n38#2,23:262\n120#3,8:254\n129#3:285\n1#4:286\n*S KotlinDebug\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioStorageConnection\n*L\n112#1:231,23\n136#1:262,23\n129#1:254,8\n129#1:285\n*E\n"})
/* loaded from: classes2.dex */
public final class OkioStorageConnection<T> implements StorageConnection<T> {

    @k
    private final AtomicBoolean closed;

    @k
    private final InterProcessCoordinator coordinator;

    @k
    private final b fileSystem;

    @k
    private final a<g2> onClose;

    @k
    private final f path;

    @k
    private final OkioSerializer<T> serializer;

    @k
    private final n40.a transactionMutex;

    public OkioStorageConnection(@k b fileSystem, @k f path, @k OkioSerializer<T> serializer, @k InterProcessCoordinator coordinator, @k a<g2> onClose) {
        g0.p(fileSystem, "fileSystem");
        g0.p(path, "path");
        g0.p(serializer, "serializer");
        g0.p(coordinator, "coordinator");
        g0.p(onClose, "onClose");
        this.fileSystem = fileSystem;
        this.path = path;
        this.serializer = serializer;
        this.coordinator = coordinator;
        this.onClose = onClose;
        this.closed = new AtomicBoolean(false);
        this.transactionMutex = g.b(false, 1, null);
    }

    private final void checkNotClosed() {
        if (this.closed.get()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
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

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(6:34|35|36|37|38|(1:40)(1:41))|13|14|15|(2:(1:18)|19)(1:21)))|7|(0)(0)|13|14|15|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d A[Catch: all -> 0x007e, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x007e, blocks: (B:21:0x007d, B:28:0x008e, B:31:0x008b, B:27:0x0086), top: B:7:0x0022, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.datastore.core.okio.OkioStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.okio.OkioStorageConnection$readScope$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.datastore.core.okio.OkioStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean] */
    @Override // androidx.datastore.core.StorageConnection
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <R> java.lang.Object readScope(@m80.k x00.q<? super androidx.datastore.core.ReadScope<T>, ? super java.lang.Boolean, ? super j00.c<? super R>, ? extends java.lang.Object> r9, @m80.k j00.c<? super R> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.datastore.core.okio.OkioStorageConnection$readScope$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.datastore.core.okio.OkioStorageConnection$readScope$1 r0 = (androidx.datastore.core.okio.OkioStorageConnection$readScope$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.okio.OkioStorageConnection$readScope$1 r0 = new androidx.datastore.core.okio.OkioStorageConnection$readScope$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            boolean r9 = r0.Z$0
            java.lang.Object r1 = r0.L$1
            androidx.datastore.core.Closeable r1 = (androidx.datastore.core.Closeable) r1
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.okio.OkioStorageConnection r0 = (androidx.datastore.core.okio.OkioStorageConnection) r0
            kotlin.e.n(r10)     // Catch: java.lang.Throwable -> L34
            goto L6d
        L34:
            r10 = move-exception
            goto L86
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            kotlin.e.n(r10)
            r8.checkNotClosed()
            n40.a r10 = r8.transactionMutex
            boolean r10 = n40.a.C0899a.c(r10, r4, r3, r4)
            androidx.datastore.core.okio.OkioReadScope r2 = new androidx.datastore.core.okio.OkioReadScope     // Catch: java.lang.Throwable -> L8f
            okio.b r5 = r8.fileSystem     // Catch: java.lang.Throwable -> L8f
            okio.f r6 = r8.path     // Catch: java.lang.Throwable -> L8f
            androidx.datastore.core.okio.OkioSerializer<T> r7 = r8.serializer     // Catch: java.lang.Throwable -> L8f
            r2.<init>(r5, r6, r7)     // Catch: java.lang.Throwable -> L8f
            java.lang.Boolean r5 = l00.a.a(r10)     // Catch: java.lang.Throwable -> L80
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L80
            r0.L$1 = r2     // Catch: java.lang.Throwable -> L80
            r0.Z$0 = r10     // Catch: java.lang.Throwable -> L80
            r0.label = r3     // Catch: java.lang.Throwable -> L80
            java.lang.Object r9 = r9.invoke(r2, r5, r0)     // Catch: java.lang.Throwable -> L80
            if (r9 != r1) goto L68
            return r1
        L68:
            r0 = r10
            r10 = r9
            r9 = r0
            r0 = r8
            r1 = r2
        L6d:
            r1.close()     // Catch: java.lang.Throwable -> L72
            r1 = r4
            goto L73
        L72:
            r1 = move-exception
        L73:
            if (r1 != 0) goto L7d
            if (r9 == 0) goto L7c
            n40.a r9 = r0.transactionMutex
            n40.a.C0899a.d(r9, r4, r3, r4)
        L7c:
            return r10
        L7d:
            throw r1     // Catch: java.lang.Throwable -> L7e
        L7e:
            r10 = move-exception
            goto L94
        L80:
            r9 = move-exception
            r0 = r10
            r10 = r9
            r9 = r0
            r0 = r8
            r1 = r2
        L86:
            r1.close()     // Catch: java.lang.Throwable -> L8a
            goto L8e
        L8a:
            r1 = move-exception
            yz.r.a(r10, r1)     // Catch: java.lang.Throwable -> L7e
        L8e:
            throw r10     // Catch: java.lang.Throwable -> L7e
        L8f:
            r9 = move-exception
            r0 = r10
            r10 = r9
            r9 = r0
            r0 = r8
        L94:
            if (r9 == 0) goto L9b
            n40.a r9 = r0.transactionMutex
            n40.a.C0899a.d(r9, r4, r3, r4)
        L9b:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.okio.OkioStorageConnection.readScope(x00.q, j00.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cf A[Catch: all -> 0x00df, IOException -> 0x00e2, TRY_ENTER, TryCatch #1 {IOException -> 0x00e2, blocks: (B:19:0x00cf, B:21:0x00d7, B:26:0x00ed, B:33:0x00fc, B:36:0x00f9), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ed A[Catch: all -> 0x00df, IOException -> 0x00e2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {IOException -> 0x00e2, blocks: (B:19:0x00cf, B:21:0x00d7, B:26:0x00ed, B:33:0x00fc, B:36:0x00f9), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    @Override // androidx.datastore.core.StorageConnection
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object writeScope(@m80.k x00.p<? super androidx.datastore.core.WriteScope<T>, ? super j00.c<? super yz.g2>, ? extends java.lang.Object> r10, @m80.k j00.c<? super yz.g2> r11) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.okio.OkioStorageConnection.writeScope(x00.p, j00.c):java.lang.Object");
    }
}
