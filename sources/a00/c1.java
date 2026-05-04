package a00;

import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c1<T> implements Iterator<a1<? extends T>>, y00.a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Iterator<T> f1090a;

    /* renamed from: b, reason: collision with root package name */
    public int f1091b;

    /* JADX WARN: Multi-variable type inference failed */
    public c1(@m80.k Iterator<? extends T> iterator) {
        kotlin.jvm.internal.g0.p(iterator, "iterator");
        this.f1090a = iterator;
    }

    @Override // java.util.Iterator
    @m80.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a1<T> next() {
        int i11 = this.f1091b;
        this.f1091b = i11 + 1;
        if (i11 < 0) {
            h0.b0();
        }
        return new a1<>(i11, this.f1090a.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1090a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
