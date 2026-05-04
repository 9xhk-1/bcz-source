package androidx.room.coroutines;

import androidx.room.concurrent.ThreadLocal_jvmAndroidKt;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteDriver;
import c40.v3;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.time.DurationUnit;
import kotlin.time.e;
import kotlin.time.f;
import m80.k;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nConnectionPoolImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionPoolImpl.kt\nandroidx/room/coroutines/ConnectionPoolImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,537:1\n168#1,8:539\n1#2:538\n*S KotlinDebug\n*F\n+ 1 ConnectionPoolImpl.kt\nandroidx/room/coroutines/ConnectionPoolImpl\n*L\n132#1:539,8\n*E\n"})
/* loaded from: classes3.dex */
public final class ConnectionPoolImpl implements ConnectionPool {

    @k
    private final AtomicBoolean _isClosed;

    @k
    private final SQLiteDriver driver;

    @k
    private final Pool readers;

    @k
    private final ThreadLocal<PooledConnectionImpl> threadLocal;
    private long timeout;

    @k
    private final Pool writers;

    public ConnectionPoolImpl(@k final SQLiteDriver driver, @k final String fileName) {
        g0.p(driver, "driver");
        g0.p(fileName, "fileName");
        this.threadLocal = new ThreadLocal<>();
        this._isClosed = new AtomicBoolean(false);
        e.a aVar = e.f67757b;
        this.timeout = f.w(30, DurationUnit.SECONDS);
        this.driver = driver;
        Pool pool = new Pool(1, new x00.a() { // from class: androidx.room.coroutines.d
            @Override // x00.a
            public final Object invoke() {
                SQLiteConnection open;
                open = SQLiteDriver.this.open(fileName);
                return open;
            }
        });
        this.readers = pool;
        this.writers = pool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SQLiteConnection _init_$lambda$4(SQLiteDriver sQLiteDriver, String str) {
        SQLiteConnection open = sQLiteDriver.open(str);
        SQLite.execSQL(open, "PRAGMA query_only = 1");
        return open;
    }

    private final Object acquireWithTimeout(Pool pool, j00.c<? super Pair<ConnectionWithLock, ? extends Throwable>> cVar) {
        Object obj;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        try {
            long j11 = this.timeout;
            obj = null;
            ConnectionPoolImpl$acquireWithTimeout$2 connectionPoolImpl$acquireWithTimeout$2 = new ConnectionPoolImpl$acquireWithTimeout$2(objectRef, pool, null);
            d0.e(0);
            v3.d(j11, connectionPoolImpl$acquireWithTimeout$2, cVar);
            d0.e(1);
        } catch (Throwable th2) {
            obj = th2;
        }
        return h1.a(objectRef.element, obj);
    }

    private final kotlin.coroutines.d createConnectionContext(PooledConnectionImpl pooledConnectionImpl) {
        return new ConnectionElement(pooledConnectionImpl).plus(ThreadLocal_jvmAndroidKt.asContextElement(this.threadLocal, pooledConnectionImpl));
    }

    private final boolean isClosed() {
        return this._isClosed.get();
    }

    private final Void throwTimeoutException(boolean z11) {
        String str = z11 ? "reader" : "writer";
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Timed out attempting to acquire a " + str + " connection.");
        sb2.append('\n');
        sb2.append('\n');
        sb2.append("Writer pool:");
        sb2.append('\n');
        this.writers.dump(sb2);
        sb2.append("Reader pool:");
        sb2.append('\n');
        this.readers.dump(sb2);
        SQLite.throwSQLiteException(5, sb2.toString());
        throw new KotlinNothingValueException();
    }

    @Override // androidx.room.coroutines.ConnectionPool, java.lang.AutoCloseable
    public void close() {
        if (this._isClosed.compareAndSet(false, true)) {
            this.readers.close();
            this.writers.close();
        }
    }

    /* renamed from: getTimeout-UwyO8pc$room_runtime_release, reason: not valid java name */
    public final long m5618getTimeoutUwyO8pc$room_runtime_release() {
        return this.timeout;
    }

    /* renamed from: setTimeout-LRDsOJo$room_runtime_release, reason: not valid java name */
    public final void m5619setTimeoutLRDsOJo$room_runtime_release(long j11) {
        this.timeout = j11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0194 A[Catch: all -> 0x01a5, TRY_LEAVE, TryCatch #3 {all -> 0x01a5, blocks: (B:17:0x018e, B:19:0x0194), top: B:16:0x018e }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014c A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:48:0x0138, B:50:0x014c, B:54:0x015c, B:55:0x0165, B:59:0x016f, B:63:0x01a6, B:64:0x01ad, B:65:0x01ae, B:66:0x01af, B:67:0x01b7), top: B:47:0x0138 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01af A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:48:0x0138, B:50:0x014c, B:54:0x015c, B:55:0x0165, B:59:0x016f, B:63:0x01a6, B:64:0x01ad, B:65:0x01ae, B:66:0x01af, B:67:0x01b7), top: B:47:0x0138 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [T, androidx.room.coroutines.PooledConnectionImpl] */
    /* JADX WARN: Type inference failed for: r14v4 */
    @Override // androidx.room.coroutines.ConnectionPool
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <R> java.lang.Object useConnection(boolean r18, @m80.k x00.p<? super androidx.room.Transactor, ? super j00.c<? super R>, ? extends java.lang.Object> r19, @m80.k j00.c<? super R> r20) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.ConnectionPoolImpl.useConnection(boolean, x00.p, j00.c):java.lang.Object");
    }

    public ConnectionPoolImpl(@k final SQLiteDriver driver, @k final String fileName, int i11, int i12) {
        g0.p(driver, "driver");
        g0.p(fileName, "fileName");
        this.threadLocal = new ThreadLocal<>();
        this._isClosed = new AtomicBoolean(false);
        e.a aVar = e.f67757b;
        this.timeout = f.w(30, DurationUnit.SECONDS);
        if (i11 <= 0) {
            throw new IllegalArgumentException("Maximum number of readers must be greater than 0");
        }
        if (i12 > 0) {
            this.driver = driver;
            this.readers = new Pool(i11, new x00.a() { // from class: androidx.room.coroutines.b
                @Override // x00.a
                public final Object invoke() {
                    SQLiteConnection _init_$lambda$4;
                    _init_$lambda$4 = ConnectionPoolImpl._init_$lambda$4(SQLiteDriver.this, fileName);
                    return _init_$lambda$4;
                }
            });
            this.writers = new Pool(i12, new x00.a() { // from class: androidx.room.coroutines.c
                @Override // x00.a
                public final Object invoke() {
                    SQLiteConnection open;
                    open = SQLiteDriver.this.open(fileName);
                    return open;
                }
            });
            return;
        }
        throw new IllegalArgumentException("Maximum number of writers must be greater than 0");
    }
}
