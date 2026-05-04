package sg;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final int f88452e = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.main.home.plan.winningStreak.c f88453a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.main.home.plan.winningStreak.b f88454b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.main.home.plan.winningStreak.a f88455c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f88456d;

    public c(@m80.k com.baicizhan.main.home.plan.winningStreak.c winningStreak, @m80.k com.baicizhan.main.home.plan.winningStreak.b task, @m80.k com.baicizhan.main.home.plan.winningStreak.a ranking, boolean z11) {
        g0.p(winningStreak, "winningStreak");
        g0.p(task, "task");
        g0.p(ranking, "ranking");
        this.f88453a = winningStreak;
        this.f88454b = task;
        this.f88455c = ranking;
        this.f88456d = z11;
    }

    public static /* synthetic */ c f(c cVar, com.baicizhan.main.home.plan.winningStreak.c cVar2, com.baicizhan.main.home.plan.winningStreak.b bVar, com.baicizhan.main.home.plan.winningStreak.a aVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cVar2 = cVar.f88453a;
        }
        if ((i11 & 2) != 0) {
            bVar = cVar.f88454b;
        }
        if ((i11 & 4) != 0) {
            aVar = cVar.f88455c;
        }
        if ((i11 & 8) != 0) {
            z11 = cVar.f88456d;
        }
        return cVar.e(cVar2, bVar, aVar, z11);
    }

    @m80.k
    public final com.baicizhan.main.home.plan.winningStreak.c a() {
        return this.f88453a;
    }

    @m80.k
    public final com.baicizhan.main.home.plan.winningStreak.b b() {
        return this.f88454b;
    }

    @m80.k
    public final com.baicizhan.main.home.plan.winningStreak.a c() {
        return this.f88455c;
    }

    public final boolean d() {
        return this.f88456d;
    }

    @m80.k
    public final c e(@m80.k com.baicizhan.main.home.plan.winningStreak.c winningStreak, @m80.k com.baicizhan.main.home.plan.winningStreak.b task, @m80.k com.baicizhan.main.home.plan.winningStreak.a ranking, boolean z11) {
        g0.p(winningStreak, "winningStreak");
        g0.p(task, "task");
        g0.p(ranking, "ranking");
        return new c(winningStreak, task, ranking, z11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return g0.g(this.f88453a, cVar.f88453a) && g0.g(this.f88454b, cVar.f88454b) && g0.g(this.f88455c, cVar.f88455c) && this.f88456d == cVar.f88456d;
    }

    @m80.k
    public final com.baicizhan.main.home.plan.winningStreak.a g() {
        return this.f88455c;
    }

    @m80.k
    public final com.baicizhan.main.home.plan.winningStreak.b h() {
        return this.f88454b;
    }

    public int hashCode() {
        return (((((this.f88453a.hashCode() * 31) + this.f88454b.hashCode()) * 31) + this.f88455c.hashCode()) * 31) + Boolean.hashCode(this.f88456d);
    }

    @m80.k
    public final com.baicizhan.main.home.plan.winningStreak.c i() {
        return this.f88453a;
    }

    public final boolean j() {
        return this.f88456d;
    }

    @m80.k
    public String toString() {
        return "RankingTasksAndWinning(winningStreak=" + this.f88453a + ", task=" + this.f88454b + ", ranking=" + this.f88455c + ", isDark=" + this.f88456d + pn.j.f81007d;
    }

    public /* synthetic */ c(com.baicizhan.main.home.plan.winningStreak.c cVar, com.baicizhan.main.home.plan.winningStreak.b bVar, com.baicizhan.main.home.plan.winningStreak.a aVar, boolean z11, int i11, kotlin.jvm.internal.v vVar) {
        this(cVar, bVar, aVar, (i11 & 8) != 0 ? false : z11);
    }
}
