package q30;

import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f<T> implements m<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m<T> f81498a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x00.l<T, Boolean> f81499b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements Iterator<T>, y00.a {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator<T> f81500a;

        /* renamed from: b, reason: collision with root package name */
        public int f81501b = -1;

        /* renamed from: c, reason: collision with root package name */
        public T f81502c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ f<T> f81503d;

        public a(f<T> fVar) {
            this.f81503d = fVar;
            this.f81500a = fVar.f81498a.iterator();
        }

        private final void a() {
            while (this.f81500a.hasNext()) {
                T next = this.f81500a.next();
                if (!((Boolean) this.f81503d.f81499b.invoke(next)).booleanValue()) {
                    this.f81502c = next;
                    this.f81501b = 1;
                    return;
                }
            }
            this.f81501b = 0;
        }

        public final int b() {
            return this.f81501b;
        }

        public final Iterator<T> c() {
            return this.f81500a;
        }

        public final T d() {
            return this.f81502c;
        }

        public final void e(int i11) {
            this.f81501b = i11;
        }

        public final void f(T t11) {
            this.f81502c = t11;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f81501b == -1) {
                a();
            }
            return this.f81501b == 1 || this.f81500a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f81501b == -1) {
                a();
            }
            if (this.f81501b != 1) {
                return this.f81500a.next();
            }
            T t11 = this.f81502c;
            this.f81502c = null;
            this.f81501b = 0;
            return t11;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@m80.k m<? extends T> sequence, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(sequence, "sequence");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        this.f81498a = sequence;
        this.f81499b = predicate;
    }

    @Override // q30.m
    @m80.k
    public Iterator<T> iterator() {
        return new a(this);
    }
}
