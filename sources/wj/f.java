package wj;

import androidx.annotation.NonNull;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.baicizhan.client.business.dataset.provider.a;
import com.baicizhan.main.wordlistv2.repo.db.WordListResourceRecord;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import pn.j;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public final class f implements b {

    /* renamed from: a, reason: collision with root package name */
    public final RoomDatabase f96411a;

    /* renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<WordListResourceRecord> f96412b = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends EntityInsertAdapter<WordListResourceRecord> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final WordListResourceRecord entity) {
            statement.mo5622bindLong(1, entity.getBookId());
            statement.mo5622bindLong(2, entity.getTopicId());
            if (entity.getWord() == null) {
                statement.mo5623bindNull(3);
            } else {
                statement.mo5624bindText(3, entity.getWord());
            }
            if (entity.getMeanCn() == null) {
                statement.mo5623bindNull(4);
            } else {
                statement.mo5624bindText(4, entity.getMeanCn());
            }
            if (entity.getAccentUsaAudioUri() == null) {
                statement.mo5623bindNull(5);
            } else {
                statement.mo5624bindText(5, entity.getAccentUsaAudioUri());
            }
        }

        @Override // androidx.room.EntityInsertAdapter
        @NonNull
        public String createQuery() {
            return "INSERT OR REPLACE INTO `t_wordlist_resource_record` (`book_id`,`topic_id`,`word`,`mean_cn`,`audio_usa_uri`) VALUES (?,?,?,?,?)";
        }
    }

    public f(@NonNull final RoomDatabase __db) {
        this.f96411a = __db;
    }

    public static /* synthetic */ List e(String str, int i11, Collection collection, SQLiteConnection sQLiteConnection) {
        SQLiteStatement prepare = sQLiteConnection.prepare(str);
        try {
            prepare.mo5622bindLong(1, i11);
            Iterator it = collection.iterator();
            int i12 = 2;
            while (it.hasNext()) {
                if (((Integer) it.next()) == null) {
                    prepare.mo5623bindNull(i12);
                } else {
                    prepare.mo5622bindLong(i12, r14.intValue());
                }
                i12++;
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "book_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "topic_id");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "word");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, a.e.C0246a.f16184d);
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "audio_usa_uri");
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                arrayList.add(new WordListResourceRecord((int) prepare.getLong(columnIndexOrThrow), (int) prepare.getLong(columnIndexOrThrow2), prepare.isNull(columnIndexOrThrow3) ? null : prepare.getText(columnIndexOrThrow3), prepare.isNull(columnIndexOrThrow4) ? null : prepare.getText(columnIndexOrThrow4), prepare.isNull(columnIndexOrThrow5) ? null : prepare.getText(columnIndexOrThrow5)));
            }
            prepare.close();
            return arrayList;
        } catch (Throwable th2) {
            prepare.close();
            throw th2;
        }
    }

    public static /* synthetic */ List f(int i11, SQLiteConnection sQLiteConnection) {
        SQLiteStatement prepare = sQLiteConnection.prepare("select * from t_wordlist_resource_record where book_id = ?");
        try {
            prepare.mo5622bindLong(1, i11);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "book_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "topic_id");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "word");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, a.e.C0246a.f16184d);
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "audio_usa_uri");
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                arrayList.add(new WordListResourceRecord((int) prepare.getLong(columnIndexOrThrow), (int) prepare.getLong(columnIndexOrThrow2), prepare.isNull(columnIndexOrThrow3) ? null : prepare.getText(columnIndexOrThrow3), prepare.isNull(columnIndexOrThrow4) ? null : prepare.getText(columnIndexOrThrow4), prepare.isNull(columnIndexOrThrow5) ? null : prepare.getText(columnIndexOrThrow5)));
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    @NonNull
    public static List<Class<?>> g() {
        return Collections.EMPTY_LIST;
    }

    @Override // wj.b
    public List<WordListResourceRecord> a(final int bookId, final Collection<Integer> topicIds) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT * FROM t_wordlist_resource_record WHERE book_id = ");
        sb2.append("?");
        sb2.append(" AND topic_id IN (");
        StringUtil.appendPlaceholders(sb2, topicIds.size());
        sb2.append(j.f81007d);
        final String sb3 = sb2.toString();
        return (List) DBUtil.performBlocking(this.f96411a, true, false, new l() { // from class: wj.c
            @Override // x00.l
            public final Object invoke(Object obj) {
                return f.e(sb3, bookId, topicIds, (SQLiteConnection) obj);
            }
        });
    }

    @Override // wj.b
    public List<WordListResourceRecord> b(final int bookId) {
        return (List) DBUtil.performBlocking(this.f96411a, true, false, new l() { // from class: wj.d
            @Override // x00.l
            public final Object invoke(Object obj) {
                return f.f(bookId, (SQLiteConnection) obj);
            }
        });
    }

    @Override // wj.b
    public List<Long> c(final List<WordListResourceRecord> records) {
        records.getClass();
        return (List) DBUtil.performBlocking(this.f96411a, false, true, new l() { // from class: wj.e
            @Override // x00.l
            public final Object invoke(Object obj) {
                List h11;
                h11 = f.this.h(records, (SQLiteConnection) obj);
                return h11;
            }
        });
    }

    public final /* synthetic */ List h(List list, SQLiteConnection sQLiteConnection) {
        return this.f96412b.insertAndReturnIdsList(sQLiteConnection, list);
    }
}
