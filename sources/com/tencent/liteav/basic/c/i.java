package com.tencent.liteav.basic.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f43236a = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f43237b = {1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f};

    /* renamed from: c, reason: collision with root package name */
    public static final float[] f43238c = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f};

    /* renamed from: d, reason: collision with root package name */
    public static final float[] f43239d = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: e, reason: collision with root package name */
    public static final float[] f43240e = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.tencent.liteav.basic.c.i$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f43241a;

        static {
            int[] iArr = new int[h.values().length];
            f43241a = iArr;
            try {
                iArr[h.ROTATION_90.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43241a[h.ROTATION_180.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43241a[h.ROTATION_270.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43241a[h.NORMAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static float a(float f11) {
        return f11 == 0.0f ? 1.0f : 0.0f;
    }

    public static float[] a(h hVar, boolean z11, boolean z12) {
        int i11 = AnonymousClass1.f43241a[hVar.ordinal()];
        float[] fArr = i11 != 1 ? i11 != 2 ? i11 != 3 ? (float[]) f43236a.clone() : (float[]) f43239d.clone() : (float[]) f43238c.clone() : (float[]) f43237b.clone();
        if (z11) {
            fArr = new float[]{a(fArr[0]), fArr[1], a(fArr[2]), fArr[3], a(fArr[4]), fArr[5], a(fArr[6]), fArr[7]};
        }
        return z12 ? new float[]{fArr[0], a(fArr[1]), fArr[2], a(fArr[3]), fArr[4], a(fArr[5]), fArr[6], a(fArr[7])} : fArr;
    }
}
