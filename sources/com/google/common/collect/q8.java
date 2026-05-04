package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.y2;
import ix.g;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.stream.Collector;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true)
/* loaded from: classes7.dex */
public final class q8 {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a<E> extends m<E> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Set f33768a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Set f33769b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.google.common.collect.q8$a$a, reason: collision with other inner class name */
        public class C0402a extends com.google.common.collect.c<E> {

            /* renamed from: c, reason: collision with root package name */
            public final Iterator<? extends E> f33770c;

            /* renamed from: d, reason: collision with root package name */
            public final Iterator<? extends E> f33771d;

            public C0402a() {
                this.f33770c = a.this.f33768a.iterator();
                this.f33771d = a.this.f33769b.iterator();
            }

            @Override // com.google.common.collect.c
            @CheckForNull
            public E a() {
                if (this.f33770c.hasNext()) {
                    return this.f33770c.next();
                }
                while (this.f33771d.hasNext()) {
                    E next = this.f33771d.next();
                    if (!a.this.f33768a.contains(next)) {
                        return next;
                    }
                }
                return b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(final Set val$set1, final Set val$set2) {
            super(null);
            this.f33768a = val$set1;
            this.f33769b = val$set2;
        }

        @Override // com.google.common.collect.q8.m
        public <S extends Set<E>> S a(S set) {
            set.addAll(this.f33768a);
            set.addAll(this.f33769b);
            return set;
        }

        @Override // com.google.common.collect.q8.m
        public ImmutableSet<E> b() {
            return new ImmutableSet.a().c(this.f33768a).c(this.f33769b).e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object object) {
            return this.f33768a.contains(object) || this.f33769b.contains(object);
        }

        @Override // com.google.common.collect.q8.m, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public aa<E> iterator() {
            return new C0402a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f33768a.isEmpty() && this.f33769b.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int size = this.f33768a.size();
            Iterator<E> it = this.f33769b.iterator();
            while (it.hasNext()) {
                if (!this.f33768a.contains(it.next())) {
                    size++;
                }
            }
            return size;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b<E> extends m<E> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Set f33773a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Set f33774b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends com.google.common.collect.c<E> {

            /* renamed from: c, reason: collision with root package name */
            public final Iterator<E> f33775c;

            public a() {
                this.f33775c = b.this.f33773a.iterator();
            }

            @Override // com.google.common.collect.c
            @CheckForNull
            public E a() {
                while (this.f33775c.hasNext()) {
                    E next = this.f33775c.next();
                    if (b.this.f33774b.contains(next)) {
                        return next;
                    }
                }
                return b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(final Set val$set1, final Set val$set2) {
            super(null);
            this.f33773a = val$set1;
            this.f33774b = val$set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object object) {
            return this.f33773a.contains(object) && this.f33774b.contains(object);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return this.f33773a.containsAll(collection) && this.f33774b.containsAll(collection);
        }

        @Override // com.google.common.collect.q8.m, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: d */
        public aa<E> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f33774b, this.f33773a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = this.f33773a.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                if (this.f33774b.contains(it.next())) {
                    i11++;
                }
            }
            return i11;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c<E> extends m<E> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Set f33777a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Set f33778b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends com.google.common.collect.c<E> {

            /* renamed from: c, reason: collision with root package name */
            public final Iterator<E> f33779c;

            public a() {
                this.f33779c = c.this.f33777a.iterator();
            }

            @Override // com.google.common.collect.c
            @CheckForNull
            public E a() {
                while (this.f33779c.hasNext()) {
                    E next = this.f33779c.next();
                    if (!c.this.f33778b.contains(next)) {
                        return next;
                    }
                }
                return b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(final Set val$set1, final Set val$set2) {
            super(null);
            this.f33777a = val$set1;
            this.f33778b = val$set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object element) {
            return this.f33777a.contains(element) && !this.f33778b.contains(element);
        }

        @Override // com.google.common.collect.q8.m, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: d */
        public aa<E> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f33778b.containsAll(this.f33777a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = this.f33777a.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                if (!this.f33778b.contains(it.next())) {
                    i11++;
                }
            }
            return i11;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d<E> extends m<E> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Set f33781a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Set f33782b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends com.google.common.collect.c<E> {

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Iterator f33783c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Iterator f33784d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ d f33785e;

            public a(final d this$0, final Iterator val$itr1, final Iterator val$itr2) {
                this.f33783c = val$itr1;
                this.f33784d = val$itr2;
                this.f33785e = this$0;
            }

            @Override // com.google.common.collect.c
            @CheckForNull
            public E a() {
                while (this.f33783c.hasNext()) {
                    E e11 = (E) this.f33783c.next();
                    if (!this.f33785e.f33782b.contains(e11)) {
                        return e11;
                    }
                }
                while (this.f33784d.hasNext()) {
                    E e12 = (E) this.f33784d.next();
                    if (!this.f33785e.f33781a.contains(e12)) {
                        return e12;
                    }
                }
                return b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(final Set val$set1, final Set val$set2) {
            super(null);
            this.f33781a = val$set1;
            this.f33782b = val$set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object element) {
            return this.f33782b.contains(element) ^ this.f33781a.contains(element);
        }

        @Override // com.google.common.collect.q8.m, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: d */
        public aa<E> iterator() {
            return new a(this, this.f33781a.iterator(), this.f33782b.iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f33781a.equals(this.f33782b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = this.f33781a.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                if (!this.f33782b.contains(it.next())) {
                    i11++;
                }
            }
            Iterator<E> it2 = this.f33782b.iterator();
            while (it2.hasNext()) {
                if (!this.f33781a.contains(it2.next())) {
                    i11++;
                }
            }
            return i11;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e<E> extends AbstractSet<Set<E>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f33786a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ImmutableMap f33787b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends com.google.common.collect.c<Set<E>> {

            /* renamed from: c, reason: collision with root package name */
            public final BitSet f33788c;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: com.google.common.collect.q8$e$a$a, reason: collision with other inner class name */
            public class C0403a extends AbstractSet<E> {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ BitSet f33790a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f33791b;

                /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                /* renamed from: com.google.common.collect.q8$e$a$a$a, reason: collision with other inner class name */
                public class C0404a extends com.google.common.collect.c<E> {

                    /* renamed from: c, reason: collision with root package name */
                    public int f33792c = -1;

                    public C0404a() {
                    }

                    @Override // com.google.common.collect.c
                    @CheckForNull
                    public E a() {
                        int nextSetBit = C0403a.this.f33790a.nextSetBit(this.f33792c + 1);
                        this.f33792c = nextSetBit;
                        return nextSetBit == -1 ? b() : e.this.f33787b.keySet().asList().get(this.f33792c);
                    }
                }

                public C0403a(final a this$1, final BitSet val$copy) {
                    this.f33790a = val$copy;
                    this.f33791b = this$1;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean contains(@CheckForNull Object o11) {
                    Integer num = (Integer) e.this.f33787b.get(o11);
                    return num != null && this.f33790a.get(num.intValue());
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<E> iterator() {
                    return new C0404a();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                    return e.this.f33786a;
                }
            }

            public a() {
                this.f33788c = new BitSet(e.this.f33787b.size());
            }

            @Override // com.google.common.collect.c
            @CheckForNull
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public Set<E> a() {
                if (this.f33788c.isEmpty()) {
                    this.f33788c.set(0, e.this.f33786a);
                } else {
                    int nextSetBit = this.f33788c.nextSetBit(0);
                    int nextClearBit = this.f33788c.nextClearBit(nextSetBit);
                    if (nextClearBit == e.this.f33787b.size()) {
                        return b();
                    }
                    int i11 = (nextClearBit - nextSetBit) - 1;
                    this.f33788c.set(0, i11);
                    this.f33788c.clear(i11, nextClearBit);
                    this.f33788c.set(nextClearBit);
                }
                return new C0403a(this, (BitSet) this.f33788c.clone());
            }
        }

        public e(final int val$size, final ImmutableMap val$index) {
            this.f33786a = val$size;
            this.f33787b = val$index;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object o11) {
            if (o11 instanceof Set) {
                Set set = (Set) o11;
                if (set.size() == this.f33786a && this.f33787b.keySet().containsAll(set)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Set<E>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return com.google.common.math.f.a(this.f33787b.size(), this.f33786a);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return "Sets.combinations(" + this.f33787b.keySet() + org.junit.jupiter.api.j2.O + this.f33786a + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f<E> extends l4<List<E>> implements Set<List<E>> {

        /* renamed from: a, reason: collision with root package name */
        public final transient ImmutableList<ImmutableSet<E>> f33794a;

        /* renamed from: b, reason: collision with root package name */
        public final transient w<E> f33795b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends ImmutableList<List<E>> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ImmutableList f33796a;

            public a(final ImmutableList val$axes) {
                this.f33796a = val$axes;
            }

            @Override // java.util.List
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public List<E> get(int i11) {
                return ((ImmutableSet) this.f33796a.get(i11)).asList();
            }

            @Override // com.google.common.collect.ImmutableCollection
            public boolean isPartialView() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return this.f33796a.size();
            }

            @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
            @go.d
            @go.c
            public Object writeReplace() {
                return super.writeReplace();
            }
        }

        public f(ImmutableList<ImmutableSet<E>> axes, w<E> delegate) {
            this.f33794a = axes;
            this.f33795b = delegate;
        }

        public static <E> Set<List<E>> w(List<? extends Set<? extends E>> sets) {
            ImmutableList.a aVar = new ImmutableList.a(sets.size());
            Iterator<? extends Set<? extends E>> it = sets.iterator();
            while (it.hasNext()) {
                ImmutableSet copyOf = ImmutableSet.copyOf((Collection) it.next());
                if (copyOf.isEmpty()) {
                    return ImmutableSet.of();
                }
                aVar.g(copyOf);
            }
            ImmutableList<E> e11 = aVar.e();
            return new f(e11, new w(new a(e11)));
        }

        @Override // com.google.common.collect.l4, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object object) {
            if (!(object instanceof List)) {
                return false;
            }
            List list = (List) object;
            if (list.size() != this.f33794a.size()) {
                return false;
            }
            Iterator<E> it = list.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                if (!this.f33794a.get(i11).contains(it.next())) {
                    return false;
                }
                i11++;
            }
            return true;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@CheckForNull Object object) {
            if (object instanceof f) {
                return this.f33794a.equals(((f) object).f33794a);
            }
            if (object instanceof Set) {
                Set set = (Set) object;
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            int i11 = 1;
            int size = size() - 1;
            for (int i12 = 0; i12 < this.f33794a.size(); i12++) {
                size = ~(~(size * 31));
            }
            aa<ImmutableSet<E>> it = this.f33794a.iterator();
            while (it.hasNext()) {
                ImmutableSet<E> next = it.next();
                i11 = ~(~((i11 * 31) + ((size() / next.size()) * next.hashCode())));
            }
            return ~(~(i11 + size));
        }

        @Override // com.google.common.collect.l4, com.google.common.collect.c5
        public Collection<List<E>> delegate() {
            return this.f33795b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.c
    public static class g<E> extends b5<E> {

        /* renamed from: a, reason: collision with root package name */
        public final NavigableSet<E> f33797a;

        public g(NavigableSet<E> forward) {
            this.f33797a = forward;
        }

        public static <T> s7<T> L(Comparator<T> forward) {
            return s7.i(forward).F();
        }

        @Override // com.google.common.collect.b5, java.util.NavigableSet
        @CheckForNull
        public E ceiling(@t7 E e11) {
            return this.f33797a.floor(e11);
        }

        @Override // com.google.common.collect.i5, java.util.SortedSet
        public Comparator<? super E> comparator() {
            Comparator<? super E> comparator = this.f33797a.comparator();
            return comparator == null ? s7.z().F() : L(comparator);
        }

        @Override // com.google.common.collect.b5, java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return this.f33797a.iterator();
        }

        @Override // com.google.common.collect.b5, java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return this.f33797a;
        }

        @Override // com.google.common.collect.i5, java.util.SortedSet
        @t7
        public E first() {
            return this.f33797a.last();
        }

        @Override // com.google.common.collect.b5, java.util.NavigableSet
        @CheckForNull
        public E floor(@t7 E e11) {
            return this.f33797a.ceiling(e11);
        }

        @Override // com.google.common.collect.b5, java.util.NavigableSet
        public NavigableSet<E> headSet(@t7 E toElement, boolean inclusive) {
            return this.f33797a.tailSet(toElement, inclusive).descendingSet();
        }

        @Override // com.google.common.collect.b5, java.util.NavigableSet
        @CheckForNull
        public E higher(@t7 E e11) {
            return this.f33797a.lower(e11);
        }

        @Override // com.google.common.collect.l4, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return this.f33797a.descendingIterator();
        }

        @Override // com.google.common.collect.i5, java.util.SortedSet
        @t7
        public E last() {
            return this.f33797a.first();
        }

        @Override // com.google.common.collect.b5, java.util.NavigableSet
        @CheckForNull
        public E lower(@t7 E e11) {
            return this.f33797a.higher(e11);
        }

        @Override // com.google.common.collect.b5, java.util.NavigableSet
        @CheckForNull
        public E pollFirst() {
            return this.f33797a.pollLast();
        }

        @Override // com.google.common.collect.b5, java.util.NavigableSet
        @CheckForNull
        public E pollLast() {
            return this.f33797a.pollFirst();
        }

        @Override // com.google.common.collect.b5, java.util.NavigableSet
        public NavigableSet<E> subSet(@t7 E fromElement, boolean fromInclusive, @t7 E toElement, boolean toInclusive) {
            return this.f33797a.subSet(toElement, toInclusive, fromElement, fromInclusive).descendingSet();
        }

        @Override // com.google.common.collect.b5, java.util.NavigableSet
        public NavigableSet<E> tailSet(@t7 E fromElement, boolean inclusive) {
            return this.f33797a.headSet(fromElement, inclusive).descendingSet();
        }

        @Override // com.google.common.collect.l4, java.util.Collection
        public Object[] toArray() {
            return standardToArray();
        }

        @Override // com.google.common.collect.c5
        public String toString() {
            return standardToString();
        }

        @Override // com.google.common.collect.b5, com.google.common.collect.i5
        /* renamed from: y, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet<E> delegate() {
            return this.f33797a;
        }

        @Override // com.google.common.collect.i5, java.util.SortedSet
        public SortedSet<E> headSet(@t7 E toElement) {
            return C(toElement);
        }

        @Override // com.google.common.collect.i5, java.util.SortedSet
        public SortedSet<E> subSet(@t7 E fromElement, @t7 E toElement) {
            return x(fromElement, toElement);
        }

        @Override // com.google.common.collect.i5, java.util.SortedSet
        public SortedSet<E> tailSet(@t7 E fromElement) {
            return K(fromElement);
        }

        @Override // com.google.common.collect.l4, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) standardToArray(tArr);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.c
    public static class h<E> extends j<E> implements NavigableSet<E> {
        public h(NavigableSet<E> unfiltered, ho.i0<? super E> predicate) {
            super(unfiltered, predicate);
        }

        public NavigableSet<E> b() {
            return (NavigableSet) this.f34089a;
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E ceiling(@t7 E e11) {
            return (E) k6.r(b().tailSet(e11, true), this.f34090b, null);
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return l6.w(b().descendingIterator(), this.f34090b);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return q8.h(b().descendingSet(), this.f34090b);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E floor(@t7 E e11) {
            return (E) l6.z(b().headSet(e11, true).descendingIterator(), this.f34090b, null);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(@t7 E toElement, boolean inclusive) {
            return q8.h(b().headSet(toElement, inclusive), this.f34090b);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E higher(@t7 E e11) {
            return (E) k6.r(b().tailSet(e11, false), this.f34090b, null);
        }

        @Override // com.google.common.collect.q8.j, java.util.SortedSet
        @t7
        public E last() {
            return (E) l6.y(b().descendingIterator(), this.f34090b);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E lower(@t7 E e11) {
            return (E) l6.z(b().headSet(e11, false).descendingIterator(), this.f34090b, null);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E pollFirst() {
            return (E) k6.I(b(), this.f34090b);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E pollLast() {
            return (E) k6.I(b().descendingSet(), this.f34090b);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(@t7 E fromElement, boolean fromInclusive, @t7 E toElement, boolean toInclusive) {
            return q8.h(b().subSet(fromElement, fromInclusive, toElement, toInclusive), this.f34090b);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(@t7 E fromElement, boolean inclusive) {
            return q8.h(b().tailSet(fromElement, inclusive), this.f34090b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class i<E> extends y2.a<E> implements Set<E> {
        public i(Set<E> unfiltered, ho.i0<? super E> predicate) {
            super(unfiltered, predicate);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@CheckForNull Object object) {
            return q8.g(this, object);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return q8.k(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class j<E> extends i<E> implements SortedSet<E> {
        public j(SortedSet<E> unfiltered, ho.i0<? super E> predicate) {
            super(unfiltered, predicate);
        }

        @Override // java.util.SortedSet
        @CheckForNull
        public Comparator<? super E> comparator() {
            return ((SortedSet) this.f34089a).comparator();
        }

        @Override // java.util.SortedSet
        @t7
        public E first() {
            return (E) l6.y(this.f34089a.iterator(), this.f34090b);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(@t7 E toElement) {
            return new j(((SortedSet) this.f34089a).headSet(toElement), this.f34090b);
        }

        @t7
        public E last() {
            SortedSet sortedSet = (SortedSet) this.f34089a;
            while (true) {
                E e11 = (Object) sortedSet.last();
                if (this.f34090b.apply(e11)) {
                    return e11;
                }
                sortedSet = sortedSet.headSet(e11);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(@t7 E fromElement, @t7 E toElement) {
            return new j(((SortedSet) this.f34089a).subSet(fromElement, toElement), this.f34090b);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(@t7 E fromElement) {
            return new j(((SortedSet) this.f34089a).tailSet(fromElement), this.f34090b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class k<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> c11) {
            return q8.I(this, c11);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> c11) {
            return super.retainAll((Collection) Preconditions.checkNotNull(c11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class l<E> extends AbstractSet<Set<E>> {

        /* renamed from: a, reason: collision with root package name */
        public final ImmutableMap<E, Integer> f33798a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends com.google.common.collect.b<Set<E>> {
            public a(int size) {
                super(size);
            }

            @Override // com.google.common.collect.b
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Set<E> a(final int setBits) {
                return new n(l.this.f33798a, setBits);
            }
        }

        public l(Set<E> input) {
            Preconditions.checkArgument(input.size() <= 30, "Too many elements to create power set: %s > 30", input.size());
            this.f33798a = u6.Q(input);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof Set)) {
                return false;
            }
            return this.f33798a.keySet().containsAll((Set) obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(@CheckForNull Object obj) {
            return obj instanceof l ? this.f33798a.keySet().equals(((l) obj).f33798a.keySet()) : super.equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return this.f33798a.keySet().hashCode() << (this.f33798a.size() - 1);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Set<E>> iterator() {
            return new a(size());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return 1 << this.f33798a.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return "powerSet(" + this.f33798a + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class m<E> extends AbstractSet<E> {
        public /* synthetic */ m(a aVar) {
            this();
        }

        @uo.a
        public <S extends Set<E>> S a(S set) {
            set.addAll(this);
            return set;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        @uo.e("Always throws UnsupportedOperationException")
        @uo.a
        public final boolean add(@t7 E e11) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        @uo.e("Always throws UnsupportedOperationException")
        @uo.a
        public final boolean addAll(Collection<? extends E> newElements) {
            throw new UnsupportedOperationException();
        }

        public ImmutableSet<E> b() {
            return ImmutableSet.copyOf((Collection) this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        @uo.e("Always throws UnsupportedOperationException")
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: d */
        public abstract aa<E> iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        @uo.a
        @uo.e("Always throws UnsupportedOperationException")
        public final boolean remove(@CheckForNull Object object) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        @uo.e("Always throws UnsupportedOperationException")
        @uo.a
        public final boolean removeAll(Collection<?> oldElements) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        @uo.e("Always throws UnsupportedOperationException")
        @uo.a
        public final boolean retainAll(Collection<?> elementsToKeep) {
            throw new UnsupportedOperationException();
        }

        public m() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class n<E> extends AbstractSet<E> {

        /* renamed from: a, reason: collision with root package name */
        public final ImmutableMap<E, Integer> f33800a;

        /* renamed from: b, reason: collision with root package name */
        public final int f33801b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends aa<E> {

            /* renamed from: a, reason: collision with root package name */
            public final ImmutableList<E> f33802a;

            /* renamed from: b, reason: collision with root package name */
            public int f33803b;

            public a() {
                this.f33802a = n.this.f33800a.keySet().asList();
                this.f33803b = n.this.f33801b;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f33803b != 0;
            }

            @Override // java.util.Iterator
            public E next() {
                int numberOfTrailingZeros = Integer.numberOfTrailingZeros(this.f33803b);
                if (numberOfTrailingZeros == 32) {
                    throw new NoSuchElementException();
                }
                this.f33803b &= ~(1 << numberOfTrailingZeros);
                return this.f33802a.get(numberOfTrailingZeros);
            }
        }

        public n(ImmutableMap<E, Integer> inputSet, int mask) {
            this.f33800a = inputSet;
            this.f33801b = mask;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object o11) {
            Integer num = this.f33800a.get(o11);
            if (num != null) {
                return ((1 << num.intValue()) & this.f33801b) != 0;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return Integer.bitCount(this.f33801b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class o<E> extends i5<E> implements NavigableSet<E>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final NavigableSet<E> f33805a;

        /* renamed from: b, reason: collision with root package name */
        public final SortedSet<E> f33806b;

        /* renamed from: c, reason: collision with root package name */
        @CheckForNull
        @vo.b
        public transient o<E> f33807c;

        public o(NavigableSet<E> delegate) {
            this.f33805a = (NavigableSet) Preconditions.checkNotNull(delegate);
            this.f33806b = Collections.unmodifiableSortedSet(delegate);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E ceiling(@t7 E e11) {
            return this.f33805a.ceiling(e11);
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return l6.e0(this.f33805a.descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            o<E> oVar = this.f33807c;
            if (oVar != null) {
                return oVar;
            }
            o<E> oVar2 = new o<>(this.f33805a.descendingSet());
            this.f33807c = oVar2;
            oVar2.f33807c = this;
            return oVar2;
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E floor(@t7 E e11) {
            return this.f33805a.floor(e11);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(@t7 E toElement, boolean inclusive) {
            return q8.P(this.f33805a.headSet(toElement, inclusive));
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E higher(@t7 E e11) {
            return this.f33805a.higher(e11);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E lower(@t7 E e11) {
            return this.f33805a.lower(e11);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E pollFirst() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E pollLast() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(@t7 E fromElement, boolean fromInclusive, @t7 E toElement, boolean toInclusive) {
            return q8.P(this.f33805a.subSet(fromElement, fromInclusive, toElement, toInclusive));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(@t7 E fromElement, boolean inclusive) {
            return q8.P(this.f33805a.tailSet(fromElement, inclusive));
        }

        @Override // com.google.common.collect.i5, com.google.common.collect.e5, com.google.common.collect.l4, com.google.common.collect.c5
        /* renamed from: w */
        public SortedSet<E> delegate() {
            return this.f33806b;
        }
    }

    public static <E> LinkedHashSet<E> A() {
        return new LinkedHashSet<>();
    }

    public static <E> LinkedHashSet<E> B(Iterable<? extends E> elements) {
        if (elements instanceof Collection) {
            return new LinkedHashSet<>((Collection) elements);
        }
        LinkedHashSet<E> A = A();
        k6.a(A, elements);
        return A;
    }

    public static <E> LinkedHashSet<E> C(int expectedSize) {
        return new LinkedHashSet<>(u6.o(expectedSize));
    }

    @Deprecated
    public static <E> Set<E> D(Map<E, Boolean> map) {
        return Collections.newSetFromMap(map);
    }

    public static <E extends Comparable> TreeSet<E> E() {
        return new TreeSet<>();
    }

    public static <E extends Comparable> TreeSet<E> F(Iterable<? extends E> elements) {
        TreeSet<E> E = E();
        k6.a(E, elements);
        return E;
    }

    public static <E> TreeSet<E> G(Comparator<? super E> comparator) {
        return new TreeSet<>((Comparator) Preconditions.checkNotNull(comparator));
    }

    @go.b(serializable = false)
    public static <E> Set<Set<E>> H(Set<E> set) {
        return new l(set);
    }

    public static boolean I(Set<?> set, Collection<?> collection) {
        Preconditions.checkNotNull(collection);
        if (collection instanceof j7) {
            collection = ((j7) collection).elementSet();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? J(set, collection.iterator()) : l6.U(set.iterator(), collection);
    }

    public static boolean J(Set<?> set, Iterator<?> iterator) {
        boolean z11 = false;
        while (iterator.hasNext()) {
            z11 |= set.remove(iterator.next());
        }
        return z11;
    }

    @go.c
    public static <K extends Comparable<? super K>> NavigableSet<K> K(NavigableSet<K> set, Range<K> range) {
        if (set.comparator() != null && set.comparator() != s7.z() && range.hasLowerBound() && range.hasUpperBound()) {
            Preconditions.checkArgument(set.comparator().compare(range.lowerEndpoint(), range.upperEndpoint()) <= 0, "set is using a custom comparator which is inconsistent with the natural ordering.");
        }
        if (range.hasLowerBound() && range.hasUpperBound()) {
            K lowerEndpoint = range.lowerEndpoint();
            BoundType lowerBoundType = range.lowerBoundType();
            BoundType boundType = BoundType.CLOSED;
            return set.subSet(lowerEndpoint, lowerBoundType == boundType, range.upperEndpoint(), range.upperBoundType() == boundType);
        }
        if (range.hasLowerBound()) {
            return set.tailSet(range.lowerEndpoint(), range.lowerBoundType() == BoundType.CLOSED);
        }
        if (range.hasUpperBound()) {
            return set.headSet(range.upperEndpoint(), range.upperBoundType() == BoundType.CLOSED);
        }
        return (NavigableSet) Preconditions.checkNotNull(set);
    }

    public static <E> m<E> L(final Set<? extends E> set1, final Set<? extends E> set2) {
        Preconditions.checkNotNull(set1, "set1");
        Preconditions.checkNotNull(set2, "set2");
        return new d(set1, set2);
    }

    @go.d
    @go.c
    public static <E> NavigableSet<E> M(NavigableSet<E> navigableSet) {
        return e9.q(navigableSet);
    }

    @p5
    public static <E extends Enum<E>> Collector<E, ?, ImmutableSet<E>> N() {
        return v2.J();
    }

    public static <E> m<E> O(final Set<? extends E> set1, final Set<? extends E> set2) {
        Preconditions.checkNotNull(set1, "set1");
        Preconditions.checkNotNull(set2, "set2");
        return new a(set1, set2);
    }

    public static <E> NavigableSet<E> P(NavigableSet<E> set) {
        return !(set instanceof ImmutableCollection) ? set instanceof o ? set : new o(set) : set;
    }

    public static <B> Set<List<B>> a(List<? extends Set<? extends B>> sets) {
        return f.w(sets);
    }

    @SafeVarargs
    public static <B> Set<List<B>> b(Set<? extends B>... sets) {
        return a(Arrays.asList(sets));
    }

    public static <E> Set<Set<E>> c(Set<E> set, final int size) {
        ImmutableMap Q = u6.Q(set);
        x2.b(size, g.b.f62794h);
        Preconditions.checkArgument(size <= Q.size(), "size (%s) must be <= set.size() (%s)", size, Q.size());
        return size == 0 ? ImmutableSet.of(ImmutableSet.of()) : size == Q.size() ? ImmutableSet.of(Q.keySet()) : new e(size, Q);
    }

    @go.d
    @go.c
    public static <E extends Enum<E>> EnumSet<E> d(Collection<E> collection) {
        if (collection instanceof EnumSet) {
            return EnumSet.complementOf((EnumSet) collection);
        }
        Preconditions.checkArgument(!collection.isEmpty(), "collection is empty; use the other version of this method");
        return o(collection, collection.iterator().next().getDeclaringClass());
    }

    @go.d
    @go.c
    public static <E extends Enum<E>> EnumSet<E> e(Collection<E> collection, Class<E> type) {
        Preconditions.checkNotNull(collection);
        return collection instanceof EnumSet ? EnumSet.complementOf((EnumSet) collection) : o(collection, type);
    }

    public static <E> m<E> f(final Set<E> set1, final Set<?> set2) {
        Preconditions.checkNotNull(set1, "set1");
        Preconditions.checkNotNull(set2, "set2");
        return new c(set1, set2);
    }

    public static boolean g(Set<?> s11, @CheckForNull Object object) {
        if (s11 == object) {
            return true;
        }
        if (object instanceof Set) {
            Set set = (Set) object;
            try {
                if (s11.size() == set.size()) {
                    if (s11.containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @go.c
    public static <E> NavigableSet<E> h(NavigableSet<E> unfiltered, ho.i0<? super E> predicate) {
        if (!(unfiltered instanceof i)) {
            return new h((NavigableSet) Preconditions.checkNotNull(unfiltered), (ho.i0) Preconditions.checkNotNull(predicate));
        }
        i iVar = (i) unfiltered;
        return new h((NavigableSet) iVar.f34089a, ho.j0.d(iVar.f34090b, predicate));
    }

    public static <E> Set<E> i(Set<E> unfiltered, ho.i0<? super E> predicate) {
        if (unfiltered instanceof SortedSet) {
            return j((SortedSet) unfiltered, predicate);
        }
        if (!(unfiltered instanceof i)) {
            return new i((Set) Preconditions.checkNotNull(unfiltered), (ho.i0) Preconditions.checkNotNull(predicate));
        }
        i iVar = (i) unfiltered;
        return new i((Set) iVar.f34089a, ho.j0.d(iVar.f34090b, predicate));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> SortedSet<E> j(SortedSet<E> unfiltered, ho.i0<? super E> predicate) {
        if (!(unfiltered instanceof i)) {
            return new j((SortedSet) Preconditions.checkNotNull(unfiltered), (ho.i0) Preconditions.checkNotNull(predicate));
        }
        i iVar = (i) unfiltered;
        return new j((SortedSet) iVar.f34089a, ho.j0.d(iVar.f34090b, predicate));
    }

    public static int k(Set<?> s11) {
        Iterator<?> it = s11.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i11 = ~(~(i11 + (next != null ? next.hashCode() : 0)));
        }
        return i11;
    }

    @go.b(serializable = true)
    public static <E extends Enum<E>> ImmutableSet<E> l(E anElement, E... otherElements) {
        return t5.a(EnumSet.of((Enum) anElement, (Enum[]) otherElements));
    }

    @go.b(serializable = true)
    public static <E extends Enum<E>> ImmutableSet<E> m(Iterable<E> elements) {
        if (elements instanceof t5) {
            return (t5) elements;
        }
        if (elements instanceof Collection) {
            Collection collection = (Collection) elements;
            return collection.isEmpty() ? ImmutableSet.of() : t5.a(EnumSet.copyOf(collection));
        }
        Iterator<E> it = elements.iterator();
        if (!it.hasNext()) {
            return ImmutableSet.of();
        }
        EnumSet of2 = EnumSet.of((Enum) it.next());
        l6.a(of2, it);
        return t5.a(of2);
    }

    public static <E> m<E> n(final Set<E> set1, final Set<?> set2) {
        Preconditions.checkNotNull(set1, "set1");
        Preconditions.checkNotNull(set2, "set2");
        return new b(set1, set2);
    }

    @go.d
    @go.c
    public static <E extends Enum<E>> EnumSet<E> o(Collection<E> collection, Class<E> type) {
        EnumSet<E> allOf = EnumSet.allOf(type);
        allOf.removeAll(collection);
        return allOf;
    }

    public static <E> Set<E> p() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static <E> Set<E> q(Iterable<? extends E> elements) {
        Set<E> p11 = p();
        k6.a(p11, elements);
        return p11;
    }

    @go.d
    @go.c
    public static <E> CopyOnWriteArraySet<E> r() {
        return new CopyOnWriteArraySet<>();
    }

    @go.d
    @go.c
    public static <E> CopyOnWriteArraySet<E> s(Iterable<? extends E> elements) {
        return new CopyOnWriteArraySet<>(elements instanceof Collection ? (Collection) elements : q6.r(elements));
    }

    public static <E extends Enum<E>> EnumSet<E> t(Iterable<E> iterable, Class<E> elementType) {
        EnumSet<E> noneOf = EnumSet.noneOf(elementType);
        k6.a(noneOf, iterable);
        return noneOf;
    }

    public static <E> HashSet<E> u() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> v(Iterable<? extends E> elements) {
        return elements instanceof Collection ? new HashSet<>((Collection) elements) : w(elements.iterator());
    }

    public static <E> HashSet<E> w(Iterator<? extends E> elements) {
        HashSet<E> u11 = u();
        l6.a(u11, elements);
        return u11;
    }

    public static <E> HashSet<E> x(E... elements) {
        HashSet<E> y11 = y(elements.length);
        Collections.addAll(y11, elements);
        return y11;
    }

    public static <E> HashSet<E> y(int expectedSize) {
        return new HashSet<>(u6.o(expectedSize));
    }

    public static <E> Set<E> z() {
        return Collections.newSetFromMap(u6.b0());
    }
}
