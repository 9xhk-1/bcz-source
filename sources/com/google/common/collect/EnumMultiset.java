package com.google.common.collect;

import androidx.collection.SieveCacheKt;
import com.google.common.base.Preconditions;
import com.google.common.collect.j7;
import com.google.common.collect.k7;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.b(emulated = true)
@go.d
@u3
/* loaded from: classes7.dex */
public final class EnumMultiset<E extends Enum<E>> extends i<E> implements Serializable {

    @go.c
    private static final long serialVersionUID = 0;
    private transient int[] counts;
    private transient int distinctElements;
    private transient E[] enumConstants;
    private transient long size;
    private transient Class<E> type;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends EnumMultiset<E>.c<E> {
        public a() {
            super();
        }

        @Override // com.google.common.collect.EnumMultiset.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public E a(int i11) {
            return (E) EnumMultiset.this.enumConstants[i11];
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends EnumMultiset<E>.c<j7.a<E>> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends k7.f<E> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f32967a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f32968b;

            public a(final b this$1, final int val$index) {
                this.f32967a = val$index;
                this.f32968b = this$1;
            }

            @Override // com.google.common.collect.j7.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public E e() {
                return (E) EnumMultiset.this.enumConstants[this.f32967a];
            }

            @Override // com.google.common.collect.j7.a
            public int getCount() {
                return EnumMultiset.this.counts[this.f32967a];
            }
        }

        public b() {
            super();
        }

        @Override // com.google.common.collect.EnumMultiset.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j7.a<E> a(final int index) {
            return new a(this, index);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public abstract class c<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        public int f32969a = 0;

        /* renamed from: b, reason: collision with root package name */
        public int f32970b = -1;

        public c() {
        }

        public abstract T a(int index);

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (this.f32969a < EnumMultiset.this.enumConstants.length) {
                int[] iArr = EnumMultiset.this.counts;
                int i11 = this.f32969a;
                if (iArr[i11] > 0) {
                    return true;
                }
                this.f32969a = i11 + 1;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T a11 = a(this.f32969a);
            int i11 = this.f32969a;
            this.f32970b = i11;
            this.f32969a = i11 + 1;
            return a11;
        }

        @Override // java.util.Iterator
        public void remove() {
            x2.e(this.f32970b >= 0);
            if (EnumMultiset.this.counts[this.f32970b] > 0) {
                EnumMultiset.access$210(EnumMultiset.this);
                EnumMultiset.access$322(EnumMultiset.this, r0.counts[this.f32970b]);
                EnumMultiset.this.counts[this.f32970b] = 0;
            }
            this.f32970b = -1;
        }
    }

    private EnumMultiset(Class<E> type) {
        this.type = type;
        Preconditions.checkArgument(type.isEnum());
        E[] enumConstants = type.getEnumConstants();
        this.enumConstants = enumConstants;
        this.counts = new int[enumConstants.length];
    }

    public static /* synthetic */ int access$210(EnumMultiset enumMultiset) {
        int i11 = enumMultiset.distinctElements;
        enumMultiset.distinctElements = i11 - 1;
        return i11;
    }

    public static /* synthetic */ long access$322(EnumMultiset enumMultiset, long j11) {
        long j12 = enumMultiset.size - j11;
        enumMultiset.size = j12;
        return j12;
    }

    private void checkIsE(Object element) {
        Preconditions.checkNotNull(element);
        if (isActuallyE(element)) {
            return;
        }
        throw new ClassCastException("Expected an " + this.type + " but got " + element);
    }

    public static <E extends Enum<E>> EnumMultiset<E> create(Class<E> type) {
        return new EnumMultiset<>(type);
    }

    private boolean isActuallyE(@CheckForNull Object o11) {
        if (o11 instanceof Enum) {
            Enum r52 = (Enum) o11;
            int ordinal = r52.ordinal();
            E[] eArr = this.enumConstants;
            if (ordinal < eArr.length && eArr[ordinal] == r52) {
                return true;
            }
        }
        return false;
    }

    @go.c
    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        Object readObject = stream.readObject();
        Objects.requireNonNull(readObject);
        Class<E> cls = (Class) readObject;
        this.type = cls;
        E[] enumConstants = cls.getEnumConstants();
        this.enumConstants = enumConstants;
        this.counts = new int[enumConstants.length];
        o8.f(this, stream);
    }

    @go.c
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeObject(this.type);
        o8.k(this, stream);
    }

    @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        Arrays.fill(this.counts, 0);
        this.size = 0L;
        this.distinctElements = 0;
    }

    @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.j7
    public /* bridge */ /* synthetic */ boolean contains(@CheckForNull Object element) {
        return super.contains(element);
    }

    @Override // com.google.common.collect.j7
    public int count(@CheckForNull Object element) {
        if (element == null || !isActuallyE(element)) {
            return 0;
        }
        return this.counts[((Enum) element).ordinal()];
    }

    @Override // com.google.common.collect.i
    public int distinctElements() {
        return this.distinctElements;
    }

    @Override // com.google.common.collect.i
    public Iterator<E> elementIterator() {
        return new a();
    }

    @Override // com.google.common.collect.i, com.google.common.collect.j7
    public /* bridge */ /* synthetic */ Set elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.i
    public Iterator<j7.a<E>> entryIterator() {
        return new b();
    }

    @Override // com.google.common.collect.i, com.google.common.collect.j7
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.j7
    public Iterator<E> iterator() {
        return k7.n(this);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.j7
    @uo.a
    public int remove(@CheckForNull Object element, int occurrences) {
        if (element == null || !isActuallyE(element)) {
            return 0;
        }
        Enum r12 = (Enum) element;
        x2.b(occurrences, "occurrences");
        if (occurrences == 0) {
            return count(element);
        }
        int ordinal = r12.ordinal();
        int[] iArr = this.counts;
        int i11 = iArr[ordinal];
        if (i11 == 0) {
            return 0;
        }
        if (i11 > occurrences) {
            iArr[ordinal] = i11 - occurrences;
            this.size -= occurrences;
            return i11;
        }
        iArr[ordinal] = 0;
        this.distinctElements--;
        this.size -= i11;
        return i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.j7
    public int size() {
        return ro.i.A(this.size);
    }

    public static <E extends Enum<E>> EnumMultiset<E> create(Iterable<E> elements) {
        Iterator<E> it = elements.iterator();
        Preconditions.checkArgument(it.hasNext(), "EnumMultiset constructor passed empty Iterable");
        EnumMultiset<E> enumMultiset = new EnumMultiset<>(it.next().getDeclaringClass());
        k6.a(enumMultiset, elements);
        return enumMultiset;
    }

    @Override // com.google.common.collect.i, com.google.common.collect.j7
    @uo.a
    public int add(E element, int occurrences) {
        checkIsE(element);
        x2.b(occurrences, "occurrences");
        if (occurrences == 0) {
            return count(element);
        }
        int ordinal = element.ordinal();
        int i11 = this.counts[ordinal];
        long j11 = occurrences;
        long j12 = i11 + j11;
        Preconditions.checkArgument(j12 <= SieveCacheKt.NodeLinkMask, "too many occurrences: %s", j12);
        this.counts[ordinal] = (int) j12;
        if (i11 == 0) {
            this.distinctElements++;
        }
        this.size += j11;
        return i11;
    }

    @Override // com.google.common.collect.i, com.google.common.collect.j7
    @uo.a
    public /* bridge */ /* synthetic */ boolean setCount(@t7 Object element, int oldCount, int newCount) {
        return super.setCount(element, oldCount, newCount);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.j7
    @uo.a
    public int setCount(E element, int count) {
        checkIsE(element);
        x2.b(count, "count");
        int ordinal = element.ordinal();
        int[] iArr = this.counts;
        int i11 = iArr[ordinal];
        iArr[ordinal] = count;
        this.size += count - i11;
        if (i11 == 0 && count > 0) {
            this.distinctElements++;
            return i11;
        }
        if (i11 > 0 && count == 0) {
            this.distinctElements--;
        }
        return i11;
    }

    public static <E extends Enum<E>> EnumMultiset<E> create(Iterable<E> elements, Class<E> type) {
        EnumMultiset<E> create = create(type);
        k6.a(create, elements);
        return create;
    }
}
