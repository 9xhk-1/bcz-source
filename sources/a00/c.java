package a00;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class c<T> implements Iterator<T>, y00.a {

    /* renamed from: a, reason: collision with root package name */
    public int f1088a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public T f1089b;

    public abstract void a();

    public final void b() {
        this.f1088a = 2;
    }

    public final void c(T t11) {
        this.f1089b = t11;
        this.f1088a = 1;
    }

    public final boolean d() {
        this.f1088a = 3;
        a();
        return this.f1088a == 1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i11 = this.f1088a;
        if (i11 == 0) {
            return d();
        }
        if (i11 == 1) {
            return true;
        }
        if (i11 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public T next() {
        int i11 = this.f1088a;
        if (i11 == 1) {
            this.f1088a = 0;
            return this.f1089b;
        }
        if (i11 == 2 || !d()) {
            throw new NoSuchElementException();
        }
        this.f1088a = 0;
        return this.f1089b;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
