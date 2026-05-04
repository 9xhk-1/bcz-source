package c40;

import java.util.concurrent.Future;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j1 implements k1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Future<?> f7876a;

    public j1(@m80.k Future<?> future) {
        this.f7876a = future;
    }

    @Override // c40.k1
    public void dispose() {
        this.f7876a.cancel(false);
    }

    @m80.k
    public String toString() {
        return "DisposableFutureHandle[" + this.f7876a + l50.b.f69930l;
    }
}
