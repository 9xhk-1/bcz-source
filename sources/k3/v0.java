package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f65654a;

    /* renamed from: b, reason: collision with root package name */
    public final int f65655b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f65656c;

    /* renamed from: d, reason: collision with root package name */
    public final long f65657d;

    /* renamed from: e, reason: collision with root package name */
    public final int f65658e;

    /* renamed from: f, reason: collision with root package name */
    public final int f65659f;

    public v0(int i11, int i12, boolean z11, long j11, int i13, int i14) {
        this.f65654a = i11;
        this.f65655b = i12;
        this.f65656c = z11;
        this.f65657d = j11;
        this.f65658e = i13;
        this.f65659f = i14;
    }

    public static /* synthetic */ v0 h(v0 v0Var, int i11, int i12, boolean z11, long j11, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = v0Var.f65654a;
        }
        if ((i15 & 2) != 0) {
            i12 = v0Var.f65655b;
        }
        if ((i15 & 4) != 0) {
            z11 = v0Var.f65656c;
        }
        if ((i15 & 8) != 0) {
            j11 = v0Var.f65657d;
        }
        if ((i15 & 16) != 0) {
            i13 = v0Var.f65658e;
        }
        if ((i15 & 32) != 0) {
            i14 = v0Var.f65659f;
        }
        long j12 = j11;
        boolean z12 = z11;
        return v0Var.g(i11, i12, z12, j12, i13, i14);
    }

    public final int a() {
        return this.f65654a;
    }

    public final int b() {
        return this.f65655b;
    }

    public final boolean c() {
        return this.f65656c;
    }

    public final long d() {
        return this.f65657d;
    }

    public final int e() {
        return this.f65658e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.f65654a == v0Var.f65654a && this.f65655b == v0Var.f65655b && this.f65656c == v0Var.f65656c && this.f65657d == v0Var.f65657d && this.f65658e == v0Var.f65658e && this.f65659f == v0Var.f65659f;
    }

    public final int f() {
        return this.f65659f;
    }

    @m80.k
    public final v0 g(int i11, int i12, boolean z11, long j11, int i13, int i14) {
        return new v0(i11, i12, z11, j11, i13, i14);
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f65654a) * 31) + Integer.hashCode(this.f65655b)) * 31) + Boolean.hashCode(this.f65656c)) * 31) + Long.hashCode(this.f65657d)) * 31) + Integer.hashCode(this.f65658e)) * 31) + Integer.hashCode(this.f65659f);
    }

    public final boolean i() {
        return this.f65656c;
    }

    public final int j() {
        return this.f65655b;
    }

    public final long k() {
        return this.f65657d;
    }

    public final int l() {
        return this.f65658e;
    }

    public final int m() {
        return this.f65659f;
    }

    public final int n() {
        return this.f65654a;
    }

    @m80.k
    public String toString() {
        return "GameWordListItem(topicId=" + this.f65654a + ", mastered=" + this.f65655b + ", cut=" + this.f65656c + ", modifyTime=" + this.f65657d + ", nextReviewTime=" + this.f65658e + ", status=" + this.f65659f + ')';
    }
}
