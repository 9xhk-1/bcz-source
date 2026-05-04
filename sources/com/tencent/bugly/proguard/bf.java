package com.tencent.bugly.proguard;

import android.os.Handler;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class bf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final Handler f42456a;

    /* renamed from: d, reason: collision with root package name */
    long f42459d;

    /* renamed from: e, reason: collision with root package name */
    private final String f42460e;

    /* renamed from: f, reason: collision with root package name */
    private final List<ba> f42461f = new LinkedList();

    /* renamed from: b, reason: collision with root package name */
    long f42457b = 5000;

    /* renamed from: g, reason: collision with root package name */
    private final long f42462g = 5000;

    /* renamed from: c, reason: collision with root package name */
    boolean f42458c = true;

    public bf(Handler handler, String str) {
        this.f42456a = handler;
        this.f42460e = str;
    }

    private Thread e() {
        return this.f42456a.getLooper().getThread();
    }

    public final boolean a() {
        return !this.f42458c && SystemClock.uptimeMillis() >= this.f42459d + this.f42457b;
    }

    public final long b() {
        return SystemClock.uptimeMillis() - this.f42459d;
    }

    public final List<ba> c() {
        ArrayList arrayList;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.f42461f) {
            try {
                arrayList = new ArrayList(this.f42461f.size());
                for (int i11 = 0; i11 < this.f42461f.size(); i11++) {
                    ba baVar = this.f42461f.get(i11);
                    if (!baVar.f42437e && currentTimeMillis - baVar.f42434b < 200000) {
                        arrayList.add(baVar);
                        baVar.f42437e = true;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    public final void d() {
        StringBuilder sb2 = new StringBuilder(1024);
        long nanoTime = System.nanoTime();
        try {
            StackTraceElement[] stackTrace = e().getStackTrace();
            if (stackTrace.length == 0) {
                sb2.append("Thread does not have stack trace.\n");
            } else {
                for (StackTraceElement stackTraceElement : stackTrace) {
                    sb2.append(stackTraceElement);
                    sb2.append("\n");
                }
            }
        } catch (SecurityException e11) {
            sb2.append("getStackTrace() encountered:\n");
            sb2.append(e11.getMessage());
            sb2.append("\n");
            al.a(e11);
        }
        long nanoTime2 = System.nanoTime();
        ba baVar = new ba(sb2.toString(), System.currentTimeMillis());
        baVar.f42436d = nanoTime2 - nanoTime;
        String name = e().getName();
        if (name == null) {
            name = "";
        }
        baVar.f42433a = name;
        synchronized (this.f42461f) {
            while (this.f42461f.size() >= 32) {
                try {
                    this.f42461f.remove(0);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f42461f.add(baVar);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f42458c = true;
        this.f42457b = this.f42462g;
    }
}
