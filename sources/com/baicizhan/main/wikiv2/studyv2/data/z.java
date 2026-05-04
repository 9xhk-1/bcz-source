package com.baicizhan.main.wikiv2.studyv2.data;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class z {

    /* renamed from: b, reason: collision with root package name */
    public static final int f26141b = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<y> f26142a;

    /* JADX WARN: Multi-variable type inference failed */
    public z(@m80.k List<? extends y> extensions) {
        kotlin.jvm.internal.g0.p(extensions, "extensions");
        this.f26142a = extensions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ z c(z zVar, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = zVar.f26142a;
        }
        return zVar.b(list);
    }

    @m80.k
    public final List<y> a() {
        return this.f26142a;
    }

    @m80.k
    public final z b(@m80.k List<? extends y> extensions) {
        kotlin.jvm.internal.g0.p(extensions, "extensions");
        return new z(extensions);
    }

    @m80.k
    public final List<y> d() {
        return this.f26142a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && kotlin.jvm.internal.g0.g(this.f26142a, ((z) obj).f26142a);
    }

    public int hashCode() {
        return this.f26142a.hashCode();
    }

    @m80.k
    public String toString() {
        return "Extensions(extensions=" + this.f26142a + pn.j.f81007d;
    }
}
