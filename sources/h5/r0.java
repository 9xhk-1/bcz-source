package h5;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f58432a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f58433b;

    /* renamed from: c, reason: collision with root package name */
    public final int f58434c;

    /* renamed from: d, reason: collision with root package name */
    public final int f58435d;

    /* renamed from: e, reason: collision with root package name */
    public final int f58436e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f58437f;

    public r0(int i11, @m80.k String taskName, int i12, int i13, int i14, boolean z11) {
        kotlin.jvm.internal.g0.p(taskName, "taskName");
        this.f58432a = i11;
        this.f58433b = taskName;
        this.f58434c = i12;
        this.f58435d = i13;
        this.f58436e = i14;
        this.f58437f = z11;
    }

    public static /* synthetic */ r0 h(r0 r0Var, int i11, String str, int i12, int i13, int i14, boolean z11, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = r0Var.f58432a;
        }
        if ((i15 & 2) != 0) {
            str = r0Var.f58433b;
        }
        if ((i15 & 4) != 0) {
            i12 = r0Var.f58434c;
        }
        if ((i15 & 8) != 0) {
            i13 = r0Var.f58435d;
        }
        if ((i15 & 16) != 0) {
            i14 = r0Var.f58436e;
        }
        if ((i15 & 32) != 0) {
            z11 = r0Var.f58437f;
        }
        int i16 = i14;
        boolean z12 = z11;
        return r0Var.g(i11, str, i12, i13, i16, z12);
    }

    public final int a() {
        return this.f58432a;
    }

    @m80.k
    public final String b() {
        return this.f58433b;
    }

    public final int c() {
        return this.f58434c;
    }

    public final int d() {
        return this.f58435d;
    }

    public final int e() {
        return this.f58436e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return this.f58432a == r0Var.f58432a && kotlin.jvm.internal.g0.g(this.f58433b, r0Var.f58433b) && this.f58434c == r0Var.f58434c && this.f58435d == r0Var.f58435d && this.f58436e == r0Var.f58436e && this.f58437f == r0Var.f58437f;
    }

    public final boolean f() {
        return this.f58437f;
    }

    @m80.k
    public final r0 g(int i11, @m80.k String taskName, int i12, int i13, int i14, boolean z11) {
        kotlin.jvm.internal.g0.p(taskName, "taskName");
        return new r0(i11, taskName, i12, i13, i14, z11);
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f58432a) * 31) + this.f58433b.hashCode()) * 31) + Integer.hashCode(this.f58434c)) * 31) + Integer.hashCode(this.f58435d)) * 31) + Integer.hashCode(this.f58436e)) * 31) + Boolean.hashCode(this.f58437f);
    }

    public final int i() {
        return this.f58435d;
    }

    public final boolean j() {
        return this.f58437f;
    }

    public final int k() {
        return this.f58434c;
    }

    @m80.k
    public final String l() {
        return this.f58433b;
    }

    public final int m() {
        return this.f58436e;
    }

    public final int n() {
        return this.f58432a;
    }

    @m80.k
    public String toString() {
        return "TaskProgressChange(userTaskId=" + this.f58432a + ", taskName=" + this.f58433b + ", previousProgress=" + this.f58434c + ", currentProgress=" + this.f58435d + ", totalProgress=" + this.f58436e + ", hasClaim=" + this.f58437f + ')';
    }
}
