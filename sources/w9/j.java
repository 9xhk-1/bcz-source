package w9;

import androidx.annotation.NonNull;
import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class j extends Migration {
    public j() {
        super(1, 2);
    }

    @Override // androidx.room.migration.Migration
    public void migrate(@NonNull final SQLiteConnection connection) {
        SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `t_task_record` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `task_action` TEXT NOT NULL, `create_at` INTEGER NOT NULL)");
    }
}
