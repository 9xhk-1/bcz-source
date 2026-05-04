package com.tencent.open.log;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.tauth.Tencent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class a extends Tracer implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    private b f44518a;

    /* renamed from: b, reason: collision with root package name */
    private FileWriter f44519b;

    /* renamed from: c, reason: collision with root package name */
    private FileWriter f44520c;

    /* renamed from: d, reason: collision with root package name */
    private File f44521d;

    /* renamed from: e, reason: collision with root package name */
    private File f44522e;

    /* renamed from: f, reason: collision with root package name */
    private char[] f44523f;

    /* renamed from: g, reason: collision with root package name */
    private volatile f f44524g;

    /* renamed from: h, reason: collision with root package name */
    private volatile f f44525h;

    /* renamed from: i, reason: collision with root package name */
    private volatile f f44526i;

    /* renamed from: j, reason: collision with root package name */
    private volatile f f44527j;

    /* renamed from: k, reason: collision with root package name */
    private volatile boolean f44528k;

    /* renamed from: l, reason: collision with root package name */
    private HandlerThread f44529l;

    /* renamed from: m, reason: collision with root package name */
    private Handler f44530m;

    public a(b bVar) {
        this(c.f44542b, true, g.f44562a, bVar);
    }

    private void f() {
        if (Thread.currentThread() == this.f44529l && !this.f44528k) {
            this.f44528k = true;
            j();
            try {
                try {
                    this.f44527j.a(g(), this.f44523f);
                } catch (IOException e11) {
                    SLog.e("FileTracer", "flushBuffer exception", e11);
                }
                this.f44528k = false;
            } finally {
                this.f44527j.b();
            }
        }
    }

    private Writer[] g() {
        File[] a11 = c().a();
        if (a11 != null && a11.length >= 2) {
            File file = a11[0];
            if ((file != null && !file.equals(this.f44521d)) || (this.f44519b == null && file != null)) {
                this.f44521d = file;
                h();
                try {
                    this.f44519b = new FileWriter(this.f44521d, true);
                } catch (IOException unused) {
                    this.f44519b = null;
                    SLog.e(SLog.TAG, "-->obtainFileWriter() old log file permission denied");
                }
            }
            File file2 = a11[1];
            if ((file2 != null && !file2.equals(this.f44522e)) || (this.f44520c == null && file2 != null)) {
                this.f44522e = file2;
                i();
                try {
                    this.f44520c = new FileWriter(this.f44522e, true);
                } catch (IOException unused2) {
                    this.f44520c = null;
                    SLog.e(SLog.TAG, "-->obtainFileWriter() app specific file permission denied");
                }
                a(file2);
            }
        }
        return new Writer[]{this.f44519b, this.f44520c};
    }

    private void h() {
        try {
            FileWriter fileWriter = this.f44519b;
            if (fileWriter != null) {
                fileWriter.flush();
                this.f44519b.close();
            }
        } catch (IOException e11) {
            SLog.e(SLog.TAG, "-->closeFileWriter() exception:", e11);
        }
    }

    private void i() {
        try {
            FileWriter fileWriter = this.f44520c;
            if (fileWriter != null) {
                fileWriter.flush();
                this.f44520c.close();
            }
        } catch (IOException e11) {
            SLog.e(SLog.TAG, "-->closeAppSpecificFileWriter() exception:", e11);
        }
    }

    private void j() {
        synchronized (this) {
            try {
                if (this.f44526i == this.f44524g) {
                    this.f44526i = this.f44525h;
                    this.f44527j = this.f44524g;
                } else {
                    this.f44526i = this.f44524g;
                    this.f44527j = this.f44525h;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a() {
        if (this.f44530m.hasMessages(1024)) {
            this.f44530m.removeMessages(1024);
        }
        this.f44530m.sendEmptyMessage(1024);
    }

    public void b() {
        h();
        i();
        this.f44529l.quit();
    }

    public b c() {
        return this.f44518a;
    }

    @Override // com.tencent.open.log.Tracer
    public void doTrace(int i11, Thread thread, long j11, String str, String str2, Throwable th2) {
        a(e().a(i11, thread, j11, str, str2, th2));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1024) {
            return true;
        }
        f();
        return true;
    }

    public a(int i11, boolean z11, g gVar, b bVar) {
        super(i11, z11, gVar);
        this.f44528k = false;
        a(bVar);
        this.f44524g = new f();
        this.f44525h = new f();
        this.f44526i = this.f44524g;
        this.f44527j = this.f44525h;
        this.f44523f = new char[bVar.d()];
        HandlerThread handlerThread = new HandlerThread(bVar.c(), bVar.f());
        this.f44529l = handlerThread;
        handlerThread.start();
        if (!this.f44529l.isAlive() || this.f44529l.getLooper() == null) {
            return;
        }
        this.f44530m = new Handler(this.f44529l.getLooper(), this);
    }

    private void a(String str) {
        this.f44526i.a(str);
        if (this.f44526i.a() >= c().d()) {
            a();
        }
    }

    private boolean b(File file) {
        if (file == null) {
            return false;
        }
        String name = file.getName();
        SLog.d("FileTracer", "name=" + name);
        return !TextUtils.isEmpty(name) && name.length() == 47 && name.startsWith("com.tencent.mobileqq_connectSdk.") && name.endsWith(".log");
    }

    private void a(File file) {
        File[] listFiles;
        File parentFile = file.getParentFile();
        if (parentFile == null || !parentFile.exists() || !parentFile.isDirectory() || (listFiles = parentFile.listFiles()) == null) {
            return;
        }
        for (File file2 : listFiles) {
            if (b(file2)) {
                String name = file2.getName();
                if (b.a(System.currentTimeMillis() - (Tencent.USE_ONE_HOUR ? 3600000L : 259200000L)).compareTo(name.substring(32, 43)) > 0) {
                    SLog.d("FileTracer", "delete name=" + name + ", success=" + file2.delete());
                }
            }
        }
    }

    public void a(b bVar) {
        this.f44518a = bVar;
    }
}
