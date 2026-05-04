package com.zx.a.I8b7;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class a extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f46421a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i11) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i11);
        this.f46421a = bVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        try {
            Iterator<Class<? extends c>> it = this.f46421a.f46462a.keySet().iterator();
            while (it.hasNext()) {
                sQLiteDatabase.execSQL(this.f46421a.f46462a.get(it.next()).a());
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
        } catch (Throwable th2) {
            sQLiteDatabase.endTransaction();
            throw th2;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        sQLiteDatabase.beginTransaction();
        try {
            Iterator<Class<? extends c>> it = this.f46421a.f46462a.keySet().iterator();
            while (it.hasNext()) {
                this.f46421a.f46462a.get(it.next()).getClass();
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
        } catch (Throwable th2) {
            sQLiteDatabase.endTransaction();
            throw th2;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        sQLiteDatabase.beginTransaction();
        try {
            Iterator<Class<? extends c>> it = this.f46421a.f46462a.keySet().iterator();
            while (it.hasNext()) {
                this.f46421a.f46462a.get(it.next()).a(sQLiteDatabase, i11, i12);
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
        } catch (Throwable th2) {
            sQLiteDatabase.endTransaction();
            throw th2;
        }
    }
}
