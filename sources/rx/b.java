package rx;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.c;
import rx.d;
import rx.e;
import rx.exceptions.CompositeException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f84858b = new b(new k(), false);

    /* renamed from: c, reason: collision with root package name */
    public static final b f84859c = new b(new v(), false);

    /* renamed from: a, reason: collision with root package name */
    public final j0 f84860a;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a0<T> implements e.t<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.o f84864a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements qb0.b {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ qb0.f f84866a;

            public a(qb0.f fVar) {
                this.f84866a = fVar;
            }

            @Override // qb0.b
            public void a(qb0.h hVar) {
                this.f84866a.b(hVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qb0.b
            public void onCompleted() {
                try {
                    Object call = a0.this.f84864a.call();
                    if (call == null) {
                        this.f84866a.onError(new NullPointerException("The value supplied is null"));
                    } else {
                        this.f84866a.h(call);
                    }
                } catch (Throwable th2) {
                    this.f84866a.onError(th2);
                }
            }

            @Override // qb0.b
            public void onError(Throwable th2) {
                this.f84866a.onError(th2);
            }
        }

        public a0(wb0.o oVar) {
            this.f84864a = oVar;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.f<? super T> fVar) {
            b.this.G0(new a(fVar));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: rx.b$b, reason: collision with other inner class name */
    public static class C1064b implements j0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ rx.e f84868a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: rx.b$b$a */
        public class a extends qb0.f<Object> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ qb0.b f84869b;

            public a(qb0.b bVar) {
                this.f84869b = bVar;
            }

            @Override // qb0.f
            public void h(Object obj) {
                this.f84869b.onCompleted();
            }

            @Override // qb0.f
            public void onError(Throwable th2) {
                this.f84869b.onError(th2);
            }
        }

        public C1064b(rx.e eVar) {
            this.f84868a = eVar;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.b bVar) {
            a aVar = new a(bVar);
            bVar.a(aVar);
            this.f84868a.j0(aVar);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b0<T> implements wb0.o<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f84871a;

        public b0(Object obj) {
            this.f84871a = obj;
        }

        @Override // wb0.o, java.util.concurrent.Callable
        public T call() {
            return (T) this.f84871a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements j0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ rx.d f84873a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f84874b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TimeUnit f84875c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements wb0.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ qb0.b f84876a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d.a f84877b;

            public a(qb0.b bVar, d.a aVar) {
                this.f84876a = bVar;
                this.f84877b = aVar;
            }

            @Override // wb0.a
            public void call() {
                try {
                    this.f84876a.onCompleted();
                } finally {
                    this.f84877b.unsubscribe();
                }
            }
        }

        public c(rx.d dVar, long j11, TimeUnit timeUnit) {
            this.f84873a = dVar;
            this.f84874b = j11;
            this.f84875c = timeUnit;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.b bVar) {
            ec0.c cVar = new ec0.c();
            bVar.a(cVar);
            if (cVar.isUnsubscribed()) {
                return;
            }
            d.a a11 = this.f84873a.a();
            cVar.b(a11);
            a11.j(new a(bVar, a11), this.f84874b, this.f84875c);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c0 implements j0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ rx.d f84879a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements qb0.b {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ qb0.b f84881a;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: rx.b$c0$a$a, reason: collision with other inner class name */
            public class C1065a implements wb0.a {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ qb0.h f84883a;

                /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                /* renamed from: rx.b$c0$a$a$a, reason: collision with other inner class name */
                public class C1066a implements wb0.a {

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ d.a f84885a;

                    public C1066a(d.a aVar) {
                        this.f84885a = aVar;
                    }

                    @Override // wb0.a
                    public void call() {
                        try {
                            C1065a.this.f84883a.unsubscribe();
                        } finally {
                            this.f84885a.unsubscribe();
                        }
                    }
                }

                public C1065a(qb0.h hVar) {
                    this.f84883a = hVar;
                }

                @Override // wb0.a
                public void call() {
                    d.a a11 = c0.this.f84879a.a();
                    a11.h(new C1066a(a11));
                }
            }

            public a(qb0.b bVar) {
                this.f84881a = bVar;
            }

            @Override // qb0.b
            public void a(qb0.h hVar) {
                this.f84881a.a(ec0.f.a(new C1065a(hVar)));
            }

            @Override // qb0.b
            public void onCompleted() {
                this.f84881a.onCompleted();
            }

            @Override // qb0.b
            public void onError(Throwable th2) {
                this.f84881a.onError(th2);
            }
        }

        public c0(rx.d dVar) {
            this.f84879a = dVar;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.b bVar) {
            b.this.G0(new a(bVar));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d implements j0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.o f84887a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ wb0.p f84888b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ wb0.b f84889c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f84890d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements qb0.b {

            /* renamed from: a, reason: collision with root package name */
            public qb0.h f84891a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AtomicBoolean f84892b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Object f84893c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ qb0.b f84894d;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: rx.b$d$a$a, reason: collision with other inner class name */
            public class C1067a implements wb0.a {
                public C1067a() {
                }

                @Override // wb0.a
                public void call() {
                    a.this.b();
                }
            }

            public a(AtomicBoolean atomicBoolean, Object obj, qb0.b bVar) {
                this.f84892b = atomicBoolean;
                this.f84893c = obj;
                this.f84894d = bVar;
            }

            @Override // qb0.b
            public void a(qb0.h hVar) {
                this.f84891a = hVar;
                this.f84894d.a(ec0.f.a(new C1067a()));
            }

            public void b() {
                this.f84891a.unsubscribe();
                if (this.f84892b.compareAndSet(false, true)) {
                    try {
                        d.this.f84889c.call(this.f84893c);
                    } catch (Throwable th2) {
                        ac0.c.I(th2);
                    }
                }
            }

            @Override // qb0.b
            public void onCompleted() {
                if (d.this.f84890d && this.f84892b.compareAndSet(false, true)) {
                    try {
                        d.this.f84889c.call(this.f84893c);
                    } catch (Throwable th2) {
                        this.f84894d.onError(th2);
                        return;
                    }
                }
                this.f84894d.onCompleted();
                if (d.this.f84890d) {
                    return;
                }
                b();
            }

            @Override // qb0.b
            public void onError(Throwable th2) {
                if (d.this.f84890d && this.f84892b.compareAndSet(false, true)) {
                    try {
                        d.this.f84889c.call(this.f84893c);
                    } catch (Throwable th3) {
                        th2 = new CompositeException(Arrays.asList(th2, th3));
                    }
                }
                this.f84894d.onError(th2);
                if (d.this.f84890d) {
                    return;
                }
                b();
            }
        }

        public d(wb0.o oVar, wb0.p pVar, wb0.b bVar, boolean z11) {
            this.f84887a = oVar;
            this.f84888b = pVar;
            this.f84889c = bVar;
            this.f84890d = z11;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.b bVar) {
            try {
                Object call = this.f84887a.call();
                try {
                    b bVar2 = (b) this.f84888b.call(call);
                    if (bVar2 != null) {
                        bVar2.G0(new a(new AtomicBoolean(), call, bVar));
                        return;
                    }
                    try {
                        this.f84889c.call(call);
                        bVar.a(ec0.f.e());
                        bVar.onError(new NullPointerException("The completable supplied is null"));
                    } catch (Throwable th2) {
                        vb0.a.e(th2);
                        bVar.a(ec0.f.e());
                        bVar.onError(new CompositeException(Arrays.asList(new NullPointerException("The completable supplied is null"), th2)));
                    }
                } catch (Throwable th3) {
                    try {
                        this.f84889c.call(call);
                        vb0.a.e(th3);
                        bVar.a(ec0.f.e());
                        bVar.onError(th3);
                    } catch (Throwable th4) {
                        vb0.a.e(th3);
                        vb0.a.e(th4);
                        bVar.a(ec0.f.e());
                        bVar.onError(new CompositeException(Arrays.asList(th3, th4)));
                    }
                }
            } catch (Throwable th5) {
                bVar.a(ec0.f.e());
                bVar.onError(th5);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d0 implements j0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterable f84897a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements qb0.b {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AtomicBoolean f84898a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ec0.b f84899b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ qb0.b f84900c;

            public a(AtomicBoolean atomicBoolean, ec0.b bVar, qb0.b bVar2) {
                this.f84898a = atomicBoolean;
                this.f84899b = bVar;
                this.f84900c = bVar2;
            }

            @Override // qb0.b
            public void a(qb0.h hVar) {
                this.f84899b.a(hVar);
            }

            @Override // qb0.b
            public void onCompleted() {
                if (this.f84898a.compareAndSet(false, true)) {
                    this.f84899b.unsubscribe();
                    this.f84900c.onCompleted();
                }
            }

            @Override // qb0.b
            public void onError(Throwable th2) {
                if (!this.f84898a.compareAndSet(false, true)) {
                    ac0.c.I(th2);
                } else {
                    this.f84899b.unsubscribe();
                    this.f84900c.onError(th2);
                }
            }
        }

        public d0(Iterable iterable) {
            this.f84897a = iterable;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.b bVar) {
            ec0.b bVar2 = new ec0.b();
            bVar.a(bVar2);
            try {
                Iterator it = this.f84897a.iterator();
                if (it == null) {
                    bVar.onError(new NullPointerException("The iterator returned is null"));
                    return;
                }
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                a aVar = new a(atomicBoolean, bVar2, bVar);
                boolean z11 = true;
                while (!atomicBoolean.get() && !bVar2.isUnsubscribed()) {
                    try {
                        if (!it.hasNext()) {
                            if (z11) {
                                bVar.onCompleted();
                                return;
                            }
                            return;
                        }
                        if (atomicBoolean.get() || bVar2.isUnsubscribed()) {
                            return;
                        }
                        try {
                            b bVar3 = (b) it.next();
                            if (bVar3 == null) {
                                Throwable nullPointerException = new NullPointerException("One of the sources is null");
                                if (!atomicBoolean.compareAndSet(false, true)) {
                                    ac0.c.I(nullPointerException);
                                    return;
                                } else {
                                    bVar2.unsubscribe();
                                    bVar.onError(nullPointerException);
                                    return;
                                }
                            }
                            if (atomicBoolean.get() || bVar2.isUnsubscribed()) {
                                return;
                            }
                            bVar3.G0(aVar);
                            z11 = false;
                        } catch (Throwable th2) {
                            if (!atomicBoolean.compareAndSet(false, true)) {
                                ac0.c.I(th2);
                                return;
                            } else {
                                bVar2.unsubscribe();
                                bVar.onError(th2);
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        if (!atomicBoolean.compareAndSet(false, true)) {
                            ac0.c.I(th3);
                            return;
                        } else {
                            bVar2.unsubscribe();
                            bVar.onError(th3);
                            return;
                        }
                    }
                }
            } catch (Throwable th4) {
                bVar.onError(th4);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e0 implements j0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.o f84905a;

        public e0(wb0.o oVar) {
            this.f84905a = oVar;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.b bVar) {
            try {
                b bVar2 = (b) this.f84905a.call();
                if (bVar2 != null) {
                    bVar2.G0(bVar);
                } else {
                    bVar.a(ec0.f.e());
                    bVar.onError(new NullPointerException("The completable returned is null"));
                }
            } catch (Throwable th2) {
                bVar.a(ec0.f.e());
                bVar.onError(th2);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f0 implements j0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.o f84909a;

        public f0(wb0.o oVar) {
            this.f84909a = oVar;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.b bVar) {
            bVar.a(ec0.f.e());
            try {
                th = (Throwable) this.f84909a.call();
            } catch (Throwable th2) {
                th = th2;
            }
            if (th == null) {
                th = new NullPointerException("The error supplied is null");
            }
            bVar.onError(th);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g implements j0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ rx.d f84910a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f84911b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TimeUnit f84912c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f84913d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements qb0.b {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ec0.b f84915a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d.a f84916b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ qb0.b f84917c;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: rx.b$g$a$a, reason: collision with other inner class name */
            public class C1068a implements wb0.a {
                public C1068a() {
                }

                @Override // wb0.a
                public void call() {
                    try {
                        a.this.f84917c.onCompleted();
                    } finally {
                        a.this.f84916b.unsubscribe();
                    }
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: rx.b$g$a$b, reason: collision with other inner class name */
            public class C1069b implements wb0.a {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Throwable f84920a;

                public C1069b(Throwable th2) {
                    this.f84920a = th2;
                }

                @Override // wb0.a
                public void call() {
                    try {
                        a.this.f84917c.onError(this.f84920a);
                    } finally {
                        a.this.f84916b.unsubscribe();
                    }
                }
            }

            public a(ec0.b bVar, d.a aVar, qb0.b bVar2) {
                this.f84915a = bVar;
                this.f84916b = aVar;
                this.f84917c = bVar2;
            }

            @Override // qb0.b
            public void a(qb0.h hVar) {
                this.f84915a.a(hVar);
                this.f84917c.a(this.f84915a);
            }

            @Override // qb0.b
            public void onCompleted() {
                ec0.b bVar = this.f84915a;
                d.a aVar = this.f84916b;
                C1068a c1068a = new C1068a();
                g gVar = g.this;
                bVar.a(aVar.j(c1068a, gVar.f84911b, gVar.f84912c));
            }

            @Override // qb0.b
            public void onError(Throwable th2) {
                if (!g.this.f84913d) {
                    this.f84917c.onError(th2);
                    return;
                }
                ec0.b bVar = this.f84915a;
                d.a aVar = this.f84916b;
                C1069b c1069b = new C1069b(th2);
                g gVar = g.this;
                bVar.a(aVar.j(c1069b, gVar.f84911b, gVar.f84912c));
            }
        }

        public g(rx.d dVar, long j11, TimeUnit timeUnit, boolean z11) {
            this.f84910a = dVar;
            this.f84911b = j11;
            this.f84912c = timeUnit;
            this.f84913d = z11;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.b bVar) {
            ec0.b bVar2 = new ec0.b();
            d.a a11 = this.f84910a.a();
            bVar2.a(a11);
            b.this.G0(new a(bVar2, a11, bVar));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class g0 implements j0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Throwable f84922a;

        public g0(Throwable th2) {
            this.f84922a = th2;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.b bVar) {
            bVar.a(ec0.f.e());
            bVar.onError(this.f84922a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h implements wb0.b<Throwable> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.b f84923a;

        public h(wb0.b bVar) {
            this.f84923a = bVar;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th2) {
            this.f84923a.call(Notification.d(th2));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class h0 implements j0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.a f84925a;

        public h0(wb0.a aVar) {
            this.f84925a = aVar;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.b bVar) {
            ec0.a aVar = new ec0.a();
            bVar.a(aVar);
            try {
                this.f84925a.call();
                if (aVar.isUnsubscribed()) {
                    return;
                }
                bVar.onCompleted();
            } catch (Throwable th2) {
                if (aVar.isUnsubscribed()) {
                    return;
                }
                bVar.onError(th2);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class i implements wb0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.b f84926a;

        public i(wb0.b bVar) {
            this.f84926a = bVar;
        }

        @Override // wb0.a
        public void call() {
            this.f84926a.call(Notification.b());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class i0 implements j0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callable f84928a;

        public i0(Callable callable) {
            this.f84928a = callable;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.b bVar) {
            ec0.a aVar = new ec0.a();
            bVar.a(aVar);
            try {
                this.f84928a.call();
                if (aVar.isUnsubscribed()) {
                    return;
                }
                bVar.onCompleted();
            } catch (Throwable th2) {
                if (aVar.isUnsubscribed()) {
                    return;
                }
                bVar.onError(th2);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class j implements j0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.a f84929a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ wb0.a f84930b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ wb0.b f84931c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ wb0.b f84932d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ wb0.a f84933e;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements qb0.b {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ qb0.b f84935a;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: rx.b$j$a$a, reason: collision with other inner class name */
            public class C1070a implements wb0.a {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ qb0.h f84937a;

                public C1070a(qb0.h hVar) {
                    this.f84937a = hVar;
                }

                @Override // wb0.a
                public void call() {
                    try {
                        j.this.f84933e.call();
                    } catch (Throwable th2) {
                        ac0.c.I(th2);
                    }
                    this.f84937a.unsubscribe();
                }
            }

            public a(qb0.b bVar) {
                this.f84935a = bVar;
            }

            @Override // qb0.b
            public void a(qb0.h hVar) {
                try {
                    j.this.f84932d.call(hVar);
                    this.f84935a.a(ec0.f.a(new C1070a(hVar)));
                } catch (Throwable th2) {
                    hVar.unsubscribe();
                    this.f84935a.a(ec0.f.e());
                    this.f84935a.onError(th2);
                }
            }

            @Override // qb0.b
            public void onCompleted() {
                try {
                    j.this.f84929a.call();
                    this.f84935a.onCompleted();
                    try {
                        j.this.f84930b.call();
                    } catch (Throwable th2) {
                        ac0.c.I(th2);
                    }
                } catch (Throwable th3) {
                    this.f84935a.onError(th3);
                }
            }

            @Override // qb0.b
            public void onError(Throwable th2) {
                try {
                    j.this.f84931c.call(th2);
                } catch (Throwable th3) {
                    th2 = new CompositeException(Arrays.asList(th2, th3));
                }
                this.f84935a.onError(th2);
                try {
                    j.this.f84930b.call();
                } catch (Throwable th4) {
                    ac0.c.I(th4);
                }
            }
        }

        public j(wb0.a aVar, wb0.a aVar2, wb0.b bVar, wb0.b bVar2, wb0.a aVar3) {
            this.f84929a = aVar;
            this.f84930b = aVar2;
            this.f84931c = bVar;
            this.f84932d = bVar2;
            this.f84933e = aVar3;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.b bVar) {
            b.this.G0(new a(bVar));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface j0 extends wb0.b<qb0.b> {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class k implements j0 {
        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.b bVar) {
            bVar.a(ec0.f.e());
            bVar.onCompleted();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface k0 extends wb0.p<qb0.b, qb0.b> {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class l implements wb0.b<Throwable> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.a f84939a;

        public l(wb0.a aVar) {
            this.f84939a = aVar;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th2) {
            this.f84939a.call();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface l0 extends wb0.p<b, b> {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class o implements j0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k0 f84947a;

        public o(k0 k0Var) {
            this.f84947a = k0Var;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.b bVar) {
            try {
                b.this.G0(ac0.c.C(this.f84947a).call(bVar));
            } catch (NullPointerException e11) {
                throw e11;
            } catch (Throwable th2) {
                throw b.C0(th2);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class p implements j0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ rx.d f84949a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements qb0.b {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d.a f84951a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ qb0.b f84952b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ rx.internal.util.m f84953c;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: rx.b$p$a$a, reason: collision with other inner class name */
            public class C1071a implements wb0.a {
                public C1071a() {
                }

                @Override // wb0.a
                public void call() {
                    try {
                        a.this.f84952b.onCompleted();
                    } finally {
                        a.this.f84953c.unsubscribe();
                    }
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: rx.b$p$a$b, reason: collision with other inner class name */
            public class C1072b implements wb0.a {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Throwable f84956a;

                public C1072b(Throwable th2) {
                    this.f84956a = th2;
                }

                @Override // wb0.a
                public void call() {
                    try {
                        a.this.f84952b.onError(this.f84956a);
                    } finally {
                        a.this.f84953c.unsubscribe();
                    }
                }
            }

            public a(d.a aVar, qb0.b bVar, rx.internal.util.m mVar) {
                this.f84951a = aVar;
                this.f84952b = bVar;
                this.f84953c = mVar;
            }

            @Override // qb0.b
            public void a(qb0.h hVar) {
                this.f84953c.a(hVar);
            }

            @Override // qb0.b
            public void onCompleted() {
                this.f84951a.h(new C1071a());
            }

            @Override // qb0.b
            public void onError(Throwable th2) {
                this.f84951a.h(new C1072b(th2));
            }
        }

        public p(rx.d dVar) {
            this.f84949a = dVar;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.b bVar) {
            rx.internal.util.m mVar = new rx.internal.util.m();
            d.a a11 = this.f84949a.a();
            mVar.a(a11);
            bVar.a(mVar);
            b.this.G0(new a(a11, bVar, mVar));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class q implements j0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.p f84958a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements qb0.b {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ qb0.b f84960a;

            public a(qb0.b bVar) {
                this.f84960a = bVar;
            }

            @Override // qb0.b
            public void a(qb0.h hVar) {
                this.f84960a.a(hVar);
            }

            @Override // qb0.b
            public void onCompleted() {
                this.f84960a.onCompleted();
            }

            @Override // qb0.b
            public void onError(Throwable th2) {
                boolean z11;
                try {
                    z11 = ((Boolean) q.this.f84958a.call(th2)).booleanValue();
                } catch (Throwable th3) {
                    vb0.a.e(th3);
                    CompositeException compositeException = new CompositeException(Arrays.asList(th2, th3));
                    z11 = false;
                    th2 = compositeException;
                }
                if (z11) {
                    this.f84960a.onCompleted();
                } else {
                    this.f84960a.onError(th2);
                }
            }
        }

        public q(wb0.p pVar) {
            this.f84958a = pVar;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.b bVar) {
            b.this.G0(new a(bVar));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class r implements j0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.p f84962a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements qb0.b {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ qb0.b f84964a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ec0.e f84965b;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: rx.b$r$a$a, reason: collision with other inner class name */
            public class C1073a implements qb0.b {
                public C1073a() {
                }

                @Override // qb0.b
                public void a(qb0.h hVar) {
                    a.this.f84965b.b(hVar);
                }

                @Override // qb0.b
                public void onCompleted() {
                    a.this.f84964a.onCompleted();
                }

                @Override // qb0.b
                public void onError(Throwable th2) {
                    a.this.f84964a.onError(th2);
                }
            }

            public a(qb0.b bVar, ec0.e eVar) {
                this.f84964a = bVar;
                this.f84965b = eVar;
            }

            @Override // qb0.b
            public void a(qb0.h hVar) {
                this.f84965b.b(hVar);
            }

            @Override // qb0.b
            public void onCompleted() {
                this.f84964a.onCompleted();
            }

            @Override // qb0.b
            public void onError(Throwable th2) {
                try {
                    b bVar = (b) r.this.f84962a.call(th2);
                    if (bVar == null) {
                        this.f84964a.onError(new CompositeException(Arrays.asList(th2, new NullPointerException("The completable returned is null"))));
                    } else {
                        bVar.G0(new C1073a());
                    }
                } catch (Throwable th3) {
                    this.f84964a.onError(new CompositeException(Arrays.asList(th2, th3)));
                }
            }
        }

        public r(wb0.p pVar) {
            this.f84962a = pVar;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.b bVar) {
            ec0.e eVar = new ec0.e();
            bVar.a(eVar);
            b.this.G0(new a(bVar, eVar));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class s implements qb0.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ec0.c f84968a;

        public s(ec0.c cVar) {
            this.f84968a = cVar;
        }

        @Override // qb0.b
        public void a(qb0.h hVar) {
            this.f84968a.b(hVar);
        }

        @Override // qb0.b
        public void onCompleted() {
            this.f84968a.unsubscribe();
        }

        @Override // qb0.b
        public void onError(Throwable th2) {
            ac0.c.I(th2);
            this.f84968a.unsubscribe();
            b.u(th2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class t implements qb0.b {

        /* renamed from: a, reason: collision with root package name */
        public boolean f84970a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ wb0.a f84971b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ec0.c f84972c;

        public t(wb0.a aVar, ec0.c cVar) {
            this.f84971b = aVar;
            this.f84972c = cVar;
        }

        @Override // qb0.b
        public void a(qb0.h hVar) {
            this.f84972c.b(hVar);
        }

        @Override // qb0.b
        public void onCompleted() {
            if (this.f84970a) {
                return;
            }
            this.f84970a = true;
            try {
                this.f84971b.call();
            } finally {
                try {
                } finally {
                }
            }
        }

        @Override // qb0.b
        public void onError(Throwable th2) {
            ac0.c.I(th2);
            this.f84972c.unsubscribe();
            b.u(th2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class u implements qb0.b {

        /* renamed from: a, reason: collision with root package name */
        public boolean f84974a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ wb0.a f84975b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ec0.c f84976c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ wb0.b f84977d;

        public u(wb0.a aVar, ec0.c cVar, wb0.b bVar) {
            this.f84975b = aVar;
            this.f84976c = cVar;
            this.f84977d = bVar;
        }

        @Override // qb0.b
        public void a(qb0.h hVar) {
            this.f84976c.b(hVar);
        }

        public void b(Throwable th2) {
            try {
                this.f84977d.call(th2);
            } finally {
                try {
                } finally {
                }
            }
        }

        @Override // qb0.b
        public void onCompleted() {
            if (this.f84974a) {
                return;
            }
            this.f84974a = true;
            try {
                this.f84975b.call();
                this.f84976c.unsubscribe();
            } catch (Throwable th2) {
                b(th2);
            }
        }

        @Override // qb0.b
        public void onError(Throwable th2) {
            if (this.f84974a) {
                ac0.c.I(th2);
                b.u(th2);
            } else {
                this.f84974a = true;
                b(th2);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class v implements j0 {
        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.b bVar) {
            bVar.a(ec0.f.e());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class w implements j0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b[] f84979a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements qb0.b {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AtomicBoolean f84980a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ec0.b f84981b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ qb0.b f84982c;

            public a(AtomicBoolean atomicBoolean, ec0.b bVar, qb0.b bVar2) {
                this.f84980a = atomicBoolean;
                this.f84981b = bVar;
                this.f84982c = bVar2;
            }

            @Override // qb0.b
            public void a(qb0.h hVar) {
                this.f84981b.a(hVar);
            }

            @Override // qb0.b
            public void onCompleted() {
                if (this.f84980a.compareAndSet(false, true)) {
                    this.f84981b.unsubscribe();
                    this.f84982c.onCompleted();
                }
            }

            @Override // qb0.b
            public void onError(Throwable th2) {
                if (!this.f84980a.compareAndSet(false, true)) {
                    ac0.c.I(th2);
                } else {
                    this.f84981b.unsubscribe();
                    this.f84982c.onError(th2);
                }
            }
        }

        public w(b[] bVarArr) {
            this.f84979a = bVarArr;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.b bVar) {
            ec0.b bVar2 = new ec0.b();
            bVar.a(bVar2);
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            a aVar = new a(atomicBoolean, bVar2, bVar);
            for (b bVar3 : this.f84979a) {
                if (bVar2.isUnsubscribed()) {
                    return;
                }
                if (bVar3 == null) {
                    Throwable nullPointerException = new NullPointerException("One of the sources is null");
                    if (!atomicBoolean.compareAndSet(false, true)) {
                        ac0.c.I(nullPointerException);
                        return;
                    } else {
                        bVar2.unsubscribe();
                        bVar.onError(nullPointerException);
                        return;
                    }
                }
                if (atomicBoolean.get() || bVar2.isUnsubscribed()) {
                    return;
                }
                bVar3.G0(aVar);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class x implements qb0.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ qb0.g f84984a;

        public x(qb0.g gVar) {
            this.f84984a = gVar;
        }

        @Override // qb0.b
        public void a(qb0.h hVar) {
            this.f84984a.add(hVar);
        }

        @Override // qb0.b
        public void onCompleted() {
            this.f84984a.onCompleted();
        }

        @Override // qb0.b
        public void onError(Throwable th2) {
            this.f84984a.onError(th2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class y implements j0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ rx.d f84986a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements wb0.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ qb0.b f84988a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d.a f84989b;

            public a(qb0.b bVar, d.a aVar) {
                this.f84988a = bVar;
                this.f84989b = aVar;
            }

            @Override // wb0.a
            public void call() {
                try {
                    b.this.G0(this.f84988a);
                } finally {
                    this.f84989b.unsubscribe();
                }
            }
        }

        public y(rx.d dVar) {
            this.f84986a = dVar;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.b bVar) {
            d.a a11 = this.f84986a.a();
            a11.h(new a(bVar, a11));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class z<T> implements c.a<T> {
        public z() {
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.g<? super T> gVar) {
            b.this.H0(gVar);
        }
    }

    public b(j0 j0Var) {
        this.f84860a = ac0.c.F(j0Var);
    }

    public static b A0(long j11, TimeUnit timeUnit, rx.d dVar) {
        g0(timeUnit);
        g0(dVar);
        return p(new c(dVar, j11, timeUnit));
    }

    public static NullPointerException C0(Throwable th2) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th2);
        return nullPointerException;
    }

    public static b D(Throwable th2) {
        g0(th2);
        return p(new g0(th2));
    }

    public static b E(wb0.o<? extends Throwable> oVar) {
        g0(oVar);
        return p(new f0(oVar));
    }

    public static b F(wb0.a aVar) {
        g0(aVar);
        return p(new h0(aVar));
    }

    public static b G(Callable<?> callable) {
        g0(callable);
        return p(new i0(callable));
    }

    public static b H(wb0.b<qb0.a> bVar) {
        return p(new rx.internal.operators.j(bVar));
    }

    public static b I(Future<?> future) {
        g0(future);
        return J(rx.c.v2(future));
    }

    public static b J(rx.c<?> cVar) {
        g0(cVar);
        return p(new a(cVar));
    }

    public static b K(rx.e<?> eVar) {
        g0(eVar);
        return p(new C1064b(eVar));
    }

    public static <R> b K0(wb0.o<R> oVar, wb0.p<? super R, ? extends b> pVar, wb0.b<? super R> bVar) {
        return L0(oVar, pVar, bVar, true);
    }

    public static <R> b L0(wb0.o<R> oVar, wb0.p<? super R, ? extends b> pVar, wb0.b<? super R> bVar, boolean z11) {
        g0(oVar);
        g0(pVar);
        g0(bVar);
        return p(new d(oVar, pVar, bVar, z11));
    }

    public static b O(Iterable<? extends b> iterable) {
        g0(iterable);
        return p(new rx.internal.operators.r(iterable));
    }

    public static b P(rx.c<? extends b> cVar) {
        return S(cVar, Integer.MAX_VALUE, false);
    }

    public static b Q(rx.c<? extends b> cVar, int i11) {
        return S(cVar, i11, false);
    }

    public static b R(b... bVarArr) {
        g0(bVarArr);
        return bVarArr.length == 0 ? i() : bVarArr.length == 1 ? bVarArr[0] : p(new rx.internal.operators.o(bVarArr));
    }

    public static b S(rx.c<? extends b> cVar, int i11, boolean z11) {
        g0(cVar);
        if (i11 >= 1) {
            return p(new rx.internal.operators.n(cVar, i11, z11));
        }
        throw new IllegalArgumentException("maxConcurrency > 0 required but it was " + i11);
    }

    public static b T(Iterable<? extends b> iterable) {
        g0(iterable);
        return p(new rx.internal.operators.q(iterable));
    }

    public static b U(rx.c<? extends b> cVar) {
        return S(cVar, Integer.MAX_VALUE, true);
    }

    public static b V(rx.c<? extends b> cVar, int i11) {
        return S(cVar, i11, true);
    }

    public static b W(b... bVarArr) {
        g0(bVarArr);
        return p(new rx.internal.operators.p(bVarArr));
    }

    public static b Y() {
        b bVar = f84859c;
        j0 F = ac0.c.F(bVar.f84860a);
        return F == bVar.f84860a ? bVar : new b(F, false);
    }

    public static b a(Iterable<? extends b> iterable) {
        g0(iterable);
        return p(new d0(iterable));
    }

    public static b b(b... bVarArr) {
        g0(bVarArr);
        return bVarArr.length == 0 ? i() : bVarArr.length == 1 ? bVarArr[0] : p(new w(bVarArr));
    }

    public static <T> T g0(T t11) {
        t11.getClass();
        return t11;
    }

    public static b i() {
        b bVar = f84858b;
        j0 F = ac0.c.F(bVar.f84860a);
        return F == bVar.f84860a ? bVar : new b(F, false);
    }

    public static b k(Iterable<? extends b> iterable) {
        g0(iterable);
        return p(new rx.internal.operators.m(iterable));
    }

    public static b l(rx.c<? extends b> cVar) {
        return m(cVar, 2);
    }

    public static b m(rx.c<? extends b> cVar, int i11) {
        g0(cVar);
        if (i11 >= 1) {
            return p(new rx.internal.operators.k(cVar, i11));
        }
        throw new IllegalArgumentException("prefetch > 0 required but it was " + i11);
    }

    public static b n(b... bVarArr) {
        g0(bVarArr);
        return bVarArr.length == 0 ? i() : bVarArr.length == 1 ? bVarArr[0] : p(new rx.internal.operators.l(bVarArr));
    }

    public static b p(j0 j0Var) {
        g0(j0Var);
        try {
            return new b(j0Var);
        } catch (NullPointerException e11) {
            throw e11;
        } catch (Throwable th2) {
            ac0.c.I(th2);
            throw C0(th2);
        }
    }

    public static b q(wb0.o<? extends b> oVar) {
        g0(oVar);
        return p(new e0(oVar));
    }

    public static void u(Throwable th2) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
    }

    public static b z0(long j11, TimeUnit timeUnit) {
        return A0(j11, timeUnit, bc0.c.a());
    }

    public final b A(wb0.b<? super qb0.h> bVar) {
        return z(bVar, wb0.m.a(), wb0.m.a(), wb0.m.a(), wb0.m.a());
    }

    public final b B(wb0.a aVar) {
        return z(wb0.m.a(), new l(aVar), aVar, wb0.m.a(), wb0.m.a());
    }

    public final <R> R B0(wb0.p<? super b, R> pVar) {
        return pVar.call(this);
    }

    public final b C(wb0.a aVar) {
        return z(wb0.m.a(), wb0.m.a(), wb0.m.a(), wb0.m.a(), aVar);
    }

    public final <T> rx.c<T> D0() {
        return rx.c.I6(new z());
    }

    public final <T> rx.e<T> E0(wb0.o<? extends T> oVar) {
        g0(oVar);
        return rx.e.n(new a0(oVar));
    }

    public final <T> rx.e<T> F0(T t11) {
        g0(t11);
        return E0(new b0(t11));
    }

    public final void G0(qb0.b bVar) {
        g0(bVar);
        try {
            ac0.c.D(this, this.f84860a).call(bVar);
        } catch (NullPointerException e11) {
            throw e11;
        } catch (Throwable th2) {
            vb0.a.e(th2);
            Throwable B = ac0.c.B(th2);
            ac0.c.I(B);
            throw C0(B);
        }
    }

    public final <T> void H0(qb0.g<T> gVar) {
        I0(gVar, true);
    }

    public final <T> void I0(qb0.g<T> gVar, boolean z11) {
        g0(gVar);
        if (z11) {
            try {
                gVar.onStart();
            } catch (NullPointerException e11) {
                throw e11;
            } catch (Throwable th2) {
                vb0.a.e(th2);
                Throwable L = ac0.c.L(th2);
                ac0.c.I(L);
                throw C0(L);
            }
        }
        G0(new x(gVar));
        ac0.c.N(gVar);
    }

    public final b J0(rx.d dVar) {
        g0(dVar);
        return p(new c0(dVar));
    }

    public final Throwable L() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Throwable[] thArr = new Throwable[1];
        G0(new m(countDownLatch, thArr));
        if (countDownLatch.getCount() == 0) {
            return thArr[0];
        }
        try {
            countDownLatch.await();
            return thArr[0];
        } catch (InterruptedException e11) {
            throw vb0.a.c(e11);
        }
    }

    public final Throwable M(long j11, TimeUnit timeUnit) {
        g0(timeUnit);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Throwable[] thArr = new Throwable[1];
        G0(new n(countDownLatch, thArr));
        if (countDownLatch.getCount() == 0) {
            return thArr[0];
        }
        try {
            if (countDownLatch.await(j11, timeUnit)) {
                return thArr[0];
            }
            vb0.a.c(new TimeoutException());
            return null;
        } catch (InterruptedException e11) {
            throw vb0.a.c(e11);
        }
    }

    public final b N(k0 k0Var) {
        g0(k0Var);
        return p(new o(k0Var));
    }

    public final b X(b bVar) {
        g0(bVar);
        return R(this, bVar);
    }

    public final b Z(rx.d dVar) {
        g0(dVar);
        return p(new p(dVar));
    }

    public final b a0() {
        return b0(rx.internal.util.o.b());
    }

    public final b b0(wb0.p<? super Throwable, Boolean> pVar) {
        g0(pVar);
        return p(new q(pVar));
    }

    public final b c(b bVar) {
        g0(bVar);
        return b(this, bVar);
    }

    public final b c0(wb0.p<? super Throwable, ? extends b> pVar) {
        g0(pVar);
        return p(new r(pVar));
    }

    public final b d(b bVar) {
        return o(bVar);
    }

    public final b d0() {
        return J(D0().g4());
    }

    public final <T> rx.c<T> e(rx.c<T> cVar) {
        g0(cVar);
        return cVar.y1(D0());
    }

    public final b e0(long j11) {
        return J(D0().h4(j11));
    }

    public final <T> rx.e<T> f(rx.e<T> eVar) {
        g0(eVar);
        return eVar.r(D0());
    }

    public final b f0(wb0.p<? super rx.c<? extends Void>, ? extends rx.c<?>> pVar) {
        g0(pVar);
        return J(D0().k4(pVar));
    }

    public final void g() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Throwable[] thArr = new Throwable[1];
        G0(new e(countDownLatch, thArr));
        if (countDownLatch.getCount() == 0) {
            Throwable th2 = thArr[0];
            if (th2 != null) {
                vb0.a.c(th2);
                return;
            }
            return;
        }
        try {
            countDownLatch.await();
            Throwable th3 = thArr[0];
            if (th3 != null) {
                vb0.a.c(th3);
            }
        } catch (InterruptedException e11) {
            throw vb0.a.c(e11);
        }
    }

    public final boolean h(long j11, TimeUnit timeUnit) {
        Throwable th2;
        g0(timeUnit);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Throwable[] thArr = new Throwable[1];
        G0(new f(countDownLatch, thArr));
        if (countDownLatch.getCount() == 0) {
            Throwable th3 = thArr[0];
            if (th3 != null) {
                vb0.a.c(th3);
            }
            return true;
        }
        try {
            boolean await = countDownLatch.await(j11, timeUnit);
            if (await && (th2 = thArr[0]) != null) {
                vb0.a.c(th2);
            }
            return await;
        } catch (InterruptedException e11) {
            throw vb0.a.c(e11);
        }
    }

    public final b h0() {
        return J(D0().C4());
    }

    public final b i0(long j11) {
        return J(D0().D4(j11));
    }

    public final b j(l0 l0Var) {
        return (b) B0(l0Var);
    }

    public final b j0(wb0.q<Integer, Throwable, Boolean> qVar) {
        return J(D0().E4(qVar));
    }

    public final b k0(wb0.p<? super rx.c<? extends Throwable>, ? extends rx.c<?>> pVar) {
        return J(D0().F4(pVar));
    }

    public final b l0(b bVar) {
        g0(bVar);
        return n(bVar, this);
    }

    public final <T> rx.c<T> m0(rx.c<T> cVar) {
        g0(cVar);
        return D0().o5(cVar);
    }

    public final qb0.h n0() {
        ec0.c cVar = new ec0.c();
        G0(new s(cVar));
        return cVar;
    }

    public final b o(b bVar) {
        g0(bVar);
        return n(this, bVar);
    }

    public final qb0.h o0(wb0.a aVar) {
        g0(aVar);
        ec0.c cVar = new ec0.c();
        G0(new t(aVar, cVar));
        return cVar;
    }

    public final qb0.h p0(wb0.a aVar, wb0.b<? super Throwable> bVar) {
        g0(aVar);
        g0(bVar);
        ec0.c cVar = new ec0.c();
        G0(new u(aVar, cVar, bVar));
        return cVar;
    }

    public final void q0(qb0.b bVar) {
        if (!(bVar instanceof zb0.d)) {
            bVar = new zb0.d(bVar);
        }
        G0(bVar);
    }

    public final b r(long j11, TimeUnit timeUnit) {
        return t(j11, timeUnit, bc0.c.a(), false);
    }

    public final <T> void r0(qb0.g<T> gVar) {
        gVar.onStart();
        if (!(gVar instanceof zb0.e)) {
            gVar = new zb0.e(gVar);
        }
        I0(gVar, false);
    }

    public final b s(long j11, TimeUnit timeUnit, rx.d dVar) {
        return t(j11, timeUnit, dVar, false);
    }

    public final b s0(rx.d dVar) {
        g0(dVar);
        return p(new y(dVar));
    }

    public final b t(long j11, TimeUnit timeUnit, rx.d dVar, boolean z11) {
        g0(timeUnit);
        g0(dVar);
        return p(new g(dVar, j11, timeUnit, z11));
    }

    public final zb0.a<Void> t0() {
        xb0.a q11 = xb0.a.q(Long.MAX_VALUE);
        r0(q11);
        return q11;
    }

    public final b u0(long j11, TimeUnit timeUnit) {
        return y0(j11, timeUnit, bc0.c.a(), null);
    }

    public final b v(wb0.a aVar) {
        return z(wb0.m.a(), wb0.m.a(), wb0.m.a(), aVar, wb0.m.a());
    }

    public final b v0(long j11, TimeUnit timeUnit, b bVar) {
        g0(bVar);
        return y0(j11, timeUnit, bc0.c.a(), bVar);
    }

    public final b w(wb0.a aVar) {
        return z(wb0.m.a(), wb0.m.a(), aVar, wb0.m.a(), wb0.m.a());
    }

    public final b w0(long j11, TimeUnit timeUnit, rx.d dVar) {
        return y0(j11, timeUnit, dVar, null);
    }

    public final b x(wb0.b<Notification<Object>> bVar) {
        if (bVar != null) {
            return z(wb0.m.a(), new h(bVar), new i(bVar), wb0.m.a(), wb0.m.a());
        }
        throw new IllegalArgumentException("onNotification is null");
    }

    public final b x0(long j11, TimeUnit timeUnit, rx.d dVar, b bVar) {
        g0(bVar);
        return y0(j11, timeUnit, dVar, bVar);
    }

    public final b y(wb0.b<? super Throwable> bVar) {
        return z(wb0.m.a(), bVar, wb0.m.a(), wb0.m.a(), wb0.m.a());
    }

    public final b y0(long j11, TimeUnit timeUnit, rx.d dVar, b bVar) {
        g0(timeUnit);
        g0(dVar);
        return p(new rx.internal.operators.s(this, j11, timeUnit, dVar, bVar));
    }

    public final b z(wb0.b<? super qb0.h> bVar, wb0.b<? super Throwable> bVar2, wb0.a aVar, wb0.a aVar2, wb0.a aVar3) {
        g0(bVar);
        g0(bVar2);
        g0(aVar);
        g0(aVar2);
        g0(aVar3);
        return p(new j(aVar, aVar2, bVar2, bVar, aVar3));
    }

    public b(j0 j0Var, boolean z11) {
        this.f84860a = z11 ? ac0.c.F(j0Var) : j0Var;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements j0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ rx.c f84861a;

        public a(rx.c cVar) {
            this.f84861a = cVar;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.b bVar) {
            C1063a c1063a = new C1063a(bVar);
            bVar.a(c1063a);
            this.f84861a.J6(c1063a);
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: rx.b$a$a, reason: collision with other inner class name */
        public class C1063a extends qb0.g<Object> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ qb0.b f84862a;

            public C1063a(qb0.b bVar) {
                this.f84862a = bVar;
            }

            @Override // qb0.c
            public void onCompleted() {
                this.f84862a.onCompleted();
            }

            @Override // qb0.c
            public void onError(Throwable th2) {
                this.f84862a.onError(th2);
            }

            @Override // qb0.c
            public void onNext(Object obj) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements qb0.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f84902a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Throwable[] f84903b;

        public e(CountDownLatch countDownLatch, Throwable[] thArr) {
            this.f84902a = countDownLatch;
            this.f84903b = thArr;
        }

        @Override // qb0.b
        public void onCompleted() {
            this.f84902a.countDown();
        }

        @Override // qb0.b
        public void onError(Throwable th2) {
            this.f84903b[0] = th2;
            this.f84902a.countDown();
        }

        @Override // qb0.b
        public void a(qb0.h hVar) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f implements qb0.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f84906a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Throwable[] f84907b;

        public f(CountDownLatch countDownLatch, Throwable[] thArr) {
            this.f84906a = countDownLatch;
            this.f84907b = thArr;
        }

        @Override // qb0.b
        public void onCompleted() {
            this.f84906a.countDown();
        }

        @Override // qb0.b
        public void onError(Throwable th2) {
            this.f84907b[0] = th2;
            this.f84906a.countDown();
        }

        @Override // qb0.b
        public void a(qb0.h hVar) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class m implements qb0.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f84941a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Throwable[] f84942b;

        public m(CountDownLatch countDownLatch, Throwable[] thArr) {
            this.f84941a = countDownLatch;
            this.f84942b = thArr;
        }

        @Override // qb0.b
        public void onCompleted() {
            this.f84941a.countDown();
        }

        @Override // qb0.b
        public void onError(Throwable th2) {
            this.f84942b[0] = th2;
            this.f84941a.countDown();
        }

        @Override // qb0.b
        public void a(qb0.h hVar) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class n implements qb0.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f84944a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Throwable[] f84945b;

        public n(CountDownLatch countDownLatch, Throwable[] thArr) {
            this.f84944a = countDownLatch;
            this.f84945b = thArr;
        }

        @Override // qb0.b
        public void onCompleted() {
            this.f84944a.countDown();
        }

        @Override // qb0.b
        public void onError(Throwable th2) {
            this.f84945b[0] = th2;
            this.f84944a.countDown();
        }

        @Override // qb0.b
        public void a(qb0.h hVar) {
        }
    }
}
