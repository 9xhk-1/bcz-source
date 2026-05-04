package oy;

import h10.r;
import hy.o1;
import ix.g1;
import ix.y1;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import mx.v;
import org.slf4j.Logger;
import oy.a;
import oy.i;
import x00.q;
import yz.g2;
import zx.b0;
import zx.h0;
import zx.k0;
import zx.r0;
import zx.s0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final Logger f78512a = ez.a.a("io.ktor.server.plugins.partialcontent.PartialContent");

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final r0<d> f78513b = b0.o("PartialContent", a.f78514a, new x00.l() { // from class: oy.e
        @Override // x00.l
        public final Object invoke(Object obj) {
            g2 b11;
            b11 = f.b((s0) obj);
            return b11;
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a extends FunctionReferenceImpl implements x00.a<d> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f78514a = new a();

        public a() {
            super(0, d.class, "<init>", "<init>()V", 0);
        }

        @Override // x00.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke() {
            return new d();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.plugins.partialcontent.PartialContentKt$PartialContent$2$1", f = "PartialContent.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
    @u0({"SMAP\nPartialContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartialContent.kt\nio/ktor/server/plugins/partialcontent/PartialContentKt$PartialContent$2$1\n+ 2 ApplicationResponseFunctions.kt\nio/ktor/server/response/ApplicationResponseFunctionsKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,82:1\n25#2:83\n26#2:100\n58#3,16:84\n*S KotlinDebug\n*F\n+ 1 PartialContent.kt\nio/ktor/server/plugins/partialcontent/PartialContentKt$PartialContent$2$1\n*L\n56#1:83\n56#1:100\n56#1:84,16\n*E\n"})
    public static final class b extends SuspendLambda implements q<h0<d>, k0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f78515a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f78516b;

        public b(j00.c<? super b> cVar) {
            super(3, cVar);
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(h0<d> h0Var, k0 k0Var, j00.c<? super g2> cVar) {
            b bVar = new b(cVar);
            bVar.f78516b = k0Var;
            return bVar.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            r rVar;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f78515a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                k0 k0Var = (k0) this.f78516b;
                if (py.e.z(k0Var.f()) == null) {
                    f.c().trace("Skip " + py.e.q(k0Var.f()) + ": no ranges specified");
                    return g2.f100423a;
                }
                if (g.f(k0Var)) {
                    o1.e(k0Var);
                    return g2.f100423a;
                }
                f.c().trace("Skip " + py.e.q(k0Var.f()) + ": not a GET or HEAD request");
                g1 n02 = g1.f62797c.s().n0("Method " + k0Var.f().h().getMethod().l() + " is not allowed with range request");
                if (!k0Var.k().d()) {
                    h10.d d11 = o0.d(g1.class);
                    try {
                        rVar = o0.B(g1.class);
                    } catch (Throwable unused) {
                        rVar = null;
                    }
                    gz.a aVar = new gz.a(d11, rVar);
                    this.f78515a = 1;
                    if (k0Var.E(n02, aVar, this) == l11) {
                        return l11;
                    }
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
    @l00.d(c = "io.ktor.server.plugins.partialcontent.PartialContentKt$PartialContent$2$2", f = "PartialContent.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements x00.r<a.C0964a, zx.b, Object, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f78517a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f78518b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f78519c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f78520d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ s0<d> f78521e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(s0<d> s0Var, j00.c<? super c> cVar) {
            super(4, cVar);
            this.f78521e = s0Var;
        }

        @Override // x00.r
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a.C0964a c0964a, zx.b bVar, Object obj, j00.c<? super g2> cVar) {
            c cVar2 = new c(this.f78521e, cVar);
            cVar2.f78518b = c0964a;
            cVar2.f78519c = bVar;
            cVar2.f78520d = obj;
            return cVar2.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f78517a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                a.C0964a c0964a = (a.C0964a) this.f78518b;
                zx.b bVar = (zx.b) this.f78519c;
                Object obj2 = this.f78520d;
                y1 z11 = py.e.z(bVar.f());
                if (z11 == null) {
                    f.c().trace("No range header specified for " + py.e.q(bVar.f()));
                    if ((obj2 instanceof v.e) && !(obj2 instanceof i)) {
                        c0964a.b(new i.a((v.e) obj2));
                    }
                    return g2.f100423a;
                }
                if (!g.f(bVar)) {
                    return g2.f100423a;
                }
                if ((obj2 instanceof v.e) && !(obj2 instanceof i)) {
                    v.e eVar = (v.e) obj2;
                    Long a11 = eVar.a();
                    if (a11 == null) {
                        return g2.f100423a;
                    }
                    long longValue = a11.longValue();
                    int a12 = this.f78521e.l().a();
                    this.f78518b = null;
                    this.f78519c = null;
                    this.f78517a = 1;
                    if (oy.b.a(c0964a, eVar, bVar, z11, longValue, a12, this) == l11) {
                        return l11;
                    }
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

    public static final g2 b(s0 createRouteScopedPlugin) {
        g0.p(createRouteScopedPlugin, "$this$createRouteScopedPlugin");
        createRouteScopedPlugin.o(new b(null));
        createRouteScopedPlugin.n(oy.a.f78485a, new c(createRouteScopedPlugin, null));
        return g2.f100423a;
    }

    @m80.k
    public static final Logger c() {
        return f78512a;
    }

    @m80.k
    public static final r0<d> d() {
        return f78513b;
    }
}
