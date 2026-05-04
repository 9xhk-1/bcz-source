package com.getui.gtc.b;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static C0346a f29776a;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        if (r2 != null) goto L24;
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x005f: MOVE (r1 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:96), block:B:45:0x005e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r10) {
        /*
            java.lang.String r0 = "gtc.db"
            java.io.File r0 = r10.getDatabasePath(r0)
            boolean r0 = r0.exists()
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            com.getui.gtc.b.a$a r0 = com.getui.gtc.b.a.f29776a
            if (r0 != 0) goto L19
            com.getui.gtc.b.a$a r0 = new com.getui.gtc.b.a$a
            r0.<init>(r10)
            com.getui.gtc.b.a.f29776a = r0
        L19:
            com.getui.gtc.b.a$a r0 = com.getui.gtc.b.a.f29776a     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L78
            android.database.sqlite.SQLiteDatabase r2 = r0.getReadableDatabase()     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L78
            java.lang.String r3 = "i"
            java.lang.String r0 = "b"
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L70
            java.lang.String r5 = "a=?"
            java.lang.String r0 = "100"
            java.lang.String[] r6 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L70
            r8 = 0
            r9 = 0
            r7 = 0
            android.database.Cursor r3 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L70
            if (r3 == 0) goto L64
            boolean r0 = r3.moveToNext()     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L61
            if (r0 == 0) goto L64
            r0 = 0
            byte[] r0 = r3.getBlob(r0)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L61
            if (r0 == 0) goto L64
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L61
            java.lang.String r10 = r10.getPackageName()     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L61
            java.lang.String r10 = com.getui.gtc.i.a.a.a(r10)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L61
            byte[] r10 = com.getui.gtc.i.a.b.a(r0, r10)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L61
            r4.<init>(r10)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L61
            r3.close()
            r2.close()
            return r4
        L5d:
            r0 = move-exception
            r10 = r0
            r1 = r3
            goto L88
        L61:
            r0 = move-exception
            r10 = r0
            goto L7c
        L64:
            if (r3 == 0) goto L69
            r3.close()
        L69:
            r2.close()
            goto L87
        L6d:
            r0 = move-exception
            r10 = r0
            goto L88
        L70:
            r0 = move-exception
            r10 = r0
            r3 = r1
            goto L7c
        L74:
            r0 = move-exception
            r10 = r0
            r2 = r1
            goto L88
        L78:
            r0 = move-exception
            r10 = r0
            r2 = r1
            r3 = r2
        L7c:
            com.getui.gtc.i.c.a.b(r10)     // Catch: java.lang.Throwable -> L5d
            if (r3 == 0) goto L84
            r3.close()
        L84:
            if (r2 == 0) goto L87
            goto L69
        L87:
            return r1
        L88:
            if (r1 == 0) goto L8d
            r1.close()
        L8d:
            if (r2 == 0) goto L92
            r2.close()
        L92:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getui.gtc.b.a.a(android.content.Context):java.lang.String");
    }

    /* renamed from: com.getui.gtc.b.a$a, reason: collision with other inner class name */
    public static class C0346a extends SQLiteOpenHelper {
        public C0346a(Context context) {
            super(context, "gtc.db", (SQLiteDatabase.CursorFactory) null, 5);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        }
    }
}
