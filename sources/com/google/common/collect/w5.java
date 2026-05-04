package com.google.common.collect;

import java.io.Serializable;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true)
/* loaded from: classes7.dex */
public final class w5<K, V> extends ImmutableCollection<V> {

    /* renamed from: a, reason: collision with root package name */
    public final ImmutableMap<K, V> f34080a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends aa<V> {

        /* renamed from: a, reason: collision with root package name */
        public final aa<Map.Entry<K, V>> f34081a;

        public a() {
            this.f34081a = w5.this.f34080a.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f34081a.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            return this.f34081a.next().getValue();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends ImmutableList<V> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ImmutableList f34083a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ w5 f34084b;

        public b(final w5 this$0, final ImmutableList val$entryList) {
            this.f34083a = val$entryList;
            this.f34084b = this$0;
        }

        @Override // java.util.List
        public V get(int i11) {
            return (V) ((Map.Entry) this.f34083a.get(i11)).getValue();
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f34083a.size();
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        @go.d
        @go.c
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.d
    @go.c
    public static class c<V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final ImmutableMap<?, V> f34085a;

        public c(ImmutableMap<?, V> map) {
            this.f34085a = map;
        }

        public Object readResolve() {
            return this.f34085a.values();
        }
    }

    public w5(ImmutableMap<K, V> map) {
        this.f34080a = map;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<V> asList() {
        return new b(this, this.f34080a.entrySet().asList());
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@CheckForNull Object object) {
        return object != null && l6.p(iterator(), object);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f34080a.size();
    }

    @Override // com.google.common.collect.ImmutableCollection
    @go.c
    public Object writeReplace() {
        return new c(this.f34080a);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public aa<V> iterator() {
        return new a();
    }
}
