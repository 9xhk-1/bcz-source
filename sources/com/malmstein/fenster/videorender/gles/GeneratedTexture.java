package com.malmstein.fenster.videorender.gles;

import java.nio.ByteBuffer;
import qs.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class GeneratedTexture {

    /* renamed from: a, reason: collision with root package name */
    public static final int f39224a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f39225b = 255;

    /* renamed from: c, reason: collision with root package name */
    public static final int f39226c = 65280;

    /* renamed from: d, reason: collision with root package name */
    public static final int f39227d = 16711680;

    /* renamed from: e, reason: collision with root package name */
    public static final int f39228e = 16711935;

    /* renamed from: f, reason: collision with root package name */
    public static final int f39229f = 65535;

    /* renamed from: g, reason: collision with root package name */
    public static final int f39230g = 16776960;

    /* renamed from: h, reason: collision with root package name */
    public static final int f39231h = 16777215;

    /* renamed from: i, reason: collision with root package name */
    public static final int f39232i = -16777216;

    /* renamed from: j, reason: collision with root package name */
    public static final int f39233j = Integer.MIN_VALUE;

    /* renamed from: k, reason: collision with root package name */
    public static final int f39234k = 1073741824;

    /* renamed from: l, reason: collision with root package name */
    public static final int f39235l = 0;

    /* renamed from: n, reason: collision with root package name */
    public static final int f39237n = 64;

    /* renamed from: o, reason: collision with root package name */
    public static final int f39238o = 6408;

    /* renamed from: p, reason: collision with root package name */
    public static final int f39239p = 4;

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f39236m = {-16776961, -16711681, -16711936, -65281, -1, 1073742079, 1073807104, -16711681, -65281, 65280, -2147483393, -16777216, -256, -65281, -256, -65536};

    /* renamed from: q, reason: collision with root package name */
    public static final ByteBuffer f39240q = c();

    /* renamed from: r, reason: collision with root package name */
    public static final ByteBuffer f39241r = d();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Image {
        COARSE,
        FINE
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39242a;

        static {
            int[] iArr = new int[Image.values().length];
            f39242a = iArr;
            try {
                iArr[Image.COARSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39242a[Image.FINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static void a(byte[] buf, int left, int top, int right, int bottom, int color1, int color2, int bit) {
        while (top < bottom) {
            int i11 = top * 256;
            for (int i12 = left; i12 < right; i12++) {
                int i13 = (i12 * 4) + i11;
                int i14 = ((top & bit) ^ (i12 & bit)) == 0 ? color1 : color2;
                int i15 = i14 & 255;
                int i16 = (i14 >> 8) & 255;
                int i17 = (i14 >> 16) & 255;
                int i18 = (i14 >> 24) & 255;
                float f11 = i18 / 255.0f;
                buf[i13] = (byte) (i15 * f11);
                buf[i13 + 1] = (byte) (i16 * f11);
                buf[i13 + 2] = (byte) (i17 * f11);
                buf[i13 + 3] = (byte) i18;
            }
            top++;
        }
    }

    public static int b(Image which) {
        ByteBuffer byteBuffer;
        int i11 = a.f39242a[which.ordinal()];
        if (i11 == 1) {
            byteBuffer = f39240q;
        } else {
            if (i11 != 2) {
                throw new RuntimeException("unknown image");
            }
            byteBuffer = f39241r;
        }
        return d.d(byteBuffer, 64, 64, 6408);
    }

    public static ByteBuffer c() {
        byte[] bArr = new byte[16384];
        for (int i11 = 0; i11 < 16384; i11 += 4) {
            int i12 = i11 / 4;
            int i13 = f39236m[(((i12 / 64) / 16) * 4) + ((i12 % 64) / 16)];
            if (i11 == 0 || i11 == 16380) {
                i13 = -1;
            }
            int i14 = i13 & 255;
            int i15 = (i13 >> 8) & 255;
            int i16 = (i13 >> 16) & 255;
            int i17 = (i13 >> 24) & 255;
            float f11 = i17 / 255.0f;
            bArr[i11] = (byte) (i14 * f11);
            bArr[i11 + 1] = (byte) (i15 * f11);
            bArr[i11 + 2] = (byte) (i16 * f11);
            bArr[i11 + 3] = (byte) i17;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(16384);
        allocateDirect.put(bArr);
        allocateDirect.position(0);
        return allocateDirect;
    }

    public static ByteBuffer d() {
        byte[] bArr = new byte[16384];
        a(bArr, 0, 0, 32, 32, -16776961, -65536, 1);
        a(bArr, 32, 32, 64, 64, -16776961, -16711936, 2);
        a(bArr, 0, 32, 32, 64, -65536, -16711936, 4);
        a(bArr, 32, 0, 64, 32, -1, -16777216, 8);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(16384);
        allocateDirect.put(bArr);
        allocateDirect.position(0);
        return allocateDirect;
    }
}
