package tx;

import c40.h1;
import io.ktor.network.selector.SelectInterest;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import tx.p0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.network.sockets.CIOReaderKt$attachForReadingDirectImpl$1", f = "CIOReader.kt", i = {0, 1, 2, 3, 4, 4, 5, 5, 6, 6, 7, 7}, l = {97, 106, 109, 110, 97, 106, 109, 110}, m = "invokeSuspend", n = {com.alipay.sdk.m.m.a.f10784h0, com.alipay.sdk.m.m.a.f10784h0, com.alipay.sdk.m.m.a.f10784h0, com.alipay.sdk.m.m.a.f10784h0, com.alipay.sdk.m.m.a.f10784h0, "$this$withTimeout$iv", com.alipay.sdk.m.m.a.f10784h0, "$this$withTimeout$iv", com.alipay.sdk.m.m.a.f10784h0, "$this$withTimeout$iv", com.alipay.sdk.m.m.a.f10784h0, "$this$withTimeout$iv"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    @kotlin.jvm.internal.u0({"SMAP\nCIOReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CIOReader.kt\nio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1\n+ 2 Utils.kt\nio/ktor/network/util/UtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,145:1\n80#2,10:146\n1#3:156\n*S KotlinDebug\n*F\n+ 1 CIOReader.kt\nio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1\n*L\n96#1:146,10\n*E\n"})
    public static final class a extends SuspendLambda implements x00.p<io.ktor.utils.io.m0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f91090a;

        /* renamed from: b, reason: collision with root package name */
        public Object f91091b;

        /* renamed from: c, reason: collision with root package name */
        public Object f91092c;

        /* renamed from: d, reason: collision with root package name */
        public Object f91093d;

        /* renamed from: e, reason: collision with root package name */
        public Object f91094e;

        /* renamed from: f, reason: collision with root package name */
        public int f91095f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f91096g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ sx.e f91097h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ p0.e f91098i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.b f91099j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ ReadableByteChannel f91100k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ sx.g f91101l;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.network.sockets.CIOReaderKt$attachForReadingDirectImpl$1$timeout$1", f = "CIOReader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: tx.j$a$a, reason: collision with other inner class name */
        public static final class C1217a extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f91102a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ io.ktor.utils.io.b f91103b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1217a(io.ktor.utils.io.b bVar, j00.c<? super C1217a> cVar) {
                super(1, cVar);
                this.f91103b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(j00.c<?> cVar) {
                return new C1217a(this.f91103b, cVar);
            }

            @Override // x00.l
            public final Object invoke(j00.c<? super g2> cVar) {
                return ((C1217a) create(cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f91102a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                io.ktor.utils.io.q.e(this.f91103b, new SocketTimeoutException());
                return g2.f100423a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(sx.e eVar, p0.e eVar2, io.ktor.utils.io.b bVar, ReadableByteChannel readableByteChannel, sx.g gVar, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f91097h = eVar;
            this.f91098i = eVar2;
            this.f91099j = bVar;
            this.f91100k = readableByteChannel;
            this.f91101l = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = new a(this.f91097h, this.f91098i, this.f91099j, this.f91100k, this.f91101l, cVar);
            aVar.f91096g = obj;
            return aVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.utils.io.m0 m0Var, j00.c<? super g2> cVar) {
            return ((a) create(m0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0191  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x01a6  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x01b0  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0220 -> B:9:0x0223). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0163 -> B:19:0x012c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0167 -> B:19:0x012c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x01ae -> B:34:0x017e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x01b0 -> B:19:0x012c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x01da -> B:17:0x022b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x01de -> B:17:0x022b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 674
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: tx.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.network.sockets.CIOReaderKt$attachForReadingImpl$1", f = "CIOReader.kt", i = {0, 0, 1, 1, 2, 2, 2, 3, 3, 3, 4}, l = {42, 44, 42, 44, 55}, m = "invokeSuspend", n = {com.alipay.sdk.m.m.a.f10784h0, "rc", com.alipay.sdk.m.m.a.f10784h0, "rc", com.alipay.sdk.m.m.a.f10784h0, "rc", "$this$withTimeout$iv", com.alipay.sdk.m.m.a.f10784h0, "rc", "$this$withTimeout$iv", com.alipay.sdk.m.m.a.f10784h0}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0"})
    @kotlin.jvm.internal.u0({"SMAP\nCIOReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CIOReader.kt\nio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1\n+ 2 Utils.kt\nio/ktor/network/util/UtilsKt\n*L\n1#1,145:1\n80#2,10:146\n*S KotlinDebug\n*F\n+ 1 CIOReader.kt\nio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1\n*L\n38#1:146,10\n*E\n"})
    public static final class b extends SuspendLambda implements x00.p<io.ktor.utils.io.m0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f91104a;

        /* renamed from: b, reason: collision with root package name */
        public Object f91105b;

        /* renamed from: c, reason: collision with root package name */
        public Object f91106c;

        /* renamed from: d, reason: collision with root package name */
        public Object f91107d;

        /* renamed from: e, reason: collision with root package name */
        public Object f91108e;

        /* renamed from: f, reason: collision with root package name */
        public Object f91109f;

        /* renamed from: g, reason: collision with root package name */
        public Object f91110g;

        /* renamed from: h, reason: collision with root package name */
        public int f91111h;

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f91112i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ p0.e f91113j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.b f91114k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ sx.e f91115l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ByteBuffer f91116m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ pz.h<ByteBuffer> f91117n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ ReadableByteChannel f91118o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ sx.g f91119p;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.network.sockets.CIOReaderKt$attachForReadingImpl$1$timeout$1", f = "CIOReader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f91120a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ io.ktor.utils.io.b f91121b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(io.ktor.utils.io.b bVar, j00.c<? super a> cVar) {
                super(1, cVar);
                this.f91121b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(j00.c<?> cVar) {
                return new a(this.f91121b, cVar);
            }

            @Override // x00.l
            public final Object invoke(j00.c<? super g2> cVar) {
                return ((a) create(cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f91120a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                io.ktor.utils.io.q.e(this.f91121b, new SocketTimeoutException());
                return g2.f100423a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p0.e eVar, io.ktor.utils.io.b bVar, sx.e eVar2, ByteBuffer byteBuffer, pz.h<ByteBuffer> hVar, ReadableByteChannel readableByteChannel, sx.g gVar, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f91113j = eVar;
            this.f91114k = bVar;
            this.f91115l = eVar2;
            this.f91116m = byteBuffer;
            this.f91117n = hVar;
            this.f91118o = readableByteChannel;
            this.f91119p = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            b bVar = new b(this.f91113j, this.f91114k, this.f91115l, this.f91116m, this.f91117n, this.f91118o, this.f91119p, cVar);
            bVar.f91112i = obj;
            return bVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.utils.io.m0 m0Var, j00.c<? super g2> cVar) {
            return ((b) create(m0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:52:0x016e A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:50:0x0166, B:52:0x016e, B:56:0x0197, B:60:0x01c5, B:62:0x01c9, B:68:0x004e, B:70:0x0076), top: B:2:0x000e, outer: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x01c9 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:50:0x0166, B:52:0x016e, B:56:0x0197, B:60:0x01c5, B:62:0x01c9, B:68:0x004e, B:70:0x0076), top: B:2:0x000e, outer: #1 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x015c -> B:14:0x00ff). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x022d -> B:11:0x0230). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x01c7 -> B:50:0x0166). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 611
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: tx.j.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.network.sockets.CIOReaderKt", f = "CIOReader.kt", i = {0}, l = {134}, m = "readFrom", n = {"count"}, s = {"L$0"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f91122a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f91123b;

        /* renamed from: c, reason: collision with root package name */
        public int f91124c;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f91123b = obj;
            this.f91124c |= Integer.MIN_VALUE;
            return j.h(null, null, this);
        }
    }

    @m80.k
    public static final io.ktor.utils.io.l0 d(@m80.k c40.r0 r0Var, @m80.k io.ktor.utils.io.b channel, @m80.k ReadableByteChannel nioChannel, @m80.k sx.e selectable, @m80.k sx.g selector, @m80.l p0.e eVar) {
        kotlin.jvm.internal.g0.p(r0Var, "<this>");
        kotlin.jvm.internal.g0.p(channel, "channel");
        kotlin.jvm.internal.g0.p(nioChannel, "nioChannel");
        kotlin.jvm.internal.g0.p(selectable, "selectable");
        kotlin.jvm.internal.g0.p(selector, "selector");
        return io.ktor.utils.io.q.B(r0Var, h1.c().plus(new c40.q0("cio-from-nio-reader")), channel, new a(selectable, eVar, channel, nioChannel, selector, null));
    }

    public static /* synthetic */ io.ktor.utils.io.l0 e(c40.r0 r0Var, io.ktor.utils.io.b bVar, ReadableByteChannel readableByteChannel, sx.e eVar, sx.g gVar, p0.e eVar2, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            eVar2 = null;
        }
        return d(r0Var, bVar, readableByteChannel, eVar, gVar, eVar2);
    }

    @m80.k
    public static final io.ktor.utils.io.l0 f(@m80.k c40.r0 r0Var, @m80.k io.ktor.utils.io.b channel, @m80.k ReadableByteChannel nioChannel, @m80.k sx.e selectable, @m80.k sx.g selector, @m80.k pz.h<ByteBuffer> pool, @m80.l p0.e eVar) {
        kotlin.jvm.internal.g0.p(r0Var, "<this>");
        kotlin.jvm.internal.g0.p(channel, "channel");
        kotlin.jvm.internal.g0.p(nioChannel, "nioChannel");
        kotlin.jvm.internal.g0.p(selectable, "selectable");
        kotlin.jvm.internal.g0.p(selector, "selector");
        kotlin.jvm.internal.g0.p(pool, "pool");
        return io.ktor.utils.io.q.B(r0Var, h1.c().plus(new c40.q0("cio-from-nio-reader")), channel, new b(eVar, channel, selectable, pool.U6(), pool, nioChannel, selector, null));
    }

    public static /* synthetic */ io.ktor.utils.io.l0 g(c40.r0 r0Var, io.ktor.utils.io.b bVar, ReadableByteChannel readableByteChannel, sx.e eVar, sx.g gVar, pz.h hVar, p0.e eVar2, int i11, Object obj) {
        if ((i11 & 32) != 0) {
            eVar2 = null;
        }
        return f(r0Var, bVar, readableByteChannel, eVar, gVar, hVar, eVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(io.ktor.utils.io.m r7, final java.nio.channels.ReadableByteChannel r8, j00.c<? super java.lang.Integer> r9) {
        /*
            boolean r0 = r9 instanceof tx.j.c
            if (r0 == 0) goto L14
            r0 = r9
            tx.j$c r0 = (tx.j.c) r0
            int r1 = r0.f91124c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f91124c = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            tx.j$c r0 = new tx.j$c
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r4.f91123b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.f91124c
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r7 = r4.f91122a
            kotlin.jvm.internal.Ref$IntRef r7 = (kotlin.jvm.internal.Ref.IntRef) r7
            kotlin.e.n(r9)
            goto L54
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.e.n(r9)
            kotlin.jvm.internal.Ref$IntRef r9 = new kotlin.jvm.internal.Ref$IntRef
            r9.<init>()
            tx.i r3 = new tx.i
            r3.<init>()
            r4.f91122a = r9
            r4.f91124c = r2
            r2 = 0
            r5 = 1
            r6 = 0
            r1 = r7
            java.lang.Object r7 = io.ktor.utils.io.r.b(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L53
            return r0
        L53:
            r7 = r9
        L54:
            int r7 = r7.element
            java.lang.Integer r7 = l00.a.f(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tx.j.h(io.ktor.utils.io.m, java.nio.channels.ReadableByteChannel, j00.c):java.lang.Object");
    }

    public static final g2 i(Ref.IntRef intRef, ReadableByteChannel readableByteChannel, ByteBuffer buffer) {
        kotlin.jvm.internal.g0.p(buffer, "buffer");
        intRef.element = readableByteChannel.read(buffer);
        return g2.f100423a;
    }

    public static final Object j(sx.e eVar, sx.g gVar, j00.c<? super g2> cVar) {
        SelectInterest selectInterest = SelectInterest.READ;
        eVar.T0(selectInterest, true);
        Object N4 = gVar.N4(eVar, selectInterest, cVar);
        return N4 == kotlin.coroutines.intrinsics.b.l() ? N4 : g2.f100423a;
    }
}
