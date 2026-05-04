package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.push.aj;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class du extends aj.a {

    /* renamed from: a, reason: collision with root package name */
    private Context f45401a;

    /* renamed from: a, reason: collision with other field name */
    private SharedPreferences f266a;

    /* renamed from: a, reason: collision with other field name */
    private com.xiaomi.push.service.ba f267a;

    public du(Context context) {
        this.f45401a = context;
        this.f266a = context.getSharedPreferences("mipush_extra", 0);
        this.f267a = com.xiaomi.push.service.ba.a(context);
    }

    private boolean b() {
        if (!this.f267a.a(hm.Upload3GSwitch.a(), true)) {
            return false;
        }
        return Math.abs((System.currentTimeMillis() / 1000) - this.f266a.getLong("last_upload_data_timestamp", -1L)) > ((long) Math.max(86400, this.f267a.a(hm.Upload3GFrequency.a(), 432000)));
    }

    private boolean c() {
        if (!this.f267a.a(hm.Upload4GSwitch.a(), true)) {
            return false;
        }
        return Math.abs((System.currentTimeMillis() / 1000) - this.f266a.getLong("last_upload_data_timestamp", -1L)) > ((long) Math.max(86400, this.f267a.a(hm.Upload4GFrequency.a(), 259200)));
    }

    @Override // com.xiaomi.push.aj.a
    /* renamed from: a */
    public String mo5759a() {
        return "1";
    }

    @Override // java.lang.Runnable
    public void run() {
        File file = new File(this.f45401a.getExternalFilesDir(null), "push_cdata.data");
        if (!bi.d(this.f45401a)) {
            if (file.length() > 1863680) {
                file.delete();
                return;
            }
            return;
        }
        if (!m5829a() && file.exists()) {
            List<hp> a11 = a(file);
            if (!ad.a(a11)) {
                int size = a11.size();
                if (size > 4000) {
                    a11 = a11.subList(size - 4000, size);
                }
                ia iaVar = new ia();
                iaVar.a(a11);
                byte[] a12 = y.a(ir.a(iaVar));
                ig igVar = new ig("-1", false);
                igVar.c(hr.DataCollection.f538a);
                igVar.a(a12);
                dl m5824a = dm.a().m5824a();
                if (m5824a != null) {
                    m5824a.a(igVar, hh.Notification, null);
                }
                a();
            }
            file.delete();
        }
    }

    private List<hp> a(File file) {
        RandomAccessFile randomAccessFile;
        FileInputStream fileInputStream;
        FileLock lock;
        dl m5824a = dm.a().m5824a();
        String a11 = m5824a == null ? "" : m5824a.a();
        FileLock fileLock = null;
        if (TextUtils.isEmpty(a11)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        byte[] bArr = new byte[4];
        synchronized (dp.f45396a) {
            try {
                try {
                    File file2 = new File(this.f45401a.getExternalFilesDir(null), "push_cdata.lock");
                    y.m6304a(file2);
                    randomAccessFile = new RandomAccessFile(file2, "rw");
                    try {
                        lock = randomAccessFile.getChannel().lock();
                        try {
                            fileInputStream = new FileInputStream(file);
                            while (fileInputStream.read(bArr) == 4) {
                                try {
                                    int a12 = ac.a(bArr);
                                    byte[] bArr2 = new byte[a12];
                                    if (fileInputStream.read(bArr2) != a12) {
                                        break;
                                    }
                                    byte[] a13 = Cdo.a(a11, bArr2);
                                    if (a13 != null && a13.length != 0) {
                                        hp hpVar = new hp();
                                        ir.a(hpVar, a13);
                                        arrayList.add(hpVar);
                                        a(hpVar);
                                    }
                                } catch (Exception unused) {
                                    fileLock = lock;
                                    if (fileLock != null && fileLock.isValid()) {
                                        fileLock.release();
                                    }
                                    y.a((Closeable) fileInputStream);
                                    y.a(randomAccessFile);
                                    return arrayList;
                                } catch (Throwable th2) {
                                    th = th2;
                                    fileLock = lock;
                                    if (fileLock != null && fileLock.isValid()) {
                                        try {
                                            fileLock.release();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                    y.a((Closeable) fileInputStream);
                                    y.a(randomAccessFile);
                                    throw th;
                                }
                            }
                        } catch (Exception unused3) {
                            fileInputStream = null;
                        } catch (Throwable th3) {
                            th = th3;
                            fileInputStream = null;
                        }
                    } catch (Exception unused4) {
                        fileInputStream = null;
                    } catch (Throwable th4) {
                        th = th4;
                        fileInputStream = null;
                    }
                } catch (IOException unused5) {
                }
            } catch (Exception unused6) {
                randomAccessFile = null;
                fileInputStream = null;
            } catch (Throwable th5) {
                th = th5;
                randomAccessFile = null;
                fileInputStream = null;
            }
            if (lock != null && lock.isValid()) {
                lock.release();
            }
            y.a((Closeable) fileInputStream);
            y.a(randomAccessFile);
        }
        return arrayList;
    }

    private void a() {
        SharedPreferences.Editor edit = this.f266a.edit();
        edit.putLong("last_upload_data_timestamp", System.currentTimeMillis() / 1000);
        edit.commit();
    }

    private void a(hp hpVar) {
        if (hpVar.f529a != hj.AppInstallList || hpVar.f530a.startsWith("same_")) {
            return;
        }
        SharedPreferences.Editor edit = this.f266a.edit();
        edit.putLong("dc_job_result_time_4", hpVar.f528a);
        edit.putString("dc_job_result_4", bo.a(hpVar.f530a));
        edit.commit();
    }

    /* renamed from: a, reason: collision with other method in class */
    private boolean m5829a() {
        if (bi.e(this.f45401a)) {
            return false;
        }
        if ((bi.g(this.f45401a) || bi.f(this.f45401a)) && !c()) {
            return true;
        }
        return (bi.h(this.f45401a) && !b()) || bi.i(this.f45401a);
    }
}
