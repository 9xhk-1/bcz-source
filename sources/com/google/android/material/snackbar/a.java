package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    public static final int f32209e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f32210f = 1500;

    /* renamed from: g, reason: collision with root package name */
    public static final int f32211g = 2750;

    /* renamed from: h, reason: collision with root package name */
    public static a f32212h;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final Object f32213a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final Handler f32214b = new Handler(Looper.getMainLooper(), new C0377a());

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public c f32215c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public c f32216d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.google.android.material.snackbar.a$a, reason: collision with other inner class name */
    public class C0377a implements Handler.Callback {
        public C0377a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            if (message.what != 0) {
                return false;
            }
            a.this.d((c) message.obj);
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void a(int i11);

        void show();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        public final WeakReference<b> f32218a;

        /* renamed from: b, reason: collision with root package name */
        public int f32219b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f32220c;

        public c(int i11, b bVar) {
            this.f32218a = new WeakReference<>(bVar);
            this.f32219b = i11;
        }

        public boolean a(@Nullable b bVar) {
            return bVar != null && this.f32218a.get() == bVar;
        }
    }

    public static a c() {
        if (f32212h == null) {
            f32212h = new a();
        }
        return f32212h;
    }

    public final boolean a(@NonNull c cVar, int i11) {
        b bVar = cVar.f32218a.get();
        if (bVar == null) {
            return false;
        }
        this.f32214b.removeCallbacksAndMessages(cVar);
        bVar.a(i11);
        return true;
    }

    public void b(b bVar, int i11) {
        synchronized (this.f32213a) {
            try {
                if (g(bVar)) {
                    a(this.f32215c, i11);
                } else if (h(bVar)) {
                    a(this.f32216d, i11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d(@NonNull c cVar) {
        synchronized (this.f32213a) {
            try {
                if (this.f32215c != cVar) {
                    if (this.f32216d == cVar) {
                    }
                }
                a(cVar, 2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean e(b bVar) {
        boolean g11;
        synchronized (this.f32213a) {
            g11 = g(bVar);
        }
        return g11;
    }

    public boolean f(b bVar) {
        boolean z11;
        synchronized (this.f32213a) {
            try {
                z11 = g(bVar) || h(bVar);
            } finally {
            }
        }
        return z11;
    }

    public final boolean g(b bVar) {
        c cVar = this.f32215c;
        return cVar != null && cVar.a(bVar);
    }

    public final boolean h(b bVar) {
        c cVar = this.f32216d;
        return cVar != null && cVar.a(bVar);
    }

    public void i(b bVar) {
        synchronized (this.f32213a) {
            try {
                if (g(bVar)) {
                    this.f32215c = null;
                    if (this.f32216d != null) {
                        o();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void j(b bVar) {
        synchronized (this.f32213a) {
            try {
                if (g(bVar)) {
                    m(this.f32215c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void k(b bVar) {
        synchronized (this.f32213a) {
            try {
                if (g(bVar)) {
                    c cVar = this.f32215c;
                    if (!cVar.f32220c) {
                        cVar.f32220c = true;
                        this.f32214b.removeCallbacksAndMessages(cVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void l(b bVar) {
        synchronized (this.f32213a) {
            try {
                if (g(bVar)) {
                    c cVar = this.f32215c;
                    if (cVar.f32220c) {
                        cVar.f32220c = false;
                        m(cVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void m(@NonNull c cVar) {
        int i11 = cVar.f32219b;
        if (i11 == -2) {
            return;
        }
        if (i11 <= 0) {
            i11 = i11 == -1 ? 1500 : f32211g;
        }
        this.f32214b.removeCallbacksAndMessages(cVar);
        Handler handler = this.f32214b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i11);
    }

    public void n(int i11, b bVar) {
        synchronized (this.f32213a) {
            try {
                if (g(bVar)) {
                    c cVar = this.f32215c;
                    cVar.f32219b = i11;
                    this.f32214b.removeCallbacksAndMessages(cVar);
                    m(this.f32215c);
                    return;
                }
                if (h(bVar)) {
                    this.f32216d.f32219b = i11;
                } else {
                    this.f32216d = new c(i11, bVar);
                }
                c cVar2 = this.f32215c;
                if (cVar2 == null || !a(cVar2, 4)) {
                    this.f32215c = null;
                    o();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void o() {
        c cVar = this.f32216d;
        if (cVar != null) {
            this.f32215c = cVar;
            this.f32216d = null;
            b bVar = cVar.f32218a.get();
            if (bVar != null) {
                bVar.show();
            } else {
                this.f32215c = null;
            }
        }
    }
}
