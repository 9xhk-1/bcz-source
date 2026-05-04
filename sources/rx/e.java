package rx;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import rx.c;
import rx.d;
import rx.internal.operators.a5;
import rx.internal.operators.b5;
import rx.internal.operators.c5;
import rx.internal.operators.d5;
import rx.internal.operators.h4;
import rx.internal.operators.i4;
import rx.internal.operators.j4;
import rx.internal.operators.k4;
import rx.internal.operators.l4;
import rx.internal.operators.m4;
import rx.internal.operators.n4;
import rx.internal.operators.o4;
import rx.internal.operators.p4;
import rx.internal.operators.q4;
import rx.internal.operators.r4;
import rx.internal.operators.s4;
import rx.internal.operators.t4;
import rx.internal.operators.u4;
import rx.internal.operators.v4;
import rx.internal.operators.w4;
import rx.internal.operators.x4;
import rx.internal.operators.y4;
import rx.internal.operators.z4;
import wb0.v;
import wb0.w;
import wb0.x;
import wb0.y;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class e<T> {

    /* renamed from: a, reason: collision with root package name */
    public final t<T> f84993a;

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<R> implements y<R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x f84994a;

        public a(x xVar) {
            this.f84994a = xVar;
        }

        @Override // wb0.y
        public R call(Object... objArr) {
            return (R) this.f84994a.e(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7], objArr[8]);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends qb0.f<T> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ wb0.b f84995b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ wb0.b f84996c;

        public b(wb0.b bVar, wb0.b bVar2) {
            this.f84995b = bVar;
            this.f84996c = bVar2;
        }

        @Override // qb0.f
        public final void h(T t11) {
            try {
                this.f84996c.call(t11);
            } finally {
                unsubscribe();
            }
        }

        @Override // qb0.f
        public final void onError(Throwable th2) {
            try {
                this.f84995b.call(th2);
            } finally {
                unsubscribe();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends qb0.f<T> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qb0.c f84998b;

        public c(qb0.c cVar) {
            this.f84998b = cVar;
        }

        @Override // qb0.f
        public void h(T t11) {
            this.f84998b.onNext(t11);
            this.f84998b.onCompleted();
        }

        @Override // qb0.f
        public void onError(Throwable th2) {
            this.f84998b.onError(th2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements t<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ rx.d f85000a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements wb0.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ qb0.f f85002a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d.a f85003b;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: rx.e$d$a$a, reason: collision with other inner class name */
            public class C1075a extends qb0.f<T> {
                public C1075a() {
                }

                @Override // qb0.f
                public void h(T t11) {
                    try {
                        a.this.f85002a.h(t11);
                    } finally {
                        a.this.f85003b.unsubscribe();
                    }
                }

                @Override // qb0.f
                public void onError(Throwable th2) {
                    try {
                        a.this.f85002a.onError(th2);
                    } finally {
                        a.this.f85003b.unsubscribe();
                    }
                }
            }

            public a(qb0.f fVar, d.a aVar) {
                this.f85002a = fVar;
                this.f85003b = aVar;
            }

            @Override // wb0.a
            public void call() {
                C1075a c1075a = new C1075a();
                this.f85002a.b(c1075a);
                e.this.j0(c1075a);
            }
        }

        public d(rx.d dVar) {
            this.f85000a = dVar;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.f<? super T> fVar) {
            d.a a11 = this.f85000a.a();
            fVar.b(a11);
            a11.h(new a(fVar, a11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: rx.e$e, reason: collision with other inner class name */
    public class C1076e implements wb0.o<e<T>> {
        public C1076e() {
        }

        @Override // wb0.o, java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e<T> call() {
            return e.y(new TimeoutException());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f implements wb0.b<Throwable> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.b f85007a;

        public f(wb0.b bVar) {
            this.f85007a = bVar;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th2) {
            this.f85007a.call(th2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g implements wb0.b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.b f85009a;

        public g(wb0.b bVar) {
            this.f85009a = bVar;
        }

        @Override // wb0.b
        public void call(T t11) {
            this.f85009a.call(Notification.e(t11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h implements wb0.b<Throwable> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.b f85011a;

        public h(wb0.b bVar) {
            this.f85011a = bVar;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th2) {
            this.f85011a.call(Notification.d(th2));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class i implements t<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callable f85013a;

        public i(Callable callable) {
            this.f85013a = callable;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.f<? super T> fVar) {
            try {
                ((e) this.f85013a.call()).j0(fVar);
            } catch (Throwable th2) {
                vb0.a.e(th2);
                fVar.onError(th2);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class j implements t<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ rx.d f85014a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends qb0.f<T> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ qb0.f f85016b;

            public a(qb0.f fVar) {
                this.f85016b = fVar;
            }

            @Override // qb0.f
            public void h(T t11) {
                this.f85016b.h(t11);
            }

            @Override // qb0.f
            public void onError(Throwable th2) {
                this.f85016b.onError(th2);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b implements wb0.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ qb0.f f85018a;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public class a implements wb0.a {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ d.a f85020a;

                public a(d.a aVar) {
                    this.f85020a = aVar;
                }

                @Override // wb0.a
                public void call() {
                    try {
                        b.this.f85018a.unsubscribe();
                    } finally {
                        this.f85020a.unsubscribe();
                    }
                }
            }

            public b(qb0.f fVar) {
                this.f85018a = fVar;
            }

            @Override // wb0.a
            public void call() {
                d.a a11 = j.this.f85014a.a();
                a11.h(new a(a11));
            }
        }

        public j(rx.d dVar) {
            this.f85014a = dVar;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.f<? super T> fVar) {
            a aVar = new a(fVar);
            fVar.b(ec0.f.a(new b(aVar)));
            e.this.j0(aVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class k implements t<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Throwable f85022a;

        public k(Throwable th2) {
            this.f85022a = th2;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.f<? super T> fVar) {
            fVar.onError(this.f85022a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class l implements t<T> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends qb0.f<e<? extends T>> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ qb0.f f85024b;

            public a(qb0.f fVar) {
                this.f85024b = fVar;
            }

            @Override // qb0.f
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public void h(e<? extends T> eVar) {
                eVar.j0(this.f85024b);
            }

            @Override // qb0.f
            public void onError(Throwable th2) {
                this.f85024b.onError(th2);
            }
        }

        public l() {
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.f<? super T> fVar) {
            a aVar = new a(fVar);
            fVar.b(aVar);
            e.this.j0(aVar);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class m<R> implements y<R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.q f85026a;

        public m(wb0.q qVar) {
            this.f85026a = qVar;
        }

        @Override // wb0.y
        public R call(Object... objArr) {
            return (R) this.f85026a.call(objArr[0], objArr[1]);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class n<R> implements y<R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.r f85027a;

        public n(wb0.r rVar) {
            this.f85027a = rVar;
        }

        @Override // wb0.y
        public R call(Object... objArr) {
            return (R) this.f85027a.i(objArr[0], objArr[1], objArr[2]);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class o<R> implements y<R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.s f85028a;

        public o(wb0.s sVar) {
            this.f85028a = sVar;
        }

        @Override // wb0.y
        public R call(Object... objArr) {
            return (R) this.f85028a.k(objArr[0], objArr[1], objArr[2], objArr[3]);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class p<R> implements y<R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.t f85029a;

        public p(wb0.t tVar) {
            this.f85029a = tVar;
        }

        @Override // wb0.y
        public R call(Object... objArr) {
            return (R) this.f85029a.c(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class q<R> implements y<R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.u f85030a;

        public q(wb0.u uVar) {
            this.f85030a = uVar;
        }

        @Override // wb0.y
        public R call(Object... objArr) {
            return (R) this.f85030a.g(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class r<R> implements y<R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v f85031a;

        public r(v vVar) {
            this.f85031a = vVar;
        }

        @Override // wb0.y
        public R call(Object... objArr) {
            return (R) this.f85031a.f(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6]);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class s<R> implements y<R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w f85032a;

        public s(w wVar) {
            this.f85032a = wVar;
        }

        @Override // wb0.y
        public R call(Object... objArr) {
            return (R) this.f85032a.d(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7]);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface t<T> extends wb0.b<qb0.f<? super T>> {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface u<T, R> extends wb0.p<e<T>, e<R>> {
    }

    public e(t<T> tVar) {
        this.f84993a = ac0.c.H(tVar);
    }

    public static <T> e<T> C(Future<? extends T> future) {
        return n(new o4(future, 0L, null));
    }

    public static <T> e<T> D(Future<? extends T> future, long j11, TimeUnit timeUnit) {
        if (timeUnit != null) {
            return n(new o4(future, j11, timeUnit));
        }
        throw new NullPointerException("unit is null");
    }

    public static <T, Resource> e<T> D0(wb0.o<Resource> oVar, wb0.p<? super Resource, ? extends e<? extends T>> pVar, wb0.b<? super Resource> bVar) {
        return E0(oVar, pVar, bVar, false);
    }

    public static <T> e<T> E(Future<? extends T> future, rx.d dVar) {
        return C(future).n0(dVar);
    }

    public static <T, Resource> e<T> E0(wb0.o<Resource> oVar, wb0.p<? super Resource, ? extends e<? extends T>> pVar, wb0.b<? super Resource> bVar, boolean z11) {
        if (oVar == null) {
            throw new NullPointerException("resourceFactory is null");
        }
        if (pVar == null) {
            throw new NullPointerException("singleFactory is null");
        }
        if (bVar != null) {
            return n(new v4(oVar, pVar, bVar, z11));
        }
        throw new NullPointerException("disposeAction is null");
    }

    public static <T> e<T> F(Callable<? extends T> callable) {
        return n(new m4(callable));
    }

    public static <R> e<R> F0(Iterable<? extends e<?>> iterable, y<? extends R> yVar) {
        return y4.a(H(iterable), yVar);
    }

    public static <T> e<T> G(wb0.b<qb0.e<T>> bVar) {
        if (bVar != null) {
            return n(new n4(bVar));
        }
        throw new NullPointerException("producer is null");
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> e<R> G0(e<? extends T1> eVar, e<? extends T2> eVar2, e<? extends T3> eVar3, e<? extends T4> eVar4, e<? extends T5> eVar5, e<? extends T6> eVar6, e<? extends T7> eVar7, e<? extends T8> eVar8, e<? extends T9> eVar9, x<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> xVar) {
        return y4.a(new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9}, new a(xVar));
    }

    public static <T> e<? extends T>[] H(Iterable<? extends e<? extends T>> iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            return (e[]) collection.toArray(new e[collection.size()]);
        }
        e<? extends T>[] eVarArr = new e[8];
        int i11 = 0;
        for (e<? extends T> eVar : iterable) {
            if (i11 == eVarArr.length) {
                e<? extends T>[] eVarArr2 = new e[(i11 >> 2) + i11];
                System.arraycopy(eVarArr, 0, eVarArr2, 0, i11);
                eVarArr = eVarArr2;
            }
            eVarArr[i11] = eVar;
            i11++;
        }
        if (eVarArr.length == i11) {
            return eVarArr;
        }
        e<? extends T>[] eVarArr3 = new e[i11];
        System.arraycopy(eVarArr, 0, eVarArr3, 0, i11);
        return eVarArr3;
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> e<R> H0(e<? extends T1> eVar, e<? extends T2> eVar2, e<? extends T3> eVar3, e<? extends T4> eVar4, e<? extends T5> eVar5, e<? extends T6> eVar6, e<? extends T7> eVar7, e<? extends T8> eVar8, w<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> wVar) {
        return y4.a(new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8}, new s(wVar));
    }

    public static <T> e<T> I(T t11) {
        return rx.internal.util.l.P0(t11);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> e<R> I0(e<? extends T1> eVar, e<? extends T2> eVar2, e<? extends T3> eVar3, e<? extends T4> eVar4, e<? extends T5> eVar5, e<? extends T6> eVar6, e<? extends T7> eVar7, v<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> vVar) {
        return y4.a(new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7}, new r(vVar));
    }

    public static <T1, T2, T3, T4, T5, T6, R> e<R> J0(e<? extends T1> eVar, e<? extends T2> eVar2, e<? extends T3> eVar3, e<? extends T4> eVar4, e<? extends T5> eVar5, e<? extends T6> eVar6, wb0.u<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> uVar) {
        return y4.a(new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6}, new q(uVar));
    }

    public static <T1, T2, T3, T4, T5, R> e<R> K0(e<? extends T1> eVar, e<? extends T2> eVar2, e<? extends T3> eVar3, e<? extends T4> eVar4, e<? extends T5> eVar5, wb0.t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> tVar) {
        return y4.a(new e[]{eVar, eVar2, eVar3, eVar4, eVar5}, new p(tVar));
    }

    public static <T> rx.c<T> L(rx.c<? extends e<? extends T>> cVar) {
        return M(cVar, Integer.MAX_VALUE);
    }

    public static <T1, T2, T3, T4, R> e<R> L0(e<? extends T1> eVar, e<? extends T2> eVar2, e<? extends T3> eVar3, e<? extends T4> eVar4, wb0.s<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> sVar) {
        return y4.a(new e[]{eVar, eVar2, eVar3, eVar4}, new o(sVar));
    }

    public static <T> rx.c<T> M(rx.c<? extends e<? extends T>> cVar, int i11) {
        return (rx.c<T>) cVar.q2(rx.internal.util.o.c(), false, i11);
    }

    public static <T1, T2, T3, R> e<R> M0(e<? extends T1> eVar, e<? extends T2> eVar2, e<? extends T3> eVar3, wb0.r<? super T1, ? super T2, ? super T3, ? extends R> rVar) {
        return y4.a(new e[]{eVar, eVar2, eVar3}, new n(rVar));
    }

    public static <T> rx.c<T> N(e<? extends T> eVar, e<? extends T> eVar2) {
        return rx.c.j3(a(eVar), a(eVar2));
    }

    public static <T1, T2, R> e<R> N0(e<? extends T1> eVar, e<? extends T2> eVar2, wb0.q<? super T1, ? super T2, ? extends R> qVar) {
        return y4.a(new e[]{eVar, eVar2}, new m(qVar));
    }

    public static <T> rx.c<T> O(e<? extends T> eVar, e<? extends T> eVar2, e<? extends T> eVar3) {
        return rx.c.k3(a(eVar), a(eVar2), a(eVar3));
    }

    public static <T> rx.c<T> P(e<? extends T> eVar, e<? extends T> eVar2, e<? extends T> eVar3, e<? extends T> eVar4) {
        return rx.c.l3(a(eVar), a(eVar2), a(eVar3), a(eVar4));
    }

    public static <T> rx.c<T> Q(e<? extends T> eVar, e<? extends T> eVar2, e<? extends T> eVar3, e<? extends T> eVar4, e<? extends T> eVar5) {
        return rx.c.m3(a(eVar), a(eVar2), a(eVar3), a(eVar4), a(eVar5));
    }

    public static <T> rx.c<T> R(e<? extends T> eVar, e<? extends T> eVar2, e<? extends T> eVar3, e<? extends T> eVar4, e<? extends T> eVar5, e<? extends T> eVar6) {
        return rx.c.n3(a(eVar), a(eVar2), a(eVar3), a(eVar4), a(eVar5), a(eVar6));
    }

    public static <T> rx.c<T> S(e<? extends T> eVar, e<? extends T> eVar2, e<? extends T> eVar3, e<? extends T> eVar4, e<? extends T> eVar5, e<? extends T> eVar6, e<? extends T> eVar7) {
        return rx.c.o3(a(eVar), a(eVar2), a(eVar3), a(eVar4), a(eVar5), a(eVar6), a(eVar7));
    }

    public static <T> rx.c<T> T(e<? extends T> eVar, e<? extends T> eVar2, e<? extends T> eVar3, e<? extends T> eVar4, e<? extends T> eVar5, e<? extends T> eVar6, e<? extends T> eVar7, e<? extends T> eVar8) {
        return rx.c.p3(a(eVar), a(eVar2), a(eVar3), a(eVar4), a(eVar5), a(eVar6), a(eVar7), a(eVar8));
    }

    public static <T> rx.c<T> U(e<? extends T> eVar, e<? extends T> eVar2, e<? extends T> eVar3, e<? extends T> eVar4, e<? extends T> eVar5, e<? extends T> eVar6, e<? extends T> eVar7, e<? extends T> eVar8, e<? extends T> eVar9) {
        return rx.c.q3(a(eVar), a(eVar2), a(eVar3), a(eVar4), a(eVar5), a(eVar6), a(eVar7), a(eVar8), a(eVar9));
    }

    public static <T> e<T> V(e<? extends e<? extends T>> eVar) {
        return eVar instanceof rx.internal.util.l ? ((rx.internal.util.l) eVar).R0(rx.internal.util.o.c()) : n(new l());
    }

    public static <T> rx.c<T> W(rx.c<? extends e<? extends T>> cVar) {
        return M(cVar, Integer.MAX_VALUE);
    }

    public static <T> rx.c<T> X(rx.c<? extends e<? extends T>> cVar, int i11) {
        return (rx.c<T>) cVar.q2(rx.internal.util.o.c(), true, i11);
    }

    public static <T> rx.c<T> a(e<T> eVar) {
        return rx.c.I6(new d5(eVar.f84993a));
    }

    public static <T> rx.c<T> e(e<? extends T> eVar, e<? extends T> eVar2) {
        return rx.c.v0(a(eVar), a(eVar2));
    }

    public static <T> rx.c<T> f(e<? extends T> eVar, e<? extends T> eVar2, e<? extends T> eVar3) {
        return rx.c.w0(a(eVar), a(eVar2), a(eVar3));
    }

    public static <T> rx.c<T> g(e<? extends T> eVar, e<? extends T> eVar2, e<? extends T> eVar3, e<? extends T> eVar4) {
        return rx.c.x0(a(eVar), a(eVar2), a(eVar3), a(eVar4));
    }

    public static <T> rx.c<T> h(e<? extends T> eVar, e<? extends T> eVar2, e<? extends T> eVar3, e<? extends T> eVar4, e<? extends T> eVar5) {
        return rx.c.y0(a(eVar), a(eVar2), a(eVar3), a(eVar4), a(eVar5));
    }

    public static <T> rx.c<T> i(e<? extends T> eVar, e<? extends T> eVar2, e<? extends T> eVar3, e<? extends T> eVar4, e<? extends T> eVar5, e<? extends T> eVar6) {
        return rx.c.z0(a(eVar), a(eVar2), a(eVar3), a(eVar4), a(eVar5), a(eVar6));
    }

    public static <T> rx.c<T> j(e<? extends T> eVar, e<? extends T> eVar2, e<? extends T> eVar3, e<? extends T> eVar4, e<? extends T> eVar5, e<? extends T> eVar6, e<? extends T> eVar7) {
        return rx.c.A0(a(eVar), a(eVar2), a(eVar3), a(eVar4), a(eVar5), a(eVar6), a(eVar7));
    }

    public static <T> rx.c<T> k(e<? extends T> eVar, e<? extends T> eVar2, e<? extends T> eVar3, e<? extends T> eVar4, e<? extends T> eVar5, e<? extends T> eVar6, e<? extends T> eVar7, e<? extends T> eVar8) {
        return rx.c.B0(a(eVar), a(eVar2), a(eVar3), a(eVar4), a(eVar5), a(eVar6), a(eVar7), a(eVar8));
    }

    public static <T> rx.c<T> l(e<? extends T> eVar, e<? extends T> eVar2, e<? extends T> eVar3, e<? extends T> eVar4, e<? extends T> eVar5, e<? extends T> eVar6, e<? extends T> eVar7, e<? extends T> eVar8, e<? extends T> eVar9) {
        return rx.c.C0(a(eVar), a(eVar2), a(eVar3), a(eVar4), a(eVar5), a(eVar6), a(eVar7), a(eVar8), a(eVar9));
    }

    public static <T> e<T> n(t<T> tVar) {
        return new e<>(tVar);
    }

    public static <T> e<T> o(Callable<e<T>> callable) {
        return n(new i(callable));
    }

    public static <T> e<T> y(Throwable th2) {
        return n(new k(th2));
    }

    public final rx.b A(wb0.p<? super T, ? extends rx.b> pVar) {
        return rx.b.p(new rx.internal.operators.i(this, pVar));
    }

    public final qb0.h A0(qb0.g<? super T> gVar) {
        return B0(gVar, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> rx.c<R> B(wb0.p<? super T, ? extends rx.c<? extends R>> pVar) {
        return rx.c.h3(a(K(pVar)));
    }

    public final qb0.h B0(qb0.g<? super T> gVar, boolean z11) {
        if (z11) {
            try {
                gVar.onStart();
            } catch (Throwable th2) {
                vb0.a.e(th2);
                try {
                    gVar.onError(ac0.c.Q(th2));
                    return ec0.f.e();
                } catch (Throwable th3) {
                    vb0.a.e(th3);
                    RuntimeException runtimeException = new RuntimeException("Error occurred attempting to subscribe [" + th2.getMessage() + "] and then again while trying to pass to onError.", th3);
                    ac0.c.Q(runtimeException);
                    throw runtimeException;
                }
            }
        }
        ac0.c.T(this, this.f84993a).call(q4.b(gVar));
        return ac0.c.S(gVar);
    }

    @ub0.b
    public final e<T> C0(rx.d dVar) {
        return n(new j(dVar));
    }

    public final <R> e<R> J(c.b<? extends R, ? super T> bVar) {
        return n(new q4(this.f84993a, bVar));
    }

    public final <R> e<R> K(wb0.p<? super T, ? extends R> pVar) {
        return n(new u4(this, pVar));
    }

    public final <T2, R> e<R> O0(e<? extends T2> eVar, wb0.q<? super T, ? super T2, ? extends R> qVar) {
        return N0(this, eVar, qVar);
    }

    public final rx.c<T> Y(e<? extends T> eVar) {
        return N(this, eVar);
    }

    public final e<T> Z(rx.d dVar) {
        if (this instanceof rx.internal.util.l) {
            return ((rx.internal.util.l) this).S0(dVar);
        }
        if (dVar != null) {
            return n(new r4(this.f84993a, dVar));
        }
        throw new NullPointerException("scheduler is null");
    }

    public final e<T> a0(e<? extends T> eVar) {
        return new e<>(x4.h(this, eVar));
    }

    public final e<T> b() {
        return z0().e0(1).D6();
    }

    public final e<T> b0(wb0.p<Throwable, ? extends e<? extends T>> pVar) {
        return new e<>(x4.b(this, pVar));
    }

    @ub0.b
    public final <R> e<R> c(Class<R> cls) {
        return K(new w4(cls));
    }

    public final e<T> c0(wb0.p<Throwable, ? extends T> pVar) {
        return n(new s4(this.f84993a, pVar));
    }

    public <R> e<R> d(u<? super T, ? extends R> uVar) {
        return (e) uVar.call(this);
    }

    public final e<T> d0() {
        return z0().C4().D6();
    }

    public final e<T> e0(long j11) {
        return z0().D4(j11).D6();
    }

    public final e<T> f0(wb0.q<Integer, Throwable, Boolean> qVar) {
        return z0().E4(qVar).D6();
    }

    public final e<T> g0(wb0.p<rx.c<? extends Throwable>, ? extends rx.c<?>> pVar) {
        return z0().F4(pVar).D6();
    }

    public final qb0.h h0() {
        return m0(wb0.m.a(), wb0.m.b());
    }

    public final qb0.h i0(qb0.c<? super T> cVar) {
        if (cVar != null) {
            return j0(new c(cVar));
        }
        throw new NullPointerException("observer is null");
    }

    public final qb0.h j0(qb0.f<? super T> fVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("te is null");
        }
        try {
            ac0.c.T(this, this.f84993a).call(fVar);
            return ac0.c.S(fVar);
        } catch (Throwable th2) {
            vb0.a.e(th2);
            try {
                fVar.onError(ac0.c.Q(th2));
                return ec0.f.b();
            } catch (Throwable th3) {
                vb0.a.e(th3);
                RuntimeException runtimeException = new RuntimeException("Error occurred attempting to subscribe [" + th2.getMessage() + "] and then again while trying to pass to onError.", th3);
                ac0.c.Q(runtimeException);
                throw runtimeException;
            }
        }
    }

    public final qb0.h k0(qb0.g<? super T> gVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("observer can not be null");
        }
        gVar.onStart();
        return !(gVar instanceof zb0.e) ? B0(new zb0.e(gVar), false) : B0(gVar, true);
    }

    public final qb0.h l0(wb0.b<? super T> bVar) {
        return m0(bVar, wb0.m.b());
    }

    public final rx.c<T> m(e<? extends T> eVar) {
        return e(this, eVar);
    }

    public final qb0.h m0(wb0.b<? super T> bVar, wb0.b<Throwable> bVar2) {
        if (bVar == null) {
            throw new IllegalArgumentException("onSuccess can not be null");
        }
        if (bVar2 != null) {
            return j0(new b(bVar2, bVar));
        }
        throw new IllegalArgumentException("onError can not be null");
    }

    public final e<T> n0(rx.d dVar) {
        return this instanceof rx.internal.util.l ? ((rx.internal.util.l) this).S0(dVar) : n(new d(dVar));
    }

    public final e<T> o0(rx.b bVar) {
        return n(new z4(this.f84993a, bVar));
    }

    public final e<T> p(long j11, TimeUnit timeUnit) {
        return q(j11, timeUnit, bc0.c.a());
    }

    public final <E> e<T> p0(rx.c<? extends E> cVar) {
        return n(new a5(this.f84993a, cVar));
    }

    public final e<T> q(long j11, TimeUnit timeUnit, rx.d dVar) {
        return n(new h4(this.f84993a, j11, timeUnit, dVar));
    }

    public final <E> e<T> q0(e<? extends E> eVar) {
        return n(new b5(this.f84993a, eVar));
    }

    public final e<T> r(rx.c<?> cVar) {
        cVar.getClass();
        return n(new t4(this, cVar));
    }

    public final zb0.a<T> r0() {
        xb0.a q11 = xb0.a.q(Long.MAX_VALUE);
        k0(q11);
        return q11;
    }

    public final e<T> s(wb0.a aVar) {
        return n(new i4(this, aVar));
    }

    public final e<T> s0(long j11, TimeUnit timeUnit) {
        return v0(j11, timeUnit, null, bc0.c.a());
    }

    public final e<T> t(wb0.b<Notification<? extends T>> bVar) {
        if (bVar != null) {
            return n(new j4(this, new g(bVar), new h(bVar)));
        }
        throw new IllegalArgumentException("onNotification is null");
    }

    public final e<T> t0(long j11, TimeUnit timeUnit, rx.d dVar) {
        return v0(j11, timeUnit, null, dVar);
    }

    public final e<T> u(wb0.b<Throwable> bVar) {
        if (bVar != null) {
            return n(new j4(this, wb0.m.a(), new f(bVar)));
        }
        throw new IllegalArgumentException("onError is null");
    }

    public final e<T> u0(long j11, TimeUnit timeUnit, e<? extends T> eVar) {
        return v0(j11, timeUnit, eVar, bc0.c.a());
    }

    public final e<T> v(wb0.a aVar) {
        return n(new k4(this.f84993a, aVar));
    }

    public final e<T> v0(long j11, TimeUnit timeUnit, e<? extends T> eVar, rx.d dVar) {
        if (eVar == null) {
            eVar = o(new C1076e());
        }
        return n(new c5(this.f84993a, j11, timeUnit, dVar, eVar.f84993a));
    }

    public final e<T> w(wb0.b<? super T> bVar) {
        if (bVar != null) {
            return n(new j4(this, bVar, wb0.m.a()));
        }
        throw new IllegalArgumentException("onSuccess is null");
    }

    public final <R> R w0(wb0.p<? super e<T>, R> pVar) {
        return pVar.call(this);
    }

    public final e<T> x(wb0.a aVar) {
        return n(new l4(this.f84993a, aVar));
    }

    public final cc0.a<T> x0() {
        return cc0.a.a(this);
    }

    public final rx.b y0() {
        return rx.b.K(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> e<R> z(wb0.p<? super T, ? extends e<? extends R>> pVar) {
        return this instanceof rx.internal.util.l ? ((rx.internal.util.l) this).R0(pVar) : V(K(pVar));
    }

    public final rx.c<T> z0() {
        return a(this);
    }

    @Deprecated
    public e(c.a<T> aVar) {
        this.f84993a = ac0.c.H(new p4(aVar));
    }
}
