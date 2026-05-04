package rw;

import ix.k;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.slf4j.Logger;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nHttpPlainText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpPlainText.kt\nio/ktor/client/plugins/HttpPlainTextKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,167:1\n1062#2:168\n774#2:169\n865#2,2:170\n1053#2:172\n1863#2,2:173\n1863#2,2:175\n*S KotlinDebug\n*F\n+ 1 HttpPlainText.kt\nio/ktor/client/plugins/HttpPlainTextKt\n*L\n68#1:168\n71#1:169\n71#1:170,2\n72#1:172\n75#1:173,2\n80#1:175,2\n*E\n"})
/* loaded from: classes8.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final Logger f84590a = ez.a.a("io.ktor.client.plugins.HttpPlainText");

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final sw.b<a0> f84591b = sw.i.b("HttpPlainText", a.f84592a, new x00.l() { // from class: rw.b0
        @Override // x00.l
        public final Object invoke(Object obj) {
            g2 c11;
            c11 = c0.c((sw.d) obj);
            return c11;
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a extends FunctionReferenceImpl implements x00.a<a0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f84592a = new a();

        public a() {
            super(0, a0.class, "<init>", "<init>()V", 0);
        }

        @Override // x00.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a0 invoke() {
            return new a0();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.HttpPlainTextKt$HttpPlainText$2$1", f = "HttpPlainText.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements x00.q<cx.y, Object, j00.c<? super mx.v>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f84593a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f84594b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f84595c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f84596d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Charset f84597e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Charset charset, j00.c<? super b> cVar) {
            super(3, cVar);
            this.f84596d = str;
            this.f84597e = charset;
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(cx.y yVar, Object obj, j00.c<? super mx.v> cVar) {
            b bVar = new b(this.f84596d, this.f84597e, cVar);
            bVar.f84594b = yVar;
            bVar.f84595c = obj;
            return bVar.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f84593a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            cx.y yVar = (cx.y) this.f84594b;
            Object obj2 = this.f84595c;
            c0.d(this.f84596d, yVar);
            if (!(obj2 instanceof String)) {
                return null;
            }
            ix.k g11 = ix.d1.g(yVar);
            if (g11 == null || kotlin.jvm.internal.g0.g(g11.f(), k.h.f62902a.g().f())) {
                return c0.f(this.f84597e, yVar, (String) obj2, g11);
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.HttpPlainTextKt$HttpPlainText$2$2", f = "HttpPlainText.kt", i = {0}, l = {137}, m = "invokeSuspend", n = {"response"}, s = {"L$0"})
    public static final class c extends SuspendLambda implements x00.s<sw.v, ex.c, io.ktor.utils.io.g, gz.a, j00.c<? super Object>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f84598a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f84599b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f84600c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f84601d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Charset f84602e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Charset charset, j00.c<? super c> cVar) {
            super(5, cVar);
            this.f84602e = charset;
        }

        @Override // x00.s
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sw.v vVar, ex.c cVar, io.ktor.utils.io.g gVar, gz.a aVar, j00.c<Object> cVar2) {
            c cVar3 = new c(this.f84602e, cVar2);
            cVar3.f84599b = cVar;
            cVar3.f84600c = gVar;
            cVar3.f84601d = aVar;
            return cVar3.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ex.c cVar;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f84598a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                ex.c cVar2 = (ex.c) this.f84599b;
                io.ktor.utils.io.g gVar = (io.ktor.utils.io.g) this.f84600c;
                if (!kotlin.jvm.internal.g0.g(((gz.a) this.f84601d).b(), kotlin.jvm.internal.o0.d(String.class))) {
                    return null;
                }
                this.f84599b = cVar2;
                this.f84600c = null;
                this.f84598a = 1;
                Object G = io.ktor.utils.io.j.G(gVar, this);
                if (G == l11) {
                    return l11;
                }
                cVar = cVar2;
                obj = G;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar = (ex.c) this.f84599b;
                kotlin.e.n(obj);
            }
            return c0.e(this.f84602e, cVar.c(), (y40.c0) obj);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 HttpPlainText.kt\nio/ktor/client/plugins/HttpPlainTextKt\n*L\n1#1,102:1\n72#2:103\n*E\n"})
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return e00.g.l(iz.a.l((Charset) t11), iz.a.l((Charset) t12));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 HttpPlainText.kt\nio/ktor/client/plugins/HttpPlainTextKt\n*L\n1#1,121:1\n68#2:122\n*E\n"})
    public static final class e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return e00.g.l((Float) ((Pair) t12).getSecond(), (Float) ((Pair) t11).getSecond());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(@m80.k lw.j<?> jVar, @m80.k x00.l<? super a0, g2> block) {
        kotlin.jvm.internal.g0.p(jVar, "<this>");
        kotlin.jvm.internal.g0.p(block, "block");
        jVar.s(f84591b, block);
    }

    public static final g2 c(sw.d createClientPlugin) {
        kotlin.jvm.internal.g0.p(createClientPlugin, "$this$createClientPlugin");
        List<Pair> z52 = a00.r0.z5(a00.n1.J1(((a0) createClientPlugin.f()).a()), new e());
        Charset c11 = ((a0) createClientPlugin.f()).c();
        Set<Charset> b11 = ((a0) createClientPlugin.f()).b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : b11) {
            if (!((a0) createClientPlugin.f()).a().containsKey((Charset) obj)) {
                arrayList.add(obj);
            }
        }
        List<Charset> z53 = a00.r0.z5(arrayList, new d());
        StringBuilder sb2 = new StringBuilder();
        for (Charset charset : z53) {
            if (sb2.length() > 0) {
                sb2.append(",");
            }
            sb2.append(iz.a.l(charset));
        }
        for (Pair pair : z52) {
            Charset charset2 = (Charset) pair.component1();
            float floatValue = ((Number) pair.component2()).floatValue();
            if (sb2.length() > 0) {
                sb2.append(",");
            }
            double d11 = floatValue;
            if (0.0d > d11 || d11 > 1.0d) {
                throw new IllegalStateException("Check failed.");
            }
            sb2.append(iz.a.l(charset2) + ";q=" + (c10.d.L0(100 * floatValue) / 100.0d));
        }
        if (sb2.length() == 0) {
            sb2.append(iz.a.l(c11));
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g0.o(sb3, "toString(...)");
        Charset d12 = ((a0) createClientPlugin.f()).d();
        if (d12 == null && (d12 = (Charset) a00.r0.L2(z53)) == null) {
            Pair pair2 = (Pair) a00.r0.L2(z52);
            d12 = pair2 != null ? (Charset) pair2.getFirst() : null;
            if (d12 == null) {
                d12 = u30.d.f91599b;
            }
        }
        createClientPlugin.g(i1.f84675a, new b(sb3, d12, null));
        createClientPlugin.n(new c(c11, null));
        return g2.f100423a;
    }

    public static final void d(String str, cx.y yVar) {
        ix.r0 a11 = yVar.a();
        ix.y0 y0Var = ix.y0.f63006a;
        if (a11.get(y0Var.e()) != null) {
            return;
        }
        f84590a.trace("Adding Accept-Charset=" + str + " to " + yVar.j());
        yVar.a().d(y0Var.e(), str);
    }

    public static final String e(Charset charset, mw.a aVar, y40.c0 c0Var) {
        Charset b11 = ix.d1.b(aVar.i());
        if (b11 != null) {
            charset = b11;
        }
        f84590a.trace("Reading response body for " + aVar.h().getUrl() + " as String with charset " + charset);
        return jz.s.g(c0Var, charset, 0, 2, null);
    }

    public static final mx.v f(Charset charset, cx.y yVar, String str, ix.k kVar) {
        Charset a11;
        ix.k g11 = kVar == null ? k.h.f62902a.g() : kVar;
        if (kVar != null && (a11 = ix.m.a(kVar)) != null) {
            charset = a11;
        }
        f84590a.trace("Sending request body to " + yVar.j() + " as text/plain with charset " + charset);
        return new mx.c0(str, ix.m.b(g11, charset), null, 4, null);
    }

    @m80.k
    public static final sw.b<a0> j() {
        return f84591b;
    }
}
