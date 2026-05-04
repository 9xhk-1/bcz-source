package h70;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class i implements Cloneable {

    /* renamed from: n, reason: collision with root package name */
    public static final i f58765n = new a().a();

    /* renamed from: a, reason: collision with root package name */
    public long f58766a;

    /* renamed from: b, reason: collision with root package name */
    public long f58767b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f58768c;

    /* renamed from: d, reason: collision with root package name */
    public int f58769d;

    /* renamed from: e, reason: collision with root package name */
    public int f58770e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f58771f;

    /* renamed from: g, reason: collision with root package name */
    public int f58772g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f58773h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f58774i;

    /* renamed from: j, reason: collision with root package name */
    public int f58775j;

    /* renamed from: k, reason: collision with root package name */
    public int f58776k;

    /* renamed from: l, reason: collision with root package name */
    public int f58777l;

    /* renamed from: m, reason: collision with root package name */
    public final int f58778m;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: n, reason: collision with root package name */
        public static int f58779n = -1;

        /* renamed from: a, reason: collision with root package name */
        public long f58780a = 1000;

        /* renamed from: b, reason: collision with root package name */
        public long f58781b = 500;

        /* renamed from: c, reason: collision with root package name */
        public boolean f58782c = false;

        /* renamed from: d, reason: collision with root package name */
        public int f58783d = b();

        /* renamed from: e, reason: collision with root package name */
        public int f58784e = 0;

        /* renamed from: f, reason: collision with root package name */
        public boolean f58785f = false;

        /* renamed from: g, reason: collision with root package name */
        public int f58786g = -1;

        /* renamed from: h, reason: collision with root package name */
        public boolean f58787h = false;

        /* renamed from: i, reason: collision with root package name */
        public boolean f58788i = true;

        /* renamed from: j, reason: collision with root package name */
        public int f58789j = 0;

        /* renamed from: k, reason: collision with root package name */
        public int f58790k = 0;

        /* renamed from: l, reason: collision with root package name */
        public int f58791l = 0;

        /* renamed from: m, reason: collision with root package name */
        public int f58792m = 0;

        public static int b() {
            int i11 = f58779n;
            return i11 > 0 ? i11 : Runtime.getRuntime().availableProcessors();
        }

        public static void e(int i11) {
            f58779n = i11;
        }

        public i a() {
            return new i(this.f58780a, this.f58781b, this.f58782c, this.f58783d, this.f58784e, this.f58785f, this.f58786g, this.f58787h, this.f58788i, this.f58789j, this.f58790k, this.f58791l, this.f58792m);
        }

        public a c(int i11) {
            this.f58792m = i11;
            return this;
        }

        public a d(int i11) {
            this.f58789j = i11;
            return this;
        }

        public a f(boolean z11) {
            this.f58782c = z11;
            return this;
        }

        public a g(int i11) {
            this.f58783d = i11;
            return this;
        }

        public a h(int i11) {
            this.f58791l = i11;
            return this;
        }

        public a i(long j11) {
            this.f58780a = j11;
            return this;
        }

        public a j(long j11) {
            this.f58781b = j11;
            return this;
        }

        public a k(int i11) {
            this.f58790k = i11;
            return this;
        }

        public a l(boolean z11) {
            this.f58787h = z11;
            return this;
        }

        public a m(int i11) {
            this.f58786g = i11;
            return this;
        }

        public a n(boolean z11) {
            this.f58785f = z11;
            return this;
        }

        public a o(int i11) {
            this.f58784e = i11;
            return this;
        }

        public a p(boolean z11) {
            this.f58788i = z11;
            return this;
        }
    }

    @Deprecated
    public i() {
        this.f58766a = 1000L;
        this.f58767b = 500L;
        this.f58768c = false;
        this.f58769d = a.b();
        this.f58770e = 0;
        this.f58771f = false;
        this.f58772g = -1;
        this.f58773h = false;
        this.f58774i = true;
        this.f58775j = 0;
        this.f58776k = 0;
        this.f58777l = 0;
        this.f58778m = 0;
    }

    public static a b(i iVar) {
        e80.a.j(iVar, "I/O reactor config");
        return new a().i(iVar.h()).j(iVar.i()).f(iVar.n()).g(iVar.f()).o(iVar.m()).n(iVar.p()).m(iVar.l()).l(iVar.o()).p(iVar.q()).d(iVar.e()).k(iVar.j()).h(iVar.g()).c(iVar.d());
    }

    public static a c() {
        return new a();
    }

    @Deprecated
    public void A(int i11) {
        this.f58772g = i11;
    }

    @Deprecated
    public void B(boolean z11) {
        this.f58771f = z11;
    }

    @Deprecated
    public void E(int i11) {
        this.f58770e = i11;
    }

    @Deprecated
    public void F(boolean z11) {
        this.f58774i = z11;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public i clone() throws CloneNotSupportedException {
        return (i) super.clone();
    }

    public int d() {
        return this.f58778m;
    }

    public int e() {
        return this.f58775j;
    }

    public int f() {
        return this.f58769d;
    }

    public int g() {
        return this.f58777l;
    }

    public long h() {
        return this.f58766a;
    }

    public long i() {
        return this.f58767b;
    }

    public int j() {
        return this.f58776k;
    }

    public int l() {
        return this.f58772g;
    }

    public int m() {
        return this.f58770e;
    }

    public boolean n() {
        return this.f58768c;
    }

    public boolean o() {
        return this.f58773h;
    }

    public boolean p() {
        return this.f58771f;
    }

    public boolean q() {
        return this.f58774i;
    }

    @Deprecated
    public void s(int i11) {
        this.f58775j = i11;
    }

    @Deprecated
    public void t(boolean z11) {
        this.f58768c = z11;
    }

    public String toString() {
        return "[selectInterval=" + this.f58766a + ", shutdownGracePeriod=" + this.f58767b + ", interestOpQueued=" + this.f58768c + ", ioThreadCount=" + this.f58769d + ", soTimeout=" + this.f58770e + ", soReuseAddress=" + this.f58771f + ", soLinger=" + this.f58772g + ", soKeepAlive=" + this.f58773h + ", tcpNoDelay=" + this.f58774i + ", connectTimeout=" + this.f58775j + ", sndBufSize=" + this.f58776k + ", rcvBufSize=" + this.f58777l + ", backlogSize=" + this.f58778m + "]";
    }

    @Deprecated
    public void u(int i11) {
        e80.a.k(i11, "I/O thread count");
        this.f58769d = i11;
    }

    @Deprecated
    public void v(int i11) {
        this.f58777l = i11;
    }

    @Deprecated
    public void w(long j11) {
        e80.a.l(j11, "Select internal");
        this.f58766a = j11;
    }

    @Deprecated
    public void x(long j11) {
        e80.a.l(j11, "Shutdown grace period");
        this.f58767b = j11;
    }

    @Deprecated
    public void y(int i11) {
        this.f58776k = i11;
    }

    @Deprecated
    public void z(boolean z11) {
        this.f58773h = z11;
    }

    public i(long j11, long j12, boolean z11, int i11, int i12, boolean z12, int i13, boolean z13, boolean z14, int i14, int i15, int i16, int i17) {
        this.f58766a = j11;
        this.f58767b = j12;
        this.f58768c = z11;
        this.f58769d = e80.a.k(i11, "ioThreadCount");
        this.f58770e = i12;
        this.f58771f = z12;
        this.f58772g = i13;
        this.f58773h = z13;
        this.f58774i = z14;
        this.f58775j = i14;
        this.f58776k = i15;
        this.f58777l = i16;
        this.f58778m = i17;
    }
}
