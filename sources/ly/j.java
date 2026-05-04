package ly;

import a00.r0;
import ix.g1;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import m80.k;
import mx.v;
import qy.t;
import x00.q;
import x00.r;
import yz.g2;
import zx.j0;
import zx.k0;
import zx.x0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final hy.g f71705a = new hy.g(g1.f62797c.y());

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.plugins.contentnegotiation.ResponseConverterKt$convertResponseBody$1", f = "ResponseConverter.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    @u0({"SMAP\nResponseConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponseConverter.kt\nio/ktor/server/plugins/contentnegotiation/ResponseConverterKt$convertResponseBody$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,120:1\n1755#2,3:121\n*S KotlinDebug\n*F\n+ 1 ResponseConverter.kt\nio/ktor/server/plugins/contentnegotiation/ResponseConverterKt$convertResponseBody$1\n*L\n24#1:121,3\n*E\n"})
    public static final class a extends SuspendLambda implements r<j0<ly.a>, k0, Object, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f71706a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f71707b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f71708c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f71709d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.server.plugins.contentnegotiation.ResponseConverterKt$convertResponseBody$1$2", f = "ResponseConverter.kt", i = {0, 0, 0}, l = {66}, m = "invokeSuspend", n = {"acceptItems", "acceptCharset", "registration"}, s = {"L$0", "L$1", "L$3"})
        @u0({"SMAP\nResponseConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponseConverter.kt\nio/ktor/server/plugins/contentnegotiation/ResponseConverterKt$convertResponseBody$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1797#2,3:121\n1368#2:124\n1454#2,2:125\n774#2:127\n865#2,2:128\n1456#2,3:130\n1#3:133\n*S KotlinDebug\n*F\n+ 1 ResponseConverter.kt\nio/ktor/server/plugins/contentnegotiation/ResponseConverterKt$convertResponseBody$1$2\n*L\n44#1:121,3\n53#1:124\n53#1:125,2\n54#1:127\n54#1:128,2\n53#1:130,3\n*E\n"})
        /* renamed from: ly.j$a$a, reason: collision with other inner class name */
        public static final class C0865a extends SuspendLambda implements q<x0, Object, j00.c<? super Object>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f71710a;

            /* renamed from: b, reason: collision with root package name */
            public Object f71711b;

            /* renamed from: c, reason: collision with root package name */
            public Object f71712c;

            /* renamed from: d, reason: collision with root package name */
            public Object f71713d;

            /* renamed from: e, reason: collision with root package name */
            public int f71714e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ k0 f71715f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ j0<ly.a> f71716g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ List<g> f71717h;

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ gz.a f71718i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ Object f71719j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ boolean f71720k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0865a(k0 k0Var, j0<ly.a> j0Var, List<g> list, gz.a aVar, Object obj, boolean z11, j00.c<? super C0865a> cVar) {
                super(3, cVar);
                this.f71715f = k0Var;
                this.f71716g = j0Var;
                this.f71717h = list;
                this.f71718i = aVar;
                this.f71719j = obj;
                this.f71720k = z11;
            }

            @Override // x00.q
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(x0 x0Var, Object obj, j00.c<Object> cVar) {
                return new C0865a(this.f71715f, this.f71716g, this.f71717h, this.f71718i, this.f71719j, this.f71720k, cVar).invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x00d5  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x01a6  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x0146  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0123  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0118 -> B:5:0x011b). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                /*
                    Method dump skipped, instructions count: 466
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ly.j.a.C0865a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public a(j00.c<? super a> cVar) {
            super(4, cVar);
        }

        @Override // x00.r
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(j0<ly.a> j0Var, k0 k0Var, Object obj, j00.c<? super g2> cVar) {
            a aVar = new a(cVar);
            aVar.f71707b = j0Var;
            aVar.f71708c = k0Var;
            aVar.f71709d = obj;
            return aVar.invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f71706a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                j0 j0Var = (j0) this.f71707b;
                k0 k0Var = (k0) this.f71708c;
                Object obj2 = this.f71709d;
                if (obj2 instanceof v) {
                    ly.d.d().trace("Skipping because body is already converted.");
                    return g2.f100423a;
                }
                Set<h10.d<?>> f11 = ((ly.a) j0Var.c()).f();
                if (!(f11 instanceof Collection) || !f11.isEmpty()) {
                    Iterator<T> it = f11.iterator();
                    while (it.hasNext()) {
                        if (((h10.d) it.next()).B(obj2)) {
                            String C = o0.d(obj2.getClass()).C();
                            String str = py.e.o(k0Var.f()).l() + ' ' + py.e.q(k0Var.f());
                            ly.d.d().trace("Skipping response body transformation from " + C + " to OutgoingContent for the " + str + " request because the " + C + " type is ignored. See [ContentNegotiationConfig::ignoreType].");
                            return g2.f100423a;
                        }
                    }
                }
                gz.a a11 = t.a(k0Var.k());
                if (a11 == null) {
                    return g2.f100423a;
                }
                C0865a c0865a = new C0865a(k0Var, j0Var, ((ly.a) j0Var.c()).g(), a11, obj2, ((ly.a) j0Var.c()).e(), null);
                this.f71707b = null;
                this.f71708c = null;
                this.f71706a = 1;
                if (j0Var.d(c0865a, this) == l11) {
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
    @u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 ResponseConverter.kt\nio/ktor/server/plugins/contentnegotiation/ResponseConverterKt\n*L\n1#1,121:1\n108#2:122\n*E\n"})
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return e00.g.l(Double.valueOf(((f) t12).f()), Double.valueOf(((f) t11).f()));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1\n+ 2 ResponseConverter.kt\nio/ktor/server/plugins/contentnegotiation/ResponseConverterKt\n*L\n1#1,145:1\n109#2,9:146\n*E\n"})
    public static final class c<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f71721a;

        public c(Comparator comparator) {
            this.f71721a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int compare = this.f71721a.compare(t11, t12);
            if (compare != 0) {
                return compare;
            }
            ix.k e11 = ((f) t11).e();
            int i11 = g0.g(e11.f(), "*") ? 2 : 0;
            if (g0.g(e11.e(), "*")) {
                i11++;
            }
            Integer valueOf = Integer.valueOf(i11);
            ix.k e12 = ((f) t12).e();
            int i12 = g0.g(e12.f(), "*") ? 2 : 0;
            if (g0.g(e12.e(), "*")) {
                i12++;
            }
            return e00.g.l(valueOf, Integer.valueOf(i12));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenByDescending$1\n+ 2 ResponseConverter.kt\nio/ktor/server/plugins/contentnegotiation/ResponseConverterKt\n*L\n1#1,171:1\n118#2:172\n*E\n"})
    public static final class d<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f71722a;

        public d(Comparator comparator) {
            this.f71722a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int compare = this.f71722a.compare(t11, t12);
            return compare != 0 ? compare : e00.g.l(Integer.valueOf(((f) t12).e().b().size()), Integer.valueOf(((f) t11).e().b().size()));
        }
    }

    public static final void c(@k zx.o0<ly.a> o0Var) {
        g0.p(o0Var, "<this>");
        o0Var.s(new a(null));
    }

    public static final List<f> d(List<f> list) {
        return r0.z5(list, new d(new c(new b())));
    }
}
