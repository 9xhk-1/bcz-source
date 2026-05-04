package b70;

import java.io.IOException;
import org.apache.http.HttpException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public class i implements m70.i {

    /* renamed from: a, reason: collision with root package name */
    public final m70.j f6316a;

    public i(m70.j jVar) {
        this.f6316a = jVar;
    }

    @Override // m70.i
    public void b(m70.h hVar, m70.a aVar) throws IOException, HttpException {
        this.f6316a.b(hVar, aVar);
    }

    @Override // m70.i
    public void d(m70.h hVar, m70.c cVar) throws IOException, HttpException {
        this.f6316a.d(hVar, cVar);
    }

    @Override // m70.i
    public void e(m70.h hVar) throws IOException, HttpException {
        this.f6316a.e(hVar);
    }

    @Override // m70.i
    public void h(m70.h hVar, Object obj) {
        this.f6316a.h(hVar, obj);
    }

    @Override // m70.i
    public void i(m70.h hVar) throws IOException, HttpException {
        this.f6316a.i(hVar);
    }

    @Override // m70.i
    public void k(m70.h hVar) {
        this.f6316a.k(hVar);
    }

    @Override // m70.i
    public void m(m70.h hVar) {
        this.f6316a.m(hVar);
    }

    @Override // m70.i
    public void n(m70.h hVar) throws IOException {
        hVar.close();
    }

    @Override // m70.i
    public void o(m70.h hVar, Exception exc) {
        if (exc instanceof HttpException) {
            this.f6316a.o(hVar, (HttpException) exc);
        } else if (exc instanceof IOException) {
            this.f6316a.p(hVar, (IOException) exc);
        } else {
            if (!(exc instanceof RuntimeException)) {
                throw new Error("Unexpected exception: ", exc);
            }
            throw ((RuntimeException) exc);
        }
    }
}
