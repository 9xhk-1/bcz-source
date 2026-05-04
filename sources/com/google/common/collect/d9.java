package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.f9;
import com.google.common.collect.q8;
import com.google.common.collect.u6;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public class d9<R, C, V> extends q<R, C, V> implements Serializable {
    private static final long serialVersionUID = 0;

    @m5
    final Map<R, Map<C, V>> backingMap;

    @CheckForNull
    @vo.b
    private transient Set<C> columnKeySet;

    @CheckForNull
    @vo.b
    private transient d9<R, C, V>.f columnMap;

    @m5
    final ho.p0<? extends Map<C, V>> factory;

    @CheckForNull
    @vo.b
    private transient Map<R, Map<C, V>> rowMap;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Iterator<f9.a<R, C, V>> {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator<Map.Entry<R, Map<C, V>>> f33331a;

        /* renamed from: b, reason: collision with root package name */
        @CheckForNull
        public Map.Entry<R, Map<C, V>> f33332b;

        /* renamed from: c, reason: collision with root package name */
        public Iterator<Map.Entry<C, V>> f33333c;

        public b() {
            this.f33331a = d9.this.backingMap.entrySet().iterator();
            this.f33333c = l6.v();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f9.a<R, C, V> next() {
            if (!this.f33333c.hasNext()) {
                Map.Entry<R, Map<C, V>> next = this.f33331a.next();
                this.f33332b = next;
                this.f33333c = next.getValue().entrySet().iterator();
            }
            Objects.requireNonNull(this.f33332b);
            Map.Entry<C, V> next2 = this.f33333c.next();
            return s9.d(this.f33332b.getKey(), next2.getKey(), next2.getValue());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33331a.hasNext() || this.f33333c.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f33333c.remove();
            Map.Entry<R, Map<C, V>> entry = this.f33332b;
            Objects.requireNonNull(entry);
            if (entry.getValue().isEmpty()) {
                this.f33331a.remove();
                this.f33332b = null;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends u6.r0<R, V> {

        /* renamed from: d, reason: collision with root package name */
        public final C f33335d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends q8.k<Map.Entry<R, V>> {
            public a() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public void clear() {
                c.this.h(ho.j0.c());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@CheckForNull Object o11) {
                if (!(o11 instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) o11;
                return d9.this.a(entry.getKey(), c.this.f33335d, entry.getValue());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                c cVar = c.this;
                return !d9.this.containsColumn(cVar.f33335d);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<R, V>> iterator() {
                return new b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@CheckForNull Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return d9.this.d(entry.getKey(), c.this.f33335d, entry.getValue());
            }

            @Override // com.google.common.collect.q8.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> c11) {
                return c.this.h(ho.j0.q(ho.j0.n(c11)));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                Iterator<Map<C, V>> it = d9.this.backingMap.values().iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    if (it.next().containsKey(c.this.f33335d)) {
                        i11++;
                    }
                }
                return i11;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b extends com.google.common.collect.c<Map.Entry<R, V>> {

            /* renamed from: c, reason: collision with root package name */
            public final Iterator<Map.Entry<R, Map<C, V>>> f33338c;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public class a extends com.google.common.collect.g<R, V> {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Map.Entry f33340a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b f33341b;

                public a(final b this$2, final Map.Entry val$entry) {
                    this.f33340a = val$entry;
                    this.f33341b = this$2;
                }

                @Override // com.google.common.collect.g, java.util.Map.Entry
                public R getKey() {
                    return (R) this.f33340a.getKey();
                }

                @Override // com.google.common.collect.g, java.util.Map.Entry
                public V getValue() {
                    return (V) ((Map) this.f33340a.getValue()).get(c.this.f33335d);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.collect.g, java.util.Map.Entry
                public V setValue(V v11) {
                    return (V) m7.a(((Map) this.f33340a.getValue()).put(c.this.f33335d, Preconditions.checkNotNull(v11)));
                }
            }

            public b() {
                this.f33338c = d9.this.backingMap.entrySet().iterator();
            }

            @Override // com.google.common.collect.c
            @CheckForNull
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<R, V> a() {
                while (this.f33338c.hasNext()) {
                    Map.Entry<R, Map<C, V>> next = this.f33338c.next();
                    if (next.getValue().containsKey(c.this.f33335d)) {
                        return new a(this, next);
                    }
                }
                return b();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.google.common.collect.d9$c$c, reason: collision with other inner class name */
        public class C0392c extends u6.b0<R, V> {
            public C0392c() {
                super(c.this);
            }

            @Override // com.google.common.collect.u6.b0, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@CheckForNull Object obj) {
                c cVar = c.this;
                return d9.this.contains(obj, cVar.f33335d);
            }

            @Override // com.google.common.collect.u6.b0, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@CheckForNull Object obj) {
                c cVar = c.this;
                return d9.this.remove(obj, cVar.f33335d) != null;
            }

            @Override // com.google.common.collect.q8.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(final Collection<?> c11) {
                return c.this.h(u6.U(ho.j0.q(ho.j0.n(c11))));
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class d extends u6.q0<R, V> {
            public d() {
                super(c.this);
            }

            @Override // com.google.common.collect.u6.q0, java.util.AbstractCollection, java.util.Collection
            public boolean remove(@CheckForNull Object obj) {
                return obj != null && c.this.h(u6.T0(ho.j0.m(obj)));
            }

            @Override // com.google.common.collect.u6.q0, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(final Collection<?> c11) {
                return c.this.h(u6.T0(ho.j0.n(c11)));
            }

            @Override // com.google.common.collect.u6.q0, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(final Collection<?> c11) {
                return c.this.h(u6.T0(ho.j0.q(ho.j0.n(c11))));
            }
        }

        public c(C c11) {
            this.f33335d = (C) Preconditions.checkNotNull(c11);
        }

        @Override // com.google.common.collect.u6.r0
        public Set<Map.Entry<R, V>> b() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object key) {
            return d9.this.contains(key, this.f33335d);
        }

        @Override // com.google.common.collect.u6.r0
        /* renamed from: d */
        public Set<R> k() {
            return new C0392c();
        }

        @Override // com.google.common.collect.u6.r0
        public Collection<V> g() {
            return new d();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V get(@CheckForNull Object obj) {
            return (V) d9.this.get(obj, this.f33335d);
        }

        @uo.a
        public boolean h(ho.i0<? super Map.Entry<R, V>> predicate) {
            Iterator<Map.Entry<R, Map<C, V>>> it = d9.this.backingMap.entrySet().iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                Map.Entry<R, Map<C, V>> next = it.next();
                Map<C, V> value = next.getValue();
                V v11 = value.get(this.f33335d);
                if (v11 != null && predicate.apply(u6.O(next.getKey(), v11))) {
                    value.remove(this.f33335d);
                    if (value.isEmpty()) {
                        it.remove();
                    }
                    z11 = true;
                }
            }
            return z11;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V put(R r11, V v11) {
            return (V) d9.this.put(r11, this.f33335d, v11);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V remove(@CheckForNull Object obj) {
            return (V) d9.this.remove(obj, this.f33335d);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends com.google.common.collect.c<C> {

        /* renamed from: c, reason: collision with root package name */
        public final Map<C, V> f33344c;

        /* renamed from: d, reason: collision with root package name */
        public final Iterator<Map<C, V>> f33345d;

        /* renamed from: e, reason: collision with root package name */
        public Iterator<Map.Entry<C, V>> f33346e;

        public d() {
            this.f33344c = d9.this.factory.get();
            this.f33345d = d9.this.backingMap.values().iterator();
            this.f33346e = l6.t();
        }

        @Override // com.google.common.collect.c
        @CheckForNull
        public C a() {
            while (true) {
                if (this.f33346e.hasNext()) {
                    Map.Entry<C, V> next = this.f33346e.next();
                    if (!this.f33344c.containsKey(next.getKey())) {
                        this.f33344c.put(next.getKey(), next.getValue());
                        return next.getKey();
                    }
                } else {
                    if (!this.f33345d.hasNext()) {
                        return b();
                    }
                    this.f33346e = this.f33345d.next().entrySet().iterator();
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends d9<R, C, V>.i<C> {
        public e() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return d9.this.containsColumn(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<C> iterator() {
            return d9.this.createColumnKeyIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            boolean z11 = false;
            if (obj == null) {
                return false;
            }
            Iterator<Map<C, V>> it = d9.this.backingMap.values().iterator();
            while (it.hasNext()) {
                Map<C, V> next = it.next();
                if (next.keySet().remove(obj)) {
                    if (next.isEmpty()) {
                        it.remove();
                    }
                    z11 = true;
                }
            }
            return z11;
        }

        @Override // com.google.common.collect.q8.k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> c11) {
            Preconditions.checkNotNull(c11);
            Iterator<Map<C, V>> it = d9.this.backingMap.values().iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                Map<C, V> next = it.next();
                if (l6.U(next.keySet().iterator(), c11)) {
                    if (next.isEmpty()) {
                        it.remove();
                    }
                    z11 = true;
                }
            }
            return z11;
        }

        @Override // com.google.common.collect.q8.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> c11) {
            Preconditions.checkNotNull(c11);
            Iterator<Map<C, V>> it = d9.this.backingMap.values().iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                Map<C, V> next = it.next();
                if (next.keySet().retainAll(c11)) {
                    if (next.isEmpty()) {
                        it.remove();
                    }
                    z11 = true;
                }
            }
            return z11;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return l6.Y(iterator());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f extends u6.r0<C, Map<R, V>> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public final class a extends d9<R, C, V>.i<Map.Entry<C, Map<R, V>>> {

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: com.google.common.collect.d9$f$a$a, reason: collision with other inner class name */
            public class C0393a implements ho.r<C, Map<R, V>> {
                public C0393a() {
                }

                @Override // ho.r
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public Map<R, V> apply(C columnKey) {
                    return d9.this.column(columnKey);
                }
            }

            public a() {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@CheckForNull Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (!d9.this.containsColumn(entry.getKey())) {
                    return false;
                }
                Map<R, V> map = f.this.get(entry.getKey());
                Objects.requireNonNull(map);
                return map.equals(entry.getValue());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<C, Map<R, V>>> iterator() {
                return u6.m(d9.this.columnKeySet(), new C0393a());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@CheckForNull Object obj) {
                if (!contains(obj) || !(obj instanceof Map.Entry)) {
                    return false;
                }
                d9.this.c(((Map.Entry) obj).getKey());
                return true;
            }

            @Override // com.google.common.collect.q8.k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> c11) {
                Preconditions.checkNotNull(c11);
                return q8.J(this, c11.iterator());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.q8.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> c11) {
                Preconditions.checkNotNull(c11);
                Iterator it = q6.s(d9.this.columnKeySet().iterator()).iterator();
                boolean z11 = false;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!c11.contains(u6.O(next, d9.this.column(next)))) {
                        d9.this.c(next);
                        z11 = true;
                    }
                }
                return z11;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return d9.this.columnKeySet().size();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b extends u6.q0<C, Map<R, V>> {
            public b() {
                super(f.this);
            }

            @Override // com.google.common.collect.u6.q0, java.util.AbstractCollection, java.util.Collection
            public boolean remove(@CheckForNull Object obj) {
                for (Map.Entry<C, Map<R, V>> entry : f.this.entrySet()) {
                    if (entry.getValue().equals(obj)) {
                        d9.this.c(entry.getKey());
                        return true;
                    }
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.u6.q0, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection<?> c11) {
                Preconditions.checkNotNull(c11);
                Iterator it = q6.s(d9.this.columnKeySet().iterator()).iterator();
                boolean z11 = false;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (c11.contains(d9.this.column(next))) {
                        d9.this.c(next);
                        z11 = true;
                    }
                }
                return z11;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.u6.q0, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection<?> c11) {
                Preconditions.checkNotNull(c11);
                Iterator it = q6.s(d9.this.columnKeySet().iterator()).iterator();
                boolean z11 = false;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!c11.contains(d9.this.column(next))) {
                        d9.this.c(next);
                        z11 = true;
                    }
                }
                return z11;
            }
        }

        public f() {
        }

        @Override // com.google.common.collect.u6.r0
        public Set<Map.Entry<C, Map<R, V>>> b() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object key) {
            return d9.this.containsColumn(key);
        }

        @Override // com.google.common.collect.u6.r0
        public Collection<Map<R, V>> g() {
            return new b();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Map<R, V> get(@CheckForNull Object key) {
            if (!d9.this.containsColumn(key)) {
                return null;
            }
            d9 d9Var = d9.this;
            Objects.requireNonNull(key);
            return d9Var.column(key);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Map<R, V> remove(@CheckForNull Object key) {
            if (d9.this.containsColumn(key)) {
                return d9.this.c(key);
            }
            return null;
        }

        @Override // com.google.common.collect.u6.r0, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* renamed from: keySet */
        public Set<C> l() {
            return d9.this.columnKeySet();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g extends u6.a0<C, V> {

        /* renamed from: a, reason: collision with root package name */
        public final R f33353a;

        /* renamed from: b, reason: collision with root package name */
        @CheckForNull
        public Map<C, V> f33354b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Iterator<Map.Entry<C, V>> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Iterator f33356a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f33357b;

            public a(final g this$1, final Iterator val$iterator) {
                this.f33356a = val$iterator;
                this.f33357b = this$1;
            }

            @Override // java.util.Iterator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<C, V> next() {
                return this.f33357b.i((Map.Entry) this.f33356a.next());
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f33356a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f33356a.remove();
                this.f33357b.g();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b extends x4<C, V> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Map.Entry f33358a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f33359b;

            public b(final g this$1, final Map.Entry val$entry) {
                this.f33358a = val$entry;
                this.f33359b = this$1;
            }

            @Override // com.google.common.collect.x4, java.util.Map.Entry
            public boolean equals(@CheckForNull Object object) {
                return standardEquals(object);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.x4, java.util.Map.Entry
            public V setValue(V v11) {
                return (V) super.setValue(Preconditions.checkNotNull(v11));
            }

            @Override // com.google.common.collect.x4, com.google.common.collect.c5
            /* renamed from: w */
            public Map.Entry<C, V> delegate() {
                return this.f33358a;
            }
        }

        public g(R r11) {
            this.f33353a = (R) Preconditions.checkNotNull(r11);
        }

        @Override // com.google.common.collect.u6.a0
        public Iterator<Map.Entry<C, V>> b() {
            h();
            Map<C, V> map = this.f33354b;
            return map == null ? l6.v() : new a(this, map.entrySet().iterator());
        }

        @Override // com.google.common.collect.u6.a0, java.util.AbstractMap, java.util.Map
        public void clear() {
            h();
            Map<C, V> map = this.f33354b;
            if (map != null) {
                map.clear();
            }
            g();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object key) {
            Map<C, V> map;
            h();
            return (key == null || (map = this.f33354b) == null || !u6.o0(map, key)) ? false : true;
        }

        @CheckForNull
        public Map<C, V> d() {
            return d9.this.backingMap.get(this.f33353a);
        }

        public void g() {
            h();
            Map<C, V> map = this.f33354b;
            if (map == null || !map.isEmpty()) {
                return;
            }
            d9.this.backingMap.remove(this.f33353a);
            this.f33354b = null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V get(@CheckForNull Object obj) {
            Map<C, V> map;
            h();
            if (obj == null || (map = this.f33354b) == null) {
                return null;
            }
            return (V) u6.p0(map, obj);
        }

        public final void h() {
            Map<C, V> map = this.f33354b;
            if (map == null || (map.isEmpty() && d9.this.backingMap.containsKey(this.f33353a))) {
                this.f33354b = d();
            }
        }

        public Map.Entry<C, V> i(final Map.Entry<C, V> entry) {
            return new b(this, entry);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V put(C c11, V v11) {
            Preconditions.checkNotNull(c11);
            Preconditions.checkNotNull(v11);
            Map<C, V> map = this.f33354b;
            return (map == null || map.isEmpty()) ? (V) d9.this.put(this.f33353a, c11, v11) : this.f33354b.put(c11, v11);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V remove(@CheckForNull Object obj) {
            h();
            Map<C, V> map = this.f33354b;
            if (map == null) {
                return null;
            }
            V v11 = (V) u6.q0(map, obj);
            g();
            return v11;
        }

        @Override // com.google.common.collect.u6.a0, java.util.AbstractMap, java.util.Map
        public int size() {
            h();
            Map<C, V> map = this.f33354b;
            if (map == null) {
                return 0;
            }
            return map.size();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h extends u6.r0<R, Map<C, V>> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public final class a extends d9<R, C, V>.i<Map.Entry<R, Map<C, V>>> {

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: com.google.common.collect.d9$h$a$a, reason: collision with other inner class name */
            public class C0394a implements ho.r<R, Map<C, V>> {
                public C0394a() {
                }

                @Override // ho.r
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public Map<C, V> apply(R rowKey) {
                    return d9.this.row(rowKey);
                }
            }

            public a() {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@CheckForNull Object obj) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (entry.getKey() != null && (entry.getValue() instanceof Map) && y2.j(d9.this.backingMap.entrySet(), entry)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<R, Map<C, V>>> iterator() {
                return u6.m(d9.this.backingMap.keySet(), new C0394a());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@CheckForNull Object obj) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (entry.getKey() != null && (entry.getValue() instanceof Map) && d9.this.backingMap.entrySet().remove(entry)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return d9.this.backingMap.size();
            }
        }

        public h() {
        }

        @Override // com.google.common.collect.u6.r0
        public Set<Map.Entry<R, Map<C, V>>> b() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object key) {
            return d9.this.containsRow(key);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Map<C, V> get(@CheckForNull Object key) {
            if (!d9.this.containsRow(key)) {
                return null;
            }
            d9 d9Var = d9.this;
            Objects.requireNonNull(key);
            return d9Var.row(key);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Map<C, V> remove(@CheckForNull Object key) {
            if (key == null) {
                return null;
            }
            return d9.this.backingMap.remove(key);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public abstract class i<T> extends q8.k<T> {
        public i() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            d9.this.backingMap.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return d9.this.backingMap.isEmpty();
        }
    }

    public d9(Map<R, Map<C, V>> backingMap, ho.p0<? extends Map<C, V>> factory) {
        this.backingMap = backingMap;
        this.factory = factory;
    }

    public final boolean a(@CheckForNull Object rowKey, @CheckForNull Object columnKey, @CheckForNull Object value) {
        return value != null && value.equals(get(rowKey, columnKey));
    }

    public final Map<C, V> b(R rowKey) {
        Map<C, V> map = this.backingMap.get(rowKey);
        if (map != null) {
            return map;
        }
        Map<C, V> map2 = this.factory.get();
        this.backingMap.put(rowKey, map2);
        return map2;
    }

    @uo.a
    public final Map<R, V> c(@CheckForNull Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<R, Map<C, V>>> it = this.backingMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<R, Map<C, V>> next = it.next();
            V remove = next.getValue().remove(obj);
            if (remove != null) {
                linkedHashMap.put(next.getKey(), remove);
                if (next.getValue().isEmpty()) {
                    it.remove();
                }
            }
        }
        return linkedHashMap;
    }

    @Override // com.google.common.collect.q
    public Iterator<f9.a<R, C, V>> cellIterator() {
        return new b();
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    public Set<f9.a<R, C, V>> cellSet() {
        return super.cellSet();
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    public void clear() {
        this.backingMap.clear();
    }

    @Override // com.google.common.collect.f9
    public Map<R, V> column(C columnKey) {
        return new c(columnKey);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    public Set<C> columnKeySet() {
        Set<C> set = this.columnKeySet;
        if (set != null) {
            return set;
        }
        e eVar = new e();
        this.columnKeySet = eVar;
        return eVar;
    }

    @Override // com.google.common.collect.f9
    public Map<C, Map<R, V>> columnMap() {
        d9<R, C, V>.f fVar = this.columnMap;
        if (fVar != null) {
            return fVar;
        }
        d9<R, C, V>.f fVar2 = new f();
        this.columnMap = fVar2;
        return fVar2;
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    public boolean contains(@CheckForNull Object rowKey, @CheckForNull Object columnKey) {
        return (rowKey == null || columnKey == null || !super.contains(rowKey, columnKey)) ? false : true;
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    public boolean containsColumn(@CheckForNull Object columnKey) {
        if (columnKey == null) {
            return false;
        }
        Iterator<Map<C, V>> it = this.backingMap.values().iterator();
        while (it.hasNext()) {
            if (u6.o0(it.next(), columnKey)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    public boolean containsRow(@CheckForNull Object rowKey) {
        return rowKey != null && u6.o0(this.backingMap, rowKey);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    public boolean containsValue(@CheckForNull Object value) {
        return value != null && super.containsValue(value);
    }

    public Iterator<C> createColumnKeyIterator() {
        return new d();
    }

    public Map<R, Map<C, V>> createRowMap() {
        return new h();
    }

    public final boolean d(@CheckForNull Object rowKey, @CheckForNull Object columnKey, @CheckForNull Object value) {
        if (!a(rowKey, columnKey, value)) {
            return false;
        }
        remove(rowKey, columnKey);
        return true;
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    @CheckForNull
    public V get(@CheckForNull Object obj, @CheckForNull Object obj2) {
        if (obj == null || obj2 == null) {
            return null;
        }
        return (V) super.get(obj, obj2);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    public boolean isEmpty() {
        return this.backingMap.isEmpty();
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    @CheckForNull
    @uo.a
    public V put(R rowKey, C columnKey, V value) {
        Preconditions.checkNotNull(rowKey);
        Preconditions.checkNotNull(columnKey);
        Preconditions.checkNotNull(value);
        return b(rowKey).put(columnKey, value);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    @CheckForNull
    @uo.a
    public V remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Map map;
        if (obj == null || obj2 == null || (map = (Map) u6.p0(this.backingMap, obj)) == null) {
            return null;
        }
        V v11 = (V) map.remove(obj2);
        if (map.isEmpty()) {
            this.backingMap.remove(obj);
        }
        return v11;
    }

    @Override // com.google.common.collect.f9
    public Map<C, V> row(R rowKey) {
        return new g(rowKey);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    public Set<R> rowKeySet() {
        return rowMap().keySet();
    }

    @Override // com.google.common.collect.f9
    public Map<R, Map<C, V>> rowMap() {
        Map<R, Map<C, V>> map = this.rowMap;
        if (map != null) {
            return map;
        }
        Map<R, Map<C, V>> createRowMap = createRowMap();
        this.rowMap = createRowMap;
        return createRowMap;
    }

    @Override // com.google.common.collect.f9
    public int size() {
        Iterator<Map<C, V>> it = this.backingMap.values().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 += it.next().size();
        }
        return i11;
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    public Collection<V> values() {
        return super.values();
    }
}
