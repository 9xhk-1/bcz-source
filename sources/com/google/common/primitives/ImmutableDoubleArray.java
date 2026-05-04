package com.google.common.primitives;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;
import okhttp3.i;
import org.junit.jupiter.api.j2;
import ro.d;
import ro.f;
import uo.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.b
@f
@j
/* loaded from: classes7.dex */
public final class ImmutableDoubleArray implements Serializable {
    private static final ImmutableDoubleArray EMPTY = new ImmutableDoubleArray(new double[0]);
    private final double[] array;
    private final int end;
    private final transient int start;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends AbstractList<Double> implements RandomAccess, Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final ImmutableDoubleArray f34362a;

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Double get(int index) {
            return Double.valueOf(this.f34362a.get(index));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object target) {
            return indexOf(target) >= 0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object object) {
            if (object instanceof b) {
                return this.f34362a.equals(((b) object).f34362a);
            }
            if (!(object instanceof List)) {
                return false;
            }
            List list = (List) object;
            if (size() != list.size()) {
                return false;
            }
            int i11 = this.f34362a.start;
            for (Object obj : list) {
                if (obj instanceof Double) {
                    int i12 = i11 + 1;
                    if (ImmutableDoubleArray.areEqual(this.f34362a.array[i11], ((Double) obj).doubleValue())) {
                        i11 = i12;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            return this.f34362a.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object target) {
            if (target instanceof Double) {
                return this.f34362a.indexOf(((Double) target).doubleValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@CheckForNull Object target) {
            if (target instanceof Double) {
                return this.f34362a.lastIndexOf(((Double) target).doubleValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f34362a.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Double> subList(int fromIndex, int toIndex) {
            return this.f34362a.subArray(fromIndex, toIndex).asList();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.f34362a.toString();
        }

        public b(ImmutableDoubleArray parent) {
            this.f34362a = parent;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public double[] f34363a;

        /* renamed from: b, reason: collision with root package name */
        public int f34364b = 0;

        public c(int initialCapacity) {
            this.f34363a = new double[initialCapacity];
        }

        public static int h(int oldCapacity, int minCapacity) {
            if (minCapacity < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int i11 = oldCapacity + (oldCapacity >> 1) + 1;
            if (i11 < minCapacity) {
                i11 = Integer.highestOneBit(minCapacity - 1) << 1;
            }
            if (i11 < 0) {
                return Integer.MAX_VALUE;
            }
            return i11;
        }

        @uo.a
        public c a(double value) {
            g(1);
            double[] dArr = this.f34363a;
            int i11 = this.f34364b;
            dArr[i11] = value;
            this.f34364b = i11 + 1;
            return this;
        }

        @uo.a
        public c b(ImmutableDoubleArray values) {
            g(values.length());
            System.arraycopy(values.array, values.start, this.f34363a, this.f34364b, values.length());
            this.f34364b += values.length();
            return this;
        }

        @uo.a
        public c c(Iterable<Double> values) {
            if (values instanceof Collection) {
                return d((Collection) values);
            }
            Iterator<Double> it = values.iterator();
            while (it.hasNext()) {
                a(it.next().doubleValue());
            }
            return this;
        }

        @uo.a
        public c d(Collection<Double> values) {
            g(values.size());
            for (Double d11 : values) {
                double[] dArr = this.f34363a;
                int i11 = this.f34364b;
                this.f34364b = i11 + 1;
                dArr[i11] = d11.doubleValue();
            }
            return this;
        }

        @uo.a
        public c e(double[] values) {
            g(values.length);
            System.arraycopy(values, 0, this.f34363a, this.f34364b, values.length);
            this.f34364b += values.length;
            return this;
        }

        public ImmutableDoubleArray f() {
            if (this.f34364b == 0) {
                return ImmutableDoubleArray.EMPTY;
            }
            return new ImmutableDoubleArray(this.f34363a, 0, this.f34364b);
        }

        public final void g(int numberToAdd) {
            int i11 = this.f34364b + numberToAdd;
            double[] dArr = this.f34363a;
            if (i11 > dArr.length) {
                this.f34363a = Arrays.copyOf(dArr, h(dArr.length, i11));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean areEqual(double a11, double b11) {
        return Double.doubleToLongBits(a11) == Double.doubleToLongBits(b11);
    }

    public static c builder(int initialCapacity) {
        Preconditions.checkArgument(initialCapacity >= 0, "Invalid initialCapacity: %s", initialCapacity);
        return new c(initialCapacity);
    }

    public static ImmutableDoubleArray copyOf(double[] values) {
        return values.length == 0 ? EMPTY : new ImmutableDoubleArray(Arrays.copyOf(values, values.length));
    }

    private boolean isPartialView() {
        return this.start > 0 || this.end < this.array.length;
    }

    public static ImmutableDoubleArray of() {
        return EMPTY;
    }

    public List<Double> asList() {
        return new b();
    }

    public boolean contains(double target) {
        return indexOf(target) >= 0;
    }

    public boolean equals(@CheckForNull Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ImmutableDoubleArray)) {
            return false;
        }
        ImmutableDoubleArray immutableDoubleArray = (ImmutableDoubleArray) object;
        if (length() != immutableDoubleArray.length()) {
            return false;
        }
        for (int i11 = 0; i11 < length(); i11++) {
            if (!areEqual(get(i11), immutableDoubleArray.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public double get(int index) {
        Preconditions.checkElementIndex(index, length());
        return this.array[this.start + index];
    }

    public int hashCode() {
        int i11 = 1;
        for (int i12 = this.start; i12 < this.end; i12++) {
            i11 = (i11 * 31) + d.k(this.array[i12]);
        }
        return i11;
    }

    public int indexOf(double target) {
        for (int i11 = this.start; i11 < this.end; i11++) {
            if (areEqual(this.array[i11], target)) {
                return i11 - this.start;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.end == this.start;
    }

    public int lastIndexOf(double target) {
        int i11 = this.end;
        do {
            i11--;
            if (i11 < this.start) {
                return -1;
            }
        } while (!areEqual(this.array[i11], target));
        return i11 - this.start;
    }

    public int length() {
        return this.end - this.start;
    }

    public Object readResolve() {
        return isEmpty() ? EMPTY : this;
    }

    public ImmutableDoubleArray subArray(int startIndex, int endIndex) {
        Preconditions.checkPositionIndexes(startIndex, endIndex, length());
        if (startIndex == endIndex) {
            return EMPTY;
        }
        double[] dArr = this.array;
        int i11 = this.start;
        return new ImmutableDoubleArray(dArr, startIndex + i11, i11 + endIndex);
    }

    public double[] toArray() {
        return Arrays.copyOfRange(this.array, this.start, this.end);
    }

    public String toString() {
        if (isEmpty()) {
            return i.f77289p;
        }
        StringBuilder sb2 = new StringBuilder(length() * 5);
        sb2.append('[');
        sb2.append(this.array[this.start]);
        int i11 = this.start;
        while (true) {
            i11++;
            if (i11 >= this.end) {
                sb2.append(l50.b.f69930l);
                return sb2.toString();
            }
            sb2.append(j2.O);
            sb2.append(this.array[i11]);
        }
    }

    public ImmutableDoubleArray trimmed() {
        return isPartialView() ? new ImmutableDoubleArray(toArray()) : this;
    }

    public Object writeReplace() {
        return trimmed();
    }

    private ImmutableDoubleArray(double[] array) {
        this(array, 0, array.length);
    }

    public static ImmutableDoubleArray of(double e02) {
        return new ImmutableDoubleArray(new double[]{e02});
    }

    private ImmutableDoubleArray(double[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    public static c builder() {
        return new c(10);
    }

    public static ImmutableDoubleArray of(double e02, double e12) {
        return new ImmutableDoubleArray(new double[]{e02, e12});
    }

    public static ImmutableDoubleArray copyOf(Collection<Double> values) {
        return values.isEmpty() ? EMPTY : new ImmutableDoubleArray(d.C(values));
    }

    public static ImmutableDoubleArray of(double e02, double e12, double e22) {
        return new ImmutableDoubleArray(new double[]{e02, e12, e22});
    }

    public static ImmutableDoubleArray copyOf(Iterable<Double> values) {
        if (values instanceof Collection) {
            return copyOf((Collection<Double>) values);
        }
        return builder().c(values).f();
    }

    public static ImmutableDoubleArray of(double e02, double e12, double e22, double e32) {
        return new ImmutableDoubleArray(new double[]{e02, e12, e22, e32});
    }

    public static ImmutableDoubleArray of(double e02, double e12, double e22, double e32, double e42) {
        return new ImmutableDoubleArray(new double[]{e02, e12, e22, e32, e42});
    }

    public static ImmutableDoubleArray of(double e02, double e12, double e22, double e32, double e42, double e52) {
        return new ImmutableDoubleArray(new double[]{e02, e12, e22, e32, e42, e52});
    }

    public static ImmutableDoubleArray of(double first, double... rest) {
        Preconditions.checkArgument(rest.length <= 2147483646, "the total number of elements must fit in an int");
        double[] dArr = new double[rest.length + 1];
        dArr[0] = first;
        System.arraycopy(rest, 0, dArr, 1, rest.length);
        return new ImmutableDoubleArray(dArr);
    }
}
