package x3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f97145a;

    /* renamed from: b, reason: collision with root package name */
    public final int f97146b;

    /* renamed from: c, reason: collision with root package name */
    public final int f97147c;

    /* renamed from: d, reason: collision with root package name */
    public final int f97148d;

    /* renamed from: e, reason: collision with root package name */
    public final int f97149e;

    public b(int i11, int i12, int i13, int i14, int i15) {
        this.f97145a = i11;
        this.f97146b = i12;
        this.f97147c = i13;
        this.f97148d = i14;
        this.f97149e = i15;
    }

    public static /* synthetic */ b g(b bVar, int i11, int i12, int i13, int i14, int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i11 = bVar.f97145a;
        }
        if ((i16 & 2) != 0) {
            i12 = bVar.f97146b;
        }
        if ((i16 & 4) != 0) {
            i13 = bVar.f97147c;
        }
        if ((i16 & 8) != 0) {
            i14 = bVar.f97148d;
        }
        if ((i16 & 16) != 0) {
            i15 = bVar.f97149e;
        }
        int i17 = i15;
        int i18 = i13;
        return bVar.f(i11, i12, i18, i14, i17);
    }

    public final int a() {
        return this.f97145a;
    }

    public final int b() {
        return this.f97146b;
    }

    public final int c() {
        return this.f97147c;
    }

    public final int d() {
        return this.f97148d;
    }

    public final int e() {
        return this.f97149e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f97145a == bVar.f97145a && this.f97146b == bVar.f97146b && this.f97147c == bVar.f97147c && this.f97148d == bVar.f97148d && this.f97149e == bVar.f97149e;
    }

    @m80.k
    public final b f(int i11, int i12, int i13, int i14, int i15) {
        return new b(i11, i12, i13, i14, i15);
    }

    public final int h() {
        return this.f97145a;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f97145a) * 31) + Integer.hashCode(this.f97146b)) * 31) + Integer.hashCode(this.f97147c)) * 31) + Integer.hashCode(this.f97148d)) * 31) + Integer.hashCode(this.f97149e);
    }

    public final int i() {
        return this.f97148d;
    }

    public final int j() {
        return this.f97147c;
    }

    public final int k() {
        return this.f97149e;
    }

    public final int l() {
        return this.f97146b;
    }

    @m80.k
    public String toString() {
        return "BasicSchedule(bookId=" + this.f97145a + ", reviewPlanCount=" + this.f97146b + ", learnPlanCount=" + this.f97147c + ", finishCount=" + this.f97148d + ", masteredCount=" + this.f97149e + ')';
    }
}
