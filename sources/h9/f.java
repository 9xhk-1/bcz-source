package h9;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.baicizhan.client.business.dataset.provider.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class f extends g9.a {
    public f(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override // g9.a
    public void h(SQLiteDatabase db2) {
        db2.execSQL("CREATE TABLE IF NOT EXISTS ZLOGINUSER (USER VARCHAR default \"\", ZSESSION VARCHAR default \"\", ZLOGINTYPE INTEGER default 0, ZPASSWORD VARCHAR default \"\", ZPASSWORDMD5 VARCHAR default \"\", ZSAVESTATUS INTEGER default 1, ZPROFILEIMAGE VARCHAR default \"\", ZSEX INTEGER default 3, ZUSERNICKNAME VARCHAR default \"\", ZPHONE VARCHAR default \"\", ZLASTLOGINTIME INTEGER default 0 , ZBIRTHDAY INTEGER default 0 , ZLOCATION VARCHAR default \"\" , ZEDUCATION VARCHAR default \"\")");
        db2.execSQL("CREATE INDEX IF NOT EXISTS login_user ON ZLOGINUSER(USER);");
    }

    @Override // g9.a
    public void k(SQLiteDatabase db2, int oldVersion, int newVersion) {
        Cursor query = db2.query(a.b0.f16112a, null, null, null, null, null, null, "1");
        if (query != null) {
            try {
                try {
                    if (query.getColumnIndex(a.b0.C0243a.f16117d) <= 0) {
                        i9.c.a(db2, "ALTER TABLE ZLOGINUSER ADD ZPASSWORDMD5 VARCHAR");
                    }
                    if (query.getColumnIndex(a.b0.C0243a.f16122i) <= 0) {
                        i9.c.a(db2, "ALTER TABLE ZLOGINUSER ADD ZPHONE VARCHAR");
                    }
                    if (query.getColumnIndex(a.b0.C0243a.f16123j) <= 0) {
                        i9.c.a(db2, "ALTER TABLE ZLOGINUSER ADD ZLASTLOGINTIME INTEGER");
                    }
                    if (query.getColumnIndex(a.b0.C0243a.f16124k) <= 0) {
                        i9.c.a(db2, "ALTER TABLE ZLOGINUSER ADD ZBIRTHDAY INTEGER");
                    }
                    if (query.getColumnIndex(a.b0.C0243a.f16125l) <= 0) {
                        i9.c.a(db2, "ALTER TABLE ZLOGINUSER ADD ZLOCATION VARCHAR");
                    }
                    if (query.getColumnIndex(a.b0.C0243a.f16126m) <= 0) {
                        i9.c.a(db2, "ALTER TABLE ZLOGINUSER ADD ZEDUCATION VARCHAR");
                    }
                } catch (Exception e11) {
                    qb.c.d("baicizhandb", Log.getStackTraceString(e11), new Object[0]);
                    query.close();
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
