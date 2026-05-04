package com.baicizhan.client.business.managers.experience.data.db;

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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import w9.f;
import w9.j;
import w9.k;
import w9.p;
import wc.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class EXPDb_Impl extends EXPDb {

    /* renamed from: c, reason: collision with root package name */
    public volatile w9.a f16445c;

    /* renamed from: d, reason: collision with root package name */
    public volatile k f16446d;

    /* renamed from: e, reason: collision with root package name */
    public volatile wc.a f16447e;

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "t_study_behaviour", "t_assemble_behaviour_record", "t_task_record");
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "t_study_behaviour", "t_assemble_behaviour_record", "t_task_record");
    }

    @Override // com.baicizhan.client.business.managers.experience.data.db.EXPDb
    public w9.a g() {
        w9.a aVar;
        if (this.f16445c != null) {
            return this.f16445c;
        }
        synchronized (this) {
            try {
                if (this.f16445c == null) {
                    this.f16445c = new f(this);
                }
                aVar = this.f16445c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public List<Migration> getAutoMigrations(@NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new j());
        return arrayList;
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
        hashMap.put(w9.a.class, f.j());
        hashMap.put(k.class, p.i());
        hashMap.put(wc.a.class, g.k());
        return hashMap;
    }

    @Override // com.baicizhan.client.business.managers.experience.data.db.EXPDb
    public k h() {
        k kVar;
        if (this.f16446d != null) {
            return this.f16446d;
        }
        synchronized (this) {
            try {
                if (this.f16446d == null) {
                    this.f16446d = new p(this);
                }
                kVar = this.f16446d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kVar;
    }

    @Override // com.baicizhan.client.business.managers.experience.data.db.EXPDb
    public wc.a i() {
        wc.a aVar;
        if (this.f16447e != null) {
            return this.f16447e;
        }
        synchronized (this) {
            try {
                if (this.f16447e == null) {
                    this.f16447e = new g(this);
                }
                aVar = this.f16447e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public RoomOpenDelegate createOpenDelegate() {
        return new a(2, "34ac85ea71ef82dbfbf6ad9f634d2786", "8e0faa725a7408b39871186aed1f2fc7");
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends RoomOpenDelegate {
        public a(int version, String identityHash, String legacyIdentityHash) {
            super(version, identityHash, legacyIdentityHash);
        }

        @Override // androidx.room.RoomOpenDelegate
        public void createAllTables(@NonNull final SQLiteConnection connection) {
            SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `t_study_behaviour` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `book_id` INTEGER NOT NULL, `topic_id` INTEGER NOT NULL, `question_type` TEXT NOT NULL, `study_date` INTEGER NOT NULL, `create_at` INTEGER NOT NULL)");
            SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `t_assemble_behaviour_record` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `question_type` TEXT NOT NULL, `behaviour` INTEGER NOT NULL, `create_at` INTEGER NOT NULL)");
            SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `t_task_record` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `task_action` TEXT NOT NULL, `create_at` INTEGER NOT NULL)");
            SQLite.execSQL(connection, RoomMasterTable.CREATE_QUERY);
            SQLite.execSQL(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '34ac85ea71ef82dbfbf6ad9f634d2786')");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void dropAllTables(@NonNull final SQLiteConnection connection) {
            SQLite.execSQL(connection, "DROP TABLE IF EXISTS `t_study_behaviour`");
            SQLite.execSQL(connection, "DROP TABLE IF EXISTS `t_assemble_behaviour_record`");
            SQLite.execSQL(connection, "DROP TABLE IF EXISTS `t_task_record`");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onOpen(@NonNull final SQLiteConnection connection) {
            EXPDb_Impl.this.internalInitInvalidationTracker(connection);
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onPreMigrate(@NonNull final SQLiteConnection connection) {
            DBUtil.dropFtsSyncTriggers(connection);
        }

        @Override // androidx.room.RoomOpenDelegate
        @NonNull
        public RoomOpenDelegate.ValidationResult onValidateSchema(@NonNull final SQLiteConnection connection) {
            HashMap hashMap = new HashMap(6);
            hashMap.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            hashMap.put("book_id", new TableInfo.Column("book_id", "INTEGER", true, 0, null, 1));
            hashMap.put("topic_id", new TableInfo.Column("topic_id", "INTEGER", true, 0, null, 1));
            hashMap.put("question_type", new TableInfo.Column("question_type", "TEXT", true, 0, null, 1));
            hashMap.put("study_date", new TableInfo.Column("study_date", "INTEGER", true, 0, null, 1));
            hashMap.put("create_at", new TableInfo.Column("create_at", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo("t_study_behaviour", hashMap, new HashSet(0), new HashSet(0));
            TableInfo read = TableInfo.read(connection, "t_study_behaviour");
            if (!tableInfo.equals(read)) {
                return new RoomOpenDelegate.ValidationResult(false, "t_study_behaviour(com.baicizhan.client.business.managers.experience.data.db.StudyBehaviour).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
            }
            HashMap hashMap2 = new HashMap(4);
            hashMap2.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            hashMap2.put("question_type", new TableInfo.Column("question_type", "TEXT", true, 0, null, 1));
            hashMap2.put("behaviour", new TableInfo.Column("behaviour", "INTEGER", true, 0, null, 1));
            hashMap2.put("create_at", new TableInfo.Column("create_at", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo2 = new TableInfo("t_assemble_behaviour_record", hashMap2, new HashSet(0), new HashSet(0));
            TableInfo read2 = TableInfo.read(connection, "t_assemble_behaviour_record");
            if (!tableInfo2.equals(read2)) {
                return new RoomOpenDelegate.ValidationResult(false, "t_assemble_behaviour_record(com.baicizhan.client.business.managers.experience.data.db.AssembleBehaviourRecord).\n Expected:\n" + tableInfo2 + "\n Found:\n" + read2);
            }
            HashMap hashMap3 = new HashMap(3);
            hashMap3.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            hashMap3.put("task_action", new TableInfo.Column("task_action", "TEXT", true, 0, null, 1));
            hashMap3.put("create_at", new TableInfo.Column("create_at", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo3 = new TableInfo("t_task_record", hashMap3, new HashSet(0), new HashSet(0));
            TableInfo read3 = TableInfo.read(connection, "t_task_record");
            if (tableInfo3.equals(read3)) {
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
            return new RoomOpenDelegate.ValidationResult(false, "t_task_record(com.baicizhan.client.business.managers.experience.data.db.TaskRecord).\n Expected:\n" + tableInfo3 + "\n Found:\n" + read3);
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onCreate(@NonNull final SQLiteConnection connection) {
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onPostMigrate(@NonNull final SQLiteConnection connection) {
        }
    }
}
