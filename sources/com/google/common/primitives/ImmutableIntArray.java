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
import org.junit.jupiter.api.j2;
import ro.f;
import ro.i;
import uo.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.b
@f
@j
/* loaded from: classes7.dex */
public final class ImmutableIntArray implements Serializable {
    private static final ImmutableIntArray EMPTY = new ImmutableIntArray(new int[0]);
    private final int[] array;
    private final int end;
    private final transient int start;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final ImmutableIntArray f34365a;

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(int index) {
            return Integer.valueOf(this.f34365a.get(index));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object target) {
            return indexOf(target) >= 0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object object) {
            if (object instanceof b) {
                return this.f34365a.equals(((b) object).f34365a);
            }
            if (!(object instanceof List)) {
                return false;
            }
            List list = (List) object;
            if (size() != list.size()) {
                return false;
            }
            int i11 = this.f34365a.start;
            for (Object obj : list) {
                if (obj instanceof Integer) {
                    int i12 = i11 + 1;
                    if (this.f34365a.array[i11] == ((Integer) obj).intValue()) {
                        i11 = i12;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            return this.f34365a.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object target) {
            if (target instanceof Integer) {
                return this.f34365a.indexOf(((Integer) target).intValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@CheckForNull Object target) {
            if (target instanceof Integer) {
                return this.f34365a.lastIndexOf(((Integer) target).intValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f34365a.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int fromIndex, int toIndex) {
            return this.f34365a.subArray(fromIndex, toIndex).asList();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.f34365a.toString();
        }

        public b(ImmutableIntArray parent) {
            this.f34365a = parent;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public int[] f34366a;

        /* renamed from: b, reason: collision with root package name */
        public int f34367b = 0;

        public c(int initialCapacity) {
            this.f34366a = new int[initialCapacity];
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
        public c a(int value) {
            g(1);
            int[] iArr = this.f34366a;
            int i11 = this.f34367b;
            iArr[i11] = value;
            this.f34367b = i11 + 1;
            return this;
        }

        @uo.a
        public c b(ImmutableIntArray values) {
            g(values.length());
            System.arraycopy(values.array, values.start, this.f34366a, this.f34367b, values.length());
            this.f34367b += values.length();
            return this;
        }

        @uo.a
        public c c(Iterable<Integer> values) {
            if (values instanceof Collection) {
                return d((Collection) values);
            }
            Iterator<Integer> it = values.iterator();
            while (it.hasNext()) {
                a(it.next().intValue());
            }
            return this;
        }

        @uo.a
        public c d(Collection<Integer> values) {
            g(values.size());
            for (Integer num : values) {
                int[] iArr = this.f34366a;
                int i11 = this.f34367b;
                this.f34367b = i11 + 1;
                iArr[i11] = num.intValue();
            }
            return this;
        }

        @uo.a
        public c e(int[] values) {
            g(values.length);
            System.arraycopy(values, 0, this.f34366a, this.f34367b, values.length);
            this.f34367b += values.length;
            return this;
        }

        public ImmutableIntArray f() {
            if (this.f34367b == 0) {
                return ImmutableIntArray.EMPTY;
            }
            return new ImmutableIntArray(this.f34366a, 0, this.f34367b);
        }

        public final void g(int numberToAdd) {
            int i11 = this.f34367b + numberToAdd;
            int[] iArr = this.f34366a;
            if (i11 > iArr.length) {
                this.f34366a = Arrays.copyOf(iArr, h(iArr.length, i11));
            }
        }
    }

    public static c builder(int initialCapacity) {
        Preconditions.checkArgument(initialCapacity >= 0, "Invalid initialCapacity: %s", initialCapacity);
        return new c(initialCapacity);
    }

    public static ImmutableIntArray copyOf(int[] values) {
        return values.length == 0 ? EMPTY : new ImmutableIntArray(Arrays.copyOf(values, values.length));
    }

    private boolean isPartialView() {
        return this.start > 0 || this.end < this.array.length;
    }

    public static ImmutableIntArray of() {
        return EMPTY;
    }

    public List<Integer> asList() {
        return new b();
    }

    public boolean contains(int target) {
        return indexOf(target) >= 0;
    }

    public boolean equals(@CheckForNull Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ImmutableIntArray)) {
            return false;
        }
        ImmutableIntArray immutableIntArray = (ImmutableIntArray) object;
        if (length() != immutableIntArray.length()) {
            return false;
        }
        for (int i11 = 0; i11 < length(); i11++) {
            if (get(i11) != immutableIntArray.get(i11)) {
                return false;
            }
        }
        return true;
    }

    public int get(int index) {
        Preconditions.checkElementIndex(index, length());
        return this.array[this.start + index];
    }

    public int hashCode() {
        int i11 = 1;
        for (int i12 = this.start; i12 < this.end; i12++) {
            i11 = (i11 * 31) + i.m(this.array[i12]);
        }
        return i11;
    }

    public int indexOf(int target) {
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

    public int lastIndexOf(int target) {
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

    public ImmutableIntArray subArray(int startIndex, int endIndex) {
        Preconditions.checkPositionIndexes(startIndex, endIndex, length());
        if (startIndex == endIndex) {
            return EMPTY;
        }
        int[] iArr = this.array;
        int i11 = this.start;
        return new ImmutableIntArray(iArr, startIndex + i11, i11 + endIndex);
    }

    public int[] toArray() {
        return Arrays.copyOfRange(this.array, this.start, this.end);
    }

    public String toString() {
        if (isEmpty()) {
            return okhttp3.i.f77289p;
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

    public ImmutableIntArray trimmed() {
        return isPartialView() ? new ImmutableIntArray(toArray()) : this;
    }

    public Object writeReplace() {
        return trimmed();
    }

    private ImmutableIntArray(int[] array) {
        this(array, 0, array.length);
    }

    public static ImmutableIntArray copyOf(Collection<Integer> values) {
        return values.isEmpty() ? EMPTY : new ImmutableIntArray(i.E(values));
    }

    public static ImmutableIntArray of(int e02) {
        return new ImmutableIntArray(new int[]{e02});
    }

    private ImmutableIntArray(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    public static c builder() {
        return new c(10);
    }

    public static ImmutableIntArray copyOf(Iterable<Integer> values) {
        if (values instanceof Collection) {
            return copyOf((Collection<Integer>) values);
        }
        return builder().c(values).f();
    }

    public static ImmutableIntArray of(int e02, int e12) {
        return new ImmutableIntArray(new int[]{e02, e12});
    }

    public static ImmutableIntArray of(int e02, int e12, int e22) {
        return new ImmutableIntArray(new int[]{e02, e12, e22});
    }

    public static ImmutableIntArray of(int e02, int e12, int e22, int e32) {
        return new ImmutableIntArray(new int[]{e02, e12, e22, e32});
    }

    public static ImmutableIntArray of(int e02, int e12, int e22, int e32, int e42) {
        return new ImmutableIntArray(new int[]{e02, e12, e22, e32, e42});
    }

    public static ImmutableIntArray of(int e02, int e12, int e22, int e32, int e42, int e52) {
        return new ImmutableIntArray(new int[]{e02, e12, e22, e32, e42, e52});
    }

    public static ImmutableIntArray of(int first, int... rest) {
        Preconditions.checkArgument(rest.length <= 2147483646, "the total number of elements must fit in an int");
        int[] iArr = new int[rest.length + 1];
        iArr[0] = first;
        System.arraycopy(rest, 0, iArr, 1, rest.length);
        return new ImmutableIntArray(iArr);
    }
}
