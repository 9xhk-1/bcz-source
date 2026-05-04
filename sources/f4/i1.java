package f4;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f50646a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final String f50647b;

    /* renamed from: c, reason: collision with root package name */
    public final long f50648c;

    public i1(@m80.k String key, @m80.l String str, long j11) {
        kotlin.jvm.internal.g0.p(key, "key");
        this.f50646a = key;
        this.f50647b = str;
        this.f50648c = j11;
    }

    public static /* synthetic */ i1 e(i1 i1Var, String str, String str2, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = i1Var.f50646a;
        }
        if ((i11 & 2) != 0) {
            str2 = i1Var.f50647b;
        }
        if ((i11 & 4) != 0) {
            j11 = i1Var.f50648c;
        }
        return i1Var.d(str, str2, j11);
    }

    @m80.k
    public final String a() {
        return this.f50646a;
    }

    @m80.l
    public final String b() {
        return this.f50647b;
    }

    public final long c() {
        return this.f50648c;
    }

    @m80.k
    public final i1 d(@m80.k String key, @m80.l String str, long j11) {
        kotlin.jvm.internal.g0.p(key, "key");
        return new i1(key, str, j11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return kotlin.jvm.internal.g0.g(this.f50646a, i1Var.f50646a) && kotlin.jvm.internal.g0.g(this.f50647b, i1Var.f50647b) && this.f50648c == i1Var.f50648c;
    }

    @m80.k
    public final String f() {
        return this.f50646a;
    }

    public final long g() {
        return this.f50648c;
    }

    @m80.l
    public final String h() {
        return this.f50647b;
    }

    public int hashCode() {
        int hashCode = this.f50646a.hashCode() * 31;
        String str = this.f50647b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.f50648c);
    }

    @m80.k
    public String toString() {
        return "GameSetting(key=" + this.f50646a + ", settingValue=" + this.f50647b + ", lastModifyTime=" + this.f50648c + ')';
    }
}
