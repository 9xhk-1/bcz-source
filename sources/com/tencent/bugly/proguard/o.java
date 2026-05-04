package com.tencent.bugly.proguard;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class o {

    /* renamed from: id, reason: collision with root package name */
    public int f42618id;
    public String moduleName;
    public String version;
    public String versionKey;

    public abstract String[] getTables();

    public abstract void init(Context context, boolean z11, BuglyStrategy buglyStrategy);

    public void onDbDowngrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        try {
            if (getTables() == null) {
                return;
            }
            for (String str : getTables()) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(String.valueOf(str)));
            }
            onDbCreate(sQLiteDatabase);
        } catch (Throwable th2) {
            if (al.b(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    public void onDbUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        try {
            if (getTables() == null) {
                return;
            }
            for (String str : getTables()) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(String.valueOf(str)));
            }
            onDbCreate(sQLiteDatabase);
        } catch (Throwable th2) {
            if (al.b(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    public void onDbCreate(SQLiteDatabase sQLiteDatabase) {
    }

    public void onServerStrategyChanged(StrategyBean strategyBean) {
    }
}
