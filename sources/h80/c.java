package h80;

import com.badlogic.gdx.graphics.g;
import com.jiongji.andriod.card.R;
import com.malmstein.fenster.videorender.gles.GeneratedTexture;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f59039a = {0, 8388608, 32768, 8421376, 128, 8388736, 32896, 12632256, 8421504, GeneratedTexture.f39227d, 65280, GeneratedTexture.f39230g, 255, GeneratedTexture.f39228e, 65535, 16777215, 0, 95, 135, 175, R.styleable.Theme_drawable_revocation, 255, 24320, 24415, 24455, 24495, 24535, 24575, 34560, 34655, 34695, 34735, 34775, g.Ba, 44800, 44895, 44935, 44975, 45015, 45055, 55040, 55135, 55175, 55215, 55255, 55295, 65280, 65375, 65415, 65455, 65495, 65535, 6225920, 6226015, 6226055, 6226095, 6226135, 6226175, 6250240, 6250335, 6250375, 6250415, 6250455, 6250495, 6260480, 6260575, 6260615, 6260655, 6260695, 6260735, 6270720, 6270815, 6270855, 6270895, 6270935, 6270975, 6280960, 6281055, 6281095, 6281135, 6281175, 6281215, 6291200, 6291295, 6291335, 6291375, 6291415, 6291455, 8847360, 8847455, 8847495, 8847535, 8847575, 8847615, 8871680, 8871775, 8871815, 8871855, 8871895, 8871935, 8881920, 8882015, 8882055, 8882095, 8882135, 8882175, 8892160, 8892255, 8892295, 8892335, 8892375, 8892415, 8902400, 8902495, 8902535, 8902575, 8902615, 8902655, 8912640, 8912735, 8912775, 8912815, 8912855, 8912895, 11468800, 11468895, 11468935, 11468975, 11469015, 11469055, 11493120, 11493215, 11493255, 11493295, 11493335, 11493375, 11503360, 11503455, 11503495, 11503535, 11503575, 11503615, 11513600, 11513695, 11513735, 11513775, 11513815, 11513855, 11523840, 11523935, 11523975, 11524015, 11524055, 11524095, 11534080, 11534175, 11534215, 11534255, 11534295, 11534335, 14090240, 14090335, 14090375, 14090415, 14090455, 14090495, 14114560, 14114655, 14114695, 14114735, 14114775, 14114815, 14124800, 14124895, 14124935, 14124975, 14125015, 14125055, 14135040, 14135135, 14135175, 14135215, 14135255, 14135295, 14145280, 14145375, 14145415, 14145455, 14145495, 14145535, 14155520, 14155615, 14155655, 14155695, 14155735, 14155775, GeneratedTexture.f39227d, 16711775, 16711815, 16711855, 16711895, GeneratedTexture.f39228e, 16736000, 16736095, 16736135, 16736175, 16736215, 16736255, 16746240, 16746335, 16746375, 16746415, 16746455, 16746495, 16756480, 16756575, 16756615, 16756655, 16756695, 16756735, 16766720, 16766815, 16766855, 16766895, 16766935, 16766975, GeneratedTexture.f39230g, 16777055, 16777095, 16777135, 16777175, 16777215, 526344, 1184274, 1842204, 2500134, 3158064, 3815994, 4473924, 5131854, 5789784, 6447714, 7105644, 7763574, 8421504, 9079434, 9737364, 10395294, 11053224, 11711154, 12369084, 13027014, 13684944, 14342874, 15000804, 15658734};

    /* renamed from: b, reason: collision with root package name */
    public static final double f59040b = 0.008856451679035631d;

    /* renamed from: c, reason: collision with root package name */
    public static final double f59041c = 903.2962962962963d;

    public static double a(int i11, int i12) {
        return k(e(i11), e(i12));
    }

    public static double b(double d11) {
        return d11 > 0.04045d ? Math.pow((d11 + 0.055d) / 1.055d, 2.4d) : d11 / 12.92d;
    }

    public static double c(double d11) {
        return d11 > 0.008856451679035631d ? Math.cbrt(d11) : ((d11 * 903.2962962962963d) + 16.0d) / 116.0d;
    }

    public static double[] d(int i11) {
        return new double[]{((i11 >> 16) & 255) / 255.0d, ((i11 >> 8) & 255) / 255.0d, (i11 & 255) / 255.0d};
    }

    public static double[] e(int i11) {
        return f(d(i11));
    }

    public static double[] f(double[] dArr) {
        return m(g(dArr));
    }

    public static double[] g(double[] dArr) {
        double b11 = b(dArr[0]);
        double b12 = b(dArr[1]);
        double b13 = b(dArr[2]);
        return new double[]{(0.4124564d * b11) + (0.3575761d * b12) + (0.1804375d * b13), (0.2126729d * b11) + (0.7151522d * b12) + (0.072175d * b13), (b11 * 0.0193339d) + (b12 * 0.119192d) + (b13 * 0.9503041d)};
    }

    public static int h(int i11, int i12) {
        if (i11 < i12) {
            return i11;
        }
        int[] iArr = f59039a;
        return i(iArr[i11], iArr, i12);
    }

    public static int i(int i11, int[] iArr, int i12) {
        double d11 = 2.147483647E9d;
        int i13 = Integer.MAX_VALUE;
        for (int i14 = 0; i14 < i12; i14++) {
            double a11 = a(i11, iArr[i14]);
            if (a11 <= d11) {
                i13 = i14;
                d11 = a11;
            }
        }
        return i13;
    }

    public static int j(int i11, int i12, int i13, int i14) {
        return i((i11 << 16) + (i12 << 8) + i13, f59039a, i14);
    }

    public static double k(double[] dArr, double[] dArr2) {
        return l(dArr[0] - dArr2[0]) + l(dArr[1] - dArr2[1]) + l(dArr[2] - dArr2[2]);
    }

    public static double l(double d11) {
        return d11 * d11;
    }

    public static double[] m(double[] dArr) {
        double c11 = c(dArr[0]);
        double c12 = c(dArr[1]);
        return new double[]{(116.0d * c12) - 16.0d, (c11 - c12) * 500.0d, (c12 - c(dArr[2])) * 200.0d};
    }
}
