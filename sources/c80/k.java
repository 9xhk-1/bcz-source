package c80;

import java.util.LinkedList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public c<org.apache.http.q> f8351a;

    /* renamed from: b, reason: collision with root package name */
    public c<org.apache.http.s> f8352b;

    public static k n() {
        return new k();
    }

    public k a(org.apache.http.q qVar) {
        return k(qVar);
    }

    public k b(org.apache.http.s sVar) {
        return l(sVar);
    }

    public k c(org.apache.http.q... qVarArr) {
        return g(qVarArr);
    }

    public k d(org.apache.http.s... sVarArr) {
        return h(sVarArr);
    }

    public k e(org.apache.http.q... qVarArr) {
        if (qVarArr == null) {
            return this;
        }
        o().b(qVarArr);
        return this;
    }

    public k f(org.apache.http.s... sVarArr) {
        if (sVarArr == null) {
            return this;
        }
        p().b(sVarArr);
        return this;
    }

    public k g(org.apache.http.q... qVarArr) {
        if (qVarArr == null) {
            return this;
        }
        o().d(qVarArr);
        return this;
    }

    public k h(org.apache.http.s... sVarArr) {
        if (sVarArr == null) {
            return this;
        }
        p().d(sVarArr);
        return this;
    }

    public k i(org.apache.http.q qVar) {
        if (qVar == null) {
            return this;
        }
        o().e(qVar);
        return this;
    }

    public k j(org.apache.http.s sVar) {
        if (sVar == null) {
            return this;
        }
        p().e(sVar);
        return this;
    }

    public k k(org.apache.http.q qVar) {
        if (qVar == null) {
            return this;
        }
        o().f(qVar);
        return this;
    }

    public k l(org.apache.http.s sVar) {
        if (sVar == null) {
            return this;
        }
        p().f(sVar);
        return this;
    }

    public j m() {
        c<org.apache.http.q> cVar = this.f8351a;
        LinkedList<org.apache.http.q> g11 = cVar != null ? cVar.g() : null;
        c<org.apache.http.s> cVar2 = this.f8352b;
        return new t(g11, cVar2 != null ? cVar2.g() : null);
    }

    public final c<org.apache.http.q> o() {
        if (this.f8351a == null) {
            this.f8351a = new c<>();
        }
        return this.f8351a;
    }

    public final c<org.apache.http.s> p() {
        if (this.f8352b == null) {
            this.f8352b = new c<>();
        }
        return this.f8352b;
    }
}
