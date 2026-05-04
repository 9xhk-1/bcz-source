package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class g<T> implements Iterator<T>, y00.a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final T[] f66989a;

    /* renamed from: b, reason: collision with root package name */
    public int f66990b;

    public g(@m80.k T[] array) {
        g0.p(array, "array");
        this.f66989a = array;
    }

    @m80.k
    public final T[] a() {
        return this.f66989a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66990b < this.f66989a.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f66989a;
            int i11 = this.f66990b;
            this.f66990b = i11 + 1;
            return tArr[i11];
        } catch (ArrayIndexOutOfBoundsException e11) {
            this.f66990b--;
            throw new NoSuchElementException(e11.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
