package com.baicizhan.main.word_book.data.db;

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
import jj.b0;
import jj.j;
import jj.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public final class WordBookDatabase_Impl extends WordBookDatabase {

    /* renamed from: c, reason: collision with root package name */
    public volatile jj.a f26172c;

    /* renamed from: d, reason: collision with root package name */
    public volatile k f26173d;

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "word_books", "word_favorites");
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "word_books", "word_favorites");
    }

    @Override // com.baicizhan.main.word_book.data.db.WordBookDatabase
    public jj.a g() {
        jj.a aVar;
        if (this.f26172c != null) {
            return this.f26172c;
        }
        synchronized (this) {
            try {
                if (this.f26172c == null) {
                    this.f26172c = new j(this);
                }
                aVar = this.f26172c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
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
        hashMap.put(jj.a.class, j.r());
        hashMap.put(k.class, b0.J());
        return hashMap;
    }

    @Override // com.baicizhan.main.word_book.data.db.WordBookDatabase
    public k h() {
        k kVar;
        if (this.f26173d != null) {
            return this.f26173d;
        }
        synchronized (this) {
            try {
                if (this.f26173d == null) {
                    this.f26173d = new b0(this);
                }
                kVar = this.f26173d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kVar;
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public RoomOpenDelegate createOpenDelegate() {
        return new a(2, "fd1823e3255203d86a7069a34915a5aa", "95c68614e84cdc8775f652a2c4199203");
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends RoomOpenDelegate {
        public a(int version, String identityHash, String legacyIdentityHash) {
            super(version, identityHash, legacyIdentityHash);
        }

        @Override // androidx.room.RoomOpenDelegate
        public void createAllTables(@NonNull final SQLiteConnection connection) {
            SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `word_books` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `wordCount` INTEGER NOT NULL, `cover` TEXT NOT NULL, `updatedAt` INTEGER NOT NULL, `tags` TEXT NOT NULL, PRIMARY KEY(`id`))");
            SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `word_favorites` (`universeTopicId` INTEGER NOT NULL, `bookIds` TEXT NOT NULL, `createdAts` TEXT NOT NULL, `scores` TEXT NOT NULL, `word` TEXT NOT NULL, `meaning` TEXT NOT NULL, `accent` TEXT, `audioUS` TEXT, `audioUK` TEXT, PRIMARY KEY(`universeTopicId`))");
            SQLite.execSQL(connection, RoomMasterTable.CREATE_QUERY);
            SQLite.execSQL(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'fd1823e3255203d86a7069a34915a5aa')");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void dropAllTables(@NonNull final SQLiteConnection connection) {
            SQLite.execSQL(connection, "DROP TABLE IF EXISTS `word_books`");
            SQLite.execSQL(connection, "DROP TABLE IF EXISTS `word_favorites`");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onOpen(@NonNull final SQLiteConnection connection) {
            WordBookDatabase_Impl.this.internalInitInvalidationTracker(connection);
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
            hashMap.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
            hashMap.put("wordCount", new TableInfo.Column("wordCount", "INTEGER", true, 0, null, 1));
            hashMap.put("cover", new TableInfo.Column("cover", "TEXT", true, 0, null, 1));
            hashMap.put("updatedAt", new TableInfo.Column("updatedAt", "INTEGER", true, 0, null, 1));
            hashMap.put("tags", new TableInfo.Column("tags", "TEXT", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo("word_books", hashMap, new HashSet(0), new HashSet(0));
            TableInfo read = TableInfo.read(connection, "word_books");
            if (!tableInfo.equals(read)) {
                return new RoomOpenDelegate.ValidationResult(false, "word_books(com.baicizhan.main.word_book.data.db.entities.WordBookItem).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
            }
            HashMap hashMap2 = new HashMap(9);
            hashMap2.put("universeTopicId", new TableInfo.Column("universeTopicId", "INTEGER", true, 1, null, 1));
            hashMap2.put("bookIds", new TableInfo.Column("bookIds", "TEXT", true, 0, null, 1));
            hashMap2.put("createdAts", new TableInfo.Column("createdAts", "TEXT", true, 0, null, 1));
            hashMap2.put("scores", new TableInfo.Column("scores", "TEXT", true, 0, null, 1));
            hashMap2.put("word", new TableInfo.Column("word", "TEXT", true, 0, null, 1));
            hashMap2.put("meaning", new TableInfo.Column("meaning", "TEXT", true, 0, null, 1));
            hashMap2.put("accent", new TableInfo.Column("accent", "TEXT", false, 0, null, 1));
            hashMap2.put("audioUS", new TableInfo.Column("audioUS", "TEXT", false, 0, null, 1));
            hashMap2.put("audioUK", new TableInfo.Column("audioUK", "TEXT", false, 0, null, 1));
            TableInfo tableInfo2 = new TableInfo("word_favorites", hashMap2, new HashSet(0), new HashSet(0));
            TableInfo read2 = TableInfo.read(connection, "word_favorites");
            if (tableInfo2.equals(read2)) {
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
            return new RoomOpenDelegate.ValidationResult(false, "word_favorites(com.baicizhan.main.word_book.data.db.entities.WordFavoriteItem).\n Expected:\n" + tableInfo2 + "\n Found:\n" + read2);
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onCreate(@NonNull final SQLiteConnection connection) {
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onPostMigrate(@NonNull final SQLiteConnection connection) {
        }
    }
}
