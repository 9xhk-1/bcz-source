package ho;

import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j
@go.b
/* loaded from: classes7.dex */
public abstract class b<T> implements Iterator<T> {

    /* renamed from: a, reason: collision with root package name */
    public a f59521a = a.NOT_READY;

    /* renamed from: b, reason: collision with root package name */
    @CheckForNull
    public T f59522b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    @CheckForNull
    public abstract T a();

    @CheckForNull
    @uo.a
    public final T b() {
        this.f59521a = a.DONE;
        return null;
    }

    public final boolean c() {
        this.f59521a = a.FAILED;
        this.f59522b = a();
        if (this.f59521a == a.DONE) {
            return false;
        }
        this.f59521a = a.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Preconditions.checkState(this.f59521a != a.FAILED);
        int ordinal = this.f59521a.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 2) {
            return c();
        }
        return false;
    }

    @Override // java.util.Iterator
    @f0
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f59521a = a.NOT_READY;
        T t11 = (T) c0.a(this.f59522b);
        this.f59522b = null;
        return t11;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
