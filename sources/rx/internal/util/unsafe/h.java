package rx.internal.util.unsafe;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@rx.internal.util.n
/* loaded from: classes9.dex */
public abstract class h<E> extends f<E> {

    /* renamed from: x, reason: collision with root package name */
    public static final long f86834x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f86835y;

    /* renamed from: w, reason: collision with root package name */
    public final long[] f86836w;

    static {
        if (8 != n0.f86883a.arrayIndexScale(long[].class)) {
            throw new IllegalStateException("Unexpected long[] element size");
        }
        f86835y = f.f86812s + 3;
        f86834x = r0.arrayBaseOffset(long[].class) + (32 << (r3 - r2));
    }

    public h(int i11) {
        super(i11);
        int i12 = (int) (this.f86816q + 1);
        this.f86836w = new long[(i12 << f.f86812s) + 64];
        for (long j11 = 0; j11 < i12; j11++) {
            p(this.f86836w, n(j11), j11);
        }
    }

    public final long n(long j11) {
        return f86834x + ((j11 & this.f86816q) << f86835y);
    }

    public final long o(long[] jArr, long j11) {
        return n0.f86883a.getLongVolatile(jArr, j11);
    }

    public final void p(long[] jArr, long j11, long j12) {
        n0.f86883a.putOrderedLong(jArr, j11, j12);
    }
}
