package jj;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public final class j implements jj.a {

    /* renamed from: a, reason: collision with root package name */
    public final RoomDatabase f64242a;

    /* renamed from: c, reason: collision with root package name */
    public final lj.a f64244c = new lj.a();

    /* renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<kj.a> f64243b = new a();

    /* renamed from: d, reason: collision with root package name */
    public final EntityDeleteOrUpdateAdapter<kj.a> f64245d = new b();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends EntityInsertAdapter<kj.a> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final kj.a entity) {
            statement.mo5622bindLong(1, entity.j());
            if (entity.k() == null) {
                statement.mo5623bindNull(2);
            } else {
                statement.mo5624bindText(2, entity.k());
            }
            statement.mo5622bindLong(3, entity.n());
            if (entity.i() == null) {
                statement.mo5623bindNull(4);
            } else {
                statement.mo5624bindText(4, entity.i());
            }
            statement.mo5622bindLong(5, entity.m());
            String a11 = j.this.f64244c.a(entity.l());
            if (a11 == null) {
                statement.mo5623bindNull(6);
            } else {
                statement.mo5624bindText(6, a11);
            }
        }

        @Override // androidx.room.EntityInsertAdapter
        @NonNull
        public String createQuery() {
            return "INSERT OR REPLACE INTO `word_books` (`id`,`name`,`wordCount`,`cover`,`updatedAt`,`tags`) VALUES (?,?,?,?,?,?)";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends EntityDeleteOrUpdateAdapter<kj.a> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final kj.a entity) {
            statement.mo5622bindLong(1, entity.j());
            if (entity.k() == null) {
                statement.mo5623bindNull(2);
            } else {
                statement.mo5624bindText(2, entity.k());
            }
            statement.mo5622bindLong(3, entity.n());
            if (entity.i() == null) {
                statement.mo5623bindNull(4);
            } else {
                statement.mo5624bindText(4, entity.i());
            }
            statement.mo5622bindLong(5, entity.m());
            String a11 = j.this.f64244c.a(entity.l());
            if (a11 == null) {
                statement.mo5623bindNull(6);
            } else {
                statement.mo5624bindText(6, a11);
            }
            statement.mo5622bindLong(7, entity.j());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        @NonNull
        public String createQuery() {
            return "UPDATE OR ABORT `word_books` SET `id` = ?,`name` = ?,`wordCount` = ?,`cover` = ?,`updatedAt` = ?,`tags` = ? WHERE `id` = ?";
        }
    }

    public j(@NonNull final RoomDatabase __db) {
        this.f64242a = __db;
    }

    public static /* synthetic */ g2 n(long j11, int i11, long j12, SQLiteConnection sQLiteConnection) {
        SQLiteStatement prepare = sQLiteConnection.prepare("UPDATE word_books SET wordCount = (SELECT wordCount FROM word_books WHERE id = ?) + ?, updatedAt = CASE WHEN ? = 0 THEN updatedAt ELSE ? END WHERE id = ?");
        try {
            prepare.mo5622bindLong(1, j11);
            prepare.mo5622bindLong(2, i11);
            prepare.mo5622bindLong(3, j12);
            prepare.mo5622bindLong(4, j12);
            prepare.mo5622bindLong(5, j11);
            prepare.step();
            return g2.f100423a;
        } finally {
            prepare.close();
        }
    }

    public static /* synthetic */ g2 p(long j11, SQLiteConnection sQLiteConnection) {
        SQLiteStatement prepare = sQLiteConnection.prepare("DELETE FROM word_books WHERE id = ?");
        try {
            prepare.mo5622bindLong(1, j11);
            prepare.step();
            return g2.f100423a;
        } finally {
            prepare.close();
        }
    }

    @NonNull
    public static List<Class<?>> r() {
        return Collections.EMPTY_LIST;
    }

    @Override // jj.a
    public Object b(final j00.c<? super List<kj.a>> $completion) {
        return DBUtil.performSuspending(this.f64242a, true, false, new x00.l() { // from class: jj.g
            @Override // x00.l
            public final Object invoke(Object obj) {
                List u11;
                u11 = j.this.u((SQLiteConnection) obj);
                return u11;
            }
        }, $completion);
    }

    @Override // jj.a
    public kotlinx.coroutines.flow.i<List<kj.a>> c() {
        return FlowUtil.createFlow(this.f64242a, false, new String[]{"word_books"}, new x00.l() { // from class: jj.e
            @Override // x00.l
            public final Object invoke(Object obj) {
                List w11;
                w11 = j.this.w((SQLiteConnection) obj);
                return w11;
            }
        });
    }

    @Override // jj.a
    public Object d(final long bookId, final j00.c<? super kj.a> $completion) {
        return DBUtil.performSuspending(this.f64242a, true, false, new x00.l() { // from class: jj.h
            @Override // x00.l
            public final Object invoke(Object obj) {
                kj.a t11;
                t11 = j.this.t(bookId, (SQLiteConnection) obj);
                return t11;
            }
        }, $completion);
    }

    @Override // jj.a
    public kotlinx.coroutines.flow.i<kj.a> e(final long bookId) {
        return FlowUtil.createFlow(this.f64242a, false, new String[]{"word_books"}, new x00.l() { // from class: jj.d
            @Override // x00.l
            public final Object invoke(Object obj) {
                kj.a v11;
                v11 = j.this.v(bookId, (SQLiteConnection) obj);
                return v11;
            }
        });
    }

    @Override // jj.a
    public Object f(final kj.a book, final j00.c<? super g2> $completion) {
        book.getClass();
        return DBUtil.performSuspending(this.f64242a, false, true, new x00.l() { // from class: jj.f
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 s11;
                s11 = j.this.s(book, (SQLiteConnection) obj);
                return s11;
            }
        }, $completion);
    }

    @Override // jj.a
    public Object g(final kj.a book, final j00.c<? super g2> $completion) {
        book.getClass();
        return DBUtil.performSuspending(this.f64242a, false, true, new x00.l() { // from class: jj.b
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 x11;
                x11 = j.this.x(book, (SQLiteConnection) obj);
                return x11;
            }
        }, $completion);
    }

    @Override // jj.a
    public Object h(final long bookId, final j00.c<? super g2> $completion) {
        return DBUtil.performSuspending(this.f64242a, false, true, new x00.l() { // from class: jj.c
            @Override // x00.l
            public final Object invoke(Object obj) {
                return j.p(bookId, (SQLiteConnection) obj);
            }
        }, $completion);
    }

    @Override // jj.a
    public Object i(final long bookId, final int changedCount, final long updatedAt, final j00.c<? super g2> $completion) {
        return DBUtil.performSuspending(this.f64242a, false, true, new x00.l() { // from class: jj.i
            @Override // x00.l
            public final Object invoke(Object obj) {
                return j.n(bookId, changedCount, updatedAt, (SQLiteConnection) obj);
            }
        }, $completion);
    }

    public final /* synthetic */ g2 s(kj.a aVar, SQLiteConnection sQLiteConnection) {
        this.f64243b.insert(sQLiteConnection, (SQLiteConnection) aVar);
        return g2.f100423a;
    }

    public final /* synthetic */ kj.a t(long j11, SQLiteConnection sQLiteConnection) {
        SQLiteStatement prepare = sQLiteConnection.prepare("SELECT * FROM word_books WHERE id = ?");
        try {
            prepare.mo5622bindLong(1, j11);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "name");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "wordCount");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "cover");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "updatedAt");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "tags");
            kj.a aVar = null;
            if (prepare.step()) {
                try {
                    aVar = new kj.a(prepare.getLong(columnIndexOrThrow), prepare.isNull(columnIndexOrThrow2) ? null : prepare.getText(columnIndexOrThrow2), (int) prepare.getLong(columnIndexOrThrow3), prepare.isNull(columnIndexOrThrow4) ? null : prepare.getText(columnIndexOrThrow4), prepare.getLong(columnIndexOrThrow5), this.f64244c.b(prepare.isNull(columnIndexOrThrow6) ? null : prepare.getText(columnIndexOrThrow6)));
                } catch (Throwable th2) {
                    th = th2;
                    prepare.close();
                    throw th;
                }
            }
            prepare.close();
            return aVar;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final /* synthetic */ List u(SQLiteConnection sQLiteConnection) {
        SQLiteStatement prepare = sQLiteConnection.prepare("SELECT * FROM word_books");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "name");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "wordCount");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "cover");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "updatedAt");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "tags");
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                int i11 = columnIndexOrThrow;
                try {
                    arrayList.add(new kj.a(prepare.getLong(columnIndexOrThrow), prepare.isNull(columnIndexOrThrow2) ? null : prepare.getText(columnIndexOrThrow2), (int) prepare.getLong(columnIndexOrThrow3), prepare.isNull(columnIndexOrThrow4) ? null : prepare.getText(columnIndexOrThrow4), prepare.getLong(columnIndexOrThrow5), this.f64244c.b(prepare.isNull(columnIndexOrThrow6) ? null : prepare.getText(columnIndexOrThrow6))));
                    columnIndexOrThrow = i11;
                } catch (Throwable th2) {
                    th = th2;
                    prepare.close();
                    throw th;
                }
            }
            prepare.close();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final /* synthetic */ kj.a v(long j11, SQLiteConnection sQLiteConnection) {
        SQLiteStatement prepare = sQLiteConnection.prepare("SELECT * FROM word_books WHERE id = ?");
        try {
            prepare.mo5622bindLong(1, j11);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "name");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "wordCount");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "cover");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "updatedAt");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "tags");
            kj.a aVar = null;
            if (prepare.step()) {
                try {
                    aVar = new kj.a(prepare.getLong(columnIndexOrThrow), prepare.isNull(columnIndexOrThrow2) ? null : prepare.getText(columnIndexOrThrow2), (int) prepare.getLong(columnIndexOrThrow3), prepare.isNull(columnIndexOrThrow4) ? null : prepare.getText(columnIndexOrThrow4), prepare.getLong(columnIndexOrThrow5), this.f64244c.b(prepare.isNull(columnIndexOrThrow6) ? null : prepare.getText(columnIndexOrThrow6)));
                } catch (Throwable th2) {
                    th = th2;
                    prepare.close();
                    throw th;
                }
            }
            prepare.close();
            return aVar;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final /* synthetic */ List w(SQLiteConnection sQLiteConnection) {
        SQLiteStatement prepare = sQLiteConnection.prepare("SELECT * FROM word_books");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "name");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "wordCount");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "cover");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "updatedAt");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "tags");
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                int i11 = columnIndexOrThrow;
                try {
                    arrayList.add(new kj.a(prepare.getLong(columnIndexOrThrow), prepare.isNull(columnIndexOrThrow2) ? null : prepare.getText(columnIndexOrThrow2), (int) prepare.getLong(columnIndexOrThrow3), prepare.isNull(columnIndexOrThrow4) ? null : prepare.getText(columnIndexOrThrow4), prepare.getLong(columnIndexOrThrow5), this.f64244c.b(prepare.isNull(columnIndexOrThrow6) ? null : prepare.getText(columnIndexOrThrow6))));
                    columnIndexOrThrow = i11;
                } catch (Throwable th2) {
                    th = th2;
                    prepare.close();
                    throw th;
                }
            }
            prepare.close();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final /* synthetic */ g2 x(kj.a aVar, SQLiteConnection sQLiteConnection) {
        this.f64245d.handle(sQLiteConnection, aVar);
        return g2.f100423a;
    }
}
