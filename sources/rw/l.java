package rw;

import ix.k;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mx.v;
import org.slf4j.Logger;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final Logger f84702a = ez.a.a("io.ktor.client.plugins.defaultTransformers");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$1", f = "DefaultTransform.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements x00.q<io.ktor.util.pipeline.d<Object, cx.y>, Object, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f84703a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f84704b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f84705c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: rw.l$a$a, reason: collision with other inner class name */
        public static final class C1060a extends v.a {

            /* renamed from: b, reason: collision with root package name */
            public final ix.k f84706b;

            /* renamed from: c, reason: collision with root package name */
            public final long f84707c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Object f84708d;

            public C1060a(ix.k kVar, Object obj) {
                this.f84708d = obj;
                this.f84706b = kVar == null ? k.a.f62847a.j() : kVar;
                this.f84707c = ((byte[]) obj).length;
            }

            @Override // mx.v
            public Long a() {
                return Long.valueOf(this.f84707c);
            }

            @Override // mx.v
            public ix.k b() {
                return this.f84706b;
            }

            @Override // mx.v.a
            public byte[] m() {
                return (byte[]) this.f84708d;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b extends v.e {

            /* renamed from: b, reason: collision with root package name */
            public final Long f84709b;

            /* renamed from: c, reason: collision with root package name */
            public final ix.k f84710c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Object f84711d;

            public b(io.ktor.util.pipeline.d<Object, cx.y> dVar, ix.k kVar, Object obj) {
                this.f84711d = obj;
                String str = dVar.d().a().get(ix.y0.f63006a.z());
                this.f84709b = str != null ? Long.valueOf(Long.parseLong(str)) : null;
                this.f84710c = kVar == null ? k.a.f62847a.j() : kVar;
            }

            @Override // mx.v
            public Long a() {
                return this.f84709b;
            }

            @Override // mx.v
            public ix.k b() {
                return this.f84710c;
            }

            @Override // mx.v.e
            public io.ktor.utils.io.g m() {
                return (io.ktor.utils.io.g) this.f84711d;
            }
        }

        public a(j00.c<? super a> cVar) {
            super(3, cVar);
        }

        @Override // x00.q
        public final Object invoke(io.ktor.util.pipeline.d<Object, cx.y> dVar, Object obj, j00.c<? super g2> cVar) {
            a aVar = new a(cVar);
            aVar.f84704b = dVar;
            aVar.f84705c = obj;
            return aVar.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            mx.v c1060a;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f84703a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                io.ktor.util.pipeline.d dVar = (io.ktor.util.pipeline.d) this.f84704b;
                Object obj2 = this.f84705c;
                ix.r0 a11 = ((cx.y) dVar.d()).a();
                ix.y0 y0Var = ix.y0.f63006a;
                if (a11.get(y0Var.d()) == null) {
                    ((cx.y) dVar.d()).a().k(y0Var.d(), "*/*");
                }
                ix.k g11 = ix.d1.g((ix.b1) dVar.d());
                if (obj2 instanceof String) {
                    String str = (String) obj2;
                    if (g11 == null) {
                        g11 = k.h.f62902a.g();
                    }
                    c1060a = new mx.c0(str, g11, null, 4, null);
                } else {
                    c1060a = obj2 instanceof byte[] ? new C1060a(g11, obj2) : obj2 instanceof io.ktor.utils.io.g ? new b(dVar, g11, obj2) : obj2 instanceof mx.v ? (mx.v) obj2 : n.a(g11, (cx.y) dVar.d(), obj2);
                }
                if ((c1060a != null ? c1060a.b() : null) != null) {
                    ((cx.y) dVar.d()).a().remove(y0Var.C());
                    l.f84702a.trace("Transformed with default transformers request body for " + ((cx.y) dVar.d()).j() + " from " + kotlin.jvm.internal.o0.d(obj2.getClass()));
                    this.f84704b = null;
                    this.f84703a = 1;
                    if (dVar.i(c1060a, this) == l11) {
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
    @l00.d(c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2", f = "DefaultTransform.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8}, l = {68, 72, 72, 77, 77, 81, 82, 106, 111}, m = "invokeSuspend", n = {"$this$intercept", "info", "$this$intercept", "info", "$this$intercept", "info", "$this$intercept", "info", "$this$intercept", "info", "$this$intercept", "info", "$this$intercept", "info", "$this$intercept", "info", "$this$intercept", "info"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    public static final class b extends SuspendLambda implements x00.q<io.ktor.util.pipeline.d<ex.d, mw.a>, ex.d, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f84712a;

        /* renamed from: b, reason: collision with root package name */
        public Object f84713b;

        /* renamed from: c, reason: collision with root package name */
        public int f84714c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f84715d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f84716e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ lw.c f84717f;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2$result$channel$1", f = "DefaultTransform.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements x00.p<io.ktor.utils.io.m0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f84718a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f84719b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Object f84720c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ ex.c f84721d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, ex.c cVar, j00.c<? super a> cVar2) {
                super(2, cVar2);
                this.f84720c = obj;
                this.f84721d = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                a aVar = new a(this.f84720c, this.f84721d, cVar);
                aVar.f84719b = obj;
                return aVar;
            }

            @Override // x00.p
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(io.ktor.utils.io.m0 m0Var, j00.c<? super g2> cVar) {
                return ((a) create(m0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f84718a;
                try {
                    if (i11 == 0) {
                        kotlin.e.n(obj);
                        io.ktor.utils.io.m0 m0Var = (io.ktor.utils.io.m0) this.f84719b;
                        io.ktor.utils.io.g gVar = (io.ktor.utils.io.g) this.f84720c;
                        io.ktor.utils.io.m a11 = m0Var.a();
                        this.f84718a = 1;
                        obj = io.ktor.utils.io.j.g(gVar, a11, Long.MAX_VALUE, this);
                        if (obj == l11) {
                            return l11;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.e.n(obj);
                    }
                    ((Number) obj).longValue();
                    return g2.f100423a;
                } catch (CancellationException e11) {
                    c40.s0.d(this.f84721d, e11);
                    throw e11;
                } catch (Throwable th2) {
                    c40.s0.c(this.f84721d, "Receive failed", th2);
                    throw th2;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(lw.c cVar, j00.c<? super b> cVar2) {
            super(3, cVar2);
            this.f84717f = cVar;
        }

        public static final g2 k(c40.a0 a0Var) {
            a0Var.complete();
            return g2.f100423a;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0257  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0193  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x024e  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0141  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 676
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: rw.l.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // x00.q
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.util.pipeline.d<ex.d, mw.a> dVar, ex.d dVar2, j00.c<? super g2> cVar) {
            b bVar = new b(this.f84717f, cVar);
            bVar.f84715d = dVar;
            bVar.f84716e = dVar2;
            return bVar.invokeSuspend(g2.f100423a);
        }
    }

    public static final void b(@m80.k lw.c cVar) {
        kotlin.jvm.internal.g0.p(cVar, "<this>");
        cVar.m0().C(cx.e0.f46866h.b(), new a(null));
        cVar.o0().C(ex.f.f50195h.b(), new b(cVar, null));
        n.b(cVar);
    }
}
