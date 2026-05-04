package w2;

import a3.l0;
import com.badlogic.gdx.Net;
import java.io.InputStream;
import java.util.Map;
import ku.r0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    public static String f94621b = "";

    /* renamed from: c, reason: collision with root package name */
    public static int f94622c = 1000;

    /* renamed from: d, reason: collision with root package name */
    public static com.badlogic.gdx.utils.f f94623d = new com.badlogic.gdx.utils.f();

    /* renamed from: a, reason: collision with root package name */
    public Net.b f94624a;

    public b a(String str, String str2) {
        n();
        Net.b bVar = this.f94624a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Basic ");
        sb2.append(a3.c.v(str + ":" + str2));
        bVar.m("Authorization", sb2.toString());
        return this;
    }

    public Net.b b() {
        n();
        Net.b bVar = this.f94624a;
        this.f94624a = null;
        return bVar;
    }

    public b c(InputStream inputStream, long j11) {
        n();
        this.f94624a.j(inputStream, j11);
        return this;
    }

    public b d(String str) {
        n();
        this.f94624a.k(str);
        return this;
    }

    public b e(boolean z11) {
        n();
        this.f94624a.l(z11);
        return this;
    }

    public b f(Map<String, String> map) {
        n();
        this.f94624a.m("Content-Type", "application/x-www-form-urlencoded");
        this.f94624a.k(a.a(map));
        return this;
    }

    public b g(String str, String str2) {
        n();
        this.f94624a.m(str, str2);
        return this;
    }

    public b h(boolean z11) {
        n();
        this.f94624a.n(z11);
        return this;
    }

    public b i(Object obj) {
        n();
        this.f94624a.m("Content-Type", r0.f68791f);
        this.f94624a.k(f94623d.f0(obj));
        return this;
    }

    public b j(String str) {
        n();
        this.f94624a.o(str);
        return this;
    }

    public b k() {
        if (this.f94624a != null) {
            throw new IllegalStateException("A new request has already been started. Call HttpRequestBuilder.build() first.");
        }
        Net.b bVar = (Net.b) l0.f(Net.b.class);
        this.f94624a = bVar;
        bVar.p(f94622c);
        return this;
    }

    public b l(int i11) {
        n();
        this.f94624a.p(i11);
        return this;
    }

    public b m(String str) {
        n();
        this.f94624a.q(f94621b + str);
        return this;
    }

    public final void n() {
        if (this.f94624a == null) {
            throw new IllegalStateException("A new request has not been started yet. Call HttpRequestBuilder.newRequest() first.");
        }
    }
}
