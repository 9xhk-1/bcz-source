package com.airbnb.lottie;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.os.TraceCompat;
import java.io.File;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f9935a = false;

    /* renamed from: b, reason: collision with root package name */
    public static final String f9936b = "LOTTIE";

    /* renamed from: c, reason: collision with root package name */
    public static final int f9937c = 20;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f9938d = false;

    /* renamed from: e, reason: collision with root package name */
    public static String[] f9939e;

    /* renamed from: f, reason: collision with root package name */
    public static long[] f9940f;

    /* renamed from: g, reason: collision with root package name */
    public static int f9941g;

    /* renamed from: h, reason: collision with root package name */
    public static int f9942h;

    /* renamed from: i, reason: collision with root package name */
    public static g1.e f9943i;

    /* renamed from: j, reason: collision with root package name */
    public static g1.d f9944j;

    /* renamed from: k, reason: collision with root package name */
    public static volatile g1.g f9945k;

    /* renamed from: l, reason: collision with root package name */
    public static volatile g1.f f9946l;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements g1.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f9947a;

        public a(Context context) {
            this.f9947a = context;
        }

        @Override // g1.d
        @NonNull
        public File a() {
            return new File(this.f9947a.getCacheDir(), "lottie_network_cache");
        }
    }

    public static void a(String str) {
        if (f9938d) {
            int i11 = f9941g;
            if (i11 == 20) {
                f9942h++;
                return;
            }
            f9939e[i11] = str;
            f9940f[i11] = System.nanoTime();
            TraceCompat.beginSection(str);
            f9941g++;
        }
    }

    public static float b(String str) {
        int i11 = f9942h;
        if (i11 > 0) {
            f9942h = i11 - 1;
            return 0.0f;
        }
        if (!f9938d) {
            return 0.0f;
        }
        int i12 = f9941g - 1;
        f9941g = i12;
        if (i12 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(f9939e[i12])) {
            TraceCompat.endSection();
            return (System.nanoTime() - f9940f[f9941g]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + f9939e[f9941g] + ".");
    }

    @NonNull
    public static g1.f c(@NonNull Context context) {
        g1.f fVar;
        Context applicationContext = context.getApplicationContext();
        g1.f fVar2 = f9946l;
        if (fVar2 != null) {
            return fVar2;
        }
        synchronized (g1.f.class) {
            try {
                fVar = f9946l;
                if (fVar == null) {
                    g1.d dVar = f9944j;
                    if (dVar == null) {
                        dVar = new a(applicationContext);
                    }
                    fVar = new g1.f(dVar);
                    f9946l = fVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    @NonNull
    public static g1.g d(@NonNull Context context) {
        g1.g gVar;
        g1.g gVar2 = f9945k;
        if (gVar2 != null) {
            return gVar2;
        }
        synchronized (g1.g.class) {
            try {
                gVar = f9945k;
                if (gVar == null) {
                    g1.f c11 = c(context);
                    g1.e eVar = f9943i;
                    if (eVar == null) {
                        eVar = new g1.b();
                    }
                    gVar = new g1.g(c11, eVar);
                    f9945k = gVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    public static void e(g1.d dVar) {
        f9944j = dVar;
    }

    public static void f(g1.e eVar) {
        f9943i = eVar;
    }

    public static void g(boolean z11) {
        if (f9938d == z11) {
            return;
        }
        f9938d = z11;
        if (z11) {
            f9939e = new String[20];
            f9940f = new long[20];
        }
    }
}
