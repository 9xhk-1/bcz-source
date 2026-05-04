package h5;

import com.baicizhan.app.biz.game.model.RoundType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f58382a;

    /* renamed from: b, reason: collision with root package name */
    public final int f58383b;

    /* renamed from: c, reason: collision with root package name */
    public final int f58384c;

    /* renamed from: d, reason: collision with root package name */
    public final int f58385d;

    /* renamed from: e, reason: collision with root package name */
    public final int f58386e;

    /* renamed from: f, reason: collision with root package name */
    public final int f58387f;

    /* renamed from: g, reason: collision with root package name */
    public final int f58388g;

    /* renamed from: h, reason: collision with root package name */
    public final int f58389h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    public final RoundType f58390i;

    public n0(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, @m80.l RoundType roundType) {
        this.f58382a = i11;
        this.f58383b = i12;
        this.f58384c = i13;
        this.f58385d = i14;
        this.f58386e = i15;
        this.f58387f = i16;
        this.f58388g = i17;
        this.f58389h = i18;
        this.f58390i = roundType;
    }

    public static /* synthetic */ n0 k(n0 n0Var, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, RoundType roundType, int i19, Object obj) {
        if ((i19 & 1) != 0) {
            i11 = n0Var.f58382a;
        }
        if ((i19 & 2) != 0) {
            i12 = n0Var.f58383b;
        }
        if ((i19 & 4) != 0) {
            i13 = n0Var.f58384c;
        }
        if ((i19 & 8) != 0) {
            i14 = n0Var.f58385d;
        }
        if ((i19 & 16) != 0) {
            i15 = n0Var.f58386e;
        }
        if ((i19 & 32) != 0) {
            i16 = n0Var.f58387f;
        }
        if ((i19 & 64) != 0) {
            i17 = n0Var.f58388g;
        }
        if ((i19 & 128) != 0) {
            i18 = n0Var.f58389h;
        }
        if ((i19 & 256) != 0) {
            roundType = n0Var.f58390i;
        }
        int i21 = i18;
        RoundType roundType2 = roundType;
        int i22 = i16;
        int i23 = i17;
        int i24 = i15;
        int i25 = i13;
        return n0Var.j(i11, i12, i25, i14, i24, i22, i23, i21, roundType2);
    }

    public final int a() {
        return this.f58382a;
    }

    public final int b() {
        return this.f58383b;
    }

    public final int c() {
        return this.f58384c;
    }

    public final int d() {
        return this.f58385d;
    }

    public final int e() {
        return this.f58386e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.f58382a == n0Var.f58382a && this.f58383b == n0Var.f58383b && this.f58384c == n0Var.f58384c && this.f58385d == n0Var.f58385d && this.f58386e == n0Var.f58386e && this.f58387f == n0Var.f58387f && this.f58388g == n0Var.f58388g && this.f58389h == n0Var.f58389h && this.f58390i == n0Var.f58390i;
    }

    public final int f() {
        return this.f58387f;
    }

    public final int g() {
        return this.f58388g;
    }

    public final int h() {
        return this.f58389h;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((Integer.hashCode(this.f58382a) * 31) + Integer.hashCode(this.f58383b)) * 31) + Integer.hashCode(this.f58384c)) * 31) + Integer.hashCode(this.f58385d)) * 31) + Integer.hashCode(this.f58386e)) * 31) + Integer.hashCode(this.f58387f)) * 31) + Integer.hashCode(this.f58388g)) * 31) + Integer.hashCode(this.f58389h)) * 31;
        RoundType roundType = this.f58390i;
        return hashCode + (roundType == null ? 0 : roundType.hashCode());
    }

    @m80.l
    public final RoundType i() {
        return this.f58390i;
    }

    @m80.k
    public final n0 j(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, @m80.l RoundType roundType) {
        return new n0(i11, i12, i13, i14, i15, i16, i17, i18, roundType);
    }

    public final int l() {
        return this.f58386e;
    }

    public final int m() {
        return this.f58389h;
    }

    public final int n() {
        return this.f58382a;
    }

    public final int o() {
        return this.f58383b;
    }

    @m80.l
    public final RoundType p() {
        return this.f58390i;
    }

    public final int q() {
        return this.f58384c;
    }

    public final int r() {
        return this.f58385d;
    }

    public final int s() {
        return this.f58387f;
    }

    public final int t() {
        return this.f58388g;
    }

    @m80.k
    public String toString() {
        return "StudyProgressModel(learningCompletedRound=" + this.f58382a + ", learningTotalRound=" + this.f58383b + ", reviewCompletedCount=" + this.f58384c + ", reviewTotalCount=" + this.f58385d + ", aiReviewTotalCount=" + this.f58386e + ", spellCompletedCount=" + this.f58387f + ", spellTotalCount=" + this.f58388g + ", aiStudyFinishState=" + this.f58389h + ", nextAiGameType=" + this.f58390i + ')';
    }
}
