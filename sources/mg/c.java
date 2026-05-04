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
public final class c implements e {

    /* renamed from: b, reason: collision with root package name */
    public static final int f73253b = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<g> f73254a;

    public c(@k List<g> adList) {
        g0.p(adList, "adList");
        this.f73254a = adList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ c c(c cVar, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = cVar.f73254a;
        }
        return cVar.b(list);
    }

    @k
    public final List<g> a() {
        return this.f73254a;
    }

    @k
    public final c b(@k List<g> adList) {
        g0.p(adList, "adList");
        return new c(adList);
    }

    @k
    public final List<g> d() {
        return this.f73254a;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && g0.g(this.f73254a, ((c) obj).f73254a);
    }

    public int hashCode() {
        return this.f73254a.hashCode();
    }

    @k
    public String toString() {
        return "HomeGridAd(adList=" + this.f73254a + j.f81007d;
    }
}
