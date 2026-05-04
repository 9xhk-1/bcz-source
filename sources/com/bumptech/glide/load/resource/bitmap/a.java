package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.bitmap.b;
import fl.i;
import fl.m;
import fl.o;
import ik.d;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import kk.u;
import lk.e;
import pn.j;
import sk.h;
import sk.r0;
import sk.z0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final String f28816f = "Downsampler";

    /* renamed from: g, reason: collision with root package name */
    public static final d<DecodeFormat> f28817g = d.g("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", DecodeFormat.DEFAULT);

    /* renamed from: h, reason: collision with root package name */
    public static final d<PreferredColorSpace> f28818h = d.f("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final d<DownsampleStrategy> f28819i = DownsampleStrategy.f28814h;

    /* renamed from: j, reason: collision with root package name */
    public static final d<Boolean> f28820j;

    /* renamed from: k, reason: collision with root package name */
    public static final d<Boolean> f28821k;

    /* renamed from: l, reason: collision with root package name */
    public static final String f28822l = "image/vnd.wap.wbmp";

    /* renamed from: m, reason: collision with root package name */
    public static final String f28823m = "image/x-ico";

    /* renamed from: n, reason: collision with root package name */
    public static final Set<String> f28824n;

    /* renamed from: o, reason: collision with root package name */
    public static final b f28825o;

    /* renamed from: p, reason: collision with root package name */
    public static final Set<ImageHeaderParser.ImageType> f28826p;

    /* renamed from: q, reason: collision with root package name */
    public static final Queue<BitmapFactory.Options> f28827q;

    /* renamed from: a, reason: collision with root package name */
    public final e f28828a;

    /* renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f28829b;

    /* renamed from: c, reason: collision with root package name */
    public final lk.b f28830c;

    /* renamed from: d, reason: collision with root package name */
    public final List<ImageHeaderParser> f28831d;

    /* renamed from: e, reason: collision with root package name */
    public final r0 f28832e = r0.c();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void a();

        void b(e eVar, Bitmap bitmap) throws IOException;
    }

    static {
        Boolean bool = Boolean.FALSE;
        f28820j = d.g("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f28821k = d.g("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f28824n = Collections.unmodifiableSet(new HashSet(Arrays.asList(f28822l, f28823m)));
        f28825o = new C0338a();
        f28826p = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f28827q = o.g(0);
    }

    public a(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, e eVar, lk.b bVar) {
        this.f28831d = list;
        this.f28829b = (DisplayMetrics) m.e(displayMetrics);
        this.f28828a = (e) m.e(eVar);
        this.f28830c = (lk.b) m.e(bVar);
    }

    public static int A(double d11) {
        return (int) (d11 + 0.5d);
    }

    @TargetApi(26)
    public static void B(BitmapFactory.Options options, e eVar, int i11, int i12) {
        Bitmap.Config config;
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            Bitmap.Config config3 = options.inPreferredConfig;
            config2 = Bitmap.Config.HARDWARE;
            if (config3 == config2) {
                return;
            } else {
                config = options.outConfig;
            }
        } else {
            config = null;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = eVar.g(i11, i12, config);
    }

    public static int a(double d11) {
        return A((d11 / (r1 / r0)) * A(o(d11) * d11));
    }

    public static void c(ImageHeaderParser.ImageType imageType, com.bumptech.glide.load.resource.bitmap.b bVar, b bVar2, e eVar, DownsampleStrategy downsampleStrategy, int i11, int i12, int i13, int i14, int i15, BitmapFactory.Options options) throws IOException {
        int i16;
        int i17;
        int i18;
        int floor;
        int floor2;
        if (i12 <= 0 || i13 <= 0) {
            if (Log.isLoggable(f28816f, 3)) {
                Log.d(f28816f, "Unable to determine dimensions for: " + imageType + " with target [" + i14 + "x" + i15 + "]");
                return;
            }
            return;
        }
        if (u(i11)) {
            i17 = i12;
            i16 = i13;
        } else {
            i16 = i12;
            i17 = i13;
        }
        float b11 = downsampleStrategy.b(i16, i17, i14, i15);
        if (b11 <= 0.0f) {
            throw new IllegalArgumentException("Cannot scale with factor: " + b11 + " from: " + downsampleStrategy + ", source: [" + i12 + "x" + i13 + "], target: [" + i14 + "x" + i15 + "]");
        }
        DownsampleStrategy.SampleSizeRounding a11 = downsampleStrategy.a(i16, i17, i14, i15);
        if (a11 == null) {
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        float f11 = i16;
        float f12 = i17;
        int i19 = i16;
        int i21 = i17;
        int A = i19 / A(b11 * f11);
        int A2 = i21 / A(b11 * f12);
        DownsampleStrategy.SampleSizeRounding sampleSizeRounding = DownsampleStrategy.SampleSizeRounding.MEMORY;
        int max = Math.max(1, Integer.highestOneBit(a11 == sampleSizeRounding ? Math.max(A, A2) : Math.min(A, A2)));
        if (a11 == sampleSizeRounding && max < 1.0f / b11) {
            max <<= 1;
        }
        options.inSampleSize = max;
        if (imageType == ImageHeaderParser.ImageType.JPEG) {
            float min = Math.min(max, 8);
            i18 = 0;
            floor = (int) Math.ceil(f11 / min);
            floor2 = (int) Math.ceil(f12 / min);
            int i22 = max / 8;
            if (i22 > 0) {
                floor /= i22;
                floor2 /= i22;
            }
        } else {
            i18 = 0;
            if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
                float f13 = max;
                floor = (int) Math.floor(f11 / f13);
                floor2 = (int) Math.floor(f12 / f13);
            } else if (imageType.isWebp()) {
                float f14 = max;
                floor = Math.round(f11 / f14);
                floor2 = Math.round(f12 / f14);
            } else if (i19 % max == 0 && i21 % max == 0) {
                floor = i19 / max;
                floor2 = i21 / max;
            } else {
                int[] p11 = p(bVar, options, bVar2, eVar);
                floor = p11[0];
                floor2 = p11[1];
            }
        }
        double b12 = downsampleStrategy.b(floor, floor2, i14, i15);
        options.inTargetDensity = a(b12);
        options.inDensity = o(b12);
        if (v(options)) {
            options.inScaled = true;
        } else {
            int i23 = i18;
            options.inTargetDensity = i23;
            options.inDensity = i23;
        }
        if (Log.isLoggable(f28816f, 2)) {
            Log.v(f28816f, "Calculate scaling, source: [" + i12 + "x" + i13 + "], degreesToRotate: " + i11 + ", target: [" + i14 + "x" + i15 + "], power of two scaled: [" + floor + "x" + floor2 + "], exact scale factor: " + b11 + ", power of 2 sample size: " + max + ", adjusted scale factor: " + b12 + ", target density: " + options.inTargetDensity + ", density: " + options.inDensity);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap l(com.bumptech.glide.load.resource.bitmap.b r5, android.graphics.BitmapFactory.Options r6, com.bumptech.glide.load.resource.bitmap.a.b r7, lk.e r8) throws java.io.IOException {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r7.a()
            r5.b()
        Lc:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = sk.z0.i()
            r4.lock()
            android.graphics.Bitmap r5 = r5.d(r6)     // Catch: java.lang.IllegalArgumentException -> L25 java.lang.Throwable -> L47
        L1d:
            java.util.concurrent.locks.Lock r6 = sk.z0.i()
            r6.unlock()
            return r5
        L25:
            r4 = move-exception
            java.io.IOException r1 = x(r4, r1, r2, r3, r6)     // Catch: java.lang.Throwable -> L47
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L47
            if (r2 == 0) goto L36
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L47
        L36:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L46
            r8.e(r0)     // Catch: java.io.IOException -> L45 java.lang.Throwable -> L47
            r0 = 0
            r6.inBitmap = r0     // Catch: java.io.IOException -> L45 java.lang.Throwable -> L47
            android.graphics.Bitmap r5 = l(r5, r6, r7, r8)     // Catch: java.io.IOException -> L45 java.lang.Throwable -> L47
            goto L1d
        L45:
            throw r1     // Catch: java.lang.Throwable -> L47
        L46:
            throw r1     // Catch: java.lang.Throwable -> L47
        L47:
            r5 = move-exception
            java.util.concurrent.locks.Lock r6 = sk.z0.i()
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.a.l(com.bumptech.glide.load.resource.bitmap.b, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.a$b, lk.e):android.graphics.Bitmap");
    }

    @Nullable
    @TargetApi(19)
    public static String m(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + j.f81007d);
    }

    public static synchronized BitmapFactory.Options n() {
        BitmapFactory.Options poll;
        synchronized (a.class) {
            Queue<BitmapFactory.Options> queue = f28827q;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                z(poll);
            }
        }
        return poll;
    }

    public static int o(double d11) {
        if (d11 > 1.0d) {
            d11 = 1.0d / d11;
        }
        return (int) Math.round(d11 * 2.147483647E9d);
    }

    public static int[] p(com.bumptech.glide.load.resource.bitmap.b bVar, BitmapFactory.Options options, b bVar2, e eVar) throws IOException {
        options.inJustDecodeBounds = true;
        l(bVar, options, bVar2, eVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    public static String q(BitmapFactory.Options options) {
        return m(options.inBitmap);
    }

    public static boolean u(int i11) {
        return i11 == 90 || i11 == 270;
    }

    public static boolean v(BitmapFactory.Options options) {
        int i11;
        int i12 = options.inTargetDensity;
        return i12 > 0 && (i11 = options.inDensity) > 0 && i12 != i11;
    }

    public static void w(int i11, int i12, String str, BitmapFactory.Options options, Bitmap bitmap, int i13, int i14, long j11) {
        Log.v(f28816f, "Decoded " + m(bitmap) + " from [" + i11 + "x" + i12 + "] " + str + " with inBitmap " + q(options) + " for [" + i13 + "x" + i14 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + i.a(j11));
    }

    public static IOException x(IllegalArgumentException illegalArgumentException, int i11, int i12, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i11 + ", outHeight: " + i12 + ", outMimeType: " + str + ", inBitmap: " + q(options), illegalArgumentException);
    }

    public static void y(BitmapFactory.Options options) {
        z(options);
        Queue<BitmapFactory.Options> queue = f28827q;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    public static void z(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final boolean C(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    public final void b(com.bumptech.glide.load.resource.bitmap.b bVar, DecodeFormat decodeFormat, boolean z11, boolean z12, BitmapFactory.Options options, int i11, int i12) {
        boolean z13;
        if (this.f28832e.h(i11, i12, options, z11, z12)) {
            return;
        }
        if (decodeFormat == DecodeFormat.PREFER_ARGB_8888) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        try {
            z13 = bVar.e().hasAlpha();
        } catch (IOException e11) {
            if (Log.isLoggable(f28816f, 3)) {
                Log.d(f28816f, "Cannot determine whether the image has alpha or not from header, format " + decodeFormat, e11);
            }
            z13 = false;
        }
        Bitmap.Config config = z13 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        options.inPreferredConfig = config;
        if (config == Bitmap.Config.RGB_565) {
            options.inDither = true;
        }
    }

    @RequiresApi(21)
    public u<Bitmap> d(ParcelFileDescriptor parcelFileDescriptor, int i11, int i12, ik.e eVar) throws IOException {
        return e(new b.e(parcelFileDescriptor, this.f28831d, this.f28830c), i11, i12, eVar, f28825o);
    }

    public final u<Bitmap> e(com.bumptech.glide.load.resource.bitmap.b bVar, int i11, int i12, ik.e eVar, b bVar2) throws IOException {
        byte[] bArr = (byte[]) this.f28830c.a(65536, byte[].class);
        BitmapFactory.Options n11 = n();
        n11.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) eVar.c(f28817g);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) eVar.c(f28818h);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) eVar.c(DownsampleStrategy.f28814h);
        boolean booleanValue = ((Boolean) eVar.c(f28820j)).booleanValue();
        d<Boolean> dVar = f28821k;
        try {
            return h.c(k(bVar, n11, downsampleStrategy, decodeFormat, preferredColorSpace, eVar.c(dVar) != null && ((Boolean) eVar.c(dVar)).booleanValue(), i11, i12, booleanValue, bVar2), this.f28828a);
        } finally {
            y(n11);
            this.f28830c.put(bArr);
        }
    }

    public u<Bitmap> f(InputStream inputStream, int i11, int i12, ik.e eVar) throws IOException {
        return g(inputStream, i11, i12, eVar, f28825o);
    }

    public u<Bitmap> g(InputStream inputStream, int i11, int i12, ik.e eVar, b bVar) throws IOException {
        return e(new b.d(inputStream, this.f28831d, this.f28830c), i11, i12, eVar, bVar);
    }

    public u<Bitmap> h(ByteBuffer byteBuffer, int i11, int i12, ik.e eVar) throws IOException {
        return e(new b.C0339b(byteBuffer, this.f28831d, this.f28830c), i11, i12, eVar, f28825o);
    }

    @VisibleForTesting
    public void i(File file, int i11, int i12, ik.e eVar) throws IOException {
        e(new b.c(file, this.f28831d, this.f28830c), i11, i12, eVar, f28825o);
    }

    @VisibleForTesting
    public void j(byte[] bArr, int i11, int i12, ik.e eVar) throws IOException {
        e(new b.a(bArr, this.f28831d, this.f28830c), i11, i12, eVar, f28825o);
    }

    public final Bitmap k(com.bumptech.glide.load.resource.bitmap.b bVar, BitmapFactory.Options options, DownsampleStrategy downsampleStrategy, DecodeFormat decodeFormat, PreferredColorSpace preferredColorSpace, boolean z11, int i11, int i12, boolean z12, b bVar2) throws IOException {
        int i13;
        String str;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        ColorSpace.Named named2;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        ColorSpace colorSpace4;
        boolean isWideGamut;
        int i14;
        long b11 = i.b();
        int[] p11 = p(bVar, options, bVar2, this.f28828a);
        int i15 = p11[0];
        int i16 = p11[1];
        String str2 = options.outMimeType;
        boolean z13 = (i15 == -1 || i16 == -1) ? false : z11;
        int c11 = bVar.c();
        int j11 = z0.j(c11);
        boolean m11 = z0.m(c11);
        int i17 = i11;
        if (i17 != Integer.MIN_VALUE) {
            i13 = i12;
        } else if (u(j11)) {
            i13 = i12;
            i17 = i16;
        } else {
            i13 = i12;
            i17 = i15;
        }
        if (i13 == Integer.MIN_VALUE) {
            i13 = u(j11) ? i15 : i16;
        }
        ImageHeaderParser.ImageType e11 = bVar.e();
        c(e11, bVar, bVar2, this.f28828a, downsampleStrategy, j11, i15, i16, i17, i13, options);
        int i18 = i17;
        int i19 = i13;
        b(bVar, decodeFormat, z13, m11, options, i18, i19);
        int i21 = Build.VERSION.SDK_INT;
        if (C(e11)) {
            if (i15 < 0 || i16 < 0 || !z12) {
                float f11 = v(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                int i22 = options.inSampleSize;
                float f12 = i22;
                int ceil = (int) Math.ceil(i15 / f12);
                int ceil2 = (int) Math.ceil(i16 / f12);
                int round = Math.round(ceil * f11);
                int round2 = Math.round(ceil2 * f11);
                str = f28816f;
                if (Log.isLoggable(str, 2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Calculated target [");
                    sb2.append(round);
                    sb2.append("x");
                    sb2.append(round2);
                    i14 = round;
                    sb2.append("] for source [");
                    sb2.append(i15);
                    sb2.append("x");
                    sb2.append(i16);
                    sb2.append("], sampleSize: ");
                    sb2.append(i22);
                    sb2.append(", targetDensity: ");
                    sb2.append(options.inTargetDensity);
                    sb2.append(", density: ");
                    sb2.append(options.inDensity);
                    sb2.append(", density multiplier: ");
                    sb2.append(f11);
                    Log.v(str, sb2.toString());
                } else {
                    i14 = round;
                }
                i18 = i14;
                i19 = round2;
            } else {
                str = f28816f;
            }
            if (i18 > 0 && i19 > 0) {
                B(options, this.f28828a, i18, i19);
            }
        } else {
            str = f28816f;
        }
        if (preferredColorSpace != null) {
            if (i21 >= 28) {
                if (preferredColorSpace == PreferredColorSpace.DISPLAY_P3) {
                    colorSpace3 = options.outColorSpace;
                    if (colorSpace3 != null) {
                        colorSpace4 = options.outColorSpace;
                        isWideGamut = colorSpace4.isWideGamut();
                        if (isWideGamut) {
                            named2 = ColorSpace.Named.DISPLAY_P3;
                            colorSpace2 = ColorSpace.get(named2);
                            options.inPreferredColorSpace = colorSpace2;
                        }
                    }
                }
                named2 = ColorSpace.Named.SRGB;
                colorSpace2 = ColorSpace.get(named2);
                options.inPreferredColorSpace = colorSpace2;
            } else if (i21 >= 26) {
                named = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(named);
                options.inPreferredColorSpace = colorSpace;
            }
        }
        Bitmap l11 = l(bVar, options, bVar2, this.f28828a);
        bVar2.b(this.f28828a, l11);
        if (Log.isLoggable(str, 2)) {
            w(i15, i16, str2, options, l11, i11, i12, b11);
        }
        if (l11 == null) {
            return null;
        }
        l11.setDensity(this.f28829b.densityDpi);
        Bitmap o11 = z0.o(this.f28828a, l11, c11);
        if (!l11.equals(o11)) {
            this.f28828a.e(l11);
        }
        return o11;
    }

    public boolean r(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.b();
    }

    public boolean s(InputStream inputStream) {
        return true;
    }

    public boolean t(ByteBuffer byteBuffer) {
        return true;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.bumptech.glide.load.resource.bitmap.a$a, reason: collision with other inner class name */
    public class C0338a implements b {
        @Override // com.bumptech.glide.load.resource.bitmap.a.b
        public void a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a.b
        public void b(e eVar, Bitmap bitmap) {
        }
    }
}
