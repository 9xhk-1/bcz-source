package op;

import com.google.zxing.FormatException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: h, reason: collision with root package name */
    public static final e[] f77625h = a();

    /* renamed from: a, reason: collision with root package name */
    public final int f77626a;

    /* renamed from: b, reason: collision with root package name */
    public final int f77627b;

    /* renamed from: c, reason: collision with root package name */
    public final int f77628c;

    /* renamed from: d, reason: collision with root package name */
    public final int f77629d;

    /* renamed from: e, reason: collision with root package name */
    public final int f77630e;

    /* renamed from: f, reason: collision with root package name */
    public final c f77631f;

    /* renamed from: g, reason: collision with root package name */
    public final int f77632g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f77633a;

        /* renamed from: b, reason: collision with root package name */
        public final int f77634b;

        public int a() {
            return this.f77633a;
        }

        public int b() {
            return this.f77634b;
        }

        public b(int i11, int i12) {
            this.f77633a = i11;
            this.f77634b = i12;
        }
    }

    public e(int i11, int i12, int i13, int i14, int i15, c cVar) {
        this.f77626a = i11;
        this.f77627b = i12;
        this.f77628c = i13;
        this.f77629d = i14;
        this.f77630e = i15;
        this.f77631f = cVar;
        int b11 = cVar.b();
        int i16 = 0;
        for (b bVar : cVar.a()) {
            i16 += bVar.a() * (bVar.b() + b11);
        }
        this.f77632g = i16;
    }

    public static e[] a() {
        int i11 = 1;
        int i12 = 5;
        e eVar = new e(1, 10, 10, 8, 8, new c(i12, new b(i11, 3)));
        e eVar2 = new e(2, 12, 12, 10, 10, new c(7, new b(i11, i12)));
        e eVar3 = new e(3, 14, 14, 12, 12, new c(10, new b(i11, 8)));
        int i13 = 12;
        e eVar4 = new e(4, 16, 16, 14, 14, new c(i13, new b(i11, i13)));
        int i14 = 18;
        e eVar5 = new e(5, 18, 18, 16, 16, new c(14, new b(i11, i14)));
        e eVar6 = new e(6, 20, 20, 18, 18, new c(i14, new b(i11, 22)));
        e eVar7 = new e(7, 22, 22, 20, 20, new c(20, new b(i11, 30)));
        int i15 = 36;
        e eVar8 = new e(8, 24, 24, 22, 22, new c(24, new b(i11, i15)));
        e eVar9 = new e(9, 26, 26, 24, 24, new c(28, new b(i11, 44)));
        e eVar10 = new e(10, 32, 32, 14, 14, new c(i15, new b(i11, 62)));
        int i16 = 42;
        e eVar11 = new e(11, 36, 36, 16, 16, new c(i16, new b(i11, 86)));
        int i17 = 114;
        int i18 = 48;
        e eVar12 = new e(12, 40, 40, 18, 18, new c(i18, new b(i11, i17)));
        int i19 = 144;
        int i21 = 56;
        e eVar13 = new e(13, 44, 44, 20, 20, new c(i21, new b(i11, i19)));
        e eVar14 = new e(14, 48, 48, 22, 22, new c(68, new b(i11, 174)));
        int i22 = 2;
        e eVar15 = new e(15, 52, 52, 24, 24, new c(i16, new b(i22, 102)));
        e eVar16 = new e(16, 64, 64, 14, 14, new c(i21, new b(i22, 140)));
        int i23 = 4;
        e eVar17 = new e(17, 72, 72, 16, 16, new c(i15, new b(i23, 92)));
        e eVar18 = new e(18, 80, 80, 18, 18, new c(i18, new b(i23, i17)));
        e eVar19 = new e(19, 88, 88, 20, 20, new c(i21, new b(i23, i19)));
        e eVar20 = new e(20, 96, 96, 22, 22, new c(68, new b(i23, 174)));
        e eVar21 = new e(21, 104, 104, 24, 24, new c(i21, new b(6, 136)));
        e eVar22 = new e(22, 120, 120, 18, 18, new c(68, new b(6, 175)));
        e eVar23 = new e(23, 132, 132, 20, 20, new c(62, new b(8, 163)));
        e eVar24 = new e(24, 144, 144, 22, 22, new c(62, new b(8, 156), new b(i22, 155)));
        int i24 = 1;
        e eVar25 = new e(25, 8, 18, 6, 16, new c(7, new b(i24, 5)));
        e eVar26 = new e(26, 8, 32, 6, 14, new c(11, new b(i24, 10)));
        int i25 = 1;
        return new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11, eVar12, eVar13, eVar14, eVar15, eVar16, eVar17, eVar18, eVar19, eVar20, eVar21, eVar22, eVar23, eVar24, eVar25, eVar26, new e(27, 12, 26, 10, 24, new c(14, new b(i25, 16))), new e(28, 12, 36, 10, 16, new c(18, new b(i25, 22))), new e(29, 16, 36, 14, 16, new c(24, new b(1, 32))), new e(30, 16, 48, 14, 22, new c(28, new b(1, 49)))};
    }

    public static e h(int i11, int i12) throws FormatException {
        if ((i11 & 1) != 0 || (i12 & 1) != 0) {
            throw FormatException.getFormatInstance();
        }
        for (e eVar : f77625h) {
            if (eVar.f77627b == i11 && eVar.f77628c == i12) {
                return eVar;
            }
        }
        throw FormatException.getFormatInstance();
    }

    public int b() {
        return this.f77630e;
    }

    public int c() {
        return this.f77629d;
    }

    public c d() {
        return this.f77631f;
    }

    public int e() {
        return this.f77628c;
    }

    public int f() {
        return this.f77627b;
    }

    public int g() {
        return this.f77632g;
    }

    public int i() {
        return this.f77626a;
    }

    public String toString() {
        return String.valueOf(this.f77626a);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f77635a;

        /* renamed from: b, reason: collision with root package name */
        public final b[] f77636b;

        public b[] a() {
            return this.f77636b;
        }

        public int b() {
            return this.f77635a;
        }

        public c(int i11, b bVar) {
            this.f77635a = i11;
            this.f77636b = new b[]{bVar};
        }

        public c(int i11, b bVar, b bVar2) {
            this.f77635a = i11;
            this.f77636b = new b[]{bVar, bVar2};
        }
    }
}
