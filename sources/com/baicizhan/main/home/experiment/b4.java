package com.baicizhan.main.home.experiment;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class b4 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f21099d = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final WinningState f21101a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21102b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final a f21098c = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final b4 f21100e = new b4(WinningState.NORMAL, 0);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final b4 a() {
            return b4.f21100e;
        }

        public a() {
        }
    }

    public b4(@m80.k WinningState state, int i11) {
        kotlin.jvm.internal.g0.p(state, "state");
        this.f21101a = state;
        this.f21102b = i11;
    }

    public static /* synthetic */ b4 e(b4 b4Var, WinningState winningState, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            winningState = b4Var.f21101a;
        }
        if ((i12 & 2) != 0) {
            i11 = b4Var.f21102b;
        }
        return b4Var.d(winningState, i11);
    }

    @m80.k
    public final WinningState b() {
        return this.f21101a;
    }

    public final int c() {
        return this.f21102b;
    }

    @m80.k
    public final b4 d(@m80.k WinningState state, int i11) {
        kotlin.jvm.internal.g0.p(state, "state");
        return new b4(state, i11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4)) {
            return false;
        }
        b4 b4Var = (b4) obj;
        return this.f21101a == b4Var.f21101a && this.f21102b == b4Var.f21102b;
    }

    public final int f() {
        return this.f21102b;
    }

    @m80.k
    public final WinningState g() {
        return this.f21101a;
    }

    public int hashCode() {
        return (this.f21101a.hashCode() * 31) + Integer.hashCode(this.f21102b);
    }

    @m80.k
    public String toString() {
        return "WinningStatus(state=" + this.f21101a + ", count=" + this.f21102b + pn.j.f81007d;
    }
}
