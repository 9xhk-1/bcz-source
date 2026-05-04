package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import c40.h1;
import c40.m0;
import c40.p;
import c40.v2;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nWithLifecycleState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 Runnable.kt\nkotlinx/coroutines/RunnableKt\n*L\n1#1,207:1\n155#1,8:208\n155#1,8:216\n155#1,8:224\n155#1,8:232\n44#1,5:240\n155#1,8:245\n44#1,5:253\n155#1,8:258\n155#1,8:266\n155#1,8:274\n155#1,8:282\n314#2,9:290\n323#2,2:300\n17#3:299\n*S KotlinDebug\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt\n*L\n48#1:208,8\n59#1:216,8\n72#1:224,8\n85#1:232,8\n99#1:240,5\n99#1:245,8\n99#1:253,5\n99#1:258,8\n112#1:266,8\n125#1:274,8\n138#1:282,8\n178#1:290,9\n178#1:300,2\n194#1:299\n*E\n"})
/* loaded from: classes2.dex */
public final class WithLifecycleStateKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.LifecycleObserver, androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1] */
    @l
    @v0
    public static final <R> Object suspendWithStateAtLeastUnchecked(@k final Lifecycle lifecycle, @k final Lifecycle.State state, boolean z11, @k final m0 m0Var, @k final x00.a<? extends R> aVar, @k j00.c<? super R> cVar) {
        final p pVar = new p(IntrinsicsKt__IntrinsicsJvmKt.e(cVar), 1);
        pVar.y();
        final ?? r12 = new LifecycleEventObserver() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(@k LifecycleOwner source, @k Lifecycle.Event event) {
                Object m6308constructorimpl;
                g0.p(source, "source");
                g0.p(event, "event");
                if (event != Lifecycle.Event.Companion.upTo(Lifecycle.State.this)) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        lifecycle.removeObserver(this);
                        j00.c cVar2 = pVar;
                        Result.a aVar2 = Result.Companion;
                        cVar2.resumeWith(Result.m6308constructorimpl(kotlin.e.a(new LifecycleDestroyedException())));
                        return;
                    }
                    return;
                }
                lifecycle.removeObserver(this);
                j00.c cVar3 = pVar;
                x00.a<R> aVar3 = aVar;
                try {
                    Result.a aVar4 = Result.Companion;
                    m6308constructorimpl = Result.m6308constructorimpl(aVar3.invoke());
                } catch (Throwable th2) {
                    Result.a aVar5 = Result.Companion;
                    m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
                }
                cVar3.resumeWith(m6308constructorimpl);
            }
        };
        if (z11) {
            m0Var.dispatch(EmptyCoroutineContext.INSTANCE, new Runnable() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$lambda$2$$inlined$Runnable$1
                @Override // java.lang.Runnable
                public final void run() {
                    Lifecycle.this.addObserver(r12);
                }
            });
        } else {
            lifecycle.addObserver(r12);
        }
        pVar.p(new x00.l<Throwable, g2>() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Throwable th2) {
                invoke2(th2);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@l Throwable th2) {
                m0 m0Var2 = m0.this;
                EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
                if (!m0Var2.isDispatchNeeded(emptyCoroutineContext)) {
                    lifecycle.removeObserver(r12);
                    return;
                }
                m0 m0Var3 = m0.this;
                final Lifecycle lifecycle2 = lifecycle;
                final WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 = r12;
                m0Var3.dispatch(emptyCoroutineContext, new Runnable() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2$invoke$$inlined$Runnable$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        Lifecycle.this.removeObserver(withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1);
                    }
                });
            }
        });
        Object F = pVar.F();
        if (F == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return F;
    }

    @l
    public static final <R> Object withCreated(@k Lifecycle lifecycle, @k x00.a<? extends R> aVar, @k j00.c<? super R> cVar) {
        Lifecycle.State state = Lifecycle.State.CREATED;
        v2 q11 = h1.e().q();
        boolean isDispatchNeeded = q11.isDispatchNeeded(cVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, q11, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), cVar);
    }

    private static final <R> Object withCreated$$forInline(Lifecycle lifecycle, x00.a<? extends R> aVar, j00.c<? super R> cVar) {
        Lifecycle.State state = Lifecycle.State.CREATED;
        h1.e().q();
        d0.e(3);
        throw null;
    }

    @l
    public static final <R> Object withResumed(@k Lifecycle lifecycle, @k x00.a<? extends R> aVar, @k j00.c<? super R> cVar) {
        Lifecycle.State state = Lifecycle.State.RESUMED;
        v2 q11 = h1.e().q();
        boolean isDispatchNeeded = q11.isDispatchNeeded(cVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, q11, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), cVar);
    }

    private static final <R> Object withResumed$$forInline(Lifecycle lifecycle, x00.a<? extends R> aVar, j00.c<? super R> cVar) {
        Lifecycle.State state = Lifecycle.State.RESUMED;
        h1.e().q();
        d0.e(3);
        throw null;
    }

    @l
    public static final <R> Object withStarted(@k Lifecycle lifecycle, @k x00.a<? extends R> aVar, @k j00.c<? super R> cVar) {
        Lifecycle.State state = Lifecycle.State.STARTED;
        v2 q11 = h1.e().q();
        boolean isDispatchNeeded = q11.isDispatchNeeded(cVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, q11, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), cVar);
    }

    private static final <R> Object withStarted$$forInline(Lifecycle lifecycle, x00.a<? extends R> aVar, j00.c<? super R> cVar) {
        Lifecycle.State state = Lifecycle.State.STARTED;
        h1.e().q();
        d0.e(3);
        throw null;
    }

    @l
    public static final <R> Object withStateAtLeast(@k Lifecycle lifecycle, @k Lifecycle.State state, @k x00.a<? extends R> aVar, @k j00.c<? super R> cVar) {
        if (state.compareTo(Lifecycle.State.CREATED) < 0) {
            throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
        }
        v2 q11 = h1.e().q();
        boolean isDispatchNeeded = q11.isDispatchNeeded(cVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, q11, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), cVar);
    }

    private static final <R> Object withStateAtLeast$$forInline(Lifecycle lifecycle, Lifecycle.State state, x00.a<? extends R> aVar, j00.c<? super R> cVar) {
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            h1.e().q();
            d0.e(3);
            throw null;
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }

    @l
    @v0
    public static final <R> Object withStateAtLeastUnchecked(@k Lifecycle lifecycle, @k Lifecycle.State state, @k x00.a<? extends R> aVar, @k j00.c<? super R> cVar) {
        v2 q11 = h1.e().q();
        boolean isDispatchNeeded = q11.isDispatchNeeded(cVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, q11, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), cVar);
    }

    @v0
    private static final <R> Object withStateAtLeastUnchecked$$forInline(Lifecycle lifecycle, Lifecycle.State state, x00.a<? extends R> aVar, j00.c<? super R> cVar) {
        h1.e().q();
        d0.e(3);
        throw null;
    }

    private static final <R> Object withCreated$$forInline(LifecycleOwner lifecycleOwner, x00.a<? extends R> aVar, j00.c<? super R> cVar) {
        lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.CREATED;
        h1.e().q();
        d0.e(3);
        throw null;
    }

    private static final <R> Object withResumed$$forInline(LifecycleOwner lifecycleOwner, x00.a<? extends R> aVar, j00.c<? super R> cVar) {
        lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.RESUMED;
        h1.e().q();
        d0.e(3);
        throw null;
    }

    private static final <R> Object withStarted$$forInline(LifecycleOwner lifecycleOwner, x00.a<? extends R> aVar, j00.c<? super R> cVar) {
        lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.STARTED;
        h1.e().q();
        d0.e(3);
        throw null;
    }

    private static final <R> Object withStateAtLeast$$forInline(LifecycleOwner lifecycleOwner, Lifecycle.State state, x00.a<? extends R> aVar, j00.c<? super R> cVar) {
        lifecycleOwner.getLifecycle();
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            h1.e().q();
            d0.e(3);
            throw null;
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }

    @l
    public static final <R> Object withCreated(@k LifecycleOwner lifecycleOwner, @k x00.a<? extends R> aVar, @k j00.c<? super R> cVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.CREATED;
        v2 q11 = h1.e().q();
        boolean isDispatchNeeded = q11.isDispatchNeeded(cVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return aVar.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, q11, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), cVar);
    }

    @l
    public static final <R> Object withResumed(@k LifecycleOwner lifecycleOwner, @k x00.a<? extends R> aVar, @k j00.c<? super R> cVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.RESUMED;
        v2 q11 = h1.e().q();
        boolean isDispatchNeeded = q11.isDispatchNeeded(cVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return aVar.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, q11, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), cVar);
    }

    @l
    public static final <R> Object withStarted(@k LifecycleOwner lifecycleOwner, @k x00.a<? extends R> aVar, @k j00.c<? super R> cVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.STARTED;
        v2 q11 = h1.e().q();
        boolean isDispatchNeeded = q11.isDispatchNeeded(cVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return aVar.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, q11, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), cVar);
    }

    @l
    public static final <R> Object withStateAtLeast(@k LifecycleOwner lifecycleOwner, @k Lifecycle.State state, @k x00.a<? extends R> aVar, @k j00.c<? super R> cVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            v2 q11 = h1.e().q();
            boolean isDispatchNeeded = q11.isDispatchNeeded(cVar.getContext());
            if (!isDispatchNeeded) {
                if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                    if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                        return aVar.invoke();
                    }
                } else {
                    throw new LifecycleDestroyedException();
                }
            }
            return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, q11, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), cVar);
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }
}
