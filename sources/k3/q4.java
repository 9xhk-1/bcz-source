package k3;

import k3.t2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class q4 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final l3.e0 f65560a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final l3.a0 f65561b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final l3.d0 f65562c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final a3 f65563d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final d3 f65564e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final t2 f65565f;

    public q4(@m80.k l3.e0 topContent, @m80.k l3.a0 sidePromotions, @m80.k l3.d0 topAd, @m80.k a3 studyBuddy, @m80.k d3 studyState, @m80.k t2 sentenceEntrance) {
        kotlin.jvm.internal.g0.p(topContent, "topContent");
        kotlin.jvm.internal.g0.p(sidePromotions, "sidePromotions");
        kotlin.jvm.internal.g0.p(topAd, "topAd");
        kotlin.jvm.internal.g0.p(studyBuddy, "studyBuddy");
        kotlin.jvm.internal.g0.p(studyState, "studyState");
        kotlin.jvm.internal.g0.p(sentenceEntrance, "sentenceEntrance");
        this.f65560a = topContent;
        this.f65561b = sidePromotions;
        this.f65562c = topAd;
        this.f65563d = studyBuddy;
        this.f65564e = studyState;
        this.f65565f = sentenceEntrance;
    }

    public static /* synthetic */ q4 h(q4 q4Var, l3.e0 e0Var, l3.a0 a0Var, l3.d0 d0Var, a3 a3Var, d3 d3Var, t2 t2Var, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            e0Var = q4Var.f65560a;
        }
        if ((i11 & 2) != 0) {
            a0Var = q4Var.f65561b;
        }
        if ((i11 & 4) != 0) {
            d0Var = q4Var.f65562c;
        }
        if ((i11 & 8) != 0) {
            a3Var = q4Var.f65563d;
        }
        if ((i11 & 16) != 0) {
            d3Var = q4Var.f65564e;
        }
        if ((i11 & 32) != 0) {
            t2Var = q4Var.f65565f;
        }
        d3 d3Var2 = d3Var;
        t2 t2Var2 = t2Var;
        return q4Var.g(e0Var, a0Var, d0Var, a3Var, d3Var2, t2Var2);
    }

    @m80.k
    public final l3.e0 a() {
        return this.f65560a;
    }

    @m80.k
    public final l3.a0 b() {
        return this.f65561b;
    }

    @m80.k
    public final l3.d0 c() {
        return this.f65562c;
    }

    @m80.k
    public final a3 d() {
        return this.f65563d;
    }

    @m80.k
    public final d3 e() {
        return this.f65564e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4)) {
            return false;
        }
        q4 q4Var = (q4) obj;
        return kotlin.jvm.internal.g0.g(this.f65560a, q4Var.f65560a) && kotlin.jvm.internal.g0.g(this.f65561b, q4Var.f65561b) && kotlin.jvm.internal.g0.g(this.f65562c, q4Var.f65562c) && kotlin.jvm.internal.g0.g(this.f65563d, q4Var.f65563d) && kotlin.jvm.internal.g0.g(this.f65564e, q4Var.f65564e) && kotlin.jvm.internal.g0.g(this.f65565f, q4Var.f65565f);
    }

    @m80.k
    public final t2 f() {
        return this.f65565f;
    }

    @m80.k
    public final q4 g(@m80.k l3.e0 topContent, @m80.k l3.a0 sidePromotions, @m80.k l3.d0 topAd, @m80.k a3 studyBuddy, @m80.k d3 studyState, @m80.k t2 sentenceEntrance) {
        kotlin.jvm.internal.g0.p(topContent, "topContent");
        kotlin.jvm.internal.g0.p(sidePromotions, "sidePromotions");
        kotlin.jvm.internal.g0.p(topAd, "topAd");
        kotlin.jvm.internal.g0.p(studyBuddy, "studyBuddy");
        kotlin.jvm.internal.g0.p(studyState, "studyState");
        kotlin.jvm.internal.g0.p(sentenceEntrance, "sentenceEntrance");
        return new q4(topContent, sidePromotions, topAd, studyBuddy, studyState, sentenceEntrance);
    }

    public int hashCode() {
        return (((((((((this.f65560a.hashCode() * 31) + this.f65561b.hashCode()) * 31) + this.f65562c.hashCode()) * 31) + this.f65563d.hashCode()) * 31) + this.f65564e.hashCode()) * 31) + this.f65565f.hashCode();
    }

    @m80.k
    public final t2 i() {
        return this.f65565f;
    }

    @m80.k
    public final l3.a0 j() {
        return this.f65561b;
    }

    @m80.k
    public final a3 k() {
        return this.f65563d;
    }

    @m80.k
    public final d3 l() {
        return this.f65564e;
    }

    @m80.k
    public final l3.d0 m() {
        return this.f65562c;
    }

    @m80.k
    public final l3.e0 n() {
        return this.f65560a;
    }

    @m80.k
    public String toString() {
        return "WordsHomeViewState(topContent=" + this.f65560a + ", sidePromotions=" + this.f65561b + ", topAd=" + this.f65562c + ", studyBuddy=" + this.f65563d + ", studyState=" + this.f65564e + ", sentenceEntrance=" + this.f65565f + ')';
    }

    public /* synthetic */ q4(l3.e0 e0Var, l3.a0 a0Var, l3.d0 d0Var, a3 a3Var, d3 d3Var, t2 t2Var, int i11, kotlin.jvm.internal.v vVar) {
        this(e0Var, a0Var, d0Var, a3Var, d3Var, (i11 & 32) != 0 ? new t2.a(1, "") : t2Var);
    }
}
