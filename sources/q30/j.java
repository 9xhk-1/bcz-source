package q30;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j<T> implements m<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final x00.a<T> f81526a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x00.l<T, T> f81527b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements Iterator<T>, y00.a {

        /* renamed from: a, reason: collision with root package name */
        public T f81528a;

        /* renamed from: b, reason: collision with root package name */
        public int f81529b = -2;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j<T> f81530c;

        public a(j<T> jVar) {
            this.f81530c = jVar;
        }

        private final void a() {
            T t11;
            if (this.f81529b == -2) {
                t11 = (T) this.f81530c.f81526a.invoke();
            } else {
                x00.l lVar = this.f81530c.f81527b;
                T t12 = this.f81528a;
                kotlin.jvm.internal.g0.m(t12);
                t11 = (T) lVar.invoke(t12);
            }
            this.f81528a = t11;
            this.f81529b = t11 == null ? 0 : 1;
        }

        public final T b() {
            return this.f81528a;
        }

        public final int c() {
            return this.f81529b;
        }

        public final void d(T t11) {
            this.f81528a = t11;
        }

        public final void e(int i11) {
            this.f81529b = i11;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f81529b < 0) {
                a();
            }
            return this.f81529b == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f81529b < 0) {
                a();
            }
            if (this.f81529b == 0) {
                throw new NoSuchElementException();
            }
            T t11 = this.f81528a;
            kotlin.jvm.internal.g0.n(t11, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f81529b = -1;
            return t11;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(@m80.k x00.a<? extends T> getInitialValue, @m80.k x00.l<? super T, ? extends T> getNextValue) {
        kotlin.jvm.internal.g0.p(getInitialValue, "getInitialValue");
        kotlin.jvm.internal.g0.p(getNextValue, "getNextValue");
        this.f81526a = getInitialValue;
        this.f81527b = getNextValue;
    }

    @Override // q30.m
    @m80.k
    public Iterator<T> iterator() {
        return new a(this);
    }
}
