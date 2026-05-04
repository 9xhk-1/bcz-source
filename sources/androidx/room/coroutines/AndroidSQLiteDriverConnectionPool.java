package androidx.room.coroutines;

import androidx.room.Transactor;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteDriver;
import androidx.sqlite.driver.AndroidSQLiteConnection;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import x00.p;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class AndroidSQLiteDriverConnectionPool implements ConnectionPool {

    @k
    private final c0 androidConnection$delegate;

    @k
    private final SQLiteDriver driver;

    @k
    private final String fileName;

    public AndroidSQLiteDriverConnectionPool(@k SQLiteDriver driver, @k String fileName) {
        g0.p(driver, "driver");
        g0.p(fileName, "fileName");
        this.driver = driver;
        this.fileName = fileName;
        this.androidConnection$delegate = e0.c(new x00.a() { // from class: androidx.room.coroutines.a
            @Override // x00.a
            public final Object invoke() {
                AndroidSQLiteDriverPooledConnection androidConnection_delegate$lambda$0;
                androidConnection_delegate$lambda$0 = AndroidSQLiteDriverConnectionPool.androidConnection_delegate$lambda$0(AndroidSQLiteDriverConnectionPool.this);
                return androidConnection_delegate$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AndroidSQLiteDriverPooledConnection androidConnection_delegate$lambda$0(AndroidSQLiteDriverConnectionPool androidSQLiteDriverConnectionPool) {
        SQLiteConnection open = androidSQLiteDriverConnectionPool.driver.open(androidSQLiteDriverConnectionPool.fileName);
        g0.n(open, "null cannot be cast to non-null type androidx.sqlite.driver.AndroidSQLiteConnection");
        return new AndroidSQLiteDriverPooledConnection((AndroidSQLiteConnection) open);
    }

    private final AndroidSQLiteDriverPooledConnection getAndroidConnection() {
        return (AndroidSQLiteDriverPooledConnection) this.androidConnection$delegate.getValue();
    }

    @Override // androidx.room.coroutines.ConnectionPool, java.lang.AutoCloseable
    public void close() {
        getAndroidConnection().getDelegate().close();
    }

    @Override // androidx.room.coroutines.ConnectionPool
    @l
    public <R> Object useConnection(boolean z11, @k p<? super Transactor, ? super j00.c<? super R>, ? extends Object> pVar, @k j00.c<? super R> cVar) {
        return pVar.invoke(getAndroidConnection(), cVar);
    }
}
