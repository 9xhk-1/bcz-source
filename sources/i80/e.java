package i80;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import org.greenrobot.eventbus.EventBusException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class e extends Handler implements k {

    /* renamed from: a, reason: collision with root package name */
    public final j f60303a;

    /* renamed from: b, reason: collision with root package name */
    public final int f60304b;

    /* renamed from: c, reason: collision with root package name */
    public final c f60305c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f60306d;

    public e(c cVar, Looper looper, int i11) {
        super(looper);
        this.f60305c = cVar;
        this.f60304b = i11;
        this.f60303a = new j();
    }

    @Override // i80.k
    public void a(p pVar, Object obj) {
        i a11 = i.a(pVar, obj);
        synchronized (this) {
            try {
                this.f60303a.a(a11);
                if (!this.f60306d) {
                    this.f60306d = true;
                    if (!sendMessage(obtainMessage())) {
                        throw new EventBusException("Could not send handler message");
                    }
                }
            } finally {
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                i b11 = this.f60303a.b();
                if (b11 == null) {
                    synchronized (this) {
                        b11 = this.f60303a.b();
                        if (b11 == null) {
                            this.f60306d = false;
                            return;
                        }
                    }
                }
                this.f60305c.l(b11);
            } while (SystemClock.uptimeMillis() - uptimeMillis < this.f60304b);
            if (!sendMessage(obtainMessage())) {
                throw new EventBusException("Could not send handler message");
            }
            this.f60306d = true;
        } catch (Throwable th2) {
            this.f60306d = false;
            throw th2;
        }
    }
}
