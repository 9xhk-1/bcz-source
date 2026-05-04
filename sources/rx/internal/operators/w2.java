package rx.internal.operators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.c;
import rx.exceptions.OnErrorThrowable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class w2<T> extends yb0.c<T> implements qb0.h {

    /* renamed from: e, reason: collision with root package name */
    public static final wb0.o f86263e = new a();

    /* renamed from: b, reason: collision with root package name */
    public final rx.c<? extends T> f86264b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference<l<T>> f86265c;

    /* renamed from: d, reason: collision with root package name */
    public final wb0.o<? extends k<T>> f86266d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements wb0.o {
        @Override // wb0.o, java.util.concurrent.Callable
        public Object call() {
            return new o(16);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b<R> implements c.a<R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.o f86267a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ wb0.p f86268b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements wb0.b<qb0.h> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ qb0.g f86269a;

            public a(qb0.g gVar) {
                this.f86269a = gVar;
            }

            @Override // wb0.b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void call(qb0.h hVar) {
                this.f86269a.add(hVar);
            }
        }

        public b(wb0.o oVar, wb0.p pVar) {
            this.f86267a = oVar;
            this.f86268b = pVar;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.g<? super R> gVar) {
            try {
                yb0.c cVar = (yb0.c) this.f86267a.call();
                ((rx.c) this.f86268b.call(cVar)).r5(gVar);
                cVar.A7(new a(gVar));
            } catch (Throwable th2) {
                vb0.a.f(th2, gVar);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements c.a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ rx.c f86271a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends qb0.g<T> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ qb0.g f86272a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(qb0.g gVar, qb0.g gVar2) {
                super(gVar);
                this.f86272a = gVar2;
            }

            @Override // qb0.c
            public void onCompleted() {
                this.f86272a.onCompleted();
            }

            @Override // qb0.c
            public void onError(Throwable th2) {
                this.f86272a.onError(th2);
            }

            @Override // qb0.c
            public void onNext(T t11) {
                this.f86272a.onNext(t11);
            }
        }

        public c(rx.c cVar) {
            this.f86271a = cVar;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.g<? super T> gVar) {
            this.f86271a.J6(new a(gVar, gVar));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d extends yb0.c<T> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ yb0.c f86274b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c.a aVar, yb0.c cVar) {
            super(aVar);
            this.f86274b = cVar;
        }

        @Override // yb0.c
        public void A7(wb0.b<? super qb0.h> bVar) {
            this.f86274b.A7(bVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e implements wb0.o<k<T>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f86275a;

        public e(int i11) {
            this.f86275a = i11;
        }

        @Override // wb0.o, java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k<T> call() {
            return new n(this.f86275a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f implements wb0.o<k<T>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f86276a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f86277b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ rx.d f86278c;

        public f(int i11, long j11, rx.d dVar) {
            this.f86276a = i11;
            this.f86277b = j11;
            this.f86278c = dVar;
        }

        @Override // wb0.o, java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k<T> call() {
            return new m(this.f86276a, this.f86277b, this.f86278c);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class g implements c.a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f86279a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ wb0.o f86280b;

        public g(AtomicReference atomicReference, wb0.o oVar) {
            this.f86279a = atomicReference;
            this.f86280b = oVar;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.g<? super T> gVar) {
            l lVar;
            while (true) {
                lVar = (l) this.f86279a.get();
                if (lVar != null) {
                    break;
                }
                l lVar2 = new l((k) this.f86280b.call());
                lVar2.D();
                if (androidx.camera.view.q.a(this.f86279a, lVar, lVar2)) {
                    lVar = lVar2;
                    break;
                }
            }
            i<T> iVar = new i<>(lVar, gVar);
            lVar.q(iVar);
            gVar.add(iVar);
            lVar.f86295a.a(iVar);
            gVar.setProducer(iVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class i<T> extends AtomicLong implements qb0.d, qb0.h {

        /* renamed from: g, reason: collision with root package name */
        public static final long f86284g = Long.MIN_VALUE;
        private static final long serialVersionUID = -4453897557930727610L;

        /* renamed from: a, reason: collision with root package name */
        public final l<T> f86285a;

        /* renamed from: b, reason: collision with root package name */
        public qb0.g<? super T> f86286b;

        /* renamed from: c, reason: collision with root package name */
        public Object f86287c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicLong f86288d = new AtomicLong();

        /* renamed from: e, reason: collision with root package name */
        public boolean f86289e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f86290f;

        public i(l<T> lVar, qb0.g<? super T> gVar) {
            this.f86285a = lVar;
            this.f86286b = gVar;
        }

        public void a(long j11) {
            long j12;
            long j13;
            do {
                j12 = this.f86288d.get();
                j13 = j12 + j11;
                if (j13 < 0) {
                    j13 = Long.MAX_VALUE;
                }
            } while (!this.f86288d.compareAndSet(j12, j13));
        }

        public <U> U b() {
            return (U) this.f86287c;
        }

        public long c(long j11) {
            long j12;
            long j13;
            if (j11 <= 0) {
                throw new IllegalArgumentException("Cant produce zero or less");
            }
            do {
                j12 = get();
                if (j12 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                j13 = j12 - j11;
                if (j13 < 0) {
                    throw new IllegalStateException("More produced (" + j11 + ") than requested (" + j12 + pn.j.f81007d);
                }
            } while (!compareAndSet(j12, j13));
            return j13;
        }

        @Override // qb0.h
        public boolean isUnsubscribed() {
            return get() == Long.MIN_VALUE;
        }

        @Override // qb0.d
        public void request(long j11) {
            long j12;
            long j13;
            if (j11 < 0) {
                return;
            }
            do {
                j12 = get();
                if (j12 == Long.MIN_VALUE) {
                    return;
                }
                if (j12 >= 0 && j11 == 0) {
                    return;
                }
                j13 = j12 + j11;
                if (j13 < 0) {
                    j13 = Long.MAX_VALUE;
                }
            } while (!compareAndSet(j12, j13));
            a(j11);
            this.f86285a.H(this);
            this.f86285a.f86295a.a(this);
        }

        @Override // qb0.h
        public void unsubscribe() {
            if (get() == Long.MIN_VALUE || getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE) {
                return;
            }
            this.f86285a.I(this);
            this.f86285a.H(this);
            this.f86286b = null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class j extends AtomicReference<j> {
        private static final long serialVersionUID = 245354315435971818L;

        /* renamed from: a, reason: collision with root package name */
        public final Object f86291a;

        /* renamed from: b, reason: collision with root package name */
        public final long f86292b;

        public j(Object obj, long j11) {
            this.f86291a = obj;
            this.f86292b = j11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface k<T> {
        void a(i<T> iVar);

        void complete();

        void w(T t11);

        void x(Throwable th2);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class l<T> extends qb0.g<T> implements qb0.h {

        /* renamed from: p, reason: collision with root package name */
        public static final i[] f86293p = new i[0];

        /* renamed from: q, reason: collision with root package name */
        public static final i[] f86294q = new i[0];

        /* renamed from: a, reason: collision with root package name */
        public final k<T> f86295a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f86296b;

        /* renamed from: c, reason: collision with root package name */
        public volatile boolean f86297c;

        /* renamed from: f, reason: collision with root package name */
        public volatile long f86300f;

        /* renamed from: g, reason: collision with root package name */
        public long f86301g;

        /* renamed from: i, reason: collision with root package name */
        public boolean f86303i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f86304j;

        /* renamed from: k, reason: collision with root package name */
        public long f86305k;

        /* renamed from: l, reason: collision with root package name */
        public long f86306l;

        /* renamed from: m, reason: collision with root package name */
        public volatile qb0.d f86307m;

        /* renamed from: n, reason: collision with root package name */
        public List<i<T>> f86308n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f86309o;

        /* renamed from: d, reason: collision with root package name */
        public final rx.internal.util.h<i<T>> f86298d = new rx.internal.util.h<>();

        /* renamed from: e, reason: collision with root package name */
        public i<T>[] f86299e = f86293p;

        /* renamed from: h, reason: collision with root package name */
        public final AtomicBoolean f86302h = new AtomicBoolean();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements wb0.a {
            public a() {
            }

            @Override // wb0.a
            public void call() {
                if (l.this.f86297c) {
                    return;
                }
                synchronized (l.this.f86298d) {
                    try {
                        if (!l.this.f86297c) {
                            l.this.f86298d.h();
                            l.this.f86300f++;
                            l.this.f86297c = true;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public l(k<T> kVar) {
            this.f86295a = kVar;
            request(0L);
        }

        public i<T>[] C() {
            i<T>[] iVarArr;
            synchronized (this.f86298d) {
                i<T>[] i11 = this.f86298d.i();
                int length = i11.length;
                iVarArr = new i[length];
                System.arraycopy(i11, 0, iVarArr, 0, length);
            }
            return iVarArr;
        }

        public void D() {
            add(ec0.f.a(new a()));
        }

        public void E(long j11, long j12) {
            long j13 = this.f86306l;
            qb0.d dVar = this.f86307m;
            long j14 = j11 - j12;
            if (j14 == 0) {
                if (j13 == 0 || dVar == null) {
                    return;
                }
                this.f86306l = 0L;
                dVar.request(j13);
                return;
            }
            this.f86305k = j11;
            if (dVar == null) {
                long j15 = j13 + j14;
                if (j15 < 0) {
                    j15 = Long.MAX_VALUE;
                }
                this.f86306l = j15;
                return;
            }
            if (j13 == 0) {
                dVar.request(j14);
            } else {
                this.f86306l = 0L;
                dVar.request(j13 + j14);
            }
        }

        public void H(i<T> iVar) {
            long j11;
            List<i<T>> list;
            boolean z11;
            long j12;
            if (isUnsubscribed()) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f86303i) {
                        if (iVar != null) {
                            List list2 = this.f86308n;
                            if (list2 == null) {
                                list2 = new ArrayList();
                                this.f86308n = list2;
                            }
                            list2.add(iVar);
                        } else {
                            this.f86309o = true;
                        }
                        this.f86304j = true;
                        return;
                    }
                    this.f86303i = true;
                    long j13 = this.f86305k;
                    if (iVar != null) {
                        j11 = Math.max(j13, iVar.f86288d.get());
                    } else {
                        long j14 = j13;
                        for (i<T> iVar2 : C()) {
                            if (iVar2 != null) {
                                j14 = Math.max(j14, iVar2.f86288d.get());
                            }
                        }
                        j11 = j14;
                    }
                    E(j11, j13);
                    while (!isUnsubscribed()) {
                        synchronized (this) {
                            try {
                                if (!this.f86304j) {
                                    this.f86303i = false;
                                    return;
                                }
                                this.f86304j = false;
                                list = this.f86308n;
                                this.f86308n = null;
                                z11 = this.f86309o;
                                this.f86309o = false;
                            } finally {
                            }
                        }
                        long j15 = this.f86305k;
                        if (list != null) {
                            Iterator<i<T>> it = list.iterator();
                            j12 = j15;
                            while (it.hasNext()) {
                                j12 = Math.max(j12, it.next().f86288d.get());
                            }
                        } else {
                            j12 = j15;
                        }
                        if (z11) {
                            for (i<T> iVar3 : C()) {
                                if (iVar3 != null) {
                                    j12 = Math.max(j12, iVar3.f86288d.get());
                                }
                            }
                        }
                        E(j12, j15);
                    }
                } finally {
                }
            }
        }

        public void I(i<T> iVar) {
            if (this.f86297c) {
                return;
            }
            synchronized (this.f86298d) {
                try {
                    if (this.f86297c) {
                        return;
                    }
                    this.f86298d.f(iVar);
                    if (this.f86298d.c()) {
                        this.f86299e = f86293p;
                    }
                    this.f86300f++;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void L() {
            i<T>[] iVarArr = this.f86299e;
            if (this.f86301g != this.f86300f) {
                synchronized (this.f86298d) {
                    try {
                        iVarArr = this.f86299e;
                        i<T>[] i11 = this.f86298d.i();
                        int length = i11.length;
                        if (iVarArr.length != length) {
                            iVarArr = new i[length];
                            this.f86299e = iVarArr;
                        }
                        System.arraycopy(i11, 0, iVarArr, 0, length);
                        this.f86301g = this.f86300f;
                    } finally {
                    }
                }
            }
            k<T> kVar = this.f86295a;
            for (i<T> iVar : iVarArr) {
                if (iVar != null) {
                    kVar.a(iVar);
                }
            }
        }

        @Override // qb0.c
        public void onCompleted() {
            if (this.f86296b) {
                return;
            }
            this.f86296b = true;
            try {
                this.f86295a.complete();
                L();
            } finally {
                unsubscribe();
            }
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            if (this.f86296b) {
                return;
            }
            this.f86296b = true;
            try {
                this.f86295a.x(th2);
                L();
            } finally {
                unsubscribe();
            }
        }

        @Override // qb0.c
        public void onNext(T t11) {
            if (this.f86296b) {
                return;
            }
            this.f86295a.w(t11);
            L();
        }

        public boolean q(i<T> iVar) {
            iVar.getClass();
            if (this.f86297c) {
                return false;
            }
            synchronized (this.f86298d) {
                try {
                    if (this.f86297c) {
                        return false;
                    }
                    this.f86298d.a(iVar);
                    this.f86300f++;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // qb0.g
        public void setProducer(qb0.d dVar) {
            if (this.f86307m != null) {
                throw new IllegalStateException("Only a single producer can be set on a Subscriber.");
            }
            this.f86307m = dVar;
            H(null);
            L();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class m<T> extends h<T> {
        private static final long serialVersionUID = 3457957419649567404L;

        /* renamed from: d, reason: collision with root package name */
        public final rx.d f86311d;

        /* renamed from: e, reason: collision with root package name */
        public final long f86312e;

        /* renamed from: f, reason: collision with root package name */
        public final int f86313f;

        public m(int i11, long j11, rx.d dVar) {
            this.f86311d = dVar;
            this.f86313f = i11;
            this.f86312e = j11;
        }

        @Override // rx.internal.operators.w2.h
        public Object d(Object obj) {
            return new bc0.f(this.f86311d.b(), obj);
        }

        @Override // rx.internal.operators.w2.h
        public j e() {
            j jVar;
            long b11 = this.f86311d.b() - this.f86312e;
            j jVar2 = get();
            j jVar3 = jVar2.get();
            while (true) {
                j jVar4 = jVar3;
                jVar = jVar2;
                jVar2 = jVar4;
                if (jVar2 == null) {
                    break;
                }
                Object obj = jVar2.f86291a;
                Object h11 = h(obj);
                if (v.f(h11) || v.g(h11) || ((bc0.f) obj).a() > b11) {
                    break;
                }
                jVar3 = jVar2.get();
            }
            return jVar;
        }

        @Override // rx.internal.operators.w2.h
        public Object h(Object obj) {
            return ((bc0.f) obj).b();
        }

        @Override // rx.internal.operators.w2.h
        public void l() {
            j jVar;
            long b11 = this.f86311d.b() - this.f86312e;
            j jVar2 = get();
            j jVar3 = jVar2.get();
            int i11 = 0;
            while (true) {
                j jVar4 = jVar3;
                jVar = jVar2;
                jVar2 = jVar4;
                if (jVar2 != null) {
                    int i12 = this.f86282b;
                    if (i12 <= this.f86313f) {
                        if (((bc0.f) jVar2.f86291a).a() > b11) {
                            break;
                        }
                        i11++;
                        this.f86282b--;
                        jVar3 = jVar2.get();
                    } else {
                        i11++;
                        this.f86282b = i12 - 1;
                        jVar3 = jVar2.get();
                    }
                } else {
                    break;
                }
            }
            if (i11 != 0) {
                k(jVar);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
        
            k(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
        
            return;
         */
        @Override // rx.internal.operators.w2.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void m() {
            /*
                r10 = this;
                rx.d r0 = r10.f86311d
                long r0 = r0.b()
                long r2 = r10.f86312e
                long r0 = r0 - r2
                java.lang.Object r2 = r10.get()
                rx.internal.operators.w2$j r2 = (rx.internal.operators.w2.j) r2
                java.lang.Object r3 = r2.get()
                rx.internal.operators.w2$j r3 = (rx.internal.operators.w2.j) r3
                r4 = 0
            L16:
                r9 = r3
                r3 = r2
                r2 = r9
                if (r2 == 0) goto L3a
                int r5 = r10.f86282b
                r6 = 1
                if (r5 <= r6) goto L3a
                java.lang.Object r5 = r2.f86291a
                bc0.f r5 = (bc0.f) r5
                long r7 = r5.a()
                int r5 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r5 > 0) goto L3a
                int r4 = r4 + 1
                int r3 = r10.f86282b
                int r3 = r3 - r6
                r10.f86282b = r3
                java.lang.Object r3 = r2.get()
                rx.internal.operators.w2$j r3 = (rx.internal.operators.w2.j) r3
                goto L16
            L3a:
                if (r4 == 0) goto L3f
                r10.k(r3)
            L3f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.w2.m.m():void");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class n<T> extends h<T> {
        private static final long serialVersionUID = -5898283885385201806L;

        /* renamed from: d, reason: collision with root package name */
        public final int f86314d;

        public n(int i11) {
            this.f86314d = i11;
        }

        @Override // rx.internal.operators.w2.h
        public void l() {
            if (this.f86282b > this.f86314d) {
                i();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class o<T> extends ArrayList<Object> implements k<T> {
        private static final long serialVersionUID = 7063189396499112664L;

        /* renamed from: a, reason: collision with root package name */
        public volatile int f86315a;

        public o(int i11) {
            super(i11);
        }

        @Override // rx.internal.operators.w2.k
        public void a(i<T> iVar) {
            synchronized (iVar) {
                try {
                    if (iVar.f86289e) {
                        iVar.f86290f = true;
                        return;
                    }
                    iVar.f86289e = true;
                    while (!iVar.isUnsubscribed()) {
                        int i11 = this.f86315a;
                        Integer num = (Integer) iVar.b();
                        int intValue = num != null ? num.intValue() : 0;
                        qb0.g<? super T> gVar = iVar.f86286b;
                        if (gVar == null) {
                            return;
                        }
                        long j11 = iVar.get();
                        long j12 = 0;
                        while (j12 != j11 && intValue < i11) {
                            Object obj = get(intValue);
                            try {
                                if (v.a(gVar, obj) || iVar.isUnsubscribed()) {
                                    return;
                                }
                                intValue++;
                                j12++;
                            } catch (Throwable th2) {
                                vb0.a.e(th2);
                                iVar.unsubscribe();
                                if (v.g(obj) || v.f(obj)) {
                                    return;
                                }
                                gVar.onError(OnErrorThrowable.addValueAsLastCause(th2, v.e(obj)));
                                return;
                            }
                        }
                        if (j12 != 0) {
                            iVar.f86287c = Integer.valueOf(intValue);
                            if (j11 != Long.MAX_VALUE) {
                                iVar.c(j12);
                            }
                        }
                        synchronized (iVar) {
                            try {
                                if (!iVar.f86290f) {
                                    iVar.f86289e = false;
                                    return;
                                }
                                iVar.f86290f = false;
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        @Override // rx.internal.operators.w2.k
        public void complete() {
            add(v.b());
            this.f86315a++;
        }

        @Override // rx.internal.operators.w2.k
        public void w(T t11) {
            add(v.j(t11));
            this.f86315a++;
        }

        @Override // rx.internal.operators.w2.k
        public void x(Throwable th2) {
            add(v.c(th2));
            this.f86315a++;
        }
    }

    public w2(c.a<T> aVar, rx.c<? extends T> cVar, AtomicReference<l<T>> atomicReference, wb0.o<? extends k<T>> oVar) {
        super(aVar);
        this.f86264b = cVar;
        this.f86265c = atomicReference;
        this.f86266d = oVar;
    }

    public static <T> yb0.c<T> C7(rx.c<? extends T> cVar) {
        return G7(cVar, f86263e);
    }

    public static <T> yb0.c<T> D7(rx.c<? extends T> cVar, int i11) {
        return i11 == Integer.MAX_VALUE ? C7(cVar) : G7(cVar, new e(i11));
    }

    public static <T> yb0.c<T> E7(rx.c<? extends T> cVar, long j11, TimeUnit timeUnit, rx.d dVar) {
        return F7(cVar, j11, timeUnit, dVar, Integer.MAX_VALUE);
    }

    public static <T> yb0.c<T> F7(rx.c<? extends T> cVar, long j11, TimeUnit timeUnit, rx.d dVar, int i11) {
        return G7(cVar, new f(i11, timeUnit.toMillis(j11), dVar));
    }

    public static <T> yb0.c<T> G7(rx.c<? extends T> cVar, wb0.o<? extends k<T>> oVar) {
        AtomicReference atomicReference = new AtomicReference();
        return new w2(new g(atomicReference, oVar), cVar, atomicReference, oVar);
    }

    public static <T, U, R> rx.c<R> H7(wb0.o<? extends yb0.c<U>> oVar, wb0.p<? super rx.c<U>, ? extends rx.c<R>> pVar) {
        return rx.c.I6(new b(oVar, pVar));
    }

    public static <T> yb0.c<T> I7(yb0.c<T> cVar, rx.d dVar) {
        return new d(new c(cVar.I3(dVar)), cVar);
    }

    @Override // yb0.c
    public void A7(wb0.b<? super qb0.h> bVar) {
        l<T> lVar;
        while (true) {
            lVar = this.f86265c.get();
            if (lVar != null && !lVar.isUnsubscribed()) {
                break;
            }
            l<T> lVar2 = new l<>(this.f86266d.call());
            lVar2.D();
            if (androidx.camera.view.q.a(this.f86265c, lVar, lVar2)) {
                lVar = lVar2;
                break;
            }
        }
        boolean z11 = false;
        if (!lVar.f86302h.get() && lVar.f86302h.compareAndSet(false, true)) {
            z11 = true;
        }
        bVar.call(lVar);
        if (z11) {
            this.f86264b.J6(lVar);
        }
    }

    @Override // qb0.h
    public boolean isUnsubscribed() {
        l<T> lVar = this.f86265c.get();
        return lVar == null || lVar.isUnsubscribed();
    }

    @Override // qb0.h
    public void unsubscribe() {
        this.f86265c.lazySet(null);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class h<T> extends AtomicReference<j> implements k<T> {
        private static final long serialVersionUID = 2346567790059478686L;

        /* renamed from: a, reason: collision with root package name */
        public j f86281a;

        /* renamed from: b, reason: collision with root package name */
        public int f86282b;

        /* renamed from: c, reason: collision with root package name */
        public long f86283c;

        public h() {
            j jVar = new j(null, 0L);
            this.f86281a = jVar;
            set(jVar);
        }

        @Override // rx.internal.operators.w2.k
        public final void a(i<T> iVar) {
            qb0.g<? super T> gVar;
            j jVar;
            synchronized (iVar) {
                try {
                    if (iVar.f86289e) {
                        iVar.f86290f = true;
                        return;
                    }
                    iVar.f86289e = true;
                    while (!iVar.isUnsubscribed()) {
                        j jVar2 = (j) iVar.b();
                        if (jVar2 == null) {
                            jVar2 = e();
                            iVar.f86287c = jVar2;
                            iVar.a(jVar2.f86292b);
                        }
                        if (iVar.isUnsubscribed() || (gVar = iVar.f86286b) == null) {
                            return;
                        }
                        long j11 = iVar.get();
                        long j12 = 0;
                        while (j12 != j11 && (jVar = jVar2.get()) != null) {
                            Object h11 = h(jVar.f86291a);
                            try {
                                if (v.a(gVar, h11)) {
                                    iVar.f86287c = null;
                                    return;
                                }
                                j12++;
                                if (iVar.isUnsubscribed()) {
                                    return;
                                } else {
                                    jVar2 = jVar;
                                }
                            } catch (Throwable th2) {
                                iVar.f86287c = null;
                                vb0.a.e(th2);
                                iVar.unsubscribe();
                                if (v.g(h11) || v.f(h11)) {
                                    return;
                                }
                                gVar.onError(OnErrorThrowable.addValueAsLastCause(th2, v.e(h11)));
                                return;
                            }
                        }
                        if (j12 != 0) {
                            iVar.f86287c = jVar2;
                            if (j11 != Long.MAX_VALUE) {
                                iVar.c(j12);
                            }
                        }
                        synchronized (iVar) {
                            try {
                                if (!iVar.f86290f) {
                                    iVar.f86289e = false;
                                    return;
                                }
                                iVar.f86290f = false;
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        public final void b(j jVar) {
            this.f86281a.set(jVar);
            this.f86281a = jVar;
            this.f86282b++;
        }

        public final void c(Collection<? super T> collection) {
            j e11 = e();
            while (true) {
                e11 = e11.get();
                if (e11 == null) {
                    return;
                }
                Object h11 = h(e11.f86291a);
                if (v.f(h11) || v.g(h11)) {
                    return;
                } else {
                    collection.add((Object) v.e(h11));
                }
            }
        }

        @Override // rx.internal.operators.w2.k
        public final void complete() {
            Object d11 = d(v.b());
            long j11 = this.f86283c + 1;
            this.f86283c = j11;
            b(new j(d11, j11));
            m();
        }

        public j e() {
            return get();
        }

        public boolean f() {
            Object obj = this.f86281a.f86291a;
            return obj != null && v.f(h(obj));
        }

        public boolean g() {
            Object obj = this.f86281a.f86291a;
            return obj != null && v.g(h(obj));
        }

        public final void i() {
            j jVar = get().get();
            if (jVar == null) {
                throw new IllegalStateException("Empty list!");
            }
            this.f86282b--;
            k(jVar);
        }

        public final void j(int i11) {
            j jVar = get();
            while (i11 > 0) {
                jVar = jVar.get();
                i11--;
                this.f86282b--;
            }
            k(jVar);
        }

        public final void k(j jVar) {
            set(jVar);
        }

        @Override // rx.internal.operators.w2.k
        public final void w(T t11) {
            Object d11 = d(v.j(t11));
            long j11 = this.f86283c + 1;
            this.f86283c = j11;
            b(new j(d11, j11));
            l();
        }

        @Override // rx.internal.operators.w2.k
        public final void x(Throwable th2) {
            Object d11 = d(v.c(th2));
            long j11 = this.f86283c + 1;
            this.f86283c = j11;
            b(new j(d11, j11));
            m();
        }

        public void l() {
        }

        public void m() {
        }

        public Object d(Object obj) {
            return obj;
        }

        public Object h(Object obj) {
            return obj;
        }
    }
}
