package id;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class q {

    /* renamed from: e, reason: collision with root package name */
    public static final int f60517e = 8;

    /* renamed from: a, reason: collision with root package name */
    public final long f60518a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final p f60519b;

    /* renamed from: c, reason: collision with root package name */
    public final long f60520c;

    /* renamed from: d, reason: collision with root package name */
    public final int f60521d;

    public q(long j11, @m80.k p option, long j12, int i11) {
        g0.p(option, "option");
        this.f60518a = j11;
        this.f60519b = option;
        this.f60520c = j12;
        this.f60521d = i11;
    }

    public static /* synthetic */ q f(q qVar, long j11, p pVar, long j12, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = qVar.f60518a;
        }
        long j13 = j11;
        if ((i12 & 2) != 0) {
            pVar = qVar.f60519b;
        }
        p pVar2 = pVar;
        if ((i12 & 4) != 0) {
            j12 = qVar.f60520c;
        }
        long j14 = j12;
        if ((i12 & 8) != 0) {
            i11 = qVar.f60521d;
        }
        return qVar.e(j13, pVar2, j14, i11);
    }

    public final long a() {
        return this.f60518a;
    }

    @m80.k
    public final p b() {
        return this.f60519b;
    }

    public final long c() {
        return this.f60520c;
    }

    public final int d() {
        return this.f60521d;
    }

    @m80.k
    public final q e(long j11, @m80.k p option, long j12, int i11) {
        g0.p(option, "option");
        return new q(j11, option, j12, i11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f60518a == qVar.f60518a && g0.g(this.f60519b, qVar.f60519b) && this.f60520c == qVar.f60520c && this.f60521d == qVar.f60521d;
    }

    public final long g() {
        return this.f60520c;
    }

    public final long h() {
        return this.f60518a;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.f60518a) * 31) + this.f60519b.hashCode()) * 31) + Long.hashCode(this.f60520c)) * 31) + Integer.hashCode(this.f60521d);
    }

    @m80.k
    public final p i() {
        return this.f60519b;
    }

    public final int j() {
        return this.f60521d;
    }

    @m80.k
    public String toString() {
        return "AIImproveClassQuestion(id=" + this.f60518a + ", option=" + this.f60519b + ", cid=" + this.f60520c + ", qIndex=" + this.f60521d + pn.j.f81007d;
    }
}
