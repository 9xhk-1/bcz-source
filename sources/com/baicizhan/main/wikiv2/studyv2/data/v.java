package com.baicizhan.main.wikiv2.studyv2.data;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class v extends y {

    /* renamed from: d, reason: collision with root package name */
    public static final int f26116d = 8;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<b0> f26117c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(@m80.k List<b0> means) {
        super(m0.f26070d);
        kotlin.jvm.internal.g0.p(means, "means");
        this.f26117c = means;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ v g(v vVar, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = vVar.f26117c;
        }
        return vVar.f(list);
    }

    @m80.k
    public final List<b0> e() {
        return this.f26117c;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && kotlin.jvm.internal.g0.g(this.f26117c, ((v) obj).f26117c);
    }

    @m80.k
    public final v f(@m80.k List<b0> means) {
        kotlin.jvm.internal.g0.p(means, "means");
        return new v(means);
    }

    @m80.k
    public final List<b0> h() {
        return this.f26117c;
    }

    public int hashCode() {
        return this.f26117c.hashCode();
    }

    @m80.k
    public String toString() {
        return "EnMean(means=" + this.f26117c + pn.j.f81007d;
    }
}
