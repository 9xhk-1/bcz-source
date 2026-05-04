package l3;

import com.baicizhan.app.api.service.model.StreakState;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f69280a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final StreakState f69281b;

    public b0(int i11, @m80.k StreakState state) {
        kotlin.jvm.internal.g0.p(state, "state");
        this.f69280a = i11;
        this.f69281b = state;
    }

    public static /* synthetic */ b0 d(b0 b0Var, int i11, StreakState streakState, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = b0Var.f69280a;
        }
        if ((i12 & 2) != 0) {
            streakState = b0Var.f69281b;
        }
        return b0Var.c(i11, streakState);
    }

    public final int a() {
        return this.f69280a;
    }

    @m80.k
    public final StreakState b() {
        return this.f69281b;
    }

    @m80.k
    public final b0 c(int i11, @m80.k StreakState state) {
        kotlin.jvm.internal.g0.p(state, "state");
        return new b0(i11, state);
    }

    @m80.k
    public final StreakState e() {
        return this.f69281b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f69280a == b0Var.f69280a && this.f69281b == b0Var.f69281b;
    }

    public final int f() {
        return this.f69280a;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f69280a) * 31) + this.f69281b.hashCode();
    }

    @m80.k
    public String toString() {
        return "Streak(streakDay=" + this.f69280a + ", state=" + this.f69281b + ')';
    }
}
