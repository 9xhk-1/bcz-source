package androidx.sqlite.driver;

import android.database.sqlite.SQLiteDatabase;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteDriver;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class AndroidSQLiteDriver implements SQLiteDriver {
    @Override // androidx.sqlite.SQLiteDriver
    @k
    public SQLiteConnection open(@k String fileName) {
        g0.p(fileName, "fileName");
        SQLiteDatabase openOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(fileName, (SQLiteDatabase.CursorFactory) null);
        g0.m(openOrCreateDatabase);
        return new AndroidSQLiteConnection(openOrCreateDatabase);
    }
}
