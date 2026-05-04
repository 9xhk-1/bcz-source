package com.baicizhan.client.business.view;

import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: i, reason: collision with root package name */
    public static int f16779i = 256;

    /* renamed from: j, reason: collision with root package name */
    public static int f16780j = 7;

    /* renamed from: k, reason: collision with root package name */
    public static int f16781k = 16;

    /* renamed from: b, reason: collision with root package name */
    public b f16783b;

    /* renamed from: d, reason: collision with root package name */
    public int f16785d;

    /* renamed from: e, reason: collision with root package name */
    public int f16786e;

    /* renamed from: f, reason: collision with root package name */
    public int f16787f;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16784c = false;

    /* renamed from: g, reason: collision with root package name */
    public int f16788g = f16780j;

    /* renamed from: h, reason: collision with root package name */
    public int f16789h = f16781k;

    /* renamed from: a, reason: collision with root package name */
    public HandlerC0272a f16782a = new HandlerC0272a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.client.business.view.a$a, reason: collision with other inner class name */
    public static class HandlerC0272a extends Handler {
        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            Object obj;
            if (msg.what != a.f16779i || (obj = msg.obj) == null) {
                return;
            }
            ((Runnable) obj).run();
        }

        public HandlerC0272a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void a();

        void b(int frame);

        void c();

        boolean d();
    }

    public static a g() {
        return new a();
    }

    public a h(b onAnimateListener) {
        if (onAnimateListener == null) {
            throw new IllegalArgumentException("onAnimateListener can not be null");
        }
        this.f16783b = onAnimateListener;
        return this;
    }

    public void i(int duration) {
        if (duration <= 0) {
            this.f16789h = f16781k;
        } else {
            this.f16789h = duration;
        }
    }

    public void j(int velocity) {
        if (velocity <= 0) {
            this.f16788g = f16780j;
        } else {
            this.f16788g = velocity;
        }
    }

    public void k(int from, int to2) {
        this.f16784c = true;
        this.f16786e = from;
        this.f16787f = to2;
        int i11 = this.f16788g;
        this.f16785d = i11;
        if (to2 > from) {
            this.f16785d = Math.abs(i11);
        } else {
            if (to2 >= from) {
                this.f16784c = false;
                this.f16783b.c();
                return;
            }
            this.f16785d = -Math.abs(i11);
        }
        this.f16783b.a();
        new c().run();
    }

    public void l() {
        this.f16784c = false;
        this.f16782a.removeMessages(f16779i);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements Runnable {
        public c() {
        }

        public final void b() {
            Message obtainMessage = a.this.f16782a.obtainMessage();
            obtainMessage.what = a.f16779i;
            obtainMessage.obj = this;
            a.this.f16782a.sendMessageDelayed(obtainMessage, a.this.f16789h);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f16784c) {
                a();
                a.this.f16783b.b(a.this.f16785d);
                if (a.this.f16783b.d()) {
                    b();
                } else {
                    a.this.l();
                    a.this.f16783b.c();
                }
            }
        }

        public final void a() {
        }
    }
}
