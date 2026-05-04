package q30;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class n<T> extends o<T> implements Iterator<T>, j00.c<g2>, y00.a {

    /* renamed from: a, reason: collision with root package name */
    public int f81599a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public T f81600b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public Iterator<? extends T> f81601c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public j00.c<? super g2> f81602d;

    @Override // q30.o
    @m80.l
    public Object b(T t11, @m80.k j00.c<? super g2> cVar) {
        this.f81600b = t11;
        this.f81599a = 3;
        this.f81602d = cVar;
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        if (l11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return l11 == kotlin.coroutines.intrinsics.b.l() ? l11 : g2.f100423a;
    }

    @Override // q30.o
    @m80.l
    public Object d(@m80.k Iterator<? extends T> it, @m80.k j00.c<? super g2> cVar) {
        if (!it.hasNext()) {
            return g2.f100423a;
        }
        this.f81601c = it;
        this.f81599a = 2;
        this.f81602d = cVar;
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        if (l11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return l11 == kotlin.coroutines.intrinsics.b.l() ? l11 : g2.f100423a;
    }

    public final Throwable g() {
        int i11 = this.f81599a;
        if (i11 == 4) {
            return new NoSuchElementException();
        }
        if (i11 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f81599a);
    }

    @Override // j00.c
    @m80.k
    public kotlin.coroutines.d getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @m80.l
    public final j00.c<g2> h() {
        return this.f81602d;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i11 = this.f81599a;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2 || i11 == 3) {
                        return true;
                    }
                    if (i11 == 4) {
                        return false;
                    }
                    throw g();
                }
                Iterator<? extends T> it = this.f81601c;
                kotlin.jvm.internal.g0.m(it);
                if (it.hasNext()) {
                    this.f81599a = 2;
                    return true;
                }
                this.f81601c = null;
            }
            this.f81599a = 5;
            j00.c<? super g2> cVar = this.f81602d;
            kotlin.jvm.internal.g0.m(cVar);
            this.f81602d = null;
            g2 g2Var = g2.f100423a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(g2Var));
        }
    }

    public final T j() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    public final void k(@m80.l j00.c<? super g2> cVar) {
        this.f81602d = cVar;
    }

    @Override // java.util.Iterator
    public T next() {
        int i11 = this.f81599a;
        if (i11 == 0 || i11 == 1) {
            return j();
        }
        if (i11 == 2) {
            this.f81599a = 1;
            Iterator<? extends T> it = this.f81601c;
            kotlin.jvm.internal.g0.m(it);
            return it.next();
        }
        if (i11 != 3) {
            throw g();
        }
        this.f81599a = 0;
        T t11 = this.f81600b;
        this.f81600b = null;
        return t11;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // j00.c
    public void resumeWith(@m80.k Object obj) {
        kotlin.e.n(obj);
        this.f81599a = 4;
    }
}
