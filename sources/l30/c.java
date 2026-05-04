package l30;

import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class c<T> implements Iterable<T>, y00.a {
    public /* synthetic */ c(kotlin.jvm.internal.v vVar) {
        this();
    }

    public abstract int a();

    public abstract void b(int i11, @m80.k T t11);

    @m80.l
    public abstract T get(int i11);

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public c() {
    }
}
