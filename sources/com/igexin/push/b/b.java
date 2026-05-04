package com.igexin.push.b;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.igexin.push.core.e;
import com.igexin.push.core.e.f;

/* loaded from: classes7.dex */
public final class b extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    private static final String f37387a = "DownDBHelper";

    /* renamed from: b, reason: collision with root package name */
    private static final String f37388b = "pushsdk.db";

    /* renamed from: c, reason: collision with root package name */
    private static final int f37389c = 7;

    /* renamed from: d, reason: collision with root package name */
    private static final String f37390d = "create table if not exists config (id integer primary key,value text)";

    /* renamed from: e, reason: collision with root package name */
    private static final String f37391e = "create table if not exists runtime (id integer primary key,value text)";

    /* renamed from: f, reason: collision with root package name */
    private static final String f37392f = "create table if not exists ral (id integer primary key,data text,type integer,time integer,send_times integer)";

    /* renamed from: g, reason: collision with root package name */
    private static final String f37393g = "create table if not exists message (id integer primary key autoincrement,messageid text,taskid text,appid text,info text,msgextra blob,key text,status integer,createtime integer,expect_redisplay_time integer, redisplay_freq integer,redisplay_duration integer ,redisplay_num integer,notify_status integer ) ";

    /* renamed from: h, reason: collision with root package name */
    private static final String f37394h = "create table if not exists bidata (id integer primary key,data text,type integer,time integer)";

    /* renamed from: i, reason: collision with root package name */
    private static final String f37395i = "drop table if exists config";

    /* renamed from: j, reason: collision with root package name */
    private static final String f37396j = "drop table if exists runtime";

    /* renamed from: k, reason: collision with root package name */
    private static final String f37397k = "drop table if exists ral";

    /* renamed from: l, reason: collision with root package name */
    private static final String f37398l = "drop table if exists ca";

    /* renamed from: m, reason: collision with root package name */
    private static final String f37399m = "drop table if exists bi";

    /* renamed from: n, reason: collision with root package name */
    private static final String f37400n = "drop table if exists message";

    /* renamed from: o, reason: collision with root package name */
    private static final String f37401o = "drop table if exists st";

    /* renamed from: p, reason: collision with root package name */
    private static final String f37402p = "drop table if exists bidata";

    /* renamed from: q, reason: collision with root package name */
    private SQLiteDatabase f37403q;

    public b(Context context) {
        super(context, "pushsdk.db", (SQLiteDatabase.CursorFactory) null, 7);
        this.f37403q = null;
    }

    private static String b(String str, String str2) {
        return "delete from " + str + " where " + str2;
    }

    public final int a(String str, String str2) {
        int delete;
        SQLiteDatabase writableDatabase = getWritableDatabase();
        this.f37403q = writableDatabase;
        writableDatabase.beginTransaction();
        int i11 = 0;
        try {
            try {
                delete = this.f37403q.delete(str, str2, null);
            } finally {
                b(this.f37403q);
            }
        } catch (Exception e11) {
            e = e11;
        }
        try {
            com.igexin.c.a.c.a.a("DownDBHelper|del " + delete + " msg", new Object[0]);
            this.f37403q.setTransactionSuccessful();
            return delete;
        } catch (Exception e12) {
            e = e12;
            i11 = delete;
            com.igexin.c.a.c.a.a(e);
            return i11;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        try {
            sQLiteDatabase.execSQL(f37390d);
            sQLiteDatabase.execSQL(f37391e);
            sQLiteDatabase.execSQL(f37393g);
            sQLiteDatabase.execSQL(f37392f);
            sQLiteDatabase.execSQL(f37394h);
            sQLiteDatabase.setTransactionSuccessful();
        } catch (Exception unused) {
        } finally {
            b(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        onUpgrade(sQLiteDatabase, i12, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        f.a().f38105b = true;
        f.d(sQLiteDatabase);
        byte[] a11 = f.a(sQLiteDatabase, 1);
        if (a11 != null) {
            try {
                String str = new String(a11);
                e.f38049z = str.equals("null") ? 0L : Long.parseLong(str);
            } catch (Exception e11) {
                com.igexin.c.a.c.a.a(e11);
            }
            com.igexin.c.a.c.a.a(f.f38080a + "|db version changed, save session = " + e.f38049z, new Object[0]);
        }
        byte[] a12 = f.a(sQLiteDatabase, 20);
        if (a12 != null) {
            String str2 = new String(a12);
            if (str2.equals("null")) {
                str2 = null;
            }
            e.B = str2;
            e.A = str2;
            com.igexin.c.a.c.a.a(f.f38080a + "|db version changed, save cid = " + str2, new Object[0]);
        }
        String b11 = f.b(sQLiteDatabase, 3);
        if (!TextUtils.isEmpty(b11)) {
            if (b11.equals("null")) {
                b11 = null;
            }
            e.L = b11;
        }
        String str3 = e.L;
        String b12 = f.b(sQLiteDatabase, 2);
        if (!TextUtils.isEmpty(b12)) {
            if (b12.equals("null")) {
                b12 = null;
            }
            e.H = b12;
        }
        String b13 = f.b(sQLiteDatabase, 46);
        if (!TextUtils.isEmpty(b13)) {
            if (b13.equals("null")) {
                b13 = null;
            }
            e.I = b13;
        }
        String b14 = f.b(sQLiteDatabase, 48);
        if (!TextUtils.isEmpty(b14)) {
            if (b14.equals("null")) {
                b14 = null;
            }
            e.K = b14;
        }
        String b15 = f.b(sQLiteDatabase, 51);
        if (!TextUtils.isEmpty(b15) && b15.length() != 13) {
            e.C = b15.equals("null") ? null : b15;
        }
        com.igexin.push.core.e.c.a().d(sQLiteDatabase);
        try {
            sQLiteDatabase.execSQL(f37395i);
        } catch (Exception e12) {
            com.igexin.c.a.c.a.a(e12);
        }
        try {
            sQLiteDatabase.execSQL(f37396j);
        } catch (Exception e13) {
            com.igexin.c.a.c.a.a(e13);
        }
        try {
            sQLiteDatabase.execSQL(f37400n);
        } catch (Exception e14) {
            com.igexin.c.a.c.a.a(e14);
        }
        try {
            sQLiteDatabase.execSQL(f37397k);
        } catch (Exception e15) {
            com.igexin.c.a.c.a.a(e15);
        }
        try {
            sQLiteDatabase.execSQL(f37398l);
        } catch (Exception e16) {
            com.igexin.c.a.c.a.a(e16);
        }
        try {
            sQLiteDatabase.execSQL(f37399m);
        } catch (Exception e17) {
            com.igexin.c.a.c.a.a(e17);
        }
        try {
            sQLiteDatabase.execSQL(f37401o);
        } catch (Exception e18) {
            com.igexin.c.a.c.a.a(e18);
        }
        try {
            sQLiteDatabase.execSQL(f37402p);
        } catch (Exception e19) {
            com.igexin.c.a.c.a.a(e19);
        }
        onCreate(sQLiteDatabase);
    }

    private b(Context context, String str, int i11) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i11);
        this.f37403q = null;
    }

    private static void b(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.endTransaction();
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
    }

    public final long a(String str, ContentValues contentValues) {
        long j11;
        SQLiteDatabase writableDatabase = getWritableDatabase();
        this.f37403q = writableDatabase;
        writableDatabase.beginTransaction();
        try {
            try {
                j11 = this.f37403q.insert(str, null, contentValues);
                try {
                    this.f37403q.setTransactionSuccessful();
                } catch (Exception unused) {
                }
            } finally {
                b(this.f37403q);
            }
        } catch (Exception unused2) {
            j11 = -1;
        }
        return j11;
    }

    private Cursor a(String str, String[] strArr) {
        SQLiteDatabase readableDatabase = getReadableDatabase();
        this.f37403q = readableDatabase;
        try {
            return readableDatabase.rawQuery(str, strArr);
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
            return null;
        }
    }

    public final Cursor a(String str, String[] strArr, String str2) {
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.f37403q = readableDatabase;
            return readableDatabase.query(str, strArr, str2, null, null, null, null);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            return null;
        }
    }

    public final Cursor a(String str, String[] strArr, String[] strArr2, String[] strArr3, String str2) {
        Cursor cursor;
        String[] strArr4;
        SQLiteDatabase sQLiteDatabase;
        int length;
        SQLiteDatabase readableDatabase = getReadableDatabase();
        this.f37403q = readableDatabase;
        readableDatabase.beginTransaction();
        try {
            try {
                if (strArr == null) {
                    cursor = this.f37403q.query(str, strArr3, null, null, null, null, str2);
                } else {
                    if (strArr.length != 1) {
                        strArr4 = strArr2;
                        sQLiteDatabase = this.f37403q;
                        length = strArr.length;
                    } else if (strArr2.length == 1) {
                        cursor = this.f37403q.query(str, strArr3, strArr[0] + "= ?", strArr2, null, null, str2);
                    } else {
                        strArr4 = strArr2;
                        sQLiteDatabase = this.f37403q;
                        length = strArr4.length;
                    }
                    cursor = sQLiteDatabase.query(str, strArr3, a(strArr, strArr4, length), null, null, null, str2);
                }
                try {
                    this.f37403q.setTransactionSuccessful();
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                cursor = null;
            }
            b(this.f37403q);
            return cursor;
        } catch (Throwable th2) {
            b(this.f37403q);
            throw th2;
        }
    }

    private static String a(String[] strArr, String[] strArr2, int i11) {
        StringBuilder sb2 = new StringBuilder(" ");
        if (strArr.length == 1) {
            for (int i12 = 0; i12 < i11; i12++) {
                sb2.append(strArr[0]);
                sb2.append(" = '");
                sb2.append(strArr2[i12]);
                sb2.append("'");
                if (i12 < i11 - 1) {
                    sb2.append(" or ");
                }
            }
        } else {
            for (int i13 = 0; i13 < i11; i13++) {
                sb2.append(strArr[i13]);
                sb2.append(" = '");
                sb2.append(strArr2[i13]);
                sb2.append("'");
                if (i13 < i11 - 1) {
                    sb2.append(" and ");
                }
            }
        }
        return sb2.toString();
    }

    private static void a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                if (sQLiteDatabase.isOpen()) {
                    sQLiteDatabase.close();
                }
            } catch (Exception unused) {
                com.igexin.c.a.c.a.a(f37387a, "closecurrentDatabase fail");
            }
        }
    }

    public final void a(String str, ContentValues contentValues, String[] strArr, String[] strArr2) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        this.f37403q = writableDatabase;
        writableDatabase.beginTransaction();
        try {
            try {
                this.f37403q.update(str, contentValues, strArr[0] + "='" + strArr2[0] + "'", null);
                this.f37403q.setTransactionSuccessful();
            } catch (Exception unused) {
                com.igexin.c.a.c.a.a(f37387a, str + "_Update Error!");
            }
        } finally {
            b(this.f37403q);
        }
    }

    private void a(String str, String str2, ContentValues contentValues) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        this.f37403q = writableDatabase;
        try {
            writableDatabase.replace(str, str2, contentValues);
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
        }
    }

    public final void a(String str, String[] strArr, String[] strArr2) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        this.f37403q = writableDatabase;
        writableDatabase.beginTransaction();
        try {
            try {
                if (strArr2.length == 1) {
                    com.igexin.c.a.c.a.a("DownDBHelper|del " + str + " cnt = " + this.f37403q.delete(str, strArr[0] + " = ?", strArr2), new Object[0]);
                } else {
                    this.f37403q.execSQL(b(str, a(strArr, strArr2, strArr2.length)));
                }
                this.f37403q.setTransactionSuccessful();
            } catch (Exception unused) {
                com.igexin.c.a.c.a.a(f37387a, str + "_Delete Error!");
            }
            b(this.f37403q);
        } catch (Throwable th2) {
            b(this.f37403q);
            throw th2;
        }
    }

    private boolean a(String str) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        this.f37403q = writableDatabase;
        writableDatabase.beginTransaction();
        try {
            try {
                this.f37403q.execSQL(str);
                this.f37403q.setTransactionSuccessful();
                b(this.f37403q);
                return true;
            } catch (Exception e11) {
                com.igexin.c.a.c.a.a(e11);
                b(this.f37403q);
                return false;
            }
        } catch (Throwable th2) {
            b(this.f37403q);
            throw th2;
        }
    }
}
