package h5;

import com.baicizhan.app.biz.game.model.RoundType;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f58412a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f58413b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f58414c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f58415d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final List<RoundType> f58416e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final n0 f58417f;

    /* renamed from: g, reason: collision with root package name */
    public final int f58418g;

    /* renamed from: h, reason: collision with root package name */
    public final int f58419h;

    /* renamed from: i, reason: collision with root package name */
    public final int f58420i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f58421j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final List<t0> f58422k;

    /* renamed from: l, reason: collision with root package name */
    public final int f58423l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f58424m;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public final String f58425n;

    /* JADX WARN: Multi-variable type inference failed */
    public p0(boolean z11, boolean z12, boolean z13, boolean z14, @m80.k List<? extends RoundType> gameInProgress, @m80.k n0 studyProgress, int i11, int i12, int i13, boolean z15, @m80.k List<t0> units, int i14, boolean z16, @m80.k String bookName) {
        kotlin.jvm.internal.g0.p(gameInProgress, "gameInProgress");
        kotlin.jvm.internal.g0.p(studyProgress, "studyProgress");
        kotlin.jvm.internal.g0.p(units, "units");
        kotlin.jvm.internal.g0.p(bookName, "bookName");
        this.f58412a = z11;
        this.f58413b = z12;
        this.f58414c = z13;
        this.f58415d = z14;
        this.f58416e = gameInProgress;
        this.f58417f = studyProgress;
        this.f58418g = i11;
        this.f58419h = i12;
        this.f58420i = i13;
        this.f58421j = z15;
        this.f58422k = units;
        this.f58423l = i14;
        this.f58424m = z16;
        this.f58425n = bookName;
    }

    public final boolean A() {
        return this.f58424m;
    }

    public final boolean B() {
        return this.f58412a;
    }

    public final boolean C() {
        return this.f58413b;
    }

    public final boolean D() {
        return this.f58414c;
    }

    public final boolean a() {
        return this.f58412a;
    }

    public final boolean b() {
        return this.f58421j;
    }

    @m80.k
    public final List<t0> c() {
        return this.f58422k;
    }

    public final int d() {
        return this.f58423l;
    }

    public final boolean e() {
        return this.f58424m;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return this.f58412a == p0Var.f58412a && this.f58413b == p0Var.f58413b && this.f58414c == p0Var.f58414c && this.f58415d == p0Var.f58415d && kotlin.jvm.internal.g0.g(this.f58416e, p0Var.f58416e) && kotlin.jvm.internal.g0.g(this.f58417f, p0Var.f58417f) && this.f58418g == p0Var.f58418g && this.f58419h == p0Var.f58419h && this.f58420i == p0Var.f58420i && this.f58421j == p0Var.f58421j && kotlin.jvm.internal.g0.g(this.f58422k, p0Var.f58422k) && this.f58423l == p0Var.f58423l && this.f58424m == p0Var.f58424m && kotlin.jvm.internal.g0.g(this.f58425n, p0Var.f58425n);
    }

    @m80.k
    public final String f() {
        return this.f58425n;
    }

    public final boolean g() {
        return this.f58413b;
    }

    public final boolean h() {
        return this.f58414c;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((Boolean.hashCode(this.f58412a) * 31) + Boolean.hashCode(this.f58413b)) * 31) + Boolean.hashCode(this.f58414c)) * 31) + Boolean.hashCode(this.f58415d)) * 31) + this.f58416e.hashCode()) * 31) + this.f58417f.hashCode()) * 31) + Integer.hashCode(this.f58418g)) * 31) + Integer.hashCode(this.f58419h)) * 31) + Integer.hashCode(this.f58420i)) * 31) + Boolean.hashCode(this.f58421j)) * 31) + this.f58422k.hashCode()) * 31) + Integer.hashCode(this.f58423l)) * 31) + Boolean.hashCode(this.f58424m)) * 31) + this.f58425n.hashCode();
    }

    public final boolean i() {
        return this.f58415d;
    }

    @m80.k
    public final List<RoundType> j() {
        return this.f58416e;
    }

    @m80.k
    public final n0 k() {
        return this.f58417f;
    }

    public final int l() {
        return this.f58418g;
    }

    public final int m() {
        return this.f58419h;
    }

    public final int n() {
        return this.f58420i;
    }

    @m80.k
    public final p0 o(boolean z11, boolean z12, boolean z13, boolean z14, @m80.k List<? extends RoundType> gameInProgress, @m80.k n0 studyProgress, int i11, int i12, int i13, boolean z15, @m80.k List<t0> units, int i14, boolean z16, @m80.k String bookName) {
        kotlin.jvm.internal.g0.p(gameInProgress, "gameInProgress");
        kotlin.jvm.internal.g0.p(studyProgress, "studyProgress");
        kotlin.jvm.internal.g0.p(units, "units");
        kotlin.jvm.internal.g0.p(bookName, "bookName");
        return new p0(z11, z12, z13, z14, gameInProgress, studyProgress, i11, i12, i13, z15, units, i14, z16, bookName);
    }

    @m80.k
    public final String q() {
        return this.f58425n;
    }

    public final int r() {
        return this.f58423l;
    }

    @m80.k
    public final List<RoundType> s() {
        return this.f58416e;
    }

    public final boolean t() {
        return this.f58415d;
    }

    @m80.k
    public String toString() {
        return "StudySummary(isAllDone=" + this.f58412a + ", isNewLearnFinish=" + this.f58413b + ", isReviewWordsAvailable=" + this.f58414c + ", hasNewLearningToady=" + this.f58415d + ", gameInProgress=" + this.f58416e + ", studyProgress=" + this.f58417f + ", learnedCount=" + this.f58418g + ", masteredCount=" + this.f58419h + ", totalCount=" + this.f58420i + ", spellInProgress=" + this.f58421j + ", units=" + this.f58422k + ", curUnitNo=" + this.f58423l + ", isAiAvailable=" + this.f58424m + ", bookName=" + this.f58425n + ')';
    }

    public final int u() {
        return this.f58418g;
    }

    public final int v() {
        return this.f58419h;
    }

    public final boolean w() {
        return this.f58421j;
    }

    @m80.k
    public final n0 x() {
        return this.f58417f;
    }

    public final int y() {
        return this.f58420i;
    }

    @m80.k
    public final List<t0> z() {
        return this.f58422k;
    }
}
