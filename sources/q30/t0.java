package q30;

import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class t0<T, R> implements m<R> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m<T> f81635a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x00.l<T, R> f81636b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements Iterator<R>, y00.a {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator<T> f81637a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t0<T, R> f81638b;

        public a(t0<T, R> t0Var) {
            this.f81638b = t0Var;
            this.f81637a = t0Var.f81635a.iterator();
        }

        public final Iterator<T> a() {
            return this.f81637a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f81637a.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) this.f81638b.f81636b.invoke(this.f81637a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t0(@m80.k m<? extends T> sequence, @m80.k x00.l<? super T, ? extends R> transformer) {
        kotlin.jvm.internal.g0.p(sequence, "sequence");
        kotlin.jvm.internal.g0.p(transformer, "transformer");
        this.f81635a = sequence;
        this.f81636b = transformer;
    }

    @m80.k
    public final <E> m<E> e(@m80.k x00.l<? super R, ? extends Iterator<? extends E>> iterator) {
        kotlin.jvm.internal.g0.p(iterator, "iterator");
        return new i(this.f81635a, this.f81636b, iterator);
    }

    @Override // q30.m
    @m80.k
    public Iterator<R> iterator() {
        return new a(this);
    }
}
