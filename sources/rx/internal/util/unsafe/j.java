package rx.internal.util.unsafe;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@rx.internal.util.n
/* loaded from: classes9.dex */
public class j<E> extends k<E> {

    /* renamed from: k1, reason: collision with root package name */
    public long f86845k1;

    /* renamed from: l1, reason: collision with root package name */
    public long f86846l1;

    /* renamed from: m1, reason: collision with root package name */
    public long f86847m1;

    /* renamed from: n1, reason: collision with root package name */
    public long f86848n1;

    /* renamed from: o1, reason: collision with root package name */
    public long f86849o1;

    /* renamed from: p1, reason: collision with root package name */
    public long f86850p1;

    /* renamed from: q1, reason: collision with root package name */
    public long f86851q1;

    /* renamed from: r1, reason: collision with root package name */
    public long f86852r1;

    /* renamed from: s1, reason: collision with root package name */
    public long f86853s1;

    /* renamed from: t1, reason: collision with root package name */
    public long f86854t1;

    /* renamed from: u1, reason: collision with root package name */
    public long f86855u1;

    /* renamed from: v1, reason: collision with root package name */
    public long f86856v1;

    /* renamed from: w1, reason: collision with root package name */
    public long f86857w1;

    /* renamed from: x1, reason: collision with root package name */
    public long f86858x1;

    /* renamed from: y1, reason: collision with root package name */
    public long f86859y1;

    public j(int i11) {
        super(Math.max(2, i11));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, rx.internal.util.unsafe.i
    public boolean isEmpty() {
        return t() == r();
    }

    @Override // java.util.Queue, rx.internal.util.unsafe.i
    public boolean offer(E e11) {
        long j11;
        long[] jArr;
        j<E> jVar = this;
        if (e11 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        long j12 = 1;
        long j13 = jVar.f86816q + 1;
        long[] jArr2 = jVar.f86836w;
        long j14 = Long.MAX_VALUE;
        while (true) {
            long r11 = jVar.r();
            long j15 = j13;
            long n11 = jVar.n(r11);
            long o11 = jVar.o(jArr2, n11) - r11;
            if (o11 == 0) {
                j11 = j12;
                long j16 = r11 + j11;
                if (jVar.q(r11, j16)) {
                    jVar.l(jVar.a(r11), e11);
                    jVar.p(jArr2, n11, j16);
                    return true;
                }
                jArr = jArr2;
            } else {
                j11 = j12;
                jArr = jArr2;
                if (o11 < 0) {
                    long j17 = r11 - j15;
                    if (j17 <= j14) {
                        long t11 = t();
                        if (j17 <= t11) {
                            return false;
                        }
                        j14 = t11;
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            jArr2 = jArr;
            j13 = j15;
            j12 = j11;
            jVar = this;
        }
    }

    @Override // java.util.Queue, rx.internal.util.unsafe.i
    public E peek() {
        long t11;
        E d11;
        do {
            t11 = t();
            d11 = d(a(t11));
            if (d11 != null) {
                break;
            }
        } while (t11 != r());
        return d11;
    }

    @Override // java.util.Queue, rx.internal.util.unsafe.i
    public E poll() {
        j<E> jVar = this;
        long[] jArr = jVar.f86836w;
        long j11 = -1;
        while (true) {
            long t11 = jVar.t();
            long j12 = j11;
            long n11 = jVar.n(t11);
            long j13 = t11 + 1;
            long o11 = jVar.o(jArr, n11) - j13;
            if (o11 == 0) {
                if (jVar.s(t11, j13)) {
                    long a11 = jVar.a(t11);
                    E d11 = jVar.d(a11);
                    jVar.l(a11, null);
                    jVar.p(jArr, n11, t11 + jVar.f86816q + 1);
                    return d11;
                }
            } else if (o11 < 0 && t11 >= j12) {
                j11 = r();
                if (t11 == j11) {
                    return null;
                }
                jVar = this;
            }
            j11 = j12;
            jVar = this;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, rx.internal.util.unsafe.i
    public int size() {
        long t11 = t();
        while (true) {
            long r11 = r();
            long t12 = t();
            if (t11 == t12) {
                return (int) (r11 - t12);
            }
            t11 = t12;
        }
    }
}
