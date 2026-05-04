package k3;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class o2 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f65502a;

    /* renamed from: b, reason: collision with root package name */
    public final int f65503b;

    /* renamed from: c, reason: collision with root package name */
    public final int f65504c;

    /* renamed from: d, reason: collision with root package name */
    public final int f65505d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final m2[] f65506e;

    public o2(boolean z11, int i11, int i12, int i13, @m80.l m2[] m2VarArr) {
        this.f65502a = z11;
        this.f65503b = i11;
        this.f65504c = i12;
        this.f65505d = i13;
        this.f65506e = m2VarArr;
    }

    public static /* synthetic */ o2 g(o2 o2Var, boolean z11, int i11, int i12, int i13, m2[] m2VarArr, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            z11 = o2Var.f65502a;
        }
        if ((i14 & 2) != 0) {
            i11 = o2Var.f65503b;
        }
        if ((i14 & 4) != 0) {
            i12 = o2Var.f65504c;
        }
        if ((i14 & 8) != 0) {
            i13 = o2Var.f65505d;
        }
        if ((i14 & 16) != 0) {
            m2VarArr = o2Var.f65506e;
        }
        m2[] m2VarArr2 = m2VarArr;
        int i15 = i12;
        return o2Var.f(z11, i11, i15, i13, m2VarArr2);
    }

    public final boolean a() {
        return this.f65502a;
    }

    public final int b() {
        return this.f65503b;
    }

    public final int c() {
        return this.f65504c;
    }

    public final int d() {
        return this.f65505d;
    }

    @m80.l
    public final m2[] e() {
        return this.f65506e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) obj;
        if (this.f65502a != o2Var.f65502a || this.f65503b != o2Var.f65503b || this.f65504c != o2Var.f65504c || this.f65505d != o2Var.f65505d) {
            return false;
        }
        m2[] m2VarArr = this.f65506e;
        if (m2VarArr != null) {
            m2[] m2VarArr2 = o2Var.f65506e;
            if (m2VarArr2 == null || !Arrays.equals(m2VarArr, m2VarArr2)) {
                return false;
            }
        } else if (o2Var.f65506e != null) {
            return false;
        }
        return true;
    }

    @m80.k
    public final o2 f(boolean z11, int i11, int i12, int i13, @m80.l m2[] m2VarArr) {
        return new o2(z11, i11, i12, i13, m2VarArr);
    }

    public final boolean h() {
        return this.f65502a;
    }

    public int hashCode() {
        int hashCode = ((((((Boolean.hashCode(this.f65502a) * 31) + this.f65503b) * 31) + this.f65504c) * 31) + this.f65505d) * 31;
        m2[] m2VarArr = this.f65506e;
        return hashCode + (m2VarArr != null ? Arrays.hashCode(m2VarArr) : 0);
    }

    @m80.l
    public final m2[] i() {
        return this.f65506e;
    }

    public final int j() {
        return this.f65505d;
    }

    public final int k() {
        return this.f65503b;
    }

    public final int l() {
        return this.f65504c;
    }

    @m80.k
    public String toString() {
        return "SchoolMajorRsp(hasNext=" + this.f65502a + ", pageNum=" + this.f65503b + ", pageSize=" + this.f65504c + ", number=" + this.f65505d + ", majors=" + Arrays.toString(this.f65506e) + ')';
    }
}
