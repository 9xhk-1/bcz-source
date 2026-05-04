package com.mob.mcl.d;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private a f40553a;

    public c(Context context) {
        this.f40553a = new a(context.getApplicationContext());
    }

    public void a(String str, long j11) {
        try {
            SQLiteDatabase writableDatabase = this.f40553a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("workId", str);
            contentValues.put(HwPayConstant.KEY_EXPIRETIME, Long.valueOf(j11));
            writableDatabase.replace("msg", null, contentValues);
            writableDatabase.close();
        } catch (Throwable th2) {
            b.a().a(th2);
        }
    }

    public void b(String str) {
        try {
            SQLiteDatabase writableDatabase = this.f40553a.getWritableDatabase();
            SQLiteDatabase.class.getDeclaredMethod("execSQL", String.class, Object[].class).invoke(writableDatabase, "delete from msg where workId = ?", new String[]{str});
            writableDatabase.close();
        } catch (Throwable th2) {
            b.a().a(th2);
        }
    }

    public long a(String str) {
        try {
            SQLiteDatabase readableDatabase = this.f40553a.getReadableDatabase();
            Cursor cursor = (Cursor) SQLiteDatabase.class.getMethod("rawQuery", String.class, String[].class).invoke(readableDatabase, "select expireTime from msg where workId = ?", new String[]{str});
            if (cursor.moveToFirst()) {
                return cursor.getLong(cursor.getColumnIndex(HwPayConstant.KEY_EXPIRETIME));
            }
            cursor.close();
            readableDatabase.close();
            return 0L;
        } catch (Throwable th2) {
            b.a().a(th2);
            return 0L;
        }
    }

    public void a() {
        try {
            SQLiteDatabase writableDatabase = this.f40553a.getWritableDatabase();
            SQLiteDatabase.class.getDeclaredMethod("execSQL", String.class, Object[].class).invoke(writableDatabase, "delete from msg where expireTime < ?", new String[]{System.currentTimeMillis() + ""});
            writableDatabase.close();
        } catch (Throwable th2) {
            b.a().a(th2);
        }
    }
}
