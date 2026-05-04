package com.baicizhan.main.wikiv2.studyv2.data;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Pair;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class u extends y {

    /* renamed from: d, reason: collision with root package name */
    public static final int f26105d = 8;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<Pair<Pair<String, String>, Boolean>> f26106c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(@m80.k List<Pair<Pair<String, String>, Boolean>> derivation) {
        super(m0.f26069c);
        kotlin.jvm.internal.g0.p(derivation, "derivation");
        this.f26106c = derivation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ u g(u uVar, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = uVar.f26106c;
        }
        return uVar.f(list);
    }

    @m80.k
    public final List<Pair<Pair<String, String>, Boolean>> e() {
        return this.f26106c;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && kotlin.jvm.internal.g0.g(this.f26106c, ((u) obj).f26106c);
    }

    @m80.k
    public final u f(@m80.k List<Pair<Pair<String, String>, Boolean>> derivation) {
        kotlin.jvm.internal.g0.p(derivation, "derivation");
        return new u(derivation);
    }

    @m80.k
    public final List<Pair<Pair<String, String>, Boolean>> h() {
        return this.f26106c;
    }

    public int hashCode() {
        return this.f26106c.hashCode();
    }

    @m80.k
    public String toString() {
        return "Derivation(derivation=" + this.f26106c + pn.j.f81007d;
    }
}
