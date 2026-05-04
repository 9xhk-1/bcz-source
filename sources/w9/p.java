package w9;

import androidx.annotation.NonNull;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.baicizhan.client.business.managers.experience.data.db.StudyBehaviour;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class p implements k {

    /* renamed from: a, reason: collision with root package name */
    public final RoomDatabase f96015a;

    /* renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<StudyBehaviour> f96016b = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends EntityInsertAdapter<StudyBehaviour> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final StudyBehaviour entity) {
            statement.mo5622bindLong(1, entity.getId());
            statement.mo5622bindLong(2, entity.getBookId());
            statement.mo5622bindLong(3, entity.getTopicId());
            if (entity.getQuestionType() == null) {
                statement.mo5623bindNull(4);
            } else {
                statement.mo5624bindText(4, entity.getQuestionType());
            }
            statement.mo5622bindLong(5, entity.getStudyDate());
            statement.mo5622bindLong(6, entity.getCreateAt());
        }

        @Override // androidx.room.EntityInsertAdapter
        @NonNull
        public String createQuery() {
            return "INSERT OR REPLACE INTO `t_study_behaviour` (`id`,`book_id`,`topic_id`,`question_type`,`study_date`,`create_at`) VALUES (nullif(?, 0),?,?,?,?,?)";
        }
    }

    public p(@NonNull final RoomDatabase __db) {
        this.f96015a = __db;
    }

    public static /* synthetic */ Integer f(int i11, int i12, String str, int i13, SQLiteConnection sQLiteConnection) {
        SQLiteStatement prepare = sQLiteConnection.prepare("select count(1) from t_study_behaviour where book_id = ? and topic_id = ? and question_type =? and study_date = ?");
        try {
            prepare.mo5622bindLong(1, i11);
            prepare.mo5622bindLong(2, i12);
            if (str == null) {
                prepare.mo5623bindNull(3);
            } else {
                prepare.mo5624bindText(3, str);
            }
            prepare.mo5622bindLong(4, i13);
            Integer valueOf = Integer.valueOf(prepare.step() ? (int) prepare.getLong(0) : 0);
            prepare.close();
            return valueOf;
        } catch (Throwable th2) {
            prepare.close();
            throw th2;
        }
    }

    public static /* synthetic */ Integer g(SQLiteConnection sQLiteConnection) {
        SQLiteStatement prepare = sQLiteConnection.prepare("delete from t_study_behaviour");
        try {
            prepare.step();
            return Integer.valueOf(SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection));
        } finally {
            prepare.close();
        }
    }

    public static /* synthetic */ Integer h(int i11, SQLiteConnection sQLiteConnection) {
        SQLiteStatement prepare = sQLiteConnection.prepare("delete  from t_study_behaviour where study_date != ?");
        try {
            prepare.mo5622bindLong(1, i11);
            prepare.step();
            return Integer.valueOf(SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection));
        } finally {
            prepare.close();
        }
    }

    @NonNull
    public static List<Class<?>> i() {
        return Collections.EMPTY_LIST;
    }

    @Override // w9.k
    public int a() {
        return ((Integer) DBUtil.performBlocking(this.f96015a, false, true, new x00.l() { // from class: w9.m
            @Override // x00.l
            public final Object invoke(Object obj) {
                return p.g((SQLiteConnection) obj);
            }
        })).intValue();
    }

    @Override // w9.k
    public int b(final int bookId, final int topicId, final String questionType, final int today) {
        return ((Integer) DBUtil.performBlocking(this.f96015a, true, false, new x00.l() { // from class: w9.l
            @Override // x00.l
            public final Object invoke(Object obj) {
                return p.f(bookId, topicId, questionType, today, (SQLiteConnection) obj);
            }
        })).intValue();
    }

    @Override // w9.k
    public int c(final int today) {
        return ((Integer) DBUtil.performBlocking(this.f96015a, false, true, new x00.l() { // from class: w9.n
            @Override // x00.l
            public final Object invoke(Object obj) {
                return p.h(today, (SQLiteConnection) obj);
            }
        })).intValue();
    }

    @Override // w9.k
    public long d(final StudyBehaviour study) {
        study.getClass();
        return ((Long) DBUtil.performBlocking(this.f96015a, false, true, new x00.l() { // from class: w9.o
            @Override // x00.l
            public final Object invoke(Object obj) {
                Long j11;
                j11 = p.this.j(study, (SQLiteConnection) obj);
                return j11;
            }
        })).longValue();
    }

    public final /* synthetic */ Long j(StudyBehaviour studyBehaviour, SQLiteConnection sQLiteConnection) {
        return Long.valueOf(this.f96016b.insertAndReturnId(sQLiteConnection, studyBehaviour));
    }
}
