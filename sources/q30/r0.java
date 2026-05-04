package q30;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class r0<T> implements m<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m<T> f81622a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x00.l<T, Boolean> f81623b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements Iterator<T>, y00.a {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator<T> f81624a;

        /* renamed from: b, reason: collision with root package name */
        public int f81625b = -1;

        /* renamed from: c, reason: collision with root package name */
        public T f81626c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ r0<T> f81627d;

        public a(r0<T> r0Var) {
            this.f81627d = r0Var;
            this.f81624a = r0Var.f81622a.iterator();
        }

        private final void a() {
            if (this.f81624a.hasNext()) {
                T next = this.f81624a.next();
                if (((Boolean) this.f81627d.f81623b.invoke(next)).booleanValue()) {
                    this.f81625b = 1;
                    this.f81626c = next;
                    return;
                }
            }
            this.f81625b = 0;
        }

        public final Iterator<T> b() {
            return this.f81624a;
        }

        public final T c() {
            return this.f81626c;
        }

        public final int d() {
            return this.f81625b;
        }

        public final void e(T t11) {
            this.f81626c = t11;
        }

        public final void f(int i11) {
            this.f81625b = i11;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f81625b == -1) {
                a();
            }
            return this.f81625b == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f81625b == -1) {
                a();
            }
            if (this.f81625b == 0) {
                throw new NoSuchElementException();
            }
            T t11 = this.f81626c;
            this.f81626c = null;
            this.f81625b = -1;
            return t11;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r0(@m80.k m<? extends T> sequence, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(sequence, "sequence");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        this.f81622a = sequence;
        this.f81623b = predicate;
    }

    @Override // q30.m
    @m80.k
    public Iterator<T> iterator() {
        return new a(this);
    }
}
