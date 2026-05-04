package ub;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.baicizhan.client.framework.network.http.HttpRequest;
import java.lang.ref.WeakReference;
import xb.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: h, reason: collision with root package name */
    public static final int f92093h = 1;

    /* renamed from: i, reason: collision with root package name */
    public static final int f92094i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static final int f92095j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static final int f92096k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final l f92097l = new tb.a();

    /* renamed from: m, reason: collision with root package name */
    public static final int f92098m = 1001;

    /* renamed from: n, reason: collision with root package name */
    public static final int f92099n = 1004;

    /* renamed from: a, reason: collision with root package name */
    public sb.b f92100a;

    /* renamed from: b, reason: collision with root package name */
    public d f92101b;

    /* renamed from: c, reason: collision with root package name */
    public int f92102c;

    /* renamed from: d, reason: collision with root package name */
    public String f92103d;

    /* renamed from: e, reason: collision with root package name */
    public e f92104e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f92105f;

    /* renamed from: g, reason: collision with root package name */
    public c f92106g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public c f92107a;

        /* renamed from: b, reason: collision with root package name */
        public e f92108b = new e();

        public a a() {
            a aVar = new a();
            aVar.f92104e = this.f92108b;
            aVar.f92106g = this.f92107a;
            aVar.w();
            return aVar;
        }

        public b b(boolean autoDecomp) {
            this.f92108b.f92112c = autoDecomp;
            return this;
        }

        public b c(l policy) {
            this.f92108b.f92117h = policy;
            return this;
        }

        public b d(c callback) {
            this.f92107a = callback;
            return this;
        }

        public b e(int concurrence) {
            this.f92108b.f92113d = concurrence;
            return this;
        }

        public b f(int connTimeout) {
            this.f92108b.f92116g = connTimeout;
            return this;
        }

        public b g(String destPath) {
            this.f92108b.f92111b = destPath;
            return this;
        }

        public b h(int maxRetry) {
            this.f92108b.f92114e = maxRetry;
            return this;
        }

        public b i(int readTimeout) {
            this.f92108b.f92115f = readTimeout;
            return this;
        }

        public b j(String url) {
            this.f92108b.f92110a = url;
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        void onComplete(boolean success, String target, int errCode);

        void onProgress(int progress);

        void onStart();

        void onStartDecompress();

        void onStop();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<a> f92109a;

        public d(a dnmanager) {
            super(Looper.getMainLooper());
            this.f92109a = new WeakReference<>(dnmanager);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            a aVar = this.f92109a.get();
            if (aVar == null) {
                return;
            }
            int i11 = msg.what;
            if (i11 == 0) {
                sb.c cVar = (sb.c) msg.obj;
                long a11 = cVar.a();
                long b11 = cVar.b();
                int i12 = (int) (b11 > 0 ? (a11 * 100) / b11 : 0L);
                int i13 = i12 >= 0 ? i12 > 100 ? 100 : i12 : 0;
                if (aVar.f92106g != null) {
                    aVar.f92106g.onProgress(i13);
                    return;
                }
                return;
            }
            if (i11 == 1) {
                if (aVar.f92106g != null) {
                    aVar.f92106g.onStartDecompress();
                    return;
                }
                return;
            }
            if (i11 == 1001) {
                if (aVar.f92106g != null) {
                    aVar.f92106g.onStart();
                    return;
                }
                return;
            }
            if (i11 != 1004) {
                return;
            }
            boolean booleanValue = ((Boolean) msg.obj).booleanValue();
            aVar.f92102c = aVar.f92100a.b().b().f88212c;
            aVar.f92103d = aVar.f92100a.b().b().a();
            if (booleanValue) {
                if (aVar.f92106g != null) {
                    aVar.f92106g.onProgress(100);
                    aVar.f92106g.onComplete(true, aVar.f92103d, aVar.f92102c);
                    return;
                }
                return;
            }
            if (aVar.v() && aVar.f92106g != null) {
                aVar.f92106g.onStop();
            }
            if (aVar.f92106g != null) {
                aVar.f92106g.onComplete(false, aVar.f92103d, aVar.f92102c);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public String f92110a;

        /* renamed from: b, reason: collision with root package name */
        public String f92111b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f92112c;

        /* renamed from: d, reason: collision with root package name */
        public int f92113d;

        /* renamed from: e, reason: collision with root package name */
        public int f92114e;

        /* renamed from: f, reason: collision with root package name */
        public int f92115f;

        /* renamed from: g, reason: collision with root package name */
        public int f92116g;

        /* renamed from: h, reason: collision with root package name */
        public l f92117h;

        public e() {
            this.f92112c = true;
            this.f92113d = 1;
            this.f92114e = 1;
            this.f92115f = 0;
            this.f92116g = 0;
            this.f92117h = a.f92097l;
        }
    }

    public void A(l policy) {
        this.f92104e.f92117h = policy;
        w();
    }

    public void B(c callback) {
        this.f92106g = callback;
        w();
    }

    public void C(int concurrence) {
        this.f92104e.f92113d = concurrence;
        w();
    }

    public void D(int connTimeout) {
        this.f92104e.f92116g = connTimeout;
        w();
    }

    public void E(String destPath) {
        this.f92104e.f92111b = destPath;
        w();
    }

    public void F(int maxRetry) {
        this.f92104e.f92114e = maxRetry;
        w();
    }

    public void G(int readTimeout) {
        this.f92104e.f92115f = readTimeout;
        w();
    }

    public void H(String url) {
        this.f92104e.f92110a = url;
        w();
    }

    public boolean I() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new RuntimeException("Must not start download in the main thread!");
        }
        if (this.f92105f) {
            return false;
        }
        this.f92105f = true;
        sb.b bVar = this.f92100a;
        if (bVar != null) {
            bVar.b().b().f88210a = false;
            this.f92100a.b().b().f88211b.f97940a = false;
        }
        y();
        boolean a11 = this.f92100a.a(this.f92101b);
        x(a11);
        this.f92105f = false;
        return a11;
    }

    public boolean J() {
        l();
        return true;
    }

    public final synchronized void l() {
        sb.b bVar = this.f92100a;
        if (bVar != null) {
            bVar.b().b().f88210a = true;
            this.f92100a.b().b().f88211b.f97940a = true;
        }
    }

    public int m() {
        return this.f92104e.f92113d;
    }

    public int n() {
        return this.f92104e.f92116g;
    }

    public String o() {
        return this.f92104e.f92111b;
    }

    public int p() {
        return this.f92104e.f92114e;
    }

    public int q() {
        return this.f92104e.f92115f;
    }

    public int r() {
        return this.f92100a.b().b().f88212c;
    }

    public String s() {
        return this.f92100a.b().b().a();
    }

    public String t() {
        return this.f92104e.f92110a;
    }

    public boolean u() {
        return this.f92104e.f92112c;
    }

    public final synchronized boolean v() {
        sb.b bVar;
        bVar = this.f92100a;
        if (bVar == null) {
            throw new RuntimeException("invalid sync download manager, http manager is null.");
        }
        return bVar.b().b().f88210a || this.f92100a.b().b().f88210a;
    }

    public final void w() {
        sb.a aVar;
        sb.b bVar = this.f92100a;
        if (bVar == null || bVar.b() == null) {
            aVar = new sb.a();
            this.f92100a = new sb.b(aVar);
        } else {
            aVar = this.f92100a.b();
        }
        HttpRequest a11 = aVar.a();
        a11.C(this.f92104e.f92110a);
        a11.z(HttpRequest.HTTP_METHOD.GET);
        a11.w(this.f92104e.f92111b);
        a11.s(this.f92104e.f92112c);
        a11.y(this.f92104e.f92114e);
        a11.B(this.f92104e.f92115f);
        a11.v(this.f92104e.f92116g);
        a11.u(this.f92104e.f92113d);
        a11.t(this.f92104e.f92117h);
    }

    public final void x(boolean result) {
        Message obtainMessage = this.f92101b.obtainMessage(1004);
        obtainMessage.obj = Boolean.valueOf(result);
        this.f92101b.sendMessage(obtainMessage);
    }

    public final void y() {
        this.f92101b.sendEmptyMessage(1001);
    }

    public void z(boolean autoDecomp) {
        this.f92104e.f92112c = autoDecomp;
        w();
    }

    public a() {
        this.f92104e = new e();
        this.f92105f = false;
        this.f92101b = new d(this);
    }
}
