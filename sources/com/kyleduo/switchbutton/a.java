package com.kyleduo.switchbutton;

import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: h, reason: collision with root package name */
    public static int f39062h = 256;

    /* renamed from: i, reason: collision with root package name */
    public static int f39063i = 7;

    /* renamed from: j, reason: collision with root package name */
    public static int f39064j = 16;

    /* renamed from: b, reason: collision with root package name */
    public b f39066b;

    /* renamed from: d, reason: collision with root package name */
    public int f39068d;

    /* renamed from: e, reason: collision with root package name */
    public int f39069e;

    /* renamed from: f, reason: collision with root package name */
    public int f39070f;

    /* renamed from: c, reason: collision with root package name */
    public boolean f39067c = false;

    /* renamed from: g, reason: collision with root package name */
    public int f39071g = f39063i;

    /* renamed from: a, reason: collision with root package name */
    public HandlerC0469a f39065a = new HandlerC0469a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.kyleduo.switchbutton.a$a, reason: collision with other inner class name */
    public static class HandlerC0469a extends Handler {
        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            Object obj;
            if (msg.what != a.f39062h || (obj = msg.obj) == null) {
                return;
            }
            ((Runnable) obj).run();
        }

        public HandlerC0469a() {
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
        this.f39066b = onAnimateListener;
        return this;
    }

    public void i(int velocity) {
        if (velocity <= 0) {
            this.f39071g = f39063i;
        } else {
            this.f39071g = velocity;
        }
    }

    public void j(int from, int to2) {
        this.f39067c = true;
        this.f39069e = from;
        this.f39070f = to2;
        int i11 = this.f39071g;
        this.f39068d = i11;
        if (to2 > from) {
            this.f39068d = Math.abs(i11);
        } else {
            if (to2 >= from) {
                this.f39067c = false;
                this.f39066b.c();
                return;
            }
            this.f39068d = -Math.abs(i11);
        }
        this.f39066b.a();
        new c().run();
    }

    public void k() {
        this.f39067c = false;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements Runnable {
        public c() {
        }

        public final void b() {
            Message obtainMessage = a.this.f39065a.obtainMessage();
            obtainMessage.what = a.f39062h;
            obtainMessage.obj = this;
            a.this.f39065a.sendMessageDelayed(obtainMessage, a.f39064j);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f39067c) {
                a();
                a.this.f39066b.b(a.this.f39068d);
                if (a.this.f39066b.d()) {
                    b();
                } else {
                    a.this.k();
                    a.this.f39066b.c();
                }
            }
        }

        public final void a() {
        }
    }
}
