package b70;

import java.io.IOException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import m70.s;
import m70.t;
import m70.u;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.params.HttpParams;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class f extends j implements t {

    /* renamed from: t, reason: collision with root package name */
    public final m70.n<HttpRequest> f6305t;

    /* renamed from: u, reason: collision with root package name */
    public final m70.p<HttpResponse> f6306u;

    @Deprecated
    public f(x70.f fVar, org.apache.http.p pVar, z70.b bVar, HttpParams httpParams) {
        super(fVar, bVar, httpParams);
        e80.a.j(pVar, "Request factory");
        this.f6305t = a0(this.f6319c, pVar, httpParams);
        this.f6306u = c0(this.f6320d, httpParams);
    }

    @Override // b70.j
    @Deprecated
    public w60.e H() {
        return new z60.a(new z60.d(0));
    }

    @Override // m70.r
    public void K() {
        this.f6334r = null;
        this.f6331o = null;
        this.f6306u.reset();
    }

    @Override // m70.t
    public void K1(u uVar) {
        h0(new k(uVar));
    }

    @Override // m70.r
    public void M() {
        this.f6333q = null;
        this.f6329m = null;
        this.f6305t.reset();
    }

    public void Z(s sVar) {
        int b11;
        try {
            if (this.f6335s != 0) {
                this.f6327k.f(1);
                return;
            }
            try {
                try {
                    if (this.f6333q == null) {
                        do {
                            b11 = this.f6305t.b(this.f6327k.g());
                            if (b11 > 0) {
                                this.f6323g.b(b11);
                            }
                            this.f6333q = this.f6305t.a();
                            if (b11 <= 0) {
                                break;
                            }
                        } while (this.f6333q == null);
                        if (this.f6333q != null) {
                            if (this.f6333q instanceof org.apache.http.l) {
                                ((org.apache.http.l) this.f6333q).setEntity(S(this.f6333q));
                            }
                            this.f6325i.f();
                            this.f6330n = this.f6319c.a();
                            d0(this.f6333q);
                            sVar.g(this);
                            if (this.f6329m == null) {
                                M();
                            }
                        }
                        if (b11 == -1 && !this.f6319c.a()) {
                            sVar.p(this);
                        }
                    }
                    if (this.f6329m != null && (this.f6327k.d() & 1) > 0) {
                        sVar.j(this, this.f6329m);
                        if (this.f6329m.e()) {
                            M();
                        }
                    }
                    this.f6330n = this.f6319c.a();
                } catch (Exception e11) {
                    sVar.o(this, e11);
                    this.f6330n = this.f6319c.a();
                }
            } catch (HttpException e12) {
                sVar.o(this, e12);
                this.f6330n = this.f6319c.a();
            }
        } catch (Throwable th2) {
            this.f6330n = this.f6319c.a();
            throw th2;
        }
    }

    @Deprecated
    public m70.n<HttpRequest> a0(x70.j jVar, org.apache.http.p pVar, HttpParams httpParams) {
        return new e70.g(jVar, (l70.q) null, pVar, a80.h.b(httpParams));
    }

    @Deprecated
    public m70.p<HttpResponse> c0(x70.k kVar, HttpParams httpParams) {
        return new e70.m(kVar, null);
    }

    public void h0(s sVar) {
        int i11;
        try {
            try {
                if (this.f6335s == 0) {
                    if (this.f6331o == null && !this.f6320d.a()) {
                        sVar.a(this);
                    }
                    if (this.f6331o != null) {
                        sVar.f(this, this.f6331o);
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
                sVar.o(this, e11);
            }
            this.f6332p = this.f6320d.a();
        } catch (Throwable th2) {
            this.f6332p = this.f6320d.a();
            throw th2;
        }
    }

    @Override // m70.r
    public void t(HttpResponse httpResponse) throws IOException, HttpException {
        e80.a.j(httpResponse, "HTTP response");
        r();
        if (this.f6334r != null) {
            throw new HttpException("Response already submitted");
        }
        f0(httpResponse);
        this.f6306u.a(httpResponse);
        this.f6332p = this.f6320d.a();
        if (httpResponse.n().getStatusCode() >= 200) {
            this.f6325i.g();
            if (httpResponse.getEntity() != null) {
                this.f6334r = httpResponse;
                U(httpResponse);
            }
        }
        this.f6327k.h(4);
    }

    @Override // m70.r
    public boolean t0() {
        return this.f6334r != null;
    }

    @Override // m70.t
    public void v6(u uVar) {
        Z(new k(uVar));
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public f(x70.f r11, int r12, int r13, z70.b r14, java.nio.charset.CharsetDecoder r15, java.nio.charset.CharsetEncoder r16, v60.c r17, w60.e r18, w60.e r19, m70.o<org.apache.http.HttpRequest> r20, m70.q<org.apache.http.HttpResponse> r21) {
        /*
            r10 = this;
            if (r18 == 0) goto L5
            r8 = r18
            goto L8
        L5:
            z60.a r0 = z60.a.f101034d
            r8 = r0
        L8:
            if (r19 == 0) goto L17
            r9 = r19
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            goto L24
        L17:
            z60.e r0 = z60.e.f101040d
            r9 = r0
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r0 = r10
        L24:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r20 == 0) goto L2c
            r1 = r20
            goto L2e
        L2c:
            e70.h r1 = e70.h.f49550c
        L2e:
            h70.v r2 = r10.f6319c
            r7 = r17
            m70.n r1 = r1.a(r2, r7)
            r10.f6305t = r1
            if (r21 == 0) goto L3d
            r1 = r21
            goto L3f
        L3d:
            e70.n r1 = e70.n.f49559b
        L3f:
            h70.w r2 = r10.f6320d
            m70.p r1 = r1.a(r2)
            r10.f6306u = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b70.f.<init>(x70.f, int, int, z70.b, java.nio.charset.CharsetDecoder, java.nio.charset.CharsetEncoder, v60.c, w60.e, w60.e, m70.o, m70.q):void");
    }

    public f(x70.f fVar, int i11, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, v60.c cVar) {
        this(fVar, i11, i11, null, charsetDecoder, charsetEncoder, cVar, null, null, null, null);
    }

    public f(x70.f fVar, int i11) {
        this(fVar, i11, i11, null, null, null, null, null, null, null, null);
    }

    public void d0(HttpRequest httpRequest) {
    }

    public void f0(HttpResponse httpResponse) {
    }
}
