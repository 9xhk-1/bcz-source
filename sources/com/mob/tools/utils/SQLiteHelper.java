package com.mob.tools.utils;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.mob.tools.proguard.PublicMemberKeeper;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public class SQLiteHelper implements PublicMemberKeeper {

    public static class SingleTableDB implements PublicMemberKeeper {

        /* renamed from: a, reason: collision with root package name */
        private String f41408a;

        /* renamed from: b, reason: collision with root package name */
        private String f41409b;

        /* renamed from: c, reason: collision with root package name */
        private SQLiteDatabase f41410c;

        /* renamed from: d, reason: collision with root package name */
        private LinkedHashMap<String, String> f41411d;

        /* renamed from: e, reason: collision with root package name */
        private HashMap<String, Boolean> f41412e;

        /* renamed from: f, reason: collision with root package name */
        private String f41413f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f41414g;

        public void addField(String str, String str2, boolean z11) {
            if (this.f41410c == null) {
                this.f41411d.put(str, str2);
                this.f41412e.put(str, Boolean.valueOf(z11));
            }
        }

        private SingleTableDB(String str, String str2) {
            this.f41408a = str;
            this.f41409b = str2;
            this.f41411d = new LinkedHashMap<>();
            this.f41412e = new HashMap<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0096 A[DONT_GENERATE] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a() throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 312
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.utils.SQLiteHelper.SingleTableDB.a():void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            SQLiteDatabase sQLiteDatabase = this.f41410c;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
                this.f41410c = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String c() {
            return this.f41409b;
        }
    }

    public static void close(SingleTableDB singleTableDB) {
        singleTableDB.b();
    }

    public static int delete(SingleTableDB singleTableDB, String str, String[] strArr) throws Throwable {
        singleTableDB.a();
        return singleTableDB.f41410c.delete(singleTableDB.c(), str, strArr);
    }

    public static SingleTableDB getDatabase(Context context, String str) {
        return getDatabase(context != null ? context.getDatabasePath(str).getPath() : null, str);
    }

    public static long insert(SingleTableDB singleTableDB, ContentValues contentValues) throws Throwable {
        singleTableDB.a();
        return singleTableDB.f41410c.replace(singleTableDB.c(), null, contentValues);
    }

    public static Cursor query(SingleTableDB singleTableDB, String[] strArr, String str, String[] strArr2, String str2) throws Throwable {
        singleTableDB.a();
        return singleTableDB.f41410c.query(singleTableDB.c(), strArr, str, strArr2, null, null, str2);
    }

    public static int update(SingleTableDB singleTableDB, ContentValues contentValues, String str, String[] strArr) throws Throwable {
        singleTableDB.a();
        return singleTableDB.f41410c.update(singleTableDB.c(), contentValues, str, strArr);
    }

    public static SingleTableDB getDatabase(String str, String str2) {
        return new SingleTableDB(str, str2);
    }
}
