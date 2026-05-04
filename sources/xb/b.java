package xb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.io.File;
import java.io.FileOutputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f97933a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f97934b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f97935c = 2;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f97936a;

        /* renamed from: b, reason: collision with root package name */
        public int f97937b;

        /* renamed from: c, reason: collision with root package name */
        public int f97938c;

        /* renamed from: d, reason: collision with root package name */
        public int f97939d;
    }

    public static Bitmap a(Bitmap src, int dstWidth, int dstHeight) {
        return b(src, dstWidth, dstHeight, 2);
    }

    public static Bitmap b(Bitmap src, int dstWidth, int dstHeight, int segment) {
        if (src == null || dstWidth <= 0 || dstHeight <= 0) {
            return null;
        }
        if (segment < 0 || segment > 2) {
            segment = 2;
        }
        a c11 = c(src.getWidth(), src.getHeight(), dstWidth, dstHeight, segment);
        if (c11 == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(src, c11.f97936a, c11.f97937b, c11.f97938c, c11.f97939d);
        if (createBitmap != src) {
            src.recycle();
        }
        return createBitmap;
    }

    public static a c(int srcWidth, int srcHeight, int dstWidth, int dstHeight, int segment) {
        if (srcWidth == 0 || srcHeight == 0 || dstWidth == 0 || dstHeight == 0) {
            return null;
        }
        a aVar = new a();
        if (dstWidth / dstHeight > srcWidth / srcHeight) {
            int i11 = (dstHeight * srcWidth) / dstWidth;
            aVar.f97936a = 0;
            if (segment == 0) {
                aVar.f97937b = 0;
            } else if (segment != 1) {
                aVar.f97937b = (srcHeight - i11) / 2;
            } else {
                aVar.f97937b = srcHeight - i11;
            }
            aVar.f97938c = srcWidth;
            aVar.f97939d = i11;
            return aVar;
        }
        int i12 = (dstWidth * srcHeight) / dstHeight;
        if (segment == 0) {
            aVar.f97936a = 0;
        } else if (segment != 1) {
            aVar.f97936a = (srcWidth - i12) / 2;
        } else {
            aVar.f97936a = srcWidth - i12;
        }
        aVar.f97937b = 0;
        aVar.f97938c = i12;
        aVar.f97939d = srcHeight;
        return aVar;
    }

    public static Bitmap d(Bitmap src, final int degrees) {
        return e(src, degrees, Bitmap.Config.ARGB_8888);
    }

    public static Bitmap e(Bitmap src, final int degrees, Bitmap.Config config) {
        float height;
        float width;
        if (src == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(degrees, src.getWidth() / 2.0f, src.getHeight() / 2.0f);
        if (90 == degrees) {
            height = src.getHeight();
            width = 0.0f;
        } else {
            height = src.getHeight();
            width = src.getWidth();
        }
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        matrix.postTranslate(height - fArr[2], width - fArr[5]);
        Bitmap createBitmap = Bitmap.createBitmap(src.getHeight(), src.getWidth(), config);
        new Canvas(createBitmap).drawBitmap(src, matrix, new Paint());
        return createBitmap;
    }

    public static void f(Bitmap bmp, String path, boolean replace) {
        g(bmp, path, replace, Bitmap.CompressFormat.PNG, 100);
    }

    public static void g(Bitmap bmp, String path, boolean replace, Bitmap.CompressFormat format, int quality) {
        if (bmp == null) {
            return;
        }
        File file = new File(path);
        if (file.exists()) {
            if (replace) {
                file.delete();
                g(bmp, path, true, format, quality);
                return;
            }
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bmp.compress(format, quality, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
