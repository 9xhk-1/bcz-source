package fn;

import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public final class d6 implements y5 {

    /* renamed from: g, reason: collision with root package name */
    public static final int f52108g = 5;

    /* renamed from: h, reason: collision with root package name */
    public static final int f52109h = 33;

    /* renamed from: i, reason: collision with root package name */
    public static final int f52110i = 35937;

    /* renamed from: a, reason: collision with root package name */
    public int[] f52111a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f52112b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f52113c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f52114d;

    /* renamed from: e, reason: collision with root package name */
    public double[] f52115e;

    /* renamed from: f, reason: collision with root package name */
    public b[] f52116f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52117a;

        static {
            int[] iArr = new int[d.values().length];
            f52117a = iArr;
            try {
                iArr[d.RED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52117a[d.GREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f52117a[d.BLUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public int f52125a;

        public c(int i11, int i12) {
            this.f52125a = i12;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum d {
        RED,
        GREEN,
        BLUE
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public int f52130a;

        /* renamed from: b, reason: collision with root package name */
        public double f52131b;

        public e(int i11, double d11) {
            this.f52130a = i11;
            this.f52131b = d11;
        }
    }

    public static int b(b bVar, d dVar, int[] iArr) {
        int i11;
        int i12;
        int i13 = a.f52117a[dVar.ordinal()];
        if (i13 == 1) {
            i11 = (-iArr[h(bVar.f52118a, bVar.f52121d, bVar.f52123f)]) + iArr[h(bVar.f52118a, bVar.f52121d, bVar.f52122e)] + iArr[h(bVar.f52118a, bVar.f52120c, bVar.f52123f)];
            i12 = iArr[h(bVar.f52118a, bVar.f52120c, bVar.f52122e)];
        } else if (i13 == 2) {
            i11 = (-iArr[h(bVar.f52119b, bVar.f52120c, bVar.f52123f)]) + iArr[h(bVar.f52119b, bVar.f52120c, bVar.f52122e)] + iArr[h(bVar.f52118a, bVar.f52120c, bVar.f52123f)];
            i12 = iArr[h(bVar.f52118a, bVar.f52120c, bVar.f52122e)];
        } else {
            if (i13 != 3) {
                throw new IllegalArgumentException("unexpected direction " + dVar);
            }
            i11 = (-iArr[h(bVar.f52119b, bVar.f52121d, bVar.f52122e)]) + iArr[h(bVar.f52119b, bVar.f52120c, bVar.f52122e)] + iArr[h(bVar.f52118a, bVar.f52121d, bVar.f52122e)];
            i12 = iArr[h(bVar.f52118a, bVar.f52120c, bVar.f52122e)];
        }
        return i11 - i12;
    }

    public static int h(int i11, int i12, int i13) {
        return (i11 << 10) + (i11 << 6) + i11 + (i12 << 5) + i12 + i13;
    }

    public static int j(b bVar, d dVar, int i11, int[] iArr) {
        int i12;
        int i13;
        int i14 = a.f52117a[dVar.ordinal()];
        if (i14 == 1) {
            i12 = (iArr[h(i11, bVar.f52121d, bVar.f52123f)] - iArr[h(i11, bVar.f52121d, bVar.f52122e)]) - iArr[h(i11, bVar.f52120c, bVar.f52123f)];
            i13 = iArr[h(i11, bVar.f52120c, bVar.f52122e)];
        } else if (i14 == 2) {
            i12 = (iArr[h(bVar.f52119b, i11, bVar.f52123f)] - iArr[h(bVar.f52119b, i11, bVar.f52122e)]) - iArr[h(bVar.f52118a, i11, bVar.f52123f)];
            i13 = iArr[h(bVar.f52118a, i11, bVar.f52122e)];
        } else {
            if (i14 != 3) {
                throw new IllegalArgumentException("unexpected direction " + dVar);
            }
            i12 = (iArr[h(bVar.f52119b, bVar.f52121d, i11)] - iArr[h(bVar.f52119b, bVar.f52120c, i11)]) - iArr[h(bVar.f52118a, bVar.f52121d, i11)];
            i13 = iArr[h(bVar.f52118a, bVar.f52120c, i11)];
        }
        return i12 + i13;
    }

    public static int l(b bVar, int[] iArr) {
        return ((((((iArr[h(bVar.f52119b, bVar.f52121d, bVar.f52123f)] - iArr[h(bVar.f52119b, bVar.f52121d, bVar.f52122e)]) - iArr[h(bVar.f52119b, bVar.f52120c, bVar.f52123f)]) + iArr[h(bVar.f52119b, bVar.f52120c, bVar.f52122e)]) - iArr[h(bVar.f52118a, bVar.f52121d, bVar.f52123f)]) + iArr[h(bVar.f52118a, bVar.f52121d, bVar.f52122e)]) + iArr[h(bVar.f52118a, bVar.f52120c, bVar.f52123f)]) - iArr[h(bVar.f52118a, bVar.f52120c, bVar.f52122e)];
    }

    @Override // fn.y5
    public b6 a(int[] iArr, int i11) {
        c(new a6().a(iArr, i11).f52092a);
        e();
        List<Integer> f11 = f(d(i11).f52125a);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Integer num : f11) {
            num.intValue();
            linkedHashMap.put(num, 0);
        }
        return new b6(linkedHashMap);
    }

    public void c(Map<Integer, Integer> map) {
        this.f52111a = new int[f52110i];
        this.f52112b = new int[f52110i];
        this.f52113c = new int[f52110i];
        this.f52114d = new int[f52110i];
        this.f52115e = new double[f52110i];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            int q11 = fn.c.q(intValue);
            int i11 = fn.c.i(intValue);
            int g11 = fn.c.g(intValue);
            int h11 = h((q11 >> 3) + 1, (i11 >> 3) + 1, (g11 >> 3) + 1);
            int[] iArr = this.f52111a;
            iArr[h11] = iArr[h11] + intValue2;
            int[] iArr2 = this.f52112b;
            iArr2[h11] = iArr2[h11] + (q11 * intValue2);
            int[] iArr3 = this.f52113c;
            iArr3[h11] = iArr3[h11] + (i11 * intValue2);
            int[] iArr4 = this.f52114d;
            iArr4[h11] = iArr4[h11] + (g11 * intValue2);
            double[] dArr = this.f52115e;
            dArr[h11] = dArr[h11] + (intValue2 * ((q11 * q11) + (i11 * i11) + (g11 * g11)));
        }
    }

    public c d(int i11) {
        int i12;
        this.f52116f = new b[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            this.f52116f[i13] = new b(null);
        }
        double[] dArr = new double[i11];
        b bVar = this.f52116f[0];
        bVar.f52119b = 32;
        bVar.f52121d = 32;
        bVar.f52123f = 32;
        int i14 = 0;
        int i15 = 1;
        while (true) {
            if (i15 >= i11) {
                i12 = i11;
                break;
            }
            b[] bVarArr = this.f52116f;
            if (g(bVarArr[i14], bVarArr[i15]).booleanValue()) {
                b bVar2 = this.f52116f[i14];
                dArr[i14] = bVar2.f52124g > 1 ? k(bVar2) : 0.0d;
                b bVar3 = this.f52116f[i15];
                dArr[i15] = bVar3.f52124g > 1 ? k(bVar3) : 0.0d;
            } else {
                dArr[i14] = 0.0d;
                i15--;
            }
            double d11 = dArr[0];
            int i16 = 0;
            for (int i17 = 1; i17 <= i15; i17++) {
                double d12 = dArr[i17];
                if (d12 > d11) {
                    i16 = i17;
                    d11 = d12;
                }
            }
            if (d11 <= 0.0d) {
                i12 = i15 + 1;
                break;
            }
            i15++;
            i14 = i16;
        }
        return new c(i11, i12);
    }

    public void e() {
        int i11 = 1;
        while (true) {
            int i12 = 33;
            if (i11 >= 33) {
                return;
            }
            int[] iArr = new int[33];
            int[] iArr2 = new int[33];
            int[] iArr3 = new int[33];
            int[] iArr4 = new int[33];
            double[] dArr = new double[33];
            int i13 = 1;
            while (i13 < i12) {
                int i14 = 0;
                int i15 = 0;
                double d11 = 0.0d;
                int i16 = 1;
                int i17 = 0;
                int i18 = 0;
                while (i16 < i12) {
                    int h11 = h(i11, i13, i16);
                    i14 += this.f52111a[h11];
                    i17 += this.f52112b[h11];
                    i18 += this.f52113c[h11];
                    i15 += this.f52114d[h11];
                    d11 += this.f52115e[h11];
                    iArr[i16] = iArr[i16] + i14;
                    iArr2[i16] = iArr2[i16] + i17;
                    iArr3[i16] = iArr3[i16] + i18;
                    iArr4[i16] = iArr4[i16] + i15;
                    dArr[i16] = dArr[i16] + d11;
                    int h12 = h(i11 - 1, i13, i16);
                    int i19 = i16;
                    int[] iArr5 = this.f52111a;
                    iArr5[h11] = iArr5[h12] + iArr[i19];
                    int[] iArr6 = this.f52112b;
                    iArr6[h11] = iArr6[h12] + iArr2[i19];
                    int[] iArr7 = this.f52113c;
                    iArr7[h11] = iArr7[h12] + iArr3[i19];
                    int[] iArr8 = this.f52114d;
                    iArr8[h11] = iArr8[h12] + iArr4[i19];
                    double[] dArr2 = this.f52115e;
                    dArr2[h11] = dArr2[h12] + dArr[i19];
                    i16 = i19 + 1;
                    i12 = 33;
                }
                i13++;
                i12 = 33;
            }
            i11++;
        }
    }

    public List<Integer> f(int i11) {
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < i11; i12++) {
            b bVar = this.f52116f[i12];
            int l11 = l(bVar, this.f52111a);
            if (l11 > 0) {
                int l12 = l(bVar, this.f52112b) / l11;
                int l13 = l(bVar, this.f52113c) / l11;
                arrayList.add(Integer.valueOf(((l(bVar, this.f52114d) / l11) & 255) | ((l12 & 255) << 16) | (-16777216) | ((l13 & 255) << 8)));
            }
        }
        return arrayList;
    }

    public Boolean g(b bVar, b bVar2) {
        int l11 = l(bVar, this.f52112b);
        int l12 = l(bVar, this.f52113c);
        int l13 = l(bVar, this.f52114d);
        int l14 = l(bVar, this.f52111a);
        d dVar = d.RED;
        e i11 = i(bVar, dVar, bVar.f52118a + 1, bVar.f52119b, l11, l12, l13, l14);
        d dVar2 = d.GREEN;
        e i12 = i(bVar, dVar2, bVar.f52120c + 1, bVar.f52121d, l11, l12, l13, l14);
        d dVar3 = d.BLUE;
        e i13 = i(bVar, dVar3, bVar.f52122e + 1, bVar.f52123f, l11, l12, l13, l14);
        double d11 = i11.f52131b;
        double d12 = i12.f52131b;
        double d13 = i13.f52131b;
        if (d11 < d12 || d11 < d13) {
            if (d12 >= d11 && d12 >= d13) {
                dVar3 = dVar2;
            }
        } else {
            if (i11.f52130a < 0) {
                return Boolean.FALSE;
            }
            dVar3 = dVar;
        }
        bVar2.f52119b = bVar.f52119b;
        bVar2.f52121d = bVar.f52121d;
        bVar2.f52123f = bVar.f52123f;
        int i14 = a.f52117a[dVar3.ordinal()];
        if (i14 == 1) {
            int i15 = i11.f52130a;
            bVar.f52119b = i15;
            bVar2.f52118a = i15;
            bVar2.f52120c = bVar.f52120c;
            bVar2.f52122e = bVar.f52122e;
        } else if (i14 == 2) {
            int i16 = i12.f52130a;
            bVar.f52121d = i16;
            bVar2.f52118a = bVar.f52118a;
            bVar2.f52120c = i16;
            bVar2.f52122e = bVar.f52122e;
        } else if (i14 == 3) {
            int i17 = i13.f52130a;
            bVar.f52123f = i17;
            bVar2.f52118a = bVar.f52118a;
            bVar2.f52120c = bVar.f52120c;
            bVar2.f52122e = i17;
        }
        bVar.f52124g = (bVar.f52119b - bVar.f52118a) * (bVar.f52121d - bVar.f52120c) * (bVar.f52123f - bVar.f52122e);
        bVar2.f52124g = (bVar2.f52119b - bVar2.f52118a) * (bVar2.f52121d - bVar2.f52120c) * (bVar2.f52123f - bVar2.f52122e);
        return Boolean.TRUE;
    }

    public e i(b bVar, d dVar, int i11, int i12, int i13, int i14, int i15, int i16) {
        d6 d6Var = this;
        b bVar2 = bVar;
        int b11 = b(bVar2, dVar, d6Var.f52112b);
        int b12 = b(bVar2, dVar, d6Var.f52113c);
        int b13 = b(bVar2, dVar, d6Var.f52114d);
        int b14 = b(bVar2, dVar, d6Var.f52111a);
        int i17 = -1;
        double d11 = 0.0d;
        int i18 = i11;
        while (i18 < i12) {
            int j11 = j(bVar2, dVar, i18, d6Var.f52112b) + b11;
            int j12 = j(bVar2, dVar, i18, d6Var.f52113c) + b12;
            int j13 = j(bVar2, dVar, i18, d6Var.f52114d) + b13;
            int j14 = j(bVar2, dVar, i18, d6Var.f52111a) + b14;
            if (j14 != 0) {
                double d12 = (((j11 * j11) + (j12 * j12)) + (j13 * j13)) / j14;
                int i19 = i13 - j11;
                int i21 = i14 - j12;
                int i22 = i15 - j13;
                int i23 = i16 - j14;
                if (i23 != 0) {
                    double d13 = d12 + ((((i19 * i19) + (i21 * i21)) + (i22 * i22)) / i23);
                    if (d13 > d11) {
                        d11 = d13;
                        i17 = i18;
                    }
                }
            }
            i18++;
            d6Var = this;
            bVar2 = bVar;
        }
        return new e(i17, d11);
    }

    public double k(b bVar) {
        int l11 = l(bVar, this.f52112b);
        int l12 = l(bVar, this.f52113c);
        int l13 = l(bVar, this.f52114d);
        return (((((((this.f52115e[h(bVar.f52119b, bVar.f52121d, bVar.f52123f)] - this.f52115e[h(bVar.f52119b, bVar.f52121d, bVar.f52122e)]) - this.f52115e[h(bVar.f52119b, bVar.f52120c, bVar.f52123f)]) + this.f52115e[h(bVar.f52119b, bVar.f52120c, bVar.f52122e)]) - this.f52115e[h(bVar.f52118a, bVar.f52121d, bVar.f52123f)]) + this.f52115e[h(bVar.f52118a, bVar.f52121d, bVar.f52122e)]) + this.f52115e[h(bVar.f52118a, bVar.f52120c, bVar.f52123f)]) - this.f52115e[h(bVar.f52118a, bVar.f52120c, bVar.f52122e)]) - ((((l11 * l11) + (l12 * l12)) + (l13 * l13)) / l(bVar, this.f52111a));
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public int f52118a;

        /* renamed from: b, reason: collision with root package name */
        public int f52119b;

        /* renamed from: c, reason: collision with root package name */
        public int f52120c;

        /* renamed from: d, reason: collision with root package name */
        public int f52121d;

        /* renamed from: e, reason: collision with root package name */
        public int f52122e;

        /* renamed from: f, reason: collision with root package name */
        public int f52123f;

        /* renamed from: g, reason: collision with root package name */
        public int f52124g;

        public b() {
            this.f52118a = 0;
            this.f52119b = 0;
            this.f52120c = 0;
            this.f52121d = 0;
            this.f52122e = 0;
            this.f52123f = 0;
            this.f52124g = 0;
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }
}
