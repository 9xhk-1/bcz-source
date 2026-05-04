package h5;

import com.baicizhan.app.biz.game.model.RankType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final RankType f58400a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f58401b;

    public o0(@m80.k RankType rankType, boolean z11) {
        kotlin.jvm.internal.g0.p(rankType, "rankType");
        this.f58400a = rankType;
        this.f58401b = z11;
    }

    public static /* synthetic */ o0 d(o0 o0Var, RankType rankType, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            rankType = o0Var.f58400a;
        }
        if ((i11 & 2) != 0) {
            z11 = o0Var.f58401b;
        }
        return o0Var.c(rankType, z11);
    }

    @m80.k
    public final RankType a() {
        return this.f58400a;
    }

    public final boolean b() {
        return this.f58401b;
    }

    @m80.k
    public final o0 c(@m80.k RankType rankType, boolean z11) {
        kotlin.jvm.internal.g0.p(rankType, "rankType");
        return new o0(rankType, z11);
    }

    public final boolean e() {
        return this.f58401b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return this.f58400a == o0Var.f58400a && this.f58401b == o0Var.f58401b;
    }

    @m80.k
    public final RankType f() {
        return this.f58400a;
    }

    public int hashCode() {
        return (this.f58400a.hashCode() * 31) + Boolean.hashCode(this.f58401b);
    }

    @m80.k
    public String toString() {
        return "StudyScoreRank(rankType=" + this.f58400a + ", newUserBan=" + this.f58401b + ')';
    }
}
