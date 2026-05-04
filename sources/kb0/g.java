package kb0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int f66314a;

    /* renamed from: b, reason: collision with root package name */
    public int f66315b;

    /* renamed from: c, reason: collision with root package name */
    public int f66316c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f66317d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f66318e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f66319f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f66320g;

    public g(int i11, int i12, int i13, int[] iArr) {
        this.f66314a = i11;
        this.f66315b = i12;
        this.f66316c = i13;
        int[] iArr2 = new int[iArr.length];
        this.f66317d = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        this.f66318e = new int[0];
        this.f66319f = false;
        this.f66320g = false;
    }

    public int a() {
        return this.f66316c;
    }

    public int b() {
        return this.f66314a;
    }

    public int[] c() {
        int[] iArr = this.f66317d;
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    public int[] d() {
        int[] iArr = this.f66318e;
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    public int e() {
        return this.f66315b;
    }

    public int[] f() {
        int length = this.f66317d.length - 1;
        while (length >= 0) {
            int[] iArr = this.f66317d;
            if (iArr[length] != 0 || h.i(iArr[length - 1])) {
                break;
            }
            length--;
        }
        int i11 = length + 1;
        int i12 = 0;
        int i13 = i11;
        for (int i14 = 0; i14 < i11; i14++) {
            if (h.i(this.f66317d[i14])) {
                i13--;
            }
        }
        int[] iArr2 = new int[i13];
        int i15 = 0;
        while (i12 < i13) {
            int[] iArr3 = this.f66317d;
            iArr2[i12] = iArr3[i15];
            if (h.i(iArr3[i15])) {
                i15++;
            }
            i12++;
            i15++;
        }
        return iArr2;
    }

    public boolean g() {
        return this.f66320g;
    }

    public boolean h() {
        return this.f66319f;
    }

    public boolean i(int[] iArr, int i11, int[] iArr2, int i12, d dVar) {
        if (this.f66319f) {
            int[] iArr3 = this.f66317d;
            if (iArr3.length == i11 && this.f66318e.length == i12) {
                return j(iArr3, iArr, i11, dVar) || j(this.f66318e, iArr2, i12, dVar);
            }
            throw new IllegalArgumentException("bad merge attempt");
        }
        System.arraycopy(iArr, 0, this.f66317d, 0, i11);
        int[] iArr4 = new int[i12];
        this.f66318e = iArr4;
        System.arraycopy(iArr2, 0, iArr4, 0, i12);
        this.f66319f = true;
        return true;
    }

    public final boolean j(int[] iArr, int[] iArr2, int i11, d dVar) {
        boolean z11 = false;
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = iArr[i12];
            int j11 = h.j(i13, iArr2[i12], dVar);
            iArr[i12] = j11;
            if (i13 != j11) {
                z11 = true;
            }
        }
        return z11;
    }

    public void k(boolean z11) {
        this.f66320g = z11;
    }

    public void l(boolean z11) {
        this.f66319f = z11;
    }

    public String toString() {
        return "sb " + this.f66314a;
    }
}
