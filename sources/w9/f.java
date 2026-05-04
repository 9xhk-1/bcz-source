package w9;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.baicizhan.client.business.managers.experience.data.db.AssembleBehaviourRecord;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class f implements w9.a {

    /* renamed from: a, reason: collision with root package name */
    public final RoomDatabase f95998a;

    /* renamed from: c, reason: collision with root package name */
    public final g f96000c = new g();

    /* renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<AssembleBehaviourRecord> f95999b = new a();

    /* renamed from: d, reason: collision with root package name */
    public final EntityDeleteOrUpdateAdapter<AssembleBehaviourRecord> f96001d = new b();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends EntityInsertAdapter<AssembleBehaviourRecord> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final AssembleBehaviourRecord entity) {
            statement.mo5622bindLong(1, entity.getId());
            if (entity.getQuestionType() == null) {
                statement.mo5623bindNull(2);
            } else {
                statement.mo5624bindText(2, entity.getQuestionType());
            }
            statement.mo5622bindLong(3, f.this.f96000c.b(entity.getBehaviour()));
            statement.mo5622bindLong(4, entity.getCreateAt());
        }

        @Override // androidx.room.EntityInsertAdapter
        @NonNull
        public String createQuery() {
            return "INSERT OR REPLACE INTO `t_assemble_behaviour_record` (`id`,`question_type`,`behaviour`,`create_at`) VALUES (nullif(?, 0),?,?,?)";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends EntityDeleteOrUpdateAdapter<AssembleBehaviourRecord> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final AssembleBehaviourRecord entity) {
            statement.mo5622bindLong(1, entity.getId());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        @NonNull
        public String createQuery() {
            return "DELETE FROM `t_assemble_behaviour_record` WHERE `id` = ?";
        }
    }

    public f(@NonNull final RoomDatabase __db) {
        this.f95998a = __db;
    }

    public static /* synthetic */ Integer e(SQLiteConnection sQLiteConnection) {
        SQLiteStatement prepare = sQLiteConnection.prepare("delete from t_assemble_behaviour_record");
        try {
            prepare.step();
            return Integer.valueOf(SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection));
        } finally {
            prepare.close();
        }
    }

    @NonNull
    public static List<Class<?>> j() {
        return Collections.EMPTY_LIST;
    }

    @Override // w9.a
    public int a() {
        return ((Integer) DBUtil.performBlocking(this.f95998a, false, true, new x00.l() { // from class: w9.b
            @Override // x00.l
            public final Object invoke(Object obj) {
                return f.e((SQLiteConnection) obj);
            }
        })).intValue();
    }

    @Override // w9.a
    public long b(final AssembleBehaviourRecord record) {
        record.getClass();
        return ((Long) DBUtil.performBlocking(this.f95998a, false, true, new x00.l() { // from class: w9.e
            @Override // x00.l
            public final Object invoke(Object obj) {
                Long l11;
                l11 = f.this.l(record, (SQLiteConnection) obj);
                return l11;
            }
        })).longValue();
    }

    @Override // w9.a
    public int c(final List<AssembleBehaviourRecord> records) {
        records.getClass();
        return ((Integer) DBUtil.performBlocking(this.f95998a, false, true, new x00.l() { // from class: w9.c
            @Override // x00.l
            public final Object invoke(Object obj) {
                Integer k11;
                k11 = f.this.k(records, (SQLiteConnection) obj);
                return k11;
            }
        })).intValue();
    }

    @Override // w9.a
    public List<AssembleBehaviourRecord> d() {
        return (List) DBUtil.performBlocking(this.f95998a, true, false, new x00.l() { // from class: w9.d
            @Override // x00.l
            public final Object invoke(Object obj) {
                List m11;
                m11 = f.this.m((SQLiteConnection) obj);
                return m11;
            }
        });
    }

    public final /* synthetic */ Integer k(List list, SQLiteConnection sQLiteConnection) {
        return Integer.valueOf(this.f96001d.handleMultiple(sQLiteConnection, list));
    }

    public final /* synthetic */ Long l(AssembleBehaviourRecord assembleBehaviourRecord, SQLiteConnection sQLiteConnection) {
        return Long.valueOf(this.f95999b.insertAndReturnId(sQLiteConnection, assembleBehaviourRecord));
    }

    public final /* synthetic */ List m(SQLiteConnection sQLiteConnection) {
        SQLiteStatement prepare = sQLiteConnection.prepare("select * from t_assemble_behaviour_record");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "question_type");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "behaviour");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "create_at");
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                arrayList.add(new AssembleBehaviourRecord(prepare.getLong(columnIndexOrThrow), prepare.isNull(columnIndexOrThrow2) ? null : prepare.getText(columnIndexOrThrow2), this.f96000c.a((int) prepare.getLong(columnIndexOrThrow3)), prepare.getLong(columnIndexOrThrow4)));
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }
}
