package si;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.g0;
import l3.i0;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final int f88701c = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final i0.n f88702a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<i0.w> f88703b;

    public a(@k i0.n mean, @k List<i0.w> sentences) {
        g0.p(mean, "mean");
        g0.p(sentences, "sentences");
        this.f88702a = mean;
        this.f88703b = sentences;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a d(a aVar, i0.n nVar, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            nVar = aVar.f88702a;
        }
        if ((i11 & 2) != 0) {
            list = aVar.f88703b;
        }
        return aVar.c(nVar, list);
    }

    @k
    public final i0.n a() {
        return this.f88702a;
    }

    @k
    public final List<i0.w> b() {
        return this.f88703b;
    }

    @k
    public final a c(@k i0.n mean, @k List<i0.w> sentences) {
        g0.p(mean, "mean");
        g0.p(sentences, "sentences");
        return new a(mean, sentences);
    }

    @k
    public final i0.n e() {
        return this.f88702a;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return g0.g(this.f88702a, aVar.f88702a) && g0.g(this.f88703b, aVar.f88703b);
    }

    @k
    public final List<i0.w> f() {
        return this.f88703b;
    }

    public int hashCode() {
        return (this.f88702a.hashCode() * 31) + this.f88703b.hashCode();
    }

    @k
    public String toString() {
        return "MeanWithSentences(mean=" + this.f88702a + ", sentences=" + this.f88703b + j.f81007d;
    }
}
