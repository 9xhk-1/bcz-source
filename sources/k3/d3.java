package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class d3 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f65273a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final q f65274b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final j1 f65275c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final j2 f65276d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final m3 f65277e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final h f65278f;

    public d3(boolean z11, @m80.k q bookState, @m80.k j1 learningState, @m80.k j2 reviewState, @m80.k m3 unitState, @m80.k h aiState) {
        kotlin.jvm.internal.g0.p(bookState, "bookState");
        kotlin.jvm.internal.g0.p(learningState, "learningState");
        kotlin.jvm.internal.g0.p(reviewState, "reviewState");
        kotlin.jvm.internal.g0.p(unitState, "unitState");
        kotlin.jvm.internal.g0.p(aiState, "aiState");
        this.f65273a = z11;
        this.f65274b = bookState;
        this.f65275c = learningState;
        this.f65276d = reviewState;
        this.f65277e = unitState;
        this.f65278f = aiState;
    }

    public static /* synthetic */ d3 h(d3 d3Var, boolean z11, q qVar, j1 j1Var, j2 j2Var, m3 m3Var, h hVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = d3Var.f65273a;
        }
        if ((i11 & 2) != 0) {
            qVar = d3Var.f65274b;
        }
        if ((i11 & 4) != 0) {
            j1Var = d3Var.f65275c;
        }
        if ((i11 & 8) != 0) {
            j2Var = d3Var.f65276d;
        }
        if ((i11 & 16) != 0) {
            m3Var = d3Var.f65277e;
        }
        if ((i11 & 32) != 0) {
            hVar = d3Var.f65278f;
        }
        m3 m3Var2 = m3Var;
        h hVar2 = hVar;
        return d3Var.g(z11, qVar, j1Var, j2Var, m3Var2, hVar2);
    }

    public final boolean a() {
        return this.f65273a;
    }

    @m80.k
    public final q b() {
        return this.f65274b;
    }

    @m80.k
    public final j1 c() {
        return this.f65275c;
    }

    @m80.k
    public final j2 d() {
        return this.f65276d;
    }

    @m80.k
    public final m3 e() {
        return this.f65277e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3)) {
            return false;
        }
        d3 d3Var = (d3) obj;
        return this.f65273a == d3Var.f65273a && kotlin.jvm.internal.g0.g(this.f65274b, d3Var.f65274b) && kotlin.jvm.internal.g0.g(this.f65275c, d3Var.f65275c) && kotlin.jvm.internal.g0.g(this.f65276d, d3Var.f65276d) && kotlin.jvm.internal.g0.g(this.f65277e, d3Var.f65277e) && kotlin.jvm.internal.g0.g(this.f65278f, d3Var.f65278f);
    }

    @m80.k
    public final h f() {
        return this.f65278f;
    }

    @m80.k
    public final d3 g(boolean z11, @m80.k q bookState, @m80.k j1 learningState, @m80.k j2 reviewState, @m80.k m3 unitState, @m80.k h aiState) {
        kotlin.jvm.internal.g0.p(bookState, "bookState");
        kotlin.jvm.internal.g0.p(learningState, "learningState");
        kotlin.jvm.internal.g0.p(reviewState, "reviewState");
        kotlin.jvm.internal.g0.p(unitState, "unitState");
        kotlin.jvm.internal.g0.p(aiState, "aiState");
        return new d3(z11, bookState, learningState, reviewState, unitState, aiState);
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.f65273a) * 31) + this.f65274b.hashCode()) * 31) + this.f65275c.hashCode()) * 31) + this.f65276d.hashCode()) * 31) + this.f65277e.hashCode()) * 31) + this.f65278f.hashCode();
    }

    @m80.k
    public final h i() {
        return this.f65278f;
    }

    @m80.k
    public final q j() {
        return this.f65274b;
    }

    public final boolean k() {
        return this.f65273a;
    }

    @m80.k
    public final j1 l() {
        return this.f65275c;
    }

    @m80.k
    public final j2 m() {
        return this.f65276d;
    }

    @m80.k
    public final m3 n() {
        return this.f65277e;
    }

    @m80.k
    public String toString() {
        return "StudyState(hasDaka=" + this.f65273a + ", bookState=" + this.f65274b + ", learningState=" + this.f65275c + ", reviewState=" + this.f65276d + ", unitState=" + this.f65277e + ", aiState=" + this.f65278f + ')';
    }
}
