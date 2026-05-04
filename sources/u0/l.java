package u0;

import a00.r0;
import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import androidx.collection.SieveCacheKt;
import androidx.core.content.ContextCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import b0.b;
import c40.x0;
import coil.base.R;
import coil.decode.DataSource;
import coil.memory.MemoryCache;
import coil.size.Scale;
import f0.h;
import g0.a;
import i0.i;
import java.io.Closeable;
import java.io.File;
import k0.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import okhttp3.h;
import q0.c;
import u30.e0;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "-Utils")
@u0({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncoil/util/-Utils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dimension.kt\ncoil/size/-Dimensions\n+ 4 Contexts.kt\ncoil/util/-Contexts\n+ 5 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,302:1\n1#2:303\n57#3:304\n78#4:305\n78#4:307\n31#5:306\n31#5:308\n*S KotlinDebug\n*F\n+ 1 Utils.kt\ncoil/util/-Utils\n*L\n226#1:304\n258#1:305\n270#1:307\n258#1:306\n270#1:308\n*E\n"})
/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final Bitmap.Config[] f91444a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final Bitmap.Config f91445b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public static final ColorSpace f91446c = null;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final okhttp3.h f91447d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final String f91448e = "image/jpeg";

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final String f91449f = "image/webp";

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final String f91450g = "image/heic";

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final String f91451h = "image/heif";

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final String f91452i = "android_asset";

    /* renamed from: j, reason: collision with root package name */
    public static final double f91453j = 0.2d;

    /* renamed from: k, reason: collision with root package name */
    public static final double f91454k = 0.15d;

    /* renamed from: l, reason: collision with root package name */
    public static final int f91455l = 256;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f91456a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f91457b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f91458c;

        static {
            int[] iArr = new int[DataSource.values().length];
            try {
                iArr[DataSource.MEMORY_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DataSource.MEMORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DataSource.DISK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DataSource.NETWORK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f91456a = iArr;
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            try {
                iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f91457b = iArr2;
            int[] iArr3 = new int[Scale.values().length];
            try {
                iArr3[Scale.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[Scale.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            f91458c = iArr3;
        }
    }

    static {
        Bitmap.Config[] configArr;
        Bitmap.Config config;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            config = Bitmap.Config.RGBA_F16;
            configArr = new Bitmap.Config[]{Bitmap.Config.ARGB_8888, config};
        } else {
            configArr = new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        }
        f91444a = configArr;
        f91445b = i11 >= 26 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
        f91447d = new h.a().i();
    }

    public static final boolean A() {
        return g0.g(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final boolean B(int i11) {
        return i11 == Integer.MIN_VALUE || i11 == Integer.MAX_VALUE;
    }

    public static final boolean C(@m80.k b.a aVar) {
        return (aVar instanceof k0.c) && ((k0.c) aVar).l();
    }

    public static final boolean D(@m80.k Drawable drawable) {
        return (drawable instanceof VectorDrawable) || (drawable instanceof VectorDrawableCompat);
    }

    @m80.k
    public static final coil.request.b E(@m80.l coil.request.b bVar) {
        return bVar == null ? coil.request.b.f9798c : bVar;
    }

    @m80.k
    public static final coil.request.c F(@m80.l coil.request.c cVar) {
        return cVar == null ? coil.request.c.f9804c : cVar;
    }

    @m80.k
    public static final okhttp3.h G(@m80.l okhttp3.h hVar) {
        return hVar == null ? f91447d : hVar;
    }

    @m80.k
    public static final okhttp3.o H(@m80.k okhttp3.n nVar) {
        okhttp3.o L = nVar.L();
        if (L != null) {
            return L;
        }
        throw new IllegalStateException("response body == null");
    }

    public static final int I(@m80.k String str, int i11) {
        Long r12 = e0.r1(str);
        if (r12 == null) {
            return i11;
        }
        long longValue = r12.longValue();
        if (longValue > SieveCacheKt.NodeLinkMask) {
            return Integer.MAX_VALUE;
        }
        if (longValue < 0) {
            return 0;
        }
        return (int) longValue;
    }

    public static final int J(@m80.k q0.c cVar, @m80.k Scale scale) {
        if (cVar instanceof c.a) {
            return ((c.a) cVar).f81358a;
        }
        int i11 = a.f91458c[scale.ordinal()];
        if (i11 == 1) {
            return Integer.MIN_VALUE;
        }
        if (i11 == 2) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }

    @m80.k
    public static final Void K() {
        throw new IllegalStateException("Unsupported");
    }

    public static final int L(@m80.k q0.g gVar, @m80.k Scale scale, @m80.k x00.a<Integer> aVar) {
        return q0.b.f(gVar) ? aVar.invoke().intValue() : J(gVar.f(), scale);
    }

    public static final void a(@m80.k a.b bVar) {
        try {
            bVar.abort();
        } catch (Exception unused) {
        }
    }

    @m80.k
    public static final b.a b(@m80.k b.a aVar, @m80.l h.a aVar2) {
        if (aVar2 != null) {
            aVar.j().add(0, aVar2);
        }
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public static final b.a c(@m80.k b.a aVar, @m80.l Pair<? extends i.a<?>, ? extends Class<?>> pair) {
        if (pair != 0) {
            aVar.k().add(0, pair);
        }
        return aVar;
    }

    @m80.k
    public static final h.a d(@m80.k h.a aVar, @m80.k String str) {
        int I3 = k0.I3(str, ':', 0, false, 6, null);
        if (I3 == -1) {
            throw new IllegalArgumentException(("Unexpected header: " + str).toString());
        }
        String substring = str.substring(0, I3);
        g0.o(substring, "substring(...)");
        String obj = k0.b6(substring).toString();
        String substring2 = str.substring(I3 + 1);
        g0.o(substring2, "substring(...)");
        aVar.h(obj, substring2);
        return aVar;
    }

    public static final int e(@m80.k Context context, double d11) {
        int i11;
        try {
            Object systemService = ContextCompat.getSystemService(context, ActivityManager.class);
            g0.m(systemService);
            ActivityManager activityManager = (ActivityManager) systemService;
            i11 = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
        } catch (Exception unused) {
            i11 = 256;
        }
        double d12 = 1024;
        return (int) (d11 * i11 * d12 * d12);
    }

    public static final void f(@m80.k Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e11) {
            throw e11;
        } catch (Exception unused) {
        }
    }

    public static final double g(@m80.k Context context) {
        try {
            Object systemService = ContextCompat.getSystemService(context, ActivityManager.class);
            g0.m(systemService);
            return ((ActivityManager) systemService).isLowRamDevice() ? 0.15d : 0.2d;
        } catch (Exception unused) {
            return 0.2d;
        }
    }

    @m80.l
    public static final MemoryCache.b h(@m80.k MemoryCache memoryCache, @m80.l MemoryCache.Key key) {
        if (key != null) {
            return memoryCache.e(key);
        }
        return null;
    }

    @m80.l
    public static final <T> T i(@m80.k x0<? extends T> x0Var) {
        try {
            return x0Var.S();
        } catch (Throwable unused) {
            return null;
        }
    }

    @m80.k
    public static final Bitmap.Config j() {
        return f91445b;
    }

    @m80.k
    public static final okhttp3.h k() {
        return f91447d;
    }

    @m80.k
    public static final String l(@m80.k DataSource dataSource) {
        int i11 = a.f91456a[dataSource.ordinal()];
        if (i11 == 1 || i11 == 2) {
            return q.f91466b;
        }
        if (i11 == 3) {
            return q.f91467c;
        }
        if (i11 == 4) {
            return q.f91468d;
        }
        throw new NoWhenBranchMatchedException();
    }

    @m80.k
    public static final b0.c m(@m80.k b.a aVar) {
        return aVar instanceof k0.c ? ((k0.c) aVar).h() : b0.c.f5588b;
    }

    @m80.l
    public static final String n(@m80.k Uri uri) {
        return (String) r0.L2(uri.getPathSegments());
    }

    public static final int o(@m80.k Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicHeight() : bitmap.getHeight();
    }

    public static final int p(@m80.k Object obj) {
        return System.identityHashCode(obj);
    }

    @m80.l
    public static final String q(@m80.k MimeTypeMap mimeTypeMap, @m80.l String str) {
        if (str == null || k0.O3(str)) {
            return null;
        }
        return mimeTypeMap.getMimeTypeFromExtension(k0.N5(k0.P5(k0.X5(k0.X5(str, '#', null, 2, null), s60.d.f88057a, null, 2, null), '/', null, 2, null), '.', ""));
    }

    @m80.l
    public static final ColorSpace r() {
        return f91446c;
    }

    public static final int s(@m80.k Configuration configuration) {
        return configuration.uiMode & 48;
    }

    @m80.k
    public static final o0.p t(@m80.k View view) {
        o0.p pVar;
        int i11 = R.id.coil_request_manager;
        Object tag = view.getTag(i11);
        o0.p pVar2 = tag instanceof o0.p ? (o0.p) tag : null;
        if (pVar2 != null) {
            return pVar2;
        }
        synchronized (view) {
            try {
                Object tag2 = view.getTag(i11);
                pVar = tag2 instanceof o0.p ? (o0.p) tag2 : null;
                if (pVar == null) {
                    pVar = new o0.p(view);
                    view.addOnAttachStateChangeListener(pVar);
                    view.setTag(i11, pVar);
                }
            } finally {
            }
        }
        return pVar;
    }

    @m80.k
    public static final File u(@m80.k Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            throw new IllegalStateException("cacheDir == null");
        }
        cacheDir.mkdirs();
        return cacheDir;
    }

    @m80.k
    public static final Scale v(@m80.k ImageView imageView) {
        ImageView.ScaleType scaleType = imageView.getScaleType();
        int i11 = scaleType == null ? -1 : a.f91457b[scaleType.ordinal()];
        return (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) ? Scale.FIT : Scale.FILL;
    }

    @m80.k
    public static final Bitmap.Config[] w() {
        return f91444a;
    }

    public static final int x(@m80.k Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicWidth() : bitmap.getWidth();
    }

    public static final int y(@m80.k q0.g gVar, @m80.k Scale scale, @m80.k x00.a<Integer> aVar) {
        return q0.b.f(gVar) ? aVar.invoke().intValue() : J(gVar.e(), scale);
    }

    public static final boolean z(@m80.k Uri uri) {
        return g0.g(uri.getScheme(), "file") && g0.g(n(uri), "android_asset");
    }
}
