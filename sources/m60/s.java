package m60;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final okio.f f72467a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f72468b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f72469c;

    /* renamed from: d, reason: collision with root package name */
    public final long f72470d;

    /* renamed from: e, reason: collision with root package name */
    public final long f72471e;

    /* renamed from: f, reason: collision with root package name */
    public final long f72472f;

    /* renamed from: g, reason: collision with root package name */
    public final int f72473g;

    /* renamed from: h, reason: collision with root package name */
    public final long f72474h;

    /* renamed from: i, reason: collision with root package name */
    public final int f72475i;

    /* renamed from: j, reason: collision with root package name */
    public final int f72476j;

    /* renamed from: k, reason: collision with root package name */
    @m80.l
    public final Long f72477k;

    /* renamed from: l, reason: collision with root package name */
    @m80.l
    public final Long f72478l;

    /* renamed from: m, reason: collision with root package name */
    @m80.l
    public final Long f72479m;

    /* renamed from: n, reason: collision with root package name */
    @m80.l
    public final Integer f72480n;

    /* renamed from: o, reason: collision with root package name */
    @m80.l
    public final Integer f72481o;

    /* renamed from: p, reason: collision with root package name */
    @m80.l
    public final Integer f72482p;

    /* renamed from: q, reason: collision with root package name */
    @m80.k
    public final List<okio.f> f72483q;

    public s(@m80.k okio.f canonicalPath, boolean z11, @m80.k String comment, long j11, long j12, long j13, int i11, long j14, int i12, int i13, @m80.l Long l11, @m80.l Long l12, @m80.l Long l13, @m80.l Integer num, @m80.l Integer num2, @m80.l Integer num3) {
        g0.p(canonicalPath, "canonicalPath");
        g0.p(comment, "comment");
        this.f72467a = canonicalPath;
        this.f72468b = z11;
        this.f72469c = comment;
        this.f72470d = j11;
        this.f72471e = j12;
        this.f72472f = j13;
        this.f72473g = i11;
        this.f72474h = j14;
        this.f72475i = i12;
        this.f72476j = i13;
        this.f72477k = l11;
        this.f72478l = l12;
        this.f72479m = l13;
        this.f72480n = num;
        this.f72481o = num2;
        this.f72482p = num3;
        this.f72483q = new ArrayList();
    }

    @m80.k
    public final s a(@m80.l Integer num, @m80.l Integer num2, @m80.l Integer num3) {
        return new s(this.f72467a, this.f72468b, this.f72469c, this.f72470d, this.f72471e, this.f72472f, this.f72473g, this.f72474h, this.f72475i, this.f72476j, this.f72477k, this.f72478l, this.f72479m, num, num2, num3);
    }

    @m80.k
    public final okio.f b() {
        return this.f72467a;
    }

    @m80.k
    public final List<okio.f> c() {
        return this.f72483q;
    }

    @m80.k
    public final String d() {
        return this.f72469c;
    }

    public final long e() {
        return this.f72471e;
    }

    public final int f() {
        return this.f72473g;
    }

    public final long g() {
        return this.f72470d;
    }

    @m80.l
    public final Long h() {
        Long l11 = this.f72479m;
        if (l11 != null) {
            return Long.valueOf(x.g(l11.longValue()));
        }
        if (this.f72482p != null) {
            return Long.valueOf(r0.intValue() * 1000);
        }
        return null;
    }

    public final int i() {
        return this.f72475i;
    }

    public final int j() {
        return this.f72476j;
    }

    @m80.l
    public final Integer k() {
        return this.f72482p;
    }

    @m80.l
    public final Integer l() {
        return this.f72481o;
    }

    @m80.l
    public final Integer m() {
        return this.f72480n;
    }

    @m80.l
    public final Long n() {
        Long l11 = this.f72478l;
        if (l11 != null) {
            return Long.valueOf(x.g(l11.longValue()));
        }
        if (this.f72481o != null) {
            return Long.valueOf(r0.intValue() * 1000);
        }
        return null;
    }

    @m80.l
    public final Long o() {
        Long l11 = this.f72477k;
        if (l11 != null) {
            return Long.valueOf(x.g(l11.longValue()));
        }
        if (this.f72480n != null) {
            return Long.valueOf(r0.intValue() * 1000);
        }
        int i11 = this.f72476j;
        if (i11 != -1) {
            return x.f(this.f72475i, i11);
        }
        return null;
    }

    @m80.l
    public final Long p() {
        return this.f72479m;
    }

    @m80.l
    public final Long q() {
        return this.f72478l;
    }

    @m80.l
    public final Long r() {
        return this.f72477k;
    }

    public final long s() {
        return this.f72474h;
    }

    public final long t() {
        return this.f72472f;
    }

    public final boolean u() {
        return this.f72468b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ s(okio.f r18, boolean r19, java.lang.String r20, long r21, long r23, long r25, int r27, long r28, int r30, int r31, java.lang.Long r32, java.lang.Long r33, java.lang.Long r34, java.lang.Integer r35, java.lang.Integer r36, java.lang.Integer r37, int r38, kotlin.jvm.internal.v r39) {
        /*
            Method dump skipped, instructions count: 177
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m60.s.<init>(okio.f, boolean, java.lang.String, long, long, long, int, long, int, int, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Integer, java.lang.Integer, java.lang.Integer, int, kotlin.jvm.internal.v):void");
    }
}
