package xy;

import java.nio.ByteBuffer;
import java.util.zip.Checksum;
import java.util.zip.Deflater;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nDeflater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deflater.kt\nio/ktor/util/DeflaterKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ByteOrderJvm.kt\nio/ktor/utils/io/bits/ByteOrderJVMKt\n*L\n1#1,125:1\n1#2:126\n9#3:127\n15#3:128\n15#3:129\n*S KotlinDebug\n*F\n+ 1 Deflater.kt\nio/ktor/util/DeflaterKt\n*L\n37#1:127\n43#1:128\n44#1:129\n*E\n"})
/* loaded from: classes8.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final short f98515a = -29921;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final byte[] f98516b = new byte[7];

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.util.DeflaterKt", f = "Deflater.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4}, l = {72, 77, 82, 88, 91}, m = "deflateTo", n = {"$this$deflateTo", "destination", "pool", "crc", "deflater", "input", "compressed", "gzip", "$this$deflateTo", "destination", "pool", "crc", "deflater", "input", "compressed", "gzip", "$this$deflateTo", "destination", "pool", "crc", "deflater", "input", "compressed", "gzip", "destination", "pool", "crc", "deflater", "input", "compressed", "gzip", "pool", "deflater", "input", "compressed"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0", "L$0", "L$1", "L$2", "L$3"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f98517a;

        /* renamed from: b, reason: collision with root package name */
        public Object f98518b;

        /* renamed from: c, reason: collision with root package name */
        public Object f98519c;

        /* renamed from: d, reason: collision with root package name */
        public Object f98520d;

        /* renamed from: e, reason: collision with root package name */
        public Object f98521e;

        /* renamed from: f, reason: collision with root package name */
        public Object f98522f;

        /* renamed from: g, reason: collision with root package name */
        public Object f98523g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f98524h;

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f98525i;

        /* renamed from: j, reason: collision with root package name */
        public int f98526j;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f98525i = obj;
            this.f98526j |= Integer.MIN_VALUE;
            return i0.g(null, null, false, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.util.DeflaterKt", f = "Deflater.kt", i = {0, 0, 0, 0}, l = {52}, m = "deflateWhile", n = {"$this$deflateWhile", "deflater", "buffer", "predicate"}, s = {"L$0", "L$1", "L$2", "L$3"})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f98527a;

        /* renamed from: b, reason: collision with root package name */
        public Object f98528b;

        /* renamed from: c, reason: collision with root package name */
        public Object f98529c;

        /* renamed from: d, reason: collision with root package name */
        public Object f98530d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f98531e;

        /* renamed from: f, reason: collision with root package name */
        public int f98532f;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f98531e = obj;
            this.f98532f |= Integer.MIN_VALUE;
            return i0.l(null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.util.DeflaterKt$deflated$1", f = "Deflater.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements x00.p<io.ktor.utils.io.m0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f98533a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f98534b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.g f98535c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f98536d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ pz.h<ByteBuffer> f98537e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(io.ktor.utils.io.g gVar, boolean z11, pz.h<ByteBuffer> hVar, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f98535c = gVar;
            this.f98536d = z11;
            this.f98537e = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            c cVar2 = new c(this.f98535c, this.f98536d, this.f98537e, cVar);
            cVar2.f98534b = obj;
            return cVar2;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.utils.io.m0 m0Var, j00.c<? super g2> cVar) {
            return ((c) create(m0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f98533a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                io.ktor.utils.io.m0 m0Var = (io.ktor.utils.io.m0) this.f98534b;
                io.ktor.utils.io.g gVar = this.f98535c;
                io.ktor.utils.io.m a11 = m0Var.a();
                boolean z11 = this.f98536d;
                pz.h<ByteBuffer> hVar = this.f98537e;
                this.f98533a = 1;
                if (i0.g(gVar, a11, z11, hVar, this) == l11) {
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
    @l00.d(c = "io.ktor.util.DeflaterKt$deflated$2", f = "Deflater.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements x00.p<io.ktor.utils.io.j0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f98538a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f98539b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.m f98540c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f98541d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ pz.h<ByteBuffer> f98542e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(io.ktor.utils.io.m mVar, boolean z11, pz.h<ByteBuffer> hVar, j00.c<? super d> cVar) {
            super(2, cVar);
            this.f98540c = mVar;
            this.f98541d = z11;
            this.f98542e = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            d dVar = new d(this.f98540c, this.f98541d, this.f98542e, cVar);
            dVar.f98539b = obj;
            return dVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.utils.io.j0 j0Var, j00.c<? super g2> cVar) {
            return ((d) create(j0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f98538a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                io.ktor.utils.io.g a11 = ((io.ktor.utils.io.j0) this.f98539b).a();
                io.ktor.utils.io.m mVar = this.f98540c;
                boolean z11 = this.f98541d;
                pz.h<ByteBuffer> hVar = this.f98542e;
                this.f98538a = 1;
                if (i0.g(a11, mVar, z11, hVar, this) == l11) {
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
    @l00.d(c = "io.ktor.util.DeflaterKt", f = "Deflater.kt", i = {0, 1}, l = {37, 38, 39}, m = "putGzipHeader", n = {"$this$putGzipHeader", "$this$putGzipHeader"}, s = {"L$0", "L$0"})
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f98543a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f98544b;

        /* renamed from: c, reason: collision with root package name */
        public int f98545c;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f98544b = obj;
            this.f98545c |= Integer.MIN_VALUE;
            return i0.r(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.util.DeflaterKt", f = "Deflater.kt", i = {0, 0}, l = {43, 44}, m = "putGzipTrailer", n = {"$this$putGzipTrailer", "deflater"}, s = {"L$0", "L$1"})
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f98546a;

        /* renamed from: b, reason: collision with root package name */
        public Object f98547b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f98548c;

        /* renamed from: d, reason: collision with root package name */
        public int f98549d;

        public f(j00.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f98548c = obj;
            this.f98549d |= Integer.MIN_VALUE;
            return i0.s(null, null, null, this);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(8:(1:(1:(1:(1:(6:14|15|16|17|18|19)(2:26|27))(7:28|29|30|31|(3:33|(2:36|17)|35)|18|19))(1:41))(12:70|71|72|51|52|(3:54|(0)|35)|56|44|45|46|(2:48|(9:50|51|52|(0)|56|44|45|46|(2:61|(2:63|(4:65|(0)|18|19))(1:66))(0)))(0)|35))(1:73)|42|43|44|45|46|(0)(0)|35)(7:74|(6:76|77|78|79|80|81)(1:90)|83|45|46|(0)(0)|35)|24|25))|92|6|7|(0)(0)|24|25|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01b5, code lost:
    
        r2 = r3;
        r3 = r5;
        r5 = r11;
        r11 = r12;
        r12 = r13;
        r13 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0134, code lost:
    
        if (r(r0, r3) == r4) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00a7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01e9 A[Catch: all -> 0x00a7, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00a7, blocks: (B:33:0x01e9, B:42:0x00a3, B:71:0x00ca), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0150 A[Catch: all -> 0x01b7, TRY_LEAVE, TryCatch #1 {all -> 0x01b7, blocks: (B:46:0x014a, B:48:0x0150, B:61:0x01bb, B:63:0x01c1, B:66:0x0210), top: B:45:0x014a }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0180 A[Catch: all -> 0x01a8, TRY_LEAVE, TryCatch #4 {all -> 0x01a8, blocks: (B:52:0x0178, B:54:0x0180), top: B:51:0x0178 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01bb A[Catch: all -> 0x01b7, TRY_ENTER, TryCatch #1 {all -> 0x01b7, blocks: (B:46:0x014a, B:48:0x0150, B:61:0x01bb, B:63:0x01c1, B:66:0x0210), top: B:45:0x014a }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object, java.util.zip.Deflater] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.util.zip.Deflater] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, java.util.zip.Deflater] */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(io.ktor.utils.io.g r17, io.ktor.utils.io.m r18, boolean r19, pz.h<java.nio.ByteBuffer> r20, j00.c<? super yz.g2> r21) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xy.i0.g(io.ktor.utils.io.g, io.ktor.utils.io.m, boolean, pz.h, j00.c):java.lang.Object");
    }

    public static final void h(Deflater deflater, ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            byteBuffer.position(byteBuffer.position() + deflater.deflate(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()));
        }
    }

    public static /* synthetic */ Object i(io.ktor.utils.io.g gVar, io.ktor.utils.io.m mVar, boolean z11, pz.h hVar, j00.c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        if ((i11 & 4) != 0) {
            hVar = yy.a.a();
        }
        return g(gVar, mVar, z11, hVar, cVar);
    }

    public static final boolean j(Deflater deflater) {
        return !deflater.needsInput();
    }

    public static final boolean k(Deflater deflater) {
        return !deflater.finished();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(io.ktor.utils.io.m r5, java.util.zip.Deflater r6, java.nio.ByteBuffer r7, x00.a<java.lang.Boolean> r8, j00.c<? super yz.g2> r9) {
        /*
            boolean r0 = r9 instanceof xy.i0.b
            if (r0 == 0) goto L13
            r0 = r9
            xy.i0$b r0 = (xy.i0.b) r0
            int r1 = r0.f98532f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f98532f = r1
            goto L18
        L13:
            xy.i0$b r0 = new xy.i0$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f98531e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f98532f
            r3 = 1
            if (r2 == 0) goto L47
            if (r2 != r3) goto L3f
            java.lang.Object r5 = r0.f98530d
            x00.a r5 = (x00.a) r5
            java.lang.Object r6 = r0.f98529c
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            java.lang.Object r7 = r0.f98528b
            java.util.zip.Deflater r7 = (java.util.zip.Deflater) r7
            java.lang.Object r8 = r0.f98527a
            io.ktor.utils.io.m r8 = (io.ktor.utils.io.m) r8
            kotlin.e.n(r9)
            r4 = r8
            r8 = r5
            r5 = r4
            r4 = r7
            r7 = r6
            r6 = r4
            goto L4a
        L3f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L47:
            kotlin.e.n(r9)
        L4a:
            java.lang.Object r9 = r8.invoke()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L70
            r7.clear()
            h(r6, r7)
            r7.flip()
            r0.f98527a = r5
            r0.f98528b = r6
            r0.f98529c = r7
            r0.f98530d = r8
            r0.f98532f = r3
            java.lang.Object r9 = io.ktor.utils.io.r.g(r5, r7, r0)
            if (r9 != r1) goto L4a
            return r1
        L70:
            yz.g2 r5 = yz.g2.f100423a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xy.i0.l(io.ktor.utils.io.m, java.util.zip.Deflater, java.nio.ByteBuffer, x00.a, j00.c):java.lang.Object");
    }

    @m80.k
    public static final io.ktor.utils.io.g m(@m80.k io.ktor.utils.io.g gVar, boolean z11, @m80.k pz.h<ByteBuffer> pool, @m80.k kotlin.coroutines.d coroutineContext) {
        kotlin.jvm.internal.g0.p(gVar, "<this>");
        kotlin.jvm.internal.g0.p(pool, "pool");
        kotlin.jvm.internal.g0.p(coroutineContext, "coroutineContext");
        return io.ktor.utils.io.q.C(c40.b2.f7824a, coroutineContext, true, new c(gVar, z11, pool, null)).b();
    }

    @m80.k
    public static final io.ktor.utils.io.m n(@m80.k io.ktor.utils.io.m mVar, boolean z11, @m80.k pz.h<ByteBuffer> pool, @m80.k kotlin.coroutines.d coroutineContext) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(pool, "pool");
        kotlin.jvm.internal.g0.p(coroutineContext, "coroutineContext");
        return io.ktor.utils.io.j.R(c40.b2.f7824a, coroutineContext, true, new d(mVar, z11, pool, null)).b();
    }

    public static /* synthetic */ io.ktor.utils.io.g o(io.ktor.utils.io.g gVar, boolean z11, pz.h hVar, kotlin.coroutines.d dVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            hVar = yy.a.a();
        }
        if ((i11 & 4) != 0) {
            dVar = c40.h1.g();
        }
        return m(gVar, z11, hVar, dVar);
    }

    public static /* synthetic */ io.ktor.utils.io.m p(io.ktor.utils.io.m mVar, boolean z11, pz.h hVar, kotlin.coroutines.d dVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            hVar = yy.a.a();
        }
        if ((i11 & 4) != 0) {
            dVar = c40.h1.g();
        }
        return n(mVar, z11, hVar, dVar);
    }

    @m80.k
    public static final byte[] q() {
        return f98516b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
    
        if (io.ktor.utils.io.q.s(r1, r2, 0, 0, r5, 6, null) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (io.ktor.utils.io.q.p(r8, (byte) 8, r5) != r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (io.ktor.utils.io.q.x(r8, r9, r5) == r0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(io.ktor.utils.io.m r8, j00.c<? super yz.g2> r9) {
        /*
            boolean r0 = r9 instanceof xy.i0.e
            if (r0 == 0) goto L14
            r0 = r9
            xy.i0$e r0 = (xy.i0.e) r0
            int r1 = r0.f98545c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f98545c = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            xy.i0$e r0 = new xy.i0$e
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r5.f98544b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r5.f98545c
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L4b
            if (r1 == r4) goto L43
            if (r1 == r3) goto L39
            if (r1 != r2) goto L31
            kotlin.e.n(r9)
            goto L7f
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            java.lang.Object r8 = r5.f98543a
            io.ktor.utils.io.m r8 = (io.ktor.utils.io.m) r8
            kotlin.e.n(r9)
        L40:
            r1 = r8
            r8 = r2
            goto L6d
        L43:
            java.lang.Object r8 = r5.f98543a
            io.ktor.utils.io.m r8 = (io.ktor.utils.io.m) r8
            kotlin.e.n(r9)
            goto L60
        L4b:
            kotlin.e.n(r9)
            r9 = -29921(0xffffffffffff8b1f, float:NaN)
            short r9 = (short) r9
            short r9 = java.lang.Short.reverseBytes(r9)
            r5.f98543a = r8
            r5.f98545c = r4
            java.lang.Object r9 = io.ktor.utils.io.q.x(r8, r9, r5)
            if (r9 != r0) goto L60
            goto L7e
        L60:
            r5.f98543a = r8
            r5.f98545c = r3
            r9 = 8
            java.lang.Object r9 = io.ktor.utils.io.q.p(r8, r9, r5)
            if (r9 != r0) goto L40
            goto L7e
        L6d:
            byte[] r2 = xy.i0.f98516b
            r9 = 0
            r5.f98543a = r9
            r5.f98545c = r8
            r3 = 0
            r4 = 0
            r6 = 6
            r7 = 0
            java.lang.Object r8 = io.ktor.utils.io.q.s(r1, r2, r3, r4, r5, r6, r7)
            if (r8 != r0) goto L7f
        L7e:
            return r0
        L7f:
            yz.g2 r8 = yz.g2.f100423a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: xy.i0.r(io.ktor.utils.io.m, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        if (io.ktor.utils.io.q.t(r7, r8, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        if (io.ktor.utils.io.q.t(r7, r8, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(io.ktor.utils.io.m r7, java.util.zip.Checksum r8, java.util.zip.Deflater r9, j00.c<? super yz.g2> r10) {
        /*
            boolean r0 = r10 instanceof xy.i0.f
            if (r0 == 0) goto L13
            r0 = r10
            xy.i0$f r0 = (xy.i0.f) r0
            int r1 = r0.f98549d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f98549d = r1
            goto L18
        L13:
            xy.i0$f r0 = new xy.i0$f
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f98548c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f98549d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r10)
            goto L70
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r7 = r0.f98547b
            r9 = r7
            java.util.zip.Deflater r9 = (java.util.zip.Deflater) r9
            java.lang.Object r7 = r0.f98546a
            io.ktor.utils.io.m r7 = (io.ktor.utils.io.m) r7
            kotlin.e.n(r10)
            goto L5a
        L41:
            kotlin.e.n(r10)
            long r5 = r8.getValue()
            int r8 = (int) r5
            int r8 = java.lang.Integer.reverseBytes(r8)
            r0.f98546a = r7
            r0.f98547b = r9
            r0.f98549d = r4
            java.lang.Object r8 = io.ktor.utils.io.q.t(r7, r8, r0)
            if (r8 != r1) goto L5a
            goto L6f
        L5a:
            int r8 = r9.getTotalIn()
            int r8 = java.lang.Integer.reverseBytes(r8)
            r9 = 0
            r0.f98546a = r9
            r0.f98547b = r9
            r0.f98549d = r3
            java.lang.Object r7 = io.ktor.utils.io.q.t(r7, r8, r0)
            if (r7 != r1) goto L70
        L6f:
            return r1
        L70:
            yz.g2 r7 = yz.g2.f100423a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: xy.i0.s(io.ktor.utils.io.m, java.util.zip.Checksum, java.util.zip.Deflater, j00.c):java.lang.Object");
    }

    public static final void t(Deflater deflater, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            throw new IllegalArgumentException("buffer need to be array-backed");
        }
        deflater.setInput(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    public static final void u(@m80.k Checksum checksum, @m80.k ByteBuffer buffer) {
        kotlin.jvm.internal.g0.p(checksum, "<this>");
        kotlin.jvm.internal.g0.p(buffer, "buffer");
        if (!buffer.hasArray()) {
            throw new IllegalArgumentException("buffer need to be array-backed");
        }
        checksum.update(buffer.array(), buffer.arrayOffset() + buffer.position(), buffer.remaining());
    }
}
