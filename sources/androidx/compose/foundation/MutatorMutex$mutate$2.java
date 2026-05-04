package androidx.compose.foundation;

import androidx.camera.view.q;
import androidx.compose.foundation.MutatorMutex;
import c40.l2;
import c40.r0;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import x00.l;
import x00.p;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.foundation.MutatorMutex$mutate$2", f = "MutatorMutex.kt", i = {0, 0, 1, 1}, l = {210, 125}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
@u0({"SMAP\nMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutatorMutex.kt\nandroidx/compose/foundation/MutatorMutex$mutate$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,204:1\n120#2,10:205\n*S KotlinDebug\n*F\n+ 1 MutatorMutex.kt\nandroidx/compose/foundation/MutatorMutex$mutate$2\n*L\n123#1:205,10\n*E\n"})
/* loaded from: classes.dex */
public final class MutatorMutex$mutate$2<R> extends SuspendLambda implements p<r0, j00.c<? super R>, Object> {
    final /* synthetic */ l<j00.c<? super R>, Object> $block;
    final /* synthetic */ MutatePriority $priority;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ MutatorMutex this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MutatorMutex$mutate$2(MutatePriority mutatePriority, MutatorMutex mutatorMutex, l<? super j00.c<? super R>, ? extends Object> lVar, j00.c<? super MutatorMutex$mutate$2> cVar) {
        super(2, cVar);
        this.$priority = mutatePriority;
        this.this$0 = mutatorMutex;
        this.$block = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        MutatorMutex$mutate$2 mutatorMutex$mutate$2 = new MutatorMutex$mutate$2(this.$priority, this.this$0, this.$block, cVar);
        mutatorMutex$mutate$2.L$0 = obj;
        return mutatorMutex$mutate$2;
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super R> cVar) {
        return ((MutatorMutex$mutate$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, n40.a] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        n40.a aVar;
        MutatorMutex.Mutator mutator;
        MutatorMutex mutatorMutex;
        l<j00.c<? super R>, Object> lVar;
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
                    l<j00.c<? super R>, Object> lVar2 = this.$block;
                    MutatorMutex mutatorMutex3 = this.this$0;
                    this.L$0 = mutator3;
                    this.L$1 = aVar;
                    this.L$2 = lVar2;
                    this.L$3 = mutatorMutex3;
                    this.label = 1;
                    if (aVar.lock(null, this) != l11) {
                        mutator = mutator3;
                        mutatorMutex = mutatorMutex3;
                        lVar = lVar2;
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
                mutatorMutex = (MutatorMutex) this.L$3;
                lVar = (l) this.L$2;
                n40.a aVar3 = (n40.a) this.L$1;
                mutator = (MutatorMutex.Mutator) this.L$0;
                kotlin.e.n(obj);
                aVar = aVar3;
                this.L$0 = mutator;
                this.L$1 = aVar;
                this.L$2 = mutatorMutex;
                this.L$3 = null;
                this.label = 2;
                Object invoke = lVar.invoke(this);
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
