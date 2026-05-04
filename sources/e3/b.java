package e3;

import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public d3.c f48455a = new d3.c();

    /* renamed from: b, reason: collision with root package name */
    public f3.c f48456b = new f3.c();

    /* renamed from: c, reason: collision with root package name */
    public short[] f48457c = new short[192];

    /* renamed from: d, reason: collision with root package name */
    public short[] f48458d = new short[12];

    /* renamed from: e, reason: collision with root package name */
    public short[] f48459e = new short[12];

    /* renamed from: f, reason: collision with root package name */
    public short[] f48460f = new short[12];

    /* renamed from: g, reason: collision with root package name */
    public short[] f48461g = new short[12];

    /* renamed from: h, reason: collision with root package name */
    public short[] f48462h = new short[192];

    /* renamed from: i, reason: collision with root package name */
    public f3.a[] f48463i = new f3.a[4];

    /* renamed from: j, reason: collision with root package name */
    public short[] f48464j = new short[114];

    /* renamed from: k, reason: collision with root package name */
    public f3.a f48465k = new f3.a(4);

    /* renamed from: l, reason: collision with root package name */
    public a f48466l = new a();

    /* renamed from: m, reason: collision with root package name */
    public a f48467m = new a();

    /* renamed from: n, reason: collision with root package name */
    public C0583b f48468n = new C0583b();

    /* renamed from: o, reason: collision with root package name */
    public int f48469o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f48470p = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f48471q;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public short[] f48472a = new short[2];

        /* renamed from: b, reason: collision with root package name */
        public f3.a[] f48473b = new f3.a[16];

        /* renamed from: c, reason: collision with root package name */
        public f3.a[] f48474c = new f3.a[16];

        /* renamed from: d, reason: collision with root package name */
        public f3.a f48475d = new f3.a(8);

        /* renamed from: e, reason: collision with root package name */
        public int f48476e = 0;

        public a() {
        }

        public void a(int i11) {
            while (true) {
                int i12 = this.f48476e;
                if (i12 >= i11) {
                    return;
                }
                this.f48473b[i12] = new f3.a(3);
                this.f48474c[this.f48476e] = new f3.a(3);
                this.f48476e++;
            }
        }

        public int b(f3.c cVar, int i11) throws IOException {
            return cVar.a(this.f48472a, 0) == 0 ? this.f48473b[i11].a(cVar) : cVar.a(this.f48472a, 1) == 0 ? this.f48474c[i11].a(cVar) + 8 : this.f48475d.a(cVar) + 16;
        }

        public void c() {
            f3.c.d(this.f48472a);
            for (int i11 = 0; i11 < this.f48476e; i11++) {
                this.f48473b[i11].b();
                this.f48474c[i11].b();
            }
            this.f48475d.b();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: e3.b$b, reason: collision with other inner class name */
    public class C0583b {

        /* renamed from: a, reason: collision with root package name */
        public a[] f48478a;

        /* renamed from: b, reason: collision with root package name */
        public int f48479b;

        /* renamed from: c, reason: collision with root package name */
        public int f48480c;

        /* renamed from: d, reason: collision with root package name */
        public int f48481d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: e3.b$b$a */
        public class a {

            /* renamed from: a, reason: collision with root package name */
            public short[] f48483a = new short[768];

            public a() {
            }

            public byte a(f3.c cVar) throws IOException {
                int i11 = 1;
                do {
                    i11 = cVar.a(this.f48483a, i11) | (i11 << 1);
                } while (i11 < 256);
                return (byte) i11;
            }

            public byte b(f3.c cVar, byte b11) throws IOException {
                int i11 = 1;
                while (true) {
                    int i12 = (b11 >> 7) & 1;
                    b11 = (byte) (b11 << 1);
                    int a11 = cVar.a(this.f48483a, ((i12 + 1) << 8) + i11);
                    i11 = (i11 << 1) | a11;
                    if (i12 != a11) {
                        while (i11 < 256) {
                            i11 = (i11 << 1) | cVar.a(this.f48483a, i11);
                        }
                    } else if (i11 >= 256) {
                        break;
                    }
                }
                return (byte) i11;
            }

            public void c() {
                f3.c.d(this.f48483a);
            }
        }

        public C0583b() {
        }

        public void a(int i11, int i12) {
            if (this.f48478a != null && this.f48479b == i12 && this.f48480c == i11) {
                return;
            }
            this.f48480c = i11;
            this.f48481d = (1 << i11) - 1;
            this.f48479b = i12;
            int i13 = 1 << (i12 + i11);
            this.f48478a = new a[i13];
            for (int i14 = 0; i14 < i13; i14++) {
                this.f48478a[i14] = new a();
            }
        }

        public a b(int i11, byte b11) {
            a[] aVarArr = this.f48478a;
            int i12 = i11 & this.f48481d;
            int i13 = this.f48479b;
            return aVarArr[(i12 << i13) + ((b11 & 255) >>> (8 - i13))];
        }

        public void c() {
            int i11 = 1 << (this.f48479b + this.f48480c);
            for (int i12 = 0; i12 < i11; i12++) {
                this.f48478a[i12].c();
            }
        }
    }

    public b() {
        for (int i11 = 0; i11 < 4; i11++) {
            this.f48463i[i11] = new f3.a(6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0114, code lost:
    
        r17.f48455a.c();
        r17.f48455a.g();
        r17.f48456b.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0123, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.io.InputStream r18, java.io.OutputStream r19, long r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.b.a(java.io.InputStream, java.io.OutputStream, long):boolean");
    }

    public void b() throws IOException {
        this.f48455a.e(false);
        f3.c.d(this.f48457c);
        f3.c.d(this.f48462h);
        f3.c.d(this.f48458d);
        f3.c.d(this.f48459e);
        f3.c.d(this.f48460f);
        f3.c.d(this.f48461g);
        f3.c.d(this.f48464j);
        this.f48468n.c();
        for (int i11 = 0; i11 < 4; i11++) {
            this.f48463i[i11].b();
        }
        this.f48466l.c();
        this.f48467m.c();
        this.f48465k.b();
        this.f48456b.c();
    }

    public boolean c(byte[] bArr) {
        if (bArr.length < 5) {
            return false;
        }
        int i11 = bArr[0] & 255;
        int i12 = i11 % 9;
        int i13 = i11 / 9;
        int i14 = i13 % 5;
        int i15 = i13 / 5;
        int i16 = 0;
        int i17 = 0;
        while (i16 < 4) {
            int i18 = i16 + 1;
            i17 += (bArr[i18] & 255) << (i16 * 8);
            i16 = i18;
        }
        if (e(i12, i14, i15)) {
            return d(i17);
        }
        return false;
    }

    public boolean d(int i11) {
        if (i11 < 0) {
            return false;
        }
        if (this.f48469o != i11) {
            this.f48469o = i11;
            int max = Math.max(i11, 1);
            this.f48470p = max;
            this.f48455a.b(Math.max(max, 4096));
        }
        return true;
    }

    public boolean e(int i11, int i12, int i13) {
        if (i11 > 8 || i12 > 4 || i13 > 4) {
            return false;
        }
        this.f48468n.a(i12, i11);
        int i14 = 1 << i13;
        this.f48466l.a(i14);
        this.f48467m.a(i14);
        this.f48471q = i14 - 1;
        return true;
    }
}
