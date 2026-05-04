package xw;

import c40.a0;
import c40.p2;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f98375f = AtomicIntegerFieldUpdater.newUpdater(a.class, "requestLogged");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f98376g = AtomicIntegerFieldUpdater.newUpdater(a.class, "responseLogged");

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final e f98377a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final StringBuilder f98378b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final StringBuilder f98379c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final a0 f98380d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final a0 f98381e;

    @m80.k
    private volatile /* synthetic */ int requestLogged;

    @m80.k
    private volatile /* synthetic */ int responseLogged;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.logging.HttpClientCallLogger", f = "HttpClientCallLogger.kt", i = {0}, l = {54}, m = "closeResponseLog", n = {"this"}, s = {"L$0"})
    /* renamed from: xw.a$a, reason: collision with other inner class name */
    public static final class C1332a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f98382a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f98383b;

        /* renamed from: d, reason: collision with root package name */
        public int f98385d;

        public C1332a(j00.c<? super C1332a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f98383b = obj;
            this.f98385d |= Integer.MIN_VALUE;
            return a.this.b(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.logging.HttpClientCallLogger", f = "HttpClientCallLogger.kt", i = {0, 0}, l = {34}, m = "logResponseBody", n = {"this", "message"}, s = {"L$0", "L$1"})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f98386a;

        /* renamed from: b, reason: collision with root package name */
        public Object f98387b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f98388c;

        /* renamed from: e, reason: collision with root package name */
        public int f98390e;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f98388c = obj;
            this.f98390e |= Integer.MIN_VALUE;
            return a.this.d(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.logging.HttpClientCallLogger", f = "HttpClientCallLogger.kt", i = {0, 0}, l = {29}, m = "logResponseException", n = {"this", "message"}, s = {"L$0", "L$1"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f98391a;

        /* renamed from: b, reason: collision with root package name */
        public Object f98392b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f98393c;

        /* renamed from: e, reason: collision with root package name */
        public int f98395e;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f98393c = obj;
            this.f98395e |= Integer.MIN_VALUE;
            return a.this.e(null, this);
        }
    }

    public a(@m80.k e logger) {
        a0 c11;
        a0 c12;
        g0.p(logger, "logger");
        this.f98377a = logger;
        this.f98378b = new StringBuilder();
        this.f98379c = new StringBuilder();
        c11 = p2.c(null, 1, null);
        this.f98380d = c11;
        c12 = p2.c(null, 1, null);
        this.f98381e = c12;
        this.requestLogged = 0;
        this.responseLogged = 0;
    }

    public final void a() {
        if (f98375f.compareAndSet(this, 0, 1)) {
            try {
                String obj = k0.b6(this.f98378b).toString();
                if (obj.length() > 0) {
                    this.f98377a.log(obj);
                }
            } finally {
                this.f98380d.complete();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@m80.k j00.c<? super yz.g2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof xw.a.C1332a
            if (r0 == 0) goto L13
            r0 = r5
            xw.a$a r0 = (xw.a.C1332a) r0
            int r1 = r0.f98385d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f98385d = r1
            goto L18
        L13:
            xw.a$a r0 = new xw.a$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f98383b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f98385d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f98382a
            xw.a r0 = (xw.a) r0
            kotlin.e.n(r5)
            goto L52
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.e.n(r5)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = xw.a.f98376g
            r2 = 0
            boolean r5 = r5.compareAndSet(r4, r2, r3)
            if (r5 != 0) goto L44
            yz.g2 r5 = yz.g2.f100423a
            return r5
        L44:
            c40.a0 r5 = r4.f98380d
            r0.f98382a = r4
            r0.f98385d = r3
            java.lang.Object r5 = r5.K0(r0)
            if (r5 != r1) goto L51
            return r1
        L51:
            r0 = r4
        L52:
            java.lang.StringBuilder r5 = r0.f98379c
            java.lang.CharSequence r5 = u30.k0.b6(r5)
            java.lang.String r5 = r5.toString()
            int r1 = r5.length()
            if (r1 <= 0) goto L67
            xw.e r0 = r0.f98377a
            r0.log(r5)
        L67:
            yz.g2 r5 = yz.g2.f100423a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xw.a.b(j00.c):java.lang.Object");
    }

    public final void c(@m80.k String message) {
        g0.p(message, "message");
        StringBuilder sb2 = this.f98378b;
        sb2.append(k0.b6(message).toString());
        g0.o(sb2, "append(...)");
        sb2.append('\n');
        g0.o(sb2, "append(...)");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@m80.k java.lang.String r5, @m80.k j00.c<? super yz.g2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof xw.a.b
            if (r0 == 0) goto L13
            r0 = r6
            xw.a$b r0 = (xw.a.b) r0
            int r1 = r0.f98390e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f98390e = r1
            goto L18
        L13:
            xw.a$b r0 = new xw.a$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f98388c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f98390e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.f98387b
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r0.f98386a
            xw.a r0 = (xw.a) r0
            kotlin.e.n(r6)
            goto L4c
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.e.n(r6)
            c40.a0 r6 = r4.f98381e
            r0.f98386a = r4
            r0.f98387b = r5
            r0.f98390e = r3
            java.lang.Object r6 = r6.K0(r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r0 = r4
        L4c:
            java.lang.StringBuilder r6 = r0.f98379c
            r6.append(r5)
            yz.g2 r5 = yz.g2.f100423a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xw.a.d(java.lang.String, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(@m80.k java.lang.String r5, @m80.k j00.c<? super yz.g2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof xw.a.c
            if (r0 == 0) goto L13
            r0 = r6
            xw.a$c r0 = (xw.a.c) r0
            int r1 = r0.f98395e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f98395e = r1
            goto L18
        L13:
            xw.a$c r0 = new xw.a$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f98393c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f98395e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.f98392b
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r0.f98391a
            xw.a r0 = (xw.a) r0
            kotlin.e.n(r6)
            goto L4c
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.e.n(r6)
            c40.a0 r6 = r4.f98380d
            r0.f98391a = r4
            r0.f98392b = r5
            r0.f98395e = r3
            java.lang.Object r6 = r6.K0(r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r0 = r4
        L4c:
            xw.e r6 = r0.f98377a
            java.lang.CharSequence r5 = u30.k0.b6(r5)
            java.lang.String r5 = r5.toString()
            r6.log(r5)
            yz.g2 r5 = yz.g2.f100423a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xw.a.e(java.lang.String, j00.c):java.lang.Object");
    }

    public final void f(@m80.k String message) {
        g0.p(message, "message");
        StringBuilder sb2 = this.f98379c;
        sb2.append(k0.b6(message).toString());
        g0.o(sb2, "append(...)");
        sb2.append('\n');
        g0.o(sb2, "append(...)");
        this.f98381e.complete();
    }
}
