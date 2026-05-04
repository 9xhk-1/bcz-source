package mp;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: h, reason: collision with root package name */
    public static final a f73611h = new a(4201, 4096, 1);

    /* renamed from: i, reason: collision with root package name */
    public static final a f73612i = new a(1033, 1024, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final a f73613j;

    /* renamed from: k, reason: collision with root package name */
    public static final a f73614k;

    /* renamed from: l, reason: collision with root package name */
    public static final a f73615l;

    /* renamed from: m, reason: collision with root package name */
    public static final a f73616m;

    /* renamed from: n, reason: collision with root package name */
    public static final a f73617n;

    /* renamed from: o, reason: collision with root package name */
    public static final a f73618o;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f73619a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f73620b;

    /* renamed from: c, reason: collision with root package name */
    public final b f73621c;

    /* renamed from: d, reason: collision with root package name */
    public final b f73622d;

    /* renamed from: e, reason: collision with root package name */
    public final int f73623e;

    /* renamed from: f, reason: collision with root package name */
    public final int f73624f;

    /* renamed from: g, reason: collision with root package name */
    public final int f73625g;

    static {
        a aVar = new a(67, 64, 1);
        f73613j = aVar;
        f73614k = new a(19, 16, 1);
        f73615l = new a(285, 256, 0);
        a aVar2 = new a(301, 256, 1);
        f73616m = aVar2;
        f73617n = aVar2;
        f73618o = aVar;
    }

    public a(int i11, int i12, int i13) {
        this.f73624f = i11;
        this.f73623e = i12;
        this.f73625g = i13;
        this.f73619a = new int[i12];
        this.f73620b = new int[i12];
        int i14 = 1;
        for (int i15 = 0; i15 < i12; i15++) {
            this.f73619a[i15] = i14;
            i14 <<= 1;
            if (i14 >= i12) {
                i14 = (i14 ^ i11) & (i12 - 1);
            }
        }
        for (int i16 = 0; i16 < i12 - 1; i16++) {
            this.f73620b[this.f73619a[i16]] = i16;
        }
        this.f73621c = new b(this, new int[]{0});
        this.f73622d = new b(this, new int[]{1});
    }

    public static int a(int i11, int i12) {
        return i11 ^ i12;
    }

    public b b(int i11, int i12) {
        if (i11 < 0) {
            throw new IllegalArgumentException();
        }
        if (i12 == 0) {
            return this.f73621c;
        }
        int[] iArr = new int[i11 + 1];
        iArr[0] = i12;
        return new b(this, iArr);
    }

    public int c(int i11) {
        return this.f73619a[i11];
    }

    public int d() {
        return this.f73625g;
    }

    public b e() {
        return this.f73622d;
    }

    public int f() {
        return this.f73623e;
    }

    public b g() {
        return this.f73621c;
    }

    public int h(int i11) {
        if (i11 != 0) {
            return this.f73619a[(this.f73623e - this.f73620b[i11]) - 1];
        }
        throw new ArithmeticException();
    }

    public int i(int i11) {
        if (i11 != 0) {
            return this.f73620b[i11];
        }
        throw new IllegalArgumentException();
    }

    public int j(int i11, int i12) {
        if (i11 == 0 || i12 == 0) {
            return 0;
        }
        int[] iArr = this.f73619a;
        int[] iArr2 = this.f73620b;
        return iArr[(iArr2[i11] + iArr2[i12]) % (this.f73623e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f73624f) + ',' + this.f73623e + ')';
    }
}
