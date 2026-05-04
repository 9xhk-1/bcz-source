package e40;

import c40.t1;
import java.util.concurrent.CancellationException;
import kotlin.DeprecationLevel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.u0;
import yz.g2;
import yz.v0;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nChannels.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,204:1\n94#1,8:205\n160#1:213\n94#1,3:214\n161#1,2:217\n101#1:219\n97#1,3:220\n*S KotlinDebug\n*F\n+ 1 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n160#1:205,8\n192#1:213\n192#1:214,3\n192#1:217,2\n192#1:219\n192#1:220,3\n*E\n"})
/* loaded from: classes8.dex */
public final /* synthetic */ class w {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {161}, m = "consumeEach", n = {"action", "$this$consume$iv"}, s = {"L$0", "L$1"})
    public static final class a<E> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f49175a;

        /* renamed from: b, reason: collision with root package name */
        public Object f49176b;

        /* renamed from: c, reason: collision with root package name */
        public Object f49177c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f49178d;

        /* renamed from: e, reason: collision with root package name */
        public int f49179e;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f49178d = obj;
            this.f49179e |= Integer.MIN_VALUE;
            return w.c(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {209}, m = "toList", n = {"$this$toList_u24lambda_u242", "$this$consume$iv$iv"}, s = {"L$1", "L$2"})
    public static final class b<E> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f49180a;

        /* renamed from: b, reason: collision with root package name */
        public Object f49181b;

        /* renamed from: c, reason: collision with root package name */
        public Object f49182c;

        /* renamed from: d, reason: collision with root package name */
        public Object f49183d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f49184e;

        /* renamed from: f, reason: collision with root package name */
        public int f49185f;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f49184e = obj;
            this.f49185f |= Integer.MIN_VALUE;
            return u.g0(null, this);
        }
    }

    @v0
    public static final void a(@m80.k k0<?> k0Var, @m80.l Throwable th2) {
        if (th2 != null) {
            r0 = th2 instanceof CancellationException ? (CancellationException) th2 : null;
            if (r0 == null) {
                r0 = t1.a("Channel was consumed, consumer had failed", th2);
            }
        }
        k0Var.cancel(r0);
    }

    public static final <E, R> R b(@m80.k k0<? extends E> k0Var, @m80.k x00.l<? super k0<? extends E>, ? extends R> lVar) {
        try {
            R invoke = lVar.invoke(k0Var);
            kotlin.jvm.internal.d0.d(1);
            u.b(k0Var, null);
            kotlin.jvm.internal.d0.c(1);
            return invoke;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x005c, B:14:0x0064, B:15:0x004a, B:20:0x006d), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x005c, B:14:0x0064, B:15:0x004a, B:20:0x006d), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0059 -> B:12:0x005c). Please report as a decompilation issue!!! */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E> java.lang.Object c(@m80.k e40.k0<? extends E> r5, @m80.k x00.l<? super E, yz.g2> r6, @m80.k j00.c<? super yz.g2> r7) {
        /*
            boolean r0 = r7 instanceof e40.w.a
            if (r0 == 0) goto L13
            r0 = r7
            e40.w$a r0 = (e40.w.a) r0
            int r1 = r0.f49179e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49179e = r1
            goto L18
        L13:
            e40.w$a r0 = new e40.w$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f49178d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f49179e
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r5 = r0.f49177c
            e40.q r5 = (e40.q) r5
            java.lang.Object r6 = r0.f49176b
            e40.k0 r6 = (e40.k0) r6
            java.lang.Object r2 = r0.f49175a
            x00.l r2 = (x00.l) r2
            kotlin.e.n(r7)     // Catch: java.lang.Throwable -> L35
            goto L5c
        L35:
            r5 = move-exception
            goto L7e
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            kotlin.e.n(r7)
            e40.q r7 = r5.iterator()     // Catch: java.lang.Throwable -> L7a
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L4a:
            r0.f49175a = r7     // Catch: java.lang.Throwable -> L35
            r0.f49176b = r6     // Catch: java.lang.Throwable -> L35
            r0.f49177c = r5     // Catch: java.lang.Throwable -> L35
            r0.f49179e = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r5.a(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L59
            return r1
        L59:
            r4 = r2
            r2 = r7
            r7 = r4
        L5c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L35
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r7 == 0) goto L6d
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L35
            r2.invoke(r7)     // Catch: java.lang.Throwable -> L35
            r7 = r2
            goto L4a
        L6d:
            yz.g2 r5 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L35
            kotlin.jvm.internal.d0.d(r3)
            r7 = 0
            e40.u.b(r6, r7)
            kotlin.jvm.internal.d0.c(r3)
            return r5
        L7a:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L7e:
            throw r5     // Catch: java.lang.Throwable -> L7f
        L7f:
            r7 = move-exception
            kotlin.jvm.internal.d0.d(r3)
            e40.u.b(r6, r5)
            kotlin.jvm.internal.d0.c(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e40.w.c(e40.k0, x00.l, j00.c):java.lang.Object");
    }

    public static final <E> Object d(k0<? extends E> k0Var, x00.l<? super E, g2> lVar, j00.c<? super g2> cVar) {
        try {
            q<? extends E> it = k0Var.iterator();
            while (true) {
                kotlin.jvm.internal.d0.e(3);
                kotlin.jvm.internal.d0.e(0);
                Object a11 = it.a(null);
                kotlin.jvm.internal.d0.e(1);
                if (!((Boolean) a11).booleanValue()) {
                    g2 g2Var = g2.f100423a;
                    kotlin.jvm.internal.d0.d(1);
                    u.b(k0Var, null);
                    kotlin.jvm.internal.d0.c(1);
                    return g2Var;
                }
                lVar.invoke(it.next());
            }
        } finally {
        }
    }

    @yz.n(level = DeprecationLevel.HIDDEN, message = "Deprecated in the favour of 'onReceiveCatching'")
    public static final /* synthetic */ k40.h e(k0 k0Var) {
        kotlin.jvm.internal.g0.n(k0Var, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.onReceiveOrNull?>");
        return k0Var.M();
    }

    @yz.n(level = DeprecationLevel.HIDDEN, message = "Deprecated in the favour of 'receiveCatching'", replaceWith = @w0(expression = "receiveCatching().getOrNull()", imports = {}))
    public static final /* synthetic */ Object f(k0 k0Var, j00.c cVar) {
        kotlin.jvm.internal.g0.n(k0Var, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.receiveOrNull?>");
        return k0Var.J(cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f A[Catch: all -> 0x0039, TryCatch #2 {all -> 0x0039, blocks: (B:11:0x0035, B:12:0x0067, B:14:0x006f, B:29:0x0078), top: B:10:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #2 {all -> 0x0039, blocks: (B:11:0x0035, B:12:0x0067, B:14:0x006f, B:29:0x0078), top: B:10:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0064 -> B:12:0x0067). Please report as a decompilation issue!!! */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E> java.lang.Object g(@m80.k e40.k0<? extends E> r7, @m80.k j00.c<? super java.util.List<? extends E>> r8) {
        /*
            boolean r0 = r8 instanceof e40.w.b
            if (r0 == 0) goto L13
            r0 = r8
            e40.w$b r0 = (e40.w.b) r0
            int r1 = r0.f49185f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49185f = r1
            goto L18
        L13:
            e40.w$b r0 = new e40.w$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f49184e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f49185f
            r3 = 1
            if (r2 == 0) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r7 = r0.f49183d
            e40.q r7 = (e40.q) r7
            java.lang.Object r2 = r0.f49182c
            e40.k0 r2 = (e40.k0) r2
            java.lang.Object r4 = r0.f49181b
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r0.f49180a
            java.util.List r5 = (java.util.List) r5
            kotlin.e.n(r8)     // Catch: java.lang.Throwable -> L39
            goto L67
        L39:
            r7 = move-exception
            r8 = r2
            goto L89
        L3c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L44:
            kotlin.e.n(r8)
            java.util.List r8 = a00.g0.j()
            e40.q r2 = r7.iterator()     // Catch: java.lang.Throwable -> L85
            r4 = r8
            r5 = r4
            r8 = r7
            r7 = r2
        L53:
            r0.f49180a = r5     // Catch: java.lang.Throwable -> L83
            r0.f49181b = r4     // Catch: java.lang.Throwable -> L83
            r0.f49182c = r8     // Catch: java.lang.Throwable -> L83
            r0.f49183d = r7     // Catch: java.lang.Throwable -> L83
            r0.f49185f = r3     // Catch: java.lang.Throwable -> L83
            java.lang.Object r2 = r7.a(r0)     // Catch: java.lang.Throwable -> L83
            if (r2 != r1) goto L64
            return r1
        L64:
            r6 = r2
            r2 = r8
            r8 = r6
        L67:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L39
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L39
            if (r8 == 0) goto L78
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L39
            r4.add(r8)     // Catch: java.lang.Throwable -> L39
            r8 = r2
            goto L53
        L78:
            yz.g2 r7 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L39
            r7 = 0
            e40.u.b(r2, r7)
            java.util.List r7 = a00.g0.b(r5)
            return r7
        L83:
            r7 = move-exception
            goto L89
        L85:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L89:
            throw r7     // Catch: java.lang.Throwable -> L8a
        L8a:
            r0 = move-exception
            e40.u.b(r8, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e40.w.g(e40.k0, j00.c):java.lang.Object");
    }
}
