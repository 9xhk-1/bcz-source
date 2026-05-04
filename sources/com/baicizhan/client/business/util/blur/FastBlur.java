package com.baicizhan.client.business.util.blur;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.malmstein.fenster.videorender.gles.GeneratedTexture;
import java.lang.reflect.Array;
import lq.c;
import xb.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class FastBlur {
    public static final int DEFAULT_RADIUS = 25;
    public static final float DEFAULT_SCALE_FACTOR = 1.0f;
    public static final String TAG = "FastBlur";
    public static final int WALLPAPER_RADIUS = 16;
    public static final float WALLPAPER_SCALE_FACTOR = 6.0f;

    private FastBlur() {
    }

    public static Bitmap blur(Bitmap source, boolean canReuseSource) {
        return blur(source, canReuseSource, 1.0f, 25, 0);
    }

    public static Bitmap blurWallpaper(Activity activity, int dstWidth, int dstHeight, int overcolor) {
        Bitmap bitmap = ((BitmapDrawable) activity.getWallpaper()).getBitmap();
        Bitmap b11 = b.b(bitmap.copy(bitmap.getConfig(), false), dstWidth, dstHeight, 2);
        if (b11 == null) {
            return null;
        }
        return blur(b11, true, 6.0f, 16, overcolor);
    }

    public static Bitmap doBlur(Bitmap source, int radius, boolean canReuseInBitmap) {
        int i11;
        int i12 = radius;
        Bitmap copy = canReuseInBitmap ? source : source.copy(source.getConfig(), true);
        if (i12 < 1) {
            return null;
        }
        int width = copy.getWidth();
        int height = copy.getHeight();
        int i13 = width * height;
        int[] iArr = new int[i13];
        copy.getPixels(iArr, 0, width, 0, 0, width, height);
        int i14 = width - 1;
        int i15 = height - 1;
        int i16 = i12 + i12;
        int i17 = i16 + 1;
        int[] iArr2 = new int[i13];
        int[] iArr3 = new int[i13];
        int[] iArr4 = new int[i13];
        int[] iArr5 = new int[Math.max(width, height)];
        int i18 = (i16 + 2) >> 1;
        int i19 = i18 * i18;
        int i21 = i19 * 256;
        int[] iArr6 = new int[i21];
        int i22 = 0;
        for (int i23 = 0; i23 < i21; i23++) {
            iArr6[i23] = i23 / i19;
        }
        int[][] iArr7 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i17, 3);
        int i24 = i12 + 1;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        while (i25 < height) {
            int[] iArr8 = iArr6;
            int i28 = -i12;
            int i29 = i22;
            int i31 = i29;
            int i32 = i31;
            int i33 = i32;
            int i34 = i33;
            int i35 = i34;
            int i36 = i35;
            int i37 = i36;
            int i38 = i37;
            while (i28 <= i12) {
                int[] iArr9 = iArr4;
                Bitmap bitmap = copy;
                int i39 = i22;
                int i41 = iArr[i26 + Math.min(i14, Math.max(i28, i39))];
                int[] iArr10 = iArr7[i28 + i12];
                iArr10[i39] = (i41 & GeneratedTexture.f39227d) >> 16;
                iArr10[1] = (i41 & 65280) >> 8;
                iArr10[2] = i41 & 255;
                int abs = i24 - Math.abs(i28);
                int i42 = iArr10[i39];
                i38 += i42 * abs;
                int i43 = iArr10[1];
                i29 += i43 * abs;
                int i44 = iArr10[2];
                i31 += abs * i44;
                if (i28 > 0) {
                    i35 += i42;
                    i36 += i43;
                    i37 += i44;
                } else {
                    i32 += i42;
                    i33 += i43;
                    i34 += i44;
                }
                i28++;
                iArr4 = iArr9;
                copy = bitmap;
                i22 = 0;
            }
            int[] iArr11 = iArr4;
            Bitmap bitmap2 = copy;
            int i45 = i12;
            int i46 = 0;
            while (i46 < width) {
                iArr2[i26] = iArr8[i38];
                iArr3[i26] = iArr8[i29];
                iArr11[i26] = iArr8[i31];
                int i47 = i38 - i32;
                int i48 = i29 - i33;
                int i49 = i31 - i34;
                int[] iArr12 = iArr7[((i45 - i12) + i17) % i17];
                int i51 = i32 - iArr12[0];
                int i52 = i33 - iArr12[1];
                int i53 = i34 - iArr12[2];
                if (i25 == 0) {
                    i11 = i46;
                    iArr5[i11] = Math.min(i46 + i12 + 1, i14);
                } else {
                    i11 = i46;
                }
                int i54 = iArr[i27 + iArr5[i11]];
                int i55 = (i54 & GeneratedTexture.f39227d) >> 16;
                iArr12[0] = i55;
                int i56 = (i54 & 65280) >> 8;
                iArr12[1] = i56;
                int i57 = i54 & 255;
                iArr12[2] = i57;
                int i58 = i35 + i55;
                int i59 = i36 + i56;
                int i61 = i37 + i57;
                i38 = i47 + i58;
                i29 = i48 + i59;
                i31 = i49 + i61;
                i45 = (i45 + 1) % i17;
                int[] iArr13 = iArr7[i45 % i17];
                int i62 = iArr13[0];
                i32 = i51 + i62;
                int i63 = iArr13[1];
                i33 = i52 + i63;
                int i64 = iArr13[2];
                i34 = i53 + i64;
                i35 = i58 - i62;
                i36 = i59 - i63;
                i37 = i61 - i64;
                i26++;
                i46 = i11 + 1;
            }
            i27 += width;
            i25++;
            iArr6 = iArr8;
            iArr4 = iArr11;
            copy = bitmap2;
            i22 = 0;
        }
        int[] iArr14 = iArr6;
        int[] iArr15 = iArr4;
        Bitmap bitmap3 = copy;
        int i65 = 0;
        while (i65 < width) {
            int i66 = -i12;
            int i67 = i65;
            int i68 = i66 * width;
            int i69 = 0;
            int i71 = 0;
            int i72 = 0;
            int i73 = 0;
            int i74 = 0;
            int i75 = 0;
            int i76 = 0;
            int i77 = 0;
            int i78 = 0;
            while (i66 <= i12) {
                int max = Math.max(0, i68) + i67;
                int[] iArr16 = iArr7[i66 + radius];
                iArr16[0] = iArr2[max];
                iArr16[1] = iArr3[max];
                iArr16[2] = iArr15[max];
                int abs2 = i24 - Math.abs(i66);
                i78 += iArr2[max] * abs2;
                i69 += iArr3[max] * abs2;
                i71 += iArr15[max] * abs2;
                if (i66 > 0) {
                    i75 += iArr16[0];
                    i76 += iArr16[1];
                    i77 += iArr16[2];
                } else {
                    i72 += iArr16[0];
                    i73 += iArr16[1];
                    i74 += iArr16[2];
                }
                if (i66 < i15) {
                    i68 += width;
                }
                i66++;
                i12 = radius;
            }
            int i79 = i78;
            int i81 = i67;
            int i82 = radius;
            for (int i83 = 0; i83 < height; i83++) {
                iArr[i81] = (iArr[i81] & (-16777216)) | (iArr14[i79] << 16) | (iArr14[i69] << 8) | iArr14[i71];
                int i84 = i79 - i72;
                int i85 = i69 - i73;
                int i86 = i71 - i74;
                int[] iArr17 = iArr7[((i82 - radius) + i17) % i17];
                int i87 = i72 - iArr17[0];
                int i88 = i73 - iArr17[1];
                int i89 = i74 - iArr17[2];
                int i91 = i81;
                if (i67 == 0) {
                    iArr5[i83] = Math.min(i83 + i24, i15) * width;
                }
                int i92 = i67 + iArr5[i83];
                int i93 = iArr2[i92];
                iArr17[0] = i93;
                int i94 = iArr3[i92];
                iArr17[1] = i94;
                int i95 = iArr15[i92];
                iArr17[2] = i95;
                int i96 = i75 + i93;
                int i97 = i76 + i94;
                int i98 = i77 + i95;
                i79 = i84 + i96;
                i69 = i85 + i97;
                i71 = i86 + i98;
                i82 = (i82 + 1) % i17;
                int[] iArr18 = iArr7[i82];
                int i99 = iArr18[0];
                i72 = i87 + i99;
                int i100 = iArr18[1];
                i73 = i88 + i100;
                int i101 = iArr18[2];
                i74 = i89 + i101;
                i75 = i96 - i99;
                i76 = i97 - i100;
                i77 = i98 - i101;
                i81 = i91 + width;
            }
            i65 = i67 + 1;
            i12 = radius;
        }
        bitmap3.setPixels(iArr, 0, width, 0, 0, width, height);
        return bitmap3;
    }

    public static void setBlurWallpaperBackground(final Activity activity, final View target) {
        setBlurWallpaperBackground(activity, target, 0);
    }

    public static void setBlurWallpaperSource(final Activity activity, final ImageView target) {
        setBlurWallpaperSource(activity, target, 0);
    }

    public static Bitmap blur(Bitmap source, boolean canReuseSource, float scaleFactor, int radius, int overcolor) {
        if (!canReuseSource) {
            source = source.copy(source.getConfig(), true);
        }
        int width = (int) (source.getWidth() / scaleFactor);
        int height = (int) (source.getHeight() / scaleFactor);
        if (width <= 0 || height <= 0) {
            if (source.getWidth() <= 0 || source.getHeight() <= 0) {
                return source;
            }
            width = source.getWidth();
            height = source.getHeight();
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, source.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        float f11 = 1.0f / scaleFactor;
        canvas.scale(f11, f11);
        Paint paint = new Paint();
        paint.setFlags(2);
        paint.setColorFilter(new PorterDuffColorFilter(overcolor, PorterDuff.Mode.SRC_ATOP));
        canvas.drawBitmap(source, 0.0f, 0.0f, paint);
        source.recycle();
        return doBlur(createBitmap, radius, true);
    }

    public static void setBlurWallpaperBackground(final Activity activity, final View target, final int overcolor) {
        target.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.baicizhan.client.business.util.blur.FastBlur.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                try {
                    target.getViewTreeObserver().removeOnPreDrawListener(this);
                    target.buildDrawingCache();
                    c.b(target, new BitmapDrawable(target.getContext().getResources(), FastBlur.blurWallpaper(activity, target.getMeasuredWidth(), target.getMeasuredHeight(), overcolor)));
                    return true;
                } catch (Throwable th2) {
                    if (th2 instanceof IllegalArgumentException) {
                        qb.c.c(FastBlur.TAG, "setBlurWallpaperBackground onPreDraw failed. ", th2);
                        return true;
                    }
                    qb.c.c(FastBlur.TAG, "setBlurWallpaperBackground onPreDraw failed. ", th2);
                    return true;
                }
            }
        });
    }

    public static void setBlurWallpaperSource(final Activity activity, final ImageView target, final int overcolor) {
        target.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.baicizhan.client.business.util.blur.FastBlur.2
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                target.getViewTreeObserver().removeOnPreDrawListener(this);
                target.buildDrawingCache();
                target.setImageBitmap(FastBlur.blurWallpaper(activity, target.getMeasuredWidth(), target.getMeasuredHeight(), overcolor));
                return true;
            }
        });
    }
}
