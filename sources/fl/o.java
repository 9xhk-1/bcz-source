package fl;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final int f52020a = 31;

    /* renamed from: b, reason: collision with root package name */
    public static final int f52021b = 17;

    /* renamed from: c, reason: collision with root package name */
    public static final char[] f52022c = u30.h.f91619a.toCharArray();

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f52023d = new char[64];

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public static volatile Handler f52024e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52025a;

        static {
            Bitmap.Config config;
            int[] iArr = new int[Bitmap.Config.values().length];
            f52025a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52025a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f52025a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr2 = f52025a;
                config = Bitmap.Config.RGBA_F16;
                iArr2[config.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f52025a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static void A(Runnable runnable) {
        m().removeCallbacks(runnable);
    }

    @NonNull
    public static String B(@NonNull byte[] bArr) {
        String f11;
        char[] cArr = f52023d;
        synchronized (cArr) {
            f11 = f(bArr, cArr);
        }
        return f11;
    }

    public static void a() {
        if (!u()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    public static void b() {
        if (!v()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean c(@Nullable bl.a<?> aVar, @Nullable bl.a<?> aVar2) {
        return aVar == null ? aVar2 == null : aVar.isEquivalentTo(aVar2);
    }

    public static boolean d(@Nullable Object obj, @Nullable Object obj2) {
        return obj == null ? obj2 == null : obj instanceof pk.m ? ((pk.m) obj).a(obj2) : obj.equals(obj2);
    }

    public static boolean e(@Nullable Object obj, @Nullable Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @NonNull
    public static String f(@NonNull byte[] bArr, @NonNull char[] cArr) {
        for (int i11 = 0; i11 < bArr.length; i11++) {
            byte b11 = bArr[i11];
            int i12 = i11 * 2;
            char[] cArr2 = f52022c;
            cArr[i12] = cArr2[(b11 & 255) >>> 4];
            cArr[i12 + 1] = cArr2[b11 & 15];
        }
        return new String(cArr);
    }

    @NonNull
    public static <T> Queue<T> g(int i11) {
        return new ArrayDeque(i11);
    }

    public static int h(int i11, int i12, @Nullable Bitmap.Config config) {
        return i11 * i12 * j(config);
    }

    @TargetApi(19)
    public static int i(@NonNull Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    public static int j(@Nullable Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i11 = a.f52025a[config.ordinal()];
        int i12 = 1;
        if (i11 != 1) {
            i12 = 2;
            if (i11 != 2 && i11 != 3) {
                return i11 != 4 ? 4 : 8;
            }
        }
        return i12;
    }

    @Deprecated
    public static int k(@NonNull Bitmap bitmap) {
        return i(bitmap);
    }

    @NonNull
    public static <T> List<T> l(@NonNull Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t11 : collection) {
            if (t11 != null) {
                arrayList.add(t11);
            }
        }
        return arrayList;
    }

    public static Handler m() {
        if (f52024e == null) {
            synchronized (o.class) {
                try {
                    if (f52024e == null) {
                        f52024e = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return f52024e;
    }

    public static int n(float f11) {
        return o(f11, 17);
    }

    public static int o(float f11, int i11) {
        return q(Float.floatToIntBits(f11), i11);
    }

    public static int p(int i11) {
        return q(i11, 17);
    }

    public static int q(int i11, int i12) {
        return (i12 * 31) + i11;
    }

    public static int r(@Nullable Object obj, int i11) {
        return q(obj == null ? 0 : obj.hashCode(), i11);
    }

    public static int s(boolean z11) {
        return t(z11, 17);
    }

    public static int t(boolean z11, int i11) {
        return q(z11 ? 1 : 0, i11);
    }

    public static boolean u() {
        return !v();
    }

    public static boolean v() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean w(int i11) {
        return i11 > 0 || i11 == Integer.MIN_VALUE;
    }

    public static boolean x(int i11, int i12) {
        return w(i11) && w(i12);
    }

    public static void y(Runnable runnable) {
        m().postAtFrontOfQueue(runnable);
    }

    public static void z(Runnable runnable) {
        m().post(runnable);
    }
}
