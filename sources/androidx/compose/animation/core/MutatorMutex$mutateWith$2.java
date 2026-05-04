package androidx.compose.animation.core;

import androidx.camera.view.q;
import androidx.compose.animation.core.MutatorMutex;
import c40.l2;
import c40.r0;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import x00.p;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.animation.core.MutatorMutex$mutateWith$2", f = "InternalMutatorMutex.kt", i = {0, 0, 1, 1}, l = {176, 163}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
@u0({"SMAP\nInternalMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/animation/core/MutatorMutex$mutateWith$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,170:1\n120#2,10:171\n*S KotlinDebug\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/animation/core/MutatorMutex$mutateWith$2\n*L\n161#1:171,10\n*E\n"})
/* loaded from: classes.dex */
public final class MutatorMutex$mutateWith$2<R> extends SuspendLambda implements p<r0, j00.c<? super R>, Object> {
    final /* synthetic */ p<T, j00.c<? super R>, Object> $block;
    final /* synthetic */ MutatePriority $priority;
    final /* synthetic */ T $receiver;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ MutatorMutex this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MutatorMutex$mutateWith$2(MutatePriority mutatePriority, MutatorMutex mutatorMutex, p<? super T, ? super j00.c<? super R>, ? extends Object> pVar, T t11, j00.c<? super MutatorMutex$mutateWith$2> cVar) {
        super(2, cVar);
        this.$priority = mutatePriority;
        this.this$0 = mutatorMutex;
        this.$block = pVar;
        this.$receiver = t11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        MutatorMutex$mutateWith$2 mutatorMutex$mutateWith$2 = new MutatorMutex$mutateWith$2(this.$priority, this.this$0, this.$block, this.$receiver, cVar);
        mutatorMutex$mutateWith$2.L$0 = obj;
        return mutatorMutex$mutateWith$2;
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super R> cVar) {
        return ((MutatorMutex$mutateWith$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, n40.a] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        n40.a aVar;
        p pVar;
        MutatorMutex.Mutator mutator;
        MutatorMutex mutatorMutex;
        Object obj2;
        Throwable th2;
        MutatorMutex mutatorMutex2;
        MutatorMutex.Mutator mutator2;
        n40.a aVar2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        ?? r12 = this.label;
        try {
            try {
                if (r12 == 0) {
                    kotlin.e.n(obj);
                    r0 r0Var = (r0) this.L$0;
                    MutatePriority mutatePriority = this.$priority;
                    d.b bVar = r0Var.getCoroutineContext().get(l2.f7886e0);
                    g0.m(bVar);
                    MutatorMutex.Mutator mutator3 = new MutatorMutex.Mutator(mutatePriority, (l2) bVar);
                    this.this$0.tryMutateOrCancel(mutator3);
                    aVar = this.this$0.mutex;
                    pVar = this.$block;
                    Object obj3 = this.$receiver;
                    MutatorMutex mutatorMutex3 = this.this$0;
                    this.L$0 = mutator3;
                    this.L$1 = aVar;
                    this.L$2 = pVar;
                    this.L$3 = obj3;
                    this.L$4 = mutatorMutex3;
                    this.label = 1;
                    if (aVar.lock(null, this) != l11) {
                        mutator = mutator3;
                        mutatorMutex = mutatorMutex3;
                        obj2 = obj3;
                    }
                    return l11;
                }
                if (r12 != 1) {
                    if (r12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutatorMutex2 = (MutatorMutex) this.L$2;
                    aVar2 = (n40.a) this.L$1;
                    mutator2 = (MutatorMutex.Mutator) this.L$0;
                    try {
                        kotlin.e.n(obj);
                        atomicReference2 = mutatorMutex2.currentMutator;
                        q.a(atomicReference2, mutator2, null);
                        aVar2.unlock(null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        atomicReference = mutatorMutex2.currentMutator;
                        q.a(atomicReference, mutator2, null);
                        throw th2;
                    }
                }
                mutatorMutex = (MutatorMutex) this.L$4;
                obj2 = this.L$3;
                pVar = (p) this.L$2;
                n40.a aVar3 = (n40.a) this.L$1;
                mutator = (MutatorMutex.Mutator) this.L$0;
                kotlin.e.n(obj);
                aVar = aVar3;
                this.L$0 = mutator;
                this.L$1 = aVar;
                this.L$2 = mutatorMutex;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 2;
                Object invoke = pVar.invoke(obj2, this);
                if (invoke != l11) {
                    mutatorMutex2 = mutatorMutex;
                    aVar2 = aVar;
                    obj = invoke;
                    mutator2 = mutator;
                    atomicReference2 = mutatorMutex2.currentMutator;
                    q.a(atomicReference2, mutator2, null);
                    aVar2.unlock(null);
                    return obj;
                }
                return l11;
            } catch (Throwable th4) {
                th2 = th4;
                mutatorMutex2 = mutatorMutex;
                mutator2 = mutator;
                atomicReference = mutatorMutex2.currentMutator;
                q.a(atomicReference, mutator2, null);
                throw th2;
            }
        } catch (Throwable th5) {
            r12.unlock(null);
            throw th5;
        }
    }
}
