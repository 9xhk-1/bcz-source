package hq;

import com.google.zxing.NotFoundException;
import com.google.zxing.m;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final kp.b f59738a;

    /* renamed from: c, reason: collision with root package name */
    public final int f59740c;

    /* renamed from: d, reason: collision with root package name */
    public final int f59741d;

    /* renamed from: e, reason: collision with root package name */
    public final int f59742e;

    /* renamed from: f, reason: collision with root package name */
    public final int f59743f;

    /* renamed from: g, reason: collision with root package name */
    public final float f59744g;

    /* renamed from: i, reason: collision with root package name */
    public final m f59746i;

    /* renamed from: b, reason: collision with root package name */
    public final List<a> f59739b = new ArrayList(5);

    /* renamed from: h, reason: collision with root package name */
    public final int[] f59745h = new int[3];

    public b(kp.b bVar, int i11, int i12, int i13, int i14, float f11, m mVar) {
        this.f59738a = bVar;
        this.f59740c = i11;
        this.f59741d = i12;
        this.f59742e = i13;
        this.f59743f = i14;
        this.f59744g = f11;
        this.f59746i = mVar;
    }

    public static float a(int[] iArr, int i11) {
        return (i11 - iArr[2]) - (iArr[1] / 2.0f);
    }

    public final float b(int i11, int i12, int i13, int i14) {
        kp.b bVar = this.f59738a;
        int h11 = bVar.h();
        int[] iArr = this.f59745h;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i15 = i11;
        while (i15 >= 0 && bVar.e(i12, i15)) {
            int i16 = iArr[1];
            if (i16 > i13) {
                break;
            }
            iArr[1] = i16 + 1;
            i15--;
        }
        if (i15 >= 0 && iArr[1] <= i13) {
            while (i15 >= 0 && !bVar.e(i12, i15)) {
                int i17 = iArr[0];
                if (i17 > i13) {
                    break;
                }
                iArr[0] = i17 + 1;
                i15--;
            }
            if (iArr[0] > i13) {
                return Float.NaN;
            }
            int i18 = i11 + 1;
            while (i18 < h11 && bVar.e(i12, i18)) {
                int i19 = iArr[1];
                if (i19 > i13) {
                    break;
                }
                iArr[1] = i19 + 1;
                i18++;
            }
            if (i18 != h11 && iArr[1] <= i13) {
                while (i18 < h11 && !bVar.e(i12, i18)) {
                    int i21 = iArr[2];
                    if (i21 > i13) {
                        break;
                    }
                    iArr[2] = i21 + 1;
                    i18++;
                }
                int i22 = iArr[2];
                if (i22 <= i13 && Math.abs(((iArr[0] + iArr[1]) + i22) - i14) * 5 < i14 * 2 && d(iArr)) {
                    return a(iArr, i18);
                }
            }
        }
        return Float.NaN;
    }

    public a c() throws NotFoundException {
        a e11;
        a e12;
        int i11 = this.f59740c;
        int i12 = this.f59743f;
        int i13 = this.f59742e + i11;
        int i14 = this.f59741d + (i12 / 2);
        int[] iArr = new int[3];
        for (int i15 = 0; i15 < i12; i15++) {
            int i16 = ((i15 & 1) == 0 ? (i15 + 1) / 2 : -((i15 + 1) / 2)) + i14;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i17 = i11;
            while (i17 < i13 && !this.f59738a.e(i17, i16)) {
                i17++;
            }
            int i18 = 0;
            while (i17 < i13) {
                if (!this.f59738a.e(i17, i16)) {
                    if (i18 == 1) {
                        i18++;
                    }
                    iArr[i18] = iArr[i18] + 1;
                } else if (i18 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i18 != 2) {
                    i18++;
                    iArr[i18] = iArr[i18] + 1;
                } else {
                    if (d(iArr) && (e12 = e(iArr, i16, i17)) != null) {
                        return e12;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i18 = 1;
                }
                i17++;
            }
            if (d(iArr) && (e11 = e(iArr, i16, i13)) != null) {
                return e11;
            }
        }
        if (this.f59739b.isEmpty()) {
            throw NotFoundException.getNotFoundInstance();
        }
        return this.f59739b.get(0);
    }

    public final boolean d(int[] iArr) {
        float f11 = this.f59744g;
        float f12 = f11 / 2.0f;
        for (int i11 = 0; i11 < 3; i11++) {
            if (Math.abs(f11 - iArr[i11]) >= f12) {
                return false;
            }
        }
        return true;
    }

    public final a e(int[] iArr, int i11, int i12) {
        int i13 = iArr[0] + iArr[1] + iArr[2];
        float a11 = a(iArr, i12);
        float b11 = b(i11, (int) a11, iArr[1] * 2, i13);
        if (Float.isNaN(b11)) {
            return null;
        }
        float f11 = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
        for (a aVar : this.f59739b) {
            if (aVar.f(f11, b11, a11)) {
                return aVar.g(b11, a11, f11);
            }
        }
        a aVar2 = new a(a11, b11, f11);
        this.f59739b.add(aVar2);
        m mVar = this.f59746i;
        if (mVar == null) {
            return null;
        }
        mVar.a(aVar2);
        return null;
    }
}
