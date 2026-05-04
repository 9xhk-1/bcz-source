package h9;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.baicizhan.client.business.dataset.provider.a;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class d extends g9.a {
    public d(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override // g9.a
    public void h(SQLiteDatabase db2) {
        db2.execSQL("CREATE TABLE IF NOT EXISTS ZSHORTPHRASETOPICRESOURCE(TOPIC INTEGER PRIMARY KEY, ZWORD VARCHAR, ZSENTENCE VARCHAR, ZWORDVIDEO VARCHAR, ZSENTENCEVIDEO VARCHAR, ZIMAGEPATH VARCHAR, ZWORDMEAN VARCHAR, ZWORDVARIANTS VARCHAR, ZSIMILAR_HIGHLIGHT VARCHAR, ZSENTENCE2 VARCHAR, ZSENTENCE_TRANS VARCHAR, ZSENTENCE_TRANS2 VARCHAR, ZSENTENCEVIDEO2 VARCHAR, ZEXPLAINCIDEO VARCHAR, ZEXPLAIN VARCHAR, ZSENTENCEWORDHIGHLIGHT VARCHAR, ZSENTENCEWORDHIGHLIGHT2 VARCHAR, ZEXAMINFO VARCHAR)");
    }

    @Override // g9.a
    public void k(SQLiteDatabase db2, int oldVersion, int newVersion) {
        boolean z11;
        boolean z12;
        boolean z13;
        try {
            for (String str : i9.c.f(db2, Pattern.compile("topic_resource_\\d+"))) {
                SQLiteDatabase sQLiteDatabase = db2;
                Cursor query = sQLiteDatabase.query(str, null, null, null, null, null, null, "1");
                if (query != null) {
                    try {
                        boolean z14 = query.getColumnIndex("zpk_path") > 0;
                        z11 = query.getColumnIndex(a.i.C0250a.f16201c) > 0;
                        z12 = query.getColumnIndex(a.i.C0250a.f16202d) > 0;
                        r12 = query.getColumnIndex(a.i.C0250a.f16203e) > 0;
                        query.close();
                        z13 = r12;
                        r12 = z14;
                    } finally {
                    }
                } else {
                    z13 = false;
                    z11 = false;
                    z12 = false;
                }
                if (!r12) {
                    i9.c.a(sQLiteDatabase, String.format(Locale.US, "ALTER TABLE %s ADD COLUMN zpk_path VARCHAR DEFAULT \"\"", str));
                }
                if (!z11) {
                    i9.c.a(sQLiteDatabase, String.format(Locale.US, "ALTER TABLE %s ADD COLUMN update_flag_md5 VARCHAR DEFAULT \"\"", str));
                }
                if (!z12) {
                    i9.c.a(sQLiteDatabase, String.format(Locale.US, "ALTER TABLE %s ADD COLUMN coverage INTEGER DEFAULT 0", str));
                }
                if (!z13) {
                    i9.c.a(sQLiteDatabase, String.format(Locale.US, "ALTER TABLE %s ADD COLUMN zpk_version INTEGER DEFAULT 0", str));
                }
                db2 = sQLiteDatabase;
            }
        } catch (Exception e11) {
            qb.c.c("baicizhandb", "", e11);
        }
    }

    @Override // g9.a
    public void i(SQLiteDatabase db2, int oldVersion, int newVersion) {
    }
}
