package com.baicizhan.client.business.webview.hwpay.db;

import android.database.Cursor;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Room;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.baicizhan.client.business.util.KotlinExtKt;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import r00.b;
import yz.c0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class HwPayDBDelegate implements c0<HwPayDatabase> {
    public static final int $stable = 8;

    @k
    private final HwPayDBDelegate$MIGRATION_1_3$1 MIGRATION_1_3 = new Migration() { // from class: com.baicizhan.client.business.webview.hwpay.db.HwPayDBDelegate$MIGRATION_1_3$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            boolean z11;
            g0.p(database, "database");
            Cursor query = database.query("PRAGMA table_info(hw_pay_order)");
            try {
                Cursor cursor = query;
                int columnIndex = cursor.getColumnIndex("name");
                while (true) {
                    if (!cursor.moveToNext()) {
                        z11 = false;
                        break;
                    } else if (g0.g(cursor.getString(columnIndex), "extra")) {
                        z11 = true;
                        break;
                    }
                }
                g2 g2Var = g2.f100423a;
                b.a(query, null);
                if (z11) {
                    return;
                }
                database.execSQL("ALTER TABLE hw_pay_order ADD COLUMN extra TEXT NOT NULL DEFAULT 'null'");
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    b.a(query, th2);
                    throw th3;
                }
            }
        }
    };

    @k
    private final HwPayDBDelegate$MIGRATION_2_3$1 MIGRATION_2_3 = new Migration() { // from class: com.baicizhan.client.business.webview.hwpay.db.HwPayDBDelegate$MIGRATION_2_3$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            g0.p(database, "database");
        }
    };

    @l
    private HwPayDatabase _db;

    @Override // yz.c0
    public boolean isInitialized() {
        return this._db != null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // yz.c0
    @k
    public HwPayDatabase getValue() {
        HwPayDatabase hwPayDatabase = this._db;
        if (hwPayDatabase != null) {
            return hwPayDatabase;
        }
        HwPayDatabase hwPayDatabase2 = (HwPayDatabase) Room.databaseBuilder(KotlinExtKt.getGlobalApplicationContext(), HwPayDatabase.class, HwPayDatabaseKt.DB_HW_PAY).addMigrations(this.MIGRATION_1_3, this.MIGRATION_2_3).build();
        this._db = hwPayDatabase2;
        return hwPayDatabase2;
    }
}
