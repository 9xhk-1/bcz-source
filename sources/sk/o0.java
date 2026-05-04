package sk;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Gainmap;
import android.graphics.Paint;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import fl.h;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import sk.o0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f88772a = "GlideBitmapFactory";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(34)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final ColorMatrixColorFilter f88773a = new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 255.0f});

        public static Gainmap a(Gainmap gainmap) {
            Bitmap gainmapContents;
            float[] ratioMin;
            float[] ratioMax;
            float[] gamma;
            float[] epsilonSdr;
            float[] epsilonHdr;
            float displayRatioForFullHdr;
            float minDisplayRatioForHdrTransition;
            gainmapContents = gainmap.getGainmapContents();
            if (gainmapContents.getConfig() != Bitmap.Config.ALPHA_8) {
                return gainmap;
            }
            Gainmap a11 = e0.a(b(gainmapContents));
            ratioMin = gainmap.getRatioMin();
            a11.setRatioMin(ratioMin[0], ratioMin[1], ratioMin[2]);
            ratioMax = gainmap.getRatioMax();
            a11.setRatioMax(ratioMax[0], ratioMax[1], ratioMax[2]);
            gamma = gainmap.getGamma();
            a11.setGamma(gamma[0], gamma[1], gamma[2]);
            epsilonSdr = gainmap.getEpsilonSdr();
            a11.setEpsilonSdr(epsilonSdr[0], epsilonSdr[1], epsilonSdr[2]);
            epsilonHdr = gainmap.getEpsilonHdr();
            a11.setEpsilonHdr(epsilonHdr[0], epsilonHdr[1], epsilonHdr[2]);
            displayRatioForFullHdr = gainmap.getDisplayRatioForFullHdr();
            a11.setDisplayRatioForFullHdr(displayRatioForFullHdr);
            minDisplayRatioForHdrTransition = gainmap.getMinDisplayRatioForHdrTransition();
            a11.setMinDisplayRatioForHdrTransition(minDisplayRatioForHdrTransition);
            return a11;
        }

        public static Bitmap b(Bitmap bitmap) {
            fl.m.a(bitmap.getConfig() == Bitmap.Config.ALPHA_8);
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setColorFilter(f88773a);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            canvas.setBitmap(null);
            return createBitmap;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final String f88774a = "GainmapWorkaroundCalc";

        /* renamed from: b, reason: collision with root package name */
        public static final h.b<Boolean> f88775b = fl.h.a(new h.b() { // from class: sk.p0
            @Override // fl.h.b
            public final Object get() {
                Boolean valueOf;
                valueOf = Boolean.valueOf(o0.b.c());
                return valueOf;
            }
        });

        public static boolean c() {
            Bitmap.Config config;
            if (Build.VERSION.SDK_INT != 34) {
                return false;
            }
            Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
            config = Bitmap.Config.HARDWARE;
            Bitmap copy = createBitmap.copy(config, false);
            createBitmap.recycle();
            boolean z11 = copy == null;
            if (Log.isLoggable(f88774a, 2)) {
                Log.v(f88774a, "calculateNeedsGainmapDecodeWorkaround=" + z11);
            }
            if (copy != null) {
                copy.recycle();
            }
            return z11;
        }

        public static boolean d(BitmapFactory.Options options) {
            Bitmap.Config config;
            if (Build.VERSION.SDK_INT != 34) {
                return false;
            }
            Bitmap.Config config2 = options.inPreferredConfig;
            config = Bitmap.Config.HARDWARE;
            if (config2 != config) {
                return false;
            }
            return f88775b.get().booleanValue();
        }
    }

    @Nullable
    public static Bitmap a(byte[] bArr, BitmapFactory.Options options, com.bumptech.glide.load.resource.bitmap.b bVar) {
        return (Build.VERSION.SDK_INT == 34 && b.d(options) && d(bVar)) ? g(bArr, options) : BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
    }

    @Nullable
    public static Bitmap b(FileDescriptor fileDescriptor, BitmapFactory.Options options, com.bumptech.glide.load.resource.bitmap.b bVar) {
        return (Build.VERSION.SDK_INT == 34 && b.d(options) && d(bVar)) ? e(fileDescriptor, options) : BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
    }

    @Nullable
    public static Bitmap c(InputStream inputStream, BitmapFactory.Options options, com.bumptech.glide.load.resource.bitmap.b bVar) {
        return (Build.VERSION.SDK_INT == 34 && b.d(options) && d(bVar)) ? f(inputStream, options) : BitmapFactory.decodeStream(inputStream, null, options);
    }

    public static boolean d(com.bumptech.glide.load.resource.bitmap.b bVar) {
        try {
            boolean a11 = bVar.a();
            if (!Log.isLoggable(f88772a, 2)) {
                return a11;
            }
            Log.v(f88772a, "isLikelyToContainGainmap=" + a11);
            return a11;
        } catch (IOException e11) {
            if (!Log.isLoggable(f88772a, 2)) {
                return false;
            }
            Log.v(f88772a, "isLikelyToContainGainmap failed", e11);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r3 != null) goto L14;
     */
    @androidx.annotation.Nullable
    @androidx.annotation.RequiresApi(34)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap e(java.io.FileDescriptor r3, android.graphics.BitmapFactory.Options r4) {
        /*
            android.graphics.Bitmap$Config r0 = r4.inPreferredConfig
            android.graphics.Bitmap$Config r1 = androidx.compose.ui.graphics.l0.a()
            if (r0 != r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            fl.m.a(r0)
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r4.inPreferredConfig = r0
            r0 = 0
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFileDescriptor(r3, r0, r4)     // Catch: java.lang.Throwable -> L2d
            if (r3 != 0) goto L23
            if (r3 == 0) goto L1c
            goto L27
        L1c:
            android.graphics.Bitmap$Config r3 = androidx.compose.ui.graphics.l0.a()
            r4.inPreferredConfig = r3
            return r0
        L23:
            android.graphics.Bitmap r0 = h(r3)     // Catch: java.lang.Throwable -> L2b
        L27:
            r3.recycle()
            goto L1c
        L2b:
            r0 = move-exception
            goto L31
        L2d:
            r3 = move-exception
            r2 = r0
            r0 = r3
            r3 = r2
        L31:
            if (r3 == 0) goto L36
            r3.recycle()
        L36:
            android.graphics.Bitmap$Config r3 = androidx.compose.ui.graphics.l0.a()
            r4.inPreferredConfig = r3
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sk.o0.e(java.io.FileDescriptor, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r3 != null) goto L14;
     */
    @androidx.annotation.Nullable
    @androidx.annotation.RequiresApi(34)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap f(java.io.InputStream r3, android.graphics.BitmapFactory.Options r4) {
        /*
            android.graphics.Bitmap$Config r0 = r4.inPreferredConfig
            android.graphics.Bitmap$Config r1 = androidx.compose.ui.graphics.l0.a()
            if (r0 != r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            fl.m.a(r0)
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r4.inPreferredConfig = r0
            r0 = 0
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r3, r0, r4)     // Catch: java.lang.Throwable -> L2d
            if (r3 != 0) goto L23
            if (r3 == 0) goto L1c
            goto L27
        L1c:
            android.graphics.Bitmap$Config r3 = androidx.compose.ui.graphics.l0.a()
            r4.inPreferredConfig = r3
            return r0
        L23:
            android.graphics.Bitmap r0 = h(r3)     // Catch: java.lang.Throwable -> L2b
        L27:
            r3.recycle()
            goto L1c
        L2b:
            r0 = move-exception
            goto L31
        L2d:
            r3 = move-exception
            r2 = r0
            r0 = r3
            r3 = r2
        L31:
            if (r3 == 0) goto L36
            r3.recycle()
        L36:
            android.graphics.Bitmap$Config r3 = androidx.compose.ui.graphics.l0.a()
            r4.inPreferredConfig = r3
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sk.o0.f(java.io.InputStream, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r4 != null) goto L14;
     */
    @androidx.annotation.Nullable
    @androidx.annotation.RequiresApi(34)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap g(byte[] r4, android.graphics.BitmapFactory.Options r5) {
        /*
            android.graphics.Bitmap$Config r0 = r5.inPreferredConfig
            android.graphics.Bitmap$Config r1 = androidx.compose.ui.graphics.l0.a()
            r2 = 0
            if (r0 != r1) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = r2
        Lc:
            fl.m.a(r0)
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r5.inPreferredConfig = r0
            r0 = 0
            int r1 = r4.length     // Catch: java.lang.Throwable -> L2f
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeByteArray(r4, r2, r1, r5)     // Catch: java.lang.Throwable -> L2f
            if (r4 != 0) goto L25
            if (r4 == 0) goto L1e
            goto L29
        L1e:
            android.graphics.Bitmap$Config r4 = androidx.compose.ui.graphics.l0.a()
            r5.inPreferredConfig = r4
            return r0
        L25:
            android.graphics.Bitmap r0 = h(r4)     // Catch: java.lang.Throwable -> L2d
        L29:
            r4.recycle()
            goto L1e
        L2d:
            r0 = move-exception
            goto L33
        L2f:
            r4 = move-exception
            r3 = r0
            r0 = r4
            r4 = r3
        L33:
            if (r4 == 0) goto L38
            r4.recycle()
        L38:
            android.graphics.Bitmap$Config r4 = androidx.compose.ui.graphics.l0.a()
            r5.inPreferredConfig = r4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sk.o0.g(byte[], android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    @Nullable
    @RequiresApi(34)
    public static Bitmap h(Bitmap bitmap) {
        Gainmap gainmap;
        Bitmap.Config config;
        Bitmap gainmapContents;
        gainmap = bitmap.getGainmap();
        if (gainmap != null) {
            gainmapContents = gainmap.getGainmapContents();
            if (gainmapContents.getConfig() == Bitmap.Config.ALPHA_8) {
                bitmap.setGainmap(a.a(gainmap));
            }
        }
        config = Bitmap.Config.HARDWARE;
        return bitmap.copy(config, false);
    }
}
