package rw;

import ix.b2;
import ix.e2;
import ix.l2;
import ix.t1;
import ix.t2;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.slf4j.Logger;
import rw.g;
import xy.c2;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nDefaultRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultRequest.kt\nio/ktor/client/plugins/DefaultRequest\n+ 2 Attributes.kt\nio/ktor/util/AttributesKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,229:1\n18#2:230\n58#3,16:231\n*S KotlinDebug\n*F\n+ 1 DefaultRequest.kt\nio/ktor/client/plugins/DefaultRequest\n*L\n64#1:230\n64#1:231,16\n*E\n"})
/* loaded from: classes8.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final b f84657b = new b(0 == true ? 1 : 0);

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final xy.a<g> f84658c;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final x00.l<a, g2> f84659a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @io.ktor.utils.io.c0
    public static final class a implements ix.b1 {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final ix.r0 f84660a = new ix.r0(0, 1, null);

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final b2 f84661b = new b2(null, null, 0, null, null, null, null, null, false, 511, null);

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final xy.b f84662c = xy.d.a(true);

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void m(a aVar, String str, String str2, Integer num, String str3, x00.l lVar, int i11, Object obj) {
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
                lVar = new x00.l() { // from class: rw.f
                    @Override // x00.l
                    public final Object invoke(Object obj2) {
                        g2 n11;
                        n11 = g.a.n((b2) obj2);
                        return n11;
                    }
                };
            }
            aVar.k(str, str2, num, str3, lVar);
        }

        public static final g2 n(b2 b2Var) {
            kotlin.jvm.internal.g0.p(b2Var, "<this>");
            return g2.f100423a;
        }

        @Override // ix.b1
        @m80.k
        public ix.r0 a() {
            return this.f84660a;
        }

        @m80.k
        public final xy.b c() {
            return this.f84662c;
        }

        @m80.k
        public final String d() {
            return this.f84661b.j();
        }

        public final int e() {
            return this.f84661b.n();
        }

        @m80.k
        public final b2 f() {
            return this.f84661b;
        }

        public final void g(@m80.k x00.l<? super xy.b, g2> block) {
            kotlin.jvm.internal.g0.p(block, "block");
            block.invoke(this.f84662c);
        }

        public final void h(@m80.k String value) {
            kotlin.jvm.internal.g0.p(value, "value");
            this.f84661b.y(value);
        }

        public final void i(int i11) {
            this.f84661b.B(i11);
        }

        public final void j(@m80.k String urlString) {
            kotlin.jvm.internal.g0.p(urlString, "urlString");
            ix.g2.m(this.f84661b, urlString);
        }

        public final void k(@m80.l String str, @m80.l String str2, @m80.l Integer num, @m80.l String str3, @m80.k x00.l<? super b2, g2> block) {
            kotlin.jvm.internal.g0.p(block, "block");
            e2.u(this.f84661b, str, str2, num, str3, block);
        }

        public final void l(@m80.k x00.l<? super b2, g2> block) {
            kotlin.jvm.internal.g0.p(block, "block");
            block.invoke(this.f84661b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nDefaultRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultRequest.kt\nio/ktor/client/plugins/DefaultRequest$Plugin\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,229:1\n1863#2,2:230\n*S KotlinDebug\n*F\n+ 1 DefaultRequest.kt\nio/ktor/client/plugins/DefaultRequest$Plugin\n*L\n132#1:230,2\n*E\n"})
    public static final class b implements y<a, g> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.client.plugins.DefaultRequest$Plugin$install$1", f = "DefaultRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @kotlin.jvm.internal.u0({"SMAP\nDefaultRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultRequest.kt\nio/ktor/client/plugins/DefaultRequest$Plugin$install$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,229:1\n1863#2,2:230\n1863#2,2:232\n*S KotlinDebug\n*F\n+ 1 DefaultRequest.kt\nio/ktor/client/plugins/DefaultRequest$Plugin$install$1\n*L\n78#1:230,2\n94#1:232,2\n*E\n"})
        public static final class a extends SuspendLambda implements x00.q<io.ktor.util.pipeline.d<Object, cx.y>, Object, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f84663a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f84664b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ g f84665c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g gVar, j00.c<? super a> cVar) {
                super(3, cVar);
                this.f84665c = gVar;
            }

            @Override // x00.q
            public final Object invoke(io.ktor.util.pipeline.d<Object, cx.y> dVar, Object obj, j00.c<? super g2> cVar) {
                a aVar = new a(this.f84665c, cVar);
                aVar.f84664b = dVar;
                return aVar.invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Logger logger;
                kotlin.coroutines.intrinsics.b.l();
                if (this.f84663a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                io.ktor.util.pipeline.d dVar = (io.ktor.util.pipeline.d) this.f84664b;
                String b2Var = ((cx.y) dVar.d()).j().toString();
                a aVar = new a();
                g gVar = this.f84665c;
                c2.e(aVar.a(), ((cx.y) dVar.d()).a());
                ix.q0 build = aVar.a().build();
                gVar.f84659a.invoke(aVar);
                Iterator<T> it = build.entries().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    List<String> a11 = aVar.a().a(str);
                    if (a11 == null) {
                        aVar.a().f(str, list);
                    } else if (!kotlin.jvm.internal.g0.g(a11, list) && !kotlin.jvm.internal.g0.g(str, ix.y0.f63006a.D())) {
                        aVar.a().remove(str);
                        aVar.a().f(str, list);
                        aVar.a().h(str, a11);
                    }
                }
                g.f84657b.f(aVar.f().b(), ((cx.y) dVar.d()).j());
                for (xy.a<?> aVar2 : aVar.c().f()) {
                    if (!((cx.y) dVar.d()).d().c(aVar2)) {
                        xy.b d11 = ((cx.y) dVar.d()).d();
                        kotlin.jvm.internal.g0.n(aVar2, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
                        d11.e(aVar2, aVar.c().g(aVar2));
                    }
                }
                ((cx.y) dVar.d()).a().clear();
                ((cx.y) dVar.d()).a().j(aVar.a().build());
                logger = i.f84674a;
                logger.trace("Applied DefaultRequest to " + b2Var + ". New url: " + ((cx.y) dVar.d()).j());
                return g2.f100423a;
            }
        }

        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public final List<String> d(List<String> list, List<String> list2) {
            if (list2.isEmpty()) {
                return list;
            }
            if (list.isEmpty()) {
                return list2;
            }
            if (((CharSequence) a00.r0.G2(list2)).length() == 0) {
                return list2;
            }
            List k11 = a00.g0.k((list.size() + list2.size()) - 1);
            int size = list.size() - 1;
            for (int i11 = 0; i11 < size; i11++) {
                k11.add(list.get(i11));
            }
            k11.addAll(list2);
            return a00.g0.b(k11);
        }

        @Override // rw.y
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(@m80.k g plugin, @m80.k lw.c scope) {
            kotlin.jvm.internal.g0.p(plugin, "plugin");
            kotlin.jvm.internal.g0.p(scope, "scope");
            scope.m0().C(cx.e0.f46866h.a(), new a(plugin, null));
        }

        public final void f(t2 t2Var, b2 b2Var) {
            if (b2Var.p() == null) {
                b2Var.D(t2Var.B());
            }
            if (b2Var.j().length() > 0) {
                return;
            }
            b2 c11 = l2.c(t2Var);
            c11.D(b2Var.p());
            if (b2Var.n() != 0) {
                c11.B(b2Var.n());
            }
            c11.v(g.f84657b.d(c11.g(), b2Var.g()));
            if (b2Var.d().length() > 0) {
                c11.s(b2Var.d());
            }
            ix.q1 b11 = t1.b(0, 1, null);
            c2.e(b11, c11.e());
            c11.t(b2Var.e());
            Iterator<T> it = b11.entries().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (!c11.e().contains(str)) {
                    c11.e().f(str, list);
                }
            }
            l2.t(b2Var, c11);
        }

        @Override // rw.y
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public g a(@m80.k x00.l<? super a, g2> block) {
            kotlin.jvm.internal.g0.p(block, "block");
            return new g(block, null);
        }

        @Override // rw.y
        @m80.k
        public xy.a<g> getKey() {
            return g.f84658c;
        }

        public b() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        h10.r rVar = null;
        h10.d d11 = kotlin.jvm.internal.o0.d(g.class);
        try {
            rVar = kotlin.jvm.internal.o0.B(g.class);
        } catch (Throwable unused) {
        }
        f84658c = new xy.a<>("DefaultRequest", new gz.a(d11, rVar));
    }

    public /* synthetic */ g(x00.l lVar, kotlin.jvm.internal.v vVar) {
        this(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(x00.l<? super a, g2> lVar) {
        this.f84659a = lVar;
    }
}
