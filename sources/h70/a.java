package h70;

import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class a<T> implements x70.c {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // x70.c
    public void a(x70.f fVar) {
        Object attribute = fVar.getAttribute("http.connection");
        try {
            g(attribute);
            y70.e eVar = (y70.e) fVar.getAttribute(y70.e.f99492o);
            if (eVar == null) {
                l(attribute);
                return;
            }
            try {
                if (!eVar.D()) {
                    eVar.y();
                }
                if (eVar.B()) {
                    l(attribute);
                }
                eVar.F();
            } catch (IOException e11) {
                j(attribute, e11);
                eVar.shutdown();
            }
        } catch (RuntimeException e12) {
            fVar.shutdown();
            throw e12;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x70.c
    public void b(x70.f fVar) {
        Object attribute = fVar.getAttribute("http.connection");
        if (attribute == null) {
            try {
                attribute = f(fVar);
                fVar.b("http.connection", attribute);
            } catch (RuntimeException e11) {
                fVar.shutdown();
                throw e11;
            }
        }
        i(attribute);
        y70.e eVar = (y70.e) fVar.getAttribute(y70.e.f99492o);
        if (eVar != null) {
            try {
                synchronized (eVar) {
                    try {
                        if (!eVar.D()) {
                            eVar.y();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (IOException e12) {
                j(attribute, e12);
                eVar.shutdown();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x70.c
    public void c(x70.f fVar) {
        Object attribute = fVar.getAttribute("http.connection");
        try {
            y70.e eVar = (y70.e) fVar.getAttribute(y70.e.f99492o);
            g(attribute);
            m(attribute);
            if (eVar != null) {
                synchronized (eVar) {
                    try {
                        if (eVar.E() && !eVar.C()) {
                            eVar.shutdown();
                        }
                    } finally {
                    }
                }
            }
        } catch (RuntimeException e11) {
            fVar.shutdown();
            throw e11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x70.c
    public void d(x70.f fVar) {
        Object attribute = fVar.getAttribute("http.connection");
        if (attribute != null) {
            h(attribute);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x70.c
    public void e(x70.f fVar) {
        Object attribute = fVar.getAttribute("http.connection");
        try {
            g(attribute);
            y70.e eVar = (y70.e) fVar.getAttribute(y70.e.f99492o);
            if (eVar == null) {
                k(attribute);
                return;
            }
            try {
                if (!eVar.D()) {
                    eVar.y();
                }
                if (eVar.A()) {
                    k(attribute);
                }
                eVar.w();
            } catch (IOException e11) {
                j(attribute, e11);
                eVar.shutdown();
            }
        } catch (RuntimeException e12) {
            fVar.shutdown();
            throw e12;
        }
    }

    public abstract T f(x70.f fVar);

    public final void g(T t11) {
        e80.b.f(t11, "HTTP connection");
    }

    public abstract void h(T t11);

    public abstract void i(T t11);

    public abstract void j(T t11, IOException iOException);

    public abstract void k(T t11);

    public abstract void l(T t11);

    public abstract void m(T t11);
}
