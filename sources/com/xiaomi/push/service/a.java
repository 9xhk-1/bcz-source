package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

/* loaded from: classes8.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f46223a;

    /* renamed from: a, reason: collision with other field name */
    private Context f904a;

    /* renamed from: e, reason: collision with root package name */
    private volatile String f46227e;

    /* renamed from: f, reason: collision with root package name */
    private volatile String f46228f;

    /* renamed from: a, reason: collision with other field name */
    private final Object f905a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Object f46224b = new Object();

    /* renamed from: a, reason: collision with other field name */
    private final String f906a = "mipush_region";

    /* renamed from: b, reason: collision with other field name */
    private final String f907b = "mipush_country_code";

    /* renamed from: c, reason: collision with root package name */
    private final String f46225c = "mipush_region.lock";

    /* renamed from: d, reason: collision with root package name */
    private final String f46226d = "mipush_country_code.lock";

    public a(Context context) {
        this.f904a = context;
    }

    public static a a(Context context) {
        if (f46223a == null) {
            synchronized (a.class) {
                try {
                    if (f46223a == null) {
                        f46223a = new a(context);
                    }
                } finally {
                }
            }
        }
        return f46223a;
    }

    public String b() {
        if (TextUtils.isEmpty(this.f46228f)) {
            this.f46228f = a(this.f904a, "mipush_country_code", "mipush_country_code.lock", this.f46224b);
        }
        return this.f46228f;
    }

    public String a() {
        if (TextUtils.isEmpty(this.f46227e)) {
            this.f46227e = a(this.f904a, "mipush_region", "mipush_region.lock", this.f905a);
        }
        return this.f46227e;
    }

    public void b(String str, boolean z11) {
        if (!TextUtils.equals(str, this.f46228f)) {
            this.f46228f = str;
        }
        if (z11) {
            a(this.f904a, str, "mipush_country_code", "mipush_region.lock", this.f905a);
        }
    }

    private String a(Context context, String str, String str2, Object obj) {
        RandomAccessFile randomAccessFile;
        FileLock fileLock;
        File file = new File(context.getFilesDir(), str);
        FileLock fileLock2 = null;
        if (!file.exists()) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("No ready file to get data from " + str);
            return null;
        }
        synchronized (obj) {
            try {
                File file2 = new File(context.getFilesDir(), str2);
                com.xiaomi.push.y.m6304a(file2);
                randomAccessFile = new RandomAccessFile(file2, "rw");
                try {
                    fileLock = randomAccessFile.getChannel().lock();
                    try {
                        try {
                            String a11 = com.xiaomi.push.y.a(file);
                            if (fileLock != null && fileLock.isValid()) {
                                try {
                                    fileLock.release();
                                } catch (IOException e11) {
                                    com.xiaomi.channel.commonutils.logger.b.a(e11);
                                }
                            }
                            com.xiaomi.push.y.a(randomAccessFile);
                            return a11;
                        } catch (Exception e12) {
                            e = e12;
                            com.xiaomi.channel.commonutils.logger.b.a(e);
                            if (fileLock != null && fileLock.isValid()) {
                                try {
                                    fileLock.release();
                                } catch (IOException e13) {
                                    com.xiaomi.channel.commonutils.logger.b.a(e13);
                                }
                            }
                            com.xiaomi.push.y.a(randomAccessFile);
                            return null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileLock2 = fileLock;
                        if (fileLock2 != null && fileLock2.isValid()) {
                            try {
                                fileLock2.release();
                            } catch (IOException e14) {
                                com.xiaomi.channel.commonutils.logger.b.a(e14);
                            }
                        }
                        com.xiaomi.push.y.a(randomAccessFile);
                        throw th;
                    }
                } catch (Exception e15) {
                    e = e15;
                    fileLock = null;
                } catch (Throwable th3) {
                    th = th3;
                    if (fileLock2 != null) {
                        fileLock2.release();
                    }
                    com.xiaomi.push.y.a(randomAccessFile);
                    throw th;
                }
            } catch (Exception e16) {
                e = e16;
                randomAccessFile = null;
                fileLock = null;
            } catch (Throwable th4) {
                th = th4;
                randomAccessFile = null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        if (r0.isValid() != false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(android.content.Context r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.Object r8) {
        /*
            r3 = this;
            monitor-enter(r8)
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            java.io.File r2 = r4.getFilesDir()     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            r1.<init>(r2, r7)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            com.xiaomi.push.y.m6304a(r1)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            java.lang.String r2 = "rw"
            r7.<init>(r1, r2)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            java.nio.channels.FileChannel r1 = r7.getChannel()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            java.nio.channels.FileLock r0 = r1.lock()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            java.io.File r4 = r4.getFilesDir()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            r1.<init>(r4, r6)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            com.xiaomi.push.y.a(r1, r5)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            if (r0 == 0) goto L3b
            boolean r4 = r0.isValid()     // Catch: java.lang.Throwable -> L35
            if (r4 == 0) goto L3b
        L31:
            r0.release()     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L37
            goto L3b
        L35:
            r4 = move-exception
            goto L6a
        L37:
            r4 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a(r4)     // Catch: java.lang.Throwable -> L35
        L3b:
            com.xiaomi.push.y.a(r7)     // Catch: java.lang.Throwable -> L35
            goto L54
        L3f:
            r4 = move-exception
            goto L56
        L41:
            r4 = move-exception
            goto L48
        L43:
            r4 = move-exception
            r7 = r0
            goto L56
        L46:
            r4 = move-exception
            r7 = r0
        L48:
            com.xiaomi.channel.commonutils.logger.b.a(r4)     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L3b
            boolean r4 = r0.isValid()     // Catch: java.lang.Throwable -> L35
            if (r4 == 0) goto L3b
            goto L31
        L54:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L35
            return
        L56:
            if (r0 == 0) goto L66
            boolean r5 = r0.isValid()     // Catch: java.lang.Throwable -> L35
            if (r5 == 0) goto L66
            r0.release()     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L62
            goto L66
        L62:
            r5 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a(r5)     // Catch: java.lang.Throwable -> L35
        L66:
            com.xiaomi.push.y.a(r7)     // Catch: java.lang.Throwable -> L35
            throw r4     // Catch: java.lang.Throwable -> L35
        L6a:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L35
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.a.a(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void");
    }

    public void a(String str, boolean z11) {
        if (!TextUtils.equals(str, this.f46227e)) {
            this.f46227e = str;
        }
        if (z11) {
            a(this.f904a, str, "mipush_region", "mipush_region.lock", this.f905a);
        }
    }
}
