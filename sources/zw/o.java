package zw;

import c40.r0;
import com.baicizhan.client.business.webview.JsonParams;
import cx.d0;
import cx.y;
import io.ktor.client.plugins.sse.SSEClientException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import rw.z;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nbuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 builders.kt\nio/ktor/client/plugins/sse/BuildersKt\n+ 2 builders.kt\nio/ktor/client/request/BuildersKt\n+ 3 Attributes.kt\nio/ktor/util/AttributesKt\n+ 4 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,254:1\n40#2:255\n26#2:256\n18#3:257\n18#3:274\n18#3:291\n18#3:308\n58#4,16:258\n58#4,16:275\n58#4,16:292\n58#4,16:309\n*S KotlinDebug\n*F\n+ 1 builders.kt\nio/ktor/client/plugins/sse/BuildersKt\n*L\n42#1:255\n42#1:256\n16#1:257\n17#1:274\n18#1:291\n19#1:308\n16#1:258,16\n17#1:275,16\n18#1:292,16\n19#1:309,16\n*E\n"})
/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final xy.a<Boolean> f102947a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final xy.a<kotlin.time.e> f102948b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final xy.a<Boolean> f102949c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final xy.a<Boolean> f102950d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.sse.BuildersKt", f = "builders.kt", i = {0, 1}, l = {105, 107}, m = "serverSentEvents-mY9Nd3A", n = {"block", JsonParams.ShareResultO.CHANNEL_WEIXIN}, s = {"L$0", "L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f102951a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f102952b;

        /* renamed from: c, reason: collision with root package name */
        public int f102953c;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f102952b = obj;
            this.f102953c |= Integer.MIN_VALUE;
            return o.A(null, null, null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.sse.BuildersKt$serverSentEventsSession$2", f = "builders.kt", i = {0, 1, 1}, l = {258, 261, 280, 280}, m = "invokeSuspend", n = {"this_$iv", "this_$iv", "response$iv"}, s = {"L$0", "L$0", "L$2"})
    @u0({"SMAP\nbuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 builders.kt\nio/ktor/client/plugins/sse/BuildersKt$serverSentEventsSession$2\n+ 2 HttpStatement.kt\nio/ktor/client/statement/HttpStatement\n+ 3 HttpTimeout.kt\nio/ktor/client/plugins/HttpTimeoutKt\n+ 4 HttpClientCall.kt\nio/ktor/client/call/HttpClientCallKt\n+ 5 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,254:1\n83#2:255\n84#2,3:258\n87#2,3:278\n278#3,2:256\n280#3,2:281\n142#4:261\n58#5,16:262\n*S KotlinDebug\n*F\n+ 1 builders.kt\nio/ktor/client/plugins/sse/BuildersKt$serverSentEventsSession$2\n*L\n52#1:255\n52#1:258,3\n52#1:278,3\n52#1:256,2\n52#1:281,2\n52#1:261\n52#1:262,16\n*E\n"})
    public static final class b extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f102954a;

        /* renamed from: b, reason: collision with root package name */
        public Object f102955b;

        /* renamed from: c, reason: collision with root package name */
        public Object f102956c;

        /* renamed from: d, reason: collision with root package name */
        public int f102957d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ex.g f102958e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ c40.x<p> f102959f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ex.g gVar, c40.x<p> xVar, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f102958e = gVar;
            this.f102959f = xVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new b(this.f102958e, this.f102959f, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(1:2)|(1:(1:(1:(1:(2:8|9)(3:11|12|13))(4:14|15|16|17))(4:18|19|20|(2:22|23)(2:26|27)))(2:32|33))(4:47|48|49|(2:51|25)(1:52))|34|35|36|37|38|39|(2:41|(0)(0))|25|(2:(0)|(0))) */
        /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|2|(1:(1:(1:(1:(2:8|9)(3:11|12|13))(4:14|15|16|17))(4:18|19|20|(2:22|23)(2:26|27)))(2:32|33))(4:47|48|49|(2:51|25)(1:52))|34|35|36|37|38|39|(2:41|(0)(0))|25|(2:(0)|(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00ad, code lost:
        
            if (r5.c(r0, r12) == r1) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00c6, code lost:
        
            if (r5.c(r13, r12) == r1) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x007f, code lost:
        
            r0 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00b8, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00b9, code lost:
        
            r5 = r6;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x009a A[Catch: all -> 0x0047, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0047, blocks: (B:20:0x0043, B:22:0x009a, B:26:0x00b0, B:27:0x00b7), top: B:19:0x0043 }] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00b0 A[Catch: all -> 0x0047, TRY_ENTER, TryCatch #2 {all -> 0x0047, blocks: (B:20:0x0043, B:22:0x009a, B:26:0x00b0, B:27:0x00b7), top: B:19:0x0043 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 227
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: zw.o.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        h10.r rVar;
        h10.r rVar2;
        h10.r rVar3;
        Class cls = Boolean.TYPE;
        h10.d d11 = o0.d(Boolean.class);
        h10.r rVar4 = null;
        try {
            rVar = o0.B(cls);
        } catch (Throwable unused) {
            rVar = null;
        }
        f102947a = new xy.a<>("SSERequestFlag", new gz.a(d11, rVar));
        h10.d d12 = o0.d(kotlin.time.e.class);
        try {
            rVar2 = o0.B(kotlin.time.e.class);
        } catch (Throwable unused2) {
            rVar2 = null;
        }
        f102948b = new xy.a<>("SSEReconnectionTime", new gz.a(d12, rVar2));
        h10.d d13 = o0.d(Boolean.class);
        try {
            rVar3 = o0.B(cls);
        } catch (Throwable unused3) {
            rVar3 = null;
        }
        f102949c = new xy.a<>("SSEShowCommentEvents", new gz.a(d13, rVar3));
        h10.d d14 = o0.d(Boolean.class);
        try {
            rVar4 = o0.B(cls);
        } catch (Throwable unused4) {
        }
        f102950d = new xy.a<>("SSEShowRetryEvents", new gz.a(d14, rVar4));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004d  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A(@m80.k lw.c r12, @m80.k x00.l<? super cx.y, yz.g2> r13, @m80.l kotlin.time.e r14, @m80.l java.lang.Boolean r15, @m80.l java.lang.Boolean r16, @m80.k x00.p<? super zw.p, ? super j00.c<? super yz.g2>, ? extends java.lang.Object> r17, @m80.k j00.c<? super yz.g2> r18) {
        /*
            r0 = r18
            boolean r1 = r0 instanceof zw.o.a
            if (r1 == 0) goto L16
            r1 = r0
            zw.o$a r1 = (zw.o.a) r1
            int r2 = r1.f102953c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f102953c = r2
        L14:
            r7 = r1
            goto L1c
        L16:
            zw.o$a r1 = new zw.o$a
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r7.f102952b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r7.f102953c
            r8 = 2
            r9 = 0
            r10 = 1
            if (r2 == 0) goto L4d
            if (r2 == r10) goto L45
            if (r2 != r8) goto L3d
            java.lang.Object r12 = r7.f102951a
            zw.p r12 = (zw.p) r12
            kotlin.e.n(r0)     // Catch: java.lang.Throwable -> L35 java.util.concurrent.CancellationException -> L39
            goto L75
        L35:
            r0 = move-exception
            r13 = r0
            goto L87
        L39:
            r0 = move-exception
            r13 = r0
            goto L97
        L3d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L45:
            java.lang.Object r12 = r7.f102951a
            x00.p r12 = (x00.p) r12
            kotlin.e.n(r0)
            goto L66
        L4d:
            kotlin.e.n(r0)
            r0 = r17
            r7.f102951a = r0
            r7.f102953c = r10
            r2 = r12
            r6 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            java.lang.Object r12 = C(r2, r3, r4, r5, r6, r7)
            if (r12 != r1) goto L63
            goto L73
        L63:
            r11 = r0
            r0 = r12
            r12 = r11
        L66:
            r13 = r0
            zw.p r13 = (zw.p) r13
            r7.f102951a = r13     // Catch: java.lang.Throwable -> L7b java.util.concurrent.CancellationException -> L81
            r7.f102953c = r8     // Catch: java.lang.Throwable -> L7b java.util.concurrent.CancellationException -> L81
            java.lang.Object r12 = r12.invoke(r13, r7)     // Catch: java.lang.Throwable -> L7b java.util.concurrent.CancellationException -> L81
            if (r12 != r1) goto L74
        L73:
            return r1
        L74:
            r12 = r13
        L75:
            c40.s0.f(r12, r9, r10, r9)
            yz.g2 r12 = yz.g2.f100423a
            return r12
        L7b:
            r0 = move-exception
            r12 = r0
            r11 = r13
            r13 = r12
            r12 = r11
            goto L87
        L81:
            r0 = move-exception
            r12 = r0
            r11 = r13
            r13 = r12
            r12 = r11
            goto L97
        L87:
            mw.a r14 = r12.c()     // Catch: java.lang.Throwable -> L94
            ex.c r14 = r14.i()     // Catch: java.lang.Throwable -> L94
            java.lang.Throwable r13 = v(r14, r13)     // Catch: java.lang.Throwable -> L94
            throw r13     // Catch: java.lang.Throwable -> L94
        L94:
            r0 = move-exception
            r13 = r0
            goto L98
        L97:
            throw r13     // Catch: java.lang.Throwable -> L94
        L98:
            c40.s0.f(r12, r9, r10, r9)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: zw.o.A(lw.c, x00.l, kotlin.time.e, java.lang.Boolean, java.lang.Boolean, x00.p, j00.c):java.lang.Object");
    }

    public static /* synthetic */ Object B(lw.c cVar, x00.l lVar, kotlin.time.e eVar, Boolean bool, Boolean bool2, x00.p pVar, j00.c cVar2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            eVar = null;
        }
        if ((i11 & 4) != 0) {
            bool = null;
        }
        if ((i11 & 8) != 0) {
            bool2 = null;
        }
        return A(cVar, lVar, eVar, bool, bool2, pVar, cVar2);
    }

    @m80.l
    public static final Object C(@m80.k lw.c cVar, @m80.l kotlin.time.e eVar, @m80.l Boolean bool, @m80.l Boolean bool2, @m80.k x00.l<? super y, g2> lVar, @m80.k j00.c<? super p> cVar2) {
        z.b(cVar, w.f());
        c40.x c11 = c40.z.c(null, 1, null);
        y yVar = new y();
        lVar.invoke(yVar);
        q(yVar, f102947a, l00.a.a(true));
        q(yVar, f102948b, eVar);
        q(yVar, f102949c, bool);
        q(yVar, f102950d, bool2);
        c40.k.f(cVar, null, null, new b(new ex.g(yVar, cVar), c11, null), 3, null);
        return c11.i(cVar2);
    }

    public static /* synthetic */ Object D(lw.c cVar, kotlin.time.e eVar, Boolean bool, Boolean bool2, x00.l lVar, j00.c cVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            eVar = null;
        }
        if ((i11 & 2) != 0) {
            bool = null;
        }
        if ((i11 & 4) != 0) {
            bool2 = null;
        }
        return C(cVar, eVar, bool, bool2, lVar, cVar2);
    }

    @m80.l
    public static final Object E(@m80.k lw.c cVar, @m80.k final String str, @m80.l kotlin.time.e eVar, @m80.l Boolean bool, @m80.l Boolean bool2, @m80.k final x00.l<? super y, g2> lVar, @m80.k j00.c<? super p> cVar2) {
        return C(cVar, eVar, bool, bool2, new x00.l() { // from class: zw.e
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 J;
                J = o.J(str, lVar, (y) obj);
                return J;
            }
        }, cVar2);
    }

    public static /* synthetic */ Object F(lw.c cVar, String str, kotlin.time.e eVar, Boolean bool, Boolean bool2, x00.l lVar, j00.c cVar2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            eVar = null;
        }
        if ((i11 & 4) != 0) {
            bool = null;
        }
        if ((i11 & 8) != 0) {
            bool2 = null;
        }
        if ((i11 & 16) != 0) {
            lVar = new x00.l() { // from class: zw.j
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 I;
                    I = o.I((y) obj2);
                    return I;
                }
            };
        }
        return E(cVar, str, eVar, bool, bool2, lVar, cVar2);
    }

    @m80.l
    public static final Object G(@m80.k lw.c cVar, @m80.l final String str, @m80.l final String str2, @m80.l final Integer num, @m80.l final String str3, @m80.l kotlin.time.e eVar, @m80.l Boolean bool, @m80.l Boolean bool2, @m80.k final x00.l<? super y, g2> lVar, @m80.k j00.c<? super p> cVar2) {
        return C(cVar, eVar, bool, bool2, new x00.l() { // from class: zw.k
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 L;
                L = o.L(str, str2, num, str3, lVar, (y) obj);
                return L;
            }
        }, cVar2);
    }

    public static /* synthetic */ Object H(lw.c cVar, String str, String str2, Integer num, String str3, kotlin.time.e eVar, Boolean bool, Boolean bool2, x00.l lVar, j00.c cVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            num = null;
        }
        if ((i11 & 8) != 0) {
            str3 = null;
        }
        if ((i11 & 16) != 0) {
            eVar = null;
        }
        if ((i11 & 32) != 0) {
            bool = null;
        }
        if ((i11 & 64) != 0) {
            bool2 = null;
        }
        if ((i11 & 128) != 0) {
            lVar = new x00.l() { // from class: zw.f
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 K;
                    K = o.K((y) obj2);
                    return K;
                }
            };
        }
        return G(cVar, str, str2, num, str3, eVar, bool, bool2, lVar, cVar2);
    }

    public static final g2 I(y yVar) {
        g0.p(yVar, "<this>");
        return g2.f100423a;
    }

    public static final g2 J(String str, x00.l lVar, y serverSentEventsSession) {
        g0.p(serverSentEventsSession, "$this$serverSentEventsSession");
        ix.g2.m(serverSentEventsSession.j(), str);
        lVar.invoke(serverSentEventsSession);
        return g2.f100423a;
    }

    public static final g2 K(y yVar) {
        g0.p(yVar, "<this>");
        return g2.f100423a;
    }

    public static final g2 L(String str, String str2, Integer num, String str3, x00.l lVar, y serverSentEventsSession) {
        g0.p(serverSentEventsSession, "$this$serverSentEventsSession");
        d0.q(serverSentEventsSession, str, str2, num, str3, null, 16, null);
        lVar.invoke(serverSentEventsSession);
        return g2.f100423a;
    }

    public static final g2 M(y yVar) {
        g0.p(yVar, "<this>");
        return g2.f100423a;
    }

    public static final g2 N(String str, String str2, Integer num, String str3, x00.l lVar, y serverSentEvents) {
        g0.p(serverSentEvents, "$this$serverSentEvents");
        d0.q(serverSentEvents, str, str2, num, str3, null, 16, null);
        lVar.invoke(serverSentEvents);
        return g2.f100423a;
    }

    public static final g2 O(y yVar) {
        g0.p(yVar, "<this>");
        return g2.f100423a;
    }

    public static final g2 P(String str, x00.l lVar, y serverSentEvents) {
        g0.p(serverSentEvents, "$this$serverSentEvents");
        ix.g2.m(serverSentEvents.j(), str);
        lVar.invoke(serverSentEvents);
        return g2.f100423a;
    }

    @m80.l
    public static final Object Q(@m80.k lw.c cVar, @m80.k String str, @m80.k x00.l<? super y, g2> lVar, @m80.l kotlin.time.e eVar, @m80.l Boolean bool, @m80.l Boolean bool2, @m80.k x00.p<? super p, ? super j00.c<? super g2>, ? extends Object> pVar, @m80.k j00.c<? super g2> cVar2) {
        Object y11 = y(cVar, str, eVar, bool, bool2, lVar, pVar, cVar2);
        return y11 == kotlin.coroutines.intrinsics.b.l() ? y11 : g2.f100423a;
    }

    public static /* synthetic */ Object R(lw.c cVar, String str, x00.l lVar, kotlin.time.e eVar, Boolean bool, Boolean bool2, x00.p pVar, j00.c cVar2, int i11, Object obj) {
        Boolean bool3;
        lw.c cVar3;
        String str2;
        x00.p pVar2;
        j00.c cVar4;
        if ((i11 & 2) != 0) {
            lVar = new x00.l() { // from class: zw.h
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 e02;
                    e02 = o.e0((y) obj2);
                    return e02;
                }
            };
        }
        x00.l lVar2 = lVar;
        kotlin.time.e eVar2 = (i11 & 4) != 0 ? null : eVar;
        Boolean bool4 = (i11 & 8) != 0 ? null : bool;
        if ((i11 & 16) != 0) {
            bool3 = null;
            str2 = str;
            pVar2 = pVar;
            cVar4 = cVar2;
            cVar3 = cVar;
        } else {
            bool3 = bool2;
            cVar3 = cVar;
            str2 = str;
            pVar2 = pVar;
            cVar4 = cVar2;
        }
        return Q(cVar3, str2, lVar2, eVar2, bool4, bool3, pVar2, cVar4);
    }

    @m80.l
    public static final Object S(@m80.k lw.c cVar, @m80.k x00.l<? super y, g2> lVar, @m80.l kotlin.time.e eVar, @m80.l Boolean bool, @m80.l Boolean bool2, @m80.k x00.p<? super p, ? super j00.c<? super g2>, ? extends Object> pVar, @m80.k j00.c<? super g2> cVar2) {
        Object A = A(cVar, lVar, eVar, bool, bool2, pVar, cVar2);
        return A == kotlin.coroutines.intrinsics.b.l() ? A : g2.f100423a;
    }

    public static /* synthetic */ Object T(lw.c cVar, x00.l lVar, kotlin.time.e eVar, Boolean bool, Boolean bool2, x00.p pVar, j00.c cVar2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            eVar = null;
        }
        if ((i11 & 4) != 0) {
            bool = null;
        }
        if ((i11 & 8) != 0) {
            bool2 = null;
        }
        return S(cVar, lVar, eVar, bool, bool2, pVar, cVar2);
    }

    @m80.l
    public static final Object U(@m80.k lw.c cVar, @m80.l String str, @m80.l String str2, @m80.l Integer num, @m80.l String str3, @m80.k x00.l<? super y, g2> lVar, @m80.l kotlin.time.e eVar, @m80.l Boolean bool, @m80.l Boolean bool2, @m80.k x00.p<? super p, ? super j00.c<? super g2>, ? extends Object> pVar, @m80.k j00.c<? super g2> cVar2) {
        Object w11 = w(cVar, str, str2, num, str3, eVar, bool, bool2, lVar, pVar, cVar2);
        return w11 == kotlin.coroutines.intrinsics.b.l() ? w11 : g2.f100423a;
    }

    public static /* synthetic */ Object V(lw.c cVar, String str, String str2, Integer num, String str3, x00.l lVar, kotlin.time.e eVar, Boolean bool, Boolean bool2, x00.p pVar, j00.c cVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            num = null;
        }
        if ((i11 & 8) != 0) {
            str3 = null;
        }
        if ((i11 & 16) != 0) {
            lVar = new x00.l() { // from class: zw.d
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 f02;
                    f02 = o.f0((y) obj2);
                    return f02;
                }
            };
        }
        if ((i11 & 32) != 0) {
            eVar = null;
        }
        if ((i11 & 64) != 0) {
            bool = null;
        }
        if ((i11 & 128) != 0) {
            bool2 = null;
        }
        return U(cVar, str, str2, num, str3, lVar, eVar, bool, bool2, pVar, cVar2);
    }

    @m80.l
    public static final Object W(@m80.k lw.c cVar, @m80.l kotlin.time.e eVar, @m80.l Boolean bool, @m80.l Boolean bool2, @m80.k x00.l<? super y, g2> lVar, @m80.k j00.c<? super p> cVar2) {
        return C(cVar, eVar, bool, bool2, lVar, cVar2);
    }

    public static /* synthetic */ Object X(lw.c cVar, kotlin.time.e eVar, Boolean bool, Boolean bool2, x00.l lVar, j00.c cVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            eVar = null;
        }
        if ((i11 & 2) != 0) {
            bool = null;
        }
        if ((i11 & 4) != 0) {
            bool2 = null;
        }
        return W(cVar, eVar, bool, bool2, lVar, cVar2);
    }

    @m80.l
    public static final Object Y(@m80.k lw.c cVar, @m80.k String str, @m80.l kotlin.time.e eVar, @m80.l Boolean bool, @m80.l Boolean bool2, @m80.k x00.l<? super y, g2> lVar, @m80.k j00.c<? super p> cVar2) {
        return E(cVar, str, eVar, bool, bool2, lVar, cVar2);
    }

    public static /* synthetic */ Object Z(lw.c cVar, String str, kotlin.time.e eVar, Boolean bool, Boolean bool2, x00.l lVar, j00.c cVar2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            eVar = null;
        }
        if ((i11 & 4) != 0) {
            bool = null;
        }
        if ((i11 & 8) != 0) {
            bool2 = null;
        }
        if ((i11 & 16) != 0) {
            lVar = new x00.l() { // from class: zw.i
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 c02;
                    c02 = o.c0((y) obj2);
                    return c02;
                }
            };
        }
        return Y(cVar, str, eVar, bool, bool2, lVar, cVar2);
    }

    @m80.l
    public static final Object a0(@m80.k lw.c cVar, @m80.l String str, @m80.l String str2, @m80.l Integer num, @m80.l String str3, @m80.l kotlin.time.e eVar, @m80.l Boolean bool, @m80.l Boolean bool2, @m80.k x00.l<? super y, g2> lVar, @m80.k j00.c<? super p> cVar2) {
        return G(cVar, str, str2, num, str3, eVar, bool, bool2, lVar, cVar2);
    }

    public static /* synthetic */ Object b0(lw.c cVar, String str, String str2, Integer num, String str3, kotlin.time.e eVar, Boolean bool, Boolean bool2, x00.l lVar, j00.c cVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            num = null;
        }
        if ((i11 & 8) != 0) {
            str3 = null;
        }
        if ((i11 & 16) != 0) {
            eVar = null;
        }
        if ((i11 & 32) != 0) {
            bool = null;
        }
        if ((i11 & 64) != 0) {
            bool2 = null;
        }
        if ((i11 & 128) != 0) {
            lVar = new x00.l() { // from class: zw.g
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 d02;
                    d02 = o.d0((y) obj2);
                    return d02;
                }
            };
        }
        return a0(cVar, str, str2, num, str3, eVar, bool, bool2, lVar, cVar2);
    }

    public static final g2 c0(y yVar) {
        g0.p(yVar, "<this>");
        return g2.f100423a;
    }

    public static final g2 d0(y yVar) {
        g0.p(yVar, "<this>");
        return g2.f100423a;
    }

    public static final g2 e0(y yVar) {
        g0.p(yVar, "<this>");
        return g2.f100423a;
    }

    public static final g2 f0(y yVar) {
        g0.p(yVar, "<this>");
        return g2.f100423a;
    }

    public static final void n(@m80.k lw.j<?> jVar, @m80.k final x00.l<? super u, g2> config) {
        g0.p(jVar, "<this>");
        g0.p(config, "config");
        jVar.s(w.f(), new x00.l() { // from class: zw.m
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 o11;
                o11 = o.o(x00.l.this, (u) obj);
                return o11;
            }
        });
    }

    public static final g2 o(x00.l lVar, u install) {
        g0.p(install, "$this$install");
        lVar.invoke(install);
        return g2.f100423a;
    }

    public static final <T> void q(y yVar, xy.a<T> aVar, T t11) {
        if (t11 != null) {
            yVar.d().e(aVar, t11);
        }
    }

    @m80.k
    public static final xy.a<kotlin.time.e> r() {
        return f102948b;
    }

    @m80.k
    public static final xy.a<Boolean> s() {
        return f102949c;
    }

    @m80.k
    public static final xy.a<Boolean> t() {
        return f102950d;
    }

    @m80.k
    public static final xy.a<Boolean> u() {
        return f102947a;
    }

    public static final Throwable v(ex.c cVar, Throwable th2) {
        return (!(th2 instanceof SSEClientException) || ((SSEClientException) th2).getResponse() == null) ? new SSEClientException(cVar, th2, th2.getMessage()) : th2;
    }

    @m80.l
    public static final Object w(@m80.k lw.c cVar, @m80.l final String str, @m80.l final String str2, @m80.l final Integer num, @m80.l final String str3, @m80.l kotlin.time.e eVar, @m80.l Boolean bool, @m80.l Boolean bool2, @m80.k final x00.l<? super y, g2> lVar, @m80.k x00.p<? super p, ? super j00.c<? super g2>, ? extends Object> pVar, @m80.k j00.c<? super g2> cVar2) {
        Object A = A(cVar, new x00.l() { // from class: zw.b
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 N;
                N = o.N(str, str2, num, str3, lVar, (y) obj);
                return N;
            }
        }, eVar, bool, bool2, pVar, cVar2);
        return A == kotlin.coroutines.intrinsics.b.l() ? A : g2.f100423a;
    }

    public static /* synthetic */ Object x(lw.c cVar, String str, String str2, Integer num, String str3, kotlin.time.e eVar, Boolean bool, Boolean bool2, x00.l lVar, x00.p pVar, j00.c cVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            num = null;
        }
        if ((i11 & 8) != 0) {
            str3 = null;
        }
        if ((i11 & 16) != 0) {
            eVar = null;
        }
        if ((i11 & 32) != 0) {
            bool = null;
        }
        if ((i11 & 64) != 0) {
            bool2 = null;
        }
        if ((i11 & 128) != 0) {
            lVar = new x00.l() { // from class: zw.c
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 M;
                    M = o.M((y) obj2);
                    return M;
                }
            };
        }
        return w(cVar, str, str2, num, str3, eVar, bool, bool2, lVar, pVar, cVar2);
    }

    @m80.l
    public static final Object y(@m80.k lw.c cVar, @m80.k final String str, @m80.l kotlin.time.e eVar, @m80.l Boolean bool, @m80.l Boolean bool2, @m80.k final x00.l<? super y, g2> lVar, @m80.k x00.p<? super p, ? super j00.c<? super g2>, ? extends Object> pVar, @m80.k j00.c<? super g2> cVar2) {
        Object A = A(cVar, new x00.l() { // from class: zw.l
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 P;
                P = o.P(str, lVar, (y) obj);
                return P;
            }
        }, eVar, bool, bool2, pVar, cVar2);
        return A == kotlin.coroutines.intrinsics.b.l() ? A : g2.f100423a;
    }

    public static /* synthetic */ Object z(lw.c cVar, String str, kotlin.time.e eVar, Boolean bool, Boolean bool2, x00.l lVar, x00.p pVar, j00.c cVar2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            eVar = null;
        }
        if ((i11 & 4) != 0) {
            bool = null;
        }
        if ((i11 & 8) != 0) {
            bool2 = null;
        }
        if ((i11 & 16) != 0) {
            lVar = new x00.l() { // from class: zw.n
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 O;
                    O = o.O((y) obj2);
                    return O;
                }
            };
        }
        return y(cVar, str, eVar, bool, bool2, lVar, pVar, cVar2);
    }
}
