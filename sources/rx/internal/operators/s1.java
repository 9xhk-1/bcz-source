package rx.internal.operators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class s1<T, TOpening, TClosing> implements c.b<List<T>, T> {

    /* renamed from: a, reason: collision with root package name */
    public final rx.c<? extends TOpening> f86036a;

    /* renamed from: b, reason: collision with root package name */
    public final wb0.p<? super TOpening, ? extends rx.c<? extends TClosing>> f86037b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<TOpening> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f86038a;

        public a(b bVar) {
            this.f86038a = bVar;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f86038a.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f86038a.onError(th2);
        }

        @Override // qb0.c
        public void onNext(TOpening topening) {
            this.f86038a.C(topening);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super List<T>> f86040a;

        /* renamed from: b, reason: collision with root package name */
        public final List<List<T>> f86041b = new LinkedList();

        /* renamed from: c, reason: collision with root package name */
        public boolean f86042c;

        /* renamed from: d, reason: collision with root package name */
        public final ec0.b f86043d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends qb0.g<TClosing> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ List f86045a;

            public a(List list) {
                this.f86045a = list;
            }

            @Override // qb0.c
            public void onCompleted() {
                b.this.f86043d.e(this);
                b.this.q(this.f86045a);
            }

            @Override // qb0.c
            public void onError(Throwable th2) {
                b.this.onError(th2);
            }

            @Override // qb0.c
            public void onNext(TClosing tclosing) {
                b.this.f86043d.e(this);
                b.this.q(this.f86045a);
            }
        }

        public b(qb0.g<? super List<T>> gVar) {
            this.f86040a = gVar;
            ec0.b bVar = new ec0.b();
            this.f86043d = bVar;
            add(bVar);
        }

        public void C(TOpening topening) {
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                try {
                    if (this.f86042c) {
                        return;
                    }
                    this.f86041b.add(arrayList);
                    try {
                        rx.c<? extends TClosing> call = s1.this.f86037b.call(topening);
                        a aVar = new a(arrayList);
                        this.f86043d.a(aVar);
                        call.J6(aVar);
                    } catch (Throwable th2) {
                        vb0.a.f(th2, this);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // qb0.c
        public void onCompleted() {
            try {
                synchronized (this) {
                    try {
                        if (this.f86042c) {
                            return;
                        }
                        this.f86042c = true;
                        LinkedList linkedList = new LinkedList(this.f86041b);
                        this.f86041b.clear();
                        Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            this.f86040a.onNext((List) it.next());
                        }
                        this.f86040a.onCompleted();
                        unsubscribe();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                vb0.a.f(th3, this.f86040a);
            }
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            synchronized (this) {
                try {
                    if (this.f86042c) {
                        return;
                    }
                    this.f86042c = true;
                    this.f86041b.clear();
                    this.f86040a.onError(th2);
                    unsubscribe();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // qb0.c
        public void onNext(T t11) {
            synchronized (this) {
                try {
                    Iterator<List<T>> it = this.f86041b.iterator();
                    while (it.hasNext()) {
                        it.next().add(t11);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void q(List<T> list) {
            boolean z11;
            synchronized (this) {
                try {
                    if (this.f86042c) {
                        return;
                    }
                    Iterator<List<T>> it = this.f86041b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z11 = false;
                            break;
                        } else if (it.next() == list) {
                            it.remove();
                            z11 = true;
                            break;
                        }
                    }
                    if (z11) {
                        this.f86040a.onNext(list);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public s1(rx.c<? extends TOpening> cVar, wb0.p<? super TOpening, ? extends rx.c<? extends TClosing>> pVar) {
        this.f86036a = cVar;
        this.f86037b = pVar;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super List<T>> gVar) {
        b bVar = new b(new zb0.g(gVar));
        a aVar = new a(bVar);
        gVar.add(aVar);
        gVar.add(bVar);
        this.f86036a.J6(aVar);
        return bVar;
    }
}
