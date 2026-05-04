package h70;

import java.io.InterruptedIOException;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.SelectionKey;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.apache.http.nio.reactor.IOReactorException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class d extends b {

    /* renamed from: j, reason: collision with root package name */
    public final long f58746j;

    /* renamed from: k, reason: collision with root package name */
    public final Set<x70.f> f58747k;

    /* renamed from: l, reason: collision with root package name */
    public long f58748l;

    /* renamed from: m, reason: collision with root package name */
    public x70.e f58749m;

    /* renamed from: n, reason: collision with root package name */
    public x70.c f58750n;

    public d(long j11) throws IOReactorException {
        this(j11, false);
    }

    @Override // h70.b
    public void C(SelectionKey selectionKey) {
        x70.f s11 = s(selectionKey);
        for (int i11 = 0; i11 < 5; i11++) {
            try {
                this.f58750n.e(s11);
                if (!s11.a() || (s11.d() & 1) == 0) {
                    break;
                }
            } catch (CancelledKeyException e11) {
                throw e11;
            } catch (RuntimeException e12) {
                J(e12);
                return;
            }
        }
        if (s11.a()) {
            this.f58747k.add(s11);
        }
    }

    @Override // h70.b
    public void D(x70.f fVar) {
        try {
            this.f58750n.d(fVar);
        } catch (CancelledKeyException unused) {
        } catch (RuntimeException e11) {
            J(e11);
        }
    }

    @Override // h70.b
    public void E(SelectionKey selectionKey, x70.f fVar) {
        try {
            this.f58750n.b(fVar);
        } catch (CancelledKeyException e11) {
            throw e11;
        } catch (RuntimeException e12) {
            J(e12);
        }
    }

    @Override // h70.b
    public void F(x70.f fVar) {
        try {
            this.f58750n.c(fVar);
        } catch (CancelledKeyException e11) {
            throw e11;
        } catch (RuntimeException e12) {
            J(e12);
        }
    }

    @Override // h70.b
    public void H(Set<SelectionKey> set) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f58748l >= this.f58746j) {
            this.f58748l = currentTimeMillis;
            if (set != null) {
                Iterator<SelectionKey> it = set.iterator();
                while (it.hasNext()) {
                    G(it.next(), currentTimeMillis);
                }
            }
        }
        if (this.f58747k.isEmpty()) {
            return;
        }
        Iterator<x70.f> it2 = this.f58747k.iterator();
        while (it2.hasNext()) {
            x70.f next = it2.next();
            if (next.a()) {
                try {
                    if ((next.d() & 1) > 0) {
                        this.f58750n.e(next);
                        if (!next.a()) {
                            it2.remove();
                        }
                    }
                } catch (CancelledKeyException unused) {
                    it2.remove();
                    next.close();
                } catch (RuntimeException e11) {
                    J(e11);
                }
            } else {
                it2.remove();
            }
        }
    }

    @Override // h70.b
    public void I(SelectionKey selectionKey) {
        try {
            this.f58750n.a(s(selectionKey));
        } catch (CancelledKeyException e11) {
            throw e11;
        } catch (RuntimeException e12) {
            J(e12);
        }
    }

    public void J(RuntimeException runtimeException) {
        x70.e eVar = this.f58749m;
        if (eVar == null) {
            throw runtimeException;
        }
        if (!eVar.a(runtimeException)) {
            throw runtimeException;
        }
    }

    public void K(x70.e eVar) {
        this.f58749m = eVar;
    }

    @Override // x70.d
    public void b(x70.c cVar) throws InterruptedIOException, IOReactorException {
        e80.a.j(cVar, "Event dispatcher");
        this.f58750n = cVar;
        q();
    }

    public d(long j11, boolean z11) throws IOReactorException {
        super(j11, z11);
        this.f58749m = null;
        this.f58750n = null;
        this.f58747k = new HashSet();
        this.f58746j = j11;
        this.f58748l = System.currentTimeMillis();
    }

    @Override // h70.b
    public void e(SelectionKey selectionKey) {
    }

    @Override // h70.b
    public void o(SelectionKey selectionKey) {
    }
}
