package q1;

import a3.d0;
import a3.e0;
import a3.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class i {

    /* renamed from: d, reason: collision with root package name */
    public static final int f81389d = -1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f81390e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f81391f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f81392g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final int f81393h = 3;

    /* renamed from: i, reason: collision with root package name */
    public static final int f81394i = 4;

    /* renamed from: j, reason: collision with root package name */
    public static final int f81395j = 5;

    /* renamed from: k, reason: collision with root package name */
    public static final int f81396k = 6;

    /* renamed from: l, reason: collision with root package name */
    public static final int f81397l = 7;

    /* renamed from: a, reason: collision with root package name */
    public final v f81398a = new v();

    /* renamed from: b, reason: collision with root package name */
    public final v f81399b = new v();

    /* renamed from: c, reason: collision with root package name */
    public long f81400c;

    public void a(@d0 k kVar) {
        synchronized (this) {
            try {
                if (kVar == null) {
                    this.f81398a.i();
                    return;
                }
                this.f81399b.e(this.f81398a);
                this.f81398a.i();
                v vVar = this.f81399b;
                int[] iArr = vVar.f1639a;
                int i11 = vVar.f1640b;
                int i12 = 0;
                while (i12 < i11) {
                    int i13 = iArr[i12];
                    int i14 = i12 + 3;
                    this.f81400c = (iArr[i12 + 1] << 32) | (iArr[i12 + 2] & 4294967295L);
                    switch (i13) {
                        case -1:
                            i12 = i14 + iArr[i14];
                            break;
                        case 0:
                            i12 += 4;
                            kVar.Z(iArr[i14]);
                            break;
                        case 1:
                            i12 += 4;
                            kVar.X(iArr[i14]);
                            break;
                        case 2:
                            i12 += 4;
                            kVar.i0((char) iArr[i14]);
                            break;
                        case 3:
                            int i15 = iArr[i14];
                            int i16 = iArr[i12 + 4];
                            int i17 = i12 + 6;
                            int i18 = iArr[i12 + 5];
                            i12 += 7;
                            kVar.o(i15, i16, i18, iArr[i17]);
                            break;
                        case 4:
                            int i19 = iArr[i14];
                            int i21 = iArr[i12 + 4];
                            int i22 = i12 + 6;
                            int i23 = iArr[i12 + 5];
                            i12 += 7;
                            kVar.b(i19, i21, i23, iArr[i22]);
                            break;
                        case 5:
                            int i24 = iArr[i14];
                            int i25 = i12 + 5;
                            int i26 = iArr[i12 + 4];
                            i12 += 6;
                            kVar.I(i24, i26, iArr[i25]);
                            break;
                        case 6:
                            int i27 = i12 + 4;
                            i12 += 5;
                            kVar.R(iArr[i14], iArr[i27]);
                            break;
                        case 7:
                            int i28 = i12 + 4;
                            i12 += 5;
                            kVar.D(e0.e(iArr[i14]), e0.e(iArr[i28]));
                            break;
                        default:
                            throw new RuntimeException();
                    }
                }
                this.f81399b.i();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public long b() {
        return this.f81400c;
    }

    public synchronized boolean c(int i11, long j11) {
        this.f81398a.a(0);
        h(j11);
        this.f81398a.a(i11);
        return false;
    }

    public synchronized boolean d(char c11, long j11) {
        this.f81398a.a(2);
        h(j11);
        this.f81398a.a(c11);
        return false;
    }

    public synchronized boolean e(int i11, long j11) {
        this.f81398a.a(1);
        h(j11);
        this.f81398a.a(i11);
        return false;
    }

    public synchronized boolean f(int i11, int i12, long j11) {
        try {
            int g11 = g(6, 0);
            while (g11 >= 0) {
                this.f81398a.G(g11, -1);
                this.f81398a.G(g11 + 3, 2);
                g11 = g(6, g11 + 5);
            }
            this.f81398a.a(6);
            h(j11);
            this.f81398a.a(i11);
            this.f81398a.a(i12);
        } catch (Throwable th2) {
            throw th2;
        }
        return false;
    }

    public final synchronized int g(int i11, int i12) {
        int[] iArr;
        int i13;
        try {
            v vVar = this.f81398a;
            iArr = vVar.f1639a;
            i13 = vVar.f1640b;
        } catch (Throwable th2) {
            throw th2;
        }
        while (i12 < i13) {
            int i14 = iArr[i12];
            if (i14 == i11) {
                return i12;
            }
            int i15 = i12 + 3;
            switch (i14) {
                case -1:
                    i12 = i15 + iArr[i15];
                    continue;
                case 0:
                case 1:
                case 2:
                    i12 += 4;
                    continue;
                case 3:
                case 4:
                    i12 += 7;
                    continue;
                case 5:
                    i12 += 6;
                    continue;
                case 6:
                case 7:
                    i12 += 5;
                    continue;
                default:
                    throw new RuntimeException();
            }
            throw th2;
        }
        return -1;
    }

    public final void h(long j11) {
        this.f81398a.a((int) (j11 >> 32));
        this.f81398a.a((int) j11);
    }

    public synchronized boolean i(float f11, float f12, long j11) {
        this.f81398a.a(7);
        h(j11);
        this.f81398a.a(e0.b(f11));
        this.f81398a.a(e0.b(f12));
        return false;
    }

    public synchronized boolean j(int i11, int i12, int i13, int i14, long j11) {
        this.f81398a.a(3);
        h(j11);
        this.f81398a.a(i11);
        this.f81398a.a(i12);
        this.f81398a.a(i13);
        this.f81398a.a(i14);
        return false;
    }

    public synchronized boolean k(int i11, int i12, int i13, long j11) {
        try {
            int g11 = g(5, 0);
            while (g11 >= 0) {
                if (this.f81398a.m(g11 + 5) == i13) {
                    this.f81398a.G(g11, -1);
                    this.f81398a.G(g11 + 3, 3);
                }
                g11 = g(5, g11 + 6);
            }
            this.f81398a.a(5);
            h(j11);
            this.f81398a.a(i11);
            this.f81398a.a(i12);
            this.f81398a.a(i13);
        } catch (Throwable th2) {
            throw th2;
        }
        return false;
    }

    public synchronized boolean l(int i11, int i12, int i13, int i14, long j11) {
        this.f81398a.a(4);
        h(j11);
        this.f81398a.a(i11);
        this.f81398a.a(i12);
        this.f81398a.a(i13);
        this.f81398a.a(i14);
        return false;
    }
}
