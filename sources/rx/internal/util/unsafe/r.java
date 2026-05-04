package rx.internal.util.unsafe;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@rx.internal.util.n
/* loaded from: classes9.dex */
public final class r<E> extends v<E> {
    public r(int i11) {
        super(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, rx.internal.util.unsafe.i
    public boolean isEmpty() {
        return q() == n();
    }

    @Override // java.util.Queue, rx.internal.util.unsafe.i
    public boolean offer(E e11) {
        if (e11 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        E[] eArr = this.f86817r;
        long j11 = this.f86816q;
        long n11 = n();
        long a11 = a(n11);
        if (h(eArr, a11) != null) {
            if (n11 - q() > j11) {
                return false;
            }
            while (h(eArr, a11) != null) {
            }
        }
        m(eArr, a11, e11);
        o(n11 + 1);
        return true;
    }

    @Override // java.util.Queue, rx.internal.util.unsafe.i
    public E peek() {
        E g11;
        long r11 = r();
        do {
            long q11 = q();
            if (q11 >= r11) {
                long n11 = n();
                if (q11 >= n11) {
                    return null;
                }
                s(n11);
            }
            g11 = g(a(q11));
        } while (g11 == null);
        return g11;
    }

    @Override // java.util.Queue, rx.internal.util.unsafe.i
    public E poll() {
        long q11;
        long r11 = r();
        do {
            q11 = q();
            if (q11 >= r11) {
                long n11 = n();
                if (q11 >= n11) {
                    return null;
                }
                s(n11);
            }
        } while (!p(q11, 1 + q11));
        long a11 = a(q11);
        E[] eArr = this.f86817r;
        E f11 = f(eArr, a11);
        k(eArr, a11, null);
        return f11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, rx.internal.util.unsafe.i
    public int size() {
        long q11 = q();
        while (true) {
            long n11 = n();
            long q12 = q();
            if (q11 == q12) {
                return (int) (n11 - q12);
            }
            q11 = q12;
        }
    }
}
