package sk;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class r0 {

    /* renamed from: e, reason: collision with root package name */
    public static final String f88782e = "HardwareConfig";

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f88783f;

    /* renamed from: g, reason: collision with root package name */
    @ChecksSdkIntAtLeast(api = 28)
    public static final boolean f88784g;

    /* renamed from: h, reason: collision with root package name */
    public static final File f88785h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f88786i = 50;

    /* renamed from: j, reason: collision with root package name */
    public static final int f88787j = 20000;

    /* renamed from: k, reason: collision with root package name */
    public static final int f88788k = 500;

    /* renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final int f88789l = -1;

    /* renamed from: m, reason: collision with root package name */
    public static volatile r0 f88790m;

    /* renamed from: b, reason: collision with root package name */
    @GuardedBy("this")
    public int f88792b;

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f88793c = true;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f88794d = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    public final int f88791a = 20000;

    static {
        int i11 = Build.VERSION.SDK_INT;
        f88783f = i11 < 29;
        f88784g = i11 >= 28;
        f88785h = new File("/proc/self/fd");
    }

    @VisibleForTesting
    public r0() {
    }

    public static r0 c() {
        if (f88790m == null) {
            synchronized (r0.class) {
                try {
                    if (f88790m == null) {
                        f88790m = new r0();
                    }
                } finally {
                }
            }
        }
        return f88790m;
    }

    public static boolean f() {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
        while (it.hasNext()) {
            if (Build.MODEL.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final boolean a() {
        return f88783f && !this.f88794d.get();
    }

    public void b() {
        fl.o.b();
        this.f88794d.set(false);
    }

    public final int d() {
        if (f()) {
            return 500;
        }
        return this.f88791a;
    }

    public final synchronized boolean e() {
        try {
            boolean z11 = true;
            int i11 = this.f88792b + 1;
            this.f88792b = i11;
            if (i11 >= 50) {
                this.f88792b = 0;
                int length = f88785h.list().length;
                long d11 = d();
                if (length >= d11) {
                    z11 = false;
                }
                this.f88793c = z11;
                if (!z11 && Log.isLoggable(com.bumptech.glide.load.resource.bitmap.a.f28816f, 5)) {
                    Log.w(com.bumptech.glide.load.resource.bitmap.a.f28816f, "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + d11);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f88793c;
    }

    public boolean g(int i11, int i12, boolean z11, boolean z12) {
        if (!z11) {
            if (Log.isLoggable(f88782e, 2)) {
                Log.v(f88782e, "Hardware config disallowed by caller");
            }
            return false;
        }
        if (!f88784g) {
            if (Log.isLoggable(f88782e, 2)) {
                Log.v(f88782e, "Hardware config disallowed by sdk");
            }
            return false;
        }
        if (a()) {
            if (Log.isLoggable(f88782e, 2)) {
                Log.v(f88782e, "Hardware config disallowed by app state");
            }
            return false;
        }
        if (z12) {
            if (Log.isLoggable(f88782e, 2)) {
                Log.v(f88782e, "Hardware config disallowed because exif orientation is required");
            }
            return false;
        }
        if (i11 < 0 || i12 < 0) {
            if (Log.isLoggable(f88782e, 2)) {
                Log.v(f88782e, "Hardware config disallowed because of invalid dimensions");
            }
            return false;
        }
        if (e()) {
            return true;
        }
        if (Log.isLoggable(f88782e, 2)) {
            Log.v(f88782e, "Hardware config disallowed because there are insufficient FDs");
        }
        return false;
    }

    @TargetApi(26)
    public boolean h(int i11, int i12, BitmapFactory.Options options, boolean z11, boolean z12) {
        Bitmap.Config config;
        boolean g11 = g(i11, i12, z11, z12);
        if (g11) {
            config = Bitmap.Config.HARDWARE;
            options.inPreferredConfig = config;
            options.inMutable = false;
        }
        return g11;
    }

    public void i() {
        fl.o.b();
        this.f88794d.set(true);
    }
}
