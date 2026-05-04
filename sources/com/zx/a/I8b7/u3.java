package com.zx.a.I8b7;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Base64;
import com.baicizhan.client.business.dataset.provider.a;
import com.zx.a.I8b7.l2;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class u3 extends c {

    /* renamed from: b, reason: collision with root package name */
    public SQLiteDatabase f46715b = null;

    @Override // com.zx.a.I8b7.c
    public String a() {
        return "CREATE TABLE IF NOT EXISTS zx_table (key integer primary key, value text)";
    }

    public void b(int i11) {
        if (i11 != m3.f46602r) {
            m3.f46602r = i11;
            m3.f46604t = -1;
            a(14, m3.f46602r + "", false);
            a(7, m3.f46604t + "", false);
        }
    }

    @Override // com.zx.a.I8b7.c
    public String c() {
        return "zx_table";
    }

    public void d(int i11) {
        if (i11 != m3.f46598n) {
            m3.f46598n = i11;
            l2.a.f46573a.f46572a.a(3, m3.f46598n + "", false);
            r2.a("syncId had changed refresh:" + i11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        return com.zx.a.I8b7.m3.f46603s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        if (r1 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int e() {
        /*
            r11 = this;
            java.lang.String r0 = "value"
            r1 = 0
            java.lang.String r2 = "key"
            java.lang.String[] r5 = new java.lang.String[]{r2, r0}     // Catch: java.lang.Throwable -> L32
            java.lang.String r6 = "key=20"
            android.database.sqlite.SQLiteDatabase r3 = r11.b()     // Catch: java.lang.Throwable -> L32
            java.lang.String r4 = r11.c()     // Catch: java.lang.Throwable -> L32
            r9 = 0
            r10 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L34
            boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L34
            int r0 = r1.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L32
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L32
            com.zx.a.I8b7.m3.f46603s = r0     // Catch: java.lang.Throwable -> L32
            goto L34
        L32:
            r0 = move-exception
            goto L37
        L34:
            if (r1 == 0) goto L3f
            goto L3c
        L37:
            com.zx.a.I8b7.r2.a(r0)     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L3f
        L3c:
            r1.close()
        L3f:
            int r0 = com.zx.a.I8b7.m3.f46603s
            return r0
        L42:
            r0 = move-exception
            if (r1 == 0) goto L48
            r1.close()
        L48:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zx.a.I8b7.u3.e():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        return com.zx.a.I8b7.m3.f46602r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        if (r1 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int f() {
        /*
            r11 = this;
            java.lang.String r0 = "value"
            r1 = 0
            java.lang.String r2 = "key"
            java.lang.String[] r5 = new java.lang.String[]{r2, r0}     // Catch: java.lang.Throwable -> L32
            java.lang.String r6 = "key=14"
            android.database.sqlite.SQLiteDatabase r3 = r11.b()     // Catch: java.lang.Throwable -> L32
            java.lang.String r4 = r11.c()     // Catch: java.lang.Throwable -> L32
            r9 = 0
            r10 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L34
            boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L34
            int r0 = r1.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L32
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L32
            com.zx.a.I8b7.m3.f46602r = r0     // Catch: java.lang.Throwable -> L32
            goto L34
        L32:
            r0 = move-exception
            goto L37
        L34:
            if (r1 == 0) goto L3f
            goto L3c
        L37:
            com.zx.a.I8b7.r2.a(r0)     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L3f
        L3c:
            r1.close()
        L3f:
            int r0 = com.zx.a.I8b7.m3.f46602r
            return r0
        L42:
            r0 = move-exception
            if (r1 == 0) goto L48
            r1.close()
        L48:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zx.a.I8b7.u3.f():int");
    }

    public IvParameterSpec g() {
        Cursor cursor;
        IvParameterSpec ivParameterSpec = null;
        try {
            cursor = b().query(c(), new String[]{a.d.C0245a.f16161a, "value"}, "key=10", null, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToNext()) {
                        ivParameterSpec = new IvParameterSpec(Base64.decode(cursor.getString(cursor.getColumnIndex("value")), 0));
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        r2.a(th);
                    } finally {
                        if (cursor != null) {
                            cursor.close();
                        }
                    }
                }
            }
            if (cursor == null) {
                return ivParameterSpec;
            }
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
        return ivParameterSpec;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        return com.zx.a.I8b7.m3.f46604t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        if (r1 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int h() {
        /*
            r11 = this;
            java.lang.String r0 = "value"
            r1 = 0
            java.lang.String r2 = "key"
            java.lang.String[] r5 = new java.lang.String[]{r2, r0}     // Catch: java.lang.Throwable -> L32
            java.lang.String r6 = "key=7"
            android.database.sqlite.SQLiteDatabase r3 = r11.b()     // Catch: java.lang.Throwable -> L32
            java.lang.String r4 = r11.c()     // Catch: java.lang.Throwable -> L32
            r9 = 0
            r10 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L34
            boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L34
            int r0 = r1.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L32
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L32
            com.zx.a.I8b7.m3.f46604t = r0     // Catch: java.lang.Throwable -> L32
            goto L34
        L32:
            r0 = move-exception
            goto L37
        L34:
            if (r1 == 0) goto L3f
            goto L3c
        L37:
            com.zx.a.I8b7.r2.a(r0)     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L3f
        L3c:
            r1.close()
        L3f:
            int r0 = com.zx.a.I8b7.m3.f46604t
            return r0
        L42:
            r0 = move-exception
            if (r1 == 0) goto L48
            r1.close()
        L48:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zx.a.I8b7.u3.h():int");
    }

    public SecretKey i() {
        Cursor cursor;
        SecretKeySpec secretKeySpec = null;
        try {
            cursor = b().query(c(), new String[]{a.d.C0245a.f16161a, "value"}, "key=9", null, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToNext()) {
                        byte[] decode = Base64.decode(cursor.getString(cursor.getColumnIndex("value")), 0);
                        SecureRandom secureRandom = p.f46646a;
                        secretKeySpec = new SecretKeySpec(decode, "AES");
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        r2.a(th);
                    } finally {
                        if (cursor != null) {
                            cursor.close();
                        }
                    }
                }
            }
            if (cursor == null) {
                return secretKeySpec;
            }
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
        return secretKeySpec;
    }

    @Override // com.zx.a.I8b7.c
    public void a(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        r2.a("ZXID数据库升级, drop zx_table表");
        try {
            sQLiteDatabase.execSQL("drop table if exists zx_table");
        } catch (Exception e11) {
            r2.a(e11);
        }
        sQLiteDatabase.beginTransaction();
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS zx_table (key integer primary key, value text)");
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public void c(int i11) {
        if (i11 != m3.f46604t) {
            m3.f46604t = i11;
            a(7, m3.f46604t + "", false);
        }
    }

    public void a(byte[] bArr) {
        String str = new String(Base64.encode(bArr, 0), StandardCharsets.UTF_8);
        a(9, str + "", false);
        r2.a("ZXID saveSecretKey secretStr:" + str);
    }

    public final void a(int i11, String str, boolean z11) {
        String str2;
        if (this.f46715b == null) {
            this.f46715b = d();
        }
        if (z11) {
            try {
                str2 = new String(Base64.encode(p.b("AES/CBC/PKCS5Padding", m3.f46606v, m3.f46607w, str.getBytes()), 0), StandardCharsets.UTF_8);
            } catch (Exception e11) {
                r2.b("ZXID updateDBValue valueID:" + i11 + ",value:" + str + ",error:" + e11.toString());
                return;
            }
        } else {
            str2 = str;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(a.d.C0245a.f16161a, Integer.valueOf(i11));
        contentValues.put("value", str2);
        r2.a("replace resultId = " + this.f46715b.replace("zx_table", null, contentValues));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (r2 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(int r13) {
        /*
            r12 = this;
            java.lang.String r0 = "value"
            java.lang.String r1 = ""
            r2 = 0
            java.lang.String r3 = "key"
            java.lang.String[] r6 = new java.lang.String[]{r3, r0}     // Catch: java.lang.Throwable -> L54
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L54
            r3.<init>()     // Catch: java.lang.Throwable -> L54
            java.lang.String r4 = "key="
            r3.append(r4)     // Catch: java.lang.Throwable -> L54
            r3.append(r13)     // Catch: java.lang.Throwable -> L54
            java.lang.String r7 = r3.toString()     // Catch: java.lang.Throwable -> L54
            android.database.sqlite.SQLiteDatabase r4 = r12.b()     // Catch: java.lang.Throwable -> L54
            java.lang.String r5 = r12.c()     // Catch: java.lang.Throwable -> L54
            r10 = 0
            r11 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L54
            if (r2 == 0) goto L57
            boolean r13 = r2.moveToNext()     // Catch: java.lang.Throwable -> L54
            if (r13 == 0) goto L57
            int r13 = r2.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L54
            java.lang.String r1 = r2.getString(r13)     // Catch: java.lang.Throwable -> L54
            r13 = 0
            byte[] r13 = android.util.Base64.decode(r1, r13)     // Catch: java.lang.Throwable -> L54
            java.lang.String r0 = "AES/CBC/PKCS5Padding"
            javax.crypto.SecretKey r3 = com.zx.a.I8b7.m3.f46606v     // Catch: java.lang.Throwable -> L54
            javax.crypto.spec.IvParameterSpec r4 = com.zx.a.I8b7.m3.f46607w     // Catch: java.lang.Throwable -> L54
            byte[] r13 = com.zx.a.I8b7.p.a(r0, r3, r4, r13)     // Catch: java.lang.Throwable -> L54
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L54
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L54
            r0.<init>(r13, r3)     // Catch: java.lang.Throwable -> L54
            r1 = r0
            goto L57
        L54:
            r0 = move-exception
            r13 = r0
            goto L5b
        L57:
            if (r2 == 0) goto L5a
            goto L60
        L5a:
            return r1
        L5b:
            com.zx.a.I8b7.r2.a(r13)     // Catch: java.lang.Throwable -> L64
            if (r2 == 0) goto L63
        L60:
            r2.close()
        L63:
            return r1
        L64:
            r0 = move-exception
            r13 = r0
            if (r2 == 0) goto L6b
            r2.close()
        L6b:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zx.a.I8b7.u3.a(int):java.lang.String");
    }

    public final void a(String str, byte[] bArr) throws Exception {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        File file = new File(m3.f46585a.getFilesDir().getAbsolutePath() + File.separator + "zx-core-" + str + ".zip");
        if (file.createNewFile()) {
            FileOutputStream fileOutputStream = new FileOutputStream(file, true);
            byte[] bArr2 = new byte[2048];
            while (true) {
                int read = byteArrayInputStream.read(bArr2);
                if (read != -1) {
                    fileOutputStream.write(bArr2, 0, read);
                } else {
                    fileOutputStream.close();
                    byteArrayInputStream.close();
                    return;
                }
            }
        } else {
            throw new IOException("zx createNewFile exception");
        }
    }

    public void a(String str) {
        IvParameterSpec g11;
        SecretKey i11;
        JSONObject a11;
        Cursor cursor = null;
        try {
            g11 = g();
            i11 = i();
            a11 = a(g11, i11);
        } catch (Throwable th2) {
            try {
                r2.a(th2);
                if (0 == 0) {
                    return;
                }
            } finally {
            }
        }
        if (a11 == null) {
            return;
        }
        String string = a11.getString("mainVersion");
        String string2 = a11.getString("checksum");
        if (TextUtils.equals(string, str)) {
            cursor = b().query("zx_table", new String[]{a.d.C0245a.f16161a, "value"}, "key=17", null, null, null, null);
            if (cursor != null && cursor.moveToNext()) {
                byte[] a12 = p.a("AES/CBC/PKCS5Padding", i11, g11, Base64.decode(cursor.getString(cursor.getColumnIndex("value")), 0));
                if (TextUtils.equals(string2, p.a("SHA256", a12))) {
                    a(str, a12);
                } else {
                    throw new IOException("zx checksum1 exception");
                }
            }
            if (cursor == null) {
                return;
            }
            cursor.close();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (r2 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0047, code lost:
    
        if (r2 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0055, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0052, code lost:
    
        r2.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject a(javax.crypto.spec.IvParameterSpec r12, javax.crypto.SecretKey r13) {
        /*
            r11 = this;
            java.lang.String r0 = "value"
            r1 = 0
            java.lang.String r2 = "key"
            java.lang.String[] r5 = new java.lang.String[]{r2, r0}     // Catch: java.lang.Throwable -> L4a
            java.lang.String r6 = "key=18"
            android.database.sqlite.SQLiteDatabase r3 = r11.b()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r4 = "zx_table"
            r9 = 0
            r10 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto L47
            boolean r3 = r2.moveToNext()     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto L47
            int r0 = r2.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L44
            java.lang.String r0 = r2.getString(r0)     // Catch: java.lang.Throwable -> L44
            r3 = 0
            byte[] r0 = android.util.Base64.decode(r0, r3)     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = "AES/CBC/PKCS5Padding"
            byte[] r12 = com.zx.a.I8b7.p.a(r3, r13, r12, r0)     // Catch: java.lang.Throwable -> L44
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L44
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L44
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L44
            r0.<init>(r12, r3)     // Catch: java.lang.Throwable -> L44
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L44
            r2.close()
            return r13
        L44:
            r0 = move-exception
            r12 = r0
            goto L4d
        L47:
            if (r2 == 0) goto L55
            goto L52
        L4a:
            r0 = move-exception
            r12 = r0
            r2 = r1
        L4d:
            com.zx.a.I8b7.r2.a(r12)     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L55
        L52:
            r2.close()
        L55:
            return r1
        L56:
            r0 = move-exception
            r12 = r0
            if (r2 == 0) goto L5d
            r2.close()
        L5d:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zx.a.I8b7.u3.a(javax.crypto.spec.IvParameterSpec, javax.crypto.SecretKey):org.json.JSONObject");
    }
}
