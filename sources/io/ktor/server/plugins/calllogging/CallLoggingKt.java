package io.ktor.server.plugins.calllogging;

import h10.r;
import hy.i1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import org.slf4j.Logger;
import org.slf4j.event.Level;
import x00.p;
import yz.g2;
import zx.b0;
import zx.c;
import zx.c0;
import zx.o0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCallLogging.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallLogging.kt\nio/ktor/server/plugins/calllogging/CallLoggingKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Attributes.kt\nio/ktor/util/AttributesKt\n+ 4 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,115:1\n2632#2,3:116\n18#3:119\n58#4,16:120\n*S KotlinDebug\n*F\n+ 1 CallLogging.kt\nio/ktor/server/plugins/calllogging/CallLoggingKt\n*L\n51#1:116,3\n15#1:119\n15#1:120,16\n*E\n"})
/* loaded from: classes8.dex */
public final class CallLoggingKt {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final xy.a<Long> f61484a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final zx.k<io.ktor.server.plugins.calllogging.b> f61485b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a extends FunctionReferenceImpl implements x00.a<io.ktor.server.plugins.calllogging.b> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f61486a = new a();

        public a() {
            super(0, io.ktor.server.plugins.calllogging.b.class, "<init>", "<init>()V", 0);
        }

        @Override // x00.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.ktor.server.plugins.calllogging.b invoke() {
            return new io.ktor.server.plugins.calllogging.b();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class b extends FunctionReferenceImpl implements x00.l<String, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o0<io.ktor.server.plugins.calllogging.b> f61487a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Logger f61488b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o0<io.ktor.server.plugins.calllogging.b> o0Var, Logger logger) {
            super(1, g0.a.class, "log", "CallLogging$lambda$2$log(Lio/ktor/server/application/PluginBuilder;Lorg/slf4j/Logger;Ljava/lang/String;)V", 0);
            this.f61487a = o0Var;
            this.f61488b = logger;
        }

        public final void a(String p02) {
            g0.p(p02, "p0");
            CallLoggingKt.i(this.f61487a, this.f61488b, p02);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(String str) {
            a(str);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.plugins.calllogging.CallLoggingKt$CallLogging$2$2", f = "CallLogging.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<zx.b, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f61489a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f61490b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.a<Long> f61491c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(x00.a<Long> aVar, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f61491c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            c cVar2 = new c(this.f61491c, cVar);
            cVar2.f61490b = obj;
            return cVar2;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zx.b bVar, j00.c<? super g2> cVar) {
            return ((c) create(bVar, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f61489a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            ((zx.b) this.f61490b).getAttributes().e(CallLoggingKt.m(), this.f61491c.invoke());
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class d extends FunctionReferenceImpl implements x00.l<zx.b, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f61492a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List<x00.l<zx.b, Boolean>> f61493b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.l<zx.b, String> f61494c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ o0<io.ktor.server.plugins.calllogging.b> f61495d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Logger f61496e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(boolean z11, List<x00.l<zx.b, Boolean>> list, x00.l<? super zx.b, String> lVar, o0<io.ktor.server.plugins.calllogging.b> o0Var, Logger logger) {
            super(1, g0.a.class, "logSuccess", "CallLogging$lambda$2$logSuccess(ZLjava/util/List;Lkotlin/jvm/functions/Function1;Lio/ktor/server/application/PluginBuilder;Lorg/slf4j/Logger;Lio/ktor/server/application/ApplicationCall;)V", 0);
            this.f61492a = z11;
            this.f61493b = list;
            this.f61494c = lVar;
            this.f61495d = o0Var;
            this.f61496e = logger;
        }

        public final void a(zx.b p02) {
            g0.p(p02, "p0");
            CallLoggingKt.j(this.f61492a, this.f61493b, this.f61494c, this.f61495d, this.f61496e, p02);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(zx.b bVar) {
            a(bVar);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class e extends FunctionReferenceImpl implements x00.l<zx.b, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f61497a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List<x00.l<zx.b, Boolean>> f61498b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.l<zx.b, String> f61499c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ o0<io.ktor.server.plugins.calllogging.b> f61500d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Logger f61501e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(boolean z11, List<x00.l<zx.b, Boolean>> list, x00.l<? super zx.b, String> lVar, o0<io.ktor.server.plugins.calllogging.b> o0Var, Logger logger) {
            super(1, g0.a.class, "logSuccess", "CallLogging$lambda$2$logSuccess(ZLjava/util/List;Lkotlin/jvm/functions/Function1;Lio/ktor/server/application/PluginBuilder;Lorg/slf4j/Logger;Lio/ktor/server/application/ApplicationCall;)V", 0);
            this.f61497a = z11;
            this.f61498b = list;
            this.f61499c = lVar;
            this.f61500d = o0Var;
            this.f61501e = logger;
        }

        public final void a(zx.b p02) {
            g0.p(p02, "p0");
            CallLoggingKt.j(this.f61497a, this.f61498b, this.f61499c, this.f61500d, this.f61501e, p02);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(zx.b bVar) {
            a(bVar);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class f {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f61502a;

        static {
            int[] iArr = new int[Level.values().length];
            try {
                iArr[Level.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Level.WARN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Level.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Level.DEBUG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Level.TRACE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f61502a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.plugins.calllogging.CallLoggingKt$logCompletedCalls$1", f = "CallLogging.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements p<zx.b, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f61503a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f61504b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.l<zx.b, g2> f61505c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(x00.l<? super zx.b, g2> lVar, j00.c<? super g> cVar) {
            super(2, cVar);
            this.f61505c = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            g gVar = new g(this.f61505c, cVar);
            gVar.f61504b = obj;
            return gVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zx.b bVar, j00.c<? super g2> cVar) {
            return ((g) create(bVar, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f61503a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            this.f61505c.invoke((zx.b) this.f61504b);
            return g2.f100423a;
        }
    }

    static {
        r rVar;
        h10.d d11 = kotlin.jvm.internal.o0.d(Long.class);
        try {
            rVar = kotlin.jvm.internal.o0.B(Long.TYPE);
        } catch (Throwable unused) {
            rVar = null;
        }
        f61484a = new xy.a<>("CallStartTime", new gz.a(d11, rVar));
        f61485b = b0.i("CallLogging", a.f61486a, new x00.l() { // from class: io.ktor.server.plugins.calllogging.h
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 h11;
                h11 = CallLoggingKt.h((o0) obj);
                return h11;
            }
        });
    }

    public static final g2 h(o0 createApplicationPlugin) {
        g0.p(createApplicationPlugin, "$this$createApplicationPlugin");
        Logger q11 = ((io.ktor.server.plugins.calllogging.b) createApplicationPlugin.l()).q();
        if (q11 == null) {
            q11 = zx.j.c(createApplicationPlugin.c());
        }
        Logger logger = q11;
        List<x00.l<zx.b, Boolean>> m11 = ((io.ktor.server.plugins.calllogging.b) createApplicationPlugin.l()).m();
        x00.l<zx.b, String> n11 = ((io.ktor.server.plugins.calllogging.b) createApplicationPlugin.l()).n();
        x00.a<Long> l11 = ((io.ktor.server.plugins.calllogging.b) createApplicationPlugin.l()).l();
        boolean o11 = ((io.ktor.server.plugins.calllogging.b) createApplicationPlugin.l()).o();
        m.a(createApplicationPlugin);
        t(createApplicationPlugin.c().n0(), new b(createApplicationPlugin, logger));
        createApplicationPlugin.n(cy.c.f46955a, new c(l11, null));
        if (((io.ktor.server.plugins.calllogging.b) createApplicationPlugin.l()).r().isEmpty()) {
            p(createApplicationPlugin, new d(o11, m11, n11, createApplicationPlugin, logger));
            return g2.f100423a;
        }
        o(createApplicationPlugin, new e(o11, m11, n11, createApplicationPlugin, logger));
        return g2.f100423a;
    }

    public static final void i(o0<io.ktor.server.plugins.calllogging.b> o0Var, Logger logger, String str) {
        int i11 = f.f61502a[o0Var.l().p().ordinal()];
        if (i11 == 1) {
            logger.error(str);
            return;
        }
        if (i11 == 2) {
            logger.warn(str);
            return;
        }
        if (i11 == 3) {
            logger.info(str);
        } else if (i11 == 4) {
            logger.debug(str);
        } else {
            if (i11 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            logger.trace(str);
        }
    }

    public static final void j(boolean z11, List<x00.l<zx.b, Boolean>> list, x00.l<? super zx.b, String> lVar, o0<io.ktor.server.plugins.calllogging.b> o0Var, Logger logger, zx.b bVar) {
        if (z11 && i1.F(bVar)) {
            return;
        }
        if (!list.isEmpty()) {
            List<x00.l<zx.b, Boolean>> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return;
            }
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (((Boolean) ((x00.l) it.next()).invoke(bVar)).booleanValue()) {
                }
            }
            return;
        }
        i(o0Var, logger, lVar.invoke(bVar));
    }

    @m80.k
    public static final xy.a<Long> m() {
        return f61484a;
    }

    @m80.k
    public static final zx.k<io.ktor.server.plugins.calllogging.b> n() {
        return f61485b;
    }

    public static final void o(o0<io.ktor.server.plugins.calllogging.b> o0Var, x00.l<? super zx.b, g2> lVar) {
        List<j> r11 = o0Var.l().r();
        c.a aVar = zx.c.f103019k;
        o0Var.n(l.a(aVar.e()), new CallLoggingKt$logCallsWithMDC$1(r11, null));
        o0Var.n(l.a(aVar.a()), new CallLoggingKt$logCallsWithMDC$2(r11, null));
        o0Var.n(n.f61546a, new CallLoggingKt$logCallsWithMDC$3(r11, lVar, null));
    }

    public static final void p(o0<io.ktor.server.plugins.calllogging.b> o0Var, x00.l<? super zx.b, g2> lVar) {
        o0Var.n(n.f61546a, new g(lVar, null));
    }

    public static final long q(@m80.k zx.b bVar, @m80.k x00.a<Long> clock) {
        g0.p(bVar, "<this>");
        g0.p(clock, "clock");
        return clock.invoke().longValue() - ((Number) bVar.getAttributes().g(f61484a)).longValue();
    }

    public static /* synthetic */ long r(zx.b bVar, x00.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = new x00.a() { // from class: io.ktor.server.plugins.calllogging.i
                @Override // x00.a
                public final Object invoke() {
                    long s11;
                    s11 = CallLoggingKt.s();
                    return Long.valueOf(s11);
                }
            };
        }
        return q(bVar, aVar);
    }

    public static final long s() {
        return io.ktor.util.date.a.d();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, io.ktor.server.plugins.calllogging.f] */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, io.ktor.server.plugins.calllogging.g] */
    public static final void t(final hx.c cVar, final x00.l<? super String, g2> lVar) {
        final x00.l lVar2 = new x00.l() { // from class: io.ktor.server.plugins.calllogging.c
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 u11;
                u11 = CallLoggingKt.u(x00.l.this, (zx.a) obj);
                return u11;
            }
        };
        final x00.l lVar3 = new x00.l() { // from class: io.ktor.server.plugins.calllogging.d
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 v11;
                v11 = CallLoggingKt.v(x00.l.this, (zx.a) obj);
                return v11;
            }
        };
        final x00.l lVar4 = new x00.l() { // from class: io.ktor.server.plugins.calllogging.e
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 w11;
                w11 = CallLoggingKt.w(x00.l.this, (zx.a) obj);
                return w11;
            }
        };
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new x00.l() { // from class: io.ktor.server.plugins.calllogging.f
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 x11;
                x11 = CallLoggingKt.x((zx.a) obj);
                return x11;
            }
        };
        objectRef.element = new x00.l() { // from class: io.ktor.server.plugins.calllogging.g
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 y11;
                y11 = CallLoggingKt.y(x00.l.this, cVar, lVar2, lVar3, lVar4, objectRef, (zx.a) obj);
                return y11;
            }
        };
        cVar.c(c0.b(), lVar2);
        cVar.c(c0.a(), lVar3);
        cVar.c(c0.e(), lVar4);
        cVar.c(c0.d(), (x00.l) objectRef.element);
    }

    public static final g2 u(x00.l lVar, zx.a it) {
        g0.p(it, "it");
        lVar.invoke("Application starting: " + it);
        return g2.f100423a;
    }

    public static final g2 v(x00.l lVar, zx.a it) {
        g0.p(it, "it");
        lVar.invoke("Application started: " + it);
        return g2.f100423a;
    }

    public static final g2 w(x00.l lVar, zx.a it) {
        g0.p(it, "it");
        lVar.invoke("Application stopping: " + it);
        return g2.f100423a;
    }

    public static final g2 x(zx.a it) {
        g0.p(it, "it");
        return g2.f100423a;
    }

    public static final g2 y(x00.l lVar, hx.c cVar, x00.l lVar2, x00.l lVar3, x00.l lVar4, Ref.ObjectRef objectRef, zx.a it) {
        g0.p(it, "it");
        lVar.invoke("Application stopped: " + it);
        cVar.e(c0.b(), lVar2);
        cVar.e(c0.a(), lVar3);
        cVar.e(c0.e(), lVar4);
        cVar.e(c0.d(), (x00.l) objectRef.element);
        return g2.f100423a;
    }
}
