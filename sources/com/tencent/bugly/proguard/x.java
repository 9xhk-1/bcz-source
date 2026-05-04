package com.tencent.bugly.proguard;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class x extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    public static String f42693a = "bugly_db";

    /* renamed from: b, reason: collision with root package name */
    public static int f42694b = 16;

    /* renamed from: c, reason: collision with root package name */
    protected Context f42695c;

    /* renamed from: d, reason: collision with root package name */
    private List<o> f42696d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Context context, List<o> list) {
        super(context, f42693a + "_", (SQLiteDatabase.CursorFactory) null, f42694b);
        aa.a(context).getClass();
        this.f42695c = context;
        this.f42696d = list;
    }

    private synchronized boolean a(SQLiteDatabase sQLiteDatabase) {
        try {
            String[] strArr = {"t_lr", "t_ui", "t_pf"};
            for (int i11 = 0; i11 < 3; i11++) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(String.valueOf(strArr[i11])), new String[0]);
            }
        } catch (Throwable th2) {
            if (!al.b(th2)) {
                th2.printStackTrace();
            }
            return false;
        }
        return true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final synchronized SQLiteDatabase getReadableDatabase() {
        SQLiteDatabase sQLiteDatabase;
        sQLiteDatabase = null;
        int i11 = 0;
        while (sQLiteDatabase == null && i11 < 5) {
            i11++;
            try {
                sQLiteDatabase = super.getReadableDatabase();
            } catch (Throwable unused) {
                al.d("[Database] Try to get db(count: %d).", Integer.valueOf(i11));
                if (i11 == 5) {
                    al.e("[Database] Failed to get db.", new Object[0]);
                }
                try {
                    Thread.sleep(200L);
                } catch (InterruptedException e11) {
                    e11.printStackTrace();
                }
            }
        }
        return sQLiteDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final synchronized SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase sQLiteDatabase;
        sQLiteDatabase = null;
        int i11 = 0;
        while (sQLiteDatabase == null && i11 < 5) {
            i11++;
            try {
                sQLiteDatabase = super.getWritableDatabase();
            } catch (Throwable unused) {
                al.d("[Database] Try to get db(count: %d).", Integer.valueOf(i11));
                if (i11 == 5) {
                    al.e("[Database] Failed to get db.", new Object[0]);
                }
                try {
                    Thread.sleep(200L);
                } catch (InterruptedException e11) {
                    e11.printStackTrace();
                }
            }
        }
        if (sQLiteDatabase == null) {
            al.d("[Database] db error delay error record 1min.", new Object[0]);
        }
        return sQLiteDatabase;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00e5 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00e7 A[Catch: all -> 0x00df, TRY_ENTER, TryCatch #2 {all -> 0x00df, blocks: (B:4:0x00e1, B:9:0x00e7, B:10:0x00eb, B:12:0x00f1, B:19:0x00fc, B:22:0x0102, B:31:0x00d5, B:33:0x00db, B:3:0x0001, B:14:0x00f7), top: B:2:0x0001, inners: #0, #1 }] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void onCreate(android.database.sqlite.SQLiteDatabase r5) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.x.onCreate(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @TargetApi(11)
    public final synchronized void onDowngrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        try {
            if (ab.c() >= 11) {
                al.d("[Database] Downgrade %d to %d drop tables.", Integer.valueOf(i11), Integer.valueOf(i12));
                List<o> list = this.f42696d;
                if (list != null) {
                    Iterator<o> it = list.iterator();
                    while (it.hasNext()) {
                        try {
                            it.next().onDbDowngrade(sQLiteDatabase, i11, i12);
                        } catch (Throwable th2) {
                            if (!al.b(th2)) {
                                th2.printStackTrace();
                            }
                        }
                    }
                }
                if (a(sQLiteDatabase)) {
                    onCreate(sQLiteDatabase);
                    return;
                }
                al.d("[Database] Failed to drop, delete db.", new Object[0]);
                File databasePath = this.f42695c.getDatabasePath(f42693a);
                if (databasePath != null && databasePath.canWrite()) {
                    databasePath.delete();
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final synchronized void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        try {
            al.d("[Database] Upgrade %d to %d , drop tables!", Integer.valueOf(i11), Integer.valueOf(i12));
            List<o> list = this.f42696d;
            if (list != null) {
                Iterator<o> it = list.iterator();
                while (it.hasNext()) {
                    try {
                        it.next().onDbUpgrade(sQLiteDatabase, i11, i12);
                    } catch (Throwable th2) {
                        if (!al.b(th2)) {
                            th2.printStackTrace();
                        }
                    }
                }
            }
            if (a(sQLiteDatabase)) {
                onCreate(sQLiteDatabase);
                return;
            }
            al.d("[Database] Failed to drop, delete db.", new Object[0]);
            File databasePath = this.f42695c.getDatabasePath(f42693a);
            if (databasePath != null && databasePath.canWrite()) {
                databasePath.delete();
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
