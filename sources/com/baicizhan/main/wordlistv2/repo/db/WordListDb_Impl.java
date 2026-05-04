package com.baicizhan.main.wordlistv2.repo.db;

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
import com.baicizhan.client.business.dataset.provider.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import wj.b;
import wj.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public final class WordListDb_Impl extends WordListDb {

    /* renamed from: c, reason: collision with root package name */
    public volatile b f27964c;

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "t_wordlist_resource_record");
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "t_wordlist_resource_record");
    }

    @Override // com.baicizhan.main.wordlistv2.repo.db.WordListDb
    public b g() {
        b bVar;
        if (this.f27964c != null) {
            return this.f27964c;
        }
        synchronized (this) {
            try {
                if (this.f27964c == null) {
                    this.f27964c = new f(this);
                }
                bVar = this.f27964c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public List<Migration> getAutoMigrations(@NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
        return new ArrayList();
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
        hashMap.put(b.class, f.g());
        return hashMap;
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public RoomOpenDelegate createOpenDelegate() {
        return new a(1, "adb340349359e26f16aa07e32724b16d", "25a6b19ff0c30a6115923f00d6ad2ca9");
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends RoomOpenDelegate {
        public a(int version, String identityHash, String legacyIdentityHash) {
            super(version, identityHash, legacyIdentityHash);
        }

        @Override // androidx.room.RoomOpenDelegate
        public void createAllTables(@NonNull final SQLiteConnection connection) {
            SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `t_wordlist_resource_record` (`book_id` INTEGER NOT NULL, `topic_id` INTEGER NOT NULL, `word` TEXT NOT NULL, `mean_cn` TEXT NOT NULL, `audio_usa_uri` TEXT NOT NULL, PRIMARY KEY(`book_id`, `topic_id`))");
            SQLite.execSQL(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_t_wordlist_resource_record_book_id_topic_id` ON `t_wordlist_resource_record` (`book_id`, `topic_id`)");
            SQLite.execSQL(connection, RoomMasterTable.CREATE_QUERY);
            SQLite.execSQL(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'adb340349359e26f16aa07e32724b16d')");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void dropAllTables(@NonNull final SQLiteConnection connection) {
            SQLite.execSQL(connection, "DROP TABLE IF EXISTS `t_wordlist_resource_record`");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onOpen(@NonNull final SQLiteConnection connection) {
            WordListDb_Impl.this.internalInitInvalidationTracker(connection);
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onPreMigrate(@NonNull final SQLiteConnection connection) {
            DBUtil.dropFtsSyncTriggers(connection);
        }

        @Override // androidx.room.RoomOpenDelegate
        @NonNull
        public RoomOpenDelegate.ValidationResult onValidateSchema(@NonNull final SQLiteConnection connection) {
            HashMap hashMap = new HashMap(5);
            hashMap.put("book_id", new TableInfo.Column("book_id", "INTEGER", true, 1, null, 1));
            hashMap.put("topic_id", new TableInfo.Column("topic_id", "INTEGER", true, 2, null, 1));
            hashMap.put("word", new TableInfo.Column("word", "TEXT", true, 0, null, 1));
            hashMap.put(a.e.C0246a.f16184d, new TableInfo.Column(a.e.C0246a.f16184d, "TEXT", true, 0, null, 1));
            hashMap.put("audio_usa_uri", new TableInfo.Column("audio_usa_uri", "TEXT", true, 0, null, 1));
            HashSet hashSet = new HashSet(0);
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new TableInfo.Index("index_t_wordlist_resource_record_book_id_topic_id", true, Arrays.asList("book_id", "topic_id"), Arrays.asList("ASC", "ASC")));
            TableInfo tableInfo = new TableInfo("t_wordlist_resource_record", hashMap, hashSet, hashSet2);
            TableInfo read = TableInfo.read(connection, "t_wordlist_resource_record");
            if (tableInfo.equals(read)) {
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
            return new RoomOpenDelegate.ValidationResult(false, "t_wordlist_resource_record(com.baicizhan.main.wordlistv2.repo.db.WordListResourceRecord).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onCreate(@NonNull final SQLiteConnection connection) {
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onPostMigrate(@NonNull final SQLiteConnection connection) {
        }
    }
}
