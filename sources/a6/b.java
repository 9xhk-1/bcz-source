package a6;

import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f1958a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1959b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1960c;

    public b(int i11, int i12, long j11) {
        this.f1958a = i11;
        this.f1959b = i12;
        this.f1960c = j11;
    }

    public static /* synthetic */ b e(b bVar, int i11, int i12, long j11, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = bVar.f1958a;
        }
        if ((i13 & 2) != 0) {
            i12 = bVar.f1959b;
        }
        if ((i13 & 4) != 0) {
            j11 = bVar.f1960c;
        }
        return bVar.d(i11, i12, j11);
    }

    public final int a() {
        return this.f1958a;
    }

    public final int b() {
        return this.f1959b;
    }

    public final long c() {
        return this.f1960c;
    }

    @k
    public final b d(int i11, int i12, long j11) {
        return new b(i11, i12, j11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1958a == bVar.f1958a && this.f1959b == bVar.f1959b && this.f1960c == bVar.f1960c;
    }

    public final long f() {
        return this.f1960c;
    }

    public final int g() {
        return this.f1959b;
    }

    public final int h() {
        return this.f1958a;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f1958a) * 31) + Integer.hashCode(this.f1959b)) * 31) + Long.hashCode(this.f1960c);
    }

    @k
    public String toString() {
        return "StudyRoundStats(totalRoundCount=" + this.f1958a + ", todayRoundCount=" + this.f1959b + ", lastUpdateTime=" + this.f1960c + ')';
    }
}
