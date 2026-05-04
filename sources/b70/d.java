package b70;

import java.io.IOException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.params.HttpParams;
import org.apache.http.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class d extends j implements m70.k {

    /* renamed from: t, reason: collision with root package name */
    public final m70.n<HttpResponse> f6296t;

    /* renamed from: u, reason: collision with root package name */
    public final m70.p<HttpRequest> f6297u;

    @Deprecated
    public d(x70.f fVar, r rVar, z70.b bVar, HttpParams httpParams) {
        super(fVar, bVar, httpParams);
        e80.a.j(rVar, "Response factory");
        this.f6296t = c0(this.f6319c, rVar, httpParams);
        this.f6297u = a0(this.f6320d, httpParams);
        this.f6330n = false;
        this.f6332p = false;
        this.f6327k.e(this);
    }

    @Override // m70.h
    public void G5(HttpRequest httpRequest) throws IOException, HttpException {
        e80.a.j(httpRequest, "HTTP request");
        r();
        if (this.f6333q != null) {
            throw new HttpException("Request already submitted");
        }
        d0(httpRequest);
        this.f6297u.a(httpRequest);
        this.f6332p = this.f6320d.a();
        if ((httpRequest instanceof org.apache.http.l) && ((org.apache.http.l) httpRequest).getEntity() != null) {
            U(httpRequest);
            this.f6333q = httpRequest;
        }
        this.f6325i.f();
        this.f6327k.h(4);
    }

    @Override // m70.h
    public void K() {
        this.f6333q = null;
        this.f6331o = null;
        this.f6297u.reset();
    }

    @Override // m70.h
    public void M() {
        this.f6334r = null;
        this.f6329m = null;
        this.f6296t.reset();
    }

    @Override // m70.k
    public void M6(m70.j jVar) {
        h0(new i(jVar));
    }

    @Override // m70.h
    public boolean Q() {
        return this.f6333q != null;
    }

    @Override // m70.k
    public void X7(m70.j jVar) {
        Z(new i(jVar));
    }

    public void Z(m70.i iVar) {
        int b11;
        try {
            if (this.f6335s != 0) {
                this.f6327k.f(1);
                return;
            }
            try {
                try {
                    if (this.f6334r == null) {
                        do {
                            b11 = this.f6296t.b(this.f6327k.g());
                            if (b11 > 0) {
                                this.f6323g.b(b11);
                            }
                            this.f6334r = this.f6296t.a();
                            if (b11 <= 0) {
                                break;
                            }
                        } while (this.f6334r == null);
                        if (this.f6334r != null) {
                            if (this.f6334r.n().getStatusCode() >= 200) {
                                this.f6334r.setEntity(S(this.f6334r));
                                this.f6325i.g();
                            }
                            this.f6330n = this.f6319c.a();
                            f0(this.f6334r);
                            iVar.e(this);
                            if (this.f6329m == null) {
                                M();
                            }
                        }
                        if (b11 == -1 && !this.f6319c.a()) {
                            iVar.n(this);
                        }
                    }
                    if (this.f6329m != null && (this.f6327k.d() & 1) > 0) {
                        iVar.b(this, this.f6329m);
                        if (this.f6329m.e()) {
                            M();
                        }
                    }
                    this.f6330n = this.f6319c.a();
                } catch (Exception e11) {
                    iVar.o(this, e11);
                    this.f6330n = this.f6319c.a();
                }
            } catch (HttpException e12) {
                M();
                iVar.o(this, e12);
                this.f6330n = this.f6319c.a();
            }
        } catch (Throwable th2) {
            this.f6330n = this.f6319c.a();
            throw th2;
        }
    }

    @Deprecated
    public m70.p<HttpRequest> a0(x70.k kVar, HttpParams httpParams) {
        return new e70.i(kVar, null);
    }

    @Deprecated
    public m70.n<HttpResponse> c0(x70.j jVar, r rVar, HttpParams httpParams) {
        return new e70.k(jVar, (l70.q) null, rVar, a80.h.b(httpParams));
    }

    public void h0(m70.i iVar) {
        int i11;
        try {
            try {
                if (this.f6335s == 0) {
                    if (this.f6331o == null && !this.f6320d.a()) {
                        iVar.i(this);
                    }
                    if (this.f6331o != null) {
                        iVar.d(this, this.f6331o);
                        if (this.f6331o.e()) {
                            K();
                        }
                    }
                }
                if (this.f6320d.a() && (i11 = this.f6320d.i(this.f6327k.g())) > 0) {
                    this.f6324h.b(i11);
                }
                if (!this.f6320d.a() && this.f6335s == 1) {
                    this.f6327k.close();
                    this.f6335s = 2;
                    K();
                }
            } catch (Exception e11) {
                iVar.o(this, e11);
            }
            this.f6332p = this.f6320d.a();
        } catch (Throwable th2) {
            this.f6332p = this.f6320d.a();
            throw th2;
        }
    }

    public d(x70.f fVar, int i11, int i12, z70.b bVar, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, v60.c cVar, w60.e eVar, w60.e eVar2, m70.q<HttpRequest> qVar, m70.o<HttpResponse> oVar) {
        super(fVar, i11, i12, bVar, charsetDecoder, charsetEncoder, cVar, eVar, eVar2);
        this.f6297u = (qVar == null ? e70.j.f49553b : qVar).a(this.f6320d);
        this.f6296t = (oVar == null ? e70.l.f49556c : oVar).a(this.f6319c, cVar);
    }

    public d(x70.f fVar, int i11, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, v60.c cVar) {
        this(fVar, i11, i11, null, charsetDecoder, charsetEncoder, cVar, null, null, null, null);
    }

    public d(x70.f fVar, int i11) {
        this(fVar, i11, i11, null, null, null, null, null, null, null, null);
    }

    public void d0(HttpRequest httpRequest) {
    }

    public void f0(HttpResponse httpResponse) {
    }
}
