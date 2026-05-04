package n40;

import h40.c1;
import h40.x0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.d0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final int f74456a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final x0 f74457b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final x0 f74458c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final x0 f74459d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final x0 f74460e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f74461f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.sync.SemaphoreKt", f = "Semaphore.kt", i = {0, 0}, l = {81}, m = "withPermit", n = {"$this$withPermit", "action"}, s = {"L$0", "L$1"})
    public static final class a<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f74462a;

        /* renamed from: b, reason: collision with root package name */
        public Object f74463b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f74464c;

        /* renamed from: d, reason: collision with root package name */
        public int f74465d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f74464c = obj;
            this.f74465d |= Integer.MIN_VALUE;
            return l.k(null, null, this);
        }
    }

    static {
        int e11;
        int e12;
        e11 = c1.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);
        f74456a = e11;
        f74457b = new x0("PERMIT");
        f74458c = new x0("TAKEN");
        f74459d = new x0("BROKEN");
        f74460e = new x0("CANCELLED");
        e12 = c1.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);
        f74461f = e12;
    }

    @m80.k
    public static final h a(int i11, int i12) {
        return new k(i11, i12);
    }

    public static /* synthetic */ h b(int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        return a(i11, i12);
    }

    public static final m j(long j11, m mVar) {
        return new m(j11, mVar, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object k(@m80.k n40.h r4, @m80.k x00.a<? extends T> r5, @m80.k j00.c<? super T> r6) {
        /*
            boolean r0 = r6 instanceof n40.l.a
            if (r0 == 0) goto L13
            r0 = r6
            n40.l$a r0 = (n40.l.a) r0
            int r1 = r0.f74465d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f74465d = r1
            goto L18
        L13:
            n40.l$a r0 = new n40.l$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f74464c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f74465d
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r4 = r0.f74463b
            r5 = r4
            x00.a r5 = (x00.a) r5
            java.lang.Object r4 = r0.f74462a
            n40.h r4 = (n40.h) r4
            kotlin.e.n(r6)
            goto L4a
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            kotlin.e.n(r6)
            r0.f74462a = r4
            r0.f74463b = r5
            r0.f74465d = r3
            java.lang.Object r6 = r4.a(r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            java.lang.Object r5 = r5.invoke()     // Catch: java.lang.Throwable -> L58
            kotlin.jvm.internal.d0.d(r3)
            r4.release()
            kotlin.jvm.internal.d0.c(r3)
            return r5
        L58:
            r5 = move-exception
            kotlin.jvm.internal.d0.d(r3)
            r4.release()
            kotlin.jvm.internal.d0.c(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n40.l.k(n40.h, x00.a, j00.c):java.lang.Object");
    }

    public static final <T> Object l(h hVar, x00.a<? extends T> aVar, j00.c<? super T> cVar) {
        d0.e(0);
        hVar.a(cVar);
        d0.e(1);
        try {
            return aVar.invoke();
        } finally {
            d0.d(1);
            hVar.release();
            d0.c(1);
        }
    }
}
