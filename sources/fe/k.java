package fe;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.main.activity.lookup.Candidate;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    public static final int f51828c = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<Candidate> f51829a;

    /* renamed from: b, reason: collision with root package name */
    public final float f51830b;

    public k(@m80.k List<Candidate> candidates, float f11) {
        g0.p(candidates, "candidates");
        this.f51829a = candidates;
        this.f51830b = f11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ k d(k kVar, List list, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = kVar.f51829a;
        }
        if ((i11 & 2) != 0) {
            f11 = kVar.f51830b;
        }
        return kVar.c(list, f11);
    }

    @m80.k
    public final List<Candidate> a() {
        return this.f51829a;
    }

    public final float b() {
        return this.f51830b;
    }

    @m80.k
    public final k c(@m80.k List<Candidate> candidates, float f11) {
        g0.p(candidates, "candidates");
        return new k(candidates, f11);
    }

    public final float e() {
        return this.f51830b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return g0.g(this.f51829a, kVar.f51829a) && Float.compare(this.f51830b, kVar.f51830b) == 0;
    }

    @m80.k
    public final List<Candidate> f() {
        return this.f51829a;
    }

    public int hashCode() {
        return (this.f51829a.hashCode() * 31) + Float.hashCode(this.f51830b);
    }

    @m80.k
    public String toString() {
        return "SearchConfig(candidates=" + this.f51829a + ", aspectRatio=" + this.f51830b + pn.j.f81007d;
    }

    public /* synthetic */ k(List list, float f11, int i11, v vVar) {
        this(list, (i11 & 2) != 0 ? 1.5f : f11);
    }
}
