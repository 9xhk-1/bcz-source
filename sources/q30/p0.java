package q30;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SubSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,731:1\n1#2:732\n*E\n"})
/* loaded from: classes8.dex */
public final class p0<T> implements m<T>, e<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m<T> f81605a;

    /* renamed from: b, reason: collision with root package name */
    public final int f81606b;

    /* renamed from: c, reason: collision with root package name */
    public final int f81607c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements Iterator<T>, y00.a {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator<T> f81608a;

        /* renamed from: b, reason: collision with root package name */
        public int f81609b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p0<T> f81610c;

        public a(p0<T> p0Var) {
            this.f81610c = p0Var;
            this.f81608a = p0Var.f81605a.iterator();
        }

        private final void a() {
            while (this.f81609b < this.f81610c.f81606b && this.f81608a.hasNext()) {
                this.f81608a.next();
                this.f81609b++;
            }
        }

        public final Iterator<T> b() {
            return this.f81608a;
        }

        public final int c() {
            return this.f81609b;
        }

        public final void d(int i11) {
            this.f81609b = i11;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f81609b < this.f81610c.f81607c && this.f81608a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            if (this.f81609b >= this.f81610c.f81607c) {
                throw new NoSuchElementException();
            }
            this.f81609b++;
            return this.f81608a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p0(@m80.k m<? extends T> sequence, int i11, int i12) {
        kotlin.jvm.internal.g0.p(sequence, "sequence");
        this.f81605a = sequence;
        this.f81606b = i11;
        this.f81607c = i12;
        if (i11 < 0) {
            throw new IllegalArgumentException(("startIndex should be non-negative, but is " + i11).toString());
        }
        if (i12 < 0) {
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + i12).toString());
        }
        if (i12 >= i11) {
            return;
        }
        throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i12 + " < " + i11).toString());
    }

    @Override // q30.e
    @m80.k
    public m<T> a(int i11) {
        return i11 >= f() ? x.l() : new p0(this.f81605a, this.f81606b + i11, this.f81607c);
    }

    @Override // q30.e
    @m80.k
    public m<T> b(int i11) {
        if (i11 >= f()) {
            return this;
        }
        m<T> mVar = this.f81605a;
        int i12 = this.f81606b;
        return new p0(mVar, i12, i11 + i12);
    }

    public final int f() {
        return this.f81607c - this.f81606b;
    }

    @Override // q30.m
    @m80.k
    public Iterator<T> iterator() {
        return new a(this);
    }
}
