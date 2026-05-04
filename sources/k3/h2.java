package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final c4 f65336a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final g3 f65337b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final g2 f65338c;

    public h2(@m80.k c4 winningStreak, @m80.k g3 task, @m80.k g2 ranking) {
        kotlin.jvm.internal.g0.p(winningStreak, "winningStreak");
        kotlin.jvm.internal.g0.p(task, "task");
        kotlin.jvm.internal.g0.p(ranking, "ranking");
        this.f65336a = winningStreak;
        this.f65337b = task;
        this.f65338c = ranking;
    }

    public static /* synthetic */ h2 e(h2 h2Var, c4 c4Var, g3 g3Var, g2 g2Var, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            c4Var = h2Var.f65336a;
        }
        if ((i11 & 2) != 0) {
            g3Var = h2Var.f65337b;
        }
        if ((i11 & 4) != 0) {
            g2Var = h2Var.f65338c;
        }
        return h2Var.d(c4Var, g3Var, g2Var);
    }

    @m80.k
    public final c4 a() {
        return this.f65336a;
    }

    @m80.k
    public final g3 b() {
        return this.f65337b;
    }

    @m80.k
    public final g2 c() {
        return this.f65338c;
    }

    @m80.k
    public final h2 d(@m80.k c4 winningStreak, @m80.k g3 task, @m80.k g2 ranking) {
        kotlin.jvm.internal.g0.p(winningStreak, "winningStreak");
        kotlin.jvm.internal.g0.p(task, "task");
        kotlin.jvm.internal.g0.p(ranking, "ranking");
        return new h2(winningStreak, task, ranking);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj;
        return kotlin.jvm.internal.g0.g(this.f65336a, h2Var.f65336a) && kotlin.jvm.internal.g0.g(this.f65337b, h2Var.f65337b) && kotlin.jvm.internal.g0.g(this.f65338c, h2Var.f65338c);
    }

    @m80.k
    public final g2 f() {
        return this.f65338c;
    }

    @m80.k
    public final g3 g() {
        return this.f65337b;
    }

    @m80.k
    public final c4 h() {
        return this.f65336a;
    }

    public int hashCode() {
        return (((this.f65336a.hashCode() * 31) + this.f65337b.hashCode()) * 31) + this.f65338c.hashCode();
    }

    @m80.k
    public String toString() {
        return "RankingTasksAndWinning(winningStreak=" + this.f65336a + ", task=" + this.f65337b + ", ranking=" + this.f65338c + ')';
    }
}
