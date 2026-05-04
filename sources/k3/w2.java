package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class w2 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final l3.e0 f65678a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final l3.a0 f65679b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final l3.w f65680c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final a3 f65681d;

    public w2(@m80.k l3.e0 topContent, @m80.k l3.a0 sidePromotions, @m80.k l3.w sentenceLearningState, @m80.k a3 studyBuddy) {
        kotlin.jvm.internal.g0.p(topContent, "topContent");
        kotlin.jvm.internal.g0.p(sidePromotions, "sidePromotions");
        kotlin.jvm.internal.g0.p(sentenceLearningState, "sentenceLearningState");
        kotlin.jvm.internal.g0.p(studyBuddy, "studyBuddy");
        this.f65678a = topContent;
        this.f65679b = sidePromotions;
        this.f65680c = sentenceLearningState;
        this.f65681d = studyBuddy;
    }

    public static /* synthetic */ w2 f(w2 w2Var, l3.e0 e0Var, l3.a0 a0Var, l3.w wVar, a3 a3Var, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            e0Var = w2Var.f65678a;
        }
        if ((i11 & 2) != 0) {
            a0Var = w2Var.f65679b;
        }
        if ((i11 & 4) != 0) {
            wVar = w2Var.f65680c;
        }
        if ((i11 & 8) != 0) {
            a3Var = w2Var.f65681d;
        }
        return w2Var.e(e0Var, a0Var, wVar, a3Var);
    }

    @m80.k
    public final l3.e0 a() {
        return this.f65678a;
    }

    @m80.k
    public final l3.a0 b() {
        return this.f65679b;
    }

    @m80.k
    public final l3.w c() {
        return this.f65680c;
    }

    @m80.k
    public final a3 d() {
        return this.f65681d;
    }

    @m80.k
    public final w2 e(@m80.k l3.e0 topContent, @m80.k l3.a0 sidePromotions, @m80.k l3.w sentenceLearningState, @m80.k a3 studyBuddy) {
        kotlin.jvm.internal.g0.p(topContent, "topContent");
        kotlin.jvm.internal.g0.p(sidePromotions, "sidePromotions");
        kotlin.jvm.internal.g0.p(sentenceLearningState, "sentenceLearningState");
        kotlin.jvm.internal.g0.p(studyBuddy, "studyBuddy");
        return new w2(topContent, sidePromotions, sentenceLearningState, studyBuddy);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2)) {
            return false;
        }
        w2 w2Var = (w2) obj;
        return kotlin.jvm.internal.g0.g(this.f65678a, w2Var.f65678a) && kotlin.jvm.internal.g0.g(this.f65679b, w2Var.f65679b) && kotlin.jvm.internal.g0.g(this.f65680c, w2Var.f65680c) && kotlin.jvm.internal.g0.g(this.f65681d, w2Var.f65681d);
    }

    @m80.k
    public final l3.w g() {
        return this.f65680c;
    }

    @m80.k
    public final l3.a0 h() {
        return this.f65679b;
    }

    public int hashCode() {
        return (((((this.f65678a.hashCode() * 31) + this.f65679b.hashCode()) * 31) + this.f65680c.hashCode()) * 31) + this.f65681d.hashCode();
    }

    @m80.k
    public final a3 i() {
        return this.f65681d;
    }

    @m80.k
    public final l3.e0 j() {
        return this.f65678a;
    }

    @m80.k
    public String toString() {
        return "SentenceHomeViewState(topContent=" + this.f65678a + ", sidePromotions=" + this.f65679b + ", sentenceLearningState=" + this.f65680c + ", studyBuddy=" + this.f65681d + ')';
    }
}
