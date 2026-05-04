package q30;

import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/DropSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,731:1\n1#2:732\n*E\n"})
/* loaded from: classes8.dex */
public final class d<T> implements m<T>, e<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m<T> f81494a;

    /* renamed from: b, reason: collision with root package name */
    public final int f81495b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements Iterator<T>, y00.a {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator<T> f81496a;

        /* renamed from: b, reason: collision with root package name */
        public int f81497b;

        public a(d<T> dVar) {
            this.f81496a = dVar.f81494a.iterator();
            this.f81497b = dVar.f81495b;
        }

        public final void a() {
            while (this.f81497b > 0 && this.f81496a.hasNext()) {
                this.f81496a.next();
                this.f81497b--;
            }
        }

        public final Iterator<T> b() {
            return this.f81496a;
        }

        public final int c() {
            return this.f81497b;
        }

        public final void d(int i11) {
            this.f81497b = i11;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f81496a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            return this.f81496a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@m80.k m<? extends T> sequence, int i11) {
        kotlin.jvm.internal.g0.p(sequence, "sequence");
        this.f81494a = sequence;
        this.f81495b = i11;
        if (i11 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i11 + '.').toString());
    }

    @Override // q30.e
    @m80.k
    public m<T> a(int i11) {
        int i12 = this.f81495b + i11;
        return i12 < 0 ? new d(this, i11) : new d(this.f81494a, i12);
    }

    @Override // q30.e
    @m80.k
    public m<T> b(int i11) {
        int i12 = this.f81495b;
        int i13 = i12 + i11;
        return i13 < 0 ? new q0(this, i11) : new p0(this.f81494a, i12, i13);
    }

    @Override // q30.m
    @m80.k
    public Iterator<T> iterator() {
        return new a(this);
    }
}
