package ee;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final int f49660b = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f49661a;

    public c(@m80.k String title) {
        kotlin.jvm.internal.g0.p(title, "title");
        this.f49661a = title;
    }

    public static /* synthetic */ c c(c cVar, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cVar.f49661a;
        }
        return cVar.b(str);
    }

    @m80.k
    public final String a() {
        return this.f49661a;
    }

    @m80.k
    public final c b(@m80.k String title) {
        kotlin.jvm.internal.g0.p(title, "title");
        return new c(title);
    }

    @m80.k
    public final String d() {
        return this.f49661a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && kotlin.jvm.internal.g0.g(this.f49661a, ((c) obj).f49661a);
    }

    public int hashCode() {
        return this.f49661a.hashCode();
    }

    @m80.k
    public String toString() {
        return "GradeTitle(title=" + this.f49661a + pn.j.f81007d;
    }
}
