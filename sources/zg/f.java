package zg;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: g, reason: collision with root package name */
    public static final int f102653g = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f102654a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f102655b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f102656c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f102657d;

    /* renamed from: e, reason: collision with root package name */
    public final long f102658e;

    /* renamed from: f, reason: collision with root package name */
    public final long f102659f;

    public f(@k String aid, @l String str, @l String str2, @l String str3, long j11, long j12) {
        g0.p(aid, "aid");
        this.f102654a = aid;
        this.f102655b = str;
        this.f102656c = str2;
        this.f102657d = str3;
        this.f102658e = j11;
        this.f102659f = j12;
    }

    public static /* synthetic */ f h(f fVar, String str, String str2, String str3, String str4, long j11, long j12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fVar.f102654a;
        }
        if ((i11 & 2) != 0) {
            str2 = fVar.f102655b;
        }
        if ((i11 & 4) != 0) {
            str3 = fVar.f102656c;
        }
        if ((i11 & 8) != 0) {
            str4 = fVar.f102657d;
        }
        if ((i11 & 16) != 0) {
            j11 = fVar.f102658e;
        }
        if ((i11 & 32) != 0) {
            j12 = fVar.f102659f;
        }
        long j13 = j12;
        long j14 = j11;
        return fVar.g(str, str2, str3, str4, j14, j13);
    }

    @k
    public final String a() {
        return this.f102654a;
    }

    @l
    public final String b() {
        return this.f102655b;
    }

    @l
    public final String c() {
        return this.f102656c;
    }

    @l
    public final String d() {
        return this.f102657d;
    }

    public final long e() {
        return this.f102658e;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return g0.g(this.f102654a, fVar.f102654a) && g0.g(this.f102655b, fVar.f102655b) && g0.g(this.f102656c, fVar.f102656c) && g0.g(this.f102657d, fVar.f102657d) && this.f102658e == fVar.f102658e && this.f102659f == fVar.f102659f;
    }

    public final long f() {
        return this.f102659f;
    }

    @k
    public final f g(@k String aid, @l String str, @l String str2, @l String str3, long j11, long j12) {
        g0.p(aid, "aid");
        return new f(aid, str, str2, str3, j11, j12);
    }

    public int hashCode() {
        int hashCode = this.f102654a.hashCode() * 31;
        String str = this.f102655b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f102656c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f102657d;
        return ((((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + Long.hashCode(this.f102658e)) * 31) + Long.hashCode(this.f102659f);
    }

    @k
    public final String i() {
        return this.f102654a;
    }

    @l
    public final String j() {
        return this.f102657d;
    }

    public final long k() {
        return this.f102659f;
    }

    @l
    public final String l() {
        return this.f102655b;
    }

    @l
    public final String m() {
        return this.f102656c;
    }

    public final long n() {
        return this.f102658e;
    }

    public final boolean o() {
        long j11 = this.f102658e;
        long j12 = this.f102659f;
        long currentTimeMillis = System.currentTimeMillis();
        return j11 <= currentTimeMillis && currentTimeMillis <= j12;
    }

    @k
    public String toString() {
        return "TabItem(aid=" + this.f102654a + ", iconNormal=" + this.f102655b + ", iconPressed=" + this.f102656c + ", displayTitle=" + this.f102657d + ", startMs=" + this.f102658e + ", endMs=" + this.f102659f + j.f81007d;
    }

    public /* synthetic */ f(String str, String str2, String str3, String str4, long j11, long j12, int i11, v vVar) {
        this(str, str2, str3, str4, (i11 & 16) != 0 ? 0L : j11, (i11 & 32) != 0 ? 0L : j12);
    }
}
