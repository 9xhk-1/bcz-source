package h9;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.baicizhan.client.business.dataset.provider.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class i extends g9.a {

    /* renamed from: l, reason: collision with root package name */
    public static final String f59054l = "CREATE TABLE IF NOT EXISTS ts_word_radio_half_time(ws_id integer primary key,ws_bookid integer default 0,ws_complete integer default 0,ws_audio    text,ws_update_time  integer default 0, ws_word_tv integer default 0)";

    /* renamed from: m, reason: collision with root package name */
    public static final String f59055m = "CREATE TABLE IF NOT EXISTS ts_word_station_data_all(ws_id integer primary key,ws_complete integer default 0,ws_word text,ws_word_type  text,ws_word_cn  text,ws_sentence text,ws_desc     text,ws_audio    text,ws_audio_high text, ws_read integer default 0, ws_update_time long default 0, tv_vedio_path  VARCHAR default \"\",ws_tv_update_time long default 0)";

    public i(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override // g9.a
    public void h(SQLiteDatabase db2) {
        db2.execSQL(f59054l);
        db2.execSQL(f59055m);
    }

    @Override // g9.a
    public void k(SQLiteDatabase db2, int oldVersion, int newVersion) {
        Cursor query = db2.query(a.o.f16267a, null, null, null, null, null, null, "1");
        try {
            if (query != null) {
                try {
                    if (query.getColumnIndex("ws_read") <= 0) {
                        i9.c.a(db2, "ALTER TABLE ts_word_station_data_all  ADD ws_read long default 0");
                    }
                    if (query.getColumnIndex("ws_update_time") <= 0) {
                        i9.c.a(db2, "ALTER TABLE ts_word_station_data_all  ADD ws_update_time long default 0");
                    }
                    if (query.getColumnIndex(a.o.C0256a.f16279k) <= 0) {
                        i9.c.a(db2, "ALTER TABLE ts_word_station_data_all  ADD tv_vedio_path  VARCHAR default \"\"");
                    }
                    if (query.getColumnIndex("ws_tv_update_time") <= 0) {
                        i9.c.a(db2, "ALTER TABLE ts_word_station_data_all  ADD ws_tv_update_time long default 0");
                    }
                } catch (Exception e11) {
                    qb.c.d("baicizhandb", Log.getStackTraceString(e11), new Object[0]);
                }
                query.close();
            }
            Cursor query2 = db2.query(a.n.f16259a, null, null, null, null, null, null, "1");
            try {
                if (query2 != null) {
                    try {
                        if (query2.getColumnIndex(a.n.C0255a.f16266f) <= 0) {
                            i9.c.a(db2, "ALTER TABLE ts_word_radio_half_time  ADD ws_word_tv integer default 0");
                        }
                    } catch (Exception e12) {
                        qb.c.d("baicizhandb", Log.getStackTraceString(e12), new Object[0]);
                    }
                    query2.close();
                }
            } catch (Throwable th2) {
                query2.close();
                throw th2;
            }
        } catch (Throwable th3) {
            query.close();
            throw th3;
        }
    }

    @Override // g9.a
    public void i(SQLiteDatabase db2, int oldVersion, int newVersion) {
    }
}
