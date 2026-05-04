package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class p3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f65526a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f65527b;

    /* renamed from: c, reason: collision with root package name */
    public final int f65528c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f65529d;

    public p3(long j11, @m80.k String name, int i11, @m80.k String cover) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(cover, "cover");
        this.f65526a = j11;
        this.f65527b = name;
        this.f65528c = i11;
        this.f65529d = cover;
    }

    public static /* synthetic */ p3 f(p3 p3Var, long j11, String str, int i11, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = p3Var.f65526a;
        }
        long j12 = j11;
        if ((i12 & 2) != 0) {
            str = p3Var.f65527b;
        }
        String str3 = str;
        if ((i12 & 4) != 0) {
            i11 = p3Var.f65528c;
        }
        int i13 = i11;
        if ((i12 & 8) != 0) {
            str2 = p3Var.f65529d;
        }
        return p3Var.e(j12, str3, i13, str2);
    }

    public final long a() {
        return this.f65526a;
    }

    @m80.k
    public final String b() {
        return this.f65527b;
    }

    public final int c() {
        return this.f65528c;
    }

    @m80.k
    public final String d() {
        return this.f65529d;
    }

    @m80.k
    public final p3 e(long j11, @m80.k String name, int i11, @m80.k String cover) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(cover, "cover");
        return new p3(j11, name, i11, cover);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3)) {
            return false;
        }
        p3 p3Var = (p3) obj;
        return this.f65526a == p3Var.f65526a && kotlin.jvm.internal.g0.g(this.f65527b, p3Var.f65527b) && this.f65528c == p3Var.f65528c && kotlin.jvm.internal.g0.g(this.f65529d, p3Var.f65529d);
    }

    @m80.k
    public final String g() {
        return this.f65529d;
    }

    @m80.k
    public final String h() {
        return this.f65527b;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.f65526a) * 31) + this.f65527b.hashCode()) * 31) + Integer.hashCode(this.f65528c)) * 31) + this.f65529d.hashCode();
    }

    public final long i() {
        return this.f65526a;
    }

    public final int j() {
        return this.f65528c;
    }

    @m80.k
    public String toString() {
        return "UserBookNativeModel(userBookId=" + this.f65526a + ", name=" + this.f65527b + ", wordCount=" + this.f65528c + ", cover=" + this.f65529d + ')';
    }
}
