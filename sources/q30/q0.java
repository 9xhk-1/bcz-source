package q30;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/TakeSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,731:1\n1#2:732\n*E\n"})
/* loaded from: classes8.dex */
public final class q0<T> implements m<T>, e<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m<T> f81618a;

    /* renamed from: b, reason: collision with root package name */
    public final int f81619b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements Iterator<T>, y00.a {

        /* renamed from: a, reason: collision with root package name */
        public int f81620a;

        /* renamed from: b, reason: collision with root package name */
        public final Iterator<T> f81621b;

        public a(q0<T> q0Var) {
            this.f81620a = q0Var.f81619b;
            this.f81621b = q0Var.f81618a.iterator();
        }

        public final Iterator<T> a() {
            return this.f81621b;
        }

        public final int b() {
            return this.f81620a;
        }

        public final void c(int i11) {
            this.f81620a = i11;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f81620a > 0 && this.f81621b.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            int i11 = this.f81620a;
            if (i11 == 0) {
                throw new NoSuchElementException();
            }
            this.f81620a = i11 - 1;
            return this.f81621b.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q0(@m80.k m<? extends T> sequence, int i11) {
        kotlin.jvm.internal.g0.p(sequence, "sequence");
        this.f81618a = sequence;
        this.f81619b = i11;
        if (i11 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i11 + '.').toString());
    }

    @Override // q30.e
    @m80.k
    public m<T> a(int i11) {
        int i12 = this.f81619b;
        return i11 >= i12 ? x.l() : new p0(this.f81618a, i11, i12);
    }

    @Override // q30.e
    @m80.k
    public m<T> b(int i11) {
        return i11 >= this.f81619b ? this : new q0(this.f81618a, i11);
    }

    @Override // q30.m
    @m80.k
    public Iterator<T> iterator() {
        return new a(this);
    }
}
