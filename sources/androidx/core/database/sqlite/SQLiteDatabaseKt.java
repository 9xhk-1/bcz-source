package androidx.core.database.sqlite;

import android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.internal.d0;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class SQLiteDatabaseKt {
    public static final <T> T transaction(@k SQLiteDatabase sQLiteDatabase, boolean z11, @k l<? super SQLiteDatabase, ? extends T> lVar) {
        if (z11) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            T invoke = lVar.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return invoke;
        } finally {
            d0.d(1);
            sQLiteDatabase.endTransaction();
            d0.c(1);
        }
    }

    public static /* synthetic */ Object transaction$default(SQLiteDatabase sQLiteDatabase, boolean z11, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if (z11) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            Object invoke = lVar.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return invoke;
        } finally {
            d0.d(1);
            sQLiteDatabase.endTransaction();
            d0.c(1);
        }
    }
}
