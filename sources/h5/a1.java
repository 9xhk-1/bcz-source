package h5;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f58311a;

    /* renamed from: b, reason: collision with root package name */
    public final int f58312b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f58313c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f58314d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f58315e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f58316f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f58317g;

    public a1(boolean z11, int i11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f58311a = z11;
        this.f58312b = i11;
        this.f58313c = z12;
        this.f58314d = z13;
        this.f58315e = z14;
        this.f58316f = z15;
        this.f58317g = z16;
    }

    public static /* synthetic */ a1 i(a1 a1Var, boolean z11, int i11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z11 = a1Var.f58311a;
        }
        if ((i12 & 2) != 0) {
            i11 = a1Var.f58312b;
        }
        if ((i12 & 4) != 0) {
            z12 = a1Var.f58313c;
        }
        if ((i12 & 8) != 0) {
            z13 = a1Var.f58314d;
        }
        if ((i12 & 16) != 0) {
            z14 = a1Var.f58315e;
        }
        if ((i12 & 32) != 0) {
            z15 = a1Var.f58316f;
        }
        if ((i12 & 64) != 0) {
            z16 = a1Var.f58317g;
        }
        boolean z17 = z15;
        boolean z18 = z16;
        boolean z19 = z14;
        boolean z21 = z12;
        return a1Var.h(z11, i11, z21, z13, z19, z17, z18);
    }

    public final boolean a() {
        return this.f58311a;
    }

    public final int b() {
        return this.f58312b;
    }

    public final boolean c() {
        return this.f58313c;
    }

    public final boolean d() {
        return this.f58314d;
    }

    public final boolean e() {
        return this.f58315e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return this.f58311a == a1Var.f58311a && this.f58312b == a1Var.f58312b && this.f58313c == a1Var.f58313c && this.f58314d == a1Var.f58314d && this.f58315e == a1Var.f58315e && this.f58316f == a1Var.f58316f && this.f58317g == a1Var.f58317g;
    }

    public final boolean f() {
        return this.f58316f;
    }

    public final boolean g() {
        return this.f58317g;
    }

    @m80.k
    public final a1 h(boolean z11, int i11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        return new a1(z11, i11, z12, z13, z14, z15, z16);
    }

    public int hashCode() {
        return (((((((((((Boolean.hashCode(this.f58311a) * 31) + Integer.hashCode(this.f58312b)) * 31) + Boolean.hashCode(this.f58313c)) * 31) + Boolean.hashCode(this.f58314d)) * 31) + Boolean.hashCode(this.f58315e)) * 31) + Boolean.hashCode(this.f58316f)) * 31) + Boolean.hashCode(this.f58317g);
    }

    public final boolean j() {
        return this.f58314d;
    }

    public final boolean k() {
        return this.f58315e;
    }

    public final boolean l() {
        return this.f58317g;
    }

    public final boolean m() {
        return this.f58316f;
    }

    public final boolean n() {
        return this.f58311a;
    }

    public final int o() {
        return this.f58312b;
    }

    public final boolean p() {
        return this.f58313c;
    }

    @m80.k
    public String toString() {
        return "WinningStreakTask(taskHasReward=" + this.f58311a + ", winningDays=" + this.f58312b + ", winningToday=" + this.f58313c + ", mileStone=" + this.f58314d + ", needHint=" + this.f58315e + ", newUserWinningBan=" + this.f58316f + ", newUserTaskBan=" + this.f58317g + ')';
    }
}
