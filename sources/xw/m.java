package xw;

import androidx.core.app.NotificationCompat;
import c40.b2;
import c40.h1;
import c40.r0;
import com.jiongji.andriod.card.R;
import com.tencent.open.SocialConstants;
import cx.w;
import cx.y;
import io.ktor.client.plugins.logging.LogLevel;
import ix.l2;
import ix.y0;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import mx.v;
import xw.q;
import xw.r;
import xw.t;
import y40.c0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLogging.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Logging.kt\nio/ktor/client/plugins/logging/LoggingKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Attributes.kt\nio/ktor/util/AttributesKt\n+ 4 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,301:1\n1755#2,3:302\n295#2,2:305\n295#2,2:307\n18#3:309\n18#3:326\n58#4,16:310\n58#4,16:327\n*S KotlinDebug\n*F\n+ 1 Logging.kt\nio/ktor/client/plugins/logging/LoggingKt\n*L\n79#1:302,3\n130#1:305,2\n133#1:307,2\n21#1:309\n22#1:326\n21#1:310,16\n22#1:327,16\n*E\n"})
/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final xy.a<xw.a> f98414a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final xy.a<g2> f98415b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final sw.b<i> f98416c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a extends FunctionReferenceImpl implements x00.a<i> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f98417a = new a();

        public a() {
            super(0, i.class, "<init>", "<init>()V", 0);
        }

        @Override // x00.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i invoke() {
            return new i();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.logging.LoggingKt$Logging$2$1", f = "Logging.kt", i = {0, 0, 1}, l = {169, 175}, m = "invokeSuspend", n = {"$this$on", SocialConstants.TYPE_REQUEST, SocialConstants.TYPE_REQUEST}, s = {"L$0", "L$1", "L$0"})
    public static final class b extends SuspendLambda implements x00.q<t.a, y, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f98418a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f98419b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f98420c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List<x00.l<y, Boolean>> f98421d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ xw.e f98422e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ LogLevel f98423f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ List<s> f98424g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends x00.l<? super y, Boolean>> list, xw.e eVar, LogLevel logLevel, List<s> list2, j00.c<? super b> cVar) {
            super(3, cVar);
            this.f98421d = list;
            this.f98422e = eVar;
            this.f98423f = logLevel;
            this.f98424g = list2;
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(t.a aVar, y yVar, j00.c<? super g2> cVar) {
            b bVar = new b(this.f98421d, this.f98422e, this.f98423f, this.f98424g, cVar);
            bVar.f98419b = aVar;
            bVar.f98420c = yVar;
            return bVar.invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
        
            if (r4.a(r10, r9) != r0) goto L35;
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r9.f98418a
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2f
                if (r1 == r4) goto L23
                if (r1 != r3) goto L1b
                java.lang.Object r0 = r9.f98419b
                cx.y r0 = (cx.y) r0
                kotlin.e.n(r10)     // Catch: java.lang.Throwable -> L18
                goto L82
            L18:
                r10 = move-exception
                goto L85
            L1b:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L23:
                java.lang.Object r1 = r9.f98420c
                cx.y r1 = (cx.y) r1
                java.lang.Object r4 = r9.f98419b
                xw.t$a r4 = (xw.t.a) r4
                kotlin.e.n(r10)     // Catch: java.lang.Throwable -> L6a
                goto L66
            L2f:
                kotlin.e.n(r10)
                java.lang.Object r10 = r9.f98419b
                xw.t$a r10 = (xw.t.a) r10
                java.lang.Object r1 = r9.f98420c
                cx.y r1 = (cx.y) r1
                java.util.List<x00.l<cx.y, java.lang.Boolean>> r5 = r9.f98421d
                boolean r5 = xw.m.r(r5, r1)
                if (r5 != 0) goto L50
                xy.b r10 = r1.d()
                xy.a r0 = xw.m.t()
                yz.g2 r1 = yz.g2.f100423a
                r10.e(r0, r1)
                return r1
            L50:
                xw.e r5 = r9.f98422e     // Catch: java.lang.Throwable -> L69
                io.ktor.client.plugins.logging.LogLevel r6 = r9.f98423f     // Catch: java.lang.Throwable -> L69
                java.util.List<xw.s> r7 = r9.f98424g     // Catch: java.lang.Throwable -> L69
                r9.f98419b = r10     // Catch: java.lang.Throwable -> L69
                r9.f98420c = r1     // Catch: java.lang.Throwable -> L69
                r9.f98418a = r4     // Catch: java.lang.Throwable -> L69
                java.lang.Object r4 = xw.m.n(r5, r6, r7, r1, r9)     // Catch: java.lang.Throwable -> L69
                if (r4 != r0) goto L63
                goto L81
            L63:
                r8 = r4
                r4 = r10
                r10 = r8
            L66:
                mx.v r10 = (mx.v) r10     // Catch: java.lang.Throwable -> L6a
                goto L6b
            L69:
                r4 = r10
            L6a:
                r10 = r2
            L6b:
                if (r10 != 0) goto L75
                java.lang.Object r10 = r1.e()     // Catch: java.lang.Throwable -> L72
                goto L75
            L72:
                r10 = move-exception
                r0 = r1
                goto L85
            L75:
                r9.f98419b = r1     // Catch: java.lang.Throwable -> L72
                r9.f98420c = r2     // Catch: java.lang.Throwable -> L72
                r9.f98418a = r3     // Catch: java.lang.Throwable -> L72
                java.lang.Object r10 = r4.a(r10, r9)     // Catch: java.lang.Throwable -> L72
                if (r10 != r0) goto L82
            L81:
                return r0
            L82:
                yz.g2 r10 = yz.g2.f100423a
                return r10
            L85:
                io.ktor.client.plugins.logging.LogLevel r1 = r9.f98423f
                xw.e r2 = r9.f98422e
                xw.m.p(r1, r2, r0, r10)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: xw.m.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.logging.LoggingKt$Logging$2$2", f = "Logging.kt", i = {0, 0, 0, 0}, l = {192, 199, 199}, m = "invokeSuspend", n = {"response", "callLogger", "header", "failed"}, s = {"L$0", "L$1", "L$2", "I$0"})
    public static final class c extends SuspendLambda implements x00.q<r.a, ex.c, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f98425a;

        /* renamed from: b, reason: collision with root package name */
        public int f98426b;

        /* renamed from: c, reason: collision with root package name */
        public int f98427c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f98428d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f98429e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ LogLevel f98430f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ List<s> f98431g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(LogLevel logLevel, List<s> list, j00.c<? super c> cVar) {
            super(3, cVar);
            this.f98430f = logLevel;
            this.f98431g = list;
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(r.a aVar, ex.c cVar, j00.c<? super g2> cVar2) {
            c cVar3 = new c(this.f98430f, this.f98431g, cVar2);
            cVar3.f98428d = aVar;
            cVar3.f98429e = cVar;
            return cVar3.invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x00c0, code lost:
        
            if (r8.b(r13) == r0) goto L47;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 257
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: xw.m.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.logging.LoggingKt$Logging$2$3", f = "Logging.kt", i = {0, 1, 1, 2}, l = {209, R.styleable.Theme_drawable_review_sound, R.styleable.Theme_drawable_revocation}, m = "invokeSuspend", n = {NotificationCompat.CATEGORY_CALL, "cause", "callLogger", "cause"}, s = {"L$0", "L$0", "L$1", "L$0"})
    public static final class d extends SuspendLambda implements x00.q<q.a, mw.a, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f98432a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f98433b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f98434c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ LogLevel f98435d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(LogLevel logLevel, j00.c<? super d> cVar) {
            super(3, cVar);
            this.f98435d = logLevel;
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(q.a aVar, mw.a aVar2, j00.c<? super g2> cVar) {
            d dVar = new d(this.f98435d, cVar);
            dVar.f98433b = aVar;
            dVar.f98434c = aVar2;
            return dVar.invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [mw.a] */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v16 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            xw.a aVar;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            ?? r12 = this.f98432a;
            try {
            } catch (Throwable th2) {
                th = th2;
                StringBuilder sb2 = new StringBuilder();
                xw.a aVar2 = (xw.a) r12.getAttributes().g(m.f98414a);
                m.k(this.f98435d, sb2, r12.h(), th);
                String sb3 = sb2.toString();
                g0.o(sb3, "toString(...)");
                this.f98433b = th;
                this.f98434c = aVar2;
                this.f98432a = 2;
                if (aVar2.e(sb3, this) != l11) {
                    aVar = aVar2;
                }
            }
            if (r12 == 0) {
                kotlin.e.n(obj);
                q.a aVar3 = (q.a) this.f98433b;
                mw.a aVar4 = (mw.a) this.f98434c;
                if (this.f98435d == LogLevel.NONE || aVar4.getAttributes().c(m.f98415b)) {
                    return g2.f100423a;
                }
                this.f98433b = aVar4;
                this.f98432a = 1;
                obj = aVar3.a(this);
                r12 = aVar4;
                if (obj == l11) {
                    return l11;
                }
            } else {
                if (r12 != 1) {
                    if (r12 != 2) {
                        if (r12 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Throwable th3 = (Throwable) this.f98433b;
                        kotlin.e.n(obj);
                        throw th3;
                    }
                    aVar = (xw.a) this.f98434c;
                    Throwable th4 = (Throwable) this.f98433b;
                    kotlin.e.n(obj);
                    th = th4;
                    this.f98433b = th;
                    this.f98434c = null;
                    this.f98432a = 3;
                    if (aVar.b(this) != l11) {
                        throw th;
                    }
                    return l11;
                }
                mw.a aVar5 = (mw.a) this.f98433b;
                kotlin.e.n(obj);
                r12 = aVar5;
            }
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.logging.LoggingKt$Logging$2$logRequestBody$2", f = "Logging.kt", i = {0}, l = {303}, m = "invokeSuspend", n = {"charset$iv"}, s = {"L$0"})
    @u0({"SMAP\nLogging.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Logging.kt\nio/ktor/client/plugins/logging/LoggingKt$Logging$2$logRequestBody$2\n+ 2 LoggingUtils.kt\nio/ktor/client/plugins/logging/LoggingUtilsKt\n*L\n1#1,301:1\n49#2,5:302\n*S KotlinDebug\n*F\n+ 1 Logging.kt\nio/ktor/client/plugins/logging/LoggingKt$Logging$2$logRequestBody$2\n*L\n94#1:302,5\n*E\n"})
    public static final class e extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f98436a;

        /* renamed from: b, reason: collision with root package name */
        public int f98437b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.b f98438c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Charset f98439d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ StringBuilder f98440e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ xw.a f98441f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(io.ktor.utils.io.b bVar, Charset charset, StringBuilder sb2, xw.a aVar, j00.c<? super e> cVar) {
            super(2, cVar);
            this.f98438c = bVar;
            this.f98439d = charset;
            this.f98440e = sb2;
            this.f98441f = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new e(this.f98438c, this.f98439d, this.f98440e, this.f98441f, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((e) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Charset charset;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f98437b;
            String str = null;
            try {
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    try {
                        io.ktor.utils.io.b bVar = this.f98438c;
                        Charset charset2 = this.f98439d;
                        this.f98436a = charset2;
                        this.f98437b = 1;
                        obj = io.ktor.utils.io.j.G(bVar, this);
                        if (obj == l11) {
                            return l11;
                        }
                        charset = charset2;
                    } catch (Throwable th2) {
                        xw.a aVar = this.f98441f;
                        String sb2 = this.f98440e.toString();
                        g0.o(sb2, "toString(...)");
                        aVar.c(sb2);
                        this.f98441f.a();
                        throw th2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    charset = (Charset) this.f98436a;
                    kotlin.e.n(obj);
                }
                str = jz.s.g((c0) obj, charset, 0, 2, null);
            } catch (Throwable unused) {
            }
            if (str == null) {
                str = "[request body omitted]";
            }
            StringBuilder sb3 = this.f98440e;
            sb3.append("BODY START");
            g0.o(sb3, "append(...)");
            sb3.append('\n');
            g0.o(sb3, "append(...)");
            StringBuilder sb4 = this.f98440e;
            sb4.append(str);
            g0.o(sb4, "append(...)");
            sb4.append('\n');
            g0.o(sb4, "append(...)");
            this.f98440e.append("BODY END");
            xw.a aVar2 = this.f98441f;
            String sb5 = this.f98440e.toString();
            g0.o(sb5, "toString(...)");
            aVar2.c(sb5);
            this.f98441f.a();
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.logging.LoggingKt$Logging$2$observer$1", f = "Logging.kt", i = {0, 0, 1, 3, 5}, l = {R.styleable.Theme_drawable_tab_friends_new, R.styleable.Theme_drawable_tab_lecture_new, R.styleable.Theme_drawable_tab_mall, R.styleable.Theme_drawable_tab_lecture_new, R.styleable.Theme_drawable_tab_mall, R.styleable.Theme_drawable_tab_lecture_new, R.styleable.Theme_drawable_tab_mall}, m = "invokeSuspend", n = {"callLogger", "log", "callLogger", "callLogger", "callLogger"}, s = {"L$0", "L$1", "L$0", "L$0", "L$0"})
    public static final class f extends SuspendLambda implements x00.p<ex.c, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f98442a;

        /* renamed from: b, reason: collision with root package name */
        public int f98443b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f98444c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ LogLevel f98445d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(LogLevel logLevel, j00.c<? super f> cVar) {
            super(2, cVar);
            this.f98445d = logLevel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            f fVar = new f(this.f98445d, cVar);
            fVar.f98444c = obj;
            return fVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ex.c cVar, j00.c<? super g2> cVar2) {
            return ((f) create(cVar, cVar2)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0100, code lost:
        
            if (r1.b(r8) == r0) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00d7, code lost:
        
            if (r1.b(r8) == r0) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00cb, code lost:
        
            if (r1.d(r9, r8) == r0) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00f4, code lost:
        
            if (r1.d(r9, r8) == r0) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00ae, code lost:
        
            if (xw.n.c(r4, r5, r9, r8) == r0) goto L39;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instructions count: 286
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: xw.m.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        h10.r rVar;
        h10.d d11 = o0.d(xw.a.class);
        h10.r rVar2 = null;
        try {
            rVar = o0.B(xw.a.class);
        } catch (Throwable unused) {
            rVar = null;
        }
        f98414a = new xy.a<>("CallLogger", new gz.a(d11, rVar));
        h10.d d12 = o0.d(g2.class);
        try {
            rVar2 = o0.B(g2.class);
        } catch (Throwable unused2) {
        }
        f98415b = new xy.a<>("DisableLogging", new gz.a(d12, rVar2));
        f98416c = sw.i.b("Logging", a.f98417a, new x00.l() { // from class: xw.l
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 f11;
                f11 = m.f((sw.d) obj);
                return f11;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(@m80.k lw.j<?> jVar, @m80.k x00.l<? super i, g2> block) {
        g0.p(jVar, "<this>");
        g0.p(block, "block");
        jVar.s(f98416c, block);
    }

    public static /* synthetic */ void e(lw.j jVar, x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = new x00.l() { // from class: xw.j
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 m11;
                    m11 = m.m((i) obj2);
                    return m11;
                }
            };
        }
        d(jVar, lVar);
    }

    public static final g2 f(sw.d createClientPlugin) {
        g0.p(createClientPlugin, "$this$createClientPlugin");
        xw.e d11 = ((i) createClientPlugin.f()).d();
        LogLevel c11 = ((i) createClientPlugin.f()).c();
        List<x00.l<y, Boolean>> b11 = ((i) createClientPlugin.f()).b();
        List<s> e11 = ((i) createClientPlugin.f()).e();
        createClientPlugin.g(t.f98475a, new b(b11, d11, c11, e11, null));
        createClientPlugin.g(r.f98468a, new c(c11, e11, null));
        createClientPlugin.g(q.f98463a, new d(c11, null));
        if (!c11.getBody()) {
            return g2.f100423a;
        }
        final f fVar = new f(c11, null);
        yw.l.f().b(yw.l.f().a(new x00.l() { // from class: xw.k
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 g11;
                g11 = m.g(x00.p.this, (yw.h) obj);
                return g11;
            }
        }), createClientPlugin.b());
        return g2.f100423a;
    }

    public static final g2 g(x00.p pVar, yw.h prepare) {
        g0.p(prepare, "$this$prepare");
        prepare.d(pVar);
        return g2.f100423a;
    }

    public static final Object h(xw.e eVar, LogLevel logLevel, List<s> list, y yVar, j00.c<? super v> cVar) {
        Object obj;
        Object obj2;
        Object e11 = yVar.e();
        g0.n(e11, "null cannot be cast to non-null type io.ktor.http.content.OutgoingContent");
        v vVar = (v) e11;
        xw.a aVar = new xw.a(eVar);
        yVar.d().e(f98414a, aVar);
        StringBuilder sb2 = new StringBuilder();
        if (logLevel.getInfo()) {
            sb2.append("REQUEST: " + l2.e(yVar.j()));
            g0.o(sb2, "append(...)");
            sb2.append('\n');
            g0.o(sb2, "append(...)");
            sb2.append("METHOD: " + yVar.i());
            g0.o(sb2, "append(...)");
            sb2.append('\n');
            g0.o(sb2, "append(...)");
        }
        if (logLevel.getHeaders()) {
            sb2.append("COMMON HEADERS");
            g0.o(sb2, "append(...)");
            sb2.append('\n');
            g0.o(sb2, "append(...)");
            n.b(sb2, yVar.a().entries(), list);
            sb2.append("CONTENT HEADERS");
            g0.o(sb2, "append(...)");
            sb2.append('\n');
            g0.o(sb2, "append(...)");
            List<s> list2 = list;
            Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((s) obj).b().invoke(y0.f63006a.z()).booleanValue()) {
                    break;
                }
            }
            s sVar = (s) obj;
            String a11 = sVar != null ? sVar.a() : null;
            Iterator<T> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (((s) obj2).b().invoke(y0.f63006a.C()).booleanValue()) {
                    break;
                }
            }
            s sVar2 = (s) obj2;
            String a12 = sVar2 != null ? sVar2.a() : null;
            Long a13 = vVar.a();
            if (a13 != null) {
                long longValue = a13.longValue();
                String z11 = y0.f63006a.z();
                if (a11 == null) {
                    a11 = String.valueOf(longValue);
                }
                n.a(sb2, z11, a11);
            }
            ix.k b11 = vVar.b();
            if (b11 != null) {
                String C = y0.f63006a.C();
                if (a12 == null) {
                    a12 = b11.toString();
                }
                n.a(sb2, C, a12);
            }
            n.b(sb2, vVar.d().entries(), list);
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        if (sb3.length() > 0) {
            aVar.c(sb3);
        }
        if (sb3.length() != 0 && logLevel.getBody()) {
            return i(vVar, aVar, cVar);
        }
        aVar.a();
        return null;
    }

    public static final Object i(v vVar, xw.a aVar, j00.c<? super v> cVar) {
        Charset charset;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("BODY Content-Type: " + vVar.b());
        g0.o(sb2, "append(...)");
        sb2.append('\n');
        g0.o(sb2, "append(...)");
        ix.k b11 = vVar.b();
        if (b11 == null || (charset = ix.m.a(b11)) == null) {
            charset = u30.d.f91599b;
        }
        Charset charset2 = charset;
        io.ktor.utils.io.b bVar = new io.ktor.utils.io.b(false, 1, null);
        c40.k.f(b2.f7824a, h1.a().plus(xw.b.a()), null, new e(bVar, charset2, sb2, aVar, null), 2, null);
        return p.a(vVar, bVar, cVar);
    }

    public static final void j(LogLevel logLevel, xw.e eVar, y yVar, Throwable th2) {
        if (logLevel.getInfo()) {
            eVar.log("REQUEST " + l2.e(yVar.j()) + " failed with exception: " + th2);
        }
    }

    public static final void k(LogLevel logLevel, StringBuilder sb2, w wVar, Throwable th2) {
        if (logLevel.getInfo()) {
            sb2.append("RESPONSE " + wVar.getUrl() + " failed with exception: " + th2);
        }
    }

    public static final boolean l(List<? extends x00.l<? super y, Boolean>> list, y yVar) {
        if (list.isEmpty()) {
            return true;
        }
        List<? extends x00.l<? super y, Boolean>> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (((Boolean) ((x00.l) it.next()).invoke(yVar)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final g2 m(i iVar) {
        g0.p(iVar, "<this>");
        return g2.f100423a;
    }

    @m80.k
    public static final sw.b<i> u() {
        return f98416c;
    }

    public static /* synthetic */ void v() {
    }
}
