package rx.internal.util.unsafe;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@rx.internal.util.n
/* loaded from: classes9.dex */
public abstract class n<E> extends l<E> {
    public static final long O = n0.a(n.class, "producerIndex");
    private volatile long producerIndex;

    public n(int i11) {
        super(i11);
    }

    public final boolean q(long j11, long j12) {
        return n0.f86883a.compareAndSwapLong(this, O, j11, j12);
    }

    public final long r() {
        return this.producerIndex;
    }
}
