package io.ktor.utils.io;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nByteChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteChannel.kt\nio/ktor/utils/io/ByteChannel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 Synchronized.kt\nio/ktor/utils/io/locks/SynchronizedKt\n*L\n1#1,247:1\n146#1,2:249\n148#1:260\n181#1,24:261\n159#1,5:285\n206#1:290\n149#1:291\n151#1:294\n159#1,5:296\n146#1,2:301\n148#1:312\n181#1,24:313\n159#1,5:337\n206#1:342\n149#1:343\n151#1:346\n159#1,5:348\n181#1,24:362\n159#1,5:386\n206#1:391\n159#1,5:394\n1#2:248\n351#3,9:251\n360#3,2:292\n351#3,9:303\n360#3,2:344\n351#3,9:353\n360#3,2:392\n74#4:295\n74#4:347\n*S KotlinDebug\n*F\n+ 1 ByteChannel.kt\nio/ktor/utils/io/ByteChannel\n*L\n68#1:249,2\n68#1:260\n68#1:261,24\n68#1:285,5\n68#1:290\n68#1:291\n68#1:294\n83#1:296,5\n93#1:301,2\n93#1:312\n93#1:313,24\n93#1:337,5\n93#1:342\n93#1:343\n93#1:346\n108#1:348,5\n148#1:362,24\n148#1:386,5\n148#1:391\n204#1:394,5\n68#1:251,9\n68#1:292,2\n93#1:303,9\n93#1:344,2\n147#1:353,9\n147#1:392,2\n78#1:295\n102#1:347\n*E\n"})
/* loaded from: classes8.dex */
public final class b implements g, io.ktor.utils.io.a {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f62073g = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "suspensionSlot");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f62074h = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closedCause");

    @m80.k
    volatile /* synthetic */ Object _closedCause;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f62075b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final y40.b f62076c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final Object f62077d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final y40.b f62078e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final y40.b f62079f;
    private volatile int flushBufferSize;

    @m80.k
    volatile /* synthetic */ Object suspensionSlot;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.ByteChannel", f = "ByteChannel.kt", i = {0, 0, 0}, l = {250}, m = "awaitContent", n = {"this", "this_$iv", "min"}, s = {"L$0", "L$1", "I$0"})
    /* renamed from: io.ktor.utils.io.b$b, reason: collision with other inner class name */
    public static final class C0723b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62088a;

        /* renamed from: b, reason: collision with root package name */
        public Object f62089b;

        /* renamed from: c, reason: collision with root package name */
        public int f62090c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f62091d;

        /* renamed from: f, reason: collision with root package name */
        public int f62093f;

        public C0723b(j00.c<? super C0723b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62091d = obj;
            this.f62093f |= Integer.MIN_VALUE;
            return b.this.d(0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.ByteChannel", f = "ByteChannel.kt", i = {0, 0}, l = {250}, m = "flush", n = {"this", "this_$iv"}, s = {"L$0", "L$1"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62094a;

        /* renamed from: b, reason: collision with root package name */
        public Object f62095b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f62096c;

        /* renamed from: e, reason: collision with root package name */
        public int f62098e;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62096c = obj;
            this.f62098e |= Integer.MIN_VALUE;
            return b.this.g(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.ByteChannel", f = "ByteChannel.kt", i = {0}, l = {122}, m = "flushAndClose", n = {"this"}, s = {"L$0"})
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62099a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f62100b;

        /* renamed from: d, reason: collision with root package name */
        public int f62102d;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62100b = obj;
            this.f62102d |= Integer.MIN_VALUE;
            return b.this.j(this);
        }
    }

    public b() {
        this(false, 1, null);
    }

    @Override // io.ktor.utils.io.g, io.ktor.utils.io.m
    public void a(@m80.l Throwable th2) {
        if (this._closedCause != null) {
            return;
        }
        t tVar = new t(th2);
        androidx.concurrent.futures.a.a(f62074h, this, null, tVar);
        m(tVar.a());
    }

    @Override // io.ktor.utils.io.g, io.ktor.utils.io.m
    @m80.l
    public Throwable b() {
        t tVar = (t) this._closedCause;
        if (tVar != null) {
            return tVar.a();
        }
        return null;
    }

    @Override // io.ktor.utils.io.a
    @b0
    public void c() {
        if (this.f62079f.J()) {
            return;
        }
        synchronized (this.f62077d) {
            int r11 = (int) this.f62079f.r();
            this.f62076c.T(this.f62079f);
            this.flushBufferSize += r11;
            g2 g2Var = g2.f100423a;
        }
        a aVar = (a) this.suspensionSlot;
        if ((aVar instanceof a.d) && androidx.concurrent.futures.a.a(f62073g, this, aVar, a.c.f62085b)) {
            ((a.e) aVar).a();
        }
    }

    @Override // io.ktor.utils.io.a
    public void close() {
        c();
        if (androidx.concurrent.futures.a.a(f62074h, this, null, u.a())) {
            m(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // io.ktor.utils.io.g
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(int r12, @m80.k j00.c<? super java.lang.Boolean> r13) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.b.d(int, j00.c):java.lang.Object");
    }

    @Override // io.ktor.utils.io.g
    @m80.k
    public y40.c0 e() {
        Throwable b11 = b();
        if (b11 != null) {
            throw b11;
        }
        if (this.f62078e.J()) {
            r();
        }
        return this.f62078e;
    }

    @Override // io.ktor.utils.io.g
    public boolean f() {
        if (b() == null) {
            return h() && this.flushBufferSize == 0 && this.f62078e.J();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[LOOP:0: B:11:0x004d->B:28:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // io.ktor.utils.io.m
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(@m80.k j00.c<? super yz.g2> r11) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.b.g(j00.c):java.lang.Object");
    }

    @Override // io.ktor.utils.io.m
    public boolean h() {
        return this._closedCause != null;
    }

    @Override // io.ktor.utils.io.m
    @m80.k
    public y40.x i() {
        Throwable b11 = b();
        if (b11 != null) {
            throw b11;
        }
        if (h()) {
            throw new IOException("Channel is closed for write");
        }
        return this.f62079f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // io.ktor.utils.io.m
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(@m80.k j00.c<? super yz.g2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof io.ktor.utils.io.b.d
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.b$d r0 = (io.ktor.utils.io.b.d) r0
            int r1 = r0.f62102d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62102d = r1
            goto L18
        L13:
            io.ktor.utils.io.b$d r0 = new io.ktor.utils.io.b$d
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f62100b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f62102d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f62099a
            io.ktor.utils.io.b r0 = (io.ktor.utils.io.b) r0
            kotlin.e.n(r5)     // Catch: java.lang.Throwable -> L2d
            goto L48
        L2d:
            r5 = move-exception
            goto L50
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            kotlin.e.n(r5)
            kotlin.Result$a r5 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L4e
            r0.f62099a = r4     // Catch: java.lang.Throwable -> L4e
            r0.f62102d = r3     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r5 = r4.g(r0)     // Catch: java.lang.Throwable -> L4e
            if (r5 != r1) goto L47
            return r1
        L47:
            r0 = r4
        L48:
            yz.g2 r5 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L2d
            kotlin.Result.m6308constructorimpl(r5)     // Catch: java.lang.Throwable -> L2d
            goto L59
        L4e:
            r5 = move-exception
            r0 = r4
        L50:
            kotlin.Result$a r1 = kotlin.Result.Companion
            java.lang.Object r5 = kotlin.e.a(r5)
            kotlin.Result.m6308constructorimpl(r5)
        L59:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = io.ktor.utils.io.b.f62074h
            io.ktor.utils.io.t r1 = io.ktor.utils.io.u.a()
            r2 = 0
            boolean r5 = androidx.concurrent.futures.a.a(r5, r0, r2, r1)
            if (r5 != 0) goto L69
            yz.g2 r5 = yz.g2.f100423a
            return r5
        L69:
            r0.m(r2)
            yz.g2 r5 = yz.g2.f100423a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.b.j(j00.c):java.lang.Object");
    }

    public final void m(Throwable th2) {
        a aVar = (a) f62073g.getAndSet(this, th2 != null ? new a.C0720a(th2) : a.f62080a.a());
        if (aVar instanceof a.e) {
            ((a.e) aVar).c(th2);
        }
    }

    public final boolean n() {
        return this.f62075b;
    }

    public final void r() {
        synchronized (this.f62077d) {
            this.f62076c.S1(this.f62078e);
            this.flushBufferSize = 0;
            g2 g2Var = g2.f100423a;
        }
        a aVar = (a) this.suspensionSlot;
        if ((aVar instanceof a.f) && androidx.concurrent.futures.a.a(f62073g, this, aVar, a.c.f62085b)) {
            ((a.e) aVar).a();
        }
    }

    public final /* synthetic */ <Expected extends a.e> void s() {
        a aVar = (a) this.suspensionSlot;
        kotlin.jvm.internal.g0.y(3, "Expected");
        if ((aVar instanceof a.e) && androidx.concurrent.futures.a.a(f62073g, this, aVar, a.c.f62085b)) {
            ((a.e) aVar).a();
        }
    }

    public final /* synthetic */ <TaskType extends a.e> Object t(x00.l<? super j00.c<? super g2>, ? extends TaskType> lVar, x00.a<Boolean> aVar, j00.c<? super g2> cVar) {
        while (aVar.invoke().booleanValue()) {
            kotlin.jvm.internal.d0.e(0);
            c40.p pVar = new c40.p(IntrinsicsKt__IntrinsicsJvmKt.e(cVar), 1);
            pVar.y();
            TaskType invoke = lVar.invoke(pVar);
            a aVar2 = (a) this.suspensionSlot;
            boolean z11 = aVar2 instanceof a.C0720a;
            if (z11 || androidx.concurrent.futures.a.a(f62073g, this, aVar2, invoke)) {
                kotlin.jvm.internal.g0.y(3, "TaskType");
                boolean z12 = aVar2 instanceof a.e;
                if (z12) {
                    ((a.e) aVar2).c(new ConcurrentIOException(invoke.b()));
                } else if (z12) {
                    ((a.e) aVar2).a();
                } else if (z11) {
                    invoke.c(((a.C0720a) aVar2).j());
                    g2 g2Var = g2.f100423a;
                } else if (!kotlin.jvm.internal.g0.g(aVar2, a.c.f62085b)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!aVar.invoke().booleanValue()) {
                    a aVar3 = (a) this.suspensionSlot;
                    kotlin.jvm.internal.g0.y(3, "TaskType");
                    if ((aVar3 instanceof a.e) && androidx.concurrent.futures.a.a(f62073g, this, aVar3, a.c.f62085b)) {
                        ((a.e) aVar3).a();
                    }
                }
            } else {
                invoke.a();
                g2 g2Var2 = g2.f100423a;
            }
            g2 g2Var3 = g2.f100423a;
            if (pVar.F() == kotlin.coroutines.intrinsics.b.l()) {
                l00.f.c(cVar);
            }
            kotlin.jvm.internal.d0.e(1);
        }
        return g2.f100423a;
    }

    @m80.k
    public String toString() {
        return "ByteChannel[" + hashCode() + l50.b.f69930l;
    }

    public final /* synthetic */ <TaskType extends a.e> void u(TaskType tasktype, x00.a<Boolean> aVar) {
        a aVar2 = (a) this.suspensionSlot;
        boolean z11 = aVar2 instanceof a.C0720a;
        if (!z11 && !androidx.concurrent.futures.a.a(f62073g, this, aVar2, tasktype)) {
            tasktype.a();
            return;
        }
        kotlin.jvm.internal.g0.y(3, "TaskType");
        boolean z12 = aVar2 instanceof a.e;
        if (z12) {
            ((a.e) aVar2).c(new ConcurrentIOException(tasktype.b()));
        } else if (z12) {
            ((a.e) aVar2).a();
        } else if (z11) {
            tasktype.c(((a.C0720a) aVar2).j());
            return;
        } else if (!kotlin.jvm.internal.g0.g(aVar2, a.c.f62085b)) {
            throw new NoWhenBranchMatchedException();
        }
        if (aVar.invoke().booleanValue()) {
            return;
        }
        a aVar3 = (a) this.suspensionSlot;
        kotlin.jvm.internal.g0.y(3, "TaskType");
        if ((aVar3 instanceof a.e) && androidx.concurrent.futures.a.a(f62073g, this, aVar3, a.c.f62085b)) {
            ((a.e) aVar3).a();
        }
    }

    public b(boolean z11) {
        this.f62075b = z11;
        this.f62076c = new y40.b();
        this.f62077d = new Object();
        this.suspensionSlot = a.c.f62085b;
        this.f62078e = new y40.b();
        this.f62079f = new y40.b();
        this._closedCause = null;
    }

    public /* synthetic */ b(boolean z11, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? false : z11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final C0721b f62080a = C0721b.f62082a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: io.ktor.utils.io.b$a$a, reason: collision with other inner class name */
        public static final class C0720a implements a {

            /* renamed from: b, reason: collision with root package name */
            @m80.l
            public final Throwable f62081b;

            public C0720a(@m80.l Throwable th2) {
                this.f62081b = th2;
            }

            public static /* synthetic */ C0720a i(C0720a c0720a, Throwable th2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    th2 = c0720a.f62081b;
                }
                return c0720a.h(th2);
            }

            public boolean equals(@m80.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0720a) && kotlin.jvm.internal.g0.g(this.f62081b, ((C0720a) obj).f62081b);
            }

            @m80.l
            public final Throwable g() {
                return this.f62081b;
            }

            @m80.k
            public final C0720a h(@m80.l Throwable th2) {
                return new C0720a(th2);
            }

            public int hashCode() {
                Throwable th2 = this.f62081b;
                if (th2 == null) {
                    return 0;
                }
                return th2.hashCode();
            }

            @m80.l
            public final Throwable j() {
                return this.f62081b;
            }

            @m80.k
            public String toString() {
                return "Closed(cause=" + this.f62081b + ')';
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class c implements a {

            /* renamed from: b, reason: collision with root package name */
            @m80.k
            public static final c f62085b = new c();

            public boolean equals(@m80.l Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -231472095;
            }

            @m80.k
            public String toString() {
                return "Empty";
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class d implements e {

            /* renamed from: b, reason: collision with root package name */
            @m80.k
            public final j00.c<g2> f62086b;

            /* JADX WARN: Multi-variable type inference failed */
            public d(@m80.k j00.c<? super g2> continuation) {
                kotlin.jvm.internal.g0.p(continuation, "continuation");
                this.f62086b = continuation;
            }

            @Override // io.ktor.utils.io.b.a.e
            public void a() {
                e.C0722a.a(this);
            }

            @Override // io.ktor.utils.io.b.a.e
            @m80.k
            public String b() {
                return "read";
            }

            @Override // io.ktor.utils.io.b.a.e
            public void c(@m80.l Throwable th2) {
                e.C0722a.b(this, th2);
            }

            @Override // io.ktor.utils.io.b.a.e
            @m80.k
            public j00.c<g2> f() {
                return this.f62086b;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public interface e extends a {

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nByteChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteChannel.kt\nio/ktor/utils/io/ByteChannel$Slot$Task$DefaultImpls\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,247:1\n1#2:248\n*E\n"})
            /* renamed from: io.ktor.utils.io.b$a$e$a, reason: collision with other inner class name */
            public static final class C0722a {
                public static void a(@m80.k e eVar) {
                    eVar.f().resumeWith(a.f62080a.c());
                }

                public static void b(@m80.k e eVar, @m80.l Throwable th2) {
                    Object c11;
                    j00.c<g2> f11 = eVar.f();
                    if (th2 != null) {
                        Result.a aVar = Result.Companion;
                        c11 = Result.m6308constructorimpl(kotlin.e.a(th2));
                    } else {
                        c11 = a.f62080a.c();
                    }
                    f11.resumeWith(c11);
                }

                public static /* synthetic */ void c(e eVar, Throwable th2, int i11, Object obj) {
                    if (obj != null) {
                        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resume");
                    }
                    if ((i11 & 1) != 0) {
                        th2 = null;
                    }
                    eVar.c(th2);
                }
            }

            void a();

            @m80.k
            String b();

            void c(@m80.l Throwable th2);

            @m80.k
            j00.c<g2> f();
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class f implements e {

            /* renamed from: b, reason: collision with root package name */
            @m80.k
            public final j00.c<g2> f62087b;

            /* JADX WARN: Multi-variable type inference failed */
            public f(@m80.k j00.c<? super g2> continuation) {
                kotlin.jvm.internal.g0.p(continuation, "continuation");
                this.f62087b = continuation;
            }

            @Override // io.ktor.utils.io.b.a.e
            public void a() {
                e.C0722a.a(this);
            }

            @Override // io.ktor.utils.io.b.a.e
            @m80.k
            public String b() {
                return "write";
            }

            @Override // io.ktor.utils.io.b.a.e
            public void c(@m80.l Throwable th2) {
                e.C0722a.b(this, th2);
            }

            @Override // io.ktor.utils.io.b.a.e
            @m80.k
            public j00.c<g2> f() {
                return this.f62087b;
            }
        }

        @m80.k
        static Object d() {
            return f62080a.c();
        }

        @m80.k
        static C0720a e() {
            return f62080a.a();
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: io.ktor.utils.io.b$a$b, reason: collision with other inner class name */
        public static final class C0721b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ C0721b f62082a = new C0721b();

            /* renamed from: b, reason: collision with root package name */
            @m80.k
            public static final C0720a f62083b = new C0720a(null);

            /* renamed from: c, reason: collision with root package name */
            @m80.k
            public static final Object f62084c;

            static {
                Result.a aVar = Result.Companion;
                f62084c = Result.m6308constructorimpl(g2.f100423a);
            }

            @m80.k
            public final C0720a a() {
                return f62083b;
            }

            @m80.k
            public final Object c() {
                return f62084c;
            }

            @w00.o
            public static /* synthetic */ void b() {
            }

            @w00.o
            public static /* synthetic */ void d() {
            }
        }
    }

    public static /* synthetic */ void o() {
    }

    @b0
    public static /* synthetic */ void p() {
    }

    @b0
    public static /* synthetic */ void q() {
    }
}
