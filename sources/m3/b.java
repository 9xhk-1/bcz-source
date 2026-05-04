package m3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public final String f71848a;

    public b(@m80.l String str) {
        this.f71848a = str;
    }

    public static /* synthetic */ b c(b bVar, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bVar.f71848a;
        }
        return bVar.b(str);
    }

    @m80.l
    public final String a() {
        return this.f71848a;
    }

    @m80.k
    public final b b(@m80.l String str) {
        return new b(str);
    }

    @m80.l
    public final String d() {
        return this.f71848a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && kotlin.jvm.internal.g0.g(this.f71848a, ((b) obj).f71848a);
    }

    public int hashCode() {
        String str = this.f71848a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @m80.k
    public String toString() {
        return "AdLunchAppVo(deeplink=" + this.f71848a + ')';
    }
}
