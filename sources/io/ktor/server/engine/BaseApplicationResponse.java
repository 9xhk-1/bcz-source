package io.ktor.server.engine;

import com.jiongji.andriod.card.R;
import ix.l1;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import mx.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nBaseApplicationResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseApplicationResponse.kt\nio/ktor/server/engine/BaseApplicationResponse\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Readers.kt\nio/ktor/util/cio/ReadersKt\n+ 4 Attributes.kt\nio/ktor/util/AttributesKt\n+ 5 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,326:1\n1#2:327\n29#3,9:328\n29#3,9:337\n18#4:346\n58#5,16:347\n*S KotlinDebug\n*F\n+ 1 BaseApplicationResponse.kt\nio/ktor/server/engine/BaseApplicationResponse\n*L\n173#1:328,9\n212#1:337,9\n302#1:346\n302#1:347,16\n*E\n"})
/* loaded from: classes8.dex */
public abstract class BaseApplicationResponse implements qy.o {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final a f61233g = new a(0 == true ? 1 : 0);

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final xy.a<BaseApplicationResponse> f61234h;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final zx.k0 f61235a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public ix.g1 f61236b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f61237c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final yz.c0 f61238d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f61239e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final qy.m f61240f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class BodyLengthIsTooLong extends IllegalStateException implements c40.g0<BodyLengthIsTooLong> {
        private final long expected;

        public BodyLengthIsTooLong(long j11) {
            super("Body.size is too long. Expected " + j11);
            this.expected = j11;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // c40.g0
        @m80.k
        public BodyLengthIsTooLong createCopy() {
            BodyLengthIsTooLong bodyLengthIsTooLong = new BodyLengthIsTooLong(this.expected);
            io.ktor.util.internal.c.a(bodyLengthIsTooLong, this);
            return bodyLengthIsTooLong;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class BodyLengthIsTooSmall extends IllegalStateException implements c40.g0<BodyLengthIsTooSmall> {
        private final long actual;
        private final long expected;

        public BodyLengthIsTooSmall(long j11, long j12) {
            super("Body.size is too small. Body: " + j12 + ", Content-Length: " + j11);
            this.expected = j11;
            this.actual = j12;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // c40.g0
        @m80.k
        public BodyLengthIsTooSmall createCopy() {
            BodyLengthIsTooSmall bodyLengthIsTooSmall = new BodyLengthIsTooSmall(this.expected, this.actual);
            io.ktor.util.internal.c.a(bodyLengthIsTooSmall, this);
            return bodyLengthIsTooSmall;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class InvalidHeaderForContent extends IllegalStateException implements c40.g0<InvalidHeaderForContent> {

        @m80.k
        private final String content;

        @m80.k
        private final String name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidHeaderForContent(@m80.k String name, @m80.k String content) {
            super("Header " + name + " is not allowed for " + content);
            kotlin.jvm.internal.g0.p(name, "name");
            kotlin.jvm.internal.g0.p(content, "content");
            this.name = name;
            this.content = content;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // c40.g0
        @m80.k
        public InvalidHeaderForContent createCopy() {
            InvalidHeaderForContent invalidHeaderForContent = new InvalidHeaderForContent(this.name, this.content);
            io.ktor.util.internal.c.a(invalidHeaderForContent, this);
            return invalidHeaderForContent;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ResponseAlreadySentException extends IllegalStateException {
        public ResponseAlreadySentException() {
            super("Response has already been sent");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.server.engine.BaseApplicationResponse$Companion$setupSendPipeline$1", f = "BaseApplicationResponse.kt", i = {}, l = {321}, m = "invokeSuspend", n = {}, s = {})
        @kotlin.jvm.internal.u0({"SMAP\nBaseApplicationResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseApplicationResponse.kt\nio/ktor/server/engine/BaseApplicationResponse$Companion$setupSendPipeline$1\n+ 2 ApplicationCallPipeline.kt\nio/ktor/server/application/ApplicationCallPipelineKt\n*L\n1#1,326:1\n79#2:327\n79#2:328\n79#2:329\n*S KotlinDebug\n*F\n+ 1 BaseApplicationResponse.kt\nio/ktor/server/engine/BaseApplicationResponse$Companion$setupSendPipeline$1\n*L\n310#1:327\n318#1:328\n319#1:329\n*E\n"})
        /* renamed from: io.ktor.server.engine.BaseApplicationResponse$a$a, reason: collision with other inner class name */
        public static final class C0708a extends SuspendLambda implements x00.q<io.ktor.util.pipeline.d<Object, zx.k0>, Object, j00.c<? super yz.g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f61241a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f61242b;

            /* renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f61243c;

            public C0708a(j00.c<? super C0708a> cVar) {
                super(3, cVar);
            }

            @Override // x00.q
            public final Object invoke(io.ktor.util.pipeline.d<Object, zx.k0> dVar, Object obj, j00.c<? super yz.g2> cVar) {
                C0708a c0708a = new C0708a(cVar);
                c0708a.f61242b = dVar;
                c0708a.f61243c = obj;
                return c0708a.invokeSuspend(yz.g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f61241a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    io.ktor.util.pipeline.d dVar = (io.ktor.util.pipeline.d) this.f61242b;
                    Object obj2 = this.f61243c;
                    if (zx.l0.c((zx.k0) dVar.d())) {
                        return yz.g2.f100423a;
                    }
                    if (!(obj2 instanceof mx.v)) {
                        throw new IllegalArgumentException("Response pipeline couldn't transform '" + kotlin.jvm.internal.o0.d(obj2.getClass()) + "' to the OutgoingContent");
                    }
                    qy.o k11 = ((zx.k0) dVar.d()).k();
                    BaseApplicationResponse baseApplicationResponse = k11 instanceof BaseApplicationResponse ? (BaseApplicationResponse) k11 : null;
                    if (baseApplicationResponse == null) {
                        baseApplicationResponse = (BaseApplicationResponse) ((zx.k0) dVar.d()).getAttributes().g(BaseApplicationResponse.f61233g.a());
                    }
                    this.f61242b = null;
                    this.f61241a = 1;
                    if (baseApplicationResponse.B((mx.v) obj2, this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                return yz.g2.f100423a;
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final xy.a<BaseApplicationResponse> a() {
            return BaseApplicationResponse.f61234h;
        }

        public final void b(@m80.k qy.m sendPipeline) {
            kotlin.jvm.internal.g0.p(sendPipeline, "sendPipeline");
            sendPipeline.C(qy.m.f82742h.d(), new C0708a(null));
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.engine.BaseApplicationResponse$respondFromBytes$3", f = "BaseApplicationResponse.kt", i = {1}, l = {202, 203}, m = "invokeSuspend", n = {"$this$use$iv"}, s = {"L$0"})
    @kotlin.jvm.internal.u0({"SMAP\nBaseApplicationResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseApplicationResponse.kt\nio/ktor/server/engine/BaseApplicationResponse$respondFromBytes$3\n+ 2 Readers.kt\nio/ktor/util/cio/ReadersKt\n*L\n1#1,326:1\n29#2,9:327\n*S KotlinDebug\n*F\n+ 1 BaseApplicationResponse.kt\nio/ktor/server/engine/BaseApplicationResponse$respondFromBytes$3\n*L\n202#1:327,9\n*E\n"})
    public static final class b extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f61244a;

        /* renamed from: b, reason: collision with root package name */
        public int f61245b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ byte[] f61247d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(byte[] bArr, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f61247d = bArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return BaseApplicationResponse.this.new b(this.f61247d, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0031, code lost:
        
            if (r11 == r0) goto L20;
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
                int r1 = r10.f61245b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r0 = r10.f61244a
                r1 = r0
                io.ktor.utils.io.m r1 = (io.ktor.utils.io.m) r1
                kotlin.e.n(r11)     // Catch: java.lang.Throwable -> L17
                goto L4a
            L17:
                r0 = move-exception
                r11 = r0
                goto L53
            L1a:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L22:
                kotlin.e.n(r11)
                goto L34
            L26:
                kotlin.e.n(r11)
                io.ktor.server.engine.BaseApplicationResponse r11 = io.ktor.server.engine.BaseApplicationResponse.this
                r10.f61245b = r3
                java.lang.Object r11 = r11.H(r10)
                if (r11 != r0) goto L34
                goto L48
            L34:
                r3 = r11
                io.ktor.utils.io.m r3 = (io.ktor.utils.io.m) r3
                byte[] r4 = r10.f61247d
                r10.f61244a = r3     // Catch: java.lang.Throwable -> L50
                r10.f61245b = r2     // Catch: java.lang.Throwable -> L50
                r5 = 0
                r6 = 0
                r8 = 6
                r9 = 0
                r7 = r10
                java.lang.Object r11 = io.ktor.utils.io.q.s(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L50
                if (r11 != r0) goto L49
            L48:
                return r0
            L49:
                r1 = r3
            L4a:
                io.ktor.utils.io.n.c(r1)
                yz.g2 r11 = yz.g2.f100423a
                return r11
            L50:
                r0 = move-exception
                r11 = r0
                r1 = r3
            L53:
                io.ktor.utils.io.q.e(r1, r11)     // Catch: java.lang.Throwable -> L57
                throw r11     // Catch: java.lang.Throwable -> L57
            L57:
                r0 = move-exception
                r11 = r0
                io.ktor.utils.io.n.c(r1)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.engine.BaseApplicationResponse.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.engine.BaseApplicationResponse", f = "BaseApplicationResponse.kt", i = {0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {212, R.styleable.Theme_drawable_review_sound, R.styleable.Theme_drawable_searchwords}, m = "respondFromChannel$suspendImpl", n = {"$this", "readChannel", "$this", "readChannel", "$this$use$iv", "length", "$this", "$this$use$iv", "length", "copied"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "J$0"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f61248a;

        /* renamed from: b, reason: collision with root package name */
        public Object f61249b;

        /* renamed from: c, reason: collision with root package name */
        public Object f61250c;

        /* renamed from: d, reason: collision with root package name */
        public Object f61251d;

        /* renamed from: e, reason: collision with root package name */
        public long f61252e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f61253f;

        /* renamed from: h, reason: collision with root package name */
        public int f61255h;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f61253f = obj;
            this.f61255h |= Integer.MIN_VALUE;
            return BaseApplicationResponse.y(BaseApplicationResponse.this, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.engine.BaseApplicationResponse$respondFromChannel$2$copied$1", f = "BaseApplicationResponse.kt", i = {}, l = {R.styleable.Theme_drawable_revocation}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements x00.p<c40.r0, j00.c<? super Long>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f61256a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.g f61257b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.m f61258c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Long f61259d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(io.ktor.utils.io.g gVar, io.ktor.utils.io.m mVar, Long l11, j00.c<? super d> cVar) {
            super(2, cVar);
            this.f61257b = gVar;
            this.f61258c = mVar;
            this.f61259d = l11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new d(this.f61257b, this.f61258c, this.f61259d, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super Long> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f61256a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            io.ktor.utils.io.g gVar = this.f61257b;
            io.ktor.utils.io.m mVar = this.f61258c;
            Long l12 = this.f61259d;
            long longValue = l12 != null ? l12.longValue() : Long.MAX_VALUE;
            this.f61256a = 1;
            Object g11 = io.ktor.utils.io.j.g(gVar, mVar, longValue, this);
            return g11 == l11 ? l11 : g11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.engine.BaseApplicationResponse", f = "BaseApplicationResponse.kt", i = {0, 1, 2, 3, 3, 4, 5}, l = {117, 126, 134, 144, 153, 156}, m = "respondOutgoingContent$suspendImpl", n = {"$this", "$this", "$this", "$this", "readChannel", "$this", "$this"}, s = {"L$0", "L$0", "L$0", "L$0", "L$1", "L$0", "L$0"})
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f61260a;

        /* renamed from: b, reason: collision with root package name */
        public Object f61261b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f61262c;

        /* renamed from: e, reason: collision with root package name */
        public int f61264e;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f61262c = obj;
            this.f61264e |= Integer.MIN_VALUE;
            return BaseApplicationResponse.C(BaseApplicationResponse.this, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.engine.BaseApplicationResponse", f = "BaseApplicationResponse.kt", i = {0, 1}, l = {173, 177}, m = "respondWriteChannelContent$suspendImpl", n = {"content", "$this$use$iv"}, s = {"L$0", "L$0"})
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f61265a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f61266b;

        /* renamed from: d, reason: collision with root package name */
        public int f61268d;

        public f(j00.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f61266b = obj;
            this.f61268d |= Integer.MIN_VALUE;
            return BaseApplicationResponse.G(BaseApplicationResponse.this, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.engine.BaseApplicationResponse$respondWriteChannelContent$2$1", f = "BaseApplicationResponse.kt", i = {}, l = {178}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f61269a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ v.f f61270b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.m f61271c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(v.f fVar, io.ktor.utils.io.m mVar, j00.c<? super g> cVar) {
            super(2, cVar);
            this.f61270b = fVar;
            this.f61271c = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new g(this.f61270b, this.f61271c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((g) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f61269a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                v.f fVar = this.f61270b;
                io.ktor.utils.io.m mVar = this.f61271c;
                this.f61269a = 1;
                if (fVar.m(mVar, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return yz.g2.f100423a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        h10.r rVar = null;
        h10.d d11 = kotlin.jvm.internal.o0.d(BaseApplicationResponse.class);
        try {
            rVar = kotlin.jvm.internal.o0.B(BaseApplicationResponse.class);
        } catch (Throwable unused) {
        }
        f61234h = new xy.a<>("EngineResponse", new gz.a(d11, rVar));
    }

    public BaseApplicationResponse(@m80.k zx.k0 call) {
        kotlin.jvm.internal.g0.p(call, "call");
        this.f61235a = call;
        this.f61238d = yz.e0.c(new x00.a() { // from class: io.ktor.server.engine.p
            @Override // x00.a
            public final Object invoke() {
                qy.p s11;
                s11 = BaseApplicationResponse.s(BaseApplicationResponse.this);
                return s11;
            }
        });
        qy.m mVar = new qy.m(call.w0().u());
        mVar.O(call.w0().j0());
        this.f61240f = mVar;
    }

    public static /* synthetic */ Object A(BaseApplicationResponse baseApplicationResponse, v.c cVar, j00.c<? super yz.g2> cVar2) {
        return yz.g2.f100423a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r4.D((mx.v.d) r5, r0) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        if (r4.u(r6, r0) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
    
        if (r4.F((mx.v.f) r5, r0) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c8, code lost:
    
        if (r4.z((mx.v.c) r5, r0) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00de, code lost:
    
        if (r4.B(r5, r0) == r1) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object C(io.ktor.server.engine.BaseApplicationResponse r4, mx.v r5, j00.c<? super yz.g2> r6) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.engine.BaseApplicationResponse.C(io.ktor.server.engine.BaseApplicationResponse, mx.v, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (c40.i.h(r8, r2, r0) != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        if (r8 == r1) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r6v0, types: [io.ktor.server.engine.BaseApplicationResponse] */
    /* JADX WARN: Type inference failed for: r6v1, types: [io.ktor.utils.io.m] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, yz.g2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object G(io.ktor.server.engine.BaseApplicationResponse r6, mx.v.f r7, j00.c<? super yz.g2> r8) {
        /*
            boolean r0 = r8 instanceof io.ktor.server.engine.BaseApplicationResponse.f
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.server.engine.BaseApplicationResponse$f r0 = (io.ktor.server.engine.BaseApplicationResponse.f) r0
            int r1 = r0.f61268d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f61268d = r1
            goto L18
        L13:
            io.ktor.server.engine.BaseApplicationResponse$f r0 = new io.ktor.server.engine.BaseApplicationResponse$f
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f61266b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f61268d
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L46
            if (r2 == r5) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r6 = r0.f61265a
            io.ktor.utils.io.m r6 = (io.ktor.utils.io.m) r6
            kotlin.e.n(r8)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            goto L6d
        L31:
            r7 = move-exception
            goto L79
        L33:
            r7 = move-exception
            goto L73
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            java.lang.Object r6 = r0.f61265a
            r7 = r6
            mx.v$f r7 = (mx.v.f) r7
            kotlin.e.n(r8)
            goto L54
        L46:
            kotlin.e.n(r8)
            r0.f61265a = r7
            r0.f61268d = r5
            java.lang.Object r8 = r6.H(r0)
            if (r8 != r1) goto L54
            goto L6c
        L54:
            r6 = r8
            io.ktor.utils.io.m r6 = (io.ktor.utils.io.m) r6
            c40.h1 r8 = c40.h1.f7863a     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            c40.m0 r8 = fy.b.e(r8)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            io.ktor.server.engine.BaseApplicationResponse$g r2 = new io.ktor.server.engine.BaseApplicationResponse$g     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            r2.<init>(r7, r6, r4)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            r0.f61265a = r6     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            r0.f61268d = r3     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            java.lang.Object r7 = c40.i.h(r8, r2, r0)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            if (r7 != r1) goto L6d
        L6c:
            return r1
        L6d:
            io.ktor.utils.io.n.c(r6)
            yz.g2 r6 = yz.g2.f100423a
            return r6
        L73:
            io.ktor.util.cio.ChannelWriteException r8 = new io.ktor.util.cio.ChannelWriteException     // Catch: java.lang.Throwable -> L31
            r8.<init>(r4, r7, r5, r4)     // Catch: java.lang.Throwable -> L31
            throw r8     // Catch: java.lang.Throwable -> L31
        L79:
            io.ktor.utils.io.q.e(r6, r7)     // Catch: java.lang.Throwable -> L7d
            throw r7     // Catch: java.lang.Throwable -> L7d
        L7d:
            r7 = move-exception
            io.ktor.utils.io.n.c(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.engine.BaseApplicationResponse.G(io.ktor.server.engine.BaseApplicationResponse, mx.v$f, j00.c):java.lang.Object");
    }

    public static final yz.g2 r(Ref.BooleanRef booleanRef, mx.v vVar, BaseApplicationResponse baseApplicationResponse, String name, List values) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(values, "values");
        ix.y0 y0Var = ix.y0.f63006a;
        if (kotlin.jvm.internal.g0.g(name, y0Var.G0())) {
            booleanRef.element = true;
        } else if (kotlin.jvm.internal.g0.g(name, y0Var.K0())) {
            if (!(vVar instanceof v.d)) {
                throw new InvalidHeaderForContent(y0Var.K0(), "non-upgrading response");
            }
            Iterator it = values.iterator();
            while (it.hasNext()) {
                baseApplicationResponse.a().b(name, (String) it.next(), false);
            }
            return yz.g2.f100423a;
        }
        Iterator it2 = values.iterator();
        while (it2.hasNext()) {
            qy.q.c(baseApplicationResponse.a(), name, (String) it2.next(), false, 4, null);
        }
        return yz.g2.f100423a;
    }

    public static final qy.p s(BaseApplicationResponse baseApplicationResponse) {
        return new qy.p(baseApplicationResponse);
    }

    public static /* synthetic */ Object v(BaseApplicationResponse baseApplicationResponse, byte[] bArr, j00.c<? super yz.g2> cVar) {
        String f11 = baseApplicationResponse.a().f(ix.y0.f63006a.z());
        if (f11 != null) {
            baseApplicationResponse.t(Long.parseLong(f11), bArr.length);
        }
        Object h11 = c40.i.h(c40.h1.g(), baseApplicationResponse.new b(bArr, null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : yz.g2.f100423a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x007d, code lost:
    
        if (r12 == r1) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c3 A[Catch: all -> 0x00ec, TRY_LEAVE, TryCatch #1 {all -> 0x00ec, blocks: (B:27:0x00bb, B:29:0x00c3), top: B:26:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0093 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:13:0x003a, B:14:0x00dc, B:23:0x005b, B:45:0x0083, B:47:0x0093, B:48:0x009d), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2, types: [io.ktor.utils.io.m] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object y(io.ktor.server.engine.BaseApplicationResponse r10, io.ktor.utils.io.g r11, j00.c<? super yz.g2> r12) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.engine.BaseApplicationResponse.y(io.ktor.server.engine.BaseApplicationResponse, io.ktor.utils.io.g, j00.c):java.lang.Object");
    }

    @m80.l
    public Object B(@m80.k mx.v vVar, @m80.k j00.c<? super yz.g2> cVar) {
        return C(this, vVar, cVar);
    }

    @m80.l
    public abstract Object D(@m80.k v.d dVar, @m80.k j00.c<? super yz.g2> cVar);

    @m80.l
    public Object F(@m80.k v.f fVar, @m80.k j00.c<? super yz.g2> cVar) {
        return G(this, fVar, cVar);
    }

    @m80.l
    public abstract Object H(@m80.k j00.c<? super io.ktor.utils.io.m> cVar);

    public abstract void J(@m80.k ix.g1 g1Var);

    @Override // qy.o
    @m80.k
    public final qy.m b() {
        return this.f61240f;
    }

    @Override // qy.a
    public /* bridge */ /* synthetic */ zx.b c() {
        return this.f61235a;
    }

    @Override // qy.a
    public boolean d() {
        return this.f61239e;
    }

    @Override // qy.a
    public final boolean e() {
        return this.f61237c;
    }

    @Override // qy.a
    @m80.k
    public qy.p getCookies() {
        return (qy.p) this.f61238d.getValue();
    }

    @Override // qy.a
    public void h(@m80.k ix.g1 value) {
        kotlin.jvm.internal.g0.p(value, "value");
        this.f61236b = value;
        J(value);
    }

    @Override // qy.a
    @qy.u
    public void i(@m80.k qy.s builder) {
        kotlin.jvm.internal.g0.p(builder, "builder");
        gy.e.b(this, builder.getUrl().c(), l1.b.f62933c);
    }

    @Override // qy.a
    @m80.l
    public ix.g1 l() {
        return this.f61236b;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(@m80.k final mx.v r8) {
        /*
            r7 = this;
            java.lang.String r0 = "content"
            kotlin.jvm.internal.g0.p(r8, r0)
            boolean r0 = r7.f61239e
            if (r0 != 0) goto Le5
            r0 = 1
            r7.f61239e = r0
            kotlin.jvm.internal.Ref$BooleanRef r1 = new kotlin.jvm.internal.Ref$BooleanRef
            r1.<init>()
            ix.g1 r2 = r8.h()
            if (r2 == 0) goto L1d
        L17:
            r7.h(r2)
            yz.g2 r2 = yz.g2.f100423a
            goto L2a
        L1d:
            ix.g1 r2 = r7.l()
            if (r2 != 0) goto L2a
            ix.g1$a r2 = ix.g1.f62797c
            ix.g1 r2 = r2.C()
            goto L17
        L2a:
            ix.q0 r2 = r8.d()
            io.ktor.server.engine.o r3 = new io.ktor.server.engine.o
            r3.<init>()
            r2.d(r3)
            java.lang.Long r2 = r8.a()
            r3 = 0
            if (r2 == 0) goto L53
            qy.q r1 = r7.a()
            ix.y0 r4 = ix.y0.f63006a
            java.lang.String r4 = r4.z()
            long r5 = r2.longValue()
            java.lang.String r2 = io.ktor.server.engine.y1.a(r5)
            r1.b(r4, r2, r3)
            goto L7e
        L53:
            boolean r1 = r1.element
            if (r1 != 0) goto L7e
            boolean r1 = r8 instanceof mx.v.d
            if (r1 != 0) goto L7e
            boolean r1 = r8 instanceof mx.v.c
            if (r1 == 0) goto L6f
            qy.q r1 = r7.a()
            ix.y0 r2 = ix.y0.f63006a
            java.lang.String r2 = r2.z()
            java.lang.String r4 = "0"
            r1.b(r2, r4, r3)
            goto L7e
        L6f:
            qy.q r1 = r7.a()
            ix.y0 r2 = ix.y0.f63006a
            java.lang.String r2 = r2.G0()
            java.lang.String r4 = "chunked"
            r1.b(r2, r4, r3)
        L7e:
            qy.q r1 = r7.a()
            ix.y0 r2 = ix.y0.f63006a
            java.lang.String r4 = r2.C()
            boolean r1 = r1.d(r4)
            if (r1 != 0) goto La3
            ix.k r8 = r8.b()
            if (r8 == 0) goto La3
            qy.q r1 = r7.a()
            java.lang.String r4 = r2.C()
            java.lang.String r8 = r8.toString()
            r1.b(r4, r8, r3)
        La3:
            zx.k0 r8 = r7.f61235a
            py.g r8 = r8.f()
            ix.q0 r8 = r8.a()
            java.lang.String r1 = r2.v()
            java.lang.String r8 = r8.get(r1)
            if (r8 == 0) goto Le4
            zx.k0 r1 = r7.f61235a
            qy.o r1 = r1.k()
            qy.q r1 = r1.a()
            java.lang.String r2 = r2.v()
            boolean r1 = r1.d(r2)
            if (r1 != 0) goto Le4
            java.lang.String r1 = "close"
            boolean r2 = u30.f0.c2(r8, r1, r0)
            java.lang.String r3 = "Connection"
            if (r2 == 0) goto Ld9
            qy.l.l(r7, r3, r1)
            return
        Ld9:
            java.lang.String r1 = "keep-alive"
            boolean r8 = u30.f0.c2(r8, r1, r0)
            if (r8 == 0) goto Le4
            qy.l.l(r7, r3, r1)
        Le4:
            return
        Le5:
            io.ktor.server.engine.BaseApplicationResponse$ResponseAlreadySentException r8 = new io.ktor.server.engine.BaseApplicationResponse$ResponseAlreadySentException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.engine.BaseApplicationResponse.p(mx.v):void");
    }

    public final void t(long j11, long j12) {
        if (j11 < j12) {
            throw new BodyLengthIsTooLong(j11);
        }
        if (j11 > j12) {
            throw new BodyLengthIsTooSmall(j11, j12);
        }
    }

    @m80.l
    public Object u(@m80.k byte[] bArr, @m80.k j00.c<? super yz.g2> cVar) {
        return v(this, bArr, cVar);
    }

    @m80.l
    public Object x(@m80.k io.ktor.utils.io.g gVar, @m80.k j00.c<? super yz.g2> cVar) {
        return y(this, gVar, cVar);
    }

    @m80.l
    public Object z(@m80.k v.c cVar, @m80.k j00.c<? super yz.g2> cVar2) {
        return A(this, cVar, cVar2);
    }

    @Override // qy.o, qy.a
    @m80.k
    public final zx.k0 c() {
        return this.f61235a;
    }
}
