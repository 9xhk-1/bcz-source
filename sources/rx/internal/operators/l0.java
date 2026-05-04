package rx.internal.operators;

import a00.a0;
import java.util.concurrent.atomic.AtomicLong;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class l0<T> implements c.a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T[] f85685a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> extends AtomicLong implements qb0.d {
        private static final long serialVersionUID = 3534218984725836979L;

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super T> f85686a;

        /* renamed from: b, reason: collision with root package name */
        public final T[] f85687b;

        /* renamed from: c, reason: collision with root package name */
        public int f85688c;

        public a(qb0.g<? super T> gVar, T[] tArr) {
            this.f85686a = gVar;
            this.f85687b = tArr;
        }

        public void a() {
            qb0.g<? super T> gVar = this.f85686a;
            for (a0.e eVar : this.f85687b) {
                if (gVar.isUnsubscribed()) {
                    return;
                }
                gVar.onNext(eVar);
            }
            if (gVar.isUnsubscribed()) {
                return;
            }
            gVar.onCompleted();
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
        
            r10.f85688c = r3;
            r11 = addAndGet(r6);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void b(long r11) {
            /*
                r10 = this;
                qb0.g<? super T> r0 = r10.f85686a
                T[] r1 = r10.f85687b
                int r2 = r1.length
                int r3 = r10.f85688c
                r4 = 0
            L9:
                r6 = r4
            La:
                int r8 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r8 == 0) goto L2f
                if (r3 == r2) goto L2f
                boolean r8 = r0.isUnsubscribed()
                if (r8 == 0) goto L17
                goto L42
            L17:
                r8 = r1[r3]
                r0.onNext(r8)
                int r3 = r3 + 1
                if (r3 != r2) goto L2a
                boolean r11 = r0.isUnsubscribed()
                if (r11 != 0) goto L42
                r0.onCompleted()
                return
            L2a:
                r8 = 1
                long r11 = r11 - r8
                long r6 = r6 - r8
                goto La
            L2f:
                long r11 = r10.get()
                long r11 = r11 + r6
                int r8 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r8 != 0) goto La
                r10.f85688c = r3
                long r11 = r10.addAndGet(r6)
                int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r6 != 0) goto L9
            L42:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.l0.a.b(long):void");
        }

        @Override // qb0.d
        public void request(long j11) {
            if (j11 < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j11);
            }
            if (j11 == Long.MAX_VALUE) {
                if (rx.internal.operators.a.b(this, j11) == 0) {
                    a();
                }
            } else {
                if (j11 == 0 || rx.internal.operators.a.b(this, j11) != 0) {
                    return;
                }
                b(j11);
            }
        }
    }

    public l0(T[] tArr) {
        this.f85685a = tArr;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super T> gVar) {
        gVar.setProducer(new a(gVar, this.f85685a));
    }
}
