package mk;

import android.util.Log;
import gk.b;
import java.io.File;
import java.io.IOException;
import mk.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class e implements a {

    /* renamed from: f, reason: collision with root package name */
    public static final String f73438f = "DiskLruCacheWrapper";

    /* renamed from: g, reason: collision with root package name */
    public static final int f73439g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f73440h = 1;

    /* renamed from: i, reason: collision with root package name */
    public static e f73441i;

    /* renamed from: b, reason: collision with root package name */
    public final File f73443b;

    /* renamed from: c, reason: collision with root package name */
    public final long f73444c;

    /* renamed from: e, reason: collision with root package name */
    public gk.b f73446e;

    /* renamed from: d, reason: collision with root package name */
    public final c f73445d = new c();

    /* renamed from: a, reason: collision with root package name */
    public final m f73442a = new m();

    @Deprecated
    public e(File file, long j11) {
        this.f73443b = file;
        this.f73444c = j11;
    }

    public static a d(File file, long j11) {
        return new e(file, j11);
    }

    @Deprecated
    public static synchronized a e(File file, long j11) {
        e eVar;
        synchronized (e.class) {
            try {
                if (f73441i == null) {
                    f73441i = new e(file, j11);
                }
                eVar = f73441i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    @Override // mk.a
    public void a(ik.b bVar, a.b bVar2) {
        String b11 = this.f73442a.b(bVar);
        this.f73445d.a(b11);
        try {
            if (Log.isLoggable(f73438f, 2)) {
                Log.v(f73438f, "Put: Obtained: " + b11 + " for for Key: " + bVar);
            }
            try {
                gk.b f11 = f();
                if (f11.Z(b11) == null) {
                    b.c S = f11.S(b11);
                    if (S == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: " + b11);
                    }
                    try {
                        if (bVar2.a(S.f(0))) {
                            S.e();
                        }
                        S.b();
                    } catch (Throwable th2) {
                        S.b();
                        throw th2;
                    }
                }
            } catch (IOException e11) {
                if (Log.isLoggable(f73438f, 5)) {
                    Log.w(f73438f, "Unable to put to disk cache", e11);
                }
            }
        } finally {
            this.f73445d.b(b11);
        }
    }

    @Override // mk.a
    public File b(ik.b bVar) {
        String b11 = this.f73442a.b(bVar);
        if (Log.isLoggable(f73438f, 2)) {
            Log.v(f73438f, "Get: Obtained: " + b11 + " for for Key: " + bVar);
        }
        try {
            b.e Z = f().Z(b11);
            if (Z != null) {
                return Z.b(0);
            }
            return null;
        } catch (IOException e11) {
            if (!Log.isLoggable(f73438f, 5)) {
                return null;
            }
            Log.w(f73438f, "Unable to get from disk cache", e11);
            return null;
        }
    }

    @Override // mk.a
    public void c(ik.b bVar) {
        try {
            f().s0(this.f73442a.b(bVar));
        } catch (IOException e11) {
            if (Log.isLoggable(f73438f, 5)) {
                Log.w(f73438f, "Unable to delete from disk cache", e11);
            }
        }
    }

    @Override // mk.a
    public synchronized void clear() {
        try {
            try {
                f().I();
            } catch (IOException e11) {
                if (Log.isLoggable(f73438f, 5)) {
                    Log.w(f73438f, "Unable to clear disk cache or disk cache cleared externally", e11);
                }
            }
        } finally {
            g();
        }
    }

    public final synchronized gk.b f() throws IOException {
        try {
            if (this.f73446e == null) {
                this.f73446e = gk.b.h0(this.f73443b, 1, 1, this.f73444c);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f73446e;
    }

    public final synchronized void g() {
        this.f73446e = null;
    }
}
