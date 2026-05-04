package com.meizu.cloud.pushsdk.d.d;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* loaded from: classes7.dex */
public class b extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    private static final String f39773a = "com.meizu.cloud.pushsdk.d.d.b";

    /* renamed from: b, reason: collision with root package name */
    private static b f39774b;

    private b(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    public static b a(Context context, String str) {
        if (f39774b == null) {
            f39774b = new b(context.getApplicationContext(), str);
        }
        return f39774b;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS 'events' (id INTEGER PRIMARY KEY, eventData BLOB, dateCreated TIMESTAMP DEFAULT CURRENT_TIMESTAMP)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        com.meizu.cloud.pushsdk.d.f.c.b(f39773a, "Upgrading database from version " + i11 + " to " + i12 + ". Destroying old data now..", new Object[0]);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'events'");
        onCreate(sQLiteDatabase);
    }
}
