package q30;

import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class l<T1, T2, V> implements m<V> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m<T1> f81590a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final m<T2> f81591b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final x00.p<T1, T2, V> f81592c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements Iterator<V>, y00.a {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator<T1> f81593a;

        /* renamed from: b, reason: collision with root package name */
        public final Iterator<T2> f81594b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l<T1, T2, V> f81595c;

        public a(l<T1, T2, V> lVar) {
            this.f81595c = lVar;
            this.f81593a = lVar.f81590a.iterator();
            this.f81594b = lVar.f81591b.iterator();
        }

        public final Iterator<T1> a() {
            return this.f81593a;
        }

        public final Iterator<T2> b() {
            return this.f81594b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f81593a.hasNext() && this.f81594b.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            return (V) this.f81595c.f81592c.invoke(this.f81593a.next(), this.f81594b.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(@m80.k m<? extends T1> sequence1, @m80.k m<? extends T2> sequence2, @m80.k x00.p<? super T1, ? super T2, ? extends V> transform) {
        kotlin.jvm.internal.g0.p(sequence1, "sequence1");
        kotlin.jvm.internal.g0.p(sequence2, "sequence2");
        kotlin.jvm.internal.g0.p(transform, "transform");
        this.f81590a = sequence1;
        this.f81591b = sequence2;
        this.f81592c = transform;
    }

    @Override // q30.m
    @m80.k
    public Iterator<V> iterator() {
        return new a(this);
    }
}
