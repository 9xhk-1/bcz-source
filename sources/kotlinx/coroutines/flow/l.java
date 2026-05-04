package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final /* synthetic */ class l {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", i = {0, 0, 0, 1, 1, 1}, l = {32, 33}, m = "emitAllImpl$FlowKt__ChannelsKt", n = {"$this$emitAllImpl", "channel", "consume", "$this$emitAllImpl", "channel", "consume"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0"})
    public static final class a<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f68306a;

        /* renamed from: b, reason: collision with root package name */
        public Object f68307b;

        /* renamed from: c, reason: collision with root package name */
        public Object f68308c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f68309d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f68310e;

        /* renamed from: f, reason: collision with root package name */
        public int f68311f;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f68310e = obj;
            this.f68311f |= Integer.MIN_VALUE;
            return l.d(null, null, false, this);
        }
    }

    @m80.k
    public static final <T> i<T> b(@m80.k e40.k0<? extends T> k0Var) {
        return new e(k0Var, true, null, 0, null, 28, null);
    }

    @m80.l
    public static final <T> Object c(@m80.k j<? super T> jVar, @m80.k e40.k0<? extends T> k0Var, @m80.k j00.c<? super g2> cVar) {
        Object d11 = d(jVar, k0Var, true, cVar);
        return d11 == kotlin.coroutines.intrinsics.b.l() ? d11 : g2.f100423a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0091, code lost:
    
        if (r9 == r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:12:0x0036, B:14:0x0062, B:20:0x0077, B:22:0x007f, B:32:0x0054, B:34:0x005e), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlinx.coroutines.flow.j] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0091 -> B:13:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object d(kotlinx.coroutines.flow.j<? super T> r6, e40.k0<? extends T> r7, boolean r8, j00.c<? super yz.g2> r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.l.a
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.l$a r0 = (kotlinx.coroutines.flow.l.a) r0
            int r1 = r0.f68311f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f68311f = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.l$a r0 = new kotlinx.coroutines.flow.l$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f68310e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f68311f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L58
            if (r2 == r4) goto L46
            if (r2 != r3) goto L3e
            boolean r8 = r0.f68309d
            java.lang.Object r6 = r0.f68308c
            e40.q r6 = (e40.q) r6
            java.lang.Object r7 = r0.f68307b
            e40.k0 r7 = (e40.k0) r7
            java.lang.Object r2 = r0.f68306a
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
            kotlin.e.n(r9)     // Catch: java.lang.Throwable -> L3c
        L39:
            r9 = r6
            r6 = r2
            goto L62
        L3c:
            r6 = move-exception
            goto L9d
        L3e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L46:
            boolean r8 = r0.f68309d
            java.lang.Object r6 = r0.f68308c
            e40.q r6 = (e40.q) r6
            java.lang.Object r7 = r0.f68307b
            e40.k0 r7 = (e40.k0) r7
            java.lang.Object r2 = r0.f68306a
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
            kotlin.e.n(r9)     // Catch: java.lang.Throwable -> L3c
            goto L77
        L58:
            kotlin.e.n(r9)
            kotlinx.coroutines.flow.k.q0(r6)
            e40.q r9 = r7.iterator()     // Catch: java.lang.Throwable -> L3c
        L62:
            r0.f68306a = r6     // Catch: java.lang.Throwable -> L3c
            r0.f68307b = r7     // Catch: java.lang.Throwable -> L3c
            r0.f68308c = r9     // Catch: java.lang.Throwable -> L3c
            r0.f68309d = r8     // Catch: java.lang.Throwable -> L3c
            r0.f68311f = r4     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r9.a(r0)     // Catch: java.lang.Throwable -> L3c
            if (r2 != r1) goto L73
            goto L93
        L73:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L77:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3c
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L94
            java.lang.Object r9 = r6.next()     // Catch: java.lang.Throwable -> L3c
            r0.f68306a = r2     // Catch: java.lang.Throwable -> L3c
            r0.f68307b = r7     // Catch: java.lang.Throwable -> L3c
            r0.f68308c = r6     // Catch: java.lang.Throwable -> L3c
            r0.f68309d = r8     // Catch: java.lang.Throwable -> L3c
            r0.f68311f = r3     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r9 = r2.emit(r9, r0)     // Catch: java.lang.Throwable -> L3c
            if (r9 != r1) goto L39
        L93:
            return r1
        L94:
            if (r8 == 0) goto L9a
            r6 = 0
            e40.u.b(r7, r6)
        L9a:
            yz.g2 r6 = yz.g2.f100423a
            return r6
        L9d:
            throw r6     // Catch: java.lang.Throwable -> L9e
        L9e:
            r9 = move-exception
            if (r8 == 0) goto La4
            e40.u.b(r7, r6)
        La4:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.d(kotlinx.coroutines.flow.j, e40.k0, boolean, j00.c):java.lang.Object");
    }

    @m80.k
    public static final <T> e40.k0<T> e(@m80.k i<? extends T> iVar, @m80.k c40.r0 r0Var) {
        return kotlinx.coroutines.flow.internal.e.b(iVar).n(r0Var);
    }

    @m80.k
    public static final <T> i<T> f(@m80.k e40.k0<? extends T> k0Var) {
        return new e(k0Var, false, null, 0, null, 28, null);
    }
}
