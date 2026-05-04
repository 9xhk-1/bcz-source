package mk;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.annotation.VisibleForTesting;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    public static final String f73455e = "MemorySizeCalculator";

    /* renamed from: f, reason: collision with root package name */
    @VisibleForTesting
    public static final int f73456f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f73457g = 2;

    /* renamed from: a, reason: collision with root package name */
    public final int f73458a;

    /* renamed from: b, reason: collision with root package name */
    public final int f73459b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f73460c;

    /* renamed from: d, reason: collision with root package name */
    public final int f73461d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: i, reason: collision with root package name */
        @VisibleForTesting
        public static final int f73462i = 2;

        /* renamed from: j, reason: collision with root package name */
        public static final int f73463j;

        /* renamed from: k, reason: collision with root package name */
        public static final float f73464k = 0.4f;

        /* renamed from: l, reason: collision with root package name */
        public static final float f73465l = 0.33f;

        /* renamed from: m, reason: collision with root package name */
        public static final int f73466m = 4194304;

        /* renamed from: a, reason: collision with root package name */
        public final Context f73467a;

        /* renamed from: b, reason: collision with root package name */
        public ActivityManager f73468b;

        /* renamed from: c, reason: collision with root package name */
        public c f73469c;

        /* renamed from: e, reason: collision with root package name */
        public float f73471e;

        /* renamed from: d, reason: collision with root package name */
        public float f73470d = 2.0f;

        /* renamed from: f, reason: collision with root package name */
        public float f73472f = 0.4f;

        /* renamed from: g, reason: collision with root package name */
        public float f73473g = 0.33f;

        /* renamed from: h, reason: collision with root package name */
        public int f73474h = 4194304;

        static {
            f73463j = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.f73471e = f73463j;
            this.f73467a = context;
            this.f73468b = (ActivityManager) context.getSystemService("activity");
            this.f73469c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !l.e(this.f73468b)) {
                return;
            }
            this.f73471e = 0.0f;
        }

        public l a() {
            return new l(this);
        }

        @VisibleForTesting
        public a b(ActivityManager activityManager) {
            this.f73468b = activityManager;
            return this;
        }

        public a c(int i11) {
            this.f73474h = i11;
            return this;
        }

        public a d(float f11) {
            fl.m.b(f11 >= 0.0f, "Bitmap pool screens must be greater than or equal to 0");
            this.f73471e = f11;
            return this;
        }

        public a e(float f11) {
            fl.m.b(f11 >= 0.0f && f11 <= 1.0f, "Low memory max size multiplier must be between 0 and 1");
            this.f73473g = f11;
            return this;
        }

        public a f(float f11) {
            fl.m.b(f11 >= 0.0f && f11 <= 1.0f, "Size multiplier must be between 0 and 1");
            this.f73472f = f11;
            return this;
        }

        public a g(float f11) {
            fl.m.b(f11 >= 0.0f, "Memory cache screens must be greater than or equal to 0");
            this.f73470d = f11;
            return this;
        }

        @VisibleForTesting
        public a h(c cVar) {
            this.f73469c = cVar;
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final DisplayMetrics f73475a;

        public b(DisplayMetrics displayMetrics) {
            this.f73475a = displayMetrics;
        }

        @Override // mk.l.c
        public int a() {
            return this.f73475a.heightPixels;
        }

        @Override // mk.l.c
        public int b() {
            return this.f73475a.widthPixels;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        int a();

        int b();
    }

    public l(a aVar) {
        this.f73460c = aVar.f73467a;
        int i11 = e(aVar.f73468b) ? aVar.f73474h / 2 : aVar.f73474h;
        this.f73461d = i11;
        int c11 = c(aVar.f73468b, aVar.f73472f, aVar.f73473g);
        float b11 = aVar.f73469c.b() * aVar.f73469c.a() * 4;
        int round = Math.round(aVar.f73471e * b11);
        int round2 = Math.round(b11 * aVar.f73470d);
        int i12 = c11 - i11;
        int i13 = round2 + round;
        if (i13 <= i12) {
            this.f73459b = round2;
            this.f73458a = round;
        } else {
            float f11 = i12;
            float f12 = aVar.f73471e;
            float f13 = aVar.f73470d;
            float f14 = f11 / (f12 + f13);
            this.f73459b = Math.round(f13 * f14);
            this.f73458a = Math.round(f14 * aVar.f73471e);
        }
        if (Log.isLoggable(f73455e, 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Calculation complete, Calculated memory cache size: ");
            sb2.append(f(this.f73459b));
            sb2.append(", pool size: ");
            sb2.append(f(this.f73458a));
            sb2.append(", byte array size: ");
            sb2.append(f(i11));
            sb2.append(", memory class limited? ");
            sb2.append(i13 > c11);
            sb2.append(", max size: ");
            sb2.append(f(c11));
            sb2.append(", memoryClass: ");
            sb2.append(aVar.f73468b.getMemoryClass());
            sb2.append(", isLowMemoryDevice: ");
            sb2.append(e(aVar.f73468b));
            Log.d(f73455e, sb2.toString());
        }
    }

    public static int c(ActivityManager activityManager, float f11, float f12) {
        float memoryClass = activityManager.getMemoryClass() * 1048576;
        if (e(activityManager)) {
            f11 = f12;
        }
        return Math.round(memoryClass * f11);
    }

    @TargetApi(19)
    public static boolean e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    public int a() {
        return this.f73461d;
    }

    public int b() {
        return this.f73458a;
    }

    public int d() {
        return this.f73459b;
    }

    public final String f(int i11) {
        return Formatter.formatFileSize(this.f73460c, i11);
    }
}
