package d3;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f47104a;

    /* renamed from: b, reason: collision with root package name */
    public InputStream f47105b;

    /* renamed from: c, reason: collision with root package name */
    public int f47106c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f47107d;

    /* renamed from: e, reason: collision with root package name */
    public int f47108e;

    /* renamed from: f, reason: collision with root package name */
    public int f47109f;

    /* renamed from: g, reason: collision with root package name */
    public int f47110g;

    /* renamed from: h, reason: collision with root package name */
    public int f47111h;

    /* renamed from: i, reason: collision with root package name */
    public int f47112i;

    /* renamed from: j, reason: collision with root package name */
    public int f47113j;

    /* renamed from: k, reason: collision with root package name */
    public int f47114k;

    public void a(int i11, int i12, int i13) {
        this.f47112i = i11;
        this.f47113j = i12;
        int i14 = i11 + i12 + i13;
        if (this.f47104a == null || this.f47110g != i14) {
            b();
            this.f47110g = i14;
            this.f47104a = new byte[i14];
        }
        this.f47108e = this.f47110g - i12;
    }

    public void b() {
        this.f47104a = null;
    }

    public byte c(int i11) {
        return this.f47104a[this.f47109f + this.f47111h + i11];
    }

    public int d(int i11, int i12, int i13) {
        if (this.f47107d) {
            int i14 = this.f47111h;
            int i15 = i14 + i11 + i13;
            int i16 = this.f47114k;
            if (i15 > i16) {
                i13 = i16 - (i14 + i11);
            }
        }
        int i17 = i12 + 1;
        int i18 = this.f47109f + this.f47111h + i11;
        int i19 = 0;
        while (i19 < i13) {
            byte[] bArr = this.f47104a;
            int i21 = i18 + i19;
            if (bArr[i21] != bArr[i21 - i17]) {
                break;
            }
            i19++;
        }
        return i19;
    }

    public int e() {
        return this.f47114k - this.f47111h;
    }

    public void f() throws IOException {
        this.f47109f = 0;
        this.f47111h = 0;
        this.f47114k = 0;
        this.f47107d = false;
        i();
    }

    public void g() {
        int i11 = this.f47109f;
        int i12 = (this.f47111h + i11) - this.f47112i;
        if (i12 > 0) {
            i12--;
        }
        int i13 = (i11 + this.f47114k) - i12;
        for (int i14 = 0; i14 < i13; i14++) {
            byte[] bArr = this.f47104a;
            bArr[i14] = bArr[i12 + i14];
        }
        this.f47109f -= i12;
    }

    public void h() throws IOException {
        int i11 = this.f47111h + 1;
        this.f47111h = i11;
        if (i11 > this.f47106c) {
            if (this.f47109f + i11 > this.f47108e) {
                g();
            }
            i();
        }
    }

    public void i() throws IOException {
        if (this.f47107d) {
            return;
        }
        while (true) {
            int i11 = this.f47109f;
            int i12 = (0 - i11) + this.f47110g;
            int i13 = this.f47114k;
            int i14 = i12 - i13;
            if (i14 == 0) {
                return;
            }
            int read = this.f47105b.read(this.f47104a, i11 + i13, i14);
            if (read == -1) {
                int i15 = this.f47114k;
                this.f47106c = i15;
                int i16 = this.f47109f;
                int i17 = i15 + i16;
                int i18 = this.f47108e;
                if (i17 > i18) {
                    this.f47106c = i18 - i16;
                }
                this.f47107d = true;
                return;
            }
            int i19 = this.f47114k + read;
            this.f47114k = i19;
            int i21 = this.f47111h;
            int i22 = this.f47113j;
            if (i19 >= i21 + i22) {
                this.f47106c = i19 - i22;
            }
        }
    }

    public void j(int i11) {
        this.f47109f += i11;
        this.f47106c -= i11;
        this.f47111h -= i11;
        this.f47114k -= i11;
    }

    public void k() {
        this.f47105b = null;
    }

    public void l(InputStream inputStream) {
        this.f47105b = inputStream;
    }
}
