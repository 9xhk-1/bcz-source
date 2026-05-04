package c60;

import a00.q;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f8218c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f8219d = 65535;

    /* renamed from: e, reason: collision with root package name */
    public static final int f8220e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f8221f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f8222g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static final int f8223h = 5;

    /* renamed from: i, reason: collision with root package name */
    public static final int f8224i = 6;

    /* renamed from: j, reason: collision with root package name */
    public static final int f8225j = 7;

    /* renamed from: k, reason: collision with root package name */
    public static final int f8226k = 10;

    /* renamed from: a, reason: collision with root package name */
    public int f8227a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final int[] f8228b = new int[10];

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    public final void a() {
        this.f8227a = 0;
        q.T1(this.f8228b, 0, 0, 0, 6, null);
    }

    public final int b(int i11) {
        return this.f8228b[i11];
    }

    public final boolean c(boolean z11) {
        return (this.f8227a & 4) != 0 ? this.f8228b[2] == 1 : z11;
    }

    public final int d() {
        if ((this.f8227a & 2) != 0) {
            return this.f8228b[1];
        }
        return -1;
    }

    public final int e() {
        if ((this.f8227a & 128) != 0) {
            return this.f8228b[7];
        }
        return 65535;
    }

    public final int f() {
        if ((this.f8227a & 16) != 0) {
            return this.f8228b[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int g(int i11) {
        return (this.f8227a & 32) != 0 ? this.f8228b[5] : i11;
    }

    public final int h(int i11) {
        return (this.f8227a & 64) != 0 ? this.f8228b[6] : i11;
    }

    public final boolean i(int i11) {
        return ((1 << i11) & this.f8227a) != 0;
    }

    public final void j(@k g other) {
        g0.p(other, "other");
        for (int i11 = 0; i11 < 10; i11++) {
            if (other.i(i11)) {
                k(i11, other.b(i11));
            }
        }
    }

    @k
    public final g k(int i11, int i12) {
        if (i11 >= 0) {
            int[] iArr = this.f8228b;
            if (i11 < iArr.length) {
                this.f8227a = (1 << i11) | this.f8227a;
                iArr[i11] = i12;
            }
        }
        return this;
    }

    public final int l() {
        return Integer.bitCount(this.f8227a);
    }
}
