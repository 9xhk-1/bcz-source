package o40;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.test.TestBuildersJvmKt$createTestResult$1", f = "TestBuildersJvm.kt", i = {}, l = {11}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f75743a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f75744b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.p<c40.r0, j00.c<? super g2>, Object> f75745c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(x00.p<? super c40.r0, ? super j00.c<? super g2>, ? extends Object> pVar, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f75745c = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = new a(this.f75745c, cVar);
            aVar.f75744b = obj;
            return aVar;
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f75743a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                c40.r0 r0Var = (c40.r0) this.f75744b;
                x00.p<c40.r0, j00.c<? super g2>, Object> pVar = this.f75745c;
                this.f75743a = 1;
                if (pVar.invoke(r0Var, this) == l11) {
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

    public static final void b(@m80.k x00.p<? super c40.r0, ? super j00.c<? super g2>, ? extends Object> pVar) {
        c40.j.b(null, new a(pVar, null), 1, null);
    }

    public static final void c() {
        f40.m mVar = f40.m.f50946a;
        if (mVar.E()) {
            mVar.C();
            try {
                mVar.g(System.err);
                System.err.flush();
                mVar.X();
            } catch (Throwable th2) {
                f40.m.f50946a.X();
                throw th2;
            }
        }
    }

    @m80.l
    public static final String d(@m80.k String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static /* synthetic */ void a() {
    }
}
