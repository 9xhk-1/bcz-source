package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class t extends AbstractList<String> implements RandomAccess, l {

    /* renamed from: a, reason: collision with root package name */
    public final l f67627a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ListIterator<String> {

        /* renamed from: a, reason: collision with root package name */
        public ListIterator<String> f67628a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f67629b;

        public a(int i11) {
            this.f67629b = i11;
            this.f67628a = t.this.f67627a.listIterator(i11);
        }

        @Override // java.util.ListIterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f67628a.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return this.f67628a.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f67628a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f67628a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f67628a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f67628a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Iterator<String> {

        /* renamed from: a, reason: collision with root package name */
        public Iterator<String> f67631a;

        public b() {
            this.f67631a = t.this.f67627a.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f67631a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f67631a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public t(l lVar) {
        this.f67627a = lVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.l
    public void E0(d dVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get(int i11) {
        return this.f67627a.get(i11);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.l
    public d getByteString(int i11) {
        return this.f67627a.getByteString(i11);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.l
    public List<?> getUnderlyingElements() {
        return this.f67627a.getUnderlyingElements();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i11) {
        return new a(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f67627a.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.l
    public l getUnmodifiableView() {
        return this;
    }
}
