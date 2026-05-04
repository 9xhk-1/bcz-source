package c40;

import c40.p1;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class q1 extends o1 {
    @m80.k
    public abstract Thread s0();

    public void w0(long j11, @m80.k p1.c cVar) {
        v0.f7992g.h1(j11, cVar);
    }

    public final void x0() {
        Thread s02 = s0();
        if (Thread.currentThread() != s02) {
            b bVar = c.f7825a;
            if (bVar != null) {
                bVar.g(s02);
            } else {
                LockSupport.unpark(s02);
            }
        }
    }
}
