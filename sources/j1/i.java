package j1;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.FloatRange;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public static final PointF f63121a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static double b(double d11, double d12, double d13) {
        return Math.max(d12, Math.min(d13, d11));
    }

    public static float c(float f11, float f12, float f13) {
        return Math.max(f12, Math.min(f13, f11));
    }

    public static int d(int i11, int i12, int i13) {
        return Math.max(i12, Math.min(i13, i11));
    }

    public static boolean e(float f11, float f12, float f13) {
        return f11 >= f12 && f11 <= f13;
    }

    public static int f(int i11, int i12) {
        int i13 = i11 / i12;
        return (((i11 ^ i12) >= 0) || i11 % i12 == 0) ? i13 : i13 - 1;
    }

    public static int g(float f11, float f12) {
        return h((int) f11, (int) f12);
    }

    public static int h(int i11, int i12) {
        return i11 - (i12 * f(i11, i12));
    }

    public static void i(e1.i iVar, Path path) {
        Path path2;
        path.reset();
        PointF b11 = iVar.b();
        path.moveTo(b11.x, b11.y);
        f63121a.set(b11.x, b11.y);
        int i11 = 0;
        while (i11 < iVar.a().size()) {
            c1.a aVar = iVar.a().get(i11);
            PointF a11 = aVar.a();
            PointF b12 = aVar.b();
            PointF c11 = aVar.c();
            PointF pointF = f63121a;
            if (a11.equals(pointF) && b12.equals(c11)) {
                path.lineTo(c11.x, c11.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(a11.x, a11.y, b12.x, b12.y, c11.x, c11.y);
            }
            pointF.set(c11.x, c11.y);
            i11++;
            path = path2;
        }
        Path path3 = path;
        if (iVar.d()) {
            path3.close();
        }
    }

    public static double j(double d11, double d12, @FloatRange(from = 0.0d, to = 1.0d) double d13) {
        return d11 + (d13 * (d12 - d11));
    }

    public static float k(float f11, float f12, @FloatRange(from = 0.0d, to = 1.0d) float f13) {
        return f11 + (f13 * (f12 - f11));
    }

    public static int l(int i11, int i12, @FloatRange(from = 0.0d, to = 1.0d) float f11) {
        return (int) (i11 + (f11 * (i12 - i11)));
    }

    public static void m(c1.d dVar, int i11, List<c1.d> list, c1.d dVar2, y0.k kVar) {
        if (dVar.c(kVar.getName(), i11)) {
            list.add(dVar2.a(kVar.getName()).j(kVar));
        }
    }
}
