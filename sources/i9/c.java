package i9;

import android.content.Context;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c {
    public static void a(SQLiteDatabase database, String sql) {
        try {
            database.execSQL(sql);
        } catch (Exception unused) {
        }
    }

    public static List<Integer> b(Context context, String database, Pattern pattern, int group) {
        ArrayList arrayList = new ArrayList();
        try {
            Iterator<String> it = c(context, database).iterator();
            while (it.hasNext()) {
                Matcher matcher = pattern.matcher(it.next());
                if (matcher.matches()) {
                    arrayList.add(Integer.valueOf(matcher.group(group)));
                }
            }
            return arrayList;
        } catch (Exception e11) {
            e11.printStackTrace();
            return arrayList;
        }
    }

    public static List<String> c(Context context, String database) {
        return k9.a.m(k9.c.j(database, "SELECT name FROM sqlite_master WHERE type=?", "table").d(context), String.class);
    }

    public static List<String> d(SQLiteDatabase db2) {
        return k9.a.m(db2.rawQuery("SELECT name FROM sqlite_master WHERE type=\"table\"", null), String.class);
    }

    public static List<String> e(Context context, String database, Pattern pattern) {
        List<String> c11 = c(context, database);
        if (c11 == null || c11.size() == 0) {
            return c11;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : c11) {
            if (pattern.matcher(str).matches()) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static List<String> f(SQLiteDatabase database, Pattern pattern) {
        List<String> d11 = d(database);
        if (d11 == null || d11.size() == 0) {
            return d11;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : d11) {
            if (pattern.matcher(str).matches()) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static List<String> g(Context context, String database, String prefix) {
        List<String> c11 = c(context, database);
        if (c11 == null || c11.size() == 0) {
            return c11;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : c11) {
            if (str.startsWith(prefix)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static int h(Context context, String database, String table, String field) {
        return k9.a.A(k9.c.j(database, String.format("SELECT MAX(%s) FROM %s", field, table), new String[0]).d(context));
    }

    public static boolean i(Context context, String database, String table) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT exists(SELECT 1 FROM ");
        sb2.append(table);
        sb2.append(pn.j.f81007d);
        return k9.a.C(k9.c.j(database, sb2.toString(), new String[0]).d(context)) == 0;
    }

    public static int j(Context context, String database, String table, String selection, String[] selectionArgs) {
        String str;
        if (TextUtils.isEmpty(selection)) {
            str = "";
        } else {
            str = " WHERE " + selection;
        }
        return k9.a.A(k9.c.j(database, "SELECT count(*) from " + table + str, selectionArgs).d(context));
    }

    public static boolean k(Context context, String database, String table) {
        return k9.a.C(k9.c.j(database, String.format("SELECT count(*) FROM sqlite_master WHERE name = %s", DatabaseUtils.sqlEscapeString(table)), new String[0]).d(context)) == 1;
    }
}
