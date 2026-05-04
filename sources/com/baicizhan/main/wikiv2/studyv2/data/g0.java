package com.baicizhan.main.wikiv2.studyv2.data;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Pair;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class g0 extends y {

    /* renamed from: d, reason: collision with root package name */
    public static final int f26046d = 8;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<Pair<String, Boolean>> f26047c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(@m80.k List<Pair<String, Boolean>> similar) {
        super(m0.f26074h);
        kotlin.jvm.internal.g0.p(similar, "similar");
        this.f26047c = similar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ g0 g(g0 g0Var, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = g0Var.f26047c;
        }
        return g0Var.f(list);
    }

    @m80.k
    public final List<Pair<String, Boolean>> e() {
        return this.f26047c;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0) && kotlin.jvm.internal.g0.g(this.f26047c, ((g0) obj).f26047c);
    }

    @m80.k
    public final g0 f(@m80.k List<Pair<String, Boolean>> similar) {
        kotlin.jvm.internal.g0.p(similar, "similar");
        return new g0(similar);
    }

    @m80.k
    public final List<Pair<String, Boolean>> h() {
        return this.f26047c;
    }

    public int hashCode() {
        return this.f26047c.hashCode();
    }

    @m80.k
    public String toString() {
        return "Similar(similar=" + this.f26047c + pn.j.f81007d;
    }
}
