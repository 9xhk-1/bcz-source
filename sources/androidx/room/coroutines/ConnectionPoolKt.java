package androidx.room.coroutines;

import androidx.sqlite.SQLiteDriver;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class ConnectionPoolKt {
    @k
    public static final ConnectionPool newConnectionPool(@k SQLiteDriver driver, @k String fileName, int i11, int i12) {
        g0.p(driver, "driver");
        g0.p(fileName, "fileName");
        return new ConnectionPoolImpl(driver, fileName, i11, i12);
    }

    @k
    public static final ConnectionPool newSingleConnectionPool(@k SQLiteDriver driver, @k String fileName) {
        g0.p(driver, "driver");
        g0.p(fileName, "fileName");
        return new ConnectionPoolImpl(driver, fileName);
    }
}
