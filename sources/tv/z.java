package tv;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class z<T> implements h<Set<T>> {

    /* renamed from: c, reason: collision with root package name */
    public static final h<Set<Object>> f90982c = l.a(Collections.EMPTY_SET);

    /* renamed from: a, reason: collision with root package name */
    public final List<t<T>> f90983a;

    /* renamed from: b, reason: collision with root package name */
    public final List<t<Collection<T>>> f90984b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T> {

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ boolean f90985c = false;

        /* renamed from: a, reason: collision with root package name */
        public final List<t<T>> f90986a;

        /* renamed from: b, reason: collision with root package name */
        public final List<t<Collection<T>>> f90987b;

        @Deprecated
        public b<T> a(Provider<? extends Collection<? extends T>> collectionProvider) {
            return b(v.a(collectionProvider));
        }

        public b<T> b(t<? extends Collection<? extends T>> collectionProvider) {
            this.f90987b.add(collectionProvider);
            return this;
        }

        @Deprecated
        public b<T> c(Provider<? extends T> individualProvider) {
            return d(v.a(individualProvider));
        }

        public b<T> d(t<? extends T> individualProvider) {
            this.f90986a.add(individualProvider);
            return this;
        }

        public z<T> e() {
            return new z<>(this.f90986a, this.f90987b);
        }

        public b(int individualProviderSize, int collectionProviderSize) {
            this.f90986a = d.e(individualProviderSize);
            this.f90987b = d.e(collectionProviderSize);
        }
    }

    public static <T> b<T> a(int individualProviderSize, int collectionProviderSize) {
        return new b<>(individualProviderSize, collectionProviderSize);
    }

    public static <T> h<Set<T>> b() {
        return (h<Set<T>>) f90982c;
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set<T> get() {
        int size = this.f90983a.size();
        ArrayList arrayList = new ArrayList(this.f90984b.size());
        int size2 = this.f90984b.size();
        for (int i11 = 0; i11 < size2; i11++) {
            Collection<T> collection = this.f90984b.get(i11).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet c11 = d.c(size);
        int size3 = this.f90983a.size();
        for (int i12 = 0; i12 < size3; i12++) {
            c11.add(s.b(this.f90983a.get(i12).get()));
        }
        int size4 = arrayList.size();
        for (int i13 = 0; i13 < size4; i13++) {
            Iterator it = ((Collection) arrayList.get(i13)).iterator();
            while (it.hasNext()) {
                c11.add(s.b(it.next()));
            }
        }
        return Collections.unmodifiableSet(c11);
    }

    public z(List<t<T>> individualProviders, List<t<Collection<T>>> collectionProviders) {
        this.f90983a = individualProviders;
        this.f90984b = collectionProviders;
    }
}
