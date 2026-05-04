package rw;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import org.slf4j.Logger;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final Logger f84764a = ez.a.a("io.ktor.client.plugins.UserAgent");

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final sw.b<o1> f84765b = sw.i.b("UserAgent", a.f84766a, new x00.l() { // from class: rw.q1
        @Override // x00.l
        public final Object invoke(Object obj) {
            g2 h11;
            h11 = s1.h((sw.d) obj);
            return h11;
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a extends AdaptedFunctionReference implements x00.a<o1> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f84766a = new a();

        public a() {
            super(0, o1.class, "<init>", "<init>(Ljava/lang/String;)V", 0);
        }

        @Override // x00.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o1 invoke() {
            return new o1(null, 1, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.UserAgentKt$UserAgent$2$1", f = "UserAgent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements x00.r<sw.m, cx.y, Object, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f84767a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f84768b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f84769c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, j00.c<? super b> cVar) {
            super(4, cVar);
            this.f84769c = str;
        }

        @Override // x00.r
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sw.m mVar, cx.y yVar, Object obj, j00.c<? super g2> cVar) {
            b bVar = new b(this.f84769c, cVar);
            bVar.f84768b = yVar;
            return bVar.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f84767a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            cx.y yVar = (cx.y) this.f84768b;
            s1.f84764a.trace("Adding User-Agent header: agent for " + yVar.j());
            cx.k0.h(yVar, ix.y0.f63006a.L0(), this.f84769c);
            return g2.f100423a;
        }
    }

    public static final void d(@m80.k lw.j<?> jVar) {
        kotlin.jvm.internal.g0.p(jVar, "<this>");
        jVar.s(f84765b, new x00.l() { // from class: rw.r1
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 e11;
                e11 = s1.e((o1) obj);
                return e11;
            }
        });
    }

    public static final g2 e(o1 install) {
        kotlin.jvm.internal.g0.p(install, "$this$install");
        install.b("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/70.0.3538.77 Chrome/70.0.3538.77 Safari/537.36");
        return g2.f100423a;
    }

    public static final void f(@m80.k lw.j<?> jVar) {
        kotlin.jvm.internal.g0.p(jVar, "<this>");
        jVar.s(f84765b, new x00.l() { // from class: rw.p1
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 g11;
                g11 = s1.g((o1) obj);
                return g11;
            }
        });
    }

    public static final g2 g(o1 install) {
        kotlin.jvm.internal.g0.p(install, "$this$install");
        install.b("curl/7.61.0");
        return g2.f100423a;
    }

    public static final g2 h(sw.d createClientPlugin) {
        kotlin.jvm.internal.g0.p(createClientPlugin, "$this$createClientPlugin");
        createClientPlugin.j(new b(((o1) createClientPlugin.f()).a(), null));
        return g2.f100423a;
    }

    @m80.k
    public static final sw.b<o1> j() {
        return f84765b;
    }
}
