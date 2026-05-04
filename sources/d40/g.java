package d40;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.VisibleForTesting;
import c40.h1;
import c40.n;
import c40.p;
import kotlin.DeprecationLevel;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import w00.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nHandlerDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerDispatcherKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,212:1\n426#2,11:213\n426#2,11:224\n1#3:235\n*S KotlinDebug\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerDispatcherKt\n*L\n184#1:213,11\n192#1:224,11\n*E\n"})
/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final long f47230a = 4611686018427387903L;

    /* renamed from: b, reason: collision with root package name */
    @l
    @w00.g
    public static final e f47231b;

    @l
    private static volatile Choreographer choreographer;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n<Long> f47232a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(n<? super Long> nVar) {
            this.f47232a = nVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            g.n(this.f47232a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Object m6308constructorimpl;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        try {
            Result.a aVar = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(new d(e(Looper.getMainLooper(), true), objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
        }
        f47231b = (e) (Result.m6314isFailureimpl(m6308constructorimpl) ? null : m6308constructorimpl);
    }

    @VisibleForTesting
    @k
    public static final Handler e(@k Looper looper, boolean z11) {
        if (!z11) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            g0.n(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }

    @l
    public static final Object f(@k j00.c<? super Long> cVar) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            return g(cVar);
        }
        p pVar = new p(IntrinsicsKt__IntrinsicsJvmKt.e(cVar), 1);
        pVar.y();
        l(choreographer2, pVar);
        Object F = pVar.F();
        if (F == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return F;
    }

    public static final Object g(j00.c<? super Long> cVar) {
        p pVar = new p(IntrinsicsKt__IntrinsicsJvmKt.e(cVar), 1);
        pVar.y();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            n(pVar);
        } else {
            h1.e().dispatch(pVar.getContext(), new a(pVar));
        }
        Object F = pVar.F();
        if (F == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return F;
    }

    @j(name = "from")
    @w00.k
    @k
    public static final e h(@k Handler handler) {
        return j(handler, null, 1, null);
    }

    @j(name = "from")
    @w00.k
    @k
    public static final e i(@k Handler handler, @l String str) {
        return new d(handler, str);
    }

    public static /* synthetic */ e j(Handler handler, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        return i(handler, str);
    }

    public static final void l(Choreographer choreographer2, final n<? super Long> nVar) {
        choreographer2.postFrameCallback(new Choreographer.FrameCallback() { // from class: d40.f
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j11) {
                g.m(n.this, j11);
            }
        });
    }

    public static final void m(n nVar, long j11) {
        nVar.l(h1.e(), Long.valueOf(j11));
    }

    public static final void n(n<? super Long> nVar) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            g0.m(choreographer2);
            choreographer = choreographer2;
        }
        l(choreographer2, nVar);
    }

    @yz.n(level = DeprecationLevel.HIDDEN, message = "Use Dispatchers.Main instead")
    public static /* synthetic */ void k() {
    }
}
