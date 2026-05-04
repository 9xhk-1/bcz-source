package h9;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.baicizhan.client.business.dataset.provider.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a extends g9.a {

    /* renamed from: m, reason: collision with root package name */
    public static final String f59044m = "DoExampleInfoDatabase";

    /* renamed from: l, reason: collision with root package name */
    public final Context f59045l;

    public a(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        this.f59045l = context;
    }

    @Override // g9.a
    public void h(SQLiteDatabase db2) {
        db2.execSQL("CREATE TABLE IF NOT EXISTS ZBOOKFINISHINFO(book_id INTEGER PRIMARY KEY, word_finish_count INTEGER default 0,book_name varchar  default \"\", daily_count integer default 0, review_count integer default 0, is_current_select_book integer default 0, sync_state long default 0, daka_days integer default 0, last_daka_times long default 0, max_offline_days integer default 0, max_offline_problem_count integer default 0,book_desc varchar default \"\",book_desc_img varchar default \"\")");
        db2.execSQL("CREATE TABLE IF NOT EXISTS ZBOOKRESOURCE(book_id integer PRIMARY KEY, updatetime long default 0, setdatetime long default 0, daily_count integer default 0, review_count integer default 0,word_count integer default 0, bookname varchar default \"\", update_local_data long default 0, description varchar default \"\", zword_radio_update_time long default -1, roadmap_ver varchar default \"\", poster_ver INTEGER DEFAULT 0,book_desc varchar default \"\",book_desc_img varchar default \"\", book_flag INTEGER DEFAULT 0)");
        db2.execSQL("CREATE TABLE IF NOT EXISTS ZBOOKWORDINFO(BOOK_ID INTEGER, UPDATETIME LONG default 0, TYPE INTEGER default 0, ALL_WORD BLOB)");
        db2.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS book_word_info_unique_index ON ZBOOKWORDINFO(BOOK_ID, TYPE)");
        db2.execSQL("CREATE TABLE IF NOT EXISTS KVDICT(key VARCHAR NOT NULL PRIMARY KEY, value VARCHAR default \"\")");
        a.b.a(db2);
    }

    @Override // g9.a
    public void k(SQLiteDatabase db2, int oldVersion, int newVersion) {
        Cursor query = db2.query(a.z.f16348a, null, null, null, null, null, null, "1");
        if (query != null) {
            try {
                Log.d(f59044m, "need drop test, column size: " + query.getColumnCount() + "; size: " + query.getCount());
                if (query.moveToFirst() && query.getColumnIndex(a.a0.C0241a.f16099a) >= 0) {
                    qb.c.b(f59044m, "old book resource table need be dropped! column size: " + query.getColumnCount(), new Object[0]);
                    db2.execSQL("DROP TABLE IF EXISTS ZBOOKRESOURCE");
                    h(db2);
                    return;
                }
                if (query.getColumnIndex("daily_count") <= 0) {
                    i9.c.a(db2, "ALTER TABLE ZBOOKRESOURCE ADD COLUMN daily_count INTEGER DEFAULT 0");
                }
                if (query.getColumnIndex("review_count") <= 0) {
                    i9.c.a(db2, "ALTER TABLE ZBOOKRESOURCE ADD COLUMN review_count INTEGER DEFAULT 0");
                }
                if (query.getColumnIndex(a.z.C0267a.f16361l) <= 0) {
                    i9.c.a(db2, "ALTER TABLE ZBOOKRESOURCE ADD COLUMN poster_ver INTEGER DEFAULT 0");
                }
                if (query.getColumnIndex("book_desc") <= 0) {
                    i9.c.a(db2, "ALTER TABLE ZBOOKRESOURCE ADD COLUMN book_desc varchar DEFAULT \"\"");
                }
                if (query.getColumnIndex("book_desc_img") <= 0) {
                    i9.c.a(db2, "ALTER TABLE ZBOOKRESOURCE ADD COLUMN book_desc_img varchar DEFAULT  \"\"");
                }
                if (query.getColumnIndex(a.z.C0267a.f16364o) <= 0) {
                    i9.c.a(db2, "ALTER TABLE ZBOOKRESOURCE ADD COLUMN book_flag INTEGER DEFAULT 0");
                }
                query.close();
            } finally {
            }
        }
        query = db2.query(a.b.f16103a, null, null, null, null, null, null, "1");
        if (query != null) {
            try {
                int columnIndex = query.getColumnIndex(a.b.C0242a.f16107c);
                int columnIndex2 = query.getColumnIndex("word");
                int columnIndex3 = query.getColumnIndex(a.b.C0242a.f16109e);
                int columnIndex4 = query.getColumnIndex("accent");
                int columnIndex5 = query.getColumnIndex("audio");
                if (columnIndex2 >= 0 && columnIndex3 >= 0 && columnIndex4 >= 0 && columnIndex5 >= 0) {
                    if (columnIndex < 0) {
                        i9.c.a(db2, "ALTER TABLE tb_collect_words ADD COLUMN score INTEGER DEFAULT 0");
                    }
                }
                a.b.b(db2);
                a.b.a(db2);
            } finally {
            }
        }
        query = db2.query(a.y.f16333a, null, null, null, null, null, null, "1");
        if (query != null) {
            try {
                if (query.getColumnIndex("book_name") <= 0) {
                    i9.c.a(db2, "ALTER TABLE ZBOOKFINISHINFO ADD COLUMN book_name varchar default \"\"");
                }
                if (query.getColumnIndex("daily_count") <= 0) {
                    i9.c.a(db2, "ALTER TABLE ZBOOKFINISHINFO ADD COLUMN daily_count INTEGER DEFAULT 0");
                }
                if (query.getColumnIndex("review_count") <= 0) {
                    i9.c.a(db2, "ALTER TABLE ZBOOKFINISHINFO ADD COLUMN review_count INTEGER DEFAULT 0");
                }
                if (query.getColumnIndex("book_desc") <= 0) {
                    i9.c.a(db2, "ALTER TABLE ZBOOKFINISHINFO ADD COLUMN book_desc varchar DEFAULT \"\"");
                }
                if (query.getColumnIndex("book_desc_img") <= 0) {
                    i9.c.a(db2, "ALTER TABLE ZBOOKFINISHINFO ADD COLUMN book_desc_img varchar DEFAULT  \"\"");
                }
            } finally {
                query.close();
            }
        }
    }

    @Override // g9.a
    public void i(SQLiteDatabase db2, int oldVersion, int newVersion) {
    }
}
