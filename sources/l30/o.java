package l30;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class o<T> extends c<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final T f69793a;

    /* renamed from: b, reason: collision with root package name */
    public final int f69794b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements Iterator<T>, y00.a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f69795a = true;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o<T> f69796b;

        public a(o<T> oVar) {
            this.f69796b = oVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f69795a;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f69795a) {
                throw new NoSuchElementException();
            }
            this.f69795a = false;
            return this.f69796b.f();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(@m80.k T value, int i11) {
        super(null);
        g0.p(value, "value");
        this.f69793a = value;
        this.f69794b = i11;
    }

    @Override // l30.c
    public int a() {
        return 1;
    }

    @Override // l30.c
    public void b(int i11, @m80.k T value) {
        g0.p(value, "value");
        throw new IllegalStateException();
    }

    public final int d() {
        return this.f69794b;
    }

    @m80.k
    public final T f() {
        return this.f69793a;
    }

    @Override // l30.c
    @m80.l
    public T get(int i11) {
        if (i11 == this.f69794b) {
            return this.f69793a;
        }
        return null;
    }

    @Override // l30.c, java.lang.Iterable
    @m80.k
    public Iterator<T> iterator() {
        return new a(this);
    }
}
