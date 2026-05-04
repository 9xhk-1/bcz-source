package cq;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: f, reason: collision with root package name */
    public static final b f46816f = new b(aq.a.f5447a, 3);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f46817a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f46818b;

    /* renamed from: c, reason: collision with root package name */
    public final c f46819c;

    /* renamed from: d, reason: collision with root package name */
    public final c f46820d;

    /* renamed from: e, reason: collision with root package name */
    public final int f46821e;

    public b(int i11, int i12) {
        this.f46821e = i11;
        this.f46817a = new int[i11];
        this.f46818b = new int[i11];
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            this.f46817a[i14] = i13;
            i13 = (i13 * i12) % i11;
        }
        for (int i15 = 0; i15 < i11 - 1; i15++) {
            this.f46818b[this.f46817a[i15]] = i15;
        }
        this.f46819c = new c(this, new int[]{0});
        this.f46820d = new c(this, new int[]{1});
    }

    public int a(int i11, int i12) {
        return (i11 + i12) % this.f46821e;
    }

    public c b(int i11, int i12) {
        if (i11 < 0) {
            throw new IllegalArgumentException();
        }
        if (i12 == 0) {
            return this.f46819c;
        }
        int[] iArr = new int[i11 + 1];
        iArr[0] = i12;
        return new c(this, iArr);
    }

    public int c(int i11) {
        return this.f46817a[i11];
    }

    public c d() {
        return this.f46820d;
    }

    public int e() {
        return this.f46821e;
    }

    public c f() {
        return this.f46819c;
    }

    public int g(int i11) {
        if (i11 != 0) {
            return this.f46817a[(this.f46821e - this.f46818b[i11]) - 1];
        }
        throw new ArithmeticException();
    }

    public int h(int i11) {
        if (i11 != 0) {
            return this.f46818b[i11];
        }
        throw new IllegalArgumentException();
    }

    public int i(int i11, int i12) {
        if (i11 == 0 || i12 == 0) {
            return 0;
        }
        int[] iArr = this.f46817a;
        int[] iArr2 = this.f46818b;
        return iArr[(iArr2[i11] + iArr2[i12]) % (this.f46821e - 1)];
    }

    public int j(int i11, int i12) {
        int i13 = this.f46821e;
        return ((i11 + i13) - i12) % i13;
    }
}
