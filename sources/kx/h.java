package kx;

import c40.b2;
import c40.r0;
import io.ktor.utils.io.i0;
import io.ktor.utils.io.j0;
import io.ktor.utils.io.l0;
import io.ktor.utils.io.m0;
import ix.g;
import kotlin.DeprecationLevel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nChunkedTransferEncoding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChunkedTransferEncoding.kt\nio/ktor/http/cio/ChunkedTransferEncodingKt\n+ 2 ByteReadChannelOperations.kt\nio/ktor/utils/io/ByteReadChannelOperationsKt\n+ 3 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,160:1\n435#2,6:161\n441#2,2:171\n445#2:179\n99#3:167\n100#3,2:169\n102#3,6:173\n1#4:168\n*S KotlinDebug\n*F\n+ 1 ChunkedTransferEncoding.kt\nio/ktor/http/cio/ChunkedTransferEncodingKt\n*L\n120#1:161,6\n120#1:171,2\n120#1:179\n120#1:167\n120#1:169,2\n120#1:173,6\n120#1:168\n*E\n"})
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final int f68989a = 128;

    /* renamed from: b, reason: collision with root package name */
    public static final int f68990b = 2048;

    /* renamed from: d, reason: collision with root package name */
    public static final short f68992d = 3338;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final pz.h<StringBuilder> f68991c = new a();

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final byte[] f68993e = jz.s.m("\r\n", null, 1, null);

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final byte[] f68994f = jz.s.m("0\r\n\r\n", null, 1, null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nChunkedTransferEncoding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChunkedTransferEncoding.kt\nio/ktor/http/cio/ChunkedTransferEncodingKt$ChunkSizeBufferPool$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,160:1\n1#2:161\n*E\n"})
    public static final class a extends pz.d<StringBuilder> {
        public a() {
            super(2048);
        }

        @Override // pz.d
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public StringBuilder a(StringBuilder instance) {
            g0.p(instance, "instance");
            u30.b0.g0(instance);
            return instance;
        }

        @Override // pz.d
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public StringBuilder f() {
            return new StringBuilder(128);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.http.cio.ChunkedTransferEncodingKt$decodeChunked$1", f = "ChunkedTransferEncoding.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements x00.p<m0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f68995a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f68996b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.g f68997c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(io.ktor.utils.io.g gVar, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f68997c = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            b bVar = new b(this.f68997c, cVar);
            bVar.f68996b = obj;
            return bVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(m0 m0Var, j00.c<? super g2> cVar) {
            return ((b) create(m0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f68995a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                m0 m0Var = (m0) this.f68996b;
                io.ktor.utils.io.g gVar = this.f68997c;
                io.ktor.utils.io.m a11 = m0Var.a();
                this.f68995a = 1;
                if (h.d(gVar, a11, this) == l11) {
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
    @l00.d(c = "io.ktor.http.cio.ChunkedTransferEncodingKt", f = "ChunkedTransferEncoding.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3}, l = {64, 74, 75, 80, 94, 94}, m = "decodeChunked", n = {"input", "out", "chunkSizeBuffer", "totalBytesCopied", "input", "out", "chunkSizeBuffer", "totalBytesCopied", "chunkSize", "input", "out", "chunkSizeBuffer", "totalBytesCopied", "chunkSize", "input", "out", "chunkSizeBuffer", "totalBytesCopied", "chunkSize"}, s = {"L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "J$0", "J$1", "L$0", "L$1", "L$2", "J$0", "J$1", "L$0", "L$1", "L$2", "J$0", "J$1"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f68998a;

        /* renamed from: b, reason: collision with root package name */
        public Object f68999b;

        /* renamed from: c, reason: collision with root package name */
        public Object f69000c;

        /* renamed from: d, reason: collision with root package name */
        public long f69001d;

        /* renamed from: e, reason: collision with root package name */
        public long f69002e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f69003f;

        /* renamed from: g, reason: collision with root package name */
        public int f69004g;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f69003f = obj;
            this.f69004g |= Integer.MIN_VALUE;
            return h.d(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.http.cio.ChunkedTransferEncodingKt$encodeChunked$1", f = "ChunkedTransferEncoding.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements x00.p<j0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f69005a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f69006b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.m f69007c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(io.ktor.utils.io.m mVar, j00.c<? super d> cVar) {
            super(2, cVar);
            this.f69007c = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            d dVar = new d(this.f69007c, cVar);
            dVar.f69006b = obj;
            return dVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(j0 j0Var, j00.c<? super g2> cVar) {
            return ((d) create(j0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f69005a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                j0 j0Var = (j0) this.f69006b;
                io.ktor.utils.io.m mVar = this.f69007c;
                io.ktor.utils.io.g a11 = j0Var.a();
                this.f69005a = 1;
                if (h.f(mVar, a11, this) == l11) {
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
    @l00.d(c = "io.ktor.http.cio.ChunkedTransferEncodingKt", f = "ChunkedTransferEncoding.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2}, l = {162, 122, 127, 133, 133}, m = "encodeChunked", n = {"output", "input", "$this$read$iv", "output", "input", "result$iv", "buffer$iv$iv", "head$iv$iv", "output", "input"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1"})
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f69008a;

        /* renamed from: b, reason: collision with root package name */
        public Object f69009b;

        /* renamed from: c, reason: collision with root package name */
        public Object f69010c;

        /* renamed from: d, reason: collision with root package name */
        public Object f69011d;

        /* renamed from: e, reason: collision with root package name */
        public Object f69012e;

        /* renamed from: f, reason: collision with root package name */
        public Object f69013f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f69014g;

        /* renamed from: h, reason: collision with root package name */
        public int f69015h;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f69014g = obj;
            this.f69015h |= Integer.MIN_VALUE;
            return h.f(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.http.cio.ChunkedTransferEncodingKt", f = "ChunkedTransferEncoding.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 3, 3, 4}, l = {151, 152, 154, 155, 156}, m = "writeChunk", n = {"$this$writeChunk", "memory", "startIndex", "endIndex", g.b.f62794h, "$this$writeChunk", "memory", "startIndex", "endIndex", g.b.f62794h, "$this$writeChunk", g.b.f62794h, "$this$writeChunk", g.b.f62794h, g.b.f62794h}, s = {"L$0", "L$1", "I$0", "I$1", "I$2", "L$0", "L$1", "I$0", "I$1", "I$2", "L$0", "I$0", "L$0", "I$0", "I$0"})
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f69016a;

        /* renamed from: b, reason: collision with root package name */
        public Object f69017b;

        /* renamed from: c, reason: collision with root package name */
        public int f69018c;

        /* renamed from: d, reason: collision with root package name */
        public int f69019d;

        /* renamed from: e, reason: collision with root package name */
        public int f69020e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f69021f;

        /* renamed from: g, reason: collision with root package name */
        public int f69022g;

        public f(j00.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f69021f = obj;
            this.f69022g |= Integer.MIN_VALUE;
            return h.h(null, null, 0, 0, this);
        }
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Specify content length if known or pass -1L", replaceWith = @w0(expression = "decodeChunked(input, -1L)", imports = {}))
    @m80.k
    public static final l0 b(@m80.k r0 r0Var, @m80.k io.ktor.utils.io.g input) {
        g0.p(r0Var, "<this>");
        g0.p(input, "input");
        return c(r0Var, input, -1L);
    }

    @m80.k
    public static final l0 c(@m80.k r0 r0Var, @m80.k io.ktor.utils.io.g input, long j11) {
        g0.p(r0Var, "<this>");
        g0.p(input, "input");
        return io.ktor.utils.io.q.E(r0Var, r0Var.getCoroutineContext(), false, new b(input, null), 2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0173, code lost:
    
        if (r1.j(r3) == r2) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x011e, code lost:
    
        if (r13.g(r1) != r2) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0157 A[Catch: all -> 0x0185, TRY_LEAVE, TryCatch #0 {all -> 0x0185, blocks: (B:22:0x014f, B:24:0x0157, B:32:0x00af, B:75:0x017d, B:76:0x0184, B:77:0x018a, B:78:0x01a5), top: B:21:0x014f }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d4 A[Catch: all -> 0x005d, TryCatch #3 {all -> 0x005d, blocks: (B:18:0x0050, B:35:0x00cc, B:37:0x00d4, B:39:0x00da, B:41:0x00e0, B:46:0x00f3, B:50:0x010d, B:70:0x00eb, B:71:0x01a9, B:72:0x01b0, B:73:0x01b1, B:74:0x01b8, B:82:0x0070, B:84:0x0085, B:86:0x0099), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b1 A[Catch: all -> 0x005d, TryCatch #3 {all -> 0x005d, blocks: (B:18:0x0050, B:35:0x00cc, B:37:0x00d4, B:39:0x00da, B:41:0x00e0, B:46:0x00f3, B:50:0x010d, B:70:0x00eb, B:71:0x01a9, B:72:0x01b0, B:73:0x01b1, B:74:0x01b8, B:82:0x0070, B:84:0x0085, B:86:0x0099), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018a A[Catch: all -> 0x0185, TryCatch #0 {all -> 0x0185, blocks: (B:22:0x014f, B:24:0x0157, B:32:0x00af, B:75:0x017d, B:76:0x0184, B:77:0x018a, B:78:0x01a5), top: B:21:0x014f }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Appendable, java.lang.Object, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0148 -> B:20:0x0058). Please report as a decompilation issue!!! */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(@m80.k io.ktor.utils.io.g r18, @m80.k io.ktor.utils.io.m r19, @m80.k j00.c<? super yz.g2> r20) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kx.h.d(io.ktor.utils.io.g, io.ktor.utils.io.m, j00.c):java.lang.Object");
    }

    @m80.k
    public static final i0 e(@m80.k io.ktor.utils.io.m output, @m80.k kotlin.coroutines.d coroutineContext) {
        g0.p(output, "output");
        g0.p(coroutineContext, "coroutineContext");
        return io.ktor.utils.io.j.R(b2.f7824a, coroutineContext, false, new d(output, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ac, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ad, code lost:
    
        r3 = r1;
        r4 = r13;
        r1 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x01a6, code lost:
    
        if (r4.g(r1) == r2) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b0, code lost:
    
        if (r1.e().J() == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b2, code lost:
    
        r3.f69008a = r13;
        r3.f69009b = r1;
        r3.f69010c = r1;
        r3.f69011d = null;
        r3.f69012e = null;
        r3.f69013f = null;
        r3.f69015h = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c4, code lost:
    
        if (io.ktor.utils.io.g.b.a(r1, r4, r3, 1, null) != r2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00c8, code lost:
    
        r11 = r1;
        r12 = r13;
        r1 = r3;
        r3 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00d8, code lost:
    
        r11 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0176, code lost:
    
        g(r1);
        r14 = kx.h.f68994f;
        r3.f69008a = r13;
        r3.f69009b = r1;
        r3.f69010c = null;
        r3.f69011d = null;
        r3.f69012e = null;
        r3.f69013f = null;
        r3.f69015h = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0189, code lost:
    
        r17 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0196, code lost:
    
        if (io.ktor.utils.io.q.s(r13, r14, 0, 0, r17, 6, null) != r2) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0199, code lost:
    
        r4 = r13;
        r1 = r17;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00df A[Catch: all -> 0x0113, TryCatch #3 {all -> 0x0113, blocks: (B:70:0x00d9, B:72:0x00df, B:74:0x00f4, B:76:0x010b, B:77:0x0117, B:80:0x016b, B:81:0x0172), top: B:69:0x00d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0176 A[EDGE_INSN: B:92:0x0176->B:93:0x0176 BREAK  A[LOOP:0: B:56:0x009c->B:88:?], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x010b -> B:42:0x0138). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x012d -> B:41:0x0134). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x0173 -> B:54:0x009c). Please report as a decompilation issue!!! */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(@m80.k io.ktor.utils.io.m r20, @m80.k io.ktor.utils.io.g r21, @m80.k j00.c<? super yz.g2> r22) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kx.h.f(io.ktor.utils.io.m, io.ktor.utils.io.g, j00.c):java.lang.Object");
    }

    public static final void g(io.ktor.utils.io.g gVar) {
        Throwable b11 = gVar instanceof io.ktor.utils.io.b ? ((io.ktor.utils.io.b) gVar).b() : null;
        if (b11 != null) {
            throw b11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e2, code lost:
    
        if (r12.g(r5) != r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c1, code lost:
    
        if (io.ktor.utils.io.q.r(r12, r15, r13, r14, r5) != r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
    
        if (lx.i.r(r11, r15, r5) == r0) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(io.ktor.utils.io.m r11, byte[] r12, int r13, int r14, j00.c<? super java.lang.Integer> r15) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kx.h.h(io.ktor.utils.io.m, byte[], int, int, j00.c):java.lang.Object");
    }
}
