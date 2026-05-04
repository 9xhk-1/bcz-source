package kj;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final int f66617e = 8;

    /* renamed from: a, reason: collision with root package name */
    public final long f66618a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Set<Long> f66619b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Map<Long, Long> f66620c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Map<Long, Integer> f66621d;

    public d(long j11, @k Set<Long> bookIds, @k Map<Long, Long> createdAts, @k Map<Long, Integer> scores) {
        g0.p(bookIds, "bookIds");
        g0.p(createdAts, "createdAts");
        g0.p(scores, "scores");
        this.f66618a = j11;
        this.f66619b = bookIds;
        this.f66620c = createdAts;
        this.f66621d = scores;
    }

    public static /* synthetic */ d f(d dVar, long j11, Set set, Map map, Map map2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = dVar.f66618a;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            set = dVar.f66619b;
        }
        Set set2 = set;
        if ((i11 & 4) != 0) {
            map = dVar.f66620c;
        }
        Map map3 = map;
        if ((i11 & 8) != 0) {
            map2 = dVar.f66621d;
        }
        return dVar.e(j12, set2, map3, map2);
    }

    public final long a() {
        return this.f66618a;
    }

    @k
    public final Set<Long> b() {
        return this.f66619b;
    }

    @k
    public final Map<Long, Long> c() {
        return this.f66620c;
    }

    @k
    public final Map<Long, Integer> d() {
        return this.f66621d;
    }

    @k
    public final d e(long j11, @k Set<Long> bookIds, @k Map<Long, Long> createdAts, @k Map<Long, Integer> scores) {
        g0.p(bookIds, "bookIds");
        g0.p(createdAts, "createdAts");
        g0.p(scores, "scores");
        return new d(j11, bookIds, createdAts, scores);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f66618a == dVar.f66618a && g0.g(this.f66619b, dVar.f66619b) && g0.g(this.f66620c, dVar.f66620c) && g0.g(this.f66621d, dVar.f66621d);
    }

    @k
    public final Set<Long> g() {
        return this.f66619b;
    }

    @k
    public final Map<Long, Long> h() {
        return this.f66620c;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.f66618a) * 31) + this.f66619b.hashCode()) * 31) + this.f66620c.hashCode()) * 31) + this.f66621d.hashCode();
    }

    @k
    public final Map<Long, Integer> i() {
        return this.f66621d;
    }

    public final long j() {
        return this.f66618a;
    }

    @k
    public String toString() {
        return "WordFavoriteItemBookRelevance(universeTopicId=" + this.f66618a + ", bookIds=" + this.f66619b + ", createdAts=" + this.f66620c + ", scores=" + this.f66621d + j.f81007d;
    }
}
