package kotlinx.datetime;

import a00.e1;
import java.util.Iterator;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class k implements Iterator<LocalDate>, y00.a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final e1 f68522a;

    public k(@m80.k e1 iterator) {
        g0.p(iterator, "iterator");
        this.f68522a = iterator;
    }

    @Override // java.util.Iterator
    @m80.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public LocalDate next() {
        return LocalDate.Companion.c(this.f68522a.nextLong());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f68522a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
