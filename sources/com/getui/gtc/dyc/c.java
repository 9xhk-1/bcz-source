package com.getui.gtc.dyc;

import android.content.ContentValues;
import android.database.Cursor;
import com.getui.gtc.base.GtcProvider;
import com.getui.gtc.base.db.AbstractDb;
import com.getui.gtc.base.db.AbstractTable;
import com.getui.gtc.base.db.DbManager;
import java.util.HashMap;

/* loaded from: classes6.dex */
class c {

    public static class a extends AbstractDb {
        @Override // com.getui.gtc.base.db.AbstractDb
        public String getDbName() {
            return "cg.db";
        }

        @Override // com.getui.gtc.base.db.AbstractDb
        public int getVersion() {
            return 1;
        }
    }

    /* renamed from: com.getui.gtc.dyc.c$c, reason: collision with other inner class name */
    public static class C0357c {

        /* renamed from: a, reason: collision with root package name */
        private static c f29998a = new c();
    }

    public static class d extends AbstractTable {
        @Override // com.getui.gtc.base.db.AbstractTable
        public String createSql() {
            return "CREATE TABLE IF NOT EXISTS sct (v TEXT PRIMARY KEY, c TEXT)";
        }

        @Override // com.getui.gtc.base.db.AbstractTable
        public String getTableName() {
            return "sct";
        }
    }

    private c() {
        try {
            DbManager.init(GtcProvider.context(), a.class, d.class);
        } catch (Throwable th2) {
            com.getui.gtc.dyc.a.a.a.c(th2);
        }
    }

    public static c a() {
        return C0357c.f29998a;
    }

    public HashMap<String, h> c() {
        Cursor query = ((d) DbManager.getTable(a.class, d.class)).query(new String[]{"v", "c"}, null, null);
        if (query == null) {
            return null;
        }
        HashMap<String, h> hashMap = new HashMap<>();
        while (query.moveToNext()) {
            try {
                hashMap.put(query.getString(query.getColumnIndex("v")), h.e(query.getString(query.getColumnIndex("c"))));
            } catch (Throwable th2) {
                com.getui.gtc.dyc.a.a.a.c(th2);
            }
        }
        query.close();
        return hashMap;
    }

    public h a(String str) {
        Cursor query = ((d) DbManager.getTable(a.class, d.class)).query(new String[]{"c"}, "v=?", new String[]{str});
        h hVar = null;
        if (query == null) {
            return null;
        }
        if (query.moveToNext()) {
            try {
                hVar = h.e(query.getString(query.getColumnIndex("c")));
            } catch (Throwable th2) {
                com.getui.gtc.dyc.a.a.a.c(th2);
            }
        }
        query.close();
        return hVar;
    }

    public boolean a(String str, h hVar) {
        try {
            String g11 = hVar.g();
            ContentValues contentValues = new ContentValues();
            contentValues.put("v", str);
            contentValues.put("c", g11);
            return ((d) DbManager.getTable(a.class, d.class)).replace(null, contentValues) != -1;
        } catch (Throwable th2) {
            com.getui.gtc.dyc.a.a.a.c(th2);
            return false;
        }
    }
}
