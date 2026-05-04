package a00;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class r1<T> extends h<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<T> f1137a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ListIterator<T>, y00.f {

        /* renamed from: a, reason: collision with root package name */
        public final ListIterator<T> f1138a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r1<T> f1139b;

        public a(r1<T> r1Var, int i11) {
            int g12;
            this.f1139b = r1Var;
            List list = r1Var.f1137a;
            g12 = n0.g1(r1Var, i11);
            this.f1138a = list.listIterator(g12);
        }

        public final ListIterator<T> a() {
            return this.f1138a;
        }

        @Override // java.util.ListIterator
        public void add(T t11) {
            this.f1138a.add(t11);
            this.f1138a.previous();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f1138a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f1138a.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            return this.f1138a.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            int f12;
            f12 = n0.f1(this.f1139b, this.f1138a.previousIndex());
            return f12;
        }

        @Override // java.util.ListIterator
        public T previous() {
            return this.f1138a.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            int f12;
            f12 = n0.f1(this.f1139b, this.f1138a.nextIndex());
            return f12;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.f1138a.remove();
        }

        @Override // java.util.ListIterator
        public void set(T t11) {
            this.f1138a.set(t11);
        }
    }

    public r1(@m80.k List<T> delegate) {
        kotlin.jvm.internal.g0.p(delegate, "delegate");
        this.f1137a = delegate;
    }

    @Override // a00.h, java.util.AbstractList, java.util.List
    public void add(int i11, T t11) {
        int g12;
        List<T> list = this.f1137a;
        g12 = n0.g1(this, i11);
        list.add(g12, t11);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f1137a.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i11) {
        int e12;
        List<T> list = this.f1137a;
        e12 = n0.e1(this, i11);
        return list.get(e12);
    }

    @Override // a00.h
    public int getSize() {
        return this.f1137a.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @m80.k
    public Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    @m80.k
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // a00.h
    public T removeAt(int i11) {
        int e12;
        List<T> list = this.f1137a;
        e12 = n0.e1(this, i11);
        return list.remove(e12);
    }

    @Override // a00.h, java.util.AbstractList, java.util.List
    public T set(int i11, T t11) {
        int e12;
        List<T> list = this.f1137a;
        e12 = n0.e1(this, i11);
        return list.set(e12, t11);
    }

    @Override // java.util.AbstractList, java.util.List
    @m80.k
    public ListIterator<T> listIterator(int i11) {
        return new a(this, i11);
    }
}
