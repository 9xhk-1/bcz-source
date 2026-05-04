package o40;

import c40.l2;
import c40.n0;
import c40.p2;
import c40.y1;
import java.util.Set;
import kotlin.DeprecationLevel;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.u0;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTestCoroutineScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestCoroutineScope.kt\nkotlinx/coroutines/test/TestCoroutineScopeKt\n*L\n1#1,200:1\n168#1,2:201\n168#1,2:203\n168#1,2:205\n*S KotlinDebug\n*F\n+ 1 TestCoroutineScope.kt\nkotlinx/coroutines/test/TestCoroutineScopeKt\n*L\n179#1:201,2\n187#1:203,2\n198#1:205,2\n*E\n"})
/* loaded from: classes8.dex */
public final class h0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends kotlin.coroutines.a implements e0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<f0> f75746a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Ref.ObjectRef<f0> objectRef, n0.b bVar) {
            super(bVar);
            this.f75746a = objectRef;
        }

        @Override // c40.n0
        public void handleException(kotlin.coroutines.d dVar, Throwable th2) {
            f0 f0Var = this.f75746a.element;
            kotlin.jvm.internal.g0.m(f0Var);
            if (!f0Var.a(th2)) {
                throw th2;
            }
        }
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "This constructs a `TestCoroutineScope` with a deprecated `CoroutineDispatcher` by default. Please use `createTestCoroutineScope` instead.", replaceWith = @w0(expression = "createTestCoroutineScope(TestCoroutineDispatcher() + TestCoroutineExceptionHandler() + context)", imports = {"kotlin.coroutines.EmptyCoroutineContext"}))
    @m80.k
    public static final d0 b(@m80.k kotlin.coroutines.d dVar) {
        b0 b0Var = (b0) dVar.get(b0.f75722g);
        if (b0Var == null) {
            b0Var = new b0();
        }
        return g(new u(b0Var).plus(new w()).plus(dVar));
    }

    public static /* synthetic */ d0 c(kotlin.coroutines.d dVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        return b(dVar);
    }

    @m80.k
    public static final Set<l2> d(@m80.k kotlin.coroutines.d dVar) {
        d.b bVar = dVar.get(l2.f7886e0);
        if (bVar != null) {
            return q30.k0.L3(q30.k0.P0(((l2) bVar).C(), new x00.l() { // from class: o40.g0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    boolean e11;
                    e11 = h0.e((l2) obj);
                    return Boolean.valueOf(e11);
                }
            }));
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final boolean e(l2 l2Var) {
        return l2Var.isActive();
    }

    @y1
    public static final void f(@m80.k d0 d0Var) {
        kotlin.coroutines.c cVar = (kotlin.coroutines.c) d0Var.getCoroutineContext().get(kotlin.coroutines.c.f66933w0);
        u uVar = cVar instanceof u ? (u) cVar : null;
        if (uVar != null) {
            uVar.L();
        } else {
            d0Var.I().U();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, o40.d0, o40.f0] */
    @y1
    @yz.n(level = DeprecationLevel.ERROR, message = "This function was introduced in order to help migrate from TestCoroutineScope to TestScope. Please use TestScope() construction instead, or just runTest(), without creating a scope.")
    @m80.k
    public static final d0 g(@m80.k kotlin.coroutines.d dVar) {
        kotlin.coroutines.d o11 = r0.o(dVar);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        n0.b bVar = c40.n0.f7891d0;
        c40.n0 aVar = new a(objectRef, bVar);
        c40.n0 n0Var = (c40.n0) o11.get(bVar);
        if (n0Var instanceof w) {
            aVar = n0Var;
        } else if (n0Var != null && !(n0Var instanceof e0)) {
            throw new IllegalArgumentException("A CoroutineExceptionHandler was passed to TestCoroutineScope. Please pass it as an argument to a `launch` or `async` block on an already-created scope if uncaught exceptions require special treatment.");
        }
        kotlin.coroutines.d dVar2 = (l2) o11.get(l2.f7886e0);
        if (dVar2 == null) {
            dVar2 = p2.c(null, 1, null);
        }
        ?? f0Var = new f0(o11.plus(aVar).plus(dVar2));
        objectRef.element = f0Var;
        return f0Var;
    }

    public static /* synthetic */ d0 h(kotlin.coroutines.d dVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        return g(dVar);
    }

    public static final long i(@m80.k d0 d0Var) {
        kotlin.coroutines.c cVar = (kotlin.coroutines.c) d0Var.getCoroutineContext().get(kotlin.coroutines.c.f66933w0);
        u uVar = cVar instanceof u ? (u) cVar : null;
        return uVar != null ? uVar.a0() : d0Var.I().i0();
    }

    public static final u k(kotlin.coroutines.d dVar) {
        kotlin.coroutines.c cVar = (kotlin.coroutines.c) dVar.get(kotlin.coroutines.c.f66933w0);
        if (cVar instanceof u) {
            return (u) cVar;
        }
        return null;
    }

    @y1
    public static final void l(@m80.k d0 d0Var) {
        kotlin.coroutines.c cVar = (kotlin.coroutines.c) d0Var.getCoroutineContext().get(kotlin.coroutines.c.f66933w0);
        u uVar = cVar instanceof u ? (u) cVar : null;
        if (uVar != null) {
            uVar.h0();
        } else {
            d0Var.I().W0();
        }
    }

    @y1
    public static /* synthetic */ void j(d0 d0Var) {
    }
}
