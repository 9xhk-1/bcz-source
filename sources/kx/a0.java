package kx;

import androidx.media3.extractor.text.ttml.TtmlNode;
import c40.r0;
import com.jiongji.andriod.card.R;
import e40.i0;
import io.ktor.utils.io.g0;
import io.ktor.utils.io.m0;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import u30.k0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final z40.c f68903a = new z40.c(jz.s.m("\r\n", null, 1, null), 0, 0, 6, null);

    /* renamed from: b, reason: collision with root package name */
    public static final byte f68904b = 45;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final z40.c f68905c = z40.g.b(f68904b, f68904b);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.http.cio.MultipartKt$parseMultipart$1", f = "Multipart.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 7, 7, 7, 8, 8, 8, 11}, l = {183, 186, 189, 190, 195, 199, 206, 218, R.styleable.Theme_drawable_searchwords, 226, 226, R.styleable.Theme_drawable_syncview_update, R.styleable.Theme_drawable_tab_friends_new}, m = "invokeSuspend", n = {"$this$produce", "countedInput", "readBeforeParse", "$this$produce", "countedInput", "readBeforeParse", "$this$produce", "countedInput", "readBeforeParse", "$this$produce", "countedInput", "readBeforeParse", "$this$produce", "countedInput", TtmlNode.TAG_BODY, "headers", "readBeforeParse", "$this$produce", "countedInput", TtmlNode.TAG_BODY, "headers", "readBeforeParse", "$this$produce", "countedInput", TtmlNode.TAG_BODY, "headers", "headersMap", "readBeforeParse", "$this$produce", "countedInput", "readBeforeParse", "$this$produce", "countedInput", "readBeforeParse", "$this$produce"}, s = {"L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0"})
    public static final class a extends SuspendLambda implements x00.p<i0<? super y>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f68906a;

        /* renamed from: b, reason: collision with root package name */
        public Object f68907b;

        /* renamed from: c, reason: collision with root package name */
        public Object f68908c;

        /* renamed from: d, reason: collision with root package name */
        public Object f68909d;

        /* renamed from: e, reason: collision with root package name */
        public long f68910e;

        /* renamed from: f, reason: collision with root package name */
        public int f68911f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f68912g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.g f68913h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ z40.c f68914i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ long f68915j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Long f68916k;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.http.cio.MultipartKt$parseMultipart$1$preambleData$1", f = "Multipart.kt", i = {0}, l = {181, 182}, m = "invokeSuspend", n = {"$this$writer"}, s = {"L$0"})
        /* renamed from: kx.a0$a$a, reason: collision with other inner class name */
        public static final class C0829a extends SuspendLambda implements x00.p<m0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f68917a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f68918b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ z40.c f68919c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ io.ktor.utils.io.v f68920d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0829a(z40.c cVar, io.ktor.utils.io.v vVar, j00.c<? super C0829a> cVar2) {
                super(2, cVar2);
                this.f68919c = cVar;
                this.f68920d = vVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                C0829a c0829a = new C0829a(this.f68919c, this.f68920d, cVar);
                c0829a.f68918b = obj;
                return c0829a;
            }

            @Override // x00.p
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(m0 m0Var, j00.c<? super g2> cVar) {
                return ((C0829a) create(m0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
            
                if (r11.j(r10) == r0) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
            
                if (kx.a0.s(r4, r5, r6, 8192, r9) == r0) goto L15;
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
                    int r1 = r10.f68917a
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L24
                    if (r1 == r3) goto L1b
                    if (r1 != r2) goto L13
                    kotlin.e.n(r11)
                    r9 = r10
                    goto L52
                L13:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L1b:
                    java.lang.Object r1 = r10.f68918b
                    io.ktor.utils.io.m0 r1 = (io.ktor.utils.io.m0) r1
                    kotlin.e.n(r11)
                    r9 = r10
                    goto L42
                L24:
                    kotlin.e.n(r11)
                    java.lang.Object r11 = r10.f68918b
                    r1 = r11
                    io.ktor.utils.io.m0 r1 = (io.ktor.utils.io.m0) r1
                    z40.c r4 = r10.f68919c
                    io.ktor.utils.io.v r5 = r10.f68920d
                    io.ktor.utils.io.m r6 = r1.a()
                    r10.f68918b = r1
                    r10.f68917a = r3
                    r7 = 8192(0x2000, double:4.0474E-320)
                    r9 = r10
                    java.lang.Object r11 = kx.a0.e(r4, r5, r6, r7, r9)
                    if (r11 != r0) goto L42
                    goto L51
                L42:
                    io.ktor.utils.io.m r11 = r1.a()
                    r1 = 0
                    r9.f68918b = r1
                    r9.f68917a = r2
                    java.lang.Object r11 = r11.j(r10)
                    if (r11 != r0) goto L52
                L51:
                    return r0
                L52:
                    yz.g2 r11 = yz.g2.f100423a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: kx.a0.a.C0829a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.ktor.utils.io.g gVar, z40.c cVar, long j11, Long l11, j00.c<? super a> cVar2) {
            super(2, cVar2);
            this.f68913h = gVar;
            this.f68914i = cVar;
            this.f68915j = j11;
            this.f68916k = l11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = new a(this.f68913h, this.f68914i, this.f68915j, this.f68916k, cVar);
            aVar.f68912g = obj;
            return aVar;
        }

        @Override // x00.p
        public final Object invoke(i0<? super y> i0Var, j00.c<? super g2> cVar) {
            return ((a) create(i0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x030e, code lost:
        
            if (r0.b(r2, r21) == r7) goto L114;
         */
        /* JADX WARN: Code restructure failed: missing block: B:115:0x014b, code lost:
        
            if (r4 == r7) goto L114;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x02dd, code lost:
        
            if (r0.b(r2, r21) == r7) goto L114;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x02c9, code lost:
        
            if (r1 == r7) goto L114;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x02f4, code lost:
        
            if (r1 == r7) goto L114;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0197, code lost:
        
            if (r1 == r7) goto L114;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x01f7, code lost:
        
            if (r13 != r7) goto L19;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x02a5  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x02e8  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x029b  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0180  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x01e1  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x027f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0229 -> B:39:0x022e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instructions count: 820
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kx.a0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.http.cio.MultipartKt", f = "Multipart.kt", i = {0, 1, 1, 1, 2, 3}, l = {116, 117, 117, 120}, m = "parsePartBodyImpl", n = {"output", "boundaryPrefixed", "input", "output", "output", "byteCount"}, s = {"L$0", "L$0", "L$1", "L$2", "L$0", "J$0"})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f68921a;

        /* renamed from: b, reason: collision with root package name */
        public Object f68922b;

        /* renamed from: c, reason: collision with root package name */
        public Object f68923c;

        /* renamed from: d, reason: collision with root package name */
        public long f68924d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f68925e;

        /* renamed from: f, reason: collision with root package name */
        public int f68926f;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f68925e = obj;
            this.f68926f |= Integer.MIN_VALUE;
            return a0.q(null, null, null, null, 0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.http.cio.MultipartKt", f = "Multipart.kt", i = {0}, l = {97}, m = "parsePartHeadersImpl", n = {"builder"}, s = {"L$0"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f68927a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f68928b;

        /* renamed from: c, reason: collision with root package name */
        public int f68929c;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f68928b = obj;
            this.f68929c |= Integer.MIN_VALUE;
            return a0.r(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.http.cio.MultipartKt", f = "Multipart.kt", i = {0, 0, 0}, l = {398, 406}, m = "skipDelimiterOrEof", n = {"$this$skipDelimiterOrEof", TtmlNode.RUBY_DELIMITER, "found"}, s = {"L$0", "L$1", "L$2"})
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f68930a;

        /* renamed from: b, reason: collision with root package name */
        public Object f68931b;

        /* renamed from: c, reason: collision with root package name */
        public Object f68932c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f68933d;

        /* renamed from: e, reason: collision with root package name */
        public int f68934e;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f68933d = obj;
            this.f68934e |= Integer.MIN_VALUE;
            return a0.u(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.http.cio.MultipartKt$skipDelimiterOrEof$3", f = "Multipart.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements x00.p<g0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f68935a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f68936b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f68937c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ByteBuffer f68938d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Ref.BooleanRef booleanRef, ByteBuffer byteBuffer, j00.c<? super e> cVar) {
            super(2, cVar);
            this.f68937c = booleanRef;
            this.f68938d = byteBuffer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            e eVar = new e(this.f68937c, this.f68938d, cVar);
            eVar.f68936b = obj;
            return eVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(g0 g0Var, j00.c<? super g2> cVar) {
            return ((e) create(g0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f68935a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            g0 g0Var = (g0) this.f68936b;
            this.f68937c.element = a0.A(g0Var, this.f68938d) == this.f68938d.remaining();
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.http.cio.MultipartKt", f = "Multipart.kt", i = {0}, l = {127}, m = "skipIfFoundReadCount", n = {"prefix"}, s = {"L$0"})
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f68939a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f68940b;

        /* renamed from: c, reason: collision with root package name */
        public int f68941c;

        public f(j00.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f68940b = obj;
            this.f68941c |= Integer.MIN_VALUE;
            return a0.v(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.http.cio.MultipartKt", f = "Multipart.kt", i = {0}, l = {412}, m = "trySkipDelimiterSuspend", n = {"result"}, s = {"L$0"})
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f68942a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f68943b;

        /* renamed from: c, reason: collision with root package name */
        public int f68944c;

        public g(j00.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f68943b = obj;
            this.f68944c |= Integer.MIN_VALUE;
            return a0.B(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.http.cio.MultipartKt$trySkipDelimiterSuspend$2", f = "Multipart.kt", i = {0, 1}, l = {413, 413}, m = "invokeSuspend", n = {"$this$lookAheadSuspend", "$this$lookAheadSuspend"}, s = {"L$0", "L$0"})
    public static final class h extends SuspendLambda implements x00.p<g0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f68945a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f68946b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ByteBuffer f68947c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f68948d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ByteBuffer byteBuffer, Ref.BooleanRef booleanRef, j00.c<? super h> cVar) {
            super(2, cVar);
            this.f68947c = byteBuffer;
            this.f68948d = booleanRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            h hVar = new h(this.f68947c, this.f68948d, cVar);
            hVar.f68946b = obj;
            return hVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(g0 g0Var, j00.c<? super g2> cVar) {
            return ((h) create(g0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x005d  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r5.f68945a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r5.f68946b
                io.ktor.utils.io.g0 r0 = (io.ktor.utils.io.g0) r0
                kotlin.e.n(r6)
                goto L55
            L16:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1e:
                java.lang.Object r1 = r5.f68946b
                io.ktor.utils.io.g0 r1 = (io.ktor.utils.io.g0) r1
                kotlin.e.n(r6)
                goto L41
            L26:
                kotlin.e.n(r6)
                java.lang.Object r6 = r5.f68946b
                io.ktor.utils.io.g0 r6 = (io.ktor.utils.io.g0) r6
                java.nio.ByteBuffer r1 = r5.f68947c
                int r1 = r1.remaining()
                r5.f68946b = r6
                r5.f68945a = r3
                java.lang.Object r1 = r6.b(r1, r5)
                if (r1 != r0) goto L3e
                goto L53
            L3e:
                r4 = r1
                r1 = r6
                r6 = r4
            L41:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != 0) goto L66
                r5.f68946b = r1
                r5.f68945a = r2
                java.lang.Object r6 = r1.b(r3, r5)
                if (r6 != r0) goto L54
            L53:
                return r0
            L54:
                r0 = r1
            L55:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != 0) goto L65
                kotlin.jvm.internal.Ref$BooleanRef r6 = r5.f68948d
                r0 = 0
                r6.element = r0
                yz.g2 r6 = yz.g2.f100423a
                return r6
            L65:
                r1 = r0
            L66:
                java.nio.ByteBuffer r6 = r5.f68947c
                int r6 = kx.a0.g(r1, r6)
                java.nio.ByteBuffer r0 = r5.f68947c
                int r0 = r0.remaining()
                if (r6 != r0) goto L77
                yz.g2 r6 = yz.g2.f100423a
                return r6
            L77:
                java.io.IOException r6 = new java.io.IOException
                java.lang.String r0 = "Broken delimiter occurred"
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kx.a0.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final int A(g0 g0Var, ByteBuffer byteBuffer) {
        int y11 = y(g0Var, byteBuffer);
        if (y11 == -1) {
            throw new IOException("Failed to skip delimiter: actual bytes differ from delimiter bytes");
        }
        if (y11 < byteBuffer.remaining()) {
            return y11;
        }
        g0Var.c(byteBuffer.remaining());
        return byteBuffer.remaining();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object B(io.ktor.utils.io.g r5, java.nio.ByteBuffer r6, j00.c<? super java.lang.Boolean> r7) {
        /*
            boolean r0 = r7 instanceof kx.a0.g
            if (r0 == 0) goto L13
            r0 = r7
            kx.a0$g r0 = (kx.a0.g) r0
            int r1 = r0.f68944c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f68944c = r1
            goto L18
        L13:
            kx.a0$g r0 = new kx.a0$g
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f68943b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f68944c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f68942a
            kotlin.jvm.internal.Ref$BooleanRef r5 = (kotlin.jvm.internal.Ref.BooleanRef) r5
            kotlin.e.n(r7)
            goto L51
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.e.n(r7)
            kotlin.jvm.internal.Ref$BooleanRef r7 = new kotlin.jvm.internal.Ref$BooleanRef
            r7.<init>()
            r7.element = r3
            kx.a0$h r2 = new kx.a0$h
            r4 = 0
            r2.<init>(r6, r7, r4)
            r0.f68942a = r7
            r0.f68944c = r3
            java.lang.Object r5 = io.ktor.utils.io.e0.b(r5, r2, r0)
            if (r5 != r1) goto L50
            return r1
        L50:
            r5 = r7
        L51:
            boolean r5 = r5.element
            java.lang.Boolean r5 = l00.a.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kx.a0.B(io.ktor.utils.io.g, java.nio.ByteBuffer, j00.c):java.lang.Object");
    }

    public static final int i(CharSequence charSequence) {
        int length = charSequence.length();
        char c11 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            char charAt = charSequence.charAt(i12);
            if (c11 == 0) {
                if (charAt != ';') {
                }
                i11 = 0;
                c11 = 1;
            } else if (c11 != 1) {
                if (c11 == 2) {
                    if (charAt != '\"') {
                        if (charAt != ',') {
                            if (charAt != ';') {
                            }
                            i11 = 0;
                            c11 = 1;
                        }
                        c11 = 0;
                    }
                    c11 = 3;
                } else if (c11 != 3) {
                    if (c11 != 4) {
                    }
                    c11 = 3;
                } else {
                    if (charAt != '\"') {
                        if (charAt == '\\') {
                            c11 = 4;
                        }
                    }
                    i11 = 0;
                    c11 = 1;
                }
            } else if (charAt == '=') {
                c11 = 2;
            } else if (charAt == ';') {
                i11 = 0;
            } else {
                if (charAt != ',') {
                    if (charAt == ' ') {
                        continue;
                    } else {
                        if (i11 == 0 && k0.y5(charSequence, "boundary=", i12, true)) {
                            return i12;
                        }
                        i11++;
                    }
                }
                c11 = 0;
            }
        }
        return -1;
    }

    public static final int j(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int i11;
        int position = byteBuffer2.position();
        int remaining = byteBuffer2.remaining();
        byte b11 = byteBuffer2.get(position);
        int limit = byteBuffer.limit();
        loop0: for (int position2 = byteBuffer.position(); position2 < limit; position2++) {
            if (byteBuffer.get(position2) == b11) {
                while (i11 < remaining) {
                    int i12 = position2 + i11;
                    if (i12 == limit) {
                        break loop0;
                    }
                    i11 = byteBuffer.get(i12) == byteBuffer2.get(position + i11) ? i11 + 1 : 1;
                }
                return position2 - byteBuffer.position();
            }
        }
        return -1;
    }

    @m80.k
    public static final ByteBuffer k(@m80.k CharSequence contentType) {
        kotlin.jvm.internal.g0.p(contentType, "contentType");
        int i11 = i(contentType);
        if (i11 == -1) {
            throw new IOException("Failed to parse multipart: Content-Type's boundary parameter is missing");
        }
        ByteBuffer allocate = ByteBuffer.allocate(74);
        kotlin.jvm.internal.g0.o(allocate, "allocate(...)");
        allocate.put((byte) 13);
        allocate.put((byte) 10);
        allocate.put(f68904b);
        allocate.put(f68904b);
        int length = contentType.length();
        char c11 = 0;
        for (int i12 = i11 + 9; i12 < length; i12++) {
            char charAt = contentType.charAt(i12);
            int i13 = charAt & kotlin.jvm.internal.q.f67020c;
            if ((65535 & charAt) > 127) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to parse multipart: wrong boundary byte 0x");
                String num = Integer.toString(i13, kotlin.text.a.a(16));
                kotlin.jvm.internal.g0.o(num, "toString(...)");
                sb2.append(num);
                sb2.append(" - should be 7bit character");
                throw new IOException(sb2.toString());
            }
            if (c11 == 0) {
                if (charAt == ' ') {
                    continue;
                } else {
                    if (charAt != '\"') {
                        if (charAt == ',' || charAt == ';') {
                            break;
                        }
                        allocate.put((byte) i13);
                        c11 = 1;
                    }
                    c11 = 2;
                }
            } else if (c11 == 1) {
                if (charAt == ' ' || charAt == ',' || charAt == ';') {
                    break;
                }
                if (!allocate.hasRemaining()) {
                    throw new IOException("Failed to parse multipart: boundary shouldn't be longer than 70 characters");
                }
                allocate.put((byte) i13);
            } else {
                if (c11 != 2) {
                    if (c11 != 3) {
                        continue;
                    } else {
                        if (!allocate.hasRemaining()) {
                            throw new IOException("Failed to parse multipart: boundary shouldn't be longer than 70 characters");
                        }
                        allocate.put((byte) i13);
                        c11 = 2;
                    }
                } else if (charAt == '\\') {
                    c11 = 3;
                } else {
                    if (charAt == '\"') {
                        break;
                    }
                    if (!allocate.hasRemaining()) {
                        throw new IOException("Failed to parse multipart: boundary shouldn't be longer than 70 characters");
                    }
                    allocate.put((byte) i13);
                }
            }
        }
        allocate.flip();
        if (allocate.remaining() != 4) {
            return allocate;
        }
        throw new IOException("Empty multipart boundary is not allowed");
    }

    @m80.k
    public static final e40.k0<y> l(@m80.k r0 r0Var, @m80.k io.ktor.utils.io.g input, @m80.k CharSequence contentType, @m80.l Long l11, long j11) {
        kotlin.jvm.internal.g0.p(r0Var, "<this>");
        kotlin.jvm.internal.g0.p(input, "input");
        kotlin.jvm.internal.g0.p(contentType, "contentType");
        if (k0.z5(contentType, "multipart/", true)) {
            return n(r0Var, io.ktor.utils.io.l.c(k(contentType)), input, l11, j11);
        }
        throw new IOException("Failed to parse multipart: Content-Type should be multipart/* but it is " + ((Object) contentType));
    }

    @m80.k
    public static final e40.k0<y> m(@m80.k r0 r0Var, @m80.k io.ktor.utils.io.g input, @m80.k s headers, long j11) {
        kotlin.jvm.internal.g0.p(r0Var, "<this>");
        kotlin.jvm.internal.g0.p(input, "input");
        kotlin.jvm.internal.g0.p(headers, "headers");
        CharSequence g11 = headers.g("Content-Type");
        if (g11 == null) {
            throw new IOException("Failed to parse multipart: no Content-Type header");
        }
        CharSequence g12 = headers.g("Content-Length");
        return l(r0Var, input, g11, g12 != null ? Long.valueOf(lx.i.n(g12)) : null, j11);
    }

    public static final e40.k0<y> n(r0 r0Var, z40.c cVar, io.ktor.utils.io.g gVar, Long l11, long j11) {
        return e40.g0.j(r0Var, null, 0, new a(gVar, cVar, j11, l11, null), 3, null);
    }

    public static /* synthetic */ e40.k0 o(r0 r0Var, io.ktor.utils.io.g gVar, CharSequence charSequence, Long l11, long j11, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            j11 = Long.MAX_VALUE;
        }
        return l(r0Var, gVar, charSequence, l11, j11);
    }

    public static /* synthetic */ e40.k0 p(r0 r0Var, io.ktor.utils.io.g gVar, s sVar, long j11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            j11 = Long.MAX_VALUE;
        }
        return m(r0Var, gVar, sVar, j11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00f8, code lost:
    
        if (r3.g(r6) != r7) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cb, code lost:
    
        if (r4 == r7) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(z40.c r16, io.ktor.utils.io.g r17, io.ktor.utils.io.m r18, kx.s r19, long r20, j00.c<? super java.lang.Long> r22) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kx.a0.q(z40.c, io.ktor.utils.io.g, io.ktor.utils.io.m, kx.s, long, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059 A[Catch: all -> 0x002f, TryCatch #1 {all -> 0x002f, blocks: (B:12:0x002b, B:13:0x0054, B:17:0x0059, B:18:0x0060), top: B:11:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(io.ktor.utils.io.g r7, j00.c<? super kx.s> r8) {
        /*
            boolean r0 = r8 instanceof kx.a0.c
            if (r0 == 0) goto L14
            r0 = r8
            kx.a0$c r0 = (kx.a0.c) r0
            int r1 = r0.f68929c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f68929c = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            kx.a0$c r0 = new kx.a0$c
            r0.<init>(r8)
            goto L12
        L1a:
            java.lang.Object r8 = r4.f68928b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.f68929c
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L32
            java.lang.Object r7 = r4.f68927a
            lx.d r7 = (lx.d) r7
            kotlin.e.n(r8)     // Catch: java.lang.Throwable -> L2f
            goto L54
        L2f:
            r0 = move-exception
            r8 = r0
            goto L64
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            kotlin.e.n(r8)
            r8 = r2
            lx.d r2 = new lx.d
            r1 = 0
            r2.<init>(r1, r8, r1)
            r4.f68927a = r2     // Catch: java.lang.Throwable -> L61
            r4.f68929c = r8     // Catch: java.lang.Throwable -> L61
            r3 = 0
            r5 = 4
            r6 = 0
            r1 = r7
            java.lang.Object r8 = kx.x.k(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L61
            if (r8 != r0) goto L53
            return r0
        L53:
            r7 = r2
        L54:
            kx.s r8 = (kx.s) r8     // Catch: java.lang.Throwable -> L2f
            if (r8 == 0) goto L59
            return r8
        L59:
            java.io.EOFException r8 = new java.io.EOFException     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = "Failed to parse multipart headers: unexpected end of stream"
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L2f
            throw r8     // Catch: java.lang.Throwable -> L2f
        L61:
            r0 = move-exception
            r8 = r0
            r7 = r2
        L64:
            r7.P()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kx.a0.r(io.ktor.utils.io.g, j00.c):java.lang.Object");
    }

    public static final Object s(z40.c cVar, io.ktor.utils.io.g gVar, io.ktor.utils.io.m mVar, long j11, j00.c<? super Long> cVar2) {
        return io.ktor.utils.io.j.M(gVar, cVar, mVar, j11, true, cVar2);
    }

    public static /* synthetic */ Object t(z40.c cVar, io.ktor.utils.io.g gVar, io.ktor.utils.io.m mVar, long j11, j00.c cVar2, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            j11 = Long.MAX_VALUE;
        }
        return s(cVar, gVar, mVar, j11, cVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u(@m80.k io.ktor.utils.io.g r6, @m80.k java.nio.ByteBuffer r7, @m80.k j00.c<? super java.lang.Boolean> r8) {
        /*
            boolean r0 = r8 instanceof kx.a0.d
            if (r0 == 0) goto L13
            r0 = r8
            kx.a0$d r0 = (kx.a0.d) r0
            int r1 = r0.f68934e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f68934e = r1
            goto L18
        L13:
            kx.a0$d r0 = new kx.a0$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f68933d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f68934e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L45
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.e.n(r8)
            return r8
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            java.lang.Object r6 = r0.f68932c
            kotlin.jvm.internal.Ref$BooleanRef r6 = (kotlin.jvm.internal.Ref.BooleanRef) r6
            java.lang.Object r7 = r0.f68931b
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7
            java.lang.Object r2 = r0.f68930a
            io.ktor.utils.io.g r2 = (io.ktor.utils.io.g) r2
            kotlin.e.n(r8)
            goto L71
        L45:
            kotlin.e.n(r8)
            boolean r8 = r7.hasRemaining()
            if (r8 == 0) goto Lae
            int r8 = r7.remaining()
            r2 = 8192(0x2000, float:1.14794E-41)
            if (r8 > r2) goto L8a
            kotlin.jvm.internal.Ref$BooleanRef r8 = new kotlin.jvm.internal.Ref$BooleanRef
            r8.<init>()
            kx.a0$e r2 = new kx.a0$e
            r2.<init>(r8, r7, r5)
            r0.f68930a = r6
            r0.f68931b = r7
            r0.f68932c = r8
            r0.f68934e = r4
            java.lang.Object r2 = io.ktor.utils.io.e0.a(r6, r2, r0)
            if (r2 != r1) goto L6f
            goto L88
        L6f:
            r2 = r6
            r6 = r8
        L71:
            boolean r6 = r6.element
            if (r6 == 0) goto L7a
            java.lang.Boolean r6 = l00.a.a(r4)
            return r6
        L7a:
            r0.f68930a = r5
            r0.f68931b = r5
            r0.f68932c = r5
            r0.f68934e = r3
            java.lang.Object r6 = B(r2, r7, r0)
            if (r6 != r1) goto L89
        L88:
            return r1
        L89:
            return r6
        L8a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "Delimiter of "
            r6.append(r8)
            int r7 = r7.remaining()
            r6.append(r7)
            java.lang.String r7 = " bytes is too long: at most 8192 bytes could be checked"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        Lae:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Failed requirement."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kx.a0.u(io.ktor.utils.io.g, java.nio.ByteBuffer, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object v(io.ktor.utils.io.g r4, z40.c r5, j00.c<? super java.lang.Long> r6) {
        /*
            boolean r0 = r6 instanceof kx.a0.f
            if (r0 == 0) goto L13
            r0 = r6
            kx.a0$f r0 = (kx.a0.f) r0
            int r1 = r0.f68941c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f68941c = r1
            goto L18
        L13:
            kx.a0$f r0 = new kx.a0$f
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f68940b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f68941c
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.f68939a
            r5 = r4
            z40.c r5 = (z40.c) r5
            kotlin.e.n(r6)
            goto L44
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.e.n(r6)
            r0.f68939a = r5
            r0.f68941c = r3
            java.lang.Object r6 = io.ktor.utils.io.j.X(r4, r5, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r4 = r6.booleanValue()
            if (r4 == 0) goto L52
            int r4 = r5.g()
            long r4 = (long) r4
            goto L54
        L52:
            r4 = 0
        L54:
            java.lang.Long r4 = l00.a.g(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kx.a0.v(io.ktor.utils.io.g, z40.c, j00.c):java.lang.Object");
    }

    public static final boolean w(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i11) {
        int min = Math.min(byteBuffer.remaining(), byteBuffer2.remaining() - i11);
        if (min <= 0) {
            return false;
        }
        int position = byteBuffer.position();
        int position2 = byteBuffer2.position() + i11;
        for (int i12 = 0; i12 < min; i12++) {
            if (byteBuffer.get(position + i12) != byteBuffer2.get(position2 + i12)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean x(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return w(byteBuffer, byteBuffer2, i11);
    }

    public static final int y(g0 g0Var, ByteBuffer byteBuffer) {
        ByteBuffer d11 = g0Var.d(0, 1);
        if (d11 == null) {
            return 0;
        }
        int j11 = j(d11, byteBuffer);
        if (j11 != 0) {
            return -1;
        }
        int min = Math.min(d11.remaining() - j11, byteBuffer.remaining());
        int remaining = byteBuffer.remaining() - min;
        if (remaining > 0) {
            ByteBuffer d12 = g0Var.d(j11 + min, remaining);
            if (d12 == null) {
                return min;
            }
            if (!w(d12, byteBuffer, min)) {
                return -1;
            }
        }
        return byteBuffer.remaining();
    }

    public static final Void z(long j11, long j12) {
        throw new IOException("Multipart content length exceeds limit " + j11 + " > " + j12 + "; limit is defined using 'formFieldLimit' argument");
    }
}
