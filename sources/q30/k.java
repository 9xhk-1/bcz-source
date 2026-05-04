package q30;

import a00.a1;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class k<T> implements m<a1<? extends T>> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m<T> f81531a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements Iterator<a1<? extends T>>, y00.a {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator<T> f81532a;

        /* renamed from: b, reason: collision with root package name */
        public int f81533b;

        public a(k<T> kVar) {
            this.f81532a = kVar.f81531a.iterator();
        }

        public final int a() {
            return this.f81533b;
        }

        public final Iterator<T> b() {
            return this.f81532a;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a1<T> next() {
            int i11 = this.f81533b;
            this.f81533b = i11 + 1;
            if (i11 < 0) {
                a00.h0.b0();
            }
            return new a1<>(i11, this.f81532a.next());
        }

        public final void d(int i11) {
            this.f81533b = i11;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f81532a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(@m80.k m<? extends T> sequence) {
        kotlin.jvm.internal.g0.p(sequence, "sequence");
        this.f81531a = sequence;
    }

    @Override // q30.m
    @m80.k
    public Iterator<a1<T>> iterator() {
        return new a(this);
    }
}
