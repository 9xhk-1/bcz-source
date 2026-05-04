package com.tencent.open.log;

import com.tencent.open.log.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class Tracer {

    /* renamed from: a, reason: collision with root package name */
    private volatile int f44515a;

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f44516b;

    /* renamed from: c, reason: collision with root package name */
    private g f44517c;

    public Tracer() {
        this(c.f44541a, true, g.f44562a);
    }

    public void a(int i11, Thread thread, long j11, String str, String str2, Throwable th2) {
        if (d() && d.a.a(this.f44515a, i11)) {
            doTrace(i11, thread, j11, str, str2, th2);
        }
    }

    public boolean d() {
        return this.f44516b;
    }

    public abstract void doTrace(int i11, Thread thread, long j11, String str, String str2, Throwable th2);

    public g e() {
        return this.f44517c;
    }

    public Tracer(int i11, boolean z11, g gVar) {
        this.f44515a = c.f44541a;
        this.f44516b = true;
        this.f44517c = g.f44562a;
        a(i11);
        a(z11);
        a(gVar);
    }

    public void a(int i11) {
        this.f44515a = i11;
    }

    public void a(boolean z11) {
        this.f44516b = z11;
    }

    public void a(g gVar) {
        this.f44517c = gVar;
    }
}
