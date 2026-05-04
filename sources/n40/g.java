package n40;

import h40.x0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.d0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final x0 f74433a = new x0("NO_OWNER");

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final x0 f74434b = new x0("ALREADY_LOCKED_BY_OWNER");

    /* renamed from: c, reason: collision with root package name */
    public static final int f74435c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f74436d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f74437e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f74438f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f74439g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f74440h = 2;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.sync.MutexKt", f = "Mutex.kt", i = {0, 0, 0}, l = {121}, m = "withLock", n = {"$this$withLock", "owner", "action"}, s = {"L$0", "L$1", "L$2"})
    public static final class a<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f74441a;

        /* renamed from: b, reason: collision with root package name */
        public Object f74442b;

        /* renamed from: c, reason: collision with root package name */
        public Object f74443c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f74444d;

        /* renamed from: e, reason: collision with root package name */
        public int f74445e;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f74444d = obj;
            this.f74445e |= Integer.MIN_VALUE;
            return g.e(null, null, null, this);
        }
    }

    @m80.k
    public static final n40.a a(boolean z11) {
        return new f(z11);
    }

    public static /* synthetic */ n40.a b(boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return a(z11);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object e(@m80.k n40.a r4, @m80.l java.lang.Object r5, @m80.k x00.a<? extends T> r6, @m80.k j00.c<? super T> r7) {
        /*
            boolean r0 = r7 instanceof n40.g.a
            if (r0 == 0) goto L13
            r0 = r7
            n40.g$a r0 = (n40.g.a) r0
            int r1 = r0.f74445e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f74445e = r1
            goto L18
        L13:
            n40.g$a r0 = new n40.g$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f74444d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f74445e
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.f74443c
            r6 = r4
            x00.a r6 = (x00.a) r6
            java.lang.Object r5 = r0.f74442b
            java.lang.Object r4 = r0.f74441a
            n40.a r4 = (n40.a) r4
            kotlin.e.n(r7)
            goto L4e
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            kotlin.e.n(r7)
            r0.f74441a = r4
            r0.f74442b = r5
            r0.f74443c = r6
            r0.f74445e = r3
            java.lang.Object r7 = r4.lock(r5, r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            java.lang.Object r6 = r6.invoke()     // Catch: java.lang.Throwable -> L5c
            kotlin.jvm.internal.d0.d(r3)
            r4.unlock(r5)
            kotlin.jvm.internal.d0.c(r3)
            return r6
        L5c:
            r6 = move-exception
            kotlin.jvm.internal.d0.d(r3)
            r4.unlock(r5)
            kotlin.jvm.internal.d0.c(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n40.g.e(n40.a, java.lang.Object, x00.a, j00.c):java.lang.Object");
    }

    public static final <T> Object f(n40.a aVar, Object obj, x00.a<? extends T> aVar2, j00.c<? super T> cVar) {
        d0.e(0);
        aVar.lock(obj, cVar);
        d0.e(1);
        try {
            return aVar2.invoke();
        } finally {
            d0.d(1);
            aVar.unlock(obj);
            d0.c(1);
        }
    }

    public static /* synthetic */ Object g(n40.a aVar, Object obj, x00.a aVar2, j00.c cVar, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = null;
        }
        d0.e(0);
        aVar.lock(obj, cVar);
        d0.e(1);
        try {
            return aVar2.invoke();
        } finally {
            d0.d(1);
            aVar.unlock(obj);
            d0.c(1);
        }
    }
}
