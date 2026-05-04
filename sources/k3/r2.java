package k3;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class r2 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f65579a;

    /* renamed from: b, reason: collision with root package name */
    public final int f65580b;

    /* renamed from: c, reason: collision with root package name */
    public final int f65581c;

    /* renamed from: d, reason: collision with root package name */
    public final int f65582d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final p2[] f65583e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public final String[] f65584f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    public final String[] f65585g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    public final String[] f65586h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    public final String[] f65587i;

    /* renamed from: j, reason: collision with root package name */
    @m80.l
    public final p2[] f65588j;

    public r2(boolean z11, int i11, int i12, int i13, @m80.l p2[] p2VarArr, @m80.l String[] strArr, @m80.l String[] strArr2, @m80.l String[] strArr3, @m80.l String[] strArr4, @m80.l p2[] p2VarArr2) {
        this.f65579a = z11;
        this.f65580b = i11;
        this.f65581c = i12;
        this.f65582d = i13;
        this.f65583e = p2VarArr;
        this.f65584f = strArr;
        this.f65585g = strArr2;
        this.f65586h = strArr3;
        this.f65587i = strArr4;
        this.f65588j = p2VarArr2;
    }

    public static /* synthetic */ r2 l(r2 r2Var, boolean z11, int i11, int i12, int i13, p2[] p2VarArr, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4, p2[] p2VarArr2, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            z11 = r2Var.f65579a;
        }
        if ((i14 & 2) != 0) {
            i11 = r2Var.f65580b;
        }
        if ((i14 & 4) != 0) {
            i12 = r2Var.f65581c;
        }
        if ((i14 & 8) != 0) {
            i13 = r2Var.f65582d;
        }
        if ((i14 & 16) != 0) {
            p2VarArr = r2Var.f65583e;
        }
        if ((i14 & 32) != 0) {
            strArr = r2Var.f65584f;
        }
        if ((i14 & 64) != 0) {
            strArr2 = r2Var.f65585g;
        }
        if ((i14 & 128) != 0) {
            strArr3 = r2Var.f65586h;
        }
        if ((i14 & 256) != 0) {
            strArr4 = r2Var.f65587i;
        }
        if ((i14 & 512) != 0) {
            p2VarArr2 = r2Var.f65588j;
        }
        String[] strArr5 = strArr4;
        p2[] p2VarArr3 = p2VarArr2;
        String[] strArr6 = strArr2;
        String[] strArr7 = strArr3;
        p2[] p2VarArr4 = p2VarArr;
        String[] strArr8 = strArr;
        return r2Var.k(z11, i11, i12, i13, p2VarArr4, strArr8, strArr6, strArr7, strArr5, p2VarArr3);
    }

    public final boolean a() {
        return this.f65579a;
    }

    @m80.l
    public final p2[] b() {
        return this.f65588j;
    }

    public final int c() {
        return this.f65580b;
    }

    public final int d() {
        return this.f65581c;
    }

    public final int e() {
        return this.f65582d;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj;
        if (this.f65579a != r2Var.f65579a || this.f65580b != r2Var.f65580b || this.f65581c != r2Var.f65581c || this.f65582d != r2Var.f65582d) {
            return false;
        }
        p2[] p2VarArr = this.f65583e;
        if (p2VarArr != null) {
            p2[] p2VarArr2 = r2Var.f65583e;
            if (p2VarArr2 == null || !Arrays.equals(p2VarArr, p2VarArr2)) {
                return false;
            }
        } else if (r2Var.f65583e != null) {
            return false;
        }
        String[] strArr = this.f65584f;
        if (strArr != null) {
            String[] strArr2 = r2Var.f65584f;
            if (strArr2 == null || !Arrays.equals(strArr, strArr2)) {
                return false;
            }
        } else if (r2Var.f65584f != null) {
            return false;
        }
        String[] strArr3 = this.f65585g;
        if (strArr3 != null) {
            String[] strArr4 = r2Var.f65585g;
            if (strArr4 == null || !Arrays.equals(strArr3, strArr4)) {
                return false;
            }
        } else if (r2Var.f65585g != null) {
            return false;
        }
        String[] strArr5 = this.f65586h;
        if (strArr5 != null) {
            String[] strArr6 = r2Var.f65586h;
            if (strArr6 == null || !Arrays.equals(strArr5, strArr6)) {
                return false;
            }
        } else if (r2Var.f65586h != null) {
            return false;
        }
        String[] strArr7 = this.f65587i;
        if (strArr7 != null) {
            String[] strArr8 = r2Var.f65587i;
            if (strArr8 == null || !Arrays.equals(strArr7, strArr8)) {
                return false;
            }
        } else if (r2Var.f65587i != null) {
            return false;
        }
        p2[] p2VarArr3 = this.f65588j;
        if (p2VarArr3 != null) {
            p2[] p2VarArr4 = r2Var.f65588j;
            if (p2VarArr4 == null || !Arrays.equals(p2VarArr3, p2VarArr4)) {
                return false;
            }
        } else if (r2Var.f65588j != null) {
            return false;
        }
        return true;
    }

    @m80.l
    public final p2[] f() {
        return this.f65583e;
    }

    @m80.l
    public final String[] g() {
        return this.f65584f;
    }

    @m80.l
    public final String[] h() {
        return this.f65585g;
    }

    public int hashCode() {
        int hashCode = ((((((Boolean.hashCode(this.f65579a) * 31) + this.f65580b) * 31) + this.f65581c) * 31) + this.f65582d) * 31;
        p2[] p2VarArr = this.f65583e;
        int hashCode2 = (hashCode + (p2VarArr != null ? Arrays.hashCode(p2VarArr) : 0)) * 31;
        String[] strArr = this.f65584f;
        int hashCode3 = (hashCode2 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f65585g;
        int hashCode4 = (hashCode3 + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31;
        String[] strArr3 = this.f65586h;
        int hashCode5 = (hashCode4 + (strArr3 != null ? Arrays.hashCode(strArr3) : 0)) * 31;
        String[] strArr4 = this.f65587i;
        int hashCode6 = (hashCode5 + (strArr4 != null ? Arrays.hashCode(strArr4) : 0)) * 31;
        p2[] p2VarArr2 = this.f65588j;
        return hashCode6 + (p2VarArr2 != null ? Arrays.hashCode(p2VarArr2) : 0);
    }

    @m80.l
    public final String[] i() {
        return this.f65586h;
    }

    @m80.l
    public final String[] j() {
        return this.f65587i;
    }

    @m80.k
    public final r2 k(boolean z11, int i11, int i12, int i13, @m80.l p2[] p2VarArr, @m80.l String[] strArr, @m80.l String[] strArr2, @m80.l String[] strArr3, @m80.l String[] strArr4, @m80.l p2[] p2VarArr2) {
        return new r2(z11, i11, i12, i13, p2VarArr, strArr, strArr2, strArr3, strArr4, p2VarArr2);
    }

    @m80.l
    public final String[] m() {
        return this.f65586h;
    }

    @m80.l
    public final String[] n() {
        return this.f65584f;
    }

    @m80.l
    public final String[] o() {
        return this.f65587i;
    }

    public final boolean p() {
        return this.f65579a;
    }

    public final int q() {
        return this.f65582d;
    }

    public final int r() {
        return this.f65580b;
    }

    public final int s() {
        return this.f65581c;
    }

    @m80.l
    public final String[] t() {
        return this.f65585g;
    }

    @m80.k
    public String toString() {
        return "SearchSchoolResult(hasNext=" + this.f65579a + ", pageNum=" + this.f65580b + ", pageSize=" + this.f65581c + ", number=" + this.f65582d + ", schools=" + Arrays.toString(this.f65583e) + ", countrys=" + Arrays.toString(this.f65584f) + ", provinces=" + Arrays.toString(this.f65585g) + ", citys=" + Arrays.toString(this.f65586h) + ", countys=" + Arrays.toString(this.f65587i) + ", spSchools=" + Arrays.toString(this.f65588j) + ')';
    }

    @m80.l
    public final p2[] u() {
        return this.f65583e;
    }

    @m80.l
    public final p2[] v() {
        return this.f65588j;
    }
}
