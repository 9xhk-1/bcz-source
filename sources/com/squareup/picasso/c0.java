package com.squareup.picasso;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c0 {

    /* renamed from: o, reason: collision with root package name */
    public static final int f41808o = 0;

    /* renamed from: p, reason: collision with root package name */
    public static final int f41809p = 1;

    /* renamed from: q, reason: collision with root package name */
    public static final int f41810q = 2;

    /* renamed from: r, reason: collision with root package name */
    public static final int f41811r = 3;

    /* renamed from: s, reason: collision with root package name */
    public static final int f41812s = 4;

    /* renamed from: t, reason: collision with root package name */
    public static final String f41813t = "Picasso-Stats";

    /* renamed from: a, reason: collision with root package name */
    public final HandlerThread f41814a;

    /* renamed from: b, reason: collision with root package name */
    public final e f41815b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f41816c;

    /* renamed from: d, reason: collision with root package name */
    public long f41817d;

    /* renamed from: e, reason: collision with root package name */
    public long f41818e;

    /* renamed from: f, reason: collision with root package name */
    public long f41819f;

    /* renamed from: g, reason: collision with root package name */
    public long f41820g;

    /* renamed from: h, reason: collision with root package name */
    public long f41821h;

    /* renamed from: i, reason: collision with root package name */
    public long f41822i;

    /* renamed from: j, reason: collision with root package name */
    public long f41823j;

    /* renamed from: k, reason: collision with root package name */
    public long f41824k;

    /* renamed from: l, reason: collision with root package name */
    public int f41825l;

    /* renamed from: m, reason: collision with root package name */
    public int f41826m;

    /* renamed from: n, reason: collision with root package name */
    public int f41827n;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public final c0 f41828a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.squareup.picasso.c0$a$a, reason: collision with other inner class name */
        public class RunnableC0501a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Message f41829a;

            public RunnableC0501a(Message message) {
                this.f41829a = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unhandled stats message." + this.f41829a.what);
            }
        }

        public a(Looper looper, c0 c0Var) {
            super(looper);
            this.f41828a = c0Var;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i11 = message.what;
            if (i11 == 0) {
                this.f41828a.j();
                return;
            }
            if (i11 == 1) {
                this.f41828a.k();
                return;
            }
            if (i11 == 2) {
                this.f41828a.h(message.arg1);
                return;
            }
            if (i11 == 3) {
                this.f41828a.i(message.arg1);
            } else if (i11 != 4) {
                Picasso.f41724q.post(new RunnableC0501a(message));
            } else {
                this.f41828a.l((Long) message.obj);
            }
        }
    }

    public c0(e eVar) {
        this.f41815b = eVar;
        HandlerThread handlerThread = new HandlerThread(f41813t, 10);
        this.f41814a = handlerThread;
        handlerThread.start();
        h0.i(handlerThread.getLooper());
        this.f41816c = new a(handlerThread.getLooper(), this);
    }

    public static long g(int i11, long j11) {
        return j11 / i11;
    }

    public d0 a() {
        return new d0(this.f41815b.a(), this.f41815b.size(), this.f41817d, this.f41818e, this.f41819f, this.f41820g, this.f41821h, this.f41822i, this.f41823j, this.f41824k, this.f41825l, this.f41826m, this.f41827n, System.currentTimeMillis());
    }

    public void b(Bitmap bitmap) {
        m(bitmap, 2);
    }

    public void c(Bitmap bitmap) {
        m(bitmap, 3);
    }

    public void d() {
        this.f41816c.sendEmptyMessage(0);
    }

    public void e() {
        this.f41816c.sendEmptyMessage(1);
    }

    public void f(long j11) {
        Handler handler = this.f41816c;
        handler.sendMessage(handler.obtainMessage(4, Long.valueOf(j11)));
    }

    public void h(long j11) {
        int i11 = this.f41826m + 1;
        this.f41826m = i11;
        long j12 = this.f41820g + j11;
        this.f41820g = j12;
        this.f41823j = g(i11, j12);
    }

    public void i(long j11) {
        this.f41827n++;
        long j12 = this.f41821h + j11;
        this.f41821h = j12;
        this.f41824k = g(this.f41826m, j12);
    }

    public void j() {
        this.f41817d++;
    }

    public void k() {
        this.f41818e++;
    }

    public void l(Long l11) {
        this.f41825l++;
        long longValue = this.f41819f + l11.longValue();
        this.f41819f = longValue;
        this.f41822i = g(this.f41825l, longValue);
    }

    public final void m(Bitmap bitmap, int i11) {
        int j11 = h0.j(bitmap);
        Handler handler = this.f41816c;
        handler.sendMessage(handler.obtainMessage(i11, j11, 0));
    }

    public void n() {
        this.f41814a.quit();
    }
}
