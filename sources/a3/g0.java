package a3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class g0 extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f1530a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1531b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1532c = false;

    public g0(Runnable runnable) {
        this.f1530a = runnable;
    }

    public boolean a() {
        return this.f1531b;
    }

    public void b() {
        this.f1531b = true;
    }

    public void c() {
        synchronized (this) {
            this.f1531b = false;
            notifyAll();
        }
    }

    public void d() {
        this.f1532c = true;
        if (this.f1531b) {
            c();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (true) {
            synchronized (this) {
                while (this.f1531b) {
                    try {
                        wait();
                    } catch (InterruptedException e11) {
                        e11.printStackTrace();
                    }
                }
            }
            if (this.f1532c) {
                return;
            } else {
                this.f1530a.run();
            }
        }
    }
}
