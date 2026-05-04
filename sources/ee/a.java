package ee;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final int f49652c = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f49653a;

    /* renamed from: b, reason: collision with root package name */
    public final int f49654b;

    public a(@m80.k String title, int i11) {
        kotlin.jvm.internal.g0.p(title, "title");
        this.f49653a = title;
        this.f49654b = i11;
    }

    public static /* synthetic */ a d(a aVar, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = aVar.f49653a;
        }
        if ((i12 & 2) != 0) {
            i11 = aVar.f49654b;
        }
        return aVar.c(str, i11);
    }

    @m80.k
    public final String a() {
        return this.f49653a;
    }

    public final int b() {
        return this.f49654b;
    }

    @m80.k
    public final a c(@m80.k String title, int i11) {
        kotlin.jvm.internal.g0.p(title, "title");
        return new a(title, i11);
    }

    public final int e() {
        return this.f49654b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.g0.g(this.f49653a, aVar.f49653a) && this.f49654b == aVar.f49654b;
    }

    @m80.k
    public final String f() {
        return this.f49653a;
    }

    public int hashCode() {
        return (this.f49653a.hashCode() * 31) + Integer.hashCode(this.f49654b);
    }

    @m80.k
    public String toString() {
        return "Grade(title=" + this.f49653a + ", grade=" + this.f49654b + pn.j.f81007d;
    }
}
