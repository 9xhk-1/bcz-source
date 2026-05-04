package com.baicizhan.main.wikiv2.studyv2.data;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Pair;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class c0 extends y {

    /* renamed from: d, reason: collision with root package name */
    public static final int f26025d = 8;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<Pair<Pair<String, String>, Boolean>> f26026c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(@m80.k List<Pair<Pair<String, String>, Boolean>> phrase) {
        super(m0.f26067a);
        kotlin.jvm.internal.g0.p(phrase, "phrase");
        this.f26026c = phrase;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ c0 g(c0 c0Var, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = c0Var.f26026c;
        }
        return c0Var.f(list);
    }

    @m80.k
    public final List<Pair<Pair<String, String>, Boolean>> e() {
        return this.f26026c;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && kotlin.jvm.internal.g0.g(this.f26026c, ((c0) obj).f26026c);
    }

    @m80.k
    public final c0 f(@m80.k List<Pair<Pair<String, String>, Boolean>> phrase) {
        kotlin.jvm.internal.g0.p(phrase, "phrase");
        return new c0(phrase);
    }

    @m80.k
    public final List<Pair<Pair<String, String>, Boolean>> h() {
        return this.f26026c;
    }

    public int hashCode() {
        return this.f26026c.hashCode();
    }

    @m80.k
    public String toString() {
        return "Phrase(phrase=" + this.f26026c + pn.j.f81007d;
    }
}
