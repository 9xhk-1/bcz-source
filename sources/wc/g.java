package wc;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.baicizhan.client.business.managers.experience.data.db.TaskRecord;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class g implements wc.a {

    /* renamed from: a, reason: collision with root package name */
    public final RoomDatabase f96167a;

    /* renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<TaskRecord> f96168b = new a();

    /* renamed from: c, reason: collision with root package name */
    public final EntityDeleteOrUpdateAdapter<TaskRecord> f96169c = new b();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends EntityInsertAdapter<TaskRecord> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final TaskRecord entity) {
            statement.mo5622bindLong(1, entity.getId());
            if (entity.getAction() == null) {
                statement.mo5623bindNull(2);
            } else {
                statement.mo5624bindText(2, entity.getAction());
            }
            statement.mo5622bindLong(3, entity.getCreateAt());
        }

        @Override // androidx.room.EntityInsertAdapter
        @NonNull
        public String createQuery() {
            return "INSERT OR IGNORE INTO `t_task_record` (`id`,`task_action`,`create_at`) VALUES (nullif(?, 0),?,?)";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends EntityDeleteOrUpdateAdapter<TaskRecord> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final TaskRecord entity) {
            statement.mo5622bindLong(1, entity.getId());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        @NonNull
        public String createQuery() {
            return "DELETE FROM `t_task_record` WHERE `id` = ?";
        }
    }

    public g(@NonNull final RoomDatabase __db) {
        this.f96167a = __db;
    }

    public static /* synthetic */ Integer i(SQLiteConnection sQLiteConnection) {
        SQLiteStatement prepare = sQLiteConnection.prepare("delete from t_task_record");
        try {
            prepare.step();
            return Integer.valueOf(SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection));
        } finally {
            prepare.close();
        }
    }

    public static /* synthetic */ List j(SQLiteConnection sQLiteConnection) {
        SQLiteStatement prepare = sQLiteConnection.prepare("select * from t_task_record");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "task_action");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "create_at");
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                arrayList.add(new TaskRecord(prepare.getLong(columnIndexOrThrow), prepare.isNull(columnIndexOrThrow2) ? null : prepare.getText(columnIndexOrThrow2), prepare.getLong(columnIndexOrThrow3)));
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    @NonNull
    public static List<Class<?>> k() {
        return Collections.EMPTY_LIST;
    }

    @Override // wc.a
    public int a() {
        return ((Integer) DBUtil.performBlocking(this.f96167a, false, true, new l() { // from class: wc.d
            @Override // x00.l
            public final Object invoke(Object obj) {
                return g.i((SQLiteConnection) obj);
            }
        })).intValue();
    }

    @Override // wc.a
    public List<TaskRecord> b() {
        return (List) DBUtil.performBlocking(this.f96167a, true, false, new l() { // from class: wc.c
            @Override // x00.l
            public final Object invoke(Object obj) {
                return g.j((SQLiteConnection) obj);
            }
        });
    }

    @Override // wc.a
    public long c(final TaskRecord task) {
        task.getClass();
        return ((Long) DBUtil.performBlocking(this.f96167a, false, true, new l() { // from class: wc.f
            @Override // x00.l
            public final Object invoke(Object obj) {
                Long n11;
                n11 = g.this.n(task, (SQLiteConnection) obj);
                return n11;
            }
        })).longValue();
    }

    @Override // wc.a
    public int d(final List<TaskRecord> records) {
        records.getClass();
        return ((Integer) DBUtil.performBlocking(this.f96167a, false, true, new l() { // from class: wc.b
            @Override // x00.l
            public final Object invoke(Object obj) {
                Integer l11;
                l11 = g.this.l(records, (SQLiteConnection) obj);
                return l11;
            }
        })).intValue();
    }

    @Override // wc.a
    public void e(final List<TaskRecord> tasks) {
        tasks.getClass();
        DBUtil.performBlocking(this.f96167a, false, true, new l() { // from class: wc.e
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object m11;
                m11 = g.this.m(tasks, (SQLiteConnection) obj);
                return m11;
            }
        });
    }

    public final /* synthetic */ Integer l(List list, SQLiteConnection sQLiteConnection) {
        return Integer.valueOf(this.f96169c.handleMultiple(sQLiteConnection, list));
    }

    public final /* synthetic */ Object m(List list, SQLiteConnection sQLiteConnection) {
        this.f96168b.insert(sQLiteConnection, list);
        return null;
    }

    public final /* synthetic */ Long n(TaskRecord taskRecord, SQLiteConnection sQLiteConnection) {
        return Long.valueOf(this.f96168b.insertAndReturnId(sQLiteConnection, taskRecord));
    }
}
