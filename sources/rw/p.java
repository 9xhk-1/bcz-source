package rw;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import rw.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nDoubleReceivePlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoubleReceivePlugin.kt\nio/ktor/client/plugins/DoubleReceivePluginKt\n+ 2 Attributes.kt\nio/ktor/util/AttributesKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,94:1\n18#2:95\n18#2:112\n58#3,16:96\n58#3,16:113\n*S KotlinDebug\n*F\n+ 1 DoubleReceivePlugin.kt\nio/ktor/client/plugins/DoubleReceivePluginKt\n*L\n15#1:95\n17#1:112\n15#1:96,16\n17#1:113,16\n*E\n"})
/* loaded from: classes8.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final xy.a<g2> f84739a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final xy.a<g2> f84740b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final sw.b<l1> f84741c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a extends FunctionReferenceImpl implements x00.a<l1> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f84742a = new a();

        public a() {
            super(0, l1.class, "<init>", "<init>()V", 0);
        }

        @Override // x00.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l1 invoke() {
            return new l1();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.DoubleReceivePluginKt$SaveBodyPlugin$2$1", f = "DoubleReceivePlugin.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements x00.q<io.ktor.util.pipeline.d<ex.c, g2>, ex.c, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f84743a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f84744b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f84745c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f84746d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z11, j00.c<? super b> cVar) {
            super(3, cVar);
            this.f84746d = z11;
        }

        public static final io.ktor.utils.io.g k(ww.a aVar) {
            return aVar.b();
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f84743a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                io.ktor.util.pipeline.d dVar = (io.ktor.util.pipeline.d) this.f84744b;
                ex.c cVar = (ex.c) this.f84745c;
                if (this.f84746d) {
                    return g2.f100423a;
                }
                if (cVar.c().getAttributes().c(p.f84739a)) {
                    return g2.f100423a;
                }
                final ww.a aVar = new ww.a(cVar.b());
                mw.a c11 = yw.d.c(cVar.c(), new x00.a() { // from class: rw.q
                    @Override // x00.a
                    public final Object invoke() {
                        io.ktor.utils.io.g k11;
                        k11 = p.b.k(ww.a.this);
                        return k11;
                    }
                });
                c11.getAttributes().e(p.f84740b, g2.f100423a);
                ex.c i12 = c11.i();
                this.f84744b = null;
                this.f84743a = 1;
                if (dVar.i(i12, this) == l11) {
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

        @Override // x00.q
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.util.pipeline.d<ex.c, g2> dVar, ex.c cVar, j00.c<? super g2> cVar2) {
            b bVar = new b(this.f84746d, cVar2);
            bVar.f84744b = dVar;
            bVar.f84745c = cVar;
            return bVar.invokeSuspend(g2.f100423a);
        }
    }

    static {
        h10.r rVar;
        h10.d d11 = kotlin.jvm.internal.o0.d(g2.class);
        h10.r rVar2 = null;
        try {
            rVar = kotlin.jvm.internal.o0.B(g2.class);
        } catch (Throwable unused) {
            rVar = null;
        }
        f84739a = new xy.a<>("SkipSaveBody", new gz.a(d11, rVar));
        h10.d d12 = kotlin.jvm.internal.o0.d(g2.class);
        try {
            rVar2 = kotlin.jvm.internal.o0.B(g2.class);
        } catch (Throwable unused2) {
        }
        f84740b = new xy.a<>("ResponseBodySaved", new gz.a(d12, rVar2));
        f84741c = sw.i.b("DoubleReceivePlugin", a.f84742a, new x00.l() { // from class: rw.o
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 b11;
                b11 = p.b((sw.d) obj);
                return b11;
            }
        });
    }

    public static final g2 b(sw.d createClientPlugin) {
        kotlin.jvm.internal.g0.p(createClientPlugin, "$this$createClientPlugin");
        createClientPlugin.b().c0().C(ex.b.f50181h.b(), new b(((l1) createClientPlugin.f()).a(), null));
        return g2.f100423a;
    }

    @m80.k
    public static final sw.b<l1> e() {
        return f84741c;
    }

    public static final boolean g(@m80.k ex.c cVar) {
        kotlin.jvm.internal.g0.p(cVar, "<this>");
        return cVar.c().getAttributes().c(f84740b);
    }

    public static final void h(@m80.k cx.y yVar) {
        kotlin.jvm.internal.g0.p(yVar, "<this>");
        yVar.d().e(f84739a, g2.f100423a);
    }

    public static /* synthetic */ void f() {
    }
}
