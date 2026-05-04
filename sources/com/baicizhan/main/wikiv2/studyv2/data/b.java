package com.baicizhan.main.wikiv2.studyv2.data;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Pair;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class b extends y {

    /* renamed from: d, reason: collision with root package name */
    public static final int f26017d = 8;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<Pair<String, Boolean>> f26018c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@m80.k List<Pair<String, Boolean>> antonym) {
        super(m0.f26073g);
        kotlin.jvm.internal.g0.p(antonym, "antonym");
        this.f26018c = antonym;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b g(b bVar, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = bVar.f26018c;
        }
        return bVar.f(list);
    }

    @m80.k
    public final List<Pair<String, Boolean>> e() {
        return this.f26018c;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && kotlin.jvm.internal.g0.g(this.f26018c, ((b) obj).f26018c);
    }

    @m80.k
    public final b f(@m80.k List<Pair<String, Boolean>> antonym) {
        kotlin.jvm.internal.g0.p(antonym, "antonym");
        return new b(antonym);
    }

    @m80.k
    public final List<Pair<String, Boolean>> h() {
        return this.f26018c;
    }

    public int hashCode() {
        return this.f26018c.hashCode();
    }

    @m80.k
    public String toString() {
        return "Antonym(antonym=" + this.f26018c + pn.j.f81007d;
    }
}
