package zy;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.u0;
import m80.k;
import y00.h;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f {

    /* JADX INFO: Add missing generic type declarations: [Key] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nConcurrentSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentSet.kt\nio/ktor/util/collections/ConcurrentSetKt$ConcurrentSet$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,50:1\n1734#2,3:51\n1734#2,3:54\n*S KotlinDebug\n*F\n+ 1 ConcurrentSet.kt\nio/ktor/util/collections/ConcurrentSetKt$ConcurrentSet$1\n*L\n20#1:51,3\n30#1:54,3\n*E\n"})
    public static final class a<Key> implements Set<Key>, h {

        /* renamed from: a, reason: collision with root package name */
        public final d<Key, g2> f103146a = new d<>(0, 1, null);

        public int a() {
            return this.f103146a.size();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Key element) {
            g0.p(element, "element");
            if (this.f103146a.containsKey(element)) {
                return false;
            }
            this.f103146a.put(element, g2.f100423a);
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Key> elements) {
            g0.p(elements, "elements");
            Collection<? extends Key> collection = elements;
            if (collection.isEmpty()) {
                return true;
            }
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!add(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            this.f103146a.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (obj == null) {
                return false;
            }
            return this.f103146a.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            g0.p(elements, "elements");
            return elements.containsAll(this.f103146a.keySet());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return this.f103146a.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Key> iterator() {
            return this.f103146a.keySet().iterator();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            return (obj == null || this.f103146a.remove(obj) == null) ? false : true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<? extends Object> elements) {
            g0.p(elements, "elements");
            Collection<? extends Object> collection = elements;
            if (collection.isEmpty()) {
                return true;
            }
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!remove(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<? extends Object> elements) {
            g0.p(elements, "elements");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Key key : this.f103146a.keySet()) {
                if (!elements.contains(key)) {
                    linkedHashSet.add(key);
                }
            }
            return removeAll(linkedHashSet);
        }

        @Override // java.util.Set, java.util.Collection
        public final /* bridge */ int size() {
            return a();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return u.a(this);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] array) {
            g0.p(array, "array");
            return (T[]) u.b(this, array);
        }
    }

    @k
    public static final <Key> Set<Key> a() {
        return new a();
    }
}
