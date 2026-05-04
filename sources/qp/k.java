package qp;

import com.google.zxing.datamatrix.encoder.SymbolShapeHint;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class k {

    /* renamed from: i, reason: collision with root package name */
    public static final k[] f82624i;

    /* renamed from: j, reason: collision with root package name */
    public static k[] f82625j;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f82626a;

    /* renamed from: b, reason: collision with root package name */
    public final int f82627b;

    /* renamed from: c, reason: collision with root package name */
    public final int f82628c;

    /* renamed from: d, reason: collision with root package name */
    public final int f82629d;

    /* renamed from: e, reason: collision with root package name */
    public final int f82630e;

    /* renamed from: f, reason: collision with root package name */
    public final int f82631f;

    /* renamed from: g, reason: collision with root package name */
    public final int f82632g;

    /* renamed from: h, reason: collision with root package name */
    public final int f82633h;

    static {
        k[] kVarArr = {new k(false, 3, 5, 8, 8, 1), new k(false, 5, 7, 10, 10, 1), new k(true, 5, 7, 16, 6, 1), new k(false, 8, 10, 12, 12, 1), new k(true, 10, 11, 14, 6, 2), new k(false, 12, 12, 14, 14, 1), new k(true, 16, 14, 24, 10, 1), new k(false, 18, 14, 16, 16, 1), new k(false, 22, 18, 18, 18, 1), new k(true, 22, 18, 16, 10, 2), new k(false, 30, 20, 20, 20, 1), new k(true, 32, 24, 16, 14, 2), new k(false, 36, 24, 22, 22, 1), new k(false, 44, 28, 24, 24, 1), new k(true, 49, 28, 22, 14, 2), new k(false, 62, 36, 14, 14, 4), new k(false, 86, 42, 16, 16, 4), new k(false, 114, 48, 18, 18, 4), new k(false, 144, 56, 20, 20, 4), new k(false, 174, 68, 22, 22, 4), new k(false, 204, 84, 24, 24, 4, 102, 42), new k(false, 280, 112, 14, 14, 16, 140, 56), new k(false, 368, 144, 16, 16, 16, 92, 36), new k(false, 456, 192, 18, 18, 16, 114, 48), new k(false, 576, 224, 20, 20, 16, 144, 56), new k(false, 696, e3.a.f48454z, 22, 22, 16, 174, 68), new k(false, 816, 336, 24, 24, 16, 136, 56), new k(false, 1050, 408, 18, 18, 36, 175, 68), new k(false, 1304, 496, 20, 20, 36, 163, 62), new d()};
        f82624i = kVarArr;
        f82625j = kVarArr;
    }

    public k(boolean z11, int i11, int i12, int i13, int i14, int i15) {
        this(z11, i11, i12, i13, i14, i15, i11, i12);
    }

    public static k m(int i11) {
        return p(i11, SymbolShapeHint.FORCE_NONE, true);
    }

    public static k n(int i11, SymbolShapeHint symbolShapeHint) {
        return p(i11, symbolShapeHint, true);
    }

    public static k o(int i11, SymbolShapeHint symbolShapeHint, com.google.zxing.c cVar, com.google.zxing.c cVar2, boolean z11) {
        for (k kVar : f82625j) {
            if (!(symbolShapeHint == SymbolShapeHint.FORCE_SQUARE && kVar.f82626a) && ((symbolShapeHint != SymbolShapeHint.FORCE_RECTANGLE || kVar.f82626a) && ((cVar == null || (kVar.k() >= cVar.b() && kVar.j() >= cVar.a())) && ((cVar2 == null || (kVar.k() <= cVar2.b() && kVar.j() <= cVar2.a())) && i11 <= kVar.f82627b)))) {
                return kVar;
            }
        }
        if (z11) {
            throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i11)));
        }
        return null;
    }

    public static k p(int i11, SymbolShapeHint symbolShapeHint, boolean z11) {
        return o(i11, symbolShapeHint, null, null, z11);
    }

    public static k q(int i11, boolean z11, boolean z12) {
        return p(i11, z11 ? SymbolShapeHint.FORCE_NONE : SymbolShapeHint.FORCE_SQUARE, z12);
    }

    public static void r(k[] kVarArr) {
        f82625j = kVarArr;
    }

    public int a() {
        return this.f82627b + this.f82628c;
    }

    public final int b() {
        return this.f82627b;
    }

    public int c(int i11) {
        return this.f82632g;
    }

    public final int d() {
        return this.f82628c;
    }

    public final int e(int i11) {
        return this.f82633h;
    }

    public final int f() {
        int i11 = this.f82631f;
        int i12 = 1;
        if (i11 != 1) {
            i12 = 2;
            if (i11 != 2 && i11 != 4) {
                if (i11 == 16) {
                    return 4;
                }
                if (i11 == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i12;
    }

    public int g() {
        return this.f82627b / this.f82632g;
    }

    public final int h() {
        return l() * this.f82630e;
    }

    public final int i() {
        return f() * this.f82629d;
    }

    public final int j() {
        return h() + (l() << 1);
    }

    public final int k() {
        return i() + (f() << 1);
    }

    public final int l() {
        int i11 = this.f82631f;
        if (i11 == 1 || i11 == 2) {
            return 1;
        }
        if (i11 == 4) {
            return 2;
        }
        if (i11 == 16) {
            return 4;
        }
        if (i11 == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f82626a ? "Rectangular Symbol:" : "Square Symbol:");
        sb2.append(" data region ");
        sb2.append(this.f82629d);
        sb2.append('x');
        sb2.append(this.f82630e);
        sb2.append(", symbol size ");
        sb2.append(k());
        sb2.append('x');
        sb2.append(j());
        sb2.append(", symbol data size ");
        sb2.append(i());
        sb2.append('x');
        sb2.append(h());
        sb2.append(", codewords ");
        sb2.append(this.f82627b);
        sb2.append('+');
        sb2.append(this.f82628c);
        return sb2.toString();
    }

    public k(boolean z11, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.f82626a = z11;
        this.f82627b = i11;
        this.f82628c = i12;
        this.f82629d = i13;
        this.f82630e = i14;
        this.f82631f = i15;
        this.f82632g = i16;
        this.f82633h = i17;
    }
}
