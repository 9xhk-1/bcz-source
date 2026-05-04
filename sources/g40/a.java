package g40;

import c40.q2;
import java.util.concurrent.Future;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a extends q2 {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Future<?> f52694e;

    public a(@k Future<?> future) {
        this.f52694e = future;
    }

    @Override // c40.q2
    public boolean C() {
        return false;
    }

    @Override // c40.q2
    public void D(@l Throwable th2) {
        if (th2 == null || this.f52694e.isDone()) {
            return;
        }
        this.f52694e.cancel(false);
    }
}
