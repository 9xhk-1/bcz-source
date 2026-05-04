package sx;

import androidx.camera.view.q;
import c40.b4;
import c40.q0;
import c40.r0;
import io.ktor.network.selector.SelectorManagerSupport;
import java.io.Closeable;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.ClosedSelectorException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nActorSelectorManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActorSelectorManager.kt\nio/ktor/network/selector/ActorSelectorManager\n+ 2 ActorSelectorManager.kt\nio/ktor/network/selector/ActorSelectorManager$ContinuationHolder\n*L\n1#1,203:1\n108#1,4:204\n194#2,6:208\n*S KotlinDebug\n*F\n+ 1 ActorSelectorManager.kt\nio/ktor/network/selector/ActorSelectorManager\n*L\n95#1:204,4\n165#1:208,6\n*E\n"})
/* loaded from: classes8.dex */
public final class a extends SelectorManagerSupport implements Closeable, r0 {
    private volatile boolean closed;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AtomicLong f88998d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final b<g2, j00.c<g2>> f88999e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final sx.b<sx.e> f89000f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final kotlin.coroutines.d f89001g;
    private volatile boolean inSelect;

    @l
    private volatile Selector selectorRef;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.network.selector.ActorSelectorManager$1", f = "ActorSelectorManager.kt", i = {0}, l = {42}, m = "invokeSuspend", n = {"currentSelector"}, s = {"L$2"})
    /* renamed from: sx.a$a, reason: collision with other inner class name */
    public static final class C1165a extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f89002a;

        /* renamed from: b, reason: collision with root package name */
        public Object f89003b;

        /* renamed from: c, reason: collision with root package name */
        public Object f89004c;

        /* renamed from: d, reason: collision with root package name */
        public int f89005d;

        public C1165a(j00.c<? super C1165a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return a.this.new C1165a(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((C1165a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0092 A[Catch: all -> 0x0062, LOOP:0: B:10:0x0080->B:12:0x0092, LOOP_END, TRY_ENTER, TryCatch #1 {all -> 0x0062, blocks: (B:8:0x0051, B:9:0x005b, B:10:0x0080, B:14:0x008c, B:12:0x0092, B:22:0x0075, B:25:0x009e, B:26:0x00ae, B:21:0x0068), top: B:2:0x0008, inners: #4 }] */
        /* JADX WARN: Removed duplicated region for block: B:13:0x008c A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v5, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r4v9, types: [java.io.Closeable] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.f89005d
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r0 = r6.f89004c
                java.nio.channels.spi.AbstractSelector r0 = (java.nio.channels.spi.AbstractSelector) r0
                java.lang.Object r1 = r6.f89003b
                sx.a r1 = (sx.a) r1
                java.lang.Object r4 = r6.f89002a
                java.io.Closeable r4 = (java.io.Closeable) r4
                kotlin.e.n(r7)     // Catch: java.lang.Throwable -> L1c
                goto L51
            L1c:
                r7 = move-exception
                goto L68
            L1e:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L26:
                kotlin.e.n(r7)
                sx.a r7 = sx.a.this
                java.nio.channels.spi.SelectorProvider r7 = r7.X()
                java.nio.channels.spi.AbstractSelector r7 = r7.openSelector()
                if (r7 == 0) goto Lb5
                sx.a r1 = sx.a.this
                sx.a.K0(r1, r7)
                sx.a r1 = sx.a.this
                sx.b r4 = sx.a.y0(r1)     // Catch: java.lang.Throwable -> L64
                r6.f89002a = r7     // Catch: java.lang.Throwable -> L64
                r6.f89003b = r1     // Catch: java.lang.Throwable -> L64
                r6.f89004c = r7     // Catch: java.lang.Throwable -> L64
                r6.f89005d = r2     // Catch: java.lang.Throwable -> L64
                java.lang.Object r4 = sx.a.z0(r1, r4, r7, r6)     // Catch: java.lang.Throwable -> L64
                if (r4 != r0) goto L4f
                return r0
            L4f:
                r0 = r7
                r4 = r0
            L51:
                sx.a.H0(r1, r2)     // Catch: java.lang.Throwable -> L62
                sx.b r7 = sx.a.y0(r1)     // Catch: java.lang.Throwable -> L62
                r7.b()     // Catch: java.lang.Throwable -> L62
            L5b:
                sx.a.K0(r1, r3)     // Catch: java.lang.Throwable -> L62
                r1.e(r0, r3)     // Catch: java.lang.Throwable -> L62
                goto L80
            L62:
                r7 = move-exception
                goto Laf
            L64:
                r0 = move-exception
                r4 = r7
                r7 = r0
                r0 = r4
            L68:
                sx.a.H0(r1, r2)     // Catch: java.lang.Throwable -> L9d
                sx.b r5 = sx.a.y0(r1)     // Catch: java.lang.Throwable -> L9d
                r5.b()     // Catch: java.lang.Throwable -> L9d
                r1.e(r0, r7)     // Catch: java.lang.Throwable -> L9d
                sx.a.H0(r1, r2)     // Catch: java.lang.Throwable -> L62
                sx.b r7 = sx.a.y0(r1)     // Catch: java.lang.Throwable -> L62
                r7.b()     // Catch: java.lang.Throwable -> L62
                goto L5b
            L80:
                sx.b r7 = sx.a.y0(r1)     // Catch: java.lang.Throwable -> L62
                java.lang.Object r7 = r7.d()     // Catch: java.lang.Throwable -> L62
                sx.e r7 = (sx.e) r7     // Catch: java.lang.Throwable -> L62
                if (r7 != 0) goto L92
                yz.g2 r7 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L62
                r00.b.a(r4, r3)
                return r7
            L92:
                kotlinx.coroutines.channels.ClosedSendChannelException r0 = new kotlinx.coroutines.channels.ClosedSendChannelException     // Catch: java.lang.Throwable -> L62
                java.lang.String r2 = "Failed to apply interest: selector closed"
                r0.<init>(r2)     // Catch: java.lang.Throwable -> L62
                r1.i(r7, r0)     // Catch: java.lang.Throwable -> L62
                goto L80
            L9d:
                r7 = move-exception
                sx.a.H0(r1, r2)     // Catch: java.lang.Throwable -> L62
                sx.b r2 = sx.a.y0(r1)     // Catch: java.lang.Throwable -> L62
                r2.b()     // Catch: java.lang.Throwable -> L62
                sx.a.K0(r1, r3)     // Catch: java.lang.Throwable -> L62
                r1.e(r0, r3)     // Catch: java.lang.Throwable -> L62
                throw r7     // Catch: java.lang.Throwable -> L62
            Laf:
                throw r7     // Catch: java.lang.Throwable -> Lb0
            Lb0:
                r0 = move-exception
                r00.b.a(r4, r7)
                throw r0
            Lb5:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "openSelector() = null"
                r7.<init>(r0)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: sx.a.C1165a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<R, C extends j00.c<? super R>> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AtomicReference<C> f89007a = new AtomicReference<>(null);

        public final boolean b(R r11) {
            C andSet = this.f89007a.getAndSet(null);
            if (andSet == null) {
                return false;
            }
            Result.a aVar = Result.Companion;
            andSet.resumeWith(Result.m6308constructorimpl(r11));
            return true;
        }

        @l
        public final Object c(@k C continuation, @k x00.a<Boolean> condition) {
            g0.p(continuation, "continuation");
            g0.p(condition, "condition");
            if (!condition.invoke().booleanValue()) {
                return null;
            }
            if (!q.a(this.f89007a, null, continuation)) {
                throw new IllegalStateException("Continuation is already set");
            }
            if (condition.invoke().booleanValue() || !q.a(this.f89007a, continuation, null)) {
                return kotlin.coroutines.intrinsics.b.l();
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.network.selector.ActorSelectorManager", f = "ActorSelectorManager.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, l = {68, 72, 88}, m = "process", n = {"this", "mb", "selector", "this", "mb", "selector", "this", "mb", "selector"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f89008a;

        /* renamed from: b, reason: collision with root package name */
        public Object f89009b;

        /* renamed from: c, reason: collision with root package name */
        public Object f89010c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f89011d;

        /* renamed from: f, reason: collision with root package name */
        public int f89013f;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f89011d = obj;
            this.f89013f |= Integer.MIN_VALUE;
            return a.this.R0(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.network.selector.ActorSelectorManager", f = "ActorSelectorManager.kt", i = {0, 0}, l = {164}, m = "receiveOrNullSuspend", n = {"this", "$this$receiveOrNullSuspend"}, s = {"L$0", "L$1"})
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f89014a;

        /* renamed from: b, reason: collision with root package name */
        public Object f89015b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f89016c;

        /* renamed from: e, reason: collision with root package name */
        public int f89018e;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f89016c = obj;
            this.f89018e |= Integer.MIN_VALUE;
            return a.this.Z0(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.network.selector.ActorSelectorManager", f = "ActorSelectorManager.kt", i = {0, 0}, l = {204}, m = "select", n = {"this", "selector"}, s = {"L$0", "L$1"})
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f89019a;

        /* renamed from: b, reason: collision with root package name */
        public Object f89020b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f89021c;

        /* renamed from: e, reason: collision with root package name */
        public int f89023e;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f89021c = obj;
            this.f89023e |= Integer.MIN_VALUE;
            return a.this.a1(null, this);
        }
    }

    public a(@k kotlin.coroutines.d context) {
        g0.p(context, "context");
        this.f88998d = new AtomicLong();
        this.f88999e = new b<>();
        this.f89000f = new sx.b<>();
        this.f89001g = context.plus(new q0("selector"));
        c40.k.f(this, null, null, new C1165a(null), 3, null);
    }

    @Override // sx.g
    public void B8(@k sx.e selectable) {
        SelectionKey keyFor;
        g0.p(selectable, "selectable");
        i(selectable, new ClosedChannelException());
        Selector selector = this.selectorRef;
        if (selector == null || (keyFor = selectable.getChannel().keyFor(selector)) == null) {
            return;
        }
        keyFor.cancel();
        d1();
    }

    public final Object P0(j00.c<? super g2> cVar) {
        d0.e(0);
        b4.a(cVar);
        d0.e(1);
        return g2.f100423a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f8, code lost:
    
        if (r13 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008e, code lost:
    
        if (r13 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c3, code lost:
    
        if (c40.b4.a(r0) == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0099 -> B:15:0x0075). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00b3 -> B:15:0x0075). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00c3 -> B:15:0x0075). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00f8 -> B:12:0x00fb). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R0(sx.b<sx.e> r11, java.nio.channels.Selector r12, j00.c<? super yz.g2> r13) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sx.a.R0(sx.b, java.nio.channels.Selector, j00.c):java.lang.Object");
    }

    public final void W0(sx.b<sx.e> bVar, Selector selector) {
        while (true) {
            sx.e d11 = bVar.d();
            if (d11 == null) {
                return;
            } else {
                a(selector, d11);
            }
        }
    }

    public final Object Y0(sx.b<sx.e> bVar, j00.c<? super sx.e> cVar) {
        sx.e d11 = bVar.d();
        return d11 == null ? Z0(bVar, cVar) : d11;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z0(sx.b<sx.e> r7, j00.c<? super sx.e> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof sx.a.d
            if (r0 == 0) goto L13
            r0 = r8
            sx.a$d r0 = (sx.a.d) r0
            int r1 = r0.f89018e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f89018e = r1
            goto L18
        L13:
            sx.a$d r0 = new sx.a$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f89016c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f89018e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r7 = r0.f89015b
            sx.b r7 = (sx.b) r7
            java.lang.Object r2 = r0.f89014a
            sx.a r2 = (sx.a) r2
            kotlin.e.n(r8)
            goto L3d
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            kotlin.e.n(r8)
            r2 = r6
        L3d:
            java.lang.Object r8 = r7.d()
            sx.e r8 = (sx.e) r8
            if (r8 == 0) goto L46
            return r8
        L46:
            boolean r8 = r2.closed
            r4 = 0
            if (r8 == 0) goto L4c
            return r4
        L4c:
            r0.f89014a = r2
            r0.f89015b = r7
            r0.f89018e = r3
            sx.a$b<yz.g2, j00.c<yz.g2>> r8 = r2.f88999e
            boolean r5 = r7.c()
            if (r5 == 0) goto L8b
            boolean r5 = r2.closed
            if (r5 != 0) goto L8b
            java.util.concurrent.atomic.AtomicReference r5 = sx.a.b.a(r8)
            boolean r5 = androidx.camera.view.q.a(r5, r4, r0)
            if (r5 == 0) goto L83
            boolean r5 = r7.c()
            if (r5 == 0) goto L73
            boolean r5 = r2.closed
            if (r5 != 0) goto L73
            goto L7e
        L73:
            java.util.concurrent.atomic.AtomicReference r8 = sx.a.b.a(r8)
            boolean r8 = androidx.camera.view.q.a(r8, r0, r4)
            if (r8 == 0) goto L7e
            goto L8b
        L7e:
            java.lang.Object r4 = kotlin.coroutines.intrinsics.b.l()
            goto L8b
        L83:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Continuation is already set"
            r7.<init>(r8)
            throw r7
        L8b:
            if (r4 != 0) goto L8f
            yz.g2 r4 = yz.g2.f100423a
        L8f:
            java.lang.Object r8 = kotlin.coroutines.intrinsics.b.l()
            if (r4 != r8) goto L98
            l00.f.c(r0)
        L98:
            if (r4 != r1) goto L3d
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sx.a.Z0(sx.b, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a1(java.nio.channels.Selector r6, j00.c<? super java.lang.Integer> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof sx.a.e
            if (r0 == 0) goto L13
            r0 = r7
            sx.a$e r0 = (sx.a.e) r0
            int r1 = r0.f89023e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f89023e = r1
            goto L18
        L13:
            sx.a$e r0 = new sx.a$e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f89021c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f89023e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.f89020b
            java.nio.channels.Selector r6 = (java.nio.channels.Selector) r6
            java.lang.Object r0 = r0.f89019a
            sx.a r0 = (sx.a) r0
            kotlin.e.n(r7)
            goto L4c
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            kotlin.e.n(r7)
            r5.inSelect = r3
            r0.f89019a = r5
            r0.f89020b = r6
            r0.f89023e = r3
            java.lang.Object r7 = c40.b4.a(r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            r0 = r5
        L4c:
            java.util.concurrent.atomic.AtomicLong r7 = r0.f88998d
            long r1 = r7.get()
            r3 = 0
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r1 = 0
            if (r7 != 0) goto L62
            r2 = 500(0x1f4, double:2.47E-321)
            int r6 = r6.select(r2)
            r0.inSelect = r1
            goto L6d
        L62:
            r0.inSelect = r1
            java.util.concurrent.atomic.AtomicLong r7 = r0.f88998d
            r7.set(r3)
            int r6 = r6.selectNow()
        L6d:
            java.lang.Integer r6 = l00.a.f(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: sx.a.a1(java.nio.channels.Selector, j00.c):java.lang.Object");
    }

    @Override // io.ktor.network.selector.SelectorManagerSupport
    public void c0(@k sx.e selectable) {
        g0.p(selectable, "selectable");
        try {
            if (this.f89000f.a(selectable)) {
                this.f88999e.b(g2.f100423a);
                d1();
            } else {
                if (!selectable.getChannel().isOpen()) {
                    throw new ClosedChannelException();
                }
                throw new ClosedSelectorException();
            }
        } catch (Throwable th2) {
            i(selectable, th2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.closed = true;
        this.f89000f.b();
        if (this.f88999e.b(g2.f100423a)) {
            return;
        }
        d1();
    }

    public final void d1() {
        Selector selector;
        if (this.f88998d.incrementAndGet() == 1 && this.inSelect && (selector = this.selectorRef) != null) {
            selector.wakeup();
        }
    }

    @Override // c40.r0
    @k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f89001g;
    }
}
