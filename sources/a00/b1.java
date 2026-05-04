package a00;

import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b1<T> implements Iterable<a1<? extends T>>, y00.a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final x00.a<Iterator<T>> f1087a;

    /* JADX WARN: Multi-variable type inference failed */
    public b1(@m80.k x00.a<? extends Iterator<? extends T>> iteratorFactory) {
        kotlin.jvm.internal.g0.p(iteratorFactory, "iteratorFactory");
        this.f1087a = iteratorFactory;
    }

    @Override // java.lang.Iterable
    @m80.k
    public Iterator<a1<T>> iterator() {
        return new c1(this.f1087a.invoke());
    }
}
