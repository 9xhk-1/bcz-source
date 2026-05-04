package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public final class u9<T> {

    /* renamed from: a, reason: collision with root package name */
    public final int f34015a;

    /* renamed from: b, reason: collision with root package name */
    public final Comparator<? super T> f34016b;

    /* renamed from: c, reason: collision with root package name */
    public final T[] f34017c;

    /* renamed from: d, reason: collision with root package name */
    public int f34018d;

    /* renamed from: e, reason: collision with root package name */
    @CheckForNull
    public T f34019e;

    public u9(Comparator<? super T> comparator, int i11) {
        this.f34016b = (Comparator) Preconditions.checkNotNull(comparator, "comparator");
        this.f34015a = i11;
        Preconditions.checkArgument(i11 >= 0, "k (%s) must be >= 0", i11);
        Preconditions.checkArgument(i11 <= 1073741823, "k (%s) must be <= Integer.MAX_VALUE / 2", i11);
        this.f34017c = (T[]) new Object[com.google.common.math.f.d(i11, 2)];
        this.f34018d = 0;
        this.f34019e = null;
    }

    public static <T extends Comparable<? super T>> u9<T> b(int k11) {
        return c(k11, s7.z());
    }

    public static <T> u9<T> c(int k11, Comparator<? super T> comparator) {
        return new u9<>(s7.i(comparator).F(), k11);
    }

    public static <T extends Comparable<? super T>> u9<T> d(int k11) {
        return e(k11, s7.z());
    }

    public static <T> u9<T> e(int k11, Comparator<? super T> comparator) {
        return new u9<>(comparator, k11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u9<T> a(u9<T> other) {
        for (int i11 = 0; i11 < other.f34018d; i11++) {
            f(m7.a(other.f34017c[i11]));
        }
        return this;
    }

    public void f(@t7 T t11) {
        int i11 = this.f34015a;
        if (i11 == 0) {
            return;
        }
        int i12 = this.f34018d;
        if (i12 == 0) {
            this.f34017c[0] = t11;
            this.f34019e = t11;
            this.f34018d = 1;
            return;
        }
        if (i12 < i11) {
            T[] tArr = this.f34017c;
            this.f34018d = i12 + 1;
            tArr[i12] = t11;
            if (this.f34016b.compare(t11, (Object) m7.a(this.f34019e)) > 0) {
                this.f34019e = t11;
                return;
            }
            return;
        }
        if (this.f34016b.compare(t11, (Object) m7.a(this.f34019e)) < 0) {
            T[] tArr2 = this.f34017c;
            int i13 = this.f34018d;
            int i14 = i13 + 1;
            this.f34018d = i14;
            tArr2[i13] = t11;
            if (i14 == this.f34015a * 2) {
                l();
            }
        }
    }

    public void g(Iterable<? extends T> elements) {
        h(elements.iterator());
    }

    public void h(Iterator<? extends T> elements) {
        while (elements.hasNext()) {
            f(elements.next());
        }
    }

    public final int i(int i11, int i12, int i13) {
        Object a11 = m7.a(this.f34017c[i13]);
        T[] tArr = this.f34017c;
        tArr[i13] = tArr[i12];
        int i14 = i11;
        while (i11 < i12) {
            if (this.f34016b.compare((Object) m7.a(this.f34017c[i11]), a11) < 0) {
                j(i14, i11);
                i14++;
            }
            i11++;
        }
        T[] tArr2 = this.f34017c;
        tArr2[i12] = tArr2[i14];
        tArr2[i14] = a11;
        return i14;
    }

    public final void j(int i11, int j11) {
        T[] tArr = this.f34017c;
        T t11 = tArr[i11];
        tArr[i11] = tArr[j11];
        tArr[j11] = t11;
    }

    public List<T> k() {
        T[] tArr = this.f34017c;
        Arrays.sort(tArr, 0, this.f34018d, this.f34016b);
        int i11 = this.f34018d;
        int i12 = this.f34015a;
        if (i11 > i12) {
            T[] tArr2 = this.f34017c;
            Arrays.fill(tArr2, i12, tArr2.length, (Object) null);
            int i13 = this.f34015a;
            this.f34018d = i13;
            this.f34019e = this.f34017c[i13 - 1];
        }
        return Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(tArr, this.f34018d)));
    }

    public final void l() {
        int i11 = (this.f34015a * 2) - 1;
        int p11 = com.google.common.math.f.p(i11, RoundingMode.CEILING) * 3;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            int i15 = i(i12, i11, ((i12 + i11) + 1) >>> 1);
            int i16 = this.f34015a;
            if (i15 <= i16) {
                if (i15 >= i16) {
                    break;
                }
                i12 = Math.max(i15, i12 + 1);
                i14 = i15;
            } else {
                i11 = i15 - 1;
            }
            i13++;
            if (i13 >= p11) {
                Arrays.sort(this.f34017c, i12, i11 + 1, this.f34016b);
                break;
            }
        }
        this.f34018d = this.f34015a;
        this.f34019e = (T) m7.a(this.f34017c[i14]);
        while (true) {
            i14++;
            if (i14 >= this.f34015a) {
                return;
            }
            if (this.f34016b.compare((Object) m7.a(this.f34017c[i14]), (Object) m7.a(this.f34019e)) > 0) {
                this.f34019e = this.f34017c[i14];
            }
        }
    }
}
