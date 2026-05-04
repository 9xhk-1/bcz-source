package b70;

import java.io.IOException;
import m70.r;
import m70.s;
import m70.u;
import org.apache.http.HttpException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public class k implements s {

    /* renamed from: a, reason: collision with root package name */
    public final u f6336a;

    public k(u uVar) {
        this.f6336a = uVar;
    }

    @Override // m70.s
    public void a(r rVar) throws IOException, HttpException {
        this.f6336a.a(rVar);
    }

    @Override // m70.s
    public void c(r rVar) {
        this.f6336a.c(rVar);
    }

    @Override // m70.s
    public void f(r rVar, m70.c cVar) throws IOException, HttpException {
        this.f6336a.f(rVar, cVar);
    }

    @Override // m70.s
    public void g(r rVar) throws IOException, HttpException {
        this.f6336a.g(rVar);
    }

    @Override // m70.s
    public void j(r rVar, m70.a aVar) throws IOException, HttpException {
        this.f6336a.j(rVar, aVar);
    }

    @Override // m70.s
    public void l(r rVar) {
        this.f6336a.l(rVar);
    }

    @Override // m70.s
    public void n(r rVar) {
        this.f6336a.n(rVar);
    }

    @Override // m70.s
    public void o(r rVar, Exception exc) {
        if (exc instanceof HttpException) {
            this.f6336a.q(rVar, (HttpException) exc);
        } else if (exc instanceof IOException) {
            this.f6336a.r(rVar, (IOException) exc);
        } else {
            if (!(exc instanceof RuntimeException)) {
                throw new Error("Unexpected exception: ", exc);
            }
            throw ((RuntimeException) exc);
        }
    }

    @Override // m70.s
    public void p(r rVar) throws IOException {
        rVar.close();
    }
}
