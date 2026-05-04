package com.xiaomi.push;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.xiaomi.push.ci;

/* loaded from: classes8.dex */
class ck implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f45347a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ ci.a f209a;

    public ck(ci.a aVar, Context context) {
        this.f209a = aVar;
        this.f45347a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                sQLiteDatabase = this.f209a.a();
                if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                    sQLiteDatabase.beginTransaction();
                    this.f209a.a(this.f45347a, sQLiteDatabase);
                    sQLiteDatabase.setTransactionSuccessful();
                }
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Exception e11) {
                        e = e11;
                        com.xiaomi.channel.commonutils.logger.b.a(e);
                        this.f209a.a(this.f45347a);
                    }
                }
                cg cgVar = this.f209a.f200a;
                if (cgVar != null) {
                    cgVar.close();
                }
            } catch (Exception e12) {
                com.xiaomi.channel.commonutils.logger.b.a(e12);
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Exception e13) {
                        e = e13;
                        com.xiaomi.channel.commonutils.logger.b.a(e);
                        this.f209a.a(this.f45347a);
                    }
                }
                cg cgVar2 = this.f209a.f200a;
                if (cgVar2 != null) {
                    cgVar2.close();
                }
            }
            this.f209a.a(this.f45347a);
        } catch (Throwable th2) {
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.endTransaction();
                } catch (Exception e14) {
                    com.xiaomi.channel.commonutils.logger.b.a(e14);
                    this.f209a.a(this.f45347a);
                    throw th2;
                }
            }
            cg cgVar3 = this.f209a.f200a;
            if (cgVar3 != null) {
                cgVar3.close();
            }
            this.f209a.a(this.f45347a);
            throw th2;
        }
    }
}
