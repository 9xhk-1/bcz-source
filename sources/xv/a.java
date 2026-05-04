package xv;

import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final C1331a f98368g = new C1331a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f98369a;

    /* renamed from: b, reason: collision with root package name */
    public final int f98370b;

    /* renamed from: c, reason: collision with root package name */
    public final int f98371c;

    /* renamed from: d, reason: collision with root package name */
    public final int f98372d;

    /* renamed from: e, reason: collision with root package name */
    public final long f98373e;

    /* renamed from: f, reason: collision with root package name */
    public final long f98374f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: xv.a$a, reason: collision with other inner class name */
    public static final class C1331a {
        public /* synthetic */ C1331a(v vVar) {
            this();
        }

        public C1331a() {
        }
    }

    public a(int i11, int i12, int i13, int i14) {
        this.f98369a = i11;
        this.f98370b = i12;
        this.f98371c = i13;
        this.f98372d = i14;
        this.f98373e = i14 | (i13 << 8) | (i12 << 16) | (i11 << 24);
        this.f98374f = (i12 << 8) | i13 | (i11 << 16) | (i14 << 24);
    }

    public static /* synthetic */ a f(a aVar, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = aVar.f98369a;
        }
        if ((i15 & 2) != 0) {
            i12 = aVar.f98370b;
        }
        if ((i15 & 4) != 0) {
            i13 = aVar.f98371c;
        }
        if ((i15 & 8) != 0) {
            i14 = aVar.f98372d;
        }
        return aVar.e(i11, i12, i13, i14);
    }

    public final int a() {
        return this.f98369a;
    }

    public final int b() {
        return this.f98370b;
    }

    public final int c() {
        return this.f98371c;
    }

    public final int d() {
        return this.f98372d;
    }

    @k
    public final a e(int i11, int i12, int i13, int i14) {
        return new a(i11, i12, i13, i14);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f98369a == aVar.f98369a && this.f98370b == aVar.f98370b && this.f98371c == aVar.f98371c && this.f98372d == aVar.f98372d;
    }

    public final int g() {
        return this.f98372d;
    }

    public final long h() {
        return this.f98374f;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f98369a) * 31) + Integer.hashCode(this.f98370b)) * 31) + Integer.hashCode(this.f98371c)) * 31) + Integer.hashCode(this.f98372d);
    }

    public final int j() {
        return this.f98371c;
    }

    public final int k() {
        return this.f98370b;
    }

    public final int l() {
        return this.f98369a;
    }

    public final long m() {
        return this.f98373e;
    }

    @k
    public String toString() {
        return "Color(red=" + this.f98369a + ", green=" + this.f98370b + ", blue=" + this.f98371c + ", alpha=" + this.f98372d + ')';
    }

    public a(long j11) {
        this((int) ((j11 >> 24) & 255), (int) ((j11 >> 16) & 255), (int) ((j11 >> 8) & 255), (int) (j11 & 255));
    }

    public static /* synthetic */ void i() {
    }

    public static /* synthetic */ void n() {
    }
}
