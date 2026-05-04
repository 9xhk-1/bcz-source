package h5;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f58325a;

    /* renamed from: b, reason: collision with root package name */
    public final int f58326b;

    /* renamed from: c, reason: collision with root package name */
    public final int f58327c;

    public c(int i11, int i12, int i13) {
        this.f58325a = i11;
        this.f58326b = i12;
        this.f58327c = i13;
    }

    public static /* synthetic */ c e(c cVar, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = cVar.f58325a;
        }
        if ((i14 & 2) != 0) {
            i12 = cVar.f58326b;
        }
        if ((i14 & 4) != 0) {
            i13 = cVar.f58327c;
        }
        return cVar.d(i11, i12, i13);
    }

    public final int a() {
        return this.f58325a;
    }

    public final int b() {
        return this.f58326b;
    }

    public final int c() {
        return this.f58327c;
    }

    @m80.k
    public final c d(int i11, int i12, int i13) {
        return new c(i11, i12, i13);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f58325a == cVar.f58325a && this.f58326b == cVar.f58326b && this.f58327c == cVar.f58327c;
    }

    public final int f() {
        return this.f58327c;
    }

    public final int g() {
        return this.f58325a;
    }

    public final int h() {
        return this.f58326b;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f58325a) * 31) + Integer.hashCode(this.f58326b)) * 31) + Integer.hashCode(this.f58327c);
    }

    @m80.k
    public String toString() {
        return "AdjustedDailyProgress(currentProgress=" + this.f58325a + ", originalTarget=" + this.f58326b + ", adjustedTarget=" + this.f58327c + ')';
    }
}
