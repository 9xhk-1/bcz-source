package d70;

import java.io.IOException;
import java.nio.channels.CancelledKeyException;
import org.apache.commons.logging.Log;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class q extends h70.a<b70.d> {

    /* renamed from: b, reason: collision with root package name */
    public final Log f47429b;

    /* renamed from: c, reason: collision with root package name */
    public final m70.i f47430c;

    public q(m70.i iVar) {
        Log q11 = org.apache.commons.logging.g.q(q.class);
        this.f47429b = q11;
        if (q11.isDebugEnabled()) {
            this.f47430c = new s(q11, iVar);
        } else {
            this.f47430c = iVar;
        }
    }

    @Override // h70.a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public b70.d f(x70.f fVar) {
        this.f47429b.debug("Unexpected invocation of #createConnection");
        fVar.close();
        throw new CancelledKeyException();
    }

    @Override // h70.a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void h(b70.d dVar) {
        this.f47430c.k(dVar);
    }

    @Override // h70.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void i(b70.d dVar) {
        try {
            this.f47430c.h(dVar, dVar.getContext().getAttribute(x70.f.f97672c1));
        } catch (Exception e11) {
            this.f47430c.o(dVar, e11);
        }
    }

    @Override // h70.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void j(b70.d dVar, IOException iOException) {
        this.f47430c.o(dVar, iOException);
    }

    @Override // h70.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void k(b70.d dVar) {
        dVar.Z(this.f47430c);
    }

    @Override // h70.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void l(b70.d dVar) {
        dVar.h0(this.f47430c);
    }

    @Override // h70.a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void m(b70.d dVar) {
        try {
            this.f47430c.m(dVar);
        } catch (Exception e11) {
            this.f47430c.o(dVar, e11);
        }
    }
}
