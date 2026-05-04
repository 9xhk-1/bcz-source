package rx.internal.util.unsafe;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@rx.internal.util.n
/* loaded from: classes9.dex */
public abstract class y<E> extends w<E> {

    /* renamed from: w1, reason: collision with root package name */
    public volatile long f86909w1;

    public y(int i11) {
        super(i11);
    }

    public final long r() {
        return this.f86909w1;
    }

    public final void s(long j11) {
        this.f86909w1 = j11;
    }
}
