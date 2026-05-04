package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.push.aj;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

/* loaded from: classes8.dex */
public abstract class ds extends aj.a {

    /* renamed from: a, reason: collision with root package name */
    protected int f45400a;

    /* renamed from: a, reason: collision with other field name */
    protected Context f265a;

    public ds(Context context, int i11) {
        this.f45400a = i11;
        this.f265a = context;
    }

    public static void a(Context context, hp hpVar) {
        dl m5824a = dm.a().m5824a();
        String a11 = m5824a == null ? "" : m5824a.a();
        if (TextUtils.isEmpty(a11) || TextUtils.isEmpty(hpVar.a())) {
            return;
        }
        a(context, hpVar, a11);
    }

    private String c() {
        return "dc_job_result_time_" + mo5759a();
    }

    private String d() {
        return "dc_job_result_" + mo5759a();
    }

    public abstract hj a();

    public abstract String b();

    /* renamed from: b, reason: collision with other method in class */
    public boolean m5827b() {
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        String b11 = b();
        if (TextUtils.isEmpty(b11)) {
            return;
        }
        if (m5826a()) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("DC run job mutual: " + mo5759a());
            return;
        }
        dl m5824a = dm.a().m5824a();
        String a11 = m5824a == null ? "" : m5824a.a();
        if (!TextUtils.isEmpty(a11) && m5827b()) {
            if (m5828c()) {
                SharedPreferences sharedPreferences = this.f265a.getSharedPreferences("mipush_extra", 0);
                if (bo.a(b11).equals(sharedPreferences.getString(d(), null))) {
                    long j11 = sharedPreferences.getLong(c(), 0L);
                    int a12 = com.xiaomi.push.service.ba.a(this.f265a).a(hm.DCJobUploadRepeatedInterval.a(), 604800);
                    if ((System.currentTimeMillis() - j11) / 1000 < this.f45400a) {
                        return;
                    }
                    if ((System.currentTimeMillis() - j11) / 1000 < a12) {
                        b11 = "same_" + j11;
                    }
                }
            }
            hp hpVar = new hp();
            hpVar.a(b11);
            hpVar.a(System.currentTimeMillis());
            hpVar.a(a());
            a(this.f265a, hpVar, a11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.io.BufferedOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    private static void a(Context context, hp hpVar, String str) {
        RandomAccessFile randomAccessFile;
        FileLock lock;
        File file;
        byte[] b11 = Cdo.b(str, ir.a(hpVar));
        if (b11 == null || b11.length == 0) {
            return;
        }
        synchronized (dp.f45396a) {
            FileLock fileLock = null;
            try {
                try {
                    File file2 = new File(context.getExternalFilesDir(null), "push_cdata.lock");
                    y.m6304a(file2);
                    randomAccessFile = new RandomAccessFile(file2, "rw");
                    try {
                        lock = randomAccessFile.getChannel().lock();
                        try {
                            file = new File(context.getExternalFilesDir(null), "push_cdata.data");
                            context = new BufferedOutputStream(new FileOutputStream(file, true));
                        } catch (IOException e11) {
                            e = e11;
                            context = 0;
                        } catch (Throwable th2) {
                            th = th2;
                            context = 0;
                        }
                    } catch (IOException e12) {
                        e = e12;
                        context = 0;
                    } catch (Throwable th3) {
                        th = th3;
                        context = 0;
                    }
                } catch (IOException unused) {
                }
            } catch (IOException e13) {
                e = e13;
                context = 0;
                randomAccessFile = null;
            } catch (Throwable th4) {
                th = th4;
                context = 0;
                randomAccessFile = null;
            }
            try {
                context.write(ac.a(b11.length));
                context.write(b11);
                context.flush();
                file.setLastModified(0L);
            } catch (IOException e14) {
                e = e14;
                fileLock = lock;
                context = context;
                try {
                    e.printStackTrace();
                    if (fileLock != null && fileLock.isValid()) {
                        fileLock.release();
                        context = context;
                    }
                    y.a((Closeable) context);
                    y.a(randomAccessFile);
                } catch (Throwable th5) {
                    th = th5;
                    if (fileLock != null && fileLock.isValid()) {
                        try {
                            fileLock.release();
                        } catch (IOException unused2) {
                        }
                    }
                    y.a((Closeable) context);
                    y.a(randomAccessFile);
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                fileLock = lock;
                if (fileLock != null) {
                    fileLock.release();
                }
                y.a((Closeable) context);
                y.a(randomAccessFile);
                throw th;
            }
            if (lock != null && lock.isValid()) {
                lock.release();
                context = context;
            }
            y.a((Closeable) context);
            y.a(randomAccessFile);
        }
    }

    /* renamed from: c, reason: collision with other method in class */
    public boolean m5828c() {
        return false;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m5826a() {
        return Cdo.a(this.f265a, String.valueOf(mo5759a()), this.f45400a);
    }
}
