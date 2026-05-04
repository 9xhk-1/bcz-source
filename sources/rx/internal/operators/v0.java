package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class v0 implements c.a<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public final int f86152a;

    /* renamed from: b, reason: collision with root package name */
    public final int f86153b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends AtomicLong implements qb0.d {
        private static final long serialVersionUID = 4114392207069098388L;

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super Integer> f86154a;

        /* renamed from: b, reason: collision with root package name */
        public final int f86155b;

        /* renamed from: c, reason: collision with root package name */
        public long f86156c;

        public a(qb0.g<? super Integer> gVar, int i11, int i12) {
            this.f86154a = gVar;
            this.f86156c = i11;
            this.f86155b = i12;
        }

        public void a() {
            long j11 = this.f86155b + 1;
            qb0.g<? super Integer> gVar = this.f86154a;
            for (long j12 = this.f86156c; j12 != j11; j12++) {
                if (gVar.isUnsubscribed()) {
                    return;
                }
                gVar.onNext(Integer.valueOf((int) j12));
            }
            if (gVar.isUnsubscribed()) {
                return;
            }
            gVar.onCompleted();
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
        
            r12.f86156c = r4;
            r13 = addAndGet(-r9);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void b(long r13) {
            /*
                r12 = this;
                int r0 = r12.f86155b
                long r0 = (long) r0
                r2 = 1
                long r0 = r0 + r2
                long r4 = r12.f86156c
                qb0.g<? super java.lang.Integer> r6 = r12.f86154a
                r7 = 0
            Lc:
                r9 = r7
            Ld:
                int r11 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
                if (r11 == 0) goto L27
                int r11 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r11 == 0) goto L27
                boolean r11 = r6.isUnsubscribed()
                if (r11 == 0) goto L1c
                goto L49
            L1c:
                int r11 = (int) r4
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                r6.onNext(r11)
                long r4 = r4 + r2
                long r9 = r9 + r2
                goto Ld
            L27:
                boolean r13 = r6.isUnsubscribed()
                if (r13 == 0) goto L2e
                goto L49
            L2e:
                int r13 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r13 != 0) goto L36
                r6.onCompleted()
                return
            L36:
                long r13 = r12.get()
                int r11 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
                if (r11 != 0) goto Ld
                r12.f86156c = r4
                long r13 = -r9
                long r13 = r12.addAndGet(r13)
                int r9 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
                if (r9 != 0) goto Lc
            L49:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.v0.a.b(long):void");
        }

        @Override // qb0.d
        public void request(long j11) {
            if (get() == Long.MAX_VALUE) {
                return;
            }
            if (j11 == Long.MAX_VALUE && compareAndSet(0L, Long.MAX_VALUE)) {
                a();
            } else {
                if (j11 <= 0 || rx.internal.operators.a.b(this, j11) != 0) {
                    return;
                }
                b(j11);
            }
        }
    }

    public v0(int i11, int i12) {
        this.f86152a = i11;
        this.f86153b = i12;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super Integer> gVar) {
        gVar.setProducer(new a(gVar, this.f86152a, this.f86153b));
    }
}
