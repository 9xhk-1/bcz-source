package rx.internal.util.unsafe;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@rx.internal.util.n
/* loaded from: classes9.dex */
public abstract class s<E> extends u<E> {

    /* renamed from: f1, reason: collision with root package name */
    public static final long f86885f1 = n0.a(s.class, "consumerIndex");
    private volatile long consumerIndex;

    public s(int i11) {
        super(i11);
    }

    public final boolean p(long j11, long j12) {
        return n0.f86883a.compareAndSwapLong(this, f86885f1, j11, j12);
    }

    public final long q() {
        return this.consumerIndex;
    }
}
