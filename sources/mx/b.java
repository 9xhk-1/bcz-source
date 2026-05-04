package mx;

import c40.h1;
import c40.r0;
import java.lang.reflect.Method;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final yz.c0 f73759a = yz.e0.c(new x00.a() { // from class: mx.a
        @Override // x00.a
        public final Object invoke() {
            Method d11;
            d11 = b.d();
            return d11;
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.http.content.BlockingBridgeKt$withBlockingAndRedispatch$2", f = "BlockingBridge.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f73760a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.l<j00.c<? super g2>, Object> f73761b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(x00.l<? super j00.c<? super g2>, ? extends Object> lVar, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f73761b = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new a(this.f73761b, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f73760a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                x00.l<j00.c<? super g2>, Object> lVar = this.f73761b;
                this.f73760a = 1;
                if (lVar.invoke(this) == l11) {
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

    public static final Method c() {
        return (Method) f73759a.getValue();
    }

    public static final Method d() {
        try {
            return Class.forName("io.ktor.utils.io.jvm.javaio.PollersKt").getMethod("isParkingAllowed", null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final boolean e() {
        boolean z11;
        Method c11 = c();
        if (c11 == null) {
            return false;
        }
        try {
            z11 = kotlin.jvm.internal.g0.g(c11.invoke(null, null), Boolean.TRUE);
        } catch (Throwable unused) {
            z11 = false;
        }
        return z11;
    }

    @m80.l
    public static final Object f(@m80.k x00.l<? super j00.c<? super g2>, ? extends Object> lVar, @m80.k j00.c<? super g2> cVar) {
        if (e()) {
            Object invoke = lVar.invoke(cVar);
            return invoke == kotlin.coroutines.intrinsics.b.l() ? invoke : g2.f100423a;
        }
        Object g11 = g(lVar, cVar);
        return g11 == kotlin.coroutines.intrinsics.b.l() ? g11 : g2.f100423a;
    }

    public static final Object g(x00.l<? super j00.c<? super g2>, ? extends Object> lVar, j00.c<? super g2> cVar) {
        Object h11 = c40.i.h(h1.c(), new a(lVar, null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }
}
