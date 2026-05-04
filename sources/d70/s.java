package d70;

import java.io.IOException;
import org.apache.commons.logging.Log;
import org.apache.http.HttpException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class s implements m70.i {

    /* renamed from: a, reason: collision with root package name */
    public final Log f47432a;

    /* renamed from: b, reason: collision with root package name */
    public final m70.i f47433b;

    public s(Log log, m70.i iVar) {
        this.f47432a = log;
        this.f47433b = iVar;
    }

    @Override // m70.i
    public void b(m70.h hVar, m70.a aVar) throws IOException, HttpException {
        if (this.f47432a.isDebugEnabled()) {
            this.f47432a.debug(hVar + " Input ready");
        }
        this.f47433b.b(hVar, aVar);
        if (this.f47432a.isDebugEnabled()) {
            this.f47432a.debug(hVar + " " + aVar);
        }
    }

    @Override // m70.i
    public void d(m70.h hVar, m70.c cVar) throws IOException, HttpException {
        if (this.f47432a.isDebugEnabled()) {
            this.f47432a.debug(hVar + " Output ready");
        }
        this.f47433b.d(hVar, cVar);
        if (this.f47432a.isDebugEnabled()) {
            this.f47432a.debug(hVar + " " + cVar);
        }
    }

    @Override // m70.i
    public void e(m70.h hVar) throws HttpException, IOException {
        if (this.f47432a.isDebugEnabled()) {
            this.f47432a.debug(hVar + " Response received");
        }
        this.f47433b.e(hVar);
    }

    @Override // m70.i
    public void h(m70.h hVar, Object obj) throws IOException, HttpException {
        if (this.f47432a.isDebugEnabled()) {
            this.f47432a.debug(hVar + ": Connected");
        }
        this.f47433b.h(hVar, obj);
    }

    @Override // m70.i
    public void i(m70.h hVar) throws IOException, HttpException {
        if (this.f47432a.isDebugEnabled()) {
            this.f47432a.debug(hVar + " Request ready");
        }
        this.f47433b.i(hVar);
    }

    @Override // m70.i
    public void k(m70.h hVar) {
        if (this.f47432a.isDebugEnabled()) {
            this.f47432a.debug(hVar + ": Disconnected");
        }
        this.f47433b.k(hVar);
    }

    @Override // m70.i
    public void m(m70.h hVar) throws HttpException, IOException {
        if (this.f47432a.isDebugEnabled()) {
            this.f47432a.debug(hVar + " Timeout");
        }
        this.f47433b.m(hVar);
    }

    @Override // m70.i
    public void n(m70.h hVar) throws IOException {
        if (this.f47432a.isDebugEnabled()) {
            this.f47432a.debug(hVar + " End of input");
        }
        this.f47433b.n(hVar);
    }

    @Override // m70.i
    public void o(m70.h hVar, Exception exc) {
        if (this.f47432a.isDebugEnabled()) {
            this.f47432a.debug(hVar + " Exception", exc);
        }
        this.f47433b.o(hVar, exc);
    }
}
