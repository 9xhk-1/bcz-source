package x3;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f97140a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final byte[] f97141b;

    /* renamed from: c, reason: collision with root package name */
    public final long f97142c;

    public a(long j11, @m80.k byte[] payload, long j12) {
        kotlin.jvm.internal.g0.p(payload, "payload");
        this.f97140a = j11;
        this.f97141b = payload;
        this.f97142c = j12;
    }

    public static /* synthetic */ a e(a aVar, long j11, byte[] bArr, long j12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = aVar.f97140a;
        }
        long j13 = j11;
        if ((i11 & 2) != 0) {
            bArr = aVar.f97141b;
        }
        byte[] bArr2 = bArr;
        if ((i11 & 4) != 0) {
            j12 = aVar.f97142c;
        }
        return aVar.d(j13, bArr2, j12);
    }

    public final long a() {
        return this.f97140a;
    }

    @m80.k
    public final byte[] b() {
        return this.f97141b;
    }

    public final long c() {
        return this.f97142c;
    }

    @m80.k
    public final a d(long j11, @m80.k byte[] payload, long j12) {
        kotlin.jvm.internal.g0.p(payload, "payload");
        return new a(j11, payload, j12);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f97140a == aVar.f97140a && kotlin.jvm.internal.g0.g(this.f97141b, aVar.f97141b) && this.f97142c == aVar.f97142c;
    }

    public final long f() {
        return this.f97140a;
    }

    public final long g() {
        return this.f97142c;
    }

    @m80.k
    public final byte[] h() {
        return this.f97141b;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f97140a) * 31) + Arrays.hashCode(this.f97141b)) * 31) + Long.hashCode(this.f97142c);
    }

    @m80.k
    public String toString() {
        return "AllBooksRecord(id=" + this.f97140a + ", payload=" + Arrays.toString(this.f97141b) + ", localVersion=" + this.f97142c + ')';
    }
}
