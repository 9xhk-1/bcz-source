package lk;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class k implements e {

    /* renamed from: k, reason: collision with root package name */
    public static final String f71465k = "LruBitmapPool";

    /* renamed from: l, reason: collision with root package name */
    public static final Bitmap.Config f71466l = Bitmap.Config.ARGB_8888;

    /* renamed from: a, reason: collision with root package name */
    public final l f71467a;

    /* renamed from: b, reason: collision with root package name */
    public final Set<Bitmap.Config> f71468b;

    /* renamed from: c, reason: collision with root package name */
    public final long f71469c;

    /* renamed from: d, reason: collision with root package name */
    public final a f71470d;

    /* renamed from: e, reason: collision with root package name */
    public long f71471e;

    /* renamed from: f, reason: collision with root package name */
    public long f71472f;

    /* renamed from: g, reason: collision with root package name */
    public int f71473g;

    /* renamed from: h, reason: collision with root package name */
    public int f71474h;

    /* renamed from: i, reason: collision with root package name */
    public int f71475i;

    /* renamed from: j, reason: collision with root package name */
    public int f71476j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public final Set<Bitmap> f71477a = Collections.synchronizedSet(new HashSet());

        @Override // lk.k.a
        public void a(Bitmap bitmap) {
            if (!this.f71477a.contains(bitmap)) {
                this.f71477a.add(bitmap);
                return;
            }
            throw new IllegalStateException("Can't add already added bitmap: " + bitmap + " [" + bitmap.getWidth() + "x" + bitmap.getHeight() + "]");
        }

        @Override // lk.k.a
        public void b(Bitmap bitmap) {
            if (!this.f71477a.contains(bitmap)) {
                throw new IllegalStateException("Cannot remove bitmap not in tracker");
            }
            this.f71477a.remove(bitmap);
        }
    }

    public k(long j11, l lVar, Set<Bitmap.Config> set) {
        this.f71469c = j11;
        this.f71471e = j11;
        this.f71467a = lVar;
        this.f71468b = set;
        this.f71470d = new b();
    }

    @TargetApi(26)
    public static void h(Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        config2 = Bitmap.Config.HARDWARE;
        if (config != config2) {
            return;
        }
        throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
    }

    @NonNull
    public static Bitmap i(int i11, int i12, @Nullable Bitmap.Config config) {
        if (config == null) {
            config = f71466l;
        }
        return Bitmap.createBitmap(i11, i12, config);
    }

    @TargetApi(26)
    public static Set<Bitmap.Config> o() {
        Bitmap.Config config;
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i11 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i11 >= 26) {
            config = Bitmap.Config.HARDWARE;
            hashSet.remove(config);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public static l p() {
        return new o();
    }

    @TargetApi(19)
    public static void s(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    public static void u(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        s(bitmap);
    }

    @Override // lk.e
    public long a() {
        return this.f71471e;
    }

    @Override // lk.e
    @SuppressLint({"InlinedApi"})
    public void b(int i11) {
        if (Log.isLoggable(f71465k, 3)) {
            Log.d(f71465k, "trimMemory, level=" + i11);
        }
        if (i11 >= 40 || i11 >= 20) {
            c();
        } else if (i11 >= 20 || i11 == 15) {
            v(a() / 2);
        }
    }

    @Override // lk.e
    public void c() {
        if (Log.isLoggable(f71465k, 3)) {
            Log.d(f71465k, "clearMemory");
        }
        v(0L);
    }

    @Override // lk.e
    public synchronized void d(float f11) {
        this.f71471e = Math.round(this.f71469c * f11);
        l();
    }

    @Override // lk.e
    public synchronized void e(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f71467a.b(bitmap) <= this.f71471e && this.f71468b.contains(bitmap.getConfig())) {
                int b11 = this.f71467a.b(bitmap);
                this.f71467a.e(bitmap);
                this.f71470d.a(bitmap);
                this.f71475i++;
                this.f71472f += b11;
                if (Log.isLoggable(f71465k, 2)) {
                    Log.v(f71465k, "Put bitmap in pool=" + this.f71467a.c(bitmap));
                }
                j();
                l();
                return;
            }
            if (Log.isLoggable(f71465k, 2)) {
                Log.v(f71465k, "Reject bitmap from pool, bitmap: " + this.f71467a.c(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f71468b.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // lk.e
    @NonNull
    public Bitmap f(int i11, int i12, Bitmap.Config config) {
        Bitmap q11 = q(i11, i12, config);
        if (q11 == null) {
            return i(i11, i12, config);
        }
        q11.eraseColor(0);
        return q11;
    }

    @Override // lk.e
    @NonNull
    public Bitmap g(int i11, int i12, Bitmap.Config config) {
        Bitmap q11 = q(i11, i12, config);
        return q11 == null ? i(i11, i12, config) : q11;
    }

    public final void j() {
        if (Log.isLoggable(f71465k, 2)) {
            k();
        }
    }

    public final void k() {
        Log.v(f71465k, "Hits=" + this.f71473g + ", misses=" + this.f71474h + ", puts=" + this.f71475i + ", evictions=" + this.f71476j + ", currentSize=" + this.f71472f + ", maxSize=" + this.f71471e + "\nStrategy=" + this.f71467a);
    }

    public final void l() {
        v(this.f71471e);
    }

    public long m() {
        return this.f71476j;
    }

    public long n() {
        return this.f71472f;
    }

    @Nullable
    public final synchronized Bitmap q(int i11, int i12, @Nullable Bitmap.Config config) {
        Bitmap f11;
        try {
            h(config);
            f11 = this.f71467a.f(i11, i12, config != null ? config : f71466l);
            if (f11 == null) {
                if (Log.isLoggable(f71465k, 3)) {
                    Log.d(f71465k, "Missing bitmap=" + this.f71467a.a(i11, i12, config));
                }
                this.f71474h++;
            } else {
                this.f71473g++;
                this.f71472f -= this.f71467a.b(f11);
                this.f71470d.b(f11);
                u(f11);
            }
            if (Log.isLoggable(f71465k, 2)) {
                Log.v(f71465k, "Get bitmap=" + this.f71467a.a(i11, i12, config));
            }
            j();
        } catch (Throwable th2) {
            throw th2;
        }
        return f11;
    }

    public long r() {
        return this.f71473g;
    }

    public long t() {
        return this.f71474h;
    }

    public final synchronized void v(long j11) {
        while (this.f71472f > j11) {
            try {
                Bitmap removeLast = this.f71467a.removeLast();
                if (removeLast == null) {
                    if (Log.isLoggable(f71465k, 5)) {
                        Log.w(f71465k, "Size mismatch, resetting");
                        k();
                    }
                    this.f71472f = 0L;
                    return;
                }
                this.f71470d.b(removeLast);
                this.f71472f -= this.f71467a.b(removeLast);
                this.f71476j++;
                if (Log.isLoggable(f71465k, 3)) {
                    Log.d(f71465k, "Evicting bitmap=" + this.f71467a.c(removeLast));
                }
                j();
                removeLast.recycle();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public k(long j11) {
        this(j11, p(), o());
    }

    public k(long j11, Set<Bitmap.Config> set) {
        this(j11, p(), set);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements a {
        @Override // lk.k.a
        public void a(Bitmap bitmap) {
        }

        @Override // lk.k.a
        public void b(Bitmap bitmap) {
        }
    }
}
