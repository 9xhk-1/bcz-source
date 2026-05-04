package com.baicizhan.main.wikiv2.studyv2.data;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Pair;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class n0 extends y {

    /* renamed from: d, reason: collision with root package name */
    public static final int f26076d = 8;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<Pair<Pair<String, String>, Boolean>> f26077c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(@m80.k List<Pair<Pair<String, String>, Boolean>> variant) {
        super(m0.f26068b);
        kotlin.jvm.internal.g0.p(variant, "variant");
        this.f26077c = variant;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ n0 g(n0 n0Var, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = n0Var.f26077c;
        }
        return n0Var.f(list);
    }

    @m80.k
    public final List<Pair<Pair<String, String>, Boolean>> e() {
        return this.f26077c;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && kotlin.jvm.internal.g0.g(this.f26077c, ((n0) obj).f26077c);
    }

    @m80.k
    public final n0 f(@m80.k List<Pair<Pair<String, String>, Boolean>> variant) {
        kotlin.jvm.internal.g0.p(variant, "variant");
        return new n0(variant);
    }

    @m80.k
    public final List<Pair<Pair<String, String>, Boolean>> h() {
        return this.f26077c;
    }

    public int hashCode() {
        return this.f26077c.hashCode();
    }

    @m80.k
    public String toString() {
        return "Variant(variant=" + this.f26077c + pn.j.f81007d;
    }
}
