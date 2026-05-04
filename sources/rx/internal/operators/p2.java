package rx.internal.operators;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class p2<T, R> extends yb0.c<R> {

    /* renamed from: b, reason: collision with root package name */
    public final rx.c<? extends T> f85895b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f85896c;

    /* renamed from: d, reason: collision with root package name */
    public final wb0.o<? extends dc0.f<? super T, ? extends R>> f85897d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference<dc0.f<? super T, ? extends R>> f85898e;

    /* renamed from: f, reason: collision with root package name */
    public final List<qb0.g<? super R>> f85899f;

    /* renamed from: g, reason: collision with root package name */
    public qb0.g<T> f85900g;

    /* renamed from: h, reason: collision with root package name */
    public qb0.h f85901h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements c.a<R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f85902a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f85903b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f85904c;

        public a(Object obj, AtomicReference atomicReference, List list) {
            this.f85902a = obj;
            this.f85903b = atomicReference;
            this.f85904c = list;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.g<? super R> gVar) {
            synchronized (this.f85902a) {
                try {
                    if (this.f85903b.get() == null) {
                        this.f85904c.add(gVar);
                    } else {
                        ((dc0.f) this.f85903b.get()).J6(gVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements wb0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f85905a;

        public b(AtomicReference atomicReference) {
            this.f85905a = atomicReference;
        }

        @Override // wb0.a
        public void call() {
            synchronized (p2.this.f85896c) {
                if (p2.this.f85901h == this.f85905a.get()) {
                    p2 p2Var = p2.this;
                    qb0.g<T> gVar = p2Var.f85900g;
                    p2Var.f85900g = null;
                    p2Var.f85901h = null;
                    p2Var.f85898e.set(null);
                    if (gVar != null) {
                        gVar.unsubscribe();
                    }
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends qb0.g<R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ qb0.g f85907a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(qb0.g gVar, qb0.g gVar2) {
            super(gVar);
            this.f85907a = gVar2;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f85907a.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f85907a.onError(th2);
        }

        @Override // qb0.c
        public void onNext(R r11) {
            this.f85907a.onNext(r11);
        }
    }

    public p2(rx.c<? extends T> cVar, wb0.o<? extends dc0.f<? super T, ? extends R>> oVar) {
        this(new Object(), new AtomicReference(), new ArrayList(), cVar, oVar);
    }

    @Override // yb0.c
    public void A7(wb0.b<? super qb0.h> bVar) {
        qb0.g<T> gVar;
        synchronized (this.f85896c) {
            try {
                if (this.f85900g != null) {
                    bVar.call(this.f85901h);
                    return;
                }
                dc0.f<? super T, ? extends R> call = this.f85897d.call();
                this.f85900g = zb0.h.e(call);
                AtomicReference atomicReference = new AtomicReference();
                atomicReference.set(ec0.f.a(new b(atomicReference)));
                this.f85901h = (qb0.h) atomicReference.get();
                for (qb0.g<? super R> gVar2 : this.f85899f) {
                    call.J6(new c(gVar2, gVar2));
                }
                this.f85899f.clear();
                this.f85898e.set(call);
                bVar.call(this.f85901h);
                synchronized (this.f85896c) {
                    gVar = this.f85900g;
                }
                if (gVar != null) {
                    this.f85895b.r5(gVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public p2(Object obj, AtomicReference<dc0.f<? super T, ? extends R>> atomicReference, List<qb0.g<? super R>> list, rx.c<? extends T> cVar, wb0.o<? extends dc0.f<? super T, ? extends R>> oVar) {
        super(new a(obj, atomicReference, list));
        this.f85896c = obj;
        this.f85898e = atomicReference;
        this.f85899f = list;
        this.f85895b = cVar;
        this.f85897d = oVar;
    }
}
