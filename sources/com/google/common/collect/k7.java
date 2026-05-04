package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.j7;
import com.google.common.collect.q8;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public final class k7 {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a<E> extends n<E> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j7 f33588a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j7 f33589b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.google.common.collect.k7$a$a, reason: collision with other inner class name */
        public class C0401a extends com.google.common.collect.c<j7.a<E>> {

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Iterator f33590c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Iterator f33591d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ a f33592e;

            public C0401a(final a this$0, final Iterator val$iterator1, final Iterator val$iterator2) {
                this.f33590c = val$iterator1;
                this.f33591d = val$iterator2;
                this.f33592e = this$0;
            }

            @Override // com.google.common.collect.c
            @CheckForNull
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public j7.a<E> a() {
                if (this.f33590c.hasNext()) {
                    j7.a aVar = (j7.a) this.f33590c.next();
                    Object e11 = aVar.e();
                    return k7.k(e11, Math.max(aVar.getCount(), this.f33592e.f33589b.count(e11)));
                }
                while (this.f33591d.hasNext()) {
                    j7.a aVar2 = (j7.a) this.f33591d.next();
                    Object e12 = aVar2.e();
                    if (!this.f33592e.f33588a.contains(e12)) {
                        return k7.k(e12, aVar2.getCount());
                    }
                }
                return b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(final j7 val$multiset1, final j7 val$multiset2) {
            super(null);
            this.f33588a = val$multiset1;
            this.f33589b = val$multiset2;
        }

        @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.j7
        public boolean contains(@CheckForNull Object element) {
            return this.f33588a.contains(element) || this.f33589b.contains(element);
        }

        @Override // com.google.common.collect.j7
        public int count(@CheckForNull Object element) {
            return Math.max(this.f33588a.count(element), this.f33589b.count(element));
        }

        @Override // com.google.common.collect.i
        public Set<E> createElementSet() {
            return q8.O(this.f33588a.elementSet(), this.f33589b.elementSet());
        }

        @Override // com.google.common.collect.i
        public Iterator<E> elementIterator() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.i
        public Iterator<j7.a<E>> entryIterator() {
            return new C0401a(this, this.f33588a.entrySet().iterator(), this.f33589b.entrySet().iterator());
        }

        @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f33588a.isEmpty() && this.f33589b.isEmpty();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b<E> extends n<E> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j7 f33593a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j7 f33594b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends com.google.common.collect.c<j7.a<E>> {

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Iterator f33595c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ b f33596d;

            public a(final b this$0, final Iterator val$iterator1) {
                this.f33595c = val$iterator1;
                this.f33596d = this$0;
            }

            @Override // com.google.common.collect.c
            @CheckForNull
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public j7.a<E> a() {
                while (this.f33595c.hasNext()) {
                    j7.a aVar = (j7.a) this.f33595c.next();
                    Object e11 = aVar.e();
                    int min = Math.min(aVar.getCount(), this.f33596d.f33594b.count(e11));
                    if (min > 0) {
                        return k7.k(e11, min);
                    }
                }
                return b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(final j7 val$multiset1, final j7 val$multiset2) {
            super(null);
            this.f33593a = val$multiset1;
            this.f33594b = val$multiset2;
        }

        @Override // com.google.common.collect.j7
        public int count(@CheckForNull Object element) {
            int count = this.f33593a.count(element);
            if (count == 0) {
                return 0;
            }
            return Math.min(count, this.f33594b.count(element));
        }

        @Override // com.google.common.collect.i
        public Set<E> createElementSet() {
            return q8.n(this.f33593a.elementSet(), this.f33594b.elementSet());
        }

        @Override // com.google.common.collect.i
        public Iterator<E> elementIterator() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.i
        public Iterator<j7.a<E>> entryIterator() {
            return new a(this, this.f33593a.entrySet().iterator());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c<E> extends n<E> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j7 f33597a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j7 f33598b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends com.google.common.collect.c<j7.a<E>> {

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Iterator f33599c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Iterator f33600d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ c f33601e;

            public a(final c this$0, final Iterator val$iterator1, final Iterator val$iterator2) {
                this.f33599c = val$iterator1;
                this.f33600d = val$iterator2;
                this.f33601e = this$0;
            }

            @Override // com.google.common.collect.c
            @CheckForNull
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public j7.a<E> a() {
                if (this.f33599c.hasNext()) {
                    j7.a aVar = (j7.a) this.f33599c.next();
                    Object e11 = aVar.e();
                    return k7.k(e11, aVar.getCount() + this.f33601e.f33598b.count(e11));
                }
                while (this.f33600d.hasNext()) {
                    j7.a aVar2 = (j7.a) this.f33600d.next();
                    Object e12 = aVar2.e();
                    if (!this.f33601e.f33597a.contains(e12)) {
                        return k7.k(e12, aVar2.getCount());
                    }
                }
                return b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(final j7 val$multiset1, final j7 val$multiset2) {
            super(null);
            this.f33597a = val$multiset1;
            this.f33598b = val$multiset2;
        }

        @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.j7
        public boolean contains(@CheckForNull Object element) {
            return this.f33597a.contains(element) || this.f33598b.contains(element);
        }

        @Override // com.google.common.collect.j7
        public int count(@CheckForNull Object element) {
            return this.f33597a.count(element) + this.f33598b.count(element);
        }

        @Override // com.google.common.collect.i
        public Set<E> createElementSet() {
            return q8.O(this.f33597a.elementSet(), this.f33598b.elementSet());
        }

        @Override // com.google.common.collect.i
        public Iterator<E> elementIterator() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.i
        public Iterator<j7.a<E>> entryIterator() {
            return new a(this, this.f33597a.entrySet().iterator(), this.f33598b.entrySet().iterator());
        }

        @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f33597a.isEmpty() && this.f33598b.isEmpty();
        }

        @Override // com.google.common.collect.k7.n, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.j7
        public int size() {
            return com.google.common.math.f.t(this.f33597a.size(), this.f33598b.size());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d<E> extends n<E> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j7 f33602a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j7 f33603b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends com.google.common.collect.c<E> {

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Iterator f33604c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ d f33605d;

            public a(final d this$0, final Iterator val$iterator1) {
                this.f33604c = val$iterator1;
                this.f33605d = this$0;
            }

            @Override // com.google.common.collect.c
            @CheckForNull
            public E a() {
                while (this.f33604c.hasNext()) {
                    j7.a aVar = (j7.a) this.f33604c.next();
                    E e11 = (E) aVar.e();
                    if (aVar.getCount() > this.f33605d.f33603b.count(e11)) {
                        return e11;
                    }
                }
                return b();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b extends com.google.common.collect.c<j7.a<E>> {

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Iterator f33606c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ d f33607d;

            public b(final d this$0, final Iterator val$iterator1) {
                this.f33606c = val$iterator1;
                this.f33607d = this$0;
            }

            @Override // com.google.common.collect.c
            @CheckForNull
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public j7.a<E> a() {
                while (this.f33606c.hasNext()) {
                    j7.a aVar = (j7.a) this.f33606c.next();
                    Object e11 = aVar.e();
                    int count = aVar.getCount() - this.f33607d.f33603b.count(e11);
                    if (count > 0) {
                        return k7.k(e11, count);
                    }
                }
                return b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(final j7 val$multiset1, final j7 val$multiset2) {
            super(null);
            this.f33602a = val$multiset1;
            this.f33603b = val$multiset2;
        }

        @Override // com.google.common.collect.k7.n, com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.j7
        public int count(@CheckForNull Object element) {
            int count = this.f33602a.count(element);
            if (count == 0) {
                return 0;
            }
            return Math.max(0, count - this.f33603b.count(element));
        }

        @Override // com.google.common.collect.k7.n, com.google.common.collect.i
        public int distinctElements() {
            return l6.Y(entryIterator());
        }

        @Override // com.google.common.collect.i
        public Iterator<E> elementIterator() {
            return new a(this, this.f33602a.entrySet().iterator());
        }

        @Override // com.google.common.collect.i
        public Iterator<j7.a<E>> entryIterator() {
            return new b(this, this.f33602a.entrySet().iterator());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e<E> extends v9<j7.a<E>, E> {
        public e(Iterator backingIterator) {
            super(backingIterator);
        }

        @Override // com.google.common.collect.v9
        @t7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public E a(j7.a<E> entry) {
            return entry.e();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class f<E> implements j7.a<E> {
        @Override // com.google.common.collect.j7.a
        public boolean equals(@CheckForNull Object object) {
            if (object instanceof j7.a) {
                j7.a aVar = (j7.a) object;
                if (getCount() == aVar.getCount() && ho.d0.a(e(), aVar.e())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.j7.a
        public int hashCode() {
            E e11 = e();
            return (e11 == null ? 0 : e11.hashCode()) ^ getCount();
        }

        @Override // com.google.common.collect.j7.a
        public String toString() {
            String valueOf = String.valueOf(e());
            int count = getCount();
            if (count == 1) {
                return valueOf;
            }
            return valueOf + " x " + count;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g implements Comparator<j7.a<?>> {

        /* renamed from: a, reason: collision with root package name */
        public static final Comparator<j7.a<?>> f33608a = new g();

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(j7.a<?> entry1, j7.a<?> entry2) {
            return entry2.getCount() - entry1.getCount();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class h<E> extends q8.k<E> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            g().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object o11) {
            return g().contains(o11);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> c11) {
            return g().containsAll(c11);
        }

        public abstract j7<E> g();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return g().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public abstract Iterator<E> iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object o11) {
            return g().remove(o11, Integer.MAX_VALUE) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return g().entrySet().size();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class i<E> extends q8.k<j7.a<E>> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            g().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object o11) {
            if (o11 instanceof j7.a) {
                j7.a aVar = (j7.a) o11;
                if (aVar.getCount() > 0 && g().count(aVar.e()) == aVar.getCount()) {
                    return true;
                }
            }
            return false;
        }

        public abstract j7<E> g();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            if (obj instanceof j7.a) {
                j7.a aVar = (j7.a) obj;
                Object e11 = aVar.e();
                int count = aVar.getCount();
                if (count != 0) {
                    return g().setCount(e11, count, 0);
                }
            }
            return false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class j<E> extends n<E> {

        /* renamed from: a, reason: collision with root package name */
        public final j7<E> f33609a;

        /* renamed from: b, reason: collision with root package name */
        public final ho.i0<? super E> f33610b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements ho.i0<j7.a<E>> {
            public a() {
            }

            @Override // ho.i0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public boolean apply(j7.a<E> entry) {
                return j.this.f33610b.apply(entry.e());
            }
        }

        public j(j7<E> unfiltered, ho.i0<? super E> predicate) {
            super(null);
            this.f33609a = (j7) Preconditions.checkNotNull(unfiltered);
            this.f33610b = (ho.i0) Preconditions.checkNotNull(predicate);
        }

        @Override // com.google.common.collect.k7.n, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.j7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public aa<E> iterator() {
            return l6.w(this.f33609a.iterator(), this.f33610b);
        }

        @Override // com.google.common.collect.i, com.google.common.collect.j7
        public int add(@t7 E element, int occurrences) {
            Preconditions.checkArgument(this.f33610b.apply(element), "Element %s does not match predicate %s", element, this.f33610b);
            return this.f33609a.add(element, occurrences);
        }

        @Override // com.google.common.collect.j7
        public int count(@CheckForNull Object element) {
            int count = this.f33609a.count(element);
            if (count <= 0 || !this.f33610b.apply(element)) {
                return 0;
            }
            return count;
        }

        @Override // com.google.common.collect.i
        public Set<E> createElementSet() {
            return q8.i(this.f33609a.elementSet(), this.f33610b);
        }

        @Override // com.google.common.collect.i
        public Set<j7.a<E>> createEntrySet() {
            return q8.i(this.f33609a.entrySet(), new a());
        }

        @Override // com.google.common.collect.i
        public Iterator<E> elementIterator() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.i
        public Iterator<j7.a<E>> entryIterator() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.i, com.google.common.collect.j7
        public int remove(@CheckForNull Object element, int occurrences) {
            x2.b(occurrences, "occurrences");
            if (occurrences == 0) {
                return count(element);
            }
            if (contains(element)) {
                return this.f33609a.remove(element, occurrences);
            }
            return 0;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class k<E> extends f<E> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        @t7
        public final E f33612a;

        /* renamed from: b, reason: collision with root package name */
        public final int f33613b;

        public k(@t7 E element, int count) {
            this.f33612a = element;
            this.f33613b = count;
            x2.b(count, "count");
        }

        @CheckForNull
        public k<E> a() {
            return null;
        }

        @Override // com.google.common.collect.j7.a
        @t7
        public final E e() {
            return this.f33612a;
        }

        @Override // com.google.common.collect.j7.a
        public final int getCount() {
            return this.f33613b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class l<E> implements Iterator<E> {

        /* renamed from: a, reason: collision with root package name */
        public final j7<E> f33614a;

        /* renamed from: b, reason: collision with root package name */
        public final Iterator<j7.a<E>> f33615b;

        /* renamed from: c, reason: collision with root package name */
        @CheckForNull
        public j7.a<E> f33616c;

        /* renamed from: d, reason: collision with root package name */
        public int f33617d;

        /* renamed from: e, reason: collision with root package name */
        public int f33618e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f33619f;

        public l(j7<E> multiset, Iterator<j7.a<E>> entryIterator) {
            this.f33614a = multiset;
            this.f33615b = entryIterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33617d > 0 || this.f33615b.hasNext();
        }

        @Override // java.util.Iterator
        @t7
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            if (this.f33617d == 0) {
                j7.a<E> next = this.f33615b.next();
                this.f33616c = next;
                int count = next.getCount();
                this.f33617d = count;
                this.f33618e = count;
            }
            this.f33617d--;
            this.f33619f = true;
            j7.a<E> aVar = this.f33616c;
            Objects.requireNonNull(aVar);
            return aVar.e();
        }

        @Override // java.util.Iterator
        public void remove() {
            x2.e(this.f33619f);
            if (this.f33618e == 1) {
                this.f33615b.remove();
            } else {
                j7<E> j7Var = this.f33614a;
                j7.a<E> aVar = this.f33616c;
                Objects.requireNonNull(aVar);
                j7Var.remove(aVar.e());
            }
            this.f33618e--;
            this.f33619f = false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class m<E> extends z4<E> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final j7<? extends E> f33620a;

        /* renamed from: b, reason: collision with root package name */
        @CheckForNull
        @vo.b
        public transient Set<E> f33621b;

        /* renamed from: c, reason: collision with root package name */
        @CheckForNull
        @vo.b
        public transient Set<j7.a<E>> f33622c;

        public m(j7<? extends E> delegate) {
            this.f33620a = delegate;
        }

        public Set<E> D() {
            return Collections.unmodifiableSet(this.f33620a.elementSet());
        }

        @Override // com.google.common.collect.l4, java.util.Collection, java.util.Queue
        public boolean add(@t7 E element) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.l4, java.util.Collection
        public boolean addAll(Collection<? extends E> elementsToAdd) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.l4, java.util.Collection, java.util.Set
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.z4, com.google.common.collect.j7
        public Set<E> elementSet() {
            Set<E> set = this.f33621b;
            if (set != null) {
                return set;
            }
            Set<E> D = D();
            this.f33621b = D;
            return D;
        }

        @Override // com.google.common.collect.z4, com.google.common.collect.j7
        public Set<j7.a<E>> entrySet() {
            Set<j7.a<E>> set = this.f33622c;
            if (set != null) {
                return set;
            }
            Set<j7.a<E>> unmodifiableSet = Collections.unmodifiableSet(this.f33620a.entrySet());
            this.f33622c = unmodifiableSet;
            return unmodifiableSet;
        }

        @Override // com.google.common.collect.l4, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return l6.e0(this.f33620a.iterator());
        }

        @Override // com.google.common.collect.l4, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object element) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.l4, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> elementsToRemove) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.l4, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> elementsToRetain) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.z4, com.google.common.collect.j7
        public int setCount(@t7 E element, int count) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.z4, com.google.common.collect.l4, com.google.common.collect.c5
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public j7<E> delegate() {
            return this.f33620a;
        }

        @Override // com.google.common.collect.z4, com.google.common.collect.j7
        public int add(@t7 E element, int occurrences) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.z4, com.google.common.collect.j7
        public int remove(@CheckForNull Object element, int occurrences) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.z4, com.google.common.collect.j7
        public boolean setCount(@t7 E element, int oldCount, int newCount) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class n<E> extends com.google.common.collect.i<E> {
        public n() {
        }

        @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            elementSet().clear();
        }

        @Override // com.google.common.collect.i
        public int distinctElements() {
            return elementSet().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.j7
        public Iterator<E> iterator() {
            return k7.n(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.j7
        public int size() {
            return k7.o(this);
        }

        public /* synthetic */ n(a aVar) {
            this();
        }
    }

    @Deprecated
    public static <E> j7<E> A(ImmutableMultiset<E> multiset) {
        return (j7) Preconditions.checkNotNull(multiset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> j7<E> B(j7<? extends E> multiset) {
        return !(multiset instanceof m) ? multiset instanceof ImmutableMultiset ? multiset : new m((j7) Preconditions.checkNotNull(multiset)) : multiset;
    }

    public static <E> x8<E> C(x8<E> sortedMultiset) {
        return new ca((x8) Preconditions.checkNotNull(sortedMultiset));
    }

    public static <E> boolean a(j7<E> self, com.google.common.collect.f<? extends E> elements) {
        if (elements.isEmpty()) {
            return false;
        }
        elements.addTo(self);
        return true;
    }

    public static <E> boolean b(j7<E> self, j7<? extends E> elements) {
        if (elements instanceof com.google.common.collect.f) {
            return a(self, (com.google.common.collect.f) elements);
        }
        if (elements.isEmpty()) {
            return false;
        }
        for (j7.a<? extends E> aVar : elements.entrySet()) {
            self.add(aVar.e(), aVar.getCount());
        }
        return true;
    }

    public static <E> boolean c(j7<E> self, Collection<? extends E> elements) {
        Preconditions.checkNotNull(self);
        Preconditions.checkNotNull(elements);
        if (elements instanceof j7) {
            return b(self, d(elements));
        }
        if (elements.isEmpty()) {
            return false;
        }
        return l6.a(self, elements.iterator());
    }

    public static <T> j7<T> d(Iterable<T> iterable) {
        return (j7) iterable;
    }

    @uo.a
    public static boolean e(j7<?> superMultiset, j7<?> subMultiset) {
        Preconditions.checkNotNull(superMultiset);
        Preconditions.checkNotNull(subMultiset);
        for (j7.a<?> aVar : subMultiset.entrySet()) {
            if (superMultiset.count(aVar.e()) < aVar.getCount()) {
                return false;
            }
        }
        return true;
    }

    public static <E> ImmutableMultiset<E> f(j7<E> multiset) {
        j7.a[] aVarArr = (j7.a[]) multiset.entrySet().toArray(new j7.a[0]);
        Arrays.sort(aVarArr, g.f33608a);
        return ImmutableMultiset.copyFromEntries(Arrays.asList(aVarArr));
    }

    public static <E> j7<E> g(final j7<E> multiset1, final j7<?> multiset2) {
        Preconditions.checkNotNull(multiset1);
        Preconditions.checkNotNull(multiset2);
        return new d(multiset1, multiset2);
    }

    public static <E> Iterator<E> h(Iterator<j7.a<E>> entryIterator) {
        return new e(entryIterator);
    }

    public static boolean i(j7<?> multiset, @CheckForNull Object object) {
        if (object == multiset) {
            return true;
        }
        if (object instanceof j7) {
            j7 j7Var = (j7) object;
            if (multiset.size() == j7Var.size() && multiset.entrySet().size() == j7Var.entrySet().size()) {
                for (j7.a aVar : j7Var.entrySet()) {
                    if (multiset.count(aVar.e()) != aVar.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static <E> j7<E> j(j7<E> unfiltered, ho.i0<? super E> predicate) {
        if (!(unfiltered instanceof j)) {
            return new j(unfiltered, predicate);
        }
        j jVar = (j) unfiltered;
        return new j(jVar.f33609a, ho.j0.d(jVar.f33610b, predicate));
    }

    public static <E> j7.a<E> k(@t7 E e11, int n11) {
        return new k(e11, n11);
    }

    public static int l(Iterable<?> elements) {
        if (elements instanceof j7) {
            return ((j7) elements).elementSet().size();
        }
        return 11;
    }

    public static <E> j7<E> m(final j7<E> multiset1, final j7<?> multiset2) {
        Preconditions.checkNotNull(multiset1);
        Preconditions.checkNotNull(multiset2);
        return new b(multiset1, multiset2);
    }

    public static <E> Iterator<E> n(j7<E> multiset) {
        return new l(multiset, multiset.entrySet().iterator());
    }

    public static int o(j7<?> multiset) {
        long j11 = 0;
        while (multiset.entrySet().iterator().hasNext()) {
            j11 += r4.next().getCount();
        }
        return ro.i.A(j11);
    }

    public static boolean p(j7<?> self, Collection<?> elementsToRemove) {
        if (elementsToRemove instanceof j7) {
            elementsToRemove = ((j7) elementsToRemove).elementSet();
        }
        return self.elementSet().removeAll(elementsToRemove);
    }

    @uo.a
    public static boolean q(j7<?> multisetToModify, j7<?> occurrencesToRemove) {
        Preconditions.checkNotNull(multisetToModify);
        Preconditions.checkNotNull(occurrencesToRemove);
        Iterator<j7.a<?>> it = multisetToModify.entrySet().iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            j7.a<?> next = it.next();
            int count = occurrencesToRemove.count(next.e());
            if (count >= next.getCount()) {
                it.remove();
            } else if (count > 0) {
                multisetToModify.remove(next.e(), count);
            }
            z11 = true;
        }
        return z11;
    }

    @uo.a
    public static boolean r(j7<?> multisetToModify, Iterable<?> occurrencesToRemove) {
        if (occurrencesToRemove instanceof j7) {
            return q(multisetToModify, (j7) occurrencesToRemove);
        }
        Preconditions.checkNotNull(multisetToModify);
        Preconditions.checkNotNull(occurrencesToRemove);
        Iterator<?> it = occurrencesToRemove.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= multisetToModify.remove(it.next());
        }
        return z11;
    }

    public static boolean s(j7<?> self, Collection<?> elementsToRetain) {
        Preconditions.checkNotNull(elementsToRetain);
        if (elementsToRetain instanceof j7) {
            elementsToRetain = ((j7) elementsToRetain).elementSet();
        }
        return self.elementSet().retainAll(elementsToRetain);
    }

    @uo.a
    public static boolean t(j7<?> multisetToModify, j7<?> multisetToRetain) {
        return u(multisetToModify, multisetToRetain);
    }

    public static <E> boolean u(j7<E> multisetToModify, j7<?> occurrencesToRetain) {
        Preconditions.checkNotNull(multisetToModify);
        Preconditions.checkNotNull(occurrencesToRetain);
        Iterator<j7.a<E>> it = multisetToModify.entrySet().iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            j7.a<E> next = it.next();
            int count = occurrencesToRetain.count(next.e());
            if (count == 0) {
                it.remove();
            } else if (count < next.getCount()) {
                multisetToModify.setCount(next.e(), count);
            }
            z11 = true;
        }
        return z11;
    }

    public static <E> int v(j7<E> self, @t7 E element, int count) {
        x2.b(count, "count");
        int count2 = self.count(element);
        int i11 = count - count2;
        if (i11 > 0) {
            self.add(element, i11);
            return count2;
        }
        if (i11 < 0) {
            self.remove(element, -i11);
        }
        return count2;
    }

    public static <E> boolean w(j7<E> self, @t7 E element, int oldCount, int newCount) {
        x2.b(oldCount, "oldCount");
        x2.b(newCount, "newCount");
        if (self.count(element) != oldCount) {
            return false;
        }
        self.setCount(element, newCount);
        return true;
    }

    public static <E> j7<E> x(final j7<? extends E> multiset1, final j7<? extends E> multiset2) {
        Preconditions.checkNotNull(multiset1);
        Preconditions.checkNotNull(multiset2);
        return new c(multiset1, multiset2);
    }

    @p5
    public static <T, E, M extends j7<E>> Collector<T, ?, M> y(Function<? super T, E> elementFunction, ToIntFunction<? super T> countFunction, Supplier<M> multisetSupplier) {
        return v2.Y(elementFunction, countFunction, multisetSupplier);
    }

    public static <E> j7<E> z(final j7<? extends E> multiset1, final j7<? extends E> multiset2) {
        Preconditions.checkNotNull(multiset1);
        Preconditions.checkNotNull(multiset2);
        return new a(multiset1, multiset2);
    }
}
