package io.ktor.server.routing;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class z1<E> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final ArrayList<E> f61771a = new ArrayList<>();

    public final boolean a() {
        return this.f61771a.isEmpty();
    }

    public final E b() {
        if (this.f61771a.isEmpty()) {
            throw new NoSuchElementException("Unable to peek an element into empty stack");
        }
        return (E) a00.r0.u3(this.f61771a);
    }

    public final E c() {
        if (this.f61771a.isEmpty()) {
            throw new NoSuchElementException("Unable to pop an element from empty stack");
        }
        ArrayList<E> arrayList = this.f61771a;
        return arrayList.remove(a00.h0.L(arrayList));
    }

    public final void d(E e11) {
        this.f61771a.add(e11);
    }
}
