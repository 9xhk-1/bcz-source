package androidx.room.coroutines;

import a00.r0;
import androidx.collection.CircularArray;
import androidx.sqlite.SQLiteConnection;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import n40.h;
import n40.l;
import org.junit.jupiter.api.j2;
import pn.j;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nConnectionPoolImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionPoolImpl.kt\nandroidx/room/coroutines/Pool\n+ 2 ReentrantLock.kt\nandroidx/room/concurrent/ReentrantLockKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,537:1\n28#2,5:538\n28#2,5:543\n28#2,3:548\n32#2:553\n28#2,3:554\n32#2:560\n13402#3,2:551\n13467#3,3:557\n*S KotlinDebug\n*F\n+ 1 ConnectionPoolImpl.kt\nandroidx/room/coroutines/Pool\n*L\n214#1:538,5\n240#1:543,5\n245#1:548,3\n245#1:553\n253#1:554,3\n253#1:560\n247#1:551,2\n266#1:557,3\n*E\n"})
/* loaded from: classes3.dex */
final class Pool {

    @k
    private final CircularArray<ConnectionWithLock> availableConnections;
    private final int capacity;

    @k
    private final x00.a<SQLiteConnection> connectionFactory;

    @k
    private final h connectionPermits;

    @k
    private final ConnectionWithLock[] connections;
    private boolean isClosed;

    @k
    private final ReentrantLock lock;
    private int size;

    /* JADX WARN: Multi-variable type inference failed */
    public Pool(int i11, @k x00.a<? extends SQLiteConnection> connectionFactory) {
        g0.p(connectionFactory, "connectionFactory");
        this.capacity = i11;
        this.connectionFactory = connectionFactory;
        this.lock = new ReentrantLock();
        this.connections = new ConnectionWithLock[i11];
        this.connectionPermits = l.b(i11, 0, 2, null);
        this.availableConnections = new CircularArray<>(i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void tryOpenNewConnectionLocked() {
        if (this.size >= this.capacity) {
            return;
        }
        ConnectionWithLock connectionWithLock = new ConnectionWithLock(this.connectionFactory.invoke(), null, 2, 0 == true ? 1 : 0);
        ConnectionWithLock[] connectionWithLockArr = this.connections;
        int i11 = this.size;
        this.size = i11 + 1;
        connectionWithLockArr[i11] = connectionWithLock;
        this.availableConnections.addLast(connectionWithLock);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f A[Catch: all -> 0x005b, TryCatch #1 {all -> 0x005b, blocks: (B:13:0x004b, B:15:0x004f, B:17:0x0057, B:18:0x005d, B:22:0x006b, B:23:0x0077), top: B:12:0x004b, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b A[Catch: all -> 0x005b, TRY_ENTER, TryCatch #1 {all -> 0x005b, blocks: (B:13:0x004b, B:15:0x004f, B:17:0x0057, B:18:0x005d, B:22:0x006b, B:23:0x0077), top: B:12:0x004b, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object acquire(@m80.k j00.c<? super androidx.room.coroutines.ConnectionWithLock> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.room.coroutines.Pool$acquire$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.room.coroutines.Pool$acquire$1 r0 = (androidx.room.coroutines.Pool$acquire$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.coroutines.Pool$acquire$1 r0 = new androidx.room.coroutines.Pool$acquire$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            androidx.room.coroutines.Pool r0 = (androidx.room.coroutines.Pool) r0
            kotlin.e.n(r5)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.e.n(r5)
            n40.h r5 = r4.connectionPermits
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r0 = r4
        L46:
            java.util.concurrent.locks.ReentrantLock r5 = r0.lock     // Catch: java.lang.Throwable -> L69
            r5.lock()     // Catch: java.lang.Throwable -> L69
            boolean r1 = r0.isClosed     // Catch: java.lang.Throwable -> L5b
            if (r1 != 0) goto L6b
            androidx.collection.CircularArray<androidx.room.coroutines.ConnectionWithLock> r1 = r0.availableConnections     // Catch: java.lang.Throwable -> L5b
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto L5d
            r0.tryOpenNewConnectionLocked()     // Catch: java.lang.Throwable -> L5b
            goto L5d
        L5b:
            r1 = move-exception
            goto L78
        L5d:
            androidx.collection.CircularArray<androidx.room.coroutines.ConnectionWithLock> r1 = r0.availableConnections     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r1 = r1.popFirst()     // Catch: java.lang.Throwable -> L5b
            androidx.room.coroutines.ConnectionWithLock r1 = (androidx.room.coroutines.ConnectionWithLock) r1     // Catch: java.lang.Throwable -> L5b
            r5.unlock()     // Catch: java.lang.Throwable -> L69
            return r1
        L69:
            r5 = move-exception
            goto L7c
        L6b:
            java.lang.String r1 = "Connection pool is closed"
            r2 = 21
            androidx.sqlite.SQLite.throwSQLiteException(r2, r1)     // Catch: java.lang.Throwable -> L5b
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L5b
            r1.<init>()     // Catch: java.lang.Throwable -> L5b
            throw r1     // Catch: java.lang.Throwable -> L5b
        L78:
            r5.unlock()     // Catch: java.lang.Throwable -> L69
            throw r1     // Catch: java.lang.Throwable -> L69
        L7c:
            n40.h r0 = r0.connectionPermits
            r0.release()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.Pool.acquire(j00.c):java.lang.Object");
    }

    public final void close() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.isClosed = true;
            for (ConnectionWithLock connectionWithLock : this.connections) {
                if (connectionWithLock != null) {
                    connectionWithLock.close();
                }
            }
            g2 g2Var = g2.f100423a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void dump(@k StringBuilder builder) {
        g0.p(builder, "builder");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            List j11 = a00.g0.j();
            int size = this.availableConnections.size();
            for (int i11 = 0; i11 < size; i11++) {
                j11.add(this.availableConnections.get(i11));
            }
            List b11 = a00.g0.b(j11);
            builder.append('\t' + super.toString() + " (");
            builder.append("capacity=" + this.capacity + j2.O);
            builder.append("permits=" + this.connectionPermits.c() + j2.O);
            builder.append("queue=(size=" + b11.size() + ")[" + r0.r3(b11, null, null, null, 0, null, null, 63, null) + "], ");
            builder.append(j.f81007d);
            builder.append('\n');
            ConnectionWithLock[] connectionWithLockArr = this.connections;
            int length = connectionWithLockArr.length;
            int i12 = 0;
            for (int i13 = 0; i13 < length; i13++) {
                ConnectionWithLock connectionWithLock = connectionWithLockArr[i13];
                i12++;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\t\t[");
                sb2.append(i12);
                sb2.append("] - ");
                sb2.append(connectionWithLock != null ? connectionWithLock.toString() : null);
                builder.append(sb2.toString());
                builder.append('\n');
                if (connectionWithLock != null) {
                    connectionWithLock.dump(builder);
                }
            }
            g2 g2Var = g2.f100423a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final int getCapacity() {
        return this.capacity;
    }

    @k
    public final x00.a<SQLiteConnection> getConnectionFactory() {
        return this.connectionFactory;
    }

    public final void recycle(@k ConnectionWithLock connection) {
        g0.p(connection, "connection");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.availableConnections.addLast(connection);
            g2 g2Var = g2.f100423a;
            reentrantLock.unlock();
            this.connectionPermits.release();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
