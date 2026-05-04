package f3;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d {

    /* renamed from: g, reason: collision with root package name */
    public static final int f50405g = -16777216;

    /* renamed from: h, reason: collision with root package name */
    public static final int f50406h = 11;

    /* renamed from: i, reason: collision with root package name */
    public static final int f50407i = 2048;

    /* renamed from: j, reason: collision with root package name */
    public static final int f50408j = 5;

    /* renamed from: k, reason: collision with root package name */
    public static final int f50409k = 2;

    /* renamed from: l, reason: collision with root package name */
    public static final int f50410l = 6;

    /* renamed from: m, reason: collision with root package name */
    public static int[] f50411m = new int[512];

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f50412a;

    /* renamed from: b, reason: collision with root package name */
    public long f50413b;

    /* renamed from: c, reason: collision with root package name */
    public int f50414c;

    /* renamed from: d, reason: collision with root package name */
    public int f50415d;

    /* renamed from: e, reason: collision with root package name */
    public int f50416e;

    /* renamed from: f, reason: collision with root package name */
    public long f50417f;

    static {
        for (int i11 = 8; i11 >= 0; i11--) {
            int i12 = 8 - i11;
            int i13 = 1 << (9 - i11);
            for (int i14 = 1 << i12; i14 < i13; i14++) {
                f50411m[i14] = (i11 << 6) + (((i13 - i14) << 6) >>> i12);
            }
        }
    }

    public static int e(int i11, int i12) {
        return f50411m[(((i11 - i12) ^ (-i12)) & 2047) >>> 2];
    }

    public static int f(int i11) {
        return f50411m[i11 >>> 2];
    }

    public static int g(int i11) {
        return f50411m[(2048 - i11) >>> 2];
    }

    public static void j(short[] sArr) {
        for (int i11 = 0; i11 < sArr.length; i11++) {
            sArr[i11] = 1024;
        }
    }

    public void a(short[] sArr, int i11, int i12) throws IOException {
        short s11 = sArr[i11];
        int i13 = this.f50414c;
        int i14 = (i13 >>> 11) * s11;
        if (i12 == 0) {
            this.f50414c = i14;
            sArr[i11] = (short) (s11 + ((2048 - s11) >>> 5));
        } else {
            this.f50413b += i14 & 4294967295L;
            this.f50414c = i13 - i14;
            sArr[i11] = (short) (s11 - (s11 >>> 5));
        }
        int i15 = this.f50414c;
        if (((-16777216) & i15) == 0) {
            this.f50414c = i15 << 8;
            m();
        }
    }

    public void b(int i11, int i12) throws IOException {
        for (int i13 = i12 - 1; i13 >= 0; i13--) {
            int i14 = this.f50414c >>> 1;
            this.f50414c = i14;
            if (((i11 >>> i13) & 1) == 1) {
                this.f50413b += i14;
            }
            if (((-16777216) & i14) == 0) {
                this.f50414c = i14 << 8;
                m();
            }
        }
    }

    public void c() throws IOException {
        for (int i11 = 0; i11 < 5; i11++) {
            m();
        }
    }

    public void d() throws IOException {
        this.f50412a.flush();
    }

    public long h() {
        return this.f50415d + this.f50417f + 4;
    }

    public void i() {
        this.f50417f = 0L;
        this.f50413b = 0L;
        this.f50414c = -1;
        this.f50415d = 1;
        this.f50416e = 0;
    }

    public void k() {
        this.f50412a = null;
    }

    public void l(OutputStream outputStream) {
        this.f50412a = outputStream;
    }

    public void m() throws IOException {
        long j11 = this.f50413b;
        int i11 = (int) (j11 >>> 32);
        if (i11 != 0 || j11 < 4278190080L) {
            this.f50417f += this.f50415d;
            int i12 = this.f50416e;
            while (true) {
                this.f50412a.write(i12 + i11);
                int i13 = this.f50415d - 1;
                this.f50415d = i13;
                if (i13 == 0) {
                    break;
                } else {
                    i12 = 255;
                }
            }
            this.f50416e = ((int) this.f50413b) >>> 24;
        }
        this.f50415d++;
        this.f50413b = (this.f50413b & 16777215) << 8;
    }
}
