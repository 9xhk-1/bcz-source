package androidx.room.driver;

import androidx.room.Transactor;
import androidx.room.coroutines.ConnectionPool;
import j00.c;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class SupportSQLiteConnectionPool implements ConnectionPool {

    @k
    private final SupportSQLiteDriver supportDriver;

    public SupportSQLiteConnectionPool(@k SupportSQLiteDriver supportDriver) {
        g0.p(supportDriver, "supportDriver");
        this.supportDriver = supportDriver;
    }

    private final SupportSQLitePooledConnection getSupportConnection() {
        String databaseName = this.supportDriver.getOpenHelper().getDatabaseName();
        if (databaseName == null) {
            databaseName = ":memory:";
        }
        return new SupportSQLitePooledConnection(this.supportDriver.open(databaseName));
    }

    @Override // androidx.room.coroutines.ConnectionPool, java.lang.AutoCloseable
    public void close() {
        this.supportDriver.getOpenHelper().close();
    }

    @k
    public final SupportSQLiteDriver getSupportDriver$room_runtime_release() {
        return this.supportDriver;
    }

    @Override // androidx.room.coroutines.ConnectionPool
    @l
    public <R> Object useConnection(boolean z11, @k p<? super Transactor, ? super c<? super R>, ? extends Object> pVar, @k c<? super R> cVar) {
        return pVar.invoke(getSupportConnection(), cVar);
    }
}
