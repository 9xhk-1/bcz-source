package androidx.room.migration;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
final class MigrationImpl extends Migration {

    @k
    private final l<SupportSQLiteDatabase, g2> migrateCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MigrationImpl(int i11, int i12, @k l<? super SupportSQLiteDatabase, g2> migrateCallback) {
        super(i11, i12);
        g0.p(migrateCallback, "migrateCallback");
        this.migrateCallback = migrateCallback;
    }

    @k
    public final l<SupportSQLiteDatabase, g2> getMigrateCallback() {
        return this.migrateCallback;
    }

    @Override // androidx.room.migration.Migration
    public void migrate(@k SupportSQLiteDatabase db2) {
        g0.p(db2, "db");
        this.migrateCallback.invoke(db2);
    }
}
