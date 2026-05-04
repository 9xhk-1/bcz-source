package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.j2objc.annotations.Weak;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public final class g4<K, V> extends AbstractCollection<V> {

    /* renamed from: a, reason: collision with root package name */
    @Weak
    public final f4<K, V> f33494a;

    public g4(f4<K, V> multimap) {
        this.f33494a = (f4) Preconditions.checkNotNull(multimap);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f33494a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(@CheckForNull Object o11) {
        return this.f33494a.containsValue(o11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return u6.R0(this.f33494a.entries().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(@CheckForNull Object o11) {
        ho.i0<? super Map.Entry<K, V>> m11 = this.f33494a.m();
        Iterator<Map.Entry<K, V>> it = this.f33494a.b().entries().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (m11.apply(next) && ho.d0.a(next.getValue(), o11)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<?> c11) {
        return k6.J(this.f33494a.b().entries(), ho.j0.d(this.f33494a.m(), u6.T0(ho.j0.n(c11))));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<?> c11) {
        return k6.J(this.f33494a.b().entries(), ho.j0.d(this.f33494a.m(), u6.T0(ho.j0.q(ho.j0.n(c11)))));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f33494a.size();
    }
}
