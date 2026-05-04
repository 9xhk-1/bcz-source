package xp;

import com.google.zxing.NotFoundException;
import wp.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class a extends r {

    /* renamed from: g, reason: collision with root package name */
    public static final float f98275g = 0.2f;

    /* renamed from: h, reason: collision with root package name */
    public static final float f98276h = 0.45f;

    /* renamed from: i, reason: collision with root package name */
    public static final float f98277i = 0.7916667f;

    /* renamed from: j, reason: collision with root package name */
    public static final float f98278j = 0.89285713f;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f98280b;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f98283e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f98284f;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f98279a = new int[4];

    /* renamed from: c, reason: collision with root package name */
    public final float[] f98281c = new float[4];

    /* renamed from: d, reason: collision with root package name */
    public final float[] f98282d = new float[4];

    public a() {
        int[] iArr = new int[8];
        this.f98280b = iArr;
        this.f98283e = new int[iArr.length / 2];
        this.f98284f = new int[iArr.length / 2];
    }

    @Deprecated
    public static int h(int[] iArr) {
        return lp.a.d(iArr);
    }

    public static void i(int[] iArr, float[] fArr) {
        int i11 = 0;
        float f11 = fArr[0];
        for (int i12 = 1; i12 < iArr.length; i12++) {
            float f12 = fArr[i12];
            if (f12 < f11) {
                i11 = i12;
                f11 = f12;
            }
        }
        iArr[i11] = iArr[i11] - 1;
    }

    public static void p(int[] iArr, float[] fArr) {
        int i11 = 0;
        float f11 = fArr[0];
        for (int i12 = 1; i12 < iArr.length; i12++) {
            float f12 = fArr[i12];
            if (f12 > f11) {
                i11 = i12;
                f11 = f12;
            }
        }
        iArr[i11] = iArr[i11] + 1;
    }

    public static boolean q(int[] iArr) {
        float f11 = (iArr[0] + iArr[1]) / ((iArr[2] + r1) + iArr[3]);
        if (f11 >= 0.7916667f && f11 <= 0.89285713f) {
            int i11 = Integer.MAX_VALUE;
            int i12 = Integer.MIN_VALUE;
            for (int i13 : iArr) {
                if (i13 > i12) {
                    i12 = i13;
                }
                if (i13 < i11) {
                    i11 = i13;
                }
            }
            if (i12 < i11 * 10) {
                return true;
            }
        }
        return false;
    }

    public static int r(int[] iArr, int[][] iArr2) throws NotFoundException {
        for (int i11 = 0; i11 < iArr2.length; i11++) {
            if (r.e(iArr, iArr2[i11], 0.45f) < 0.2f) {
                return i11;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final int[] j() {
        return this.f98280b;
    }

    public final int[] k() {
        return this.f98279a;
    }

    public final int[] l() {
        return this.f98284f;
    }

    public final float[] m() {
        return this.f98282d;
    }

    public final int[] n() {
        return this.f98283e;
    }

    public final float[] o() {
        return this.f98281c;
    }
}
