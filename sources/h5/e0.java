package h5;

import com.baicizhan.app.biz.game.model.RewardPackageType;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final RewardPackageType f58336a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<m3.v0> f58337b;

    public e0(@m80.k RewardPackageType rewardPackageType, @m80.k List<m3.v0> rewardModels) {
        kotlin.jvm.internal.g0.p(rewardPackageType, "rewardPackageType");
        kotlin.jvm.internal.g0.p(rewardModels, "rewardModels");
        this.f58336a = rewardPackageType;
        this.f58337b = rewardModels;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ e0 d(e0 e0Var, RewardPackageType rewardPackageType, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            rewardPackageType = e0Var.f58336a;
        }
        if ((i11 & 2) != 0) {
            list = e0Var.f58337b;
        }
        return e0Var.c(rewardPackageType, list);
    }

    @m80.k
    public final RewardPackageType a() {
        return this.f58336a;
    }

    @m80.k
    public final List<m3.v0> b() {
        return this.f58337b;
    }

    @m80.k
    public final e0 c(@m80.k RewardPackageType rewardPackageType, @m80.k List<m3.v0> rewardModels) {
        kotlin.jvm.internal.g0.p(rewardPackageType, "rewardPackageType");
        kotlin.jvm.internal.g0.p(rewardModels, "rewardModels");
        return new e0(rewardPackageType, rewardModels);
    }

    @m80.k
    public final List<m3.v0> e() {
        return this.f58337b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f58336a == e0Var.f58336a && kotlin.jvm.internal.g0.g(this.f58337b, e0Var.f58337b);
    }

    @m80.k
    public final RewardPackageType f() {
        return this.f58336a;
    }

    public int hashCode() {
        return (this.f58336a.hashCode() * 31) + this.f58337b.hashCode();
    }

    @m80.k
    public String toString() {
        return "RewardPackage(rewardPackageType=" + this.f58336a + ", rewardModels=" + this.f58337b + ')';
    }
}
