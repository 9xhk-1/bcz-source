package com.tencent.bugly.proguard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f42672a = false;

    /* renamed from: b, reason: collision with root package name */
    private static w f42673b;

    /* renamed from: c, reason: collision with root package name */
    private static x f42674c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends Thread {

        /* renamed from: b, reason: collision with root package name */
        private int f42676b = 4;

        /* renamed from: c, reason: collision with root package name */
        private v f42677c = null;

        /* renamed from: d, reason: collision with root package name */
        private String f42678d;

        /* renamed from: e, reason: collision with root package name */
        private ContentValues f42679e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f42680f;

        /* renamed from: g, reason: collision with root package name */
        private String[] f42681g;

        /* renamed from: h, reason: collision with root package name */
        private String f42682h;

        /* renamed from: i, reason: collision with root package name */
        private String[] f42683i;

        /* renamed from: j, reason: collision with root package name */
        private String f42684j;

        /* renamed from: k, reason: collision with root package name */
        private String f42685k;

        /* renamed from: l, reason: collision with root package name */
        private String f42686l;

        /* renamed from: m, reason: collision with root package name */
        private String f42687m;

        /* renamed from: n, reason: collision with root package name */
        private String f42688n;

        /* renamed from: o, reason: collision with root package name */
        private String[] f42689o;

        /* renamed from: p, reason: collision with root package name */
        private int f42690p;

        /* renamed from: q, reason: collision with root package name */
        private String f42691q;

        /* renamed from: r, reason: collision with root package name */
        private byte[] f42692r;

        public a() {
        }

        public final void a(int i11, String str, byte[] bArr) {
            this.f42690p = i11;
            this.f42691q = str;
            this.f42692r = bArr;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            switch (this.f42676b) {
                case 1:
                    w.this.a(this.f42678d, this.f42679e, this.f42677c);
                    break;
                case 2:
                    w.this.a(this.f42678d, this.f42688n, this.f42689o, this.f42677c);
                    break;
                case 3:
                    Cursor a11 = w.this.a(this.f42680f, this.f42678d, this.f42681g, this.f42682h, this.f42683i, this.f42684j, this.f42685k, this.f42686l, this.f42687m, this.f42677c);
                    if (a11 != null) {
                        a11.close();
                        break;
                    }
                    break;
                case 4:
                    w.this.a(this.f42690p, this.f42691q, this.f42692r, this.f42677c);
                    break;
                case 5:
                    w.this.a(this.f42690p, this.f42677c);
                    break;
                case 6:
                    w.this.a(this.f42690p, this.f42691q, this.f42677c);
                    break;
            }
        }
    }

    private w(Context context, List<o> list) {
        f42674c = new x(context, list);
    }

    private synchronized boolean b(y yVar) {
        ContentValues d11;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = f42674c.getWritableDatabase();
            if (sQLiteDatabase == null || (d11 = d(yVar)) == null) {
                return false;
            }
            long replace = sQLiteDatabase.replace("t_pf", "_id", d11);
            if (replace < 0) {
                if (f42672a) {
                    sQLiteDatabase.close();
                }
                return false;
            }
            al.c("[Database] insert %s success.", "t_pf");
            yVar.f42697a = replace;
            if (f42672a) {
                sQLiteDatabase.close();
            }
            return true;
        } catch (Throwable th2) {
            try {
                if (!al.a(th2)) {
                    th2.printStackTrace();
                }
                if (f42672a && sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                return false;
            } finally {
                if (f42672a && sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
            }
        }
    }

    private static ContentValues c(y yVar) {
        if (yVar == null) {
            return null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            long j11 = yVar.f42697a;
            if (j11 > 0) {
                contentValues.put("_id", Long.valueOf(j11));
            }
            contentValues.put("_tp", Integer.valueOf(yVar.f42698b));
            contentValues.put("_pc", yVar.f42699c);
            contentValues.put("_th", yVar.f42700d);
            contentValues.put("_tm", Long.valueOf(yVar.f42701e));
            byte[] bArr = yVar.f42703g;
            if (bArr != null) {
                contentValues.put("_dt", bArr);
            }
            return contentValues;
        } catch (Throwable th2) {
            if (!al.a(th2)) {
                th2.printStackTrace();
            }
            return null;
        }
    }

    private static ContentValues d(y yVar) {
        if (yVar != null && !ap.b(yVar.f42702f)) {
            try {
                ContentValues contentValues = new ContentValues();
                long j11 = yVar.f42697a;
                if (j11 > 0) {
                    contentValues.put("_id", Long.valueOf(j11));
                }
                contentValues.put("_tp", yVar.f42702f);
                contentValues.put("_tm", Long.valueOf(yVar.f42701e));
                byte[] bArr = yVar.f42703g;
                if (bArr != null) {
                    contentValues.put("_dt", bArr);
                }
                return contentValues;
            } catch (Throwable th2) {
                if (!al.a(th2)) {
                    th2.printStackTrace();
                }
            }
        }
        return null;
    }

    public static synchronized w a(Context context, List<o> list) {
        w wVar;
        synchronized (w.class) {
            try {
                if (f42673b == null) {
                    f42673b = new w(context, list);
                }
                wVar = f42673b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wVar;
    }

    public static synchronized w a() {
        w wVar;
        synchronized (w.class) {
            wVar = f42673b;
        }
        return wVar;
    }

    public final Cursor a(String str, String[] strArr, String str2) {
        return a(str, strArr, str2, (String) null, (String) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c6, code lost:
    
        if (r2 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00a9, code lost:
    
        if (r2 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00c8, code lost:
    
        r2.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized java.util.List<com.tencent.bugly.proguard.y> c(int r11) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.w.c(int):java.util.List");
    }

    public final Cursor a(String str, String[] strArr, String str2, String str3, String str4) {
        return a(false, str, strArr, str2, null, null, null, str3, str4, null);
    }

    public final int a(String str, String str2) {
        return a(str, str2, (String[]) null, (v) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
    
        if (0 != 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized long a(java.lang.String r7, android.content.ContentValues r8, com.tencent.bugly.proguard.v r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = -1
            r9 = 0
            com.tencent.bugly.proguard.x r2 = com.tencent.bugly.proguard.w.f42674c     // Catch: java.lang.Throwable -> L24
            android.database.sqlite.SQLiteDatabase r9 = r2.getWritableDatabase()     // Catch: java.lang.Throwable -> L24
            if (r9 == 0) goto L30
            if (r8 == 0) goto L30
            java.lang.String r2 = "_id"
            long r2 = r9.replace(r7, r2, r8)     // Catch: java.lang.Throwable -> L24
            r4 = 0
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 < 0) goto L26
            java.lang.String r8 = "[Database] insert %s success."
            java.lang.Object[] r7 = new java.lang.Object[]{r7}     // Catch: java.lang.Throwable -> L24
            com.tencent.bugly.proguard.al.c(r8, r7)     // Catch: java.lang.Throwable -> L24
            goto L2f
        L24:
            r7 = move-exception
            goto L3c
        L26:
            java.lang.String r8 = "[Database] replace %s error."
            java.lang.Object[] r7 = new java.lang.Object[]{r7}     // Catch: java.lang.Throwable -> L24
            com.tencent.bugly.proguard.al.d(r8, r7)     // Catch: java.lang.Throwable -> L24
        L2f:
            r0 = r2
        L30:
            boolean r7 = com.tencent.bugly.proguard.w.f42672a     // Catch: java.lang.Throwable -> L3a
            if (r7 == 0) goto L4f
            if (r9 == 0) goto L4f
        L36:
            r9.close()     // Catch: java.lang.Throwable -> L3a
            goto L4f
        L3a:
            r7 = move-exception
            goto L5b
        L3c:
            boolean r8 = com.tencent.bugly.proguard.al.a(r7)     // Catch: java.lang.Throwable -> L46
            if (r8 != 0) goto L48
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L46
            goto L48
        L46:
            r7 = move-exception
            goto L51
        L48:
            boolean r7 = com.tencent.bugly.proguard.w.f42672a     // Catch: java.lang.Throwable -> L3a
            if (r7 == 0) goto L4f
            if (r9 == 0) goto L4f
            goto L36
        L4f:
            monitor-exit(r6)
            return r0
        L51:
            boolean r8 = com.tencent.bugly.proguard.w.f42672a     // Catch: java.lang.Throwable -> L3a
            if (r8 == 0) goto L5a
            if (r9 == 0) goto L5a
            r9.close()     // Catch: java.lang.Throwable -> L3a
        L5a:
            throw r7     // Catch: java.lang.Throwable -> L3a
        L5b:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L3a
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.w.a(java.lang.String, android.content.ContentValues, com.tencent.bugly.proguard.v):long");
    }

    public final synchronized void b(int i11) {
        String concat;
        SQLiteDatabase writableDatabase = f42674c.getWritableDatabase();
        if (writableDatabase != null) {
            if (i11 >= 0) {
                try {
                    concat = "_tp = ".concat(String.valueOf(i11));
                } catch (Throwable th2) {
                    try {
                        if (!al.a(th2)) {
                            th2.printStackTrace();
                        }
                        if (f42672a) {
                            writableDatabase.close();
                            return;
                        }
                    } finally {
                        if (f42672a) {
                            writableDatabase.close();
                        }
                    }
                }
            } else {
                concat = null;
            }
            al.c("[Database] deleted %s data %d", "t_lr", Integer.valueOf(writableDatabase.delete("t_lr", concat, null)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized Cursor a(boolean z11, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6, v vVar) {
        Cursor cursor;
        cursor = null;
        try {
            SQLiteDatabase writableDatabase = f42674c.getWritableDatabase();
            if (writableDatabase != null) {
                cursor = writableDatabase.query(z11, str, strArr, str2, strArr2, str3, str4, str5, str6);
            }
        } finally {
            try {
                return cursor;
            } finally {
            }
        }
        return cursor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002e, code lost:
    
        if (r0 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized int a(java.lang.String r3, java.lang.String r4, java.lang.String[] r5, com.tencent.bugly.proguard.v r6) {
        /*
            r2 = this;
            monitor-enter(r2)
            r6 = 0
            r0 = 0
            com.tencent.bugly.proguard.x r1 = com.tencent.bugly.proguard.w.f42674c     // Catch: java.lang.Throwable -> L10
            android.database.sqlite.SQLiteDatabase r0 = r1.getWritableDatabase()     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L12
            int r6 = r0.delete(r3, r4, r5)     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r3 = move-exception
            goto L1e
        L12:
            boolean r3 = com.tencent.bugly.proguard.w.f42672a     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L31
            if (r0 == 0) goto L31
        L18:
            r0.close()     // Catch: java.lang.Throwable -> L1c
            goto L31
        L1c:
            r3 = move-exception
            goto L3d
        L1e:
            boolean r4 = com.tencent.bugly.proguard.al.a(r3)     // Catch: java.lang.Throwable -> L28
            if (r4 != 0) goto L2a
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L28
            goto L2a
        L28:
            r3 = move-exception
            goto L33
        L2a:
            boolean r3 = com.tencent.bugly.proguard.w.f42672a     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L31
            if (r0 == 0) goto L31
            goto L18
        L31:
            monitor-exit(r2)
            return r6
        L33:
            boolean r4 = com.tencent.bugly.proguard.w.f42672a     // Catch: java.lang.Throwable -> L1c
            if (r4 == 0) goto L3c
            if (r0 == 0) goto L3c
            r0.close()     // Catch: java.lang.Throwable -> L1c
        L3c:
            throw r3     // Catch: java.lang.Throwable -> L1c
        L3d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.w.a(java.lang.String, java.lang.String, java.lang.String[], com.tencent.bugly.proguard.v):int");
    }

    private static y b(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            y yVar = new y();
            yVar.f42697a = cursor.getLong(cursor.getColumnIndex("_id"));
            yVar.f42701e = cursor.getLong(cursor.getColumnIndex("_tm"));
            yVar.f42702f = cursor.getString(cursor.getColumnIndex("_tp"));
            yVar.f42703g = cursor.getBlob(cursor.getColumnIndex("_dt"));
            return yVar;
        } catch (Throwable th2) {
            if (!al.a(th2)) {
                th2.printStackTrace();
            }
            return null;
        }
    }

    public final boolean a(int i11, String str, byte[] bArr, boolean z11) {
        if (!z11) {
            a aVar = new a();
            aVar.a(i11, str, bArr);
            ak.a().a(aVar);
            return true;
        }
        return a(i11, str, bArr, (v) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i11, String str, byte[] bArr, v vVar) {
        try {
            y yVar = new y();
            yVar.f42697a = i11;
            yVar.f42702f = str;
            yVar.f42701e = System.currentTimeMillis();
            yVar.f42703g = bArr;
            return b(yVar);
        } catch (Throwable th2) {
            if (al.a(th2)) {
                return false;
            }
            th2.printStackTrace();
            return false;
        }
    }

    public final Map<String, byte[]> a(int i11, v vVar) {
        HashMap hashMap = null;
        try {
            List<y> c11 = c(i11);
            if (c11 == null) {
                return null;
            }
            HashMap hashMap2 = new HashMap();
            try {
                for (y yVar : c11) {
                    byte[] bArr = yVar.f42703g;
                    if (bArr != null) {
                        hashMap2.put(yVar.f42702f, bArr);
                    }
                }
                return hashMap2;
            } catch (Throwable th2) {
                th = th2;
                hashMap = hashMap2;
                if (!al.a(th)) {
                    th.printStackTrace();
                }
                return hashMap;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final synchronized boolean a(y yVar) {
        ContentValues c11;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = f42674c.getWritableDatabase();
            if (sQLiteDatabase == null || (c11 = c(yVar)) == null) {
                return false;
            }
            long replace = sQLiteDatabase.replace("t_lr", "_id", c11);
            if (replace >= 0) {
                al.c("[Database] insert %s success.", "t_lr");
                yVar.f42697a = replace;
                if (f42672a) {
                    sQLiteDatabase.close();
                }
                return true;
            }
            if (f42672a) {
                sQLiteDatabase.close();
            }
            return false;
        } catch (Throwable th2) {
            try {
                if (!al.a(th2)) {
                    th2.printStackTrace();
                }
                if (f42672a && sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                return false;
            } finally {
                if (f42672a && sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ae A[Catch: all -> 0x00b2, TRY_LEAVE, TryCatch #1 {all -> 0x00b2, blocks: (B:47:0x00a8, B:49:0x00ae), top: B:46:0x00a8, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b7 A[Catch: all -> 0x0031, TRY_ENTER, TryCatch #0 {all -> 0x0031, blocks: (B:3:0x0001, B:11:0x002d, B:12:0x0035, B:14:0x0039, B:39:0x009c, B:41:0x00a3, B:52:0x00b7, B:53:0x00ba, B:55:0x00be, B:59:0x00c4, B:60:0x00c7, B:62:0x00cb, B:63:0x00ce, B:47:0x00a8, B:49:0x00ae), top: B:2:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00be A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:3:0x0001, B:11:0x002d, B:12:0x0035, B:14:0x0039, B:39:0x009c, B:41:0x00a3, B:52:0x00b7, B:53:0x00ba, B:55:0x00be, B:59:0x00c4, B:60:0x00c7, B:62:0x00cb, B:63:0x00ce, B:47:0x00a8, B:49:0x00ae), top: B:2:0x0001, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.List<com.tencent.bugly.proguard.y> a(int r11) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.w.a(int):java.util.List");
    }

    public final synchronized void a(List<y> list) {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    SQLiteDatabase writableDatabase = f42674c.getWritableDatabase();
                    if (writableDatabase != null) {
                        StringBuilder sb2 = new StringBuilder();
                        for (y yVar : list) {
                            sb2.append(" or _id = ");
                            sb2.append(yVar.f42697a);
                        }
                        String sb3 = sb2.toString();
                        if (sb3.length() > 0) {
                            sb3 = sb3.substring(4);
                        }
                        sb2.setLength(0);
                        try {
                            al.c("[Database] deleted %s data %d", "t_lr", Integer.valueOf(writableDatabase.delete("t_lr", sb3, null)));
                        } catch (Throwable th2) {
                            try {
                                if (!al.a(th2)) {
                                    th2.printStackTrace();
                                }
                                if (f42672a) {
                                    writableDatabase.close();
                                }
                            } finally {
                                if (f42672a) {
                                    writableDatabase.close();
                                }
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    private static y a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            y yVar = new y();
            yVar.f42697a = cursor.getLong(cursor.getColumnIndex("_id"));
            yVar.f42698b = cursor.getInt(cursor.getColumnIndex("_tp"));
            yVar.f42699c = cursor.getString(cursor.getColumnIndex("_pc"));
            yVar.f42700d = cursor.getString(cursor.getColumnIndex("_th"));
            yVar.f42701e = cursor.getLong(cursor.getColumnIndex("_tm"));
            yVar.f42703g = cursor.getBlob(cursor.getColumnIndex("_dt"));
            return yVar;
        } catch (Throwable th2) {
            if (!al.a(th2)) {
                th2.printStackTrace();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean a(int i11, String str, v vVar) {
        boolean z11;
        String str2;
        z11 = false;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase writableDatabase = f42674c.getWritableDatabase();
            if (writableDatabase != null) {
                try {
                    if (ap.b(str)) {
                        str2 = "_id = ".concat(String.valueOf(i11));
                    } else {
                        str2 = "_id = " + i11 + " and _tp = \"" + str + "\"";
                    }
                    int delete = writableDatabase.delete("t_pf", str2, null);
                    al.c("[Database] deleted %s data %d", "t_pf", Integer.valueOf(delete));
                    if (delete > 0) {
                        z11 = true;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteDatabase = writableDatabase;
                    try {
                        if (!al.a(th)) {
                            th.printStackTrace();
                        }
                        return z11;
                    } finally {
                        if (f42672a && sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                        }
                    }
                }
            }
            if (f42672a && writableDatabase != null) {
                writableDatabase.close();
            }
        } catch (Throwable th3) {
            th = th3;
        }
        return z11;
    }
}
