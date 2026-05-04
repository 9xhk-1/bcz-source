package ku;

import com.typesafe.config.ConfigException;
import java.io.StringReader;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class u1 implements lu.a {

    /* renamed from: a, reason: collision with root package name */
    public c0 f68844a;

    /* renamed from: b, reason: collision with root package name */
    public ju.o f68845b;

    public u1(c0 c0Var, ju.o oVar) {
        this.f68844a = c0Var;
        this.f68845b = oVar;
    }

    @Override // lu.a
    public lu.a a(String str, String str2) {
        if (str2 != null) {
            x1 w11 = x1.w("single value parsing");
            StringReader stringReader = new StringReader(str2);
            b b11 = l.b(d2.d(w11, stringReader, this.f68845b.g()), w11, this.f68845b);
            stringReader.close();
            return new u1(this.f68844a.h(str, b11, this.f68845b.g()), this.f68845b);
        }
        throw new ConfigException.BugOrBroken("null value for " + str + " passed to withValueText");
    }

    @Override // lu.a
    public String b() {
        return this.f68844a.b();
    }

    public boolean equals(Object obj) {
        return (obj instanceof lu.a) && b().equals(((lu.a) obj).b());
    }

    @Override // lu.a
    public lu.a f(String str, ju.t tVar) {
        if (tVar != null) {
            return a(str, tVar.e0(ju.q.b().k(false)).trim());
        }
        throw new ConfigException.BugOrBroken("null value for " + str + " passed to withValue");
    }

    @Override // lu.a
    public lu.a h(String str) {
        return new u1(this.f68844a.h(str, null, this.f68845b.g()), this.f68845b);
    }

    public int hashCode() {
        return b().hashCode();
    }

    @Override // lu.a
    public boolean m(String str) {
        return this.f68844a.f(str);
    }
}
