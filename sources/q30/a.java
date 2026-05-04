package q30;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a<T> implements m<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final AtomicReference<m<T>> f81486a;

    public a(@m80.k m<? extends T> sequence) {
        kotlin.jvm.internal.g0.p(sequence, "sequence");
        this.f81486a = new AtomicReference<>(sequence);
    }

    @Override // q30.m
    @m80.k
    public Iterator<T> iterator() {
        m<T> andSet = this.f81486a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
