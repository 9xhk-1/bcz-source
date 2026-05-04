package com.xiaomi.push.providers;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.xiaomi.channel.commonutils.logger.b;

/* loaded from: classes8.dex */
public class a extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    private static int f46194a = 1;

    /* renamed from: a, reason: collision with other field name */
    public static final Object f859a = new Object();

    /* renamed from: a, reason: collision with other field name */
    private static final String[] f860a = {"package_name", "TEXT", "message_ts", " LONG DEFAULT 0 ", "bytes", " LONG DEFAULT 0 ", "network_type", " INT DEFAULT -1 ", "rcv", " INT DEFAULT -1 ", "imsi", "TEXT"};

    public a(Context context) {
        super(context, "traffic.db", (SQLiteDatabase.CursorFactory) null, f46194a);
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb2 = new StringBuilder("CREATE TABLE traffic(_id INTEGER  PRIMARY KEY ,");
        int i11 = 0;
        while (true) {
            String[] strArr = f860a;
            if (i11 >= strArr.length - 1) {
                sb2.append(");");
                sQLiteDatabase.execSQL(sb2.toString());
                return;
            }
            if (i11 != 0) {
                sb2.append(",");
            }
            sb2.append(strArr[i11]);
            sb2.append(" ");
            sb2.append(strArr[i11 + 1]);
            i11 += 2;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        synchronized (f859a) {
            try {
                a(sQLiteDatabase);
            } catch (SQLException e11) {
                b.a(e11);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
    }
}
