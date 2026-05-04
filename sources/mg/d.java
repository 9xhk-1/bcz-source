package mg;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class d implements e {

    /* renamed from: b, reason: collision with root package name */
    public static final int f73255b = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<g> f73256a;

    public d(@k List<g> ad2) {
        g0.p(ad2, "ad");
        this.f73256a = ad2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ d c(d dVar, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = dVar.f73256a;
        }
        return dVar.b(list);
    }

    @k
    public final List<g> a() {
        return this.f73256a;
    }

    @k
    public final d b(@k List<g> ad2) {
        g0.p(ad2, "ad");
        return new d(ad2);
    }

    @k
    public final List<g> d() {
        return this.f73256a;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && g0.g(this.f73256a, ((d) obj).f73256a);
    }

    public int hashCode() {
        return this.f73256a.hashCode();
    }

    @k
    public String toString() {
        return "HomeHorizontalAd(ad=" + this.f73256a + j.f81007d;
    }
}
