package c40;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j2 extends q2 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7877f = AtomicIntegerFieldUpdater.newUpdater(j2.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final x00.l<Throwable, yz.g2> f7878e;

    /* JADX WARN: Multi-variable type inference failed */
    public j2(@m80.k x00.l<? super Throwable, yz.g2> lVar) {
        this.f7878e = lVar;
    }

    @Override // c40.q2
    public boolean C() {
        return true;
    }

    @Override // c40.q2
    public void D(@m80.l Throwable th2) {
        if (f7877f.compareAndSet(this, 0, 1)) {
            this.f7878e.invoke(th2);
        }
    }

    public final /* synthetic */ int F() {
        return this._invoked$volatile;
    }

    public final /* synthetic */ void H(int i11) {
        this._invoked$volatile = i11;
    }
}
