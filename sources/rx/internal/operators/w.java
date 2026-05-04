package rx.internal.operators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class w<T> implements c.a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Iterable<? extends rx.c<? extends T>> f86201a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements wb0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f86202a;

        public a(d dVar) {
            this.f86202a = dVar;
        }

        @Override // wb0.a
        public void call() {
            c<T> cVar = this.f86202a.get();
            if (cVar != null) {
                cVar.unsubscribe();
            }
            w.r(this.f86202a.f86209a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements qb0.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f86204a;

        public b(d dVar) {
            this.f86204a = dVar;
        }

        @Override // qb0.d
        public void request(long j11) {
            c<T> cVar = this.f86204a.get();
            if (cVar != null) {
                cVar.D(j11);
                return;
            }
            for (c<T> cVar2 : this.f86204a.f86209a) {
                if (!cVar2.isUnsubscribed()) {
                    if (this.f86204a.get() == cVar2) {
                        cVar2.D(j11);
                        return;
                    }
                    cVar2.D(j11);
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c<T> extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super T> f86206a;

        /* renamed from: b, reason: collision with root package name */
        public final d<T> f86207b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f86208c;

        public c(long j11, qb0.g<? super T> gVar, d<T> dVar) {
            this.f86206a = gVar;
            this.f86207b = dVar;
            request(j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void D(long j11) {
            request(j11);
        }

        public final boolean C() {
            if (this.f86208c) {
                return true;
            }
            if (this.f86207b.get() == this) {
                this.f86208c = true;
                return true;
            }
            if (!this.f86207b.compareAndSet(null, this)) {
                this.f86207b.a();
                return false;
            }
            this.f86207b.b(this);
            this.f86208c = true;
            return true;
        }

        @Override // qb0.c
        public void onCompleted() {
            if (C()) {
                this.f86206a.onCompleted();
            }
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            if (C()) {
                this.f86206a.onError(th2);
            }
        }

        @Override // qb0.c
        public void onNext(T t11) {
            if (C()) {
                this.f86206a.onNext(t11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d<T> extends AtomicReference<c<T>> {

        /* renamed from: a, reason: collision with root package name */
        public final Collection<c<T>> f86209a = new ConcurrentLinkedQueue();

        public void a() {
            c<T> cVar = get();
            if (cVar != null) {
                b(cVar);
            }
        }

        public void b(c<T> cVar) {
            for (c<T> cVar2 : this.f86209a) {
                if (cVar2 != cVar) {
                    cVar2.unsubscribe();
                }
            }
            this.f86209a.clear();
        }
    }

    public w(Iterable<? extends rx.c<? extends T>> iterable) {
        this.f86201a = iterable;
    }

    public static <T> c.a<T> a(Iterable<? extends rx.c<? extends T>> iterable) {
        return new w(iterable);
    }

    public static <T> c.a<T> b(rx.c<? extends T> cVar, rx.c<? extends T> cVar2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar);
        arrayList.add(cVar2);
        return a(arrayList);
    }

    public static <T> c.a<T> h(rx.c<? extends T> cVar, rx.c<? extends T> cVar2, rx.c<? extends T> cVar3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar);
        arrayList.add(cVar2);
        arrayList.add(cVar3);
        return a(arrayList);
    }

    public static <T> c.a<T> j(rx.c<? extends T> cVar, rx.c<? extends T> cVar2, rx.c<? extends T> cVar3, rx.c<? extends T> cVar4) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar);
        arrayList.add(cVar2);
        arrayList.add(cVar3);
        arrayList.add(cVar4);
        return a(arrayList);
    }

    public static <T> c.a<T> l(rx.c<? extends T> cVar, rx.c<? extends T> cVar2, rx.c<? extends T> cVar3, rx.c<? extends T> cVar4, rx.c<? extends T> cVar5) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar);
        arrayList.add(cVar2);
        arrayList.add(cVar3);
        arrayList.add(cVar4);
        arrayList.add(cVar5);
        return a(arrayList);
    }

    public static <T> c.a<T> m(rx.c<? extends T> cVar, rx.c<? extends T> cVar2, rx.c<? extends T> cVar3, rx.c<? extends T> cVar4, rx.c<? extends T> cVar5, rx.c<? extends T> cVar6) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar);
        arrayList.add(cVar2);
        arrayList.add(cVar3);
        arrayList.add(cVar4);
        arrayList.add(cVar5);
        arrayList.add(cVar6);
        return a(arrayList);
    }

    public static <T> c.a<T> n(rx.c<? extends T> cVar, rx.c<? extends T> cVar2, rx.c<? extends T> cVar3, rx.c<? extends T> cVar4, rx.c<? extends T> cVar5, rx.c<? extends T> cVar6, rx.c<? extends T> cVar7) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar);
        arrayList.add(cVar2);
        arrayList.add(cVar3);
        arrayList.add(cVar4);
        arrayList.add(cVar5);
        arrayList.add(cVar6);
        arrayList.add(cVar7);
        return a(arrayList);
    }

    public static <T> c.a<T> o(rx.c<? extends T> cVar, rx.c<? extends T> cVar2, rx.c<? extends T> cVar3, rx.c<? extends T> cVar4, rx.c<? extends T> cVar5, rx.c<? extends T> cVar6, rx.c<? extends T> cVar7, rx.c<? extends T> cVar8) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar);
        arrayList.add(cVar2);
        arrayList.add(cVar3);
        arrayList.add(cVar4);
        arrayList.add(cVar5);
        arrayList.add(cVar6);
        arrayList.add(cVar7);
        arrayList.add(cVar8);
        return a(arrayList);
    }

    public static <T> c.a<T> p(rx.c<? extends T> cVar, rx.c<? extends T> cVar2, rx.c<? extends T> cVar3, rx.c<? extends T> cVar4, rx.c<? extends T> cVar5, rx.c<? extends T> cVar6, rx.c<? extends T> cVar7, rx.c<? extends T> cVar8, rx.c<? extends T> cVar9) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar);
        arrayList.add(cVar2);
        arrayList.add(cVar3);
        arrayList.add(cVar4);
        arrayList.add(cVar5);
        arrayList.add(cVar6);
        arrayList.add(cVar7);
        arrayList.add(cVar8);
        arrayList.add(cVar9);
        return a(arrayList);
    }

    public static <T> void r(Collection<c<T>> collection) {
        if (collection.isEmpty()) {
            return;
        }
        Iterator<c<T>> it = collection.iterator();
        while (it.hasNext()) {
            it.next().unsubscribe();
        }
        collection.clear();
    }

    @Override // wb0.b
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super T> gVar) {
        d dVar = new d();
        gVar.add(ec0.f.a(new a(dVar)));
        for (rx.c<? extends T> cVar : this.f86201a) {
            if (gVar.isUnsubscribed()) {
                break;
            }
            c<T> cVar2 = new c<>(0L, gVar, dVar);
            dVar.f86209a.add(cVar2);
            c<T> cVar3 = dVar.get();
            if (cVar3 != null) {
                dVar.b(cVar3);
                return;
            }
            cVar.J6(cVar2);
        }
        if (gVar.isUnsubscribed()) {
            r(dVar.f86209a);
        }
        gVar.setProducer(new b(dVar));
    }
}
