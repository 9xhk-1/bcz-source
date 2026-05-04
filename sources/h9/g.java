package h9;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.baicizhan.client.business.dataset.provider.a;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class g extends g9.a {
    public g(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override // g9.a
    public void h(SQLiteDatabase db2) {
        db2.execSQL("CREATE TABLE IF NOT EXISTS " + a.r.f16286a + j.f81006c + "time INTEGER, book_id INTEGER, topic_id INTEGER, word TEXT, accent TEXT, " + a.r.C0259a.f16293f + " TEXT, audio TEXT, " + a.r.C0259a.f16295h + " TEXT, " + a.r.C0259a.f16296i + " TEXT, image TEXT, " + a.r.C0259a.f16298k + " TEXT, " + a.r.C0259a.f16299l + " TEXT, " + a.r.C0259a.f16300m + " TEXT, zpk_path TEXT, " + a.r.C0259a.f16302o + " INTEGER)");
    }

    @Override // g9.a
    public void i(SQLiteDatabase db2, int oldVersion, int newVersion) {
        k(db2, oldVersion, newVersion);
    }

    @Override // g9.a
    public void k(SQLiteDatabase db2, int oldVersion, int newVersion) {
        h(db2);
    }
}
