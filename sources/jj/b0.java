package jj;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public final class b0 implements k {

    /* renamed from: b, reason: collision with root package name */
    public final RoomDatabase f64220b;

    /* renamed from: d, reason: collision with root package name */
    public final lj.e f64222d = new lj.e();

    /* renamed from: e, reason: collision with root package name */
    public final lj.d f64223e = new lj.d();

    /* renamed from: f, reason: collision with root package name */
    public final lj.c f64224f = new lj.c();

    /* renamed from: c, reason: collision with root package name */
    public final EntityInsertAdapter<kj.b> f64221c = new a();

    /* renamed from: g, reason: collision with root package name */
    public final EntityDeleteOrUpdateAdapter<kj.b> f64225g = new b();

    /* renamed from: h, reason: collision with root package name */
    public final EntityDeleteOrUpdateAdapter<kj.b> f64226h = new c();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends EntityInsertAdapter<kj.b> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final kj.b entity) {
            statement.mo5622bindLong(1, entity.u());
            String a11 = b0.this.f64222d.a(entity.q());
            if (a11 == null) {
                statement.mo5623bindNull(2);
            } else {
                statement.mo5624bindText(2, a11);
            }
            String a12 = b0.this.f64223e.a(entity.r());
            if (a12 == null) {
                statement.mo5623bindNull(3);
            } else {
                statement.mo5624bindText(3, a12);
            }
            String a13 = b0.this.f64224f.a(entity.t());
            if (a13 == null) {
                statement.mo5623bindNull(4);
            } else {
                statement.mo5624bindText(4, a13);
            }
            if (entity.v() == null) {
                statement.mo5623bindNull(5);
            } else {
                statement.mo5624bindText(5, entity.v());
            }
            if (entity.s() == null) {
                statement.mo5623bindNull(6);
            } else {
                statement.mo5624bindText(6, entity.s());
            }
            if (entity.n() == null) {
                statement.mo5623bindNull(7);
            } else {
                statement.mo5624bindText(7, entity.n());
            }
            if (entity.p() == null) {
                statement.mo5623bindNull(8);
            } else {
                statement.mo5624bindText(8, entity.p());
            }
            if (entity.o() == null) {
                statement.mo5623bindNull(9);
            } else {
                statement.mo5624bindText(9, entity.o());
            }
        }

        @Override // androidx.room.EntityInsertAdapter
        @NonNull
        public String createQuery() {
            return "INSERT OR IGNORE INTO `word_favorites` (`universeTopicId`,`bookIds`,`createdAts`,`scores`,`word`,`meaning`,`accent`,`audioUS`,`audioUK`) VALUES (?,?,?,?,?,?,?,?,?)";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends EntityDeleteOrUpdateAdapter<kj.b> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final kj.b entity) {
            statement.mo5622bindLong(1, entity.u());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        @NonNull
        public String createQuery() {
            return "DELETE FROM `word_favorites` WHERE `universeTopicId` = ?";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends EntityDeleteOrUpdateAdapter<kj.b> {
        public c() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final kj.b entity) {
            statement.mo5622bindLong(1, entity.u());
            String a11 = b0.this.f64222d.a(entity.q());
            if (a11 == null) {
                statement.mo5623bindNull(2);
            } else {
                statement.mo5624bindText(2, a11);
            }
            String a12 = b0.this.f64223e.a(entity.r());
            if (a12 == null) {
                statement.mo5623bindNull(3);
            } else {
                statement.mo5624bindText(3, a12);
            }
            String a13 = b0.this.f64224f.a(entity.t());
            if (a13 == null) {
                statement.mo5623bindNull(4);
            } else {
                statement.mo5624bindText(4, a13);
            }
            if (entity.v() == null) {
                statement.mo5623bindNull(5);
            } else {
                statement.mo5624bindText(5, entity.v());
            }
            if (entity.s() == null) {
                statement.mo5623bindNull(6);
            } else {
                statement.mo5624bindText(6, entity.s());
            }
            if (entity.n() == null) {
                statement.mo5623bindNull(7);
            } else {
                statement.mo5624bindText(7, entity.n());
            }
            if (entity.p() == null) {
                statement.mo5623bindNull(8);
            } else {
                statement.mo5624bindText(8, entity.p());
            }
            if (entity.o() == null) {
                statement.mo5623bindNull(9);
            } else {
                statement.mo5624bindText(9, entity.o());
            }
            statement.mo5622bindLong(10, entity.u());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        @NonNull
        public String createQuery() {
            return "UPDATE OR ABORT `word_favorites` SET `universeTopicId` = ?,`bookIds` = ?,`createdAts` = ?,`scores` = ?,`word` = ?,`meaning` = ?,`accent` = ?,`audioUS` = ?,`audioUK` = ? WHERE `universeTopicId` = ?";
        }
    }

    public b0(@NonNull final RoomDatabase __db) {
        this.f64220b = __db;
    }

    public static /* synthetic */ g2 A(String str, long[] jArr, SQLiteConnection sQLiteConnection) {
        SQLiteStatement prepare = sQLiteConnection.prepare(str);
        try {
            int i11 = 1;
            for (long j11 : jArr) {
                prepare.mo5622bindLong(i11, j11);
                i11++;
            }
            prepare.step();
            g2 g2Var = g2.f100423a;
            prepare.close();
            return g2Var;
        } catch (Throwable th2) {
            prepare.close();
            throw th2;
        }
    }

    public static /* synthetic */ List B(SQLiteConnection sQLiteConnection) {
        SQLiteStatement prepare = sQLiteConnection.prepare("SELECT universeTopicId & 4294967295 FROM word_favorites");
        try {
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                arrayList.add(prepare.isNull(0) ? null : Integer.valueOf((int) prepare.getLong(0)));
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    @NonNull
    public static List<Class<?>> J() {
        return Collections.EMPTY_LIST;
    }

    public static /* synthetic */ List u(long j11, SQLiteConnection sQLiteConnection) {
        SQLiteStatement prepare = sQLiteConnection.prepare("SELECT universeTopicId FROM word_favorites WHERE bookIds = '['||?||']' OR bookIds LIKE '['||?||',%' OR bookIds LIKE '%,'||?||']' OR bookIds LIKE '%,'||?||',%'");
        try {
            prepare.mo5622bindLong(1, j11);
            prepare.mo5622bindLong(2, j11);
            prepare.mo5622bindLong(3, j11);
            prepare.mo5622bindLong(4, j11);
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                arrayList.add(prepare.isNull(0) ? null : Long.valueOf(prepare.getLong(0)));
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    public static /* synthetic */ Integer x(long j11, SQLiteConnection sQLiteConnection) {
        SQLiteStatement prepare = sQLiteConnection.prepare("SELECT COUNT(*) FROM word_favorites WHERE bookIds = '['||?||']' OR bookIds LIKE '['||?||',%' OR bookIds LIKE '%,'||?||']' OR bookIds LIKE '%,'||?||',%'");
        try {
            prepare.mo5622bindLong(1, j11);
            prepare.mo5622bindLong(2, j11);
            prepare.mo5622bindLong(3, j11);
            prepare.mo5622bindLong(4, j11);
            Integer num = null;
            if (prepare.step() && !prepare.isNull(0)) {
                num = Integer.valueOf((int) prepare.getLong(0));
            }
            return num;
        } finally {
            prepare.close();
        }
    }

    public static /* synthetic */ g2 z(String str, long j11, long[] jArr, SQLiteConnection sQLiteConnection) {
        SQLiteStatement prepare = sQLiteConnection.prepare(str);
        try {
            prepare.mo5622bindLong(1, j11);
            int i11 = 2;
            for (long j12 : jArr) {
                prepare.mo5622bindLong(i11, j12);
                i11++;
            }
            prepare.step();
            g2 g2Var = g2.f100423a;
            prepare.close();
            return g2Var;
        } catch (Throwable th2) {
            prepare.close();
            throw th2;
        }
    }

    public final /* synthetic */ List K(kj.b[] bVarArr, SQLiteConnection sQLiteConnection) {
        return this.f64221c.insertAndReturnIdsList(sQLiteConnection, bVarArr);
    }

    public final /* synthetic */ List L(int i11, SQLiteConnection sQLiteConnection) {
        SQLiteStatement prepare = sQLiteConnection.prepare("SELECT * FROM word_favorites WHERE universeTopicId & 4294967295 = ?");
        try {
            prepare.mo5622bindLong(1, i11);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "universeTopicId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "bookIds");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "createdAts");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "scores");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "word");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "meaning");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "accent");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "audioUS");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "audioUK");
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                arrayList.add(new kj.b(prepare.getLong(columnIndexOrThrow), this.f64222d.b(prepare.isNull(columnIndexOrThrow2) ? null : prepare.getText(columnIndexOrThrow2)), this.f64223e.b(prepare.isNull(columnIndexOrThrow3) ? null : prepare.getText(columnIndexOrThrow3)), this.f64224f.b(prepare.isNull(columnIndexOrThrow4) ? null : prepare.getText(columnIndexOrThrow4)), prepare.isNull(columnIndexOrThrow5) ? null : prepare.getText(columnIndexOrThrow5), prepare.isNull(columnIndexOrThrow6) ? null : prepare.getText(columnIndexOrThrow6), prepare.isNull(columnIndexOrThrow7) ? null : prepare.getText(columnIndexOrThrow7), prepare.isNull(columnIndexOrThrow8) ? null : prepare.getText(columnIndexOrThrow8), prepare.isNull(columnIndexOrThrow9) ? null : prepare.getText(columnIndexOrThrow9)));
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    public final /* synthetic */ kj.b M(long j11, SQLiteConnection sQLiteConnection) {
        SQLiteStatement prepare = sQLiteConnection.prepare("SELECT * FROM word_favorites WHERE universeTopicId = ?");
        try {
            prepare.mo5622bindLong(1, j11);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "universeTopicId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "bookIds");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "createdAts");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "scores");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "word");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "meaning");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "accent");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "audioUS");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "audioUK");
            kj.b bVar = null;
            if (prepare.step()) {
                bVar = new kj.b(prepare.getLong(columnIndexOrThrow), this.f64222d.b(prepare.isNull(columnIndexOrThrow2) ? null : prepare.getText(columnIndexOrThrow2)), this.f64223e.b(prepare.isNull(columnIndexOrThrow3) ? null : prepare.getText(columnIndexOrThrow3)), this.f64224f.b(prepare.isNull(columnIndexOrThrow4) ? null : prepare.getText(columnIndexOrThrow4)), prepare.isNull(columnIndexOrThrow5) ? null : prepare.getText(columnIndexOrThrow5), prepare.isNull(columnIndexOrThrow6) ? null : prepare.getText(columnIndexOrThrow6), prepare.isNull(columnIndexOrThrow7) ? null : prepare.getText(columnIndexOrThrow7), prepare.isNull(columnIndexOrThrow8) ? null : prepare.getText(columnIndexOrThrow8), prepare.isNull(columnIndexOrThrow9) ? null : prepare.getText(columnIndexOrThrow9));
            }
            return bVar;
        } finally {
            prepare.close();
        }
    }

    public final /* synthetic */ List N(SQLiteConnection sQLiteConnection) {
        SQLiteStatement prepare = sQLiteConnection.prepare("SELECT * FROM word_favorites");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "universeTopicId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "bookIds");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "createdAts");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "scores");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "word");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "meaning");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "accent");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "audioUS");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "audioUK");
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                arrayList.add(new kj.b(prepare.getLong(columnIndexOrThrow), this.f64222d.b(prepare.isNull(columnIndexOrThrow2) ? null : prepare.getText(columnIndexOrThrow2)), this.f64223e.b(prepare.isNull(columnIndexOrThrow3) ? null : prepare.getText(columnIndexOrThrow3)), this.f64224f.b(prepare.isNull(columnIndexOrThrow4) ? null : prepare.getText(columnIndexOrThrow4)), prepare.isNull(columnIndexOrThrow5) ? null : prepare.getText(columnIndexOrThrow5), prepare.isNull(columnIndexOrThrow6) ? null : prepare.getText(columnIndexOrThrow6), prepare.isNull(columnIndexOrThrow7) ? null : prepare.getText(columnIndexOrThrow7), prepare.isNull(columnIndexOrThrow8) ? null : prepare.getText(columnIndexOrThrow8), prepare.isNull(columnIndexOrThrow9) ? null : prepare.getText(columnIndexOrThrow9)));
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    public final /* synthetic */ List O(long j11, SQLiteConnection sQLiteConnection) {
        SQLiteStatement prepare = sQLiteConnection.prepare("SELECT * FROM word_favorites WHERE bookIds = '['||?||']' OR bookIds LIKE '['||?||',%' OR bookIds LIKE '%,'||?||']' OR bookIds LIKE '%,'||?||',%'");
        try {
            prepare.mo5622bindLong(1, j11);
            prepare.mo5622bindLong(2, j11);
            prepare.mo5622bindLong(3, j11);
            prepare.mo5622bindLong(4, j11);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "universeTopicId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "bookIds");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "createdAts");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "scores");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "word");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "meaning");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "accent");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "audioUS");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "audioUK");
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                arrayList.add(new kj.b(prepare.getLong(columnIndexOrThrow), this.f64222d.b(prepare.isNull(columnIndexOrThrow2) ? null : prepare.getText(columnIndexOrThrow2)), this.f64223e.b(prepare.isNull(columnIndexOrThrow3) ? null : prepare.getText(columnIndexOrThrow3)), this.f64224f.b(prepare.isNull(columnIndexOrThrow4) ? null : prepare.getText(columnIndexOrThrow4)), prepare.isNull(columnIndexOrThrow5) ? null : prepare.getText(columnIndexOrThrow5), prepare.isNull(columnIndexOrThrow6) ? null : prepare.getText(columnIndexOrThrow6), prepare.isNull(columnIndexOrThrow7) ? null : prepare.getText(columnIndexOrThrow7), prepare.isNull(columnIndexOrThrow8) ? null : prepare.getText(columnIndexOrThrow8), prepare.isNull(columnIndexOrThrow9) ? null : prepare.getText(columnIndexOrThrow9)));
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    public final /* synthetic */ List P(String str, long[] jArr, SQLiteConnection sQLiteConnection) {
        SQLiteStatement prepare = sQLiteConnection.prepare(str);
        try {
            int i11 = 1;
            for (long j11 : jArr) {
                prepare.mo5622bindLong(i11, j11);
                i11++;
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "universeTopicId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "bookIds");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "createdAts");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "scores");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "word");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "meaning");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "accent");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "audioUS");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "audioUK");
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                arrayList.add(new kj.b(prepare.getLong(columnIndexOrThrow), this.f64222d.b(prepare.isNull(columnIndexOrThrow2) ? null : prepare.getText(columnIndexOrThrow2)), this.f64223e.b(prepare.isNull(columnIndexOrThrow3) ? null : prepare.getText(columnIndexOrThrow3)), this.f64224f.b(prepare.isNull(columnIndexOrThrow4) ? null : prepare.getText(columnIndexOrThrow4)), prepare.isNull(columnIndexOrThrow5) ? null : prepare.getText(columnIndexOrThrow5), prepare.isNull(columnIndexOrThrow6) ? null : prepare.getText(columnIndexOrThrow6), prepare.isNull(columnIndexOrThrow7) ? null : prepare.getText(columnIndexOrThrow7), prepare.isNull(columnIndexOrThrow8) ? null : prepare.getText(columnIndexOrThrow8), prepare.isNull(columnIndexOrThrow9) ? null : prepare.getText(columnIndexOrThrow9)));
            }
            prepare.close();
            return arrayList;
        } catch (Throwable th2) {
            prepare.close();
            throw th2;
        }
    }

    public final /* synthetic */ List Q(long j11, SQLiteConnection sQLiteConnection) {
        SQLiteStatement prepare = sQLiteConnection.prepare("SELECT * FROM word_favorites WHERE bookIds = '['||?||']' OR bookIds LIKE '['||?||',%' OR bookIds LIKE '%,'||?||']' OR bookIds LIKE '%,'||?||',%'");
        try {
            prepare.mo5622bindLong(1, j11);
            prepare.mo5622bindLong(2, j11);
            prepare.mo5622bindLong(3, j11);
            prepare.mo5622bindLong(4, j11);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "universeTopicId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "bookIds");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "createdAts");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "scores");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "word");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "meaning");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "accent");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "audioUS");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "audioUK");
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                arrayList.add(new kj.b(prepare.getLong(columnIndexOrThrow), this.f64222d.b(prepare.isNull(columnIndexOrThrow2) ? null : prepare.getText(columnIndexOrThrow2)), this.f64223e.b(prepare.isNull(columnIndexOrThrow3) ? null : prepare.getText(columnIndexOrThrow3)), this.f64224f.b(prepare.isNull(columnIndexOrThrow4) ? null : prepare.getText(columnIndexOrThrow4)), prepare.isNull(columnIndexOrThrow5) ? null : prepare.getText(columnIndexOrThrow5), prepare.isNull(columnIndexOrThrow6) ? null : prepare.getText(columnIndexOrThrow6), prepare.isNull(columnIndexOrThrow7) ? null : prepare.getText(columnIndexOrThrow7), prepare.isNull(columnIndexOrThrow8) ? null : prepare.getText(columnIndexOrThrow8), prepare.isNull(columnIndexOrThrow9) ? null : prepare.getText(columnIndexOrThrow9)));
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    public final /* synthetic */ List R(SQLiteConnection sQLiteConnection) {
        SQLiteStatement prepare = sQLiteConnection.prepare("SELECT * FROM word_favorites");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "universeTopicId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "bookIds");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "createdAts");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "scores");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "word");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "meaning");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "accent");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "audioUS");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "audioUK");
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                arrayList.add(new kj.b(prepare.getLong(columnIndexOrThrow), this.f64222d.b(prepare.isNull(columnIndexOrThrow2) ? null : prepare.getText(columnIndexOrThrow2)), this.f64223e.b(prepare.isNull(columnIndexOrThrow3) ? null : prepare.getText(columnIndexOrThrow3)), this.f64224f.b(prepare.isNull(columnIndexOrThrow4) ? null : prepare.getText(columnIndexOrThrow4)), prepare.isNull(columnIndexOrThrow5) ? null : prepare.getText(columnIndexOrThrow5), prepare.isNull(columnIndexOrThrow6) ? null : prepare.getText(columnIndexOrThrow6), prepare.isNull(columnIndexOrThrow7) ? null : prepare.getText(columnIndexOrThrow7), prepare.isNull(columnIndexOrThrow8) ? null : prepare.getText(columnIndexOrThrow8), prepare.isNull(columnIndexOrThrow9) ? null : prepare.getText(columnIndexOrThrow9)));
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    public final /* synthetic */ List S(String str, long[] jArr, SQLiteConnection sQLiteConnection) {
        SQLiteStatement prepare = sQLiteConnection.prepare(str);
        try {
            int i11 = 1;
            for (long j11 : jArr) {
                prepare.mo5622bindLong(i11, j11);
                i11++;
            }
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                long j12 = prepare.getLong(0);
                String str2 = null;
                Set<Long> b11 = this.f64222d.b(prepare.isNull(1) ? null : prepare.getText(1));
                Map<Long, Long> b12 = this.f64223e.b(prepare.isNull(2) ? null : prepare.getText(2));
                if (!prepare.isNull(3)) {
                    str2 = prepare.getText(3);
                }
                arrayList.add(new kj.d(j12, b11, b12, this.f64224f.b(str2)));
            }
            prepare.close();
            return arrayList;
        } catch (Throwable th2) {
            prepare.close();
            throw th2;
        }
    }

    public final /* synthetic */ g2 T(kj.b[] bVarArr, SQLiteConnection sQLiteConnection) {
        this.f64225g.handleMultiple(sQLiteConnection, bVarArr);
        return g2.f100423a;
    }

    public final /* synthetic */ g2 U(kj.b[] bVarArr, SQLiteConnection sQLiteConnection) {
        this.f64226h.handleMultiple(sQLiteConnection, bVarArr);
        return g2.f100423a;
    }

    @Override // jj.k
    public Object a(final long bookId, final j00.c<? super List<Long>> $completion) {
        return DBUtil.performSuspending(this.f64220b, true, false, new x00.l() { // from class: jj.n
            @Override // x00.l
            public final Object invoke(Object obj) {
                return b0.u(bookId, (SQLiteConnection) obj);
            }
        }, $completion);
    }

    @Override // jj.k
    public Object b(final kj.b[] item, final j00.c<? super g2> $completion) {
        item.getClass();
        return DBUtil.performSuspending(this.f64220b, false, true, new x00.l() { // from class: jj.v
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 U;
                U = b0.this.U(item, (SQLiteConnection) obj);
                return U;
            }
        }, $completion);
    }

    @Override // jj.k
    public Object c(final j00.c<? super List<kj.b>> $completion) {
        return DBUtil.performSuspending(this.f64220b, true, false, new x00.l() { // from class: jj.y
            @Override // x00.l
            public final Object invoke(Object obj) {
                List N;
                N = b0.this.N((SQLiteConnection) obj);
                return N;
            }
        }, $completion);
    }

    @Override // jj.k
    public Object d(final int topicId, final j00.c<? super List<kj.b>> $completion) {
        return DBUtil.performSuspending(this.f64220b, true, false, new x00.l() { // from class: jj.o
            @Override // x00.l
            public final Object invoke(Object obj) {
                List L;
                L = b0.this.L(topicId, (SQLiteConnection) obj);
                return L;
            }
        }, $completion);
    }

    @Override // jj.k
    public Object e(final long universalId, final j00.c<? super kj.b> $completion) {
        return DBUtil.performSuspending(this.f64220b, true, false, new x00.l() { // from class: jj.q
            @Override // x00.l
            public final Object invoke(Object obj) {
                kj.b M;
                M = b0.this.M(universalId, (SQLiteConnection) obj);
                return M;
            }
        }, $completion);
    }

    @Override // jj.k
    public Object f(final kj.b[] item, final j00.c<? super List<Long>> $completion) {
        item.getClass();
        return DBUtil.performSuspending(this.f64220b, false, true, new x00.l() { // from class: jj.l
            @Override // x00.l
            public final Object invoke(Object obj) {
                List K;
                K = b0.this.K(item, (SQLiteConnection) obj);
                return K;
            }
        }, $completion);
    }

    @Override // jj.k
    public Object g(final long bookId, final j00.c<? super List<kj.b>> $completion) {
        return DBUtil.performSuspending(this.f64220b, true, false, new x00.l() { // from class: jj.z
            @Override // x00.l
            public final Object invoke(Object obj) {
                List O;
                O = b0.this.O(bookId, (SQLiteConnection) obj);
                return O;
            }
        }, $completion);
    }

    @Override // jj.k
    public Object h(final j00.c<? super List<Integer>> $completion) {
        return DBUtil.performSuspending(this.f64220b, true, false, new x00.l() { // from class: jj.p
            @Override // x00.l
            public final Object invoke(Object obj) {
                return b0.B((SQLiteConnection) obj);
            }
        }, $completion);
    }

    @Override // jj.k
    public Object i(final long bookId, final j00.c<? super Integer> $completion) {
        return DBUtil.performSuspending(this.f64220b, true, false, new x00.l() { // from class: jj.x
            @Override // x00.l
            public final Object invoke(Object obj) {
                return b0.x(bookId, (SQLiteConnection) obj);
            }
        }, $completion);
    }

    @Override // jj.k
    public Object j(final long[] universalIds, final j00.c<? super List<kj.b>> $completion) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT * FROM word_favorites WHERE universeTopicId IN (");
        StringUtil.appendPlaceholders(sb2, universalIds.length);
        sb2.append(pn.j.f81007d);
        final String sb3 = sb2.toString();
        return DBUtil.performSuspending(this.f64220b, true, false, new x00.l() { // from class: jj.w
            @Override // x00.l
            public final Object invoke(Object obj) {
                List P;
                P = b0.this.P(sb3, universalIds, (SQLiteConnection) obj);
                return P;
            }
        }, $completion);
    }

    @Override // jj.k
    public kotlinx.coroutines.flow.i<List<kj.b>> k(final long bookId) {
        return FlowUtil.createFlow(this.f64220b, false, new String[]{"word_favorites"}, new x00.l() { // from class: jj.a0
            @Override // x00.l
            public final Object invoke(Object obj) {
                List Q;
                Q = b0.this.Q(bookId, (SQLiteConnection) obj);
                return Q;
            }
        });
    }

    @Override // jj.k
    public Object l(final kj.b[] item, final j00.c<? super g2> $completion) {
        item.getClass();
        return DBUtil.performSuspending(this.f64220b, false, true, new x00.l() { // from class: jj.u
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 T;
                T = b0.this.T(item, (SQLiteConnection) obj);
                return T;
            }
        }, $completion);
    }

    @Override // jj.k
    public Object m(final long[] universalIds, final j00.c<? super List<kj.d>> $completion) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT universeTopicId, bookIds, createdAts, scores FROM word_favorites WHERE universeTopicId IN (");
        StringUtil.appendPlaceholders(sb2, universalIds.length);
        sb2.append(pn.j.f81007d);
        final String sb3 = sb2.toString();
        return DBUtil.performSuspending(this.f64220b, true, false, new x00.l() { // from class: jj.r
            @Override // x00.l
            public final Object invoke(Object obj) {
                List S;
                S = b0.this.S(sb3, universalIds, (SQLiteConnection) obj);
                return S;
            }
        }, $completion);
    }

    @Override // jj.k
    public Object n(final long bookId, final long[] universalIds, final j00.c<? super g2> $completion) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DELETE FROM word_favorites WHERE bookIds = '['||");
        sb2.append("?");
        sb2.append("||']' AND universeTopicId IN (");
        StringUtil.appendPlaceholders(sb2, universalIds.length);
        sb2.append(pn.j.f81007d);
        final String sb3 = sb2.toString();
        return DBUtil.performSuspending(this.f64220b, false, true, new x00.l() { // from class: jj.t
            @Override // x00.l
            public final Object invoke(Object obj) {
                return b0.z(sb3, bookId, universalIds, (SQLiteConnection) obj);
            }
        }, $completion);
    }

    @Override // jj.k
    public kotlinx.coroutines.flow.i<List<kj.b>> o() {
        return FlowUtil.createFlow(this.f64220b, false, new String[]{"word_favorites"}, new x00.l() { // from class: jj.m
            @Override // x00.l
            public final Object invoke(Object obj) {
                List R;
                R = b0.this.R((SQLiteConnection) obj);
                return R;
            }
        });
    }

    @Override // jj.k
    public Object p(final long[] universalIds, final j00.c<? super g2> $completion) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DELETE FROM word_favorites WHERE universeTopicId IN (");
        StringUtil.appendPlaceholders(sb2, universalIds.length);
        sb2.append(pn.j.f81007d);
        final String sb3 = sb2.toString();
        return DBUtil.performSuspending(this.f64220b, false, true, new x00.l() { // from class: jj.s
            @Override // x00.l
            public final Object invoke(Object obj) {
                return b0.A(sb3, universalIds, (SQLiteConnection) obj);
            }
        }, $completion);
    }
}
