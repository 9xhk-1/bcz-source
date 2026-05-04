package vw;

import c40.b2;
import c40.h1;
import c40.l2;
import c40.r0;
import cx.e0;
import h10.r;
import io.ktor.utils.io.c0;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import rw.y;
import x00.l;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nHttpCookies.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpCookies.kt\nio/ktor/client/plugins/cookies/HttpCookies\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Attributes.kt\nio/ktor/util/AttributesKt\n+ 5 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,148:1\n126#2:149\n153#2,3:150\n1863#3,2:153\n1863#3,2:155\n1863#3,2:157\n18#4:159\n58#5,16:160\n*S KotlinDebug\n*F\n+ 1 HttpCookies.kt\nio/ktor/client/plugins/cookies/HttpCookies\n*L\n52#1:149\n52#1:150,3\n54#1:153,2\n74#1:155,2\n77#1:157,2\n113#1:159\n113#1:160,16\n*E\n"})
/* loaded from: classes8.dex */
public final class h implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f94294d = new a(0 == true ? 1 : 0);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final xy.a<h> f94295e;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final vw.f f94296a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<p<vw.f, j00.c<? super g2>, Object>> f94297b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l2 f94298c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements y<b, h> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.client.plugins.cookies.HttpCookies$Companion$install$1", f = "HttpCookies.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: vw.h$a$a, reason: collision with other inner class name */
        public static final class C1272a extends SuspendLambda implements q<io.ktor.util.pipeline.d<Object, cx.y>, Object, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f94299a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f94300b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h f94301c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1272a(h hVar, j00.c<? super C1272a> cVar) {
                super(3, cVar);
                this.f94301c = hVar;
            }

            @Override // x00.q
            public final Object invoke(io.ktor.util.pipeline.d<Object, cx.y> dVar, Object obj, j00.c<? super g2> cVar) {
                C1272a c1272a = new C1272a(this.f94301c, cVar);
                c1272a.f94300b = dVar;
                return c1272a.invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f94299a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    io.ktor.util.pipeline.d dVar = (io.ktor.util.pipeline.d) this.f94300b;
                    h hVar = this.f94301c;
                    cx.y yVar = (cx.y) dVar.d();
                    this.f94299a = 1;
                    if (hVar.f(yVar, this) == l11) {
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
        @l00.d(c = "io.ktor.client.plugins.cookies.HttpCookies$Companion$install$2", f = "HttpCookies.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements q<io.ktor.util.pipeline.d<Object, cx.y>, Object, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f94302a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f94303b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h f94304c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(h hVar, j00.c<? super b> cVar) {
                super(3, cVar);
                this.f94304c = hVar;
            }

            @Override // x00.q
            public final Object invoke(io.ktor.util.pipeline.d<Object, cx.y> dVar, Object obj, j00.c<? super g2> cVar) {
                b bVar = new b(this.f94304c, cVar);
                bVar.f94303b = dVar;
                return bVar.invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f94302a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    io.ktor.util.pipeline.d dVar = (io.ktor.util.pipeline.d) this.f94303b;
                    h hVar = this.f94304c;
                    cx.y yVar = (cx.y) dVar.d();
                    this.f94302a = 1;
                    if (hVar.q(yVar, this) == l11) {
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
        @l00.d(c = "io.ktor.client.plugins.cookies.HttpCookies$Companion$install$3", f = "HttpCookies.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements q<io.ktor.util.pipeline.d<ex.c, g2>, ex.c, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f94305a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f94306b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h f94307c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(h hVar, j00.c<? super c> cVar) {
                super(3, cVar);
                this.f94307c = hVar;
            }

            @Override // x00.q
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(io.ktor.util.pipeline.d<ex.c, g2> dVar, ex.c cVar, j00.c<? super g2> cVar2) {
                c cVar3 = new c(this.f94307c, cVar2);
                cVar3.f94306b = cVar;
                return cVar3.invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f94305a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    ex.c cVar = (ex.c) this.f94306b;
                    h hVar = this.f94307c;
                    this.f94305a = 1;
                    if (hVar.k(cVar, this) == l11) {
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

        public /* synthetic */ a(v vVar) {
            this();
        }

        @Override // rw.y
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(@k h plugin, @k lw.c scope) {
            g0.p(plugin, "plugin");
            g0.p(scope, "scope");
            scope.m0().C(e0.f46866h.d(), new C1272a(plugin, null));
            scope.v0().C(cx.g0.f46880h.e(), new b(plugin, null));
            scope.c0().C(ex.b.f50181h.c(), new c(plugin, null));
        }

        @Override // rw.y
        @k
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public h a(@k l<? super b, g2> block) {
            g0.p(block, "block");
            b bVar = new b();
            block.invoke(bVar);
            return bVar.a();
        }

        @Override // rw.y
        @k
        public xy.a<h> getKey() {
            return h.f94295e;
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @c0
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<p<vw.f, j00.c<? super g2>, Object>> f94308a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        @k
        public vw.f f94309b = new vw.d(null, 1, null);

        @k
        public final h a() {
            return new h(this.f94309b, this.f94308a);
        }

        public final void b(@k p<? super vw.f, ? super j00.c<? super g2>, ? extends Object> block) {
            g0.p(block, "block");
            this.f94308a.add(block);
        }

        @k
        public final vw.f c() {
            return this.f94309b;
        }

        public final void d(@k vw.f fVar) {
            g0.p(fVar, "<set-?>");
            this.f94309b = fVar;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.cookies.HttpCookies", f = "HttpCookies.kt", i = {0, 0}, l = {54}, m = "captureHeaderCookies$ktor_client_core", n = {"this", "url"}, s = {"L$0", "L$1"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f94310a;

        /* renamed from: b, reason: collision with root package name */
        public Object f94311b;

        /* renamed from: c, reason: collision with root package name */
        public Object f94312c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f94313d;

        /* renamed from: f, reason: collision with root package name */
        public int f94315f;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@k Object obj) {
            this.f94313d = obj;
            this.f94315f |= Integer.MIN_VALUE;
            return h.this.f(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.cookies.HttpCookies", f = "HttpCookies.kt", i = {0, 0}, l = {39, 40}, m = ct.d.f46852f, n = {"this", "requestUrl"}, s = {"L$0", "L$1"})
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f94316a;

        /* renamed from: b, reason: collision with root package name */
        public Object f94317b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f94318c;

        /* renamed from: e, reason: collision with root package name */
        public int f94320e;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@k Object obj) {
            this.f94318c = obj;
            this.f94320e |= Integer.MIN_VALUE;
            return h.this.e7(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.cookies.HttpCookies$initializer$1", f = "HttpCookies.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
    @u0({"SMAP\nHttpCookies.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpCookies.kt\nio/ktor/client/plugins/cookies/HttpCookies$initializer$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,148:1\n1863#2,2:149\n*S KotlinDebug\n*F\n+ 1 HttpCookies.kt\nio/ktor/client/plugins/cookies/HttpCookies$initializer$1\n*L\n32#1:149,2\n*E\n"})
    public static final class e extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f94321a;

        /* renamed from: b, reason: collision with root package name */
        public Object f94322b;

        /* renamed from: c, reason: collision with root package name */
        public int f94323c;

        public e(j00.c<? super e> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return h.this.new e(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((e) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            h hVar;
            Iterator it;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f94323c;
            if (i11 == 0) {
                kotlin.e.n(obj);
                List list = h.this.f94297b;
                hVar = h.this;
                it = list.iterator();
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.f94322b;
                hVar = (h) this.f94321a;
                kotlin.e.n(obj);
            }
            while (it.hasNext()) {
                p pVar = (p) it.next();
                vw.f fVar = hVar.f94296a;
                this.f94321a = hVar;
                this.f94322b = it;
                this.f94323c = 1;
                if (pVar.invoke(fVar, this) == l11) {
                    return l11;
                }
            }
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.cookies.HttpCookies", f = "HttpCookies.kt", i = {0, 0}, l = {78}, m = "saveCookiesFrom$ktor_client_core", n = {"this", "url"}, s = {"L$0", "L$1"})
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f94325a;

        /* renamed from: b, reason: collision with root package name */
        public Object f94326b;

        /* renamed from: c, reason: collision with root package name */
        public Object f94327c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f94328d;

        /* renamed from: f, reason: collision with root package name */
        public int f94330f;

        public f(j00.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@k Object obj) {
            this.f94328d = obj;
            this.f94330f |= Integer.MIN_VALUE;
            return h.this.k(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.cookies.HttpCookies", f = "HttpCookies.kt", i = {0}, l = {59}, m = "sendCookiesWith$ktor_client_core", n = {"builder"}, s = {"L$0"})
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f94331a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f94332b;

        /* renamed from: d, reason: collision with root package name */
        public int f94334d;

        public g(j00.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@k Object obj) {
            this.f94332b = obj;
            this.f94334d |= Integer.MIN_VALUE;
            return h.this.q(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        r rVar = null;
        h10.d d11 = o0.d(h.class);
        try {
            rVar = o0.B(h.class);
        } catch (Throwable unused) {
        }
        f94295e = new xy.a<>("HttpCookies", new gz.a(d11, rVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(@k vw.f storage, @k List<? extends p<? super vw.f, ? super j00.c<? super g2>, ? extends Object>> defaults) {
        l2 f11;
        g0.p(storage, "storage");
        g0.p(defaults, "defaults");
        this.f94296a = storage;
        this.f94297b = defaults;
        f11 = c40.k.f(b2.f7824a, h1.g(), null, new e(null), 2, null);
        this.f94298c = f11;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f94296a.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e7(@m80.k ix.t2 r6, @m80.k j00.c<? super java.util.List<ix.n>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof vw.h.d
            if (r0 == 0) goto L13
            r0 = r7
            vw.h$d r0 = (vw.h.d) r0
            int r1 = r0.f94320e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f94320e = r1
            goto L18
        L13:
            vw.h$d r0 = new vw.h$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f94318c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f94320e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r7)
            return r7
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f94317b
            ix.t2 r6 = (ix.t2) r6
            java.lang.Object r2 = r0.f94316a
            vw.h r2 = (vw.h) r2
            kotlin.e.n(r7)
            goto L53
        L40:
            kotlin.e.n(r7)
            c40.l2 r7 = r5.f94298c
            r0.f94316a = r5
            r0.f94317b = r6
            r0.f94320e = r4
            java.lang.Object r7 = r7.K0(r0)
            if (r7 != r1) goto L52
            goto L62
        L52:
            r2 = r5
        L53:
            vw.f r7 = r2.f94296a
            r2 = 0
            r0.f94316a = r2
            r0.f94317b = r2
            r0.f94320e = r3
            java.lang.Object r6 = r7.e7(r6, r0)
            if (r6 != r1) goto L63
        L62:
            return r1
        L63:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: vw.h.e7(ix.t2, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(@m80.k cx.y r23, @m80.k j00.c<? super yz.g2> r24) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vw.h.f(cx.y, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(@m80.k ex.c r9, @m80.k j00.c<? super yz.g2> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof vw.h.f
            if (r0 == 0) goto L13
            r0 = r10
            vw.h$f r0 = (vw.h.f) r0
            int r1 = r0.f94330f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f94330f = r1
            goto L18
        L13:
            vw.h$f r0 = new vw.h$f
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f94328d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f94330f
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r9 = r0.f94327c
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r2 = r0.f94326b
            ix.t2 r2 = (ix.t2) r2
            java.lang.Object r4 = r0.f94325a
            vw.h r4 = (vw.h) r4
            kotlin.e.n(r10)
            goto La3
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            kotlin.e.n(r10)
            cx.w r10 = ex.e.h(r9)
            ix.t2 r10 = r10.getUrl()
            ix.q0 r2 = r9.a()
            ix.y0 r4 = ix.y0.f63006a
            java.lang.String r4 = r4.B0()
            java.util.List r2 = r2.a(r4)
            if (r2 == 0) goto L97
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L5e:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L97
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            org.slf4j.Logger r5 = vw.i.a()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Received cookie "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r4 = " in response for "
            r6.append(r4)
            mw.a r4 = r9.c()
            cx.w r4 = r4.h()
            ix.t2 r4 = r4.getUrl()
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.trace(r4)
            goto L5e
        L97:
            java.util.List r9 = ix.d1.n(r9)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
            r4 = r8
            r2 = r10
        La3:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto Lc0
            java.lang.Object r10 = r9.next()
            ix.n r10 = (ix.n) r10
            vw.f r5 = r4.f94296a
            r0.f94325a = r4
            r0.f94326b = r2
            r0.f94327c = r9
            r0.f94330f = r3
            java.lang.Object r10 = r5.U2(r2, r10, r0)
            if (r10 != r1) goto La3
            return r1
        Lc0:
            yz.g2 r9 = yz.g2.f100423a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: vw.h.k(ex.c, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(@m80.k cx.y r5, @m80.k j00.c<? super yz.g2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof vw.h.g
            if (r0 == 0) goto L13
            r0 = r6
            vw.h$g r0 = (vw.h.g) r0
            int r1 = r0.f94334d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f94334d = r1
            goto L18
        L13:
            vw.h$g r0 = new vw.h$g
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f94332b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f94334d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f94331a
            cx.y r5 = (cx.y) r5
            kotlin.e.n(r6)
            goto L4f
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.e.n(r6)
            ix.b2 r6 = r5.j()
            ix.b2 r6 = ix.e2.m(r6)
            ix.t2 r6 = r6.b()
            r0.f94331a = r5
            r0.f94334d = r3
            java.lang.Object r6 = r4.e7(r6, r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            java.util.List r6 = (java.util.List) r6
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L90
            java.lang.String r6 = vw.i.b(r6)
            ix.r0 r0 = r5.a()
            ix.y0 r1 = ix.y0.f63006a
            java.lang.String r1 = r1.D()
            r0.d(r1, r6)
            org.slf4j.Logger r0 = vw.i.a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Sending cookie "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = " for "
            r1.append(r6)
            ix.b2 r5 = r5.j()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.trace(r5)
            goto L9d
        L90:
            ix.r0 r5 = r5.a()
            ix.y0 r6 = ix.y0.f63006a
            java.lang.String r6 = r6.D()
            r5.remove(r6)
        L9d:
            yz.g2 r5 = yz.g2.f100423a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: vw.h.q(cx.y, j00.c):java.lang.Object");
    }

    public static /* synthetic */ void j() {
    }
}
