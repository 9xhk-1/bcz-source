package ww;

import androidx.media3.extractor.text.ttml.TtmlNode;
import c40.b2;
import c40.h1;
import c40.x;
import c40.z;
import io.ktor.client.plugins.internal.SaveBodyAbandonedReadException;
import io.ktor.utils.io.g;
import io.ktor.utils.io.l0;
import io.ktor.utils.io.m0;
import io.ktor.utils.io.q;
import j00.c;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import l00.d;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f96929b = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "content");

    /* renamed from: a, reason: collision with root package name */
    @k
    public final g f96930a;

    @k
    private volatile /* synthetic */ Object content;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "io.ktor.client.plugins.internal.ByteChannelReplay$replay$1", f = "ByteChannelReplay.kt", i = {0}, l = {33, 34}, m = "invokeSuspend", n = {"$this$writer"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements p<m0, c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f96940a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f96941b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<C1298a> f96942c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Ref.ObjectRef<C1298a> objectRef, c<? super b> cVar) {
            super(2, cVar);
            this.f96942c = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<g2> create(Object obj, c<?> cVar) {
            b bVar = new b(this.f96942c, cVar);
            bVar.f96941b = obj;
            return bVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(m0 m0Var, c<? super g2> cVar) {
            return ((b) create(m0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
        
            if (io.ktor.utils.io.q.s(r3, (byte[]) r11, 0, 0, r10, 6, null) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
        
            if (r11 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r10.f96940a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r11)
                goto L56
            L12:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1a:
                java.lang.Object r1 = r10.f96941b
                io.ktor.utils.io.m0 r1 = (io.ktor.utils.io.m0) r1
                kotlin.e.n(r11)
                goto L3e
            L22:
                kotlin.e.n(r11)
                java.lang.Object r11 = r10.f96941b
                r1 = r11
                io.ktor.utils.io.m0 r1 = (io.ktor.utils.io.m0) r1
                kotlin.jvm.internal.Ref$ObjectRef<ww.a$a> r11 = r10.f96942c
                T r11 = r11.element
                kotlin.jvm.internal.g0.m(r11)
                ww.a$a r11 = (ww.a.C1298a) r11
                r10.f96941b = r1
                r10.f96940a = r3
                java.lang.Object r11 = r11.a(r10)
                if (r11 != r0) goto L3e
                goto L55
            L3e:
                r4 = r11
                byte[] r4 = (byte[]) r4
                io.ktor.utils.io.m r3 = r1.a()
                r11 = 0
                r10.f96941b = r11
                r10.f96940a = r2
                r5 = 0
                r6 = 0
                r8 = 6
                r9 = 0
                r7 = r10
                java.lang.Object r11 = io.ktor.utils.io.q.s(r3, r4, r5, r6, r7, r8, r9)
                if (r11 != r0) goto L56
            L55:
                return r0
            L56:
                yz.g2 r11 = yz.g2.f100423a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: ww.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public a(@k g origin) {
        g0.p(origin, "origin");
        this.f96930a = origin;
        this.content = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Object, ww.a$a] */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.Object] */
    @k
    public final g b() {
        if (this.f96930a.b() != null) {
            Throwable b11 = this.f96930a.b();
            g0.m(b11);
            throw b11;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? r12 = this.content;
        objectRef.element = r12;
        x xVar = null;
        Object[] objArr = 0;
        if (r12 == 0) {
            ?? c1298a = new C1298a(this, xVar, 1, objArr == true ? 1 : 0);
            objectRef.element = c1298a;
            if (androidx.concurrent.futures.a.a(f96929b, this, null, c1298a)) {
                return ((C1298a) objectRef.element).f();
            }
            objectRef.element = this.content;
        }
        return q.E(b2.f7824a, null, false, new b(objectRef, null), 3, null).b();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: ww.a$a, reason: collision with other inner class name */
    public final class C1298a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final x<byte[]> f96931a;

        /* renamed from: b, reason: collision with root package name */
        public l0 f96932b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f96933c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @d(c = "io.ktor.client.plugins.internal.ByteChannelReplay$CopyFromSourceTask$receiveBody$1", f = "ByteChannelReplay.kt", i = {0, 0, 1, 1, 2, 2, 2, 3, 3, 3}, l = {59, 60, 64, 65}, m = "invokeSuspend", n = {"$this$writer", TtmlNode.TAG_BODY, "$this$writer", TtmlNode.TAG_BODY, "$this$writer", TtmlNode.TAG_BODY, "packet", "$this$writer", TtmlNode.TAG_BODY, "packet"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
        @u0({"SMAP\nByteChannelReplay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteChannelReplay.kt\nio/ktor/client/plugins/internal/ByteChannelReplay$CopyFromSourceTask$receiveBody$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,96:1\n1#2:97\n*E\n"})
        /* renamed from: ww.a$a$a, reason: collision with other inner class name */
        public static final class C1299a extends SuspendLambda implements p<m0, c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f96934a;

            /* renamed from: b, reason: collision with root package name */
            public Object f96935b;

            /* renamed from: c, reason: collision with root package name */
            public int f96936c;

            /* renamed from: d, reason: collision with root package name */
            public /* synthetic */ Object f96937d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ a f96938e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ C1298a f96939f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1299a(a aVar, C1298a c1298a, c<? super C1299a> cVar) {
                super(2, cVar);
                this.f96938e = aVar;
                this.f96939f = c1298a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final c<g2> create(Object obj, c<?> cVar) {
                C1299a c1299a = new C1299a(this.f96938e, this.f96939f, cVar);
                c1299a.f96937d = obj;
                return c1299a;
            }

            @Override // x00.p
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(m0 m0Var, c<? super g2> cVar) {
                return ((C1299a) create(m0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:32:0x00ee
                	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
                	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
                	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
                */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Not initialized variable reg: 7, insn: 0x0115: INVOKE (r7 I:y40.o) INTERFACE call: y40.o.close():void A[MD:():void (m)] (LINE:278), block:B:50:0x0115 */
            /* JADX WARN: Removed duplicated region for block: B:13:0x0076 A[Catch: all -> 0x0026, TryCatch #1 {all -> 0x0026, blocks: (B:9:0x0021, B:10:0x00ee, B:11:0x006a, B:13:0x0076, B:15:0x0082, B:20:0x0098, B:23:0x00b7, B:24:0x00ba, B:26:0x00c4, B:29:0x00db, B:34:0x00f4, B:36:0x0100, B:39:0x0114, B:43:0x003d, B:45:0x004b, B:47:0x0059), top: B:2:0x000b }] */
            /* JADX WARN: Removed duplicated region for block: B:26:0x00c4 A[Catch: all -> 0x0026, Exception -> 0x00ee, TryCatch #0 {Exception -> 0x00ee, blocks: (B:9:0x0021, B:24:0x00ba, B:26:0x00c4, B:29:0x00db, B:43:0x003d), top: B:2:0x000b }] */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x00f4 A[Catch: all -> 0x0026, TryCatch #1 {all -> 0x0026, blocks: (B:9:0x0021, B:10:0x00ee, B:11:0x006a, B:13:0x0076, B:15:0x0082, B:20:0x0098, B:23:0x00b7, B:24:0x00ba, B:26:0x00c4, B:29:0x00db, B:34:0x00f4, B:36:0x0100, B:39:0x0114, B:43:0x003d, B:45:0x004b, B:47:0x0059), top: B:2:0x000b }] */
            /* JADX WARN: Type inference failed for: r1v0, types: [int] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v20, types: [y40.c0] */
            /* JADX WARN: Type inference failed for: r1v21 */
            /* JADX WARN: Type inference failed for: r1v22 */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, y40.c0] */
            /* JADX WARN: Type inference failed for: r1v7, types: [y40.c0] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00c2 -> B:10:0x00ee). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00eb -> B:10:0x00ee). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    Method dump skipped, instructions count: 290
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ww.a.C1298a.C1299a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public C1298a(@k a aVar, x<byte[]> savedResponse) {
            g0.p(savedResponse, "savedResponse");
            this.f96933c = aVar;
            this.f96931a = savedResponse;
        }

        @l
        public final Object a(@k c<? super byte[]> cVar) {
            if (!q.k(c())) {
                c().b().a(new SaveBodyAbandonedReadException());
            }
            return this.f96931a.i(cVar);
        }

        @k
        public final x<byte[]> b() {
            return this.f96931a;
        }

        @k
        public final l0 c() {
            l0 l0Var = this.f96932b;
            if (l0Var != null) {
                return l0Var;
            }
            g0.S("writerJob");
            return null;
        }

        @k
        public final l0 d() {
            return q.E(b2.f7824a, h1.g(), false, new C1299a(this.f96933c, this, null), 2, null);
        }

        public final void e(@k l0 l0Var) {
            g0.p(l0Var, "<set-?>");
            this.f96932b = l0Var;
        }

        @k
        public final g f() {
            e(d());
            return c().b();
        }

        public /* synthetic */ C1298a(a aVar, x xVar, int i11, v vVar) {
            this(aVar, (i11 & 1) != 0 ? z.c(null, 1, null) : xVar);
        }
    }
}
