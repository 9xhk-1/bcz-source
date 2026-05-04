package tx;

import c40.h1;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import tx.p0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class l {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.network.sockets.CIOWriterKt$attachForWritingDirectImpl$1", f = "CIOWriter.kt", i = {0, 1, 1, 1, 1, 1, 2}, l = {33, 79, 50}, m = "invokeSuspend", n = {com.alipay.sdk.m.m.a.f10784h0, com.alipay.sdk.m.m.a.f10784h0, "rc", "$this$read_u24default$iv", "consumer$iv", "min$iv", com.alipay.sdk.m.m.a.f10784h0}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0"})
    @kotlin.jvm.internal.u0({"SMAP\nCIOWriter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CIOWriter.kt\nio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1\n+ 2 ByteReadChannelOperations.jvm.kt\nio/ktor/utils/io/ByteReadChannelOperations_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Utils.kt\nio/ktor/network/util/UtilsKt\n*L\n1#1,69:1\n174#2,3:70\n177#2,12:74\n1#3:73\n80#4,10:86\n*S KotlinDebug\n*F\n+ 1 CIOWriter.kt\nio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1\n*L\n38#1:70,3\n38#1:74,12\n38#1:73\n40#1:86,10\n*E\n"})
    public static final class a extends SuspendLambda implements x00.p<io.ktor.utils.io.j0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f91136a;

        /* renamed from: b, reason: collision with root package name */
        public Object f91137b;

        /* renamed from: c, reason: collision with root package name */
        public Object f91138c;

        /* renamed from: d, reason: collision with root package name */
        public int f91139d;

        /* renamed from: e, reason: collision with root package name */
        public int f91140e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f91141f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ sx.e f91142g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ p0.e f91143h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.b f91144i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ sx.g f91145j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ WritableByteChannel f91146k;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.network.sockets.CIOWriterKt$attachForWritingDirectImpl$1$timeout$1", f = "CIOWriter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: tx.l$a$a, reason: collision with other inner class name */
        public static final class C1218a extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f91147a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ io.ktor.utils.io.b f91148b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1218a(io.ktor.utils.io.b bVar, j00.c<? super C1218a> cVar) {
                super(1, cVar);
                this.f91148b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(j00.c<?> cVar) {
                return new C1218a(this.f91148b, cVar);
            }

            @Override // x00.l
            public final Object invoke(j00.c<? super g2> cVar) {
                return ((C1218a) create(cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f91147a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                io.ktor.utils.io.q.e(this.f91148b, new SocketTimeoutException());
                return g2.f100423a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(sx.e eVar, p0.e eVar2, io.ktor.utils.io.b bVar, sx.g gVar, WritableByteChannel writableByteChannel, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f91142g = eVar;
            this.f91143h = eVar2;
            this.f91144i = bVar;
            this.f91145j = gVar;
            this.f91146k = writableByteChannel;
        }

        public static final g2 k(io.ktor.network.util.b bVar, Ref.IntRef intRef, WritableByteChannel writableByteChannel, ByteBuffer byteBuffer) {
            while (byteBuffer.hasRemaining()) {
                if (bVar == null) {
                    do {
                        intRef.element = writableByteChannel.write(byteBuffer);
                        if (byteBuffer.hasRemaining()) {
                        }
                    } while (intRef.element > 0);
                } else {
                    bVar.f();
                    do {
                        try {
                            intRef.element = writableByteChannel.write(byteBuffer);
                            if (!byteBuffer.hasRemaining()) {
                                break;
                            }
                        } catch (Throwable th2) {
                            bVar.g();
                            throw th2;
                        }
                    } while (intRef.element > 0);
                    g2 g2Var = g2.f100423a;
                    bVar.g();
                }
            }
            return g2.f100423a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = new a(this.f91142g, this.f91143h, this.f91144i, this.f91145j, this.f91146k, cVar);
            aVar.f91141f = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0131, code lost:
        
            if (r2.N4(r9, r8, r16) == r0) goto L56;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0084 A[Catch: all -> 0x001d, TryCatch #1 {all -> 0x001d, blocks: (B:8:0x0019, B:11:0x007c, B:13:0x0084, B:15:0x008c, B:23:0x00a0, B:25:0x00b4, B:27:0x00ba, B:28:0x0114, B:30:0x0118, B:32:0x00c2, B:36:0x00d6, B:40:0x00df, B:41:0x0106, B:42:0x0107, B:44:0x010d, B:47:0x0136, B:63:0x003a, B:66:0x0053, B:68:0x0057, B:70:0x0063), top: B:2:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0118 A[Catch: all -> 0x001d, TryCatch #1 {all -> 0x001d, blocks: (B:8:0x0019, B:11:0x007c, B:13:0x0084, B:15:0x008c, B:23:0x00a0, B:25:0x00b4, B:27:0x00ba, B:28:0x0114, B:30:0x0118, B:32:0x00c2, B:36:0x00d6, B:40:0x00df, B:41:0x0106, B:42:0x0107, B:44:0x010d, B:47:0x0136, B:63:0x003a, B:66:0x0053, B:68:0x0057, B:70:0x0063), top: B:2:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x010d A[Catch: all -> 0x001d, TryCatch #1 {all -> 0x001d, blocks: (B:8:0x0019, B:11:0x007c, B:13:0x0084, B:15:0x008c, B:23:0x00a0, B:25:0x00b4, B:27:0x00ba, B:28:0x0114, B:30:0x0118, B:32:0x00c2, B:36:0x00d6, B:40:0x00df, B:41:0x0106, B:42:0x0107, B:44:0x010d, B:47:0x0136, B:63:0x003a, B:66:0x0053, B:68:0x0057, B:70:0x0063), top: B:2:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0136 A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #1 {all -> 0x001d, blocks: (B:8:0x0019, B:11:0x007c, B:13:0x0084, B:15:0x008c, B:23:0x00a0, B:25:0x00b4, B:27:0x00ba, B:28:0x0114, B:30:0x0118, B:32:0x00c2, B:36:0x00d6, B:40:0x00df, B:41:0x0106, B:42:0x0107, B:44:0x010d, B:47:0x0136, B:63:0x003a, B:66:0x0053, B:68:0x0057, B:70:0x0063), top: B:2:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0146 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0116 -> B:10:0x007c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0131 -> B:10:0x007c). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 393
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: tx.l.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // x00.p
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.utils.io.j0 j0Var, j00.c<? super g2> cVar) {
            return ((a) create(j0Var, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    @m80.k
    public static final io.ktor.utils.io.i0 a(@m80.k c40.r0 r0Var, @m80.k io.ktor.utils.io.b channel, @m80.k WritableByteChannel nioChannel, @m80.k sx.e selectable, @m80.k sx.g selector, @m80.l p0.e eVar) {
        kotlin.jvm.internal.g0.p(r0Var, "<this>");
        kotlin.jvm.internal.g0.p(channel, "channel");
        kotlin.jvm.internal.g0.p(nioChannel, "nioChannel");
        kotlin.jvm.internal.g0.p(selectable, "selectable");
        kotlin.jvm.internal.g0.p(selector, "selector");
        return io.ktor.utils.io.j.Q(r0Var, h1.c().plus(new c40.q0("cio-to-nio-writer")), channel, new a(selectable, eVar, channel, selector, nioChannel, null));
    }

    public static /* synthetic */ io.ktor.utils.io.i0 b(c40.r0 r0Var, io.ktor.utils.io.b bVar, WritableByteChannel writableByteChannel, sx.e eVar, sx.g gVar, p0.e eVar2, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            eVar2 = null;
        }
        return a(r0Var, bVar, writableByteChannel, eVar, gVar, eVar2);
    }
}
