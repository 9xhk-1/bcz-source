package com.zx.a.I8b7;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public b f46490a;

    public abstract String a();

    public void a(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
    }

    public final SQLiteDatabase b() {
        b bVar = this.f46490a;
        if (bVar != null) {
            return bVar.b().getReadableDatabase();
        }
        StringBuilder a11 = f3.a("table ");
        a11.append(c());
        a11.append(" has not been added to a db");
        throw new RuntimeException(a11.toString());
    }

    public abstract String c();

    public final SQLiteDatabase d() {
        b bVar = this.f46490a;
        if (bVar != null) {
            return bVar.b().getWritableDatabase();
        }
        throw new RuntimeException("table zx_table has not been added to a db");
    }
}
