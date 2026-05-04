package h9;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.baicizhan.client.business.dataset.provider.a;
import java.util.Locale;
import java.util.regex.Pattern;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class h extends g9.a {

    /* renamed from: l, reason: collision with root package name */
    public static final String f59046l = "tb_word_media_mid";

    /* renamed from: m, reason: collision with root package name */
    public static final String f59047m = "path";

    /* renamed from: n, reason: collision with root package name */
    public static final String f59048n = "type";

    /* renamed from: o, reason: collision with root package name */
    public static final String f59049o = "tb_word_media_mid_update";

    /* renamed from: p, reason: collision with root package name */
    public static final String f59050p = "fm_mid_update";

    /* renamed from: q, reason: collision with root package name */
    public static final String f59051q = "tv_mid_update";

    /* renamed from: r, reason: collision with root package name */
    public static final String f59052r = "tb_word_media_book";

    /* renamed from: s, reason: collision with root package name */
    public static final String f59053s = "loaded_book_id";

    public h(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override // g9.a
    public void h(SQLiteDatabase db2) {
        db2.execSQL("CREATE TABLE IF NOT EXISTS tb_word_media_mid" + j.f81006c + "path TEXT UNIQUE, type INTEGER)");
        db2.execSQL("CREATE TABLE IF NOT EXISTS tb_word_media_mid_update" + j.f81006c + "fm_mid_update INTEGER, tv_mid_update INTEGER)");
        StringBuilder sb2 = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
        sb2.append("tb_word_media_book");
        sb2.append(j.f81006c);
        sb2.append("loaded_book_id");
        sb2.append(" INTEGER PRIMARY KEY)");
        db2.execSQL(sb2.toString());
        db2.execSQL("CREATE TABLE IF NOT EXISTS word_tv_learn_ids(topic_id INTEGER PRIMARY KEY)");
    }

    @Override // g9.a
    public void k(SQLiteDatabase db2, int oldVersion, int newVersion) {
        db2.execSQL("DROP TABLE IF EXISTS tb_word_media_mid");
        db2.execSQL("DROP TABLE IF EXISTS tb_word_media_mid_update");
        db2.execSQL("DROP TABLE IF EXISTS tb_word_media_book");
        m(db2);
        h(db2);
    }

    public final void m(SQLiteDatabase db2) {
        SQLiteDatabase sQLiteDatabase;
        Pattern compile = Pattern.compile(String.format(Locale.US, "%s_\\d+", a.v.f16314a));
        Cursor cursor = null;
        try {
            cursor = db2.rawQuery("SELECT name FROM sqlite_master WHERE type = \"table\" and name like \"tb_word_media%\"", null);
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                String string = cursor.getString(0);
                if (compile.matcher(string).matches()) {
                    sQLiteDatabase = db2;
                    Cursor query = sQLiteDatabase.query(string, null, null, null, null, null, null, "1");
                    if (query != null) {
                        try {
                            if (query.getColumnIndex(a.v.C0263a.f16323i) <= 0) {
                                i9.c.a(sQLiteDatabase, "ALTER TABLE " + string + " ADD " + a.v.C0263a.f16323i + " VARCHAR DEFAULT \"\"");
                            }
                            query.close();
                        } catch (Throwable th2) {
                            query.close();
                            throw th2;
                        }
                    }
                } else {
                    sQLiteDatabase = db2;
                }
                cursor.moveToNext();
                db2 = sQLiteDatabase;
            }
            cursor.close();
        } finally {
        }
    }

    @Override // g9.a
    public void i(SQLiteDatabase db2, int oldVersion, int newVersion) {
    }
}
