package ok;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import fl.o;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import lk.e;
import mk.j;
import sk.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class a implements Runnable {

    /* renamed from: i, reason: collision with root package name */
    @VisibleForTesting
    public static final String f77075i = "PreFillRunner";

    /* renamed from: k, reason: collision with root package name */
    public static final long f77077k = 32;

    /* renamed from: l, reason: collision with root package name */
    public static final long f77078l = 40;

    /* renamed from: m, reason: collision with root package name */
    public static final int f77079m = 4;

    /* renamed from: a, reason: collision with root package name */
    public final e f77081a;

    /* renamed from: b, reason: collision with root package name */
    public final j f77082b;

    /* renamed from: c, reason: collision with root package name */
    public final c f77083c;

    /* renamed from: d, reason: collision with root package name */
    public final C0944a f77084d;

    /* renamed from: e, reason: collision with root package name */
    public final Set<d> f77085e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f77086f;

    /* renamed from: g, reason: collision with root package name */
    public long f77087g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f77088h;

    /* renamed from: j, reason: collision with root package name */
    public static final C0944a f77076j = new C0944a();

    /* renamed from: n, reason: collision with root package name */
    public static final long f77080n = TimeUnit.SECONDS.toMillis(1);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @VisibleForTesting
    /* renamed from: ok.a$a, reason: collision with other inner class name */
    public static class C0944a {
        public long a() {
            return SystemClock.currentThreadTimeMillis();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements ik.b {
        @Override // ik.b
        public void a(@NonNull MessageDigest messageDigest) {
            throw new UnsupportedOperationException();
        }
    }

    public a(e eVar, j jVar, c cVar) {
        this(eVar, jVar, cVar, f77076j, new Handler(Looper.getMainLooper()));
    }

    @VisibleForTesting
    public boolean a() {
        Bitmap createBitmap;
        long a11 = this.f77084d.a();
        while (!this.f77083c.b() && !e(a11)) {
            d c11 = this.f77083c.c();
            if (this.f77085e.contains(c11)) {
                createBitmap = Bitmap.createBitmap(c11.d(), c11.b(), c11.a());
            } else {
                this.f77085e.add(c11);
                createBitmap = this.f77081a.g(c11.d(), c11.b(), c11.a());
            }
            int i11 = o.i(createBitmap);
            if (c() >= i11) {
                this.f77082b.e(new b(), h.c(createBitmap, this.f77081a));
            } else {
                this.f77081a.e(createBitmap);
            }
            if (Log.isLoggable(f77075i, 3)) {
                Log.d(f77075i, "allocated [" + c11.d() + "x" + c11.b() + "] " + c11.a() + " size: " + i11);
            }
        }
        return (this.f77088h || this.f77083c.b()) ? false : true;
    }

    public void b() {
        this.f77088h = true;
    }

    public final long c() {
        return this.f77082b.a() - this.f77082b.getCurrentSize();
    }

    public final long d() {
        long j11 = this.f77087g;
        this.f77087g = Math.min(4 * j11, f77080n);
        return j11;
    }

    public final boolean e(long j11) {
        return this.f77084d.a() - j11 >= 32;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (a()) {
            this.f77086f.postDelayed(this, d());
        }
    }

    @VisibleForTesting
    public a(e eVar, j jVar, c cVar, C0944a c0944a, Handler handler) {
        this.f77085e = new HashSet();
        this.f77087g = 40L;
        this.f77081a = eVar;
        this.f77082b = jVar;
        this.f77083c = cVar;
        this.f77084d = c0944a;
        this.f77086f = handler;
    }
}
