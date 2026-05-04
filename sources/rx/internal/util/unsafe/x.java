package rx.internal.util.unsafe;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@rx.internal.util.n
/* loaded from: classes9.dex */
public abstract class x<E> extends t<E> {
    public static final long L = n0.a(x.class, "producerIndex");
    private volatile long producerIndex;

    public x(int i11) {
        super(i11);
    }

    public final long n() {
        return this.producerIndex;
    }

    public final void o(long j11) {
        n0.f86883a.putOrderedLong(this, L, j11);
    }
}
