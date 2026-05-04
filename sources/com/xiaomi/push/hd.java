package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;

/* loaded from: classes8.dex */
public class hd {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f45710a = false;

    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private Context f45711a;

        /* renamed from: a, reason: collision with other field name */
        private hg f497a;

        public a(Context context, hg hgVar) {
            this.f497a = hgVar;
            this.f45711a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            hd.c(this.f45711a, this.f497a);
        }
    }

    private static void a(Context context) {
        File file = new File(context.getFilesDir() + "/tdReadTemp");
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    private static void b(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 4).edit();
        edit.putLong("last_tiny_data_upload_timestamp", System.currentTimeMillis() / 1000);
        edit.commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (r6.isValid() != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0070, code lost:
    
        r6.release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
    
        com.xiaomi.channel.commonutils.logger.b.a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008e, code lost:
    
        if (r6.isValid() != false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(android.content.Context r11, com.xiaomi.push.hg r12) {
        /*
            java.lang.String r0 = "/"
            java.lang.String r1 = "/tdReadTemp"
            boolean r2 = com.xiaomi.push.hd.f45710a
            if (r2 != 0) goto Lda
            r2 = 1
            com.xiaomi.push.hd.f45710a = r2
            java.io.File r2 = new java.io.File
            java.io.File r3 = r11.getFilesDir()
            java.lang.String r4 = "tiny_data.data"
            r2.<init>(r3, r4)
            boolean r3 = r2.exists()
            java.lang.String r5 = "TinyData no ready file to get data."
            if (r3 != 0) goto L22
            com.xiaomi.channel.commonutils.logger.b.m5639a(r5)
            return
        L22:
            a(r11)
            byte[] r3 = com.xiaomi.push.service.ca.a(r11)
            r6 = 0
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            java.io.File r8 = r11.getFilesDir()     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            java.lang.String r9 = "tiny_data.lock"
            r7.<init>(r8, r9)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            com.xiaomi.push.y.m6304a(r7)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            java.io.RandomAccessFile r8 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            java.lang.String r9 = "rw"
            r8.<init>(r7, r9)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            java.nio.channels.FileChannel r7 = r8.getChannel()     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            java.nio.channels.FileLock r6 = r7.lock()     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            r9.<init>()     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            java.io.File r10 = r11.getFilesDir()     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            r9.append(r10)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            r9.append(r1)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            r9.append(r0)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            r9.append(r4)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            r7.<init>(r9)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            r2.renameTo(r7)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            if (r6 == 0) goto L78
            boolean r2 = r6.isValid()
            if (r2 == 0) goto L78
        L70:
            r6.release()     // Catch: java.io.IOException -> L74
            goto L78
        L74:
            r2 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a(r2)
        L78:
            com.xiaomi.push.y.a(r8)
            goto L91
        L7c:
            r11 = move-exception
            goto Lc6
        L7e:
            r2 = move-exception
            goto L85
        L80:
            r11 = move-exception
            r8 = r6
            goto Lc6
        L83:
            r2 = move-exception
            r8 = r6
        L85:
            com.xiaomi.channel.commonutils.logger.b.a(r2)     // Catch: java.lang.Throwable -> L7c
            if (r6 == 0) goto L78
            boolean r2 = r6.isValid()
            if (r2 == 0) goto L78
            goto L70
        L91:
            java.io.File r2 = new java.io.File
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.io.File r7 = r11.getFilesDir()
            r6.append(r7)
            r6.append(r1)
            r6.append(r0)
            r6.append(r4)
            java.lang.String r0 = r6.toString()
            r2.<init>(r0)
            boolean r0 = r2.exists()
            if (r0 != 0) goto Lb9
            com.xiaomi.channel.commonutils.logger.b.m5639a(r5)
            return
        Lb9:
            a(r11, r12, r2, r3)
            r12 = 0
            com.xiaomi.push.hc.a(r12)
            b(r11)
            com.xiaomi.push.hd.f45710a = r12
            return
        Lc6:
            if (r6 == 0) goto Ld6
            boolean r12 = r6.isValid()
            if (r12 == 0) goto Ld6
            r6.release()     // Catch: java.io.IOException -> Ld2
            goto Ld6
        Ld2:
            r12 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a(r12)
        Ld6:
            com.xiaomi.push.y.a(r8)
            throw r11
        Lda:
            java.lang.String r11 = "TinyData extractTinyData is running"
            com.xiaomi.channel.commonutils.logger.b.m5639a(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.hd.c(android.content.Context, com.xiaomi.push.hg):void");
    }

    public static void a(Context context, hg hgVar) {
        aj.a(context).a(new a(context, hgVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a1, code lost:
    
        r15 = new java.lang.StringBuilder();
        r15.append("TinyData read from cache file failed cause lengthBuffer < 1 || too big. length:");
        r15.append(r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(android.content.Context r12, com.xiaomi.push.hg r13, java.io.File r14, byte[] r15) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 4
            byte[] r2 = new byte[r1]
            r3 = 0
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Lcc
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Lcc
            r5.<init>(r14)     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Lcc
            r4.<init>(r5)     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Lcc
            r3 = 0
        L14:
            r5 = r3
            r6 = r5
        L16:
            int r7 = r4.read(r2)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            r8 = -1
            if (r7 != r8) goto L1f
            goto Lb0
        L1f:
            if (r7 == r1) goto L3f
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            r15.<init>()     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            java.lang.String r1 = "TinyData read from cache file failed cause lengthBuffer error. size:"
            r15.append(r1)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            r15.append(r7)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
        L2e:
            java.lang.String r15 = r15.toString()     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            com.xiaomi.channel.commonutils.logger.b.d(r15)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            goto Lb0
        L37:
            r12 = move-exception
            r3 = r4
            goto Ld4
        L3b:
            r12 = move-exception
            r3 = r4
            goto Lcd
        L3f:
            int r7 = com.xiaomi.push.ac.a(r2)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            r8 = 1
            if (r7 < r8) goto La1
            r8 = 10240(0x2800, float:1.4349E-41)
            if (r7 <= r8) goto L4b
            goto La1
        L4b:
            byte[] r9 = new byte[r7]     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            int r10 = r4.read(r9)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            if (r10 == r7) goto L69
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            r15.<init>()     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            java.lang.String r1 = "TinyData read from cache file failed cause buffer size not equal length. size:"
            r15.append(r1)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            r15.append(r10)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            java.lang.String r1 = "__length:"
            r15.append(r1)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            r15.append(r7)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            goto L2e
        L69:
            byte[] r7 = com.xiaomi.push.h.a(r15, r9)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            if (r7 == 0) goto L9a
            int r9 = r7.length     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            if (r9 != 0) goto L73
            goto L9a
        L73:
            com.xiaomi.push.hl r9 = new com.xiaomi.push.hl     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            r9.<init>()     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            com.xiaomi.push.ir.a(r9, r7)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            java.lang.String r10 = "item_size"
            int r11 = r7.length     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            r9.a(r10, r11)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            r0.add(r9)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            int r5 = r5 + 1
            int r7 = r7.length     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            int r6 = r6 + r7
            r7 = 8
            if (r5 >= r7) goto L92
            if (r6 < r8) goto L16
        L92:
            com.xiaomi.push.he.a(r12, r13, r0)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            r0.clear()     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            goto L14
        L9a:
            java.lang.String r7 = "TinyData read from cache file failed cause decrypt fail"
            com.xiaomi.channel.commonutils.logger.b.d(r7)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            goto L16
        La1:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            r15.<init>()     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            java.lang.String r1 = "TinyData read from cache file failed cause lengthBuffer < 1 || too big. length:"
            r15.append(r1)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            r15.append(r7)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            goto L2e
        Lb0:
            com.xiaomi.push.he.a(r12, r13, r0)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            if (r14 == 0) goto Lc6
            boolean r12 = r14.exists()     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            if (r12 == 0) goto Lc6
            boolean r12 = r14.delete()     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            if (r12 != 0) goto Lc6
            java.lang.String r12 = "TinyData delete reading temp file failed"
            com.xiaomi.channel.commonutils.logger.b.m5639a(r12)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
        Lc6:
            com.xiaomi.push.y.a(r4)
            return
        Lca:
            r12 = move-exception
            goto Ld4
        Lcc:
            r12 = move-exception
        Lcd:
            com.xiaomi.channel.commonutils.logger.b.a(r12)     // Catch: java.lang.Throwable -> Lca
            com.xiaomi.push.y.a(r3)
            return
        Ld4:
            com.xiaomi.push.y.a(r3)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.hd.a(android.content.Context, com.xiaomi.push.hg, java.io.File, byte[]):void");
    }
}
