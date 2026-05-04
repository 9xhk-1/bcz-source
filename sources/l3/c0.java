package l3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f69284a;

    /* renamed from: b, reason: collision with root package name */
    public final int f69285b;

    /* renamed from: c, reason: collision with root package name */
    public final int f69286c;

    /* renamed from: d, reason: collision with root package name */
    public final int f69287d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f69288e;

    public c0(@m80.k String taskName, int i11, int i12, int i13, boolean z11) {
        kotlin.jvm.internal.g0.p(taskName, "taskName");
        this.f69284a = taskName;
        this.f69285b = i11;
        this.f69286c = i12;
        this.f69287d = i13;
        this.f69288e = z11;
    }

    public static /* synthetic */ c0 g(c0 c0Var, String str, int i11, int i12, int i13, boolean z11, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = c0Var.f69284a;
        }
        if ((i14 & 2) != 0) {
            i11 = c0Var.f69285b;
        }
        if ((i14 & 4) != 0) {
            i12 = c0Var.f69286c;
        }
        if ((i14 & 8) != 0) {
            i13 = c0Var.f69287d;
        }
        if ((i14 & 16) != 0) {
            z11 = c0Var.f69288e;
        }
        boolean z12 = z11;
        int i15 = i12;
        return c0Var.f(str, i11, i15, i13, z12);
    }

    @m80.k
    public final String a() {
        return this.f69284a;
    }

    public final int b() {
        return this.f69285b;
    }

    public final int c() {
        return this.f69286c;
    }

    public final int d() {
        return this.f69287d;
    }

    public final boolean e() {
        return this.f69288e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return kotlin.jvm.internal.g0.g(this.f69284a, c0Var.f69284a) && this.f69285b == c0Var.f69285b && this.f69286c == c0Var.f69286c && this.f69287d == c0Var.f69287d && this.f69288e == c0Var.f69288e;
    }

    @m80.k
    public final c0 f(@m80.k String taskName, int i11, int i12, int i13, boolean z11) {
        kotlin.jvm.internal.g0.p(taskName, "taskName");
        return new c0(taskName, i11, i12, i13, z11);
    }

    public final int h() {
        return this.f69286c;
    }

    public int hashCode() {
        return (((((((this.f69284a.hashCode() * 31) + Integer.hashCode(this.f69285b)) * 31) + Integer.hashCode(this.f69286c)) * 31) + Integer.hashCode(this.f69287d)) * 31) + Boolean.hashCode(this.f69288e);
    }

    public final boolean i() {
        return this.f69288e;
    }

    public final int j() {
        return this.f69285b;
    }

    @m80.k
    public final String k() {
        return this.f69284a;
    }

    public final int l() {
        return this.f69287d;
    }

    @m80.k
    public String toString() {
        return "TaskItem(taskName=" + this.f69284a + ", previousProgress=" + this.f69285b + ", currentProgress=" + this.f69286c + ", totalProgress=" + this.f69287d + ", hasClaim=" + this.f69288e + ')';
    }
}
