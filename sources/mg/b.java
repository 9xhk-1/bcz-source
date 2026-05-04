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
public final class b implements e {

    /* renamed from: b, reason: collision with root package name */
    public static final int f73251b = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<g> f73252a;

    public b(@k List<g> adList) {
        g0.p(adList, "adList");
        this.f73252a = adList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b c(b bVar, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = bVar.f73252a;
        }
        return bVar.b(list);
    }

    @k
    public final List<g> a() {
        return this.f73252a;
    }

    @k
    public final b b(@k List<g> adList) {
        g0.p(adList, "adList");
        return new b(adList);
    }

    @k
    public final List<g> d() {
        return this.f73252a;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && g0.g(this.f73252a, ((b) obj).f73252a);
    }

    public int hashCode() {
        return this.f73252a.hashCode();
    }

    @k
    public String toString() {
        return "HomeCarousalAd(adList=" + this.f73252a + j.f81007d;
    }
}
