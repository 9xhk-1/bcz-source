package bx;

import ax.u;
import c40.r0;
import c40.x;
import c40.z;
import com.baicizhan.client.business.webview.JsonParams;
import cx.d0;
import cx.y;
import ix.e1;
import ix.h2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nbuildersCio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 buildersCio.kt\nio/ktor/client/plugins/websocket/cio/BuildersCioKt\n+ 2 builders.kt\nio/ktor/client/request/BuildersKt\n*L\n1#1,118:1\n40#2:119\n26#2:120\n*S KotlinDebug\n*F\n+ 1 buildersCio.kt\nio/ktor/client/plugins/websocket/cio/BuildersCioKt\n*L\n24#1:119\n24#1:120\n*E\n"})
/* loaded from: classes8.dex */
public final class g {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.websocket.cio.BuildersCioKt", f = "buildersCio.kt", i = {0, 1, 3}, l = {63, 71, 75, 73, 75, 75}, m = "webSocketRaw", n = {"block", JsonParams.ShareResultO.CHANNEL_WEIXIN, JsonParams.ShareResultO.CHANNEL_WEIXIN}, s = {"L$0", "L$0", "L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f7417a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f7418b;

        /* renamed from: c, reason: collision with root package name */
        public int f7419c;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f7418b = obj;
            this.f7419c |= Integer.MIN_VALUE;
            return g.g(null, null, null, null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.websocket.cio.BuildersCioKt$webSocketRawSession$3", f = "buildersCio.kt", i = {0, 1, 1, 2, 2}, l = {122, 125, 42, 144, 144}, m = "invokeSuspend", n = {"this_$iv", "this_$iv", "response$iv", "this_$iv", "response$iv"}, s = {"L$0", "L$0", "L$2", "L$0", "L$1"})
    @u0({"SMAP\nbuildersCio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 buildersCio.kt\nio/ktor/client/plugins/websocket/cio/BuildersCioKt$webSocketRawSession$3\n+ 2 HttpStatement.kt\nio/ktor/client/statement/HttpStatement\n+ 3 HttpTimeout.kt\nio/ktor/client/plugins/HttpTimeoutKt\n+ 4 HttpClientCall.kt\nio/ktor/client/call/HttpClientCallKt\n+ 5 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,118:1\n83#2:119\n84#2,3:122\n87#2,3:142\n278#3,2:120\n280#3,2:145\n142#4:125\n58#5,16:126\n*S KotlinDebug\n*F\n+ 1 buildersCio.kt\nio/ktor/client/plugins/websocket/cio/BuildersCioKt$webSocketRawSession$3\n*L\n34#1:119\n34#1:122,3\n34#1:142,3\n34#1:120,2\n34#1:145,2\n34#1:125\n34#1:126,16\n*E\n"})
    public static final class b extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f7420a;

        /* renamed from: b, reason: collision with root package name */
        public Object f7421b;

        /* renamed from: c, reason: collision with root package name */
        public Object f7422c;

        /* renamed from: d, reason: collision with root package name */
        public int f7423d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ex.g f7424e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ x<u> f7425f;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a implements x00.l<Throwable, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ x<g2> f7426a;

            public a(x<g2> xVar) {
                this.f7426a = xVar;
            }

            public final void a(Throwable th2) {
                if (th2 != null) {
                    this.f7426a.r(th2);
                } else {
                    this.f7426a.c0(g2.f100423a);
                }
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Throwable th2) {
                a(th2);
                return g2.f100423a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ex.g gVar, x<u> xVar, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f7424e = gVar;
            this.f7425f = xVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new b(this.f7424e, this.f7425f, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(1:2)|(1:(1:(1:(1:(1:(2:9|10)(3:12|13|14))(4:15|16|17|18))(5:19|20|21|22|23))(4:31|32|33|(3:35|(3:37|22|23)|25)(2:38|39)))(3:42|43|44))(4:57|58|59|(2:61|25)(1:62))|45|46|47|48|49|50|(2:52|(0)(0))|25|(2:(0)|(0))) */
        /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|2|(1:(1:(1:(1:(1:(2:9|10)(3:12|13|14))(4:15|16|17|18))(5:19|20|21|22|23))(4:31|32|33|(3:35|(3:37|22|23)|25)(2:38|39)))(3:42|43|44))(4:57|58|59|(2:61|25)(1:62))|45|46|47|48|49|50|(2:52|(0)(0))|25|(2:(0)|(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00e9, code lost:
        
            if (r2.c(r0, r14) != r1) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0101, code lost:
        
            if (r2.c(r15, r14) != r1) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x009c, code lost:
        
            r0 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00f4, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00b8 A[Catch: all -> 0x005e, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x005e, blocks: (B:33:0x0059, B:35:0x00b8, B:38:0x00ec, B:39:0x00f3), top: B:32:0x0059 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00ec A[Catch: all -> 0x005e, TRY_ENTER, TryCatch #5 {all -> 0x005e, blocks: (B:33:0x0059, B:35:0x00b8, B:38:0x00ec, B:39:0x00f3), top: B:32:0x0059 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 274
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: bx.g.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(5:5|6|7|8|9))|51|6|7|8|9|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b8, code lost:
    
        if (r12 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009b, code lost:
    
        if (io.ktor.websocket.k0.c(r12, null, r8, 1, null) != r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ac, code lost:
    
        if (io.ktor.websocket.k0.d(r12, r13, r8) == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0043, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0044, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00be, code lost:
    
        r8.f7417a = r0;
        r8.f7419c = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c7, code lost:
    
        if (io.ktor.websocket.k0.c(r13, null, r8, 1, null) == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0062  */
    /* JADX WARN: Type inference failed for: r12v0, types: [lw.c] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.lang.Object] */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(@m80.k lw.c r12, @m80.k ix.e1 r13, @m80.l java.lang.String r14, @m80.l final java.lang.Integer r15, @m80.l java.lang.String r16, @m80.k final x00.l<? super cx.y, yz.g2> r17, @m80.k x00.p<? super ax.u, ? super j00.c<? super yz.g2>, ? extends java.lang.Object> r18, @m80.k j00.c<? super yz.g2> r19) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bx.g.g(lw.c, ix.e1, java.lang.String, java.lang.Integer, java.lang.String, x00.l, x00.p, j00.c):java.lang.Object");
    }

    public static /* synthetic */ Object h(lw.c cVar, e1 e1Var, String str, Integer num, String str2, x00.l lVar, p pVar, j00.c cVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            e1Var = e1.f62753b.c();
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            num = null;
        }
        if ((i11 & 8) != 0) {
            str2 = null;
        }
        if ((i11 & 16) != 0) {
            lVar = new x00.l() { // from class: bx.d
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 i12;
                    i12 = g.i((y) obj2);
                    return i12;
                }
            };
        }
        x00.l lVar2 = lVar;
        return g(cVar, e1Var, str, num, str2, lVar2, pVar, cVar2);
    }

    public static final g2 i(y yVar) {
        g0.p(yVar, "<this>");
        return g2.f100423a;
    }

    public static final g2 j(Integer num, x00.l lVar, y webSocketRawSession) {
        g0.p(webSocketRawSession, "$this$webSocketRawSession");
        webSocketRawSession.j().C(h2.f62830c.f());
        if (num != null) {
            webSocketRawSession.j().B(num.intValue());
        }
        lVar.invoke(webSocketRawSession);
        return g2.f100423a;
    }

    @l
    public static final Object k(@k lw.c cVar, @k e1 e1Var, @l String str, @l Integer num, @l String str2, @k x00.l<? super y, g2> lVar, @k j00.c<? super u> cVar2) {
        y yVar = new y();
        yVar.q(e1Var);
        d0.q(yVar, "ws", str, num, str2, null, 16, null);
        lVar.invoke(yVar);
        ex.g gVar = new ex.g(yVar, cVar);
        x c11 = z.c(null, 1, null);
        c40.k.f(cVar, null, null, new b(gVar, c11, null), 3, null);
        return c11.i(cVar2);
    }

    public static /* synthetic */ Object l(lw.c cVar, e1 e1Var, String str, Integer num, String str2, x00.l lVar, j00.c cVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            e1Var = e1.f62753b.c();
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            num = null;
        }
        if ((i11 & 8) != 0) {
            str2 = null;
        }
        if ((i11 & 16) != 0) {
            lVar = new x00.l() { // from class: bx.e
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 m11;
                    m11 = g.m((y) obj2);
                    return m11;
                }
            };
        }
        return k(cVar, e1Var, str, num, str2, lVar, cVar2);
    }

    public static final g2 m(y yVar) {
        g0.p(yVar, "<this>");
        return g2.f100423a;
    }

    @l
    public static final Object n(@k lw.c cVar, @k e1 e1Var, @l String str, @l Integer num, @l String str2, @k x00.l<? super y, g2> lVar, @k p<? super u, ? super j00.c<? super g2>, ? extends Object> pVar, @k j00.c<? super g2> cVar2) {
        Object g11 = g(cVar, e1Var, str, num, str2, lVar, pVar, cVar2);
        return g11 == kotlin.coroutines.intrinsics.b.l() ? g11 : g2.f100423a;
    }

    public static /* synthetic */ Object o(lw.c cVar, e1 e1Var, String str, Integer num, String str2, x00.l lVar, p pVar, j00.c cVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            e1Var = e1.f62753b.c();
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            num = null;
        }
        if ((i11 & 8) != 0) {
            str2 = null;
        }
        if ((i11 & 16) != 0) {
            lVar = new x00.l() { // from class: bx.a
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 p11;
                    p11 = g.p((y) obj2);
                    return p11;
                }
            };
        }
        x00.l lVar2 = lVar;
        return n(cVar, e1Var, str, num, str2, lVar2, pVar, cVar2);
    }

    public static final g2 p(y yVar) {
        g0.p(yVar, "<this>");
        return g2.f100423a;
    }

    @l
    public static final Object q(@k lw.c cVar, @k e1 e1Var, @l String str, @l final Integer num, @l String str2, @k final x00.l<? super y, g2> lVar, @k p<? super u, ? super j00.c<? super g2>, ? extends Object> pVar, @k j00.c<? super g2> cVar2) {
        Object g11 = g(cVar, e1Var, str, num, str2, new x00.l() { // from class: bx.b
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 t11;
                t11 = g.t(num, lVar, (y) obj);
                return t11;
            }
        }, pVar, cVar2);
        return g11 == kotlin.coroutines.intrinsics.b.l() ? g11 : g2.f100423a;
    }

    public static /* synthetic */ Object r(lw.c cVar, e1 e1Var, String str, Integer num, String str2, x00.l lVar, p pVar, j00.c cVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            e1Var = e1.f62753b.c();
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            num = null;
        }
        if ((i11 & 8) != 0) {
            str2 = null;
        }
        if ((i11 & 16) != 0) {
            lVar = new x00.l() { // from class: bx.c
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 s11;
                    s11 = g.s((y) obj2);
                    return s11;
                }
            };
        }
        x00.l lVar2 = lVar;
        return q(cVar, e1Var, str, num, str2, lVar2, pVar, cVar2);
    }

    public static final g2 s(y yVar) {
        g0.p(yVar, "<this>");
        return g2.f100423a;
    }

    public static final g2 t(Integer num, x00.l lVar, y webSocketRaw) {
        g0.p(webSocketRaw, "$this$webSocketRaw");
        webSocketRaw.j().C(h2.f62830c.g());
        if (num != null) {
            webSocketRaw.j().B(num.intValue());
        }
        lVar.invoke(webSocketRaw);
        return g2.f100423a;
    }
}
