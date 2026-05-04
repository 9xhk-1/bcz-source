package f4;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class q2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f50799a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final byte[] f50800b;

    public q2(long j11, @m80.k byte[] roadMap) {
        kotlin.jvm.internal.g0.p(roadMap, "roadMap");
        this.f50799a = j11;
        this.f50800b = roadMap;
    }

    public static /* synthetic */ q2 d(q2 q2Var, long j11, byte[] bArr, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = q2Var.f50799a;
        }
        if ((i11 & 2) != 0) {
            bArr = q2Var.f50800b;
        }
        return q2Var.c(j11, bArr);
    }

    public final long a() {
        return this.f50799a;
    }

    @m80.k
    public final byte[] b() {
        return this.f50800b;
    }

    @m80.k
    public final q2 c(long j11, @m80.k byte[] roadMap) {
        kotlin.jvm.internal.g0.p(roadMap, "roadMap");
        return new q2(j11, roadMap);
    }

    public final long e() {
        return this.f50799a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj;
        return this.f50799a == q2Var.f50799a && kotlin.jvm.internal.g0.g(this.f50800b, q2Var.f50800b);
    }

    @m80.k
    public final byte[] f() {
        return this.f50800b;
    }

    public int hashCode() {
        return (Long.hashCode(this.f50799a) * 31) + Arrays.hashCode(this.f50800b);
    }

    @m80.k
    public String toString() {
        return "RoadMapInfo(bookId=" + this.f50799a + ", roadMap=" + Arrays.toString(this.f50800b) + ')';
    }
}
