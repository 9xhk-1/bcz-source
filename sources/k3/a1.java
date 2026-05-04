package k3;

import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f65203a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f65204b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final Map<String, String> f65205c;

    public a1(@m80.k String url, @m80.k String method, @m80.k Map<String, String> headers) {
        kotlin.jvm.internal.g0.p(url, "url");
        kotlin.jvm.internal.g0.p(method, "method");
        kotlin.jvm.internal.g0.p(headers, "headers");
        this.f65203a = url;
        this.f65204b = method;
        this.f65205c = headers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a1 e(a1 a1Var, String str, String str2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = a1Var.f65203a;
        }
        if ((i11 & 2) != 0) {
            str2 = a1Var.f65204b;
        }
        if ((i11 & 4) != 0) {
            map = a1Var.f65205c;
        }
        return a1Var.d(str, str2, map);
    }

    @m80.k
    public final String a() {
        return this.f65203a;
    }

    @m80.k
    public final String b() {
        return this.f65204b;
    }

    @m80.k
    public final Map<String, String> c() {
        return this.f65205c;
    }

    @m80.k
    public final a1 d(@m80.k String url, @m80.k String method, @m80.k Map<String, String> headers) {
        kotlin.jvm.internal.g0.p(url, "url");
        kotlin.jvm.internal.g0.p(method, "method");
        kotlin.jvm.internal.g0.p(headers, "headers");
        return new a1(url, method, headers);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return kotlin.jvm.internal.g0.g(this.f65203a, a1Var.f65203a) && kotlin.jvm.internal.g0.g(this.f65204b, a1Var.f65204b) && kotlin.jvm.internal.g0.g(this.f65205c, a1Var.f65205c);
    }

    @m80.k
    public final Map<String, String> f() {
        return this.f65205c;
    }

    @m80.k
    public final String g() {
        return this.f65204b;
    }

    @m80.k
    public final String h() {
        return this.f65203a;
    }

    public int hashCode() {
        return (((this.f65203a.hashCode() * 31) + this.f65204b.hashCode()) * 31) + this.f65205c.hashCode();
    }

    @m80.k
    public String toString() {
        return "H5EnhanceRequest(url=" + this.f65203a + ", method=" + this.f65204b + ", headers=" + this.f65205c + ')';
    }

    public /* synthetic */ a1(String str, String str2, Map map, int i11, kotlin.jvm.internal.v vVar) {
        this(str, str2, (i11 & 4) != 0 ? a00.l1.z() : map);
    }
}
