package rf;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.dataset.provider.a;
import java.util.List;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: m, reason: collision with root package name */
    public static final int f84004m = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    @wo.c("queryId")
    private final String f84005a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    @wo.c("logicId")
    private final String f84006b;

    /* renamed from: c, reason: collision with root package name */
    @wo.c("time")
    private final long f84007c;

    /* renamed from: d, reason: collision with root package name */
    @wo.c("waitingTime")
    private final long f84008d;

    /* renamed from: e, reason: collision with root package name */
    @wo.c("duration")
    private final int f84009e;

    /* renamed from: f, reason: collision with root package name */
    @wo.c("nosilLen")
    private final int f84010f;

    /* renamed from: g, reason: collision with root package name */
    @wo.c(a.b.C0242a.f16107c)
    private final int f84011g;

    /* renamed from: h, reason: collision with root package name */
    @wo.c("fluency")
    private final int f84012h;

    /* renamed from: i, reason: collision with root package name */
    @wo.c("integrity")
    private final int f84013i;

    /* renamed from: j, reason: collision with root package name */
    @wo.c("precision")
    private final int f84014j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    @wo.c("transcript")
    private final String f84015k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    @wo.c(xd.a.f98002r)
    private final List<m> f84016l;

    public i(@m80.k String queryId, @m80.k String logicId, long j11, long j12, int i11, int i12, int i13, int i14, int i15, int i16, @m80.k String transcript, @m80.k List<m> words) {
        g0.p(queryId, "queryId");
        g0.p(logicId, "logicId");
        g0.p(transcript, "transcript");
        g0.p(words, "words");
        this.f84005a = queryId;
        this.f84006b = logicId;
        this.f84007c = j11;
        this.f84008d = j12;
        this.f84009e = i11;
        this.f84010f = i12;
        this.f84011g = i13;
        this.f84012h = i14;
        this.f84013i = i15;
        this.f84014j = i16;
        this.f84015k = transcript;
        this.f84016l = words;
    }

    @m80.k
    public final String a() {
        return this.f84005a;
    }

    public final int b() {
        return this.f84014j;
    }

    @m80.k
    public final String c() {
        return this.f84015k;
    }

    @m80.k
    public final List<m> d() {
        return this.f84016l;
    }

    @m80.k
    public final String e() {
        return this.f84006b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return g0.g(this.f84005a, iVar.f84005a) && g0.g(this.f84006b, iVar.f84006b) && this.f84007c == iVar.f84007c && this.f84008d == iVar.f84008d && this.f84009e == iVar.f84009e && this.f84010f == iVar.f84010f && this.f84011g == iVar.f84011g && this.f84012h == iVar.f84012h && this.f84013i == iVar.f84013i && this.f84014j == iVar.f84014j && g0.g(this.f84015k, iVar.f84015k) && g0.g(this.f84016l, iVar.f84016l);
    }

    public final long f() {
        return this.f84007c;
    }

    public final long g() {
        return this.f84008d;
    }

    public final int h() {
        return this.f84009e;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.f84005a.hashCode() * 31) + this.f84006b.hashCode()) * 31) + Long.hashCode(this.f84007c)) * 31) + Long.hashCode(this.f84008d)) * 31) + Integer.hashCode(this.f84009e)) * 31) + Integer.hashCode(this.f84010f)) * 31) + Integer.hashCode(this.f84011g)) * 31) + Integer.hashCode(this.f84012h)) * 31) + Integer.hashCode(this.f84013i)) * 31) + Integer.hashCode(this.f84014j)) * 31) + this.f84015k.hashCode()) * 31) + this.f84016l.hashCode();
    }

    public final int i() {
        return this.f84010f;
    }

    public final int j() {
        return this.f84011g;
    }

    public final int k() {
        return this.f84012h;
    }

    public final int l() {
        return this.f84013i;
    }

    @m80.k
    public final i m(@m80.k String queryId, @m80.k String logicId, long j11, long j12, int i11, int i12, int i13, int i14, int i15, int i16, @m80.k String transcript, @m80.k List<m> words) {
        g0.p(queryId, "queryId");
        g0.p(logicId, "logicId");
        g0.p(transcript, "transcript");
        g0.p(words, "words");
        return new i(queryId, logicId, j11, j12, i11, i12, i13, i14, i15, i16, transcript, words);
    }

    public final int o() {
        return this.f84009e;
    }

    public final int p() {
        return this.f84012h;
    }

    public final int q() {
        return this.f84013i;
    }

    @m80.k
    public final String r() {
        return this.f84006b;
    }

    public final int s() {
        return this.f84010f;
    }

    public final int t() {
        return this.f84014j;
    }

    @m80.k
    public String toString() {
        return "RecordScoreDataInfo(queryId=" + this.f84005a + ", logicId=" + this.f84006b + ", time=" + this.f84007c + ", waitingTime=" + this.f84008d + ", duration=" + this.f84009e + ", nosilLen=" + this.f84010f + ", score=" + this.f84011g + ", fluency=" + this.f84012h + ", integrity=" + this.f84013i + ", precision=" + this.f84014j + ", transcript=" + this.f84015k + ", words=" + this.f84016l + pn.j.f81007d;
    }

    @m80.k
    public final String u() {
        return this.f84005a;
    }

    public final int v() {
        return this.f84011g;
    }

    public final long w() {
        return this.f84007c;
    }

    @m80.k
    public final String x() {
        return this.f84015k;
    }

    public final long y() {
        return this.f84008d;
    }

    @m80.k
    public final List<m> z() {
        return this.f84016l;
    }
}
