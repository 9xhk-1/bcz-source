package rw;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nBodyProgress.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BodyProgress.kt\nio/ktor/client/plugins/BodyProgressKt\n+ 2 Attributes.kt\nio/ktor/util/AttributesKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,96:1\n18#2:97\n18#2:114\n58#3,16:98\n58#3,16:115\n*S KotlinDebug\n*F\n+ 1 BodyProgress.kt\nio/ktor/client/plugins/BodyProgressKt\n*L\n21#1:97\n24#1:114\n21#1:98,16\n24#1:115,16\n*E\n"})
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final xy.a<nw.d> f84604a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final xy.a<nw.d> f84605b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final sw.b<g2> f84606c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.BodyProgressKt$BodyProgress$1$1", f = "BodyProgress.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements x00.q<cx.y, mx.v, j00.c<? super mx.v>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f84607a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f84608b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f84609c;

        public a(j00.c<? super a> cVar) {
            super(3, cVar);
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(cx.y yVar, mx.v vVar, j00.c<? super mx.v> cVar) {
            a aVar = new a(cVar);
            aVar.f84608b = yVar;
            aVar.f84609c = vVar;
            return aVar.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f84607a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            cx.y yVar = (cx.y) this.f84608b;
            mx.v vVar = (mx.v) this.f84609c;
            nw.d dVar = (nw.d) yVar.d().a(d.f84604a);
            if (dVar == null) {
                return null;
            }
            return new nw.c(vVar, yVar.h(), dVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.BodyProgressKt$BodyProgress$1$2", f = "BodyProgress.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements x00.p<ex.c, j00.c<? super ex.c>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f84610a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f84611b;

        public b(j00.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            b bVar = new b(cVar);
            bVar.f84611b = obj;
            return bVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ex.c cVar, j00.c<? super ex.c> cVar2) {
            return ((b) create(cVar, cVar2)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f84610a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            ex.c cVar = (ex.c) this.f84611b;
            nw.d dVar = (nw.d) cVar.c().h().getAttributes().a(d.f84605b);
            if (dVar == null) {
                return null;
            }
            return d.h(cVar, dVar);
        }
    }

    static {
        h10.r rVar;
        h10.d d11 = kotlin.jvm.internal.o0.d(nw.d.class);
        h10.r rVar2 = null;
        try {
            rVar = kotlin.jvm.internal.o0.B(nw.d.class);
        } catch (Throwable unused) {
            rVar = null;
        }
        f84604a = new xy.a<>("UploadProgressListenerAttributeKey", new gz.a(d11, rVar));
        h10.d d12 = kotlin.jvm.internal.o0.d(nw.d.class);
        try {
            rVar2 = kotlin.jvm.internal.o0.B(nw.d.class);
        } catch (Throwable unused2) {
        }
        f84605b = new xy.a<>("DownloadProgressListenerAttributeKey", new gz.a(d12, rVar2));
        f84606c = sw.i.c("BodyProgress", new x00.l() { // from class: rw.c
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 b11;
                b11 = d.b((sw.d) obj);
                return b11;
            }
        });
    }

    public static final g2 b(sw.d createClientPlugin) {
        kotlin.jvm.internal.g0.p(createClientPlugin, "$this$createClientPlugin");
        createClientPlugin.g(rw.b.f84585a, new a(null));
        createClientPlugin.g(rw.a.f84556a, new b(null));
        return g2.f100423a;
    }

    @m80.k
    public static final sw.b<g2> e() {
        return f84606c;
    }

    public static final void f(@m80.k cx.y yVar, @m80.l nw.d dVar) {
        kotlin.jvm.internal.g0.p(yVar, "<this>");
        if (dVar == null) {
            yVar.d().b(f84605b);
        } else {
            yVar.d().e(f84605b, dVar);
        }
    }

    public static final void g(@m80.k cx.y yVar, @m80.l nw.d dVar) {
        kotlin.jvm.internal.g0.p(yVar, "<this>");
        if (dVar == null) {
            yVar.d().b(f84604a);
        } else {
            yVar.d().e(f84604a, dVar);
        }
    }

    @m80.k
    public static final ex.c h(@m80.k ex.c cVar, @m80.k nw.d listener) {
        kotlin.jvm.internal.g0.p(cVar, "<this>");
        kotlin.jvm.internal.g0.p(listener, "listener");
        return yw.d.b(cVar.c(), fx.a.a(cVar.b(), cVar.getCoroutineContext(), ix.d1.d(cVar), listener)).i();
    }
}
