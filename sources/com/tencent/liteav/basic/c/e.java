package com.tencent.liteav.basic.c;

import android.opengl.EGLContext;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.tencent.liteav.basic.log.TXCLog;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class e extends com.tencent.liteav.basic.util.f {

    /* renamed from: a, reason: collision with root package name */
    public int f43182a;

    /* renamed from: b, reason: collision with root package name */
    public int f43183b;

    /* renamed from: c, reason: collision with root package name */
    public Surface f43184c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f43185d;

    /* renamed from: e, reason: collision with root package name */
    public b f43186e;

    /* renamed from: f, reason: collision with root package name */
    public EGLContext f43187f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.liteav.basic.c.a f43188g;

    /* renamed from: h, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGLContext f43189h;

    /* renamed from: i, reason: collision with root package name */
    private a f43190i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void c();

        void d();

        void e();
    }

    public e(Looper looper) {
        super(looper);
        this.f43182a = 720;
        this.f43183b = 1280;
        this.f43184c = null;
        this.f43190i = null;
        this.f43185d = false;
        this.f43186e = null;
        this.f43187f = null;
        this.f43188g = null;
        this.f43189h = null;
    }

    public static void a(final Handler handler, final HandlerThread handlerThread) {
        if (handler == null || handlerThread == null) {
            return;
        }
        Message message = new Message();
        message.what = 101;
        message.obj = new Runnable() { // from class: com.tencent.liteav.basic.c.e.1
            @Override // java.lang.Runnable
            public void run() {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.liteav.basic.c.e.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Handler handler2 = handler;
                        if (handler2 != null) {
                            handler2.removeCallbacksAndMessages(null);
                        }
                        HandlerThread handlerThread2 = handlerThread;
                        if (handlerThread2 != null) {
                            handlerThread2.quitSafely();
                        }
                    }
                });
            }
        };
        handler.sendMessage(message);
    }

    private void c(Message message) {
        try {
            a aVar = this.f43190i;
            if (aVar != null) {
                aVar.d();
            }
        } catch (Exception e11) {
            TXCLog.e("TXGLThreadHandler", "onMsgRend Exception " + e11.getMessage());
        }
    }

    private void d() {
        TXCLog.w("TXGLThreadHandler", "surface-render: destroy egl context " + this.f43184c);
        this.f43185d = false;
        a aVar = this.f43190i;
        if (aVar != null) {
            aVar.e();
        }
        com.tencent.liteav.basic.c.a aVar2 = this.f43188g;
        if (aVar2 != null) {
            aVar2.c();
            this.f43188g = null;
        }
        b bVar = this.f43186e;
        if (bVar != null) {
            bVar.d();
            this.f43186e = null;
        }
        this.f43184c = null;
    }

    public void b() {
        com.tencent.liteav.basic.c.a aVar = this.f43188g;
        if (aVar != null) {
            aVar.a();
        }
        b bVar = this.f43186e;
        if (bVar != null) {
            bVar.e();
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message == null) {
            return;
        }
        switch (message.what) {
            case 100:
                a(message);
                break;
            case 101:
                b(message);
                break;
            case 102:
                c(message);
                break;
        }
        Object obj = message.obj;
        if (obj != null) {
            ((Runnable) obj).run();
        }
    }

    private boolean c() {
        TXCLog.i("TXGLThreadHandler", String.format("init egl size[%d/%d]", Integer.valueOf(this.f43182a), Integer.valueOf(this.f43183b)));
        if (!this.f43185d) {
            this.f43188g = com.tencent.liteav.basic.c.a.a(null, this.f43189h, this.f43184c, this.f43182a, this.f43183b);
        } else {
            this.f43186e = b.a(null, this.f43187f, this.f43184c, this.f43182a, this.f43183b);
        }
        if (this.f43188g == null && this.f43186e == null) {
            return false;
        }
        TXCLog.w("TXGLThreadHandler", "surface-render: create egl context " + this.f43184c);
        a aVar = this.f43190i;
        if (aVar == null) {
            return true;
        }
        aVar.c();
        return true;
    }

    private void b(Message message) {
        d();
    }

    public void a(a aVar) {
        this.f43190i = aVar;
    }

    public Surface a() {
        return this.f43184c;
    }

    private void a(Message message) {
        try {
            c();
        } catch (Exception unused) {
            TXCLog.e("TXGLThreadHandler", "surface-render: init egl context exception " + this.f43184c);
            this.f43184c = null;
        }
    }
}
