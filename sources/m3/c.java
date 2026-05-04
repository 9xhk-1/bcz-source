package m3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public final String f71871a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final String f71872b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final Integer f71873c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final String f71874d;

    public c(@m80.l String str, @m80.l String str2, @m80.l Integer num, @m80.l String str3) {
        this.f71871a = str;
        this.f71872b = str2;
        this.f71873c = num;
        this.f71874d = str3;
    }

    public static /* synthetic */ c f(c cVar, String str, String str2, Integer num, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cVar.f71871a;
        }
        if ((i11 & 2) != 0) {
            str2 = cVar.f71872b;
        }
        if ((i11 & 4) != 0) {
            num = cVar.f71873c;
        }
        if ((i11 & 8) != 0) {
            str3 = cVar.f71874d;
        }
        return cVar.e(str, str2, num, str3);
    }

    @m80.l
    public final String a() {
        return this.f71871a;
    }

    @m80.l
    public final String b() {
        return this.f71872b;
    }

    @m80.l
    public final Integer c() {
        return this.f71873c;
    }

    @m80.l
    public final String d() {
        return this.f71874d;
    }

    @m80.k
    public final c e(@m80.l String str, @m80.l String str2, @m80.l Integer num, @m80.l String str3) {
        return new c(str, str2, num, str3);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.g0.g(this.f71871a, cVar.f71871a) && kotlin.jvm.internal.g0.g(this.f71872b, cVar.f71872b) && kotlin.jvm.internal.g0.g(this.f71873c, cVar.f71873c) && kotlin.jvm.internal.g0.g(this.f71874d, cVar.f71874d);
    }

    @m80.l
    public final String g() {
        return this.f71874d;
    }

    @m80.l
    public final String h() {
        return this.f71871a;
    }

    public int hashCode() {
        String str = this.f71871a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f71872b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f71873c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f71874d;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @m80.l
    public final String i() {
        return this.f71872b;
    }

    @m80.l
    public final Integer j() {
        return this.f71873c;
    }

    @m80.k
    public String toString() {
        return "AdLunchWechatProgramVo(programId=" + this.f71871a + ", programPath=" + this.f71872b + ", programType=" + this.f71873c + ", bindApp=" + this.f71874d + ')';
    }
}
