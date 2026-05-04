package tw;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.jiongji.andriod.card.R;
import com.tencent.open.SocialConstants;
import cx.f0;
import cx.w;
import cx.z;
import h10.r;
import io.ktor.utils.io.c0;
import ix.d1;
import ix.f1;
import ix.g1;
import ix.m0;
import ix.q0;
import ix.r0;
import ix.y0;
import java.util.Comparator;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import rw.y;
import uw.b;
import uw.l;
import uw.m;
import x00.q;
import yz.g2;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nHttpCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpCache.kt\nio/ktor/client/plugins/cache/HttpCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 Attributes.kt\nio/ktor/util/AttributesKt\n+ 6 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,389:1\n1#2:390\n1062#3:391\n295#3:392\n296#3:396\n168#4,3:393\n168#4,3:397\n18#5:400\n58#6,16:401\n*S KotlinDebug\n*F\n+ 1 HttpCache.kt\nio/ktor/client/plugins/cache/HttpCache\n*L\n332#1:391\n332#1:392\n332#1:396\n333#1:393,3\n345#1:397,3\n128#1:400\n128#1:401,16\n*E\n"})
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f90994g = new a(0 == true ? 1 : 0);

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final xy.a<b> f90995h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final hx.a<ex.c> f90996i;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f90997a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l f90998b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final uw.b f90999c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final uw.b f91000d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f91001e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f91002f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nHttpCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpCache.kt\nio/ktor/client/plugins/cache/HttpCache$Companion\n+ 2 Headers.kt\nio/ktor/http/Headers$Companion\n*L\n1#1,389:1\n23#2:390\n*S KotlinDebug\n*F\n+ 1 HttpCache.kt\nio/ktor/client/plugins/cache/HttpCache$Companion\n*L\n250#1:390\n*E\n"})
    public static final class a implements y<C1216b, b> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.client.plugins.cache.HttpCache$Companion$install$1", f = "HttpCache.kt", i = {1}, l = {161, 165, 171, 180, 185}, m = "invokeSuspend", n = {"$this$intercept"}, s = {"L$0"})
        /* renamed from: tw.b$a$a, reason: collision with other inner class name */
        public static final class C1214a extends SuspendLambda implements q<io.ktor.util.pipeline.d<Object, cx.y>, Object, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f91003a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f91004b;

            /* renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f91005c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ b f91006d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ lw.c f91007e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1214a(b bVar, lw.c cVar, j00.c<? super C1214a> cVar2) {
                super(3, cVar2);
                this.f91006d = bVar;
                this.f91007e = cVar;
            }

            @Override // x00.q
            public final Object invoke(io.ktor.util.pipeline.d<Object, cx.y> dVar, Object obj, j00.c<? super g2> cVar) {
                C1214a c1214a = new C1214a(this.f91006d, this.f91007e, cVar);
                c1214a.f91004b = dVar;
                c1214a.f91005c = obj;
                return c1214a.invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:27:0x014d, code lost:
            
                if (r15.h(r9, r1, r14) == r0) goto L62;
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x0198, code lost:
            
                if (r1.g(r9, r2, r15, r14) == r0) goto L62;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x01b9, code lost:
            
                if (r8.i(r9, r10, r11, r12, r14) == r0) goto L62;
             */
            /* JADX WARN: Code restructure failed: missing block: B:65:0x00b2, code lost:
            
                if (tw.h.h(r1, r14.f91006d, (mx.v) r15, r3, r14) == r0) goto L62;
             */
            /* JADX WARN: Code restructure failed: missing block: B:67:0x00cb, code lost:
            
                if (r15 == r0) goto L62;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                /*
                    Method dump skipped, instructions count: 591
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: tw.b.a.C1214a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.client.plugins.cache.HttpCache$Companion$install$2", f = "HttpCache.kt", i = {1, 1, 3, 3}, l = {203, 209, R.styleable.Theme_drawable_reset_plan, R.styleable.Theme_drawable_share_close, 226}, m = "invokeSuspend", n = {"$this$intercept", "response", "$this$intercept", "response"}, s = {"L$0", "L$1", "L$0", "L$1"})
        /* renamed from: tw.b$a$b, reason: collision with other inner class name */
        public static final class C1215b extends SuspendLambda implements q<io.ktor.util.pipeline.d<ex.c, g2>, ex.c, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f91008a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f91009b;

            /* renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f91010c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ b f91011d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ lw.c f91012e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1215b(b bVar, lw.c cVar, j00.c<? super C1215b> cVar2) {
                super(3, cVar2);
                this.f91011d = bVar;
                this.f91012e = cVar;
            }

            @Override // x00.q
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(io.ktor.util.pipeline.d<ex.c, g2> dVar, ex.c cVar, j00.c<? super g2> cVar2) {
                C1215b c1215b = new C1215b(this.f91011d, this.f91012e, cVar2);
                c1215b.f91009b = dVar;
                c1215b.f91010c = cVar;
                return c1215b.invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x015e, code lost:
            
                if (r3.i(r12, r11) == r0) goto L51;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
            
                if (r5.i(r12, r11) == r0) goto L51;
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x0082, code lost:
            
                if (tw.h.g(r12, r1, r2, r3, r11) == r0) goto L51;
             */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0145  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0161  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x00ce  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x00ed  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00fe  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    Method dump skipped, instructions count: 374
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: tw.b.a.C1215b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final hx.a<ex.c> d() {
            return b.f90996i;
        }

        @Override // rw.y
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(@k b plugin, @k lw.c scope) {
            g0.p(plugin, "plugin");
            g0.p(scope, "scope");
            io.ktor.util.pipeline.h hVar = new io.ktor.util.pipeline.h("Cache");
            scope.v0().z(cx.g0.f46880h.e(), hVar);
            scope.v0().C(hVar, new C1214a(plugin, scope, null));
            scope.c0().C(ex.b.f50181h.c(), new C1215b(plugin, scope, null));
        }

        @Override // rw.y
        @k
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public b a(@k x00.l<? super C1216b, g2> block) {
            g0.p(block, "block");
            C1216b c1216b = new C1216b();
            block.invoke(c1216b);
            return new b(c1216b.d(), c1216b.a(), c1216b.f(), c1216b.c(), c1216b.g(), c1216b.h(), null);
        }

        @m80.l
        public final Object g(@k io.ktor.util.pipeline.d<Object, cx.y> dVar, @k lw.c cVar, @k mw.a aVar, @k j00.c<? super g2> cVar2) {
            dVar.b();
            cVar.Z().b(d(), aVar.i());
            Object i11 = dVar.i(aVar, cVar2);
            return i11 == kotlin.coroutines.intrinsics.b.l() ? i11 : g2.f100423a;
        }

        @Override // rw.y
        @k
        public xy.a<b> getKey() {
            return b.f90995h;
        }

        @m80.l
        public final Object h(@k io.ktor.util.pipeline.d<Object, cx.y> dVar, @k lw.c cVar, @k j00.c<? super g2> cVar2) {
            dVar.b();
            z c11 = dVar.d().c();
            Object i11 = dVar.i(new mw.a(cVar, c11, new f0(g1.f62797c.m(), io.ktor.util.date.a.c(null, 1, null), q0.f62976a.b(), f1.f62772d.c(), io.ktor.utils.io.c.e(new byte[0], 0, 0, 6, null), c11.d())), cVar2);
            return i11 == kotlin.coroutines.intrinsics.b.l() ? i11 : g2.f100423a;
        }

        public final Object i(io.ktor.util.pipeline.d<Object, cx.y> dVar, uw.c cVar, lw.c cVar2, kotlin.coroutines.d dVar2, j00.c<? super g2> cVar3) {
            z c11 = dVar.d().c();
            g1 g11 = cVar.g();
            bz.b e11 = cVar.e();
            q0.a aVar = q0.f62976a;
            r0 r0Var = new r0(0, 1, null);
            r0Var.j(cVar.d());
            r0Var.k(y0.f63006a.P0(), "110");
            g2 g2Var = g2.f100423a;
            mw.a aVar2 = new mw.a(cVar2, c11, new f0(g11, e11, r0Var.build(), cVar.j(), io.ktor.utils.io.c.e(cVar.b(), 0, 0, 6, null), dVar2));
            dVar.b();
            cVar2.Z().b(d(), aVar2.i());
            Object i11 = dVar.i(aVar2, cVar3);
            return i11 == kotlin.coroutines.intrinsics.b.l() ? i11 : g2Var;
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.cache.HttpCache", f = "HttpCache.kt", i = {0, 0, 0, 0, 0, 1, 1, 1}, l = {314, TypedValues.AttributesType.TYPE_PATH_ROTATE}, m = "findAndRefresh", n = {"this", SocialConstants.TYPE_REQUEST, "response", "storage", "varyKeysFrom304", SocialConstants.TYPE_REQUEST, "response", "cache"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f91019a;

        /* renamed from: b, reason: collision with root package name */
        public Object f91020b;

        /* renamed from: c, reason: collision with root package name */
        public Object f91021c;

        /* renamed from: d, reason: collision with root package name */
        public Object f91022d;

        /* renamed from: e, reason: collision with root package name */
        public Object f91023e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f91024f;

        /* renamed from: h, reason: collision with root package name */
        public int f91026h;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@k Object obj) {
            this.f91024f = obj;
            this.f91026h |= Integer.MIN_VALUE;
            return b.this.i(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 HttpCache.kt\nio/ktor/client/plugins/cache/HttpCache\n*L\n1#1,121:1\n332#2:122\n*E\n"})
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return e00.g.l(((uw.c) t12).f(), ((uw.c) t11).f());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.cache.HttpCache", f = "HttpCache.kt", i = {1}, l = {327, 332}, m = "findResponse", n = {"requestHeaders"}, s = {"L$0"})
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f91027a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f91028b;

        /* renamed from: d, reason: collision with root package name */
        public int f91030d;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@k Object obj) {
            this.f91028b = obj;
            this.f91030d |= Integer.MIN_VALUE;
            return b.this.k(null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.cache.HttpCache", f = "HttpCache.kt", i = {0, 0, 0, 1}, l = {342, 342}, m = "findResponse", n = {"this", "url", "lookup", "lookup"}, s = {"L$0", "L$1", "L$2", "L$0"})
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f91031a;

        /* renamed from: b, reason: collision with root package name */
        public Object f91032b;

        /* renamed from: c, reason: collision with root package name */
        public Object f91033c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f91034d;

        /* renamed from: f, reason: collision with root package name */
        public int f91036f;

        public f(j00.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@k Object obj) {
            this.f91034d = obj;
            this.f91036f |= Integer.MIN_VALUE;
            return b.this.j(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class g extends FunctionReferenceImpl implements x00.l<String, String> {
        public g(Object obj) {
            super(1, obj, r0.class, ct.d.f46852f, "get(Ljava/lang/String;)Ljava/lang/String;", 0);
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String p02) {
            g0.p(p02, "p0");
            return ((r0) this.receiver).get(p02);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class h extends FunctionReferenceImpl implements x00.l<String, List<? extends String>> {
        public h(Object obj) {
            super(1, obj, r0.class, "getAll", "getAll(Ljava/lang/String;)Ljava/util/List;", 0);
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<String> invoke(String p02) {
            g0.p(p02, "p0");
            return ((r0) this.receiver).a(p02);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class i extends FunctionReferenceImpl implements x00.l<String, String> {
        public i(Object obj) {
            super(1, obj, q0.class, ct.d.f46852f, "get(Ljava/lang/String;)Ljava/lang/String;", 0);
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String p02) {
            g0.p(p02, "p0");
            return ((q0) this.receiver).get(p02);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class j extends FunctionReferenceImpl implements x00.l<String, List<? extends String>> {
        public j(Object obj) {
            super(1, obj, q0.class, "getAll", "getAll(Ljava/lang/String;)Ljava/util/List;", 0);
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<String> invoke(String p02) {
            g0.p(p02, "p0");
            return ((q0) this.receiver).a(p02);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        r rVar = null;
        h10.d d11 = o0.d(b.class);
        try {
            rVar = o0.B(b.class);
        } catch (Throwable unused) {
        }
        f90995h = new xy.a<>("HttpCache", new gz.a(d11, rVar));
        f90996i = new hx.a<>();
    }

    public /* synthetic */ b(l lVar, l lVar2, uw.b bVar, uw.b bVar2, boolean z11, boolean z12, v vVar) {
        this(lVar, lVar2, bVar, bVar2, z11, z12);
    }

    public final Object h(ex.c cVar, j00.c<? super uw.c> cVar2) {
        w h11 = cVar.c().h();
        List<m0> a11 = d1.a(cVar);
        List<m0> a12 = d1.a(h11);
        tw.a aVar = tw.a.f90988a;
        boolean contains = a11.contains(aVar.e());
        if (contains && this.f91002f) {
            return null;
        }
        uw.b bVar = contains ? this.f91000d : this.f90999c;
        if (a11.contains(aVar.c()) || a12.contains(aVar.c())) {
            return null;
        }
        return m.c(bVar, cVar, tw.e.g(cVar), this.f91002f, cVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(cx.w r10, ex.c r11, j00.c<? super ex.c> r12) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tw.b.i(cx.w, ex.c, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(cx.y r9, mx.v r10, j00.c<? super uw.c> r11) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tw.b.j(cx.y, mx.v, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(uw.b r6, java.util.Map<java.lang.String, java.lang.String> r7, ix.t2 r8, cx.w r9, j00.c<? super uw.c> r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof tw.b.e
            if (r0 == 0) goto L13
            r0 = r10
            tw.b$e r0 = (tw.b.e) r0
            int r1 = r0.f91030d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f91030d = r1
            goto L18
        L13:
            tw.b$e r0 = new tw.b$e
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f91028b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f91030d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f91027a
            x00.l r6 = (x00.l) r6
            kotlin.e.n(r10)
            goto L75
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            kotlin.e.n(r10)
            return r10
        L3c:
            kotlin.e.n(r10)
            boolean r10 = r7.isEmpty()
            if (r10 != 0) goto L4f
            r0.f91030d = r4
            java.lang.Object r6 = r6.c(r8, r7, r0)
            if (r6 != r1) goto L4e
            goto L73
        L4e:
            return r6
        L4f:
            mx.v r7 = r9.w()
            tw.b$i r10 = new tw.b$i
            ix.q0 r2 = r9.a()
            r10.<init>(r2)
            tw.b$j r2 = new tw.b$j
            ix.q0 r9 = r9.a()
            r2.<init>(r9)
            x00.l r7 = tw.g.e(r7, r10, r2)
            r0.f91027a = r7
            r0.f91030d = r3
            java.lang.Object r10 = r6.a(r8, r0)
            if (r10 != r1) goto L74
        L73:
            return r1
        L74:
            r6 = r7
        L75:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            tw.b$d r7 = new tw.b$d
            r7.<init>()
            java.util.List r7 = a00.r0.z5(r10, r7)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L86:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lc9
            java.lang.Object r8 = r7.next()
            r9 = r8
            uw.c r9 = (uw.c) r9
            java.util.Map r9 = r9.i()
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L9e
            goto Lca
        L9e:
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        La6:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto Lca
            java.lang.Object r10 = r9.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r0 = r10.getKey()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r10 = r10.getValue()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r0 = r6.invoke(r0)
            boolean r10 = kotlin.jvm.internal.g0.g(r0, r10)
            if (r10 != 0) goto La6
            goto L86
        Lc9:
            r8 = 0
        Lca:
            uw.c r8 = (uw.c) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: tw.b.k(uw.b, java.util.Map, ix.t2, cx.w, j00.c):java.lang.Object");
    }

    @k
    public final l l() {
        return this.f90998b;
    }

    @k
    public final l n() {
        return this.f90997a;
    }

    public final boolean p() {
        return this.f91002f;
    }

    public b(l lVar, l lVar2, uw.b bVar, uw.b bVar2, boolean z11, boolean z12) {
        this.f90997a = lVar;
        this.f90998b = lVar2;
        this.f90999c = bVar;
        this.f91000d = bVar2;
        this.f91001e = z11;
        this.f91002f = z12;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @c0
    /* renamed from: tw.b$b, reason: collision with other inner class name */
    public static final class C1216b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public uw.b f91013a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public uw.b f91014b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f91015c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f91016d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public l f91017e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public l f91018f;

        public C1216b() {
            b.a aVar = uw.b.f92425a;
            this.f91013a = aVar.d().invoke();
            this.f91014b = aVar.d().invoke();
            l.a aVar2 = l.f92527a;
            this.f91017e = aVar2.b().invoke();
            this.f91018f = aVar2.b().invoke();
        }

        @k
        public final l a() {
            return this.f91018f;
        }

        @k
        public final uw.b c() {
            return this.f91014b;
        }

        @k
        public final l d() {
            return this.f91017e;
        }

        @k
        public final uw.b f() {
            return this.f91013a;
        }

        public final boolean g() {
            return this.f91015c;
        }

        public final boolean h() {
            return this.f91016d;
        }

        public final void i(@k uw.b storage) {
            g0.p(storage, "storage");
            this.f91014b = storage;
        }

        public final void j(@k uw.b storage) {
            g0.p(storage, "storage");
            this.f91013a = storage;
        }

        public final void k(@k l value) {
            g0.p(value, "value");
            this.f91015c = true;
            this.f91018f = value;
        }

        public final void l(@k uw.b bVar) {
            g0.p(bVar, "<set-?>");
            this.f91014b = bVar;
        }

        public final void m(@k l value) {
            g0.p(value, "value");
            this.f91015c = true;
            this.f91017e = value;
        }

        public final void n(@k uw.b bVar) {
            g0.p(bVar, "<set-?>");
            this.f91013a = bVar;
        }

        public final void o(boolean z11) {
            this.f91016d = z11;
        }

        public final void p(boolean z11) {
            this.f91015c = z11;
        }

        @n(level = DeprecationLevel.ERROR, message = "This will become internal. Use setter method instead with new storage interface")
        public static /* synthetic */ void b() {
        }

        @n(level = DeprecationLevel.ERROR, message = "This will become internal. Use setter method instead with new storage interface")
        public static /* synthetic */ void e() {
        }
    }

    @n(level = DeprecationLevel.ERROR, message = "This will become internal")
    public static /* synthetic */ void m() {
    }

    @n(level = DeprecationLevel.ERROR, message = "This will become internal")
    public static /* synthetic */ void o() {
    }
}
