package c80;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public final class b implements j, q, r, Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final List<org.apache.http.q> f8297a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final List<org.apache.http.s> f8298b = new ArrayList();

    @Override // c80.q, c80.r
    public void a(List<?> list) {
        e80.a.j(list, "Inteceptor list");
        this.f8297a.clear();
        this.f8298b.clear();
        for (Object obj : list) {
            if (obj instanceof org.apache.http.q) {
                p((org.apache.http.q) obj);
            }
            if (obj instanceof org.apache.http.s) {
                s((org.apache.http.s) obj);
            }
        }
    }

    @Override // c80.r
    public void b(Class<? extends org.apache.http.s> cls) {
        Iterator<org.apache.http.s> it = this.f8298b.iterator();
        while (it.hasNext()) {
            if (it.next().getClass().equals(cls)) {
                it.remove();
            }
        }
    }

    @Override // c80.q
    public int c() {
        return this.f8297a.size();
    }

    public Object clone() throws CloneNotSupportedException {
        b bVar = (b) super.clone();
        w(bVar);
        return bVar;
    }

    @Override // c80.r
    public int d() {
        return this.f8298b.size();
    }

    @Override // c80.r
    public void e(org.apache.http.s sVar) {
        if (sVar == null) {
            return;
        }
        this.f8298b.add(sVar);
    }

    @Override // c80.q
    public void f(Class<? extends org.apache.http.q> cls) {
        Iterator<org.apache.http.q> it = this.f8297a.iterator();
        while (it.hasNext()) {
            if (it.next().getClass().equals(cls)) {
                it.remove();
            }
        }
    }

    @Override // org.apache.http.s
    public void g(HttpResponse httpResponse, HttpContext httpContext) throws IOException, HttpException {
        Iterator<org.apache.http.s> it = this.f8298b.iterator();
        while (it.hasNext()) {
            it.next().g(httpResponse, httpContext);
        }
    }

    @Override // c80.q
    public void h() {
        this.f8297a.clear();
    }

    @Override // c80.r
    public org.apache.http.s i(int i11) {
        if (i11 < 0 || i11 >= this.f8298b.size()) {
            return null;
        }
        return this.f8298b.get(i11);
    }

    @Override // c80.r
    public void j() {
        this.f8298b.clear();
    }

    @Override // c80.q
    public org.apache.http.q l(int i11) {
        if (i11 < 0 || i11 >= this.f8297a.size()) {
            return null;
        }
        return this.f8297a.get(i11);
    }

    @Override // c80.r
    public void m(org.apache.http.s sVar, int i11) {
        if (sVar == null) {
            return;
        }
        this.f8298b.add(i11, sVar);
    }

    @Override // c80.q
    public void n(org.apache.http.q qVar, int i11) {
        if (qVar == null) {
            return;
        }
        this.f8297a.add(i11, qVar);
    }

    @Override // c80.q
    public void o(org.apache.http.q qVar) {
        if (qVar == null) {
            return;
        }
        this.f8297a.add(qVar);
    }

    public void p(org.apache.http.q qVar) {
        o(qVar);
    }

    @Override // org.apache.http.q
    public void process(HttpRequest httpRequest, HttpContext httpContext) throws IOException, HttpException {
        Iterator<org.apache.http.q> it = this.f8297a.iterator();
        while (it.hasNext()) {
            it.next().process(httpRequest, httpContext);
        }
    }

    public void q(org.apache.http.q qVar, int i11) {
        n(qVar, i11);
    }

    public void s(org.apache.http.s sVar) {
        e(sVar);
    }

    public void t(org.apache.http.s sVar, int i11) {
        m(sVar, i11);
    }

    public void u() {
        h();
        j();
    }

    public b v() {
        b bVar = new b();
        w(bVar);
        return bVar;
    }

    public void w(b bVar) {
        bVar.f8297a.clear();
        bVar.f8297a.addAll(this.f8297a);
        bVar.f8298b.clear();
        bVar.f8298b.addAll(this.f8298b);
    }
}
