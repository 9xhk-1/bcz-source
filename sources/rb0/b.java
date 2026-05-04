package rb0;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
import qb0.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class b implements h {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f83946a = new AtomicBoolean();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements wb0.a {
        public a() {
        }

        @Override // wb0.a
        public void call() {
            b.this.a();
        }
    }

    public static void b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("Expected to be called on the main thread but was " + Thread.currentThread().getName());
    }

    public abstract void a();

    @Override // qb0.h
    public final boolean isUnsubscribed() {
        return this.f83946a.get();
    }

    @Override // qb0.h
    public final void unsubscribe() {
        if (this.f83946a.compareAndSet(false, true)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                a();
            } else {
                tb0.a.a().a().h(new a());
            }
        }
    }
}
