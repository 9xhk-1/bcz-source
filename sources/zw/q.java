package zw;

import e40.i0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import u30.k0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class q implements x {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public io.ktor.utils.io.g f102962a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f102963b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public String f102964c;

    /* renamed from: d, reason: collision with root package name */
    public long f102965d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f102966e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f102967f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final kotlinx.coroutines.flow.i<vy.a> f102968g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.sse.DefaultClientSSESession$_incoming$1", f = "DefaultClientSSESession.kt", i = {0, 1}, l = {25, 30}, m = "invokeSuspend", n = {"$this$channelFlow", "$this$channelFlow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements x00.p<i0<? super vy.a>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f102969a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f102970b;

        public a(j00.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = q.this.new a(cVar);
            aVar.f102970b = obj;
            return aVar;
        }

        @Override // x00.p
        public final Object invoke(i0<? super vy.a> i0Var, j00.c<? super g2> cVar) {
            return ((a) create(i0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
        
            if (r1.b(r7, r6) == r0) goto L31;
         */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0056 -> B:6:0x0069). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0066 -> B:6:0x0069). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0073 -> B:6:0x0069). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.f102969a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r1 = r6.f102970b
                e40.i0 r1 = (e40.i0) r1
                kotlin.e.n(r7)
                goto L69
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                java.lang.Object r1 = r6.f102970b
                e40.i0 r1 = (e40.i0) r1
                kotlin.e.n(r7)
                goto L41
            L26:
                kotlin.e.n(r7)
                java.lang.Object r7 = r6.f102970b
                e40.i0 r7 = (e40.i0) r7
            L2d:
                zw.q r1 = zw.q.this
                io.ktor.utils.io.g r4 = zw.q.a(r1)
                r6.f102970b = r7
                r6.f102969a = r3
                java.lang.Object r1 = zw.q.i(r1, r4, r6)
                if (r1 != r0) goto L3e
                goto L75
            L3e:
                r5 = r1
                r1 = r7
                r7 = r5
            L41:
                vy.a r7 = (vy.a) r7
                if (r7 != 0) goto L48
                yz.g2 r7 = yz.g2.f100423a
                return r7
            L48:
                zw.q r4 = zw.q.this
                boolean r4 = zw.q.e(r4, r7)
                if (r4 == 0) goto L58
                zw.q r4 = zw.q.this
                boolean r4 = zw.q.b(r4)
                if (r4 == 0) goto L69
            L58:
                zw.q r4 = zw.q.this
                boolean r4 = zw.q.h(r4, r7)
                if (r4 == 0) goto L6b
                zw.q r4 = zw.q.this
                boolean r4 = zw.q.d(r4)
                if (r4 == 0) goto L69
                goto L6b
            L69:
                r7 = r1
                goto L2d
            L6b:
                r6.f102970b = r1
                r6.f102969a = r2
                java.lang.Object r7 = r1.b(r7, r6)
                if (r7 != r0) goto L69
            L75:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: zw.q.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.sse.DefaultClientSSESession", f = "DefaultClientSSESession.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {47, 49, 98}, m = "parseEvent", n = {"this", "$this$parseEvent", "data", "comments", "curRetry", "lastEventId", "wasData", "wasComments", "this", "$this$parseEvent", "data", "comments", "curRetry", "lastEventId", "wasData", "wasComments", "this", "$this$parseEvent", "data", "comments", "eventType", "curRetry", "lastEventId", "wasData", "wasComments"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1"})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f102972a;

        /* renamed from: b, reason: collision with root package name */
        public Object f102973b;

        /* renamed from: c, reason: collision with root package name */
        public Object f102974c;

        /* renamed from: d, reason: collision with root package name */
        public Object f102975d;

        /* renamed from: e, reason: collision with root package name */
        public Object f102976e;

        /* renamed from: f, reason: collision with root package name */
        public Object f102977f;

        /* renamed from: g, reason: collision with root package name */
        public Object f102978g;

        /* renamed from: h, reason: collision with root package name */
        public int f102979h;

        /* renamed from: i, reason: collision with root package name */
        public int f102980i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f102981j;

        /* renamed from: l, reason: collision with root package name */
        public int f102983l;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f102981j = obj;
            this.f102983l |= Integer.MIN_VALUE;
            return q.this.p(null, this);
        }
    }

    public q(@m80.k t content, @m80.k io.ktor.utils.io.g input, @m80.k kotlin.coroutines.d coroutineContext) {
        g0.p(content, "content");
        g0.p(input, "input");
        g0.p(coroutineContext, "coroutineContext");
        this.f102962a = input;
        this.f102963b = coroutineContext;
        this.f102965d = kotlin.time.e.x(content.p());
        this.f102966e = content.r();
        this.f102967f = content.s();
        this.f102968g = kotlinx.coroutines.flow.k.x(new a(null));
    }

    @Override // c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f102963b;
    }

    @Override // zw.x
    @m80.k
    public kotlinx.coroutines.flow.i<vy.a> j() {
        return this.f102968g;
    }

    public final void l(StringBuilder sb2, String str) {
        sb2.append(k0.x4(k0.x4(str, ":"), " "));
        sb2.append("\r\n");
    }

    public final boolean m(vy.a aVar) {
        return aVar.b() == null && aVar.c() == null && aVar.d() == null && aVar.e() == null && aVar.a() != null;
    }

    public final boolean n(vy.a aVar) {
        return aVar.b() == null && aVar.d() == null && aVar.c() == null && aVar.e() == null && aVar.a() == null;
    }

    public final boolean o(vy.a aVar) {
        return aVar.b() == null && aVar.c() == null && aVar.d() == null && aVar.a() == null && aVar.e() != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f9, code lost:
    
        if (r2 == r4) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01fc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r2v18, types: [T, java.lang.Long] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x01f1 -> B:12:0x01f8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x00f9 -> B:68:0x00fd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(io.ktor.utils.io.g r24, j00.c<? super vy.a> r25) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zw.q.p(io.ktor.utils.io.g, j00.c):java.lang.Object");
    }

    public final String r(StringBuilder sb2) {
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return k0.D4(sb3, "\r\n");
    }
}
