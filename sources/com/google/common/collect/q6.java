package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.math.RoundingMode;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true)
/* loaded from: classes7.dex */
public final class q6 {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a<E> extends g<E> {

        /* renamed from: b, reason: collision with root package name */
        @go.d
        public static final long f33729b = 0;

        public a(List backingList) {
            super(backingList);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator(int index) {
            return this.f33731a.listIterator(index);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b<E> extends c<E> {

        /* renamed from: b, reason: collision with root package name */
        @go.d
        public static final long f33730b = 0;

        public b(List backingList) {
            super(backingList);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator(int index) {
            return this.f33731a.listIterator(index);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c<E> extends AbstractList<E> {

        /* renamed from: a, reason: collision with root package name */
        public final List<E> f33731a;

        public c(List<E> backingList) {
            this.f33731a = (List) Preconditions.checkNotNull(backingList);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int index, @t7 E element) {
            this.f33731a.add(index, element);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int index, Collection<? extends E> c11) {
            return this.f33731a.addAll(index, c11);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object o11) {
            return this.f33731a.contains(o11);
        }

        @Override // java.util.AbstractList, java.util.List
        @t7
        public E get(int index) {
            return this.f33731a.get(index);
        }

        @Override // java.util.AbstractList, java.util.List
        @t7
        public E remove(int index) {
            return this.f33731a.remove(index);
        }

        @Override // java.util.AbstractList, java.util.List
        @t7
        public E set(int index, @t7 E element) {
            return this.f33731a.set(index, element);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f33731a.size();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends AbstractList<Character> {

        /* renamed from: a, reason: collision with root package name */
        public final CharSequence f33732a;

        public d(CharSequence sequence) {
            this.f33732a = sequence;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Character get(int index) {
            Preconditions.checkElementIndex(index, size());
            return Character.valueOf(this.f33732a.charAt(index));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f33732a.length();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e<E> extends AbstractList<E> implements Serializable, RandomAccess {

        @go.d
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        @t7
        public final E f33733a;

        /* renamed from: b, reason: collision with root package name */
        public final E[] f33734b;

        public e(@t7 E e11, E[] eArr) {
            this.f33733a = e11;
            this.f33734b = (E[]) ((Object[]) Preconditions.checkNotNull(eArr));
        }

        @Override // java.util.AbstractList, java.util.List
        @t7
        public E get(int index) {
            Preconditions.checkElementIndex(index, size());
            return index == 0 ? this.f33733a : this.f33734b[index - 1];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return com.google.common.math.f.t(this.f33734b.length, 1);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f<T> extends AbstractList<List<T>> {

        /* renamed from: a, reason: collision with root package name */
        public final List<T> f33735a;

        /* renamed from: b, reason: collision with root package name */
        public final int f33736b;

        public f(List<T> list, int size) {
            this.f33735a = list;
            this.f33736b = size;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<T> get(int index) {
            Preconditions.checkElementIndex(index, size());
            int i11 = this.f33736b;
            int i12 = index * i11;
            return this.f33735a.subList(i12, Math.min(i11 + i12, this.f33735a.size()));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f33735a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return com.google.common.math.f.g(this.f33735a.size(), this.f33736b, RoundingMode.CEILING);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class g<E> extends c<E> implements RandomAccess {
        public g(List<E> backingList) {
            super(backingList);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class h<T> extends f<T> implements RandomAccess {
        public h(List<T> list, int size) {
            super(list, size);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class i<T> extends j<T> implements RandomAccess {
        public i(List<T> forwardList) {
            super(forwardList);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class j<T> extends AbstractList<T> {

        /* renamed from: a, reason: collision with root package name */
        public final List<T> f33737a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements ListIterator<T> {

            /* renamed from: a, reason: collision with root package name */
            public boolean f33738a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ListIterator f33739b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ j f33740c;

            public a(final j this$0, final ListIterator val$forwardIterator) {
                this.f33739b = val$forwardIterator;
                this.f33740c = this$0;
            }

            @Override // java.util.ListIterator
            public void add(@t7 T e11) {
                this.f33739b.add(e11);
                this.f33739b.previous();
                this.f33738a = false;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f33739b.hasPrevious();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f33739b.hasNext();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            @t7
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f33738a = true;
                return (T) this.f33739b.previous();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.f33740c.f(this.f33739b.nextIndex());
            }

            @Override // java.util.ListIterator
            @t7
            public T previous() {
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f33738a = true;
                return (T) this.f33739b.next();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return nextIndex() - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                x2.e(this.f33738a);
                this.f33739b.remove();
                this.f33738a = false;
            }

            @Override // java.util.ListIterator
            public void set(@t7 T e11) {
                Preconditions.checkState(this.f33738a);
                this.f33739b.set(e11);
            }
        }

        public j(List<T> forwardList) {
            this.f33737a = (List) Preconditions.checkNotNull(forwardList);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int index, @t7 T element) {
            this.f33737a.add(f(index), element);
        }

        public List<T> b() {
            return this.f33737a;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.f33737a.clear();
        }

        public final int d(int index) {
            int size = size();
            Preconditions.checkElementIndex(index, size);
            return (size - 1) - index;
        }

        public final int f(int index) {
            int size = size();
            Preconditions.checkPositionIndex(index, size);
            return size - index;
        }

        @Override // java.util.AbstractList, java.util.List
        @t7
        public T get(int index) {
            return this.f33737a.get(d(index));
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int index) {
            return new a(this, this.f33737a.listIterator(f(index)));
        }

        @Override // java.util.AbstractList, java.util.List
        @t7
        public T remove(int index) {
            return this.f33737a.remove(d(index));
        }

        @Override // java.util.AbstractList
        public void removeRange(int fromIndex, int toIndex) {
            subList(fromIndex, toIndex).clear();
        }

        @Override // java.util.AbstractList, java.util.List
        @t7
        public T set(int index, @t7 T element) {
            return this.f33737a.set(d(index), element);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f33737a.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<T> subList(int fromIndex, int toIndex) {
            Preconditions.checkPositionIndexes(fromIndex, toIndex, size());
            return q6.B(this.f33737a.subList(f(toIndex), f(fromIndex)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class k extends ImmutableList<Character> {

        /* renamed from: a, reason: collision with root package name */
        public final String f33741a;

        public k(String string) {
            this.f33741a = string;
        }

        @Override // java.util.List
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Character get(int index) {
            Preconditions.checkElementIndex(index, size());
            return Character.valueOf(this.f33741a.charAt(index));
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int indexOf(@CheckForNull Object object) {
            if (object instanceof Character) {
                return this.f33741a.indexOf(((Character) object).charValue());
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return false;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int lastIndexOf(@CheckForNull Object object) {
            if (object instanceof Character) {
                return this.f33741a.lastIndexOf(((Character) object).charValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f33741a.length();
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        @go.d
        @go.c
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public ImmutableList<Character> subList(int fromIndex, int toIndex) {
            Preconditions.checkPositionIndexes(fromIndex, toIndex, size());
            return q6.g(this.f33741a.substring(fromIndex, toIndex));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class l<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final List<F> f33742a;

        /* renamed from: b, reason: collision with root package name */
        public final ho.r<? super F, ? extends T> f33743b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends w9<F, T> {
            public a(ListIterator backingIterator) {
                super(backingIterator);
            }

            @Override // com.google.common.collect.v9
            public T a(F from) {
                return l.this.f33743b.apply(from);
            }
        }

        public l(List<F> fromList, ho.r<? super F, ? extends T> function) {
            this.f33742a = (List) Preconditions.checkNotNull(fromList);
            this.f33743b = (ho.r) Preconditions.checkNotNull(function);
        }

        @Override // java.util.AbstractList, java.util.List
        @t7
        public T get(int i11) {
            return this.f33743b.apply(this.f33742a.get(i11));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f33742a.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int index) {
            return new a(this.f33742a.listIterator(index));
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i11) {
            return this.f33743b.apply(this.f33742a.remove(i11));
        }

        @Override // java.util.AbstractList
        public void removeRange(int fromIndex, int toIndex) {
            this.f33742a.subList(fromIndex, toIndex).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f33742a.size();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class m<F, T> extends AbstractSequentialList<T> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final List<F> f33745a;

        /* renamed from: b, reason: collision with root package name */
        public final ho.r<? super F, ? extends T> f33746b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends w9<F, T> {
            public a(ListIterator backingIterator) {
                super(backingIterator);
            }

            @Override // com.google.common.collect.v9
            @t7
            public T a(@t7 F from) {
                return m.this.f33746b.apply(from);
            }
        }

        public m(List<F> fromList, ho.r<? super F, ? extends T> function) {
            this.f33745a = (List) Preconditions.checkNotNull(fromList);
            this.f33746b = (ho.r) Preconditions.checkNotNull(function);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f33745a.isEmpty();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(final int index) {
            return new a(this.f33745a.listIterator(index));
        }

        @Override // java.util.AbstractList
        public void removeRange(int fromIndex, int toIndex) {
            this.f33745a.subList(fromIndex, toIndex).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f33745a.size();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class n<E> extends AbstractList<E> implements Serializable, RandomAccess {

        @go.d
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        @t7
        public final E f33748a;

        /* renamed from: b, reason: collision with root package name */
        @t7
        public final E f33749b;

        /* renamed from: c, reason: collision with root package name */
        public final E[] f33750c;

        public n(@t7 E e11, @t7 E e12, E[] eArr) {
            this.f33748a = e11;
            this.f33749b = e12;
            this.f33750c = (E[]) ((Object[]) Preconditions.checkNotNull(eArr));
        }

        @Override // java.util.AbstractList, java.util.List
        @t7
        public E get(int index) {
            if (index == 0) {
                return this.f33748a;
            }
            if (index == 1) {
                return this.f33749b;
            }
            Preconditions.checkElementIndex(index, size());
            return this.f33750c[index - 2];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return com.google.common.math.f.t(this.f33750c.length, 2);
        }
    }

    public static <T> List<List<T>> A(List<T> list, int size) {
        Preconditions.checkNotNull(list);
        Preconditions.checkArgument(size > 0);
        return list instanceof RandomAccess ? new h(list, size) : new f(list, size);
    }

    public static <T> List<T> B(List<T> list) {
        return list instanceof ImmutableList ? ((ImmutableList) list).reverse() : list instanceof j ? ((j) list).b() : list instanceof RandomAccess ? new i(list) : new j(list);
    }

    public static <E> List<E> C(final List<E> list, int fromIndex, int toIndex) {
        return (list instanceof RandomAccess ? new a(list) : new b(list)).subList(fromIndex, toIndex);
    }

    public static <F, T> List<T> D(List<F> fromList, ho.r<? super F, ? extends T> function) {
        return fromList instanceof RandomAccess ? new l(fromList, function) : new m(fromList, function);
    }

    public static <E> boolean a(List<E> list, int index, Iterable<? extends E> elements) {
        ListIterator<E> listIterator = list.listIterator(index);
        Iterator<? extends E> it = elements.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            listIterator.add(it.next());
            z11 = true;
        }
        return z11;
    }

    public static <E> List<E> b(@t7 E first, @t7 E second, E[] rest) {
        return new n(first, second, rest);
    }

    public static <E> List<E> c(@t7 E first, E[] rest) {
        return new e(first, rest);
    }

    public static <B> List<List<B>> d(List<? extends List<? extends B>> lists) {
        return w.d(lists);
    }

    @SafeVarargs
    public static <B> List<List<B>> e(List<? extends B>... lists) {
        return d(Arrays.asList(lists));
    }

    public static <T> List<T> f(Iterable<T> iterable) {
        return (List) iterable;
    }

    public static ImmutableList<Character> g(String string) {
        return new k((String) Preconditions.checkNotNull(string));
    }

    public static List<Character> h(CharSequence sequence) {
        return new d((CharSequence) Preconditions.checkNotNull(sequence));
    }

    @go.e
    public static int i(int arraySize) {
        x2.b(arraySize, "arraySize");
        return ro.i.A(arraySize + 5 + (arraySize / 10));
    }

    public static boolean j(List<?> thisList, @CheckForNull Object other) {
        if (other == Preconditions.checkNotNull(thisList)) {
            return true;
        }
        if (!(other instanceof List)) {
            return false;
        }
        List list = (List) other;
        int size = thisList.size();
        if (size != list.size()) {
            return false;
        }
        if (!(thisList instanceof RandomAccess) || !(list instanceof RandomAccess)) {
            return l6.s(thisList.iterator(), list.iterator());
        }
        for (int i11 = 0; i11 < size; i11++) {
            if (!ho.d0.a(thisList.get(i11), list.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public static int k(List<?> list) {
        Iterator<?> it = list.iterator();
        int i11 = 1;
        while (it.hasNext()) {
            Object next = it.next();
            i11 = ~(~((i11 * 31) + (next == null ? 0 : next.hashCode())));
        }
        return i11;
    }

    public static int l(List<?> list, @CheckForNull Object element) {
        if (list instanceof RandomAccess) {
            return m(list, element);
        }
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (ho.d0.a(element, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    public static int m(List<?> list, @CheckForNull Object element) {
        int size = list.size();
        int i11 = 0;
        if (element == null) {
            while (i11 < size) {
                if (list.get(i11) == null) {
                    return i11;
                }
                i11++;
            }
            return -1;
        }
        while (i11 < size) {
            if (element.equals(list.get(i11))) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static int n(List<?> list, @CheckForNull Object element) {
        if (list instanceof RandomAccess) {
            return o(list, element);
        }
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (ho.d0.a(element, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public static int o(List<?> list, @CheckForNull Object element) {
        if (element == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (element.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    public static <E> ListIterator<E> p(List<E> list, int index) {
        return new c(list).listIterator(index);
    }

    @go.b(serializable = true)
    public static <E> ArrayList<E> q() {
        return new ArrayList<>();
    }

    @go.b(serializable = true)
    public static <E> ArrayList<E> r(Iterable<? extends E> elements) {
        Preconditions.checkNotNull(elements);
        return elements instanceof Collection ? new ArrayList<>((Collection) elements) : s(elements.iterator());
    }

    @go.b(serializable = true)
    public static <E> ArrayList<E> s(Iterator<? extends E> elements) {
        ArrayList<E> q11 = q();
        l6.a(q11, elements);
        return q11;
    }

    @SafeVarargs
    @go.b(serializable = true)
    public static <E> ArrayList<E> t(E... elements) {
        Preconditions.checkNotNull(elements);
        ArrayList<E> arrayList = new ArrayList<>(i(elements.length));
        Collections.addAll(arrayList, elements);
        return arrayList;
    }

    @go.b(serializable = true)
    public static <E> ArrayList<E> u(int initialArraySize) {
        x2.b(initialArraySize, "initialArraySize");
        return new ArrayList<>(initialArraySize);
    }

    @go.b(serializable = true)
    public static <E> ArrayList<E> v(int estimatedSize) {
        return new ArrayList<>(i(estimatedSize));
    }

    @go.d
    @go.c
    public static <E> CopyOnWriteArrayList<E> w() {
        return new CopyOnWriteArrayList<>();
    }

    @go.d
    @go.c
    public static <E> CopyOnWriteArrayList<E> x(Iterable<? extends E> elements) {
        return new CopyOnWriteArrayList<>(elements instanceof Collection ? (Collection) elements : r(elements));
    }

    @go.b(serializable = true)
    public static <E> LinkedList<E> y() {
        return new LinkedList<>();
    }

    @go.b(serializable = true)
    public static <E> LinkedList<E> z(Iterable<? extends E> elements) {
        LinkedList<E> y11 = y();
        k6.a(y11, elements);
        return y11;
    }
}
