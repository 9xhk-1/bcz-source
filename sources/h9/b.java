package h9;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b extends g9.a {
    public b(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override // g9.a
    public void h(SQLiteDatabase db2) {
        db2.execSQL("CREATE TABLE IF NOT EXISTS ts_word_cloze(topic_id INTEGER, cloze_data TEXT)");
    }

    @Override // g9.a
    public void k(SQLiteDatabase db2, int oldVersion, int newVersion) {
    }
}
