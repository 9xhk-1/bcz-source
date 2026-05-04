package rw;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nHttpSend.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpSend.kt\nio/ktor/client/plugins/HttpSend\n+ 2 Attributes.kt\nio/ktor/util/AttributesKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,138:1\n18#2:139\n58#3,16:140\n*S KotlinDebug\n*F\n+ 1 HttpSend.kt\nio/ktor/client/plugins/HttpSend\n*L\n59#1:139\n59#1:140,16\n*E\n"})
/* loaded from: classes8.dex */
public final class a1 {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final d f84565c = new d(0 == true ? 1 : 0);

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final xy.a<a1> f84566d;

    /* renamed from: a, reason: collision with root package name */
    public final int f84567a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<x00.q<m1, cx.y, j00.c<? super mw.a>, Object>> f84568b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @io.ktor.utils.io.c0
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f84569a = 20;

        public final int a() {
            return this.f84569a;
        }

        public final void b(int i11) {
            this.f84569a = i11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements m1 {

        /* renamed from: a, reason: collision with root package name */
        public final int f84570a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final lw.c f84571b;

        /* renamed from: c, reason: collision with root package name */
        public int f84572c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public mw.a f84573d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.client.plugins.HttpSend$DefaultSender", f = "HttpSend.kt", i = {0}, l = {118}, m = "execute", n = {"this"}, s = {"L$0"})
        public static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            public Object f84574a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f84575b;

            /* renamed from: d, reason: collision with root package name */
            public int f84577d;

            public a(j00.c<? super a> cVar) {
                super(cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @m80.l
            public final Object invokeSuspend(@m80.k Object obj) {
                this.f84575b = obj;
                this.f84577d |= Integer.MIN_VALUE;
                return b.this.a(null, this);
            }
        }

        public b(int i11, @m80.k lw.c client) {
            kotlin.jvm.internal.g0.p(client, "client");
            this.f84570a = i11;
            this.f84571b = client;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // rw.m1
        @m80.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@m80.k cx.y r6, @m80.k j00.c<? super mw.a> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof rw.a1.b.a
                if (r0 == 0) goto L13
                r0 = r7
                rw.a1$b$a r0 = (rw.a1.b.a) r0
                int r1 = r0.f84577d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f84577d = r1
                goto L18
            L13:
                rw.a1$b$a r0 = new rw.a1$b$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f84575b
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f84577d
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L36
                if (r2 != r4) goto L2e
                java.lang.Object r6 = r0.f84574a
                rw.a1$b r6 = (rw.a1.b) r6
                kotlin.e.n(r7)
                goto L5f
            L2e:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L36:
                kotlin.e.n(r7)
                mw.a r7 = r5.f84573d
                if (r7 == 0) goto L40
                c40.s0.f(r7, r3, r4, r3)
            L40:
                int r7 = r5.f84572c
                int r2 = r5.f84570a
                if (r7 >= r2) goto L86
                int r7 = r7 + r4
                r5.f84572c = r7
                lw.c r7 = r5.f84571b
                cx.g0 r7 = r7.v0()
                java.lang.Object r2 = r6.e()
                r0.f84574a = r5
                r0.f84577d = r4
                java.lang.Object r7 = r7.p(r6, r2, r0)
                if (r7 != r1) goto L5e
                return r1
            L5e:
                r6 = r5
            L5f:
                boolean r0 = r7 instanceof mw.a
                if (r0 == 0) goto L66
                r3 = r7
                mw.a r3 = (mw.a) r3
            L66:
                if (r3 == 0) goto L6b
                r6.f84573d = r3
                return r3
            L6b:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Failed to execute send pipeline. Expected [HttpClientCall], but received "
                r0.append(r1)
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                java.lang.String r7 = r7.toString()
                r6.<init>(r7)
                throw r6
            L86:
                io.ktor.client.plugins.SendCountExceedException r6 = new io.ktor.client.plugins.SendCountExceedException
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r0 = "Max send count "
                r7.append(r0)
                int r0 = r5.f84570a
                r7.append(r0)
                java.lang.String r0 = " exceeded. Consider increasing the property maxSendCount if more is required."
                r7.append(r0)
                java.lang.String r7 = r7.toString()
                r6.<init>(r7)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: rw.a1.b.a(cx.y, j00.c):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements m1 {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final x00.q<m1, cx.y, j00.c<? super mw.a>, Object> f84578a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final m1 f84579b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@m80.k x00.q<? super m1, ? super cx.y, ? super j00.c<? super mw.a>, ? extends Object> interceptor, @m80.k m1 nextSender) {
            kotlin.jvm.internal.g0.p(interceptor, "interceptor");
            kotlin.jvm.internal.g0.p(nextSender, "nextSender");
            this.f84578a = interceptor;
            this.f84579b = nextSender;
        }

        @Override // rw.m1
        @m80.l
        public Object a(@m80.k cx.y yVar, @m80.k j00.c<? super mw.a> cVar) {
            return this.f84578a.invoke(this.f84579b, yVar, cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d implements y<a, a1> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.client.plugins.HttpSend$Plugin$install$1", f = "HttpSend.kt", i = {0}, l = {84, 85}, m = "invokeSuspend", n = {"$this$intercept"}, s = {"L$0"})
        @kotlin.jvm.internal.u0({"SMAP\nHttpSend.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpSend.kt\nio/ktor/client/plugins/HttpSend$Plugin$install$1\n+ 2 RequestBody.kt\nio/ktor/client/request/RequestBodyKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,138:1\n16#2,4:139\n21#2,10:159\n58#3,16:143\n*S KotlinDebug\n*F\n+ 1 HttpSend.kt\nio/ktor/client/plugins/HttpSend$Plugin$install$1\n*L\n77#1:139,4\n77#1:159,10\n77#1:143,16\n*E\n"})
        public static final class a extends SuspendLambda implements x00.q<io.ktor.util.pipeline.d<Object, cx.y>, Object, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f84580a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f84581b;

            /* renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f84582c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a1 f84583d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ lw.c f84584e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(a1 a1Var, lw.c cVar, j00.c<? super a> cVar2) {
                super(3, cVar2);
                this.f84583d = a1Var;
                this.f84584e = cVar;
            }

            @Override // x00.q
            public final Object invoke(io.ktor.util.pipeline.d<Object, cx.y> dVar, Object obj, j00.c<? super g2> cVar) {
                a aVar = new a(this.f84583d, this.f84584e, cVar);
                aVar.f84581b = dVar;
                aVar.f84582c = obj;
                return aVar.invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0089, code lost:
            
                if (r1.i((mw.a) r9, r8) == r0) goto L21;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x008b, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
            
                if (r9 == r0) goto L21;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r8.f84580a
                    r2 = 2
                    r3 = 1
                    r4 = 0
                    if (r1 == 0) goto L24
                    if (r1 == r3) goto L1c
                    if (r1 != r2) goto L14
                    kotlin.e.n(r9)
                    goto L8c
                L14:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L1c:
                    java.lang.Object r1 = r8.f84581b
                    io.ktor.util.pipeline.d r1 = (io.ktor.util.pipeline.d) r1
                    kotlin.e.n(r9)
                    goto L7f
                L24:
                    kotlin.e.n(r9)
                    java.lang.Object r9 = r8.f84581b
                    r1 = r9
                    io.ktor.util.pipeline.d r1 = (io.ktor.util.pipeline.d) r1
                    java.lang.Object r9 = r8.f84582c
                    boolean r5 = r9 instanceof mx.v
                    if (r5 == 0) goto L8f
                    java.lang.Object r5 = r1.d()
                    cx.y r5 = (cx.y) r5
                    r5.l(r9)
                    r5.m(r4)
                    rw.a1$b r9 = new rw.a1$b
                    rw.a1 r5 = r8.f84583d
                    int r5 = rw.a1.c(r5)
                    lw.c r6 = r8.f84584e
                    r9.<init>(r5, r6)
                    rw.a1 r5 = r8.f84583d
                    java.util.List r5 = rw.a1.a(r5)
                    java.lang.Iterable r5 = (java.lang.Iterable) r5
                    java.util.List r5 = a00.r0.c5(r5)
                    java.util.Iterator r5 = r5.iterator()
                L5b:
                    boolean r6 = r5.hasNext()
                    if (r6 == 0) goto L6e
                    java.lang.Object r6 = r5.next()
                    x00.q r6 = (x00.q) r6
                    rw.a1$c r7 = new rw.a1$c
                    r7.<init>(r6, r9)
                    r9 = r7
                    goto L5b
                L6e:
                    java.lang.Object r5 = r1.d()
                    cx.y r5 = (cx.y) r5
                    r8.f84581b = r1
                    r8.f84580a = r3
                    java.lang.Object r9 = r9.a(r5, r8)
                    if (r9 != r0) goto L7f
                    goto L8b
                L7f:
                    mw.a r9 = (mw.a) r9
                    r8.f84581b = r4
                    r8.f84580a = r2
                    java.lang.Object r9 = r1.i(r9, r8)
                    if (r9 != r0) goto L8c
                L8b:
                    return r0
                L8c:
                    yz.g2 r9 = yz.g2.f100423a
                    return r9
                L8f:
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r2 = "\n|Fail to prepare request body for sending. \n|The body type is: "
                    r0.append(r2)
                    java.lang.Class r9 = r9.getClass()
                    h10.d r9 = kotlin.jvm.internal.o0.d(r9)
                    r0.append(r9)
                    java.lang.String r9 = ", with Content-Type: "
                    r0.append(r9)
                    java.lang.Object r9 = r1.d()
                    ix.b1 r9 = (ix.b1) r9
                    ix.k r9 = ix.d1.g(r9)
                    r0.append(r9)
                    java.lang.String r9 = ".\n|\n|If you expect serialized body, please check that you have installed the corresponding plugin(like `ContentNegotiation`) and set `Content-Type` header."
                    r0.append(r9)
                    java.lang.String r9 = r0.toString()
                    java.lang.String r9 = u30.y.x(r9, r4, r3, r4)
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r9 = r9.toString()
                    r0.<init>(r9)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: rw.a1.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public /* synthetic */ d(kotlin.jvm.internal.v vVar) {
            this();
        }

        @Override // rw.y
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(@m80.k a1 plugin, @m80.k lw.c scope) {
            kotlin.jvm.internal.g0.p(plugin, "plugin");
            kotlin.jvm.internal.g0.p(scope, "scope");
            scope.m0().C(cx.e0.f46866h.c(), new a(plugin, scope, null));
        }

        @Override // rw.y
        @m80.k
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a1 a(@m80.k x00.l<? super a, g2> block) {
            kotlin.jvm.internal.g0.p(block, "block");
            a aVar = new a();
            block.invoke(aVar);
            return new a1(aVar.a(), null);
        }

        @Override // rw.y
        @m80.k
        public xy.a<a1> getKey() {
            return a1.f84566d;
        }

        public d() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        h10.r rVar = null;
        h10.d d11 = kotlin.jvm.internal.o0.d(a1.class);
        try {
            rVar = kotlin.jvm.internal.o0.B(a1.class);
        } catch (Throwable unused) {
        }
        f84566d = new xy.a<>("HttpSend", new gz.a(d11, rVar));
    }

    public /* synthetic */ a1(int i11, kotlin.jvm.internal.v vVar) {
        this(i11);
    }

    public final void d(@m80.k x00.q<? super m1, ? super cx.y, ? super j00.c<? super mw.a>, ? extends Object> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        this.f84568b.add(block);
    }

    public a1(int i11) {
        this.f84567a = i11;
        this.f84568b = new ArrayList();
    }

    public /* synthetic */ a1(int i11, int i12, kotlin.jvm.internal.v vVar) {
        this((i12 & 1) != 0 ? 20 : i11);
    }
}
