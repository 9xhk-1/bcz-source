package rx.internal.schedulers;

import rx.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class l implements wb0.a {

    /* renamed from: a, reason: collision with root package name */
    public final wb0.a f86626a;

    /* renamed from: b, reason: collision with root package name */
    public final d.a f86627b;

    /* renamed from: c, reason: collision with root package name */
    public final long f86628c;

    public l(wb0.a aVar, d.a aVar2, long j11) {
        this.f86626a = aVar;
        this.f86627b = aVar2;
        this.f86628c = j11;
    }

    @Override // wb0.a
    public void call() {
        if (this.f86627b.isUnsubscribed()) {
            return;
        }
        long b11 = this.f86628c - this.f86627b.b();
        if (b11 > 0) {
            try {
                Thread.sleep(b11);
            } catch (InterruptedException e11) {
                Thread.currentThread().interrupt();
                vb0.a.c(e11);
            }
        }
        if (this.f86627b.isUnsubscribed()) {
            return;
        }
        this.f86626a.call();
    }
}
