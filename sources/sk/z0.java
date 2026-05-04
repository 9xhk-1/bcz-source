package sk;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f88820a = "TransformationUtils";

    /* renamed from: b, reason: collision with root package name */
    public static final int f88821b = 6;

    /* renamed from: d, reason: collision with root package name */
    public static final int f88823d = 7;

    /* renamed from: f, reason: collision with root package name */
    public static final Paint f88825f;

    /* renamed from: g, reason: collision with root package name */
    public static final Set<String> f88826g;

    /* renamed from: h, reason: collision with root package name */
    public static final Lock f88827h;

    /* renamed from: c, reason: collision with root package name */
    public static final Paint f88822c = new Paint(6);

    /* renamed from: e, reason: collision with root package name */
    public static final Paint f88824e = new Paint(7);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f88828a;

        public a(int i11) {
            this.f88828a = i11;
        }

        @Override // sk.z0.c
        public void a(Canvas canvas, Paint paint, RectF rectF) {
            int i11 = this.f88828a;
            canvas.drawRoundRect(rectF, i11, i11, paint);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f88829a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f88830b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f88831c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f88832d;

        public b(float f11, float f12, float f13, float f14) {
            this.f88829a = f11;
            this.f88830b = f12;
            this.f88831c = f13;
            this.f88832d = f14;
        }

        @Override // sk.z0.c
        public void a(Canvas canvas, Paint paint, RectF rectF) {
            Path path = new Path();
            float f11 = this.f88829a;
            float f12 = this.f88830b;
            float f13 = this.f88831c;
            float f14 = this.f88832d;
            path.addRoundRect(rectF, new float[]{f11, f11, f12, f12, f13, f13, f14, f14}, Path.Direction.CW);
            canvas.drawPath(path, paint);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        void a(Canvas canvas, Paint paint, RectF rectF);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d implements Lock {
        @Override // java.util.concurrent.locks.Lock
        @NonNull
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long j11, @NonNull TimeUnit timeUnit) throws InterruptedException {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
        }
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        f88826g = hashSet;
        f88827h = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new d();
        Paint paint = new Paint(7);
        f88825f = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public static void a(@NonNull Bitmap bitmap, @NonNull Bitmap bitmap2, Matrix matrix) {
        Lock lock = f88827h;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f88822c);
            e(canvas);
            lock.unlock();
        } catch (Throwable th2) {
            f88827h.unlock();
            throw th2;
        }
    }

    public static Bitmap b(@NonNull lk.e eVar, @NonNull Bitmap bitmap, int i11, int i12) {
        float width;
        float height;
        if (bitmap.getWidth() == i11 && bitmap.getHeight() == i12) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f11 = 0.0f;
        if (bitmap.getWidth() * i12 > bitmap.getHeight() * i11) {
            width = i12 / bitmap.getHeight();
            f11 = (i11 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i11 / bitmap.getWidth();
            height = (i12 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (f11 + 0.5f), (int) (height + 0.5f));
        Bitmap f12 = eVar.f(i11, i12, k(bitmap));
        t(bitmap, f12);
        a(bitmap, f12, matrix);
        return f12;
    }

    public static Bitmap c(@NonNull lk.e eVar, @NonNull Bitmap bitmap, int i11, int i12) {
        if (bitmap.getWidth() > i11 || bitmap.getHeight() > i12) {
            if (Log.isLoggable(f88820a, 2)) {
                Log.v(f88820a, "requested target size too big for input, fit centering instead");
            }
            return f(eVar, bitmap, i11, i12);
        }
        if (Log.isLoggable(f88820a, 2)) {
            Log.v(f88820a, "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    public static Bitmap d(@NonNull lk.e eVar, @NonNull Bitmap bitmap, int i11, int i12) {
        int min = Math.min(i11, i12);
        float f11 = min;
        float f12 = f11 / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float max = Math.max(f11 / width, f11 / height);
        float f13 = width * max;
        float f14 = max * height;
        float f15 = (f11 - f13) / 2.0f;
        float f16 = (f11 - f14) / 2.0f;
        RectF rectF = new RectF(f15, f16, f13 + f15, f14 + f16);
        Bitmap g11 = g(eVar, bitmap);
        Bitmap f17 = eVar.f(min, min, h(bitmap));
        f17.setHasAlpha(true);
        Lock lock = f88827h;
        lock.lock();
        try {
            Canvas canvas = new Canvas(f17);
            canvas.drawCircle(f12, f12, f12, f88824e);
            canvas.drawBitmap(g11, (Rect) null, rectF, f88825f);
            e(canvas);
            lock.unlock();
            if (!g11.equals(bitmap)) {
                eVar.e(g11);
            }
            return f17;
        } catch (Throwable th2) {
            f88827h.unlock();
            throw th2;
        }
    }

    public static void e(Canvas canvas) {
        canvas.setBitmap(null);
    }

    public static Bitmap f(@NonNull lk.e eVar, @NonNull Bitmap bitmap, int i11, int i12) {
        if (bitmap.getWidth() != i11 || bitmap.getHeight() != i12) {
            float min = Math.min(i11 / bitmap.getWidth(), i12 / bitmap.getHeight());
            int round = Math.round(bitmap.getWidth() * min);
            int round2 = Math.round(bitmap.getHeight() * min);
            if (bitmap.getWidth() != round || bitmap.getHeight() != round2) {
                Bitmap f11 = eVar.f((int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), k(bitmap));
                t(bitmap, f11);
                if (Log.isLoggable(f88820a, 2)) {
                    Log.v(f88820a, "request: " + i11 + "x" + i12);
                    Log.v(f88820a, "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
                    Log.v(f88820a, "toReuse: " + f11.getWidth() + "x" + f11.getHeight());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("minPct:   ");
                    sb2.append(min);
                    Log.v(f88820a, sb2.toString());
                }
                Matrix matrix = new Matrix();
                matrix.setScale(min, min);
                a(bitmap, f11, matrix);
                return f11;
            }
            if (Log.isLoggable(f88820a, 2)) {
                Log.v(f88820a, "adjusted target size matches input, returning input");
            }
        } else if (Log.isLoggable(f88820a, 2)) {
            Log.v(f88820a, "requested target size matches input, returning input");
            return bitmap;
        }
        return bitmap;
    }

    public static Bitmap g(@NonNull lk.e eVar, @NonNull Bitmap bitmap) {
        Bitmap.Config h11 = h(bitmap);
        if (h11.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap f11 = eVar.f(bitmap.getWidth(), bitmap.getHeight(), h11);
        new Canvas(f11).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return f11;
    }

    @NonNull
    public static Bitmap.Config h(@NonNull Bitmap bitmap) {
        Bitmap.Config config;
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            config = Bitmap.Config.RGBA_F16;
            if (config.equals(bitmap.getConfig())) {
                config2 = Bitmap.Config.RGBA_F16;
                return config2;
            }
        }
        return Bitmap.Config.ARGB_8888;
    }

    public static Lock i() {
        return f88827h;
    }

    public static int j(int i11) {
        switch (i11) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    @NonNull
    public static Bitmap.Config k(@NonNull Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    @VisibleForTesting
    public static void l(int i11, Matrix matrix) {
        switch (i11) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
        }
    }

    public static boolean m(int i11) {
        switch (i11) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static Bitmap n(@NonNull Bitmap bitmap, int i11) {
        Bitmap bitmap2;
        Matrix matrix;
        if (i11 == 0) {
            return bitmap;
        }
        try {
            matrix = new Matrix();
            matrix.setRotate(i11);
            bitmap2 = bitmap;
        } catch (Exception e11) {
            e = e11;
            bitmap2 = bitmap;
        }
        try {
            return Bitmap.createBitmap(bitmap2, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (Exception e12) {
            e = e12;
            Exception exc = e;
            if (!Log.isLoggable(f88820a, 6)) {
                return bitmap2;
            }
            Log.e(f88820a, "Exception when trying to orient image", exc);
            return bitmap2;
        }
    }

    public static Bitmap o(@NonNull lk.e eVar, @NonNull Bitmap bitmap, int i11) {
        if (!m(i11)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        l(i11, matrix);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static Bitmap p(@NonNull lk.e eVar, @NonNull Bitmap bitmap, float f11, float f12, float f13, float f14) {
        return s(eVar, bitmap, new b(f11, f12, f13, f14));
    }

    public static Bitmap q(@NonNull lk.e eVar, @NonNull Bitmap bitmap, int i11) {
        fl.m.b(i11 > 0, "roundingRadius must be greater than 0.");
        return s(eVar, bitmap, new a(i11));
    }

    @Deprecated
    public static Bitmap r(@NonNull lk.e eVar, @NonNull Bitmap bitmap, int i11, int i12, int i13) {
        return q(eVar, bitmap, i13);
    }

    public static Bitmap s(@NonNull lk.e eVar, @NonNull Bitmap bitmap, c cVar) {
        Bitmap.Config h11 = h(bitmap);
        Bitmap g11 = g(eVar, bitmap);
        Bitmap f11 = eVar.f(g11.getWidth(), g11.getHeight(), h11);
        f11.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(g11, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, f11.getWidth(), f11.getHeight());
        Lock lock = f88827h;
        lock.lock();
        try {
            Canvas canvas = new Canvas(f11);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            cVar.a(canvas, paint, rectF);
            e(canvas);
            lock.unlock();
            if (!g11.equals(bitmap)) {
                eVar.e(g11);
            }
            return f11;
        } catch (Throwable th2) {
            f88827h.unlock();
            throw th2;
        }
    }

    public static void t(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
