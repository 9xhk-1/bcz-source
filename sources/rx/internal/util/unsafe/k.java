package rx.internal.util.unsafe;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@rx.internal.util.n
/* loaded from: classes9.dex */
public abstract class k<E> extends m<E> {

    /* renamed from: j1, reason: collision with root package name */
    public static final long f86860j1 = n0.a(k.class, "consumerIndex");
    private volatile long consumerIndex;

    public k(int i11) {
        super(i11);
    }

    public final boolean s(long j11, long j12) {
        return n0.f86883a.compareAndSwapLong(this, f86860j1, j11, j12);
    }

    public final long t() {
        return this.consumerIndex;
    }
}
