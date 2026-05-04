package l30;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class i extends c {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final i f69784a = new i();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements Iterator, y00.a {
        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public i() {
        super(null);
    }

    @Override // l30.c
    public int a() {
        return 0;
    }

    @Override // l30.c
    @m80.l
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Void get(int i11) {
        return null;
    }

    @Override // l30.c
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void b(int i11, @m80.k Void value) {
        g0.p(value, "value");
        throw new IllegalStateException();
    }

    @Override // l30.c, java.lang.Iterable
    @m80.k
    public Iterator iterator() {
        return new a();
    }
}
