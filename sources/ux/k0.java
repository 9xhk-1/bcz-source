package ux;

import c40.l2;
import c40.q0;
import c40.r0;
import io.ktor.network.tls.TLSRecordType;
import io.ktor.utils.io.m0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTLSClientSessionJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TLSClientSessionJvm.kt\nio/ktor/network/tls/TLSSocket\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n+ 3 Pool.kt\nio/ktor/utils/io/pool/PoolKt\n+ 4 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n*L\n1#1,92:1\n160#2:93\n94#2,3:94\n161#2,2:97\n101#2:99\n97#2,3:100\n156#3,3:103\n160#3:109\n15#4,3:106\n*S KotlinDebug\n*F\n+ 1 TLSClientSessionJvm.kt\nio/ktor/network/tls/TLSSocket\n*L\n52#1:93\n52#1:94,3\n52#1:97,2\n52#1:99\n52#1:100,3\n71#1:103,3\n71#1:109\n79#1:106,3\n*E\n"})
/* loaded from: classes8.dex */
public final class k0 implements r0, tx.k0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final e40.k0<i0> f92629a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final e40.l0<i0> f92630b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final tx.k0 f92631c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f92632d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f92633a;

        static {
            int[] iArr = new int[TLSRecordType.values().length];
            try {
                iArr[TLSRecordType.ApplicationData.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f92633a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.network.tls.TLSSocket", f = "TLSClientSessionJvm.kt", i = {0, 0, 1, 1, 2, 2}, l = {97, 57, 58, 65, 65, 65}, m = "appDataInputLoop", n = {"pipe", "$this$consume$iv$iv", "pipe", "$this$consume$iv$iv", "pipe", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f92634a;

        /* renamed from: b, reason: collision with root package name */
        public Object f92635b;

        /* renamed from: c, reason: collision with root package name */
        public Object f92636c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f92637d;

        /* renamed from: f, reason: collision with root package name */
        public int f92639f;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f92637d = obj;
            this.f92639f |= Integer.MIN_VALUE;
            return k0.this.H(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.network.tls.TLSSocket", f = "TLSClientSessionJvm.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {75, 79}, m = "appDataOutputLoop", n = {"this", "pipe", "$this$useInstance$iv", "instance$iv", "buffer", "this", "pipe", "$this$useInstance$iv", "instance$iv", "buffer"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f92640a;

        /* renamed from: b, reason: collision with root package name */
        public Object f92641b;

        /* renamed from: c, reason: collision with root package name */
        public Object f92642c;

        /* renamed from: d, reason: collision with root package name */
        public Object f92643d;

        /* renamed from: e, reason: collision with root package name */
        public Object f92644e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f92645f;

        /* renamed from: h, reason: collision with root package name */
        public int f92647h;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f92645f = obj;
            this.f92647h |= Integer.MIN_VALUE;
            return k0.this.S(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.network.tls.TLSSocket$attachForReading$1", f = "TLSClientSessionJvm.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements x00.p<m0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f92648a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f92649b;

        public d(j00.c<? super d> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            d dVar = k0.this.new d(cVar);
            dVar.f92649b = obj;
            return dVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(m0 m0Var, j00.c<? super g2> cVar) {
            return ((d) create(m0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f92648a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                m0 m0Var = (m0) this.f92649b;
                k0 k0Var = k0.this;
                io.ktor.utils.io.m a11 = m0Var.a();
                this.f92648a = 1;
                if (k0Var.H(a11, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.network.tls.TLSSocket$attachForWriting$1", f = "TLSClientSessionJvm.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements x00.p<io.ktor.utils.io.j0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f92651a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f92652b;

        public e(j00.c<? super e> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            e eVar = k0.this.new e(cVar);
            eVar.f92652b = obj;
            return eVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.utils.io.j0 j0Var, j00.c<? super g2> cVar) {
            return ((e) create(j0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f92651a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                io.ktor.utils.io.j0 j0Var = (io.ktor.utils.io.j0) this.f92652b;
                k0 k0Var = k0.this;
                io.ktor.utils.io.g a11 = j0Var.a();
                this.f92651a = 1;
                if (k0Var.S(a11, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return g2.f100423a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k0(@m80.k e40.k0<i0> input, @m80.k e40.l0<? super i0> output, @m80.k tx.k0 socket, @m80.k kotlin.coroutines.d coroutineContext) {
        kotlin.jvm.internal.g0.p(input, "input");
        kotlin.jvm.internal.g0.p(output, "output");
        kotlin.jvm.internal.g0.p(socket, "socket");
        kotlin.jvm.internal.g0.p(coroutineContext, "coroutineContext");
        this.f92629a = input;
        this.f92630b = output;
        this.f92631c = socket;
        this.f92632d = coroutineContext;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(2:3|(4:5|6|7|8))|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011e, code lost:
    
        if (r13.j(r0) == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0136, code lost:
    
        if (r12.j(r0) != r1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0121, code lost:
    
        r12 = r13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x004c: MOVE (r13 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:77), block:B:69:0x004c */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099 A[Catch: all -> 0x00e2, TryCatch #1 {all -> 0x00e2, blocks: (B:21:0x0081, B:25:0x0091, B:27:0x0099, B:29:0x00b6, B:44:0x00e4, B:45:0x010b, B:46:0x010c), top: B:20:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010c A[Catch: all -> 0x00e2, TRY_LEAVE, TryCatch #1 {all -> 0x00e2, blocks: (B:21:0x0081, B:25:0x0091, B:27:0x0099, B:29:0x00b6, B:44:0x00e4, B:45:0x010b, B:46:0x010c), top: B:20:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [io.ktor.utils.io.m] */
    /* JADX WARN: Type inference failed for: r13v14, types: [io.ktor.utils.io.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [e40.k0] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [e40.k0] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2, types: [e40.k0, e40.k0<ux.i0>] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(io.ktor.utils.io.m r12, j00.c<? super yz.g2> r13) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ux.k0.H(io.ktor.utils.io.m, j00.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|(1:(1:(5:11|12|13|14|(2:16|17)(3:19|20|(1:22)(5:24|25|26|27|28)))(2:34|35))(4:36|37|20|(0)(0)))(6:38|39|40|41|14|(0)(0))))|48|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d2, code lost:
    
        if (r0.b(r12, r1) == r3) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e5, code lost:
    
        r0 = r11.f92630b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0049, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00df, code lost:
    
        e40.l0.a.a(r11.f92630b, null, 1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e4, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a7 A[Catch: all -> 0x0049, ClosedSendChannelException -> 0x00e5, TRY_LEAVE, TryCatch #4 {ClosedSendChannelException -> 0x00e5, all -> 0x0049, blocks: (B:12:0x0041, B:14:0x007e, B:20:0x009e, B:22:0x00a7, B:37:0x0066), top: B:7:0x0029, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d5 A[Catch: all -> 0x00dc, TRY_ENTER, TryCatch #2 {all -> 0x00dc, blocks: (B:24:0x00d5, B:25:0x00d7, B:46:0x00df, B:47:0x00e4, B:44:0x00e5, B:12:0x0041, B:14:0x007e, B:20:0x009e, B:22:0x00a7, B:37:0x0066), top: B:7:0x0029, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00d2 -> B:13:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S(io.ktor.utils.io.g r20, j00.c<? super yz.g2> r21) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ux.k0.S(io.ktor.utils.io.g, j00.c):java.lang.Object");
    }

    @Override // tx.d
    @m80.k
    public l2 Z3() {
        return this.f92631c.Z3();
    }

    @Override // tx.e
    @m80.k
    public io.ktor.utils.io.i0 a(@m80.k io.ktor.utils.io.b channel) {
        kotlin.jvm.internal.g0.p(channel, "channel");
        return io.ktor.utils.io.j.Q(this, getCoroutineContext().plus(new q0("cio-tls-output-loop")), channel, new e(null));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f92631c.close();
    }

    @Override // tx.d, c40.k1
    public void dispose() {
        this.f92631c.dispose();
    }

    @Override // c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f92632d;
    }

    @Override // tx.a
    @m80.k
    public tx.l0 getLocalAddress() {
        return this.f92631c.getLocalAddress();
    }

    @Override // tx.b
    @m80.k
    public tx.l0 l() {
        return this.f92631c.l();
    }

    @Override // tx.c
    @m80.k
    public io.ktor.utils.io.l0 r(@m80.k io.ktor.utils.io.b channel) {
        kotlin.jvm.internal.g0.p(channel, "channel");
        return io.ktor.utils.io.q.B(this, getCoroutineContext().plus(new q0("cio-tls-input-loop")), channel, new d(null));
    }
}
