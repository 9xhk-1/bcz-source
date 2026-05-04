package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f65239a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f65240b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final String f65241c;

    public c(int i11, @m80.k String url, @m80.l String str) {
        kotlin.jvm.internal.g0.p(url, "url");
        this.f65239a = i11;
        this.f65240b = url;
        this.f65241c = str;
    }

    public static /* synthetic */ c e(c cVar, int i11, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = cVar.f65239a;
        }
        if ((i12 & 2) != 0) {
            str = cVar.f65240b;
        }
        if ((i12 & 4) != 0) {
            str2 = cVar.f65241c;
        }
        return cVar.d(i11, str, str2);
    }

    public final int a() {
        return this.f65239a;
    }

    @m80.k
    public final String b() {
        return this.f65240b;
    }

    @m80.l
    public final String c() {
        return this.f65241c;
    }

    @m80.k
    public final c d(int i11, @m80.k String url, @m80.l String str) {
        kotlin.jvm.internal.g0.p(url, "url");
        return new c(i11, url, str);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f65239a == cVar.f65239a && kotlin.jvm.internal.g0.g(this.f65240b, cVar.f65240b) && kotlin.jvm.internal.g0.g(this.f65241c, cVar.f65241c);
    }

    @m80.l
    public final String f() {
        return this.f65241c;
    }

    @m80.k
    public final String g() {
        return this.f65240b;
    }

    public final boolean h() {
        return this.f65239a == 3;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f65239a) * 31) + this.f65240b.hashCode()) * 31;
        String str = this.f65241c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean i() {
        return this.f65239a == 1;
    }

    public final boolean j() {
        return this.f65239a == 2;
    }

    @m80.k
    public String toString() {
        return "Action(action=" + this.f65239a + ", url=" + this.f65240b + ", text=" + this.f65241c + ')';
    }
}
