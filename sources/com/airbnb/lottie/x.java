package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.annotation.WorkerThread;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.baicizhan.main.activity.GuideActivity;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public static final Map<String, w0<k>> f10231a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f10232b = {80, 75, 3, 4};

    @WorkerThread
    public static u0<k> A(String str, @Nullable String str2) {
        return x(JsonReader.H(l60.r0.e(l60.r0.v(new ByteArrayInputStream(str.getBytes())))), str2);
    }

    @WorkerThread
    @Deprecated
    public static u0<k> B(JSONObject jSONObject, @Nullable String str) {
        return A(jSONObject.toString(), str);
    }

    public static w0<k> C(Context context, @RawRes int i11) {
        return D(context, i11, P(context, i11));
    }

    public static w0<k> D(Context context, @RawRes final int i11, @Nullable final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return l(str, new Callable() { // from class: com.airbnb.lottie.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return x.a(weakReference, applicationContext, i11, str);
            }
        });
    }

    @WorkerThread
    public static u0<k> E(Context context, @RawRes int i11) {
        return F(context, i11, P(context, i11));
    }

    @WorkerThread
    public static u0<k> F(Context context, @RawRes int i11, @Nullable String str) {
        try {
            l60.m e11 = l60.r0.e(l60.r0.v(context.getResources().openRawResource(i11)));
            return O(e11).booleanValue() ? L(new ZipInputStream(e11.R8()), str) : u(e11.R8(), str);
        } catch (Resources.NotFoundException e12) {
            return new u0<>((Throwable) e12);
        }
    }

    public static w0<k> G(Context context, String str) {
        return H(context, str, "url_" + str);
    }

    public static w0<k> H(final Context context, final String str, @Nullable final String str2) {
        return l(str2, new Callable() { // from class: com.airbnb.lottie.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return x.c(context, str, str2);
            }
        });
    }

    @WorkerThread
    public static u0<k> I(Context context, String str) {
        return J(context, str, str);
    }

    @WorkerThread
    public static u0<k> J(Context context, String str, @Nullable String str2) {
        u0<k> c11 = e.d(context).c(str, str2);
        if (str2 != null && c11.b() != null) {
            c1.f.c().d(str2, c11.b());
        }
        return c11;
    }

    public static w0<k> K(final ZipInputStream zipInputStream, @Nullable final String str) {
        return l(str, new Callable() { // from class: com.airbnb.lottie.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                u0 L;
                L = x.L(zipInputStream, str);
                return L;
            }
        });
    }

    @WorkerThread
    public static u0<k> L(ZipInputStream zipInputStream, @Nullable String str) {
        try {
            return M(zipInputStream, str);
        } finally {
            j1.j.c(zipInputStream);
        }
    }

    @WorkerThread
    public static u0<k> M(ZipInputStream zipInputStream, @Nullable String str) {
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            k kVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    kVar = y(JsonReader.H(l60.r0.e(l60.r0.v(zipInputStream))), null, false).b();
                } else {
                    if (!name.contains(GuideActivity.f17949k) && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                        zipInputStream.closeEntry();
                    }
                    hashMap.put(name.split("/")[r1.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (kVar == null) {
                return new u0<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                p0 n11 = n(kVar, (String) entry.getKey());
                if (n11 != null) {
                    n11.h(j1.j.m((Bitmap) entry.getValue(), n11.f(), n11.d()));
                }
            }
            for (Map.Entry<String, p0> entry2 : kVar.j().entrySet()) {
                if (entry2.getValue().a() == null) {
                    return new u0<>((Throwable) new IllegalStateException("There is no image for " + entry2.getValue().c()));
                }
            }
            if (str != null) {
                c1.f.c().d(str, kVar);
            }
            return new u0<>(kVar);
        } catch (IOException e11) {
            return new u0<>((Throwable) e11);
        }
    }

    public static boolean N(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static Boolean O(l60.m mVar) {
        try {
            l60.m peek = mVar.peek();
            for (byte b11 : f10232b) {
                if (peek.readByte() != b11) {
                    return Boolean.FALSE;
                }
            }
            peek.close();
            return Boolean.TRUE;
        } catch (Exception e11) {
            j1.f.c("Failed to check zip file header", e11);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    public static String P(Context context, @RawRes int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("rawRes");
        sb2.append(N(context) ? "_night_" : "_day_");
        sb2.append(i11);
        return sb2.toString();
    }

    public static void Q(int i11) {
        c1.f.c().e(i11);
    }

    public static /* synthetic */ u0 a(WeakReference weakReference, Context context, int i11, String str) {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return F(context, i11, str);
    }

    public static /* synthetic */ u0 c(Context context, String str, String str2) {
        u0<k> c11 = e.d(context).c(str, str2);
        if (str2 != null && c11.b() != null) {
            c1.f.c().d(str2, c11.b());
        }
        return c11;
    }

    public static /* synthetic */ void d(String str, AtomicBoolean atomicBoolean, Throwable th2) {
        f10231a.remove(str);
        atomicBoolean.set(true);
    }

    public static /* synthetic */ void i(String str, AtomicBoolean atomicBoolean, k kVar) {
        f10231a.remove(str);
        atomicBoolean.set(true);
    }

    public static /* synthetic */ u0 j(k kVar) {
        return new u0(kVar);
    }

    public static w0<k> l(@Nullable final String str, Callable<u0<k>> callable) {
        final k b11 = str == null ? null : c1.f.c().b(str);
        if (b11 != null) {
            return new w0<>(new Callable() { // from class: com.airbnb.lottie.u
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return x.j(k.this);
                }
            });
        }
        if (str != null) {
            Map<String, w0<k>> map = f10231a;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        w0<k> w0Var = new w0<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            w0Var.d(new q0() { // from class: com.airbnb.lottie.v
                @Override // com.airbnb.lottie.q0
                public final void onResult(Object obj) {
                    x.i(str, atomicBoolean, (k) obj);
                }
            });
            w0Var.c(new q0() { // from class: com.airbnb.lottie.w
                @Override // com.airbnb.lottie.q0
                public final void onResult(Object obj) {
                    x.d(str, atomicBoolean, (Throwable) obj);
                }
            });
            if (!atomicBoolean.get()) {
                f10231a.put(str, w0Var);
            }
        }
        return w0Var;
    }

    public static void m(Context context) {
        f10231a.clear();
        c1.f.c().a();
        e.c(context).a();
    }

    @Nullable
    public static p0 n(k kVar, String str) {
        for (p0 p0Var : kVar.j().values()) {
            if (p0Var.c().equals(str)) {
                return p0Var;
            }
        }
        return null;
    }

    public static w0<k> o(Context context, String str) {
        return p(context, str, "asset_" + str);
    }

    public static w0<k> p(Context context, final String str, @Nullable final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return l(str2, new Callable() { // from class: com.airbnb.lottie.t
            @Override // java.util.concurrent.Callable
            public final Object call() {
                u0 r11;
                r11 = x.r(applicationContext, str, str2);
                return r11;
            }
        });
    }

    @WorkerThread
    public static u0<k> q(Context context, String str) {
        return r(context, str, "asset_" + str);
    }

    @WorkerThread
    public static u0<k> r(Context context, String str, @Nullable String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return u(context.getAssets().open(str), str2);
            }
            return L(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e11) {
            return new u0<>((Throwable) e11);
        }
    }

    @Deprecated
    public static w0<k> s(final JSONObject jSONObject, @Nullable final String str) {
        return l(str, new Callable() { // from class: com.airbnb.lottie.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                u0 B;
                B = x.B(jSONObject, str);
                return B;
            }
        });
    }

    public static w0<k> t(final InputStream inputStream, @Nullable final String str) {
        return l(str, new Callable() { // from class: com.airbnb.lottie.o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                u0 u11;
                u11 = x.u(inputStream, str);
                return u11;
            }
        });
    }

    @WorkerThread
    public static u0<k> u(InputStream inputStream, @Nullable String str) {
        return v(inputStream, str, true);
    }

    @WorkerThread
    public static u0<k> v(InputStream inputStream, @Nullable String str, boolean z11) {
        try {
            return x(JsonReader.H(l60.r0.e(l60.r0.v(inputStream))), str);
        } finally {
            if (z11) {
                j1.j.c(inputStream);
            }
        }
    }

    public static w0<k> w(final JsonReader jsonReader, @Nullable final String str) {
        return l(str, new Callable() { // from class: com.airbnb.lottie.s
            @Override // java.util.concurrent.Callable
            public final Object call() {
                u0 x11;
                x11 = x.x(JsonReader.this, str);
                return x11;
            }
        });
    }

    @WorkerThread
    public static u0<k> x(JsonReader jsonReader, @Nullable String str) {
        return y(jsonReader, str, true);
    }

    public static u0<k> y(JsonReader jsonReader, @Nullable String str, boolean z11) {
        try {
            try {
                k a11 = h1.w.a(jsonReader);
                if (str != null) {
                    c1.f.c().d(str, a11);
                }
                u0<k> u0Var = new u0<>(a11);
                if (z11) {
                    j1.j.c(jsonReader);
                }
                return u0Var;
            } catch (Exception e11) {
                u0<k> u0Var2 = new u0<>(e11);
                if (z11) {
                    j1.j.c(jsonReader);
                }
                return u0Var2;
            }
        } catch (Throwable th2) {
            if (z11) {
                j1.j.c(jsonReader);
            }
            throw th2;
        }
    }

    public static w0<k> z(final String str, @Nullable final String str2) {
        return l(str2, new Callable() { // from class: com.airbnb.lottie.q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                u0 A;
                A = x.A(str, str2);
                return A;
            }
        });
    }
}
