package q30;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class i<T, R, E> implements m<E> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m<T> f81514a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x00.l<T, R> f81515b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final x00.l<R, Iterator<E>> f81516c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f81517a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final int f81518b = 0;

        /* renamed from: c, reason: collision with root package name */
        public static final int f81519c = 1;

        /* renamed from: d, reason: collision with root package name */
        public static final int f81520d = 2;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements Iterator<E>, y00.a {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator<T> f81521a;

        /* renamed from: b, reason: collision with root package name */
        public Iterator<? extends E> f81522b;

        /* renamed from: c, reason: collision with root package name */
        public int f81523c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i<T, R, E> f81524d;

        public b(i<T, R, E> iVar) {
            this.f81524d = iVar;
            this.f81521a = iVar.f81514a.iterator();
        }

        public final boolean a() {
            Iterator<? extends E> it = this.f81522b;
            if (it != null && it.hasNext()) {
                this.f81523c = 1;
                return true;
            }
            while (this.f81521a.hasNext()) {
                Iterator<? extends E> it2 = (Iterator) this.f81524d.f81516c.invoke(this.f81524d.f81515b.invoke(this.f81521a.next()));
                if (it2.hasNext()) {
                    this.f81522b = it2;
                    this.f81523c = 1;
                    return true;
                }
            }
            this.f81523c = 2;
            this.f81522b = null;
            return false;
        }

        public final Iterator<E> b() {
            return this.f81522b;
        }

        public final Iterator<T> c() {
            return this.f81521a;
        }

        public final int d() {
            return this.f81523c;
        }

        public final void e(Iterator<? extends E> it) {
            this.f81522b = it;
        }

        public final void f(int i11) {
            this.f81523c = i11;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i11 = this.f81523c;
            if (i11 == 1) {
                return true;
            }
            if (i11 == 2) {
                return false;
            }
            return a();
        }

        @Override // java.util.Iterator
        public E next() {
            int i11 = this.f81523c;
            if (i11 == 2) {
                throw new NoSuchElementException();
            }
            if (i11 == 0 && !a()) {
                throw new NoSuchElementException();
            }
            this.f81523c = 0;
            Iterator<? extends E> it = this.f81522b;
            kotlin.jvm.internal.g0.m(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(@m80.k m<? extends T> sequence, @m80.k x00.l<? super T, ? extends R> transformer, @m80.k x00.l<? super R, ? extends Iterator<? extends E>> iterator) {
        kotlin.jvm.internal.g0.p(sequence, "sequence");
        kotlin.jvm.internal.g0.p(transformer, "transformer");
        kotlin.jvm.internal.g0.p(iterator, "iterator");
        this.f81514a = sequence;
        this.f81515b = transformer;
        this.f81516c = iterator;
    }

    @Override // q30.m
    @m80.k
    public Iterator<E> iterator() {
        return new b(this);
    }
}
