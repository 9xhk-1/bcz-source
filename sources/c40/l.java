package c40;

import java.util.concurrent.Future;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class l implements m {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Future<?> f7884a;

    public l(@m80.k Future<?> future) {
        this.f7884a = future;
    }

    @Override // c40.m
    public void a(@m80.l Throwable th2) {
        this.f7884a.cancel(false);
    }

    @m80.k
    public String toString() {
        return "CancelFutureOnCancel[" + this.f7884a + l50.b.f69930l;
    }
}
