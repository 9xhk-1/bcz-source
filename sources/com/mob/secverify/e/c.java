package com.mob.secverify.e;

import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.DeviceHelper;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.ResHelper;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.HashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static c f40726a;

    /* renamed from: b, reason: collision with root package name */
    private String f40727b;

    private c() {
    }

    public static c a() {
        if (f40726a == null) {
            synchronized (c.class) {
                try {
                    if (f40726a == null) {
                        f40726a = new c();
                    }
                } finally {
                }
            }
        }
        return f40726a;
    }

    private String c() {
        return g.c();
    }

    private String d() {
        HashMap hashMap;
        try {
            HashMap<String, Object> e11 = e();
            if (e11 == null || e11.isEmpty() || (hashMap = (HashMap) e11.get("deviceInfo")) == null || hashMap.isEmpty()) {
                return null;
            }
            return (String) hashMap.get("oaid");
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().b(th2);
            return null;
        }
    }

    private HashMap<String, Object> e() {
        try {
            return a(ResHelper.getDataCacheFile(MobSDK.getContext(), "comm/dbs/.duid"));
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().b(th2);
            return null;
        }
    }

    public String b() {
        if (TextUtils.isEmpty(this.f40727b)) {
            String c11 = c();
            this.f40727b = c11;
            if (TextUtils.isEmpty(c11)) {
                String d11 = d();
                this.f40727b = d11;
                if (!TextUtils.isEmpty(d11)) {
                    a(this.f40727b);
                }
            }
        }
        return this.f40727b;
    }

    private void a(String str) {
        g.b(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (r2 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (r2 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0026, code lost:
    
        if (r1.isEmpty() != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.HashMap<java.lang.String, java.lang.Object> a(java.io.File r3) {
        /*
            boolean r0 = r3.exists()
            r1 = 0
            if (r0 == 0) goto L35
            boolean r0 = r3.isFile()
            if (r0 == 0) goto L35
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L1f
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L1f
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L1f
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r0 = r2.readObject()     // Catch: java.lang.Throwable -> L20
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: java.lang.Throwable -> L20
            r1 = r0
            goto L20
        L1f:
            r2 = r1
        L20:
            if (r1 == 0) goto L28
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L2c
        L28:
            java.util.HashMap r1 = b(r3)     // Catch: java.lang.Throwable -> L32
        L2c:
            if (r2 == 0) goto L35
        L2e:
            r2.close()     // Catch: java.lang.Throwable -> L35
            goto L35
        L32:
            if (r2 == 0) goto L35
            goto L2e
        L35:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.secverify.e.c.a(java.io.File):java.util.HashMap");
    }

    private static HashMap<String, Object> b(File file) {
        if (file.exists()) {
            try {
                FileChannel channel = new FileInputStream(file).getChannel();
                ByteBuffer allocate = ByteBuffer.allocate((int) channel.size());
                while (channel.read(allocate) > 0) {
                }
                return a(DeviceHelper.getInstance(MobSDK.getContext()).getModel(), allocate.array());
            } catch (Throwable unused) {
            }
        }
        return new HashMap<>();
    }

    private static HashMap<String, Object> a(String str, byte[] bArr) {
        try {
            return new Hashon().fromJson(Data.AES128Decode(str, bArr));
        } catch (Throwable unused) {
            return new HashMap<>();
        }
    }
}
