package androidx.room.coroutines;

import a00.r0;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.Iterator;
import k40.j;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import n40.g;
import u30.k0;
import yz.g2;
import yz.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nConnectionPoolImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionPoolImpl.kt\nandroidx/room/coroutines/ConnectionWithLock\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,537:1\n1#2:538\n1863#3,2:539\n*S KotlinDebug\n*F\n+ 1 ConnectionPoolImpl.kt\nandroidx/room/coroutines/ConnectionWithLock\n*L\n298#1:539,2\n*E\n"})
/* loaded from: classes3.dex */
final class ConnectionWithLock implements SQLiteConnection, n40.a {

    @l
    private kotlin.coroutines.d acquireCoroutineContext;

    @l
    private Throwable acquireThrowable;

    @k
    private final SQLiteConnection delegate;

    @k
    private final n40.a lock;

    public ConnectionWithLock(@k SQLiteConnection delegate, @k n40.a lock) {
        g0.p(delegate, "delegate");
        g0.p(lock, "lock");
        this.delegate = delegate;
        this.lock = lock;
    }

    @Override // androidx.sqlite.SQLiteConnection, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    public final void dump(@k StringBuilder builder) {
        g0.p(builder, "builder");
        if (this.acquireCoroutineContext == null && this.acquireThrowable == null) {
            builder.append("\t\tStatus: Free connection");
            builder.append('\n');
            return;
        }
        builder.append("\t\tStatus: Acquired connection");
        builder.append('\n');
        kotlin.coroutines.d dVar = this.acquireCoroutineContext;
        if (dVar != null) {
            builder.append("\t\tCoroutine: " + dVar);
            builder.append('\n');
        }
        Throwable th2 = this.acquireThrowable;
        if (th2 != null) {
            builder.append("\t\tAcquired:");
            builder.append('\n');
            Iterator it = r0.g2(k0.e4(r.i(th2)), 1).iterator();
            while (it.hasNext()) {
                builder.append("\t\t" + ((String) it.next()));
                builder.append('\n');
            }
        }
    }

    @Override // n40.a
    @k
    public j<Object, n40.a> getOnLock() {
        return this.lock.getOnLock();
    }

    @Override // n40.a
    public boolean holdsLock(@k Object owner) {
        g0.p(owner, "owner");
        return this.lock.holdsLock(owner);
    }

    @Override // n40.a
    public boolean isLocked() {
        return this.lock.isLocked();
    }

    @Override // n40.a
    @l
    public Object lock(@l Object obj, @k j00.c<? super g2> cVar) {
        return this.lock.lock(obj, cVar);
    }

    @k
    public final ConnectionWithLock markAcquired(@k kotlin.coroutines.d context) {
        g0.p(context, "context");
        this.acquireCoroutineContext = context;
        this.acquireThrowable = new Throwable();
        return this;
    }

    @k
    public final ConnectionWithLock markReleased() {
        this.acquireCoroutineContext = null;
        this.acquireThrowable = null;
        return this;
    }

    @Override // androidx.sqlite.SQLiteConnection
    @k
    public SQLiteStatement prepare(@k String sql) {
        g0.p(sql, "sql");
        return this.delegate.prepare(sql);
    }

    @k
    public String toString() {
        return this.delegate.toString();
    }

    @Override // n40.a
    public boolean tryLock(@l Object obj) {
        return this.lock.tryLock(obj);
    }

    @Override // n40.a
    public void unlock(@l Object obj) {
        this.lock.unlock(obj);
    }

    public /* synthetic */ ConnectionWithLock(SQLiteConnection sQLiteConnection, n40.a aVar, int i11, v vVar) {
        this(sQLiteConnection, (i11 & 2) != 0 ? g.b(false, 1, null) : aVar);
    }
}
