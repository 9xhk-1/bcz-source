package j1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.provider.Settings;
import androidx.annotation.Nullable;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;
import y0.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final int f63122a = 1000000000;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<PathMeasure> f63123b = new a();

    /* renamed from: c, reason: collision with root package name */
    public static final ThreadLocal<Path> f63124c = new b();

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal<Path> f63125d = new c();

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal<float[]> f63126e = new d();

    /* renamed from: f, reason: collision with root package name */
    public static final float f63127f = (float) (Math.sqrt(2.0d) / 2.0d);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends ThreadLocal<PathMeasure> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends ThreadLocal<Path> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends ThreadLocal<Path> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends ThreadLocal<float[]> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public float[] initialValue() {
            return new float[4];
        }
    }

    public static void a(Path path, float f11, float f12, float f13) {
        com.airbnb.lottie.e.a("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = f63123b.get();
        Path path2 = f63124c.get();
        Path path3 = f63125d.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f11 == 1.0f && f12 == 0.0f) {
            com.airbnb.lottie.e.b("applyTrimPathIfNeeded");
            return;
        }
        if (length < 1.0f || Math.abs((f12 - f11) - 1.0f) < 0.01d) {
            com.airbnb.lottie.e.b("applyTrimPathIfNeeded");
            return;
        }
        float f14 = f11 * length;
        float f15 = f12 * length;
        float f16 = f13 * length;
        float min = Math.min(f14, f15) + f16;
        float max = Math.max(f14, f15) + f16;
        if (min >= length && max >= length) {
            min = i.g(min, length);
            max = i.g(max, length);
        }
        if (min < 0.0f) {
            min = i.g(min, length);
        }
        if (max < 0.0f) {
            max = i.g(max, length);
        }
        if (min == max) {
            path.reset();
            com.airbnb.lottie.e.b("applyTrimPathIfNeeded");
            return;
        }
        if (min >= max) {
            min -= length;
        }
        path2.reset();
        pathMeasure.getSegment(min, max, path2, true);
        if (max > length) {
            path3.reset();
            pathMeasure.getSegment(0.0f, max % length, path3, true);
            path2.addPath(path3);
        } else if (min < 0.0f) {
            path3.reset();
            pathMeasure.getSegment(min + length, length, path3, true);
            path2.addPath(path3);
        }
        path.set(path2);
        com.airbnb.lottie.e.b("applyTrimPathIfNeeded");
    }

    public static void b(Path path, @Nullable v vVar) {
        if (vVar == null || vVar.k()) {
            return;
        }
        a(path, ((z0.d) vVar.i()).p() / 100.0f, ((z0.d) vVar.c()).p() / 100.0f, ((z0.d) vVar.h()).p() / 360.0f);
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused) {
            }
        }
    }

    public static Path d(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
            return path;
        }
        float f11 = pointF.x + pointF3.x;
        float f12 = pointF.y + pointF3.y;
        float f13 = pointF2.x;
        float f14 = f13 + pointF4.x;
        float f15 = pointF2.y;
        path.cubicTo(f11, f12, f14, f15 + pointF4.y, f13, f15);
        return path;
    }

    public static float e() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float f(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static float g(Matrix matrix) {
        float[] fArr = f63126e.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f11 = f63127f;
        fArr[2] = f11;
        fArr[3] = f11;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static boolean h(Matrix matrix) {
        float[] fArr = f63126e.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    public static int i(float f11, float f12, float f13, float f14) {
        int i11 = f11 != 0.0f ? (int) (527 * f11) : 17;
        if (f12 != 0.0f) {
            i11 = (int) (i11 * 31 * f12);
        }
        if (f13 != 0.0f) {
            i11 = (int) (i11 * 31 * f13);
        }
        return f14 != 0.0f ? (int) (i11 * 31 * f14) : i11;
    }

    public static boolean j(int i11, int i12, int i13, int i14, int i15, int i16) {
        if (i11 < i14) {
            return false;
        }
        if (i11 > i14) {
            return true;
        }
        if (i12 < i15) {
            return false;
        }
        return i12 > i15 || i13 >= i16;
    }

    public static boolean k(Throwable th2) {
        return (th2 instanceof SocketException) || (th2 instanceof ClosedChannelException) || (th2 instanceof InterruptedIOException) || (th2 instanceof ProtocolException) || (th2 instanceof SSLException) || (th2 instanceof UnknownHostException) || (th2 instanceof UnknownServiceException);
    }

    public static Bitmap l(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, false);
        Bitmap createBitmap = Bitmap.createBitmap((int) rectF.right, (int) rectF.bottom, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        x0.a aVar = new x0.a();
        aVar.setAntiAlias(true);
        aVar.setColor(-16776961);
        canvas.drawPath(path, aVar);
        return createBitmap;
    }

    public static Bitmap m(Bitmap bitmap, int i11, int i12) {
        if (bitmap.getWidth() == i11 && bitmap.getHeight() == i12) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i11, i12, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    public static void n(Canvas canvas, RectF rectF, Paint paint) {
        o(canvas, rectF, paint, 31);
    }

    public static void o(Canvas canvas, RectF rectF, Paint paint, int i11) {
        com.airbnb.lottie.e.a("Utils#saveLayer");
        canvas.saveLayer(rectF, paint);
        com.airbnb.lottie.e.b("Utils#saveLayer");
    }
}
