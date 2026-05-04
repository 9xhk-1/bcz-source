package io.ktor.websocket;

import c40.l2;
import c40.q0;
import c40.r0;
import e40.k0;
import e40.l0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class i0 implements r0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final io.ktor.utils.io.g f62444a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f62445b;

    /* renamed from: c, reason: collision with root package name */
    public long f62446c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public a f62447d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final FrameParser f62448e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final o f62449f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final e40.o<io.ktor.websocket.d> f62450g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final l2 f62451h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f62452a = new a("HEADER", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f62453b = new a("BODY", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f62454c = new a("CLOSED", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a[] f62455d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ m00.a f62456e;

        static {
            a[] a11 = a();
            f62455d = a11;
            f62456e = m00.c.c(a11);
        }

        public a(String str, int i11) {
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{f62452a, f62453b, f62454c};
        }

        @m80.k
        public static m00.a<a> b() {
            return f62456e;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f62455d.clone();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f62457a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.f62452a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.f62453b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.f62454c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f62457a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.websocket.WebSocketReader", f = "WebSocketReader.kt", i = {0}, l = {116}, m = "handleFrameIfProduced", n = {"this"}, s = {"L$0"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62458a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f62459b;

        /* renamed from: d, reason: collision with root package name */
        public int f62461d;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62459b = obj;
            this.f62461d |= Integer.MIN_VALUE;
            return i0.this.i(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.websocket.WebSocketReader", f = "WebSocketReader.kt", i = {0, 0, 1, 1}, l = {93, 101}, m = "parseLoop", n = {"this", "buffer", "this", "buffer"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62462a;

        /* renamed from: b, reason: collision with root package name */
        public Object f62463b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f62464c;

        /* renamed from: e, reason: collision with root package name */
        public int f62466e;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62464c = obj;
            this.f62466e |= Integer.MIN_VALUE;
            return i0.this.l(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.websocket.WebSocketReader", f = "WebSocketReader.kt", i = {0, 0, 1, 1}, l = {69, 75}, m = "readLoop", n = {"this", "buffer", "this", "buffer"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62467a;

        /* renamed from: b, reason: collision with root package name */
        public Object f62468b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f62469c;

        /* renamed from: e, reason: collision with root package name */
        public int f62471e;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62469c = obj;
            this.f62471e |= Integer.MIN_VALUE;
            return i0.this.m(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.websocket.WebSocketReader$readerJob$1", f = "WebSocketReader.kt", i = {0}, l = {41}, m = "invokeSuspend", n = {"buffer"}, s = {"L$0"})
    public static final class f extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f62472a;

        /* renamed from: b, reason: collision with root package name */
        public int f62473b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ pz.h<ByteBuffer> f62474c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i0 f62475d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(pz.h<ByteBuffer> hVar, i0 i0Var, j00.c<? super f> cVar) {
            super(2, cVar);
            this.f62474c = hVar;
            this.f62475d = i0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new f(this.f62474c, this.f62475d, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((f) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th2;
            ByteBuffer byteBuffer;
            ProtocolViolationException e11;
            FrameTooBigException e12;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f62473b;
            try {
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    byteBuffer = (ByteBuffer) this.f62472a;
                    try {
                        kotlin.e.n(obj);
                    } catch (FrameTooBigException e13) {
                        e12 = e13;
                        this.f62475d.f62450g.z(e12);
                    } catch (ProtocolViolationException e14) {
                        e11 = e14;
                        this.f62475d.f62450g.z(e11);
                    } catch (ClosedChannelException | CancellationException unused) {
                    } catch (IOException unused2) {
                        k0.a.b(this.f62475d.f62450g, null, 1, null);
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                    this.f62474c.b4(byteBuffer);
                    l0.a.a(this.f62475d.f62450g, null, 1, null);
                    return g2.f100423a;
                }
                kotlin.e.n(obj);
                ByteBuffer U6 = this.f62474c.U6();
                try {
                    i0 i0Var = this.f62475d;
                    this.f62472a = U6;
                    this.f62473b = 1;
                    if (i0Var.m(U6, this) == l11) {
                        return l11;
                    }
                } catch (FrameTooBigException e15) {
                    byteBuffer = U6;
                    e12 = e15;
                    this.f62475d.f62450g.z(e12);
                    this.f62474c.b4(byteBuffer);
                    l0.a.a(this.f62475d.f62450g, null, 1, null);
                    return g2.f100423a;
                } catch (ProtocolViolationException e16) {
                    byteBuffer = U6;
                    e11 = e16;
                    this.f62475d.f62450g.z(e11);
                    this.f62474c.b4(byteBuffer);
                    l0.a.a(this.f62475d.f62450g, null, 1, null);
                    return g2.f100423a;
                } catch (ClosedChannelException | CancellationException unused3) {
                } catch (IOException unused4) {
                    byteBuffer = U6;
                    k0.a.b(this.f62475d.f62450g, null, 1, null);
                    this.f62474c.b4(byteBuffer);
                    l0.a.a(this.f62475d.f62450g, null, 1, null);
                    return g2.f100423a;
                } catch (Throwable th4) {
                    th2 = th4;
                    throw th2;
                }
                byteBuffer = U6;
                this.f62474c.b4(byteBuffer);
                l0.a.a(this.f62475d.f62450g, null, 1, null);
                return g2.f100423a;
            } catch (Throwable th5) {
                this.f62474c.b4(l11);
                l0.a.a(this.f62475d.f62450g, null, 1, null);
                throw th5;
            }
        }
    }

    public i0(@m80.k io.ktor.utils.io.g byteChannel, @m80.k kotlin.coroutines.d coroutineContext, long j11, @m80.k pz.h<ByteBuffer> pool) {
        kotlin.jvm.internal.g0.p(byteChannel, "byteChannel");
        kotlin.jvm.internal.g0.p(coroutineContext, "coroutineContext");
        kotlin.jvm.internal.g0.p(pool, "pool");
        this.f62444a = byteChannel;
        this.f62445b = coroutineContext;
        this.f62446c = j11;
        this.f62447d = a.f62452a;
        this.f62448e = new FrameParser();
        this.f62449f = new o();
        this.f62450g = e40.r.d(8, null, null, 6, null);
        this.f62451h = c40.i.d(this, new q0("ws-reader"), CoroutineStart.ATOMIC, new f(pool, this, null));
    }

    public final void E0(long j11) {
        this.f62446c = j11;
    }

    public final long d0() {
        return this.f62446c;
    }

    @Override // c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f62445b;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(j00.c<? super yz.g2> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof io.ktor.websocket.i0.c
            if (r0 == 0) goto L13
            r0 = r12
            io.ktor.websocket.i0$c r0 = (io.ktor.websocket.i0.c) r0
            int r1 = r0.f62461d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62461d = r1
            goto L18
        L13:
            io.ktor.websocket.i0$c r0 = new io.ktor.websocket.i0$c
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f62459b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f62461d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f62458a
            io.ktor.websocket.i0 r0 = (io.ktor.websocket.i0) r0
            kotlin.e.n(r12)
            goto L89
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L35:
            kotlin.e.n(r12)
            io.ktor.websocket.o r12 = r11.f62449f
            boolean r12 = r12.a()
            if (r12 != 0) goto L8e
            io.ktor.websocket.FrameParser r12 = r11.f62448e
            io.ktor.websocket.FrameType r12 = r12.e()
            io.ktor.websocket.FrameType r2 = io.ktor.websocket.FrameType.CLOSE
            if (r12 != r2) goto L4d
            io.ktor.websocket.i0$a r12 = io.ktor.websocket.i0.a.f62454c
            goto L4f
        L4d:
            io.ktor.websocket.i0$a r12 = io.ktor.websocket.i0.a.f62452a
        L4f:
            r11.f62447d = r12
            io.ktor.websocket.FrameParser r12 = r11.f62448e
            io.ktor.websocket.d$c r4 = io.ktor.websocket.d.f62381i
            boolean r5 = r12.d()
            io.ktor.websocket.FrameType r6 = r12.e()
            io.ktor.websocket.o r2 = r11.f62449f
            java.lang.Integer r7 = r12.h()
            java.nio.ByteBuffer r2 = r2.d(r7)
            byte[] r7 = xy.z0.i(r2)
            boolean r8 = r12.i()
            boolean r9 = r12.j()
            boolean r10 = r12.k()
            io.ktor.websocket.d r12 = r4.a(r5, r6, r7, r8, r9, r10)
            e40.o<io.ktor.websocket.d> r2 = r11.f62450g
            r0.f62458a = r11
            r0.f62461d = r3
            java.lang.Object r12 = r2.b(r12, r0)
            if (r12 != r1) goto L88
            return r1
        L88:
            r0 = r11
        L89:
            io.ktor.websocket.FrameParser r12 = r0.f62448e
            r12.a()
        L8e:
            yz.g2 r12 = yz.g2.f100423a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.i0.i(j00.c):java.lang.Object");
    }

    @m80.k
    public final e40.k0<io.ktor.websocket.d> j() {
        return this.f62450g;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.nio.ByteBuffer r10, j00.c<? super yz.g2> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof io.ktor.websocket.i0.d
            if (r0 == 0) goto L13
            r0 = r11
            io.ktor.websocket.i0$d r0 = (io.ktor.websocket.i0.d) r0
            int r1 = r0.f62466e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62466e = r1
            goto L18
        L13:
            io.ktor.websocket.i0$d r0 = new io.ktor.websocket.i0$d
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f62464c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f62466e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L28
            if (r2 != r3) goto L34
        L28:
            java.lang.Object r10 = r0.f62463b
            java.nio.ByteBuffer r10 = (java.nio.ByteBuffer) r10
            java.lang.Object r2 = r0.f62462a
            io.ktor.websocket.i0 r2 = (io.ktor.websocket.i0) r2
            kotlin.e.n(r11)
            goto L40
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3c:
            kotlin.e.n(r11)
            r2 = r9
        L40:
            boolean r11 = r10.hasRemaining()
            if (r11 == 0) goto Lc4
            io.ktor.websocket.i0$a r11 = r2.f62447d
            int[] r5 = io.ktor.websocket.i0.b.f62457a
            int r11 = r11.ordinal()
            r11 = r5[r11]
            if (r11 == r4) goto L72
            if (r11 == r3) goto L60
            r10 = 3
            if (r11 != r10) goto L5a
            yz.g2 r10 = yz.g2.f100423a
            return r10
        L5a:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L60:
            io.ktor.websocket.o r11 = r2.f62449f
            r11.b(r10)
            r0.f62462a = r2
            r0.f62463b = r10
            r0.f62466e = r3
            java.lang.Object r11 = r2.i(r0)
            if (r11 != r1) goto L40
            goto Lb4
        L72:
            io.ktor.websocket.FrameParser r11 = r2.f62448e
            r11.b(r10)
            io.ktor.websocket.FrameParser r11 = r2.f62448e
            boolean r11 = r11.c()
            if (r11 == 0) goto Lc1
            io.ktor.websocket.i0$a r11 = io.ktor.websocket.i0.a.f62453b
            r2.f62447d = r11
            io.ktor.websocket.FrameParser r11 = r2.f62448e
            long r5 = r11.f()
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 > 0) goto Lb5
            io.ktor.websocket.FrameParser r11 = r2.f62448e
            long r5 = r11.f()
            long r7 = r2.f62446c
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 > 0) goto Lb5
            io.ktor.websocket.o r11 = r2.f62449f
            io.ktor.websocket.FrameParser r5 = r2.f62448e
            long r5 = r5.f()
            int r5 = (int) r5
            r11.c(r5, r10)
            r0.f62462a = r2
            r0.f62463b = r10
            r0.f62466e = r4
            java.lang.Object r11 = r2.i(r0)
            if (r11 != r1) goto L40
        Lb4:
            return r1
        Lb5:
            io.ktor.websocket.FrameTooBigException r10 = new io.ktor.websocket.FrameTooBigException
            io.ktor.websocket.FrameParser r11 = r2.f62448e
            long r0 = r11.f()
            r10.<init>(r0)
            throw r10
        Lc1:
            yz.g2 r10 = yz.g2.f100423a
            return r10
        Lc4:
            yz.g2 r10 = yz.g2.f100423a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.i0.l(java.nio.ByteBuffer, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0083, code lost:
    
        if (r2.l(r8, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0083 -> B:11:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(java.nio.ByteBuffer r8, j00.c<? super yz.g2> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof io.ktor.websocket.i0.e
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.websocket.i0$e r0 = (io.ktor.websocket.i0.e) r0
            int r1 = r0.f62471e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62471e = r1
            goto L18
        L13:
            io.ktor.websocket.i0$e r0 = new io.ktor.websocket.i0$e
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f62469c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f62471e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r8 = r0.f62468b
            java.nio.ByteBuffer r8 = (java.nio.ByteBuffer) r8
            java.lang.Object r2 = r0.f62467a
            io.ktor.websocket.i0 r2 = (io.ktor.websocket.i0) r2
            kotlin.e.n(r9)
        L33:
            r9 = r2
            goto L86
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3d:
            java.lang.Object r8 = r0.f62468b
            java.nio.ByteBuffer r8 = (java.nio.ByteBuffer) r8
            java.lang.Object r2 = r0.f62467a
            io.ktor.websocket.i0 r2 = (io.ktor.websocket.i0) r2
            kotlin.e.n(r9)
            goto L68
        L49:
            kotlin.e.n(r9)
            r8.clear()
            r9 = r7
        L50:
            io.ktor.websocket.i0$a r2 = r9.f62447d
            io.ktor.websocket.i0$a r5 = io.ktor.websocket.i0.a.f62454c
            if (r2 == r5) goto L8a
            io.ktor.utils.io.g r2 = r9.f62444a
            r0.f62467a = r9
            r0.f62468b = r8
            r0.f62471e = r4
            java.lang.Object r2 = io.ktor.utils.io.l.k(r2, r8, r0)
            if (r2 != r1) goto L65
            goto L85
        L65:
            r6 = r2
            r2 = r9
            r9 = r6
        L68:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r5 = -1
            if (r9 != r5) goto L76
            io.ktor.websocket.i0$a r8 = io.ktor.websocket.i0.a.f62454c
            r2.f62447d = r8
            goto L8a
        L76:
            r8.flip()
            r0.f62467a = r2
            r0.f62468b = r8
            r0.f62471e = r3
            java.lang.Object r9 = r2.l(r8, r0)
            if (r9 != r1) goto L33
        L85:
            return r1
        L86:
            r8.compact()
            goto L50
        L8a:
            yz.g2 r8 = yz.g2.f100423a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.i0.m(java.nio.ByteBuffer, j00.c):java.lang.Object");
    }

    public /* synthetic */ i0(io.ktor.utils.io.g gVar, kotlin.coroutines.d dVar, long j11, pz.h hVar, int i11, kotlin.jvm.internal.v vVar) {
        this(gVar, dVar, j11, (i11 & 8) != 0 ? yy.a.a() : hVar);
    }

    public static /* synthetic */ void h() {
    }
}
