package h9;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.baicizhan.client.business.dataset.provider.a;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class e extends g9.a {
    public e(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override // g9.a
    public void h(SQLiteDatabase db2) {
        db2.execSQL("CREATE TABLE IF NOT EXISTS ts_offline_sync_state (book_id integer primary key,sync_state integer default 0,run_time integer default 0,roadmap_ver integer default 0,want_more_count integer default 0,combo_count integer default 0,max_combo_count integer default 0)");
    }

    @Override // g9.a
    public void k(SQLiteDatabase db2, int oldVersion, int newVersion) {
        Cursor query = db2.query(a.l.f16233a, null, null, null, null, null, null, "1");
        try {
            if (query != null) {
                try {
                    if (query.getColumnIndex(a.l.C0253a.f16237c) <= 0) {
                        i9.c.a(db2, "ALTER TABLE ts_offline_sync_state ADD COLUMN want_more_count integer default 0");
                    }
                    if (query.getColumnIndex(a.l.C0253a.f16238d) <= 0) {
                        i9.c.a(db2, "ALTER TABLE ts_offline_sync_state ADD COLUMN combo_count integer default 0");
                    }
                    if (query.getColumnIndex(a.l.C0253a.f16239e) <= 0) {
                        i9.c.a(db2, "ALTER TABLE ts_offline_sync_state ADD COLUMN max_combo_count integer default 0");
                    }
                } catch (Exception e11) {
                    qb.c.d("baicizhandb", Log.getStackTraceString(e11), new Object[0]);
                }
                query.close();
            }
            for (String str : i9.c.f(db2, Pattern.compile("ts_learn_offline_dotopic_sync_ids_\\d+"))) {
                Cursor query2 = db2.query(str, null, null, null, null, null, null, "1");
                if (query2 != null) {
                    try {
                        try {
                            if (query2.getColumnIndex("create_at") <= 0) {
                                i9.c.a(db2, String.format(Locale.US, "ALTER TABLE %s ADD COLUMN create_at integer DEFAULT 0", str));
                            }
                            if (query2.getColumnIndex("extra") <= 0) {
                                i9.c.a(db2, String.format(Locale.US, "ALTER TABLE %s ADD COLUMN extra varchar DEFAULT \"\"", str));
                            }
                            if (query2.getColumnIndex("review_round") <= 0) {
                                i9.c.a(db2, String.format(Locale.US, "ALTER TABLE %s ADD COLUMN review_round integer DEFAULT 0", str));
                            }
                        } catch (Exception e12) {
                            qb.c.d("baicizhandb", Log.getStackTraceString(e12), new Object[0]);
                        }
                        query2.close();
                    } catch (Throwable th2) {
                        query2.close();
                        throw th2;
                    }
                }
            }
            for (String str2 : i9.c.f(db2, Pattern.compile("ts_offline_dotopic_sync_ids_\\d+"))) {
                Cursor query3 = db2.query(str2, null, null, null, null, null, null, "1");
                if (query3 != null) {
                    try {
                        try {
                            if (query3.getColumnIndex("tag_id") <= 0) {
                                i9.c.a(db2, String.format(Locale.US, "ALTER TABLE %s ADD COLUMN tag_id integer DEFAULT 0", str2));
                            }
                            if (query3.getColumnIndex("review_round") <= 0) {
                                i9.c.a(db2, String.format(Locale.US, "ALTER TABLE %s ADD COLUMN review_round integer DEFAULT 0", str2));
                            }
                        } catch (Throwable th3) {
                            query3.close();
                            throw th3;
                        }
                    } catch (Exception e13) {
                        qb.c.d("baicizhandb", Log.getStackTraceString(e13), new Object[0]);
                    }
                    query3.close();
                }
            }
        } catch (Throwable th4) {
            query.close();
            throw th4;
        }
    }

    @Override // g9.a
    public void i(SQLiteDatabase db2, int oldVersion, int newVersion) {
    }
}
