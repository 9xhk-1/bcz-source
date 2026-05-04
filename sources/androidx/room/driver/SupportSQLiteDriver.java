package androidx.room.driver;

import androidx.annotation.RestrictTo;
import androidx.sqlite.SQLiteDriver;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class SupportSQLiteDriver implements SQLiteDriver {

    @k
    private final SupportSQLiteOpenHelper openHelper;

    public SupportSQLiteDriver(@k SupportSQLiteOpenHelper openHelper) {
        g0.p(openHelper, "openHelper");
        this.openHelper = openHelper;
    }

    @k
    public final SupportSQLiteOpenHelper getOpenHelper() {
        return this.openHelper;
    }

    @Override // androidx.sqlite.SQLiteDriver
    @k
    public SupportSQLiteConnection open(@k String fileName) {
        g0.p(fileName, "fileName");
        return new SupportSQLiteConnection(this.openHelper.getWritableDatabase());
    }
}
