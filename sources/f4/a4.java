package f4;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a4 {

    /* renamed from: a, reason: collision with root package name */
    public final long f50491a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f50492b;

    /* renamed from: c, reason: collision with root package name */
    public final long f50493c;

    public a4(long j11, @m80.k String wordPack, long j12) {
        kotlin.jvm.internal.g0.p(wordPack, "wordPack");
        this.f50491a = j11;
        this.f50492b = wordPack;
        this.f50493c = j12;
    }

    public static /* synthetic */ a4 e(a4 a4Var, long j11, String str, long j12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = a4Var.f50491a;
        }
        long j13 = j11;
        if ((i11 & 2) != 0) {
            str = a4Var.f50492b;
        }
        String str2 = str;
        if ((i11 & 4) != 0) {
            j12 = a4Var.f50493c;
        }
        return a4Var.d(j13, str2, j12);
    }

    public final long a() {
        return this.f50491a;
    }

    @m80.k
    public final String b() {
        return this.f50492b;
    }

    public final long c() {
        return this.f50493c;
    }

    @m80.k
    public final a4 d(long j11, @m80.k String wordPack, long j12) {
        kotlin.jvm.internal.g0.p(wordPack, "wordPack");
        return new a4(j11, wordPack, j12);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4)) {
            return false;
        }
        a4 a4Var = (a4) obj;
        return this.f50491a == a4Var.f50491a && kotlin.jvm.internal.g0.g(this.f50492b, a4Var.f50492b) && this.f50493c == a4Var.f50493c;
    }

    public final long f() {
        return this.f50491a;
    }

    public final long g() {
        return this.f50493c;
    }

    @m80.k
    public final String h() {
        return this.f50492b;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f50491a) * 31) + this.f50492b.hashCode()) * 31) + Long.hashCode(this.f50493c);
    }

    @m80.k
    public String toString() {
        return "TopicWordPackRecord(topicId=" + this.f50491a + ", wordPack=" + this.f50492b + ", updatedAt=" + this.f50493c + ')';
    }
}
