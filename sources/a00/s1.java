package a00;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class s1<T> extends d<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<T> f1141a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ListIterator<T>, y00.a {

        /* renamed from: a, reason: collision with root package name */
        public final ListIterator<T> f1142a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s1<T> f1143b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(s1<? extends T> s1Var, int i11) {
            int g12;
            this.f1143b = s1Var;
            List list = s1Var.f1141a;
            g12 = n0.g1(s1Var, i11);
            this.f1142a = list.listIterator(g12);
        }

        public final ListIterator<T> a() {
            return this.f1142a;
        }

        @Override // java.util.ListIterator
        public void add(T t11) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f1142a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f1142a.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            return this.f1142a.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            int f12;
            f12 = n0.f1(this.f1143b, this.f1142a.previousIndex());
            return f12;
        }

        @Override // java.util.ListIterator
        public T previous() {
            return this.f1142a.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            int f12;
            f12 = n0.f1(this.f1143b, this.f1142a.nextIndex());
            return f12;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(T t11) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s1(@m80.k List<? extends T> delegate) {
        kotlin.jvm.internal.g0.p(delegate, "delegate");
        this.f1141a = delegate;
    }

    @Override // a00.d, java.util.List
    public T get(int i11) {
        int e12;
        List<T> list = this.f1141a;
        e12 = n0.e1(this, i11);
        return list.get(e12);
    }

    @Override // a00.d, a00.b
    public int getSize() {
        return this.f1141a.size();
    }

    @Override // a00.d, a00.b, java.util.Collection, java.lang.Iterable
    @m80.k
    public Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // a00.d, java.util.List
    @m80.k
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // a00.d, java.util.List
    @m80.k
    public ListIterator<T> listIterator(int i11) {
        return new a(this, i11);
    }
}
