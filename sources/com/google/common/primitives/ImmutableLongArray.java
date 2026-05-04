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
import ro.f;
import ro.k;
import uo.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.b
@f
@j
/* loaded from: classes7.dex */
public final class ImmutableLongArray implements Serializable {
    private static final ImmutableLongArray EMPTY = new ImmutableLongArray(new long[0]);
    private final long[] array;
    private final int end;
    private final transient int start;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends AbstractList<Long> implements RandomAccess, Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final ImmutableLongArray f34368a;

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long get(int index) {
            return Long.valueOf(this.f34368a.get(index));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object target) {
            return indexOf(target) >= 0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object object) {
            if (object instanceof b) {
                return this.f34368a.equals(((b) object).f34368a);
            }
            if (!(object instanceof List)) {
                return false;
            }
            List list = (List) object;
            if (size() != list.size()) {
                return false;
            }
            int i11 = this.f34368a.start;
            for (Object obj : list) {
                if (obj instanceof Long) {
                    int i12 = i11 + 1;
                    if (this.f34368a.array[i11] == ((Long) obj).longValue()) {
                        i11 = i12;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            return this.f34368a.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object target) {
            if (target instanceof Long) {
                return this.f34368a.indexOf(((Long) target).longValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@CheckForNull Object target) {
            if (target instanceof Long) {
                return this.f34368a.lastIndexOf(((Long) target).longValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f34368a.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Long> subList(int fromIndex, int toIndex) {
            return this.f34368a.subArray(fromIndex, toIndex).asList();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.f34368a.toString();
        }

        public b(ImmutableLongArray parent) {
            this.f34368a = parent;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public long[] f34369a;

        /* renamed from: b, reason: collision with root package name */
        public int f34370b = 0;

        public c(int initialCapacity) {
            this.f34369a = new long[initialCapacity];
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
        public c a(long value) {
            g(1);
            long[] jArr = this.f34369a;
            int i11 = this.f34370b;
            jArr[i11] = value;
            this.f34370b = i11 + 1;
            return this;
        }

        @uo.a
        public c b(ImmutableLongArray values) {
            g(values.length());
            System.arraycopy(values.array, values.start, this.f34369a, this.f34370b, values.length());
            this.f34370b += values.length();
            return this;
        }

        @uo.a
        public c c(Iterable<Long> values) {
            if (values instanceof Collection) {
                return d((Collection) values);
            }
            Iterator<Long> it = values.iterator();
            while (it.hasNext()) {
                a(it.next().longValue());
            }
            return this;
        }

        @uo.a
        public c d(Collection<Long> values) {
            g(values.size());
            for (Long l11 : values) {
                long[] jArr = this.f34369a;
                int i11 = this.f34370b;
                this.f34370b = i11 + 1;
                jArr[i11] = l11.longValue();
            }
            return this;
        }

        @uo.a
        public c e(long[] values) {
            g(values.length);
            System.arraycopy(values, 0, this.f34369a, this.f34370b, values.length);
            this.f34370b += values.length;
            return this;
        }

        public ImmutableLongArray f() {
            if (this.f34370b == 0) {
                return ImmutableLongArray.EMPTY;
            }
            return new ImmutableLongArray(this.f34369a, 0, this.f34370b);
        }

        public final void g(int numberToAdd) {
            int i11 = this.f34370b + numberToAdd;
            long[] jArr = this.f34369a;
            if (i11 > jArr.length) {
                this.f34369a = Arrays.copyOf(jArr, h(jArr.length, i11));
            }
        }
    }

    public static c builder(int initialCapacity) {
        Preconditions.checkArgument(initialCapacity >= 0, "Invalid initialCapacity: %s", initialCapacity);
        return new c(initialCapacity);
    }

    public static ImmutableLongArray copyOf(long[] values) {
        return values.length == 0 ? EMPTY : new ImmutableLongArray(Arrays.copyOf(values, values.length));
    }

    private boolean isPartialView() {
        return this.start > 0 || this.end < this.array.length;
    }

    public static ImmutableLongArray of() {
        return EMPTY;
    }

    public List<Long> asList() {
        return new b();
    }

    public boolean contains(long target) {
        return indexOf(target) >= 0;
    }

    public boolean equals(@CheckForNull Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ImmutableLongArray)) {
            return false;
        }
        ImmutableLongArray immutableLongArray = (ImmutableLongArray) object;
        if (length() != immutableLongArray.length()) {
            return false;
        }
        for (int i11 = 0; i11 < length(); i11++) {
            if (get(i11) != immutableLongArray.get(i11)) {
                return false;
            }
        }
        return true;
    }

    public long get(int index) {
        Preconditions.checkElementIndex(index, length());
        return this.array[this.start + index];
    }

    public int hashCode() {
        int i11 = 1;
        for (int i12 = this.start; i12 < this.end; i12++) {
            i11 = (i11 * 31) + k.l(this.array[i12]);
        }
        return i11;
    }

    public int indexOf(long target) {
        for (int i11 = this.start; i11 < this.end; i11++) {
            if (this.array[i11] == target) {
                return i11 - this.start;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.end == this.start;
    }

    public int lastIndexOf(long target) {
        int i11;
        int i12 = this.end;
        do {
            i12--;
            i11 = this.start;
            if (i12 < i11) {
                return -1;
            }
        } while (this.array[i12] != target);
        return i12 - i11;
    }

    public int length() {
        return this.end - this.start;
    }

    public Object readResolve() {
        return isEmpty() ? EMPTY : this;
    }

    public ImmutableLongArray subArray(int startIndex, int endIndex) {
        Preconditions.checkPositionIndexes(startIndex, endIndex, length());
        if (startIndex == endIndex) {
            return EMPTY;
        }
        long[] jArr = this.array;
        int i11 = this.start;
        return new ImmutableLongArray(jArr, startIndex + i11, i11 + endIndex);
    }

    public long[] toArray() {
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

    public ImmutableLongArray trimmed() {
        return isPartialView() ? new ImmutableLongArray(toArray()) : this;
    }

    public Object writeReplace() {
        return trimmed();
    }

    private ImmutableLongArray(long[] array) {
        this(array, 0, array.length);
    }

    public static ImmutableLongArray of(long e02) {
        return new ImmutableLongArray(new long[]{e02});
    }

    private ImmutableLongArray(long[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    public static c builder() {
        return new c(10);
    }

    public static ImmutableLongArray of(long e02, long e12) {
        return new ImmutableLongArray(new long[]{e02, e12});
    }

    public static ImmutableLongArray copyOf(Collection<Long> values) {
        return values.isEmpty() ? EMPTY : new ImmutableLongArray(k.C(values));
    }

    public static ImmutableLongArray of(long e02, long e12, long e22) {
        return new ImmutableLongArray(new long[]{e02, e12, e22});
    }

    public static ImmutableLongArray copyOf(Iterable<Long> values) {
        if (values instanceof Collection) {
            return copyOf((Collection<Long>) values);
        }
        return builder().c(values).f();
    }

    public static ImmutableLongArray of(long e02, long e12, long e22, long e32) {
        return new ImmutableLongArray(new long[]{e02, e12, e22, e32});
    }

    public static ImmutableLongArray of(long e02, long e12, long e22, long e32, long e42) {
        return new ImmutableLongArray(new long[]{e02, e12, e22, e32, e42});
    }

    public static ImmutableLongArray of(long e02, long e12, long e22, long e32, long e42, long e52) {
        return new ImmutableLongArray(new long[]{e02, e12, e22, e32, e42, e52});
    }

    public static ImmutableLongArray of(long first, long... rest) {
        Preconditions.checkArgument(rest.length <= 2147483646, "the total number of elements must fit in an int");
        long[] jArr = new long[rest.length + 1];
        jArr[0] = first;
        System.arraycopy(rest, 0, jArr, 1, rest.length);
        return new ImmutableLongArray(jArr);
    }
}
