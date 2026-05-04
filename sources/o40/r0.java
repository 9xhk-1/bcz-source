package o40;

import c40.n0;
import c40.y1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.u0;
import kotlin.time.n;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTestScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestScope.kt\nkotlinx/coroutines/test/TestScopeKt\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,330:1\n47#2,4:331\n1#3:335\n*S KotlinDebug\n*F\n+ 1 TestScope.kt\nkotlinx/coroutines/test/TestScopeKt\n*L\n166#1:331,4\n*E\n"})
/* loaded from: classes8.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f75843a = true;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 TestScope.kt\nkotlinx/coroutines/test/TestScopeKt\n*L\n1#1,49:1\n167#2,2:50\n*E\n"})
    public static final class a extends kotlin.coroutines.a implements c40.n0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef f75844a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n0.b bVar, Ref.ObjectRef objectRef) {
            super(bVar);
            this.f75844a = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // c40.n0
        public void handleException(kotlin.coroutines.d dVar, Throwable th2) {
            T t11 = this.f75844a.element;
            kotlin.jvm.internal.g0.m(t11);
            ((q0) t11).l2(th2);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, o40.n0, o40.q0] */
    @m80.k
    public static final n0 a(@m80.k kotlin.coroutines.d dVar) {
        kotlin.coroutines.d o11 = o(dVar);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        n0.b bVar = c40.n0.f7891d0;
        if (((c40.n0) o11.get(bVar)) != null) {
            throw new IllegalArgumentException("A CoroutineExceptionHandler was passed to TestScope. Please pass it as an argument to a `launch` or `async` block on an already-created scope if uncaught exceptions require special treatment.");
        }
        ?? q0Var = new q0(o11.plus(new a(bVar, objectRef)));
        objectRef.element = q0Var;
        return q0Var;
    }

    public static /* synthetic */ n0 b(kotlin.coroutines.d dVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        return a(dVar);
    }

    @y1
    public static final void c(@m80.k n0 n0Var, long j11) {
        n0Var.I().I(j11);
    }

    @y1
    public static final void d(@m80.k n0 n0Var, long j11) {
        n0Var.I().L(j11);
    }

    @y1
    public static final void e(@m80.k n0 n0Var) {
        n0Var.I().U();
    }

    @m80.k
    public static final q0 f(@m80.k n0 n0Var) {
        if (n0Var instanceof q0) {
            return (q0) n0Var;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean g() {
        return f75843a;
    }

    public static final long i(@m80.k n0 n0Var) {
        return n0Var.I().i0();
    }

    @m80.k
    public static final n.c k(@m80.k n0 n0Var) {
        return n0Var.I().x0();
    }

    @y1
    public static final void m(@m80.k n0 n0Var) {
        n0Var.I().W0();
    }

    public static final void n(boolean z11) {
        f75843a = z11;
    }

    @m80.k
    public static final kotlin.coroutines.d o(@m80.k kotlin.coroutines.d dVar) {
        k0 b11;
        kotlin.coroutines.c cVar = (kotlin.coroutines.c) dVar.get(kotlin.coroutines.c.f66933w0);
        if (cVar instanceof k0) {
            b0 b0Var = (b0) dVar.get(b0.f75722g);
            if (b0Var != null && ((k0) cVar).w() != b0Var) {
                throw new IllegalArgumentException(("Both a TestCoroutineScheduler " + b0Var + " and TestDispatcher " + cVar + " linked to another scheduler were passed.").toString());
            }
            b11 = (k0) cVar;
        } else {
            if (cVar != null) {
                throw new IllegalArgumentException("Dispatcher must implement TestDispatcher: " + cVar);
            }
            b11 = v.b((b0) dVar.get(b0.f75722g), null, 2, null);
        }
        return dVar.plus(b11).plus(b11.w());
    }

    @v0
    public static /* synthetic */ void h() {
    }

    @y1
    public static /* synthetic */ void j(n0 n0Var) {
    }

    @y1
    public static /* synthetic */ void l(n0 n0Var) {
    }
}
