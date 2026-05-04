package cn.com.chinatelecom.account.api.b;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public abstract class e implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    private static Handler f8904c = new Handler(Looper.getMainLooper());

    /* renamed from: a, reason: collision with root package name */
    private boolean f8905a = false;

    /* renamed from: b, reason: collision with root package name */
    private long f8906b;

    /* renamed from: d, reason: collision with root package name */
    private a f8907d;

    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private e f8908a;

        public a(e eVar) {
            this.f8908a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = this.f8908a;
            if (eVar != null) {
                eVar.b();
            }
        }
    }

    public e() {
    }

    private void e() {
        a aVar = new a(this);
        this.f8907d = aVar;
        f8904c.postDelayed(aVar, this.f8906b);
    }

    public abstract void a();

    public void a(boolean z11) {
        this.f8905a = z11;
    }

    public boolean c() {
        return this.f8905a;
    }

    public void d() {
        try {
            a aVar = this.f8907d;
            if (aVar != null) {
                f8904c.removeCallbacks(aVar);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f8906b > 0) {
            e();
        }
        a();
    }

    public e(long j11) {
        this.f8906b = j11;
    }

    public void b() {
    }
}
