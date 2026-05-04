package com.baicizhan.client.business.webview.hwpay.db;

import androidx.annotation.NonNull;
import androidx.room.InvalidationTracker;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.baicizhan.client.business.webview.hwpay.db.dao.HwPayOrderDao;
import com.baicizhan.client.business.webview.hwpay.db.dao.HwPayOrderDao_Impl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class HwPayDatabase_Impl extends HwPayDatabase {
    private volatile HwPayOrderDao _hwPayOrderDao;

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "hw_pay_order");
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "hw_pay_order");
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public List<Migration> getAutoMigrations(@NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
        return new ArrayList();
    }

    @Override // com.baicizhan.client.business.webview.hwpay.db.HwPayDatabase
    public HwPayOrderDao getHwPayOrderDao() {
        HwPayOrderDao hwPayOrderDao;
        if (this._hwPayOrderDao != null) {
            return this._hwPayOrderDao;
        }
        synchronized (this) {
            try {
                if (this._hwPayOrderDao == null) {
                    this._hwPayOrderDao = new HwPayOrderDao_Impl(this);
                }
                hwPayOrderDao = this._hwPayOrderDao;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hwPayOrderDao;
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(HwPayOrderDao.class, HwPayOrderDao_Impl.getRequiredConverters());
        return hashMap;
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public RoomOpenDelegate createOpenDelegate() {
        return new RoomOpenDelegate(3, "dc6bf5e41def054f8d1effd0f581de12", "93519a2235cd693f6837221a6e6c8fc8") { // from class: com.baicizhan.client.business.webview.hwpay.db.HwPayDatabase_Impl.1
            @Override // androidx.room.RoomOpenDelegate
            public void createAllTables(@NonNull final SQLiteConnection connection) {
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `hw_pay_order` (`product_id` TEXT NOT NULL, `product_type` INTEGER NOT NULL, `count` INTEGER NOT NULL, `sub_item_id` INTEGER NOT NULL, `extra` TEXT NOT NULL, PRIMARY KEY(`product_id`))");
                SQLite.execSQL(connection, RoomMasterTable.CREATE_QUERY);
                SQLite.execSQL(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'dc6bf5e41def054f8d1effd0f581de12')");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void dropAllTables(@NonNull final SQLiteConnection connection) {
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `hw_pay_order`");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onOpen(@NonNull final SQLiteConnection connection) {
                HwPayDatabase_Impl.this.internalInitInvalidationTracker(connection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPreMigrate(@NonNull final SQLiteConnection connection) {
                DBUtil.dropFtsSyncTriggers(connection);
            }

            @Override // androidx.room.RoomOpenDelegate
            @NonNull
            public RoomOpenDelegate.ValidationResult onValidateSchema(@NonNull final SQLiteConnection connection) {
                HashMap hashMap = new HashMap(5);
                hashMap.put("product_id", new TableInfo.Column("product_id", "TEXT", true, 1, null, 1));
                hashMap.put("product_type", new TableInfo.Column("product_type", "INTEGER", true, 0, null, 1));
                hashMap.put("count", new TableInfo.Column("count", "INTEGER", true, 0, null, 1));
                hashMap.put("sub_item_id", new TableInfo.Column("sub_item_id", "INTEGER", true, 0, null, 1));
                hashMap.put("extra", new TableInfo.Column("extra", "TEXT", true, 0, null, 1));
                TableInfo tableInfo = new TableInfo("hw_pay_order", hashMap, new HashSet(0), new HashSet(0));
                TableInfo read = TableInfo.read(connection, "hw_pay_order");
                if (tableInfo.equals(read)) {
                    return new RoomOpenDelegate.ValidationResult(true, null);
                }
                return new RoomOpenDelegate.ValidationResult(false, "hw_pay_order(com.baicizhan.client.business.webview.hwpay.db.entity.HwPayOrderInfo).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onCreate(@NonNull final SQLiteConnection connection) {
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPostMigrate(@NonNull final SQLiteConnection connection) {
            }
        };
    }
}
