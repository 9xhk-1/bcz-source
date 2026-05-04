package com.baicizhan.main.wikiv2.studyv2.data;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Pair;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class i0 extends y {

    /* renamed from: d, reason: collision with root package name */
    public static final int f26053d = 8;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<Pair<String, Boolean>> f26054c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(@m80.k List<Pair<String, Boolean>> synonym) {
        super(m0.f26072f);
        kotlin.jvm.internal.g0.p(synonym, "synonym");
        this.f26054c = synonym;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ i0 g(i0 i0Var, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = i0Var.f26054c;
        }
        return i0Var.f(list);
    }

    @m80.k
    public final List<Pair<String, Boolean>> e() {
        return this.f26054c;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && kotlin.jvm.internal.g0.g(this.f26054c, ((i0) obj).f26054c);
    }

    @m80.k
    public final i0 f(@m80.k List<Pair<String, Boolean>> synonym) {
        kotlin.jvm.internal.g0.p(synonym, "synonym");
        return new i0(synonym);
    }

    @m80.k
    public final List<Pair<String, Boolean>> h() {
        return this.f26054c;
    }

    public int hashCode() {
        return this.f26054c.hashCode();
    }

    @m80.k
    public String toString() {
        return "Synonym(synonym=" + this.f26054c + pn.j.f81007d;
    }
}
