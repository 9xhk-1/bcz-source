package zx;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.random.Random;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@io.ktor.utils.io.c0
/* loaded from: classes8.dex */
public abstract class o0<PluginConfig> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final xy.a<q0> f103062a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<f0<g2>> f103063b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<f0<Object>> f103064c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final List<f0<Object>> f103065d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final List<f0<Object>> f103066e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final List<e0<?>> f103067f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a extends FunctionReferenceImpl implements x00.p<PluginConfig, io.ktor.util.pipeline.d<g2, k0>, h0<PluginConfig>> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f103068a = new a();

        public a() {
            super(2, h0.class, "<init>", "<init>(Ljava/lang/Object;Lio/ktor/util/pipeline/PipelineContext;)V", 0);
        }

        @Override // x00.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h0<PluginConfig> invoke(PluginConfig p02, io.ktor.util.pipeline.d<g2, k0> p12) {
            kotlin.jvm.internal.g0.p(p02, "p0");
            kotlin.jvm.internal.g0.p(p12, "p1");
            return new h0<>(p02, p12);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.application.PluginBuilder$onCall$2", f = "PluginBuilder.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements x00.r<h0<PluginConfig>, k0, g2, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f103069a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f103070b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f103071c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x00.q<h0<PluginConfig>, k0, j00.c<? super g2>, Object> f103072d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(x00.q<? super h0<PluginConfig>, ? super k0, ? super j00.c<? super g2>, ? extends Object> qVar, j00.c<? super b> cVar) {
            super(4, cVar);
            this.f103072d = qVar;
        }

        @Override // x00.r
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(h0<PluginConfig> h0Var, k0 k0Var, g2 g2Var, j00.c<? super g2> cVar) {
            b bVar = new b(this.f103072d, cVar);
            bVar.f103070b = h0Var;
            bVar.f103071c = k0Var;
            return bVar.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f103069a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                h0<PluginConfig> h0Var = (h0) this.f103070b;
                k0 k0Var = (k0) this.f103071c;
                x00.q<h0<PluginConfig>, k0, j00.c<? super g2>, Object> qVar = this.f103072d;
                this.f103070b = null;
                this.f103069a = 1;
                if (qVar.invoke(h0Var, k0Var, this) == l11) {
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
    public /* synthetic */ class c extends FunctionReferenceImpl implements x00.p<PluginConfig, io.ktor.util.pipeline.d<Object, k0>, i0<PluginConfig>> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f103073a = new c();

        public c() {
            super(2, i0.class, "<init>", "<init>(Ljava/lang/Object;Lio/ktor/util/pipeline/PipelineContext;)V", 0);
        }

        @Override // x00.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i0<PluginConfig> invoke(PluginConfig p02, io.ktor.util.pipeline.d<Object, k0> p12) {
            kotlin.jvm.internal.g0.p(p02, "p0");
            kotlin.jvm.internal.g0.p(p12, "p1");
            return new i0<>(p02, p12);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.application.PluginBuilder$onCallReceive$2", f = "PluginBuilder.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements x00.r<i0<PluginConfig>, k0, Object, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f103074a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f103075b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f103076c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f103077d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x00.r<i0<PluginConfig>, k0, Object, j00.c<? super g2>, Object> f103078e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(x00.r<? super i0<PluginConfig>, ? super k0, Object, ? super j00.c<? super g2>, ? extends Object> rVar, j00.c<? super d> cVar) {
            super(4, cVar);
            this.f103078e = rVar;
        }

        @Override // x00.r
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i0<PluginConfig> i0Var, k0 k0Var, Object obj, j00.c<? super g2> cVar) {
            d dVar = new d(this.f103078e, cVar);
            dVar.f103075b = i0Var;
            dVar.f103076c = k0Var;
            dVar.f103077d = obj;
            return dVar.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f103074a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                i0<PluginConfig> i0Var = (i0) this.f103075b;
                k0 k0Var = (k0) this.f103076c;
                Object obj2 = this.f103077d;
                x00.r<i0<PluginConfig>, k0, Object, j00.c<? super g2>, Object> rVar = this.f103078e;
                this.f103075b = null;
                this.f103076c = null;
                this.f103074a = 1;
                if (rVar.invoke(i0Var, k0Var, obj2, this) == l11) {
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
    @l00.d(c = "io.ktor.server.application.PluginBuilder$onCallReceive$3", f = "PluginBuilder.kt", i = {}, l = {165}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements x00.r<i0<PluginConfig>, k0, Object, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f103079a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f103080b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f103081c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x00.q<i0<PluginConfig>, k0, j00.c<? super g2>, Object> f103082d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(x00.q<? super i0<PluginConfig>, ? super k0, ? super j00.c<? super g2>, ? extends Object> qVar, j00.c<? super e> cVar) {
            super(4, cVar);
            this.f103082d = qVar;
        }

        @Override // x00.r
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i0<PluginConfig> i0Var, k0 k0Var, Object obj, j00.c<? super g2> cVar) {
            e eVar = new e(this.f103082d, cVar);
            eVar.f103080b = i0Var;
            eVar.f103081c = k0Var;
            return eVar.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f103079a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                i0<PluginConfig> i0Var = (i0) this.f103080b;
                k0 k0Var = (k0) this.f103081c;
                x00.q<i0<PluginConfig>, k0, j00.c<? super g2>, Object> qVar = this.f103082d;
                this.f103080b = null;
                this.f103079a = 1;
                if (qVar.invoke(i0Var, k0Var, this) == l11) {
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
    public /* synthetic */ class f extends FunctionReferenceImpl implements x00.p<PluginConfig, io.ktor.util.pipeline.d<Object, k0>, j0<PluginConfig>> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f103083a = new f();

        public f() {
            super(2, j0.class, "<init>", "<init>(Ljava/lang/Object;Lio/ktor/util/pipeline/PipelineContext;)V", 0);
        }

        @Override // x00.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j0<PluginConfig> invoke(PluginConfig p02, io.ktor.util.pipeline.d<Object, k0> p12) {
            kotlin.jvm.internal.g0.p(p02, "p0");
            kotlin.jvm.internal.g0.p(p12, "p1");
            return new j0<>(p02, p12);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.application.PluginBuilder$onCallRespond$2", f = "PluginBuilder.kt", i = {}, l = {178}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements x00.r<j0<PluginConfig>, k0, Object, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f103084a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f103085b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f103086c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x00.q<j0<PluginConfig>, k0, j00.c<? super g2>, Object> f103087d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(x00.q<? super j0<PluginConfig>, ? super k0, ? super j00.c<? super g2>, ? extends Object> qVar, j00.c<? super g> cVar) {
            super(4, cVar);
            this.f103087d = qVar;
        }

        @Override // x00.r
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(j0<PluginConfig> j0Var, k0 k0Var, Object obj, j00.c<? super g2> cVar) {
            g gVar = new g(this.f103087d, cVar);
            gVar.f103085b = j0Var;
            gVar.f103086c = k0Var;
            return gVar.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f103084a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                j0<PluginConfig> j0Var = (j0) this.f103085b;
                k0 k0Var = (k0) this.f103086c;
                x00.q<j0<PluginConfig>, k0, j00.c<? super g2>, Object> qVar = this.f103087d;
                this.f103085b = null;
                this.f103084a = 1;
                if (qVar.invoke(j0Var, k0Var, this) == l11) {
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

    /* JADX INFO: Add missing generic type declarations: [T, ContextT] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.application.PluginBuilder$onDefaultPhase$1", f = "PluginBuilder.kt", i = {}, l = {217}, m = "invokeSuspend", n = {}, s = {})
    public static final class h<ContextT, T> extends SuspendLambda implements x00.r<ContextT, k0, T, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f103088a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f103089b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f103090c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f103091d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x00.r<ContextT, k0, T, j00.c<? super g2>, Object> f103092e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(x00.r<? super ContextT, ? super k0, ? super T, ? super j00.c<? super g2>, ? extends Object> rVar, j00.c<? super h> cVar) {
            super(4, cVar);
            this.f103092e = rVar;
        }

        /* JADX WARN: Incorrect types in method signature: (TContextT;Lzx/k0;TT;Lj00/c<-Lyz/g2;>;)Ljava/lang/Object; */
        @Override // x00.r
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(u uVar, k0 k0Var, Object obj, j00.c cVar) {
            h hVar = new h(this.f103092e, cVar);
            hVar.f103089b = uVar;
            hVar.f103090c = k0Var;
            hVar.f103091d = obj;
            return hVar.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f103088a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                u uVar = (u) this.f103089b;
                k0 k0Var = (k0) this.f103090c;
                Object obj2 = this.f103091d;
                x00.r<ContextT, k0, T, j00.c<? super g2>, Object> rVar = this.f103092e;
                this.f103089b = null;
                this.f103090c = null;
                this.f103088a = 1;
                if (rVar.invoke(uVar, k0Var, obj2, this) == l11) {
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

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.application.PluginBuilder$onDefaultPhaseWithMessage$1$1", f = "PluginBuilder.kt", i = {}, l = {196}, m = "invokeSuspend", n = {}, s = {})
    public static final class i<T> extends SuspendLambda implements x00.q<io.ktor.util.pipeline.d<T, k0>, T, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f103093a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f103094b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o0<PluginConfig> f103095c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f103096d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x00.r<ContextT, k0, T, j00.c<? super g2>, Object> f103097e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ x00.p<PluginConfig, io.ktor.util.pipeline.d<T, k0>, ContextT> f103098f;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.server.application.PluginBuilder$onDefaultPhaseWithMessage$1$1$1", f = "PluginBuilder.kt", i = {}, l = {197, 200, 202}, m = "invokeSuspend", n = {}, s = {})
        @kotlin.jvm.internal.u0({"SMAP\nPluginBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PluginBuilder.kt\nio/ktor/server/application/PluginBuilder$onDefaultPhaseWithMessage$1$1$1\n+ 2 ApplicationCallPipeline.kt\nio/ktor/server/application/ApplicationCallPipelineKt\n*L\n1#1,222:1\n79#2:223\n*S KotlinDebug\n*F\n+ 1 PluginBuilder.kt\nio/ktor/server/application/PluginBuilder$onDefaultPhaseWithMessage$1$1$1\n*L\n200#1:223\n*E\n"})
        public static final class a extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f103099a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ xy.a<q0> f103100b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f103101c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ x00.r<ContextT, k0, T, j00.c<? super g2>, Object> f103102d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ x00.p<PluginConfig, io.ktor.util.pipeline.d<T, k0>, ContextT> f103103e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ PluginConfig f103104f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ io.ktor.util.pipeline.d<T, k0> f103105g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(xy.a<q0> aVar, String str, x00.r<? super ContextT, ? super k0, ? super T, ? super j00.c<? super g2>, ? extends Object> rVar, x00.p<? super PluginConfig, ? super io.ktor.util.pipeline.d<T, k0>, ? extends ContextT> pVar, PluginConfig pluginconfig, io.ktor.util.pipeline.d<T, k0> dVar, j00.c<? super a> cVar) {
                super(1, cVar);
                this.f103100b = aVar;
                this.f103101c = str;
                this.f103102d = rVar;
                this.f103103e = pVar;
                this.f103104f = pluginconfig;
                this.f103105g = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(j00.c<?> cVar) {
                return new a(this.f103100b, this.f103101c, this.f103102d, this.f103103e, this.f103104f, this.f103105g, cVar);
            }

            @Override // x00.l
            public final Object invoke(j00.c<? super g2> cVar) {
                return ((a) create(cVar)).invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x006a, code lost:
            
                if (ay.d.c(r7, r1, r6) == r0) goto L20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x006c, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
            
                if (r7.invoke(r1, r4, r5, r6) == r0) goto L20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
            
                if (ay.d.e(r7, r1, r6) == r0) goto L20;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r6.f103099a
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L25
                    if (r1 == r4) goto L21
                    if (r1 == r3) goto L1d
                    if (r1 != r2) goto L15
                    kotlin.e.n(r7)
                    goto L6d
                L15:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L1d:
                    kotlin.e.n(r7)
                    goto L5c
                L21:
                    kotlin.e.n(r7)
                    goto L39
                L25:
                    kotlin.e.n(r7)
                    xy.a<zx.q0> r7 = r6.f103100b
                    java.lang.String r7 = r7.e()
                    java.lang.String r1 = r6.f103101c
                    r6.f103099a = r4
                    java.lang.Object r7 = ay.d.e(r7, r1, r6)
                    if (r7 != r0) goto L39
                    goto L6c
                L39:
                    x00.r<ContextT, zx.k0, T, j00.c<? super yz.g2>, java.lang.Object> r7 = r6.f103102d
                    x00.p<PluginConfig, io.ktor.util.pipeline.d<T, zx.k0>, ContextT> r1 = r6.f103103e
                    PluginConfig r4 = r6.f103104f
                    io.ktor.util.pipeline.d<T, zx.k0> r5 = r6.f103105g
                    java.lang.Object r1 = r1.invoke(r4, r5)
                    io.ktor.util.pipeline.d<T, zx.k0> r4 = r6.f103105g
                    java.lang.Object r4 = r4.d()
                    zx.k0 r4 = (zx.k0) r4
                    io.ktor.util.pipeline.d<T, zx.k0> r5 = r6.f103105g
                    java.lang.Object r5 = r5.e()
                    r6.f103099a = r3
                    java.lang.Object r7 = r7.invoke(r1, r4, r5, r6)
                    if (r7 != r0) goto L5c
                    goto L6c
                L5c:
                    xy.a<zx.q0> r7 = r6.f103100b
                    java.lang.String r7 = r7.e()
                    java.lang.String r1 = r6.f103101c
                    r6.f103099a = r2
                    java.lang.Object r7 = ay.d.c(r7, r1, r6)
                    if (r7 != r0) goto L6d
                L6c:
                    return r0
                L6d:
                    yz.g2 r7 = yz.g2.f100423a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: zx.o0.i.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(o0<PluginConfig> o0Var, String str, x00.r<? super ContextT, ? super k0, ? super T, ? super j00.c<? super g2>, ? extends Object> rVar, x00.p<? super PluginConfig, ? super io.ktor.util.pipeline.d<T, k0>, ? extends ContextT> pVar, j00.c<? super i> cVar) {
            super(3, cVar);
            this.f103095c = o0Var;
            this.f103096d = str;
            this.f103097e = rVar;
            this.f103098f = pVar;
        }

        public final Object invoke(io.ktor.util.pipeline.d<T, k0> dVar, T t11, j00.c<? super g2> cVar) {
            i iVar = new i(this.f103095c, this.f103096d, this.f103097e, this.f103098f, cVar);
            iVar.f103094b = dVar;
            return iVar.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f103093a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                io.ktor.util.pipeline.d dVar = (io.ktor.util.pipeline.d) this.f103094b;
                xy.a<q0> h11 = this.f103095c.h();
                PluginConfig l12 = this.f103095c.l();
                String e11 = h11.e();
                a aVar = new a(h11, this.f103096d, this.f103097e, this.f103098f, l12, dVar, null);
                this.f103093a = 1;
                if (cz.a.a(e11, aVar, this) == l11) {
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

        /* JADX WARN: Multi-variable type inference failed */
        @Override // x00.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, j00.c<? super g2> cVar) {
            return invoke((io.ktor.util.pipeline.d<io.ktor.util.pipeline.d<T, k0>, k0>) obj, (io.ktor.util.pipeline.d<T, k0>) obj2, cVar);
        }
    }

    public o0(@m80.k xy.a<q0> key) {
        kotlin.jvm.internal.g0.p(key, "key");
        this.f103062a = key;
        this.f103063b = new ArrayList();
        this.f103064c = new ArrayList();
        this.f103065d = new ArrayList();
        this.f103066e = new ArrayList();
        this.f103067f = new ArrayList();
    }

    public static final g2 v(io.ktor.util.pipeline.h hVar, o0 o0Var, String str, x00.r rVar, x00.p pVar, io.ktor.util.pipeline.c pipeline) {
        kotlin.jvm.internal.g0.p(pipeline, "pipeline");
        pipeline.C(hVar, new i(o0Var, str, rVar, pVar, null));
        return g2.f100423a;
    }

    @m80.k
    public final List<f0<Object>> b() {
        return this.f103066e;
    }

    @m80.k
    public abstract zx.a c();

    @m80.k
    public final ey.a d() {
        return f().getConfig();
    }

    @m80.k
    public final List<f0<g2>> e() {
        return this.f103063b;
    }

    @m80.k
    public final zx.f f() {
        return k().a();
    }

    @m80.k
    public final List<e0<?>> g() {
        return this.f103067f;
    }

    @m80.k
    public final xy.a<q0> h() {
        return this.f103062a;
    }

    @m80.k
    public final List<f0<Object>> i() {
        return this.f103064c;
    }

    @m80.k
    public final List<f0<Object>> j() {
        return this.f103065d;
    }

    @m80.k
    public abstract zx.c k();

    @m80.k
    public abstract PluginConfig l();

    @m80.k
    public final io.ktor.util.pipeline.h m() {
        return new io.ktor.util.pipeline.h(this.f103062a.e() + "Phase" + Random.Default.nextInt());
    }

    public final <HookHandler> void n(@m80.k d0<HookHandler> hook, HookHandler hookhandler) {
        kotlin.jvm.internal.g0.p(hook, "hook");
        this.f103067f.add(new e0<>(hook, hookhandler));
    }

    public final void o(@m80.k x00.q<? super h0<PluginConfig>, ? super k0, ? super j00.c<? super g2>, ? extends Object> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        t(this.f103063b, zx.c.f103019k.f(), ay.a.f5557a, a.f103068a, new b(block, null));
    }

    public final void p(@m80.k x00.q<? super i0<PluginConfig>, ? super k0, ? super j00.c<? super g2>, ? extends Object> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        q(new e(block, null));
    }

    public final void q(@m80.k x00.r<? super i0<PluginConfig>, ? super k0, Object, ? super j00.c<? super g2>, ? extends Object> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        t(this.f103064c, py.c.f81324h.c(), ay.a.f5558b, c.f103073a, new d(block, null));
    }

    public final void r(@m80.k x00.q<? super j0<PluginConfig>, ? super k0, ? super j00.c<? super g2>, ? extends Object> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        s(new g(block, null));
    }

    public final void s(@m80.k x00.r<? super j0<PluginConfig>, ? super k0, Object, ? super j00.c<? super g2>, ? extends Object> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        t(this.f103065d, qy.m.f82742h.g(), ay.a.f5559c, f.f103083a, block);
    }

    public final <T, ContextT extends u<PluginConfig>> void t(List<f0<T>> list, io.ktor.util.pipeline.h hVar, String str, x00.p<? super PluginConfig, ? super io.ktor.util.pipeline.d<T, k0>, ? extends ContextT> pVar, x00.r<? super ContextT, ? super k0, ? super T, ? super j00.c<? super g2>, ? extends Object> rVar) {
        u(list, hVar, str, pVar, new h(rVar, null));
    }

    public final <T, ContextT extends u<PluginConfig>> void u(List<f0<T>> list, final io.ktor.util.pipeline.h hVar, final String str, final x00.p<? super PluginConfig, ? super io.ktor.util.pipeline.d<T, k0>, ? extends ContextT> pVar, final x00.r<? super ContextT, ? super k0, ? super T, ? super j00.c<? super g2>, ? extends Object> rVar) {
        list.add(new f0<>(hVar, new x00.l() { // from class: zx.n0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 v11;
                v11 = o0.v(io.ktor.util.pipeline.h.this, this, str, rVar, pVar, (io.ktor.util.pipeline.c) obj);
                return v11;
            }
        }));
    }
}
